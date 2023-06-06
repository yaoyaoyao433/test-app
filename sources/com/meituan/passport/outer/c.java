package com.meituan.passport.outer;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OuterMobileIndexFragment b;

    private c(OuterMobileIndexFragment outerMobileIndexFragment) {
        this.b = outerMobileIndexFragment;
    }

    public static View.OnClickListener a(OuterMobileIndexFragment outerMobileIndexFragment) {
        Object[] objArr = {outerMobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "176e9d6db078226fbc1347861f43b98a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "176e9d6db078226fbc1347861f43b98a") : new c(outerMobileIndexFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ca5511143f5ce2b3d928dd3ae1ed83", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ca5511143f5ce2b3d928dd3ae1ed83");
        } else {
            OuterMobileIndexFragment.b(this.b, view);
        }
    }
}
