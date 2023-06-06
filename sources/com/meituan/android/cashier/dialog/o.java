package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CreditPayGuideDialog b;

    private o(CreditPayGuideDialog creditPayGuideDialog) {
        this.b = creditPayGuideDialog;
    }

    public static View.OnClickListener a(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5868767f9cdee197c708c826e293e70", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5868767f9cdee197c708c826e293e70") : new o(creditPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627042d751be107b59334e5bc889f65b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627042d751be107b59334e5bc889f65b");
        } else {
            CreditPayGuideDialog.a(this.b, view);
        }
    }
}
