package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.h;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class k<T> implements h.a<T> {
    private final rx.d<T> a;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        final rx.i iVar = (rx.i) obj;
        rx.j<T> jVar = new rx.j<T>() { // from class: rx.internal.operators.k.1
            private boolean c = false;
            private boolean d = false;
            private T e = null;

            @Override // rx.j
            public final void onStart() {
                request(2L);
            }

            @Override // rx.e
            public final void onCompleted() {
                if (this.c) {
                    return;
                }
                if (this.d) {
                    iVar.a((rx.i) this.e);
                } else {
                    iVar.a((Throwable) new NoSuchElementException("Observable emitted no items"));
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                iVar.a(th);
                unsubscribe();
            }

            @Override // rx.e
            public final void onNext(T t) {
                if (this.d) {
                    this.c = true;
                    iVar.a((Throwable) new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                }
                this.d = true;
                this.e = t;
            }
        };
        iVar.d.a(jVar);
        this.a.a((rx.j) jVar);
    }

    public k(rx.d<T> dVar) {
        this.a = dVar;
    }
}
