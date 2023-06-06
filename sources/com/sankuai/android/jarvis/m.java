package com.sankuai.android.jarvis;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m extends ThreadPoolExecutor {
    public static ChangeQuickRedirect a;
    private final String b;
    private final AtomicInteger c;
    private final b d;
    private BlockingQueue<Runnable> e;
    private final n f;
    private volatile long g;
    private final AtomicInteger h;
    private final AtomicInteger i;
    private volatile int j;
    private final Object k;
    private final boolean l;
    private volatile ScheduledFuture<?> m;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    public m(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, n nVar) {
        super(i, i2, j, timeUnit, new SynchronousQueue());
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ed718c19934591371c15bbe7e53b48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ed718c19934591371c15bbe7e53b48");
            return;
        }
        this.h = new AtomicInteger();
        this.i = new AtomicInteger();
        this.k = new Object();
        this.m = null;
        this.b = str;
        this.c = new AtomicInteger(0);
        this.d = new a();
        Object[] objArr2 = {blockingQueue};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b38ddcb1cd5fc3c41a0f2f0203f748c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b38ddcb1cd5fc3c41a0f2f0203f748c9");
        } else if (blockingQueue instanceof PriorityBlockingQueue) {
            this.e = blockingQueue;
        } else {
            this.e = new LinkedBlockingQueue();
        }
        this.f = nVar;
        this.l = TextUtils.equals("parallel", str);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z = false;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4245c4d33fcdcfaa1d7e494146a60e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4245c4d33fcdcfaa1d7e494146a60e7a");
        } else if (isShutdown()) {
        } else {
            if (this.j <= 0) {
                if (this.g == 0) {
                    this.g = SystemClock.elapsedRealtime();
                }
                if (SystemClock.elapsedRealtime() - this.g <= MetricsAnrManager.ANR_THRESHOLD) {
                    this.h.incrementAndGet();
                } else {
                    if (this.h.get() > 300) {
                        this.j++;
                        if (f.a().c()) {
                            g.a(this.b, this.h.get());
                        }
                        g.b(this.b, this.h.get());
                    }
                    this.h.set(0);
                    this.g = SystemClock.elapsedRealtime();
                }
            }
            synchronized (this.k) {
                if (this.c.get() >= getMaximumPoolSize() || !this.e.isEmpty()) {
                    this.e.offer(runnable);
                    z = true;
                }
            }
            if (z) {
                if (this.i.get() < 2) {
                    if (this.i.get() == 0 && this.e.size() >= 100) {
                        this.i.incrementAndGet();
                        if (f.a().c()) {
                            g.c(this.b, this.e.size());
                        }
                        g.d(this.b, this.e.size());
                    } else if (this.i.get() == 1 && this.e.size() >= 200) {
                        this.i.incrementAndGet();
                        if (f.a().c()) {
                            g.c(this.b, this.e.size());
                        }
                        g.d(this.b, this.e.size());
                    }
                }
                if (this.l && this.m == null) {
                    synchronized (this.k) {
                        if (this.m == null) {
                            this.m = g.a(60);
                        }
                    }
                    return;
                }
                return;
            }
            a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347c9ba6b24221e0c20cd79eefcfd60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347c9ba6b24221e0c20cd79eefcfd60d");
            return;
        }
        this.c.incrementAndGet();
        f.a().e().execute(new h(runnable, this.b, this.d, this.f));
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300fb0c20204ebadb8b19e3b4694b048", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300fb0c20204ebadb8b19e3b4694b048");
        }
        super.shutdownNow();
        ArrayList arrayList = new ArrayList();
        this.e.drainTo(arrayList);
        return arrayList;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f95d426b264f8e0deff2cf2470d2b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f95d426b264f8e0deff2cf2470d2b23");
        } else {
            super.shutdown();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final int getPoolSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f6d0825856a55f9760ffec7ad65bff7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f6d0825856a55f9760ffec7ad65bff7")).intValue() : this.c.get();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final int getActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1830e1f2dc9bd0fb050774b5320d1b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1830e1f2dc9bd0fb050774b5320d1b4")).intValue() : this.c.get();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements b {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {m.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb836c0869b38f615dbe9080c8817bb3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb836c0869b38f615dbe9080c8817bb3");
            }
        }

        @Override // com.sankuai.android.jarvis.m.b
        public final void a() {
            Runnable runnable;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8272b28d00cc1ac7e05221a5d9ebd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8272b28d00cc1ac7e05221a5d9ebd6");
                return;
            }
            m.this.c.decrementAndGet();
            while (m.this.c.get() < m.this.getMaximumPoolSize()) {
                synchronized (m.this.k) {
                    Object poll = m.this.e.poll();
                    if (poll != null && !(poll instanceof Runnable)) {
                        if (poll instanceof String) {
                            System.out.println(poll);
                        } else if (poll instanceof char[]) {
                            StringBuilder sb = new StringBuilder();
                            for (char c : (char[]) poll) {
                                sb.append(c);
                            }
                            System.out.println(sb);
                        }
                        throw new ClassCastException();
                    }
                    runnable = poll != null ? (Runnable) poll : null;
                    if (m.this.l && poll != null && m.this.m != null) {
                        m.this.m.cancel(true);
                        m.this.m = null;
                    }
                }
                if (runnable == null) {
                    break;
                }
                m.this.a(runnable);
            }
            if (m.this.l && m.this.m == null && !m.this.e.isEmpty()) {
                synchronized (m.this.k) {
                    if (m.this.m == null) {
                        m.this.m = g.a(60);
                    }
                }
            }
        }
    }
}
