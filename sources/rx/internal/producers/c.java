package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.f;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> extends AtomicBoolean implements f {
    private static final long serialVersionUID = -3353584923995471404L;
    final j<? super T> a;
    final T b;

    public c(j<? super T> jVar, T t) {
        this.a = jVar;
        this.b = t;
    }

    @Override // rx.f
    public final void a(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (i != 0 && compareAndSet(false, true)) {
            j<? super T> jVar = this.a;
            Object obj = (T) this.b;
            if (jVar.isUnsubscribed()) {
                return;
            }
            try {
                jVar.onNext(obj);
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onCompleted();
            } catch (Throwable th) {
                rx.exceptions.b.a(th, jVar, obj);
            }
        }
    }
}
