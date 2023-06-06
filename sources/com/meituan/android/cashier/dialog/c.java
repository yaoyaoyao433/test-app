package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AutomaticPayGuideDialog b;

    private c(AutomaticPayGuideDialog automaticPayGuideDialog) {
        this.b = automaticPayGuideDialog;
    }

    public static View.OnClickListener a(AutomaticPayGuideDialog automaticPayGuideDialog) {
        Object[] objArr = {automaticPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66bb98c12ba8989e07e4906544e75b88", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66bb98c12ba8989e07e4906544e75b88") : new c(automaticPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61633c56add623e0303b749bd7bfaf70", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61633c56add623e0303b749bd7bfaf70");
        } else {
            AutomaticPayGuideDialog.a(this.b, view);
        }
    }
}
