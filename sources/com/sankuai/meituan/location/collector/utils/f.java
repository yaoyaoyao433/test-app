package com.sankuai.meituan.location.collector.utils;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f b;
    private volatile ExecutorService c;

    /* loaded from: classes4.dex */
    public static class a extends ThreadPoolExecutor {
        public static ChangeQuickRedirect a;

        public a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
            super(1, 1, 0L, timeUnit, blockingQueue);
            Object[] objArr = {1, 1, 0L, timeUnit, blockingQueue};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8b5c10aa91a2cd1fae2b4cf40cda2d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8b5c10aa91a2cd1fae2b4cf40cda2d");
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public final void afterExecute(Runnable runnable, Throwable th) {
            Object[] objArr = {runnable, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15637e9d8c56ee4aa63ba0bc2ee5ab01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15637e9d8c56ee4aa63ba0bc2ee5ab01");
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
                } catch (ExecutionException unused3) {
                } catch (Throwable unused4) {
                }
            }
        }
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb283eb0dfe178dfcde7b40c805f174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb283eb0dfe178dfcde7b40c805f174");
            return;
        }
        this.c = null;
        this.c = new a(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1000));
        LogUtils.a("CollectorThreadPool new CollectorThreadPool " + this.c);
    }

    private static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e01e31ac329317e1d20ed01ce60f9ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e01e31ac329317e1d20ed01ce60f9ac");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "462b9969fd5e637ef595dba4a242f5de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "462b9969fd5e637ef595dba4a242f5de");
            return;
        }
        f a2 = a();
        if (b == null) {
            LogUtils.a("CollectorThreadPool error exception,executeSafely pool instance null");
            return;
        }
        try {
            a2.b(runnable);
        } catch (Throwable th) {
            LogUtils.a(th);
        }
    }

    private synchronized Future<?> b(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3ee653dfbc9868d5df78572d27de5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3ee653dfbc9868d5df78572d27de5e");
        } else if (runnable == null) {
            LogUtils.a("CollectorThreadPool execute currentR null");
            return null;
        } else if (this.c == null) {
            LogUtils.a("CollectorThreadPool execute executorService null");
            return null;
        } else {
            return this.c.submit(new Runnable() { // from class: com.sankuai.meituan.location.collector.utils.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd186060db498b286ad8d799c0e6685e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd186060db498b286ad8d799c0e6685e");
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        LogUtils.a(getClass(), th);
                    }
                }
            });
        }
    }
}
