package com.meituan.android.cashier.widget;

import android.widget.CompoundButton;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAreaView b;
    private final FinanceServiceBean c;
    private final com.meituan.android.pay.desk.payment.view.e d;

    private j(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, com.meituan.android.pay.desk.payment.view.e eVar) {
        this.b = nativeStandardCashierAreaView;
        this.c = financeServiceBean;
        this.d = eVar;
    }

    public static CompoundButton.OnCheckedChangeListener a(NativeStandardCashierAreaView nativeStandardCashierAreaView, FinanceServiceBean financeServiceBean, com.meituan.android.pay.desk.payment.view.e eVar) {
        Object[] objArr = {nativeStandardCashierAreaView, financeServiceBean, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "458a7a1c19eef9d22cce3d832580eb2d", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "458a7a1c19eef9d22cce3d832580eb2d") : new j(nativeStandardCashierAreaView, financeServiceBean, eVar);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ddb97e259691ea50b9b2a08fde7f0da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ddb97e259691ea50b9b2a08fde7f0da");
        } else {
            NativeStandardCashierAreaView.a(this.b, this.c, this.d, compoundButton, z);
        }
    }
}
