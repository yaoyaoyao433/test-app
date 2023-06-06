package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final MobileIndexFragment b;

    private n(MobileIndexFragment mobileIndexFragment) {
        this.b = mobileIndexFragment;
    }

    public static View.OnClickListener a(MobileIndexFragment mobileIndexFragment) {
        Object[] objArr = {mobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34882ce0218ab5f562a343b6b0e3a0dd", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34882ce0218ab5f562a343b6b0e3a0dd") : new n(mobileIndexFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e055e728da4eee975006200501a85a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e055e728da4eee975006200501a85a");
        } else {
            MobileIndexFragment.c(this.b, view);
        }
    }
}
