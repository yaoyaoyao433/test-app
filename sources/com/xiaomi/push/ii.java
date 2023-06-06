package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class ii implements il<ii, Object>, Serializable, Cloneable {
    private static final jb j = new jb("XmPushActionUnRegistrationResult");
    private static final it k = new it("", (byte) 11, 1);
    private static final it l = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it m = new it("", (byte) 11, 3);
    private static final it n = new it("", (byte) 11, 4);
    private static final it o = new it("", (byte) 10, 6);
    private static final it p = new it("", (byte) 11, 7);
    private static final it q = new it("", (byte) 11, 8);
    private static final it r = new it("", (byte) 10, 9);
    private static final it s = new it("", (byte) 10, 10);
    public String a;
    public hq b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public long h;
    public long i;
    private BitSet t = new BitSet(3);

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
        return this.t.get(1);
    }

    private boolean i() {
        return this.t.get(2);
    }

    private void j() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        }
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
        if (this.d != null) {
            iwVar.a(n);
            iwVar.a(this.d);
        }
        iwVar.a(o);
        iwVar.a(this.e);
        if (this.f != null && f()) {
            iwVar.a(p);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(q);
            iwVar.a(this.g);
        }
        if (h()) {
            iwVar.a(r);
            iwVar.a(this.h);
        }
        if (i()) {
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
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
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
            sb.append("packageName:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.i);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        ii iiVar;
        if (obj == null || !(obj instanceof ii) || (iiVar = (ii) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = iiVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(iiVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = iiVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(iiVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = iiVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(iiVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = iiVar.d();
        if (((d || d2) && !(d && d2 && this.d.equals(iiVar.d))) || this.e != iiVar.e) {
            return false;
        }
        boolean f = f();
        boolean f2 = iiVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(iiVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = iiVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(iiVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = iiVar.h();
        if ((h || h2) && !(h && h2 && this.h == iiVar.h)) {
            return false;
        }
        boolean i = i();
        boolean i2 = iiVar.i();
        if (i || i2) {
            return i && i2 && this.i == iiVar.i;
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
                            this.t.set(0, true);
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
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.h = iwVar.j();
                            this.t.set(1, true);
                            break;
                        }
                    case 10:
                        if (b.b == 10) {
                            this.i = iwVar.j();
                            this.t.set(2, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                }
            } else if (e()) {
                j();
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
        ii iiVar = (ii) obj;
        if (getClass().equals(iiVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(iiVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a9 = im.a(this.a, iiVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iiVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a8 = im.a(this.b, iiVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iiVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a7 = im.a(this.c, iiVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iiVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a6 = im.a(this.d, iiVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iiVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a5 = im.a(this.e, iiVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iiVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a4 = im.a(this.f, iiVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iiVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a3 = im.a(this.g, iiVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iiVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a2 = im.a(this.h, iiVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iiVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a = im.a(this.i, iiVar.i)) == 0) {
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
        return getClass().getName().compareTo(iiVar.getClass().getName());
    }
}
