package com.meituan.android.pay.desk.pack;

import android.view.View;
import android.widget.AdapterView;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;
    private final com.meituan.android.pay.desk.payment.view.b d;

    private h(e eVar, MTPayment mTPayment, com.meituan.android.pay.desk.payment.view.b bVar) {
        this.b = eVar;
        this.c = mTPayment;
        this.d = bVar;
    }

    public static AdapterView.OnItemClickListener a(e eVar, MTPayment mTPayment, com.meituan.android.pay.desk.payment.view.b bVar) {
        Object[] objArr = {eVar, mTPayment, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fde0ada6416965ab0984735a65b2f6f", RobustBitConfig.DEFAULT_VALUE) ? (AdapterView.OnItemClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fde0ada6416965ab0984735a65b2f6f") : new h(eVar, mTPayment, bVar);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f689c5d998b9449014d707aff5f144c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f689c5d998b9449014d707aff5f144c6");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        com.meituan.android.pay.desk.payment.view.b bVar = this.d;
        Object[] objArr2 = {eVar, mTPayment, bVar, adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a6eae16c7d9f45130906a7bd958c3536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a6eae16c7d9f45130906a7bd958c3536");
            return;
        }
        int i2 = -1;
        Installment installment = mTPayment.getInstallment();
        if (installment != null && !com.meituan.android.paybase.utils.i.a((Collection) installment.getPeriodList())) {
            Period period = installment.getPeriodList().get(i);
            if (period != null) {
                eVar.a(period, installment.getPeriodList());
                bVar.a(mTPayment);
                i2 = period.getPeriod();
            }
            if (eVar.c != null) {
                eVar.c.d(mTPayment);
            }
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_u5r394f2_mc", new a.c().a("choose_period", String.valueOf(i2)).a("pay_type", mTPayment.getPayType()).b);
    }
}
