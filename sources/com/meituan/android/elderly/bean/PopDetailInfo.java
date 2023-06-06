package com.meituan.android.elderly.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PopDetailInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6505079290827443567L;
    @SerializedName("background_image")
    private String backgroundImage;
    @SerializedName(GearsLocator.DETAIL)
    private String detail;
    @SerializedName("guide_button")
    private String guideButton;
    @SerializedName("lbtn")
    private String leftBtn;
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
}
