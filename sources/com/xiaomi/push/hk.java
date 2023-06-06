package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes6.dex */
public final class hk implements il<hk, Object>, Serializable, Cloneable {
    private static final jb d = new jb("NormalConfig");
    private static final it e = new it("", (byte) 8, 1);
    private static final it f = new it("", (byte) 15, 2);
    private static final it g = new it("", (byte) 8, 3);
    public int a;
    public List<hm> b;
    public hh c;
    private BitSet h = new BitSet(1);

    private boolean a() {
        return this.h.get(0);
    }

    private boolean b() {
        return this.b != null;
    }

    private boolean c() {
        return this.c != null;
    }

    private void d() {
        if (this.b != null) {
            return;
        }
        throw new ix("Required field 'configItems' was not present! Struct: " + toString());
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.a);
        sb.append(", ");
        sb.append("configItems:");
        if (this.b == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.b);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            if (this.c == null) {
                sb.append(StringUtil.NULL);
            } else {
                sb.append(this.c);
            }
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hk hkVar;
        if (obj != null && (obj instanceof hk) && (hkVar = (hk) obj) != null && this.a == hkVar.a) {
            boolean b = b();
            boolean b2 = hkVar.b();
            if ((b || b2) && !(b && b2 && this.b.equals(hkVar.b))) {
                return false;
            }
            boolean c = c();
            boolean c2 = hkVar.c();
            if (c || c2) {
                return c && c2 && this.c.equals(hkVar.c);
            }
            return true;
        }
        return false;
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                if (a()) {
                    d();
                    return;
                }
                throw new ix("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            switch (b.c) {
                case 1:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.a = iwVar.i();
                        this.h.set(0, true);
                        continue;
                    }
                case 2:
                    if (b.b != 15) {
                        break;
                    } else {
                        iu d2 = iwVar.d();
                        this.b = new ArrayList(d2.b);
                        for (int i = 0; i < d2.b; i++) {
                            hm hmVar = new hm();
                            hmVar.a(iwVar);
                            this.b.add(hmVar);
                        }
                        continue;
                    }
                case 3:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.c = hh.a(iwVar.i());
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        d();
        iwVar.a(e);
        iwVar.a(this.a);
        if (this.b != null) {
            iwVar.a(f);
            iwVar.a(new iu(com.tencent.mapsdk.internal.p.ZERO_TAG, this.b.size()));
            for (hm hmVar : this.b) {
                hmVar.b(iwVar);
            }
        }
        if (this.c != null && c()) {
            iwVar.a(g);
            iwVar.a(this.c.c);
        }
        iwVar.a();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        int a2;
        int a3;
        hk hkVar = (hk) obj;
        if (getClass().equals(hkVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hkVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a3 = im.a(this.a, hkVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hkVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a2 = im.a(this.b, hkVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hkVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a = im.a(this.c, hkVar.c)) == 0) {
                        return 0;
                    }
                    return a;
                }
                return a2;
            }
            return a3;
        }
        return getClass().getName().compareTo(hkVar.getClass().getName());
    }
}
