package rx.internal.util;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a<T> extends rx.j<T> {
    final rx.functions.b<? super T> a;
    final rx.functions.b<Throwable> b;
    final rx.functions.a c;

    public a(rx.functions.b<? super T> bVar, rx.functions.b<Throwable> bVar2, rx.functions.a aVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = aVar;
    }

    @Override // rx.e
    public final void onNext(T t) {
        this.a.call(t);
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        this.b.call(th);
    }

    @Override // rx.e
    public final void onCompleted() {
        this.c.a();
    }
}
