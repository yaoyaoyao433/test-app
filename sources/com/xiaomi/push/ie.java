package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ie implements il<ie, Object>, Serializable, Cloneable {
    private static final jb m = new jb("XmPushActionSendMessage");
    private static final it n = new it("", (byte) 11, 1);
    private static final it o = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it p = new it("", (byte) 11, 3);
    private static final it q = new it("", (byte) 11, 4);
    private static final it r = new it("", (byte) 11, 5);
    private static final it s = new it("", (byte) 11, 6);
    private static final it t = new it("", (byte) 11, 7);
    private static final it u = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 8);
    private static final it v = new it("", (byte) 2, 9);
    private static final it w = new it("", (byte) 13, 10);
    private static final it x = new it("", (byte) 11, 11);
    private static final it y = new it("", (byte) 11, 12);
    public String a;
    public hq b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public hn h;
    public Map<String, String> j;
    public String k;
    public String l;
    private BitSet z = new BitSet(1);
    public boolean i = true;

    private void a(boolean z) {
        this.z.set(0, true);
    }

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
        return this.z.get(0);
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

    private void m() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                m();
                return;
            }
            switch (b.c) {
                case 1:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.a = iwVar.l();
                        continue;
                    }
                case 2:
                    if (b.b != 12) {
                        break;
                    } else {
                        this.b = new hq();
                        this.b.a(iwVar);
                        continue;
                    }
                case 3:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.c = iwVar.l();
                        continue;
                    }
                case 4:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.d = iwVar.l();
                        continue;
                    }
                case 5:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.e = iwVar.l();
                        continue;
                    }
                case 6:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.f = iwVar.l();
                        continue;
                    }
                case 7:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.g = iwVar.l();
                        continue;
                    }
                case 8:
                    if (b.b != 12) {
                        break;
                    } else {
                        this.h = new hn();
                        this.h.a(iwVar);
                        continue;
                    }
                case 9:
                    if (b.b != 2) {
                        break;
                    } else {
                        this.i = iwVar.f();
                        a(true);
                        continue;
                    }
                case 10:
                    if (b.b != 13) {
                        break;
                    } else {
                        iv c = iwVar.c();
                        this.j = new HashMap(c.c * 2);
                        for (int i = 0; i < c.c; i++) {
                            this.j.put(iwVar.l(), iwVar.l());
                        }
                        continue;
                    }
                case 11:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.k = iwVar.l();
                        continue;
                    }
                case 12:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.l = iwVar.l();
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    public final boolean a(ie ieVar) {
        if (ieVar == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = ieVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(ieVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = ieVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(ieVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = ieVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(ieVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = ieVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(ieVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = ieVar.e();
        if ((e || e2) && !(e && e2 && this.e.equals(ieVar.e))) {
            return false;
        }
        boolean f = f();
        boolean f2 = ieVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(ieVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = ieVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(ieVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = ieVar.h();
        if ((h || h2) && !(h && h2 && this.h.a(ieVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = ieVar.i();
        if ((i || i2) && !(i && i2 && this.i == ieVar.i)) {
            return false;
        }
        boolean j = j();
        boolean j2 = ieVar.j();
        if ((j || j2) && !(j && j2 && this.j.equals(ieVar.j))) {
            return false;
        }
        boolean k = k();
        boolean k2 = ieVar.k();
        if ((k || k2) && !(k && k2 && this.k.equals(ieVar.k))) {
            return false;
        }
        boolean l = l();
        boolean l2 = ieVar.l();
        if (l || l2) {
            return l && l2 && this.l.equals(ieVar.l);
        }
        return true;
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
            this.h.b(iwVar);
        }
        if (i()) {
            iwVar.a(v);
            iwVar.a(this.i);
        }
        if (this.j != null && j()) {
            iwVar.a(w);
            iwVar.a(new iv((byte) 11, (byte) 11, this.j.size()));
            for (Map.Entry<String, String> entry : this.j.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        if (this.k != null && k()) {
            iwVar.a(x);
            iwVar.a(this.k);
        }
        if (this.l != null && l()) {
            iwVar.a(y);
            iwVar.a(this.l);
        }
        iwVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ie)) {
            return a((ie) obj);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
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
            sb.append("packageName:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
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
            sb.append("message:");
            if (this.h == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.h);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            if (this.j == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.j);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.k == null ? StringUtil.NULL : this.k);
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            sb.append(this.l == null ? StringUtil.NULL : this.l);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
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
        ie ieVar = (ie) obj;
        if (getClass().equals(ieVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(ieVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a12 = im.a(this.a, ieVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ieVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a11 = im.a(this.b, ieVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ieVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a10 = im.a(this.c, ieVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ieVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a9 = im.a(this.d, ieVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ieVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a8 = im.a(this.e, ieVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ieVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a7 = im.a(this.f, ieVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ieVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a6 = im.a(this.g, ieVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ieVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a5 = im.a(this.h, ieVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ieVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a4 = im.a(this.i, ieVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(ieVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a3 = im.a(this.j, ieVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(ieVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a2 = im.a(this.k, ieVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(ieVar.l()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!l() || (a = im.a(this.l, ieVar.l)) == 0) {
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
        return getClass().getName().compareTo(ieVar.getClass().getName());
    }
}
