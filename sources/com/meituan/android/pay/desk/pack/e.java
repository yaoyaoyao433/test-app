package com.meituan.android.pay.desk.pack;

import android.support.v4.app.Fragment;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public WalletPayment b;
    public b c;
    public a d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(com.meituan.android.pay.common.payment.data.d dVar);
    }

    public e(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6145a22dcdc6b0e97a2cc60e8d1cd21f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6145a22dcdc6b0e97a2cc60e8d1cd21f");
        } else if (dVar instanceof WalletPayment) {
            this.b = (WalletPayment) dVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0380  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.LinearLayout r30, android.support.v4.app.Fragment r31) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.desk.pack.e.a(android.widget.LinearLayout, android.support.v4.app.Fragment):void");
    }

    private com.meituan.android.pay.common.render.a a(Fragment fragment, MTPayment mTPayment, WalletPayment walletPayment) {
        Object[] objArr = {fragment, mTPayment, walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa3515a7b5e654c0a642bb93778f27f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.render.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa3515a7b5e654c0a642bb93778f27f");
        }
        com.meituan.android.pay.desk.payment.view.b bVar = new com.meituan.android.pay.desk.payment.view.b(fragment.getContext());
        bVar.setActivity(fragment.getActivity());
        bVar.b(mTPayment);
        if (!com.meituan.android.paybase.utils.i.a((Collection) mTPayment.getHangCardAds())) {
            bVar.setOnClickNewCardAd(s.a(this, fragment, walletPayment));
        }
        if (mTPayment.getInstallmentRateDescBean() != null) {
            bVar.setOnClickShowFeeDialogListener(t.a(this, fragment, mTPayment));
        }
        bVar.setOnClickAgreementListener(g.a(this, fragment, mTPayment));
        bVar.setOnClickPeriodItemListener(h.a(this, mTPayment, bVar));
        bVar.setOnClickListener(i.a(this, mTPayment));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, WalletPayment walletPayment) {
        Object[] objArr = {fragment, walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ee057e042b12b72ace68892d0541da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ee057e042b12b72ace68892d0541da");
        } else if (walletPayment.getWalletPaymentListPage() != null) {
            WalletPaymentListPage walletPaymentListPage = walletPayment.getWalletPaymentListPage();
            SelectBankDialogFragment.a(walletPaymentListPage, com.meituan.android.pay.common.payment.utils.d.b(walletPaymentListPage), SelectBankDialog.c.CLOSE, 1).a(fragment.getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Period period, List<Period> list) {
        Object[] objArr = {period, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d9cd9ef1d7843e06cf1669682137d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d9cd9ef1d7843e06cf1669682137d1c");
        } else if (!com.meituan.android.paybase.utils.i.a((Collection) list)) {
            for (Period period2 : list) {
                if (period2 == period) {
                    period2.setSelected(true);
                } else {
                    period2.setSelected(false);
                }
            }
        }
    }
}
