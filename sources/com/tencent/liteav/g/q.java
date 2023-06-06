package com.tencent.liteav.g;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class q {
    private Context a;
    private com.tencent.liteav.beauty.e b;
    private com.tencent.liteav.f.l c;
    private com.tencent.liteav.f.l d;
    private com.tencent.liteav.editer.n e;
    private com.tencent.liteav.d.g f;

    public q(Context context) {
        this.a = context;
    }

    public void a() {
        this.b = new com.tencent.liteav.beauty.e(this.a, true);
    }

    public void b() {
        this.c = new com.tencent.liteav.f.l(Boolean.FALSE);
        this.c.a();
        this.d = new com.tencent.liteav.f.l(Boolean.TRUE);
        this.d.a();
    }

    public void c() {
        if (this.c != null) {
            this.c.b();
            this.c = null;
        }
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
    }

    public void d() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }

    public void a(com.tencent.liteav.editer.n nVar) {
        this.e = nVar;
    }

    public void a(com.tencent.liteav.d.g gVar) {
        this.f = gVar;
    }

    public void a(float[] fArr) {
        if (this.b != null) {
            this.b.a(fArr);
        }
        if (this.d != null) {
            this.d.a(fArr);
        }
    }

    public void a(int i, com.tencent.liteav.d.e eVar) {
        if (this.b == null || eVar == null) {
            return;
        }
        int c = c(i, eVar);
        com.tencent.liteav.d.e a = a(eVar);
        int a2 = this.b.a(c, a.m(), a.n(), 0, 0, 0);
        if (this.e != null) {
            a2 = this.e.b(a2, a);
        }
        int b = b(a2, a);
        if (this.e != null) {
            this.e.a(b, a);
        }
    }

    private com.tencent.liteav.d.e a(com.tencent.liteav.d.e eVar) {
        int h = 360 - eVar.h();
        if (h == 90 || h == 270) {
            int n = eVar.n();
            eVar.k(eVar.m());
            eVar.j(n);
        }
        return eVar;
    }

    private int b(int i, com.tencent.liteav.d.e eVar) {
        if (this.c == null || eVar.m() == 0 || eVar.n() == 0) {
            return i;
        }
        this.c.a(s.r().u);
        this.c.b(eVar.m(), eVar.n());
        this.c.a(this.f.a, this.f.b);
        return this.c.d(i);
    }

    private int c(int i, com.tencent.liteav.d.e eVar) {
        if (this.d == null || eVar.m() == 0 || eVar.n() == 0) {
            return i;
        }
        this.d.a(s.r().u);
        int h = 360 - eVar.h();
        this.d.b(h);
        this.d.b(eVar.m(), eVar.n());
        if (h == 90 || h == 270) {
            this.d.a(eVar.n(), eVar.m());
        } else {
            this.d.a(eVar.m(), eVar.n());
        }
        return this.d.d(i);
    }
}
