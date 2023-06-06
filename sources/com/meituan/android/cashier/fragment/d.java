package com.meituan.android.cashier.fragment;

import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.cashier.widget.NativeStandardCashierAreaView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements NativeStandardCashierAreaView.b {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;

    public d(MTCashierRevisionFragment mTCashierRevisionFragment) {
        this.b = mTCashierRevisionFragment;
    }

    @Override // com.meituan.android.cashier.widget.NativeStandardCashierAreaView.b
    public final void a(CashierPayment cashierPayment) {
        Object[] objArr = {cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41e59f7890d51c5477abc230556553b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41e59f7890d51c5477abc230556553b");
        } else {
            this.b.e(cashierPayment);
        }
    }
}
