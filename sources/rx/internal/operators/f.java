package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f<T> implements d.a<T> {
    final T[] a;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        rx.j jVar = (rx.j) obj;
        jVar.setProducer(new a(jVar, this.a));
    }

    public f(T[] tArr) {
        this.a = tArr;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T> extends AtomicLong implements rx.f {
        private static final long serialVersionUID = 3534218984725836979L;
        final rx.j<? super T> a;
        final T[] b;
        int c;

        public a(rx.j<? super T> jVar, T[] tArr) {
            this.a = jVar;
            this.b = tArr;
        }

        @Override // rx.f
        public final void a(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j == Long.MAX_VALUE) {
                if (rx.internal.operators.a.a(this, j) == 0) {
                    a();
                }
            } else if (i == 0 || rx.internal.operators.a.a(this, j) != 0) {
            } else {
                b(j);
            }
        }

        private void a() {
            rx.j<? super T> jVar = this.a;
            for (T t : this.b) {
                Object obj = (Object) t;
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onNext(obj);
            }
            if (jVar.isUnsubscribed()) {
                return;
            }
            jVar.onCompleted();
        }

        private void b(long j) {
            rx.j<? super T> jVar = this.a;
            T[] tArr = this.b;
            int length = tArr.length;
            int i = this.c;
            do {
                long j2 = 0;
                while (true) {
                    if (j != 0 && i != length) {
                        if (jVar.isUnsubscribed()) {
                            return;
                        }
                        jVar.onNext((Object) tArr[i]);
                        i++;
                        if (i == length) {
                            if (jVar.isUnsubscribed()) {
                                return;
                            }
                            jVar.onCompleted();
                            return;
                        }
                        j--;
                        j2--;
                    } else {
                        j = get() + j2;
                        if (j == 0) {
                            this.c = i;
                            j = addAndGet(j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }
}
