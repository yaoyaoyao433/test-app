package com.sankuai.waimai.business.search.model;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class g implements Serializable {
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
    public static final int RESERVATION_DRUG_OVERSEA = 101;
    public static final int RESERVATION_DRUG_WAREHOUSE = 102;
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
    @SerializedName("biz_type")
    public int bizType;
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
    @SerializedName("call_poi_desc")
    public String callPoiDesc;
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
    public List<d> discounts;
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
    @SerializedName("id")
    @Expose
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
    public boolean isExposed;
    @SerializedName("is_favorite")
    public int isFavorite;
    public boolean isShowPoiRecallBubble;
    private boolean isSupportUseAsMoney;
    @SerializedName("judgeInfo")
    public Map<Integer, Boolean> judge;
    @SerializedName("label_info")
    @Expose
    public List<Object> labelInfoList;
    private boolean mIsShowDistance;
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
    public List<com.sankuai.waimai.platform.widget.tag.api.d> poiTags;
    @SerializedName("poi_trace_info")
    public Map<Integer, String> poiTraceInfo;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("product_list")
    public List<h> productList;
    @SerializedName("product_show_type")
    public int productShowType;
    @SerializedName("product_size")
    public int productSize;
    @SerializedName("poi_promotion_pic")
    public String promotionPicUrl;
    @SerializedName("recommend_level_list")
    @Expose
    public ArrayList<b> recommendLevelList;
    @SerializedName("recommend_level_type")
    @Expose
    public int recommendLevelType;
    @SerializedName("recommend_list")
    @Expose
    @Deprecated
    public List<b> recommendList;
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
    @SerializedName("desc_content")
    @Expose
    public String shippingDesc;
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
    public i shippingTimeInfo;
    @SerializedName("search_show_type")
    public int showType;
    @SerializedName("product_soldout_tips")
    public String soldOutTips;
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
    @SerializedName("stocks_reminds")
    public String stocksReminds;
    @SerializedName("support_pay")
    @Expose
    public int supportOnlinePay;
    @SerializedName("use_poi_tags_field")
    public boolean usePoiTagsField;
    @SerializedName("warn_tips")
    @Expose
    public String warnTips;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("adBrandPic")
        public String a;
        @SerializedName("adBrandId")
        public String b;
        @SerializedName("ptCpmMaterial")
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String a;
        @SerializedName("recommend_reason")
        public String b;
        @SerializedName("type")
        public int c;
        @SerializedName("content_color")
        public String d;
        @SerializedName("background_color")
        public String e;
        @SerializedName("right_icon")
        public String f;
        @SerializedName("rank_scheme")
        public String g;
        @SerializedName("rank_id")
        public String h;
        @SerializedName("view_expose_info")
        public c i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        @SerializedName("recommend_package")
        public String a;
        @SerializedName("recommend_source")
        public int b;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fad631807bf027d1a878a0a6e3197189", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fad631807bf027d1a878a0a6e3197189");
        } else {
            this.isExposed = false;
        }
    }

    public boolean isPtAd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0de3c2edb36dc7082d2dfdd26f48bedf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0de3c2edb36dc7082d2dfdd26f48bedf")).booleanValue();
        }
        if (this.adType != 7 || this.adPoiInfo == null || TextUtils.isEmpty(this.adPoiInfo.c)) {
            return false;
        }
        try {
            return !TextUtils.isEmpty(new JSONObject(this.adPoiInfo.c).optString("templateId"));
        } catch (JSONException unused) {
            return false;
        }
    }

    public boolean canDelivery() {
        Boolean bool;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "182258f674e81f79f0c896d35382894d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "182258f674e81f79f0c896d35382894d")).booleanValue();
        }
        if (this.judge == null || (bool = this.judge.get(3)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isBrandAd() {
        return this.adType == 11;
    }

    public boolean isFlexBoxPtAd() {
        return this.adType == 7;
    }

    private boolean isSearchAd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ab0f57a661eccaaaff959b05c85aedf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ab0f57a661eccaaaff959b05c85aedf")).booleanValue() : "AD".equals(this.sourceType) && this.adType == 6;
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "616d20b7a62d8e11bb847c31ea4a84bc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "616d20b7a62d8e11bb847c31ea4a84bc")).booleanValue() : isSearchAd() || isBrandAd() || isLabelAd() || isAllowanceAd();
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

    public boolean isShowDistance() {
        return this.mIsShowDistance;
    }

    public void setShowDistance(boolean z) {
        this.mIsShowDistance = z;
    }

    public List<d> getBottomDiscounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb4195fce2cae2a12dd5b75cad6d074a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb4195fce2cae2a12dd5b75cad6d074a");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.d.a(this.discounts)) {
            return arrayList;
        }
        arrayList.addAll(this.discounts);
        return arrayList;
    }

    public List<d> getTopDiscounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d94ffca6ab5339b33743ccee989c8746", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d94ffca6ab5339b33743ccee989c8746");
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

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9b36f3a151ef4ad98732e1132a1cf6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9b36f3a151ef4ad98732e1132a1cf6c")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.id == ((g) obj).id;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56da4c574c107297316f7a22a4e785ef", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56da4c574c107297316f7a22a4e785ef")).intValue() : (int) (this.id ^ (this.id >>> 32));
    }
}
