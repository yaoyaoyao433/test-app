package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a implements k {
    static final rx.functions.a b = new rx.functions.a() { // from class: rx.subscriptions.a.1
        @Override // rx.functions.a
        public final void a() {
        }
    };
    final AtomicReference<rx.functions.a> a;

    public a() {
        this.a = new AtomicReference<>();
    }

    private a(rx.functions.a aVar) {
        this.a = new AtomicReference<>(aVar);
    }

    public static a a() {
        return new a();
    }

    public static a a(rx.functions.a aVar) {
        return new a(aVar);
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    @Override // rx.k
    public final void unsubscribe() {
        rx.functions.a andSet;
        if (this.a.get() == b || (andSet = this.a.getAndSet(b)) == null || andSet == b) {
            return;
        }
        andSet.a();
    }
}
