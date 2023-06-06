package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class i<T, R> implements d.a<R> {
    static final rx.plugins.c a = rx.plugins.e.a().c();
    final d.a<T> b;
    final d.b<? extends R, ? super T> c;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        rx.j jVar = (rx.j) obj;
        try {
            rx.j<? super T> call = rx.plugins.c.a(this.c).call(jVar);
            call.onStart();
            this.b.call(call);
        } catch (Throwable th) {
            rx.exceptions.b.b(th);
            jVar.onError(th);
        }
    }

    public i(d.a<T> aVar, d.b<? extends R, ? super T> bVar) {
        this.b = aVar;
        this.c = bVar;
    }
}
