package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class n implements d.a<Long> {
    final long a;
    final long b;
    final TimeUnit c;
    final rx.g d;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        final g.a a = this.d.a();
        jVar.add(a);
        final rx.functions.a aVar = new rx.functions.a() { // from class: rx.internal.operators.n.1
            long a;

            @Override // rx.functions.a
            public final void a() {
                try {
                    rx.j jVar2 = jVar;
                    long j = this.a;
                    this.a = 1 + j;
                    jVar2.onNext(Long.valueOf(j));
                } catch (Throwable th) {
                    try {
                        a.unsubscribe();
                    } finally {
                        rx.exceptions.b.a(th, jVar);
                    }
                }
            }
        };
        long j = this.a;
        long j2 = this.b;
        TimeUnit timeUnit = this.c;
        final long nanos = timeUnit.toNanos(j2);
        final long nanos2 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        final long nanos3 = nanos2 + timeUnit.toNanos(j);
        final rx.subscriptions.c cVar = new rx.subscriptions.c();
        rx.functions.a aVar2 = new rx.functions.a() { // from class: rx.g.a.1
            long a;
            long b;
            long c;

            {
                this.b = nanos2;
                this.c = nanos3;
            }

            @Override // rx.functions.a
            public final void a() {
                long j3;
                if (cVar.isUnsubscribed()) {
                    return;
                }
                aVar.a();
                long nanos4 = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
                if (g.a + nanos4 < this.b || nanos4 >= this.b + nanos + g.a) {
                    j3 = nanos + nanos4;
                    long j4 = nanos;
                    long j5 = this.a + 1;
                    this.a = j5;
                    this.c = j3 - (j4 * j5);
                } else {
                    long j6 = this.c;
                    long j7 = this.a + 1;
                    this.a = j7;
                    j3 = j6 + (j7 * nanos);
                }
                this.b = nanos4;
                cVar.a(a.a(this, j3 - nanos4, TimeUnit.NANOSECONDS));
            }
        };
        rx.subscriptions.c cVar2 = new rx.subscriptions.c();
        cVar.a(cVar2);
        cVar2.a(a.a(aVar2, j, timeUnit));
    }

    public n(long j, long j2, TimeUnit timeUnit, rx.g gVar) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = gVar;
    }
}
