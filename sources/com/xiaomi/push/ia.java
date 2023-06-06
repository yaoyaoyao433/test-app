package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ia implements il<ia, Object>, Serializable, Cloneable {
    private BitSet F;
    public String a;
    public hq b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public Map<String, String> h;
    public String i;
    public String j;
    public String k;
    public String l;
    public ByteBuffer m;
    public long n;
    public boolean o;
    private static final jb p = new jb("XmPushActionNotification");
    private static final it q = new it("", (byte) 11, 1);
    private static final it r = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 2);
    private static final it s = new it("", (byte) 11, 3);
    private static final it t = new it("", (byte) 11, 4);
    private static final it u = new it("", (byte) 11, 5);
    private static final it v = new it("", (byte) 2, 6);
    private static final it w = new it("", (byte) 11, 7);
    private static final it x = new it("", (byte) 13, 8);
    private static final it y = new it("", (byte) 11, 9);
    private static final it z = new it("", (byte) 11, 10);
    private static final it A = new it("", (byte) 11, 12);
    private static final it B = new it("", (byte) 11, 13);
    private static final it C = new it("", (byte) 11, 14);
    private static final it D = new it("", (byte) 10, 15);
    private static final it E = new it("", (byte) 2, 20);

    public ia() {
        this.F = new BitSet(3);
        this.f = true;
        this.o = false;
    }

    public ia(String str, boolean z2) {
        this();
        this.c = str;
        this.f = z2;
        b(true);
    }

    private void b(boolean z2) {
        this.F.set(0, true);
    }

    private boolean b() {
        return this.a != null;
    }

    private boolean c() {
        return this.b != null;
    }

    private boolean d() {
        return this.c != null;
    }

    private boolean e() {
        return this.d != null;
    }

    private boolean f() {
        return this.e != null;
    }

    private boolean g() {
        return this.F.get(0);
    }

    private boolean h() {
        return this.g != null;
    }

    private boolean i() {
        return this.h != null;
    }

    private boolean j() {
        return this.i != null;
    }

    private boolean k() {
        return this.j != null;
    }

    private boolean l() {
        return this.k != null;
    }

    private boolean m() {
        return this.l != null;
    }

    private boolean n() {
        return this.m != null;
    }

    private boolean o() {
        return this.F.get(1);
    }

    private boolean p() {
        return this.F.get(2);
    }

    private void q() {
        if (this.c != null) {
            return;
        }
        throw new ix("Required field 'id' was not present! Struct: " + toString());
    }

    public final ia a(boolean z2) {
        this.f = z2;
        b(true);
        return this;
    }

    public final void a(String str, String str2) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        this.h.put(str, str2);
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        q();
        if (this.a != null && b()) {
            iwVar.a(q);
            iwVar.a(this.a);
        }
        if (this.b != null && c()) {
            iwVar.a(r);
            this.b.b(iwVar);
        }
        if (this.c != null) {
            iwVar.a(s);
            iwVar.a(this.c);
        }
        if (this.d != null && e()) {
            iwVar.a(t);
            iwVar.a(this.d);
        }
        if (this.e != null && f()) {
            iwVar.a(u);
            iwVar.a(this.e);
        }
        iwVar.a(v);
        iwVar.a(this.f);
        if (this.g != null && h()) {
            iwVar.a(w);
            iwVar.a(this.g);
        }
        if (this.h != null && i()) {
            iwVar.a(x);
            iwVar.a(new iv((byte) 11, (byte) 11, this.h.size()));
            for (Map.Entry<String, String> entry : this.h.entrySet()) {
                iwVar.a(entry.getKey());
                iwVar.a(entry.getValue());
            }
        }
        if (this.i != null && j()) {
            iwVar.a(y);
            iwVar.a(this.i);
        }
        if (this.j != null && k()) {
            iwVar.a(z);
            iwVar.a(this.j);
        }
        if (this.k != null && l()) {
            iwVar.a(A);
            iwVar.a(this.k);
        }
        if (this.l != null && m()) {
            iwVar.a(B);
            iwVar.a(this.l);
        }
        if (this.m != null && n()) {
            iwVar.a(C);
            iwVar.a(this.m);
        }
        if (o()) {
            iwVar.a(D);
            iwVar.a(this.n);
        }
        if (p()) {
            iwVar.a(E);
            iwVar.a(this.o);
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        if (b()) {
            sb.append("debug:");
            sb.append(this.a == null ? StringUtil.NULL : this.a);
            z2 = false;
        } else {
            z2 = true;
        }
        if (c()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.b == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.b);
            }
            z2 = false;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.c == null ? StringUtil.NULL : this.c);
        if (e()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.d == null ? StringUtil.NULL : this.d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("type:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f);
        if (h()) {
            sb.append(", ");
            sb.append("payload:");
            sb.append(this.g == null ? StringUtil.NULL : this.g);
        }
        if (i()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.h == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.h);
            }
        }
        if (j()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.i == null ? StringUtil.NULL : this.i);
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.j == null ? StringUtil.NULL : this.j);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.k == null ? StringUtil.NULL : this.k);
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.l == null ? StringUtil.NULL : this.l);
        }
        if (n()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            if (this.m == null) {
                sb.append(StringUtil.NULL);
            } else {
                im.a(this.m, sb);
            }
        }
        if (o()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.n);
        }
        if (p()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.o);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final byte[] a() {
        this.m = im.a(this.m);
        return this.m.array();
    }

    public final ia a(byte[] bArr) {
        this.m = ByteBuffer.wrap(bArr);
        return this;
    }

    public final boolean equals(Object obj) {
        ia iaVar;
        if (obj == null || !(obj instanceof ia) || (iaVar = (ia) obj) == null) {
            return false;
        }
        boolean b = b();
        boolean b2 = iaVar.b();
        if ((b || b2) && !(b && b2 && this.a.equals(iaVar.a))) {
            return false;
        }
        boolean c = c();
        boolean c2 = iaVar.c();
        if ((c || c2) && !(c && c2 && this.b.a(iaVar.b))) {
            return false;
        }
        boolean d = d();
        boolean d2 = iaVar.d();
        if ((d || d2) && !(d && d2 && this.c.equals(iaVar.c))) {
            return false;
        }
        boolean e = e();
        boolean e2 = iaVar.e();
        if ((e || e2) && !(e && e2 && this.d.equals(iaVar.d))) {
            return false;
        }
        boolean f = f();
        boolean f2 = iaVar.f();
        if (((f || f2) && !(f && f2 && this.e.equals(iaVar.e))) || this.f != iaVar.f) {
            return false;
        }
        boolean h = h();
        boolean h2 = iaVar.h();
        if ((h || h2) && !(h && h2 && this.g.equals(iaVar.g))) {
            return false;
        }
        boolean i = i();
        boolean i2 = iaVar.i();
        if ((i || i2) && !(i && i2 && this.h.equals(iaVar.h))) {
            return false;
        }
        boolean j = j();
        boolean j2 = iaVar.j();
        if ((j || j2) && !(j && j2 && this.i.equals(iaVar.i))) {
            return false;
        }
        boolean k = k();
        boolean k2 = iaVar.k();
        if ((k || k2) && !(k && k2 && this.j.equals(iaVar.j))) {
            return false;
        }
        boolean l = l();
        boolean l2 = iaVar.l();
        if ((l || l2) && !(l && l2 && this.k.equals(iaVar.k))) {
            return false;
        }
        boolean m = m();
        boolean m2 = iaVar.m();
        if ((m || m2) && !(m && m2 && this.l.equals(iaVar.l))) {
            return false;
        }
        boolean n = n();
        boolean n2 = iaVar.n();
        if ((n || n2) && !(n && n2 && this.m.equals(iaVar.m))) {
            return false;
        }
        boolean o = o();
        boolean o2 = iaVar.o();
        if ((o || o2) && !(o && o2 && this.n == iaVar.n)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = iaVar.p();
        if (p2 || p3) {
            return p2 && p3 && this.o == iaVar.o;
        }
        return true;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                if (g()) {
                    q();
                    return;
                }
                throw new ix("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            short s2 = b.c;
            if (s2 == 20) {
                if (b.b == 2) {
                    this.o = iwVar.f();
                    this.F.set(2, true);
                } else {
                    iz.a(iwVar, b.b);
                }
            } else {
                switch (s2) {
                    case 1:
                        if (b.b == 11) {
                            this.a = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 2:
                        if (b.b == 12) {
                            this.b = new hq();
                            this.b.a(iwVar);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 3:
                        if (b.b == 11) {
                            this.c = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 4:
                        if (b.b == 11) {
                            this.d = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 5:
                        if (b.b == 11) {
                            this.e = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 6:
                        if (b.b == 2) {
                            this.f = iwVar.f();
                            b(true);
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 7:
                        if (b.b == 11) {
                            this.g = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 8:
                        if (b.b == 13) {
                            iv c = iwVar.c();
                            this.h = new HashMap(c.c * 2);
                            for (int i = 0; i < c.c; i++) {
                                this.h.put(iwVar.l(), iwVar.l());
                            }
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 9:
                        if (b.b == 11) {
                            this.i = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    case 10:
                        if (b.b == 11) {
                            this.j = iwVar.l();
                            break;
                        } else {
                            iz.a(iwVar, b.b);
                            break;
                        }
                    default:
                        switch (s2) {
                            case 12:
                                if (b.b == 11) {
                                    this.k = iwVar.l();
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            case 13:
                                if (b.b == 11) {
                                    this.l = iwVar.l();
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            case 14:
                                if (b.b == 11) {
                                    this.m = iwVar.m();
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            case 15:
                                if (b.b == 10) {
                                    this.n = iwVar.j();
                                    this.F.set(1, true);
                                    break;
                                } else {
                                    iz.a(iwVar, b.b);
                                    break;
                                }
                            default:
                                iz.a(iwVar, b.b);
                                break;
                        }
                }
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
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        ia iaVar = (ia) obj;
        if (getClass().equals(iaVar.getClass())) {
            int compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iaVar.b()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!b() || (a15 = im.a(this.a, iaVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iaVar.c()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!c() || (a14 = im.a(this.b, iaVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iaVar.d()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!d() || (a13 = im.a(this.c, iaVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iaVar.e()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!e() || (a12 = im.a(this.d, iaVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iaVar.f()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!f() || (a11 = im.a(this.e, iaVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iaVar.g()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!g() || (a10 = im.a(this.f, iaVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iaVar.h()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!h() || (a9 = im.a(this.g, iaVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(iaVar.i()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!i() || (a8 = im.a(this.h, iaVar.h)) == 0) {
                                            int compareTo9 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(iaVar.j()));
                                            if (compareTo9 != 0) {
                                                return compareTo9;
                                            }
                                            if (!j() || (a7 = im.a(this.i, iaVar.i)) == 0) {
                                                int compareTo10 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(iaVar.k()));
                                                if (compareTo10 != 0) {
                                                    return compareTo10;
                                                }
                                                if (!k() || (a6 = im.a(this.j, iaVar.j)) == 0) {
                                                    int compareTo11 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(iaVar.l()));
                                                    if (compareTo11 != 0) {
                                                        return compareTo11;
                                                    }
                                                    if (!l() || (a5 = im.a(this.k, iaVar.k)) == 0) {
                                                        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(iaVar.m()));
                                                        if (compareTo12 != 0) {
                                                            return compareTo12;
                                                        }
                                                        if (!m() || (a4 = im.a(this.l, iaVar.l)) == 0) {
                                                            int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(iaVar.n()));
                                                            if (compareTo13 != 0) {
                                                                return compareTo13;
                                                            }
                                                            if (!n() || (a3 = im.a(this.m, iaVar.m)) == 0) {
                                                                int compareTo14 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(iaVar.o()));
                                                                if (compareTo14 != 0) {
                                                                    return compareTo14;
                                                                }
                                                                if (!o() || (a2 = im.a(this.n, iaVar.n)) == 0) {
                                                                    int compareTo15 = Boolean.valueOf(p()).compareTo(Boolean.valueOf(iaVar.p()));
                                                                    if (compareTo15 != 0) {
                                                                        return compareTo15;
                                                                    }
                                                                    if (!p() || (a = im.a(this.o, iaVar.o)) == 0) {
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
                            return a11;
                        }
                        return a12;
                    }
                    return a13;
                }
                return a14;
            }
            return a15;
        }
        return getClass().getName().compareTo(iaVar.getClass().getName());
    }
}
