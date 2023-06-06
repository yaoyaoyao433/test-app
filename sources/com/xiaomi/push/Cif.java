package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.xiaomi.push.if  reason: invalid class name */
/* loaded from: classes6.dex */
public final class Cif implements il<Cif, Object>, Serializable, Cloneable {
    private static final jb i = new jb("XmPushActionSubscription");
    private static final it j = new it("", (byte) 11, 1);
    private static final it k = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it l = new it("", (byte) 11, 3);
    private static final it m = new it("", (byte) 11, 4);
    private static final it n = new it("", (byte) 11, 5);
    private static final it o = new it("", (byte) 11, 6);
    private static final it p = new it("", (byte) 11, 7);
    private static final it q = new it("", (byte) 15, 8);
    public String a;
    public hq b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public List<String> h;

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

    private void i() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d == null) {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.e != null) {
        } else {
            throw new ix("Required field 'topic' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                i();
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
                    if (b.b != 15) {
                        break;
                    } else {
                        iu d = iwVar.d();
                        this.h = new ArrayList(d.b);
                        for (int i2 = 0; i2 < d.b; i2++) {
                            this.h.add(iwVar.l());
                        }
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        i();
        if (this.a != null && a()) {
            iwVar.a(j);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(k);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(l);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(m);
            iwVar.a(this.d);
        }
        if (this.e != null) {
            iwVar.a(n);
            iwVar.a(this.e);
        }
        if (this.f != null && f()) {
            iwVar.a(o);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(p);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(q);
            iwVar.a(new iu((byte) 11, this.h.size()));
            for (String str : this.h) {
                iwVar.a(str);
            }
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
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
        sb.append("topic:");
        sb.append(this.e == null ? StringUtil.NULL : this.e);
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            if (this.h == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.h);
            }
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Cif cif;
        if (obj == null || !(obj instanceof Cif) || (cif = (Cif) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = cif.a();
        if ((a || a2) && !(a && a2 && this.a.equals(cif.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = cif.b();
        if ((b || b2) && !(b && b2 && this.b.a(cif.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = cif.c();
        if ((c || c2) && !(c && c2 && this.c.equals(cif.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = cif.d();
        if ((d || d2) && !(d && d2 && this.d.equals(cif.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = cif.e();
        if ((e || e2) && !(e && e2 && this.e.equals(cif.e))) {
            return false;
        }
        boolean f = f();
        boolean f2 = cif.f();
        if ((f || f2) && !(f && f2 && this.f.equals(cif.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = cif.g();
        if ((g || g2) && !(g && g2 && this.g.equals(cif.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = cif.h();
        if (h || h2) {
            return h && h2 && this.h.equals(cif.h);
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
        Cif cif = (Cif) obj;
        if (getClass().equals(cif.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(cif.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a8 = im.a(this.a, cif.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(cif.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a7 = im.a(this.b, cif.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(cif.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a6 = im.a(this.c, cif.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(cif.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a5 = im.a(this.d, cif.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(cif.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a4 = im.a(this.e, cif.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(cif.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a3 = im.a(this.f, cif.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(cif.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a2 = im.a(this.g, cif.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(cif.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a = im.a(this.h, cif.h)) == 0) {
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
        return getClass().getName().compareTo(cif.getClass().getName());
    }
}
