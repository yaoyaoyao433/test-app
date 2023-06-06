package com.meituan.android.walle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g<A, B> {
    public static ChangeQuickRedirect a;
    final A b;
    final B c;

    private g(A a2, B b) {
        Object[] objArr = {a2, b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d14de4685e54d66a530d71cbebc57d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d14de4685e54d66a530d71cbebc57d");
            return;
        }
        this.b = a2;
        this.c = b;
    }

    public static <A, B> g<A, B> a(A a2, B b) {
        Object[] objArr = {a2, b};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a774c469f0fe0e157cc0902908a7830", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a774c469f0fe0e157cc0902908a7830") : new g<>(a2, b);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b5e42dd420a0816e2763df4b3601f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b5e42dd420a0816e2763df4b3601f1")).intValue();
        }
        return (((this.b == null ? 0 : this.b.hashCode()) + 31) * 31) + (this.c != null ? this.c.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b848ef65ec672776aa5f5a4e3874c130", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b848ef65ec672776aa5f5a4e3874c130")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g gVar = (g) obj;
            if (this.b == null) {
                if (gVar.b != null) {
                    return false;
                }
            } else if (!this.b.equals(gVar.b)) {
                return false;
            }
            if (this.c == null) {
                if (gVar.c != null) {
                    return false;
                }
            } else if (!this.c.equals(gVar.c)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
