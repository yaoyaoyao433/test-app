package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class ic implements il<ic, Object>, Serializable, Cloneable {
    private BitSet L = new BitSet(5);
    public String a;
    public hq b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    public long j;
    public String k;
    public String l;
    public long m;
    public String n;
    public int o;
    public String p;
    public int q;
    public String r;
    private static final jb s = new jb("XmPushActionRegistrationResult");
    private static final it t = new it("", (byte) 11, 1);
    private static final it u = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it v = new it("", (byte) 11, 3);
    private static final it w = new it("", (byte) 11, 4);
    private static final it x = new it("", (byte) 10, 6);
    private static final it y = new it("", (byte) 11, 7);
    private static final it z = new it("", (byte) 11, 8);
    private static final it A = new it("", (byte) 11, 9);
    private static final it B = new it("", (byte) 11, 10);
    private static final it C = new it("", (byte) 10, 11);
    private static final it D = new it("", (byte) 11, 12);
    private static final it E = new it("", (byte) 11, 13);
    private static final it F = new it("", (byte) 10, 14);
    private static final it G = new it("", (byte) 11, 15);
    private static final it H = new it("", (byte) 8, 16);
    private static final it I = new it("", (byte) 11, 17);
    private static final it J = new it("", (byte) 8, 18);
    private static final it K = new it("", (byte) 11, 19);

    private boolean a() {
        return this.a != null;
    }

    private boolean b() {
        return this.b != null;
    }

    private boolean c() {
        return this.c != null;
    }

    private boolean d() {
        return this.d != null;
    }

    private boolean e() {
        return this.L.get(0);
    }

    private boolean f() {
        return this.f != null;
    }

    private boolean g() {
        return this.g != null;
    }

    private boolean h() {
        return this.h != null;
    }

    private boolean i() {
        return this.i != null;
    }

    private boolean j() {
        return this.L.get(1);
    }

    private boolean k() {
        return this.k != null;
    }

    private boolean l() {
        return this.l != null;
    }

    private boolean m() {
        return this.L.get(2);
    }

    private boolean n() {
        return this.n != null;
    }

    private boolean o() {
        return this.L.get(3);
    }

    private boolean p() {
        return this.p != null;
    }

    private boolean q() {
        return this.L.get(4);
    }

    private boolean r() {
        return this.r != null;
    }

    private void s() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        s();
        if (this.a != null && a()) {
            iwVar.a(t);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(u);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(v);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(w);
            iwVar.a(this.d);
        }
        iwVar.a(x);
        iwVar.a(this.e);
        if (this.f != null && f()) {
            iwVar.a(y);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(z);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(A);
            iwVar.a(this.h);
        }
        if (this.i != null && i()) {
            iwVar.a(B);
            iwVar.a(this.i);
        }
        if (j()) {
            iwVar.a(C);
            iwVar.a(this.j);
        }
        if (this.k != null && k()) {
            iwVar.a(D);
            iwVar.a(this.k);
        }
        if (this.l != null && l()) {
            iwVar.a(E);
            iwVar.a(this.l);
        }
        if (m()) {
            iwVar.a(F);
            iwVar.a(this.m);
        }
        if (this.n != null && n()) {
            iwVar.a(G);
            iwVar.a(this.n);
        }
        if (o()) {
            iwVar.a(H);
            iwVar.a(this.o);
        }
        if (this.p != null && p()) {
            iwVar.a(I);
            iwVar.a(this.p);
        }
        if (q()) {
            iwVar.a(J);
            iwVar.a(this.q);
        }
        if (this.r != null && r()) {
            iwVar.a(K);
            iwVar.a(this.r);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        if (a()) {
            sb.append("debug:");
            sb.append(this.a == null ? StringUtil.NULL : this.a);
            z2 = false;
        } else {
            z2 = true;
        }
        if (b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.b == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.b);
            }
            z2 = false;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.c == null ? StringUtil.NULL : this.c);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.d == null ? StringUtil.NULL : this.d);
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.e);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("regSecret:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.j);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.k == null ? StringUtil.NULL : this.k);
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            sb.append(this.l == null ? StringUtil.NULL : this.l);
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.m);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            sb.append(this.n == null ? StringUtil.NULL : this.n);
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.o);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            sb.append(this.p == null ? StringUtil.NULL : this.p);
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.q);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            sb.append(this.r == null ? StringUtil.NULL : this.r);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        ic icVar;
        if (obj == null || !(obj instanceof ic) || (icVar = (ic) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = icVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(icVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = icVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(icVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = icVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(icVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = icVar.d();
        if (((d || d2) && !(d && d2 && this.d.equals(icVar.d))) || this.e != icVar.e) {
            return false;
        }
        boolean f = f();
        boolean f2 = icVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(icVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = icVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(icVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = icVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(icVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = icVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(icVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = icVar.j();
        if ((j || j2) && !(j && j2 && this.j == icVar.j)) {
            return false;
        }
        boolean k = k();
        boolean k2 = icVar.k();
        if ((k || k2) && !(k && k2 && this.k.equals(icVar.k))) {
            return false;
        }
        boolean l = l();
        boolean l2 = icVar.l();
        if ((l || l2) && !(l && l2 && this.l.equals(icVar.l))) {
            return false;
        }
        boolean m = m();
        boolean m2 = icVar.m();
        if ((m || m2) && !(m && m2 && this.m == icVar.m)) {
            return false;
        }
        boolean n = n();
        boolean n2 = icVar.n();
        if ((n || n2) && !(n && n2 && this.n.equals(icVar.n))) {
            return false;
        }
        boolean o = o();
        boolean o2 = icVar.o();
        if ((o || o2) && !(o && o2 && this.o == icVar.o)) {
            return false;
        }
        boolean p = p();
        boolean p2 = icVar.p();
        if ((p || p2) && !(p && p2 && this.p.equals(icVar.p))) {
            return false;
        }
        boolean q = q();
        boolean q2 = icVar.q();
        if ((q || q2) && !(q && q2 && this.q == icVar.q)) {
            return false;
        }
        boolean r = r();
        boolean r2 = icVar.r();
        if (r || r2) {
            return r && r2 && this.r.equals(icVar.r);
        }
        return true;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b != 0) {
                switch (b.c) {
                    case 1:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.a = iwVar.l();
                            break;
                        }
                    case 2:
                        if (b.b != 12) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.b = new hq();
                            this.b.a(iwVar);
                            break;
                        }
                    case 3:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.c = iwVar.l();
                            break;
                        }
                    case 4:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.d = iwVar.l();
                            break;
                        }
                    case 5:
                    default:
                        iz.a(iwVar, b.b);
                        break;
                    case 6:
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.e = iwVar.j();
                            this.L.set(0, true);
                            break;
                        }
                    case 7:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.f = iwVar.l();
                            break;
                        }
                    case 8:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.g = iwVar.l();
                            break;
                        }
                    case 9:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.h = iwVar.l();
                            break;
                        }
                    case 10:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.i = iwVar.l();
                            break;
                        }
                    case 11:
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.j = iwVar.j();
                            this.L.set(1, true);
                            break;
                        }
                    case 12:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.k = iwVar.l();
                            break;
                        }
                    case 13:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.l = iwVar.l();
                            break;
                        }
                    case 14:
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.m = iwVar.j();
                            this.L.set(2, true);
                            break;
                        }
                    case 15:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.n = iwVar.l();
                            break;
                        }
                    case 16:
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.o = iwVar.i();
                            this.L.set(3, true);
                            break;
                        }
                    case 17:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.p = iwVar.l();
                            break;
                        }
                    case 18:
                        if (b.b == 8) {
                            this.q = iwVar.i();
                            this.L.set(4, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 19:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.r = iwVar.l();
                            break;
                        }
                }
            } else if (e()) {
                s();
                return;
            } else {
                throw new ix("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        int a10;
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        ic icVar = (ic) obj;
        if (getClass().equals(icVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(icVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a18 = im.a(this.a, icVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(icVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a17 = im.a(this.b, icVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(icVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a16 = im.a(this.c, icVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(icVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a15 = im.a(this.d, icVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(icVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a14 = im.a(this.e, icVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(icVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a13 = im.a(this.f, icVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(icVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a12 = im.a(this.g, icVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(icVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a11 = im.a(this.h, icVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(icVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a10 = im.a(this.i, icVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(icVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a9 = im.a(this.j, icVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(icVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a8 = im.a(this.k, icVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(icVar.l()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!l() || (a7 = im.a(this.l, icVar.l)) == 0) {
                                                            int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(icVar.m()));
                                                            if (compareTo13 != 0) {
                                                                return compareTo13;
                                                            }
                                                            if (!m() || (a6 = im.a(this.m, icVar.m)) == 0) {
                                                                int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(icVar.n()));
                                                                if (compareTo14 != 0) {
                                                                    return compareTo14;
                                                                }
                                                                if (!n() || (a5 = im.a(this.n, icVar.n)) == 0) {
                                                                    int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(icVar.o()));
                                                                    if (compareTo15 != 0) {
                                                                        return compareTo15;
                                                                    }
                                                                    if (!o() || (a4 = im.a(this.o, icVar.o)) == 0) {
                                                                        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(icVar.p()));
                                                                        if (compareTo16 != 0) {
                                                                            return compareTo16;
                                                                        }
                                                                        if (!p() || (a3 = im.a(this.p, icVar.p)) == 0) {
                                                                            int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(icVar.q()));
                                                                            if (compareTo17 != 0) {
                                                                                return compareTo17;
                                                                            }
                                                                            if (!q() || (a2 = im.a(this.q, icVar.q)) == 0) {
                                                                                int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(icVar.r()));
                                                                                if (compareTo18 != 0) {
                                                                                    return compareTo18;
                                                                                }
                                                                                if (!r() || (a = im.a(this.r, icVar.r)) == 0) {
                                                                                    return 0;
                                                                                }
                                                                                return a;
                                                                            }
                                                                            return a2;
                                                                        }
                                                                        return a3;
                                                                    }
                                                                    return a4;
                                                                }
                                                                return a5;
                                                            }
                                                            return a6;
                                                        }
                                                        return a7;
                                                    }
                                                    return a8;
                                                }
                                                return a9;
                                            }
                                            return a10;
                                        }
                                        return a11;
                                    }
                                    return a12;
                                }
                                return a13;
                            }
                            return a14;
                        }
                        return a15;
                    }
                    return a16;
                }
                return a17;
            }
            return a18;
        }
        return getClass().getName().compareTo(icVar.getClass().getName());
    }
}
