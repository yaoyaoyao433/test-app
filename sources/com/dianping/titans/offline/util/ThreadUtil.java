package com.dianping.titans.offline.util;

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
/* loaded from: classes.dex */
public class ThreadUtil {
    private static final String THREAD_NAME_PREFIX = "offline-thread";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ExecutorService executor;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SingleHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final ThreadUtil sThreadUtil = new ThreadUtil();
    }

    public ThreadUtil() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59151d13b9175dd7fe54f2f3484cadd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59151d13b9175dd7fe54f2f3484cadd2");
        } else {
            this.executor = c.a(THREAD_NAME_PREFIX, 1, Runtime.getRuntime().availableProcessors() * 2, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.dianping.titans.offline.util.ThreadUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;
                private final AtomicInteger mCount = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@NonNull Runnable runnable) {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "87fe524fefa4352e7775cb7b00b21fcd", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "87fe524fefa4352e7775cb7b00b21fcd");
                    }
                    Thread a = c.a(ThreadUtil.THREAD_NAME_PREFIX + this.mCount.getAndIncrement(), runnable);
                    a.setPriority(5);
                    return a;
                }
            });
        }
    }

    public static ThreadUtil getInstance() {
        return SingleHolder.sThreadUtil;
    }

    public boolean executeOnThreadPool(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79ef742d599d3f9a7524d96e67c47a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79ef742d599d3f9a7524d96e67c47a0d")).booleanValue();
        }
        try {
            this.executor.execute(runnable);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
