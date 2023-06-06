package rx.observers;

import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<T> extends j<T> {
    private final rx.e<T> a;

    public d(j<? super T> jVar) {
        this(jVar, true);
    }

    private d(j<? super T> jVar, boolean z) {
        super(jVar, true);
        this.a = new c(jVar);
    }

    @Override // rx.e
    public final void onCompleted() {
        this.a.onCompleted();
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // rx.e
    public final void onNext(T t) {
        this.a.onNext(t);
    }
}
