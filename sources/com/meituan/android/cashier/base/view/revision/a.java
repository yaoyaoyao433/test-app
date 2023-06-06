package com.meituan.android.cashier.base.view.revision;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CashierOrderInfoView b;

    private a(CashierOrderInfoView cashierOrderInfoView) {
        this.b = cashierOrderInfoView;
    }

    public static View.OnClickListener a(CashierOrderInfoView cashierOrderInfoView) {
        Object[] objArr = {cashierOrderInfoView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68c246ad9e7bd69e85c6d5442efdcb74", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68c246ad9e7bd69e85c6d5442efdcb74") : new a(cashierOrderInfoView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5ec9c8973d40b3785aedae0513da0f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5ec9c8973d40b3785aedae0513da0f");
        } else {
            CashierOrderInfoView.a(this.b, view);
        }
    }
}
