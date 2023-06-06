package rx.android.schedulers;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private static final AtomicReference<a> a = new AtomicReference<>();
    private final g b;

    private a() {
        rx.android.plugins.a.a().b();
        this.b = new b(Looper.getMainLooper());
    }

    public static g a(Looper looper) {
        if (looper == null) {
            throw new NullPointerException("looper == null");
        }
        return new b(looper);
    }

    public static g a() {
        a aVar;
        do {
            aVar = a.get();
            if (aVar != null) {
                break;
            }
            aVar = new a();
        } while (!a.compareAndSet(null, aVar));
        return aVar.b;
    }
}
