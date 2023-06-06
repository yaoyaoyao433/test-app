package com.meituan.android.pay.desk.component.fragment;

import android.view.View;
import com.meituan.android.pay.desk.component.fragment.CombineLabelDetailDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CombineLabelDetailDialogFragment.CombineLabelDetailDialog b;

    private a(CombineLabelDetailDialogFragment.CombineLabelDetailDialog combineLabelDetailDialog) {
        this.b = combineLabelDetailDialog;
    }

    public static View.OnClickListener a(CombineLabelDetailDialogFragment.CombineLabelDetailDialog combineLabelDetailDialog) {
        Object[] objArr = {combineLabelDetailDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc7c685234ff001eb75379a8640edf3a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc7c685234ff001eb75379a8640edf3a") : new a(combineLabelDetailDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3a214a62775b4d58a4f651993f5df5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3a214a62775b4d58a4f651993f5df5");
        } else {
            CombineLabelDetailDialogFragment.CombineLabelDetailDialog.a(this.b, view);
        }
    }
}
