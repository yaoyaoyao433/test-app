package com.meituan.android.cashier.dialogfragment;

import android.view.View;
import com.meituan.android.cashier.dialogfragment.RiskDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RiskDialogFragment.RiskDialog b;

    private f(RiskDialogFragment.RiskDialog riskDialog) {
        this.b = riskDialog;
    }

    public static View.OnClickListener a(RiskDialogFragment.RiskDialog riskDialog) {
        Object[] objArr = {riskDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "295838f92ddbfb18e7eb8a6daa28cd9d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "295838f92ddbfb18e7eb8a6daa28cd9d") : new f(riskDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0187ed859fdb9fd4dde6cc7a143fe23e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0187ed859fdb9fd4dde6cc7a143fe23e");
        } else {
            RiskDialogFragment.RiskDialog.a(this.b, view);
        }
    }
}
