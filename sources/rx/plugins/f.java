package rx.plugins;

import rx.annotations.Experimental;
import rx.internal.util.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class f {
    private static final f a = new f();

    public static rx.functions.a a(rx.functions.a aVar) {
        return aVar;
    }

    @Experimental
    public static rx.g a() {
        return new rx.internal.schedulers.b(new k("RxComputationScheduler-"));
    }

    @Experimental
    public static rx.g b() {
        return new rx.internal.schedulers.a(new k("RxIoScheduler-"));
    }

    @Experimental
    public static rx.g c() {
        return new rx.internal.schedulers.f(new k("RxNewThreadScheduler-"));
    }

    protected f() {
    }

    public static f d() {
        return a;
    }
}
