package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayLaterGuideDialog b;

    private u(PayLaterGuideDialog payLaterGuideDialog) {
        this.b = payLaterGuideDialog;
    }

    public static View.OnClickListener a(PayLaterGuideDialog payLaterGuideDialog) {
        Object[] objArr = {payLaterGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc20c3fb08dd114e118019c61757499c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc20c3fb08dd114e118019c61757499c") : new u(payLaterGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7377eb25c3c2178d1ecfe584b50846", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7377eb25c3c2178d1ecfe584b50846");
        } else {
            PayLaterGuideDialog.b(this.b, view);
        }
    }
}
