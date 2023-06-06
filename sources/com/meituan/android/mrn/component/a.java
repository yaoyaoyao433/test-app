package com.meituan.android.mrn.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.component.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a0ca2c959a8641267c31d10db5282f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a0ca2c959a8641267c31d10db5282f");
        }
    }

    @Override // com.meituan.android.mrn.component.b
    public final b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdda4c3c93089418d7031be666b6328f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdda4c3c93089418d7031be666b6328f") : new a();
    }
}
