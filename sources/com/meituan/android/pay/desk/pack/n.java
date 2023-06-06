package com.meituan.android.pay.desk.pack;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final Fragment c;
    private final MTPayment d;

    private n(e eVar, Fragment fragment, MTPayment mTPayment) {
        this.b = eVar;
        this.c = fragment;
        this.d = mTPayment;
    }

    public static View.OnClickListener a(e eVar, Fragment fragment, MTPayment mTPayment) {
        Object[] objArr = {eVar, fragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42364e81423c8bb7644a1b544061db6c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42364e81423c8bb7644a1b544061db6c") : new n(eVar, fragment, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd07e0b93599dbd628985f0417bd0d7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd07e0b93599dbd628985f0417bd0d7");
            return;
        }
        e eVar = this.b;
        Fragment fragment = this.c;
        MTPayment mTPayment = this.d;
        Object[] objArr2 = {eVar, fragment, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3b9af837a15f0c9e8a236fdb0bcdb929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3b9af837a15f0c9e8a236fdb0bcdb929");
            return;
        }
        Object[] objArr3 = {fragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "d26e46479a2428a5135633fd76e4828a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "d26e46479a2428a5135633fd76e4828a");
        } else {
            MtPaymentListPage mtPaymentListPage = mTPayment.getMtPaymentListPage();
            if (mtPaymentListPage != null) {
                SelectBankDialogFragment.a(mtPaymentListPage, com.meituan.android.pay.common.payment.utils.d.b(mtPaymentListPage), SelectBankDialog.c.CLOSE, 0).a(fragment.getChildFragmentManager());
            }
        }
        if (eVar.c != null) {
            eVar.c.b(view);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ofgn5eb3_mc", (Map<String, Object>) null);
    }
}
