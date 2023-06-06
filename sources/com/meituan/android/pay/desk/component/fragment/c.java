package com.meituan.android.pay.desk.component.fragment;

import android.content.DialogInterface;
import com.meituan.android.pay.desk.component.fragment.NewCombineLabelDetailDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnCancelListener {
    public static ChangeQuickRedirect a;
    private final NewCombineLabelDetailDialogFragment.NewCombineDetailDialog b;

    private c(NewCombineLabelDetailDialogFragment.NewCombineDetailDialog newCombineDetailDialog) {
        this.b = newCombineDetailDialog;
    }

    public static DialogInterface.OnCancelListener a(NewCombineLabelDetailDialogFragment.NewCombineDetailDialog newCombineDetailDialog) {
        Object[] objArr = {newCombineDetailDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8721085f849f21742fdc67dd44bb9b1", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnCancelListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8721085f849f21742fdc67dd44bb9b1") : new c(newCombineDetailDialog);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8faf6a39a8c0063c598b91fa9253b1aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8faf6a39a8c0063c598b91fa9253b1aa");
        } else {
            NewCombineLabelDetailDialogFragment.NewCombineDetailDialog.a(this.b, dialogInterface);
        }
    }
}
