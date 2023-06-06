package com.sankuai.waimai.store.search.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.ProductItemEntity;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.statistics.h;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.n;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Map<String, String> b = new HashMap();

    private static Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b38716685208f07d2612b112a7d05208", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b38716685208f07d2612b112a7d05208");
        }
        b.clear();
        return b;
    }

    public static void a(Context context, @Nullable SearchShareData searchShareData, @Nullable BaseProductPoi baseProductPoi, boolean z) {
        int a2;
        Object[] objArr = {context, searchShareData, baseProductPoi, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5f3f1b5cd613cac82ac8de54fee5c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5f3f1b5cd613cac82ac8de54fee5c6c");
        } else if (context == null || searchShareData == null || baseProductPoi == null || baseProductPoi.productInfoItem == null || baseProductPoi.poiInfoItem == null) {
        } else {
            String a3 = g.a(baseProductPoi.productInfoItem);
            HashMap hashMap = new HashMap();
            hashMap.put("recommend", g.a(baseProductPoi, g.b));
            hashMap.put("recommend_text", g.b(baseProductPoi, g.c));
            hashMap.put("keyword", searchShareData.h);
            hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
            hashMap.put("poi_id", Long.valueOf(baseProductPoi.poiInfoItem.b));
            hashMap.put("spu_id", Long.valueOf(baseProductPoi.productInfoItem.c));
            hashMap.put("template_type", Integer.valueOf(searchShareData.aK));
            hashMap.put("index", Integer.valueOf(baseProductPoi.getStatisticsIndex()));
            hashMap.put("food_recommend_type", a3);
            hashMap.put("activity_type", g.c(baseProductPoi));
            hashMap.put("poi_state", Integer.valueOf(com.sankuai.waimai.store.search.common.util.c.a(baseProductPoi)));
            hashMap.put("is_filter_result", g.b(searchShareData));
            hashMap.put("is_filter_sec_result", g.e(searchShareData));
            hashMap.put("rank_type", Long.valueOf(g.c(searchShareData)));
            hashMap.put("filter_type", g.d(searchShareData));
            hashMap.put("stid", g.f(searchShareData));
            hashMap.put("search_log_id", searchShareData.b(baseProductPoi));
            hashMap.put("match_level", Integer.valueOf(baseProductPoi.productInfoItem.q));
            hashMap.put("food_recommend_short_text", g.a(baseProductPoi));
            hashMap.put("food_recommend_long_text", g.b(baseProductPoi));
            hashMap.put("is_card_spu", Integer.valueOf(baseProductPoi.isCardSpu));
            hashMap.put("outcard_index", Integer.valueOf(baseProductPoi.outCardIndex));
            hashMap.put("incard_index", Integer.valueOf(baseProductPoi.inCardIndex));
            hashMap.put("fold_spuid", Long.valueOf(baseProductPoi.foldSpuId));
            hashMap.put("product_status", Integer.valueOf(baseProductPoi.productInfoItem.A));
            hashMap.put("search_source", Integer.valueOf(searchShareData.aw));
            hashMap.put("search_global_id", searchShareData.r);
            hashMap.put("delivery_time", Integer.valueOf(baseProductPoi.poiInfoItem.m));
            hashMap.put("poi_act_name", -999);
            hashMap.put("spu_act_name", g.a(baseProductPoi.productInfoItem.C));
            hashMap.put("region", Integer.valueOf(baseProductPoi.regionId));
            hashMap.put("ship_type", Integer.valueOf(baseProductPoi.poiInfoItem.A));
            hashMap.put("delivery_fee", baseProductPoi.poiInfoItem.o);
            hashMap.put("distance", baseProductPoi.poiInfoItem.g);
            hashMap.put("shangou_incard_index", Integer.valueOf(baseProductPoi.getInCardIndex()));
            hashMap.put("is_lbs", Integer.valueOf(g.a(baseProductPoi.nonLbsEntity)));
            hashMap.put("food_sales", baseProductPoi.productInfoItem.l);
            hashMap.put("current_price", Double.valueOf(baseProductPoi.productInfoItem.F != null ? baseProductPoi.productInfoItem.F.getHandActivityPrice() : 0.0d));
            if (t.a(g.a(baseProductPoi.productInfoItem.F))) {
                a2 = -999;
            } else {
                a2 = g.a(baseProductPoi.productInfoItem.F);
            }
            hashMap.put("spu_tag", a2);
            if (baseProductPoi.productInfoItem.s != null) {
                hashMap.put("trace_info", baseProductPoi.productInfoItem.s.traceInfo);
            }
            hashMap.put("live_id", baseProductPoi.productInfoItem.I == null ? "-999" : baseProductPoi.productInfoItem.I.liveId);
            hashMap.put("spu_type", a(baseProductPoi));
            hashMap.put("spu_label", Integer.valueOf(baseProductPoi.productInfoItem.M == null ? -999 : baseProductPoi.productInfoItem.M.type));
            hashMap.put("spu_basic", TextUtils.isEmpty(baseProductPoi.productInfoItem.L) ? -999 : baseProductPoi.productInfoItem.L);
            hashMap.put("spu_property", g.a(baseProductPoi.recommendSummary));
            if (baseProductPoi.poiInfoItem.a()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adType", baseProductPoi.poiInfoItem.u);
                    jSONObject.put("adChargeInfo", n.a(baseProductPoi.poiInfoItem.w));
                    hashMap.put("ad", jSONObject.toString());
                } catch (JSONException unused) {
                }
                com.sankuai.waimai.ad.mads.a.a(baseProductPoi.poiInfoItem.u, new b.a("b_waimai_1zu97tjc_mv", baseProductPoi.poiInfoItem.w, 3));
            } else {
                hashMap.put("ad", "");
            }
            hashMap.put("final_price_tag", Integer.valueOf(a(baseProductPoi.productInfoItem.F)));
            com.sankuai.waimai.store.manager.judas.b.b(context, "b_waimai_1zu97tjc_mv").a(hashMap).a();
        }
    }

    public static void a(Context context, @Nullable SearchShareData searchShareData, @Nullable BaseProductPoi baseProductPoi, int i, boolean z) {
        int a2;
        Object[] objArr = {context, searchShareData, baseProductPoi, Integer.valueOf(i), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaa8164f5483c95b081881411c1496c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaa8164f5483c95b081881411c1496c3");
        } else if (context == null || searchShareData == null || baseProductPoi == null || baseProductPoi.productInfoItem == null || baseProductPoi.poiInfoItem == null) {
        } else {
            if (i == 0 || i == 1) {
                String a3 = g.a(baseProductPoi.productInfoItem);
                HashMap hashMap = new HashMap();
                hashMap.put("recommend", g.a(baseProductPoi, g.b));
                hashMap.put("recommend_text", g.b(baseProductPoi, g.c));
                hashMap.put("keyword", searchShareData.h);
                hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
                hashMap.put("poi_id", Long.valueOf(baseProductPoi.poiInfoItem.b));
                hashMap.put("spu_id", Long.valueOf(baseProductPoi.productInfoItem.c));
                hashMap.put("template_type", Integer.valueOf(searchShareData.aK));
                hashMap.put("click_block", Integer.valueOf(i));
                hashMap.put("index", Integer.valueOf(baseProductPoi.getStatisticsIndex()));
                hashMap.put("food_recommend_type", a3);
                hashMap.put("activity_type", g.c(baseProductPoi));
                hashMap.put("poi_state", Integer.valueOf(com.sankuai.waimai.store.search.common.util.c.a(baseProductPoi)));
                hashMap.put("is_filter_result", g.b(searchShareData));
                hashMap.put("is_filter_sec_result", g.e(searchShareData));
                hashMap.put("rank_type", Long.valueOf(g.c(searchShareData)));
                hashMap.put("filter_type", g.d(searchShareData));
                hashMap.put("stid", g.f(searchShareData));
                hashMap.put("search_log_id", searchShareData.b(baseProductPoi));
                hashMap.put("match_level", Integer.valueOf(baseProductPoi.productInfoItem.q));
                hashMap.put("food_recommend_short_text", g.a(baseProductPoi));
                hashMap.put("food_recommend_long_text", g.b(baseProductPoi));
                hashMap.put("is_card_spu", Integer.valueOf(baseProductPoi.isCardSpu));
                hashMap.put("outcard_index", Integer.valueOf(baseProductPoi.outCardIndex));
                hashMap.put("incard_index", Integer.valueOf(baseProductPoi.inCardIndex));
                hashMap.put("fold_spuid", Long.valueOf(baseProductPoi.foldSpuId));
                hashMap.put("product_status", Integer.valueOf(baseProductPoi.productInfoItem.A));
                hashMap.put("search_source", Integer.valueOf(searchShareData.aw));
                hashMap.put("search_global_id", searchShareData.r);
                hashMap.put("delivery_time", Integer.valueOf(baseProductPoi.poiInfoItem.m));
                hashMap.put("poi_act_name", -999);
                hashMap.put("spu_act_name", g.a(baseProductPoi.productInfoItem.C));
                hashMap.put("region", Integer.valueOf(baseProductPoi.regionId));
                hashMap.put("ship_type", Integer.valueOf(baseProductPoi.poiInfoItem.A));
                hashMap.put("delivery_fee", baseProductPoi.poiInfoItem.o);
                hashMap.put("distance", baseProductPoi.poiInfoItem.g);
                hashMap.put("shangou_incard_index", Integer.valueOf(baseProductPoi.getInCardIndex()));
                hashMap.put("is_lbs", Integer.valueOf(g.a(baseProductPoi.nonLbsEntity)));
                hashMap.put("food_sales", baseProductPoi.productInfoItem.l);
                hashMap.put("current_price", Double.valueOf(baseProductPoi.productInfoItem.F != null ? baseProductPoi.productInfoItem.F.getHandActivityPrice() : 0.0d));
                if (t.a(g.a(baseProductPoi.productInfoItem.F))) {
                    a2 = -999;
                } else {
                    a2 = g.a(baseProductPoi.productInfoItem.F);
                }
                hashMap.put("spu_tag", a2);
                if (baseProductPoi.productInfoItem.s != null) {
                    hashMap.put("trace_info", baseProductPoi.productInfoItem.s.traceInfo);
                }
                hashMap.put("live_id", baseProductPoi.productInfoItem.I == null ? "-999" : baseProductPoi.productInfoItem.I.liveId);
                hashMap.put("spu_type", a(baseProductPoi));
                hashMap.put("spu_label", Integer.valueOf(baseProductPoi.productInfoItem.M == null ? -999 : baseProductPoi.productInfoItem.M.type));
                hashMap.put("spu_basic", TextUtils.isEmpty(baseProductPoi.productInfoItem.L) ? -999 : baseProductPoi.productInfoItem.L);
                hashMap.put("spu_property", g.a(baseProductPoi.recommendSummary));
                if (baseProductPoi.poiInfoItem.a()) {
                    JSONObject jSONObject = new JSONObject();
                    Map<String, String> a4 = a();
                    a4.put("click_block", String.valueOf(i));
                    String a5 = com.sankuai.mads.e.a(baseProductPoi.poiInfoItem.w, a4);
                    try {
                        jSONObject.put("adType", baseProductPoi.poiInfoItem.u);
                        jSONObject.put("adChargeInfo", n.a(a5));
                        hashMap.put("ad", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                    com.sankuai.waimai.ad.mads.a.a(baseProductPoi.poiInfoItem.u, new b.a("b_waimai_1zu97tjc_mc", a5, 2));
                } else {
                    hashMap.put("ad", "");
                }
                hashMap.put("final_price_tag", Integer.valueOf(a(baseProductPoi.productInfoItem.F)));
                com.sankuai.waimai.store.manager.judas.b.a(context, "b_waimai_1zu97tjc_mc").a(hashMap).a();
            }
        }
    }

    public static void a(SearchShareData searchShareData, PoiEntity poiEntity) {
        Object[] objArr = {searchShareData, poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa316ac970c5f0f615dd24e67600013f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa316ac970c5f0f615dd24e67600013f");
        } else if (poiEntity == null || !poiEntity.isAd()) {
        } else {
            Map<String, String> a2 = a();
            a2.put("filter", searchShareData == null ? "" : searchShareData.aM);
            com.sankuai.waimai.ad.mads.a.a(poiEntity.adType, new b.a(b(poiEntity), com.sankuai.mads.e.a(poiEntity.chargeInfo, a2), 3));
        }
    }

    public static void b(SearchShareData searchShareData, PoiEntity poiEntity) {
        Object[] objArr = {searchShareData, poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6830bd87538ecfd7094077e4ba3f9121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6830bd87538ecfd7094077e4ba3f9121");
        } else if (poiEntity == null || !poiEntity.isAd()) {
        } else {
            Map<String, String> a2 = a();
            a2.put("filter", searchShareData == null ? "" : searchShareData.aM);
            com.sankuai.waimai.ad.mads.a.a(poiEntity.adType, new b.a(c(poiEntity), com.sankuai.mads.e.a(poiEntity.chargeInfo, a2), 2));
        }
    }

    public static void a(SearchShareData searchShareData, PoiEntity poiEntity, ProductItemEntity productItemEntity, int i) {
        Object[] objArr = {searchShareData, poiEntity, productItemEntity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9ff6131e012e0bcf88ab2199248c82b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9ff6131e012e0bcf88ab2199248c82b");
        } else if (poiEntity == null || !poiEntity.isAd()) {
        } else {
            Map<String, String> a2 = a();
            a2.put("filter", searchShareData == null ? "" : searchShareData.aM);
            a2.put("spu_id", String.valueOf(productItemEntity == null ? 0L : productItemEntity.productId));
            a2.put("spu_index", String.valueOf(i));
            com.sankuai.waimai.ad.mads.a.a(poiEntity.adType, new b.a(d(poiEntity), com.sankuai.mads.e.a(poiEntity.chargeInfo, a2), 3));
        }
    }

    public static void b(SearchShareData searchShareData, PoiEntity poiEntity, ProductItemEntity productItemEntity, int i) {
        Object[] objArr = {searchShareData, poiEntity, productItemEntity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7b52fe8e0c47de6a8390e76b03f7ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7b52fe8e0c47de6a8390e76b03f7ae6");
        } else if (poiEntity == null || !poiEntity.isAd()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("filter", searchShareData == null ? "" : searchShareData.aM);
            hashMap.put("spu_id", String.valueOf(productItemEntity == null ? 0 : String.valueOf(productItemEntity.productId)));
            hashMap.put("spu_index", String.valueOf(i));
            com.sankuai.waimai.ad.mads.a.a(poiEntity.adType, new b.a(e(poiEntity), com.sankuai.mads.e.a(poiEntity.chargeInfo, hashMap), 2));
        }
    }

    public static void a(SearchShareData searchShareData, @NonNull PoiEntity poiEntity, @NonNull f fVar) {
        int a2;
        Object[] objArr = {searchShareData, poiEntity, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d95bb64e189c77b923c1e70bd654a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d95bb64e189c77b923c1e70bd654a44");
            return;
        }
        Object[] objArr2 = {searchShareData, poiEntity, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "62225ddc846ebff259dfbc2919825da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "62225ddc846ebff259dfbc2919825da7");
        } else {
            String str = "";
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) poiEntity.discounts)) {
                JSONArray jSONArray = new JSONArray();
                for (com.sankuai.waimai.store.search.model.b bVar : poiEntity.discounts) {
                    if (bVar != null) {
                        jSONArray.put(String.valueOf(bVar.a));
                    }
                }
                str = jSONArray.toString();
            }
            f a3 = poiEntity.nodePoiCate.a();
            a3.b = fVar;
            a3.c = b(poiEntity);
            a3.d = c(poiEntity);
            a3.g = poiEntity.hotfix == null ? null : poiEntity.hotfix.hotfixMap;
            int i = -999;
            f a4 = a3.a("index", Integer.valueOf(h.a(poiEntity))).a("picture_pattern", -999).a("poi_recommend_type", -999).a("product_status", Integer.valueOf(poiEntity.saleOutView == null ? 0 : 1)).a("poi_id", Long.valueOf(poiEntity.id)).a("ship_type", Integer.valueOf(poiEntity.deliveryType)).a("card_type", Integer.valueOf(poiEntity.showType)).a("is_zengbao", Integer.valueOf(poiEntity.insuranceType)).a("poi_act_id", str).a("search_log_id", searchShareData.b(poiEntity)).a("min_total", poiEntity.minPriceTip).a("delivery_fee", poiEntity.shippingFeeTip).a("distance", poiEntity.poiDistance).a("recommend", g.a(poiEntity, g.b)).a("recommend_text", g.b(poiEntity, g.c));
            Object[] objArr3 = {poiEntity};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.util.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "81fb5f074f6ea443473d2af0baa72dc3", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "81fb5f074f6ea443473d2af0baa72dc3")).intValue();
            } else {
                a2 = poiEntity != null ? com.sankuai.waimai.store.search.common.util.c.a(poiEntity.status, poiEntity.getShippingState(), poiEntity.getReservationStatus()) : -1;
            }
            f a5 = a4.a("status", Integer.valueOf(a2)).a("delivery_time", Integer.valueOf(poiEntity.avgDeliveryTime)).a("poi_act_name", g.a(poiEntity.poiTags)).a("spu_act_name", -999).a("region", Integer.valueOf(poiEntity.regionId)).a("shangou_incard_index", Integer.valueOf(poiEntity.getInCardIndex())).a("live_id", poiEntity.getLiveBaseInfo() == null ? "-999" : poiEntity.getLiveBaseInfo().liveId).a("score", Double.valueOf(poiEntity.poiScore)).a("poi_sales", poiEntity.monthSalesTip);
            if (poiEntity.labelOnPoiName != null && poiEntity.labelOnPoiName.type == 1) {
                i = 1;
            }
            a5.a("poi_label", Integer.valueOf(i));
            if (poiEntity.complexFiledFromApi != null) {
                com.sankuai.waimai.store.search.statistics.e.a(poiEntity.complexFiledFromApi);
                f fVar2 = poiEntity.nodePoiCate;
                HashMap<String, Object> hashMap = poiEntity.complexFiledFromApi;
                Object[] objArr4 = {hashMap};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "3feb54e3971bef0570022a274fdf4edb", RobustBitConfig.DEFAULT_VALUE)) {
                    f fVar3 = (f) PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "3feb54e3971bef0570022a274fdf4edb");
                } else if (hashMap != null) {
                    fVar2.f.putAll(hashMap);
                }
            }
        }
        Object[] objArr5 = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "279d1284241e7a4f23da99bbfc9603a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "279d1284241e7a4f23da99bbfc9603a0");
        } else {
            f a6 = poiEntity.nodeSubscribe.a();
            a6.b = poiEntity.nodePoiCate;
            a6.c = "b_waimai_5bz1lkxz_mv";
            a6.d = "b_waimai_5bz1lkxz_mc";
            a6.g = poiEntity.hotfix != null ? poiEntity.hotfix.hotfixMap : null;
            a6.b("status", Integer.valueOf(poiEntity.subscribe));
        }
        a(poiEntity);
    }

    private static void a(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34540a45786935c529792f11d5a070de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34540a45786935c529792f11d5a070de");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) poiEntity.productList);
        for (int i = 0; i < a2; i++) {
            ProductItemEntity productItemEntity = (ProductItemEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) poiEntity.productList, i);
            if (productItemEntity != null) {
                f a3 = productItemEntity.nodeProduct.a();
                a3.b = poiEntity.nodePoiCate;
                a3.c = d(poiEntity);
                a3.d = e(poiEntity);
                a3.e = i;
                a3.g = poiEntity.hotfix == null ? null : poiEntity.hotfix.hotfixMap;
                int i2 = -999;
                f a4 = a3.a("product_status", Integer.valueOf(productItemEntity.productStatus)).a("food_recommend_type", Integer.valueOf(productItemEntity.foodRecommendType)).a("food_recommend_short_text", productItemEntity.productRecommendLabel).a("product_show_type", Integer.valueOf(poiEntity.productShowType)).a("spu_id", Long.valueOf(productItemEntity.productId)).a("activity_type", productItemEntity.promotionInfo).a("poi_index", Integer.valueOf(h.a(poiEntity))).a("index", Integer.valueOf(i)).a("spu_act_name", productItemEntity.productRecommendLabel).a("poi_sales", poiEntity.monthSalesTip).a("food_sales", productItemEntity.monthSaledContent).a("score", Double.valueOf(poiEntity.poiScore)).a("spu_type", productItemEntity.preSale == 1 ? "2" : "-999").a("spu_tag", t.a(g.a(productItemEntity.mHandPriceInfo)) ? -999 : g.a(productItemEntity.mHandPriceInfo));
                if (productItemEntity.mLabelOnPicture != null && productItemEntity.mLabelOnPicture.labelType == 4) {
                    i2 = 1;
                }
                a4.a("spu_label", Integer.valueOf(i2)).a("final_price_tag", Integer.valueOf(a(productItemEntity.mHandPriceInfo)));
            }
        }
    }

    private static String b(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf558e55cd67c213895084fa5e8982ef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf558e55cd67c213895084fa5e8982ef") : poiEntity == null ? "" : poiEntity.isAccurateResult() ? "b_IPU0P" : poiEntity.isRelatedResult() ? "b_ddZz3" : poiEntity.isRecommendResult() ? "b_bzIsD" : "";
    }

    private static String c(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c933c21e3b084ddd645b312cb47e6621", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c933c21e3b084ddd645b312cb47e6621") : poiEntity == null ? "" : poiEntity.isAccurateResult() ? "b_KOXis" : poiEntity.isRelatedResult() ? "b_U41Mv" : poiEntity.isRecommendResult() ? "b_DpKEu" : "";
    }

    private static String d(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3fbf08b585a21de15f82c95e51fa9c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3fbf08b585a21de15f82c95e51fa9c") : poiEntity == null ? "" : poiEntity.isAccurateResult() ? "b_GTOR0" : poiEntity.isRelatedResult() ? "b_HN5XY" : poiEntity.isRecommendResult() ? "b_ZCYtX" : "";
    }

    private static String e(PoiEntity poiEntity) {
        Object[] objArr = {poiEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3854cc87a617607a7f1ae521718769c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3854cc87a617607a7f1ae521718769c") : poiEntity == null ? "" : poiEntity.isAccurateResult() ? "b_IDNii" : poiEntity.isRelatedResult() ? "b_W0kxz" : poiEntity.isRecommendResult() ? "b_HTbEQ" : "";
    }

    private static String a(BaseProductPoi baseProductPoi) {
        boolean z = false;
        Object[] objArr = {baseProductPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c2e499dc5b7a1a43f39e016e111e031", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c2e499dc5b7a1a43f39e016e111e031");
        }
        StringBuilder sb = new StringBuilder();
        if (baseProductPoi.productInfoItem.R != null && baseProductPoi.productInfoItem.R.mPreSaleLabel == 1) {
            z = true;
        }
        if (baseProductPoi.productInfoItem.J != 3 && !z) {
            sb.append("-999,");
        }
        if (baseProductPoi.productInfoItem.J == 3) {
            sb.append("1,");
        }
        if (z) {
            sb.append("2,");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static int a(HandPriceInfo handPriceInfo) {
        Object[] objArr = {handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89c4b57e3cfd6376a18ac445a21d379a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89c4b57e3cfd6376a18ac445a21d379a")).intValue() : (handPriceInfo == null || TextUtils.isEmpty(String.valueOf(i.a(handPriceInfo.handActivityPrice))) || TextUtils.isEmpty(handPriceInfo.handPriceLabel)) ? 0 : 1;
    }

    public static void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a5df66fec2fd316222f7ec9edd2f534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a5df66fec2fd316222f7ec9edd2f534");
        } else if (aVar != null && aVar.f != null && !TextUtils.equals(aVar.j, "sg-scroller")) {
            if (aVar.k() || aVar.l() || aVar.m() || aVar.n()) {
                aVar.f.triggerViewReport(aVar);
            }
            List<com.sankuai.waimai.mach.node.a> b2 = aVar.b();
            int a2 = com.sankuai.shangou.stone.util.a.a((List) b2);
            for (int i = 0; i < a2; i++) {
                a((com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b2, i));
            }
        }
    }
}
