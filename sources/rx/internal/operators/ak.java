package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.g;
import rx.internal.operators.al;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ak<T> extends al<T> {
    @Override // rx.internal.operators.al
    public final /* bridge */ /* synthetic */ rx.j a(rx.j jVar) {
        return super.call(jVar);
    }

    public ak(final long j, final TimeUnit timeUnit, rx.d<? extends T> dVar, rx.g gVar) {
        super(new al.a<T>() { // from class: rx.internal.operators.ak.1
            @Override // rx.functions.i
            public final /* synthetic */ rx.k a(Object obj, Long l, g.a aVar) {
                final al.c cVar = (al.c) obj;
                final Long l2 = l;
                return aVar.a(new rx.functions.a() { // from class: rx.internal.operators.ak.1.1
                    @Override // rx.functions.a
                    public final void a() {
                        cVar.a(l2.longValue());
                    }
                }, j, timeUnit);
            }
        }, new al.b<T>() { // from class: rx.internal.operators.ak.2
            @Override // rx.functions.j
            public final /* synthetic */ rx.k a(Object obj, Long l, Object obj2, g.a aVar) {
                final al.c cVar = (al.c) obj;
                final Long l2 = l;
                return aVar.a(new rx.functions.a() { // from class: rx.internal.operators.ak.2.1
                    @Override // rx.functions.a
                    public final void a() {
                        cVar.a(l2.longValue());
                    }
                }, j, timeUnit);
            }
        }, dVar, gVar);
    }
}
