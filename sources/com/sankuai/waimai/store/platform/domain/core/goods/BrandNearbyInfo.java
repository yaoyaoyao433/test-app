package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BrandNearbyInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("nearby_poi_count")
    public int nearbyPoiCount;
}
