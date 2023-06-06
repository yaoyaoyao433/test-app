package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g<OutType> {
    public static ChangeQuickRedirect a;
    public com.meituan.android.cube.pga.action.d<OutType> b;

    public final d<OutType> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa8c6ee0e025c72eb550657c446086b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa8c6ee0e025c72eb550657c446086b");
        }
        if (this.b == null) {
            return new d<>(null);
        }
        return new d<>(this.b.a());
    }
}
