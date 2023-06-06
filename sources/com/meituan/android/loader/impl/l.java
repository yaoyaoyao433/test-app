package com.meituan.android.loader.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class l extends m<Boolean> {
    public static ChangeQuickRedirect c;
    private String a;

    @Override // com.meituan.android.loader.impl.m
    public final /* synthetic */ Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1de85c6411b7a3dda225294d7676fb", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1de85c6411b7a3dda225294d7676fb") : Boolean.FALSE;
    }

    @Override // com.meituan.android.loader.impl.m
    public final /* synthetic */ Boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca58badce1f745037893602137d77c9", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca58badce1f745037893602137d77c9") : Boolean.FALSE;
    }

    public l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36fa923fac956ca26189a0e51059f7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36fa923fac956ca26189a0e51059f7a");
        } else {
            this.a = str;
        }
    }

    @Override // com.meituan.android.loader.impl.m
    public final String b() {
        return this.a;
    }
}
