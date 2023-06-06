package com.meituan.passport.outer;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OuterMobileIndexFragment b;

    private d(OuterMobileIndexFragment outerMobileIndexFragment) {
        this.b = outerMobileIndexFragment;
    }

    public static View.OnClickListener a(OuterMobileIndexFragment outerMobileIndexFragment) {
        Object[] objArr = {outerMobileIndexFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8bc69cd222aae800f3cf6dc9e0c5f27", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8bc69cd222aae800f3cf6dc9e0c5f27") : new d(outerMobileIndexFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2384d17929e2d0a0e5fd08fb258041d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2384d17929e2d0a0e5fd08fb258041d");
        } else {
            OuterMobileIndexFragment.a(this.b, view);
        }
    }
}
