package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CreditPayGuideDialog b;

    private k(CreditPayGuideDialog creditPayGuideDialog) {
        this.b = creditPayGuideDialog;
    }

    public static View.OnClickListener a(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ce2b0c906492c18600fb5599f584192", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ce2b0c906492c18600fb5599f584192") : new k(creditPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57a6b823c7ca7381209b627dfb368c7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57a6b823c7ca7381209b627dfb368c7");
        } else {
            CreditPayGuideDialog.c(this.b, view);
        }
    }
}
