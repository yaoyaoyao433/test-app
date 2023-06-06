package com.sankuai.waimai.business.order.api.store.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SCActivityDialogInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("icon_click_url")
    public String clickUrl;
    @SerializedName("log_data")
    public Map<String, Object> logData;
    @SerializedName("share_icon")
    public String shareIcon;
    @SerializedName("stid")
    public String stids;
}
