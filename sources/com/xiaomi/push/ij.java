package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class ij implements il<ij, Object>, Serializable, Cloneable {
    private static final jb j = new jb("XmPushActionUnSubscriptionResult");
    private static final it k = new it("", (byte) 11, 1);
    private static final it l = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it m = new it("", (byte) 11, 3);
    private static final it n = new it("", (byte) 11, 4);
    private static final it o = new it("", (byte) 10, 6);
    private static final it p = new it("", (byte) 11, 7);
    private static final it q = new it("", (byte) 11, 8);
    private static final it r = new it("", (byte) 11, 9);
    private static final it s = new it("", (byte) 11, 10);
    public String a;
    public hq b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;
    private BitSet t = new BitSet(1);

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
        return this.t.get(0);
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

    private void j() {
        if (this.c != null) {
            return;
        }
        throw new ix("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        j();
        if (this.a != null && a()) {
            iwVar.a(k);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(l);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(m);
            iwVar.a(this.c);
        }
        if (this.d != null && d()) {
            iwVar.a(n);
            iwVar.a(this.d);
        }
        if (e()) {
            iwVar.a(o);
            iwVar.a(this.e);
        }
        if (this.f != null && f()) {
            iwVar.a(p);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(q);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(r);
            iwVar.a(this.h);
        }
        if (this.i != null && i()) {
            iwVar.a(s);
            iwVar.a(this.i);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
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
            sb.append("errorCode:");
            sb.append(this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        ij ijVar;
        if (obj == null || !(obj instanceof ij) || (ijVar = (ij) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = ijVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(ijVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = ijVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(ijVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = ijVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(ijVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = ijVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(ijVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = ijVar.e();
        if ((e || e2) && !(e && e2 && this.e == ijVar.e)) {
            return false;
        }
        boolean f = f();
        boolean f2 = ijVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(ijVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = ijVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(ijVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = ijVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(ijVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = ijVar.i();
        if (i || i2) {
            return i && i2 && this.i.equals(ijVar.i);
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
                        if (b.b == 10) {
                            this.e = iwVar.j();
                            this.t.set(0, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
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
                }
            } else {
                j();
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
        ij ijVar = (ij) obj;
        if (getClass().equals(ijVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(ijVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a9 = im.a(this.a, ijVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ijVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a8 = im.a(this.b, ijVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ijVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a7 = im.a(this.c, ijVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ijVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a6 = im.a(this.d, ijVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ijVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a5 = im.a(this.e, ijVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ijVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a4 = im.a(this.f, ijVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(ijVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a3 = im.a(this.g, ijVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(ijVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a2 = im.a(this.h, ijVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(ijVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a = im.a(this.i, ijVar.i)) == 0) {
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
        return getClass().getName().compareTo(ijVar.getClass().getName());
    }
}
