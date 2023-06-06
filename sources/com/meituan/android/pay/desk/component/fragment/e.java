package com.meituan.android.pay.desk.component.fragment;

import android.view.View;
import com.meituan.android.pay.desk.component.fragment.NewCombineLabelDetailDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NewCombineLabelDetailDialogFragment.NewCombineDetailDialog b;

    private e(NewCombineLabelDetailDialogFragment.NewCombineDetailDialog newCombineDetailDialog) {
        this.b = newCombineDetailDialog;
    }

    public static View.OnClickListener a(NewCombineLabelDetailDialogFragment.NewCombineDetailDialog newCombineDetailDialog) {
        Object[] objArr = {newCombineDetailDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3b9dda4a2cdba3484629d94b79960ca", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3b9dda4a2cdba3484629d94b79960ca") : new e(newCombineDetailDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d313219aa25e5ff416b665235e55b48", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d313219aa25e5ff416b665235e55b48");
        } else {
            NewCombineLabelDetailDialogFragment.NewCombineDetailDialog.a(this.b, view);
        }
    }
}
