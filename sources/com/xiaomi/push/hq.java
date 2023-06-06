package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class hq implements il<hq, Object>, Serializable, Cloneable {
    private static final jb g = new jb("Target");
    private static final it h = new it("", (byte) 10, 1);
    private static final it i = new it("", (byte) 11, 2);
    private static final it j = new it("", (byte) 11, 3);
    private static final it k = new it("", (byte) 11, 4);
    private static final it l = new it("", (byte) 2, 5);
    private static final it m = new it("", (byte) 11, 7);
    public String b;
    public String f;
    private BitSet n = new BitSet(2);
    public long a = 5;
    public String c = "xiaomi.com";
    public String d = "";
    public boolean e = false;

    private void a(boolean z) {
        this.n.set(0, true);
    }

    private boolean a() {
        return this.n.get(0);
    }

    private void b(boolean z) {
        this.n.set(1, true);
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
        return this.n.get(1);
    }

    private boolean f() {
        return this.f != null;
    }

    private void g() {
        if (this.b != null) {
            return;
        }
        throw new ix("Required field 'userId' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                if (a()) {
                    g();
                    return;
                }
                throw new ix("Required field 'channelId' was not found in serialized data! Struct: " + toString());
            }
            short s = b.c;
            if (s != 7) {
                switch (s) {
                    case 1:
                        if (b.b != 10) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.a = iwVar.j();
                            a(true);
                            break;
                        }
                    case 2:
                        if (b.b != 11) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.b = iwVar.l();
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
                        if (b.b != 2) {
                            iz.a(iwVar, b.b);
                            break;
                        } else {
                            this.e = iwVar.f();
                            b(true);
                            break;
                        }
                    default:
                        iz.a(iwVar, b.b);
                        break;
                }
            } else if (b.b == 11) {
                this.f = iwVar.l();
            } else {
                iz.a(iwVar, b.b);
            }
        }
    }

    public final boolean a(hq hqVar) {
        if (hqVar != null && this.a == hqVar.a) {
            boolean b = b();
            boolean b2 = hqVar.b();
            if ((b || b2) && !(b && b2 && this.b.equals(hqVar.b))) {
                return false;
            }
            boolean c = c();
            boolean c2 = hqVar.c();
            if ((c || c2) && !(c && c2 && this.c.equals(hqVar.c))) {
                return false;
            }
            boolean d = d();
            boolean d2 = hqVar.d();
            if ((d || d2) && !(d && d2 && this.d.equals(hqVar.d))) {
                return false;
            }
            boolean e = e();
            boolean e2 = hqVar.e();
            if ((e || e2) && !(e && e2 && this.e == hqVar.e)) {
                return false;
            }
            boolean f = f();
            boolean f2 = hqVar.f();
            if (f || f2) {
                return f && f2 && this.f.equals(hqVar.f);
            }
            return true;
        }
        return false;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        g();
        iwVar.a(h);
        iwVar.a(this.a);
        if (this.b != null) {
            iwVar.a(i);
            iwVar.a(this.b);
        }
        if (this.c != null && c()) {
            iwVar.a(j);
            iwVar.a(this.c);
        }
        if (this.d != null && d()) {
            iwVar.a(k);
            iwVar.a(this.d);
        }
        if (e()) {
            iwVar.a(l);
            iwVar.a(this.e);
        }
        if (this.f != null && f()) {
            iwVar.a(m);
            iwVar.a(this.f);
        }
        iwVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof hq)) {
            return a((hq) obj);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.a);
        sb.append(", ");
        sb.append("userId:");
        sb.append(this.b == null ? StringUtil.NULL : this.b);
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            sb.append(this.c == null ? StringUtil.NULL : this.c);
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            sb.append(this.d == null ? StringUtil.NULL : this.d);
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.e);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
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
        hq hqVar = (hq) obj;
        if (getClass().equals(hqVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hqVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a6 = im.a(this.a, hqVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hqVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a5 = im.a(this.b, hqVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hqVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a4 = im.a(this.c, hqVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hqVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a3 = im.a(this.d, hqVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hqVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a2 = im.a(this.e, hqVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hqVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a = im.a(this.f, hqVar.f)) == 0) {
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
        return getClass().getName().compareTo(hqVar.getClass().getName());
    }
}
