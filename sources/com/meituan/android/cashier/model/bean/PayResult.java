package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -644764309558464844L;
    private String action;
    @SerializedName("payed_total_by_credit")
    private boolean isPayedTotalByCredit;
    @SerializedName("overload_info")
    private OverLoadInfo overLoadInfo;
    @SerializedName("pay_type")
    private String payType;
    private PopUp popup;
    private Promotion promotion;
    private String url;
    @SerializedName("verify_url")
    private String verifyUrl;

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public void setVerifyUrl(String str) {
        this.verifyUrl = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean isPayedTotalByCredit() {
        return this.isPayedTotalByCredit;
    }

    public void setPayedTotalByCredit(boolean z) {
        this.isPayedTotalByCredit = z;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4b4ecb6421311f06eed5ae8e53518e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4b4ecb6421311f06eed5ae8e53518e6");
        }
        return "url=" + this.url + ",isPayedTotalByCredit=" + this.isPayedTotalByCredit + ",payType=" + this.payType;
    }

    public OverLoadInfo getOverLoadInfo() {
        return this.overLoadInfo;
    }

    public void setOverLoadInfo(OverLoadInfo overLoadInfo) {
        this.overLoadInfo = overLoadInfo;
    }

    public Promotion getPromotion() {
        return this.promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public PopUp getPopUp() {
        return this.popup;
    }

    public void setPopUp(PopUp popUp) {
        this.popup = popUp;
    }
}
