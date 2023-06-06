package rx.subscriptions;

import java.util.concurrent.Future;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e {
    private static final b a = new b();

    public static k a() {
        return rx.subscriptions.a.a();
    }

    public static k b() {
        return a;
    }

    public static k a(rx.functions.a aVar) {
        return rx.subscriptions.a.a(aVar);
    }

    public static k a(Future<?> future) {
        return new a(future);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a implements k {
        final Future<?> a;

        public a(Future<?> future) {
            this.a = future;
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.a.cancel(true);
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.a.isCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b implements k {
        @Override // rx.k
        public final boolean isUnsubscribed() {
            return true;
        }

        @Override // rx.k
        public final void unsubscribe() {
        }

        b() {
        }
    }
}
