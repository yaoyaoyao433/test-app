package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AccountLoginFragment b;

    private a(AccountLoginFragment accountLoginFragment) {
        this.b = accountLoginFragment;
    }

    public static View.OnClickListener a(AccountLoginFragment accountLoginFragment) {
        Object[] objArr = {accountLoginFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "672f56e35f1e603eac2f3427c06c005f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "672f56e35f1e603eac2f3427c06c005f") : new a(accountLoginFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab83fc3b4b25cfe586cc7f5c63c7012", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab83fc3b4b25cfe586cc7f5c63c7012");
        } else {
            AccountLoginFragment.c(this.b, view);
        }
    }
}
