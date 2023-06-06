package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.DelayPayGuideDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DelayPayGuideDialogFragment.DelayPayGuideDialog b;

    private e(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        this.b = delayPayGuideDialog;
    }

    public static View.OnClickListener a(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        Object[] objArr = {delayPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20d8da3d59824db8bb6de44e47ece961", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20d8da3d59824db8bb6de44e47ece961") : new e(delayPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d896fbb5cb013eef0f773df31a0d66b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d896fbb5cb013eef0f773df31a0d66b");
        } else {
            DelayPayGuideDialogFragment.DelayPayGuideDialog.c(this.b, view);
        }
    }
}
