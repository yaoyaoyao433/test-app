package com.meituan.android.elderly.fragment;

import com.meituan.android.elderly.bean.CashierPayment;
import com.meituan.android.elderly.view.ElderlyCashierPaymentAreaView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ElderlyCashierPaymentAreaView.a {
    public static ChangeQuickRedirect a;
    private final MTElderlyCashierFragment b;

    private c(MTElderlyCashierFragment mTElderlyCashierFragment) {
        this.b = mTElderlyCashierFragment;
    }

    public static ElderlyCashierPaymentAreaView.a a(MTElderlyCashierFragment mTElderlyCashierFragment) {
        Object[] objArr = {mTElderlyCashierFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb59fb443107bb7457bca6a21d3a4701", RobustBitConfig.DEFAULT_VALUE) ? (ElderlyCashierPaymentAreaView.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb59fb443107bb7457bca6a21d3a4701") : new c(mTElderlyCashierFragment);
    }

    @Override // com.meituan.android.elderly.view.ElderlyCashierPaymentAreaView.a
    public final void a(CashierPayment cashierPayment) {
        Object[] objArr = {cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36b53f2458b64050df91ee8d91fec58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36b53f2458b64050df91ee8d91fec58");
        } else {
            MTElderlyCashierFragment.b(this.b, cashierPayment);
        }
    }
}
