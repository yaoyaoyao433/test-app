package com.meituan.android.pay.desk.payment.bean.standarddesk;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.BalanceCombineDeduct;
import com.meituan.android.pay.common.payment.bean.BasePayment;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WalletPayment extends BasePayment implements c {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2014459037917504567L;
    @SerializedName("all_paytypes_entrance_text")
    private String allPayTypesEntrance;
    @SerializedName("balance_combine")
    private BalanceCombineDeduct balanceCombineDeduct;
    @SerializedName("recommend_paytype")
    private List<MTPayment> recommendPayment;
    @SerializedName("paytype_list_page")
    private WalletPaymentListPage walletPaymentListPage;

    public List<MTPayment> getRecommendPayment() {
        return this.recommendPayment;
    }

    public void setRecommendPayment(List<MTPayment> list) {
        this.recommendPayment = list;
    }

    public WalletPaymentListPage getWalletPaymentListPage() {
        return this.walletPaymentListPage;
    }

    public void setWalletPaymentListPage(WalletPaymentListPage walletPaymentListPage) {
        this.walletPaymentListPage = walletPaymentListPage;
    }

    public String getAllPayTypesEntrance() {
        return this.allPayTypesEntrance;
    }

    public void setAllPayTypesEntrance(String str) {
        this.allPayTypesEntrance = str;
    }

    public BalanceCombineDeduct getBalanceCombineDeduct() {
        return this.balanceCombineDeduct;
    }

    public void setBalanceCombineDeduct(BalanceCombineDeduct balanceCombineDeduct) {
        this.balanceCombineDeduct = balanceCombineDeduct;
    }
}
