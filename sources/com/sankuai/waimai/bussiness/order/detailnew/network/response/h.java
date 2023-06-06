package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sankuai.waimai.business.order.api.detail.network.response.ActivityDialogInfo;
import com.sankuai.waimai.business.order.api.detail.network.response.EnvelopeShareTip;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements Serializable {
    @SerializedName("type")
    public int a;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String b;
    @SerializedName("title")
    public String c;
    @SerializedName("click_url")
    public String d;
    @SerializedName("envelope_share_tip")
    public EnvelopeShareTip e;
    @SerializedName("activity_share_tip")
    public ActivityDialogInfo f;
    @SerializedName("attention_info")
    public AttentionInfo g;
    @SerializedName("pop_up_info")
    public Map<String, Object> h;
}
