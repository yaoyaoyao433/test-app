package com.meituan.passport.login.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements com.meituan.passport.clickaction.c {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment b;

    public e(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        this.b = dynamicAccountLoginFragment;
    }

    @Override // com.meituan.passport.clickaction.c
    public final Object getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10408e4968fbd059f2c6f03e794127db", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10408e4968fbd059f2c6f03e794127db") : DynamicAccountLoginFragment.b(this.b);
    }
}
