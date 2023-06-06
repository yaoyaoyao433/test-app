package com.meituan.android.cashier.oneclick.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayExtendInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6462219238049160954L;
    @SerializedName("sellerId")
    private String merchantCode;
    @SerializedName("mtPlanId")
    private int mtPlanId;
    private String oneclickpayModalUrl;

    public String getMerchantCode() {
        return this.merchantCode;
    }

    public void setMerchantCode(String str) {
        this.merchantCode = str;
    }

    public String getOneclickpayModalUrl() {
        return this.oneclickpayModalUrl;
    }

    public void setOneclickpayModalUrl(String str) {
        this.oneclickpayModalUrl = str;
    }

    public int getMtPlanId() {
        return this.mtPlanId;
    }

    public void setMtPlanId(int i) {
        this.mtPlanId = i;
    }
}
