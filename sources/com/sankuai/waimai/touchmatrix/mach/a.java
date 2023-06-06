package com.sankuai.waimai.touchmatrix.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    private HashSet<T> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b741e86bd446bb6b802150d25015a5f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b741e86bd446bb6b802150d25015a5f0");
        } else {
            this.b = new HashSet<>();
        }
    }

    public final boolean a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657c6ef4a371e699b616bd452487908d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657c6ef4a371e699b616bd452487908d")).booleanValue() : this.b.contains(t);
    }

    public final void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ead268ff07b57b4a4f09f574d55fb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ead268ff07b57b4a4f09f574d55fb0");
        } else if (t != null) {
            this.b.add(t);
        }
    }
}
