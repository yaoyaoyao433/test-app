package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PopDetailInfo implements Serializable {
    public static final String COMMON_STYLE = "common_style";
    public static final String CREDITPAY_STYLE = "creditpay_style";
    public static final String FUNCTION_SINGED_STYLE = "function_signed_style";
    public static final String FUNCTION_STYLE = "function_style";
    public static final String RED_ENVELOPE_STYLE = "red_envelope_style";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6505079290827443567L;
    @SerializedName("ad_id")
    private String adId;
    @SerializedName("background_image")
    private String backgroundImage;
    @SerializedName(GearsLocator.DETAIL)
    private String detail;
    @SerializedName("guide_button")
    private String guideButton;
    @SerializedName("guide_button_background_image")
    private String guideButtonBackgroundImage;
    @SerializedName("guide_pay_type_info")
    private MTPayment guidePayTypeInfo;
    @SerializedName("lbtn")
    private String leftBtn;
    @SerializedName("marketing_background_image")
    private String marketingBackgroundImage;
    @SerializedName("marketing_main_title")
    private String marketingMainTitle;
    @SerializedName("marketing_sub_title")
    private String marketingSubTitle;
    @SerializedName("payment_suffix")
    private String paymentSuffix;
    private String popScene;
    @SerializedName("popupType")
    private String popupType;
    @SerializedName("total_promo_money")
    private float promotionMoney;
    @SerializedName("redirect_url")
    private String redirectUrl;
    @SerializedName("rbtn")
    private String rightBtn;
    private String style;
    @SerializedName("sub_title")
    private String subtitle;
    private String title;

    public String getPopScene() {
        return this.popScene;
    }

    public void setPopScene(String str) {
        this.popScene = str;
    }

    public String getPopupType() {
        return this.popupType;
    }

    public void setPopupType(String str) {
        this.popupType = str;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String str) {
        this.style = str;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public String getLeftBtn() {
        return this.leftBtn;
    }

    public void setLeftBtn(String str) {
        this.leftBtn = str;
    }

    public String getRightBtn() {
        return this.rightBtn;
    }

    public void setRightBtn(String str) {
        this.rightBtn = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getGuideButton() {
        return this.guideButton;
    }

    public void setGuideButton(String str) {
        this.guideButton = str;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public float getPromotionMoney() {
        return this.promotionMoney;
    }

    public void setPromotionMoney(float f) {
        this.promotionMoney = f;
    }

    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    public void setBackgroundImage(String str) {
        this.backgroundImage = str;
    }

    public MTPayment getGuidePayTypeInfo() {
        return this.guidePayTypeInfo;
    }

    public void setGuidePayTypeInfo(MTPayment mTPayment) {
        this.guidePayTypeInfo = mTPayment;
    }

    public String getMarketingBackgroundImage() {
        return this.marketingBackgroundImage;
    }

    public void setMarketingBackgroundImage(String str) {
        this.marketingBackgroundImage = str;
    }

    public String getMarketingMainTitle() {
        return this.marketingMainTitle;
    }

    public void setMarketingMainTitle(String str) {
        this.marketingMainTitle = str;
    }

    public String getMarketingSubTitle() {
        return this.marketingSubTitle;
    }

    public void setMarketingSubTitle(String str) {
        this.marketingSubTitle = str;
    }

    public String getGuideButtonBackgroundImage() {
        return this.guideButtonBackgroundImage;
    }

    public void setGuideButtonBackgroundImage(String str) {
        this.guideButtonBackgroundImage = str;
    }

    public String getAdId() {
        return this.adId;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public String getPaymentSuffix() {
        return this.paymentSuffix;
    }

    public void setPaymentSuffix(String str) {
        this.paymentSuffix = str;
    }
}
