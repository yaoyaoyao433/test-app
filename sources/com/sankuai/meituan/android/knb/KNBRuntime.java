package com.sankuai.meituan.android.knb;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBRuntime {
    private static final String THREAD_NAME_PREFIX = "knb-thread";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile Application app;
    private final ExecutorService executor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SingleHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final KNBRuntime sRuntime = new KNBRuntime();
    }

    public KNBRuntime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c63a03281e2adfdbad94440859cf81e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c63a03281e2adfdbad94440859cf81e2");
        } else {
            this.executor = c.a(THREAD_NAME_PREFIX, 1, Runtime.getRuntime().availableProcessors() * 2, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.sankuai.meituan.android.knb.KNBRuntime.1
                public static ChangeQuickRedirect changeQuickRedirect;
                private final AtomicInteger mCount = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@NonNull Runnable runnable) {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "335907ba154d34b57b05be921b5950ed", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "335907ba154d34b57b05be921b5950ed");
                    }
                    Thread thread = new Thread(runnable, KNBRuntime.THREAD_NAME_PREFIX + this.mCount.getAndIncrement());
                    thread.setPriority(5);
                    return thread;
                }
            });
        }
    }

    public static KNBRuntime getRuntime() {
        return SingleHolder.sRuntime;
    }

    public final Context getContext() {
        return this.app;
    }

    public final void setContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b32b579ea86229c9db522e5d7cbd134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b32b579ea86229c9db522e5d7cbd134");
        } else if (this.app != null || context == null) {
        } else {
            if (context instanceof Application) {
                this.app = (Application) context;
            } else {
                this.app = (Application) context.getApplicationContext();
            }
        }
    }

    public final boolean executeOnUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af43dbb75fe14d6e28761904ae317e34", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af43dbb75fe14d6e28761904ae317e34")).booleanValue() : executeOnUIThread(runnable, 0L);
    }

    public final boolean executeOnUIThread(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf5385242fa46b4ea6254f0955554f3b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf5385242fa46b4ea6254f0955554f3b")).booleanValue() : new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }

    public final boolean executeOnThreadPool(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b79f66e3f6dad85abd50af71c509e6f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b79f66e3f6dad85abd50af71c509e6f2")).booleanValue();
        }
        try {
            this.executor.execute(runnable);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
