package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class w<T> implements d.b<T, T> {
    final rx.functions.g<? super T, Boolean> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        a aVar = new a(jVar, this.a);
        jVar.add(aVar);
        return aVar;
    }

    public w(rx.functions.g<? super T, Boolean> gVar) {
        this.a = gVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T> extends rx.j<T> {
        final rx.j<? super T> a;
        final rx.functions.g<? super T, Boolean> b;
        boolean c;

        public a(rx.j<? super T> jVar, rx.functions.g<? super T, Boolean> gVar) {
            this.a = jVar;
            this.b = gVar;
            request(0L);
        }

        @Override // rx.e
        public final void onNext(T t) {
            try {
                if (this.b.call(t).booleanValue()) {
                    this.a.onNext(t);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                rx.exceptions.b.b(th);
                unsubscribe();
                onError(rx.exceptions.g.a(th, t));
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            if (this.c) {
                rx.internal.util.i.a(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        @Override // rx.e
        public final void onCompleted() {
            if (this.c) {
                return;
            }
            this.a.onCompleted();
        }

        @Override // rx.j
        public final void setProducer(rx.f fVar) {
            super.setProducer(fVar);
            this.a.setProducer(fVar);
        }
    }
}
