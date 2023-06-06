package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class er implements il<er, Object>, Serializable, Cloneable {
    private static final jb k = new jb("StatsEvent");
    private static final it l = new it("", (byte) 3, 1);
    private static final it m = new it("", (byte) 8, 2);
    private static final it n = new it("", (byte) 8, 3);
    private static final it o = new it("", (byte) 11, 4);
    private static final it p = new it("", (byte) 11, 5);
    private static final it q = new it("", (byte) 8, 6);
    private static final it r = new it("", (byte) 11, 7);
    private static final it s = new it("", (byte) 11, 8);
    private static final it t = new it("", (byte) 8, 9);
    private static final it u = new it("", (byte) 8, 10);
    public byte a;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    private BitSet v = new BitSet(6);

    private void a(boolean z) {
        this.v.set(0, true);
    }

    private boolean a() {
        return this.v.get(0);
    }

    private void b(boolean z) {
        this.v.set(1, true);
    }

    private boolean b() {
        return this.v.get(1);
    }

    private void c(boolean z) {
        this.v.set(2, true);
    }

    private boolean c() {
        return this.v.get(2);
    }

    private void d(boolean z) {
        this.v.set(3, true);
    }

    private boolean d() {
        return this.d != null;
    }

    private void e(boolean z) {
        this.v.set(4, true);
    }

    private boolean e() {
        return this.e != null;
    }

    private boolean f() {
        return this.v.get(3);
    }

    private boolean g() {
        return this.g != null;
    }

    private boolean h() {
        return this.h != null;
    }

    private boolean i() {
        return this.v.get(4);
    }

    private boolean j() {
        return this.v.get(5);
    }

    private void k() {
        if (this.d != null) {
            return;
        }
        throw new ix("Required field 'connpt' was not present! Struct: " + toString());
    }

    public final er a(byte b) {
        this.a = b;
        a(true);
        return this;
    }

    public final er a(int i) {
        this.b = i;
        b(true);
        return this;
    }

    public final er b(int i) {
        this.c = i;
        c(true);
        return this;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        k();
        iwVar.a(l);
        iwVar.a(this.a);
        iwVar.a(m);
        iwVar.a(this.b);
        iwVar.a(n);
        iwVar.a(this.c);
        if (this.d != null) {
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

    public final er c(int i) {
        this.f = i;
        d(true);
        return this;
    }

    public final er d(int i) {
        this.i = i;
        e(true);
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append((int) this.a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.c);
        sb.append(", ");
        sb.append("connpt:");
        sb.append(this.d == null ? StringUtil.NULL : this.d);
        if (e()) {
            sb.append(", ");
            sb.append("host:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f);
        }
        if (g()) {
            sb.append(", ");
            sb.append("annotation:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (h()) {
            sb.append(", ");
            sb.append("user:");
            sb.append(this.h == null ? StringUtil.NULL : this.h);
        }
        if (i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.j);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        er erVar;
        if (obj != null && (obj instanceof er) && (erVar = (er) obj) != null && this.a == erVar.a && this.b == erVar.b && this.c == erVar.c) {
            boolean d = d();
            boolean d2 = erVar.d();
            if ((d || d2) && !(d && d2 && this.d.equals(erVar.d))) {
                return false;
            }
            boolean e = e();
            boolean e2 = erVar.e();
            if ((e || e2) && !(e && e2 && this.e.equals(erVar.e))) {
                return false;
            }
            boolean f = f();
            boolean f2 = erVar.f();
            if ((f || f2) && !(f && f2 && this.f == erVar.f)) {
                return false;
            }
            boolean g = g();
            boolean g2 = erVar.g();
            if ((g || g2) && !(g && g2 && this.g.equals(erVar.g))) {
                return false;
            }
            boolean h = h();
            boolean h2 = erVar.h();
            if ((h || h2) && !(h && h2 && this.h.equals(erVar.h))) {
                return false;
            }
            boolean i = i();
            boolean i2 = erVar.i();
            if ((i || i2) && !(i && i2 && this.i == erVar.i)) {
                return false;
            }
            boolean j = j();
            boolean j2 = erVar.j();
            if (j || j2) {
                return j && j2 && this.j == erVar.j;
            }
            return true;
        }
        return false;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b != 0) {
                switch (b.c) {
                    case 1:
                        if (b.b != 3) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.a = iwVar.g();
                            a(true);
                            break;
                        }
                    case 2:
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.b = iwVar.i();
                            b(true);
                            break;
                        }
                    case 3:
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.c = iwVar.i();
                            c(true);
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
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.f = iwVar.i();
                            d(true);
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
                        if (b.b != 8) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.i = iwVar.i();
                            e(true);
                            break;
                        }
                    case 10:
                        if (b.b == 8) {
                            this.j = iwVar.i();
                            this.v.set(5, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    default:
                        iz.a(iwVar, b.b);
                        break;
                }
            } else if (!a()) {
                throw new ix("Required field 'chid' was not found in serialized data! Struct: " + toString());
            } else if (!b()) {
                throw new ix("Required field 'type' was not found in serialized data! Struct: " + toString());
            } else if (c()) {
                k();
                return;
            } else {
                throw new ix("Required field 'value' was not found in serialized data! Struct: " + toString());
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
        er erVar = (er) obj;
        if (getClass().equals(erVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(erVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a10 = im.a(this.a, erVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(erVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a9 = im.a(this.b, erVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(erVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a8 = im.a(this.c, erVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(erVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a7 = im.a(this.d, erVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(erVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a6 = im.a(this.e, erVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(erVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a5 = im.a(this.f, erVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(erVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a4 = im.a(this.g, erVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(erVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a3 = im.a(this.h, erVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(erVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a2 = im.a(this.i, erVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(erVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a = im.a(this.j, erVar.j)) == 0) {
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
        return getClass().getName().compareTo(erVar.getClass().getName());
    }
}
