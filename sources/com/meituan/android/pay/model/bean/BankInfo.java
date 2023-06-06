package com.meituan.android.pay.model.bean;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.AlertPage;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.PayErrorGuide;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.bean.standardcomponent.OtherVerifyType;
import com.meituan.android.pay.desk.component.bean.standardcomponent.VerifyTypeDetail;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.pay.setpassword.CancelAlert;
import com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.fingerprint.bean.UpdateSoterKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BankInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2351585051756551450L;
    @SerializedName("account_insurance")
    private AccountInsurance accountInsurance;
    @SerializedName("adjust_nopassword_credit")
    private AdjustNoPasswordCredit adjustNoPasswordCredit;
    @SerializedName("adjust_nopasswordpay_success")
    private boolean adjustNoPasswordPaySuccess;
    private List<Agreement> agreements;
    @SerializedName("agreements_prefix")
    private String agreementsPrefix;
    @SerializedName("attach_params")
    private String attachParams;
    @SerializedName("banklist")
    private Banks banks;
    @SerializedName("bindcard_text")
    private String bindCardText;
    @SerializedName("button_text")
    private String buttonText;
    @SerializedName("can_upload_img")
    private boolean canUploadImg;
    @SerializedName("cancel_alert")
    private CancelAlert cancelAlert;
    @SerializedName("cardbin_fail")
    private AlertPage cardBinFail;
    @SerializedName("cardbin_len")
    private int cardBinLength;
    @SerializedName("update_cardinfo_alert")
    private AlertPage cardUpdateAlert;
    @SerializedName("cashdesk_info")
    private CashDesk cashDesk;
    @SerializedName("check_bindcard")
    private boolean checkBindcard;
    @SerializedName("verify_pay_password")
    private CheckPayPassword checkPayPasswordInfo;
    private HashMap<String, String> extraParams;
    private List<List<BankFactor>> factors;
    @SerializedName("fingerprintpay")
    private FingerprintPayResponse fingerprintPay;
    @SerializedName("finger_type")
    private int fingerprintProcess;
    private String hashResetStatus;
    @SerializedName("is_binded")
    private boolean isBinded;
    @SerializedName("is_payed")
    private boolean isPayed;
    @SerializedName("is_scancard_available")
    private boolean isScancardAvailable;
    @SerializedName("loading_display_style")
    private String loadingDisplayStyle;
    @SerializedName("loading_text")
    private String loadingText;
    @SerializedName("need_bindcard")
    private boolean needBindCard;
    @SerializedName("refresh")
    private boolean needRefresh;
    @SerializedName("nopasswordguide")
    private NoPasswordGuide noPasswordGuice;
    @SerializedName("open_fingerprintpay_success")
    private boolean open;
    private boolean openNoPasswordPaySuccess;
    @SerializedName("openWithHoldNoPasswordPaySuccess")
    private boolean openWithHoldNoPasswordPaySuccess;
    @SerializedName("open_withhold_info")
    private OpenWithholdInfo openWithholdInfo;
    @SerializedName("switch_button_text")
    private String openWithholdSwitchButtonText;
    @SerializedName("order_money")
    private float orderMoney;
    @SerializedName("other_verify_type")
    private OtherVerifyType otherVerifyType;
    @SerializedName(OtherVerifyTypeConstants.REQUEST_CODE)
    private String otherVerifyTypeCode;
    @SerializedName("outer_params")
    private HashMap<String, String> outerParams;
    @SerializedName("page_help")
    private PageHelp pageHelp;
    @SerializedName("page_message")
    private String pageMessage;
    @SerializedName("page_name")
    private String pageName;
    @SerializedName("page_tip")
    private String pageTip;
    @SerializedName("page_tip2")
    private String pageTip2;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("password_error_count")
    private int passwordErrorCount;
    @SerializedName("set_pay_password")
    private SetPasswordProcessInfo passwordProcessInfo;
    private HashMap<String, String> payAroundParams;
    @SerializedName("payerr_guide")
    private PayErrorGuide payErrorGuide;
    @SerializedName("pointpay_alert")
    private PointDeductAlert pointDeductAlert;
    @SerializedName("pop_window_info")
    private PopWindowInfo popWindowInfo;
    @SerializedName("promo_info")
    private PromoInfo promoInfo;
    private Promotion promotion;
    @SerializedName("quickbind")
    private QuickBankInfo quickBankInfo;
    private int registProcess;
    @SerializedName("result_url")
    private String resultUrl;
    @SerializedName("security_tip_text")
    private String securityTip;
    @SerializedName("show_bindcard")
    private boolean showBindCard;
    @SerializedName("submit_text")
    private String submitText;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("support_banks")
    private BankLimit supportBanks;
    @SerializedName("tradeno")
    private String tradeNo;
    @SerializedName("campaigns")
    private UnionBrandCard unionBrandCard;
    @SerializedName("update_soter_key")
    private UpdateSoterKey updateSoterKey;
    @SerializedName("verify_password_error_message")
    private String verifyPasswordErrorMessage;
    @SerializedName("verify_soter_status")
    private int verifySoterStatus;
    @SerializedName("verify_type_list")
    private List<VerifyTypeDetail> verifyTypeDetail;
    @SerializedName("voicecode_tip")
    private String voiceCodeTip;

    public String getOtherVerifyTypeCode() {
        return this.otherVerifyTypeCode;
    }

    public void setOtherVerifyTypeCode(String str) {
        this.otherVerifyTypeCode = str;
    }

    public String getResultUrl() {
        return this.resultUrl;
    }

    public void setResultUrl(String str) {
        this.resultUrl = str;
    }

    public Promotion getPromotion() {
        return this.promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setOpen(boolean z) {
        this.open = z;
    }

    public String getAttachParams() {
        return this.attachParams;
    }

    public void setAttachParams(String str) {
        this.attachParams = str;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setTradeNo(String str) {
        this.tradeNo = str;
    }

    public int getRegistProcess() {
        return this.registProcess;
    }

    public void setRegistProcess(int i) {
        this.registProcess = i;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public List<List<BankFactor>> getFactors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6638807ddf2c1a85d8b0a523869a454f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6638807ddf2c1a85d8b0a523869a454f");
        }
        i.a((List) this.factors);
        return this.factors;
    }

    public void setFactors(List<List<BankFactor>> list) {
        this.factors = list;
    }

    public int getCardBinLength() {
        return this.cardBinLength;
    }

    public void setCardBinLength(int i) {
        this.cardBinLength = i;
    }

    public List<Agreement> getAgreements() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c33a8e4b881a9cdd1a1e7f20c0e514c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c33a8e4b881a9cdd1a1e7f20c0e514c0");
        }
        i.a((List) this.agreements);
        return this.agreements;
    }

    public void setAgreements(List<Agreement> list) {
        this.agreements = list;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public boolean isShowBindCard() {
        return this.showBindCard;
    }

    public void setShowBindCard(boolean z) {
        this.showBindCard = z;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public String getPageMessage() {
        return this.pageMessage;
    }

    public void setPageMessage(String str) {
        this.pageMessage = str;
    }

    public boolean isPayed() {
        return this.isPayed;
    }

    public void setPayed(boolean z) {
        this.isPayed = z;
    }

    public CheckPayPassword getCheckPayPasswordInfo() {
        return this.checkPayPasswordInfo;
    }

    public void setCheckPayPasswordInfo(CheckPayPassword checkPayPassword) {
        this.checkPayPasswordInfo = checkPayPassword;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public boolean isNeedBindCard() {
        return this.needBindCard;
    }

    public void setNeedBindCard(boolean z) {
        this.needBindCard = z;
    }

    public NoPasswordGuide getNoPasswordGuice() {
        return this.noPasswordGuice;
    }

    public void setNoPasswordGuice(NoPasswordGuide noPasswordGuide) {
        this.noPasswordGuice = noPasswordGuide;
    }

    public String getVoiceCodeTip() {
        return this.voiceCodeTip;
    }

    public void setVoiceCodeTip(String str) {
        this.voiceCodeTip = str;
    }

    public String getPageTip2() {
        return this.pageTip2;
    }

    public void setPageTip2(String str) {
        this.pageTip2 = str;
    }

    public void setIsPayed(boolean z) {
        this.isPayed = z;
    }

    public boolean isScancardAvailable() {
        return this.isScancardAvailable;
    }

    public void setIsScanardAvailable(boolean z) {
        this.isScancardAvailable = z;
    }

    public SetPasswordProcessInfo getPasswordProcessInfo() {
        return this.passwordProcessInfo;
    }

    public void setPasswordProcessInfo(SetPasswordProcessInfo setPasswordProcessInfo) {
        this.passwordProcessInfo = setPasswordProcessInfo;
    }

    public String getBindCardText() {
        return this.bindCardText;
    }

    public void setBindCardText(String str) {
        this.bindCardText = str;
    }

    public boolean checkBindcard() {
        return this.checkBindcard;
    }

    public void setCheckBindcard(boolean z) {
        this.checkBindcard = z;
    }

    public boolean isBinded() {
        return this.isBinded;
    }

    public void setBinded(boolean z) {
        this.isBinded = z;
    }

    public AlertPage getCardBinFail() {
        return this.cardBinFail;
    }

    public void setCardBinFail(AlertPage alertPage) {
        this.cardBinFail = alertPage;
    }

    public CancelAlert getCancelAlert() {
        return this.cancelAlert;
    }

    public void setCancelAlert(CancelAlert cancelAlert) {
        this.cancelAlert = cancelAlert;
    }

    public String getSubmitText() {
        return this.submitText;
    }

    public void setSubmitText(String str) {
        this.submitText = str;
    }

    public HashMap<String, String> getOuterParams() {
        return this.outerParams;
    }

    public void setOuterParams(HashMap<String, String> hashMap) {
        this.outerParams = hashMap;
    }

    public Banks getBanks() {
        return this.banks;
    }

    public void setBanks(Banks banks) {
        this.banks = banks;
    }

    public float getOrderMoney() {
        return this.orderMoney;
    }

    public void setOrderMoney(float f) {
        this.orderMoney = f;
    }

    public PayErrorGuide getPayErrorGuide() {
        return this.payErrorGuide;
    }

    public void setPayErrorGuide(PayErrorGuide payErrorGuide) {
        this.payErrorGuide = payErrorGuide;
    }

    public AlertPage getCardUpdateAlert() {
        return this.cardUpdateAlert;
    }

    public void setCardUpdateAlert(AlertPage alertPage) {
        this.cardUpdateAlert = alertPage;
    }

    public FingerprintPayResponse getFingerprintPay() {
        return this.fingerprintPay;
    }

    public void setFingerprintPay(FingerprintPayResponse fingerprintPayResponse) {
        this.fingerprintPay = fingerprintPayResponse;
    }

    public boolean isOpenNoPasswordPaySuccess() {
        return this.openNoPasswordPaySuccess;
    }

    public void setOpenNoPasswordPaySuccess(boolean z) {
        this.openNoPasswordPaySuccess = z;
    }

    public boolean isAdjustNoPasswordPaySuccess() {
        return this.adjustNoPasswordPaySuccess;
    }

    public void setAdjustNoPasswordPaySuccess(boolean z) {
        this.adjustNoPasswordPaySuccess = z;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public AdjustNoPasswordCredit getAdjustNoPasswordCredit() {
        return this.adjustNoPasswordCredit;
    }

    public void setAdjustNoPasswordCredit(AdjustNoPasswordCredit adjustNoPasswordCredit) {
        this.adjustNoPasswordCredit = adjustNoPasswordCredit;
    }

    public CashDesk getCashDesk() {
        return this.cashDesk;
    }

    public void setCashDesk(CashDesk cashDesk) {
        this.cashDesk = cashDesk;
    }

    public PageHelp getPageHelp() {
        return this.pageHelp;
    }

    public void setPageHelp(PageHelp pageHelp) {
        this.pageHelp = pageHelp;
    }

    public int getFingerprintProcess() {
        return this.fingerprintProcess;
    }

    public void setFingerprintProcess(int i) {
        this.fingerprintProcess = i;
    }

    public UpdateSoterKey getUpdateSoterKey() {
        return this.updateSoterKey;
    }

    public void setUpdateSoterKey(UpdateSoterKey updateSoterKey) {
        this.updateSoterKey = updateSoterKey;
    }

    public int getVerifySoterStatus() {
        return this.verifySoterStatus;
    }

    public void setVerifySoterStatus(int i) {
        this.verifySoterStatus = i;
    }

    public boolean canUploadImg() {
        return this.canUploadImg;
    }

    public void setCanUploadImg(boolean z) {
        this.canUploadImg = z;
    }

    public boolean isNeedRefresh() {
        return this.needRefresh;
    }

    public void setNeedRefresh(boolean z) {
        this.needRefresh = z;
    }

    public UnionBrandCard getUnionBrandCard() {
        return this.unionBrandCard;
    }

    public void setUnionBrandCard(UnionBrandCard unionBrandCard) {
        this.unionBrandCard = unionBrandCard;
    }

    public String getSecurityTip() {
        return this.securityTip;
    }

    public void setSecurityTip(String str) {
        this.securityTip = str;
    }

    public BankLimit getSupportBanks() {
        return this.supportBanks;
    }

    public void setSupportBanks(BankLimit bankLimit) {
        this.supportBanks = bankLimit;
    }

    public boolean isOpenWithHoldNoPasswordPaySuccess() {
        return this.openWithHoldNoPasswordPaySuccess;
    }

    public void setOpenWithHoldNoPasswordPaySuccess(boolean z) {
        this.openWithHoldNoPasswordPaySuccess = z;
    }

    public String getAgreementsPrefix() {
        return this.agreementsPrefix;
    }

    public void setAgreementsPrefix(String str) {
        this.agreementsPrefix = str;
    }

    public AccountInsurance getAccountInsurance() {
        return this.accountInsurance;
    }

    public void setAccountInsurance(AccountInsurance accountInsurance) {
        this.accountInsurance = accountInsurance;
    }

    public boolean isCardBinPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4494c5fae06b284e7d3b36cd09cfdba0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4494c5fae06b284e7d3b36cd09cfdba0")).booleanValue() : TextUtils.equals("cardbin", this.pageName);
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

    public PointDeductAlert getPointDeductAlert() {
        return this.pointDeductAlert;
    }

    public void setPointDeductAlert(PointDeductAlert pointDeductAlert) {
        this.pointDeductAlert = pointDeductAlert;
    }

    public QuickBankInfo getQuickBankInfo() {
        return this.quickBankInfo;
    }

    public void setQuickBankInfo(QuickBankInfo quickBankInfo) {
        this.quickBankInfo = quickBankInfo;
    }

    public PromoInfo getPromoInfo() {
        return this.promoInfo;
    }

    public void setPromoInfo(PromoInfo promoInfo) {
        this.promoInfo = promoInfo;
    }

    public String getVerifyPasswordErrorMessage() {
        return this.verifyPasswordErrorMessage;
    }

    public void setVerifyPasswordErrorMessage(String str) {
        this.verifyPasswordErrorMessage = str;
    }

    public int getPasswordErrorCount() {
        return this.passwordErrorCount;
    }

    public void setPasswordErrorCount(int i) {
        this.passwordErrorCount = i;
    }

    public OtherVerifyType getOtherVerifyType() {
        return this.otherVerifyType;
    }

    public void setOtherVerifyType(OtherVerifyType otherVerifyType) {
        this.otherVerifyType = otherVerifyType;
    }

    public String getHashResetStatus() {
        return this.hashResetStatus;
    }

    public void setHashResetStatus(String str) {
        this.hashResetStatus = str;
    }

    public OpenWithholdInfo getOpenWithholdInfo() {
        return this.openWithholdInfo;
    }

    public void setOpenWithholdInfo(OpenWithholdInfo openWithholdInfo) {
        this.openWithholdInfo = openWithholdInfo;
    }

    public String getOpenWithholdSwitchButtonText() {
        return this.openWithholdSwitchButtonText;
    }

    public void setOpenWithholdSwitchButtonText(String str) {
        this.openWithholdSwitchButtonText = str;
    }

    public PopWindowInfo getPopWindowInfo() {
        return this.popWindowInfo;
    }

    public void setPopWindowInfo(PopWindowInfo popWindowInfo) {
        this.popWindowInfo = popWindowInfo;
    }

    public HashMap<String, String> getExtraParams() {
        return this.extraParams;
    }

    public void setExtraParams(HashMap<String, String> hashMap) {
        this.extraParams = hashMap;
    }

    public HashMap<String, String> getPayAroundParams() {
        return this.payAroundParams;
    }

    public void setPayAroundParams(HashMap<String, String> hashMap) {
        this.payAroundParams = hashMap;
    }

    public List<VerifyTypeDetail> getVerifyTypeDetail() {
        return this.verifyTypeDetail;
    }

    public void setVerifyTypeDetail(List<VerifyTypeDetail> list) {
        this.verifyTypeDetail = list;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d09dd7e320a43c035ec42208e5847569", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d09dd7e320a43c035ec42208e5847569") : new Gson().toJson(this);
    }
}
