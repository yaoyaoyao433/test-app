package com.meituan.msc.common.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Trace;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ExecutorService c;
    private static Handler d = new Handler(Looper.getMainLooper());
    public static final ScheduledExecutorService b = com.sankuai.android.jarvis.c.b("MSC-IO", n.PRIORITY_LOW);

    private static synchronized Handler a() {
        Handler handler;
        synchronized (a.class) {
            handler = d;
        }
        return handler;
    }

    public static synchronized void a(Runnable runnable) {
        synchronized (a.class) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bc3fb3676ceda14a41bb1af8ff41248", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bc3fb3676ceda14a41bb1af8ff41248");
            } else if (runnable instanceof com.meituan.msc.common.executor.b) {
                a().post(runnable);
            } else {
                if (c == null) {
                    c = com.sankuai.android.jarvis.c.b("MSC");
                }
                c.submit(new b(runnable));
            }
        }
    }

    public static void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, 100L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36b1a39a0a5e8047098b95dddde1fda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36b1a39a0a5e8047098b95dddde1fda1");
        } else {
            a().postDelayed(runnable, 100L);
        }
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b3a92c703c7d2bdb2448d024f19252e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b3a92c703c7d2bdb2448d024f19252e");
        } else {
            a().post(runnable);
        }
    }

    public static void c(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bd17a3a2087adbe37598ecc4fe0ae46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bd17a3a2087adbe37598ecc4fe0ae46");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }

    public static void d(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56d2ee6983b3e67851b1617cc224349b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56d2ee6983b3e67851b1617cc224349b");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            e(runnable);
        }
    }

    public static void e(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e811622d6e0113e93b3c5a051bc83c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e811622d6e0113e93b3c5a051bc83c3a");
        } else {
            a().postAtFrontOfQueue(runnable);
        }
    }

    public static void f(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0ffd1fea87d22b6ef20a8621836c91e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0ffd1fea87d22b6ef20a8621836c91e");
        } else {
            a().removeCallbacks(runnable);
        }
    }

    public static void b(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66ca2545e8f45b669ec16629541ff216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66ca2545e8f45b669ec16629541ff216");
        } else {
            a().postDelayed(runnable, j);
        }
    }

    public static void g(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52e015779e0498f636dd3bc21c9bad85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52e015779e0498f636dd3bc21c9bad85");
        } else {
            c(runnable, 0L);
        }
    }

    public static void c(final Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5895326122e08e1f23535c6e728587b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5895326122e08e1f23535c6e728587b");
            return;
        }
        com.meituan.msc.common.executor.b bVar = new com.meituan.msc.common.executor.b() { // from class: com.meituan.msc.common.executor.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72ffc0092a24940fe0be637eae41d194", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72ffc0092a24940fe0be637eae41d194");
                } else {
                    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.meituan.msc.common.executor.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2c8d66e1fdb7f6e4967c571ffa183e2", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2c8d66e1fdb7f6e4967c571ffa183e2")).booleanValue();
                            }
                            runnable.run();
                            return false;
                        }
                    });
                }
            }
        };
        if (j > 0) {
            b(bVar, j);
        } else {
            c(bVar);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.common.executor.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static abstract class AbstractRunnableC0432a implements Runnable {
        protected Runnable a;
        protected long b;

        public AbstractRunnableC0432a(Runnable runnable, long j) {
            this.a = runnable;
            this.b = j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {
        public static ChangeQuickRedirect a;
        private Runnable b;

        public b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353fe3167dfa3ce1a079864bb8a45b59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353fe3167dfa3ce1a079864bb8a45b59");
            } else {
                this.b = runnable;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f77e0cb3b3315093af50ea7ed7eee4ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f77e0cb3b3315093af50ea7ed7eee4ee");
                return;
            }
            try {
                this.b.run();
            } catch (Exception e) {
                g.a(e);
                throw e;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private static volatile ScheduledExecutorService b;

        public static ScheduledExecutorService a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e8b4bddd2db9d97f855614ce7f4a515", RobustBitConfig.DEFAULT_VALUE)) {
                return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e8b4bddd2db9d97f855614ce7f4a515");
            }
            Trace.beginSection("MSC-MSCExecutors.getExecutor");
            if (b == null) {
                synchronized (c.class) {
                    if (b == null) {
                        Trace.beginSection("MSC-MSCExecutors.newThreadPool");
                        b = com.sankuai.android.jarvis.c.b("MSC-Serialized", 1);
                        Trace.endSection();
                    }
                }
            }
            Trace.endSection();
            return b;
        }

        public static void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "031572c4b53b03532fa66c9322cb87e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "031572c4b53b03532fa66c9322cb87e9");
                return;
            }
            ScheduledExecutorService a2 = a();
            Trace.beginSection("MSC-MSCExecutors.submit");
            a2.submit(new b(runnable));
            Trace.endSection();
        }

        public static void a(Runnable runnable, long j) {
            Object[] objArr = {runnable, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2115f2d526fcf2febed3073faaa1e7e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2115f2d526fcf2febed3073faaa1e7e2");
                return;
            }
            ScheduledExecutorService a2 = a();
            Trace.beginSection("MSC-MSCExecutors.schedule");
            a2.schedule(new b(runnable), j, TimeUnit.MILLISECONDS);
            Trace.endSection();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.msc.common.executor.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0433a extends AbstractRunnableC0432a {
            public static ChangeQuickRedirect c;

            public C0433a(Runnable runnable, long j) {
                super(runnable, j);
                Object[] objArr = {runnable, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect = c;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e208ea9ab1c0804241bd57915ee898eb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e208ea9ab1c0804241bd57915ee898eb");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = c;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b9b7fa58c261f2921e4576134589dd9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b9b7fa58c261f2921e4576134589dd9");
                } else if (this.b == 0) {
                    c.a(this.a);
                } else {
                    c.a(this.a, this.b);
                }
            }
        }
    }
}
