package com.meituan.android.cashier.widget;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.android.paycommon.lib.widgets.ExtendableVerticalLinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAreaView b;
    private final FinanceServiceBean c;
    private final ExtendableVerticalLinearLayout d;

    private l(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, ExtendableVerticalLinearLayout extendableVerticalLinearLayout) {
        this.b = nativeStandardCashierAreaView;
        this.c = financeServiceBean;
        this.d = extendableVerticalLinearLayout;
    }

    public static View.OnClickListener a(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, ExtendableVerticalLinearLayout extendableVerticalLinearLayout) {
        Object[] objArr = {nativeStandardCashierAreaView, financeServiceBean, extendableVerticalLinearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2d93bbe601dec13e3fb68f637bafb87", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2d93bbe601dec13e3fb68f637bafb87") : new l(nativeStandardCashierAreaView, financeServiceBean, extendableVerticalLinearLayout);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca399e47f25238ba338130a0f8296e0e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca399e47f25238ba338130a0f8296e0e");
        } else {
            NativeStandardCashierAreaView.a(this.b, this.c, this.d, view);
        }
    }
}
