package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CombineLabel extends Label implements Serializable {
    public static final String BONUS_SWITCH_CLOSE = "0";
    public static final String BONUS_SWITCH_OPEN = "1";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -480177963365419312L;
    @SerializedName("campaign_id")
    private String campaignId;
    @SerializedName("cashticket_code")
    private String cashTicketCode;
    @SerializedName("children")
    private List<PayLabel> childrenLabel;
    private float discount;
    @SerializedName("switch_flag")
    private LabelSwitch labelSwitch;
    @SerializedName("label_type")
    private String labelType;
    @SerializedName(Constants.Business.KEY_PROMOT_ID)
    private String promoId;
    @SerializedName("promo_type")
    private String promoType;
    @SerializedName("real_discount")
    private float realDiscount;

    public List<PayLabel> getChildrenLabel() {
        return this.childrenLabel;
    }

    public void setChildrenLabel(List<PayLabel> list) {
        this.childrenLabel = list;
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

    public String getLabelType() {
        return this.labelType;
    }

    public void setLabelType(String str) {
        this.labelType = str;
    }

    public String getPromoId() {
        return this.promoId;
    }

    public void setPromoId(String str) {
        this.promoId = str;
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

    public LabelSwitch getLabelSwitch() {
        return this.labelSwitch;
    }

    public void setLabelSwitch(LabelSwitch labelSwitch) {
        this.labelSwitch = labelSwitch;
    }
}
