package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.e;
import android.support.constraint.solver.widgets.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static boolean a(f fVar, h hVar, List<h> list, boolean z) {
        if (fVar == null) {
            return true;
        }
        fVar.ag = false;
        g gVar = (g) fVar.H;
        if (fVar.t == null) {
            fVar.af = true;
            hVar.a.add(fVar);
            fVar.t = hVar;
            if (fVar.w.d == null && fVar.y.d == null && fVar.x.d == null && fVar.z.d == null && fVar.A.d == null && fVar.D.d == null) {
                a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (fVar.x.d != null && fVar.z.d != null) {
                int i = f.a.b;
                if (z) {
                    a(gVar, fVar, hVar);
                    return false;
                } else if (fVar.x.d.b != fVar.H || fVar.z.d.b != fVar.H) {
                    a(gVar, fVar, hVar);
                }
            }
            if (fVar.w.d != null && fVar.y.d != null) {
                int i2 = f.a.b;
                if (z) {
                    a(gVar, fVar, hVar);
                    return false;
                } else if (fVar.w.d.b != fVar.H || fVar.y.d.b != fVar.H) {
                    a(gVar, fVar, hVar);
                }
            }
            if (((fVar.y() == f.a.c) ^ (fVar.z() == f.a.c)) && fVar.K != 0.0f) {
                a(fVar);
            } else if (fVar.y() == f.a.c || fVar.z() == f.a.c) {
                a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (((fVar.w.d == null && fVar.y.d == null) || ((fVar.w.d != null && fVar.w.d.b == fVar.H && fVar.y.d == null) || ((fVar.y.d != null && fVar.y.d.b == fVar.H && fVar.w.d == null) || (fVar.w.d != null && fVar.w.d.b == fVar.H && fVar.y.d != null && fVar.y.d.b == fVar.H)))) && fVar.D.d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.f.add(fVar);
            }
            if (((fVar.x.d == null && fVar.z.d == null) || ((fVar.x.d != null && fVar.x.d.b == fVar.H && fVar.z.d == null) || ((fVar.z.d != null && fVar.z.d.b == fVar.H && fVar.x.d == null) || (fVar.x.d != null && fVar.x.d.b == fVar.H && fVar.z.d != null && fVar.z.d.b == fVar.H)))) && fVar.D.d == null && fVar.A.d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.g.add(fVar);
            }
            if (fVar instanceof j) {
                a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
                j jVar = (j) fVar;
                for (int i3 = 0; i3 < jVar.as; i3++) {
                    if (!a(jVar.ar[i3], hVar, list, z)) {
                        return false;
                    }
                }
            }
            int length = fVar.E.length;
            for (int i4 = 0; i4 < length; i4++) {
                e eVar = fVar.E[i4];
                if (eVar.d != null && eVar.d.b != fVar.H) {
                    if (eVar.c == e.c.CENTER) {
                        a(gVar, fVar, hVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        m mVar = eVar.a;
                        if (eVar.d != null && eVar.d.d != eVar) {
                            eVar.d.a.a(mVar);
                        }
                    }
                    if (!a(eVar.d.b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (fVar.t != hVar) {
            hVar.a.addAll(fVar.t.a);
            hVar.f.addAll(fVar.t.f);
            hVar.g.addAll(fVar.t.g);
            if (!fVar.t.d) {
                hVar.d = false;
            }
            list.remove(fVar.t);
            for (f fVar2 : fVar.t.a) {
                fVar2.t = hVar;
            }
        }
        return true;
    }

    private static void a(g gVar, f fVar, h hVar) {
        hVar.d = false;
        gVar.aG = false;
        fVar.af = false;
    }

    private static int a(f fVar, int i, boolean z, int i2) {
        int n;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int m;
        int i8;
        int i9;
        f fVar2;
        int i10 = 0;
        if (fVar.af) {
            boolean z2 = fVar.A.d != null && i == 1;
            if (z) {
                n = fVar.S;
                i3 = fVar.n() - fVar.S;
                i5 = i * 2;
                i4 = i5 + 1;
            } else {
                n = fVar.n() - fVar.S;
                i3 = fVar.S;
                i4 = i * 2;
                i5 = i4 + 1;
            }
            if (fVar.E[i4].d == null || fVar.E[i5].d != null) {
                i6 = i4;
                i7 = 1;
            } else {
                i6 = i5;
                i5 = i4;
                i7 = -1;
            }
            int i11 = z2 ? i2 - n : i2;
            int a = (fVar.E[i5].a() * i7) + a(fVar, i);
            int i12 = i11 + a;
            int m2 = (i == 0 ? fVar.m() : fVar.n()) * i7;
            Iterator<o> it = fVar.E[i5].a.h.iterator();
            while (it.hasNext()) {
                i10 = Math.max(i10, a(((m) it.next()).a.b, i, z, i12));
            }
            int i13 = 0;
            for (Iterator<o> it2 = fVar.E[i6].a.h.iterator(); it2.hasNext(); it2 = it2) {
                i13 = Math.max(i13, a(((m) it2.next()).a.b, i, z, m2 + i12));
            }
            if (z2) {
                i10 -= n;
                m = i13 + i3;
            } else {
                m = i13 + ((i == 0 ? fVar.m() : fVar.n()) * i7);
            }
            int i14 = 1;
            if (i == 1) {
                Iterator<o> it3 = fVar.A.a.h.iterator();
                int i15 = 0;
                while (it3.hasNext()) {
                    Iterator<o> it4 = it3;
                    m mVar = (m) it3.next();
                    if (i7 == i14) {
                        i15 = Math.max(i15, a(mVar.a.b, i, z, n + i12));
                        it3 = it4;
                    } else {
                        i15 = Math.max(i15, a(mVar.a.b, i, z, (i3 * i7) + i12));
                        it3 = it4;
                        i6 = i6;
                    }
                    i14 = 1;
                }
                i8 = i6;
                int i16 = i15;
                i9 = (fVar.A.a.h.size() <= 0 || z2) ? i16 : i7 == 1 ? i16 + n : i16 - i3;
            } else {
                i8 = i6;
                i9 = 0;
            }
            int max = a + Math.max(i10, Math.max(m, i9));
            int i17 = i12 + m2;
            if (i7 == -1) {
                i12 = i17;
                i17 = i12;
            }
            if (z) {
                k.a(fVar, i, i12);
                fVar.a(i12, i17, i);
            } else {
                fVar.t.a(fVar, i);
                fVar.e(i12, i);
            }
            if (fVar.j(i) == f.a.c && fVar.K != 0.0f) {
                fVar.t.a(fVar, i);
            }
            if (fVar.E[i5].d != null && fVar.E[i8].d != null && fVar.E[i5].d.b == (fVar2 = fVar.H) && fVar.E[i8].d.b == fVar2) {
                fVar.t.a(fVar, i);
            }
            return max;
        }
        return 0;
    }

    private static void b(g gVar) {
        gVar.az.clear();
        gVar.az.add(0, new h(gVar.aK));
    }

    public static void a(List<h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (f fVar : list.get(i3).a(i)) {
                if (fVar.af) {
                    a(fVar, i, i2);
                }
            }
        }
    }

    private static void a(f fVar, int i, int i2) {
        int i3 = i * 2;
        e eVar = fVar.E[i3];
        e eVar2 = fVar.E[i3 + 1];
        if ((eVar.d == null || eVar2.d == null) ? false : true) {
            k.a(fVar, i, a(fVar, i) + eVar.a());
        } else if (fVar.K != 0.0f && fVar.j(i) == f.a.c) {
            int a = a(fVar);
            int i4 = (int) fVar.E[i3].a.f;
            eVar2.a.e = eVar.a;
            eVar2.a.f = a;
            eVar2.a.i = 1;
            fVar.a(i4, i4 + a, i);
        } else {
            int i5 = i2 - fVar.i(i);
            int b = i5 - fVar.b(i);
            fVar.a(b, i5, i);
            k.a(fVar, i, b);
        }
    }

    private static int a(f fVar, int i) {
        int i2 = i * 2;
        e eVar = fVar.E[i2];
        e eVar2 = fVar.E[i2 + 1];
        if (eVar.d == null || eVar.d.b != fVar.H || eVar2.d == null || eVar2.d.b != fVar.H) {
            return 0;
        }
        return (int) ((((fVar.H.b(i) - eVar.a()) - eVar2.a()) - fVar.b(i)) * (i == 0 ? fVar.Y : fVar.Z));
    }

    private static int a(f fVar) {
        int m;
        int n;
        if (fVar.y() == f.a.c) {
            if (fVar.L == 0) {
                n = (int) (fVar.n() * fVar.K);
            } else {
                n = (int) (fVar.n() / fVar.K);
            }
            fVar.e(n);
            return n;
        } else if (fVar.z() == f.a.c) {
            if (fVar.L == 1) {
                m = (int) (fVar.m() * fVar.K);
            } else {
                m = (int) (fVar.m() / fVar.K);
            }
            fVar.f(m);
            return m;
        } else {
            return -1;
        }
    }

    public static void a(g gVar) {
        if ((gVar.aF & 32) != 32) {
            b(gVar);
            return;
        }
        gVar.aG = true;
        gVar.aA = false;
        gVar.aB = false;
        gVar.aC = false;
        ArrayList<f> arrayList = gVar.aK;
        List<h> list = gVar.az;
        boolean z = gVar.y() == f.a.b;
        boolean z2 = gVar.z() == f.a.b;
        boolean z3 = z || z2;
        list.clear();
        for (f fVar : arrayList) {
            fVar.t = null;
            fVar.ah = false;
            fVar.b();
        }
        for (f fVar2 : arrayList) {
            if (fVar2.t == null) {
                h hVar = new h(new ArrayList(), true);
                list.add(hVar);
                if (!a(fVar2, hVar, list, z3)) {
                    b(gVar);
                    gVar.aG = false;
                    return;
                }
            }
        }
        int i = 0;
        int i2 = 0;
        for (h hVar2 : list) {
            i = Math.max(i, a(hVar2, 0));
            i2 = Math.max(i2, a(hVar2, 1));
        }
        if (z) {
            gVar.k(f.a.a);
            gVar.e(i);
            gVar.aA = true;
            gVar.aB = true;
            gVar.aD = i;
        }
        if (z2) {
            gVar.l(f.a.a);
            gVar.f(i2);
            gVar.aA = true;
            gVar.aC = true;
            gVar.aE = i2;
        }
        a(list, 0, gVar.m());
        a(list, 1, gVar.n());
    }

    private static int a(h hVar, int i) {
        List<f> list;
        int i2 = i * 2;
        if (i == 0) {
            list = hVar.f;
        } else {
            list = i == 1 ? hVar.g : null;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = list.get(i4);
            int i5 = i2 + 1;
            i3 = Math.max(i3, a(fVar, i, fVar.E[i5].d == null || !(fVar.E[i2].d == null || fVar.E[i5].d == null), 0));
        }
        hVar.e[i] = i3;
        return i3;
    }
}
