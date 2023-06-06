package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import java.io.Serializable;
import java.util.BitSet;
/* loaded from: classes6.dex */
public final class ht implements il<ht, Object>, Serializable, Cloneable {
    private static final jb c = new jb("XmPushActionCheckClientInfo");
    private static final it d = new it("", (byte) 8, 1);
    private static final it e = new it("", (byte) 8, 2);
    public int a;
    public int b;
    private BitSet f = new BitSet(2);

    private boolean a() {
        return this.f.get(0);
    }

    private boolean b() {
        return this.f.get(1);
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b = iwVar.b();
            if (b.b == 0) {
                if (!a()) {
                    throw new ix("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
                } else if (b()) {
                    return;
                } else {
                    throw new ix("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (b.c) {
                case 1:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.a = iwVar.i();
                        a(true);
                        continue;
                    }
                case 2:
                    if (b.b != 8) {
                        break;
                    } else {
                        this.b = iwVar.i();
                        b(true);
                        continue;
                    }
            }
            iz.a(iwVar, b.b);
        }
    }

    public final void a(boolean z) {
        this.f.set(0, true);
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        iwVar.a(d);
        iwVar.a(this.a);
        iwVar.a(e);
        iwVar.a(this.b);
        iwVar.a();
    }

    public final void b(boolean z) {
        this.f.set(1, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.a + ", pluginConfigVersion:" + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public final boolean equals(Object obj) {
        ht htVar;
        return obj != null && (obj instanceof ht) && (htVar = (ht) obj) != null && this.a == htVar.a && this.b == htVar.b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        int a2;
        ht htVar = (ht) obj;
        if (getClass().equals(htVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(htVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a2 = im.a(this.a, htVar.a)) == 0) {
                int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(htVar.b()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                if (!b() || (a = im.a(this.b, htVar.b)) == 0) {
                    return 0;
                }
                return a;
            }
            return a2;
        }
        return getClass().getName().compareTo(htVar.getClass().getName());
    }
}
