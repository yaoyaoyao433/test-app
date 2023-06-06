package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ab<T> implements d.b<T, T> {
    final rx.functions.b<? super T> a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final ab<Object> a = new ab<>();
    }

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        final AtomicLong atomicLong = new AtomicLong();
        jVar.setProducer(new rx.f() { // from class: rx.internal.operators.ab.1
            @Override // rx.f
            public final void a(long j) {
                rx.internal.operators.a.a(atomicLong, j);
            }
        });
        return new rx.j<T>(jVar) { // from class: rx.internal.operators.ab.2
            @Override // rx.j
            public final void onStart() {
                request(Long.MAX_VALUE);
            }

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
                if (atomicLong.get() > 0) {
                    jVar.onNext(t);
                    atomicLong.decrementAndGet();
                } else if (ab.this.a != null) {
                    try {
                        ab.this.a.call(t);
                    } catch (Throwable th) {
                        rx.exceptions.b.a(th, jVar, t);
                    }
                }
            }
        };
    }

    ab() {
        this(null);
    }

    private ab(rx.functions.b<? super T> bVar) {
        this.a = null;
    }
}
