package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final AccountLoginFragment b;

    private c(AccountLoginFragment accountLoginFragment) {
        this.b = accountLoginFragment;
    }

    public static com.meituan.passport.clickaction.a a(AccountLoginFragment accountLoginFragment) {
        Object[] objArr = {accountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02d4cbb29e8885b796c20bec8658f768", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02d4cbb29e8885b796c20bec8658f768") : new c(accountLoginFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911cb8b7de3f121050d1cd03d64994a4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911cb8b7de3f121050d1cd03d64994a4");
        } else {
            AccountLoginFragment.b(this.b, view);
        }
    }
}
