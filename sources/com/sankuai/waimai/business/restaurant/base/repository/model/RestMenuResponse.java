package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiNotification;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RestMenuResponse implements k {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String _mRanListId;
    public String _mRecommendProduct;
    @SerializedName("app_model")
    public int appModel;
    @SerializedName("friend_status")
    public int friendStatus;
    @SerializedName("has_hotsale_tag")
    public boolean hasHotSaleTag;
    @SerializedName("new_user")
    public boolean isNewUser;
    @SerializedName("is_show_rcmd_pois")
    public boolean isShowRcmdPois;
    @SerializedName("latest_bought")
    public BoughtPoiCategory mBoughtPoiCategory;
    private long mChosenSpuId;
    private boolean mChosenSpuNeedAdd;
    @SerializedName("container_template")
    public PoiContainer mContainerTemplate;
    public Throwable mError;
    @SerializedName("food_spu_tags")
    public List<GoodsPoiCategory> mGoodPoiCategoryList;
    private boolean mHasFindSelectedCategory;
    public boolean mHasVolumeBoard;
    @SerializedName("container_operation_source")
    public OperationPoiCategory mOperationPoiCategory;
    @SerializedName("shopping_cart_entrance")
    public OrderTogetherEntrance mOrderTogetherEntrance;
    @SerializedName("patch_order_button_title")
    public String mPatchOrderButtonTitle;
    @SerializedName("poi_info")
    public Poi mPoi;
    @SerializedName("shopping_cart")
    public PoiShoppingCart mPoiShoppingCart;
    public PoiCategory mSelectPoiCategory;
    @SerializedName("show_food_sort")
    public boolean mShowFoodSort;
    @SerializedName("show_type")
    public int mShowType;
    @SerializedName("poi_banner_ad")
    public PoiBannerAD poiBannerAd;
    @SerializedName("poi_notifications")
    public ArrayList<PoiNotification> poiNotifications;
    @SerializedName("poi_rule_notices")
    public ArrayList<j> poiRuleNotices;
    @SuppressLint({"SerializableCheck"})
    public JSONArray remindArray;
    @SerializedName("required_tag_info")
    public RequiredTagInfo requiredTagInfo;
    @SerializedName("stid")
    public String searchStid;
    @SerializedName("style_template_id")
    public String styleTemplateId;
    @SerializedName("use_dynamic_style")
    public boolean useDynamicStyle;
    @SerializedName("member_template")
    public VipCardResponse vipCardResponse;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class FriendStatus {
        public static final int HAS_FRIEND_COMMENT = 2;
        public static final int NOT_BIND_WX = 1;
        public static final int NOT_LOGIN = 4;
        public static final int NO_FRIEND_COMMENT = 3;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public RestMenuResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a77a16fb81304738d35a6a7cd6022f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a77a16fb81304738d35a6a7cd6022f");
            return;
        }
        this.mChosenSpuId = -1L;
        this.mChosenSpuNeedAdd = false;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public void setChosenSpu(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467d46b26e6094e36143683e73381d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467d46b26e6094e36143683e73381d4e");
            return;
        }
        this.mChosenSpuId = j;
        this.mChosenSpuNeedAdd = z;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public long getChosenSpuId() {
        return this.mChosenSpuId;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public boolean getChosenSpuNeedAdd() {
        return this.mChosenSpuNeedAdd;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public String getPoiIdStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f5aecbc38d28b5d96299b7de662cbf2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f5aecbc38d28b5d96299b7de662cbf2") : this.mPoi.getPoiIDStr();
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public PoiCategory getSelectPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "073e1e8a29d1594df78238ac1bed7088", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "073e1e8a29d1594df78238ac1bed7088");
        }
        if (!this.mHasFindSelectedCategory) {
            this.mSelectPoiCategory = findSelectedCategory();
            this.mHasFindSelectedCategory = true;
        }
        return this.mSelectPoiCategory;
    }

    private PoiCategory findSelectedCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1400308bc96b25ecaae7bcd7633e7351", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1400308bc96b25ecaae7bcd7633e7351");
        }
        if (com.sankuai.waimai.foundation.utils.b.a(this.mGoodPoiCategoryList)) {
            for (GoodsPoiCategory goodsPoiCategory : this.mGoodPoiCategoryList) {
                if (goodsPoiCategory.isSelected()) {
                    if (com.sankuai.waimai.foundation.utils.b.a(goodsPoiCategory.childGoodPoiCategory)) {
                        Iterator<GoodsPoiCategory> it = goodsPoiCategory.childGoodPoiCategory.iterator();
                        while (it.hasNext()) {
                            GoodsPoiCategory next = it.next();
                            if (next.isSelected()) {
                                return next;
                            }
                        }
                    }
                    return goodsPoiCategory;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public int getTemplateType() {
        if (this.mContainerTemplate == null) {
            return 0;
        }
        return this.mContainerTemplate.code;
    }

    public void setTemplateType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b4761d8a6d6059cc8bde063e82c4563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b4761d8a6d6059cc8bde063e82c4563");
        } else if (this.mContainerTemplate == null || this.mPoi == null) {
        } else {
            this.mContainerTemplate.code = i;
            this.mPoi.setTemplateType(i);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public boolean hasVolumeBoard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5af79cbe521d5bf4909c358f9e787f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5af79cbe521d5bf4909c358f9e787f5")).booleanValue();
        }
        if ((this.mSelectPoiCategory instanceof GoodsPoiCategory) && ((GoodsPoiCategory) this.mSelectPoiCategory).type == 3) {
            this.mHasVolumeBoard = true;
        }
        return this.mHasVolumeBoard;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public int getCategoryShowType() {
        return this.mShowType;
    }

    @NonNull
    public static RestMenuResponse fromJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList<j> arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d82ea156be5a4d95b7b41874860d80b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestMenuResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d82ea156be5a4d95b7b41874860d80b5");
        }
        RestMenuResponse restMenuResponse = new RestMenuResponse();
        restMenuResponse.useDynamicStyle = jSONObject.optBoolean("use_dynamic_style", false);
        restMenuResponse.styleTemplateId = jSONObject.optString("style_template_id", "");
        parsePoiContainer(jSONObject, restMenuResponse);
        parsePoiShoppingCart(jSONObject, restMenuResponse);
        parseBoughtPoiCategory(jSONObject, restMenuResponse);
        parseOperationPoiCategory(jSONObject, restMenuResponse);
        parseGoodPoiCategoryList(jSONObject, restMenuResponse);
        parsePoiInfo(jSONObject, restMenuResponse);
        parseVipCardResponse(jSONObject, restMenuResponse);
        parseRequiredTagInfo(jSONObject, restMenuResponse);
        parseMerchantsInfo(jSONObject, restMenuResponse);
        restMenuResponse.friendStatus = jSONObject.optInt("friend_status");
        restMenuResponse.isShowRcmdPois = jSONObject.optBoolean("is_show_rcmd_pois");
        restMenuResponse.hasHotSaleTag = jSONObject.optBoolean("has_hotsale_tag");
        restMenuResponse.searchStid = jSONObject.optString("stid");
        restMenuResponse.isNewUser = jSONObject.optBoolean("new_user");
        OrderTogetherEntrance orderTogetherEntrance = new OrderTogetherEntrance();
        orderTogetherEntrance.parseJson(jSONObject.optJSONObject("shopping_cart_entrance"));
        restMenuResponse.mOrderTogetherEntrance = orderTogetherEntrance;
        JSONArray optJSONArray = jSONObject.optJSONArray("poi_notifications");
        restMenuResponse.poiNotifications = optJSONArray == null ? null : PoiNotification.parseList(optJSONArray.toString());
        JSONArray optJSONArray2 = jSONObject.optJSONArray("poi_rule_notices");
        if (optJSONArray2 != null) {
            String jSONArray = optJSONArray2.toString();
            Object[] objArr2 = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1dbba37b40458d6df103ecb99cf7eb07", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1dbba37b40458d6df103ecb99cf7eb07");
            } else if (jSONArray != null) {
                arrayList = (ArrayList) new Gson().fromJson(jSONArray, new TypeToken<ArrayList<j>>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.model.j.1
                }.getType());
            }
        }
        restMenuResponse.poiRuleNotices = arrayList;
        restMenuResponse.mPatchOrderButtonTitle = jSONObject.optString("patch_order_button_title");
        restMenuResponse.mShowType = jSONObject.optInt("show_type");
        restMenuResponse.appModel = jSONObject.optInt("app_model");
        return restMenuResponse;
    }

    private static void parseRequiredTagInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f9731a702ade5ab1fc0e0a38bb3f01a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f9731a702ade5ab1fc0e0a38bb3f01a");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("required_tag_info");
        if (optJSONObject != null) {
            RequiredTagInfo requiredTagInfo = new RequiredTagInfo();
            requiredTagInfo.parseJson(optJSONObject);
            restMenuResponse.requiredTagInfo = requiredTagInfo;
        }
    }

    private static void parsePoiContainer(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a42d510beab9abd9f080bb18bc9c7d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a42d510beab9abd9f080bb18bc9c7d4c");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("container_template");
        if (optJSONObject != null) {
            PoiContainer poiContainer = new PoiContainer();
            poiContainer.parseJson(optJSONObject);
            restMenuResponse.mContainerTemplate = poiContainer;
        }
    }

    private static void parsePoiShoppingCart(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b176c5a1a658ffa54dbd0312f8c33c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b176c5a1a658ffa54dbd0312f8c33c5");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("shopping_cart");
        if (optJSONObject != null) {
            PoiShoppingCart poiShoppingCart = new PoiShoppingCart();
            poiShoppingCart.parseJson(optJSONObject);
            restMenuResponse.mPoiShoppingCart = poiShoppingCart;
        }
    }

    private static void parsePoiInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e96c4a7796039aa1a25642ea8333a8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e96c4a7796039aa1a25642ea8333a8c");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("poi_info");
        if (optJSONObject != null) {
            Poi poi = new Poi();
            poi.parseJsonToPoi(optJSONObject);
            if (restMenuResponse.mPoiShoppingCart != null) {
                poi.setCartIcon(restMenuResponse.mPoiShoppingCart.cartIcon);
                poi.setShippingFeeCartTip(restMenuResponse.mPoiShoppingCart.shippingFeeCartTip);
                poi.setSelfDeliveryTip(restMenuResponse.mPoiShoppingCart.selfDeliveryTip);
                poi.setNewFunctionTips(restMenuResponse.mPoiShoppingCart.newFunctionTips);
                poi.setActivityInfo(restMenuResponse.mPoiShoppingCart.activityInfo);
                poi.setActivityInfoList(restMenuResponse.mPoiShoppingCart.activityInfos);
                poi.setShopCartBgColor(restMenuResponse.mPoiShoppingCart.bgColor);
                poi.setPromptText(restMenuResponse.mPoiShoppingCart.promptText);
                poi.setPoiShoppingCart(restMenuResponse.mPoiShoppingCart);
            }
            restMenuResponse.mPoi = poi;
            if (restMenuResponse.mContainerTemplate != null) {
                restMenuResponse.mPoi.setTemplateType(restMenuResponse.mContainerTemplate.code);
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("remind_infos");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            restMenuResponse.remindArray = optJSONArray;
        }
    }

    private static void parseBoughtPoiCategory(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d55447a2e2f7c671ec63963f44093001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d55447a2e2f7c671ec63963f44093001");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("latest_bought");
        if (optJSONObject != null) {
            BoughtPoiCategory boughtPoiCategory = new BoughtPoiCategory();
            boughtPoiCategory.parseJson(optJSONObject);
            restMenuResponse.mBoughtPoiCategory = boughtPoiCategory;
        }
    }

    private static void parseMerchantsInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69cbcb4633453203c9589b586216efa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69cbcb4633453203c9589b586216efa8");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("poi_banner_ad");
        if (optJSONObject != null) {
            PoiBannerAD poiBannerAD = new PoiBannerAD();
            poiBannerAD.parseJson(optJSONObject);
            restMenuResponse.poiBannerAd = poiBannerAD;
        }
    }

    private static void parseOperationPoiCategory(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54e7024aa49d4cf8313b6c6224ac7b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54e7024aa49d4cf8313b6c6224ac7b51");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("container_operation_source");
        if (optJSONObject != null) {
            OperationPoiCategory operationPoiCategory = new OperationPoiCategory();
            operationPoiCategory.parseJson(optJSONObject);
            restMenuResponse.mOperationPoiCategory = operationPoiCategory;
        }
    }

    private static void parseGoodPoiCategoryList(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6026c9c263682ae777c3d882039e5f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6026c9c263682ae777c3d882039e5f8");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("food_spu_tags");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        GoodsPoiCategory goodsPoiCategory = null;
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            GoodsPoiCategory goodsPoiCategory2 = new GoodsPoiCategory();
            if (goodsPoiCategory2.type == 3) {
                restMenuResponse.mHasVolumeBoard = true;
                if (i != 0) {
                    goodsPoiCategory = goodsPoiCategory2;
                }
            }
            goodsPoiCategory2.parseJson(optJSONObject, restMenuResponse.useDynamicStyle);
            arrayList.add(goodsPoiCategory2);
            if (goodsPoiCategory2.isSelected()) {
                restMenuResponse.mSelectPoiCategory = null;
                ArrayList<GoodsPoiCategory> arrayList2 = goodsPoiCategory2.childGoodPoiCategory;
                if (arrayList2 != null) {
                    for (GoodsPoiCategory goodsPoiCategory3 : arrayList2) {
                        if (goodsPoiCategory3 != null && goodsPoiCategory3.isSelected()) {
                            restMenuResponse.mSelectPoiCategory = goodsPoiCategory3;
                        }
                    }
                }
                if (restMenuResponse.mSelectPoiCategory == null) {
                    restMenuResponse.mSelectPoiCategory = goodsPoiCategory2;
                }
            }
        }
        if (goodsPoiCategory != null) {
            arrayList.remove(goodsPoiCategory);
            arrayList.add(0, goodsPoiCategory);
        }
        restMenuResponse.mGoodPoiCategoryList = arrayList;
    }

    private static void parseVipCardResponse(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f13e8227dcd6542954d2453034ed6e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f13e8227dcd6542954d2453034ed6e18");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("member_template");
        if (optJSONObject != null) {
            VipCardResponse vipCardResponse = new VipCardResponse();
            vipCardResponse.parseJson(optJSONObject);
            restMenuResponse.vipCardResponse = vipCardResponse;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<RestMenuResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RestMenuResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1183b5819bda46551e9025f343421975", RobustBitConfig.DEFAULT_VALUE)) {
                return (RestMenuResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1183b5819bda46551e9025f343421975");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return RestMenuResponse.fromJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public PoiContainer getmContainerTemplate() {
        return this.mContainerTemplate;
    }

    public void setmContainerTemplate(PoiContainer poiContainer) {
        this.mContainerTemplate = poiContainer;
    }

    public PoiShoppingCart getmPoiShoppingCart() {
        return this.mPoiShoppingCart;
    }

    public void setmPoiShoppingCart(PoiShoppingCart poiShoppingCart) {
        this.mPoiShoppingCart = poiShoppingCart;
    }

    public void setmPoi(Poi poi) {
        this.mPoi = poi;
    }

    public BoughtPoiCategory getmBoughtPoiCategory() {
        return this.mBoughtPoiCategory;
    }

    public void setmBoughtPoiCategory(BoughtPoiCategory boughtPoiCategory) {
        this.mBoughtPoiCategory = boughtPoiCategory;
    }

    public OperationPoiCategory getmOperationPoiCategory() {
        return this.mOperationPoiCategory;
    }

    public void setmOperationPoiCategory(OperationPoiCategory operationPoiCategory) {
        this.mOperationPoiCategory = operationPoiCategory;
    }

    public List<GoodsPoiCategory> getmGoodPoiCategoryList() {
        return this.mGoodPoiCategoryList;
    }

    public void setmGoodPoiCategoryList(List<GoodsPoiCategory> list) {
        this.mGoodPoiCategoryList = list;
    }

    public void setFriendStatus(int i) {
        this.friendStatus = i;
    }

    public void setRemindArray(JSONArray jSONArray) {
        this.remindArray = jSONArray;
    }

    public void setPoiNotifications(ArrayList<PoiNotification> arrayList) {
        this.poiNotifications = arrayList;
    }

    public OrderTogetherEntrance getmOrderTogetherEntrance() {
        return this.mOrderTogetherEntrance;
    }

    public void setmOrderTogetherEntrance(OrderTogetherEntrance orderTogetherEntrance) {
        this.mOrderTogetherEntrance = orderTogetherEntrance;
    }

    public void setHasHotSaleTag() {
        this.hasHotSaleTag = this.hasHotSaleTag;
    }

    public boolean getHasHotSaleTag() {
        return this.hasHotSaleTag;
    }

    public boolean isDynamicCard() {
        return this.useDynamicStyle;
    }

    public String getDynamicId() {
        return this.styleTemplateId;
    }

    public PoiBannerAD getPoiBannerAD() {
        return this.poiBannerAd;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public OperationPoiCategory getOperationPoiCategory() {
        return this.mOperationPoiCategory;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public BoughtPoiCategory getBoughtPoiCategory() {
        return this.mBoughtPoiCategory;
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.model.IMarketResponse
    public List<GoodsPoiCategory> getGoodsPoiCategories() {
        return this.mGoodPoiCategoryList;
    }

    public ShareTip getPoiShareTip() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acefd2eb8faad7ca2fa294f5a70895a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareTip) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acefd2eb8faad7ca2fa294f5a70895a0");
        }
        if (this.mPoi == null) {
            return null;
        }
        return this.mPoi.getShareTip();
    }

    public int getPoiState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "390aa325cabb553fe8245de1c30d5a58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "390aa325cabb553fe8245de1c30d5a58")).intValue();
        }
        if (this.mPoi == null) {
            return 3;
        }
        return this.mPoi.getState();
    }

    public Poi getPoi() {
        return this.mPoi;
    }

    public List<PoiNotification> getPoiNotifications() {
        return this.poiNotifications;
    }

    public JSONArray getRemindArray() {
        return this.remindArray;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PoiContainer implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public int code;
        @SerializedName("actual_use_dynamic")
        public boolean isDynamic;
        @SerializedName("is_page")
        public boolean isPage;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92bc784e0b5db97b6d64d5d6063e696f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92bc784e0b5db97b6d64d5d6063e696f");
                return;
            }
            this.code = jSONObject.optInt("code");
            this.isPage = jSONObject.optBoolean("is_page");
            this.isDynamic = jSONObject.optBoolean("actual_use_dynamic", false);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PoiDeserializer implements JsonDeserializer<Poi> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public Poi deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226a2d4dcffe7b90b05df4184f359ac3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226a2d4dcffe7b90b05df4184f359ac3");
            }
            if (jsonElement.isJsonObject()) {
                Poi poi = new Poi();
                try {
                    poi.parseJsonToPoi(new JSONObject(jsonElement.toString()));
                    return poi;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
