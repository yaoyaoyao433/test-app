package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class aj<T> implements d.b<T, T> {
    final long a;
    final rx.g b;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        return new rx.j<T>(jVar) { // from class: rx.internal.operators.aj.1
            private long c = 0;

            @Override // rx.j
            public final void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.e
            public final void onNext(T t) {
                long b = rx.g.b();
                if (this.c == 0 || b - this.c >= aj.this.a) {
                    this.c = b;
                    jVar.onNext(t);
                }
            }

            @Override // rx.e
            public final void onCompleted() {
                jVar.onCompleted();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                jVar.onError(th);
            }
        };
    }

    public aj(long j, TimeUnit timeUnit, rx.g gVar) {
        this.a = timeUnit.toMillis(j);
        this.b = gVar;
    }
}
