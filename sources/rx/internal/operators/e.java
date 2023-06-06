package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e<T, R> implements d.a<R> {
    final rx.d<? extends T> a;
    final rx.functions.g<? super T, ? extends rx.d<? extends R>> b;
    final int c = 2;
    final int d = 0;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        rx.j jVar = (rx.j) obj;
        final c cVar = new c(this.d == 0 ? new rx.observers.d(jVar) : jVar, this.b, this.c, this.d);
        jVar.add(cVar);
        jVar.add(cVar.h);
        jVar.setProducer(new rx.f() { // from class: rx.internal.operators.e.1
            @Override // rx.f
            public final void a(long j) {
                c cVar2 = cVar;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    cVar2.d.a(j);
                } else if (i >= 0) {
                } else {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
            }
        });
        if (jVar.isUnsubscribed()) {
            return;
        }
        this.a.a((rx.j<? super Object>) cVar);
    }

    public e(rx.d<? extends T> dVar, rx.functions.g<? super T, ? extends rx.d<? extends R>> gVar, int i, int i2) {
        this.a = dVar;
        this.b = gVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c<T, R> extends rx.j<T> {
        final rx.j<? super R> a;
        final rx.functions.g<? super T, ? extends rx.d<? extends R>> b;
        final int c;
        final Queue<Object> e;
        final rx.subscriptions.d h;
        volatile boolean i;
        volatile boolean j;
        final rx.internal.producers.a d = new rx.internal.producers.a();
        final AtomicInteger f = new AtomicInteger();
        final AtomicReference<Throwable> g = new AtomicReference<>();

        public c(rx.j<? super R> jVar, rx.functions.g<? super T, ? extends rx.d<? extends R>> gVar, int i, int i2) {
            Queue<Object> cVar;
            this.a = jVar;
            this.b = gVar;
            this.c = i2;
            if (UnsafeAccess.isUnsafeAvailable()) {
                cVar = new SpscArrayQueue<>(i);
            } else {
                cVar = new rx.internal.util.atomic.c<>(i);
            }
            this.e = cVar;
            this.h = new rx.subscriptions.d();
            request(i);
        }

        @Override // rx.e
        public final void onNext(T t) {
            Queue<Object> queue = this.e;
            rx.internal.operators.c.a();
            if (!queue.offer(rx.internal.operators.c.a(t))) {
                unsubscribe();
                onError(new rx.exceptions.c());
                return;
            }
            a();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            if (rx.internal.util.d.a(this.g, th)) {
                this.i = true;
                if (this.c == 0) {
                    Throwable a = rx.internal.util.d.a(this.g);
                    if (!rx.internal.util.d.a(a)) {
                        this.a.onError(a);
                    }
                    this.h.unsubscribe();
                    return;
                }
                a();
                return;
            }
            rx.plugins.e.a().b();
        }

        @Override // rx.e
        public final void onCompleted() {
            this.i = true;
            a();
        }

        final void a(R r) {
            this.a.onNext(r);
        }

        final void a(long j) {
            if (j != 0) {
                this.d.b(j);
            }
            this.j = false;
            a();
        }

        final void a() {
            if (this.f.getAndIncrement() != 0) {
                return;
            }
            int i = this.c;
            while (!this.a.isUnsubscribed()) {
                if (!this.j) {
                    if (i == 1 && this.g.get() != null) {
                        Throwable a = rx.internal.util.d.a(this.g);
                        if (rx.internal.util.d.a(a)) {
                            return;
                        }
                        this.a.onError(a);
                        return;
                    }
                    boolean z = this.i;
                    Object poll = this.e.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable a2 = rx.internal.util.d.a(this.g);
                        if (a2 == null) {
                            this.a.onCompleted();
                            return;
                        } else if (rx.internal.util.d.a(a2)) {
                            return;
                        } else {
                            this.a.onError(a2);
                            return;
                        }
                    } else if (!z2) {
                        try {
                            rx.functions.g<? super T, ? extends rx.d<? extends R>> gVar = this.b;
                            rx.internal.operators.c.a();
                            rx.d<? extends R> call = gVar.call((Object) rx.internal.operators.c.c(poll));
                            if (call == null) {
                                a((Throwable) new NullPointerException("The source returned by the mapper was null"));
                                return;
                            } else if (call != rx.d.b()) {
                                if (call instanceof rx.internal.util.l) {
                                    this.j = true;
                                    this.d.a(new a(((rx.internal.util.l) call).e, this));
                                } else {
                                    b bVar = new b(this);
                                    this.h.a(bVar);
                                    if (bVar.isUnsubscribed()) {
                                        return;
                                    }
                                    this.j = true;
                                    call.a((rx.j<? super Object>) bVar);
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th) {
                            rx.exceptions.b.b(th);
                            a(th);
                            return;
                        }
                    }
                }
                if (this.f.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        private void a(Throwable th) {
            unsubscribe();
            if (rx.internal.util.d.a(this.g, th)) {
                Throwable a = rx.internal.util.d.a(this.g);
                if (rx.internal.util.d.a(a)) {
                    return;
                }
                this.a.onError(a);
                return;
            }
            rx.plugins.e.a().b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T, R> extends rx.j<R> {
        final c<T, R> a;
        long b;

        public b(c<T, R> cVar) {
            this.a = cVar;
        }

        @Override // rx.j
        public final void setProducer(rx.f fVar) {
            this.a.d.a(fVar);
        }

        @Override // rx.e
        public final void onNext(R r) {
            this.b++;
            this.a.a((c<T, R>) r);
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            c<T, R> cVar = this.a;
            long j = this.b;
            if (rx.internal.util.d.a(cVar.g, th)) {
                if (cVar.c == 0) {
                    Throwable a = rx.internal.util.d.a(cVar.g);
                    if (!rx.internal.util.d.a(a)) {
                        cVar.a.onError(a);
                    }
                    cVar.unsubscribe();
                    return;
                }
                if (j != 0) {
                    cVar.d.b(j);
                }
                cVar.j = false;
                cVar.a();
                return;
            }
            rx.plugins.e.a().b();
        }

        @Override // rx.e
        public final void onCompleted() {
            this.a.a(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a<T, R> implements rx.f {
        final R a;
        final c<T, R> b;
        boolean c;

        public a(R r, c<T, R> cVar) {
            this.a = r;
            this.b = cVar;
        }

        @Override // rx.f
        public final void a(long j) {
            if (this.c || j <= 0) {
                return;
            }
            this.c = true;
            c<T, R> cVar = this.b;
            cVar.a((c<T, R>) this.a);
            cVar.a(1L);
        }
    }
}
