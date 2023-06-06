package rx.internal.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.unsafe.MpmcArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class f<T> implements rx.internal.schedulers.i {
    Queue<T> a;
    final int b;
    final int c;
    private final long d;
    private final AtomicReference<Future<?>> e;

    protected abstract T b();

    public f() {
        this(0, 0, 67L);
    }

    private f(int i, int i2, long j) {
        this.b = 0;
        this.c = 0;
        this.d = 67L;
        this.e = new AtomicReference<>();
        a(0);
        d();
    }

    public final T a() {
        T poll = this.a.poll();
        return poll == null ? b() : poll;
    }

    @Override // rx.internal.schedulers.i
    public final void c() {
        Future<?> andSet = this.e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    private void d() {
        while (this.e.get() == null) {
            try {
                ScheduledFuture<?> scheduleAtFixedRate = rx.internal.schedulers.d.a().scheduleAtFixedRate(new Runnable() { // from class: rx.internal.util.f.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        int size = f.this.a.size();
                        int i = 0;
                        if (size < f.this.b) {
                            int i2 = f.this.c - size;
                            while (i < i2) {
                                f.this.a.add(f.this.b());
                                i++;
                            }
                        } else if (size > f.this.c) {
                            int i3 = size - f.this.c;
                            while (i < i3) {
                                f.this.a.poll();
                                i++;
                            }
                        }
                    }
                }, this.d, this.d, TimeUnit.SECONDS);
                if (this.e.compareAndSet(null, scheduleAtFixedRate)) {
                    return;
                }
                scheduleAtFixedRate.cancel(false);
            } catch (RejectedExecutionException e) {
                i.a(e);
                return;
            }
        }
    }

    private void a(int i) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.a = new MpmcArrayQueue(Math.max(this.c, 1024));
        } else {
            this.a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.a.add(b());
        }
    }
}
