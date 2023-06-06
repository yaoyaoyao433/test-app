package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class hm implements il<hm, Object>, Serializable, Cloneable {
    private static final jb h = new jb("OnlineConfigItem");
    private static final it i = new it("", (byte) 8, 1);
    private static final it j = new it("", (byte) 8, 2);
    private static final it k = new it("", (byte) 2, 3);
    private static final it l = new it("", (byte) 8, 4);
    private static final it m = new it("", (byte) 10, 5);
    private static final it n = new it("", (byte) 11, 6);
    private static final it o = new it("", (byte) 2, 7);
    public int a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public String f;
    public boolean g;
    private BitSet p = new BitSet(6);

    private boolean a() {
        return this.p.get(0);
    }

    private boolean b() {
        return this.p.get(1);
    }

    private boolean c() {
        return this.p.get(2);
    }

    private boolean d() {
        return this.p.get(3);
    }

    private boolean e() {
        return this.p.get(4);
    }

    private boolean f() {
        return this.f != null;
    }

    private boolean g() {
        return this.p.get(5);
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        if (a()) {
            iwVar.a(i);
            iwVar.a(this.a);
        }
        if (b()) {
            iwVar.a(j);
            iwVar.a(this.b);
        }
        if (c()) {
            iwVar.a(k);
            iwVar.a(this.c);
        }
        if (d()) {
            iwVar.a(l);
            iwVar.a(this.d);
        }
        if (e()) {
            iwVar.a(m);
            iwVar.a(this.e);
        }
        if (this.f != null && f()) {
            iwVar.a(n);
            iwVar.a(this.f);
        }
        if (g()) {
            iwVar.a(o);
            iwVar.a(this.g);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        if (a()) {
            sb.append("key:");
            sb.append(this.a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.b);
            z = false;
        }
        if (c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.c);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.d);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.e);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.g);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hm hmVar;
        if (obj == null || !(obj instanceof hm) || (hmVar = (hm) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hmVar.a();
        if ((a || a2) && !(a && a2 && this.a == hmVar.a)) {
            return false;
        }
        boolean b = b();
        boolean b2 = hmVar.b();
        if ((b || b2) && !(b && b2 && this.b == hmVar.b)) {
            return false;
        }
        boolean c = c();
        boolean c2 = hmVar.c();
        if ((c || c2) && !(c && c2 && this.c == hmVar.c)) {
            return false;
        }
        boolean d = d();
        boolean d2 = hmVar.d();
        if ((d || d2) && !(d && d2 && this.d == hmVar.d)) {
            return false;
        }
        boolean e = e();
        boolean e2 = hmVar.e();
        if ((e || e2) && !(e && e2 && this.e == hmVar.e)) {
            return false;
        }
        boolean f = f();
        boolean f2 = hmVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(hmVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = hmVar.g();
        if (g || g2) {
            return g && g2 && this.g == hmVar.g;
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
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.a = iwVar.i();
                            this.p.set(0, true);
                            break;
                        }
                    case 2:
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.b = iwVar.i();
                            this.p.set(1, true);
                            break;
                        }
                    case 3:
                        if (b.b != 2) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.c = iwVar.f();
                            this.p.set(2, true);
                            break;
                        }
                    case 4:
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.d = iwVar.i();
                            this.p.set(3, true);
                            break;
                        }
                    case 5:
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.e = iwVar.j();
                            this.p.set(4, true);
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
                        if (b.b == 2) {
                            this.g = iwVar.f();
                            this.p.set(5, true);
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
        hm hmVar = (hm) obj;
        if (getClass().equals(hmVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hmVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a7 = im.a(this.a, hmVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hmVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a6 = im.a(this.b, hmVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hmVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a5 = im.a(this.c, hmVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hmVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a4 = im.a(this.d, hmVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hmVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a3 = im.a(this.e, hmVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hmVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a2 = im.a(this.f, hmVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hmVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a = im.a(this.g, hmVar.g)) == 0) {
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
        return getClass().getName().compareTo(hmVar.getClass().getName());
    }
}
