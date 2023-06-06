package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class es implements il<es, Object>, Serializable, Cloneable {
    private static final jb d = new jb("StatsEvents");
    private static final it e = new it("", (byte) 11, 1);
    private static final it f = new it("", (byte) 11, 2);
    private static final it g = new it("", (byte) 15, 3);
    public String a;
    public String b;
    public List<er> c;

    public es() {
    }

    public es(String str, List<er> list) {
        this();
        this.a = str;
        this.c = list;
    }

    private boolean a() {
        return this.a != null;
    }

    private boolean b() {
        return this.b != null;
    }

    private boolean c() {
        return this.c != null;
    }

    private void d() {
        if (this.a == null) {
            throw new ix("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.c != null) {
        } else {
            throw new ix("Required field 'events' was not present! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                d();
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
                    if (b.b != 11) {
                        break;
                    } else {
                        this.b = iwVar.l();
                        continue;
                    }
                case 3:
                    if (b.b != 15) {
                        break;
                    } else {
                        iu d2 = iwVar.d();
                        this.c = new ArrayList(d2.b);
                        for (int i = 0; i < d2.b; i++) {
                            er erVar = new er();
                            erVar.a(iwVar);
                            this.c.add(erVar);
                        }
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        d();
        if (this.a != null) {
            iwVar.a(e);
            iwVar.a(this.a);
        }
        if (this.b != null && b()) {
            iwVar.a(f);
            iwVar.a(this.b);
        }
        if (this.c != null) {
            iwVar.a(g);
            iwVar.a(new iu(com.tencent.mapsdk.internal.p.ZERO_TAG, this.c.size()));
            for (er erVar : this.c) {
                erVar.b(iwVar);
            }
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        sb.append(this.a == null ? StringUtil.NULL : this.a);
        if (b()) {
            sb.append(", ");
            sb.append("operator:");
            sb.append(this.b == null ? StringUtil.NULL : this.b);
        }
        sb.append(", ");
        sb.append("events:");
        if (this.c == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.c);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        es esVar;
        if (obj == null || !(obj instanceof es) || (esVar = (es) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = esVar.a();
        if ((a || a2) && !(a && a2 && this.a.equals(esVar.a))) {
            return false;
        }
        boolean b = b();
        boolean b2 = esVar.b();
        if ((b || b2) && !(b && b2 && this.b.equals(esVar.b))) {
            return false;
        }
        boolean c = c();
        boolean c2 = esVar.c();
        if (c || c2) {
            return c && c2 && this.c.equals(esVar.c);
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        int a2;
        int a3;
        es esVar = (es) obj;
        if (getClass().equals(esVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(esVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a3 = im.a(this.a, esVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(esVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a2 = im.a(this.b, esVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(esVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a = im.a(this.c, esVar.c)) == 0) {
                        return 0;
                    }
                    return a;
                }
                return a2;
            }
            return a3;
        }
        return getClass().getName().compareTo(esVar.getClass().getName());
    }
}
