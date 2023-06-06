package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.w;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import com.sankuai.waimai.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import com.sankuai.waimai.platform.domain.core.poi.PoiNotification;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsSpu extends PoiItem implements Serializable {
    public static final int ACTIVITY_GOOD_COUPON = 9;
    public static final int ACTIVITY_TYPE_DISCOUNT = 1;
    public static final int ACTIVITY_TYPE_NEW_CUSTOMER = 5;
    public static final int ACTIVITY_TYPE_NONE = 0;
    public static final int ACTIVITY_TYPE_NX = 2;
    public static final int ACTIVITY_TYPE_PLUS_BUY = 6;
    public static final int FOOD_STYLE_DECISION = 1;
    public static final int FOOD_STYLE_NORMAL = 0;
    public static final int FULL_DISCOUNT_PRICE_HIDDEN = 0;
    public static final int FULL_DISCOUNT_PRICE_SHOWNN = 1;
    public static final int FULL_DISCOUNT_PRICE_UNKNOWN = -1;
    public static final int ITEM_TYPE_COMBOL = 2;
    public static final int ITEM_TYPE_NORMAL = 1;
    public static final int PACKAGE_TYPE_HOME_DISCOVERY = 2;
    public static final int PACKAGE_TYPE_SEARCH_MULTI = 1;
    public static final int STATUS_ACTIVITY_SOLD_OUT = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_OFF_WORK = 4;
    public static final int STATUS_PRE_ORDER = 5;
    public static final int STATUS_REMOVED = -1;
    public static final int STATUS_SOLD_OUT = 1;
    public static final int STATUS_UNSELLABLE = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    @Expose
    public StoreActivityInfo activityInfo;
    @SerializedName("activity_policy")
    @Expose
    public ActivityPolicy activityPolicy;
    @SerializedName("activity_tag")
    @Expose
    public String activityTag;
    @SerializedName("activity_tag_id")
    @Expose
    public String activityTagId;
    @SerializedName("activity_text")
    public String activityText;
    @SerializedName("activity_type")
    @Expose
    public int activityType;
    @SerializedName("ad_data_info")
    @Expose
    public String adDataInfo;
    @SerializedName("add_count")
    public int addCount;
    @SerializedName("poi_tags")
    @Expose
    public List<com.sankuai.waimai.platform.widget.tag.api.d> aiDiscountTags;
    @SerializedName("full_discount_tag")
    @Expose
    public List<com.sankuai.waimai.platform.widget.tag.api.d> aiFullDiscountTags;
    @SerializedName("promotion_tag")
    @Expose
    public List<com.sankuai.waimai.platform.widget.tag.api.d> aiPromotionTags;
    @SerializedName("atmosphere_pic")
    @Expose
    public String atmospherePic;
    private transient Map<Long, GoodsAttr> attrIdMaps;
    private Map<String, List<GoodsAttr>> attrListMap;
    private List<String> attrNameList;
    private transient GoodsAttr[] attrValuesArr;
    @SerializedName("attrs")
    @Expose
    public List<GoodsAttrList> attrs;
    @Expose(deserialize = false, serialize = false)
    public String categoryTag;
    @SerializedName("delivery_info")
    @Expose
    public SpuDeliveryInfo deliveryInfo;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("food_label_pic")
    @Expose
    public String foodLabelPic;
    @SerializedName("food_label_text")
    @Expose
    public String foodLabelText;
    private FoodMultiSpuResponse foodMultiSpuResponse;
    private transient String foodMultiSpuResponseNew;
    @SerializedName("poi_food_tag_list")
    @Expose
    public List<PoiFoodTag> foodTags;
    @SerializedName("forbid_single_buy")
    @Expose
    public String forbidSingleBuy;
    @SerializedName("friends_nickname_praise_content")
    @Expose
    public String friendsNickNamePraiseContent;
    @SerializedName("friends_praise_content")
    @Expose
    public String friendsPraiseContent;
    @SerializedName("full_discount_price")
    @Expose
    public double fullDiscountPrice;
    @SerializedName("log_field")
    @Expose
    private GoodsLogField goodLogField;
    @SerializedName("product_label_picture")
    @Expose
    private String goodsLabelUrl;
    public String groupChatShare;
    @SerializedName("has_multi_sale_attr")
    @Expose
    public boolean hasMultiSaleAttr;
    @SerializedName("id")
    @Expose
    public long id;
    public int index;
    @SerializedName("ai_discount")
    @Expose
    public boolean isAIDiscount;
    @SerializedName("has_food")
    @Expose
    public boolean isFood;
    @SerializedName("isPremiumSpu")
    public boolean isPremiumSpu;
    @SerializedName("label_text")
    public String labelText;
    @SerializedName("like_ratio_desc")
    @Expose
    public String likeRatioDesc;
    public transient JSONObject logData;
    public transient List<a> mDyComponetModelList;
    @SerializedName("spu_dna_value_objs")
    @Expose
    public List<c> mGoodSpuDNAList;
    @SerializedName("status_remind_list")
    @Expose
    public List<GoodsRemind> mRemindList;
    @SerializedName("min_price")
    @Expose
    public double minPrice;
    @SerializedName("month_saled")
    @Expose
    public int monthSaled;
    @SerializedName("month_saled_content")
    @Expose
    public String monthSaledContent;
    @SerializedName("mp_transparent_data")
    public String mpTransparentData;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("origin_price")
    @Expose
    public double originPrice;
    @SerializedName("food_package")
    @Expose
    public List<SpuPackageItem> packageList;
    @SerializedName("package_product")
    @Expose
    public f packageProduct;
    @SerializedName("package_style_type")
    @Expose
    public int packageStyleType;
    @SerializedName("tag")
    @Expose
    public String physicalTag;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("pictures")
    @Expose
    public List<String> pictures;
    @SerializedName("poi_notifications")
    @Expose
    public ArrayList<PoiNotification> poiNotifications;
    @SerializedName("poi_primary_business")
    @Expose
    public long poiPrimary;
    @SerializedName("praise_content")
    @Expose
    public String praiseContent;
    @SerializedName("praise_num")
    @Expose
    public int praiseNum;
    @SerializedName("praise_num_new")
    @Expose
    public int praiseNumNew;
    @SerializedName("price_desc")
    @Expose
    public String priceDesc;
    @SerializedName("product_label_picture_list")
    @Expose
    public List<b> productLabelPictureList;
    @SerializedName(ICashierJSHandler.KEY_PROMOTION)
    @Expose
    public GoodsPromotion promotion;
    @SerializedName("promotion_info")
    @Expose
    public String promotionInfo;
    public String reason;
    @SerializedName("rec_trace_id")
    @Expose
    public String recTraceId;
    @SerializedName("recommend_description")
    @Expose
    public String recommendDescription;
    public int seckill;
    private String secondFilterTag;
    @SerializedName("share_tip")
    @Expose
    public ShareTip shareTip;
    public int showFullDiscountPriceStatus;
    @SerializedName("sku")
    @Expose
    public GoodsSku sku;
    @SerializedName("sku_label")
    @Expose
    public String skuLabel;
    @SerializedName("skus")
    @Expose
    public List<GoodsSku> skus;
    @SerializedName("spu_category")
    public int spuCategory;
    public boolean spuCoverShow;
    @SerializedName("spu_type")
    @Expose
    public int spuType;
    @SerializedName("status")
    @Expose
    public int status;
    @SerializedName("status_description")
    @Expose
    public String statusDescription;
    @SerializedName("stock")
    @Expose
    public int stock;
    @SerializedName("style")
    @Expose
    public int style;
    @SerializedName("tread_num")
    @Expose
    public int treadNum;
    @SerializedName("unit")
    @Expose
    public String unit;
    @SerializedName("use_poi_tags_field")
    @Expose
    public boolean usePoiTagsField;
    @SerializedName("video_icon")
    public String videoIcon;

    public static int getStatusActivitySoldOut() {
        return 2;
    }

    public GoodsSpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f35438b07078d81f5a92bf1555da9783", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f35438b07078d81f5a92bf1555da9783");
            return;
        }
        this.id = -1L;
        this.pictures = new ArrayList();
        this.spuType = -1;
        this.fullDiscountPrice = -1.0d;
        this.showFullDiscountPriceStatus = -1;
    }

    public FoodMultiSpuResponse getFoodMultiSpuResponse() {
        return this.foodMultiSpuResponse;
    }

    public void setFoodMultiSpuResponse(FoodMultiSpuResponse foodMultiSpuResponse) {
        this.foodMultiSpuResponse = foodMultiSpuResponse;
    }

    public void setFoodMultiSpuResponseNew(String str) {
        this.foodMultiSpuResponseNew = str;
    }

    public String getFoodMultiSpuResponseNew() {
        return this.foodMultiSpuResponseNew;
    }

    public String getPromotionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b299fab106ca38e47cd1d061bcc9cd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b299fab106ca38e47cd1d061bcc9cd5");
        }
        if (TextUtils.isEmpty(this.promotionInfo)) {
            return getNXDesp();
        }
        return this.promotionInfo;
    }

    public String getSecondFilterTag() {
        return this.secondFilterTag;
    }

    public void setSecondFilterTag(String str) {
        this.secondFilterTag = str;
    }

    private String getNXDesp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c06464c11e45255f2adcf4dfd860d6e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c06464c11e45255f2adcf4dfd860d6e") : isNXActivity() ? this.activityPolicy.getDiscountByCount().getDiscount() == 0.5d ? ab.a((int) R.string.wm_platform_goods_half_price_tips, Integer.valueOf(getNXCount())) : ab.a((int) R.string.wm_platform_goods_discount_detail, Integer.valueOf(getNXCount()), h.a(getNXDiscount() * 10.0d)) : "";
    }

    public double getNXDiscount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "459b49c0dab6ec7b1782f0a7c1672bb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "459b49c0dab6ec7b1782f0a7c1672bb3")).doubleValue();
        }
        if (isNXActivity()) {
            return this.activityPolicy.getDiscountByCount().getDiscount();
        }
        return 1.0d;
    }

    private int getNXCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24c2c598763a3e6b109032a7a170a15a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24c2c598763a3e6b109032a7a170a15a")).intValue();
        }
        if (isNXActivity()) {
            return this.activityPolicy.getDiscountByCount().getCount();
        }
        return 0;
    }

    public boolean isNXActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "741c1d8d3796aa1b13fa2b0a9d790d41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "741c1d8d3796aa1b13fa2b0a9d790d41")).booleanValue() : (this.activityType != 2 || this.activityPolicy == null || this.activityPolicy.getDiscountByCount() == null) ? false : true;
    }

    public boolean hasAttr(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23491bed60ac10d60db877cb2650eb1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23491bed60ac10d60db877cb2650eb1d")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        for (GoodsAttrList goodsAttrList : this.attrs) {
            if (goodsAttrList.getValues() != null) {
                Iterator<GoodsAttr> it = goodsAttrList.getValues().iterator();
                while (it.hasNext()) {
                    if (it.next().id == j) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public boolean isManySku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e38050a9f2646408a92720c4d60f7f81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e38050a9f2646408a92720c4d60f7f81")).booleanValue() : this.hasMultiSaleAttr ? getAttrValuesArr() != null && getAttrValuesArr().length > 1 : (getSkuList() != null && getSkuList().size() > 1) || (getAttrList() != null && getAttrList().size() > 0);
    }

    public boolean isDiscountGood() {
        return this.activityType == 1;
    }

    public boolean isNewCustomerDiscount() {
        return this.activityType == 5;
    }

    public boolean isBuyPlus() {
        return this.activityType == 6;
    }

    public int getNXDiscountNum(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2c15af18869cd2a0cc6544733119603", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2c15af18869cd2a0cc6544733119603")).intValue();
        }
        if (isNXActivity()) {
            return Math.round(i / this.activityPolicy.getDiscountByCount().getCount());
        }
        return 0;
    }

    public boolean isShowOriginalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44ec74e4d1a8a658d154e7f716d9d021", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44ec74e4d1a8a658d154e7f716d9d021")).booleanValue();
        }
        if (this.skus == null || this.skus.size() <= 0 || this.skus.size() > 1 || this.activityType == 6) {
            return false;
        }
        GoodsSku goodsSku = this.skus.get(0);
        return goodsSku.getOriginPrice() > 0.0d && goodsSku.getOriginPrice() != goodsSku.getPrice();
    }

    public double getOriginPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "608b73312db1e9229121462190ec8058", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "608b73312db1e9229121462190ec8058")).doubleValue();
        }
        if (isShowOriginalPrice()) {
            return this.skus.get(0).getOriginPrice();
        }
        return -1.0d;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c83cf99aaf80cddd3cafcc383674c329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c83cf99aaf80cddd3cafcc383674c329");
            return;
        }
        try {
            this.id = jSONObject.optLong("id", 0L);
            String str = null;
            this.physicalTag = jSONObject.optString("tag", null);
            this.name = jSONObject.optString("name", "");
            this.labelText = jSONObject.optString("label_text", "");
            this.minPrice = jSONObject.optDouble("min_price", 0.0d);
            this.originPrice = jSONObject.optDouble("origin_price", 0.0d);
            this.praiseNum = jSONObject.optInt("praise_num", 0);
            this.treadNum = jSONObject.optInt("tread_num", 0);
            this.praiseNumNew = jSONObject.optInt("praise_num_new", 0);
            this.monthSaled = jSONObject.optInt("month_saled", 0);
            this.unit = jSONObject.optString("unit", ab.a(R.string.wm_platform_goods_unit));
            this.description = jSONObject.optString("description", "");
            this.picture = jSONObject.optString("picture", "");
            this.videoIcon = jSONObject.optString("video_icon", "");
            this.spuType = jSONObject.optInt("spu_type", -1);
            this.recTraceId = jSONObject.optString("rec_trace_id", "");
            this.stock = jSONObject.optInt("stock", 0);
            this.likeRatioDesc = jSONObject.optString("like_ratio_desc", "");
            JSONArray optJSONArray = jSONObject.optJSONArray("pictures");
            for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                this.pictures.add(optJSONArray.optString(i));
            }
            this.status = jSONObject.optInt("status");
            this.isFood = jSONObject.optBoolean("has_food");
            this.promotionInfo = jSONObject.optString("promotion_info");
            this.promotion = new GoodsPromotion();
            this.promotion.fromJson(jSONObject.optJSONObject(ICashierJSHandler.KEY_PROMOTION));
            this.activityTag = jSONObject.optString("activity_tag");
            if ("group_zhuanxiang_discount".equals(this.activityTag)) {
                this.groupChatShare = "POI_IM";
            } else if ("seckill_zhuanxiang_discount".equals(this.activityTag)) {
                this.seckill = 1;
            }
            this.skuLabel = jSONObject.optString("sku_label");
            this.statusDescription = jSONObject.optString("status_description");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("status_remind_list");
            this.mRemindList = new ArrayList();
            for (int i2 = 0; optJSONArray2 != null && i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                GoodsRemind goodsRemind = new GoodsRemind();
                goodsRemind.parseJson(optJSONObject);
                this.mRemindList.add(goodsRemind);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("skus");
            if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                this.skus = new ArrayList();
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i3);
                    GoodsSku goodsSku = new GoodsSku();
                    goodsSku.parseJson(optJSONObject2);
                    this.skus.add(goodsSku);
                }
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("attrs");
            if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                this.attrListMap = new HashMap();
                this.attrs = new ArrayList();
                this.attrNameList = new ArrayList();
                this.attrIdMaps = new HashMap();
                ArrayList<GoodsAttr> arrayList = new ArrayList();
                for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                    JSONObject optJSONObject3 = optJSONArray4.optJSONObject(i4);
                    String optString = optJSONObject3.optString("name");
                    this.attrNameList.add(optString);
                    GoodsAttrList goodsAttrList = new GoodsAttrList();
                    goodsAttrList.parseJson(optJSONObject3);
                    this.attrs.add(goodsAttrList);
                    arrayList.addAll(goodsAttrList.values);
                    this.attrListMap.put(optString, goodsAttrList.getValues());
                }
                for (GoodsAttr goodsAttr : arrayList) {
                    this.attrIdMaps.put(Long.valueOf(goodsAttr.id), goodsAttr);
                }
                this.attrValuesArr = new GoodsAttr[arrayList.size()];
                this.attrValuesArr = (GoodsAttr[]) arrayList.toArray(this.attrValuesArr);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("share_tip");
            if (optJSONObject4 != null && optJSONObject4.length() > 0) {
                this.shareTip = new ShareTip();
                this.shareTip.parseJson(optJSONObject4);
            }
            this.poiPrimary = jSONObject.optLong("poi_primary_business", 0L);
            this.praiseContent = jSONObject.optString("praise_content", "");
            this.monthSaledContent = jSONObject.optString("month_saled_content", "");
            this.activityType = jSONObject.optInt("activity_type", -1);
            JSONObject optJSONObject5 = jSONObject.optJSONObject("activity_policy");
            this.activityPolicy = new ActivityPolicy();
            this.activityPolicy.parseJson(optJSONObject5);
            this.friendsPraiseContent = jSONObject.optString("friends_praise_content");
            this.friendsNickNamePraiseContent = jSONObject.optString("friends_nickname_praise_content");
            this.goodsLabelUrl = jSONObject.optString("product_label_picture");
            JSONArray optJSONArray5 = jSONObject.optJSONArray("product_label_picture_list");
            this.productLabelPictureList = new ArrayList();
            for (int i5 = 0; optJSONArray5 != null && i5 < optJSONArray5.length(); i5++) {
                JSONObject optJSONObject6 = optJSONArray5.optJSONObject(i5);
                b bVar = new b();
                Object[] objArr2 = {optJSONObject6};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "9cdada4e3490bd24c430678b84b8d818", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "9cdada4e3490bd24c430678b84b8d818");
                } else {
                    try {
                        bVar.c = optJSONObject6.optInt("width");
                        bVar.d = optJSONObject6.optInt("height");
                        bVar.b = optJSONObject6.optString("picture_url", "");
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
                this.productLabelPictureList.add(bVar);
            }
            JSONArray optJSONArray6 = jSONObject.optJSONArray("poi_notifications");
            if (optJSONArray6 != null) {
                str = optJSONArray6.toString();
            }
            this.poiNotifications = PoiNotification.parseList(str);
            JSONObject optJSONObject7 = jSONObject.optJSONObject("log_field");
            if (optJSONObject7 != null) {
                this.goodLogField = new GoodsLogField();
                this.goodLogField.parseJson(optJSONObject7);
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("package_product");
            if (optJSONObject8 != null) {
                this.packageProduct = new f();
                this.packageProduct.a(optJSONObject8);
            }
            JSONArray optJSONArray7 = jSONObject.optJSONArray("spu_dna_value_objs");
            this.mGoodSpuDNAList = new ArrayList();
            for (int i6 = 0; optJSONArray7 != null && i6 < optJSONArray7.length(); i6++) {
                JSONObject optJSONObject9 = optJSONArray7.optJSONObject(i6);
                c cVar = new c();
                Object[] objArr3 = {optJSONObject9};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect4, false, "07706a16f529acfbff2ccac7052de9ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect4, false, "07706a16f529acfbff2ccac7052de9ef");
                } else if (optJSONObject9 != null) {
                    cVar.b = optJSONObject9.optString("value_name");
                    cVar.c = optJSONObject9.optString("icon_url");
                    cVar.d = optJSONObject9.optInt("value_id");
                }
                this.mGoodSpuDNAList.add(cVar);
            }
            this.atmospherePic = jSONObject.optString("atmosphere_pic");
            this.activityTagId = jSONObject.optString("activity_tag_id");
            String optString2 = jSONObject.optString("activity_info");
            if (!TextUtils.isEmpty(optString2)) {
                this.activityInfo = new StoreActivityInfo();
                this.activityInfo.parseJson(optString2);
            }
            String optString3 = jSONObject.optString("delivery_info");
            if (!TextUtils.isEmpty(optString3)) {
                this.deliveryInfo = new SpuDeliveryInfo();
                this.deliveryInfo.parseJson(optString3);
            }
            this.recommendDescription = jSONObject.optString("recommend_description");
            this.foodLabelPic = jSONObject.optString("food_label_pic");
            this.foodLabelText = jSONObject.optString("food_label_text");
            this.priceDesc = jSONObject.optString("price_desc");
            this.packageList = SpuPackageItem.fromJsonArray(jSONObject.optJSONArray("food_package"), this.physicalTag);
            this.packageStyleType = jSONObject.optInt("package_style_type");
            this.fullDiscountPrice = jSONObject.optDouble("full_discount_price", -1.0d);
            this.mDyComponetModelList = a.a(jSONObject.optJSONArray("component_list"));
            String optString4 = jSONObject.optString("log_data");
            if (!TextUtils.isEmpty(optString4)) {
                this.logData = new JSONObject(optString4);
            }
            this.spuCoverShow = jSONObject.optBoolean("spu_cover_show");
            this.style = jSONObject.optInt("style");
            this.foodTags = PoiFoodTag.fromJsonArray(jSONObject.optJSONArray("poi_food_tag_list"));
            this.isAIDiscount = jSONObject.optBoolean("ai_discount");
            this.adDataInfo = jSONObject.optString("ad_data_info");
            this.hasMultiSaleAttr = jSONObject.optBoolean("has_multi_sale_attr");
            this.addCount = jSONObject.optInt("add_count");
            this.isPremiumSpu = jSONObject.getBoolean("isPremiumSpu");
            this.spuCategory = jSONObject.getInt("spu_category");
            this.mpTransparentData = jSONObject.optString("mp_transparent_data");
        } catch (Exception unused) {
        }
    }

    public boolean hasFullDiscountPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd82963429807fa53c129e6a42800e32", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd82963429807fa53c129e6a42800e32")).booleanValue() : h.e(Double.valueOf(this.fullDiscountPrice), Double.valueOf(0.0d));
    }

    /* renamed from: clone */
    public GoodsSpu m18clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "452491d7a8d6840ef9dd4ef21d4a274c", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "452491d7a8d6840ef9dd4ef21d4a274c") : (GoodsSpu) w.a(this);
    }

    public ShareTip getShareTip() {
        return this.shareTip;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getMinPrice() {
        return this.minPrice;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String str) {
        this.picture = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }

    public int getStatus() {
        return this.status;
    }

    public List<GoodsSku> getSkuList() {
        return this.skus;
    }

    public List<String> getAttrNameList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcb5ad6dc2fc64a0ff550e157bdea818", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcb5ad6dc2fc64a0ff550e157bdea818");
        }
        if (initAttrListMap()) {
            return this.attrNameList;
        }
        return null;
    }

    public GoodsAttr[] getAttrValuesArr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d10c6dd060e9f46e48e557a81ad4ef3", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d10c6dd060e9f46e48e557a81ad4ef3");
        }
        if (initAttrListMap()) {
            return this.attrValuesArr;
        }
        return null;
    }

    public Map<Long, GoodsAttr> getAttrValuesIdMaps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "103234b48383ee7063144d2b62405d6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "103234b48383ee7063144d2b62405d6c");
        }
        if (initAttrListMap()) {
            return this.attrIdMaps;
        }
        return null;
    }

    public String getActivityTag() {
        return this.activityTag;
    }

    public String getGroupChatShare() {
        return this.groupChatShare;
    }

    public Map<String, List<GoodsAttr>> getAttrList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d61b87650ddd23e95cb7bb162e478fa5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d61b87650ddd23e95cb7bb162e478fa5");
        }
        if (initAttrListMap()) {
            return this.attrListMap;
        }
        return null;
    }

    private boolean initAttrListMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adc39b940be06708e8ea3c00711e90d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adc39b940be06708e8ea3c00711e90d6")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        if (this.attrListMap != null) {
            return true;
        }
        this.attrListMap = new HashMap();
        this.attrNameList = new ArrayList();
        this.attrIdMaps = new HashMap();
        ArrayList<GoodsAttr> arrayList = new ArrayList();
        for (int i = 0; i < this.attrs.size(); i++) {
            GoodsAttrList goodsAttrList = this.attrs.get(i);
            this.attrNameList.add(goodsAttrList.getName());
            arrayList.addAll(goodsAttrList.values);
            this.attrListMap.put(goodsAttrList.getName(), goodsAttrList.getValues());
        }
        for (GoodsAttr goodsAttr : arrayList) {
            this.attrIdMaps.put(Long.valueOf(goodsAttr.id), goodsAttr);
        }
        this.attrValuesArr = new GoodsAttr[arrayList.size()];
        this.attrValuesArr = (GoodsAttr[]) arrayList.toArray(this.attrValuesArr);
        return true;
    }

    public String getGoodsLabelUrl() {
        return this.goodsLabelUrl;
    }

    public String getStatusDescription() {
        return this.statusDescription;
    }

    public String getSkuLabel() {
        return this.skuLabel;
    }

    public ActivityPolicy getActivityPolicy() {
        return this.activityPolicy;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public int getMonthSaled() {
        return this.monthSaled;
    }

    public int getPraiseNum() {
        return this.praiseNum;
    }

    public int getPraiseNumNew() {
        return this.praiseNumNew;
    }

    public int getTreadNum() {
        return this.treadNum;
    }

    public List<GoodsAttrList> getAttrsList() {
        return this.attrs;
    }

    public List<GoodsRemind> getmRemindList() {
        return this.mRemindList;
    }

    public List<String> getPictureList() {
        return this.pictures;
    }

    public long getPoiPrimary() {
        return this.poiPrimary;
    }

    public Map<String, List<GoodsAttr>> getAttrListMap() {
        return this.attrListMap;
    }

    public String getFriendNickNamePraiseContent() {
        return this.friendsNickNamePraiseContent;
    }

    public String getFriendPraiseContent() {
        return this.friendsPraiseContent;
    }

    public String getMonthSaledContent() {
        return this.monthSaledContent;
    }

    public String getPraiseContent() {
        return this.praiseContent;
    }

    public String getDPRecommend() {
        return this.foodLabelText;
    }

    public void setGoodsLabelUrl(String str) {
        this.goodsLabelUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setActivityTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b526469b82dbfe0814b81a68c09bd43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b526469b82dbfe0814b81a68c09bd43d");
            return;
        }
        this.activityTag = str;
        if ("group_zhuanxiang_discount".equals(str)) {
            this.groupChatShare = "POI_IM";
        } else if ("seckill_zhuanxiang_discount".equals(str)) {
            this.seckill = 1;
        }
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public void setSkuList(List<GoodsSku> list) {
        this.skus = list;
    }

    public void setMinPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b5d8018215d9562ab20cb2315e2d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b5d8018215d9562ab20cb2315e2d60");
        } else {
            this.minPrice = d;
        }
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f1bfdae4002980bf77ddedaf54ef4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f1bfdae4002980bf77ddedaf54ef4f");
        } else {
            this.originPrice = d;
        }
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public void setActivityPolicy(ActivityPolicy activityPolicy) {
        this.activityPolicy = activityPolicy;
    }

    public List<b> getGoodsLabelUrlsList() {
        return this.productLabelPictureList;
    }

    public ArrayList<PoiNotification> getPoiNotifications() {
        return this.poiNotifications;
    }

    public GoodsLogField getGoodLogField() {
        return this.goodLogField;
    }

    public void setGoodLogField(GoodsLogField goodsLogField) {
        this.goodLogField = goodsLogField;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return this.categoryTag;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
        this.categoryTag = str;
    }

    public void setPhysicalTag(String str) {
        this.physicalTag = str;
    }

    public String getPhysicalTag() {
        return this.physicalTag;
    }

    public boolean hasAttr(List<GoodsAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41f84b3d6984641fe2015f676d23addc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41f84b3d6984641fe2015f676d23addc")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return true;
        }
        for (GoodsAttr goodsAttr : list) {
            if (!hasAttr(goodsAttr.id)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasAttr(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5c5a53dd14048e41bc3bec70193c377", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5c5a53dd14048e41bc3bec70193c377")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        if (com.sankuai.waimai.foundation.utils.b.a(goodsAttrArr)) {
            return true;
        }
        for (GoodsAttr goodsAttr : goodsAttrArr) {
            if (!hasAttr(goodsAttr.id)) {
                return false;
            }
        }
        return true;
    }

    public void setTagCode(String str) {
        this.categoryTag = str;
    }

    public boolean shouldShowOriginalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a87343420d9a7cd1c0c263f8bb5847", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a87343420d9a7cd1c0c263f8bb5847")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.skus)) {
            return false;
        }
        return this.skus.get(0).shouldShowOriginalPrice();
    }

    public boolean hasManySpec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef2782e6f938fd6c6dba0d4f5309eef5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef2782e6f938fd6c6dba0d4f5309eef5")).booleanValue() : com.sankuai.waimai.foundation.utils.b.c(this.skus) > 1;
    }

    public boolean hasManyAttr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19dfffbeeb47a70081328d97e55eee8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19dfffbeeb47a70081328d97e55eee8b")).booleanValue() : !com.sankuai.waimai.foundation.utils.b.b(this.attrs);
    }

    public boolean isSoldOut() {
        return this.status != 0;
    }

    public List<GoodsSku> getSkus() {
        return this.skus;
    }

    public GoodsSku getSku() {
        return this.sku;
    }

    public String getfoodLabelPic() {
        return this.foodLabelPic;
    }

    public String getRecommendDescription() {
        return this.recommendDescription;
    }

    public void setAttrListMap(List<GoodsAttrList> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eff9a58da0e8dccec70352a097e03483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eff9a58da0e8dccec70352a097e03483");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            this.attrListMap = new HashMap();
            this.attrs = new ArrayList();
            this.attrNameList = new ArrayList();
            ArrayList arrayList = new ArrayList();
            this.attrs.addAll(list);
            for (int i = 0; i < this.attrs.size(); i++) {
                GoodsAttrList goodsAttrList = this.attrs.get(i);
                this.attrNameList.add(goodsAttrList.getName());
                arrayList.addAll(goodsAttrList.values);
                this.attrListMap.put(goodsAttrList.getName(), goodsAttrList.getValues());
            }
            this.attrValuesArr = new GoodsAttr[arrayList.size()];
            this.attrValuesArr = (GoodsAttr[]) arrayList.toArray(this.attrValuesArr);
        }
    }

    public boolean hasDecisionFoodTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bcfc17852258c207288b97ae8ef2c37", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bcfc17852258c207288b97ae8ef2c37")).booleanValue() : isDecisionStyle() && !com.sankuai.waimai.foundation.utils.d.a(this.foodTags);
    }

    public boolean isDecisionStyle() {
        return this.style == 1;
    }

    public String getBestInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b739f7871f37b2a69fe296065a962538", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b739f7871f37b2a69fe296065a962538");
        }
        if (hasDecisionFoodTag()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.foodTags.size(); i++) {
                sb.append(this.foodTags.get(i).bestInfo);
                if (i < this.foodTags.size() - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public String getTraceInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd7570ab66c1c6839c924484ab05a53c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd7570ab66c1c6839c924484ab05a53c");
        }
        if (hasDecisionFoodTag()) {
            for (PoiFoodTag poiFoodTag : this.foodTags) {
                if (poiFoodTag.type == 14) {
                    return poiFoodTag.traceInfo;
                }
            }
            return "";
        }
        return "";
    }

    public void convertActivityExtra2GroupChatShare(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d2229b0d8e98940f880edc08acfbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d2229b0d8e98940f880edc08acfbe6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.groupChatShare = jSONObject.optString("groupChatShare");
                this.seckill = jSONObject.optInt("seckill");
            } catch (Exception unused) {
            }
        }
    }
}
