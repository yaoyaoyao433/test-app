package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes6.dex */
public final class hw implements il<hw, Object>, Serializable, Cloneable {
    private static final jb k = new jb("XmPushActionCommandResult");
    private static final it l = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it m = new it("", (byte) 11, 3);
    private static final it n = new it("", (byte) 11, 4);
    private static final it o = new it("", (byte) 11, 5);
    private static final it p = new it("", (byte) 10, 7);
    private static final it q = new it("", (byte) 11, 8);
    private static final it r = new it("", (byte) 11, 9);
    private static final it s = new it("", (byte) 15, 10);
    private static final it t = new it("", (byte) 11, 12);
    private static final it u = new it("", (byte) 2, 13);
    public hq a;
    public String b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public List<String> h;
    public String i;
    private BitSet v = new BitSet(2);
    public boolean j = true;

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
        return this.v.get(0);
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

    private boolean j() {
        return this.v.get(1);
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
        iwVar.a(p);
        iwVar.a(this.e);
        if (this.f != null && f()) {
            iwVar.a(q);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
            iwVar.a(r);
            iwVar.a(this.g);
        }
        if (this.h != null && h()) {
            iwVar.a(s);
            iwVar.a(new iu((byte) 11, this.h.size()));
            for (String str : this.h) {
                iwVar.a(str);
            }
        }
        if (this.i != null && i()) {
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
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
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
            sb.append("cmdArgs:");
            if (this.h == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.h);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.j);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hw hwVar;
        if (obj == null || !(obj instanceof hw) || (hwVar = (hw) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hwVar.a();
        if ((a || a2) && !(a && a2 && this.a.a(hwVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = hwVar.b();
        if ((b || b2) && !(b && b2 && this.b.equals(hwVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = hwVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(hwVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = hwVar.d();
        if (((d || d2) && !(d && d2 && this.d.equals(hwVar.d))) || this.e != hwVar.e) {
            return false;
        }
        boolean f = f();
        boolean f2 = hwVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(hwVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = hwVar.g();
        if ((g || g2) && !(g && g2 && this.g.equals(hwVar.g))) {
            return false;
        }
        boolean h = h();
        boolean h2 = hwVar.h();
        if ((h || h2) && !(h && h2 && this.h.equals(hwVar.h))) {
            return false;
        }
        boolean i = i();
        boolean i2 = hwVar.i();
        if ((i || i2) && !(i && i2 && this.i.equals(hwVar.i))) {
            return false;
        }
        boolean j = j();
        boolean j2 = hwVar.j();
        if (j || j2) {
            return j && j2 && this.j == hwVar.j;
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
                    case 11:
                    default:
                        iz.a(iwVar, b.b);
                        break;
                    case 7:
                        if (b.b == 10) {
                            this.e = iwVar.j();
                            this.v.set(0, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 8:
                        if (b.b == 11) {
                            this.f = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 9:
                        if (b.b == 11) {
                            this.g = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 10:
                        if (b.b == 15) {
                            iu d = iwVar.d();
                            this.h = new ArrayList(d.b);
                            for (int i = 0; i < d.b; i++) {
                                this.h.add(iwVar.l());
                            }
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 12:
                        if (b.b == 11) {
                            this.i = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 13:
                        if (b.b == 2) {
                            this.j = iwVar.f();
                            this.v.set(1, true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                }
            } else if (!e()) {
                throw new ix("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
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
        hw hwVar = (hw) obj;
        if (getClass().equals(hwVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hwVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a10 = im.a(this.a, hwVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hwVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a9 = im.a(this.b, hwVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hwVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a8 = im.a(this.c, hwVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hwVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a7 = im.a(this.d, hwVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hwVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a6 = im.a(this.e, hwVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hwVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a5 = im.a(this.f, hwVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hwVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a4 = im.a(this.g, hwVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hwVar.h()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!h() || (a3 = im.a(this.h, hwVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hwVar.i()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!i() || (a2 = im.a(this.i, hwVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(hwVar.j()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!j() || (a = im.a(this.j, hwVar.j)) == 0) {
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
        return getClass().getName().compareTo(hwVar.getClass().getName());
    }
}
