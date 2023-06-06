package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.BasePayment;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.payment.bean.RepayHelp;
import com.meituan.android.pay.common.payment.data.a;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CardInfo;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.HangAd;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BalanceCombinePayment extends BasePayment implements a {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8700790353704949629L;
    @SerializedName("agreements")
    private Agreement agreement;
    @SerializedName("balance")
    private float balance;
    @SerializedName("bank_type")
    private String bankType;
    @SerializedName("bank_type_id")
    private String bankTypeId;
    @SerializedName("card_info")
    private CardInfo cardInfo;
    @SerializedName("card_type")
    private String cardType;
    @SerializedName("float_infos")
    private ArrayList<FloatingLayer> floatingLayers;
    @SerializedName("labels")
    private List<CombineLabel> labels;
    private Material material;
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
    @SerializedName("no_pwd_upgrade_agreements")
    private Agreement updateAgreement;

    public List<HangAd> getHangCardAds() {
        return null;
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
    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String str) {
        this.bankType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getBankTypeId() {
        return this.bankTypeId;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getTransparentAttributes() {
        return this.transparentAttributes;
    }

    public void setTransparentAttributes(String str) {
        this.transparentAttributes = str;
    }

    public void setBankTypeId(String str) {
        this.bankTypeId = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getPayTypeId() {
        return this.payTypeId;
    }

    public void setPayTypeId(String str) {
        this.payTypeId = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public List<CombineLabel> getLabels() {
        return this.labels;
    }

    public void setLabels(List<CombineLabel> list) {
        this.labels = list;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float f) {
        this.balance = f;
    }

    public ArrayList<FloatingLayer> getFloatingLayers() {
        return this.floatingLayers;
    }

    public void setFloatingLayers(ArrayList<FloatingLayer> arrayList) {
        this.floatingLayers = arrayList;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override // com.meituan.android.pay.common.payment.data.a
    public String getPayTypeUniqueKey() {
        return this.payTypeUniqueKey;
    }

    public void setPayTypeUniqueKey(String str) {
        this.payTypeUniqueKey = str;
    }
}
