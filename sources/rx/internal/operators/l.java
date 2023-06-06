package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class l<T> implements d.a<T> {
    private final Throwable a;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        ((rx.j) obj).onError(this.a);
    }

    public l(Throwable th) {
        this.a = th;
    }
}
