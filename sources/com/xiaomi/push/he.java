package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class he implements il<he, Object>, Serializable, Cloneable {
    private static final jb l = new jb("ClientUploadDataItem");
    private static final it m = new it("", (byte) 11, 1);
    private static final it n = new it("", (byte) 11, 2);
    private static final it o = new it("", (byte) 11, 3);
    private static final it p = new it("", (byte) 10, 4);
    private static final it q = new it("", (byte) 10, 5);
    private static final it r = new it("", (byte) 2, 6);
    private static final it s = new it("", (byte) 11, 7);
    private static final it t = new it("", (byte) 11, 8);
    private static final it u = new it("", (byte) 11, 9);
    private static final it v = new it("", (byte) 13, 10);
    private static final it w = new it("", (byte) 11, 11);
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public Map<String, String> j;
    public String k;
    private BitSet x = new BitSet(3);

    private boolean a() {
        return this.a != null;
    }

    private void b(boolean z) {
        this.x.set(0, true);
    }

    private boolean b() {
        return this.b != null;
    }

    private void c(boolean z) {
        this.x.set(1, true);
    }

    private boolean c() {
        return this.c != null;
    }

    private void d(boolean z) {
        this.x.set(2, true);
    }

    private boolean d() {
        return this.x.get(0);
    }

    private boolean e() {
        return this.x.get(1);
    }

    private boolean f() {
        return this.x.get(2);
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

    public final he a(long j) {
        this.d = j;
        b(true);
        return this;
    }

    public final he a(boolean z) {
        this.f = z;
        d(true);
        return this;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
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
                    if (b.b != 11) {
                        break;
                    } else {
                        this.b = iwVar.l();
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
                    if (b.b != 10) {
                        break;
                    } else {
                        this.d = iwVar.j();
                        b(true);
                        continue;
                    }
                case 5:
                    if (b.b != 10) {
                        break;
                    } else {
                        this.e = iwVar.j();
                        c(true);
                        continue;
                    }
                case 6:
                    if (b.b != 2) {
                        break;
                    } else {
                        this.f = iwVar.f();
                        d(true);
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
                    if (b.b != 11) {
                        break;
                    } else {
                        this.h = iwVar.l();
                        continue;
                    }
                case 9:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.i = iwVar.l();
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
            }
            iz.a(iwVar, b.b);
        }
    }

    public final he b(long j) {
        this.e = j;
        c(true);
        return this;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        if (this.a != null && a()) {
            iwVar.a(m);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(n);
            iwVar.a(this.b);
        }
        if (this.c != null && c()) {
            iwVar.a(o);
            iwVar.a(this.c);
        }
        if (d()) {
            iwVar.a(p);
            iwVar.a(this.d);
        }
        if (e()) {
            iwVar.a(q);
            iwVar.a(this.e);
        }
        if (f()) {
            iwVar.a(r);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(s);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(t);
            iwVar.a(this.h);
        }
        if (this.i != null && i()) {
            iwVar.a(u);
            iwVar.a(this.i);
        }
        if (this.j != null && j()) {
            iwVar.a(v);
            iwVar.a(new iv((byte) 11, (byte) 11, this.j.size()));
            for (Map.Entry<String, String> entry : this.j.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        if (this.k != null && k()) {
            iwVar.a(w);
            iwVar.a(this.k);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        if (a()) {
            sb.append("channel:");
            sb.append(this.a == null ? StringUtil.NULL : this.a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            sb.append(this.b == null ? StringUtil.NULL : this.b);
            z = false;
        }
        if (c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            sb.append(this.c == null ? StringUtil.NULL : this.c);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.d);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.e);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            if (this.j == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.j);
            }
            z = false;
        }
        if (k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            sb.append(this.k == null ? StringUtil.NULL : this.k);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        he heVar;
        if (obj == null || !(obj instanceof he) || (heVar = (he) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = heVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(heVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = heVar.b();
        if ((b || b2) && !(b && b2 && this.b.equals(heVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = heVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(heVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = heVar.d();
        if ((d || d2) && !(d && d2 && this.d == heVar.d)) {
            return false;
        }
        boolean e = e();
        boolean e2 = heVar.e();
        if ((e || e2) && !(e && e2 && this.e == heVar.e)) {
            return false;
        }
        boolean f = f();
        boolean f2 = heVar.f();
        if ((f || f2) && !(f && f2 && this.f == heVar.f)) {
            return false;
        }
        boolean g = g();
        boolean g2 = heVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(heVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = heVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(heVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = heVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(heVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = heVar.j();
        if ((j || j2) && !(j && j2 && this.j.equals(heVar.j))) {
            return false;
        }
        boolean k = k();
        boolean k2 = heVar.k();
        if (k || k2) {
            return k && k2 && this.k.equals(heVar.k);
        }
        return true;
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
        he heVar = (he) obj;
        if (getClass().equals(heVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(heVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a11 = im.a(this.a, heVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(heVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a10 = im.a(this.b, heVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(heVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a9 = im.a(this.c, heVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(heVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a8 = im.a(this.d, heVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(heVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a7 = im.a(this.e, heVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(heVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a6 = im.a(this.f, heVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(heVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a5 = im.a(this.g, heVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(heVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a4 = im.a(this.h, heVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(heVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a3 = im.a(this.i, heVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(heVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a2 = im.a(this.j, heVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(heVar.k()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!k() || (a = im.a(this.k, heVar.k)) == 0) {
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
        return getClass().getName().compareTo(heVar.getClass().getName());
    }
}
