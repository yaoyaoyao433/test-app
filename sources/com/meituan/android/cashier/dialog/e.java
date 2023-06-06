package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CardPayFunctionGuideDialog b;

    private e(CardPayFunctionGuideDialog cardPayFunctionGuideDialog) {
        this.b = cardPayFunctionGuideDialog;
    }

    public static View.OnClickListener a(CardPayFunctionGuideDialog cardPayFunctionGuideDialog) {
        Object[] objArr = {cardPayFunctionGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20edc30e6f33a16b104d8cdeb2d4ebce", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20edc30e6f33a16b104d8cdeb2d4ebce") : new e(cardPayFunctionGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22073904854045eb8599cfcc72b006fc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22073904854045eb8599cfcc72b006fc");
        } else {
            CardPayFunctionGuideDialog.a(this.b, view);
        }
    }
}
