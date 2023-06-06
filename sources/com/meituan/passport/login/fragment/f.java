package com.meituan.passport.login.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements com.meituan.passport.clickaction.c {
    public static ChangeQuickRedirect a;
    private final DynamicAccountLoginFragment b;

    public f(DynamicAccountLoginFragment dynamicAccountLoginFragment) {
        this.b = dynamicAccountLoginFragment;
    }

    @Override // com.meituan.passport.clickaction.c
    public final Object getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6faef62009d82afb4b503dd655cc23e7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6faef62009d82afb4b503dd655cc23e7") : DynamicAccountLoginFragment.a(this.b);
    }
}
