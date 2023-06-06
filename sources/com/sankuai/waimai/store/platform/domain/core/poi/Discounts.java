package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Discounts implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_id")
    public int activityId;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("info")
    public String info;
    @SerializedName("promotion_type")
    public int promotionType;
}
