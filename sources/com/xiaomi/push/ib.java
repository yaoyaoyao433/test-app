package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ib implements il<ib, Object>, Serializable, Cloneable {
    private static final jb D = new jb("XmPushActionRegistration");
    private static final it E = new it("", (byte) 11, 1);
    private static final it F = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it G = new it("", (byte) 11, 3);
    private static final it H = new it("", (byte) 11, 4);
    private static final it I = new it("", (byte) 11, 5);
    private static final it J = new it("", (byte) 11, 6);
    private static final it K = new it("", (byte) 11, 7);
    private static final it L = new it("", (byte) 11, 8);
    private static final it M = new it("", (byte) 11, 9);
    private static final it N = new it("", (byte) 11, 10);
    private static final it O = new it("", (byte) 11, 11);
    private static final it P = new it("", (byte) 11, 12);
    private static final it Q = new it("", (byte) 8, 13);
    private static final it R = new it("", (byte) 8, 14);
    private static final it S = new it("", (byte) 11, 15);
    private static final it T = new it("", (byte) 11, 16);
    private static final it U = new it("", (byte) 11, 17);
    private static final it V = new it("", (byte) 11, 18);
    private static final it W = new it("", (byte) 8, 19);
    private static final it X = new it("", (byte) 8, 20);
    private static final it Y = new it("", (byte) 2, 21);
    private static final it Z = new it("", (byte) 10, 22);
    private static final it aa = new it("", (byte) 10, 23);
    private static final it ab = new it("", (byte) 11, 24);
    private static final it ac = new it("", (byte) 11, 25);
    private static final it ad = new it("", (byte) 2, 26);
    private static final it ae = new it("", (byte) 13, 100);
    private static final it af = new it("", (byte) 2, 101);
    private static final it ag = new it("", (byte) 11, 102);
    public Map<String, String> A;
    public String C;
    public String a;
    public hq b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public int n;
    public String o;
    public String p;
    public String q;
    public String r;
    public int s;
    public hp t;
    public long v;
    public long w;
    public String x;
    public String y;
    private BitSet ah = new BitSet(8);
    public boolean u = true;
    public boolean B = false;
    public boolean z = false;

    private boolean A() {
        return this.A != null;
    }

    private boolean B() {
        return this.ah.get(7);
    }

    private boolean C() {
        return this.C != null;
    }

    private void D() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d == null) {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.g != null) {
        } else {
            throw new ix("Required field 'token' was not present! Struct: " + toString());
        }
    }

    private void a(boolean z) {
        this.ah.set(0, true);
    }

    private boolean a() {
        return this.a != null;
    }

    private void b(boolean z) {
        this.ah.set(1, true);
    }

    private boolean b() {
        return this.b != null;
    }

    private void c(boolean z) {
        this.ah.set(2, true);
    }

    private boolean c() {
        return this.c != null;
    }

    private boolean d() {
        return this.d != null;
    }

    private boolean e() {
        return this.e != null;
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
        return this.j != null;
    }

    private boolean k() {
        return this.k != null;
    }

    private boolean l() {
        return this.l != null;
    }

    private boolean m() {
        return this.ah.get(0);
    }

    private boolean n() {
        return this.ah.get(1);
    }

    private boolean o() {
        return this.o != null;
    }

    private boolean p() {
        return this.p != null;
    }

    private boolean q() {
        return this.q != null;
    }

    private boolean r() {
        return this.r != null;
    }

    private boolean s() {
        return this.ah.get(2);
    }

    private boolean t() {
        return this.t != null;
    }

    private boolean u() {
        return this.ah.get(3);
    }

    private boolean v() {
        return this.ah.get(4);
    }

    private boolean w() {
        return this.ah.get(5);
    }

    private boolean x() {
        return this.x != null;
    }

    private boolean y() {
        return this.y != null;
    }

    private boolean z() {
        return this.ah.get(6);
    }

    public final ib a(int i) {
        this.m = 40082;
        a(true);
        return this;
    }

    public final ib b(int i) {
        this.n = i;
        b(true);
        return this;
    }

    public final ib c(int i) {
        this.s = i;
        c(true);
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        if (a()) {
            sb.append("debug:");
            sb.append(this.a == null ? StringUtil.NULL : this.a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.b == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.b);
            }
            z = false;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.c == null ? StringUtil.NULL : this.c);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.d == null ? StringUtil.NULL : this.d);
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        sb.append(", ");
        sb.append("token:");
        sb.append(this.g == null ? StringUtil.NULL : this.g);
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            sb.append(this.j == null ? StringUtil.NULL : this.j);
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.k == null ? StringUtil.NULL : this.k);
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            sb.append(this.l == null ? StringUtil.NULL : this.l);
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.m);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.n);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            sb.append(this.o == null ? StringUtil.NULL : this.o);
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            sb.append(this.p == null ? StringUtil.NULL : this.p);
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            sb.append(this.q == null ? StringUtil.NULL : this.q);
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            sb.append(this.r == null ? StringUtil.NULL : this.r);
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.s);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.t == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.t);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.u);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.v);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.w);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            sb.append(this.x == null ? StringUtil.NULL : this.x);
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            sb.append(this.y == null ? StringUtil.NULL : this.y);
        }
        if (z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.z);
        }
        if (A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            if (this.A == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.A);
            }
        }
        if (B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.B);
        }
        if (C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            sb.append(this.C == null ? StringUtil.NULL : this.C);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        ib ibVar;
        if (obj == null || !(obj instanceof ib) || (ibVar = (ib) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = ibVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(ibVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = ibVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(ibVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = ibVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(ibVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = ibVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(ibVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = ibVar.e();
        if ((e || e2) && !(e && e2 && this.e.equals(ibVar.e))) {
            return false;
        }
        boolean f = f();
        boolean f2 = ibVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(ibVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = ibVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(ibVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = ibVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(ibVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = ibVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(ibVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = ibVar.j();
        if ((j || j2) && !(j && j2 && this.j.equals(ibVar.j))) {
            return false;
        }
        boolean k = k();
        boolean k2 = ibVar.k();
        if ((k || k2) && !(k && k2 && this.k.equals(ibVar.k))) {
            return false;
        }
        boolean l = l();
        boolean l2 = ibVar.l();
        if ((l || l2) && !(l && l2 && this.l.equals(ibVar.l))) {
            return false;
        }
        boolean m = m();
        boolean m2 = ibVar.m();
        if ((m || m2) && !(m && m2 && this.m == ibVar.m)) {
            return false;
        }
        boolean n = n();
        boolean n2 = ibVar.n();
        if ((n || n2) && !(n && n2 && this.n == ibVar.n)) {
            return false;
        }
        boolean o = o();
        boolean o2 = ibVar.o();
        if ((o || o2) && !(o && o2 && this.o.equals(ibVar.o))) {
            return false;
        }
        boolean p = p();
        boolean p2 = ibVar.p();
        if ((p || p2) && !(p && p2 && this.p.equals(ibVar.p))) {
            return false;
        }
        boolean q = q();
        boolean q2 = ibVar.q();
        if ((q || q2) && !(q && q2 && this.q.equals(ibVar.q))) {
            return false;
        }
        boolean r = r();
        boolean r2 = ibVar.r();
        if ((r || r2) && !(r && r2 && this.r.equals(ibVar.r))) {
            return false;
        }
        boolean s = s();
        boolean s2 = ibVar.s();
        if ((s || s2) && !(s && s2 && this.s == ibVar.s)) {
            return false;
        }
        boolean t = t();
        boolean t2 = ibVar.t();
        if ((t || t2) && !(t && t2 && this.t.equals(ibVar.t))) {
            return false;
        }
        boolean u = u();
        boolean u2 = ibVar.u();
        if ((u || u2) && !(u && u2 && this.u == ibVar.u)) {
            return false;
        }
        boolean v = v();
        boolean v2 = ibVar.v();
        if ((v || v2) && !(v && v2 && this.v == ibVar.v)) {
            return false;
        }
        boolean w = w();
        boolean w2 = ibVar.w();
        if ((w || w2) && !(w && w2 && this.w == ibVar.w)) {
            return false;
        }
        boolean x = x();
        boolean x2 = ibVar.x();
        if ((x || x2) && !(x && x2 && this.x.equals(ibVar.x))) {
            return false;
        }
        boolean y = y();
        boolean y2 = ibVar.y();
        if ((y || y2) && !(y && y2 && this.y.equals(ibVar.y))) {
            return false;
        }
        boolean z = z();
        boolean z2 = ibVar.z();
        if ((z || z2) && !(z && z2 && this.z == ibVar.z)) {
            return false;
        }
        boolean A = A();
        boolean A2 = ibVar.A();
        if ((A || A2) && !(A && A2 && this.A.equals(ibVar.A))) {
            return false;
        }
        boolean B = B();
        boolean B2 = ibVar.B();
        if ((B || B2) && !(B && B2 && this.B == ibVar.B)) {
            return false;
        }
        boolean C = C();
        boolean C2 = ibVar.C();
        if (C || C2) {
            return C && C2 && this.C.equals(ibVar.C);
        }
        return true;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b != 0) {
                short s = b.c;
                switch (s) {
                    case 1:
                        if (b.b == 11) {
                            this.a = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 2:
                        if (b.b == 12) {
                            this.b = new hq();
                            this.b.a(iwVar);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 3:
                        if (b.b == 11) {
                            this.c = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 4:
                        if (b.b == 11) {
                            this.d = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 5:
                        if (b.b == 11) {
                            this.e = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 6:
                        if (b.b == 11) {
                            this.f = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 7:
                        if (b.b == 11) {
                            this.g = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 8:
                        if (b.b == 11) {
                            this.h = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 9:
                        if (b.b == 11) {
                            this.i = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 10:
                        if (b.b == 11) {
                            this.j = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 11:
                        if (b.b == 11) {
                            this.k = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 12:
                        if (b.b == 11) {
                            this.l = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 13:
                        if (b.b == 8) {
                            this.m = iwVar.i();
                            a(true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 14:
                        if (b.b == 8) {
                            this.n = iwVar.i();
                            b(true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 15:
                        if (b.b == 11) {
                            this.o = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 16:
                        if (b.b == 11) {
                            this.p = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 17:
                        if (b.b == 11) {
                            this.q = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 18:
                        if (b.b == 11) {
                            this.r = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 19:
                        if (b.b == 8) {
                            this.s = iwVar.i();
                            c(true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 20:
                        if (b.b == 8) {
                            this.t = hp.a(iwVar.i());
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 21:
                        if (b.b == 2) {
                            this.u = iwVar.f();
                            this.ah.set(3, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 22:
                        if (b.b == 10) {
                            this.v = iwVar.j();
                            this.ah.set(4, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 23:
                        if (b.b == 10) {
                            this.w = iwVar.j();
                            this.ah.set(5, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 24:
                        if (b.b == 11) {
                            this.x = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 25:
                        if (b.b == 11) {
                            this.y = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 26:
                        if (b.b == 2) {
                            this.z = iwVar.f();
                            this.ah.set(6, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    default:
                        switch (s) {
                            case 100:
                                if (b.b == 13) {
                                    iv c = iwVar.c();
                                    this.A = new HashMap(c.c * 2);
                                    for (int i = 0; i < c.c; i++) {
                                        this.A.put(iwVar.l(), iwVar.l());
                                    }
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            case 101:
                                if (b.b == 2) {
                                    this.B = iwVar.f();
                                    this.ah.set(7, true);
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            case 102:
                                if (b.b == 11) {
                                    this.C = iwVar.l();
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            default:
                                iz.a(iwVar, b.b);
                                break;
                        }
                }
            } else {
                D();
                return;
            }
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        D();
        if (this.a != null && a()) {
            iwVar.a(E);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(F);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(G);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(H);
            iwVar.a(this.d);
        }
        if (this.e != null && e()) {
            iwVar.a(I);
            iwVar.a(this.e);
        }
        if (this.f != null && f()) {
            iwVar.a(J);
            iwVar.a(this.f);
        }
        if (this.g != null) {
            iwVar.a(K);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(L);
            iwVar.a(this.h);
        }
        if (this.i != null && i()) {
            iwVar.a(M);
            iwVar.a(this.i);
        }
        if (this.j != null && j()) {
            iwVar.a(N);
            iwVar.a(this.j);
        }
        if (this.k != null && k()) {
            iwVar.a(O);
            iwVar.a(this.k);
        }
        if (this.l != null && l()) {
            iwVar.a(P);
            iwVar.a(this.l);
        }
        if (m()) {
            iwVar.a(Q);
            iwVar.a(this.m);
        }
        if (n()) {
            iwVar.a(R);
            iwVar.a(this.n);
        }
        if (this.o != null && o()) {
            iwVar.a(S);
            iwVar.a(this.o);
        }
        if (this.p != null && p()) {
            iwVar.a(T);
            iwVar.a(this.p);
        }
        if (this.q != null && q()) {
            iwVar.a(U);
            iwVar.a(this.q);
        }
        if (this.r != null && r()) {
            iwVar.a(V);
            iwVar.a(this.r);
        }
        if (s()) {
            iwVar.a(W);
            iwVar.a(this.s);
        }
        if (this.t != null && t()) {
            iwVar.a(X);
            iwVar.a(this.t.d);
        }
        if (u()) {
            iwVar.a(Y);
            iwVar.a(this.u);
        }
        if (v()) {
            iwVar.a(Z);
            iwVar.a(this.v);
        }
        if (w()) {
            iwVar.a(aa);
            iwVar.a(this.w);
        }
        if (this.x != null && x()) {
            iwVar.a(ab);
            iwVar.a(this.x);
        }
        if (this.y != null && y()) {
            iwVar.a(ac);
            iwVar.a(this.y);
        }
        if (z()) {
            iwVar.a(ad);
            iwVar.a(this.z);
        }
        if (this.A != null && A()) {
            iwVar.a(ae);
            iwVar.a(new iv((byte) 11, (byte) 11, this.A.size()));
            for (Map.Entry<String, String> entry : this.A.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        if (B()) {
            iwVar.a(af);
            iwVar.a(this.B);
        }
        if (this.C != null && C()) {
            iwVar.a(ag);
            iwVar.a(this.C);
        }
        iwVar.a();
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
        int a19;
        int a20;
        int a21;
        int a22;
        int a23;
        int a24;
        int a25;
        int a26;
        int a27;
        int a28;
        int a29;
        ib ibVar = (ib) obj;
        if (getClass().equals(ibVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(ibVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a29 = im.a(this.a, ibVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ibVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a28 = im.a(this.b, ibVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ibVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a27 = im.a(this.c, ibVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ibVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a26 = im.a(this.d, ibVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ibVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a25 = im.a(this.e, ibVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ibVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a24 = im.a(this.f, ibVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ibVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a23 = im.a(this.g, ibVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ibVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a22 = im.a(this.h, ibVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ibVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a21 = im.a(this.i, ibVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ibVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a20 = im.a(this.j, ibVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ibVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a19 = im.a(this.k, ibVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ibVar.l()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!l() || (a18 = im.a(this.l, ibVar.l)) == 0) {
                                                            int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(ibVar.m()));
                                                            if (compareTo13 != 0) {
                                                                return compareTo13;
                                                            }
                                                            if (!m() || (a17 = im.a(this.m, ibVar.m)) == 0) {
                                                                int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(ibVar.n()));
                                                                if (compareTo14 != 0) {
                                                                    return compareTo14;
                                                                }
                                                                if (!n() || (a16 = im.a(this.n, ibVar.n)) == 0) {
                                                                    int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(ibVar.o()));
                                                                    if (compareTo15 != 0) {
                                                                        return compareTo15;
                                                                    }
                                                                    if (!o() || (a15 = im.a(this.o, ibVar.o)) == 0) {
                                                                        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(ibVar.p()));
                                                                        if (compareTo16 != 0) {
                                                                            return compareTo16;
                                                                        }
                                                                        if (!p() || (a14 = im.a(this.p, ibVar.p)) == 0) {
                                                                            int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(ibVar.q()));
                                                                            if (compareTo17 != 0) {
                                                                                return compareTo17;
                                                                            }
                                                                            if (!q() || (a13 = im.a(this.q, ibVar.q)) == 0) {
                                                                                int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(ibVar.r()));
                                                                                if (compareTo18 != 0) {
                                                                                    return compareTo18;
                                                                                }
                                                                                if (!r() || (a12 = im.a(this.r, ibVar.r)) == 0) {
                                                                                    int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(ibVar.s()));
                                                                                    if (compareTo19 != 0) {
                                                                                        return compareTo19;
                                                                                    }
                                                                                    if (!s() || (a11 = im.a(this.s, ibVar.s)) == 0) {
                                                                                        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(ibVar.t()));
                                                                                        if (compareTo20 != 0) {
                                                                                            return compareTo20;
                                                                                        }
                                                                                        if (!t() || (a10 = im.a(this.t, ibVar.t)) == 0) {
                                                                                            int compareTo21 = Boolean.valueOf(u()).compareTo(Boolean.valueOf(ibVar.u()));
                                                                                            if (compareTo21 != 0) {
                                                                                                return compareTo21;
                                                                                            }
                                                                                            if (!u() || (a9 = im.a(this.u, ibVar.u)) == 0) {
                                                                                                int compareTo22 = Boolean.valueOf(v()).compareTo(Boolean.valueOf(ibVar.v()));
                                                                                                if (compareTo22 != 0) {
                                                                                                    return compareTo22;
                                                                                                }
                                                                                                if (!v() || (a8 = im.a(this.v, ibVar.v)) == 0) {
                                                                                                    int compareTo23 = Boolean.valueOf(w()).compareTo(Boolean.valueOf(ibVar.w()));
                                                                                                    if (compareTo23 != 0) {
                                                                                                        return compareTo23;
                                                                                                    }
                                                                                                    if (!w() || (a7 = im.a(this.w, ibVar.w)) == 0) {
                                                                                                        int compareTo24 = Boolean.valueOf(x()).compareTo(Boolean.valueOf(ibVar.x()));
                                                                                                        if (compareTo24 != 0) {
                                                                                                            return compareTo24;
                                                                                                        }
                                                                                                        if (!x() || (a6 = im.a(this.x, ibVar.x)) == 0) {
                                                                                                            int compareTo25 = Boolean.valueOf(y()).compareTo(Boolean.valueOf(ibVar.y()));
                                                                                                            if (compareTo25 != 0) {
                                                                                                                return compareTo25;
                                                                                                            }
                                                                                                            if (!y() || (a5 = im.a(this.y, ibVar.y)) == 0) {
                                                                                                                int compareTo26 = Boolean.valueOf(z()).compareTo(Boolean.valueOf(ibVar.z()));
                                                                                                                if (compareTo26 != 0) {
                                                                                                                    return compareTo26;
                                                                                                                }
                                                                                                                if (!z() || (a4 = im.a(this.z, ibVar.z)) == 0) {
                                                                                                                    int compareTo27 = Boolean.valueOf(A()).compareTo(Boolean.valueOf(ibVar.A()));
                                                                                                                    if (compareTo27 != 0) {
                                                                                                                        return compareTo27;
                                                                                                                    }
                                                                                                                    if (!A() || (a3 = im.a(this.A, ibVar.A)) == 0) {
                                                                                                                        int compareTo28 = Boolean.valueOf(B()).compareTo(Boolean.valueOf(ibVar.B()));
                                                                                                                        if (compareTo28 != 0) {
                                                                                                                            return compareTo28;
                                                                                                                        }
                                                                                                                        if (!B() || (a2 = im.a(this.B, ibVar.B)) == 0) {
                                                                                                                            int compareTo29 = Boolean.valueOf(C()).compareTo(Boolean.valueOf(ibVar.C()));
                                                                                                                            if (compareTo29 != 0) {
                                                                                                                                return compareTo29;
                                                                                                                            }
                                                                                                                            if (!C() || (a = im.a(this.C, ibVar.C)) == 0) {
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
                                                    return a19;
                                                }
                                                return a20;
                                            }
                                            return a21;
                                        }
                                        return a22;
                                    }
                                    return a23;
                                }
                                return a24;
                            }
                            return a25;
                        }
                        return a26;
                    }
                    return a27;
                }
                return a28;
            }
            return a29;
        }
        return getClass().getName().compareTo(ibVar.getClass().getName());
    }
}
