package rx.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
import rx.internal.schedulers.h;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a extends rx.g implements i {
    static final c b;
    static final C1555a e;
    private static final TimeUnit f = TimeUnit.SECONDS;
    final ThreadFactory c;
    final AtomicReference<C1555a> d = new AtomicReference<>(e);

    static {
        c cVar = new c(rx.internal.util.k.a);
        b = cVar;
        cVar.unsubscribe();
        C1555a c1555a = new C1555a(null, 0L, null);
        e = c1555a;
        c1555a.b();
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.internal.schedulers.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C1555a {
        final long a;
        final ConcurrentLinkedQueue<c> b;
        final rx.subscriptions.b c;
        private final ThreadFactory d;
        private final ScheduledExecutorService e;
        private final Future<?> f;

        C1555a(final ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorService;
            this.d = threadFactory;
            this.a = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new rx.subscriptions.b();
            ScheduledFuture<?> scheduledFuture = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: rx.internal.schedulers.a.a.1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread newThread = threadFactory.newThread(runnable);
                        newThread.setName(newThread.getName() + " (Evictor)");
                        return newThread;
                    }
                });
                g.b(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: rx.internal.schedulers.a.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1555a c1555a = C1555a.this;
                        if (c1555a.b.isEmpty()) {
                            return;
                        }
                        long nanoTime = System.nanoTime();
                        Iterator<c> it = c1555a.b.iterator();
                        while (it.hasNext()) {
                            c next = it.next();
                            if (next.a > nanoTime) {
                                return;
                            }
                            if (c1555a.b.remove(next)) {
                                c1555a.c.b(next);
                            }
                        }
                    }
                }, this.a, this.a, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
            }
            this.e = scheduledExecutorService;
            this.f = scheduledFuture;
        }

        final c a() {
            if (this.c.isUnsubscribed()) {
                return a.b;
            }
            while (!this.b.isEmpty()) {
                c poll = this.b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.d);
            this.c.a(cVar);
            return cVar;
        }

        final void b() {
            try {
                if (this.f != null) {
                    this.f.cancel(true);
                }
                if (this.e != null) {
                    this.e.shutdownNow();
                }
            } finally {
                this.c.unsubscribe();
            }
        }
    }

    public a(ThreadFactory threadFactory) {
        this.c = threadFactory;
        C1555a c1555a = new C1555a(this.c, 60L, f);
        if (this.d.compareAndSet(e, c1555a)) {
            return;
        }
        c1555a.b();
    }

    @Override // rx.internal.schedulers.i
    public final void c() {
        C1555a c1555a;
        do {
            c1555a = this.d.get();
            if (c1555a == e) {
                return;
            }
        } while (!this.d.compareAndSet(c1555a, e));
        c1555a.b();
    }

    @Override // rx.g
    public final g.a a() {
        return new b(this.d.get());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class b extends g.a {
        private final C1555a c;
        private final c d;
        private final rx.subscriptions.b b = new rx.subscriptions.b();
        final AtomicBoolean a = new AtomicBoolean();

        b(C1555a c1555a) {
            this.c = c1555a;
            this.d = c1555a.a();
        }

        @Override // rx.k
        public final void unsubscribe() {
            if (this.a.compareAndSet(false, true)) {
                C1555a c1555a = this.c;
                c cVar = this.d;
                cVar.a = System.nanoTime() + c1555a.a;
                c1555a.b.offer(cVar);
            }
            this.b.unsubscribe();
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.g.a
        public final rx.k a(rx.functions.a aVar) {
            return a(aVar, 0L, null);
        }

        @Override // rx.g.a
        public final rx.k a(final rx.functions.a aVar, long j, TimeUnit timeUnit) {
            if (this.b.isUnsubscribed()) {
                return rx.subscriptions.e.b();
            }
            h b = this.d.b(new rx.functions.a() { // from class: rx.internal.schedulers.a.b.1
                @Override // rx.functions.a
                public final void a() {
                    if (b.this.isUnsubscribed()) {
                        return;
                    }
                    aVar.a();
                }
            }, j, timeUnit);
            this.b.a(b);
            b.a.a(new h.b(b, this.b));
            return b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c extends g {
        long a;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.a = 0L;
        }
    }
}
