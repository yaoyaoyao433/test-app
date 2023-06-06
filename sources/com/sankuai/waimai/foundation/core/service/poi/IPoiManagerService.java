package com.sankuai.waimai.foundation.core.service.poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IPoiManagerService {
    public static final String KEY = "IPoiManagerService";

    void locateGoodsFromShopCart(String str, String str2, long j);

    void registerPoiShopObserver(b bVar);

    void unregisterPoiShopObserver(b bVar);

    void updatePoiShop(String str);
}
