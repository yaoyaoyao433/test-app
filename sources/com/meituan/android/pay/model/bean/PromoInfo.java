package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PromoInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1547710603000027029L;
    @SerializedName("bankMore")
    private HashMap<String, Object> bankMore;
    private String bankTitle;
    private String ext;
    @SerializedName("bankLabel")
    private PromoInfoBankLabel promoInfoBankLabel;
    @SerializedName("campaigns")
    private PromoInfoCampaigns promoInfoCampaigns;

    public String getBankTitle() {
        return this.bankTitle;
    }

    public void setBankTitle(String str) {
        this.bankTitle = str;
    }

    public HashMap<String, Object> getBankMore() {
        return this.bankMore;
    }

    public void setBankMore(HashMap<String, Object> hashMap) {
        this.bankMore = hashMap;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public PromoInfoBankLabel getPromoInfoBankLabel() {
        return this.promoInfoBankLabel;
    }

    public void setPromoInfoBankLabel(PromoInfoBankLabel promoInfoBankLabel) {
        this.promoInfoBankLabel = promoInfoBankLabel;
    }

    public PromoInfoCampaigns getPromoInfoCampaigns() {
        return this.promoInfoCampaigns;
    }

    public void setPromoInfoCampaigns(PromoInfoCampaigns promoInfoCampaigns) {
        this.promoInfoCampaigns = promoInfoCampaigns;
    }
}
