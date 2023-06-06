package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f extends rx.g {
    private final ThreadFactory b;

    public f(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    @Override // rx.g
    public final g.a a() {
        return new g(this.b);
    }
}
