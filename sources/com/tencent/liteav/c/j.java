package com.tencent.liteav.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j {
    private static j b;
    public float a;
    private com.tencent.liteav.d.j c;
    private com.tencent.liteav.d.h d;
    private com.tencent.liteav.d.c e;
    private com.tencent.liteav.d.d f;
    private int g;
    private int h;

    public static j a() {
        if (b == null) {
            b = new j();
        }
        return b;
    }

    private j() {
        h();
    }

    private void h() {
        g();
    }

    public void a(com.tencent.liteav.d.j jVar) {
        this.c = jVar;
    }

    public com.tencent.liteav.d.j b() {
        return this.c;
    }

    public void a(com.tencent.liteav.d.c cVar) {
        this.e = cVar;
    }

    public com.tencent.liteav.d.c c() {
        return this.e;
    }

    public com.tencent.liteav.d.d d() {
        return this.f;
    }

    public void a(com.tencent.liteav.d.d dVar) {
        this.f = dVar;
    }

    public int e() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public int f() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public void g() {
        this.a = 1.0f;
        if (this.c != null) {
            this.c.b();
        }
        this.c = null;
        if (this.d != null) {
            this.d.a();
        }
        if (this.f != null) {
            this.f.a();
        }
        this.d = null;
        this.e = null;
        this.g = 0;
    }
}
