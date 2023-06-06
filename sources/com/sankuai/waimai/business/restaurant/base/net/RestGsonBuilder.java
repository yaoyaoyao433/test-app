package com.sankuai.waimai.business.restaurant.base.net;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.restaurant.base.domain.moneyoff.MoneyOffEntity;
import com.sankuai.waimai.business.restaurant.base.repository.model.PoiInfoResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendWithPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuBaseResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuResponse;
import com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestGsonBuilder extends AbstractGsonBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b11df391258b1c939abb113d694d138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b11df391258b1c939abb113d694d138");
        } else {
            gsonBuilder.registerTypeAdapter(RestMenuResponse.class, new RestMenuResponse.Deserializer()).registerTypeAdapter(PoiInfoResponse.class, new PoiInfoResponse.Deserializer()).registerTypeAdapter(MoneyOffEntity.class, new MoneyOffEntity.Deserializer()).registerTypeAdapter(RecommendPackageFloatResponse.class, new RecommendPackageFloatResponse.Deserializer()).registerTypeAdapter(RecommendWithPackageFloatResponse.class, new RecommendWithPackageFloatResponse.Deserializer()).registerTypeAdapter(Order.class, new Order.Deserializer()).registerTypeAdapter(RestMenuBaseResponse.class, new RestMenuBaseResponse.Deserializer());
        }
    }
}
