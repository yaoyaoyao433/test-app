package com.meituan.android.common.statistics.exposure;

import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecycledRefPool {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile RecycledRefPool mInstance;
    private Set<RecycledRefCallback> mCallbackList;
    private AtomicBoolean mStarted;
    private Map<Object, Object> objectMap;
    private final ReferenceQueue referenceQueue;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class RecycledRefCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract void refRecycled(WeakReference weakReference, String str);
    }

    public RecycledRefPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f277d6bd6eff9e49506d78bd983e9b1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f277d6bd6eff9e49506d78bd983e9b1f");
            return;
        }
        this.referenceQueue = new ReferenceQueue();
        this.objectMap = new HashMap();
        this.mStarted = new AtomicBoolean(false);
        this.mCallbackList = Collections.synchronizedSet(new HashSet());
    }

    public static RecycledRefPool getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c6cc3924c2b3d71d05bfafdf4ea9fca", 6917529027641081856L)) {
            return (RecycledRefPool) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c6cc3924c2b3d71d05bfafdf4ea9fca");
        }
        if (mInstance == null) {
            synchronized (RecycledRefPool.class) {
                if (mInstance == null) {
                    mInstance = new RecycledRefPool();
                }
            }
        }
        return mInstance;
    }

    public void join(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "851f353bd7227b19495e716b392feb11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "851f353bd7227b19495e716b392feb11");
            return;
        }
        this.objectMap.put(new WeakReference(obj, this.referenceQueue), str);
        LogUtil.log("tempsdk", "RecycledRefPool :" + str);
        start();
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1ec3ccb515d741f709de55222647a48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1ec3ccb515d741f709de55222647a48");
        } else if (this.mStarted.compareAndSet(false, true)) {
            Thread a = c.a("LX_Recycled_RefPool", new Runnable() { // from class: com.meituan.android.common.statistics.exposure.RecycledRefPool.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23fc186e19509032cd4e6b8e376bcc92", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23fc186e19509032cd4e6b8e376bcc92");
                        return;
                    }
                    while (true) {
                        try {
                            WeakReference weakReference = (WeakReference) RecycledRefPool.this.referenceQueue.remove();
                            if (weakReference == null) {
                                return;
                            }
                            RecycledRefPool.this.callback(weakReference, (String) RecycledRefPool.this.objectMap.get(weakReference));
                            LogUtil.log("tempsdk", "RecycledRefPool : reqid" + ((String) RecycledRefPool.this.objectMap.get(weakReference)));
                            RecycledRefPool.this.objectMap.remove(weakReference);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                }
            });
            a.setDaemon(true);
            a.start();
        }
    }

    public void addCallback(RecycledRefCallback recycledRefCallback) {
        Object[] objArr = {recycledRefCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c59c86246a81a3a2c3522a95a0ce738c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c59c86246a81a3a2c3522a95a0ce738c");
        } else {
            this.mCallbackList.add(recycledRefCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callback(WeakReference<Object> weakReference, String str) {
        Object[] objArr = {weakReference, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de17f3dbc58654d7ce4d70703c6164de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de17f3dbc58654d7ce4d70703c6164de");
        } else if (this.mCallbackList != null && this.mCallbackList.size() > 0) {
            for (RecycledRefCallback recycledRefCallback : this.mCallbackList) {
                if (recycledRefCallback != null) {
                    recycledRefCallback.refRecycled(weakReference, str);
                }
            }
        }
    }
}
