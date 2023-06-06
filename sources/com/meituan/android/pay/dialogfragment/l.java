package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.PointDeductDialogFragment;
import com.meituan.android.pay.model.bean.PointDeductAlert;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PointDeductDialogFragment.PointDeductDialog b;
    private final PointDeductAlert c;

    private l(PointDeductDialogFragment.PointDeductDialog pointDeductDialog, PointDeductAlert pointDeductAlert) {
        this.b = pointDeductDialog;
        this.c = pointDeductAlert;
    }

    public static View.OnClickListener a(PointDeductDialogFragment.PointDeductDialog pointDeductDialog, PointDeductAlert pointDeductAlert) {
        Object[] objArr = {pointDeductDialog, pointDeductAlert};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83b2e7dba4cf06f9c12f02264e010eea", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83b2e7dba4cf06f9c12f02264e010eea") : new l(pointDeductDialog, pointDeductAlert);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137ca89f68fa96462c1e686ebaac5fdf", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137ca89f68fa96462c1e686ebaac5fdf");
        } else {
            PointDeductDialogFragment.PointDeductDialog.a(this.b, this.c, view);
        }
    }
}
