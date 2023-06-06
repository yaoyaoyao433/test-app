package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends AbstractExecutorService {
    public static ChangeQuickRedirect a;
    private static final b o = new a();
    private static final RuntimePermission p = new RuntimePermission("modifyThread");
    final AtomicInteger b;
    final BlockingQueue<Runnable> c;
    protected final HashSet<d> d;
    volatile ThreadFactory e;
    volatile int f;
    volatile int g;
    private final ReentrantLock h;
    private final Condition i;
    private int j;
    private long k;
    private volatile b l;
    private volatile long m;
    private volatile boolean n;
    private c q;
    private int r;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements b {
        @Override // com.sankuai.android.jarvis.l.b
        public final void a(Runnable runnable, AbstractExecutorService abstractExecutorService) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(Runnable runnable, AbstractExecutorService abstractExecutorService);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        void a(int i, AbstractExecutorService abstractExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        return i & 536870911;
    }

    private static boolean a(int i, int i2) {
        return i < i2;
    }

    private static boolean b(int i) {
        return i < 0;
    }

    private static boolean b(int i, int i2) {
        return i >= i2;
    }

    private boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c661e8b579ed64a154410de42d776dc9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c661e8b579ed64a154410de42d776dc9")).booleanValue() : this.b.compareAndSet(i, i - 1);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e789a286493c45baac53bfd231f1a95b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e789a286493c45baac53bfd231f1a95b");
        } else {
            do {
            } while (!c(this.b.get()));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class d extends AbstractQueuedSynchronizer implements Runnable {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = 6138294804551838833L;
        public final Thread b;
        public Runnable c;
        public volatile long d;

        public d(Runnable runnable) {
            Object[] objArr = {l.this, runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741aedbe64685015ae2026a8dce6d499", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741aedbe64685015ae2026a8dce6d499");
                return;
            }
            setState(-1);
            this.c = runnable;
            this.b = l.this.e.newThread(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9507f33bf5fe8a04367fdf52e73769", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9507f33bf5fe8a04367fdf52e73769");
            } else {
                l.this.a(this);
            }
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean isHeldExclusively() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b9b7eb24bdcfbe9935202c0797779f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b9b7eb24bdcfbe9935202c0797779f")).booleanValue() : getState() != 0;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean tryAcquire(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3bae0a813319d9a4a3a3506459e37f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3bae0a813319d9a4a3a3506459e37f")).booleanValue();
            }
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public final boolean tryRelease(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa94147eb8e5930a631d29038655d68", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa94147eb8e5930a631d29038655d68")).booleanValue();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f47f1d20cb4a6e1c0bac3883586e3faf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f47f1d20cb4a6e1c0bac3883586e3faf")).booleanValue() : tryAcquire(1);
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c6a6cd5e7cc46cb52dba950144fb71", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c6a6cd5e7cc46cb52dba950144fb71");
            } else {
                release(1);
            }
        }

        public final void c() {
            Thread thread;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe5981aeb30026c99e81cd58599790d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe5981aeb30026c99e81cd58599790d");
            } else if (getState() < 0 || (thread = this.b) == null || thread.isInterrupted()) {
            } else {
                try {
                    thread.interrupt();
                } catch (SecurityException unused) {
                }
            }
        }
    }

    private void d(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896570d6d97710bc67684888fb7ea010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896570d6d97710bc67684888fb7ea010");
            return;
        }
        do {
            i2 = this.b.get();
            if (b(i2, i)) {
                return;
            }
        } while (!this.b.compareAndSet(i2, (536870911 & i2) | i));
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4204adbbe3ad344192ee7f40016de59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4204adbbe3ad344192ee7f40016de59d");
            return;
        }
        while (true) {
            int i = this.b.get();
            if (b(i) || b(i, 1073741824)) {
                return;
            }
            if (((-536870912) & i) == 0 && !this.c.isEmpty()) {
                return;
            }
            if ((536870911 & i) != 0) {
                a(true);
                return;
            }
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                if (this.b.compareAndSet(i, 1073741824)) {
                    this.b.set(1610612736);
                    this.i.signalAll();
                    return;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9368550477e1f6261c48afe4d1dd5433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9368550477e1f6261c48afe4d1dd5433");
            return;
        }
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(p);
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                Iterator<d> it = this.d.iterator();
                while (it.hasNext()) {
                    securityManager.checkAccess(it.next().b);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3446c03fac49218d5fa72e619fb66ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3446c03fac49218d5fa72e619fb66ad7");
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            Iterator<d> it = this.d.iterator();
            while (it.hasNext()) {
                d next = it.next();
                Thread thread = next.b;
                if (!thread.isInterrupted() && next.a()) {
                    try {
                        thread.interrupt();
                    } catch (SecurityException unused) {
                    } catch (Throwable th) {
                        next.b();
                        throw th;
                    }
                    next.b();
                    continue;
                }
                if (z) {
                    break;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63131d1245f5723ac0c43cee2fd97db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63131d1245f5723ac0c43cee2fd97db3");
        } else {
            this.l.a(runnable, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fd, code lost:
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #3 {all -> 0x00f5, blocks: (B:32:0x00a4, B:34:0x00a8, B:47:0x00d7, B:49:0x00dc, B:35:0x00ad, B:41:0x00bf, B:43:0x00c5, B:45:0x00d4, B:51:0x00e2, B:52:0x00e7), top: B:69:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Runnable r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.jarvis.l.a(java.lang.Runnable, boolean):boolean");
    }

    private void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7351c95e5111d1b264753bf54c8035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7351c95e5111d1b264753bf54c8035");
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        if (dVar != null) {
            try {
                this.d.remove(dVar);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        c();
        d();
        reentrantLock.unlock();
    }

    private void a(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc7fda042aaf410c7829547cfee2efce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc7fda042aaf410c7829547cfee2efce");
            return;
        }
        if (z) {
            c();
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.k += dVar.d;
            this.d.remove(dVar);
            reentrantLock.unlock();
            d();
            int i = this.b.get();
            if (a(i, 536870912)) {
                if (!z) {
                    int i2 = this.n ? 0 : this.f;
                    if (i2 == 0 && !this.c.isEmpty()) {
                        i2 = 1;
                    }
                    if ((i & 536870911) >= i2) {
                        return;
                    }
                }
                a((Runnable) null, false);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        r2 = r11.c.poll(r11.m, java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Runnable f() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.android.jarvis.l.a
            java.lang.String r10 = "29ec81575c8b1ae5f315d4a557fd4e9d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
        L1b:
            r1 = 1
        L1c:
            r2 = 0
        L1d:
            java.util.concurrent.atomic.AtomicInteger r3 = r11.b
            int r3 = r3.get()
            r4 = -536870912(0xffffffffe0000000, float:-3.6893488E19)
            r4 = r4 & r3
            r5 = 0
            if (r4 < 0) goto L39
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 >= r6) goto L35
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r4 = r11.c
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L39
        L35:
            r11.c()
            return r5
        L39:
            r4 = 536870911(0x1fffffff, float:1.0842021E-19)
            r4 = r4 & r3
            boolean r6 = r11.n
            if (r6 != 0) goto L48
            int r6 = r11.f
            if (r4 <= r6) goto L46
            goto L48
        L46:
            r6 = 0
            goto L49
        L48:
            r6 = 1
        L49:
            int r7 = r11.g
            if (r4 > r7) goto L51
            if (r6 == 0) goto L5c
            if (r2 == 0) goto L5c
        L51:
            if (r4 > r1) goto L78
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r4 = r11.c
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5c
            goto L78
        L5c:
            if (r6 == 0) goto L6b
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r11.c     // Catch: java.lang.InterruptedException -> L1c
            long r3 = r11.m     // Catch: java.lang.InterruptedException -> L1c
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L1c
            java.lang.Object r2 = r2.poll(r3, r5)     // Catch: java.lang.InterruptedException -> L1c
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.InterruptedException -> L1c
            goto L73
        L6b:
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r2 = r11.c     // Catch: java.lang.InterruptedException -> L1c
            java.lang.Object r2 = r2.take()     // Catch: java.lang.InterruptedException -> L1c
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.InterruptedException -> L1c
        L73:
            if (r2 == 0) goto L76
            return r2
        L76:
            r2 = 1
            goto L1d
        L78:
            boolean r3 = r11.c(r3)
            if (r3 == 0) goto L1d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.jarvis.l.f():java.lang.Runnable");
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8f80940c6d039e51253f17b9d2571f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8f80940c6d039e51253f17b9d2571f");
            return;
        }
        Thread currentThread = Thread.currentThread();
        Runnable runnable = dVar.c;
        dVar.c = null;
        dVar.b();
        while (true) {
            if (runnable == null) {
                try {
                    runnable = f();
                    if (runnable == null) {
                        a(dVar, false);
                        return;
                    }
                } catch (Throwable th) {
                    a(dVar, true);
                    throw th;
                }
            }
            Runnable runnable2 = runnable;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "37b795d75d7f287d07a0aab85158afcf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "37b795d75d7f287d07a0aab85158afcf");
            } else {
                dVar.acquire(1);
            }
            if ((b(this.b.get(), 536870912) || (Thread.interrupted() && b(this.b.get(), 536870912))) && !currentThread.isInterrupted()) {
                currentThread.interrupt();
            }
            try {
                runnable2.run();
                dVar.d++;
                dVar.b();
                runnable = null;
            } catch (Error e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public l(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, int i3, ThreadFactory threadFactory, c cVar, b bVar) {
        this(i, i2, j, timeUnit, blockingQueue, threadFactory, bVar);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, Integer.valueOf(i3), threadFactory, cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a085a6775761cbdf5f105133b0296a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a085a6775761cbdf5f105133b0296a5");
            return;
        }
        this.r = i3;
        this.q = cVar;
    }

    private l(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, b bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57fe0a8761c6ea7f1b078bb5239c25c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57fe0a8761c6ea7f1b078bb5239c25c");
            return;
        }
        this.b = new AtomicInteger(-536870912);
        this.h = new ReentrantLock();
        this.d = new HashSet<>();
        this.i = this.h.newCondition();
        if (i < 0 || i2 <= 0 || i2 < i || j < 0) {
            throw new IllegalArgumentException();
        }
        if (blockingQueue == null || threadFactory == null || bVar == null) {
            throw new NullPointerException();
        }
        this.f = i;
        this.g = i2;
        this.c = blockingQueue;
        this.m = timeUnit.toNanos(j);
        this.e = threadFactory;
        this.l = bVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean remove;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ff81376468749e53450e30ab24c4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ff81376468749e53450e30ab24c4c2");
        } else if (runnable == null) {
            throw new NullPointerException();
        } else {
            int i = this.b.get();
            if ((i & 536870911) < this.f) {
                if (a(runnable, true)) {
                    return;
                }
                i = this.b.get();
            }
            int size = this.c.size();
            if (size > this.r && (i & 536870911) < this.g) {
                if (a(runnable, false)) {
                    return;
                }
                i = this.b.get();
            } else if (size > this.g && this.q != null) {
                this.q.a(size, this);
            }
            if (b(i) && this.c.offer(runnable)) {
                int i2 = this.b.get();
                if (!b(i2)) {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7499a2c92af341ad7af6b3d2c2c85f8", RobustBitConfig.DEFAULT_VALUE)) {
                        remove = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7499a2c92af341ad7af6b3d2c2c85f8")).booleanValue();
                    } else {
                        remove = this.c.remove(runnable);
                        d();
                    }
                    if (remove) {
                        a(runnable);
                        return;
                    }
                }
                if ((i2 & 536870911) == 0) {
                    a((Runnable) null, false);
                }
            } else if (a(runnable, false)) {
            } else {
                a(runnable);
            }
        }
    }

    public final String a(StringBuilder sb) {
        String sb2;
        Object[] objArr = {sb};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a654371fd06aedb837c6b41c6325f099", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a654371fd06aedb837c6b41c6325f099");
        }
        if (!this.d.isEmpty()) {
            sb.append("trace: \n");
            Iterator<d> it = this.d.iterator();
            while (it.hasNext()) {
                StackTraceElement[] stackTrace = it.next().b.getStackTrace();
                Object[] objArr2 = {stackTrace};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "90d40abdc3f5d5936dd708a38303c0e7", RobustBitConfig.DEFAULT_VALUE)) {
                    sb2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "90d40abdc3f5d5936dd708a38303c0e7");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb3.append("    at ");
                        sb3.append(stackTraceElement.toString());
                        sb3.append("\n");
                    }
                    sb2 = sb3.toString();
                }
                sb.append(sb2);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String b(StringBuilder sb) {
        Object[] objArr = {sb};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6809304155ced14631dafc06686fd664", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6809304155ced14631dafc06686fd664");
        }
        if (!this.d.isEmpty()) {
            sb.append("trace: \n");
            Iterator<d> it = this.d.iterator();
            while (it.hasNext()) {
                sb.append(it.next().b.getName());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859caa27aa78d6ee75a24f9dee45469f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859caa27aa78d6ee75a24f9dee45469f");
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            e();
            d(0);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab3fb52d9e22964e5be7bd354e03c7b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab3fb52d9e22964e5be7bd354e03c7b2");
            } else {
                a(false);
            }
            reentrantLock.unlock();
            d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        List<Runnable> list;
        Runnable[] runnableArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b1ee70bcbffb36b32bf3fafe6dd272", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b1ee70bcbffb36b32bf3fafe6dd272");
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            e();
            d(536870912);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "609e6363c02e24af1fc2be08cd8b98e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "609e6363c02e24af1fc2be08cd8b98e2");
            } else {
                ReentrantLock reentrantLock2 = this.h;
                reentrantLock2.lock();
                Iterator<d> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                reentrantLock2.unlock();
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "339c27e6e7c02043c05107c6d74e9fd5", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "339c27e6e7c02043c05107c6d74e9fd5");
            } else {
                BlockingQueue<Runnable> blockingQueue = this.c;
                ArrayList arrayList = new ArrayList();
                blockingQueue.drainTo(arrayList);
                if (!blockingQueue.isEmpty()) {
                    for (Runnable runnable : (Runnable[]) blockingQueue.toArray(new Runnable[0])) {
                        if (blockingQueue.remove(runnable)) {
                            arrayList.add(runnable);
                        }
                    }
                }
                list = arrayList;
            }
            reentrantLock.unlock();
            d();
            return list;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78fe19c7c423db249d9d13553f12968", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78fe19c7c423db249d9d13553f12968")).booleanValue() : !b(this.b.get());
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81731e3caa080ce0e3491d959f63771", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81731e3caa080ce0e3491d959f63771")).booleanValue() : b(this.b.get(), 1610612736);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        Object[] objArr = {new Long(j), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ae8c588cfa444ed85717ba4c6098bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ae8c588cfa444ed85717ba4c6098bb")).booleanValue();
        }
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        while (!b(this.b.get(), 1610612736)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.i.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        return true;
    }

    public final void finalize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2660adc5ee15c169b81cfa82edc6ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2660adc5ee15c169b81cfa82edc6ad");
        } else {
            shutdown();
        }
    }

    public final int a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8b3c86e82f694add61a81843d4b676", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8b3c86e82f694add61a81843d4b676")).intValue();
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (!b(this.b.get(), 1073741824)) {
                i = this.d.size();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c62dfa27a428927b57fde71b704b597", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c62dfa27a428927b57fde71b704b597")).longValue();
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            long j = this.k;
            Iterator<d> it = this.d.iterator();
            while (it.hasNext()) {
                j += it.next().d;
            }
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        String str;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d82710e56ebca4c3d500e68f3067ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d82710e56ebca4c3d500e68f3067ad");
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            long j = this.k;
            int size = this.d.size();
            Iterator<d> it = this.d.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                d next = it.next();
                long j2 = j + next.d;
                Object[] objArr2 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect2, false, "3f870fc0c93eb94b3a315775bb892f4a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect2, false, "3f870fc0c93eb94b3a315775bb892f4a")).booleanValue() : next.isHeldExclusively()) {
                    i2++;
                }
                j = j2;
                i = 0;
            }
            reentrantLock.unlock();
            int i3 = this.b.get();
            if (a(i3, 0)) {
                str = "Running";
            } else {
                str = b(i3, 1610612736) ? "Terminated" : "Shutting down";
            }
            return super.toString() + "[" + str + ", pool size = " + size + ", active threads = " + i2 + ", queued tasks = " + this.c.size() + ", completed tasks = " + j + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
