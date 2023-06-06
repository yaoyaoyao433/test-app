package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.DelayPayGuideDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DelayPayGuideDialogFragment.DelayPayGuideDialog b;

    private f(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        this.b = delayPayGuideDialog;
    }

    public static View.OnClickListener a(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        Object[] objArr = {delayPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b63362b64a34bec85615eaf2d3777eae", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b63362b64a34bec85615eaf2d3777eae") : new f(delayPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d836a65185703ba2bb6c5226ab63c7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d836a65185703ba2bb6c5226ab63c7");
        } else {
            DelayPayGuideDialogFragment.DelayPayGuideDialog.b(this.b, view);
        }
    }
}
