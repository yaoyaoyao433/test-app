package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class u<T> implements d.b<T, T> {
    private final rx.functions.a a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        this.a.a();
        return rx.observers.e.a((rx.j) obj);
    }

    public u(rx.functions.a aVar) {
        this.a = aVar;
    }
}
