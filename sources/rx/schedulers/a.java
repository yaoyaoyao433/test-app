package rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
import rx.internal.schedulers.c;
import rx.internal.schedulers.i;
import rx.internal.schedulers.k;
import rx.plugins.e;
import rx.plugins.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private static final AtomicReference<a> d = new AtomicReference<>();
    private final g a;
    private final g b;
    private final g c;

    private static a f() {
        while (true) {
            a aVar = d.get();
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            if (d.compareAndSet(null, aVar2)) {
                return aVar2;
            }
            aVar2.g();
        }
    }

    private a() {
        e.a().d();
        this.a = f.a();
        this.b = f.b();
        this.c = f.c();
    }

    public static g a() {
        return rx.internal.schedulers.e.b;
    }

    public static g b() {
        return k.b;
    }

    public static g c() {
        return f().c;
    }

    public static g d() {
        return f().a;
    }

    public static g e() {
        return f().b;
    }

    public static g a(Executor executor) {
        return new c(executor);
    }

    private synchronized void g() {
        if (this.a instanceof i) {
            ((i) this.a).c();
        }
        if (this.b instanceof i) {
            ((i) this.b).c();
        }
        if (this.c instanceof i) {
            ((i) this.c).c();
        }
    }
}
