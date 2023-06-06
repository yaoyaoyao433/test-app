package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class hr implements il<hr, Object>, Serializable, Cloneable {
    public String a;
    public hq b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public ie h;
    public String i;
    public String j;
    public String l;
    public String m;
    public String n;
    public short o;
    public short p;
    public String q;
    public String r;
    public int s;
    public Map<String, String> t;
    private static final jb u = new jb("XmPushActionAckMessage");
    private static final it v = new it("", (byte) 11, 1);
    private static final it w = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it x = new it("", (byte) 11, 3);
    private static final it y = new it("", (byte) 11, 4);
    private static final it z = new it("", (byte) 10, 5);
    private static final it A = new it("", (byte) 11, 6);
    private static final it B = new it("", (byte) 11, 7);
    private static final it C = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 8);
    private static final it D = new it("", (byte) 11, 9);
    private static final it E = new it("", (byte) 11, 10);
    private static final it F = new it("", (byte) 2, 11);
    private static final it G = new it("", (byte) 11, 12);
    private static final it H = new it("", (byte) 11, 13);
    private static final it I = new it("", (byte) 11, 14);
    private static final it J = new it("", (byte) 6, 15);
    private static final it K = new it("", (byte) 6, 16);
    private static final it L = new it("", (byte) 11, 20);
    private static final it M = new it("", (byte) 11, 21);
    private static final it N = new it("", (byte) 8, 22);
    private static final it O = new it("", (byte) 13, 23);
    private BitSet P = new BitSet(5);
    public boolean k = false;

    private void a(boolean z2) {
        this.P.set(0, true);
    }

    private boolean a() {
        return this.a != null;
    }

    private void b(boolean z2) {
        this.P.set(2, true);
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
        return this.P.get(0);
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
        return this.P.get(1);
    }

    private boolean l() {
        return this.l != null;
    }

    private boolean m() {
        return this.m != null;
    }

    private boolean n() {
        return this.n != null;
    }

    private boolean o() {
        return this.P.get(2);
    }

    private boolean p() {
        return this.P.get(3);
    }

    private boolean q() {
        return this.q != null;
    }

    private boolean r() {
        return this.r != null;
    }

    private boolean s() {
        return this.P.get(4);
    }

    private boolean t() {
        return this.t != null;
    }

    private void u() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    public final hr a(long j) {
        this.e = j;
        a(true);
        return this;
    }

    public final hr a(short s) {
        this.o = s;
        b(true);
        return this;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        u();
        if (this.a != null && a()) {
            iwVar.a(v);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(w);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(x);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(y);
            iwVar.a(this.d);
        }
        iwVar.a(z);
        iwVar.a(this.e);
        if (this.f != null && f()) {
            iwVar.a(A);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(B);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(C);
            this.h.b(iwVar);
        }
        if (this.i != null && i()) {
            iwVar.a(D);
            iwVar.a(this.i);
        }
        if (this.j != null && j()) {
            iwVar.a(E);
            iwVar.a(this.j);
        }
        if (k()) {
            iwVar.a(F);
            iwVar.a(this.k);
        }
        if (this.l != null && l()) {
            iwVar.a(G);
            iwVar.a(this.l);
        }
        if (this.m != null && m()) {
            iwVar.a(H);
            iwVar.a(this.m);
        }
        if (this.n != null && n()) {
            iwVar.a(I);
            iwVar.a(this.n);
        }
        if (o()) {
            iwVar.a(J);
            iwVar.a(this.o);
        }
        if (p()) {
            iwVar.a(K);
            iwVar.a(this.p);
        }
        if (this.q != null && q()) {
            iwVar.a(L);
            iwVar.a(this.q);
        }
        if (this.r != null && r()) {
            iwVar.a(M);
            iwVar.a(this.r);
        }
        if (s()) {
            iwVar.a(N);
            iwVar.a(this.s);
        }
        if (this.t != null && t()) {
            iwVar.a(O);
            iwVar.a(new iv((byte) 11, (byte) 11, this.t.size()));
            for (Map.Entry<String, String> entry : this.t.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
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
        sb.append("messageTs:");
        sb.append(this.e);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            if (this.h == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.h);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.j == null ? StringUtil.NULL : this.j);
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.k);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.l == null ? StringUtil.NULL : this.l);
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            sb.append(this.m == null ? StringUtil.NULL : this.m);
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            sb.append(this.n == null ? StringUtil.NULL : this.n);
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append((int) this.o);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append((int) this.p);
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
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.s);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.t == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.t);
            }
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hr hrVar;
        if (obj == null || !(obj instanceof hr) || (hrVar = (hr) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hrVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(hrVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = hrVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(hrVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = hrVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(hrVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = hrVar.d();
        if (((d || d2) && !(d && d2 && this.d.equals(hrVar.d))) || this.e != hrVar.e) {
            return false;
        }
        boolean f = f();
        boolean f2 = hrVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(hrVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = hrVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(hrVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = hrVar.h();
        if ((h || h2) && !(h && h2 && this.h.a(hrVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = hrVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(hrVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = hrVar.j();
        if ((j || j2) && !(j && j2 && this.j.equals(hrVar.j))) {
            return false;
        }
        boolean k = k();
        boolean k2 = hrVar.k();
        if ((k || k2) && !(k && k2 && this.k == hrVar.k)) {
            return false;
        }
        boolean l = l();
        boolean l2 = hrVar.l();
        if ((l || l2) && !(l && l2 && this.l.equals(hrVar.l))) {
            return false;
        }
        boolean m = m();
        boolean m2 = hrVar.m();
        if ((m || m2) && !(m && m2 && this.m.equals(hrVar.m))) {
            return false;
        }
        boolean n = n();
        boolean n2 = hrVar.n();
        if ((n || n2) && !(n && n2 && this.n.equals(hrVar.n))) {
            return false;
        }
        boolean o = o();
        boolean o2 = hrVar.o();
        if ((o || o2) && !(o && o2 && this.o == hrVar.o)) {
            return false;
        }
        boolean p = p();
        boolean p2 = hrVar.p();
        if ((p || p2) && !(p && p2 && this.p == hrVar.p)) {
            return false;
        }
        boolean q = q();
        boolean q2 = hrVar.q();
        if ((q || q2) && !(q && q2 && this.q.equals(hrVar.q))) {
            return false;
        }
        boolean r = r();
        boolean r2 = hrVar.r();
        if ((r || r2) && !(r && r2 && this.r.equals(hrVar.r))) {
            return false;
        }
        boolean s = s();
        boolean s2 = hrVar.s();
        if ((s || s2) && !(s && s2 && this.s == hrVar.s)) {
            return false;
        }
        boolean t = t();
        boolean t2 = hrVar.t();
        if (t || t2) {
            return t && t2 && this.t.equals(hrVar.t);
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
                        if (b.b == 10) {
                            this.e = iwVar.j();
                            a(true);
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
                        if (b.b == 12) {
                            this.h = new ie();
                            this.h.a(iwVar);
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
                        if (b.b == 2) {
                            this.k = iwVar.f();
                            this.P.set(1, true);
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
                        if (b.b == 11) {
                            this.m = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 14:
                        if (b.b == 11) {
                            this.n = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 15:
                        if (b.b == 6) {
                            this.o = iwVar.h();
                            b(true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 16:
                        if (b.b == 6) {
                            this.p = iwVar.h();
                            this.P.set(3, true);
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
                        if (b.b == 11) {
                            this.q = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 21:
                        if (b.b == 11) {
                            this.r = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 22:
                        if (b.b == 8) {
                            this.s = iwVar.i();
                            this.P.set(4, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 23:
                        if (b.b == 13) {
                            iv c = iwVar.c();
                            this.t = new HashMap(c.c * 2);
                            for (int i = 0; i < c.c; i++) {
                                this.t.put(iwVar.l(), iwVar.l());
                            }
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                }
            } else if (!e()) {
                throw new ix("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            } else {
                u();
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
        int a19;
        int a20;
        hr hrVar = (hr) obj;
        if (getClass().equals(hrVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hrVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a20 = im.a(this.a, hrVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hrVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a19 = im.a(this.b, hrVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hrVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a18 = im.a(this.c, hrVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hrVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a17 = im.a(this.d, hrVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hrVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a16 = im.a(this.e, hrVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hrVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a15 = im.a(this.f, hrVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hrVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a14 = im.a(this.g, hrVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hrVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a13 = im.a(this.h, hrVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hrVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a12 = im.a(this.i, hrVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hrVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a11 = im.a(this.j, hrVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hrVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a10 = im.a(this.k, hrVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(hrVar.l()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!l() || (a9 = im.a(this.l, hrVar.l)) == 0) {
                                                            int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(hrVar.m()));
                                                            if (compareTo13 != 0) {
                                                                return compareTo13;
                                                            }
                                                            if (!m() || (a8 = im.a(this.m, hrVar.m)) == 0) {
                                                                int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(hrVar.n()));
                                                                if (compareTo14 != 0) {
                                                                    return compareTo14;
                                                                }
                                                                if (!n() || (a7 = im.a(this.n, hrVar.n)) == 0) {
                                                                    int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(hrVar.o()));
                                                                    if (compareTo15 != 0) {
                                                                        return compareTo15;
                                                                    }
                                                                    if (!o() || (a6 = im.a(this.o, hrVar.o)) == 0) {
                                                                        int compareTo16 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(hrVar.p()));
                                                                        if (compareTo16 != 0) {
                                                                            return compareTo16;
                                                                        }
                                                                        if (!p() || (a5 = im.a(this.p, hrVar.p)) == 0) {
                                                                            int compareTo17 = Boolean.valueOf(q()).compareTo(Boolean.valueOf(hrVar.q()));
                                                                            if (compareTo17 != 0) {
                                                                                return compareTo17;
                                                                            }
                                                                            if (!q() || (a4 = im.a(this.q, hrVar.q)) == 0) {
                                                                                int compareTo18 = Boolean.valueOf(r()).compareTo(Boolean.valueOf(hrVar.r()));
                                                                                if (compareTo18 != 0) {
                                                                                    return compareTo18;
                                                                                }
                                                                                if (!r() || (a3 = im.a(this.r, hrVar.r)) == 0) {
                                                                                    int compareTo19 = Boolean.valueOf(s()).compareTo(Boolean.valueOf(hrVar.s()));
                                                                                    if (compareTo19 != 0) {
                                                                                        return compareTo19;
                                                                                    }
                                                                                    if (!s() || (a2 = im.a(this.s, hrVar.s)) == 0) {
                                                                                        int compareTo20 = Boolean.valueOf(t()).compareTo(Boolean.valueOf(hrVar.t()));
                                                                                        if (compareTo20 != 0) {
                                                                                            return compareTo20;
                                                                                        }
                                                                                        if (!t() || (a = im.a(this.t, hrVar.t)) == 0) {
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
        return getClass().getName().compareTo(hrVar.getClass().getName());
    }
}
