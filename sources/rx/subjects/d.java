package rx.subjects;

import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<T, R> extends e<T, R> {
    private final rx.observers.c<T> c;
    private final e<T, R> d;

    public d(final e<T, R> eVar) {
        super(new d.a<R>() { // from class: rx.subjects.d.1
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                e.this.a((j) ((j) obj));
            }
        });
        this.d = eVar;
        this.c = new rx.observers.c<>(eVar);
    }

    @Override // rx.e
    public final void onCompleted() {
        this.c.onCompleted();
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        this.c.onError(th);
    }

    @Override // rx.e
    public final void onNext(T t) {
        this.c.onNext(t);
    }

    @Override // rx.subjects.e
    public final boolean h() {
        return this.d.h();
    }
}
