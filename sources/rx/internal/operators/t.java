package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class t<T> implements d.b<T, T> {
    final rx.functions.b<Long> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        final a aVar = new a(jVar);
        jVar.setProducer(new rx.f() { // from class: rx.internal.operators.t.1
            @Override // rx.f
            public final void a(long j) {
                t.this.a.call(Long.valueOf(j));
                aVar.a(j);
            }
        });
        jVar.add(aVar);
        return aVar;
    }

    public t(rx.functions.b<Long> bVar) {
        this.a = bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T> extends rx.j<T> {
        private final rx.j<? super T> a;

        a(rx.j<? super T> jVar) {
            this.a = jVar;
            request(0L);
        }

        void a(long j) {
            request(j);
        }

        @Override // rx.e
        public final void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.e
        public final void onNext(T t) {
            this.a.onNext(t);
        }
    }
}
