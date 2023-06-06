package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ad<T> implements d.b<T, T> {
    final rx.functions.g<Throwable, ? extends rx.d<? extends T>> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        final rx.internal.producers.a aVar = new rx.internal.producers.a();
        final rx.subscriptions.d dVar = new rx.subscriptions.d();
        rx.j<T> jVar2 = new rx.j<T>() { // from class: rx.internal.operators.ad.2
            long a;
            private boolean f;

            @Override // rx.e
            public final void onCompleted() {
                if (this.f) {
                    return;
                }
                this.f = true;
                jVar.onCompleted();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                if (this.f) {
                    rx.exceptions.b.b(th);
                    rx.plugins.e.a().b();
                    return;
                }
                this.f = true;
                try {
                    unsubscribe();
                    rx.j<T> jVar3 = new rx.j<T>() { // from class: rx.internal.operators.ad.2.1
                        @Override // rx.e
                        public final void onNext(T t) {
                            jVar.onNext(t);
                        }

                        @Override // rx.e
                        public final void onError(Throwable th2) {
                            jVar.onError(th2);
                        }

                        @Override // rx.e
                        public final void onCompleted() {
                            jVar.onCompleted();
                        }

                        @Override // rx.j
                        public final void setProducer(rx.f fVar) {
                            aVar.a(fVar);
                        }
                    };
                    dVar.a(jVar3);
                    long j = this.a;
                    if (j != 0) {
                        aVar.b(j);
                    }
                    ad.this.a.call(th).a((rx.j<? super Object>) jVar3);
                } catch (Throwable th2) {
                    rx.exceptions.b.a(th2, jVar);
                }
            }

            @Override // rx.e
            public final void onNext(T t) {
                if (this.f) {
                    return;
                }
                this.a++;
                jVar.onNext(t);
            }

            @Override // rx.j
            public final void setProducer(rx.f fVar) {
                aVar.a(fVar);
            }
        };
        dVar.a(jVar2);
        jVar.add(dVar);
        jVar.setProducer(aVar);
        return jVar2;
    }

    public static <T> ad<T> a(final rx.functions.g<Throwable, ? extends T> gVar) {
        return new ad<>(new rx.functions.g<Throwable, rx.d<? extends T>>() { // from class: rx.internal.operators.ad.1
            @Override // rx.functions.g
            public final /* synthetic */ Object call(Throwable th) {
                return rx.d.a(rx.functions.g.this.call(th));
            }
        });
    }

    public ad(rx.functions.g<Throwable, ? extends rx.d<? extends T>> gVar) {
        this.a = gVar;
    }
}
