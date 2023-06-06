package rx.internal.util;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g<T> extends rx.j<T> {
    final rx.e<? super T> a;

    public g(rx.e<? super T> eVar) {
        this.a = eVar;
    }

    @Override // rx.e
    public final void onNext(T t) {
        this.a.onNext(t);
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // rx.e
    public final void onCompleted() {
        this.a.onCompleted();
    }
}
