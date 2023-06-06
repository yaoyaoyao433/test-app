package rx.internal.operators;

import java.util.concurrent.Callable;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g<T> implements d.a<T> {
    private final Callable<? extends T> a;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        rx.j jVar = (rx.j) obj;
        rx.internal.producers.b bVar = new rx.internal.producers.b(jVar);
        jVar.setProducer(bVar);
        try {
            bVar.a((rx.internal.producers.b) this.a.call());
        } catch (Throwable th) {
            rx.exceptions.b.a(th, jVar);
        }
    }

    public g(Callable<? extends T> callable) {
        this.a = callable;
    }
}
