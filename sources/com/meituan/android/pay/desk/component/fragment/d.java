package com.meituan.android.pay.desk.component.fragment;

import android.view.View;
import com.meituan.android.pay.desk.component.fragment.NewCombineLabelDetailDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NewCombineLabelDetailDialogFragment.NewCombineDetailDialog b;

    private d(NewCombineLabelDetailDialogFragment.NewCombineDetailDialog newCombineDetailDialog) {
        this.b = newCombineDetailDialog;
    }

    public static View.OnClickListener a(NewCombineLabelDetailDialogFragment.NewCombineDetailDialog newCombineDetailDialog) {
        Object[] objArr = {newCombineDetailDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72d9e5cbf76221d1da0a7c652b090535", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72d9e5cbf76221d1da0a7c652b090535") : new d(newCombineDetailDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f9cb6bc1b0bfee7458f06ef32c442d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f9cb6bc1b0bfee7458f06ef32c442d");
        } else {
            NewCombineLabelDetailDialogFragment.NewCombineDetailDialog.b(this.b, view);
        }
    }
}
