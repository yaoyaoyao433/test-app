package com.meituan.android.neohybrid.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;
    public t b;
    private com.meituan.android.neohybrid.neo.nsr.a c;

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03cc1d8da4a34fe3d9ab67fc6d2df50b", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03cc1d8da4a34fe3d9ab67fc6d2df50b") : new m();
    }

    public final a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073943f4db6e86c2d0d4bcd52ab4d8c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073943f4db6e86c2d0d4bcd52ab4d8c8");
        }
        a a2 = this.c != null ? com.meituan.android.neohybrid.neo.nsr.b.a(this.c) : null;
        return a2 == null ? new a(this.b) : a2;
    }
}
