package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PromotionInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5846863361511394096L;
    @SerializedName("cashticket_code")
    private String cashTicketCode;
    @SerializedName(PayLabelConstants.KEY_LABEL_CHECK)
    private int check;
    @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
    private float discount;
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

    public String getCashTicketCode() {
        return this.cashTicketCode;
    }

    public void setCashTicketCode(String str) {
        this.cashTicketCode = str;
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

    public float getDiscount() {
        return this.discount;
    }

    public void setDiscount(float f) {
        this.discount = f;
    }

    public int getCheck() {
        return this.check;
    }

    public void setCheck(int i) {
        this.check = i;
    }
}
