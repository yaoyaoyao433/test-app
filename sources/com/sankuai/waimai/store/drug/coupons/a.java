package com.sankuai.waimai.store.drug.coupons;

import com.sankuai.waimai.store.platform.domain.core.poi.ActivityItem;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.CouponPoiCardInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    com.sankuai.waimai.store.platform.domain.manager.poi.a a();

    void a(Poi.PoiCouponEntity poiCouponEntity, long j, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, List<ActivityItem> list, int i, boolean z, CouponPoiCardInfo couponPoiCardInfo, Poi.FriendAssistance friendAssistance, int i2, Poi.PoiCouponItem poiCouponItem);

    String b();
}
