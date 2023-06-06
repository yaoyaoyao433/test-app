package com.sankuai.waimai.business.restaurant.poicontainer.pga;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.i;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.g;
import com.sankuai.waimai.foundation.core.utils.e;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.Product;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RestaurantSchemeParams {
    private static final int EXTRA_SOURCE_TYPE_CONTENT = 2;
    private static final int EXTRA_SOURCE_TYPE_SEARCH = 1;
    private static final int STYLE_BRAND = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static int seckillTag;
    public String adChannelId;
    public String adSlotId;
    public Map<String, Object> adSource;
    public String anchorTagId;
    public String clickId;
    public String content_info;
    public String errorMsg;
    public int extraSourcePageType;
    public List<OrderedFood> foodList;
    public String healthFoodQueryWord;
    public boolean isNotificationShow;
    public String linkIdentifierInfo;
    public String mAdActivityFlag;
    public String mAllowanceAllianceScenes;
    public String mBusinessScene;
    public int mBusinessType;
    public com.sankuai.waimai.platform.domain.core.channel.a mChannelLabelMessage;
    public long mChosenSpuId;
    public boolean mChosenSpuNeedAdd;
    public String mFrom;
    public String mGroupChatShare;
    public boolean mIsNeedCartSync;
    public boolean mIsSelfDelivery;
    public boolean mNeedOpenShopCart;
    public Poi mPoi;
    public long mPoiId;
    public String mPoiIdStr;
    public String mRanListId;
    public String mRecommendProduct;
    public i mSearchParams;
    public String miniStoreFrom;
    public String multiSpuAdd;
    public String orderAgainFoodList;
    public long postSpuId;
    public String previewItemStr;
    public int previewProcessResponseCode;
    public String requestMark;
    public String resourceId;
    public int showHealthFood;
    public boolean showPoiBulletin;
    public long skuId;
    public int soldOutFlag;
    public String spuTagId;
    public String unFoodListArray;
    public String unpl;

    public RestaurantSchemeParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "313dbb4b50265353dc797f6d92e5b60c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "313dbb4b50265353dc797f6d92e5b60c");
            return;
        }
        this.mPoiId = -1L;
        this.mPoiIdStr = "";
        this.mIsSelfDelivery = false;
        this.mChosenSpuId = -1L;
        this.postSpuId = -1L;
        this.mChosenSpuNeedAdd = false;
        this.mSearchParams = new i();
        this.showPoiBulletin = false;
        this.previewProcessResponseCode = -1;
    }

    public static RestaurantSchemeParams readIntentData(@NonNull Intent intent, RestaurantSchemeParams restaurantSchemeParams) {
        boolean z = true;
        Object[] objArr = {intent, restaurantSchemeParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16e024351d2a00c56d368ff2fc58115d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestaurantSchemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16e024351d2a00c56d368ff2fc58115d");
        }
        if (restaurantSchemeParams == null) {
            restaurantSchemeParams = new RestaurantSchemeParams();
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestaurantDelegateImpl#readIntentData", new Object[0]);
        restaurantSchemeParams.mPoiId = g.a(intent, "restaurant_id", "poiId", restaurantSchemeParams.mPoiId);
        String a = g.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR, FoodDetailNetWorkPreLoader.URI_POI_STR, restaurantSchemeParams.mPoiIdStr);
        if (!TextUtils.isEmpty(a)) {
            restaurantSchemeParams.mPoiIdStr = a;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NetLogConstants.Details.SCHEME, intent.getData());
                if (intent.getExtras() != null && intent.getExtras().get("router_page_from") != null) {
                    jSONObject.put("jumpFrom", intent.getExtras().get("router_page_from"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("SchemeError").b("poi_id_str_null").c(jSONObject.toString()).b());
        }
        boolean a2 = g.a(intent, "extra_is_self_delivery", "extra_is_self_delivery", false);
        restaurantSchemeParams.spuTagId = g.a(intent, "sputag_id", "sputag_id", "");
        restaurantSchemeParams.anchorTagId = g.a(intent, "anchor_tag_id", "anchor_tag_id", "");
        int a3 = g.a(intent, "business_type", "business_type", 0);
        if (a3 == -1) {
            a3 = 0;
        }
        restaurantSchemeParams.mBusinessType = a3;
        if (!a2 && a3 == 1) {
            a2 = true;
        }
        restaurantSchemeParams.mIsSelfDelivery = a2;
        restaurantSchemeParams.mAllowanceAllianceScenes = g.a(intent, "allowance_alliance_scenes", "allowance_alliance_scenes", "");
        restaurantSchemeParams.mAdActivityFlag = g.a(intent, "ad_activity_flag", "ad_activity_flag", "");
        readPoiFromIntent(intent, new Poi(), restaurantSchemeParams);
        restaurantSchemeParams.foodList = (List) f.a(intent, "food_list", (Serializable) null);
        restaurantSchemeParams.unFoodListArray = f.a(intent, "unavailable_food_list");
        restaurantSchemeParams.orderAgainFoodList = f.a(intent, "order_again");
        restaurantSchemeParams.mChosenSpuId = g.a(intent, "spu_id", "foodId", -1L);
        restaurantSchemeParams.postSpuId = restaurantSchemeParams.mChosenSpuId;
        restaurantSchemeParams.mChosenSpuNeedAdd = g.a(intent, "need_add", "need_add", 0) == 1;
        restaurantSchemeParams.mNeedOpenShopCart = g.a(intent, "isopenshopcart", "isopenshopcart", false);
        restaurantSchemeParams.miniStoreFrom = g.a(intent, "from_mini_app", "from_mini_app", "");
        restaurantSchemeParams.unpl = g.a(intent, "unpl", "unpl", "");
        restaurantSchemeParams.mChannelLabelMessage = com.sankuai.waimai.platform.domain.core.channel.a.a(com.sankuai.waimai.foundation.router.a.a(intent, "ch_ad_params", ""));
        restaurantSchemeParams.mFrom = f.a(intent, "from", "");
        restaurantSchemeParams.extraSourcePageType = g.a(intent, "source_page_type", "extra_source_page_type", 0);
        int a4 = g.a(intent, "code", "code", 0);
        if (a4 <= 0) {
            a4 = restaurantSchemeParams.extraSourcePageType;
        }
        restaurantSchemeParams.extraSourcePageType = a4;
        restaurantSchemeParams.content_info = g.a(intent, "content_info", "content_info", "");
        restaurantSchemeParams.mGroupChatShare = g.a(intent, "group_chat_share", "group_chat_share", "");
        int a5 = g.a(intent, "seckill_tag", "seckill_tag", 0);
        if (a5 == 0) {
            a5 = getSecKillTag(a);
        }
        seckillTag = a5;
        long a6 = g.a(intent, "sku_id", 0L);
        restaurantSchemeParams.skuId = a6;
        restaurantSchemeParams.requestMark = getRequestMark(a5, a6);
        processRecommendParams(intent, restaurantSchemeParams);
        processSearchParams(intent, restaurantSchemeParams);
        restaurantSchemeParams.isNotificationShow = f.a(intent, "is_NotificationWindow_show", true);
        restaurantSchemeParams.errorMsg = f.a(intent, "errormsg", "");
        restaurantSchemeParams.showPoiBulletin = f.a(intent, "showBulletin", false);
        restaurantSchemeParams.mBusinessScene = g.a(intent, "biz_scene", "biz_scene", "");
        restaurantSchemeParams.mIsNeedCartSync = (com.sankuai.waimai.foundation.core.a.e() && g.a(intent, "page_from_external", "page_from_external", false)) ? false : false;
        restaurantSchemeParams.soldOutFlag = g.a(intent, "sold_out_flag", "sold_out_flag", -1);
        restaurantSchemeParams.previewProcessResponseCode = g.a(intent, "window_has_show_reason", "window_has_show_reason", -1);
        restaurantSchemeParams.adSlotId = g.a(intent, "ad_slot", "ad_slot", "");
        restaurantSchemeParams.adChannelId = g.a(intent, "ad_channel", "ad_channel", "");
        restaurantSchemeParams.multiSpuAdd = g.a(intent, "multi_add_list", "multi_add_list", "");
        restaurantSchemeParams.showHealthFood = g.a(intent, "show_health_food", "show_health_food", 0);
        restaurantSchemeParams.healthFoodQueryWord = g.a(intent, "health_food_query_word", "health_food_query_word", "");
        restaurantSchemeParams.clickId = g.a(intent, "click_id", "click_id", "");
        restaurantSchemeParams.resourceId = g.a(intent, "resource_id", "resource_id", "");
        restaurantSchemeParams.previewItemStr = g.a(intent, "preview_item_str", "preview_item_str", "");
        String a7 = e.a(intent);
        if (TextUtils.isEmpty(a7)) {
            a7 = g.a(intent, "linkIdentifierInfo", "linkIdentifierInfo", "");
        }
        if (!TextUtils.isEmpty(a7)) {
            restaurantSchemeParams.linkIdentifierInfo = a7;
            try {
                JSONObject jSONObject2 = new JSONObject(a7).getJSONObject("adSource");
                if (jSONObject2 != null) {
                    restaurantSchemeParams.adSource = JsonUtil.jsonObjectToMap(jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return restaurantSchemeParams;
    }

    private static void readPoiFromIntent(@NonNull Intent intent, @NonNull Poi poi, RestaurantSchemeParams restaurantSchemeParams) {
        Object[] objArr = {intent, poi, restaurantSchemeParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77c8b7e609b92363efa5f19ec6541c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77c8b7e609b92363efa5f19ec6541c47");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestaurantDelegateImpl#readPoiFromIntent", new Object[0]);
        poi.setId(restaurantSchemeParams.mPoiId);
        poi.setPoiIDStr(restaurantSchemeParams.mPoiIdStr);
        poi.setName(g.a(intent, "poiName", "poiName", ""));
        poi.setPicture(g.a(intent, "icon_url", "icon_url", ""));
        poi.setBottomActivities(f.c(intent, "activity_item", new ArrayList()));
        poi.setAllowanceAllianceScenes(restaurantSchemeParams.mAllowanceAllianceScenes);
        poi.setAdActivityFlag(restaurantSchemeParams.mAdActivityFlag);
        poi.isSelfDelivery = restaurantSchemeParams.mIsSelfDelivery;
        restaurantSchemeParams.mPoi = poi;
    }

    private static void processRecommendParams(Intent intent, RestaurantSchemeParams restaurantSchemeParams) {
        Object[] objArr = {intent, restaurantSchemeParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "667c7126c3e87c601412cdb3740b6125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "667c7126c3e87c601412cdb3740b6125");
            return;
        }
        String a = f.a(intent, "extra_restaurant_recommend");
        String a2 = f.a(intent, "ref_list_id");
        ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref", a2);
        String a3 = ListIDHelper.a.a.a();
        if (TextUtils.isEmpty(a)) {
            a = com.sankuai.waimai.foundation.router.a.a(intent, "recommendProduct", "");
        }
        if (!TextUtils.isEmpty(a)) {
            try {
                if (restaurantSchemeParams.extraSourcePageType != 1) {
                    JSONObject jSONObject = new JSONObject(a);
                    insertRankListId(jSONObject, a3, a2);
                    restaurantSchemeParams.mChosenSpuId = getChosenSpuId(jSONObject, restaurantSchemeParams.mChosenSpuId);
                    a = jSONObject.toString();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        restaurantSchemeParams.mRecommendProduct = a;
        restaurantSchemeParams.mRanListId = a3;
    }

    private static void processSearchParams(Intent intent, RestaurantSchemeParams restaurantSchemeParams) {
        Object[] objArr = {intent, restaurantSchemeParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b284ea47b02c8afc5f23b42f1357c7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b284ea47b02c8afc5f23b42f1357c7d");
            return;
        }
        int a = g.a(intent, "recall_type", "recall_type", 0);
        String a2 = g.a(intent, "search_word", "search_word", "");
        String a3 = g.a(intent, "search_log_id", "search_log_id", "");
        restaurantSchemeParams.mSearchParams.a = a;
        restaurantSchemeParams.mSearchParams.b = a2;
        restaurantSchemeParams.mSearchParams.c = a3;
    }

    public static JSONObject insertRankListId(JSONObject jSONObject, String str, String str2) {
        Object[] objArr = {jSONObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d3736b589fb1287abd16557087afbd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d3736b589fb1287abd16557087afbd2");
        }
        try {
            jSONObject.put("rank_list_id", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ref_list_id", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static int getSecKillTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b44912c83c7b5ac8198395a47bb39d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b44912c83c7b5ac8198395a47bb39d1")).intValue();
        }
        List<com.sankuai.waimai.globalcart.model.a> localCartData = GlobalCartManager.getInstance().getLocalCartData();
        if (localCartData != null && localCartData.size() > 0) {
            for (com.sankuai.waimai.globalcart.model.a aVar : localCartData) {
                if (aVar != null && aVar.c.equals(str) && aVar.e.size() > 0) {
                    Iterator<CartProduct> it = aVar.e.iterator();
                    if (it.hasNext()) {
                        return it.next().seckill;
                    }
                }
            }
        }
        return 0;
    }

    public static Set<Long> getPreRequestItemIdSet(Bundle bundle, Uri uri) {
        Object[] objArr = {bundle, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ba7ffbdd0dd7c3ca5832b8dab94d209", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ba7ffbdd0dd7c3ca5832b8dab94d209");
        }
        HashSet hashSet = new HashSet();
        if (bundle == null) {
            return hashSet;
        }
        String str = "";
        if (uri == null || !com.sankuai.waimai.foundation.router.a.a(uri)) {
            str = bundle.getString("multi_add_list");
        } else if (uri != null) {
            String queryParameter = uri.getQueryParameter("multi_add_list");
            if (!TextUtils.isEmpty(queryParameter)) {
                str = queryParameter;
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(Long.valueOf(jSONArray.optJSONObject(i).optLong("id")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String string = bundle.getString("order_again");
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray2 = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    hashSet.add(Long.valueOf(jSONArray2.optJSONObject(i2).optLong("id")));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        List<OrderedFood> list = (List) f.a(bundle, "food_list");
        if (list != null) {
            for (OrderedFood orderedFood : list) {
                hashSet.add(Long.valueOf(orderedFood.getSpuId()));
            }
        }
        ArrayList arrayList = (ArrayList) f.a(bundle, "multi_person_cart");
        if (!com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Product product = (Product) it.next();
                if (product != null) {
                    hashSet.add(Long.valueOf(product.getSpuId()));
                }
            }
        }
        List<Product> list2 = com.sankuai.waimai.business.restaurant.composeorder.a.a().d;
        if (!com.sankuai.waimai.foundation.utils.b.b(list2)) {
            for (Product product2 : list2) {
                if (product2 != null) {
                    hashSet.add(Long.valueOf(product2.getSpuId()));
                }
            }
        }
        return hashSet;
    }

    public static long getChosenSpuId(JSONObject jSONObject, long j) {
        Object[] objArr = {jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22276044e6eb05406588afd30e94269c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22276044e6eb05406588afd30e94269c")).longValue();
        }
        if (jSONObject.optJSONArray("product_list") == null || jSONObject.optJSONArray("product_list").length() <= 1) {
            return j;
        }
        return -1L;
    }

    public static String getRequestMark(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "012c1507f1fa9a8162c6b9521f36b943", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "012c1507f1fa9a8162c6b9521f36b943");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("seckill", i);
            if (j != 0) {
                jSONObject.put("seckillSkuId", j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
