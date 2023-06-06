package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class ih implements il<ih, Object>, Serializable, Cloneable {
    private static final jb m = new jb("XmPushActionUnRegistration");
    private static final it n = new it("", (byte) 11, 1);
    private static final it o = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it p = new it("", (byte) 11, 3);
    private static final it q = new it("", (byte) 11, 4);
    private static final it r = new it("", (byte) 11, 5);
    private static final it s = new it("", (byte) 11, 6);
    private static final it t = new it("", (byte) 11, 7);
    private static final it u = new it("", (byte) 11, 8);
    private static final it v = new it("", (byte) 11, 9);
    private static final it w = new it("", (byte) 11, 10);
    private static final it x = new it("", (byte) 2, 11);
    private static final it y = new it("", (byte) 10, 12);
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
    public long l;
    private BitSet z = new BitSet(2);
    public boolean k = true;

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
        return this.z.get(0);
    }

    private boolean l() {
        return this.z.get(1);
    }

    private void m() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        m();
        if (this.a != null && a()) {
            iwVar.a(n);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(o);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(p);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(q);
            iwVar.a(this.d);
        }
        if (this.e != null && e()) {
            iwVar.a(r);
            iwVar.a(this.e);
        }
        if (this.f != null && f()) {
            iwVar.a(s);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(t);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(u);
            iwVar.a(this.h);
        }
        if (this.i != null && i()) {
            iwVar.a(v);
            iwVar.a(this.i);
        }
        if (this.j != null && j()) {
            iwVar.a(w);
            iwVar.a(this.j);
        }
        if (k()) {
            iwVar.a(x);
            iwVar.a(this.k);
        }
        if (l()) {
            iwVar.a(y);
            iwVar.a(this.l);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
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
            sb.append("regId:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.j == null ? StringUtil.NULL : this.j);
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.k);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.l);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        ih ihVar;
        if (obj == null || !(obj instanceof ih) || (ihVar = (ih) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = ihVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(ihVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = ihVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(ihVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = ihVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(ihVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = ihVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(ihVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = ihVar.e();
        if ((e || e2) && !(e && e2 && this.e.equals(ihVar.e))) {
            return false;
        }
        boolean f = f();
        boolean f2 = ihVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(ihVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = ihVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(ihVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = ihVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(ihVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = ihVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(ihVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = ihVar.j();
        if ((j || j2) && !(j && j2 && this.j.equals(ihVar.j))) {
            return false;
        }
        boolean k = k();
        boolean k2 = ihVar.k();
        if ((k || k2) && !(k && k2 && this.k == ihVar.k)) {
            return false;
        }
        boolean l = l();
        boolean l2 = ihVar.l();
        if (l || l2) {
            return l && l2 && this.l == ihVar.l;
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
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.e = iwVar.l();
                            break;
                        }
                    case 6:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.f = iwVar.l();
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
                        if (b.b != 2) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.k = iwVar.f();
                            this.z.set(0, true);
                            break;
                        }
                    case 12:
                        if (b.b == 10) {
                            this.l = iwVar.j();
                            this.z.set(1, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    default:
                        iz.a(iwVar, b.b);
                        break;
                }
            } else {
                m();
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
        ih ihVar = (ih) obj;
        if (getClass().equals(ihVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(ihVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a12 = im.a(this.a, ihVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ihVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a11 = im.a(this.b, ihVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ihVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a10 = im.a(this.c, ihVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ihVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a9 = im.a(this.d, ihVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ihVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a8 = im.a(this.e, ihVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ihVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a7 = im.a(this.f, ihVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ihVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a6 = im.a(this.g, ihVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ihVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a5 = im.a(this.h, ihVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ihVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a4 = im.a(this.i, ihVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ihVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a3 = im.a(this.j, ihVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ihVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a2 = im.a(this.k, ihVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ihVar.l()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!l() || (a = im.a(this.l, ihVar.l)) == 0) {
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
        return getClass().getName().compareTo(ihVar.getClass().getName());
    }
}
