package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.s;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.store.mach.poitag.PoiLabelInfoListItem;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiItem;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.view.price.bean.UnifyPrice;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsSpu extends PoiItem implements Serializable {
    public static final int ACTIVITY_TYPE_DISCOUNT = 1;
    public static final int ACTIVITY_TYPE_EXCHANGE = 146;
    public static final int ACTIVITY_TYPE_GOODS_COUPON = 7;
    public static final int ACTIVITY_TYPE_LIMIT_REDUCTION = 4;
    public static final int ACTIVITY_TYPE_NEW_CUSTOMER = 5;
    public static final int ACTIVITY_TYPE_NONE = 0;
    public static final int ACTIVITY_TYPE_NX = 2;
    public static final int ACTIVITY_TYPE_PLUS_BUY = 6;
    public static final int ACTIVITY_TYPE_XM = 8;
    public static final int BOTTOM_SKU_DIALOG_B2C = 2;
    public static final int BOTTOM_SKU_DIALOG_O2O = 1;
    public static final String ITEM_COLLECTION_REDEEM = "item_collection_redeem";
    public static final int PICTURE_LABEL_STATUS_ICED = 10;
    public static final int SALE_TYPE_NORMAL = 0;
    public static final int SALE_TYPE_PLACE_ORDER = 1;
    public static final int SALE_TYPE_PRE_SALE = 2;
    public static final int SALE_TYPE_WARM_UP = 3;
    public static final int STATUS_ACTIVITY_SOLD_OUT = 2;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_REMOVED = -1;
    public static final int STATUS_SOLD_OUT = 1;
    public static final int STATUS_UNSELLABLE = 3;
    public static final int TRADE_TYPE_INSTALLMENT = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activityUuid")
    public String activityID;
    @SerializedName("activity_info")
    public StoreActivityInfo activityInfo;
    @SerializedName("activity_policy")
    public ActivityPolicy activityPolicy;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("activity_tag_id")
    public String activityTagId;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("atmosphere_pic")
    public String atmospherePic;
    private Map<String, List<GoodsAttr>> attrListMap;
    private List<String> attrNameList;
    @SerializedName("attrs")
    public List<GoodsAttrList> attrs;
    public String bridgeConfigExtra;
    public String categoryTag;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("coupon_identity")
    public String couponIdentity;
    public transient int couponPageSource;
    @SerializedName("cover_url")
    public String coverUrl;
    @SerializedName("delivery_info")
    public SpuDeliveryInfo deliveryInfo;
    @SerializedName("delivery_time_show")
    public String deliveryTimeShow;
    @SerializedName("description")
    public String description;
    @SerializedName("detail_scheme")
    public String detailScheme;
    @SerializedName("dynamic_act_labels")
    public List<d> dynamicActLabels;
    @SerializedName("exchange_price")
    public double exchangePrice;
    @SerializedName("exchange_price_str")
    public String exchangePriceStr;
    @SerializedName("exist_combo")
    public boolean existCombo;
    @SerializedName("flash_sale_label")
    public String flashSaleLabel;
    @SerializedName("food_label_pic")
    public String foodLabelPic;
    @SerializedName("food_menu_label")
    public GoodsRecipeInfo foodMenuLabel;
    @SerializedName("activity_act_text")
    public String freegetText;
    @SerializedName("freeget_url")
    public String freegetUrl;
    @SerializedName("friends_nickname_praise_content")
    public String friendsNickNamePraiseContent;
    @SerializedName("friends_praise_content")
    public String friendsPraiseContent;
    @SerializedName("log_field")
    private GoodsLogField goodLogField;
    @SerializedName("product_label_picture")
    private String goodsLabelUrl;
    @SerializedName("hand_price_info")
    public HandPriceInfo handPriceInfo;
    @SerializedName("hot_sale_activity_label")
    public List<String> hotSaleActivityLabel;
    @SerializedName("icon_ahead_name")
    public IconAheadName iconAheadName;
    public transient String iconTypes;
    @SerializedName("id")
    public long id;
    @SerializedName("in_cart_count")
    public int inCartCount;
    @SerializedName("is_ad")
    public boolean isAd;
    public transient boolean isEmptySpu;
    @SerializedName("is_freeget")
    public boolean isFreeget;
    public boolean isRecommendMatched;
    @SerializedName("join_member_info")
    public SpuJoinInfo joinInfo;
    @SerializedName("kano_label")
    public KanoSpuLabel kanoSpuLabel;
    @SerializedName("label_info")
    public ArrayList<PoiLabelInfoListItem> labelInfoList;
    @SerializedName("label_text")
    public String labelText;
    @SerializedName("like_ratio_desc")
    public String likeRatio;
    @SerializedName("product_frame")
    public AtmosphereMapFrame mAtmosphereMapFrame;
    @SerializedName("buz_type")
    public int mBuzType;
    @SerializedName("price_opt_ab")
    public PriceOptAB mPriceOptAB;
    @SerializedName("purchased_type")
    public int mPurchasedType;
    @SerializedName("status_remind_list")
    public List<GoodsRemind> mRemindList;
    @SerializedName("sale_type")
    public int mSaleType;
    @SerializedName("single_standard_price_suffix")
    public String mSingleStandardPriceSuffix;
    @SerializedName("product_under_label")
    public TopNumberAndPrivacyTag mTopNumberAndPrivacyTag;
    @SerializedName("main_skus")
    public List<Long> mainSkus;
    @SerializedName("member_hint")
    public String memberHintTex;
    @SerializedName("member_icon")
    public String memberIcon;
    @SerializedName("member_price")
    public double memberPrice;
    @SerializedName("min_price")
    public double minPrice;
    @SerializedName("month_saled")
    public int monthSaled;
    @SerializedName("month_saled_content")
    public String monthSaledContent;
    public transient MrnExtension mrnExtension;
    @SerializedName("multi_product_discount_info")
    public DrugMultiDisCountInfo multiProductDiscountInfo;
    @SerializedName("name")
    public String name;
    @SerializedName("name_tag_icon_url")
    public String nameTagIcon;
    @SerializedName("not_show_recommend_region")
    public boolean notShowRecommendRegion;
    @SerializedName("order_param")
    public String orderParam;
    @SerializedName("origin_price")
    @Deprecated
    public double originPrice;
    @SerializedName("tag")
    public String physicalTag;
    @SerializedName("picture")
    public String picture;
    @SerializedName("pictures")
    public List<String> pictures;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String poiDetailScheme;
    @SerializedName("poi_notifications")
    public ArrayList<PoiNotification> poiNotifications;
    @SerializedName("poi_primary_business")
    public long poiPrimary;
    @SerializedName("praise_content")
    public String praiseContent;
    @SerializedName("praise_num")
    public int praiseNum;
    @SerializedName("praise_num_new")
    public int praiseNumNew;
    @SerializedName("praise_rate")
    public String praiseRate;
    @SerializedName("presale_delivery_time")
    public long presaleDeliveryTime;
    @SerializedName("presale_show_info")
    public PresaleInfo presaleInfo;
    @SerializedName("price_hidden")
    public int priceHidden;
    @SerializedName("product_attr_label")
    public ProductAttrLabel productAttrLabel;
    @SerializedName("product_label_picture_list")
    public List<a> productLabelPictureList;
    @SerializedName("product_labels")
    public List<String> productLabels;
    @SerializedName("product_top_labels")
    public List<GoodTopLabel> productTopLabels;
    @SerializedName(ICashierJSHandler.KEY_PROMOTION)
    public GoodsPromotion promotion;
    @SerializedName("promotion_info")
    public String promotionInfo;
    @SerializedName("promotion_label")
    public String promotionLabel;
    @SerializedName("labels_under_name")
    public List<GoodPropertyLabel> propertyLabels;
    @SerializedName("rank_extend")
    public String rankExtend;
    @SerializedName("rank_num_label")
    public String rankNumPic;
    @SerializedName("rank_trace_id")
    public String rankTraceId;
    @SerializedName("prior_type")
    public String recall;
    @SerializedName("recommend_description")
    public String recommendDescription;
    public transient RecommendPair recommendPair;
    @SerializedName("recommend_reason")
    public String recommendReason;
    @SerializedName("sku_attrs_map")
    public Map<Long, List<SGGoodSkuAttr>> serverSkuAttrsMap;
    @SerializedName("shareActivityUuid")
    public String shareActivityUuid;
    @SerializedName("share_tip")
    public SCShareTip shareTip;
    @SerializedName("shipping_time")
    public long shippingTime;
    @SerializedName("shipping_time_str")
    public String shippingTimeStr;
    @SerializedName("show_name")
    public String showName;
    @SerializedName("similar_spu_list")
    public List<GoodsSpu> similarSpuList;
    @SerializedName("sku")
    public GoodsSku sku;
    private transient Map<Long, Map<String, SGGoodSkuAttr>> skuAttrsMap;
    @SerializedName("sku_label")
    public String skuLabel;
    @SerializedName("sku_type")
    public int skuType;
    @SerializedName("skus")
    public List<GoodsSku> skus;
    @SerializedName("spu_attrs")
    public List<SGGoodSpuAttr> spuAttrsList;
    public int spuSearchType;
    @SerializedName("single_standard_price")
    public String standardPrice;
    @SerializedName("status")
    public int status;
    @SerializedName("status_description")
    public String statusDescription;
    public transient String stid;
    @SerializedName("stock_label")
    public String stockLabel;
    @SerializedName("subscribe")
    public int subscribe;
    @SerializedName("to_be_member_price")
    public String toBeMemberPrice;
    @SerializedName("total_stock_label")
    public String totalStockLabel;
    @SerializedName("trade_attr_label")
    public TradeAttrLabel tradeAttrLabel;
    @SerializedName("trade_type")
    public int tradeType;
    @SerializedName("tread_num")
    public int treadNum;
    @SerializedName("underline_price")
    public String underlinePrice;
    @SerializedName("unify_price")
    public UnifyPrice unifyPrice;
    @SerializedName("unit")
    public String unit;
    @SerializedName("vague_picture")
    public String vaguePicture;
    @SerializedName("video_icon_url")
    public String videoIconUrl;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DrugMultiDisCountInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("lowest_unit_price")
        public double lowestUnitPrice;
        @SerializedName("product_amount")
        public int productAmount;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class IconAheadName implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int height;
        @SerializedName("label_type")
        public int labelType;
        @SerializedName("picture_url")
        public String pictureUrl;
        public int width;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class KanoExtensionInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("innershop_double_feed_bottom_tag_url")
        public String innershopDoubleFeedBottomTagUrl;
        @SerializedName("is_show_product_image_bottom_tag")
        public boolean isShowProductImageBottomTag;
        @SerializedName("product_image_bottom_tag_color")
        public String productImageBottomTagColor;
        @SerializedName("product_image_bottom_tag_url")
        public String productImageBottomTagUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class KanoSpuLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("drug_product_store_area")
        public List<d> amountSaleTips;
        @SerializedName("drug_search_rec")
        public List<d> drugSearchRecTag;
        @SerializedName("kano_tag_extension")
        public KanoExtensionInfo extensionInfo;
        @SerializedName("drug_product_name_before")
        public List<d> frontOfNameTag;
        @SerializedName("drug_product_icon_left_up")
        public List<d> topLeftOfIconTag;
        @SerializedName("drug_product_price_up")
        public List<d> topOfPriceTag;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PresaleInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("delivery_time_show")
        public String content;
        @SerializedName("header_text")
        public String header;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TradeAttrLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 2773433423426092559L;
        @SerializedName("picture_url")
        public String pictureUrl;
    }

    public static int getStatusActivitySoldOut() {
        return 2;
    }

    public GoodsSpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2f44ff64521fdfa7840594d18a59795", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2f44ff64521fdfa7840594d18a59795");
            return;
        }
        this.id = -1L;
        this.memberPrice = -1.0d;
        this.pictures = new ArrayList();
        this.mSaleType = 0;
        this.spuSearchType = -999;
    }

    public static GoodsSpu createEmptySpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f19f624f0f2c99ef2ca8d7974cd1a9d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f19f624f0f2c99ef2ca8d7974cd1a9d4");
        }
        GoodsSpu goodsSpu = new GoodsSpu();
        goodsSpu.isEmptySpu = true;
        return goodsSpu;
    }

    public Map<Long, Map<String, SGGoodSkuAttr>> getClientSkuAttrsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d482c4005432bffd2df14c3ee70717e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d482c4005432bffd2df14c3ee70717e6");
        }
        initClientSkuAttrsMapIfNecessary();
        return this.skuAttrsMap;
    }

    private void initClientSkuAttrsMapIfNecessary() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "572554dbbbb56d86f8ca54c13d25e2b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "572554dbbbb56d86f8ca54c13d25e2b8");
        } else if (this.skuAttrsMap == null) {
            this.skuAttrsMap = new HashMap();
            if (this.serverSkuAttrsMap == null || this.serverSkuAttrsMap.isEmpty()) {
                return;
            }
            for (Long l : this.serverSkuAttrsMap.keySet()) {
                List<SGGoodSkuAttr> list = this.serverSkuAttrsMap.get(l);
                if (l != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                    HashMap hashMap = new HashMap();
                    for (SGGoodSkuAttr sGGoodSkuAttr : list) {
                        hashMap.put(sGGoodSkuAttr.name, sGGoodSkuAttr);
                    }
                    this.skuAttrsMap.put(l, hashMap);
                }
            }
        }
    }

    public boolean isDisplaySubscribe() {
        return this.subscribe > 0;
    }

    public boolean canSubscribe() {
        return this.subscribe == 1;
    }

    public boolean isNXActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9c831207e1c623891468dc6f7df72de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9c831207e1c623891468dc6f7df72de")).booleanValue() : (this.activityType != 2 || this.activityPolicy == null || this.activityPolicy.getDiscountByCount() == null) ? false : true;
    }

    public boolean hasAttr(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a80e9cdd17bab9b8f65f3fe61a680329", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a80e9cdd17bab9b8f65f3fe61a680329")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74d7fa8fa55fd2160f3e02350f028c4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74d7fa8fa55fd2160f3e02350f028c4d")).booleanValue();
        }
        if (this.skus == null || this.skus.size() <= 1) {
            return this.attrs != null && this.attrs.size() > 0;
        }
        return true;
    }

    private List<String> stringArrayToList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fa6407b8c35056c68270442e9876559", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fa6407b8c35056c68270442e9876559");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    public long getCycleSkuId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "001a637ca525b0e179bb256f3c85ccb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "001a637ca525b0e179bb256f3c85ccb1")).longValue();
        }
        GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.skus, 0);
        if (goodsSku != null) {
            return goodsSku.id;
        }
        return 0L;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54ec196e0487fc59a0ee778c748f5db2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54ec196e0487fc59a0ee778c748f5db2")).intValue();
        }
        if (isNXActivity()) {
            return Math.round(i / this.activityPolicy.getDiscountByCount().getCount());
        }
        return 0;
    }

    public boolean isShowOriginalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85566aecd635b42247df00ac943403c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85566aecd635b42247df00ac943403c8")).booleanValue();
        }
        if (this.skus == null || this.skus.size() <= 0) {
            return false;
        }
        if ((this.skus.size() <= 1 || isManySkuPriceAllSame()) && this.activityType != 6) {
            GoodsSku goodsSku = this.skus.get(0);
            if (!p.a(this.handPriceInfo) && this.handPriceInfo.isShowNewStyle()) {
                if (goodsSku.getOriginPrice() > 0.0d && goodsSku.getOriginPrice() != this.handPriceInfo.getHandActivityPrice()) {
                    return true;
                }
            } else if (goodsSku.getOriginPrice() > 0.0d && goodsSku.getOriginPrice() != goodsSku.getPrice()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isManySkuPriceAllSame() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee01dffd0a01d3c9766f307e814968a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee01dffd0a01d3c9766f307e814968a6")).booleanValue();
        }
        if (this.skus == null || this.skus.size() <= 1) {
            return true;
        }
        GoodsSku goodsSku = null;
        for (GoodsSku goodsSku2 : this.skus) {
            if (goodsSku2 != null) {
                if (goodsSku == null) {
                    goodsSku = goodsSku2;
                } else if (!i.a(Double.valueOf(goodsSku.price), Double.valueOf(goodsSku2.price)) || !i.a(Double.valueOf(goodsSku.originPrice), Double.valueOf(goodsSku2.originPrice))) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getVipPrice() {
        return this.memberPrice;
    }

    public String getMemberHintTex() {
        return this.memberHintTex;
    }

    public double getOriginPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "085702148744cc06b9659a4dcf5f828c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "085702148744cc06b9659a4dcf5f828c")).doubleValue();
        }
        if (isShowOriginalPrice()) {
            return this.skus.get(0).getOriginPrice();
        }
        return -1.0d;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8eed49053e3afb648b92fd5fe61bd9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8eed49053e3afb648b92fd5fe61bd9c");
            return;
        }
        try {
            this.id = jSONObject.optLong("id", 0L);
            String str = null;
            this.physicalTag = jSONObject.optString("tag", null);
            this.name = jSONObject.optString("name", "");
            this.showName = jSONObject.optString("show_name", "");
            this.notShowRecommendRegion = jSONObject.optBoolean("not_show_recommend_region", false);
            this.labelText = jSONObject.optString("label_text", "");
            this.minPrice = jSONObject.optDouble("min_price", 0.0d);
            this.standardPrice = jSONObject.optString("single_standard_price", "");
            this.underlinePrice = jSONObject.optString("underline_price", "");
            this.toBeMemberPrice = jSONObject.optString("to_be_member_price", "");
            this.originPrice = jSONObject.optDouble("origin_price", 0.0d);
            this.memberPrice = jSONObject.optDouble("member_price", -1.0d);
            this.memberIcon = jSONObject.optString("member_icon", "");
            this.memberHintTex = jSONObject.optString("member_hint", "");
            this.praiseNum = jSONObject.optInt("praise_num", 0);
            this.treadNum = jSONObject.optInt("tread_num", 0);
            this.praiseNumNew = jSONObject.optInt("praise_num_new", 0);
            this.monthSaled = jSONObject.optInt("month_saled", 0);
            this.isFreeget = jSONObject.optBoolean("is_freeget", false);
            this.freegetUrl = jSONObject.optString("freeget_url", "");
            this.freegetText = jSONObject.optString("activity_act_text", "");
            this.activityID = jSONObject.optString("activityUuid", "");
            this.unit = jSONObject.optString("unit", "份");
            this.mSingleStandardPriceSuffix = jSONObject.optString("single_standard_price_suffix", "");
            this.description = jSONObject.optString("description", "");
            this.picture = jSONObject.optString("picture", "");
            this.coverUrl = jSONObject.optString("cover_url", "");
            this.detailScheme = jSONObject.optString("detail_scheme", "");
            JSONArray optJSONArray = jSONObject.optJSONArray("pictures");
            for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                this.pictures.add(optJSONArray.optString(i));
            }
            this.status = jSONObject.optInt("status");
            this.promotionInfo = jSONObject.optString("promotion_info");
            this.promotion = new GoodsPromotion();
            this.promotion.fromJson(jSONObject.optJSONObject(ICashierJSHandler.KEY_PROMOTION));
            this.activityTag = jSONObject.optString("activity_tag");
            this.skuLabel = jSONObject.optString("sku_label");
            this.statusDescription = jSONObject.optString("status_description");
            String optString = jSONObject.optString("product_under_label");
            if (!t.a(optString)) {
                this.mTopNumberAndPrivacyTag = (TopNumberAndPrivacyTag) com.sankuai.waimai.store.util.i.a(optString, new TypeToken<TopNumberAndPrivacyTag>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.1
                }.getType());
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("status_remind_list");
            this.mRemindList = new ArrayList();
            for (int i2 = 0; optJSONArray2 != null && i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                GoodsRemind goodsRemind = new GoodsRemind();
                goodsRemind.parseJson(optJSONObject);
                this.mRemindList.add(goodsRemind);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("skus");
            this.skus = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i3);
                GoodsSku goodsSku = new GoodsSku();
                goodsSku.parseJson(optJSONObject2);
                this.skus.add(goodsSku);
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("attrs");
            if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                this.attrListMap = new HashMap();
                this.attrs = new ArrayList();
                this.attrNameList = new ArrayList();
                for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                    JSONObject optJSONObject3 = optJSONArray4.optJSONObject(i4);
                    String optString2 = optJSONObject3.optString("name");
                    this.attrNameList.add(optString2);
                    GoodsAttrList goodsAttrList = new GoodsAttrList();
                    goodsAttrList.parseJson(optJSONObject3);
                    this.attrs.add(goodsAttrList);
                    this.attrListMap.put(optString2, goodsAttrList.getValues());
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("share_tip");
            if (optJSONObject4 != null && optJSONObject4.length() > 0) {
                this.shareTip = new SCShareTip();
                this.shareTip.parseJson(optJSONObject4);
            }
            this.poiPrimary = jSONObject.optLong("poi_primary_business", 0L);
            this.praiseContent = jSONObject.optString("praise_content", "");
            this.monthSaledContent = jSONObject.optString("month_saled_content", "");
            this.praiseRate = jSONObject.optString("praise_rate", "");
            this.activityType = jSONObject.optInt("activity_type", -1);
            this.mSaleType = jSONObject.optInt("sale_type", 0);
            JSONObject optJSONObject5 = jSONObject.optJSONObject("activity_policy");
            this.activityPolicy = new ActivityPolicy();
            this.activityPolicy.parseJson(optJSONObject5);
            this.friendsPraiseContent = jSONObject.optString("friends_praise_content");
            this.friendsNickNamePraiseContent = jSONObject.optString("friends_nickname_praise_content");
            this.foodMenuLabel = (GoodsRecipeInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("food_menu_label"), GoodsRecipeInfo.class);
            this.goodsLabelUrl = jSONObject.optString("product_label_picture");
            JSONArray optJSONArray5 = jSONObject.optJSONArray("product_label_picture_list");
            this.productLabelPictureList = new ArrayList();
            for (int i5 = 0; optJSONArray5 != null && i5 < optJSONArray5.length(); i5++) {
                JSONObject optJSONObject6 = optJSONArray5.optJSONObject(i5);
                a aVar = new a();
                Object[] objArr2 = {optJSONObject6};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "702d95908d65a1ed1a746c824d6c1af5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "702d95908d65a1ed1a746c824d6c1af5");
                } else {
                    try {
                        aVar.c = optJSONObject6.optInt("width");
                        aVar.d = optJSONObject6.optInt("height");
                        aVar.b = optJSONObject6.optString("picture_url", "");
                        aVar.e = optJSONObject6.optInt("label_type");
                        aVar.f = optJSONObject6.optInt("location", 0);
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
                this.productLabelPictureList.add(aVar);
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
            this.atmospherePic = jSONObject.optString("atmosphere_pic");
            this.activityTagId = jSONObject.optString("activity_tag_id");
            String optString3 = jSONObject.optString("activity_info");
            if (!TextUtils.isEmpty(optString3)) {
                this.activityInfo = new StoreActivityInfo();
                this.activityInfo.parseJson(optString3);
            }
            String optString4 = jSONObject.optString("delivery_info");
            if (!TextUtils.isEmpty(optString4)) {
                this.deliveryInfo = new SpuDeliveryInfo();
                this.deliveryInfo.parseJson(optString4);
            }
            String optString5 = jSONObject.optString("join_member_info");
            if (!TextUtils.isEmpty(optString5)) {
                this.joinInfo = new SpuJoinInfo();
                this.joinInfo.parseJson(optString5);
            }
            this.recommendDescription = jSONObject.optString("recommend_description");
            this.foodLabelPic = jSONObject.optString("food_label_pic");
            this.rankNumPic = jSONObject.optString("rank_num_label");
            this.flashSaleLabel = jSONObject.optString("flash_sale_label");
            this.videoIconUrl = jSONObject.optString("video_icon_url");
            this.stockLabel = jSONObject.optString("stock_label");
            this.likeRatio = jSONObject.optString("like_ratio_desc");
            this.subscribe = jSONObject.optInt("subscribe");
            this.mBuzType = jSONObject.optInt("buz_type");
            this.mPurchasedType = jSONObject.optInt("purchased_type");
            this.spuAttrsList = (List) com.sankuai.waimai.store.util.i.a().fromJson(jSONObject.optString("spu_attrs"), new TypeToken<ArrayList<SGGoodSpuAttr>>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.3
            }.getType());
            this.serverSkuAttrsMap = (Map) com.sankuai.waimai.store.util.i.a().fromJson(jSONObject.optString("sku_attrs_map"), new TypeToken<HashMap<Long, ArrayList<SGGoodSkuAttr>>>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.4
            }.getType());
            String optString6 = jSONObject.optString("hand_price_info");
            if (!t.a(optString6)) {
                this.handPriceInfo = (HandPriceInfo) com.sankuai.waimai.store.util.i.a(optString6, new TypeToken<HandPriceInfo>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.5
                }.getType());
            }
            String optString7 = jSONObject.optString("extension");
            if (!TextUtils.isEmpty(optString7)) {
                this.mrnExtension = (MrnExtension) com.sankuai.waimai.store.util.i.a().fromJson(optString7, new TypeToken<MrnExtension>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.6
                }.getType());
            }
            String optString8 = jSONObject.optString("product_frame");
            if (!TextUtils.isEmpty(optString8)) {
                this.mAtmosphereMapFrame = (AtmosphereMapFrame) com.sankuai.waimai.store.util.i.a().fromJson(optString8, (Class<Object>) AtmosphereMapFrame.class);
            }
            this.recommendReason = jSONObject.optString("recommend_reason");
            this.productTopLabels = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("product_top_labels"), new TypeToken<List<GoodTopLabel>>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.7
            }.getType());
            parseProductLabels(jSONObject);
            this.promotionLabel = jSONObject.optString("promotion_label");
            this.isAd = jSONObject.optBoolean("is_ad");
            this.chargeInfo = jSONObject.optString("charge_info");
            this.nameTagIcon = jSONObject.optString("name_tag_icon_url");
            this.productAttrLabel = (ProductAttrLabel) com.sankuai.waimai.store.util.i.a(jSONObject.optString("product_attr_label"), new TypeToken<ProductAttrLabel>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.8
            }.getType());
            this.deliveryTimeShow = jSONObject.optString("delivery_time_show");
            String optString9 = jSONObject.optString("presale_show_info");
            if (!TextUtils.isEmpty(optString9)) {
                this.presaleInfo = (PresaleInfo) com.sankuai.waimai.store.util.i.a(optString9, PresaleInfo.class);
            }
            this.presaleDeliveryTime = jSONObject.optLong("presale_delivery_time");
            String optString10 = jSONObject.optString("icon_ahead_name");
            if (!TextUtils.isEmpty(optString10)) {
                this.iconAheadName = (IconAheadName) com.sankuai.waimai.store.util.i.a(optString10, IconAheadName.class);
            }
            this.existCombo = jSONObject.optBoolean("exist_combo");
            String optString11 = jSONObject.optString("kano_label");
            if (!TextUtils.isEmpty(optString11)) {
                this.kanoSpuLabel = (KanoSpuLabel) com.sankuai.waimai.store.util.i.a(optString11, new TypeToken<KanoSpuLabel>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.9
                }.getType());
            }
            this.hotSaleActivityLabel = stringArrayToList(jSONObject.optJSONArray("hot_sale_activity_label"));
            this.dynamicActLabels = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("dynamic_act_labels"), new TypeToken<List<d>>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.10
            }.getType());
            this.totalStockLabel = jSONObject.optString("total_stock_label");
            this.orderParam = jSONObject.optString("order_param", "");
            this.unifyPrice = (UnifyPrice) com.sankuai.waimai.store.util.i.a(jSONObject.optString("unify_price"), UnifyPrice.class);
            String optString12 = jSONObject.optString("trade_attr_label");
            if (!TextUtils.isEmpty(optString12)) {
                this.tradeAttrLabel = (TradeAttrLabel) com.sankuai.waimai.store.util.i.a(optString12, new TypeToken<TradeAttrLabel>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu.2
                }.getType());
            }
            this.tradeType = jSONObject.optInt("trade_type", 0);
            this.shippingTimeStr = jSONObject.optString("shipping_time_str", "");
            this.shippingTime = jSONObject.optLong("shipping_time", 0L);
            this.priceHidden = jSONObject.optInt("price_hidden", 0);
            String optString13 = jSONObject.optString("price_opt_ab");
            if (!TextUtils.isEmpty(optString13)) {
                this.mPriceOptAB = (PriceOptAB) com.sankuai.waimai.store.util.i.a(optString13, PriceOptAB.class);
            }
            String optString14 = jSONObject.optString("multi_product_discount_info");
            if (!TextUtils.isEmpty(optString14)) {
                this.multiProductDiscountInfo = (DrugMultiDisCountInfo) com.sankuai.waimai.store.util.i.a(optString14, DrugMultiDisCountInfo.class);
            }
            this.vaguePicture = jSONObject.optString("vague_picture", "");
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
        }
    }

    private void parseProductLabels(@NonNull JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5aaaf62f1e62135fa00266eb20ee86e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5aaaf62f1e62135fa00266eb20ee86e");
            return;
        }
        this.propertyLabels = null;
        JSONArray optJSONArray = jSONObject.optJSONArray("labels_under_name");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        this.propertyLabels = new LinkedList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2.optInt("label_type") > 0) {
                this.propertyLabels.add(GoodPropertyLabel.parseData(jSONObject2));
            }
        }
    }

    /* renamed from: clone */
    public GoodsSpu m21clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3133677d402f8867b68249b9de3209c", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3133677d402f8867b68249b9de3209c") : (GoodsSpu) s.a(this);
    }

    public SCShareTip getShareTip() {
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

    public String getStandardPriceUnit() {
        return this.mSingleStandardPriceSuffix;
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

    public int getStatus() {
        return this.status;
    }

    public List<GoodsSku> getSkuList() {
        return this.skus;
    }

    public List<String> getAttrNameList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b924a47342d68ba0a894595f991c8bef", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b924a47342d68ba0a894595f991c8bef");
        }
        if (initAttrListMap()) {
            return this.attrNameList;
        }
        return null;
    }

    public String getActivityTag() {
        return this.activityTag;
    }

    public Map<String, List<GoodsAttr>> getAttrList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fd4c0aa3f4b95270a01b2b0eecc0290", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fd4c0aa3f4b95270a01b2b0eecc0290");
        }
        if (initAttrListMap()) {
            return this.attrListMap;
        }
        return null;
    }

    private boolean initAttrListMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b44e1c816f16d81f042cdc8e9f2d1e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b44e1c816f16d81f042cdc8e9f2d1e6b")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        if (this.attrListMap != null) {
            return true;
        }
        this.attrListMap = new HashMap();
        this.attrNameList = new ArrayList();
        for (int i = 0; i < this.attrs.size(); i++) {
            GoodsAttrList goodsAttrList = this.attrs.get(i);
            this.attrNameList.add(goodsAttrList.getName());
            this.attrListMap.put(goodsAttrList.getName(), goodsAttrList.getValues());
        }
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

    public void setGoodsLabelUrl(String str) {
        this.goodsLabelUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setActivityTag(String str) {
        this.activityTag = str;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c9c056f7179a37ef2ab085c3e72be5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c9c056f7179a37ef2ab085c3e72be5c");
        } else {
            this.minPrice = d;
        }
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfaa6d7cb34f6826f1276648495f96f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfaa6d7cb34f6826f1276648495f96f8");
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

    public List<a> getGoodsLabelUrlsList() {
        return this.productLabelPictureList;
    }

    public ArrayList<PoiNotification> getPoiNotifications() {
        return this.poiNotifications;
    }

    public GoodsLogField getGoodLogField() {
        return this.goodLogField;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.PoiItem, com.sankuai.waimai.store.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return this.categoryTag;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
        this.categoryTag = str;
    }

    public void setPhysicalTag(String str) {
        this.physicalTag = str;
    }

    public String getPhysicalTag() {
        return this.physicalTag;
    }

    public int getRecipeMenuTypeForJudas() {
        return this.foodMenuLabel == null ? 2 : 1;
    }

    public boolean hasAttr(List<GoodsAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "993c09a365aa412b535c1ed940748836", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "993c09a365aa412b535c1ed940748836")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7a1b8e4e5f8029cc1e9d6408643f7ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7a1b8e4e5f8029cc1e9d6408643f7ee")).booleanValue();
        }
        if (this.attrs == null) {
            return false;
        }
        if (com.sankuai.shangou.stone.util.a.b(goodsAttrArr)) {
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

    public void setShareActivityId(String str) {
        this.shareActivityUuid = str;
    }

    public GoodsAttr[] getFirstGoodAttr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15dcac9705cef9987ea34df24faaccf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15dcac9705cef9987ea34df24faaccf7");
        }
        GoodsAttr[] goodsAttrArr = null;
        Map<String, List<GoodsAttr>> attrList = getAttrList();
        if (attrList != null && attrList.size() > 0) {
            goodsAttrArr = new GoodsAttr[attrList.size()];
            int i = 0;
            for (String str : getAttrNameList()) {
                List<GoodsAttr> list = attrList.get(str);
                if (list != null) {
                    for (GoodsAttr goodsAttr : list) {
                        if (goodsAttr != null && goodsAttr.equals(list.get(0)) && i < goodsAttrArr.length) {
                            goodsAttrArr[i] = goodsAttr;
                        }
                    }
                    i++;
                }
            }
        }
        return goodsAttrArr;
    }

    public boolean hasManySpec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b70fe712ac6b4198cdc3abc8869f637", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b70fe712ac6b4198cdc3abc8869f637")).booleanValue() : com.sankuai.shangou.stone.util.a.c(this.skus) > 1;
    }

    public boolean hasManyAttr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59aea1a1eccff4ae47903021579ac4ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59aea1a1eccff4ae47903021579ac4ac")).booleanValue() : !com.sankuai.shangou.stone.util.a.b(this.attrs);
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

    public String getIconAheadSpuName() {
        return this.iconAheadName != null ? this.iconAheadName.pictureUrl : "";
    }

    public String getGoodsUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae8bb190e67142470ae849afcc70376", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae8bb190e67142470ae849afcc70376");
        }
        if (hasManySpec()) {
            if (i.e(Double.valueOf(getOriginPrice()), Double.valueOf(0.0d))) {
                return null;
            }
            return b.a((int) R.string.wm_sc_common_multi_goods_price_format);
        } else if (TextUtils.isEmpty(getUnit())) {
            return null;
        } else {
            return b.a((int) R.string.wm_sc_common_unit_format, getUnit());
        }
    }

    public String getDrugGoodsUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de599343375025b11749d32b8762748e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de599343375025b11749d32b8762748e");
        }
        if (!hasManySpec() || TextUtils.isEmpty(getStandardPriceUnit())) {
            if (TextUtils.isEmpty(getUnit())) {
                return null;
            }
            return b.a((int) R.string.wm_sc_common_unit_format, getUnit());
        }
        return b.a((int) R.string.wm_sc_common_unit_format, getStandardPriceUnit());
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class GoodPropertyLabel implements JsonDeserializer, Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private transient Object labelData;
        @SerializedName("label_type")
        public int type;

        @Override // com.google.gson.JsonDeserializer
        public GoodPropertyLabel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa0a991cb9f29cc099529f0fb838ae2f", RobustBitConfig.DEFAULT_VALUE)) {
                return (GoodPropertyLabel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa0a991cb9f29cc099529f0fb838ae2f");
            }
            try {
                return parseData(new JSONObject(jsonElement.toString()));
            } catch (Exception unused) {
                return null;
            }
        }

        public static GoodPropertyLabel parseData(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f2d863c88d814a22ae757c0306704a8", RobustBitConfig.DEFAULT_VALUE)) {
                return (GoodPropertyLabel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f2d863c88d814a22ae757c0306704a8");
            }
            GoodPropertyLabel goodPropertyLabel = new GoodPropertyLabel();
            int optInt = jSONObject.optInt("label_type");
            goodPropertyLabel.type = optInt;
            String optString = jSONObject.optString("label_data", "");
            switch (optInt) {
                case 101:
                    goodPropertyLabel.labelData = com.sankuai.waimai.store.util.i.a(optString, ProductAttrLabel.class);
                    break;
                case 102:
                case 105:
                default:
                    goodPropertyLabel.labelData = optString;
                    break;
                case 103:
                case 104:
                case 106:
                    goodPropertyLabel.labelData = com.sankuai.waimai.store.util.i.a(optString, GoodTopLabel.class);
                    break;
            }
            return goodPropertyLabel;
        }

        public <T> T getLabelData() {
            try {
                return (T) this.labelData;
            } catch (Exception unused) {
                return null;
            }
        }

        public boolean hasRankInfo() {
            return this.type == 103 || this.type == 104;
        }

        public int getRankInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8a388a226effa537573a47b119c98fc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8a388a226effa537573a47b119c98fc")).intValue();
            }
            try {
                GoodTopLabel goodTopLabel = (GoodTopLabel) getLabelData();
                if (goodTopLabel != null) {
                    return goodTopLabel.rankCode;
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        public String getRankText() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "748cb45a5d40e0cd7c243152e1fb139c", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "748cb45a5d40e0cd7c243152e1fb139c");
            }
            try {
                GoodTopLabel goodTopLabel = (GoodTopLabel) getLabelData();
                return goodTopLabel != null ? goodTopLabel.content : "";
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public String getActivityId() {
        GoodsSku goodsSku;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a79be98e04ac843a7a9dad30328dfe0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a79be98e04ac843a7a9dad30328dfe0") : (!com.sankuai.shangou.stone.util.a.a((Collection<?>) getSkuList()) || (goodsSku = getSkuList().get(0)) == null || goodsSku.getPromotion() == null || TextUtils.isEmpty(goodsSku.getPromotion().activityId)) ? "-999" : goodsSku.getPromotion().activityId;
    }

    public String getUPCCode() {
        GoodsSku goodsSku;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08bd383185f18789e572e93195e5fbc4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08bd383185f18789e572e93195e5fbc4") : (!com.sankuai.shangou.stone.util.a.a((Collection<?>) getSkuList()) || (goodsSku = getSkuList().get(0)) == null || TextUtils.isEmpty(goodsSku.upcCode)) ? "-999" : goodsSku.upcCode;
    }

    public String getDrugPriceExp() {
        return this.mPriceOptAB == null ? "" : this.mPriceOptAB.priceExpInfo;
    }
}
