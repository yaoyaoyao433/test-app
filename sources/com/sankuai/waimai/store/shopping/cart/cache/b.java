package com.sankuai.waimai.store.shopping.cart.cache;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull PoiShoppingCartAndPoi poiShoppingCartAndPoi) {
        Object[] objArr = {poiShoppingCartAndPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1b3fe39983f05c78781a0f6324fac19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1b3fe39983f05c78781a0f6324fac19");
            return;
        }
        HashMap hashMap = new HashMap(8);
        PoiShoppingCart poiShoppingCart = poiShoppingCartAndPoi.poiShoppingCart;
        Poi poi = poiShoppingCartAndPoi.poi;
        if (poi == null || poiShoppingCart == null) {
            return;
        }
        hashMap.put("cart_extend_info", poi.cartExtendInfo);
        hashMap.put("cart_type", Integer.valueOf(poiShoppingCart.cartType));
        hashMap.put("prompt_stripe_type", Integer.valueOf(poiShoppingCart.cartTipType));
        hashMap.put("cart_exp", Integer.valueOf(poiShoppingCart.cartExp));
        hashMap.put("cart_im_scheme", poiShoppingCart.imSmartSchema);
        hashMap.put("product_mark_info", a(poiShoppingCart, poi));
        hashMap.put("pre_order_title_default", poiShoppingCart.preOrderBtnTxt);
        com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), hashMap);
    }

    public static void a(@NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "560261c4934dd32d54be3e89bd3dc761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "560261c4934dd32d54be3e89bd3dc761");
            return;
        }
        PoiShoppingCart poiShoppingCart = restMenuResponse.mPoiShoppingCart;
        Poi poi = restMenuResponse.mPoi;
        if (poi == null) {
            return;
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put("cart_extend_info", poi.cartExtendInfo);
        if (poiShoppingCart != null) {
            hashMap.put("cart_type", Integer.valueOf(poiShoppingCart.cartType));
            hashMap.put("prompt_stripe_type", Integer.valueOf(poiShoppingCart.cartTipType));
            hashMap.put("cart_exp", Integer.valueOf(poiShoppingCart.cartExp));
            hashMap.put("cart_im_scheme", poiShoppingCart.imSmartSchema);
            hashMap.put("product_mark_info", a(poiShoppingCart, poi));
            hashMap.put("pre_order_title_default", poiShoppingCart.preOrderBtnTxt);
        }
        com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), hashMap);
    }

    @NonNull
    private static Map<String, Object> a(@NonNull PoiShoppingCart poiShoppingCart, @NonNull Poi poi) {
        Object[] objArr = {poiShoppingCart, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eff81bb9c30e5ed0cdb21da1432c87cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eff81bb9c30e5ed0cdb21da1432c87cd");
        }
        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        String officialPoiId = poi.getOfficialPoiId();
        Object[] objArr2 = {"product_mark_info", officialPoiId};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.a.a;
        Map<String, Object> map = (Map) p.a(PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "4c4c85307acc61fdeb640d246ebdc694", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "4c4c85307acc61fdeb640d246ebdc694") : e.k(officialPoiId).e.a("product_mark_info"), Map.class);
        if (map == null) {
            map = new HashMap<>(8);
        }
        if (com.sankuai.waimai.foundation.utils.b.a(poiShoppingCart.mProductMarkInfoList)) {
            for (PoiShoppingCart.ProductMarkInfo productMarkInfo : poiShoppingCart.mProductMarkInfoList) {
                if (productMarkInfo != null && productMarkInfo.skuId != 0 && !aa.a(productMarkInfo.productInfo)) {
                    map.put(Long.toString(productMarkInfo.skuId), productMarkInfo.productInfo);
                }
            }
        }
        return map;
    }
}
