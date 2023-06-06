package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final AccountLoginFragment b;

    private d(AccountLoginFragment accountLoginFragment) {
        this.b = accountLoginFragment;
    }

    public static com.meituan.passport.clickaction.a a(AccountLoginFragment accountLoginFragment) {
        Object[] objArr = {accountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9ebb4428ecc06c9aa21b717fd597dff", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9ebb4428ecc06c9aa21b717fd597dff") : new d(accountLoginFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda912c638ab639c107d4d15e5aa1df0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda912c638ab639c107d4d15e5aa1df0");
        } else {
            AccountLoginFragment.a(this.b, view);
        }
    }
}
