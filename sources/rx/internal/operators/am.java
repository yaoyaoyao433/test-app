package rx.internal.operators;

import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class am<T> implements d.b<T, T> {
    final rx.g a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        final rx.j<T> jVar2 = new rx.j<T>() { // from class: rx.internal.operators.am.1
            @Override // rx.e
            public final void onCompleted() {
                jVar.onCompleted();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                jVar.onError(th);
            }

            @Override // rx.e
            public final void onNext(T t) {
                jVar.onNext(t);
            }
        };
        jVar.add(rx.subscriptions.e.a(new rx.functions.a() { // from class: rx.internal.operators.am.2
            @Override // rx.functions.a
            public final void a() {
                final g.a a = am.this.a.a();
                a.a(new rx.functions.a() { // from class: rx.internal.operators.am.2.1
                    @Override // rx.functions.a
                    public final void a() {
                        jVar2.unsubscribe();
                        a.unsubscribe();
                    }
                });
            }
        }));
        return jVar2;
    }

    public am(rx.g gVar) {
        this.a = gVar;
    }
}
