package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Material implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4510716880916369375L;
    @SerializedName("benefit_has_promo_text")
    private String checkDiscountPromoText;
    @SerializedName("combine_title")
    private String combineTitle;
    @SerializedName("secret_promo_text")
    private String componentDiscountPromoText;
    @SerializedName("benefit_no_promo_text")
    private String uncheckDiscountPromoText;

    public String getCombineTitle() {
        return this.combineTitle;
    }

    public void setCombineTitle(String str) {
        this.combineTitle = str;
    }

    public String getCheckDiscountPromoText() {
        return this.checkDiscountPromoText;
    }

    public void setCheckDiscountPromoText(String str) {
        this.checkDiscountPromoText = str;
    }

    public String getUncheckDiscountPromoText() {
        return this.uncheckDiscountPromoText;
    }

    public void setUncheckDiscountPromoText(String str) {
        this.uncheckDiscountPromoText = str;
    }

    public String getComponentDiscountPromoText() {
        return this.componentDiscountPromoText;
    }

    public void setComponentDiscountPromoText(String str) {
        this.componentDiscountPromoText = str;
    }
}
