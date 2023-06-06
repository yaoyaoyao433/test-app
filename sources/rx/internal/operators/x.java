package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class x<T, R> implements d.b<R, T> {
    final rx.functions.g<? super T, ? extends R> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        a aVar = new a(jVar, this.a);
        jVar.add(aVar);
        return aVar;
    }

    public x(rx.functions.g<? super T, ? extends R> gVar) {
        this.a = gVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T, R> extends rx.j<T> {
        final rx.j<? super R> a;
        final rx.functions.g<? super T, ? extends R> b;
        boolean c;

        public a(rx.j<? super R> jVar, rx.functions.g<? super T, ? extends R> gVar) {
            this.a = jVar;
            this.b = gVar;
        }

        @Override // rx.e
        public final void onNext(T t) {
            try {
                this.a.onNext(this.b.call(t));
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
            this.a.setProducer(fVar);
        }
    }
}
