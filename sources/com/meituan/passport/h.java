package com.meituan.passport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements com.meituan.passport.clickaction.c {
    public static ChangeQuickRedirect a;
    private final DynamicLoginFragment b;

    public h(DynamicLoginFragment dynamicLoginFragment) {
        this.b = dynamicLoginFragment;
    }

    @Override // com.meituan.passport.clickaction.c
    public final Object getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fda13f979512a63b3b0506f4a99c96", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fda13f979512a63b3b0506f4a99c96") : DynamicLoginFragment.a(this.b);
    }
}
