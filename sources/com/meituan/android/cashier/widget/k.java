package com.meituan.android.cashier.widget;

import android.view.View;
import android.widget.AdapterView;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAreaView b;
    private final FinanceServiceBean c;
    private final com.meituan.android.pay.desk.payment.view.e d;

    private k(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, com.meituan.android.pay.desk.payment.view.e eVar) {
        this.b = nativeStandardCashierAreaView;
        this.c = financeServiceBean;
        this.d = eVar;
    }

    public static AdapterView.OnItemClickListener a(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, com.meituan.android.pay.desk.payment.view.e eVar) {
        Object[] objArr = {nativeStandardCashierAreaView, financeServiceBean, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90c58bc30323abaff1497aa81313b0e8", RobustBitConfig.DEFAULT_VALUE) ? (AdapterView.OnItemClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90c58bc30323abaff1497aa81313b0e8") : new k(nativeStandardCashierAreaView, financeServiceBean, eVar);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3097e16e18e8aa4733b7c47b2ec93388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3097e16e18e8aa4733b7c47b2ec93388");
        } else {
            NativeStandardCashierAreaView.a(this.b, this.c, this.d, adapterView, view, i, j);
        }
    }
}
