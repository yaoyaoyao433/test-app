package com.meituan.android.cashier.widget;

import android.view.View;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CashierMarketingGuideFloatView b;
    private final Cashier c;

    private e(CashierMarketingGuideFloatView cashierMarketingGuideFloatView, Cashier cashier) {
        this.b = cashierMarketingGuideFloatView;
        this.c = cashier;
    }

    public static View.OnClickListener a(CashierMarketingGuideFloatView cashierMarketingGuideFloatView, Cashier cashier) {
        Object[] objArr = {cashierMarketingGuideFloatView, cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "343c0112602734302a82a9242a502618", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "343c0112602734302a82a9242a502618") : new e(cashierMarketingGuideFloatView, cashier);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d39908c1261e3fbeefbb02e80e82a2a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d39908c1261e3fbeefbb02e80e82a2a");
        } else {
            CashierMarketingGuideFloatView.a(this.b, this.c, view);
        }
    }
}
