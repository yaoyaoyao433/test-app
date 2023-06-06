package com.meituan.android.cashier.dialogfragment;

import android.view.View;
import com.meituan.android.cashier.dialogfragment.RiskDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RiskDialogFragment.RiskDialog b;

    private e(RiskDialogFragment.RiskDialog riskDialog) {
        this.b = riskDialog;
    }

    public static View.OnClickListener a(RiskDialogFragment.RiskDialog riskDialog) {
        Object[] objArr = {riskDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56eba78b44ce242b040cc1942af5c1ac", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56eba78b44ce242b040cc1942af5c1ac") : new e(riskDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189991066a9dc38c0d12c4a5e60f7343", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189991066a9dc38c0d12c4a5e60f7343");
        } else {
            RiskDialogFragment.RiskDialog.b(this.b, view);
        }
    }
}
