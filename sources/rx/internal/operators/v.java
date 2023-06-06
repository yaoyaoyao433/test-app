package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class v<T> implements d.b<T, T> {
    private final rx.functions.a a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        jVar.add(rx.subscriptions.e.a(this.a));
        return rx.observers.e.a(jVar);
    }

    public v(rx.functions.a aVar) {
        this.a = aVar;
    }
}
