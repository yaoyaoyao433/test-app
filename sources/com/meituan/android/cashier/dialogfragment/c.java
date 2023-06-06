package com.meituan.android.cashier.dialogfragment;

import android.view.View;
import com.meituan.android.cashier.dialogfragment.RiskDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RiskDialogFragment.RiskDialog b;

    private c(RiskDialogFragment.RiskDialog riskDialog) {
        this.b = riskDialog;
    }

    public static View.OnClickListener a(RiskDialogFragment.RiskDialog riskDialog) {
        Object[] objArr = {riskDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dc33ea5da0d842f6a4f350158dbcfba", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dc33ea5da0d842f6a4f350158dbcfba") : new c(riskDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3167b98ff9bcf98be07bfc4b5b9926", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3167b98ff9bcf98be07bfc4b5b9926");
        } else {
            RiskDialogFragment.RiskDialog.d(this.b, view);
        }
    }
}
