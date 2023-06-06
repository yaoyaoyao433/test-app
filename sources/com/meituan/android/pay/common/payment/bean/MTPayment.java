package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.InstallmentRateDescBean;
import com.meituan.android.pay.common.payment.data.a;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CardInfo;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.HangAd;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class MTPayment extends BasePayment implements a {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 401502266619805917L;
    @SerializedName("agreements")
    private Agreement agreement;
    @SerializedName("balance")
    private float balance;
    @SerializedName("bank_type")
    private String bankType;
    @SerializedName("bank_type_id")
    private String bankTypeId;
    @SerializedName("brand_text")
    private String brandText;
    @SerializedName("use_np_pay")
    private boolean canUseNoPwdPay;
    @SerializedName("card_info")
    private CardInfo cardInfo;
    @SerializedName("card_type")
    private String cardType;
    @SerializedName("remain_money")
    private String combineMoney;
    @SerializedName("common_agreements")
    private Agreement commonAgreement;
    @SerializedName("no_pwd_pay_button")
    private String creditPayNoPwdButonText;
    @SerializedName("credit_pay_open_info")
    private CreditPayOpenInfoBean creditPayOpenInfo;
    @SerializedName("delay_pay_open_info")
    private DelayPayOpenInfoBean delayPayOpenInfo;
    @SerializedName("float_infos")
    private ArrayList<FloatingLayer> floatingLayers;
    @SerializedName(ConfigInfo.MODULE_BANNER)
    private List<HangAd> hangCardAds;
    @SerializedName("installment_info")
    private Installment installment;
    @SerializedName("installment_rate_desc")
    private InstallmentRateDescBean installmentRateDescBean;
    private boolean isCoBrandedCard;
    @SerializedName("is_open_creditpay")
    private boolean isOpenCreditPay;
    @SerializedName("balance_combine_support")
    private boolean isSupportBalanceCombine;
    @SerializedName("installment_available_flag")
    private int isSupportInstallment;
    @SerializedName("installment_unfold_flag")
    private boolean isUnfoldInstallmentView;
    @SerializedName("labels")
    private List<CombineLabel> labels;
    private Material material;
    @SerializedName("newcard")
    private MTNewCardBean mtNewCardBean;
    @SerializedName("banklist_page")
    private MtPaymentListPage mtPaymentListPage;
    @SerializedName("need_open_delaypay")
    private int needOpenDelayPay;
    @SerializedName("pay_button")
    private String payButonText;
    @SerializedName("paytype_id")
    private String payTypeId;
    @SerializedName("pay_type_unique_key")
    private String payTypeUniqueKey;
    @SerializedName("privilege_id")
    private String privilegeId;
    @SerializedName("repay_help")
    private RepayHelp repayHelp;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("pay_transparent_attributes")
    private String transparentAttributes;
    @SerializedName("installment_non_available_reason")
    private String unsupportedInstallmentReason;
    @SerializedName("no_pwd_upgrade_agreements")
    private Agreement updateAgreement;

    public boolean getIsCoBrandedCard() {
        return this.isCoBrandedCard;
    }

    public void setIsCoBrandedCard(boolean z) {
        this.isCoBrandedCard = z;
    }

    public CreditPayOpenInfoBean getCreditPayOpenInfo() {
        return this.creditPayOpenInfo;
    }

    public void setCreditPayOpenInfo(CreditPayOpenInfoBean creditPayOpenInfoBean) {
        this.creditPayOpenInfo = creditPayOpenInfoBean;
    }

    public boolean isUnfoldInstallmentView() {
        return this.isUnfoldInstallmentView;
    }

    public void setUnfoldInstallmentView(boolean z) {
        this.isUnfoldInstallmentView = z;
    }

    public ArrayList<FloatingLayer> getFloatingLayers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62024c0520f27e6aeb1b3cd948eff1a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62024c0520f27e6aeb1b3cd948eff1a8");
        }
        i.a((List) this.floatingLayers);
        return this.floatingLayers;
    }

    public void setFloatingLayers(ArrayList<FloatingLayer> arrayList) {
        this.floatingLayers = arrayList;
    }

    public MtPaymentListPage getMtPaymentListPage() {
        return this.mtPaymentListPage;
    }

    public void setMtPaymentListPage(MtPaymentListPage mtPaymentListPage) {
        this.mtPaymentListPage = mtPaymentListPage;
    }

    public String getCombineMoney() {
        return this.combineMoney;
    }

    public void setCombineMoney(String str) {
        this.combineMoney = str;
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

    public Agreement getUpdateAgreement() {
        return this.updateAgreement;
    }

    public void setUpdateAgreement(Agreement agreement) {
        this.updateAgreement = agreement;
    }

    public RepayHelp getRepayHelp() {
        return this.repayHelp;
    }

    public void setRepayHelp(RepayHelp repayHelp) {
        this.repayHelp = repayHelp;
    }

    public String getPrivilegeId() {
        return this.privilegeId;
    }

    public void setPrivilegeId(String str) {
        this.privilegeId = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public List<CombineLabel> getLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f57c84e90d249882f110c64fe01c1900", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f57c84e90d249882f110c64fe01c1900");
        }
        i.a((List) this.labels);
        return this.labels;
    }

    public boolean hasLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "342c8b41b7cd7ac2714ce4d1654206d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "342c8b41b7cd7ac2714ce4d1654206d8")).booleanValue() : !i.a((Collection) getLabels());
    }

    public void setLabels(List<CombineLabel> list) {
        this.labels = list;
    }

    @Override // com.meituan.android.pay.common.payment.bean.BasePayment, com.meituan.android.pay.common.payment.data.e
    public String getPayType() {
        return this.payType;
    }

    @Override // com.meituan.android.pay.common.payment.bean.BasePayment
    public void setPayType(String str) {
        this.payType = str;
    }

    @Override // com.meituan.android.pay.common.payment.bean.BasePayment, com.meituan.android.pay.common.payment.data.e
    public int getStatus() {
        return this.status;
    }

    @Override // com.meituan.android.pay.common.payment.bean.BasePayment
    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String str) {
        this.bankType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getPayTypeId() {
        return this.payTypeId;
    }

    public void setPayTypeId(String str) {
        this.payTypeId = str;
    }

    public List<HangAd> getHangCardAds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4296e0a7fc2f1cbad8b2adce4cd2165", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4296e0a7fc2f1cbad8b2adce4cd2165");
        }
        i.a((List) this.hangCardAds);
        return this.hangCardAds;
    }

    public void setHangCardAds(List<HangAd> list) {
        this.hangCardAds = list;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getBankTypeId() {
        return this.bankTypeId;
    }

    public void setBankTypeId(String str) {
        this.bankTypeId = str;
    }

    public String getBrandText() {
        return this.brandText;
    }

    public void setBrandText(String str) {
        this.brandText = str;
    }

    public String getPayButonText() {
        return this.payButonText;
    }

    public void setPayButonText(String str) {
        this.payButonText = str;
    }

    public String getCreditPayNoPwdButonText() {
        return this.creditPayNoPwdButonText;
    }

    public void setCreditPayNoPwdButonText(String str) {
        this.creditPayNoPwdButonText = str;
    }

    public boolean isSupportBalanceCombine() {
        return this.isSupportBalanceCombine;
    }

    public void setSupportBalanceCombine(boolean z) {
        this.isSupportBalanceCombine = z;
    }

    public int getIsSupportInstallment() {
        return this.isSupportInstallment;
    }

    public void setIsSupportInstallment(int i) {
        this.isSupportInstallment = i;
    }

    public String getUnsupportedInstallmentReason() {
        return this.unsupportedInstallmentReason;
    }

    public void setUnsupportedInstallmentReason(String str) {
        this.unsupportedInstallmentReason = str;
    }

    public Installment getInstallment() {
        return this.installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }

    public InstallmentRateDescBean getInstallmentRateDescBean() {
        return this.installmentRateDescBean;
    }

    public void setInstallmentRateDescBean(InstallmentRateDescBean installmentRateDescBean) {
        this.installmentRateDescBean = installmentRateDescBean;
    }

    public MTNewCardBean getMtNewCardBean() {
        return this.mtNewCardBean;
    }

    public void setMtNewCardBean(MTNewCardBean mTNewCardBean) {
        this.mtNewCardBean = mTNewCardBean;
    }

    public boolean isOpenCreditPay() {
        return this.isOpenCreditPay;
    }

    public void setOpenCreditPay(boolean z) {
        this.isOpenCreditPay = z;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getTransparentAttributes() {
        return this.transparentAttributes;
    }

    public void setTransparentAttributes(String str) {
        this.transparentAttributes = str;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float f) {
        this.balance = f;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getPayTypeUniqueKey() {
        return this.payTypeUniqueKey;
    }

    public void setPayTypeUniqueKey(String str) {
        this.payTypeUniqueKey = str;
    }

    public Agreement getCommonAgreement() {
        return this.commonAgreement;
    }

    public void setCommonAgreement(Agreement agreement) {
        this.commonAgreement = agreement;
    }

    public int getNeedOpenDelayPay() {
        return this.needOpenDelayPay;
    }

    public void setNeedOpenDelayPay(int i) {
        this.needOpenDelayPay = i;
    }

    public DelayPayOpenInfoBean getDelayPayOpenInfo() {
        return this.delayPayOpenInfo;
    }

    public void setDelayPayOpenInfo(DelayPayOpenInfoBean delayPayOpenInfoBean) {
        this.delayPayOpenInfo = delayPayOpenInfoBean;
    }
}
