package com.meituan.passport.login.fragment;

import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements com.meituan.passport.converter.m {
    public static ChangeQuickRedirect a;
    private final MobileIndexFragment b;

    public m(MobileIndexFragment mobileIndexFragment) {
        this.b = mobileIndexFragment;
    }

    @Override // com.meituan.passport.converter.m
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211dac9471d35cb56422e62a80a56f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211dac9471d35cb56422e62a80a56f14");
        } else {
            MobileIndexFragment.a(this.b, (SmsRequestCode) obj);
        }
    }
}
