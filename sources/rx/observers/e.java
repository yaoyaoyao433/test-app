package rx.observers;

import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e {
    public static <T> j<T> a(final j<? super T> jVar) {
        return new j<T>(jVar) { // from class: rx.observers.e.2
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
    }
}
