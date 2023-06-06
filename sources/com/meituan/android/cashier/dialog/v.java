package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayLaterGuideDialog b;

    private v(PayLaterGuideDialog payLaterGuideDialog) {
        this.b = payLaterGuideDialog;
    }

    public static View.OnClickListener a(PayLaterGuideDialog payLaterGuideDialog) {
        Object[] objArr = {payLaterGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10573aee0e131263a5be10a69f9d2855", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10573aee0e131263a5be10a69f9d2855") : new v(payLaterGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0910d8da50da455372db8be31e5a6cc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0910d8da50da455372db8be31e5a6cc");
        } else {
            PayLaterGuideDialog.a(this.b, view);
        }
    }
}
