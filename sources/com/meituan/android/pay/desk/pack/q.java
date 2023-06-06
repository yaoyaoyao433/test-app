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
public final /* synthetic */ class q implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;
    private final com.meituan.android.pay.desk.payment.view.e d;

    private q(e eVar, MTPayment mTPayment, com.meituan.android.pay.desk.payment.view.e eVar2) {
        this.b = eVar;
        this.c = mTPayment;
        this.d = eVar2;
    }

    public static AdapterView.OnItemClickListener a(e eVar, MTPayment mTPayment, com.meituan.android.pay.desk.payment.view.e eVar2) {
        Object[] objArr = {eVar, mTPayment, eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "586a7969b3a8ffa0c612e09ac30736cf", RobustBitConfig.DEFAULT_VALUE) ? (AdapterView.OnItemClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "586a7969b3a8ffa0c612e09ac30736cf") : new q(eVar, mTPayment, eVar2);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce748f33e6d6f376962d48df109bae44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce748f33e6d6f376962d48df109bae44");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        com.meituan.android.pay.desk.payment.view.e eVar2 = this.d;
        Object[] objArr2 = {eVar, mTPayment, eVar2, adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9315c32721f7b43ea60d9686d75161a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9315c32721f7b43ea60d9686d75161a4");
            return;
        }
        int i2 = -1;
        Installment installment = mTPayment.getInstallment();
        if (installment == null || com.meituan.android.paybase.utils.i.a((Collection) installment.getPeriodList())) {
            return;
        }
        Period period = installment.getPeriodList().get(i);
        if (period != null) {
            eVar.a(period, installment.getPeriodList());
            eVar2.a(mTPayment);
            i2 = period.getPeriod();
        }
        if (eVar.c != null) {
            eVar.c.d(mTPayment);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_u5r394f2_mc", new a.c().a("choose_period", String.valueOf(i2)).a("pay_type", mTPayment.getPayType()).b);
    }
}
