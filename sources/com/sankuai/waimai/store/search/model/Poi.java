package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.shop.model.LiveBaseInfo;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Poi implements Serializable {
    private static final int AD_TYPE_16 = 16;
    private static final int AD_TYPE_ALLOWANCE = 17;
    public static final int AD_TYPE_BRAND = 11;
    public static final int AD_TYPE_FLEXBOX_PT = 7;
    public static final int AD_TYPE_SEARCH_AD = 6;
    public static final int BUZ_CODE_FOOD = 0;
    public static final int BUZ_CODE_NOT_FOOD = 1;
    public static final int BUZ_TYPE_BRAND_FOOD = 2;
    public static final int BUZ_TYPE_DINNER = 4;
    public static final int BUZ_TYPE_DRUG = 9;
    public static final int BUZ_TYPE_QUICK_MEAL = 3;
    public static final int BUZ_TYPE_SNACK = 7;
    public static final int DELIVERY_TYPE_MEITUANZHUANSONG = 1;
    public static final int DELIVERY_TYPE_QUANCHENGSONG = 2;
    public static final int INSURANCE_TYPE_ZHUNSHIBAO = 1;
    public static final int PRODUCT_SHOW_TYPE_NONE = 3;
    public static final int PRODUCT_SHOW_TYPE_PIC = 1;
    public static final int PRODUCT_SHOW_TYPE_TAG = 2;
    public static final int RESERVATION_FOR_ONLY = 1;
    public static final int RESERVATION_OPEN = 0;
    public static final int SEARCH_RESULT_TYPE_ACCURATE = 0;
    public static final int SEARCH_RESULT_TYPE_RECOMMEND = 2;
    public static final int SEARCH_RESULT_TYPE_RELATED = 1;
    public static final int STATE_BUSY = 2;
    public static final int STATE_CLOSED = 3;
    public static final int STATE_NORMAL = 1;
    public static final int STATE_OFFLINE = 4;
    public static final String TYPE_AD = "AD";
    public static final String TYPE_SEARCH = "SEARCH";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_poi_info")
    public a adPoiInfo;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName(GearsLocator.ADDRESS)
    @Expose
    public String address;
    @SerializedName("app_delivery_tip")
    @Expose
    public String appDeliveryTip;
    @SerializedName("avg_accept_order_time")
    @Expose
    public int avgAcceptOrderTime;
    @SerializedName("avg_accept_order_time_ranking")
    @Expose
    public int avgAcceptOrderTimeRanking;
    @SerializedName("avg_delivery_time")
    @Expose
    public int avgDeliveryTime;
    @SerializedName("avg_delivery_time_ranking")
    @Expose
    public int avgDeliveryTimeRanking;
    @SerializedName("average_price_tip")
    @Expose
    public String avgPriceTip;
    @SerializedName("brand_type")
    @Expose
    public int brandType;
    @SerializedName("bulletin")
    @Expose
    public String bulletin;
    @SerializedName("buz_code")
    @Expose
    public int businessCode;
    @SerializedName("buz_type")
    @Expose
    public int businessType;
    @SerializedName("can_use_coupon")
    @Expose
    public int canUseCoupon;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("closing_tips")
    @Expose
    public String closeTips;
    @SerializedName("comment_num")
    @Expose
    public int commentNum;
    @SerializedName("search_poi_track")
    public HashMap<String, Object> complexFiledFromApi;
    @SerializedName("conflict_tags_status")
    public String currentConflictTag;
    @SerializedName("city_delivery_desc")
    public String deliveryDesc;
    @SerializedName("delivery_score")
    @Expose
    public double deliveryScore;
    @SerializedName("delivery_time_tip")
    @Expose
    public String deliveryTimeTip;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("delivery_type_icon")
    public String deliveryTypeIcon;
    @SerializedName("discounts2")
    @Expose
    public List<b> discounts;
    @SerializedName("poi_extend_status")
    @Expose
    public int extendStatus;
    @SerializedName("poi_extend_status_desc")
    @Expose
    public String extendStatusDesc;
    @SerializedName("food_score")
    @Expose
    public double foodScore;
    public boolean hasActivityShow;
    @SerializedName("search_hot_fix_track_map")
    public ApiHotfixParam hotfix;
    @SerializedName("id")
    @Expose
    @Deprecated
    public long id;
    @SerializedName("in_time_delivery_percent")
    @Expose
    public int inTimeDeliveryPercent;
    @SerializedName("in_time_delivery_percent_ranking")
    @Expose
    public int inTimeDeliveryPercentRanking;
    @SerializedName("index")
    public int index;
    @SerializedName("insurance_icon")
    public String insuranceIcon;
    @SerializedName("insurance_type")
    public int insuranceType;
    @SerializedName("invoice_support")
    @Expose
    public int invoiceSupport;
    @SerializedName("ad_mark")
    public boolean isAdMark;
    public boolean isExpand;
    public boolean isExposed;
    @SerializedName("is_favorite")
    public int isFavorite;
    public boolean isSubscribeButtonExposed;
    private boolean isSupportUseAsMoney;
    @SerializedName("label_info")
    @Expose
    public List<Object> labelInfoList;
    @SerializedName("label_on_poi_name")
    public LabelOnPoiName labelOnPoiName;
    @SerializedName("live_base_info")
    private LiveBaseInfo liveBaseInfo;
    @SerializedName("recommend_product_index_info")
    public RecommendProductIndexInfo mRecommendProductIndexInfo;
    @SerializedName("min_price_tip")
    @Expose
    public String minPriceTip;
    @SerializedName("month_sales_tip")
    @Expose
    public String monthSalesTip;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("new_promotion")
    @Expose
    public int newPromotion;
    public boolean noActivityShow;
    @SerializedName("non_delivery_reason")
    public String nonDeliveryReason;
    @SerializedName("non_lbs_time_area")
    public NonLbsEntity nonLbsEntity;
    @SerializedName("origin_shipping_fee_tip")
    @Expose
    public String originShippingFeeTip;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("pic_url")
    @Expose
    public String picUrl;
    @SerializedName("distance")
    public String poiDistance;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    @Expose
    public String poiIdStr;
    @SerializedName("poi_phone_list")
    @Expose
    public List<String> poiPhoneList;
    @SerializedName("wm_poi_score")
    @Expose
    public double poiScore;
    @SerializedName("poi_tags")
    public List<SGSearchTagInfo> poiTags;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("product_list")
    public List<ProductItemEntity> productList;
    @SerializedName("product_show_type")
    public int productShowType;
    @SerializedName("product_size")
    public int productSize;
    @SerializedName("poi_promotion_pic")
    public String promotionPicUrl;
    @SerializedName("recommend_level_list")
    @Expose
    public ArrayList<Object> recommendLevelList;
    @SerializedName("recommend_level_type")
    @Expose
    public int recommendLevelType;
    @SerializedName("recommend_list")
    @Expose
    @Deprecated
    public List<Object> recommendList;
    @SerializedName("recommend_summary")
    public RecommendSummary recommendSummary;
    @SerializedName("region_id")
    public int regionId;
    @SerializedName("remind_count")
    @Expose
    public int remindCount;
    @SerializedName("remind_tip")
    @Expose
    public String remindTip;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("search_result_type")
    public int resultType;
    @SerializedName("poi_sale_out_view")
    public SaleOutView saleOutView;
    @SerializedName("poi_delivery_content1")
    @Expose
    public String salePhone;
    @SerializedName("poi_delivery_content2")
    @Expose
    public String saleTip;
    @SerializedName("search_recommend_reason")
    public String searchRecommendReason;
    @SerializedName("self_delivery_desc")
    public String selfPickUpDesc;
    @SerializedName("only_self_delivery")
    public int selfPickUpOnly;
    @SerializedName("sg_kano_tags")
    public h sgKanoTags;
    @SerializedName("desc_content")
    @Expose
    public String shippingDesc;
    @SerializedName("shipping_fee_tip_highlight")
    public boolean shippingFeeColor;
    @SerializedName("shipping_fee_discount")
    @Expose
    public int shippingFeeDiscount;
    @SerializedName("shipping_fee_tip")
    @Expose
    public String shippingFeeTip;
    @SerializedName("status_content")
    @Expose
    public String shippingState;
    @SerializedName("shipping_time")
    @Expose
    public String shippingTime;
    @SerializedName("shipping_time_info")
    @Expose
    public k shippingTimeInfo;
    @SerializedName("search_show_type")
    public int showType;
    @SerializedName("source_type")
    public String sourceType;
    @SerializedName("status")
    @Expose
    public int status;
    @SerializedName("status_desc")
    @Expose
    public String statusDesc;
    @SerializedName("status_sub_desc")
    @Expose
    public String statusSubDesc;
    @SerializedName("subscribe")
    public int subscribe;
    @SerializedName("support_pay")
    @Expose
    public int supportOnlinePay;
    public boolean tagContainerExpanded;
    @SerializedName("use_poi_tags_field")
    public boolean usePoiTagsField;
    @SerializedName("warn_tips")
    @Expose
    public String warnTips;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LabelOnPoiName implements Serializable {
        public static final int LABEL_ON_POI_NAME_PROMOTION = 1;
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 1207504796451350471L;
        @SerializedName("label_text")
        public String labelText;
        @SerializedName("label_url")
        public String labelUrl;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("adBrandPic")
        public String a;
        @SerializedName("adBrandId")
        public String b;
        @SerializedName("ptCpmMaterial")
        public String c;
    }

    public Poi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2156e07644c39754156740c7977cf4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2156e07644c39754156740c7977cf4c");
            return;
        }
        this.tagContainerExpanded = false;
        this.isExposed = false;
        this.isExpand = false;
        this.isSubscribeButtonExposed = false;
    }

    public LiveBaseInfo getLiveBaseInfo() {
        return this.liveBaseInfo;
    }

    public boolean isPtAd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1154ed4c4b19c2f1123ed61c1a1a33dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1154ed4c4b19c2f1123ed61c1a1a33dd")).booleanValue();
        }
        if (this.adType != 7 || this.adPoiInfo == null || TextUtils.isEmpty(this.adPoiInfo.c)) {
            return false;
        }
        try {
            return !TextUtils.isEmpty(new JSONObject(this.adPoiInfo.c).optString("templateId"));
        } catch (JSONException e) {
            com.dianping.judas.util.a.a(e);
            return false;
        }
    }

    public boolean isBrandAd() {
        return this.adType == 11;
    }

    public boolean isFlexBoxPtAd() {
        return this.adType == 7;
    }

    private boolean isSearchAd() {
        return this.adType == 6;
    }

    private boolean isLabelAd() {
        return this.adType == 16;
    }

    private boolean isAllowanceAd() {
        return this.adType == 17;
    }

    public boolean isAd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b851607eec71b339328dc0fdcfa5e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b851607eec71b339328dc0fdcfa5e8")).booleanValue() : isSearchAd() || isBrandAd() || isLabelAd() || isAllowanceAd();
    }

    public boolean isShowAdIcon() {
        return this.isAdMark;
    }

    public boolean isMTDelivery() {
        return this.deliveryType == 1;
    }

    public boolean supportOnlinePay() {
        return this.supportOnlinePay == 1;
    }

    public boolean supportInvoice() {
        return this.invoiceSupport == 1;
    }

    public boolean canUseCoupon() {
        return this.canUseCoupon == 1;
    }

    public List<b> getBottomDiscounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "959dd25dd5db057d912c1be0f4991d7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "959dd25dd5db057d912c1be0f4991d7f");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.d.a(this.discounts)) {
            return arrayList;
        }
        arrayList.addAll(this.discounts);
        return arrayList;
    }

    public List<b> getTopDiscounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fdcfd96a98345097b920d86207f1a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fdcfd96a98345097b920d86207f1a18");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.d.a(this.discounts)) {
            return arrayList;
        }
        arrayList.addAll(this.discounts);
        return arrayList;
    }

    public int getReservationStatus() {
        if (this.shippingTimeInfo == null) {
            return 0;
        }
        return this.shippingTimeInfo.c;
    }

    public String getShippingState() {
        return this.shippingTimeInfo == null ? "" : this.shippingTimeInfo.a;
    }

    public String getShippingDesc() {
        return this.shippingTimeInfo == null ? "" : this.shippingTimeInfo.b;
    }

    public boolean isSupportUseAsMoney() {
        return this.isSupportUseAsMoney;
    }

    public void setIsSupportUseAsMoney(boolean z) {
        this.isSupportUseAsMoney = z;
    }

    public boolean isAccurateResult() {
        return this.resultType == 0;
    }

    public boolean isRelatedResult() {
        return 1 == this.resultType;
    }

    public boolean isRecommendResult() {
        return 2 == this.resultType;
    }

    public boolean isFood() {
        return this.businessType == 2 || this.businessType == 7 || this.businessType == 4 || this.businessType == 3;
    }

    public String getOfficialPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd8c7839b10424ee5d2db2f62567de0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd8c7839b10424ee5d2db2f62567de0a");
        }
        if (!TextUtils.isEmpty(this.poiIdStr)) {
            return this.poiIdStr;
        }
        return String.valueOf(this.id);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b09e0676fe0a5231104c36c1753184a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b09e0676fe0a5231104c36c1753184a0")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Poi poi = (Poi) obj;
        if (t.a(poi.poiIdStr) || t.a(this.poiIdStr)) {
            return this.id == poi.id;
        }
        return TextUtils.equals(poi.poiIdStr, this.poiIdStr);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20c34f5fe21a3232423c88c4afa986bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20c34f5fe21a3232423c88c4afa986bb")).intValue();
        }
        if (!t.a(this.poiIdStr)) {
            return this.poiIdStr.hashCode();
        }
        return (int) (this.id ^ (this.id >>> 32));
    }
}
