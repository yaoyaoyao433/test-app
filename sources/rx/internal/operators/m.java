package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class m implements d.a<Long> {
    final long a;
    final TimeUnit b;
    final rx.g c;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        final rx.j jVar = (rx.j) obj;
        g.a a = this.c.a();
        jVar.add(a);
        a.a(new rx.functions.a() { // from class: rx.internal.operators.m.1
            @Override // rx.functions.a
            public final void a() {
                try {
                    jVar.onNext(0L);
                    jVar.onCompleted();
                } catch (Throwable th) {
                    rx.exceptions.b.a(th, jVar);
                }
            }
        }, this.a, this.b);
    }

    public m(long j, TimeUnit timeUnit, rx.g gVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = gVar;
    }
}
