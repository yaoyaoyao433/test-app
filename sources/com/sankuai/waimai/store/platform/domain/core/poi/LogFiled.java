package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LogFiled implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("average_delivery_time")
    public int averageDeliveryTime;
    @SerializedName("individual_type")
    public int individualType;
    @SerializedName("poi_type_icon_type")
    public int poiTypeIconType;
    @SerializedName("recommend_type")
    public int recommendType;
}
