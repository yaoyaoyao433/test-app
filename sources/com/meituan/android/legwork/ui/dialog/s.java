package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayTypeFragment b;

    private s(PayTypeFragment payTypeFragment) {
        this.b = payTypeFragment;
    }

    public static View.OnClickListener a(PayTypeFragment payTypeFragment) {
        Object[] objArr = {payTypeFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bbe91d56a915e402361567609376309", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bbe91d56a915e402361567609376309") : new s(payTypeFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ba7eea9a64559a6cd39d00448bba8e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ba7eea9a64559a6cd39d00448bba8e");
        } else {
            PayTypeFragment.b(this.b, view);
        }
    }
}
