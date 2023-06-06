package com.meituan.android.pay.process.ntv.around;

import android.app.Dialog;
import android.text.TextUtils;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.AlertPage;
import com.meituan.android.pay.utils.e;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final a b;
    private final AlertPage c;
    private final MtPaymentListPage d;

    public c(a aVar, AlertPage alertPage, MtPaymentListPage mtPaymentListPage) {
        this.b = aVar;
        this.c = alertPage;
        this.d = mtPaymentListPage;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d507285b3aef5843a8236417182f01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d507285b3aef5843a8236417182f01e");
            return;
        }
        a aVar = this.b;
        AlertPage alertPage = this.c;
        MtPaymentListPage mtPaymentListPage = this.d;
        Object[] objArr2 = {aVar, alertPage, mtPaymentListPage, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "499c322f7a90462ab4cb28482d14ab77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "499c322f7a90462ab4cb28482d14ab77");
        } else if (!TextUtils.isEmpty(alertPage.getSubmitUrl())) {
            e.a(aVar.b, null, new Payment());
            com.meituan.android.pay.common.payment.utils.b.a(aVar.b, "pay_type", "cardpay");
            com.meituan.android.pay.common.payment.utils.b.c(aVar.b, "combine_type");
            PayActivity.a(aVar.b, alertPage.getSubmitUrl(), (HashMap<String, String>) null, (HashMap<String, String>) null, 894, aVar);
            com.meituan.android.paybase.common.analyse.a.a("b_515f1dcq", (Map<String, Object>) null);
        } else if (mtPaymentListPage != null) {
            com.meituan.android.pay.analyse.a.c++;
            SelectBankDialogFragment a2 = SelectBankDialogFragment.a(mtPaymentListPage, null, SelectBankDialog.c.CLOSE, true, 0);
            a2.a(aVar.b.getSupportFragmentManager());
            a2.b = aVar;
            com.meituan.android.paybase.common.analyse.a.a("b_bvu3mth4", (Map<String, Object>) null);
        }
    }
}
