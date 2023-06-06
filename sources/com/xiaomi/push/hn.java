package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class hn implements il<hn, Object>, Serializable, Cloneable {
    public hq a;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public ho l;
    public String m;
    public String o;
    public long p;
    public String q;
    public String r;
    private static final jb s = new jb("PushMessage");
    private static final it t = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 1);
    private static final it u = new it("", (byte) 11, 2);
    private static final it v = new it("", (byte) 11, 3);
    private static final it w = new it("", (byte) 11, 4);
    private static final it x = new it("", (byte) 10, 5);
    private static final it y = new it("", (byte) 10, 6);
    private static final it z = new it("", (byte) 11, 7);
    private static final it A = new it("", (byte) 11, 8);
    private static final it B = new it("", (byte) 11, 9);
    private static final it C = new it("", (byte) 11, 10);
    private static final it D = new it("", (byte) 11, 11);
    private static final it E = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 12);
    private static final it F = new it("", (byte) 11, 13);
    private static final it G = new it("", (byte) 2, 14);
    private static final it H = new it("", (byte) 11, 15);
    private static final it I = new it("", (byte) 10, 16);
    private static final it J = new it("", (byte) 11, 20);
    private static final it K = new it("", (byte) 11, 21);
    private BitSet L = new BitSet(4);
    public boolean n = false;

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
        return this.L.get(1);
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
        return this.j != null;
    }

    private boolean k() {
        return this.k != null;
    }

    private boolean l() {
        return this.l != null;
    }

    private boolean m() {
        return this.m != null;
    }

    private boolean n() {
        return this.L.get(2);
    }

    private boolean o() {
        return this.o != null;
    }

    private boolean p() {
        return this.L.get(3);
    }

    private boolean q() {
        return this.q != null;
    }

    private boolean r() {
        return this.r != null;
    }

    private void s() {
        if (this.b == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.c == null) {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'payload' was not present! Struct: " + toString());
        }
    }

    public final boolean a(hn hnVar) {
        if (hnVar == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hnVar.a();
        if ((a || a2) && !(a && a2 && this.a.a(hnVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = hnVar.b();
        if ((b || b2) && !(b && b2 && this.b.equals(hnVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = hnVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(hnVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = hnVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(hnVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = hnVar.e();
        if ((e || e2) && !(e && e2 && this.e == hnVar.e)) {
            return false;
        }
        boolean f = f();
        boolean f2 = hnVar.f();
        if ((f || f2) && !(f && f2 && this.f == hnVar.f)) {
            return false;
        }
        boolean g = g();
        boolean g2 = hnVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(hnVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = hnVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(hnVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = hnVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(hnVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = hnVar.j();
        if ((j || j2) && !(j && j2 && this.j.equals(hnVar.j))) {
            return false;
        }
        boolean k = k();
        boolean k2 = hnVar.k();
        if ((k || k2) && !(k && k2 && this.k.equals(hnVar.k))) {
            return false;
        }
        boolean l = l();
        boolean l2 = hnVar.l();
        if ((l || l2) && !(l && l2 && this.l.a(hnVar.l))) {
            return false;
        }
        boolean m = m();
        boolean m2 = hnVar.m();
        if ((m || m2) && !(m && m2 && this.m.equals(hnVar.m))) {
            return false;
        }
        boolean n = n();
        boolean n2 = hnVar.n();
        if ((n || n2) && !(n && n2 && this.n == hnVar.n)) {
            return false;
        }
        boolean o = o();
        boolean o2 = hnVar.o();
        if ((o || o2) && !(o && o2 && this.o.equals(hnVar.o))) {
            return false;
        }
        boolean p = p();
        boolean p2 = hnVar.p();
        if ((p || p2) && !(p && p2 && this.p == hnVar.p)) {
            return false;
        }
        boolean q = q();
        boolean q2 = hnVar.q();
        if ((q || q2) && !(q && q2 && this.q.equals(hnVar.q))) {
            return false;
        }
        boolean r = r();
        boolean r2 = hnVar.r();
        if (r || r2) {
            return r && r2 && this.r.equals(hnVar.r);
        }
        return true;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        s();
        if (this.a != null && a()) {
            iwVar.a(t);
            this.a.b(iwVar);
        }
        if (this.b != null) {
            iwVar.a(u);
            iwVar.a(this.b);
        }
        if (this.c != null) {
            iwVar.a(v);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(w);
            iwVar.a(this.d);
        }
        if (e()) {
            iwVar.a(x);
            iwVar.a(this.e);
        }
        if (f()) {
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
        if (this.j != null && j()) {
            iwVar.a(C);
            iwVar.a(this.j);
        }
        if (this.k != null && k()) {
            iwVar.a(D);
            iwVar.a(this.k);
        }
        if (this.l != null && l()) {
            iwVar.a(E);
            this.l.b(iwVar);
        }
        if (this.m != null && m()) {
            iwVar.a(F);
            iwVar.a(this.m);
        }
        if (n()) {
            iwVar.a(G);
            iwVar.a(this.n);
        }
        if (this.o != null && o()) {
            iwVar.a(H);
            iwVar.a(this.o);
        }
        if (p()) {
            iwVar.a(I);
            iwVar.a(this.p);
        }
        if (this.q != null && q()) {
            iwVar.a(J);
            iwVar.a(this.q);
        }
        if (this.r != null && r()) {
            iwVar.a(K);
            iwVar.a(this.r);
        }
        iwVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof hn)) {
            return a((hn) obj);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (a()) {
            sb.append("to:");
            if (this.a == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.a);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.b == null ? StringUtil.NULL : this.b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.c == null ? StringUtil.NULL : this.c);
        sb.append(", ");
        sb.append("payload:");
        sb.append(this.d == null ? StringUtil.NULL : this.d);
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.j == null ? StringUtil.NULL : this.j);
        }
        if (k()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.k == null ? StringUtil.NULL : this.k);
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            if (this.l == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.l);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.m == null ? StringUtil.NULL : this.m);
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.n);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            sb.append(this.o == null ? StringUtil.NULL : this.o);
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.p);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            sb.append(this.q == null ? StringUtil.NULL : this.q);
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.r == null ? StringUtil.NULL : this.r);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b != 0) {
                switch (b.c) {
                    case 1:
                        if (b.b != 12) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.a = new hq();
                            this.a.a(iwVar);
                            break;
                        }
                    case 2:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.b = iwVar.l();
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
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.e = iwVar.j();
                            this.L.set(0, true);
                            break;
                        }
                    case 6:
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.f = iwVar.j();
                            this.L.set(1, true);
                            break;
                        }
                    case 7:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.g = iwVar.l();
                            break;
                        }
                    case 8:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.h = iwVar.l();
                            break;
                        }
                    case 9:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.i = iwVar.l();
                            break;
                        }
                    case 10:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.j = iwVar.l();
                            break;
                        }
                    case 11:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.k = iwVar.l();
                            break;
                        }
                    case 12:
                        if (b.b != 12) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.l = new ho();
                            this.l.a(iwVar);
                            break;
                        }
                    case 13:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.m = iwVar.l();
                            break;
                        }
                    case 14:
                        if (b.b != 2) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.n = iwVar.f();
                            this.L.set(2, true);
                            break;
                        }
                    case 15:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.o = iwVar.l();
                            break;
                        }
                    case 16:
                        if (b.b == 10) {
                            this.p = iwVar.j();
                            this.L.set(3, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 17:
                    case 18:
                    case 19:
                    default:
                        iz.a(iwVar, b.b);
                        break;
                    case 20:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.q = iwVar.l();
                            break;
                        }
                    case 21:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.r = iwVar.l();
                            break;
                        }
                }
            } else {
                s();
                return;
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
        hn hnVar = (hn) obj;
        if (getClass().equals(hnVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hnVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a18 = im.a(this.a, hnVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hnVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a17 = im.a(this.b, hnVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hnVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a16 = im.a(this.c, hnVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hnVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a15 = im.a(this.d, hnVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hnVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a14 = im.a(this.e, hnVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hnVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a13 = im.a(this.f, hnVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hnVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a12 = im.a(this.g, hnVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hnVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a11 = im.a(this.h, hnVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hnVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a10 = im.a(this.i, hnVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hnVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a9 = im.a(this.j, hnVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hnVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a8 = im.a(this.k, hnVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(hnVar.l()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!l() || (a7 = im.a(this.l, hnVar.l)) == 0) {
                                                            int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(hnVar.m()));
                                                            if (compareTo13 != 0) {
                                                                return compareTo13;
                                                            }
                                                            if (!m() || (a6 = im.a(this.m, hnVar.m)) == 0) {
                                                                int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(hnVar.n()));
                                                                if (compareTo14 != 0) {
                                                                    return compareTo14;
                                                                }
                                                                if (!n() || (a5 = im.a(this.n, hnVar.n)) == 0) {
                                                                    int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(hnVar.o()));
                                                                    if (compareTo15 != 0) {
                                                                        return compareTo15;
                                                                    }
                                                                    if (!o() || (a4 = im.a(this.o, hnVar.o)) == 0) {
                                                                        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(hnVar.p()));
                                                                        if (compareTo16 != 0) {
                                                                            return compareTo16;
                                                                        }
                                                                        if (!p() || (a3 = im.a(this.p, hnVar.p)) == 0) {
                                                                            int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(hnVar.q()));
                                                                            if (compareTo17 != 0) {
                                                                                return compareTo17;
                                                                            }
                                                                            if (!q() || (a2 = im.a(this.q, hnVar.q)) == 0) {
                                                                                int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(hnVar.r()));
                                                                                if (compareTo18 != 0) {
                                                                                    return compareTo18;
                                                                                }
                                                                                if (!r() || (a = im.a(this.r, hnVar.r)) == 0) {
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
        return getClass().getName().compareTo(hnVar.getClass().getName());
    }
}
