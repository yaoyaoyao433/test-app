package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ai<T> implements d.b<T, T> {
    final rx.functions.h<? super T, ? super Integer, Boolean> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        rx.j<T> jVar2 = new rx.j<T>(jVar, false, jVar) { // from class: rx.internal.operators.ai.2
            final /* synthetic */ rx.j a;
            private int c = 0;
            private boolean d = false;

            {
                this.a = jVar;
            }

            @Override // rx.e
            public final void onNext(T t) {
                try {
                    rx.functions.h<? super T, ? super Integer, Boolean> hVar = ai.this.a;
                    int i = this.c;
                    this.c = i + 1;
                    if (hVar.a(t, Integer.valueOf(i)).booleanValue()) {
                        this.a.onNext(t);
                        return;
                    }
                    this.d = true;
                    this.a.onCompleted();
                    unsubscribe();
                } catch (Throwable th) {
                    this.d = true;
                    rx.exceptions.b.a(th, this.a, t);
                    unsubscribe();
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                if (this.d) {
                    return;
                }
                this.a.onCompleted();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                if (this.d) {
                    return;
                }
                this.a.onError(th);
            }
        };
        jVar.add(jVar2);
        return jVar2;
    }

    public ai(final rx.functions.g<? super T, Boolean> gVar) {
        this(new rx.functions.h<T, Integer, Boolean>() { // from class: rx.internal.operators.ai.1
            @Override // rx.functions.h
            public final /* synthetic */ Boolean a(Object obj, Integer num) {
                return (Boolean) rx.functions.g.this.call(obj);
            }
        });
    }

    private ai(rx.functions.h<? super T, ? super Integer, Boolean> hVar) {
        this.a = hVar;
    }
}
