package com.meituan.android.common.locate.util;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class g {
    private static String a = "LocateThreadPool ";
    private static volatile g b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ThreadPoolExecutor c;

    /* loaded from: classes2.dex */
    public static class a extends ThreadPoolExecutor {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory);
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba7c7a9981eb039bc0a2413464d8cf3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba7c7a9981eb039bc0a2413464d8cf3");
            }
        }

        public a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67726e542b9b57b945e1b7d1397e06be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67726e542b9b57b945e1b7d1397e06be");
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th) {
            Object[] objArr = {runnable, th};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bfa03bae4b6de4ac567b90d7e505d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bfa03bae4b6de4ac567b90d7e505d9");
                return;
            }
            super.afterExecute(runnable, th);
            if (runnable != null && th != null) {
                LogUtils.a(runnable.getClass(), th);
            } else if (th == null && (runnable instanceof Future)) {
                try {
                    ((Future) runnable).get();
                } catch (InterruptedException unused) {
                    LogUtils.a("task has interrupt");
                } catch (CancellationException unused2) {
                    LogUtils.a("task has canceled");
                } catch (ExecutionException e) {
                    LogUtils.a(getClass(), e);
                } catch (Throwable th2) {
                    LogUtils.a(getClass(), th2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b implements Callable<Void> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Runnable a;

        public b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68492dda8d335c38b76273af9e64fcd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68492dda8d335c38b76273af9e64fcd4");
                return;
            }
            this.a = null;
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4feb4baba3de1761b018594266836dc", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4feb4baba3de1761b018594266836dc");
            }
            this.a.run();
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class c<T> extends FutureTask<T> implements Comparable<c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean a;

        public c(Callable<T> callable, boolean z) {
            super(callable);
            Object[] objArr = {callable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "990d85f42bc79690379730deac15bccd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "990d85f42bc79690379730deac15bccd");
            } else {
                this.a = z;
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(@NonNull c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4b1946a0266ae5a34e58207e340f61a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4b1946a0266ae5a34e58207e340f61a")).intValue();
            }
            if (cVar == null || this.a == cVar.a) {
                return 0;
            }
            return this.a ? -1 : 1;
        }
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "439d1e0478b22da3573c674f3067a361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "439d1e0478b22da3573c674f3067a361");
            return;
        }
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.meituan.android.common.locate.util.g.1
            public static ChangeQuickRedirect changeQuickRedirect;
            public int a = 1;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "800dbd3ac5d6ab419abada29bc3e1980", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "800dbd3ac5d6ab419abada29bc3e1980");
                }
                Thread a2 = com.sankuai.android.jarvis.c.a("Locate-pool" + this.a, runnable);
                this.a = this.a + 1;
                return a2;
            }
        };
        try {
            this.c = com.sankuai.android.jarvis.c.a("LocateThreadPool", 3, 3, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(1000), threadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        if (this.c == null) {
            this.c = new a(3, 3, 1L, TimeUnit.MINUTES, new PriorityBlockingQueue(1000), threadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
        }
        this.c.allowCoreThreadTimeOut(true);
        LogUtils.a(a + "new LocateThreadPool ");
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd2157b1a10963024739a0c1e660f69f", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd2157b1a10963024739a0c1e660f69f");
        }
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new g();
                }
            }
        }
        return b;
    }

    private <T> Future<T> a(Callable<T> callable, boolean z) {
        Object[] objArr = {callable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d60346d8cf786af497b83e51520bf721", RobustBitConfig.DEFAULT_VALUE)) {
            return (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d60346d8cf786af497b83e51520bf721");
        }
        if (callable == null) {
            LogUtils.a(a + "submit currentR null");
            return null;
        } else if (this.c == null) {
            LogUtils.a(a + "submit executorService null");
            return null;
        } else {
            try {
                c cVar = new c(callable, z);
                this.c.execute(new c(callable, z));
                return cVar;
            } catch (Throwable th) {
                com.meituan.android.common.locate.platform.logs.c.a("submitByPriority exception: " + th.getMessage(), 1);
                LogUtils.a(getClass(), th);
                return null;
            }
        }
    }

    public Future<Void> a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1ddad28dca581766595558606511871", RobustBitConfig.DEFAULT_VALUE) ? (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1ddad28dca581766595558606511871") : a(new b(runnable));
    }

    public Future<Void> a(Runnable runnable, boolean z) {
        Object[] objArr = {runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b957838570382d2817a26426da0bf7bf", RobustBitConfig.DEFAULT_VALUE) ? (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b957838570382d2817a26426da0bf7bf") : a(new b(runnable), z);
    }

    public <T> Future<T> a(Callable<T> callable) {
        Object[] objArr = {callable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95aacb1eaa04ae973e38d88605247e5e", RobustBitConfig.DEFAULT_VALUE) ? (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95aacb1eaa04ae973e38d88605247e5e") : a((Callable) callable, false);
    }
}
