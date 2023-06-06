package com.meituan.android.pay.desk.payment.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final InstallmentRateDialog b;

    private h(InstallmentRateDialog installmentRateDialog) {
        this.b = installmentRateDialog;
    }

    public static View.OnClickListener a(InstallmentRateDialog installmentRateDialog) {
        Object[] objArr = {installmentRateDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "628bc810a5beafb199aac5b3e888eec8", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "628bc810a5beafb199aac5b3e888eec8") : new h(installmentRateDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b55f065d033c1d8d80d9a00cb05be4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b55f065d033c1d8d80d9a00cb05be4");
        } else {
            InstallmentRateDialog.a(this.b, view);
        }
    }
}
