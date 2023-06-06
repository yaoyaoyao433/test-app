package rx.observers;

import rx.exceptions.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private static final rx.e<Object> a = new rx.e<Object>() { // from class: rx.observers.a.1
        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final void onNext(Object obj) {
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            throw new f(th);
        }
    };

    public static <T> rx.e<T> a() {
        return (rx.e<T>) a;
    }
}
