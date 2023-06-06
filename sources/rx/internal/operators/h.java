package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class h<T> implements d.a<T> {
    final Iterable<? extends T> a;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        rx.j jVar = (rx.j) obj;
        try {
            Iterator<? extends T> it = this.a.iterator();
            boolean hasNext = it.hasNext();
            if (jVar.isUnsubscribed()) {
                return;
            }
            if (!hasNext) {
                jVar.onCompleted();
            } else {
                jVar.setProducer(new a(jVar, it));
            }
        } catch (Throwable th) {
            rx.exceptions.b.a(th, jVar);
        }
    }

    public h(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.a = iterable;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T> extends AtomicLong implements rx.f {
        private static final long serialVersionUID = -8730475647105475802L;
        private final rx.j<? super T> a;
        private final Iterator<? extends T> b;

        a(rx.j<? super T> jVar, Iterator<? extends T> it) {
            this.a = jVar;
            this.b = it;
        }

        @Override // rx.f
        public final void a(long j) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j != Long.MAX_VALUE || !compareAndSet(0L, Long.MAX_VALUE)) {
                if (j <= 0 || rx.internal.operators.a.a(this, j) != 0) {
                    return;
                }
                rx.j<? super T> jVar = this.a;
                Iterator<? extends T> it = this.b;
                long j2 = j;
                do {
                    long j3 = 0;
                    while (true) {
                        if (j3 != j2) {
                            if (jVar.isUnsubscribed()) {
                                return;
                            }
                            try {
                                jVar.onNext((T) it.next());
                                if (jVar.isUnsubscribed()) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
                                        if (jVar.isUnsubscribed()) {
                                            return;
                                        }
                                        jVar.onCompleted();
                                        return;
                                    }
                                    j3++;
                                } catch (Throwable th) {
                                    rx.exceptions.b.a(th, jVar);
                                    return;
                                }
                            } catch (Throwable th2) {
                                rx.exceptions.b.a(th2, jVar);
                                return;
                            }
                        } else {
                            j2 = get();
                            if (j3 == j2) {
                                j2 = rx.internal.operators.a.b(this, j3);
                            }
                        }
                    }
                } while (j2 != 0);
                return;
            }
            rx.j<? super T> jVar2 = this.a;
            Iterator<? extends T> it2 = this.b;
            while (!jVar2.isUnsubscribed()) {
                try {
                    jVar2.onNext((T) it2.next());
                    if (jVar2.isUnsubscribed()) {
                        return;
                    }
                    try {
                        if (!it2.hasNext()) {
                            if (jVar2.isUnsubscribed()) {
                                return;
                            }
                            jVar2.onCompleted();
                            return;
                        }
                    } catch (Throwable th3) {
                        rx.exceptions.b.a(th3, jVar2);
                        return;
                    }
                } catch (Throwable th4) {
                    rx.exceptions.b.a(th4, jVar2);
                    return;
                }
            }
        }
    }
}
