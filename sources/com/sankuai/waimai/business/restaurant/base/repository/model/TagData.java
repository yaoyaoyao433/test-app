package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TagData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("discount_tip")
    public String discountTip;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName("run_status")
    public String runStatus;
    @SerializedName("short_tip")
    public String shortTip;
}
