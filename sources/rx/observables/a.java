package rx.observables;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.internal.util.c;
import rx.internal.util.o;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a<T> {
    static final Object a = new Object();
    static final Object b = new Object();
    static final Object c = new Object();
    private final d<? extends T> d;

    private a(d<? extends T> dVar) {
        this.d = dVar;
    }

    public static <T> a<T> a(d<? extends T> dVar) {
        return new a<>(dVar);
    }

    public final T a(T t) {
        return b(this.d.d(o.b()).b((d<R>) t));
    }

    private T b(d<? extends T> dVar) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        c.a(countDownLatch, d.a(new j<T>() { // from class: rx.observables.a.1
            @Override // rx.e
            public final void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }

            @Override // rx.e
            public final void onNext(T t) {
                atomicReference.set(t);
            }
        }, dVar));
        if (atomicReference2.get() != null) {
            if (atomicReference2.get() instanceof RuntimeException) {
                throw ((RuntimeException) atomicReference2.get());
            }
            throw new RuntimeException((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }
}
