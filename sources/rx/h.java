package rx;

import rx.annotations.Beta;
import rx.d;
/* compiled from: ProGuard */
@Beta
/* loaded from: classes7.dex */
public class h<T> {
    static rx.plugins.g b;
    final d.a<T> a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a<T> extends rx.functions.b<i<? super T>> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(final a<T> aVar) {
        this.a = new d.a<T>() { // from class: rx.h.1
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                final j jVar = (j) obj;
                final rx.internal.producers.b bVar = new rx.internal.producers.b(jVar);
                jVar.setProducer(bVar);
                i<T> iVar = new i<T>() { // from class: rx.h.1.1
                    @Override // rx.i
                    public final void a(T t) {
                        bVar.a((rx.internal.producers.b) t);
                    }

                    @Override // rx.i
                    public final void a(Throwable th) {
                        jVar.onError(th);
                    }
                };
                jVar.add(iVar);
                aVar.call(iVar);
            }
        };
    }

    static {
        rx.plugins.e a2 = rx.plugins.e.a();
        if (a2.a.get() == null) {
            Object a3 = rx.plugins.e.a(rx.plugins.g.class, System.getProperties());
            if (a3 == null) {
                a2.a.compareAndSet(null, rx.plugins.h.a());
            } else {
                a2.a.compareAndSet(null, (rx.plugins.g) a3);
            }
        }
        b = a2.a.get();
    }
}
