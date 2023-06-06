package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
import rx.internal.util.m;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b extends rx.g implements i {
    static final int b;
    static final c c;
    static final C1556b d;
    final ThreadFactory e;
    public final AtomicReference<C1556b> f = new AtomicReference<>(d);

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        b = intValue;
        c cVar = new c(rx.internal.util.k.a);
        c = cVar;
        cVar.unsubscribe();
        d = new C1556b(null, 0);
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.internal.schedulers.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C1556b {
        final int a;
        final c[] b;
        long c;

        C1556b(ThreadFactory threadFactory, int i) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public final c a() {
            int i = this.a;
            if (i == 0) {
                return b.c;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public final void b() {
            for (c cVar : this.b) {
                cVar.unsubscribe();
            }
        }
    }

    public b(ThreadFactory threadFactory) {
        this.e = threadFactory;
        C1556b c1556b = new C1556b(this.e, b);
        if (this.f.compareAndSet(d, c1556b)) {
            return;
        }
        c1556b.b();
    }

    @Override // rx.g
    public final g.a a() {
        return new a(this.f.get().a());
    }

    @Override // rx.internal.schedulers.i
    public final void c() {
        C1556b c1556b;
        do {
            c1556b = this.f.get();
            if (c1556b == d) {
                return;
            }
        } while (!this.f.compareAndSet(c1556b, d));
        c1556b.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class a extends g.a {
        private final m a = new m();
        private final rx.subscriptions.b b = new rx.subscriptions.b();
        private final m c = new m(this.a, this.b);
        private final c d;

        a(c cVar) {
            this.d = cVar;
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.c.unsubscribe();
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // rx.g.a
        public final rx.k a(final rx.functions.a aVar) {
            if (isUnsubscribed()) {
                return rx.subscriptions.e.b();
            }
            c cVar = this.d;
            rx.functions.a aVar2 = new rx.functions.a() { // from class: rx.internal.schedulers.b.a.1
                @Override // rx.functions.a
                public final void a() {
                    if (a.this.isUnsubscribed()) {
                        return;
                    }
                    aVar.a();
                }
            };
            m mVar = this.a;
            h hVar = new h(rx.plugins.f.a(aVar2), mVar);
            mVar.a(hVar);
            hVar.a(cVar.b.submit(hVar));
            return hVar;
        }

        @Override // rx.g.a
        public final rx.k a(final rx.functions.a aVar, long j, TimeUnit timeUnit) {
            Future<?> schedule;
            if (isUnsubscribed()) {
                return rx.subscriptions.e.b();
            }
            c cVar = this.d;
            rx.functions.a aVar2 = new rx.functions.a() { // from class: rx.internal.schedulers.b.a.2
                @Override // rx.functions.a
                public final void a() {
                    if (a.this.isUnsubscribed()) {
                        return;
                    }
                    aVar.a();
                }
            };
            rx.subscriptions.b bVar = this.b;
            h hVar = new h(rx.plugins.f.a(aVar2), bVar);
            bVar.a(hVar);
            if (j <= 0) {
                schedule = cVar.b.submit(hVar);
            } else {
                schedule = cVar.b.schedule(hVar, j, timeUnit);
            }
            hVar.a(schedule);
            return hVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c extends g {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
