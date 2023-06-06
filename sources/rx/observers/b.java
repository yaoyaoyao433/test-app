package rx.observers;

import java.util.Arrays;
import rx.exceptions.f;
import rx.exceptions.h;
import rx.internal.util.i;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<T> extends j<T> {
    boolean a;
    private final j<? super T> b;

    public b(j<? super T> jVar) {
        super(jVar);
        this.a = false;
        this.b = jVar;
    }

    @Override // rx.e
    public final void onCompleted() {
        h hVar;
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            this.b.onCompleted();
            try {
                unsubscribe();
            } finally {
            }
        } catch (Throwable th) {
            try {
                rx.exceptions.b.b(th);
                i.a(th);
                throw new rx.exceptions.d(th.getMessage(), th);
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        rx.exceptions.b.b(th);
        if (this.a) {
            return;
        }
        this.a = true;
        i.a(th);
        try {
            this.b.onError(th);
            try {
                unsubscribe();
            } catch (RuntimeException e) {
                i.a(e);
                throw new rx.exceptions.e(e);
            }
        } catch (Throwable th2) {
            if (th2 instanceof f) {
                try {
                    unsubscribe();
                    throw ((f) th2);
                } catch (Throwable th3) {
                    i.a(th3);
                    throw new RuntimeException("Observer.onError not implemented and error while unsubscribing.", new rx.exceptions.a(Arrays.asList(th, th3)));
                }
            }
            i.a(th2);
            try {
                unsubscribe();
                throw new rx.exceptions.e("Error occurred when trying to propagate error to Observer.onError", new rx.exceptions.a(Arrays.asList(th, th2)));
            } catch (Throwable th4) {
                i.a(th4);
                throw new rx.exceptions.e("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new rx.exceptions.a(Arrays.asList(th, th2, th4)));
            }
        }
    }

    @Override // rx.e
    public final void onNext(T t) {
        try {
            if (this.a) {
                return;
            }
            this.b.onNext(t);
        } catch (Throwable th) {
            rx.exceptions.b.a(th, this);
        }
    }
}
