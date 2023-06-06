package com.sankuai.waimai.business.restaurant.base.util;

import com.google.gson.Gson;
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
import com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs;
import com.sankuai.waimai.business.restaurant.poicontainer.goodslist.MenuBean;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Gson b;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfa2aae050d68cfe92772f88dc7feea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfa2aae050d68cfe92772f88dc7feea7");
        }
        if (b == null) {
            b = new GsonBuilder().registerTypeAdapter(RestMenuResponse.class, new RestMenuResponse.Deserializer()).registerTypeAdapter(PoiInfoResponse.class, new PoiInfoResponse.Deserializer()).registerTypeAdapter(MoneyOffEntity.class, new MoneyOffEntity.Deserializer()).registerTypeAdapter(RecommendPackageFloatResponse.class, new RecommendPackageFloatResponse.Deserializer()).registerTypeAdapter(RecommendWithPackageFloatResponse.class, new RecommendWithPackageFloatResponse.Deserializer()).registerTypeAdapter(Order.class, new Order.Deserializer()).registerTypeAdapter(MenuBean.class, new MenuBean.Deserializer()).registerTypeAdapter(RestMenuBaseResponse.class, new RestMenuBaseResponse.Deserializer()).registerTypeAdapter(PoiShoppingCart.class, new PoiShoppingCart.Deserializer()).registerTypeAdapter(Poi.class, new RestMenuResponse.PoiDeserializer()).registerTypeAdapter(GoodsSpuAttrs.class, new GoodsSpuAttrs.Deserializer()).create();
        }
        return b;
    }
}
