package com.meituan.android.cashier.widget;

import android.view.View;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAreaView b;
    private final CashierPayment c;

    private i(NativeStandardCashierAreaView nativeStandardCashierAreaView, CashierPayment cashierPayment) {
        this.b = nativeStandardCashierAreaView;
        this.c = cashierPayment;
    }

    public static View.OnClickListener a(NativeStandardCashierAreaView nativeStandardCashierAreaView, CashierPayment cashierPayment) {
        Object[] objArr = {nativeStandardCashierAreaView, cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f1d75c1aa77b9090f5bfc8a9fcd0851", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f1d75c1aa77b9090f5bfc8a9fcd0851") : new i(nativeStandardCashierAreaView, cashierPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3da3db84b87cc32258f62c8683ba3f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3da3db84b87cc32258f62c8683ba3f");
        } else {
            NativeStandardCashierAreaView.a(this.b, this.c, view);
        }
    }
}
