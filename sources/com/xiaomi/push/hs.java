package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class hs implements il<hs, Object>, Serializable, Cloneable {
    private static final jb k = new jb("XmPushActionAckNotification");
    private static final it l = new it("", (byte) 11, 1);
    private static final it m = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it n = new it("", (byte) 11, 3);
    private static final it o = new it("", (byte) 11, 4);
    private static final it p = new it("", (byte) 11, 5);
    private static final it q = new it("", (byte) 10, 7);
    private static final it r = new it("", (byte) 11, 8);
    private static final it s = new it("", (byte) 13, 9);
    private static final it t = new it("", (byte) 11, 10);
    private static final it u = new it("", (byte) 11, 11);
    public String a;
    public hq b;
    public String c;
    public String d;
    public String e;
    public String g;
    public Map<String, String> h;
    public String i;
    public String j;
    private BitSet v = new BitSet(1);
    public long f = 0;

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
        return this.v.get(0);
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

    private void k() {
        if (this.c != null) {
            return;
        }
        throw new ix("Required field 'id' was not present! Struct: " + toString());
    }

    public final hs a(long j) {
        this.f = 0L;
        a(true);
        return this;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                k();
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
                case 7:
                    if (b.b != 10) {
                        break;
                    } else {
                        this.f = iwVar.j();
                        a(true);
                        continue;
                    }
                case 8:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.g = iwVar.l();
                        continue;
                    }
                case 9:
                    if (b.b != 13) {
                        break;
                    } else {
                        iv c = iwVar.c();
                        this.h = new HashMap(c.c * 2);
                        for (int i = 0; i < c.c; i++) {
                            this.h.put(iwVar.l(), iwVar.l());
                        }
                        continue;
                    }
                case 10:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.i = iwVar.l();
                        continue;
                    }
                case 11:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.j = iwVar.l();
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    public final void a(boolean z) {
        this.v.set(0, true);
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        k();
        if (this.a != null && a()) {
            iwVar.a(l);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(m);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(n);
            iwVar.a(this.c);
        }
        if (this.d != null && d()) {
            iwVar.a(o);
            iwVar.a(this.d);
        }
        if (this.e != null && e()) {
            iwVar.a(p);
            iwVar.a(this.e);
        }
        if (f()) {
            iwVar.a(q);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(r);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(s);
            iwVar.a(new iv((byte) 11, (byte) 11, this.h.size()));
            for (Map.Entry<String, String> entry : this.h.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        if (this.i != null && i()) {
            iwVar.a(t);
            iwVar.a(this.i);
        }
        if (this.j != null && j()) {
            iwVar.a(u);
            iwVar.a(this.j);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
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
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.d == null ? StringUtil.NULL : this.d);
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
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
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hs hsVar;
        if (obj == null || !(obj instanceof hs) || (hsVar = (hs) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hsVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(hsVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = hsVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(hsVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = hsVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(hsVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = hsVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(hsVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = hsVar.e();
        if ((e || e2) && !(e && e2 && this.e.equals(hsVar.e))) {
            return false;
        }
        boolean f = f();
        boolean f2 = hsVar.f();
        if ((f || f2) && !(f && f2 && this.f == hsVar.f)) {
            return false;
        }
        boolean g = g();
        boolean g2 = hsVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(hsVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = hsVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(hsVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = hsVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(hsVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = hsVar.j();
        if (j || j2) {
            return j && j2 && this.j.equals(hsVar.j);
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
        hs hsVar = (hs) obj;
        if (getClass().equals(hsVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hsVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a10 = im.a(this.a, hsVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hsVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a9 = im.a(this.b, hsVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hsVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a8 = im.a(this.c, hsVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hsVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a7 = im.a(this.d, hsVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hsVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a6 = im.a(this.e, hsVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hsVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a5 = im.a(this.f, hsVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hsVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a4 = im.a(this.g, hsVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hsVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a3 = im.a(this.h, hsVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hsVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a2 = im.a(this.i, hsVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hsVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a = im.a(this.j, hsVar.j)) == 0) {
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
        return getClass().getName().compareTo(hsVar.getClass().getName());
    }
}
