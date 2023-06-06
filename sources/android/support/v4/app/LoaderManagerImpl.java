package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    boolean mCreatingLoader;
    FragmentHostCallback mHost;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;
    final SparseArrayCompat<LoaderInfo> mLoaders = new SparseArrayCompat<>();
    final SparseArrayCompat<LoaderInfo> mInactiveLoaders = new SparseArrayCompat<>();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class LoaderInfo implements Loader.OnLoadCanceledListener<Object>, Loader.OnLoadCompleteListener<Object> {
        final Bundle mArgs;
        LoaderManager.LoaderCallbacks<Object> mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader<Object> mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;

        public LoaderInfo(int i, Bundle bundle, LoaderManager.LoaderCallbacks<Object> loaderCallbacks) {
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        final void start() {
            if (this.mRetaining && this.mRetainingStarted) {
                this.mStarted = true;
            } else if (this.mStarted) {
            } else {
                this.mStarted = true;
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Starting: ").append(this);
                }
                if (this.mLoader == null && this.mCallbacks != null) {
                    this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
                }
                if (this.mLoader != null) {
                    if (this.mLoader.getClass().isMemberClass() && !Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
                    }
                    if (!this.mListenerRegistered) {
                        this.mLoader.registerListener(this.mId, this);
                        this.mLoader.registerOnLoadCanceledListener(this);
                        this.mListenerRegistered = true;
                    }
                    this.mLoader.startLoading();
                }
            }
        }

        final void retain() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Retaining: ").append(this);
            }
            this.mRetaining = true;
            this.mRetainingStarted = this.mStarted;
            this.mStarted = false;
            this.mCallbacks = null;
        }

        final void finishRetain() {
            if (this.mRetaining) {
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Finished Retaining: ").append(this);
                }
                this.mRetaining = false;
                if (this.mStarted != this.mRetainingStarted && !this.mStarted) {
                    stop();
                }
            }
            if (this.mStarted && this.mHaveData && !this.mReportNextStart) {
                callOnLoadFinished(this.mLoader, this.mData);
            }
        }

        final void reportStart() {
            if (this.mStarted && this.mReportNextStart) {
                this.mReportNextStart = false;
                if (!this.mHaveData || this.mRetaining) {
                    return;
                }
                callOnLoadFinished(this.mLoader, this.mData);
            }
        }

        final void stop() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Stopping: ").append(this);
            }
            this.mStarted = false;
            if (this.mRetaining || this.mLoader == null || !this.mListenerRegistered) {
                return;
            }
            this.mListenerRegistered = false;
            this.mLoader.unregisterListener(this);
            this.mLoader.unregisterOnLoadCanceledListener(this);
            this.mLoader.stopLoading();
        }

        final boolean cancel() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Canceling: ").append(this);
            }
            if (this.mStarted && this.mLoader != null && this.mListenerRegistered) {
                boolean cancelLoad = this.mLoader.cancelLoad();
                if (!cancelLoad) {
                    onLoadCanceled(this.mLoader);
                }
                return cancelLoad;
            }
            return false;
        }

        final void destroy() {
            String str;
            LoaderInfo loaderInfo = this;
            while (true) {
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Destroying: ").append(loaderInfo);
                }
                loaderInfo.mDestroyed = true;
                boolean z = loaderInfo.mDeliveredData;
                loaderInfo.mDeliveredData = false;
                if (loaderInfo.mCallbacks != null && loaderInfo.mLoader != null && loaderInfo.mHaveData && z) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Resetting: ").append(loaderInfo);
                    }
                    if (LoaderManagerImpl.this.mHost != null) {
                        str = LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause;
                        LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
                    } else {
                        str = null;
                    }
                    try {
                        loaderInfo.mCallbacks.onLoaderReset(loaderInfo.mLoader);
                    } finally {
                        if (LoaderManagerImpl.this.mHost != null) {
                            LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = str;
                        }
                    }
                }
                loaderInfo.mCallbacks = null;
                loaderInfo.mData = null;
                loaderInfo.mHaveData = false;
                if (loaderInfo.mLoader != null) {
                    if (loaderInfo.mListenerRegistered) {
                        loaderInfo.mListenerRegistered = false;
                        loaderInfo.mLoader.unregisterListener(loaderInfo);
                        loaderInfo.mLoader.unregisterOnLoadCanceledListener(loaderInfo);
                    }
                    loaderInfo.mLoader.reset();
                }
                if (loaderInfo.mPendingLoader == null) {
                    return;
                }
                loaderInfo = loaderInfo.mPendingLoader;
            }
        }

        @Override // android.support.v4.content.Loader.OnLoadCanceledListener
        public final void onLoadCanceled(Loader<Object> loader) {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadCanceled: ").append(this);
            }
            if (this.mDestroyed) {
                boolean z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.get(this.mId) != this) {
                boolean z2 = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Switching to pending loader: ").append(loaderInfo);
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.put(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                }
            }
        }

        @Override // android.support.v4.content.Loader.OnLoadCompleteListener
        public final void onLoadComplete(Loader<Object> loader, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadComplete: ").append(this);
            }
            if (this.mDestroyed) {
                boolean z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.get(this.mId) != this) {
                boolean z2 = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Switching to pending loader: ").append(loaderInfo);
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.put(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                    return;
                }
                if (this.mData != obj || !this.mHaveData) {
                    this.mData = obj;
                    this.mHaveData = true;
                    if (this.mStarted) {
                        callOnLoadFinished(loader, obj);
                    }
                }
                LoaderInfo loaderInfo2 = LoaderManagerImpl.this.mInactiveLoaders.get(this.mId);
                if (loaderInfo2 != null && loaderInfo2 != this) {
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                    LoaderManagerImpl.this.mInactiveLoaders.remove(this.mId);
                }
                if (LoaderManagerImpl.this.mHost == null || LoaderManagerImpl.this.hasRunningLoaders()) {
                    return;
                }
                LoaderManagerImpl.this.mHost.mFragmentManager.startPendingDeferredFragments();
            }
        }

        final void callOnLoadFinished(Loader<Object> loader, Object obj) {
            if (this.mCallbacks != null) {
                String str = null;
                if (LoaderManagerImpl.this.mHost != null) {
                    str = LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause;
                    LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
                }
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        StringBuilder sb = new StringBuilder("  onLoadFinished in ");
                        sb.append(loader);
                        sb.append(": ");
                        sb.append(loader.dataToString(obj));
                    }
                    this.mCallbacks.onLoadFinished(loader, obj);
                    this.mDeliveredData = true;
                } finally {
                    if (LoaderManagerImpl.this.mHost != null) {
                        LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = str;
                    }
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            DebugUtils.buildShortClassTag(this.mLoader, sb);
            sb.append("}}");
            return sb.toString();
        }

        public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            LoaderInfo loaderInfo = this;
            while (true) {
                printWriter.print(str);
                printWriter.print("mId=");
                printWriter.print(loaderInfo.mId);
                printWriter.print(" mArgs=");
                printWriter.println(loaderInfo.mArgs);
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(loaderInfo.mCallbacks);
                printWriter.print(str);
                printWriter.print("mLoader=");
                printWriter.println(loaderInfo.mLoader);
                if (loaderInfo.mLoader != null) {
                    loaderInfo.mLoader.dump(str + "  ", fileDescriptor, printWriter, strArr);
                }
                if (loaderInfo.mHaveData || loaderInfo.mDeliveredData) {
                    printWriter.print(str);
                    printWriter.print("mHaveData=");
                    printWriter.print(loaderInfo.mHaveData);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(loaderInfo.mDeliveredData);
                    printWriter.print(str);
                    printWriter.print("mData=");
                    printWriter.println(loaderInfo.mData);
                }
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.print(loaderInfo.mStarted);
                printWriter.print(" mReportNextStart=");
                printWriter.print(loaderInfo.mReportNextStart);
                printWriter.print(" mDestroyed=");
                printWriter.println(loaderInfo.mDestroyed);
                printWriter.print(str);
                printWriter.print("mRetaining=");
                printWriter.print(loaderInfo.mRetaining);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(loaderInfo.mRetainingStarted);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(loaderInfo.mListenerRegistered);
                if (loaderInfo.mPendingLoader == null) {
                    return;
                }
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(loaderInfo.mPendingLoader);
                printWriter.println(CommonConstant.Symbol.COLON);
                loaderInfo = loaderInfo.mPendingLoader;
                str = str + "  ";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoaderManagerImpl(String str, FragmentHostCallback fragmentHostCallback, boolean z) {
        this.mWho = str;
        this.mHost = fragmentHostCallback;
        this.mStarted = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateHostController(FragmentHostCallback fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<Object> loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<Object> loaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            LoaderInfo createLoader = createLoader(i, bundle, loaderCallbacks);
            installLoader(createLoader);
            return createLoader;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    void installLoader(LoaderInfo loaderInfo) {
        this.mLoaders.put(loaderInfo.mId, loaderInfo);
        if (this.mStarted) {
            loaderInfo.start();
        }
    }

    @Override // android.support.v4.app.LoaderManager
    public <D> Loader<D> initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = this.mLoaders.get(i);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        if (loaderInfo == null) {
            loaderInfo = createAndInstallLoader(i, bundle, loaderCallbacks);
            if (DEBUG) {
                new StringBuilder("  Created new loader ").append(loaderInfo);
            }
        } else {
            if (DEBUG) {
                new StringBuilder("  Re-using existing loader ").append(loaderInfo);
            }
            loaderInfo.mCallbacks = loaderCallbacks;
        }
        if (loaderInfo.mHaveData && this.mStarted) {
            loaderInfo.callOnLoadFinished(loaderInfo.mLoader, loaderInfo.mData);
        }
        return (Loader<D>) loaderInfo.mLoader;
    }

    @Override // android.support.v4.app.LoaderManager
    public <D> Loader<D> restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = this.mLoaders.get(i);
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("restartLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        if (loaderInfo != null) {
            LoaderInfo loaderInfo2 = this.mInactiveLoaders.get(i);
            if (loaderInfo2 != null) {
                if (loaderInfo.mHaveData) {
                    if (DEBUG) {
                        new StringBuilder("  Removing last inactive loader: ").append(loaderInfo);
                    }
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                } else if (!loaderInfo.cancel()) {
                    this.mLoaders.put(i, null);
                    loaderInfo.destroy();
                } else {
                    if (loaderInfo.mPendingLoader != null) {
                        if (DEBUG) {
                            new StringBuilder("  Removing pending loader: ").append(loaderInfo.mPendingLoader);
                        }
                        loaderInfo.mPendingLoader.destroy();
                        loaderInfo.mPendingLoader = null;
                    }
                    loaderInfo.mPendingLoader = createLoader(i, bundle, loaderCallbacks);
                    return (Loader<D>) loaderInfo.mPendingLoader.mLoader;
                }
            } else if (DEBUG) {
                new StringBuilder("  Making last loader inactive: ").append(loaderInfo);
            }
            loaderInfo.mLoader.abandon();
            this.mInactiveLoaders.put(i, loaderInfo);
        }
        return (Loader<D>) createAndInstallLoader(i, bundle, loaderCallbacks).mLoader;
    }

    @Override // android.support.v4.app.LoaderManager
    public void destroyLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("destroyLoader in ");
            sb.append(this);
            sb.append(" of ");
            sb.append(i);
        }
        int indexOfKey = this.mLoaders.indexOfKey(i);
        if (indexOfKey >= 0) {
            this.mLoaders.removeAt(indexOfKey);
            this.mLoaders.valueAt(indexOfKey).destroy();
        }
        int indexOfKey2 = this.mInactiveLoaders.indexOfKey(i);
        if (indexOfKey2 >= 0) {
            this.mInactiveLoaders.removeAt(indexOfKey2);
            this.mInactiveLoaders.valueAt(indexOfKey2).destroy();
        }
        if (this.mHost == null || hasRunningLoaders()) {
            return;
        }
        this.mHost.mFragmentManager.startPendingDeferredFragments();
    }

    @Override // android.support.v4.app.LoaderManager
    public <D> Loader<D> getLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = this.mLoaders.get(i);
        if (loaderInfo != null) {
            if (loaderInfo.mPendingLoader != null) {
                return (Loader<D>) loaderInfo.mPendingLoader.mLoader;
            }
            return (Loader<D>) loaderInfo.mLoader;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doStart() {
        if (DEBUG) {
            new StringBuilder("Starting in ").append(this);
        }
        if (this.mStarted) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(TAG, "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.mStarted = true;
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            this.mLoaders.valueAt(size).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doStop() {
        if (DEBUG) {
            new StringBuilder("Stopping in ").append(this);
        }
        if (!this.mStarted) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(TAG, "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            this.mLoaders.valueAt(size).stop();
        }
        this.mStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doRetain() {
        if (DEBUG) {
            new StringBuilder("Retaining in ").append(this);
        }
        if (!this.mStarted) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(TAG, "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.mRetaining = true;
        this.mStarted = false;
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            this.mLoaders.valueAt(size).retain();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finishRetain() {
        if (this.mRetaining) {
            if (DEBUG) {
                new StringBuilder("Finished Retaining in ").append(this);
            }
            this.mRetaining = false;
            for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
                this.mLoaders.valueAt(size).finishRetain();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doReportNextStart() {
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            this.mLoaders.valueAt(size).mReportNextStart = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doReportStart() {
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            this.mLoaders.valueAt(size).reportStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void doDestroy() {
        if (!this.mRetaining) {
            if (DEBUG) {
                new StringBuilder("Destroying Active in ").append(this);
            }
            for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
                this.mLoaders.valueAt(size).destroy();
            }
            this.mLoaders.clear();
        }
        if (DEBUG) {
            new StringBuilder("Destroying Inactive in ").append(this);
        }
        for (int size2 = this.mInactiveLoaders.size() - 1; size2 >= 0; size2--) {
            this.mInactiveLoaders.valueAt(size2).destroy();
        }
        this.mInactiveLoaders.clear();
        this.mHost = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.buildShortClassTag(this.mHost, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.LoaderManager
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.mLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.mLoaders.size(); i++) {
                LoaderInfo valueAt = this.mLoaders.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mLoaders.keyAt(i));
                printWriter.print(": ");
                printWriter.println(valueAt.toString());
                valueAt.dump(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.mInactiveLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.mInactiveLoaders.size(); i2++) {
                LoaderInfo valueAt2 = this.mInactiveLoaders.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mInactiveLoaders.keyAt(i2));
                printWriter.print(": ");
                printWriter.println(valueAt2.toString());
                valueAt2.dump(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // android.support.v4.app.LoaderManager
    public boolean hasRunningLoaders() {
        int size = this.mLoaders.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            LoaderInfo valueAt = this.mLoaders.valueAt(i);
            z |= valueAt.mStarted && !valueAt.mDeliveredData;
        }
        return z;
    }
}
