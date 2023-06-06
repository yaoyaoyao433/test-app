package com.meituan.mmp.lib.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.os.Trace;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ExecutorService c;
    private static Handler d = new Handler(Looper.getMainLooper());
    public static ScheduledExecutorService b = com.sankuai.android.jarvis.c.b("MMP-IO", n.PRIORITY_LOW);

    public static synchronized Handler a() {
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "407ce982b69684ceb1b6e219be318e28", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "407ce982b69684ceb1b6e219be318e28");
            } else if (runnable instanceof com.meituan.mmp.lib.executor.b) {
                a().post(runnable);
            } else {
                if (c == null) {
                    c = com.sankuai.android.jarvis.c.b("MMP");
                }
                c.submit(new b(runnable));
            }
        }
    }

    public static void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, 100L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38dfd09ae54b2f8745276f7d33a63dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38dfd09ae54b2f8745276f7d33a63dd4");
        } else {
            a().postDelayed(runnable, 100L);
        }
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b433eaae31f19610b9fc24a528775f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b433eaae31f19610b9fc24a528775f9");
        } else {
            a().post(runnable);
        }
    }

    public static void c(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72b57bcd548883ebcb228f6d0aac7973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72b57bcd548883ebcb228f6d0aac7973");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }

    @Deprecated
    public static void a(com.meituan.mmp.lib.executor.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b95c06cb73964360658c610cfcf5cb4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b95c06cb73964360658c610cfcf5cb4c");
        } else {
            c(bVar);
        }
    }

    public static void d(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1a49d260c68c825365fb18356aef6f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1a49d260c68c825365fb18356aef6f4");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            e(runnable);
        }
    }

    public static void e(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c44dfe570d0c928423890fef7a91a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c44dfe570d0c928423890fef7a91a0c");
        } else {
            a().postAtFrontOfQueue(runnable);
        }
    }

    public static void f(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e3bd0d788ede047017cf14b0fb81af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e3bd0d788ede047017cf14b0fb81af1");
        } else {
            a().removeCallbacks(runnable);
        }
    }

    public static void b(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce0ace3e7053da511ddd9ba8dc54a707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce0ace3e7053da511ddd9ba8dc54a707");
        } else {
            a().postDelayed(runnable, j);
        }
    }

    public static boolean c(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "634589fa0c433aea3c0fca6bf75cf1dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "634589fa0c433aea3c0fca6bf75cf1dc")).booleanValue();
        }
        long elapsedRealtime = j - SystemClock.elapsedRealtime();
        int i = (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1));
        if (i <= 0 && Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        a().postDelayed(runnable, elapsedRealtime);
        return i <= 0;
    }

    public static void g(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3db572402b54e1c59a2da29055daa25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3db572402b54e1c59a2da29055daa25");
        } else {
            d(runnable, 0L);
        }
    }

    public static void d(final Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba34c28a39886140bd1c87adfc9eae46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba34c28a39886140bd1c87adfc9eae46");
            return;
        }
        com.meituan.mmp.lib.executor.b bVar = new com.meituan.mmp.lib.executor.b() { // from class: com.meituan.mmp.lib.executor.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cda9b53ba8fb777a9311b742be5a1a2e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cda9b53ba8fb777a9311b742be5a1a2e");
                } else {
                    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.meituan.mmp.lib.executor.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a1481da42dd50471bb8925b05d674fa3", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a1481da42dd50471bb8925b05d674fa3")).booleanValue();
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
    /* renamed from: com.meituan.mmp.lib.executor.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static abstract class AbstractRunnableC0416a implements Runnable {
        protected Runnable a;
        protected long b;

        public AbstractRunnableC0416a(Runnable runnable, long j) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c976d83bf97a3649c82cde82143a93", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c976d83bf97a3649c82cde82143a93");
            } else {
                this.b = runnable;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6200de1a81f156708e4f0aa61238d0ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6200de1a81f156708e4f0aa61238d0ab");
                return;
            }
            try {
                try {
                    ab.b(this.b.getClass().getName());
                    this.b.run();
                } catch (Exception e) {
                    com.meituan.mmp.lib.trace.b.a(e);
                    throw e;
                }
            } finally {
                ab.b();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private static volatile ScheduledExecutorService b;

        private static ScheduledExecutorService a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8da3f0a927b6907f9daafc1a651b5f1", RobustBitConfig.DEFAULT_VALUE)) {
                return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8da3f0a927b6907f9daafc1a651b5f1");
            }
            Trace.beginSection("MMP-MMPExecutors.getExecutor");
            if (b == null) {
                synchronized (c.class) {
                    if (b == null) {
                        Trace.beginSection("MMP-MMPExecutors.newThreadPool");
                        b = com.sankuai.android.jarvis.c.b("MMP-Serialized", 1);
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8731f5c3784d452a463495402c6b89f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8731f5c3784d452a463495402c6b89f3");
                return;
            }
            ScheduledExecutorService a2 = a();
            Trace.beginSection("MMP-MMPExecutors.submit");
            a2.submit(new b(runnable));
            Trace.endSection();
        }

        public static void a(Runnable runnable, long j) {
            Object[] objArr = {runnable, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e34679a99fc31ac233868cbd8684eaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e34679a99fc31ac233868cbd8684eaf");
                return;
            }
            ScheduledExecutorService a2 = a();
            Trace.beginSection("MMP-MMPExecutors.schedule");
            a2.schedule(new b(runnable), j, TimeUnit.MILLISECONDS);
            Trace.endSection();
        }

        public static ScheduledFuture a(Runnable runnable, long j, long j2) {
            Object[] objArr = {runnable, 0L, new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57d5728ffbaa206dae3259a06b01260b", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledFuture) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57d5728ffbaa206dae3259a06b01260b") : a().scheduleAtFixedRate(new b(runnable), 0L, j2, TimeUnit.MILLISECONDS);
        }

        public static boolean b(Runnable runnable, long j) {
            Object[] objArr = {runnable, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a26d365b9a85cb3e232c66faa440a119", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a26d365b9a85cb3e232c66faa440a119")).booleanValue();
            }
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            if (elapsedRealtime <= 0) {
                a(runnable);
                return true;
            }
            a(runnable, elapsedRealtime);
            return false;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.mmp.lib.executor.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0417a extends AbstractRunnableC0416a {
            public static ChangeQuickRedirect c;

            public C0417a(Runnable runnable, long j) {
                super(runnable, j);
                Object[] objArr = {runnable, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect = c;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7927b93d44e09a8d31ac4487fdc800", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7927b93d44e09a8d31ac4487fdc800");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = c;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a3df95ed5003cc55df79e207a15e7fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a3df95ed5003cc55df79e207a15e7fb");
                } else if (this.b == 0) {
                    c.a(this.a);
                } else {
                    c.a(this.a, this.b);
                }
            }
        }
    }
}
