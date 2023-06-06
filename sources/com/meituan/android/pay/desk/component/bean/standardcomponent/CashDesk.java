package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.payment.bean.RepayHelp;
import com.meituan.android.pay.common.payment.data.a;
import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.pay.common.payment.utils.d;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.LabelAbTest;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.pay.desk.component.bean.precomponent.PayGuide;
import com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashDesk implements c, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5601834862481784897L;
    @SerializedName("agreements")
    private Agreement agreement;
    @SerializedName("combine_pay_type_list")
    private List<BalanceCombinePayment> balanceCombineDetailList;
    @SerializedName("can_direct_pay")
    private int canDirectPay;
    @SerializedName("use_np_pay")
    private boolean canUseNoPwdPay;
    @SerializedName("cancel_alert_context")
    private String cancelAlertContext;
    @SerializedName(GearsLocator.DETAIL)
    private List<CombineDetailItem> combineDetailList;
    @SerializedName("current_time")
    private int currentTime;
    @SerializedName("expire_time")
    private int expireTime;
    @SerializedName("fingerprintpay")
    private FingerprintPayResponse fingerprintPayResponse;
    @SerializedName("ab_test")
    private LabelAbTest labelAbTest;
    @SerializedName("banklist_page")
    private MtPaymentListPage mtPaymentListPage;
    @SerializedName("other_verify_type")
    private OtherVerifyType otherVerifyType;
    @SerializedName("page_tip")
    private String pageTip;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("pay_button")
    private String payButtonText;
    @SerializedName("pay_guide")
    private PayGuide payGuide;
    @SerializedName("repay_help")
    private RepayHelp repayHelp;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("trans_info")
    private HelloPayTransInfo transInfo;
    @MTPaySuppressFBWarnings({"UWF_NULL_FIELD"})
    private Payment useNewCard;
    @SerializedName("verify_type")
    private int verifyType;

    public CashDesk() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "899ddc0f6a07e60cf561ac29b603fa44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "899ddc0f6a07e60cf561ac29b603fa44");
        } else {
            this.useNewCard = null;
        }
    }

    public String getCancelAlertContext() {
        return this.cancelAlertContext;
    }

    public void setCancelAlertContext(String str) {
        this.cancelAlertContext = str;
    }

    public List<CombineDetailItem> getCombineDetailList() {
        return this.combineDetailList;
    }

    public void setCombineDetailList(List<CombineDetailItem> list) {
        this.combineDetailList = list;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(int i) {
        this.currentTime = i;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(int i) {
        this.expireTime = i;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getPayButtonText() {
        return this.payButtonText;
    }

    public void setPayButtonText(String str) {
        this.payButtonText = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public HelloPayTransInfo getTransInfo() {
        return this.transInfo;
    }

    public void setTransInfo(HelloPayTransInfo helloPayTransInfo) {
        this.transInfo = helloPayTransInfo;
    }

    public int getVerifyType() {
        return this.verifyType;
    }

    public void setVerifyType(int i) {
        this.verifyType = i;
    }

    public float getPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60914e48693e3da15f9ed4b026ec7c05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60914e48693e3da15f9ed4b026ec7c05")).floatValue();
        }
        if (this.transInfo != null) {
            return this.transInfo.getOrderMoney();
        }
        return -1.0f;
    }

    public List<CombineLabel> getLabel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "470b103933da478c10548bc34e5c203a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "470b103933da478c10548bc34e5c203a");
        }
        if (this.transInfo != null) {
            return this.transInfo.getLabels();
        }
        return null;
    }

    public a getUseNewCard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "752d3e1ccd3fbef684d91e2bac17feef", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "752d3e1ccd3fbef684d91e2bac17feef");
        }
        if (this.useNewCard != null) {
            return this.useNewCard;
        }
        if (this.mtPaymentListPage == null) {
            return null;
        }
        return d.e(this.mtPaymentListPage);
    }

    public FingerprintPayResponse getFingerprintPayResponse() {
        return this.fingerprintPayResponse;
    }

    public void setFingerprintPayResponse(FingerprintPayResponse fingerprintPayResponse) {
        this.fingerprintPayResponse = fingerprintPayResponse;
    }

    public PayGuide getPayGuide() {
        return this.payGuide;
    }

    public void setPayGuide(PayGuide payGuide) {
        this.payGuide = payGuide;
    }

    public MtPaymentListPage getMtPaymentListPage() {
        return this.mtPaymentListPage;
    }

    public void setMtPaymentListPage(MtPaymentListPage mtPaymentListPage) {
        this.mtPaymentListPage = mtPaymentListPage;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public boolean isCanUseNoPwdPay() {
        return this.canUseNoPwdPay;
    }

    public void setCanUseNoPwdPay(boolean z) {
        this.canUseNoPwdPay = z;
    }

    public Agreement getAgreement() {
        return this.agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public RepayHelp getRepayHelp() {
        return this.repayHelp;
    }

    public void setRepayHelp(RepayHelp repayHelp) {
        this.repayHelp = repayHelp;
    }

    public OtherVerifyType getOtherVerifyType() {
        return this.otherVerifyType;
    }

    public void setOtherVerifyType(OtherVerifyType otherVerifyType) {
        this.otherVerifyType = otherVerifyType;
    }

    public LabelAbTest getLabelAbTest() {
        return this.labelAbTest;
    }

    public void setLabelAbTest(LabelAbTest labelAbTest) {
        this.labelAbTest = labelAbTest;
    }

    public List<BalanceCombinePayment> getBalanceCombineDetailList() {
        return this.balanceCombineDetailList;
    }

    public void setBalanceCombineDetailList(List<BalanceCombinePayment> list) {
        this.balanceCombineDetailList = list;
    }

    public int getCanDirectPay() {
        return this.canDirectPay;
    }

    public void setCanDirectPay(int i) {
        this.canDirectPay = i;
    }
}
