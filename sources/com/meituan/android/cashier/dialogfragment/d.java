package com.meituan.android.cashier.dialogfragment;

import android.view.View;
import com.meituan.android.cashier.dialogfragment.RiskDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RiskDialogFragment.RiskDialog b;

    private d(RiskDialogFragment.RiskDialog riskDialog) {
        this.b = riskDialog;
    }

    public static View.OnClickListener a(RiskDialogFragment.RiskDialog riskDialog) {
        Object[] objArr = {riskDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecf984cfb6ea4d044def8ceb446ec7a8", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecf984cfb6ea4d044def8ceb446ec7a8") : new d(riskDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866bd47346d950a783adf3c5ccb3262f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866bd47346d950a783adf3c5ccb3262f");
        } else {
            RiskDialogFragment.RiskDialog.c(this.b, view);
        }
    }
}
