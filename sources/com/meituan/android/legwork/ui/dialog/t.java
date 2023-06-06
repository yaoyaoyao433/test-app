package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayTypeFragment b;

    private t(PayTypeFragment payTypeFragment) {
        this.b = payTypeFragment;
    }

    public static View.OnClickListener a(PayTypeFragment payTypeFragment) {
        Object[] objArr = {payTypeFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06c5036203d60070c63f14d9a12832d7", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06c5036203d60070c63f14d9a12832d7") : new t(payTypeFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25dc37f918e488526cf9ee12d6fc4ed", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25dc37f918e488526cf9ee12d6fc4ed");
        } else {
            PayTypeFragment.a(this.b, view);
        }
    }
}
