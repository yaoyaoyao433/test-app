package com.sankuai.waimai.store.goods.list.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SCRangeEntity implements Serializable {
    public static final int POI_TYPE_SC = 1;
    public static final int POI_TYPE_WM = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("biz_type")
    public int bizType;
    @SerializedName("nearby_poi_num")
    public int nearbyPoiNum;
    @SerializedName("out_of_range")
    public int outOfRange;
    @SerializedName("poi_valid")
    public int poiValid;

    public boolean isOutOfRange() {
        return this.outOfRange == 1;
    }

    public boolean isOffline() {
        return this.poiValid == 0 && this.outOfRange == 0;
    }
}
