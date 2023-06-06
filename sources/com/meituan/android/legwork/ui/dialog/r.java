package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayTypeFragment b;

    private r(PayTypeFragment payTypeFragment) {
        this.b = payTypeFragment;
    }

    public static View.OnClickListener a(PayTypeFragment payTypeFragment) {
        Object[] objArr = {payTypeFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ade3aebdba98f8236518bc37999592bc", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ade3aebdba98f8236518bc37999592bc") : new r(payTypeFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0223f84eb3da2934d62e7dd518f4b3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0223f84eb3da2934d62e7dd518f4b3");
        } else {
            PayTypeFragment.c(this.b, view);
        }
    }
}
