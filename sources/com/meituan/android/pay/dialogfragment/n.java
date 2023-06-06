package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.PointDeductDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PointDeductDialogFragment.PointDeductDialog b;

    private n(PointDeductDialogFragment.PointDeductDialog pointDeductDialog) {
        this.b = pointDeductDialog;
    }

    public static View.OnClickListener a(PointDeductDialogFragment.PointDeductDialog pointDeductDialog) {
        Object[] objArr = {pointDeductDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8df315d4dd0d39399a93581853f2c29", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8df315d4dd0d39399a93581853f2c29") : new n(pointDeductDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193b5e5f58fe8731eef529be614d9e64", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193b5e5f58fe8731eef529be614d9e64");
        } else {
            PointDeductDialogFragment.PointDeductDialog.a(this.b, view);
        }
    }
}
