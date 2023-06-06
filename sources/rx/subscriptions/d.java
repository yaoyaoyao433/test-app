package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d implements k {
    public final AtomicReference<a> a = new AtomicReference<>(new a(false, e.a()));

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a {
        final boolean a;
        public final k b;

        a(boolean z, k kVar) {
            this.a = z;
            this.b = kVar;
        }

        final a a(k kVar) {
            return new a(this.a, kVar);
        }
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.a.get().a;
    }

    @Override // rx.k
    public final void unsubscribe() {
        a aVar;
        AtomicReference<a> atomicReference = this.a;
        do {
            aVar = atomicReference.get();
            if (aVar.a) {
                return;
            }
        } while (!atomicReference.compareAndSet(aVar, new a(true, aVar.b)));
        aVar.b.unsubscribe();
    }

    public final void a(k kVar) {
        a aVar;
        if (kVar == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        AtomicReference<a> atomicReference = this.a;
        do {
            aVar = atomicReference.get();
            if (aVar.a) {
                kVar.unsubscribe();
                return;
            }
        } while (!atomicReference.compareAndSet(aVar, aVar.a(kVar)));
        aVar.b.unsubscribe();
    }
}
