package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c extends rx.g {
    final Executor b;

    public c(Executor executor) {
        this.b = executor;
    }

    @Override // rx.g
    public final g.a a() {
        return new a(this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a extends g.a implements Runnable {
        final Executor a;
        final ConcurrentLinkedQueue<h> c = new ConcurrentLinkedQueue<>();
        final AtomicInteger d = new AtomicInteger();
        final rx.subscriptions.b b = new rx.subscriptions.b();
        final ScheduledExecutorService e = d.a();

        public a(Executor executor) {
            this.a = executor;
        }

        @Override // rx.g.a
        public final rx.k a(rx.functions.a aVar) {
            if (isUnsubscribed()) {
                return rx.subscriptions.e.b();
            }
            h hVar = new h(aVar, this.b);
            this.b.a(hVar);
            this.c.offer(hVar);
            if (this.d.getAndIncrement() == 0) {
                try {
                    com.sankuai.waimai.launcher.util.aop.b.a(this.a, this);
                } catch (RejectedExecutionException e) {
                    this.b.b(hVar);
                    this.d.decrementAndGet();
                    rx.plugins.e.a().b();
                    throw e;
                }
            }
            return hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.b.isUnsubscribed()) {
                h poll = this.c.poll();
                if (poll == null) {
                    return;
                }
                if (!poll.isUnsubscribed()) {
                    if (!this.b.isUnsubscribed()) {
                        poll.run();
                    } else {
                        this.c.clear();
                        return;
                    }
                }
                if (this.d.decrementAndGet() == 0) {
                    return;
                }
            }
            this.c.clear();
        }

        @Override // rx.g.a
        public final rx.k a(final rx.functions.a aVar, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return a(aVar);
            }
            if (isUnsubscribed()) {
                return rx.subscriptions.e.b();
            }
            rx.subscriptions.c cVar = new rx.subscriptions.c();
            final rx.subscriptions.c cVar2 = new rx.subscriptions.c();
            cVar2.a(cVar);
            this.b.a(cVar2);
            final rx.k a = rx.subscriptions.e.a(new rx.functions.a() { // from class: rx.internal.schedulers.c.a.1
                @Override // rx.functions.a
                public final void a() {
                    a.this.b.b(cVar2);
                }
            });
            h hVar = new h(new rx.functions.a() { // from class: rx.internal.schedulers.c.a.2
                @Override // rx.functions.a
                public final void a() {
                    if (cVar2.isUnsubscribed()) {
                        return;
                    }
                    rx.k a2 = a.this.a(aVar);
                    cVar2.a(a2);
                    if (a2.getClass() == h.class) {
                        ((h) a2).a.a(a);
                    }
                }
            });
            cVar.a(hVar);
            try {
                hVar.a(this.e.schedule(hVar, j, timeUnit));
                return a;
            } catch (RejectedExecutionException e) {
                rx.plugins.e.a().b();
                throw e;
            }
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.b.unsubscribe();
            this.c.clear();
        }
    }
}
