package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CreditPayGuideDialog b;
    private final Agreement c;

    private p(CreditPayGuideDialog creditPayGuideDialog, Agreement agreement) {
        this.b = creditPayGuideDialog;
        this.c = agreement;
    }

    public static View.OnClickListener a(CreditPayGuideDialog creditPayGuideDialog, Agreement agreement) {
        Object[] objArr = {creditPayGuideDialog, agreement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36e49eb1f2fb0384358cb190aca286ca", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36e49eb1f2fb0384358cb190aca286ca") : new p(creditPayGuideDialog, agreement);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d274562d45e543171fce3331111d7ff5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d274562d45e543171fce3331111d7ff5");
        } else {
            CreditPayGuideDialog.a(this.b, this.c, view);
        }
    }
}
