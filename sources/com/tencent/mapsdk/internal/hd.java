package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.model.dao.region.RegionDefDao;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hd {
    private static final a a = new a("sw");
    private static final a b = new a("lw");
    private static final a c = new a("mlw");
    private static final a d = new a("qw");
    private static final a e = new a("mqw");
    private static ScheduledThreadPoolExecutor f;
    private static ThreadPoolExecutor g;
    private static ThreadPoolExecutor h;
    private static ThreadPoolExecutor i;
    private static ThreadPoolExecutor j;

    public static synchronized ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (hd.class) {
            if (a(f)) {
                f = new ScheduledThreadPoolExecutor(2, a.a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            scheduledThreadPoolExecutor = f;
        }
        return scheduledThreadPoolExecutor;
    }

    public static synchronized ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (hd.class) {
            if (a(g)) {
                g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), d.a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = g;
        }
        return threadPoolExecutor;
    }

    public static synchronized ThreadPoolExecutor c() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (hd.class) {
            if (a(h)) {
                int max = Math.max(4, Runtime.getRuntime().availableProcessors());
                h = new ThreadPoolExecutor(max / 2, max, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = h;
        }
        return threadPoolExecutor;
    }

    public static synchronized ThreadPoolExecutor d() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (hd.class) {
            if (a(i)) {
                i = new ThreadPoolExecutor(0, 1, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b.a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = i;
        }
        return threadPoolExecutor;
    }

    private static synchronized ThreadPoolExecutor e() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (hd.class) {
            if (a(j)) {
                j = new ThreadPoolExecutor(0, Math.max(4, Runtime.getRuntime().availableProcessors()) / 2, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), c.a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = j;
        }
        return threadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(java.util.concurrent.ExecutorService r5) {
        /*
            java.lang.Class<com.tencent.mapsdk.internal.hd> r0 = com.tencent.mapsdk.internal.hd.class
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L17
            boolean r3 = r5.isShutdown()     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L17
            boolean r3 = r5.isTerminated()     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L17
            r3 = 1
            goto L18
        L15:
            r5 = move-exception
            goto L2f
        L17:
            r3 = 0
        L18:
            boolean r4 = r5 instanceof java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L29
            if (r3 == 0) goto L28
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L15
            boolean r5 = r5.isTerminating()     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 != 0) goto L2d
            monitor-exit(r0)
            return r1
        L2d:
            monitor-exit(r0)
            return r2
        L2f:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.hd.a(java.util.concurrent.ExecutorService):boolean");
    }

    private static String f() {
        Thread currentThread = Thread.currentThread();
        return currentThread + ";" + currentThread.getState() + ";interrupted=" + Thread.interrupted() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + currentThread.isInterrupted();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements ThreadFactory {
        private String a;
        private final AtomicInteger b = new AtomicInteger(0);

        public a(String str) {
            this.a = str;
            if (TextUtils.isEmpty(str)) {
                this.a = RegionDefDao.TABLENAME;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "tms-" + this.a + CommonConstant.Symbol.MINUS + this.b.incrementAndGet());
            String concat = "创建线程：".concat(String.valueOf(thread));
            if (kj.a != null) {
                kj.a.c(concat);
            } else {
                System.out.println(concat);
            }
            return thread;
        }

        private int b() {
            return this.b.get();
        }

        final a a() {
            this.b.set(0);
            return this;
        }
    }
}
