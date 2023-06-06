package rx.plugins;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e {
    private static final e d = new e();
    static final b c = new b() { // from class: rx.plugins.e.1
    };
    private final AtomicReference<b> e = new AtomicReference<>();
    private final AtomicReference<c> f = new AtomicReference<>();
    public final AtomicReference<g> a = new AtomicReference<>();
    public final AtomicReference<a> b = new AtomicReference<>();
    private final AtomicReference<f> g = new AtomicReference<>();

    public static e a() {
        return d;
    }

    e() {
    }

    public final b b() {
        if (this.e.get() == null) {
            Object a = a(b.class, System.getProperties());
            if (a == null) {
                this.e.compareAndSet(null, c);
            } else {
                this.e.compareAndSet(null, (b) a);
            }
        }
        return this.e.get();
    }

    public final c c() {
        if (this.f.get() == null) {
            Object a = a(c.class, System.getProperties());
            if (a == null) {
                this.f.compareAndSet(null, d.a());
            } else {
                this.f.compareAndSet(null, (c) a);
            }
        }
        return this.f.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.lang.Class<?> r6, java.util.Properties r7) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.plugins.e.a(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    public final f d() {
        if (this.g.get() == null) {
            Object a = a(f.class, System.getProperties());
            if (a == null) {
                this.g.compareAndSet(null, f.d());
            } else {
                this.g.compareAndSet(null, (f) a);
            }
        }
        return this.g.get();
    }
}
