package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d implements i {
    public static final d a;
    private static final rx.internal.util.k b = new rx.internal.util.k("RxScheduledExecutorPool-");
    private static final ScheduledExecutorService[] c = new ScheduledExecutorService[0];
    private static final ScheduledExecutorService d;
    private static int f;
    private final AtomicReference<ScheduledExecutorService[]> e = new AtomicReference<>(c);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        a = new d();
    }

    private d() {
        b();
    }

    private void b() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = Executors.newScheduledThreadPool(1, b);
        }
        if (this.e.compareAndSet(c, scheduledExecutorServiceArr)) {
            int length = scheduledExecutorServiceArr.length;
            while (i < length) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!g.b(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    g.a((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        int length2 = scheduledExecutorServiceArr.length;
        while (i < length2) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }

    @Override // rx.internal.schedulers.i
    public final void c() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        do {
            scheduledExecutorServiceArr = this.e.get();
            if (scheduledExecutorServiceArr == c) {
                return;
            }
        } while (!this.e.compareAndSet(scheduledExecutorServiceArr, c));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            g.a(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    public static ScheduledExecutorService a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = a.e.get();
        if (scheduledExecutorServiceArr == c) {
            return d;
        }
        int i = f + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f = i;
        return scheduledExecutorServiceArr[i];
    }
}
