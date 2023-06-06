package com.meituan.android.cashier.fragment;

import com.meituan.android.cashier.widget.NativeStandardCashierAreaView;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements NativeStandardCashierAreaView.a {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;

    public e(MTCashierRevisionFragment mTCashierRevisionFragment) {
        this.b = mTCashierRevisionFragment;
    }

    @Override // com.meituan.android.cashier.widget.NativeStandardCashierAreaView.a
    public final void a(FinanceServiceBean financeServiceBean) {
        Object[] objArr = {financeServiceBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0303d0e520348c4e6eeb7b5409aeef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0303d0e520348c4e6eeb7b5409aeef");
        } else {
            this.b.e(financeServiceBean);
        }
    }
}
