package com.tencent.liteav.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.beauty.e;
import com.tencent.liteav.editer.n;
import com.tencent.liteav.editer.v;
import com.tencent.liteav.i.a;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k {
    private Context a;
    private com.tencent.liteav.c.j b;
    private com.tencent.liteav.beauty.e c;
    private v d;
    private n e;
    private com.tencent.liteav.d.g f;
    private i g;
    private l h;
    private e i;
    private h j;
    private f k;
    private a l;
    private j m;
    private ArrayList<e.f> n;
    private com.tencent.liteav.d.e o;
    private int p;
    private int q;
    private l r;
    private int t;
    private com.tencent.liteav.d.e u;
    private boolean s = false;
    private Object v = new Object();

    public k(Context context) {
        this.a = context;
    }

    public void a() {
        this.b = com.tencent.liteav.c.j.a();
        this.c = new com.tencent.liteav.beauty.e(this.a, true);
        this.i = new e(this.a);
        this.j = h.a();
        this.k = f.a();
        this.l = a.a();
        this.m = j.a();
    }

    public void b() {
        if (!com.tencent.liteav.c.h.a().e()) {
            this.g = new i(Boolean.FALSE);
            this.g.a();
        }
        this.h = new l(Boolean.FALSE);
        this.h.a();
        this.r = new l(Boolean.TRUE);
        this.r.a();
    }

    public void c() {
        if (this.g != null) {
            this.g.b();
            this.g = null;
        }
        if (this.h != null) {
            this.h.b();
            this.h = null;
        }
        if (this.r != null) {
            this.r.b();
            this.r = null;
        }
    }

    public void d() {
        if (this.i != null) {
            this.i.a();
        }
        if (this.c != null) {
            this.c.b();
            this.c = null;
        }
        if (this.n != null) {
            this.n.clear();
        }
        this.o = null;
    }

    public void a(com.tencent.liteav.d.g gVar) {
        this.f = gVar;
    }

    public void a(n nVar) {
        this.e = nVar;
    }

    public void a(v vVar) {
        synchronized (this.v) {
            this.d = vVar;
        }
    }

    public void a(float[] fArr) {
        if (this.c != null) {
            this.c.a(fArr);
        }
        if (this.r != null) {
            this.r.a(fArr);
        }
    }

    public void a(int i) {
        int abs;
        this.p = i;
        if (i == 1) {
            if (this.o != null) {
                b(this.o);
            }
            a(this.q, this.o);
        } else if (i == 2) {
            if (this.o != null) {
                b(this.o);
            }
            int e = com.tencent.liteav.c.j.a().e();
            int f = com.tencent.liteav.c.j.a().f();
            if (this.t != 0) {
                abs = Math.abs(e - this.t);
                this.t = 0;
            } else {
                abs = Math.abs(e - f);
            }
            if (abs == 90 || abs == 270) {
                c(this.o);
            }
            a(this.q, this.o);
            com.tencent.liteav.c.j.a().b(e);
        }
    }

    public void a(int i, com.tencent.liteav.d.e eVar) {
        int i2;
        if (this.c == null || eVar == null) {
            return;
        }
        if (this.s) {
            int c = c(i, eVar);
            com.tencent.liteav.d.e b = b(eVar);
            e(c, b);
            this.o = b;
            this.q = i;
            return;
        }
        this.n = new ArrayList<>();
        if (com.tencent.liteav.c.k.a().d() == 1) {
            i2 = c(i, eVar);
            eVar = b(eVar);
        } else {
            i2 = i;
        }
        this.l.c(eVar);
        this.k.c(eVar);
        this.j.c(eVar);
        if (this.e != null) {
            i2 = this.e.b(i2, eVar);
        }
        int i3 = i2;
        e();
        g();
        f();
        if (this.p != 1) {
            f(eVar);
            e(eVar);
            d(eVar);
        }
        a(eVar);
        this.c.a((List<e.f>) this.n);
        this.c.b(eVar.s());
        int b2 = b(d(this.c.a(i3, eVar.m(), eVar.n(), 0, 0, 0), eVar), eVar);
        if (this.e != null) {
            this.e.a(b2, eVar);
        }
        f(b2, eVar);
        this.o = eVar;
        this.u = eVar;
        this.q = i;
    }

    private void a(com.tencent.liteav.d.e eVar) {
        List<a.k> h;
        if (!this.m.b() || (h = this.m.h()) == null || h.size() == 0) {
            return;
        }
        long a = com.tencent.liteav.j.e.a(eVar) / 1000;
        for (a.k kVar : h) {
            if (a <= kVar.c) {
                return;
            }
            if (a > kVar.c && a <= kVar.d) {
                this.n.add(a(kVar.a, kVar.b));
            }
        }
    }

    private com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) {
        if (eVar.r()) {
            int h = 360 - eVar.h();
            if (h == 90 || h == 270) {
                c(eVar);
            }
            return eVar;
        }
        int e = com.tencent.liteav.c.j.a().e();
        int abs = Math.abs((360 - eVar.h()) - e);
        if (abs == 90 || abs == 270) {
            c(eVar);
        }
        if (com.tencent.liteav.c.i.a().t.get() == 2) {
            this.t = e;
        }
        return eVar;
    }

    private com.tencent.liteav.d.e c(com.tencent.liteav.d.e eVar) {
        int n = eVar.n();
        eVar.k(eVar.m());
        eVar.j(n);
        return eVar;
    }

    private int b(int i, com.tencent.liteav.d.e eVar) {
        if (this.h == null || eVar.m() == 0 || eVar.n() == 0) {
            return i;
        }
        this.h.a(com.tencent.liteav.c.i.a().s);
        this.h.b(eVar.m(), eVar.n());
        this.h.a(this.f.a, this.f.b);
        return this.h.d(i);
    }

    private int c(int i, com.tencent.liteav.d.e eVar) {
        if (this.r == null || eVar.m() == 0 || eVar.n() == 0) {
            return i;
        }
        this.r.a(com.tencent.liteav.c.i.a().s);
        int h = (360 - eVar.h()) - com.tencent.liteav.c.j.a().e();
        this.r.b(h);
        this.r.b(eVar.m(), eVar.n());
        if (h == 90 || h == 270) {
            this.r.a(eVar.n(), eVar.m());
        } else {
            this.r.a(eVar.m(), eVar.n());
        }
        return this.r.d(i);
    }

    private int d(int i, com.tencent.liteav.d.e eVar) {
        if (this.i != null) {
            this.i.a(eVar);
            return this.i.a(eVar, i);
        }
        return i;
    }

    private void d(com.tencent.liteav.d.e eVar) {
        Bitmap a;
        List<com.tencent.liteav.d.a> b = this.l.b();
        if (b == null || b.size() == 0) {
            this.l.a(this.f);
            this.l.a(eVar);
            b = this.l.b();
        }
        for (com.tencent.liteav.d.a aVar : b) {
            long e = eVar.e() / 1000;
            if (e >= aVar.c && e <= aVar.d && (a = com.sankuai.waimai.launcher.util.image.a.a(aVar.a)) != null) {
                if (aVar.e == 0.0f) {
                    this.n.add(a(a, aVar.b));
                } else {
                    this.n.add(a(com.tencent.liteav.j.a.a(aVar.e, a), aVar.b));
                }
            }
        }
    }

    private void e(com.tencent.liteav.d.e eVar) {
        List<a.e> b = this.k.b();
        if (b == null || b.size() == 0) {
            this.k.a(this.f);
            this.k.a(eVar);
            b = this.k.b();
        }
        for (a.e eVar2 : b) {
            long e = eVar.e() / 1000;
            if (e >= eVar2.c && e <= eVar2.d) {
                this.n.add(a(eVar2.a, eVar2.b));
            }
        }
    }

    private void f(com.tencent.liteav.d.e eVar) {
        List<a.k> b = this.j.b();
        if (b == null || b.size() == 0) {
            this.j.a(this.f);
            this.j.a(eVar);
            b = this.j.b();
        }
        for (a.k kVar : b) {
            long e = eVar.e() / 1000;
            if (e >= kVar.c && e <= kVar.d) {
                this.n.add(a(kVar.a, kVar.b));
            }
        }
    }

    private void e(int i, com.tencent.liteav.d.e eVar) {
        v vVar;
        synchronized (this.v) {
            vVar = this.d;
        }
        if (vVar == null) {
            return;
        }
        com.tencent.liteav.c.h a = com.tencent.liteav.c.h.a();
        if (a.e()) {
            return;
        }
        if (eVar.p()) {
            do {
                int h = a.h();
                a.g();
                if (this.o != null) {
                    long e = this.o.e();
                    com.tencent.liteav.d.g d = a.d();
                    if (this.g != null) {
                        this.g.b(this.o.m(), this.o.n());
                        this.g.a(d.a, d.b);
                        Bitmap a2 = com.tencent.liteav.j.d.a(this.g.b(i), d.a, d.b);
                        if (vVar != null) {
                            vVar.a(h, e, a2);
                        }
                    }
                }
            } while (!a.e());
            return;
        }
        int h2 = a.h();
        long g = a.g();
        com.tencent.liteav.d.g d2 = a.d();
        if (this.g != null) {
            this.g.b(eVar.m(), eVar.n());
            this.g.a(d2.a, d2.b);
            Bitmap a3 = com.tencent.liteav.j.d.a(this.g.b(i), d2.a, d2.b);
            if (vVar != null) {
                vVar.a(h2, g, a3);
            }
        }
    }

    private void f(int i, com.tencent.liteav.d.e eVar) {
        v vVar;
        synchronized (this.v) {
            vVar = this.d;
        }
        if (vVar == null) {
            return;
        }
        com.tencent.liteav.c.h a = com.tencent.liteav.c.h.a();
        if (a.e()) {
            return;
        }
        if (eVar.p()) {
            do {
                int h = a.h();
                a.g();
                if (this.o != null) {
                    long e = this.o.e();
                    com.tencent.liteav.d.g d = a.d();
                    if (this.g != null) {
                        this.g.b(this.o.m(), this.o.n());
                        this.g.a(d.a, d.b);
                        Bitmap a2 = com.tencent.liteav.j.d.a(this.g.b(i), d.a, d.b);
                        if (vVar != null) {
                            vVar.a(h, e, a2);
                        }
                    }
                }
            } while (!a.e());
            return;
        }
        long e2 = eVar.e();
        if (com.tencent.liteav.c.i.a().r || a.k() || e2 >= a.f()) {
            int h2 = a.h();
            long g = a.g();
            com.tencent.liteav.d.g d2 = a.d();
            if (this.g != null) {
                this.g.b(eVar.m(), eVar.n());
                this.g.a(d2.a, d2.b);
                Bitmap a3 = com.tencent.liteav.j.d.a(this.g.b(i), d2.a, d2.b);
                if (vVar != null) {
                    vVar.a(h2, g, a3);
                }
            }
        }
    }

    private void e() {
        com.tencent.liteav.d.c c = this.b.c();
        if (c == null || !c.a()) {
            return;
        }
        this.c.c(c.a);
        this.c.d(c.b);
    }

    private void f() {
        com.tencent.liteav.d.d d = this.b.d();
        if (d != null) {
            float d2 = d.d();
            Bitmap e = d.e();
            Bitmap f = d.f();
            this.c.a(d2, e, d.b(), f, d.c());
        }
    }

    private void g() {
        com.tencent.liteav.d.j b = this.b.b();
        if (b != null) {
            this.n.add(a(b.c(), b.d()));
        }
    }

    private e.f a(Bitmap bitmap, a.h hVar) {
        e.f fVar = new e.f();
        fVar.a = bitmap;
        fVar.b = hVar.a;
        fVar.c = hVar.b;
        fVar.d = hVar.c;
        return fVar;
    }

    public void a(boolean z) {
        this.s = z;
    }
}
