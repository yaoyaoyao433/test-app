package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class q<T, R> implements d.b<R, T> {
    final Class<R> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        a aVar = new a(jVar, this.a);
        jVar.add(aVar);
        return aVar;
    }

    public q(Class<R> cls) {
        this.a = cls;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T, R> extends rx.j<T> {
        final rx.j<? super R> a;
        final Class<R> b;
        boolean c;

        public a(rx.j<? super R> jVar, Class<R> cls) {
            this.a = jVar;
            this.b = cls;
        }

        @Override // rx.e
        public final void onNext(T t) {
            try {
                this.a.onNext(this.b.cast(t));
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
