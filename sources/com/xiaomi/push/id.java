package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class id implements il<id, Object>, Serializable, Cloneable {
    private static final jb h = new jb("XmPushActionSendFeedbackResult");
    private static final it i = new it("", (byte) 11, 1);
    private static final it j = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it k = new it("", (byte) 11, 3);
    private static final it l = new it("", (byte) 11, 4);
    private static final it m = new it("", (byte) 10, 6);
    private static final it n = new it("", (byte) 11, 7);
    private static final it o = new it("", (byte) 11, 8);
    public String a;
    public hq b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    private BitSet p = new BitSet(1);

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
        return this.p.get(0);
    }

    private boolean f() {
        return this.f != null;
    }

    private boolean g() {
        return this.g != null;
    }

    private void h() {
        if (this.c == null) {
            throw new ix("Required field 'id' was not present! Struct: " + toString());
        } else if (this.d != null) {
        } else {
            throw new ix("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        h();
        if (this.a != null && a()) {
            iwVar.a(i);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(j);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(k);
            iwVar.a(this.c);
        }
        if (this.d != null) {
            iwVar.a(l);
            iwVar.a(this.d);
        }
        iwVar.a(m);
        iwVar.a(this.e);
        if (this.f != null && f()) {
            iwVar.a(n);
            iwVar.a(this.f);
        }
        if (this.g != null && g()) {
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
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
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
            sb.append("category:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        id idVar;
        if (obj == null || !(obj instanceof id) || (idVar = (id) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = idVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(idVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = idVar.b();
        if ((b || b2) && !(b && b2 && this.b.a(idVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = idVar.c();
        if ((c || c2) && !(c && c2 && this.c.equals(idVar.c))) {
            return false;
        }
        boolean d = d();
        boolean d2 = idVar.d();
        if (((d || d2) && !(d && d2 && this.d.equals(idVar.d))) || this.e != idVar.e) {
            return false;
        }
        boolean f = f();
        boolean f2 = idVar.f();
        if ((f || f2) && !(f && f2 && this.f.equals(idVar.f))) {
            return false;
        }
        boolean g = g();
        boolean g2 = idVar.g();
        if (g || g2) {
            return g && g2 && this.g.equals(idVar.g);
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
                            this.p.set(0, true);
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
                }
            } else if (e()) {
                h();
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
        id idVar = (id) obj;
        if (getClass().equals(idVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(idVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a7 = im.a(this.a, idVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(idVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a6 = im.a(this.b, idVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(idVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a5 = im.a(this.c, idVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(idVar.d()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!d() || (a4 = im.a(this.d, idVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(idVar.e()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!e() || (a3 = im.a(this.e, idVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(idVar.f()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!f() || (a2 = im.a(this.f, idVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(idVar.g()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!g() || (a = im.a(this.g, idVar.g)) == 0) {
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
        return getClass().getName().compareTo(idVar.getClass().getName());
    }
}
