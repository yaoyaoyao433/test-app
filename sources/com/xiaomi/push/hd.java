package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class hd implements il<hd, Object>, Serializable, Cloneable {
    private static final jb b = new jb("ClientUploadData");
    private static final it c = new it("", (byte) 15, 1);
    public List<he> a;

    private boolean a() {
        return this.a != null;
    }

    private void b() {
        if (this.a != null) {
            return;
        }
        throw new ix("Required field 'uploadDataItems' was not present! Struct: " + toString());
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
                    he heVar = new he();
                    heVar.a(iwVar);
                    this.a.add(heVar);
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
            for (he heVar : this.a) {
                heVar.b(iwVar);
            }
        }
        iwVar.a();
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        if (this.a == null) {
            sb.append(StringUtil.NULL);
        } else {
            sb.append(this.a);
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        hd hdVar;
        if (obj == null || !(obj instanceof hd) || (hdVar = (hd) obj) == null) {
            return false;
        }
        boolean a = a();
        boolean a2 = hdVar.a();
        if (a || a2) {
            return a && a2 && this.a.equals(hdVar.a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int a;
        hd hdVar = (hd) obj;
        if (getClass().equals(hdVar.getClass())) {
            int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(hdVar.a()));
            if (compareTo != 0) {
                return compareTo;
            }
            if (!a() || (a = im.a(this.a, hdVar.a)) == 0) {
                return 0;
            }
            return a;
        }
        return getClass().getName().compareTo(hdVar.getClass().getName());
    }
}
