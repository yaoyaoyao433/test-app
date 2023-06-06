package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes6.dex */
public final class hv implements il<hv, Object>, Serializable, Cloneable {
    private static final jb k = new jb("XmPushActionCommand");
    private static final it l = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it m = new it("", (byte) 11, 3);
    private static final it n = new it("", (byte) 11, 4);
    private static final it o = new it("", (byte) 11, 5);
    private static final it p = new it("", (byte) 15, 6);
    private static final it q = new it("", (byte) 11, 7);
    private static final it r = new it("", (byte) 11, 9);
    private static final it s = new it("", (byte) 2, 10);
    private static final it t = new it("", (byte) 2, 11);
    private static final it u = new it("", (byte) 10, 12);
    public hq a;
    public String b;
    public String c;
    public String d;
    public List<String> e;
    public String f;
    public String g;
    public long j;
    private BitSet v = new BitSet(3);
    public boolean h = false;
    public boolean i = true;

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
        return this.v.get(0);
    }

    private boolean i() {
        return this.v.get(1);
    }

    private boolean j() {
        return this.v.get(2);
    }

    private void k() {
        if (this.b == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.c == null) {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'cmdName' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        k();
        if (this.a != null && a()) {
            iwVar.a(l);
            this.a.b(iwVar);
        }
        if (this.b != null) {
            iwVar.a(m);
            iwVar.a(this.b);
        }
        if (this.c != null) {
            iwVar.a(n);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(o);
            iwVar.a(this.d);
        }
        if (this.e != null && e()) {
            iwVar.a(p);
            iwVar.a(new iu((byte) 11, this.e.size()));
            for (String str : this.e) {
                iwVar.a(str);
            }
        }
        if (this.f != null && f()) {
            iwVar.a(q);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(r);
            iwVar.a(this.g);
        }
        if (h()) {
            iwVar.a(s);
            iwVar.a(this.h);
        }
        if (i()) {
            iwVar.a(t);
            iwVar.a(this.i);
        }
        if (j()) {
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
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (a()) {
            sb.append("target:");
            if (this.a == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.b == null ? StringUtil.NULL : this.b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.c == null ? StringUtil.NULL : this.c);
        sb.append(", ");
        sb.append("cmdName:");
        sb.append(this.d == null ? StringUtil.NULL : this.d);
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            if (this.e == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.e);
            }
        }
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
            sb.append("updateCache:");
            sb.append(this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.j);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hv hvVar;
        if (obj == null || !(obj instanceof hv) || (hvVar = (hv) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hvVar.a();
        if ((a || a2) && !(a && a2 && this.a.a(hvVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = hvVar.b();
        if ((b || b2) && !(b && b2 && this.b.equals(hvVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = hvVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(hvVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = hvVar.d();
        if ((d || d2) && !(d && d2 && this.d.equals(hvVar.d))) {
            return false;
        }
        boolean e = e();
        boolean e2 = hvVar.e();
        if ((e || e2) && !(e && e2 && this.e.equals(hvVar.e))) {
            return false;
        }
        boolean f = f();
        boolean f2 = hvVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(hvVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = hvVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(hvVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = hvVar.h();
        if ((h || h2) && !(h && h2 && this.h == hvVar.h)) {
            return false;
        }
        boolean i = i();
        boolean i2 = hvVar.i();
        if ((i || i2) && !(i && i2 && this.i == hvVar.i)) {
            return false;
        }
        boolean j = j();
        boolean j2 = hvVar.j();
        if (j || j2) {
            return j && j2 && this.j == hvVar.j;
        }
        return true;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b != 0) {
                switch (b.c) {
                    case 2:
                        if (b.b == 12) {
                            this.a = new hq();
                            this.a.a(iwVar);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 3:
                        if (b.b == 11) {
                            this.b = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 4:
                        if (b.b == 11) {
                            this.c = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 5:
                        if (b.b == 11) {
                            this.d = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 6:
                        if (b.b == 15) {
                            iu d = iwVar.d();
                            this.e = new ArrayList(d.b);
                            for (int i = 0; i < d.b; i++) {
                                this.e.add(iwVar.l());
                            }
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 7:
                        if (b.b == 11) {
                            this.f = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 8:
                    default:
                        iz.a(iwVar, b.b);
                        break;
                    case 9:
                        if (b.b == 11) {
                            this.g = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 10:
                        if (b.b == 2) {
                            this.h = iwVar.f();
                            this.v.set(0, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 11:
                        if (b.b == 2) {
                            this.i = iwVar.f();
                            this.v.set(1, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 12:
                        if (b.b == 10) {
                            this.j = iwVar.j();
                            this.v.set(2, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                }
            } else {
                k();
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
        hv hvVar = (hv) obj;
        if (getClass().equals(hvVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hvVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a10 = im.a(this.a, hvVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hvVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a9 = im.a(this.b, hvVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hvVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a8 = im.a(this.c, hvVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hvVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a7 = im.a(this.d, hvVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hvVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a6 = im.a(this.e, hvVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hvVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a5 = im.a(this.f, hvVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hvVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a4 = im.a(this.g, hvVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hvVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a3 = im.a(this.h, hvVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hvVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a2 = im.a(this.i, hvVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hvVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a = im.a(this.j, hvVar.j)) == 0) {
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
        return getClass().getName().compareTo(hvVar.getClass().getName());
    }
}
