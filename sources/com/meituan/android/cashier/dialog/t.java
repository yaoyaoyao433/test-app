package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayLaterGuideDialog b;

    private t(PayLaterGuideDialog payLaterGuideDialog) {
        this.b = payLaterGuideDialog;
    }

    public static View.OnClickListener a(PayLaterGuideDialog payLaterGuideDialog) {
        Object[] objArr = {payLaterGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "290d17aca88a50843c56b727a1d6a396", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "290d17aca88a50843c56b727a1d6a396") : new t(payLaterGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c7a2ac0542244f37c94eba44d1e20f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c7a2ac0542244f37c94eba44d1e20f");
        } else {
            PayLaterGuideDialog.c(this.b, view);
        }
    }
}
