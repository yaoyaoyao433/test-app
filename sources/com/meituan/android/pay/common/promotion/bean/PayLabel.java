package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayLabel implements Serializable {
    public static final String ITEM_TYPE_DISCOUNT = "discount";
    public static final String ITEM_TYPE_REWARD = "reward";
    public static final String LABEL_TYPE_COLLECT = "total";
    public static final String LABEL_TYPE_COUPON = "coupon";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4543513822861142337L;
    private Agreement agreement;
    @SerializedName("benefit")
    private String benefit;
    @SerializedName("campaign_id")
    private String campaignId;
    @SerializedName("cashticket_code")
    private String cashTicketCode;
    private String content;
    private float discount;
    @SerializedName("item_type")
    private String itemType;
    @SerializedName("code")
    private String labelCode;
    @SerializedName("label_head")
    private String labelHead;
    @SerializedName("label_icon")
    private LabelIcon labelIcon;
    @SerializedName("switch_flag")
    private LabelSwitch labelSwitch;
    @SerializedName("label_type")
    private String labelType;
    private HashMap<String, Object> progress;
    @SerializedName("promo_code")
    private String promoCode;
    @SerializedName(Constants.Business.KEY_PROMOT_ID)
    private String promoId;
    @SerializedName("promo_type")
    private String promoType;
    @SerializedName("real_discount")
    private float realDiscount;

    public String getPromoId() {
        return this.promoId;
    }

    public void setPromoId(String str) {
        this.promoId = str;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(String str) {
        this.promoCode = str;
    }

    public String getPromoType() {
        return this.promoType;
    }

    public void setPromoType(String str) {
        this.promoType = str;
    }

    public float getRealDiscount() {
        return this.realDiscount;
    }

    public void setRealDiscount(float f) {
        this.realDiscount = f;
    }

    public Agreement getAgreement() {
        return this.agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(String str) {
        this.campaignId = str;
    }

    public String getCashTicketCode() {
        return this.cashTicketCode;
    }

    public void setCashTicketCode(String str) {
        this.cashTicketCode = str;
    }

    public float getDiscount() {
        return this.discount;
    }

    public void setDiscount(float f) {
        this.discount = f;
    }

    public LabelSwitch getLabelSwitch() {
        return this.labelSwitch;
    }

    public void setLabelSwitch(LabelSwitch labelSwitch) {
        this.labelSwitch = labelSwitch;
    }

    public String getLabelType() {
        return this.labelType;
    }

    public void setLabelType(String str) {
        this.labelType = str;
    }

    public String getLabelCode() {
        return this.labelCode;
    }

    public void setLabelCode(String str) {
        this.labelCode = str;
    }

    public String getLabelHead() {
        return this.labelHead;
    }

    public void setLabelHead(String str) {
        this.labelHead = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String str) {
        this.itemType = str;
    }

    public String getBenefit() {
        return this.benefit;
    }

    public void setBenefit(String str) {
        this.benefit = str;
    }

    public LabelIcon getLabelIcon() {
        return this.labelIcon;
    }

    public void setLabelIcon(LabelIcon labelIcon) {
        this.labelIcon = labelIcon;
    }

    public HashMap<String, Object> getProgress() {
        return this.progress;
    }

    public void setProgress(HashMap<String, Object> hashMap) {
        this.progress = hashMap;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91012bec6432cb729b96470062ec7c5a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91012bec6432cb729b96470062ec7c5a") : new Gson().toJson(this);
    }
}
