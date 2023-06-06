package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CardPayFunctionGuideDialog b;

    private d(CardPayFunctionGuideDialog cardPayFunctionGuideDialog) {
        this.b = cardPayFunctionGuideDialog;
    }

    public static View.OnClickListener a(CardPayFunctionGuideDialog cardPayFunctionGuideDialog) {
        Object[] objArr = {cardPayFunctionGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8890594f6be1cd42efb91f6e4c424879", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8890594f6be1cd42efb91f6e4c424879") : new d(cardPayFunctionGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae257aefdaaf5bdad9646e1fa2c594f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae257aefdaaf5bdad9646e1fa2c594f");
        } else {
            CardPayFunctionGuideDialog.b(this.b, view);
        }
    }
}
