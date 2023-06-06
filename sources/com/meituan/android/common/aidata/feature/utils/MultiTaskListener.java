package com.meituan.android.common.aidata.feature.utils;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.lang.Exception;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MultiTaskListener<K, V, E extends Exception> {
    public static final int STATE_DOING = 1;
    public static final int STATE_FAIL = 3;
    public static final int STATE_SUCCESS = 2;
    public static final int STATE_UNKNOWN = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExecutorService mCallBackThread;
    private Handler mCallbackHandler;
    private boolean mIsCallbackInvoked;
    private final Map<K, ResultHolder<V, E>> mResultHolderMap;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IOneTaskListener<K, V, E> {
        void onOneTaskFailed(K k, @Nullable E e);

        void onOneTaskSuccess(K k, @Nullable V v);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ResultHolder<T, E> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public E exception;
        public int resultCode;
        public T resultValue;
    }

    public static String statusString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d87870f030ee2978f5666486e94c5f77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d87870f030ee2978f5666486e94c5f77");
        }
        switch (i) {
            case 1:
                return "STATE_DOING";
            case 2:
                return "STATE_SUCCESS";
            case 3:
                return "STATE_FAIL";
            default:
                return "STATE_UNKNOWN";
        }
    }

    public void onAllTaskComplete(@NonNull Map<K, ResultHolder<V, E>> map) {
    }

    public void onAllTaskFailed(@NonNull Map<K, ResultHolder<V, E>> map) {
    }

    public void onAllTaskSuccess(@NonNull Map<K, ResultHolder<V, E>> map) {
    }

    public void onAnyTaskFailed(@NonNull Map<K, ResultHolder<V, E>> map) {
    }

    public void onAnyTaskSuccess(@NonNull Map<K, ResultHolder<V, E>> map) {
    }

    public MultiTaskListener() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47c43f8e0c3f69ba3e63afd50fc1baed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47c43f8e0c3f69ba3e63afd50fc1baed");
        }
    }

    public MultiTaskListener(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64e0be04402128ae13e9bf4b2fcac477", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64e0be04402128ae13e9bf4b2fcac477");
            return;
        }
        this.mResultHolderMap = new HashMap();
        this.mIsCallbackInvoked = false;
        if (handler != null) {
            this.mCallbackHandler = handler;
        } else {
            this.mCallBackThread = c.a("MultiTaskListener");
        }
    }

    public ITaskListener<V, E> createOneTaskListener(@NonNull K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9041b3e80a8340f88b0d92e5522f515", RobustBitConfig.DEFAULT_VALUE) ? (ITaskListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9041b3e80a8340f88b0d92e5522f515") : createOneTaskListener(k, null);
    }

    public synchronized ITaskListener<V, E> createOneTaskListener(@NonNull K k, @Nullable IOneTaskListener<K, V, E> iOneTaskListener) {
        Object[] objArr = {k, iOneTaskListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b73c8cde1ca6ad1050188e428fcc176a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITaskListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b73c8cde1ca6ad1050188e428fcc176a");
        }
        setIsCallbackInvoked(false);
        ResultHolder<V, E> resultHolder = new ResultHolder<>();
        resultHolder.resultCode = 1;
        resultHolder.resultValue = null;
        OneTaskListener oneTaskListener = new OneTaskListener(k, resultHolder, this, iOneTaskListener);
        this.mResultHolderMap.put(k, resultHolder);
        new StringBuilder("createOnTaskListener, key=").append(k);
        return oneTaskListener;
    }

    public void notifyCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e0f3d371eb12324a8faa38a5cdab123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e0f3d371eb12324a8faa38a5cdab123");
        } else {
            postCheckTaskStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkTaskStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64e260faa187828fb648f6b5ef5ea5e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64e260faa187828fb648f6b5ef5ea5e8");
            return;
        }
        if (!isCallbackInvoked()) {
            CheckResult checkAllTask = checkAllTask();
            if (checkAllTask.isAnySuccess) {
                onAnyTaskSuccess(this.mResultHolderMap);
            }
            if (checkAllTask.isAllSuccess) {
                onAllTaskSuccess(this.mResultHolderMap);
            }
            if (checkAllTask.isAnyFailed) {
                onAnyTaskFailed(this.mResultHolderMap);
            }
            if (checkAllTask.isAllFailed) {
                onAllTaskFailed(this.mResultHolderMap);
            }
            if (checkAllTask.isAllDone) {
                onAllTaskComplete(this.mResultHolderMap);
                setIsCallbackInvoked(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postCheckTaskStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7530ab1671ada7d4e4f9ee1a6a53f6ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7530ab1671ada7d4e4f9ee1a6a53f6ba");
        } else if (this.mCallbackHandler != null) {
            this.mCallbackHandler.post(new Runnable() { // from class: com.meituan.android.common.aidata.feature.utils.MultiTaskListener.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "513b0c783ba1fb23cc94b844f35e9ad0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "513b0c783ba1fb23cc94b844f35e9ad0");
                    } else {
                        MultiTaskListener.this.checkTaskStatus();
                    }
                }
            });
        } else {
            this.mCallBackThread.execute(new Runnable() { // from class: com.meituan.android.common.aidata.feature.utils.MultiTaskListener.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "414b2ae88f01d5c288cd24dfe16f1f36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "414b2ae88f01d5c288cd24dfe16f1f36");
                    } else {
                        MultiTaskListener.this.checkTaskStatus();
                    }
                }
            });
        }
    }

    private boolean isCallbackInvoked() {
        return this.mIsCallbackInvoked;
    }

    private void setIsCallbackInvoked(boolean z) {
        this.mIsCallbackInvoked = z;
    }

    @NonNull
    private CheckResult checkAllTask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3024cfea26536d96fb863c185897c66d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CheckResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3024cfea26536d96fb863c185897c66d");
        }
        CheckResult checkResult = new CheckResult();
        checkResult.isAllDone = true;
        checkResult.isAllSuccess = true;
        checkResult.isAnySuccess = false;
        checkResult.isAnyFailed = false;
        checkResult.isAllFailed = true;
        Set<Map.Entry<K, ResultHolder<V, E>>> entrySet = this.mResultHolderMap.entrySet();
        new StringBuilder("checkAllTask entrySet size=").append(entrySet.size());
        for (Map.Entry<K, ResultHolder<V, E>> entry : entrySet) {
            if (entry != null && entry.getValue() != null) {
                new StringBuilder("checkAllTask entry key").append(entry.getKey());
                new StringBuilder("checkAllTask entry resultValue").append(entry.getValue().resultValue);
                new StringBuilder("checkAllTask entry resultCode").append(entry.getValue().resultCode);
                int i = entry.getValue().resultCode;
                checkResult.isAllDone &= i != 1;
                checkResult.isAllSuccess &= i == 2;
                checkResult.isAnySuccess |= i == 2;
                checkResult.isAnyFailed |= i == 3;
                checkResult.isAllFailed = (i == 3) & checkResult.isAllFailed;
            }
        }
        return checkResult;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CheckResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isAllDone;
        public boolean isAllFailed;
        public boolean isAllSuccess;
        public boolean isAnyFailed;
        public boolean isAnySuccess;

        public CheckResult() {
            this.isAllDone = true;
            this.isAllSuccess = true;
            this.isAnySuccess = false;
            this.isAnyFailed = false;
            this.isAllFailed = true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class OneTaskListener<K, V, E extends Exception> implements ITaskListener<V, E> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private K mKey;
        private IOneTaskListener<K, V, E> mOneTaskListener;
        private MultiTaskListener<K, V, E> mOuterListener;
        private ResultHolder<V, E> mResultHolder;

        public OneTaskListener(@NonNull K k, ResultHolder<V, E> resultHolder, MultiTaskListener<K, V, E> multiTaskListener, @Nullable IOneTaskListener<K, V, E> iOneTaskListener) {
            Object[] objArr = {k, resultHolder, multiTaskListener, iOneTaskListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc0f119cf205bda3459c6ebeb6f99ef0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc0f119cf205bda3459c6ebeb6f99ef0");
                return;
            }
            this.mKey = k;
            this.mResultHolder = resultHolder;
            this.mOuterListener = multiTaskListener;
            this.mOneTaskListener = iOneTaskListener;
        }

        @Override // com.meituan.android.common.aidata.feature.utils.ITaskListener
        public final void onSuccess(@Nullable V v) {
            Object[] objArr = {v};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7489a4184bdd499238b027c11f133d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7489a4184bdd499238b027c11f133d9");
                return;
            }
            this.mResultHolder.resultCode = 2;
            this.mResultHolder.resultValue = v;
            this.mOuterListener.postCheckTaskStatus();
            notifyOneTaskSuccess(this.mKey, v);
        }

        @Override // com.meituan.android.common.aidata.feature.utils.ITaskListener
        public final void onFailed(@Nullable E e) {
            Object[] objArr = {e};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "163aaface093bb85724f4193d2de6158", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "163aaface093bb85724f4193d2de6158");
                return;
            }
            this.mResultHolder.resultCode = 3;
            this.mResultHolder.resultValue = null;
            this.mResultHolder.exception = e;
            this.mOuterListener.postCheckTaskStatus();
            notifyOneTaskFailed(this.mKey, e);
        }

        private void notifyOneTaskSuccess(K k, @Nullable V v) {
            Object[] objArr = {k, v};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c790fc0de1361a1bbe360f949695577", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c790fc0de1361a1bbe360f949695577");
            } else if (this.mOneTaskListener != null) {
                this.mOneTaskListener.onOneTaskSuccess(k, v);
            }
        }

        private void notifyOneTaskFailed(K k, @Nullable E e) {
            Object[] objArr = {k, e};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09194eb4d03a707cd0e120f4d18c7349", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09194eb4d03a707cd0e120f4d18c7349");
            } else if (this.mOneTaskListener != null) {
                this.mOneTaskListener.onOneTaskFailed(k, e);
            }
        }
    }
}
