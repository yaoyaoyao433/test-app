package com.meituan.android.common.metricx.helpers;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ThreadManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile Handler mMainHandler;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class _Inner {
        public static ThreadManager _instance = new ThreadManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private Handler getMainHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63cafff43e756754e0e75d8195a185f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63cafff43e756754e0e75d8195a185f4");
        }
        if (this.mMainHandler == null) {
            synchronized (this) {
                if (this.mMainHandler == null) {
                    this.mMainHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.mMainHandler;
    }

    public void runInMainThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "349d3c5224ef85733ef85e8d6c7d9bfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "349d3c5224ef85733ef85e8d6c7d9bfb");
        } else if (runnable == null) {
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                getMainHandler().post(runnable);
            }
        }
    }

    public static ThreadManager getInstance() {
        return _Inner._instance;
    }

    public ThreadManager() {
    }
}
