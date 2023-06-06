package android.support.constraint.solver;

import android.support.constraint.solver.h;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static f h = null;
    private static int i = 1000;
    public a b;
    public b[] c;
    public final c g;
    private final a r;
    int a = 0;
    private HashMap<String, h> j = null;
    private int k = 32;
    private int l = this.k;
    public boolean d = false;
    private boolean[] m = new boolean[this.k];
    int e = 1;
    public int f = 0;
    private int n = this.k;
    private h[] o = new h[i];
    private int p = 0;
    private b[] q = new b[this.k];

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        h a(e eVar, boolean[] zArr);

        void a();

        void a(a aVar);

        h b();

        void c(h hVar);
    }

    public e() {
        this.c = null;
        this.c = new b[this.k];
        g();
        this.g = new c();
        this.b = new d(this.g);
        this.r = new b(this.g);
    }

    public static f a() {
        return h;
    }

    private void f() {
        this.k *= 2;
        this.c = (b[]) Arrays.copyOf(this.c, this.k);
        this.g.c = (h[]) Arrays.copyOf(this.g.c, this.k);
        this.m = new boolean[this.k];
        this.l = this.k;
        this.n = this.k;
        if (h != null) {
            h.d++;
            f fVar = h;
            fVar.p = Math.max(fVar.p, this.k);
            f fVar2 = h;
            fVar2.D = fVar2.p;
        }
    }

    private void g() {
        for (int i2 = 0; i2 < this.c.length; i2++) {
            b bVar = this.c[i2];
            if (bVar != null) {
                this.g.a.a(bVar);
            }
            this.c[i2] = null;
        }
    }

    public final void b() {
        for (int i2 = 0; i2 < this.g.c.length; i2++) {
            h hVar = this.g.c[i2];
            if (hVar != null) {
                hVar.b();
            }
        }
        this.g.b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.g.c, (Object) null);
        if (this.j != null) {
            this.j.clear();
        }
        this.a = 0;
        this.b.a();
        this.e = 1;
        for (int i3 = 0; i3 < this.f; i3++) {
            this.c[i3].c = false;
        }
        g();
        this.f = 0;
    }

    public final h a(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.l) {
            f();
        }
        if (obj instanceof android.support.constraint.solver.widgets.e) {
            android.support.constraint.solver.widgets.e eVar = (android.support.constraint.solver.widgets.e) obj;
            hVar = eVar.i;
            if (hVar == null) {
                eVar.a(this.g);
                hVar = eVar.i;
            }
            if (hVar.a == -1 || hVar.a > this.a || this.g.c[hVar.a] == null) {
                if (hVar.a != -1) {
                    hVar.b();
                }
                this.a++;
                this.e++;
                hVar.a = this.a;
                hVar.f = h.a.a;
                this.g.c[this.a] = hVar;
            }
        }
        return hVar;
    }

    public final b c() {
        b a2 = this.g.a.a();
        if (a2 == null) {
            a2 = new b(this.g);
        } else {
            a2.a = null;
            a2.d.a();
            a2.b = 0.0f;
            a2.e = false;
        }
        h.a();
        return a2;
    }

    public final h d() {
        if (h != null) {
            h.n++;
        }
        if (this.e + 1 >= this.l) {
            f();
        }
        h b = b(h.a.c, null);
        this.a++;
        this.e++;
        b.a = this.a;
        this.g.c[this.a] = b;
        return b;
    }

    public final void a(b bVar, int i2, int i3) {
        bVar.d.a(a(i3, (String) null), i2);
    }

    public final h a(int i2, String str) {
        if (h != null) {
            h.m++;
        }
        if (this.e + 1 >= this.l) {
            f();
        }
        h b = b(h.a.d, str);
        this.a++;
        this.e++;
        b.a = this.a;
        b.c = i2;
        this.g.c[this.a] = b;
        this.b.c(b);
        return b;
    }

    private h b(int i2, String str) {
        h a2 = this.g.b.a();
        if (a2 == null) {
            a2 = new h(i2, str);
            a2.f = i2;
        } else {
            a2.b();
            a2.f = i2;
        }
        if (this.p >= i) {
            i *= 2;
            this.o = (h[]) Arrays.copyOf(this.o, i);
        }
        h[] hVarArr = this.o;
        int i3 = this.p;
        this.p = i3 + 1;
        hVarArr[i3] = a2;
        return a2;
    }

    public static int b(Object obj) {
        h hVar = ((android.support.constraint.solver.widgets.e) obj).i;
        if (hVar != null) {
            return (int) (hVar.d + 0.5f);
        }
        return 0;
    }

    public final void a(a aVar) throws Exception {
        if (h != null) {
            h.t++;
            f fVar = h;
            fVar.u = Math.max(fVar.u, this.e);
            f fVar2 = h;
            fVar2.v = Math.max(fVar2.v, this.f);
        }
        b((b) aVar);
        b(aVar);
        a(aVar, false);
        e();
    }

    private final void b(b bVar) {
        if (this.f > 0) {
            bVar.d.a(bVar, this.c);
            if (bVar.d.a == 0) {
                bVar.e = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.support.constraint.solver.b r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.e.a(android.support.constraint.solver.b):void");
    }

    private final void c(b bVar) {
        if (this.c[this.f] != null) {
            this.g.a.a(this.c[this.f]);
        }
        this.c[this.f] = bVar;
        bVar.a.b = this.f;
        this.f++;
        bVar.a.c(bVar);
    }

    private final int a(a aVar, boolean z) {
        if (h != null) {
            h.h++;
        }
        for (int i2 = 0; i2 < this.e; i2++) {
            this.m[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (h != null) {
                h.i++;
            }
            i3++;
            if (i3 >= this.e * 2) {
                return i3;
            }
            if (aVar.b() != null) {
                this.m[aVar.b().a] = true;
            }
            h a2 = aVar.a(this, this.m);
            if (a2 != null) {
                if (this.m[a2.a]) {
                    return i3;
                }
                this.m[a2.a] = true;
            }
            if (a2 != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f; i5++) {
                    b bVar = this.c[i5];
                    if (bVar.a.f != h.a.a && !bVar.e && bVar.a(a2)) {
                        float a3 = bVar.d.a(a2);
                        if (a3 < 0.0f) {
                            float f2 = (-bVar.b) / a3;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 >= 0) {
                    b bVar2 = this.c[i4];
                    bVar2.a.b = -1;
                    if (h != null) {
                        h.j++;
                    }
                    bVar2.b(a2);
                    bVar2.a.b = i4;
                    bVar2.a.c(bVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    private int b(a aVar) throws Exception {
        float f;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            if (i2 >= this.f) {
                z = false;
                break;
            } else if (this.c[i2].a.f != h.a.a && this.c[i2].b < 0.0f) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                if (h != null) {
                    h.k++;
                }
                i3++;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                float f2 = Float.MAX_VALUE;
                int i7 = 0;
                while (i4 < this.f) {
                    b bVar = this.c[i4];
                    if (bVar.a.f != h.a.a && !bVar.e && bVar.b < f) {
                        int i8 = 1;
                        while (i8 < this.e) {
                            h hVar = this.g.c[i8];
                            float a2 = bVar.d.a(hVar);
                            if (a2 > f) {
                                int i9 = i7;
                                float f3 = f2;
                                int i10 = i6;
                                int i11 = i5;
                                for (int i12 = 0; i12 < 7; i12++) {
                                    float f4 = hVar.e[i12] / a2;
                                    if ((f4 < f3 && i12 == i9) || i12 > i9) {
                                        i10 = i8;
                                        i11 = i4;
                                        f3 = f4;
                                        i9 = i12;
                                    }
                                }
                                i5 = i11;
                                i6 = i10;
                                f2 = f3;
                                i7 = i9;
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    b bVar2 = this.c[i5];
                    bVar2.a.b = -1;
                    if (h != null) {
                        h.j++;
                    }
                    bVar2.b(this.g.c[i6]);
                    bVar2.a.b = i5;
                    bVar2.a.c(bVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.e / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i3;
        }
        return 0;
    }

    public void e() {
        for (int i2 = 0; i2 < this.f; i2++) {
            b bVar = this.c[i2];
            bVar.a.d = bVar.b;
        }
    }

    public final void a(h hVar, h hVar2, int i2, int i3) {
        b c = c();
        h d = d();
        d.c = 0;
        c.a(hVar, hVar2, d, i2);
        if (i3 != 6) {
            a(c, (int) (c.d.a(d) * (-1.0f)), i3);
        }
        a(c);
    }

    public final void b(h hVar, h hVar2, int i2, int i3) {
        b c = c();
        h d = d();
        d.c = 0;
        c.b(hVar, hVar2, d, i2);
        if (i3 != 6) {
            a(c, (int) (c.d.a(d) * (-1.0f)), i3);
        }
        a(c);
    }

    public final void a(h hVar, h hVar2, int i2, float f, h hVar3, h hVar4, int i3, int i4) {
        b c = c();
        if (hVar2 == hVar3) {
            c.d.a(hVar, 1.0f);
            c.d.a(hVar4, 1.0f);
            c.d.a(hVar2, -2.0f);
        } else if (f == 0.5f) {
            c.d.a(hVar, 1.0f);
            c.d.a(hVar2, -1.0f);
            c.d.a(hVar3, -1.0f);
            c.d.a(hVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                c.b = (-i2) + i3;
            }
        } else if (f <= 0.0f) {
            c.d.a(hVar, -1.0f);
            c.d.a(hVar2, 1.0f);
            c.b = i2;
        } else if (f >= 1.0f) {
            c.d.a(hVar3, -1.0f);
            c.d.a(hVar4, 1.0f);
            c.b = i3;
        } else {
            float f2 = 1.0f - f;
            c.d.a(hVar, f2 * 1.0f);
            c.d.a(hVar2, f2 * (-1.0f));
            c.d.a(hVar3, (-1.0f) * f);
            c.d.a(hVar4, 1.0f * f);
            if (i2 > 0 || i3 > 0) {
                c.b = ((-i2) * f2) + (i3 * f);
            }
        }
        if (i4 != 6) {
            c.a(this, i4);
        }
        a(c);
    }

    public final void a(h hVar, h hVar2, h hVar3, h hVar4, float f, int i2) {
        b c = c();
        c.a(hVar, hVar2, hVar3, hVar4, f);
        a(c);
    }

    public final b c(h hVar, h hVar2, int i2, int i3) {
        b c = c();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            c.b = i2;
        }
        if (!z) {
            c.d.a(hVar, -1.0f);
            c.d.a(hVar2, 1.0f);
        } else {
            c.d.a(hVar, 1.0f);
            c.d.a(hVar2, -1.0f);
        }
        if (i3 != 6) {
            c.a(this, i3);
        }
        a(c);
        return c;
    }

    public final void a(h hVar, int i2) {
        int i3 = hVar.b;
        if (hVar.b != -1) {
            b bVar = this.c[i3];
            if (bVar.e) {
                bVar.b = i2;
                return;
            } else if (bVar.d.a == 0) {
                bVar.e = true;
                bVar.b = i2;
                return;
            } else {
                b c = c();
                if (i2 < 0) {
                    c.b = i2 * (-1);
                    c.d.a(hVar, 1.0f);
                } else {
                    c.b = i2;
                    c.d.a(hVar, -1.0f);
                }
                a(c);
                return;
            }
        }
        b c2 = c();
        c2.a = hVar;
        float f = i2;
        hVar.d = f;
        c2.b = f;
        c2.e = true;
        a(c2);
    }

    public static b a(e eVar, h hVar, h hVar2, h hVar3, float f, boolean z) {
        b c = eVar.c();
        if (z) {
            c.a(eVar, 0);
        }
        c.d.a(hVar, -1.0f);
        c.d.a(hVar2, 1.0f - f);
        c.d.a(hVar3, f);
        return c;
    }
}
