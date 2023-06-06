package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.f;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<T> extends AtomicInteger implements f {
    private static final long serialVersionUID = -2873467947112093874L;
    final j<? super T> a;
    T b;

    public b(j<? super T> jVar) {
        this.a = jVar;
    }

    @Override // rx.f
    public final void a(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (i == 0) {
            return;
        }
        do {
            int i2 = get();
            if (i2 != 0) {
                if (i2 == 1 && compareAndSet(1, 3)) {
                    a(this.a, this.b);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public final void a(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.b = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                a(this.a, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(j<? super T> jVar, T t) {
        if (jVar.isUnsubscribed()) {
            return;
        }
        try {
            jVar.onNext(t);
            if (jVar.isUnsubscribed()) {
                return;
            }
            jVar.onCompleted();
        } catch (Throwable th) {
            rx.exceptions.b.a(th, jVar, t);
        }
    }
}
