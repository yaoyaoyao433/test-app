package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ho implements il<ho, Object>, Serializable, Cloneable {
    private BitSet B;
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public int h;
    public int i;
    public Map<String, String> j;
    public Map<String, String> k;
    public boolean l;
    public Map<String, String> m;
    private static final jb n = new jb("PushMetaInfo");
    private static final it o = new it("", (byte) 11, 1);
    private static final it p = new it("", (byte) 10, 2);
    private static final it q = new it("", (byte) 11, 3);
    private static final it r = new it("", (byte) 11, 4);
    private static final it s = new it("", (byte) 11, 5);
    private static final it t = new it("", (byte) 8, 6);
    private static final it u = new it("", (byte) 11, 7);
    private static final it v = new it("", (byte) 8, 8);
    private static final it w = new it("", (byte) 8, 9);
    private static final it x = new it("", (byte) 13, 10);
    private static final it y = new it("", (byte) 13, 11);
    private static final it z = new it("", (byte) 2, 12);
    private static final it A = new it("", (byte) 13, 13);

    public ho() {
        this.B = new BitSet(5);
        this.l = false;
    }

    public ho(ho hoVar) {
        this.B = new BitSet(5);
        this.B.clear();
        this.B.or(hoVar.B);
        if (hoVar.b()) {
            this.a = hoVar.a;
        }
        this.b = hoVar.b;
        if (hoVar.d()) {
            this.c = hoVar.c;
        }
        if (hoVar.e()) {
            this.d = hoVar.d;
        }
        if (hoVar.f()) {
            this.e = hoVar.e;
        }
        this.f = hoVar.f;
        if (hoVar.h()) {
            this.g = hoVar.g;
        }
        this.h = hoVar.h;
        this.i = hoVar.i;
        if (hoVar.k()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : hoVar.j.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.j = hashMap;
        }
        if (hoVar.l()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : hoVar.k.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.k = hashMap2;
        }
        this.l = hoVar.l;
        if (hoVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : hoVar.m.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.m = hashMap3;
        }
    }

    private void a(boolean z2) {
        this.B.set(0, true);
    }

    private void b(boolean z2) {
        this.B.set(1, true);
    }

    private boolean b() {
        return this.a != null;
    }

    private void c(boolean z2) {
        this.B.set(2, true);
    }

    private boolean c() {
        return this.B.get(0);
    }

    private void d(boolean z2) {
        this.B.set(3, true);
    }

    private boolean d() {
        return this.c != null;
    }

    private void e(boolean z2) {
        this.B.set(4, true);
    }

    private boolean e() {
        return this.d != null;
    }

    private boolean f() {
        return this.e != null;
    }

    private boolean g() {
        return this.B.get(1);
    }

    private boolean h() {
        return this.g != null;
    }

    private boolean i() {
        return this.B.get(2);
    }

    private boolean j() {
        return this.B.get(3);
    }

    private boolean k() {
        return this.j != null;
    }

    private boolean l() {
        return this.k != null;
    }

    private boolean m() {
        return this.B.get(4);
    }

    private boolean n() {
        return this.m != null;
    }

    private void o() {
        if (this.a != null) {
            return;
        }
        throw new ix("Required field 'id' was not present! Struct: " + toString());
    }

    public final ho a() {
        return new ho(this);
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                if (c()) {
                    o();
                    return;
                }
                throw new ix("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i = 0;
            switch (b.c) {
                case 1:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.a = iwVar.l();
                        continue;
                    }
                case 2:
                    if (b.b != 10) {
                        break;
                    } else {
                        this.b = iwVar.j();
                        a(true);
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
                    if (b.b != 8) {
                        break;
                    } else {
                        this.f = iwVar.i();
                        b(true);
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
                    if (b.b != 8) {
                        break;
                    } else {
                        this.h = iwVar.i();
                        c(true);
                        continue;
                    }
                case 9:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.i = iwVar.i();
                        d(true);
                        continue;
                    }
                case 10:
                    if (b.b != 13) {
                        break;
                    } else {
                        iv c = iwVar.c();
                        this.j = new HashMap(c.c * 2);
                        while (i < c.c) {
                            this.j.put(iwVar.l(), iwVar.l());
                            i++;
                        }
                        continue;
                    }
                case 11:
                    if (b.b != 13) {
                        break;
                    } else {
                        iv c2 = iwVar.c();
                        this.k = new HashMap(c2.c * 2);
                        while (i < c2.c) {
                            this.k.put(iwVar.l(), iwVar.l());
                            i++;
                        }
                        continue;
                    }
                case 12:
                    if (b.b != 2) {
                        break;
                    } else {
                        this.l = iwVar.f();
                        e(true);
                        continue;
                    }
                case 13:
                    if (b.b != 13) {
                        break;
                    } else {
                        iv c3 = iwVar.c();
                        this.m = new HashMap(c3.c * 2);
                        while (i < c3.c) {
                            this.m.put(iwVar.l(), iwVar.l());
                            i++;
                        }
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    public final void a(String str, String str2) {
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put(str, str2);
    }

    public final boolean a(ho hoVar) {
        if (hoVar == null) {
            return false;
        }
        boolean b = b();
        boolean b2 = hoVar.b();
        if (((b || b2) && !(b && b2 && this.a.equals(hoVar.a))) || this.b != hoVar.b) {
            return false;
        }
        boolean d = d();
        boolean d2 = hoVar.d();
        if ((d || d2) && !(d && d2 && this.c.equals(hoVar.c))) {
            return false;
        }
        boolean e = e();
        boolean e2 = hoVar.e();
        if ((e || e2) && !(e && e2 && this.d.equals(hoVar.d))) {
            return false;
        }
        boolean f = f();
        boolean f2 = hoVar.f();
        if ((f || f2) && !(f && f2 && this.e.equals(hoVar.e))) {
            return false;
        }
        boolean g = g();
        boolean g2 = hoVar.g();
        if ((g || g2) && !(g && g2 && this.f == hoVar.f)) {
            return false;
        }
        boolean h = h();
        boolean h2 = hoVar.h();
        if ((h || h2) && !(h && h2 && this.g.equals(hoVar.g))) {
            return false;
        }
        boolean i = i();
        boolean i2 = hoVar.i();
        if ((i || i2) && !(i && i2 && this.h == hoVar.h)) {
            return false;
        }
        boolean j = j();
        boolean j2 = hoVar.j();
        if ((j || j2) && !(j && j2 && this.i == hoVar.i)) {
            return false;
        }
        boolean k = k();
        boolean k2 = hoVar.k();
        if ((k || k2) && !(k && k2 && this.j.equals(hoVar.j))) {
            return false;
        }
        boolean l = l();
        boolean l2 = hoVar.l();
        if ((l || l2) && !(l && l2 && this.k.equals(hoVar.k))) {
            return false;
        }
        boolean m = m();
        boolean m2 = hoVar.m();
        if ((m || m2) && !(m && m2 && this.l == hoVar.l)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = hoVar.n();
        if (n2 || n3) {
            return n2 && n3 && this.m.equals(hoVar.m);
        }
        return true;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        o();
        if (this.a != null) {
            iwVar.a(o);
            iwVar.a(this.a);
        }
        iwVar.a(p);
        iwVar.a(this.b);
        if (this.c != null && d()) {
            iwVar.a(q);
            iwVar.a(this.c);
        }
        if (this.d != null && e()) {
            iwVar.a(r);
            iwVar.a(this.d);
        }
        if (this.e != null && f()) {
            iwVar.a(s);
            iwVar.a(this.e);
        }
        if (g()) {
            iwVar.a(t);
            iwVar.a(this.f);
        }
        if (this.g != null && h()) {
            iwVar.a(u);
            iwVar.a(this.g);
        }
        if (i()) {
            iwVar.a(v);
            iwVar.a(this.h);
        }
        if (j()) {
            iwVar.a(w);
            iwVar.a(this.i);
        }
        if (this.j != null && k()) {
            iwVar.a(x);
            iwVar.a(new iv((byte) 11, (byte) 11, this.j.size()));
            for (Map.Entry<String, String> entry : this.j.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        if (this.k != null && l()) {
            iwVar.a(y);
            iwVar.a(new iv((byte) 11, (byte) 11, this.k.size()));
            for (Map.Entry<String, String> entry2 : this.k.entrySet()) {
                iwVar.a(entry2.getKey());
                iwVar.a(entry2.getValue());
            }
        }
        if (m()) {
            iwVar.a(z);
            iwVar.a(this.l);
        }
        if (this.m != null && n()) {
            iwVar.a(A);
            iwVar.a(new iv((byte) 11, (byte) 11, this.m.size()));
            for (Map.Entry<String, String> entry3 : this.m.entrySet()) {
                iwVar.a(entry3.getKey());
                iwVar.a(entry3.getValue());
            }
        }
        iwVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ho)) {
            return a((ho) obj);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        sb.append(this.a == null ? StringUtil.NULL : this.a);
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.b);
        if (d()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.c == null ? StringUtil.NULL : this.c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("title:");
            sb.append(this.d == null ? StringUtil.NULL : this.d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("description:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        if (g()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f);
        }
        if (h()) {
            sb.append(", ");
            sb.append("url:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (i()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.h);
        }
        if (j()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.i);
        }
        if (k()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.j == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.j);
            }
        }
        if (l()) {
            sb.append(", ");
            sb.append("internal:");
            if (this.k == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.k);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.l);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            if (this.m == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.m);
            }
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
        int a13;
        ho hoVar = (ho) obj;
        if (getClass().equals(hoVar.getClass())) {
            int compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hoVar.b()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!b() || (a13 = im.a(this.a, hoVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hoVar.c()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!c() || (a12 = im.a(this.b, hoVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hoVar.d()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!d() || (a11 = im.a(this.c, hoVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hoVar.e()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!e() || (a10 = im.a(this.d, hoVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hoVar.f()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!f() || (a9 = im.a(this.e, hoVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hoVar.g()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!g() || (a8 = im.a(this.f, hoVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hoVar.h()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!h() || (a7 = im.a(this.g, hoVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hoVar.i()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!i() || (a6 = im.a(this.h, hoVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hoVar.j()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!j() || (a5 = im.a(this.i, hoVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(hoVar.k()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!k() || (a4 = im.a(this.j, hoVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(hoVar.l()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!l() || (a3 = im.a(this.k, hoVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(hoVar.m()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!m() || (a2 = im.a(this.l, hoVar.l)) == 0) {
                                                            int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(hoVar.n()));
                                                            if (compareTo13 != 0) {
                                                                return compareTo13;
                                                            }
                                                            if (!n() || (a = im.a(this.m, hoVar.m)) == 0) {
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
        return getClass().getName().compareTo(hoVar.getClass().getName());
    }
}
