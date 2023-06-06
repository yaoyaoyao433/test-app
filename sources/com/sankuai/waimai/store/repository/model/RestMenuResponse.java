package com.sankuai.waimai.store.repository.model;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.BoughtPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.OperationPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.util.ae;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RestMenuResponse extends BaseDataResponse implements i {
    private static final String POI_INFO = "poi_info";
    private static final String SHOPPING_CART = "shopping_cart";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ab_exp_info")
    public String abExpInfo;
    @SerializedName("additional_fields")
    public String additionalFields;
    @SerializedName("cdq_info")
    public CdqInfo cdqInfo;
    @SerializedName("extend_info")
    public Map<String, String> extendInfo;
    @SerializedName("extra")
    public String extra;
    @SerializedName("floor_tags")
    public List<GoodsPoiCategory> floorTags;
    @SerializedName("friend_status")
    public int friendStatus;
    @SerializedName("home_page_scheme")
    public String homePageScheme;
    @SerializedName("banner_list")
    public List<PoiOperationItem> mBanners;
    public transient Poi mCartPoi;
    @SerializedName("head_entry_info")
    public CdqEntryInfo mCdqHeadEntryInfo;
    @SerializedName("sidebar_entry_info")
    public CdqEntryInfo mCdqSideEntryInfo;
    private long mChosenSpuId;
    private boolean mChosenSpuNeedAdd;
    @SerializedName("container_template")
    public PoiContainer mContainerTemplate;
    @SerializedName("questions_entrance")
    public List<FeedbackInfo> mFeedbackInfos;
    public int mFoodSpuFloorsSize;
    @SerializedName("food_spu_tags")
    public List<GoodsPoiCategory> mGoodPoiCategoryList;
    private boolean mHasFindSelectedCategory;
    public boolean mHasVolumeBoard;
    @SerializedName("mrn_tab_data")
    public Map<String, Object> mMRNTabData;
    @SerializedName("scBProductTagList")
    public List<NavigateItem> mNavigateItemList;
    @SerializedName("container_operation_source")
    public OperationPoiCategory mOperationPoiCategory;
    @SerializedName(POI_INFO)
    public Poi mPoi;
    @SerializedName("scBSecondProductTagList")
    public List<PoiNavigationSecondCategotyList> mPoiNavigationSecondCategotyList;
    @SerializedName(SHOPPING_CART)
    public PoiShoppingCart mPoiShoppingCart;
    @SerializedName("price_opt_ab")
    public PriceOptAB mPriceOptAB;
    public PoiCategory mSelectPoiCategory;
    @SerializedName("module_list")
    public List<BaseModuleDesc> moduleList;
    @SerializedName("navigation_bars")
    public List<b> navigationBars;
    @SerializedName("need_purchase_recommend")
    public boolean needPurchaseRecommend;
    @SerializedName("new_poi_page")
    public String newPoiPage;
    @SerializedName("out_of_delivery")
    public boolean outOfDelivery;
    @SerializedName("out_of_page_type")
    public int outOfPageType;
    @SerializedName("return_page_scheme")
    public String pageScheme;
    @SerializedName("poi_comment")
    public Poi.PoiComment poiComment;
    @SerializedName("poi_notifications")
    public ArrayList<PoiNotification> poiNotifications;
    public String poiString;
    @SerializedName("poi_tags")
    public a poiTags;
    @SerializedName("questions_type")
    public List<Integer> questionTypeList;
    @SerializedName("receive_coupon_alert")
    public String receiveCouponAlert;
    @SerializedName("receive_coupon_status")
    public int receiveCouponStatus;
    @SerializedName("recommend_food_info")
    public Recommend recommend;
    @SerializedName("recommend_rank_vo")
    public Poi.RecommendRank recommendRank;
    @SuppressLint({"SerializableCheck"})
    public JSONArray remindArray;
    public String shoppingCartString;
    @SerializedName("show_poi_info")
    public boolean showPoiInfo;
    public transient Map<String, Object> srcResponse;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("tag_type")
        public int b;
        @SerializedName("tags")
        public List<NavigateItem> c;
    }

    public RestMenuResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3cbfdd03090a7e59f69f0ee1f3b9d25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3cbfdd03090a7e59f69f0ee1f3b9d25");
            return;
        }
        this.mChosenSpuId = -1L;
        this.mChosenSpuNeedAdd = false;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public void setChosenSpu(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "672fac4c000f51edb30f181c02a99cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "672fac4c000f51edb30f181c02a99cae");
            return;
        }
        this.mChosenSpuId = j;
        this.mChosenSpuNeedAdd = z;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public long getChosenSpuId() {
        return this.mChosenSpuId;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public boolean getChosenSpuNeedAdd() {
        return this.mChosenSpuNeedAdd;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public long getPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb81349eab4b6584a994d19e5a1c3311", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb81349eab4b6584a994d19e5a1c3311")).longValue() : this.mPoi.getLongPoiId();
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public String getOfficialPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f09c38a127ed0e4ed31b6fd6bfa7eb40", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f09c38a127ed0e4ed31b6fd6bfa7eb40") : this.mPoi.getOfficialPoiId();
    }

    @Deprecated
    public long getLongPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "617b97aa42f1feb428f75fc5477a5292", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "617b97aa42f1feb428f75fc5477a5292")).longValue() : this.mPoi.getLongPoiId();
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    @Deprecated
    public String getStringPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00dbd43ad956c8367235e8d347069f09", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00dbd43ad956c8367235e8d347069f09") : this.mPoi.getStringPoiId();
    }

    public boolean is776AnchorStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3f22ac9fccdf3140c7afae12f2b21eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3f22ac9fccdf3140c7afae12f2b21eb")).booleanValue() : (this.mPoi == null || this.mPoi.addition == null || this.mPoi.addition.isShowNewHeader != 1) ? false : true;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public PoiCategory getSelectPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2d8c1236269a97dfb1f89969a7f140c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2d8c1236269a97dfb1f89969a7f140c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f98b9a6d4269020d44bf7675248fdcb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f98b9a6d4269020d44bf7675248fdcb4");
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.mGoodPoiCategoryList)) {
            for (GoodsPoiCategory goodsPoiCategory : this.mGoodPoiCategoryList) {
                if (goodsPoiCategory.isSelected()) {
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.childGoodPoiCategory)) {
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

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public int getTemplateType() {
        if (this.mContainerTemplate == null) {
            return 0;
        }
        return this.mContainerTemplate.code;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public Object getDataSrc() {
        return this.srcResponse;
    }

    @NonNull
    public static RestMenuResponse fromJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e3050f1a3a10c119f01c296c17d2cd2", RobustBitConfig.DEFAULT_VALUE) ? (RestMenuResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e3050f1a3a10c119f01c296c17d2cd2") : fromJson(jSONObject, "");
    }

    @NonNull
    public static RestMenuResponse fromJson(JSONObject jSONObject, @Nullable String str) throws JSONException {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5cb1913b8794f39708f70cfd858dd821", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestMenuResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5cb1913b8794f39708f70cfd858dd821");
        }
        RestMenuResponse restMenuResponse = new RestMenuResponse();
        if (!t.a(str)) {
            restMenuResponse.srcResponse = (Map) com.sankuai.waimai.store.util.i.a(str, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.1
            }.getType());
        }
        restMenuResponse.parseBaseData(jSONObject);
        parsePriceExpInfo(jSONObject, restMenuResponse);
        parsePoiContainer(jSONObject, restMenuResponse);
        parsePoiShoppingCart(jSONObject, restMenuResponse);
        parseBoughtPoiCategory(jSONObject, restMenuResponse);
        parseOperationPoiCategory(jSONObject, restMenuResponse);
        parseGoodPoiCategoryList(jSONObject, restMenuResponse);
        parsePoiInfo(jSONObject, restMenuResponse);
        parseRecommend(jSONObject, restMenuResponse);
        parseKongPoiList(jSONObject, restMenuResponse);
        parsePoiSecondCategoryKong(jSONObject, restMenuResponse);
        parseOperationList(jSONObject, restMenuResponse);
        parseTabInfo(jSONObject, restMenuResponse);
        parsePoiTagInfo(jSONObject, restMenuResponse);
        parseFloorTagList(jSONObject, restMenuResponse);
        com.sankuai.waimai.store.shopping.cart.cache.b.a(restMenuResponse);
        restMenuResponse.friendStatus = jSONObject.optInt("friend_status");
        restMenuResponse.extra = jSONObject.optString("extra");
        JSONArray optJSONArray = jSONObject.optJSONArray("poi_notifications");
        restMenuResponse.poiNotifications = optJSONArray != null ? PoiNotification.parseList(optJSONArray.toString()) : null;
        restMenuResponse.pageScheme = jSONObject.optString("return_page_scheme");
        restMenuResponse.needPurchaseRecommend = jSONObject.optBoolean("need_purchase_recommend", false);
        restMenuResponse.showPoiInfo = jSONObject.optBoolean("show_poi_info", false);
        restMenuResponse.newPoiPage = jSONObject.optString("new_poi_page");
        parseFeedbackList(jSONObject, restMenuResponse);
        parseModuleList(jSONObject, restMenuResponse);
        parseMessagScheme(jSONObject, restMenuResponse);
        restMenuResponse.additionalFields = jSONObject.optString("additional_fields");
        restMenuResponse.mMRNTabData = (Map) com.sankuai.waimai.store.util.i.a(jSONObject.optString("mrn_tab_data"), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.2
        }.getType());
        restMenuResponse.receiveCouponStatus = jSONObject.optInt("receive_coupon_status", -1);
        restMenuResponse.receiveCouponAlert = jSONObject.optString("receive_coupon_alert");
        restMenuResponse.extendInfo = (Map) com.sankuai.waimai.store.util.i.a(jSONObject.optString("extend_info"), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.3
        }.getType());
        parseHeadEntryScheme(jSONObject, restMenuResponse);
        parseSidebarEntryScheme(jSONObject, restMenuResponse);
        parseSavePoiAndShoppingCart(jSONObject, restMenuResponse);
        restMenuResponse.homePageScheme = jSONObject.optString("home_page_scheme");
        return restMenuResponse;
    }

    private static void parseHeadEntryScheme(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c96843ede5b9d34d6790262223afda6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c96843ede5b9d34d6790262223afda6");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("head_entry_info");
        if (optJSONObject != null) {
            CdqEntryInfo cdqEntryInfo = new CdqEntryInfo();
            cdqEntryInfo.parseJson(optJSONObject);
            restMenuResponse.mCdqHeadEntryInfo = cdqEntryInfo;
        }
    }

    private static void parseSidebarEntryScheme(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "152ac66e1a2939ab9efb92328cf8038d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "152ac66e1a2939ab9efb92328cf8038d");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("sidebar_entry_info");
        if (optJSONObject != null) {
            CdqEntryInfo cdqEntryInfo = new CdqEntryInfo();
            cdqEntryInfo.parseJson(optJSONObject);
            restMenuResponse.mCdqSideEntryInfo = cdqEntryInfo;
        }
    }

    private static void parseSavePoiAndShoppingCart(JSONObject jSONObject, @NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d13393bdcf5289988cac305718b3ce42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d13393bdcf5289988cac305718b3ce42");
        } else if (jSONObject == null) {
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject(POI_INFO);
            if (optJSONObject != null) {
                restMenuResponse.poiString = optJSONObject.toString();
            } else {
                ae.a(ae.b, "restmenuresponse poiInfo = null;");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(SHOPPING_CART);
            if (optJSONObject2 != null) {
                restMenuResponse.shoppingCartString = optJSONObject2.toString();
            }
        }
    }

    private static void parseMessagScheme(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e65ab0a8f6206f6bff093d4170320024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e65ab0a8f6206f6bff093d4170320024");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("cdq_info");
        if (optJSONObject != null) {
            CdqInfo cdqInfo = new CdqInfo();
            cdqInfo.parseJson(optJSONObject);
            restMenuResponse.cdqInfo = cdqInfo;
        }
    }

    private static void parseModuleList(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "595329c3e93fb43ec5ec389621da7d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "595329c3e93fb43ec5ec389621da7d92");
            return;
        }
        String optString = jSONObject.optString("module_list");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        restMenuResponse.moduleList = (List) com.sankuai.waimai.store.util.i.a().fromJson(optString, new TypeToken<List<BaseModuleDesc>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.4
        }.getType());
    }

    private static void parseFeedbackList(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d0f043024333fbf7fe79b9ea4625f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d0f043024333fbf7fe79b9ea4625f4f");
            return;
        }
        restMenuResponse.questionTypeList = (List) com.sankuai.waimai.store.util.i.a().fromJson(jSONObject.optString("questions_type", ""), new TypeToken<List<Integer>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.5
        }.getType());
        String optString = jSONObject.optString("questions_entrance");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        restMenuResponse.mFeedbackInfos = (List) com.sankuai.waimai.store.util.i.a().fromJson(optString, new TypeToken<List<FeedbackInfo>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.6
        }.getType());
    }

    private static void parseRecommend(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a16ee654ebbee2d1f29ed876ddee9699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a16ee654ebbee2d1f29ed876ddee9699");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("recommend_food_info");
        if (optJSONObject != null) {
            Recommend recommend = new Recommend();
            recommend.parseJson(optJSONObject);
            restMenuResponse.recommend = recommend;
        }
    }

    private static void parsePoiContainer(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d0a09c817ccf981f7b36b4f7c54c23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d0a09c817ccf981f7b36b4f7c54c23d");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("container_template");
        if (optJSONObject != null) {
            PoiContainer poiContainer = new PoiContainer();
            poiContainer.parseJson(optJSONObject);
            restMenuResponse.mContainerTemplate = poiContainer;
        }
    }

    private static void parsePoiShoppingCart(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8ee613a63479c04ea788ba3bfd23b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8ee613a63479c04ea788ba3bfd23b03");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(SHOPPING_CART);
        if (optJSONObject != null) {
            PoiShoppingCart poiShoppingCart = new PoiShoppingCart();
            poiShoppingCart.parseJson(optJSONObject);
            restMenuResponse.mPoiShoppingCart = poiShoppingCart;
        }
    }

    private static void parsePoiTagInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae3c885325b82622679a898ef6f2aa73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae3c885325b82622679a898ef6f2aa73");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("poi_tags");
        if (optJSONObject != null) {
            a aVar = new a();
            Object[] objArr2 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "e091a097dccec463939c9f92ab818627", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "e091a097dccec463939c9f92ab818627");
            } else {
                aVar.b = optJSONObject.optInt("tag_type");
                aVar.c = parseTags(optJSONObject);
            }
            restMenuResponse.poiTags = aVar;
        }
    }

    private static void parsePoiInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a84aa98812b2267436011f94e826aff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a84aa98812b2267436011f94e826aff");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(POI_INFO);
        if (optJSONObject != null) {
            Poi poi = new Poi();
            poi.parseJsonToPoi(optJSONObject);
            if (restMenuResponse.mPoiShoppingCart != null) {
                poi.setShoppingCartIconUrl(restMenuResponse.mPoiShoppingCart.shoppingCartIcon);
                poi.setEmptyShoppingCartIconUrl(restMenuResponse.mPoiShoppingCart.emptyShoppingCartIcon);
                poi.setShippingFeeCartTip(restMenuResponse.mPoiShoppingCart.shippingFeeCartTip);
                poi.setEstimatedPackFeeCartTip(restMenuResponse.mPoiShoppingCart.estimatedPackFeeCartTip);
                poi.setSelfDeliveryTip(restMenuResponse.mPoiShoppingCart.selfDeliveryTip);
                poi.setActivityInfo(restMenuResponse.mPoiShoppingCart.activityInfo);
                poi.setActivityInfoList(restMenuResponse.mPoiShoppingCart.activityInfos);
                poi.setShopCartBgColor(restMenuResponse.mPoiShoppingCart.bgColor);
                poi.setPromptText(restMenuResponse.mPoiShoppingCart.promptText);
                poi.setHighlightPromptText(restMenuResponse.mPoiShoppingCart.highlightPromptText);
                poi.setAddCartButtonDesc(restMenuResponse.mPoiShoppingCart.addCartButtonDesc);
                poi.setTaskActivity(restMenuResponse.mPoiShoppingCart.taskActivity);
            }
            restMenuResponse.poiComment = (Poi.PoiComment) com.sankuai.waimai.store.util.i.a().fromJson(jSONObject.optString("poi_comment"), (Class<Object>) Poi.PoiComment.class);
            restMenuResponse.abExpInfo = jSONObject.optString("ab_exp_info");
            restMenuResponse.outOfDelivery = jSONObject.optBoolean("out_of_delivery");
            restMenuResponse.outOfPageType = jSONObject.optInt("out_of_page_type", 0);
            restMenuResponse.recommendRank = (Poi.RecommendRank) com.sankuai.waimai.store.util.i.a().fromJson(jSONObject.optString("recommend_rank_vo"), (Class<Object>) Poi.RecommendRank.class);
            poi.setAbExpInfo(restMenuResponse.getStids());
            poi.setPoiComment(restMenuResponse.poiComment);
            poi.setRecommendRank(restMenuResponse.recommendRank);
            poi.setAdditionalFields(jSONObject.optString("additional_fields"));
            restMenuResponse.mPoi = poi;
            PoiContainer poiContainer = restMenuResponse.mContainerTemplate;
            if (poiContainer != null) {
                restMenuResponse.mPoi.setTemplateType(poiContainer.code);
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("remind_infos");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                restMenuResponse.remindArray = optJSONArray;
            }
            saveShopData(poi, jSONObject);
            if (poi.getBuzType() != 9) {
                poi.setCouponEntryWithFlash(getFlashCouponEntity(jSONObject.optString("module_list")));
            }
        }
    }

    private static void saveShopData(@NonNull Poi poi, JSONObject jSONObject) {
        Object[] objArr = {poi, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea5c02f8f75472dc95f64ba8ba016e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea5c02f8f75472dc95f64ba8ba016e5b");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("navigation_bars");
        String str = poi.drugPoiScheme;
        String officialPoiId = poi.getOfficialPoiId();
        if (!t.a(str)) {
            String b2 = af.b(Uri.parse(str), "targetPath", "");
            if (t.a(b2)) {
                return;
            }
            com.sankuai.waimai.store.manager.data.a.a().a(af.b(Uri.parse(URLDecoder.decode(b2)), "wm_poi_id", ""), jSONObject);
        } else if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject);
                    if (bVar.d && bVar.c == 1) {
                        com.sankuai.waimai.store.manager.data.a.a().a(officialPoiId, jSONObject);
                        return;
                    }
                }
            }
        } else if (poi.isNewPage == 1) {
            com.sankuai.waimai.store.manager.data.a.a().a(officialPoiId, jSONObject);
        }
    }

    private static Poi.PoiCouponEntity getFlashCouponEntity(String str) {
        JSONObject optJSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "727aa8385e0d5f0968f3811a27fa1620", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi.PoiCouponEntity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "727aa8385e0d5f0968f3811a27fa1620");
        }
        if (t.a(str)) {
            return null;
        }
        try {
            List<BaseModuleDesc> list = (List) com.sankuai.waimai.store.util.i.a().fromJson(str, new TypeToken<List<BaseModuleDesc>>() { // from class: com.sankuai.waimai.store.repository.model.RestMenuResponse.7
            }.getType());
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                for (BaseModuleDesc baseModuleDesc : list) {
                    if (baseModuleDesc != null && baseModuleDesc.jsonData != null && TextUtils.equals(baseModuleDesc.moduleId, "food_discount") && (optJSONObject = new JSONObject(baseModuleDesc.jsonData).optJSONObject("food_discount_module")) != null) {
                        return (Poi.PoiCouponEntity) com.sankuai.waimai.store.util.i.a(optJSONObject.optString("poi_coupon"), Poi.PoiCouponEntity.class);
                    }
                }
            }
            return null;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    private static void parseOperationList(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8501319113e22d47db8e6f3b54e3a47f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8501319113e22d47db8e6f3b54e3a47f");
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("banner_list");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                PoiOperationItem poiOperationItem = new PoiOperationItem();
                poiOperationItem.parseJson(optJSONObject);
                arrayList.add(poiOperationItem);
            }
            restMenuResponse.mBanners = arrayList;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    private static void parseBoughtPoiCategory(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a6b6ed5294388ee39fe8b9d525d5ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a6b6ed5294388ee39fe8b9d525d5ef6");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("latest_bought");
        if (optJSONObject != null) {
            new BoughtPoiCategory().parseJson(optJSONObject);
        }
    }

    private static void parseOperationPoiCategory(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69964a5b960a2762bbe681eba2a12706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69964a5b960a2762bbe681eba2a12706");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("container_operation_source");
        if (optJSONObject != null) {
            OperationPoiCategory operationPoiCategory = new OperationPoiCategory();
            operationPoiCategory.parseJson(optJSONObject);
            restMenuResponse.mOperationPoiCategory = operationPoiCategory;
        }
    }

    private static void parseKongPoiList(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba161916799402aefad070e474795976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba161916799402aefad070e474795976");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("scBProductTagList");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            NavigateItem navigateItem = new NavigateItem();
            navigateItem.parseJson(optJSONObject);
            arrayList.add(navigateItem);
        }
        restMenuResponse.mNavigateItemList = arrayList;
    }

    private static void parsePoiSecondCategoryKong(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d08696026d2cb123ddce33264c46a357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d08696026d2cb123ddce33264c46a357");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("scBSecondProductTagList");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            PoiNavigationSecondCategotyList poiNavigationSecondCategotyList = new PoiNavigationSecondCategotyList();
            poiNavigationSecondCategotyList.parseJson(optJSONObject);
            arrayList.add(poiNavigationSecondCategotyList);
        }
        restMenuResponse.mPoiNavigationSecondCategotyList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<NavigateItem> parseTags(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3595d45d0ef7a61c4ff3cbc2423613f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3595d45d0ef7a61c4ff3cbc2423613f");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("tags");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            NavigateItem navigateItem = new NavigateItem();
            navigateItem.parseJson(optJSONObject);
            arrayList.add(navigateItem);
        }
        return arrayList;
    }

    private static void parseGoodPoiCategoryList(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe32c2fe9c1b6d00a525bea2a61e7650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe32c2fe9c1b6d00a525bea2a61e7650");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("food_spu_tags");
        if (optJSONArray != null && optJSONArray.length() > 0) {
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
                goodsPoiCategory2.parseJson(optJSONObject);
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
        JSONArray optJSONArray2 = jSONObject.optJSONArray("food_spu_floors");
        restMenuResponse.mFoodSpuFloorsSize = optJSONArray2 != null ? optJSONArray2.length() : 0;
    }

    private static void parsePriceExpInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f408503a019af655f28b7c0f7101150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f408503a019af655f28b7c0f7101150");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("price_opt_ab");
        if (optJSONObject != null) {
            PriceOptAB priceOptAB = new PriceOptAB();
            priceOptAB.parseJson(optJSONObject);
            restMenuResponse.mPriceOptAB = priceOptAB;
        }
    }

    private static void parseFloorTagList(JSONObject jSONObject, RestMenuResponse restMenuResponse) throws JSONException {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84f8fa8d07c7ea954c9c2616677ee798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84f8fa8d07c7ea954c9c2616677ee798");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("floor_tags");
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
            goodsPoiCategory2.parseJson(optJSONObject);
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
        restMenuResponse.floorTags = arrayList;
    }

    private static void parseTabInfo(JSONObject jSONObject, RestMenuResponse restMenuResponse) {
        Object[] objArr = {jSONObject, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b83c6fbf5a77fe7b36ffceb2cf643f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b83c6fbf5a77fe7b36ffceb2cf643f9");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("navigation_bars");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            b bVar = new b();
            bVar.a(optJSONObject);
            arrayList.add(bVar);
        }
        restMenuResponse.navigationBars = arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<RestMenuResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RestMenuResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99c6ce8dae7ab078858807226a6b6c8", RobustBitConfig.DEFAULT_VALUE)) {
                return (RestMenuResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99c6ce8dae7ab078858807226a6b6c8");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    String jsonElement2 = jsonElement.toString();
                    return RestMenuResponse.fromJson(new JSONObject(jsonElement2), jsonElement2);
                } catch (JSONException e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public List<GoodsPoiCategory> getmGoodPoiCategoryList() {
        return this.mGoodPoiCategoryList;
    }

    public void setRecommend(Recommend recommend) {
        this.recommend = recommend;
    }

    public List<PoiNavigationSecondCategotyList> getPoiNavigationSecondCategotyList() {
        return this.mPoiNavigationSecondCategotyList;
    }

    public Recommend getRecommend() {
        return this.recommend;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public OperationPoiCategory getOperationPoiCategory() {
        return this.mOperationPoiCategory;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public List<GoodsPoiCategory> getGoodsPoiCategories() {
        return this.mGoodPoiCategoryList;
    }

    public SCShareTip getPoiShareTip() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "101e476839ba99f9023bcc9b09d0f6a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCShareTip) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "101e476839ba99f9023bcc9b09d0f6a4");
        }
        if (this.mPoi == null) {
            return null;
        }
        return this.mPoi.getShareTip();
    }

    public int getPoiState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b74ade0831f4635e8fcfef5fb4ec52ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b74ade0831f4635e8fcfef5fb4ec52ba")).intValue();
        }
        if (this.mPoi == null) {
            return 3;
        }
        return this.mPoi.getState();
    }

    @Override // com.sankuai.waimai.store.repository.model.i
    public Poi getPoi() {
        return this.mPoi;
    }

    public List<PoiNotification> getPoiNotifications() {
        return this.poiNotifications;
    }

    @Override // com.sankuai.waimai.store.platform.shop.model.IMarketResponse
    public List<Integer> questionTypes() {
        return this.questionTypeList;
    }

    public JSONArray getRemindArray() {
        return this.remindArray;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiContainer implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public int code;
        @SerializedName("is_page")
        public boolean isPage;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63129be3e727400eefdb4418bf84026d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63129be3e727400eefdb4418bf84026d");
                return;
            }
            this.code = jSONObject.optInt("code");
            this.isPage = jSONObject.optBoolean("is_page");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class NavigateItem implements Serializable {
        public static final int KONG_TYPE_OF_FIRST_CATEGORY = 100;
        public static final int KONG_TYPE_OF_SECOND_CATEGORY = 200;
        public static final long MORE_ID = 0;
        public static final long MORE_TAG_ID = -1000;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("anchoredInfo")
        public AnchoredInfo anchoredInfo;
        @SerializedName("description")
        public String description;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("id")
        public long id;
        @SerializedName("is_more_tag")
        public boolean isMoreTag;
        @SerializedName("name")
        public String name;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("sequence")
        public String sequence;
        @SerializedName("tag_id")
        public long tagId;
        @SerializedName("wmPoiId")
        public long wmPoiId;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class AnchoredInfo implements Serializable {
            public static final int ANCHORED_TYPE_NEW_STRATEGY = 1;
            public static final int ID_TYPE_PHYSICAL_CLASSIFICATION = 0;
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("anchored_type")
            public int anchoredType;
            @SerializedName("bar_index")
            public int barIndex;
            @SerializedName("id")
            public String id;
            @SerializedName("id_type")
            public int idType;
        }

        public static boolean isMoreTag(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ea291786c08dc0faf7d7ef307be46e1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ea291786c08dc0faf7d7ef307be46e1")).booleanValue() : -1000 == j || 0 == j;
        }

        public static boolean isAnchoredNewStrategy(AnchoredInfo anchoredInfo) {
            Object[] objArr = {anchoredInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89c0f92701eb01d6d9156a3ae5ce0608", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89c0f92701eb01d6d9156a3ae5ce0608")).booleanValue() : anchoredInfo != null && anchoredInfo.anchoredType == 1 && anchoredInfo.idType == 0 && r.a(anchoredInfo.id, -1L) >= 0;
        }

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa6f580f064a133ad53f98ac97d70d58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa6f580f064a133ad53f98ac97d70d58");
                return;
            }
            this.id = jSONObject.optLong("id");
            this.name = jSONObject.optString("name");
            this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
            this.description = jSONObject.optString("description");
            this.sequence = jSONObject.optString("sequence");
            this.wmPoiId = jSONObject.optLong("wmPoiId");
            this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
            this.tagId = jSONObject.optLong("tag_id");
            this.isMoreTag = jSONObject.optBoolean("is_more_tag");
            JSONObject optJSONObject = jSONObject.optJSONObject("anchoredInfo");
            if (optJSONObject != null) {
                this.anchoredInfo = new AnchoredInfo();
                this.anchoredInfo.anchoredType = optJSONObject.optInt("anchored_type", 0);
                this.anchoredInfo.idType = optJSONObject.optInt("id_type", 0);
                this.anchoredInfo.id = optJSONObject.optString("id", null);
                this.anchoredInfo.barIndex = optJSONObject.optInt("bar_index", -1);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("name")
        public String b;
        @SerializedName("page_type")
        public int c;
        @SerializedName("is_selected")
        public boolean d;
        @SerializedName("bar_index")
        public int e;
        @SerializedName("additional_info")
        public TabAdditionalInfo f;
        public boolean g;
        public transient long h;
        public transient boolean i;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419c5ee3ef41a03590ee8aea6773c289", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419c5ee3ef41a03590ee8aea6773c289");
            } else {
                this.h = -1L;
            }
        }

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e8d2f3e479729b35f8d9605025bf8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e8d2f3e479729b35f8d9605025bf8a");
                return;
            }
            this.b = jSONObject.optString("name");
            this.c = jSONObject.optInt("page_type");
            this.d = jSONObject.optBoolean("is_selected");
            this.f = new TabAdditionalInfo();
            this.f.parseJson(jSONObject.optJSONObject("additional_info"));
            this.e = jSONObject.optInt("bar_index", -1);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CdqInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -2171414271831897090L;
        @SerializedName("message_scheme")
        public String messageScheme;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be3aeac691a64285cee695d501c517ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be3aeac691a64285cee695d501c517ef");
            } else {
                this.messageScheme = jSONObject.optString("message_scheme");
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CdqEntryInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -2171414271831897090L;
        @SerializedName("dialog_action")
        public String dialogAction;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("tag_icon_url")
        public String tagIconUrl;
        @SerializedName("type")
        public int type;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1425613d0f69171f7f1af867e049f1a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1425613d0f69171f7f1af867e049f1a0");
                return;
            }
            try {
                this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
                this.picUrl = jSONObject.optString("pic_url");
                this.tagIconUrl = jSONObject.optString("tag_icon_url");
                this.dialogAction = jSONObject.optString("dialog_action");
                this.type = jSONObject.optInt("type");
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TabAdditionalInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -5106566658482668289L;
        @SerializedName("bubble_icon")
        public String bubbleIcon;
        @SerializedName("comments_count")
        public String commentCount;
        @SerializedName("promotion_selected_pic")
        public String promotionSelectedPic;
        @SerializedName("promotion_unselected_pic")
        public String promotionUnselectedPic;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d166527fb16081d7b62475839a4a51e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d166527fb16081d7b62475839a4a51e");
            } else if (jSONObject == null) {
            } else {
                this.commentCount = jSONObject.optString("comments_count");
                this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
                this.bubbleIcon = jSONObject.optString("bubble_icon");
                this.promotionSelectedPic = jSONObject.optString("promotion_selected_pic");
                this.promotionUnselectedPic = jSONObject.optString("promotion_unselected_pic");
            }
        }
    }
}
