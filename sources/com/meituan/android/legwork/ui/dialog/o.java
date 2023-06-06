package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayTypeFragment b;

    private o(PayTypeFragment payTypeFragment) {
        this.b = payTypeFragment;
    }

    public static View.OnClickListener a(PayTypeFragment payTypeFragment) {
        Object[] objArr = {payTypeFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fde424a76516c2661911e42fe453c67", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fde424a76516c2661911e42fe453c67") : new o(payTypeFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af33f0209e0b4391d63d7944c28f775", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af33f0209e0b4391d63d7944c28f775");
        } else {
            PayTypeFragment.f(this.b, view);
        }
    }
}
