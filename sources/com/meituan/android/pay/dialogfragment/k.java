package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.NoPswGuideDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NoPswGuideDialogFragment.NoPswGuideDialog b;

    private k(NoPswGuideDialogFragment.NoPswGuideDialog noPswGuideDialog) {
        this.b = noPswGuideDialog;
    }

    public static View.OnClickListener a(NoPswGuideDialogFragment.NoPswGuideDialog noPswGuideDialog) {
        Object[] objArr = {noPswGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b7ca404079625449dc2f1536da475ed", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b7ca404079625449dc2f1536da475ed") : new k(noPswGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de7e063a0bf3448025c1774db14466b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de7e063a0bf3448025c1774db14466b");
        } else {
            NoPswGuideDialogFragment.NoPswGuideDialog.a(this.b, view);
        }
    }
}
