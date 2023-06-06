package rx.internal.operators;

import java.util.Arrays;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class s<T> implements d.b<T, T> {
    final rx.e<? super T> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        return new rx.j<T>(jVar) { // from class: rx.internal.operators.s.1
            private boolean c = false;

            @Override // rx.e
            public final void onCompleted() {
                if (this.c) {
                    return;
                }
                try {
                    s.this.a.onCompleted();
                    this.c = true;
                    jVar.onCompleted();
                } catch (Throwable th) {
                    rx.exceptions.b.a(th, this);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                rx.exceptions.b.b(th);
                if (this.c) {
                    return;
                }
                this.c = true;
                try {
                    s.this.a.onError(th);
                    jVar.onError(th);
                } catch (Throwable th2) {
                    rx.exceptions.b.b(th2);
                    jVar.onError(new rx.exceptions.a(Arrays.asList(th, th2)));
                }
            }

            @Override // rx.e
            public final void onNext(T t) {
                if (this.c) {
                    return;
                }
                try {
                    s.this.a.onNext(t);
                    jVar.onNext(t);
                } catch (Throwable th) {
                    rx.exceptions.b.a(th, this, t);
                }
            }
        };
    }

    public s(rx.e<? super T> eVar) {
        this.a = eVar;
    }
}
