package com.meituan.passport.outer;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final OuterMobileIndexFragment b;

    private b(OuterMobileIndexFragment outerMobileIndexFragment) {
        this.b = outerMobileIndexFragment;
    }

    public static com.meituan.passport.clickaction.a a(OuterMobileIndexFragment outerMobileIndexFragment) {
        Object[] objArr = {outerMobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5330c7b1e473a84e2b3b40fd2550378b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5330c7b1e473a84e2b3b40fd2550378b") : new b(outerMobileIndexFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d24c34d8f959b3e261d98ee7e184660", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d24c34d8f959b3e261d98ee7e184660");
        } else {
            OuterMobileIndexFragment.c(this.b, view);
        }
    }
}
