package com.meituan.passport.login.fragment;

import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements com.meituan.passport.converter.b {
    public static ChangeQuickRedirect a;
    private final MobileIndexFragment b;

    public q(MobileIndexFragment mobileIndexFragment) {
        this.b = mobileIndexFragment;
    }

    @Override // com.meituan.passport.converter.b
    public final boolean a(ApiException apiException, boolean z) {
        Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7048645d1a3b76fb7057c31df1850a93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7048645d1a3b76fb7057c31df1850a93")).booleanValue() : this.b.a(apiException, z);
    }
}
