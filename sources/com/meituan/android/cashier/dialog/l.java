package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CreditPayGuideDialog b;

    private l(CreditPayGuideDialog creditPayGuideDialog) {
        this.b = creditPayGuideDialog;
    }

    public static View.OnClickListener a(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a6cfd06c3c3c9b0ba3b0627971f31c0", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a6cfd06c3c3c9b0ba3b0627971f31c0") : new l(creditPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c877b7f4bb332017d25d10ba91601013", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c877b7f4bb332017d25d10ba91601013");
        } else {
            CreditPayGuideDialog.b(this.b, view);
        }
    }
}
