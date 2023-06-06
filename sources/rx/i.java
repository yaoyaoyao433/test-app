package rx;

import rx.annotations.Beta;
import rx.internal.util.m;
/* compiled from: ProGuard */
@Beta
/* loaded from: classes7.dex */
public abstract class i<T> implements k {
    public final m d = new m();

    public abstract void a(T t);

    public abstract void a(Throwable th);

    @Override // rx.k
    public final void unsubscribe() {
        this.d.unsubscribe();
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.d.isUnsubscribed();
    }
}
