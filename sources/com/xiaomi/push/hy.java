package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class hy implements il<hy, Object>, Serializable, Cloneable {
    private static final jb b = new jb("XmPushActionCustomConfig");
    private static final it c = new it("", (byte) 15, 1);
    public List<hm> a;

    private boolean a() {
        return this.a != null;
    }

    private void b() {
        if (this.a != null) {
            return;
        }
        throw new ix("Required field 'customConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.il
    public final void a(iw iwVar) {
        while (true) {
            it b2 = iwVar.b();
            if (b2.b == 0) {
                b();
                return;
            } else if (b2.c == 1 && b2.b == 15) {
                iu d = iwVar.d();
                this.a = new ArrayList(d.b);
                for (int i = 0; i < d.b; i++) {
                    hm hmVar = new hm();
                    hmVar.a(iwVar);
                    this.a.add(hmVar);
                }
            } else {
                iz.a(iwVar, b2.b);
            }
        }
    }

    @Override // com.xiaomi.push.il
    public final void b(iw iwVar) {
        b();
        if (this.a != null) {
            iwVar.a(c);
            iwVar.a(new iu(com.tencent.mapsdk.internal.p.ZERO_TAG, this.a.size()));
            for (hm hmVar : this.a) {
                hmVar.b(iwVar);
            }
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        if (this.a == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.a);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hy hyVar;
        if (obj == null || !(obj instanceof hy) || (hyVar = (hy) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hyVar.a();
        if (a || a2) {
            return a && a2 && this.a.equals(hyVar.a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        hy hyVar = (hy) obj;
        if (getClass().equals(hyVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hyVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a = im.a(this.a, hyVar.a)) == 0) {
                return 0;
            }
            return a;
        }
        return getClass().getName().compareTo(hyVar.getClass().getName());
    }
}
