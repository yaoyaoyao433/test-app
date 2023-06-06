package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e extends rx.g {
    public static final e b = new e();

    private e() {
    }

    @Override // rx.g
    public final g.a a() {
        return new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    class a extends g.a implements rx.k {
        final rx.subscriptions.a a = new rx.subscriptions.a();

        a() {
        }

        @Override // rx.g.a
        public final rx.k a(rx.functions.a aVar, long j, TimeUnit timeUnit) {
            return a(new j(aVar, this, e.b() + timeUnit.toMillis(j)));
        }

        @Override // rx.g.a
        public final rx.k a(rx.functions.a aVar) {
            aVar.a();
            return rx.subscriptions.e.b();
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.a.unsubscribe();
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }
    }
}
