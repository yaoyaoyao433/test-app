package com.meituan.passport.login.fragment;

import com.meituan.passport.login.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements f.a {
    public static ChangeQuickRedirect a;
    private final NewSSOLoginFragment b;

    public r(NewSSOLoginFragment newSSOLoginFragment) {
        this.b = newSSOLoginFragment;
    }

    @Override // com.meituan.passport.login.f.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d98a79fd09c48b383f64f8405b36b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d98a79fd09c48b383f64f8405b36b8")).booleanValue() : this.b.a(str);
    }
}
