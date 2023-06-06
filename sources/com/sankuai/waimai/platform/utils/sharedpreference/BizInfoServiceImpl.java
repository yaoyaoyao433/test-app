package com.sankuai.waimai.platform.utils.sharedpreference;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService;
import com.sankuai.waimai.foundation.utils.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BizInfoServiceImpl implements IBizInfoService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
    public String getPoiAdIconUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78dafd7d7c735bad5bc7ff0cf79cc7be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78dafd7d7c735bad5bc7ff0cf79cc7be") : a.a().b((e) PlatformSPKeys.key_poi_ad_icon_url, "");
    }

    @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
    public double getMinPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d347cd3b7decf4d22e3703925eb3150", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d347cd3b7decf4d22e3703925eb3150")).doubleValue() : a.a().b((e) PlatformSPKeys.food_collect_poi_min_price, d);
    }

    @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
    public double getMinPriceRate(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1dd77c3c1900a30a06171673d0e0385", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1dd77c3c1900a30a06171673d0e0385")).doubleValue() : a.a().b((e) PlatformSPKeys.food_collect_order_min_price_rate, d);
    }
}
