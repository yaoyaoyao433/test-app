package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.PointDeductDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PointDeductDialogFragment.PointDeductDialog b;

    private m(PointDeductDialogFragment.PointDeductDialog pointDeductDialog) {
        this.b = pointDeductDialog;
    }

    public static View.OnClickListener a(PointDeductDialogFragment.PointDeductDialog pointDeductDialog) {
        Object[] objArr = {pointDeductDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4544bf60f71bbe281aab97c63a5b4329", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4544bf60f71bbe281aab97c63a5b4329") : new m(pointDeductDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afe227f1c7fa75c6d651ed10a083b5da", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afe227f1c7fa75c6d651ed10a083b5da");
        } else {
            PointDeductDialogFragment.PointDeductDialog.b(this.b, view);
        }
    }
}
