package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class o<T> implements d.b<Boolean, T> {
    final rx.functions.g<? super T, Boolean> a;
    final boolean b = true;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        final rx.internal.producers.b bVar = new rx.internal.producers.b(jVar);
        rx.j<T> jVar2 = new rx.j<T>() { // from class: rx.internal.operators.o.1
            boolean a;
            boolean b;

            @Override // rx.e
            public final void onNext(T t) {
                this.a = true;
                try {
                    if (!o.this.a.call(t).booleanValue() || this.b) {
                        return;
                    }
                    this.b = true;
                    bVar.a((rx.internal.producers.b) Boolean.valueOf(true ^ o.this.b));
                    unsubscribe();
                } catch (Throwable th) {
                    rx.exceptions.b.a(th, this, t);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                jVar.onError(th);
            }

            @Override // rx.e
            public final void onCompleted() {
                if (this.b) {
                    return;
                }
                this.b = true;
                if (this.a) {
                    bVar.a((rx.internal.producers.b) Boolean.FALSE);
                } else {
                    bVar.a((rx.internal.producers.b) Boolean.valueOf(o.this.b));
                }
            }
        };
        jVar.add(jVar2);
        jVar.setProducer(bVar);
        return jVar2;
    }

    public o(rx.functions.g<? super T, Boolean> gVar, boolean z) {
        this.a = gVar;
    }
}
