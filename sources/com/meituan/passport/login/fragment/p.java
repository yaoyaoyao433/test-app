package com.meituan.passport.login.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final MobileIndexFragment b;

    private p(MobileIndexFragment mobileIndexFragment) {
        this.b = mobileIndexFragment;
    }

    public static View.OnClickListener a(MobileIndexFragment mobileIndexFragment) {
        Object[] objArr = {mobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae4a38997a832c9d973268e0cbe9f3b0", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae4a38997a832c9d973268e0cbe9f3b0") : new p(mobileIndexFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b457746515858192dc9a6a44572cce77", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b457746515858192dc9a6a44572cce77");
        } else {
            MobileIndexFragment.a(this.b, view);
        }
    }
}
