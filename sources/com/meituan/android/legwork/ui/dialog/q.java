package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayTypeFragment b;

    private q(PayTypeFragment payTypeFragment) {
        this.b = payTypeFragment;
    }

    public static View.OnClickListener a(PayTypeFragment payTypeFragment) {
        Object[] objArr = {payTypeFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11ca0999d00da2cb8a4f9fc02f67b540", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11ca0999d00da2cb8a4f9fc02f67b540") : new q(payTypeFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ca8ee3ad0ee11ee1e66a4f1d2ed171", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ca8ee3ad0ee11ee1e66a4f1d2ed171");
        } else {
            PayTypeFragment.d(this.b, view);
        }
    }
}
