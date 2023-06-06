package com.meituan.android.pay.desk.component.bean.balanceinsufficientguide;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.component.bean.precomponent.PreTransInfo;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayErrorGuide implements c, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5115112950818215705L;
    @SerializedName("alert")
    private AlertPage alertPage;
    @SerializedName("popup")
    private DialogPage dialogPage;
    @SerializedName("loading_display_style")
    private String loadingDisplayStyle;
    @SerializedName("loading_text")
    private String loadingText;
    @SerializedName("banklist_page")
    private MtPaymentListPage mtPaymentListPage;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("recommend_pay_type")
    private MTPayment recommendPayment;
    @SerializedName("trans_info")
    private PreTransInfo transInfo;
    @SerializedName("pay_type_list_page")
    private WalletPaymentListPage walletPaymentListPage;

    public AlertPage getAlertPage() {
        return this.alertPage;
    }

    public void setAlertPage(AlertPage alertPage) {
        this.alertPage = alertPage;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public PreTransInfo getTransInfo() {
        return this.transInfo;
    }

    public void setTransInfo(PreTransInfo preTransInfo) {
        this.transInfo = preTransInfo;
    }

    public MtPaymentListPage getBankList() {
        return this.mtPaymentListPage;
    }

    public void setBankList(MtPaymentListPage mtPaymentListPage) {
        this.mtPaymentListPage = mtPaymentListPage;
    }

    public String getLoadingText() {
        return this.loadingText;
    }

    public void setLoadingText(String str) {
        this.loadingText = str;
    }

    public String getLoadingDisplayStyle() {
        return this.loadingDisplayStyle;
    }

    public void setLoadingDisplayStyle(String str) {
        this.loadingDisplayStyle = str;
    }

    public DialogPage getDialogPage() {
        return this.dialogPage;
    }

    public void setDialogPage(DialogPage dialogPage) {
        this.dialogPage = dialogPage;
    }

    public MTPayment getRecommendPayment() {
        return this.recommendPayment;
    }

    public void setRecommendPayment(MTPayment mTPayment) {
        this.recommendPayment = mTPayment;
    }

    public WalletPaymentListPage getWalletPaymentListPage() {
        return this.walletPaymentListPage;
    }

    public void setWalletPaymentListPage(WalletPaymentListPage walletPaymentListPage) {
        this.walletPaymentListPage = walletPaymentListPage;
    }
}
