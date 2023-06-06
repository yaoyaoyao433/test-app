package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PromoInfoCampaigns implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4343789410080154942L;
    @SerializedName("campaign_ids")
    private String campaignIds;
    @SerializedName("labels")
    private List<Label> labels;

    public String getCampaignIds() {
        return this.campaignIds;
    }

    public void setCampaignIds(String str) {
        this.campaignIds = str;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public void setLabels(List<Label> list) {
        this.labels = list;
    }
}
