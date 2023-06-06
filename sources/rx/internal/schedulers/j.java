package rx.internal.schedulers;

import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class j implements rx.functions.a {
    private final rx.functions.a a;
    private final g.a b;
    private final long c;

    public j(rx.functions.a aVar, g.a aVar2, long j) {
        this.a = aVar;
        this.b = aVar2;
        this.c = j;
    }

    @Override // rx.functions.a
    public final void a() {
        if (this.b.isUnsubscribed()) {
            return;
        }
        long currentTimeMillis = this.c - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            try {
                Thread.sleep(currentTimeMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        if (this.b.isUnsubscribed()) {
            return;
        }
        this.a.a();
    }
}
