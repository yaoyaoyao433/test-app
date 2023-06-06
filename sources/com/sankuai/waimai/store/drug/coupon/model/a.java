package com.sankuai.waimai.store.drug.coupon.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Serializable {
    @SerializedName("couponActivityId")
    public long a;
    @SerializedName("couponViewId")
    public long b;
    @SerializedName("couponCategory")
    public int c;

    public a(Poi.PoiCouponItem poiCouponItem) {
        if (poiCouponItem != null) {
            this.a = poiCouponItem.mActivityId;
            this.b = poiCouponItem.mCouponId;
        }
    }

    public a() {
    }
}
