package com.xiaomi.push;

import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class hj implements il<hj, Object>, Serializable, Cloneable {
    private static final jb d = new jb("DataCollectionItem");
    private static final it e = new it("", (byte) 10, 1);
    private static final it f = new it("", (byte) 8, 2);
    private static final it g = new it("", (byte) 11, 3);
    public long a;
    public hc b;
    public String c;
    private BitSet h = new BitSet(1);

    private void a(boolean z) {
        this.h.set(0, true);
    }

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
        if (this.b == null) {
            throw new ix("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.c != null) {
        } else {
            throw new ix("Required field 'content' was not present! Struct: " + toString());
        }
    }

    public final hj a(long j) {
        this.a = j;
        a(true);
        return this;
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
                throw new ix("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
            }
            switch (b.c) {
                case 1:
                    if (b.b != 10) {
                        break;
                    } else {
                        this.a = iwVar.j();
                        a(true);
                        continue;
                    }
                case 2:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.b = hc.a(iwVar.i());
                        continue;
                    }
                case 3:
                    if (b.b != 11) {
                        break;
                    } else {
                        this.c = iwVar.l();
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.a);
        sb.append(", ");
        sb.append("collectionType:");
        if (this.b == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.b);
        }
        sb.append(", ");
        sb.append(MTURLUtil.CONTENT_BASE);
        sb.append(this.c == null ? StringUtil.NULL : this.c);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hj hjVar;
        if (obj != null && (obj instanceof hj) && (hjVar = (hj) obj) != null && this.a == hjVar.a) {
            boolean b = b();
            boolean b2 = hjVar.b();
            if ((b || b2) && !(b && b2 && this.b.equals(hjVar.b))) {
                return false;
            }
            boolean c = c();
            boolean c2 = hjVar.c();
            if (c || c2) {
                return c && c2 && this.c.equals(hjVar.c);
            }
            return true;
        }
        return false;
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        d();
        iwVar.a(e);
        iwVar.a(this.a);
        if (this.b != null) {
            iwVar.a(f);
            iwVar.a(this.b.y);
        }
        if (this.c != null) {
            iwVar.a(g);
            iwVar.a(this.c);
        }
        iwVar.a();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        int a2;
        int a3;
        hj hjVar = (hj) obj;
        if (getClass().equals(hjVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hjVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a3 = im.a(this.a, hjVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(hjVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a2 = im.a(this.b, hjVar.b)) == 0) {
                    int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(hjVar.c()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    if (!c() || (a = im.a(this.c, hjVar.c)) == 0) {
                        return 0;
                    }
                    return a;
                }
                return a2;
            }
            return a3;
        }
        return getClass().getName().compareTo(hjVar.getClass().getName());
    }
}
