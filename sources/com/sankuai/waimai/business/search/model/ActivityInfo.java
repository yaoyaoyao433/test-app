package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ActivityInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_price")
    public String activityPrice;
    @SerializedName("activity_price_suffix")
    public String activityPriceSuffix;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("activity_tag_suffix")
    public String activityTagSuffix;
    @SerializedName("activity_type")
    public long activityType;
    @SerializedName("skuId")
    public long skuId;
}
