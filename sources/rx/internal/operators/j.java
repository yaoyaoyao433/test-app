package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class j<T> implements d.a<T> {
    static final rx.functions.g<rx.d<? extends rx.c<?>>, rx.d<?>> a = new rx.functions.g<rx.d<? extends rx.c<?>>, rx.d<?>>() { // from class: rx.internal.operators.j.1
        @Override // rx.functions.g
        public final /* synthetic */ rx.d<?> call(rx.d<? extends rx.c<?>> dVar) {
            return dVar.d(new rx.functions.g<rx.c<?>, rx.c<?>>() { // from class: rx.internal.operators.j.1.1
                @Override // rx.functions.g
                public final /* synthetic */ rx.c<?> call(rx.c<?> cVar) {
                    return rx.c.a((Object) null);
                }
            });
        }
    };
    final rx.d<T> b;
    final boolean c = true;
    final boolean d = false;
    private final rx.functions.g<? super rx.d<? extends rx.c<?>>, ? extends rx.d<?>> e;
    private final rx.g f;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicLong atomicLong = new AtomicLong();
        final g.a a2 = this.f.a();
        jVar.add(a2);
        final rx.subscriptions.d dVar = new rx.subscriptions.d();
        jVar.add(dVar);
        final rx.subjects.a g = rx.subjects.a.g();
        final rx.e a3 = rx.observers.a.a();
        rx.d.a(new rx.j<T>() { // from class: rx.observers.e.1
            @Override // rx.e
            public final void onCompleted() {
                a3.onCompleted();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                a3.onError(th);
            }

            @Override // rx.e
            public final void onNext(T t) {
                a3.onNext(t);
            }
        }, g);
        final rx.internal.producers.a aVar = new rx.internal.producers.a();
        final rx.functions.a aVar2 = new rx.functions.a() { // from class: rx.internal.operators.j.2
            @Override // rx.functions.a
            public final void a() {
                if (jVar.isUnsubscribed()) {
                    return;
                }
                rx.j<T> jVar2 = new rx.j<T>() { // from class: rx.internal.operators.j.2.1
                    boolean a;

                    @Override // rx.e
                    public final void onCompleted() {
                        if (this.a) {
                            return;
                        }
                        this.a = true;
                        unsubscribe();
                        g.onNext(rx.c.a());
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        if (this.a) {
                            return;
                        }
                        this.a = true;
                        unsubscribe();
                        g.onNext(rx.c.a(th));
                    }

                    @Override // rx.e
                    public final void onNext(T t) {
                        long j;
                        if (this.a) {
                            return;
                        }
                        jVar.onNext(t);
                        do {
                            j = atomicLong.get();
                            if (j == Long.MAX_VALUE) {
                                break;
                            }
                        } while (!atomicLong.compareAndSet(j, j - 1));
                        aVar.b(1L);
                    }

                    @Override // rx.j
                    public final void setProducer(rx.f fVar) {
                        aVar.a(fVar);
                    }
                };
                dVar.a(jVar2);
                j.this.b.a((rx.j) jVar2);
            }
        };
        final rx.d<?> call = this.e.call(g.a((d.b) new d.b<rx.c<?>, rx.c<?>>() { // from class: rx.internal.operators.j.3
            @Override // rx.functions.g
            public final /* synthetic */ Object call(Object obj2) {
                final rx.j jVar2 = (rx.j) obj2;
                return new rx.j<rx.c<?>>(jVar2) { // from class: rx.internal.operators.j.3.1
                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj3) {
                        rx.c cVar = (rx.c) obj3;
                        if ((cVar.a == c.a.OnCompleted) && j.this.c) {
                            jVar2.onCompleted();
                        } else if (cVar.b() && j.this.d) {
                            jVar2.onError(cVar.b);
                        } else {
                            jVar2.onNext(cVar);
                        }
                    }

                    @Override // rx.e
                    public final void onCompleted() {
                        jVar2.onCompleted();
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        jVar2.onError(th);
                    }

                    @Override // rx.j
                    public final void setProducer(rx.f fVar) {
                        fVar.a(Long.MAX_VALUE);
                    }
                };
            }
        }));
        a2.a(new rx.functions.a() { // from class: rx.internal.operators.j.4
            @Override // rx.functions.a
            public final void a() {
                call.a((rx.j) new rx.j<Object>(jVar) { // from class: rx.internal.operators.j.4.1
                    @Override // rx.e
                    public final void onCompleted() {
                        jVar.onCompleted();
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        jVar.onError(th);
                    }

                    @Override // rx.e
                    public final void onNext(Object obj2) {
                        if (jVar.isUnsubscribed()) {
                            return;
                        }
                        if (atomicLong.get() > 0) {
                            a2.a(aVar2);
                        } else {
                            atomicBoolean.compareAndSet(false, true);
                        }
                    }

                    @Override // rx.j
                    public final void setProducer(rx.f fVar) {
                        fVar.a(Long.MAX_VALUE);
                    }
                });
            }
        });
        jVar.setProducer(new rx.f() { // from class: rx.internal.operators.j.5
            @Override // rx.f
            public final void a(long j) {
                if (j > 0) {
                    a.a(atomicLong, j);
                    aVar.a(j);
                    if (atomicBoolean.compareAndSet(true, false)) {
                        a2.a(aVar2);
                    }
                }
            }
        });
    }

    public static <T> rx.d<T> a(rx.d<T> dVar, rx.functions.g<? super rx.d<? extends rx.c<?>>, ? extends rx.d<?>> gVar) {
        return rx.d.a((d.a) new j(dVar, gVar, true, false, rx.schedulers.a.b()));
    }

    private j(rx.d<T> dVar, rx.functions.g<? super rx.d<? extends rx.c<?>>, ? extends rx.d<?>> gVar, boolean z, boolean z2, rx.g gVar2) {
        this.b = dVar;
        this.e = gVar;
        this.f = gVar2;
    }
}
