package android.support.v7.graphics;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    final float[] g = new float[3];
    final float[] h = new float[3];
    final float[] i = new float[3];
    boolean j = true;

    static {
        c cVar = new c();
        a = cVar;
        c(cVar);
        d(a);
        c cVar2 = new c();
        b = cVar2;
        b(cVar2);
        d(b);
        c cVar3 = new c();
        c = cVar3;
        a(cVar3);
        d(c);
        c cVar4 = new c();
        d = cVar4;
        c(cVar4);
        e(d);
        c cVar5 = new c();
        e = cVar5;
        b(cVar5);
        e(e);
        c cVar6 = new c();
        f = cVar6;
        a(cVar6);
        e(f);
    }

    c() {
        a(this.g);
        a(this.h);
        this.i[0] = 0.24f;
        this.i[1] = 0.52f;
        this.i[2] = 0.24f;
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void a(c cVar) {
        cVar.h[1] = 0.26f;
        cVar.h[2] = 0.45f;
    }

    private static void b(c cVar) {
        cVar.h[0] = 0.3f;
        cVar.h[1] = 0.5f;
        cVar.h[2] = 0.7f;
    }

    private static void c(c cVar) {
        cVar.h[0] = 0.55f;
        cVar.h[1] = 0.74f;
    }

    private static void d(c cVar) {
        cVar.g[0] = 0.35f;
        cVar.g[1] = 1.0f;
    }

    private static void e(c cVar) {
        cVar.g[1] = 0.3f;
        cVar.g[2] = 0.4f;
    }
}
