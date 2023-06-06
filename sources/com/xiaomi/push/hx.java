package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class hx implements il<hx, Object>, Serializable, Cloneable {
    private static final jb i = new jb("XmPushActionContainer");
    private static final it j = new it("", (byte) 8, 1);
    private static final it k = new it("", (byte) 2, 2);
    private static final it l = new it("", (byte) 2, 3);
    private static final it m = new it("", (byte) 11, 4);
    private static final it n = new it("", (byte) 11, 5);
    private static final it o = new it("", (byte) 11, 6);
    private static final it p = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 7);
    private static final it q = new it("", com.tencent.mapsdk.internal.p.ZERO_TAG, 8);
    public ha a;
    public ByteBuffer d;
    public String e;
    public String f;
    public hq g;
    public ho h;
    private BitSet r = new BitSet(2);
    public boolean b = true;
    public boolean c = true;

    private boolean b() {
        return this.a != null;
    }

    private void c(boolean z) {
        this.r.set(0, true);
    }

    private boolean c() {
        return this.r.get(0);
    }

    private void d(boolean z) {
        this.r.set(1, true);
    }

    private boolean d() {
        return this.r.get(1);
    }

    private boolean e() {
        return this.d != null;
    }

    private boolean f() {
        return this.e != null;
    }

    private boolean g() {
        return this.f != null;
    }

    private boolean h() {
        return this.g != null;
    }

    private boolean i() {
        return this.h != null;
    }

    private void j() {
        if (this.a == null) {
            throw new ix("Required field 'action' was not present! Struct: " + toString());
        } else if (this.d == null) {
            throw new ix("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.g != null) {
        } else {
            throw new ix("Required field 'target' was not present! Struct: " + toString());
        }
    }

    public final hx a(boolean z) {
        this.b = z;
        c(true);
        return this;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                if (!c()) {
                    throw new ix("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                } else if (d()) {
                    j();
                    return;
                } else {
                    throw new ix("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (b.c) {
                case 1:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.a = ha.a(iwVar.i());
                        continue;
                    }
                case 2:
                    if (b.b != 2) {
                        break;
                    } else {
                        this.b = iwVar.f();
                        c(true);
                        continue;
                    }
                case 3:
                    if (b.b != 2) {
                        break;
                    } else {
                        this.c = iwVar.f();
                        d(true);
                        continue;
                    }
                case 4:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.d = iwVar.m();
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
                    if (b.b != 12) {
                        break;
                    } else {
                        this.g = new hq();
                        this.g.a(iwVar);
                        continue;
                    }
                case 8:
                    if (b.b != 12) {
                        break;
                    } else {
                        this.h = new ho();
                        this.h.a(iwVar);
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    public final hx b(boolean z) {
        this.c = z;
        d(true);
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        if (this.a == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.a);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.c);
        sb.append(", ");
        sb.append("pushAction:");
        if (this.d == null) {
            sb.append(StringUtil.NULL);
        } else {
            im.a(this.d, sb);
        }
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            sb.append(this.e == null ? StringUtil.NULL : this.e);
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f == null ? StringUtil.NULL : this.f);
        }
        sb.append(", ");
        sb.append("target:");
        if (this.g == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.g);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            if (this.h == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.h);
            }
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final byte[] a() {
        this.d = im.a(this.d);
        return this.d.array();
    }

    public final boolean equals(Object obj) {
        hx hxVar;
        if (obj == null || !(obj instanceof hx) || (hxVar = (hx) obj) == null) {
            return false;
        }
        boolean b = b();
        boolean b2 = hxVar.b();
        if (((!b && !b2) || (b && b2 && this.a.equals(hxVar.a))) && this.b == hxVar.b && this.c == hxVar.c) {
            boolean e = e();
            boolean e2 = hxVar.e();
            if ((e || e2) && !(e && e2 && this.d.equals(hxVar.d))) {
                return false;
            }
            boolean f = f();
            boolean f2 = hxVar.f();
            if ((f || f2) && !(f && f2 && this.e.equals(hxVar.e))) {
                return false;
            }
            boolean g = g();
            boolean g2 = hxVar.g();
            if ((g || g2) && !(g && g2 && this.f.equals(hxVar.f))) {
                return false;
            }
            boolean h = h();
            boolean h2 = hxVar.h();
            if ((h || h2) && !(h && h2 && this.g.a(hxVar.g))) {
                return false;
            }
            boolean i2 = i();
            boolean i3 = hxVar.i();
            if (i2 || i3) {
                return i2 && i3 && this.h.a(hxVar.h);
            }
            return true;
        }
        return false;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        j();
        if (this.a != null) {
            iwVar.a(j);
            iwVar.a(this.a.L);
        }
        iwVar.a(k);
        iwVar.a(this.b);
        iwVar.a(l);
        iwVar.a(this.c);
        if (this.d != null) {
            iwVar.a(m);
            iwVar.a(this.d);
        }
        if (this.e != null && f()) {
            iwVar.a(n);
            iwVar.a(this.e);
        }
        if (this.f != null && g()) {
            iwVar.a(o);
            iwVar.a(this.f);
        }
        if (this.g != null) {
            iwVar.a(p);
            this.g.b(iwVar);
        }
        if (this.h != null && i()) {
            iwVar.a(q);
            this.h.b(iwVar);
        }
        iwVar.a();
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
        hx hxVar = (hx) obj;
        if (getClass().equals(hxVar.getClass())) {
            int compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hxVar.b()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!b() || (a8 = im.a(this.a, hxVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hxVar.c()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!c() || (a7 = im.a(this.b, hxVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(hxVar.d()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!d() || (a6 = im.a(this.c, hxVar.c)) == 0) {
                        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(hxVar.e()));
                        if (compareTo4 != 0) {
                            return compareTo4;
                        }
                        if (!e() || (a5 = im.a(this.d, hxVar.d)) == 0) {
                            int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(hxVar.f()));
                            if (compareTo5 != 0) {
                                return compareTo5;
                            }
                            if (!f() || (a4 = im.a(this.e, hxVar.e)) == 0) {
                                int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(hxVar.g()));
                                if (compareTo6 != 0) {
                                    return compareTo6;
                                }
                                if (!g() || (a3 = im.a(this.f, hxVar.f)) == 0) {
                                    int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(hxVar.h()));
                                    if (compareTo7 != 0) {
                                        return compareTo7;
                                    }
                                    if (!h() || (a2 = im.a(this.g, hxVar.g)) == 0) {
                                        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(hxVar.i()));
                                        if (compareTo8 != 0) {
                                            return compareTo8;
                                        }
                                        if (!i() || (a = im.a(this.h, hxVar.h)) == 0) {
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
        return getClass().getName().compareTo(hxVar.getClass().getName());
    }
}
