package rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private static final a a = new a();
    private final AtomicReference<b> b = new AtomicReference<>();

    public static a a() {
        return a;
    }

    a() {
    }

    public final b b() {
        if (this.b.get() == null) {
            this.b.compareAndSet(null, b.a());
        }
        return this.b.get();
    }
}
