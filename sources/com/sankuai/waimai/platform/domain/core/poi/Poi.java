package com.sankuai.waimai.platform.domain.core.poi;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.platform.domain.core.poi.bean.AnimatorProductBean;
import com.sankuai.waimai.platform.domain.core.poi.bean.CustomerServiceInfo;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Poi extends DeDuplicate implements Serializable {
    public static final int BUZ_CODE_FOOD = 0;
    public static final int BUZ_TYPE_BRAND_FOOD = 2;
    public static final int BUZ_TYPE_DINNER = 4;
    public static final int BUZ_TYPE_DRUG = 9;
    public static final int BUZ_TYPE_QUICK_MEAL = 3;
    public static final int BUZ_TYPE_SNACK = 7;
    public static final int CATEGORY_FOOD = 0;
    public static final int CATEGORY_NOT_FOOD = 1;
    public static final long COUPON_ACTIVITY_TYPE_COLLECTION = 1;
    public static final long COUPON_ACTIVITY_TYPE_OTHERS = 0;
    public static final int POI_TEMPLATE_TYPE_BY_FRUIT_PAGE = 10;
    public static final int POI_TEMPLATE_TYPE_BY_PAGE = 1;
    public static final int POI_TEMPLATE_TYPE_BY_STORE_NEW_PAGE = 4;
    public static final int POI_TEMPLATE_TYPE_BY_STORE_PAGE = 3;
    public static final int POI_TEMPLATE_TYPE_NORMAL = 0;
    public static final int POI_TYPE_STORE = 1;
    public static final int POI_TYPE_WAIMAI = 0;
    public static final int RESERVATION_FOR_ONLY = 1;
    public static final int RESERVATION_OPEN = 0;
    public static final int RESTAURANT_TYPE_DECORATION = 1;
    public static final int RESTAURANT_TYPE_NORMAL = 0;
    public static final int STATE_BUSY = 2;
    public static final int STATE_CLOSED = 3;
    public static final int STATE_NORMAL = 1;
    public static final int STATE_OFFLINE = 4;
    public static final int TYPE_DRUG = 9;
    public static final int TYPE_MARKET = 14;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avg_accept_order_time")
    private int acceptOrderTime;
    @SerializedName("avg_accept_order_time_ranking")
    private int acceptOrderTimeRank;
    @SerializedName("activity_promotion_tip")
    public ActivityPromotionTip activityPromotionTip;
    private String adActivityFlag;
    @SerializedName("ad_mark")
    @Expose
    public boolean adMark;
    @SerializedName("ad_type")
    @Expose
    public int adType;
    @SerializedName(GearsLocator.ADDRESS)
    @Expose
    public String address;
    private String allowanceAllianceScenes;
    @SerializedName("animate_products")
    public List<AnimatorProductBean> animateProducts;
    @SerializedName("app_delivery_tip")
    @Expose
    public String appDeliveryTip;
    @SerializedName("average_price_tip")
    public String averagePriceTip;
    @SerializedName("avg_delivery_time_ranking")
    @Expose
    private int avgShippingTimeRank;
    public boolean bChecked;
    @SerializedName("poi_back_pic_url")
    @Expose
    public String backgroundUrl;
    private String beginShippingTime;
    public ArrayList<Integer> boldingList;
    private ArrayList<ActivityItem> bottomActivities;
    @SerializedName("brand_slogan")
    @Expose
    public String brandSlogan;
    @SerializedName("brand_slogan_url")
    @Expose
    public String brandSloganUrl;
    @SerializedName("brand_top_pic")
    @Expose
    public String brandTopPic;
    @SerializedName("brand_type")
    @Expose
    public int brandType;
    @SerializedName("bulletin")
    @Expose
    public String bulletin;
    @SerializedName("buy_sku_count_threshold")
    @Expose
    public int buySkuCountThreshold;
    @SerializedName("call_poi_desc")
    public String callPoiDesc;
    @SerializedName("can_use_coupon")
    @Expose
    public int canUseCoupon;
    private PoiShoppingCart.CartIcon cartIcon;
    public long categoryCode;
    @SerializedName("buz_code")
    @Expose
    public int categoryType;
    @SerializedName("charge_info")
    @Expose
    public String chargeInfo;
    @SerializedName("favorite_toast_appear_time")
    public int collectCouponPopupDelay;
    @SerializedName("favorite_toast_disappear_time")
    public int collectCouponPopupDuration;
    @SerializedName("comment_number")
    @Expose
    public long commentNumber;
    @SerializedName("container_template")
    public PoiContainerTemplate containerTemplate;
    @SerializedName("poi_customer_service_entrance")
    @Expose
    public CustomerServiceInfo customerServiceInfo;
    @SerializedName("avg_delivery_time")
    private int deliveryElapsedTime;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("discounts2")
    @Expose
    public ArrayList<ActivityItem> discounts;
    @SerializedName("distance")
    @Expose
    public String distance;
    @SuppressLint({"SerializableCheck"})
    public transient SpannableStringBuilder distanceAndTime;
    @SerializedName("distance_display_control")
    public int distanceDisplayControl;
    public int exposePoiState;
    @SerializedName("favorite_desc")
    public String favoriteDesc;
    public List<String> firstLineTags;
    public String formatPoiID;
    private String formattedPoiScore;
    private boolean hasCheckCoupon;
    public boolean hasCoupon;
    @SerializedName("has_favorite_coupon")
    public boolean hasFavoriteCoupon;
    @SerializedName("head_pic_url")
    @Expose
    public String headPicUrl;
    @SerializedName("visit_time")
    public long iVisiTime;
    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("img_style")
    public int imgStyle;
    @SerializedName("img_type")
    public int imgType;
    private boolean inShippingTime;
    @SerializedName("insurance_icon")
    public String insuranceIcon;
    @SerializedName("insurance_type")
    public int insuranceType;
    @SerializedName("invoice_support")
    @Expose
    public int invoiceSupport;
    public int isDislikeReasonShow;
    private boolean isHasCoupon;
    @SerializedName("in_delivery_range")
    public boolean isInDeliveryRange;
    @SerializedName("new_page_switch")
    @Expose
    public int isNewPage;
    private boolean isNewUser;
    @SerializedName("only_self_delivery")
    public int isOnlySelfDelivery;
    public boolean isSelfDelivery;
    @SerializedName("shipping_fee_discount")
    private boolean isShippingFeeDiscount;
    private boolean isShowServiceInfo;
    private boolean isShowingLayer;
    public String labelSortAndTextSizeStrategy;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    @Expose
    public int latitude;
    @SerializedName("location_tip")
    public String locationTip;
    @SerializedName("log_field")
    @Expose
    public LogField logfield;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    @Expose
    public int longitude;
    private PoiShoppingCart.ActivityInfo mActivityInfo;
    private List<PoiShoppingCart.ActivityInfo> mActivityInfoList;
    @SerializedName("ad_attr")
    public String mAdAttr;
    @SerializedName("buz_type")
    @Expose
    public int mBuzType;
    @SerializedName("closing_tips")
    private String mCloseTips;
    @SerializedName("coupon_tag_url")
    public String mCouponTagUrl;
    @SerializedName("default_search_word")
    private String mDefaultSearchWord;
    @SerializedName("delivery_info_v2")
    public DeliveryInfo mDeliveryInfo;
    @SerializedName("freego_poi_info")
    @Expose
    public FreeGoInfo mFreeGoInfo;
    @SerializedName("is_favorite")
    @Expose
    public int mIsFavorite;
    private boolean mIsSupportUseAsMoney;
    @SerializedName("label_info")
    private ArrayList<LabelInfoListItem> mLabelInfoList;
    private String mNewFunctionTips;
    @SerializedName("recommend_level_list")
    private ArrayList<RecommendListItem> mNewRecommendList;
    @SerializedName("poi_coupon")
    private PoiCouponEntity mPoiCouponEntity;
    @SerializedName("poi_decoration_type")
    public int mPoiDecorationType;
    @SerializedName("has_poi_env")
    @Expose
    public boolean mPoiEnv;
    @SerializedName("poi_impress")
    private PoiImpress mPoiImpress;
    @SerializedName("poi_label")
    private PoiLabel mPoiLabel;
    @SerializedName("poi_label_new")
    private PoiLabel mPoiLabelNew;
    @SerializedName("poi_media_info")
    public PoiMediaInfo mPoiMediaInfo;
    @SerializedName("poi_prepare_time")
    @Expose
    public String mPoiPrepareTime;
    @SerializedName("poi_service_label")
    private PoiServiceLabel mPoiServiceLabel;
    @SerializedName("poi_service")
    public ArrayList<PoiService> mPoiServices;
    private PoiShoppingCart mPoiShoppingCart;
    @SerializedName("promotion_head_pic_url")
    public String mPromotionHeadPicUrl;
    private String mPromptText;
    @SerializedName("remind_count")
    private int mRemindCount;
    @SerializedName("remind_tip")
    private String mRemindTip;
    @SerializedName("content")
    private String mReportContent;
    @SerializedName("show")
    private boolean mReportShow;
    @SerializedName("url")
    private String mReportUrl;
    private String mSelfDeliveryTip;
    private String mShippingFeeCartTip;
    private String mShopcartBgColor;
    @SerializedName("third_category")
    private String mThirdCategory;
    @SerializedName("min_price_tip")
    @Expose
    public String minPriceTip;
    @SerializedName("min_price")
    @Expose
    public double min_price;
    @SuppressLint({"SerializableCheck"})
    public transient SpannableStringBuilder monthSales;
    @SuppressLint({"SerializableCheck"})
    public transient SpannableStringBuilder monthSalesAndPriceAndShipping;
    @SerializedName("month_sales_tip")
    public String monthSalesTip;
    @SerializedName("mt_delivery_info")
    public MtDeliveryInfo mtDeliveryInfo;
    @SerializedName("delivery_time_tip")
    @Expose
    public String mtDeliveryTime;
    @SerializedName("name")
    @Expose
    public String name;
    public long navigateCode;
    @SerializedName("new_promotion")
    @Expose
    public int newPromotion;
    @SerializedName("new_user_discount_restrict")
    @Expose
    private int newUserDiscountRestrict;
    @SerializedName("new_user_discount_restrict_toast")
    @Expose
    public String newUserDiscountRestrictToast;
    @SerializedName("discount_restrict")
    @Expose
    private int numDiscountRestrict;
    @SerializedName("plus_discount_restrict")
    @Expose
    private int numPlusDiscountRestrict;
    @SerializedName("offline")
    public boolean offline;
    @SerializedName("origin_shipping_fee")
    @Expose
    public double originShippingFee;
    @SerializedName("origin_shipping_fee_tip")
    @Expose
    public String originShippingFeeTip;
    @SerializedName("origin_brand_id")
    public long origin_brand_id;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("phone_call_text")
    @Expose
    public String phoneCallPrefix;
    @SerializedName("phone_list")
    @Expose
    public ArrayList<String> phoneList;
    @SerializedName("pic_url")
    @Expose
    public String picUrl;
    @SerializedName("poi_activity_tags")
    public List<d> poiActivityTags;
    @SerializedName("poi_activity_type")
    public int poiActivityType;
    @SerializedName("poi_ad_dynamic_info")
    public PoiAdDynamicInfo poiAdDynamicInfo;
    @SerializedName("poi_base_label")
    public String[] poiBaseLabels;
    @SerializedName("poi_coupon_info")
    @Expose
    public PoiCouponInfo poiCouponInfo;
    @SerializedName("story_info")
    @Expose
    public PoiDetailStoryInfo poiDetailStoryInfo;
    @SerializedName("poi_env")
    @Expose
    public PoiEnv poiEnv;
    @SerializedName("env_protect_url")
    public PoiEnvironmentProtection poiEnvironmentProtection;
    @SerializedName("poi_extend_info_entrance")
    @Expose
    public ArrayList<PoiExtendInfo> poiExtendInfoEntrances;
    @SerializedName("poi_foodpalace_info")
    public PoiFoodPalaceInfo poiFoodPalaceInfo;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    @Expose
    public String poiIDStr;
    public int poiIndex;
    @SerializedName("poi_normal_tags")
    public List<d> poiNormalTags;
    @SerializedName("poi_promotion_pic")
    public String poiPromotionPic;
    @SerializedName("poi_qualify_info")
    public PoiQualifyInfo poiQualifyInfo;
    @SerializedName("poi_recommend_pic_url")
    public String poiRecommendPicUrl;
    @SerializedName("poi_recommend_label")
    public List<d> poiRecommendTags;
    @SerializedName("red_package_tags")
    public List<d> poiRedPackageTags;
    @SerializedName("wm_poi_score")
    @Expose
    public double poiScore;
    @SerializedName("wm_poi_score_grade_desc")
    public String poiScoreGradeDescInfo;
    @SerializedName("poi_sell_status")
    @Expose
    public int poiSellStatus;
    @SerializedName("poi_serve_tags")
    public List<d> poiServeTags;
    @SerializedName("style")
    public int poiStyle;
    @SerializedName("poi_tags")
    public List<d> poiTags;
    @SerializedName("poi_type")
    @Expose
    public int poiType;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SuppressLint({"SerializableCheck"})
    public transient SpannableStringBuilder priceAndShipping;
    @SerializedName("products")
    public List<Product> products;
    @SerializedName("regular_promotion_info")
    private PromotionInfoA promotionInfoA;
    @SerializedName("platform_promotion_info")
    private PromotionInfoS promotionInfoS;
    @SerializedName("publicity_content")
    public String publicityContent;
    @SerializedName("rank_label_info")
    private String rankLabelInfo;
    public String rankTraceId;
    @SerializedName("recommend_info")
    @Deprecated
    public RecommendInfo recommendInfo;
    @SerializedName("recommend_level_type")
    private int recommendLevelType;
    @SerializedName("recommend_tip")
    public String recommendTip;
    @SerializedName("remind_infos")
    @Expose
    public List<Remind> remindInfos;
    @SerializedName(NetLogConstants.Details.SCHEME)
    @Expose
    public String restaurantScheme;
    public String sTimeStag;
    @SerializedName("poi_delivery_content1")
    @Expose
    public String salePhone;
    @SerializedName("poi_delivery_content2")
    @Expose
    public String saleTip;
    @SerializedName("score")
    @Expose
    public double score;
    @SerializedName("self_delivery_icon")
    public String selfDeliveryIcon;
    public int seqNumber;
    @SerializedName("share_tip")
    @Expose
    public ShareTip shareTip;
    @SerializedName("shipping_fee")
    @Expose
    public double shippingFee;
    @SerializedName("shipping_fee_tip")
    @Expose
    public String shippingFeeTip;
    @SerializedName("shipping_time")
    @Expose
    public String shippingTime;
    @SerializedName("shipping_time_info")
    @Expose
    public ShippingTimeInfo shippingTimeInfo;
    @SerializedName("bottom_poi_im_info")
    public a shoppingCartPoiImInfo;
    @SerializedName("show_new_poi_coupon")
    public boolean showNewPoiCoupon;
    public List<Integer> shownRecommendTagList;
    public List<Integer> shownTagList;
    @SerializedName("single_buy_threshold")
    @Expose
    public int singleBuyThreshold;
    @SerializedName("sort_reason_tag")
    private String sortReasonTag;
    @SerializedName("sort_reason_type")
    private int sortReasonType;
    @SerializedName("status")
    @Expose
    public int state;
    @SerializedName("status_desc")
    @Expose
    public String statusDesc;
    @SerializedName("story_icon")
    public String storyIcon;
    @SerializedName("support_pay")
    @Expose
    public int supportOnlinePay;
    @SerializedName("in_time_delivery_percent")
    private int timelySendPercent;
    @SerializedName("in_time_delivery_percent_ranking")
    private int timelySendPercentRank;
    @SerializedName("restrict_toast")
    @Expose
    public String toastDiscountRestrict;
    @SerializedName("plus_discount_toast")
    @Expose
    public String toastPlusDiscountRestrict;
    @SerializedName("trade_area")
    public String tradeArea;
    @SerializedName("ugc_recommend_info")
    public String ugcRecommendInfo;
    @SerializedName("ugc_recommend_info_prefix")
    public String ugcRecommendInfoPrefix;
    @SerializedName("use_poi_normal_tags_field")
    public boolean usePoiNormalTagsField;
    @SerializedName("use_poi_tags_field")
    private boolean usePoiTagsField;
    @SerializedName("warn_tips")
    private String warnTips;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ActivityPromotionTip implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("act_type")
        public int mActType;
        @SerializedName("description")
        public String mDescription;
        @SerializedName("icon_url")
        public String mIconUrl;
        @SerializedName("remark_url")
        public String mRemarkUrl;
        @SerializedName("show_type")
        public int mShowType;
        @SerializedName("title")
        public String mTitle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ActivityTraceInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("ad_attr")
        public String adAttr;
        @SerializedName("ad_type")
        public int adType;
        @SerializedName("charge_info")
        public String chargeInfo;
        @SerializedName("rank_label_info")
        public String rankLabelInfo;
        @SerializedName("tag")
        public String tag;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponSummary implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_count_tip")
        @Expose
        public String mCouponCountTip;
        @SerializedName("receive_status")
        @Expose
        public int mReceiveStatus;
        @SerializedName("summary_tip")
        @Expose
        public String mSummaryTip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FreeGoInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("is_freego_poi")
        public int is_freego_poi;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiAdDynamicInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("api_pos")
        public String apiPos;
        @SerializedName("template_content")
        public String templateContent;
        @SerializedName("template_id")
        public String templateId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiImpress implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("impress_label")
        public ArrayList<PoiImpressLabel> mImpressLabels;
        @SerializedName("title")
        public String mTitle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiImpressLabel implements Serializable {
        public static final int TYPE_COMMENT_DIG = 3;
        public static final int TYPE_DP_HIGH_SCORE = 1;
        public static final int TYPE_ENVIRONMENT = 5;
        public static final int TYPE_FAST_REFUND = 2;
        public static final int TYPE_FOOD_SAFE = 7;
        public static final int TYPE_INSURANCE = 6;
        public static final int TYPE_SALE = 4;
        public static final int TYPE_SUNSHINE = 10;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("label_desc_text")
        public String labelDescText;
        @SerializedName("label_color")
        public String mLabelColor;
        @SerializedName("label_text")
        public String mLabelText;
        @SerializedName("label_type")
        public int mLabelType;
        @SerializedName("label_url")
        public String mLabelUrl;
        @SerializedName("scheme_sec_url")
        public String mSchemeSecUrl;
        @SerializedName("scheme_url")
        public String mSchemeUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("label_rank_field")
        public String labelRankField;
        @SerializedName("labels")
        public ArrayList<PoiImpressLabel> labels;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiService implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public String content;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiServiceLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("title")
        public String mTitle;
        @SerializedName("scheme_url")
        public String schemeUrl;
        @SerializedName("service_label")
        public ArrayList<PoiImpressLabel> serviceLabels;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PromotionInfoA implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("icon_url")
        public String iconUrl;
        @SerializedName("promotion_text")
        public String promotionText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PromotionInfoS implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bg_pic_url")
        public String bgPicUrl;
        @SerializedName("icon_url")
        public String iconUrl;
        @SerializedName("sign_pic_url")
        public String signPicUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendListItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background_color")
        public String backgroundColor;
        @SerializedName("content_color")
        public String contentColor;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("rank_id")
        public String rankId;
        @SerializedName("rank_scheme")
        public String rankScheme;
        @SerializedName("recommend_reason")
        public String recommendReason;
        @SerializedName("right_icon")
        public String rightIcon;
        @SerializedName("type")
        public int type;
    }

    public int getDataType() {
        return 5;
    }

    public Poi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "032def2b9ad412efca85883be78fbaa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "032def2b9ad412efca85883be78fbaa0");
            return;
        }
        this.bChecked = false;
        this.id = -1L;
        this.poiIDStr = "";
        this.bottomActivities = new ArrayList<>();
        this.inShippingTime = false;
        this.beginShippingTime = "";
        this.isShowingLayer = false;
        this.exposePoiState = 1;
        this.origin_brand_id = -1L;
    }

    public int getNumDiscountRestrict() {
        this.numDiscountRestrict = this.numDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.numDiscountRestrict;
        return this.numDiscountRestrict;
    }

    public String getToastDiscountRestrict() {
        return this.toastDiscountRestrict;
    }

    public void setNumDiscountRestrict(int i) {
        this.numDiscountRestrict = i;
    }

    public void setNumPlusDiscountRestrict(int i) {
        this.numPlusDiscountRestrict = i;
    }

    public int getNumPlusDiscountRestrict() {
        this.numPlusDiscountRestrict = this.numPlusDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.numPlusDiscountRestrict;
        return this.numPlusDiscountRestrict;
    }

    public void setNewUserDiscountRestrict(int i) {
        this.newUserDiscountRestrict = i;
    }

    public int getNewUserDiscountRestrict() {
        this.newUserDiscountRestrict = this.newUserDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.newUserDiscountRestrict;
        return this.newUserDiscountRestrict;
    }

    public String getRecommendTip() {
        return this.recommendTip;
    }

    public int getIsDislikeReasonShow() {
        return this.isDislikeReasonShow;
    }

    public void setDislikeReasonShow(int i) {
        this.isDislikeReasonShow = i;
    }

    public int getContainerTemplateType() {
        if (this.containerTemplate == null) {
            return 0;
        }
        return this.containerTemplate.type;
    }

    public PoiImpress getPoiImpress() {
        return this.mPoiImpress;
    }

    public void setPoiImpress(PoiImpress poiImpress) {
        this.mPoiImpress = poiImpress;
    }

    public PoiLabel getPoiLabels() {
        return this.mPoiLabel;
    }

    public PoiLabel getNewPoiLabels() {
        return this.mPoiLabelNew;
    }

    public String getDefaultSearchWord() {
        return this.mDefaultSearchWord;
    }

    public void setDefaultSearchWord(String str) {
        this.mDefaultSearchWord = str;
    }

    public void setNewPoiLabels(PoiLabel poiLabel) {
        this.mPoiLabelNew = poiLabel;
    }

    public void setPoiLabel(PoiLabel poiLabel) {
        this.mPoiLabel = poiLabel;
    }

    public PoiServiceLabel getPoiServiceLabels() {
        return this.mPoiServiceLabel;
    }

    public void setPoiLabel(PoiServiceLabel poiServiceLabel) {
        this.mPoiServiceLabel = poiServiceLabel;
    }

    public PoiCouponEntity getPoiCoupon() {
        return this.mPoiCouponEntity;
    }

    public void setPoiCoupon(PoiCouponEntity poiCouponEntity) {
        this.mPoiCouponEntity = poiCouponEntity;
    }

    public void setPoiShoppingCart(PoiShoppingCart poiShoppingCart) {
        this.mPoiShoppingCart = poiShoppingCart;
    }

    public PoiShoppingCart getPoiShoppingCart() {
        return this.mPoiShoppingCart;
    }

    public String getAdActivityFlag() {
        return this.adActivityFlag;
    }

    public void setAdActivityFlag(String str) {
        this.adActivityFlag = str;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponEntity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("style")
        public int couponStyle;
        @SerializedName("coupon_summary")
        @Expose
        public CouponSummary mCouponSummary;
        @SerializedName("fold_coupon_list")
        private ArrayList<PoiCouponItem> mFoldPoiCouponItems;
        @SerializedName("coupon_list")
        private ArrayList<PoiCouponItem> mPoiCouponItems;

        public boolean isFloatCoupon() {
            return this.couponStyle == 1;
        }

        public void setPoiCouponItems(ArrayList<PoiCouponItem> arrayList) {
            this.mPoiCouponItems = arrayList;
        }

        public ArrayList<PoiCouponItem> getPoiCouponItems() {
            return this.mPoiCouponItems;
        }

        public ArrayList<PoiCouponItem> getFoldPoiCouponItems() {
            return this.mFoldPoiCouponItems;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponItem implements Serializable {
        public static final int STATUS_HAS_EXCHANGED = 1;
        public static final int STATUS_MAGIC_COUPON_INFLATABLE = 3;
        public static final int STATUS_MAGIC_COUPON_SELL = 4;
        public static final int STATUS_NOT_EXCHANGED = 0;
        public static final int STATUS_NO_PACKAGE_COUPON = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_activity_type")
        public long couponActivityType;
        @SerializedName("activity_id")
        public long mActivityId;
        @SerializedName("coupon_button_desc")
        public String mCouponButtonDesc;
        @SerializedName("coupon_button_scheme")
        public String mCouponButtonScheme;
        @SerializedName("coupon_button_text")
        public String mCouponButtonText;
        @SerializedName("coupon_condition_short_text")
        public String mCouponConditionShortText;
        @SerializedName("coupon_condition_short_text_prefix")
        public String mCouponConditionShortTextPrefix;
        @SerializedName("coupon_condition_text")
        public String mCouponConditionText;
        @SerializedName("coupon_content_text")
        public String mCouponContentText;
        @SerializedName("coupon_desc")
        public String mCouponDesc;
        @SerializedName("coupon_id")
        public long mCouponId;
        @SerializedName("coupon_name")
        public String mCouponName;
        @SerializedName("coupon_pool_id")
        public long mCouponPoolId;
        @SerializedName("coupon_status")
        public int mCouponStatus;
        @SerializedName("coupon_type")
        public int mCouponType;
        @SerializedName("coupon_valid_time_text")
        public String mCouponValidTimeText;
        @SerializedName("coupon_value")
        public double mCouponValue;
        @SerializedName("coupon_view_id")
        public String mCouponViewId;
        @SerializedName("discount_desc")
        public String mDiscountDesc;
        @SerializedName("is_limit_new_user")
        public boolean mIsLimitNewUser;
        @SerializedName("layout_type")
        public int mLayoutType;
        @SerializedName("promote_text")
        public String mPromoteText;
        @SerializedName("scheme_url")
        public String mSchemeUrl;
        @SerializedName("tips_text")
        public String mTipsText;
        @SerializedName("uds_layout_type")
        public int mUdsLayoutType;
        @SerializedName("word_type")
        public int mWordType;
        @SerializedName("toast")
        public String toast;

        public boolean isExchangeCoupon() {
            return this.mCouponType == 2;
        }

        public boolean isKangarooCoupon() {
            return this.mCouponType == 4;
        }

        public boolean isPoiCoupon() {
            return this.mCouponType == 5;
        }

        public boolean isMagicCoupon() {
            return this.mCouponType == 9;
        }

        public boolean isNormalCoupon() {
            return this.mCouponType == 8;
        }

        public boolean isGoodsCoupon() {
            return this.mCouponType == 6;
        }

        public void setCouponStatus(int i) {
            this.mCouponStatus = i;
        }

        public void setCouponReceived() {
            this.mCouponStatus = 1;
        }

        public boolean isCouponExchanged() {
            return this.mCouponStatus == 1;
        }

        public boolean isCouponReceived() {
            return this.mCouponStatus == 1;
        }

        public boolean isKangarooBeanReceived() {
            return this.mCouponStatus == 1;
        }

        public void copyValueFrom(PoiCouponItem poiCouponItem) {
            Object[] objArr = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "695c115c435258a0e47fee7a91c1448c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "695c115c435258a0e47fee7a91c1448c");
                return;
            }
            this.mCouponId = poiCouponItem.mCouponId;
            this.mCouponPoolId = poiCouponItem.mCouponPoolId;
            this.mActivityId = poiCouponItem.mActivityId;
            this.mCouponValue = poiCouponItem.mCouponValue;
            this.mCouponConditionText = poiCouponItem.mCouponConditionText;
            this.mCouponValidTimeText = poiCouponItem.mCouponValidTimeText;
            this.mCouponStatus = poiCouponItem.mCouponStatus;
            this.mCouponButtonText = poiCouponItem.mCouponButtonText;
            this.mIsLimitNewUser = poiCouponItem.mIsLimitNewUser;
            this.mSchemeUrl = poiCouponItem.mSchemeUrl;
            this.mCouponName = poiCouponItem.mCouponName;
            this.mTipsText = poiCouponItem.mTipsText;
            this.mCouponButtonDesc = poiCouponItem.mCouponButtonDesc;
            this.mDiscountDesc = poiCouponItem.mDiscountDesc;
            this.mPromoteText = poiCouponItem.mPromoteText;
            this.mLayoutType = poiCouponItem.mLayoutType;
            this.mWordType = poiCouponItem.mWordType;
        }
    }

    public ArrayList<String> getAlbumThumbnails() {
        if (this.poiEnv != null) {
            return this.poiEnv.mAlbumThumbnails;
        }
        return null;
    }

    public ArrayList<PoiService> getPoiServices() {
        return this.mPoiServices;
    }

    public boolean isAlbumHasMore() {
        if (this.poiEnv != null) {
            return this.poiEnv.mAlbumHasMore;
        }
        return false;
    }

    public String getSelfDeliveryIconUrl() {
        return this.selfDeliveryIcon;
    }

    public void setSelfDeliveryIconUrl(String str) {
        this.selfDeliveryIcon = str;
    }

    public boolean isPoiEnv() {
        return this.mPoiEnv;
    }

    public String getReportUrl() {
        return this.mReportUrl;
    }

    public String getReportContent() {
        return this.mReportContent;
    }

    public boolean isReportShow() {
        return this.mReportShow;
    }

    public boolean needShowPoiStory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281a29df2598be981526e6a495470972", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281a29df2598be981526e6a495470972")).booleanValue();
        }
        if (this.poiDetailStoryInfo != null) {
            return (TextUtils.isEmpty(this.poiDetailStoryInfo.topPic) && TextUtils.isEmpty(this.poiDetailStoryInfo.videoIcon) && TextUtils.isEmpty(this.poiDetailStoryInfo.title) && TextUtils.isEmpty(this.poiDetailStoryInfo.entranceUrl)) ? false : true;
        }
        return false;
    }

    public String getTopPic() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.topPic : "";
    }

    public String getVideoIcon() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.videoIcon : "";
    }

    public String getStoryTitle() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.title : "";
    }

    public String getStoryEntranceUrl() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.entranceUrl : "";
    }

    public boolean isAlbumShow() {
        if (this.poiEnv != null) {
            return this.poiEnv.show;
        }
        return false;
    }

    public long getAlbumSourcePoiId() {
        if (this.poiEnv != null) {
            return this.poiEnv.insteadPoiId;
        }
        return 0L;
    }

    public String getAveragePriceTip() {
        return this.averagePriceTip;
    }

    public String getAdAttrJsonObj() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d172d726f180449baef8b7ba19d19e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d172d726f180449baef8b7ba19d19e7");
        }
        if (TextUtils.isEmpty(this.mAdAttr)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad", this.mAdAttr);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getAdAttr() {
        return this.mAdAttr;
    }

    public void setAdAttr(String str) {
        this.mAdAttr = str;
    }

    public String getShippingFeeCartTip() {
        return this.mShippingFeeCartTip;
    }

    public void setShippingFeeCartTip(String str) {
        this.mShippingFeeCartTip = str;
    }

    public String getSelfDeliveryTip() {
        return this.mSelfDeliveryTip;
    }

    public void setSelfDeliveryTip(String str) {
        this.mSelfDeliveryTip = str;
    }

    public String getNewFunctionTips() {
        return this.mNewFunctionTips;
    }

    public void setNewFunctionTips(String str) {
        this.mNewFunctionTips = str;
    }

    public PoiShoppingCart.ActivityInfo getActivityInfo() {
        return this.mActivityInfo;
    }

    public void setActivityInfo(PoiShoppingCart.ActivityInfo activityInfo) {
        this.mActivityInfo = activityInfo;
    }

    public List<PoiShoppingCart.ActivityInfo> getActivityInfoList() {
        return this.mActivityInfoList;
    }

    public void setActivityInfoList(List<PoiShoppingCart.ActivityInfo> list) {
        this.mActivityInfoList = list;
    }

    public void setShopCartBgColor(String str) {
        this.mShopcartBgColor = str;
    }

    public String getPromptText() {
        return this.mPromptText;
    }

    public void setPromptText(String str) {
        this.mPromptText = str;
    }

    public PoiShoppingCart.CartIcon getCartIcon() {
        return this.cartIcon;
    }

    public void setCartIcon(PoiShoppingCart.CartIcon cartIcon) {
        this.cartIcon = cartIcon;
    }

    public String getDeliveryTimeTip() {
        return this.mtDeliveryTime;
    }

    public void setDeliveryTimeTip(String str) {
        this.mtDeliveryTime = str;
    }

    public String getMtDeliveryTip() {
        return this.mtDeliveryInfo != null ? this.mtDeliveryInfo.mtDeliveryTip : "";
    }

    public String getMtDeliveryTimeInfo() {
        return this.mtDeliveryTime;
    }

    public boolean isMtDelivery() {
        return this.deliveryType == 1;
    }

    public boolean isCityDelivery() {
        return this.deliveryType == 2;
    }

    public ShareTip getShareTip() {
        return this.shareTip;
    }

    public void parseShareTip(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11501475737ea86af007c172a633728e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11501475737ea86af007c172a633728e");
        } else if (jSONObject == null || jSONObject.length() <= 0) {
        } else {
            this.shareTip = new ShareTip();
            this.shareTip.parseJson(jSONObject);
        }
    }

    public String getShopcartBgColor() {
        return this.mShopcartBgColor;
    }

    public String getDisClaimerInfoBig() {
        return this.salePhone;
    }

    public String getDisclaimerInfoSmall() {
        return this.saleTip;
    }

    public boolean hasDisclaimerInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e9dcfaabe2fc77216eae657f49ab00c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e9dcfaabe2fc77216eae657f49ab00c")).booleanValue() : (TextUtils.isEmpty(this.salePhone) && TextUtils.isEmpty(this.salePhone)) ? false : true;
    }

    public String getmRemindTip() {
        return this.mRemindTip;
    }

    public void setmRemindTip(String str) {
        this.mRemindTip = str;
    }

    public int getmRemindCount() {
        return this.mRemindCount;
    }

    public void setmRemindCount(int i) {
        this.mRemindCount = i;
    }

    public int getSupportPay() {
        return this.supportOnlinePay;
    }

    public void setSupportPay(int i) {
        this.supportOnlinePay = i;
    }

    public int getSupportUseCoupon() {
        return this.canUseCoupon;
    }

    public void setSupportUseCoupon(int i) {
        this.canUseCoupon = i;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getBrandTopPic() {
        return this.brandTopPic;
    }

    public void setBrandTopPic(String str) {
        this.brandTopPic = str;
    }

    public String getBrandSlogan() {
        return this.brandSlogan;
    }

    public void setBrandSlogan(String str) {
        this.brandSlogan = str;
    }

    public String getBrandSloganUrl() {
        return this.brandSloganUrl;
    }

    public void setBrandSloganUrl(String str) {
        this.brandSloganUrl = str;
    }

    public String getStoryIcon() {
        return this.storyIcon;
    }

    public void setStoryIcon(String str) {
        this.storyIcon = str;
    }

    public String getPoiLogoStoryIcon() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.poiLogoIcon : "";
    }

    public void setPoiLogoStoryIcon(String str) {
        if (this.poiDetailStoryInfo != null) {
            this.poiDetailStoryInfo.poiLogoIcon = str;
        }
    }

    public String getPoiTabStoryIcon() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.poiTabIcon : "";
    }

    public void setPoiTabStoryIcon(String str) {
        if (this.poiDetailStoryInfo != null) {
            this.poiDetailStoryInfo.poiTabIcon = str;
        }
    }

    public String getPoiStoryUrl() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.entranceUrl : "";
    }

    public int getPoiSellStatus() {
        return this.poiSellStatus;
    }

    public void setPoiSellStatus(int i) {
        this.poiSellStatus = i;
    }

    public long getId() {
        return this.id;
    }

    public String getPoiIDStr() {
        return this.poiIDStr;
    }

    public void setPoiIDStr(String str) {
        this.poiIDStr = str;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.DeDuplicate
    public String getDeDuplicateId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aaf62d4f3a8c24b099ebf7d34761bf2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aaf62d4f3a8c24b099ebf7d34761bf2") : String.valueOf(this.id);
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beccded148340b2b3a5ab5bc1ba61cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beccded148340b2b3a5ab5bc1ba61cee");
        } else {
            this.id = j;
        }
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }

    public String getShippingTime() {
        return this.shippingTime;
    }

    public void setShippingTime(String str) {
        this.shippingTime = str;
    }

    public String getShippingFeeTip() {
        return this.shippingFeeTip;
    }

    public void setShippingFeeTip(String str) {
        this.shippingFeeTip = str;
    }

    public String getOriginShippingFeeTip() {
        return this.originShippingFeeTip;
    }

    public void setOriginShippingFeeTip(String str) {
        this.originShippingFeeTip = str;
    }

    public double getOriginShippingFee() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96bb31a6f37ea3b356f0aa233e4a7816", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96bb31a6f37ea3b356f0aa233e4a7816")).doubleValue();
        }
        if (Double.isNaN(this.originShippingFee)) {
            return 0.0d;
        }
        return this.originShippingFee;
    }

    public void setOriginShippingFee(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f5c60bd7e18c8879e1a5e76d2b45c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f5c60bd7e18c8879e1a5e76d2b45c4a");
        } else {
            this.originShippingFee = d;
        }
    }

    public double getMinPrice() {
        return this.min_price;
    }

    public void setMinPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aab5b0803449da2a4aaf6d835b4791cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aab5b0803449da2a4aaf6d835b4791cd");
        } else {
            this.min_price = d;
        }
    }

    public String getMinPriceTip() {
        return this.minPriceTip;
    }

    public void setMinPriceTip(String str) {
        this.minPriceTip = str;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public boolean isNew() {
        return this.newPromotion == 1;
    }

    public String getPicture() {
        return this.picUrl;
    }

    public void setPicture(String str) {
        this.picUrl = str;
    }

    public String getSalesVolumePerMonth() {
        return this.monthSalesTip;
    }

    public void setSalesVolumePerMonth(String str) {
        this.monthSalesTip = str;
    }

    public boolean isInShippingTime() {
        return this.inShippingTime;
    }

    public void setInShippingTime(boolean z) {
        this.inShippingTime = z;
    }

    public String getBeginShippingTime() {
        return this.beginShippingTime;
    }

    public void setBeginShippingTime(String str) {
        this.beginShippingTime = str;
    }

    public double getCommentRate() {
        return this.poiScore;
    }

    public void formatPoiScore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd17baa3d1772ada0b96d69266d186b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd17baa3d1772ada0b96d69266d186b4");
        } else {
            this.formattedPoiScore = h.a(Double.valueOf(this.poiScore), 1, 1);
        }
    }

    public String getFormattedPoiScore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a75718ea18ee0ce2fc34109226030012", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a75718ea18ee0ce2fc34109226030012");
        }
        if (this.formattedPoiScore == null) {
            formatPoiScore();
        }
        return this.formattedPoiScore;
    }

    public void setCommentRate(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e85291525162a5d7b7e1f5b78d34dab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e85291525162a5d7b7e1f5b78d34dab3");
        } else {
            this.poiScore = d;
        }
    }

    public int getAvgDeliveryElapsedTime() {
        return this.deliveryElapsedTime;
    }

    public void setAvgDeliveryElapsedTime(int i) {
        this.deliveryElapsedTime = i;
    }

    public String getRestBulletin() {
        return this.bulletin;
    }

    public void setRestBulletin(String str) {
        this.bulletin = str;
    }

    public String getAppDeliveryTip() {
        return this.appDeliveryTip;
    }

    public void setAppDeliveryTip(String str) {
        this.appDeliveryTip = str;
    }

    public ArrayList<String> getPhoneList() {
        return this.phoneList;
    }

    public void setPhoneList(ArrayList<String> arrayList) {
        this.phoneList = arrayList;
    }

    public String getPhoneCallPrefix() {
        return this.phoneCallPrefix;
    }

    public void setPhoneCallPrefix(String str) {
        this.phoneCallPrefix = str;
    }

    public int getAvgShippingTimeRank() {
        return this.avgShippingTimeRank;
    }

    public void setAvgShippingTimeRank(int i) {
        this.avgShippingTimeRank = i;
    }

    public int getTimelySendPercent() {
        return this.timelySendPercent;
    }

    public void setTimelySendPercent(int i) {
        this.timelySendPercent = i;
    }

    public int getTimelySendPercentRank() {
        return this.timelySendPercentRank;
    }

    public void setTimelySendPercentRank(int i) {
        this.timelySendPercentRank = i;
    }

    public int getAcceptOrderTime() {
        return this.acceptOrderTime;
    }

    public void setAcceptOrderTime(int i) {
        this.acceptOrderTime = i;
    }

    public int getAcceptOrderTimeRank() {
        return this.acceptOrderTimeRank;
    }

    public void setAcceptOrderTimeRank(int i) {
        this.acceptOrderTimeRank = i;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public void setLatitude(int i) {
        this.latitude = i;
    }

    public int getLongitude() {
        return this.longitude;
    }

    public void setLongitude(int i) {
        this.longitude = i;
    }

    public String getDistance() {
        return this.distance;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public String getWarnTips() {
        return this.warnTips;
    }

    public void setWarnTips(String str) {
        this.warnTips = str;
    }

    @Deprecated
    public ArrayList<ActivityItem> getActivities() {
        return this.discounts;
    }

    @Deprecated
    public void setActivities(ArrayList<ActivityItem> arrayList) {
        this.discounts = arrayList;
    }

    public boolean isFavorite() {
        return this.mIsFavorite == 1;
    }

    public void setFavorite(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60624e2887c99b46682e135c59931c89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60624e2887c99b46682e135c59931c89");
        } else {
            this.mIsFavorite = z ? 1 : 0;
        }
    }

    public long getCommentNumber() {
        return this.commentNumber;
    }

    public void setCommentNumber(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "236817ce0b96de80f4049e757f32d96b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "236817ce0b96de80f4049e757f32d96b");
        } else {
            this.commentNumber = j;
        }
    }

    public int getDeliveryElapsedTime() {
        return this.deliveryElapsedTime;
    }

    public void setDeliveryElapsedTime(int i) {
        this.deliveryElapsedTime = i;
    }

    public int getSupportInvoice() {
        return this.invoiceSupport;
    }

    public void setSupportInvoice(int i) {
        this.invoiceSupport = i;
    }

    public ArrayList<ActivityItem> getBottomActivities() {
        return this.bottomActivities;
    }

    public void setBottomActivities(ArrayList<ActivityItem> arrayList) {
        this.bottomActivities = arrayList;
    }

    public boolean isSupportUseAsMoney() {
        return this.mIsSupportUseAsMoney;
    }

    public void setIsSupportUseAsMoney(boolean z) {
        this.mIsSupportUseAsMoney = z;
    }

    public String getShippingState() {
        return this.shippingTimeInfo != null ? this.shippingTimeInfo.statusContent : "";
    }

    public void setShippingState(String str) {
        if (this.shippingTimeInfo != null) {
            this.shippingTimeInfo.statusContent = str;
        }
    }

    public int getReservationStatus() {
        if (this.shippingTimeInfo != null) {
            return this.shippingTimeInfo.reservationStatus;
        }
        return 0;
    }

    public boolean isShippingFeeDiscount() {
        return this.isShippingFeeDiscount;
    }

    public void setShippingFeeDiscount(boolean z) {
        this.isShippingFeeDiscount = z;
    }

    public String getShippingDesc() {
        return this.shippingTimeInfo != null ? this.shippingTimeInfo.descContent : "";
    }

    public void setShippingDesc(String str) {
        if (this.shippingTimeInfo != null) {
            this.shippingTimeInfo.descContent = str;
        }
    }

    public boolean isBrand() {
        return this.brandType != 0;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public int getBuzType() {
        return this.mBuzType;
    }

    public void setBuzType(int i) {
        this.mBuzType = i;
    }

    public int getCategoryType() {
        return this.categoryType;
    }

    public void setCategoryType(int i) {
        this.categoryType = i;
    }

    public int getSortReasonType() {
        return this.sortReasonType;
    }

    public void setSortReasonType(int i) {
        this.sortReasonType = i;
    }

    public String getSortReasonTag() {
        return this.sortReasonTag;
    }

    public void setSortReasonTag(String str) {
        this.sortReasonTag = str;
    }

    public boolean isDeliveryByMeituan() {
        return this.deliveryType == 1;
    }

    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public void setBackgroundUrl(String str) {
        this.backgroundUrl = str;
    }

    public String getTypeIconUrl() {
        return this.poiTypeIcon;
    }

    public int getPoiTypeIconType() {
        if (this.logfield == null) {
            return 0;
        }
        return this.logfield.poiTypeIconType;
    }

    public String getPromotionPicUrl() {
        return this.poiPromotionPic;
    }

    public int getTemplateType() {
        if (this.containerTemplate != null) {
            return this.containerTemplate.type;
        }
        return 0;
    }

    public void setTemplateType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5d6ed0ba941080e5b449d43a481c5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5d6ed0ba941080e5b449d43a481c5ab");
        } else if (this.containerTemplate != null) {
            this.containerTemplate.type = i;
        } else {
            this.containerTemplate = new PoiContainerTemplate();
            this.containerTemplate.type = i;
        }
    }

    public String getTemplateTagIcon() {
        return this.containerTemplate != null ? this.containerTemplate.tagIcon : "";
    }

    public List<Product> getProductList() {
        return this.products;
    }

    public void setVisiTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "558be388a2d7422eab63931efeab0df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "558be388a2d7422eab63931efeab0df9");
        } else {
            this.iVisiTime = j;
        }
    }

    public void setIsSelfDelivery(boolean z) {
        this.isSelfDelivery = z;
    }

    public void setIsNewUser(boolean z) {
        this.isNewUser = z;
    }

    public boolean isNewUser() {
        return this.isNewUser;
    }

    public void setAllowanceAllianceScenes(String str) {
        this.allowanceAllianceScenes = str;
    }

    public String getAllowanceAllianceScenes() {
        return this.allowanceAllianceScenes;
    }

    public long getiVisiTime() {
        return this.iVisiTime;
    }

    public boolean isChecked() {
        return this.bChecked;
    }

    public void setChecked(boolean z) {
        this.bChecked = z;
    }

    public String getTimeStag() {
        return this.sTimeStag;
    }

    public void setTimeStag(String str) {
        this.sTimeStag = str;
    }

    public String getHeadPicUrl() {
        return this.headPicUrl;
    }

    public void setHeadPicUrl(String str) {
        this.headPicUrl = str;
    }

    public String getPromotionHeadPicUrl() {
        return this.mPromotionHeadPicUrl;
    }

    public PromotionInfoS getPromotionInfoS() {
        return this.promotionInfoS;
    }

    public void setPromotionInfoS(PromotionInfoS promotionInfoS) {
        this.promotionInfoS = promotionInfoS;
    }

    public void setPromotionInfoA(PromotionInfoA promotionInfoA) {
        this.promotionInfoA = promotionInfoA;
    }

    public PromotionInfoA getPromotionInfoA() {
        return this.promotionInfoA;
    }

    public void setIsShowingLayer(boolean z) {
        this.isShowingLayer = z;
    }

    public boolean getIsShowingLayer() {
        return this.isShowingLayer;
    }

    public String getThirdCategory() {
        return this.mThirdCategory;
    }

    public void setThirdCategory(String str) {
        this.mThirdCategory = str;
    }

    public String getCloseTips() {
        return this.mCloseTips;
    }

    public void setCloseTips(String str) {
        this.mCloseTips = str;
    }

    public ArrayList<LabelInfoListItem> getLabelInfoList() {
        return this.mLabelInfoList;
    }

    public void setLabelInfoList(ArrayList<LabelInfoListItem> arrayList) {
        this.mLabelInfoList = arrayList;
    }

    public boolean isUsePoiTagsField() {
        return this.usePoiTagsField;
    }

    public boolean isUsePoiNormalTagsField() {
        return this.usePoiNormalTagsField;
    }

    public List<d> getPoiTags() {
        return this.poiTags;
    }

    public ArrayList<RecommendListItem> getNewRecommendList() {
        return this.mNewRecommendList;
    }

    public void setNewRecommendList(ArrayList<RecommendListItem> arrayList) {
        this.mNewRecommendList = arrayList;
    }

    public int getRecommendLevelType() {
        return this.recommendLevelType;
    }

    public void setRecommendLevelType(int i) {
        this.recommendLevelType = i;
    }

    public String getRankLabelInfo() {
        return this.rankLabelInfo;
    }

    public void setRankLabelInfo(String str) {
        this.rankLabelInfo = str;
    }

    public boolean isShowPoiQualify() {
        if (this.poiQualifyInfo != null) {
            return this.poiQualifyInfo.show;
        }
        return false;
    }

    public String poiQualifyContent() {
        return this.poiQualifyInfo != null ? this.poiQualifyInfo.content : "";
    }

    public String poiQualifyUrl() {
        return this.poiQualifyInfo != null ? this.poiQualifyInfo.url : "";
    }

    public boolean isShowEnvironmentProtection() {
        if (this.poiEnvironmentProtection != null) {
            return this.poiEnvironmentProtection.display;
        }
        return false;
    }

    public String poiEnvironmentProtectionName() {
        return this.poiEnvironmentProtection != null ? this.poiEnvironmentProtection.displayName : "";
    }

    public String poiEnvironmentProtectionUrl() {
        return this.poiEnvironmentProtection != null ? this.poiEnvironmentProtection.url : "";
    }

    public boolean isShowPoiFoodCity() {
        if (this.poiFoodPalaceInfo != null) {
            return this.poiFoodPalaceInfo.isShow;
        }
        return false;
    }

    public String poiFoodPalaceContent() {
        return this.poiFoodPalaceInfo != null ? this.poiFoodPalaceInfo.content : "";
    }

    public String poiFoodPalaceUrl() {
        return this.poiFoodPalaceInfo != null ? this.poiFoodPalaceInfo.url : "";
    }

    public String poiFoodPalaceIconUrl() {
        return this.poiFoodPalaceInfo != null ? this.poiFoodPalaceInfo.iconUrl : "";
    }

    public long getOriginBrandId() {
        return this.origin_brand_id;
    }

    public void setOriginBrandId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c80b0d270b6122f694eda6a2595c036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c80b0d270b6122f694eda6a2595c036");
        } else {
            this.origin_brand_id = j;
        }
    }

    public boolean isRest() {
        return this.state == 3;
    }

    public boolean isInsurance() {
        return this.insuranceType == 1;
    }

    public String getInsuranceIcon() {
        return this.insuranceIcon;
    }

    private void parsePoiCommonModel(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d638469964bda3c7a1b3246a2a88b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d638469964bda3c7a1b3246a2a88b8b");
            return;
        }
        this.id = jSONObject.optLong("id");
        this.poiIDStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        this.name = jSONObject.optString("name");
        this.poiType = jSONObject.optInt("poi_type");
        this.selfDeliveryIcon = jSONObject.optString("self_delivery_icon");
        this.state = jSONObject.optInt("status");
        this.statusDesc = jSONObject.optString("status_desc");
        this.picUrl = jSONObject.optString("pic_url");
        this.monthSalesTip = jSONObject.optString("month_sales_tip");
        this.poiScore = jSONObject.optDouble("wm_poi_score", 0.0d);
        this.iVisiTime = jSONObject.optLong("visit_time", System.currentTimeMillis() / 1000);
        setTimeStag(makeTimeStag(this.iVisiTime));
        this.distance = jSONObject.optString("distance");
        this.poiTypeIcon = jSONObject.optString("poi_type_icon");
        this.poiPromotionPic = jSONObject.optString("poi_promotion_pic");
        this.deliveryType = jSONObject.optInt("delivery_type");
        this.shippingFeeTip = jSONObject.optString("shipping_fee_tip");
        this.originShippingFeeTip = jSONObject.optString("origin_shipping_fee_tip");
        this.originShippingFee = jSONObject.optDouble("origin_shipping_fee");
        this.minPriceTip = jSONObject.optString("min_price_tip");
        this.mtDeliveryTime = jSONObject.optString("delivery_time_tip");
        this.storyIcon = jSONObject.optString("story_icon");
        this.restaurantScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.insuranceType = jSONObject.optInt("insurance_type");
        this.insuranceIcon = jSONObject.optString("insurance_icon");
        this.recommendLevelType = jSONObject.optInt("recommend_level_type", 0);
        this.rankLabelInfo = jSONObject.optString("rank_label_info");
        this.isOnlySelfDelivery = jSONObject.optInt("only_self_delivery");
        this.latitude = jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE);
        this.longitude = jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE);
        this.address = jSONObject.optString(GearsLocator.ADDRESS);
        this.locationTip = jSONObject.optString("location_tip");
        this.usePoiTagsField = jSONObject.optBoolean("use_poi_tags_field");
        this.usePoiNormalTagsField = jSONObject.optBoolean("use_poi_normal_tags_field");
        this.mCouponTagUrl = jSONObject.optString("coupon_tag_url");
        JSONObject optJSONObject = jSONObject.optJSONObject("shipping_time_info");
        if (optJSONObject != null) {
            this.shippingTimeInfo = new ShippingTimeInfo();
            this.inShippingTime = optJSONObject.optInt("in_shipping_time", 1) == 1;
            this.beginShippingTime = optJSONObject.optString("beg_shipping_time", "");
            this.shippingTimeInfo.statusContent = optJSONObject.optString("status_content");
            this.shippingTimeInfo.descContent = optJSONObject.optString("desc_content");
            this.shippingTimeInfo.reservationStatus = optJSONObject.optInt("reservation_status", 0);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("recommend_info");
        if (optJSONObject2 != null) {
            this.recommendInfo = new RecommendInfo();
            this.recommendInfo.iconUrl = optJSONObject2.optString(RemoteMessageConst.Notification.ICON);
            this.recommendInfo.reason = optJSONObject2.optString("recommend_reason");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("discounts2");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.discounts = new ArrayList<>();
            this.bottomActivities = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                int optInt = optJSONObject3.optInt("display_code");
                int optInt2 = optJSONObject3.optInt("type");
                if (optInt2 == 7) {
                    this.mIsSupportUseAsMoney = true;
                }
                if (optInt2 == 99) {
                    this.deliveryType = 1;
                } else {
                    ActivityItem activityItem = new ActivityItem();
                    activityItem.setType(optInt2);
                    activityItem.setInfo(optJSONObject3.optString("info"));
                    activityItem.setIconUrl(optJSONObject3.optString("icon_url"));
                    activityItem.setPromotionType(optJSONObject3.optInt("promotion_type"));
                    if (optJSONObject3.has("display_code")) {
                        activityItem.setUseIconFromServer(optJSONObject3.optInt("use_icon_from_server") == 1);
                        activityItem.setDisplayCode(optInt);
                        if (optInt == 1 || optInt == 2 || optInt == 3) {
                            this.bottomActivities.add(activityItem);
                        }
                    } else {
                        this.bottomActivities.add(activityItem);
                    }
                }
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_field");
        if (optJSONObject4 != null) {
            this.logfield = new LogField();
            this.logfield.parse(optJSONObject4);
        }
        this.mThirdCategory = jSONObject.optString("third_category");
        this.mCloseTips = jSONObject.optString("closing_tips");
        String optString = jSONObject.optString("label_info");
        if (!TextUtils.isEmpty(optString)) {
            this.mLabelInfoList = (ArrayList) k.a().fromJson(optString, new TypeToken<ArrayList<LabelInfoListItem>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.1
            }.getType());
        }
        String optString2 = jSONObject.optString("poi_tags");
        if (!TextUtils.isEmpty(optString2)) {
            this.poiTags = (List) k.a().fromJson(optString2, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.4
            }.getType());
        }
        String optString3 = jSONObject.optString("poi_activity_tags");
        if (!TextUtils.isEmpty(optString3)) {
            this.poiActivityTags = (List) k.a().fromJson(optString3, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.5
            }.getType());
        }
        String optString4 = jSONObject.optString("red_package_tags");
        if (!TextUtils.isEmpty(optString4)) {
            this.poiRedPackageTags = (List) k.a().fromJson(optString4, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.6
            }.getType());
        }
        String optString5 = jSONObject.optString("poi_serve_tags");
        if (!TextUtils.isEmpty(optString5)) {
            this.poiServeTags = (List) k.a().fromJson(optString5, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.7
            }.getType());
        }
        String optString6 = jSONObject.optString("poi_normal_tags");
        if (!TextUtils.isEmpty(optString6)) {
            this.poiNormalTags = (List) k.a().fromJson(optString6, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.8
            }.getType());
        }
        String optString7 = jSONObject.optString("recommend_level_list");
        if (TextUtils.isEmpty(optString7)) {
            return;
        }
        this.mNewRecommendList = (ArrayList) k.a().fromJson(optString7, new TypeToken<ArrayList<RecommendListItem>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.9
        }.getType());
    }

    private void parsePoiCommonModelInPoi(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd7eecb0548533ee4f14236e1953de7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd7eecb0548533ee4f14236e1953de7b");
            return;
        }
        this.id = jSONObject.optLong("id");
        this.poiIDStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        this.name = jSONObject.optString("name");
        this.poiType = jSONObject.optInt("poi_type");
        this.selfDeliveryIcon = jSONObject.optString("self_delivery_icon");
        this.poiSellStatus = jSONObject.optInt("poi_sell_status");
        this.state = jSONObject.optInt("status");
        this.picUrl = jSONObject.optString("pic_url");
        this.poiScore = jSONObject.optDouble("wm_poi_score", 0.0d);
        this.distance = jSONObject.optString("distance");
        this.deliveryType = jSONObject.optInt("delivery_type");
        this.shippingFeeTip = jSONObject.optString("shipping_fee_tip");
        this.originShippingFeeTip = jSONObject.optString("origin_shipping_fee_tip");
        this.originShippingFee = jSONObject.optDouble("origin_shipping_fee");
        this.minPriceTip = jSONObject.optString("min_price_tip");
        this.mtDeliveryTime = jSONObject.optString("delivery_time_tip");
        this.restaurantScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.insuranceType = jSONObject.optInt("insurance_type");
        this.insuranceIcon = jSONObject.optString("insurance_icon");
        JSONArray optJSONArray = jSONObject.optJSONArray("discounts2");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        this.discounts = new ArrayList<>();
        this.bottomActivities = new ArrayList<>();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            ActivityItem activityItem = new ActivityItem();
            int optInt = optJSONObject.optInt("display_code");
            int optInt2 = optJSONObject.optInt("type");
            if (optInt2 == 7) {
                this.mIsSupportUseAsMoney = true;
            }
            activityItem.setType(optInt2);
            activityItem.setInfo(optJSONObject.optString("info"));
            activityItem.setIconUrl(optJSONObject.optString("icon_url"));
            activityItem.setUseIconFromServer(optJSONObject.optInt("use_icon_from_server") == 1);
            this.discounts.add(activityItem);
            if (optInt == 2) {
                this.bottomActivities.add(activityItem);
            }
        }
    }

    public void parsePoiList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af8ff3104ee8a7b67ef546c3256fe43a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af8ff3104ee8a7b67ef546c3256fe43a");
            return;
        }
        parsePoiCommonModel(jSONObject);
        this.mAdAttr = jSONObject.optString("ad_attr");
        this.mtDeliveryTime = jSONObject.optString("delivery_time_tip");
        this.averagePriceTip = jSONObject.optString("average_price_tip");
        this.min_price = jSONObject.optDouble("min_price");
        this.newPromotion = jSONObject.optInt("new_promotion");
        this.deliveryElapsedTime = jSONObject.optInt("avg_delivery_time");
        this.mIsFavorite = jSONObject.optInt("is_favorite");
        this.brandType = jSONObject.optInt("brand_type");
        this.isShippingFeeDiscount = jSONObject.optInt("shipping_fee_discount") == 1;
        this.sortReasonType = jSONObject.optInt("sort_reason_type", 0);
        this.sortReasonTag = jSONObject.optString("sort_reason_tag", null);
        this.chargeInfo = jSONObject.optString("charge_info");
        this.adType = jSONObject.optInt("ad_type");
        this.adMark = jSONObject.optBoolean("ad_mark", false);
        this.numDiscountRestrict = jSONObject.optInt("discount_restrict", 0);
        this.numDiscountRestrict = this.numDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.numDiscountRestrict;
        this.toastDiscountRestrict = jSONObject.optString("restrict_toast");
        this.newUserDiscountRestrict = jSONObject.optInt("new_user_discount_restrict", 0);
        this.newUserDiscountRestrictToast = jSONObject.optString("new_user_discount_restrict_toast");
        this.numPlusDiscountRestrict = jSONObject.optInt("plus_discount_restrict", 0);
        this.numPlusDiscountRestrict = this.numPlusDiscountRestrict > 0 ? this.numPlusDiscountRestrict : Integer.MAX_VALUE;
        this.toastPlusDiscountRestrict = jSONObject.optString("plus_discount_toast");
        this.imgStyle = jSONObject.optInt("img_style", 0);
        this.imgType = jSONObject.optInt("img_type", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("container_template");
        if (optJSONObject != null) {
            this.containerTemplate = new PoiContainerTemplate();
            this.containerTemplate.type = optJSONObject.optInt("type");
            this.containerTemplate.tagIcon = optJSONObject.optString("tag_icon");
        }
        jSONObject.optJSONObject("new_function_tips");
        this.callPoiDesc = jSONObject.optString("call_poi_desc");
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                Product product = new Product();
                product.spuId = optJSONObject2.optLong("spu_id");
                product.skuId = optJSONObject2.optLong("sku_id");
                product.picture = optJSONObject2.optString("picture");
                product.name = optJSONObject2.optString("name");
                product.price = optJSONObject2.optString("price");
                product.tagIcon = optJSONObject2.optString("tag_icon");
                product.tagInfo = optJSONObject2.optString("tag_info");
                product.scheme = optJSONObject2.optString(NetLogConstants.Details.SCHEME);
                product.originPrice = optJSONObject2.optString("origin_price");
                arrayList.add(product);
            }
            this.products = arrayList;
        }
        this.recommendTip = jSONObject.optString("recommend_tip");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("animate_products");
        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
            AnimatorProductBean animatorProductBean = new AnimatorProductBean();
            animatorProductBean.parseJson(optJSONObject3);
            arrayList2.add(animatorProductBean);
        }
        this.animateProducts = arrayList2;
    }

    public void parseJsonToPoi(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cb5f5d8d05ce04747bb7faf660d3a4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cb5f5d8d05ce04747bb7faf660d3a4e");
            return;
        }
        parsePoiCommonModelInPoi(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("mt_delivery_info");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.mtDeliveryInfo = new MtDeliveryInfo();
            this.mtDeliveryInfo.mtDeliveryTip = optJSONObject.optString("mt_delivery_tip");
            JSONArray optJSONArray = optJSONObject.optJSONArray("mt_delivery_tags");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                this.mtDeliveryInfo.mtDeliveryTags = new ArrayList();
                for (int i = 0; i < length; i++) {
                    this.mtDeliveryInfo.mtDeliveryTags.add(optJSONArray.optString(i));
                }
            }
        }
        String optString = jSONObject.optString("delivery_info_v2");
        if (!TextUtils.isEmpty(optString)) {
            this.mDeliveryInfo = (DeliveryInfo) k.a().fromJson(optString, (Class<Object>) DeliveryInfo.class);
        }
        try {
            parseShareTip(jSONObject.optJSONObject("share_tip"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("poi_qualify_info");
            if (optJSONObject2 != null) {
                this.poiQualifyInfo = new PoiQualifyInfo();
                this.poiQualifyInfo.show = optJSONObject2.optBoolean("show");
                this.poiQualifyInfo.content = optJSONObject2.optString("content");
                this.poiQualifyInfo.url = optJSONObject2.optString("url");
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b("Poi", "获取资质图片失败：" + e.getMessage(), new Object[0]);
            com.sankuai.waimai.foundation.utils.log.a.b("Poi", "获取资质图片失败：" + e.getMessage(), e);
        }
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("env_protect_url");
            if (optJSONObject3 != null) {
                this.poiEnvironmentProtection = new PoiEnvironmentProtection();
                this.poiEnvironmentProtection.display = optJSONObject3.optBoolean("display");
                this.poiEnvironmentProtection.displayName = optJSONObject3.optString("displayName");
                this.poiEnvironmentProtection.url = optJSONObject3.optString("url");
            }
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.b("Poi", "获取环保档案失败：" + e2.getMessage(), new Object[0]);
            com.sankuai.waimai.foundation.utils.log.a.b("Poi", "获取环保档案失败：" + e2.getMessage(), e2);
        }
        try {
            JSONObject optJSONObject4 = jSONObject.optJSONObject("poi_foodpalace_info");
            if (optJSONObject4 != null) {
                this.poiFoodPalaceInfo = new PoiFoodPalaceInfo();
                this.poiFoodPalaceInfo.iconUrl = optJSONObject4.optString("icon_url");
                this.poiFoodPalaceInfo.isShow = optJSONObject4.optBoolean("is_show");
                this.poiFoodPalaceInfo.content = optJSONObject4.optString("content");
                this.poiFoodPalaceInfo.url = optJSONObject4.optString("url");
            }
        } catch (Exception e3) {
            com.sankuai.waimai.foundation.utils.log.a.b("Poi", "获取美食城信息失败：" + e3.getMessage(), new Object[0]);
            com.sankuai.waimai.foundation.utils.log.a.b("Poi", "获取美食城信息失败：" + e3.getMessage(), e3);
        }
        this.phone = jSONObject.optString("phone");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("phone_list");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            this.phoneList = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.phoneList.add(optJSONArray2.optString(i2));
            }
        }
        this.phoneCallPrefix = jSONObject.optString("phone_call_text");
        this.salePhone = jSONObject.optString("poi_delivery_content1");
        this.saleTip = jSONObject.optString("poi_delivery_content2");
        this.address = jSONObject.optString(GearsLocator.ADDRESS);
        this.backgroundUrl = jSONObject.optString("poi_back_pic_url");
        this.shippingTime = jSONObject.optString("shipping_time");
        this.shippingFee = jSONObject.optDouble("shipping_fee");
        this.mPoiPrepareTime = jSONObject.optString("poi_prepare_time");
        this.min_price = jSONObject.optDouble("min_price");
        this.bulletin = jSONObject.optString("bulletin");
        this.deliveryElapsedTime = jSONObject.optInt("avg_delivery_time");
        this.canUseCoupon = jSONObject.optInt("can_use_coupon");
        this.avgShippingTimeRank = jSONObject.optInt("avg_delivery_time_ranking");
        this.timelySendPercent = jSONObject.optInt("in_time_delivery_percent");
        this.timelySendPercentRank = jSONObject.optInt("in_time_delivery_percent_ranking");
        this.acceptOrderTime = jSONObject.optInt("avg_accept_order_time");
        this.acceptOrderTimeRank = jSONObject.optInt("avg_accept_order_time_ranking");
        this.supportOnlinePay = jSONObject.optInt("support_pay");
        this.appDeliveryTip = jSONObject.optString("app_delivery_tip");
        this.warnTips = jSONObject.optString("warn_tips");
        this.invoiceSupport = jSONObject.optInt("invoice_support");
        this.mRemindCount = jSONObject.optInt("remind_count");
        this.mRemindTip = jSONObject.optString("remind_tip");
        this.mIsFavorite = jSONObject.optInt("is_favorite");
        this.brandType = jSONObject.optInt("brand_type");
        this.mBuzType = jSONObject.optInt("buz_type");
        this.categoryType = jSONObject.optInt("buz_code");
        this.deliveryType = jSONObject.optInt("delivery_type", 0);
        this.isNewPage = jSONObject.optInt("new_page_switch", 0);
        this.longitude = jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE, 0);
        this.latitude = jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE, 0);
        this.iVisiTime = jSONObject.optInt("visit_time", 0);
        this.headPicUrl = jSONObject.optString("head_pic_url", null);
        this.insuranceType = jSONObject.optInt("insurance_type", 0);
        this.insuranceIcon = jSONObject.optString("insurance_icon");
        this.mDefaultSearchWord = jSONObject.optString("default_search_word");
        this.usePoiTagsField = jSONObject.optBoolean("use_poi_tags_field");
        this.usePoiNormalTagsField = jSONObject.optBoolean("use_poi_normal_tags_field");
        this.hasFavoriteCoupon = jSONObject.optBoolean("has_favorite_coupon");
        this.favoriteDesc = jSONObject.optString("favorite_desc");
        this.collectCouponPopupDelay = jSONObject.optInt("favorite_toast_appear_time");
        this.collectCouponPopupDuration = jSONObject.optInt("favorite_toast_disappear_time");
        this.buySkuCountThreshold = jSONObject.optInt("buy_sku_count_threshold", 0);
        this.customerServiceInfo = parseCustomServiceInfo(jSONObject.optJSONObject("poi_customer_service_entrance"));
        this.singleBuyThreshold = jSONObject.optInt("single_buy_threshold", 0);
        this.origin_brand_id = jSONObject.optLong("origin_brand_id", -1L);
        setTimeStag(makeTimeStag(this.iVisiTime));
        JSONObject optJSONObject5 = jSONObject.optJSONObject("story_info");
        if (optJSONObject5 != null) {
            this.poiDetailStoryInfo = new PoiDetailStoryInfo();
            this.poiDetailStoryInfo.topPic = optJSONObject5.optString("top_pic");
            this.poiDetailStoryInfo.videoIcon = optJSONObject5.optString("video_icon");
            this.poiDetailStoryInfo.title = optJSONObject5.optString("title");
            this.poiDetailStoryInfo.entranceUrl = optJSONObject5.optString("entrance_url");
            this.poiDetailStoryInfo.poiLogoIcon = optJSONObject5.optString("poi_logo_icon");
            this.poiDetailStoryInfo.poiTabIcon = optJSONObject5.optString("poi_tab_icon");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("freego_poi_info");
        if (optJSONObject6 != null) {
            this.mFreeGoInfo = new FreeGoInfo();
            this.mFreeGoInfo.is_freego_poi = optJSONObject6.optInt("is_freego_poi");
            this.mFreeGoInfo.scheme = optJSONObject6.optString(NetLogConstants.Details.SCHEME);
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("poi_report");
        if (optJSONObject7 != null) {
            this.mReportShow = optJSONObject7.optBoolean("show");
            this.mReportContent = optJSONObject7.optString("content");
            this.mReportUrl = optJSONObject7.optString("url");
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("poi_env");
        if (optJSONObject8 != null) {
            this.poiEnv = new PoiEnv();
            this.poiEnv.show = optJSONObject8.optBoolean("show");
            this.poiEnv.thumbnailsUrl = optJSONObject8.optString("thumbnails_url");
            this.poiEnv.insteadPoiId = optJSONObject8.optLong("instead_poi_id");
            JSONArray optJSONArray3 = optJSONObject8.optJSONArray("thumbnails_url_list");
            if (optJSONArray3 != null) {
                this.poiEnv.mAlbumThumbnails = new ArrayList<>();
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.poiEnv.mAlbumThumbnails.add(optJSONArray3.optString(i3));
                }
            }
            this.poiEnv.mAlbumHasMore = optJSONObject8.optBoolean("has_more");
        }
        this.mPoiEnv = jSONObject.optBoolean("has_poi_env");
        String optString2 = jSONObject.optString("poi_service");
        if (!TextUtils.isEmpty(optString2)) {
            this.mPoiServices = (ArrayList) k.a().fromJson(optString2, new TypeToken<ArrayList<PoiService>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.10
            }.getType());
        }
        String optString3 = jSONObject.optString("label_info");
        if (!TextUtils.isEmpty(optString3)) {
            this.mLabelInfoList = (ArrayList) k.a().fromJson(optString3, new TypeToken<ArrayList<LabelInfoListItem>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.11
            }.getType());
        }
        String optString4 = jSONObject.optString("poi_tags");
        if (!TextUtils.isEmpty(optString4)) {
            this.poiTags = (List) k.a().fromJson(optString4, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.2
            }.getType());
        }
        String optString5 = jSONObject.optString("poi_normal_tags");
        if (!TextUtils.isEmpty(optString5)) {
            this.poiNormalTags = (List) k.a().fromJson(optString5, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.platform.domain.core.poi.Poi.3
            }.getType());
        }
        JSONObject optJSONObject9 = jSONObject.optJSONObject("poi_coupon_info");
        if (optJSONObject9 != null) {
            this.poiCouponInfo = new PoiCouponInfo();
            this.poiCouponInfo.iconUrl = optJSONObject9.optString("icon_url");
            this.poiCouponInfo.couponTip = optJSONObject9.optString("coupon_tip");
        }
        this.numDiscountRestrict = jSONObject.optInt("discount_restrict", 0);
        this.numDiscountRestrict = this.numDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.numDiscountRestrict;
        this.toastDiscountRestrict = jSONObject.optString("restrict_toast");
        this.newUserDiscountRestrict = jSONObject.optInt("new_user_discount_restrict", 0);
        this.newUserDiscountRestrictToast = jSONObject.optString("new_user_discount_restrict_toast");
        this.numPlusDiscountRestrict = jSONObject.optInt("plus_discount_restrict", 0);
        this.numPlusDiscountRestrict = this.numPlusDiscountRestrict > 0 ? this.numPlusDiscountRestrict : Integer.MAX_VALUE;
        this.toastPlusDiscountRestrict = jSONObject.optString("plus_discount_toast");
        JSONObject optJSONObject10 = jSONObject.optJSONObject("container_template");
        if (optJSONObject10 != null) {
            this.containerTemplate = new PoiContainerTemplate();
            this.containerTemplate.type = optJSONObject10.optInt("type");
            this.containerTemplate.tagIcon = optJSONObject10.optString("tag_icon");
        }
        this.score = jSONObject.optDouble("score");
        this.commentNumber = jSONObject.optLong("comment_number");
        this.recommendTip = jSONObject.optString("recommend_tip");
        this.mPromotionHeadPicUrl = jSONObject.optString("promotion_head_pic_url");
        JSONObject optJSONObject11 = jSONObject.optJSONObject("platform_promotion_info");
        if (optJSONObject11 != null) {
            this.promotionInfoS = new PromotionInfoS();
            this.promotionInfoS.bgPicUrl = optJSONObject11.optString("bg_pic_url");
            this.promotionInfoS.iconUrl = optJSONObject11.optString("icon_url");
            this.promotionInfoS.signPicUrl = optJSONObject11.optString("sign_pic_url");
        }
        JSONObject optJSONObject12 = jSONObject.optJSONObject("regular_promotion_info");
        if (optJSONObject12 != null) {
            this.promotionInfoA = new PromotionInfoA();
            this.promotionInfoA.promotionText = optJSONObject12.optString("promotion_text");
            this.promotionInfoA.iconUrl = optJSONObject12.optString("icon_url");
        }
        Gson a = k.a();
        this.mPoiImpress = (PoiImpress) a.fromJson(jSONObject.optString("poi_impress"), (Class<Object>) PoiImpress.class);
        this.mPoiLabel = (PoiLabel) a.fromJson(jSONObject.optString("poi_label"), (Class<Object>) PoiLabel.class);
        this.mPoiLabelNew = (PoiLabel) a.fromJson(jSONObject.optString("poi_label_new"), (Class<Object>) PoiLabel.class);
        this.mPoiServiceLabel = (PoiServiceLabel) a.fromJson(jSONObject.optString("poi_service_label"), (Class<Object>) PoiServiceLabel.class);
        this.mPoiCouponEntity = (PoiCouponEntity) a.fromJson(jSONObject.optString("poi_coupon"), (Class<Object>) PoiCouponEntity.class);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("poi_extend_info_entrance");
        if (optJSONArray4 != null) {
            this.poiExtendInfoEntrances = new ArrayList<>();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                PoiExtendInfo poiExtendInfo = new PoiExtendInfo();
                poiExtendInfo.parseJson(optJSONArray4.optJSONObject(i4));
                this.poiExtendInfoEntrances.add(poiExtendInfo);
            }
        }
        this.mPoiDecorationType = jSONObject.optInt("poi_decoration_type");
        try {
            if (jSONObject.optJSONArray("poi_media_info") == null) {
                this.mPoiMediaInfo = (PoiMediaInfo) a.fromJson(jSONObject.optString("poi_media_info"), (Class<Object>) PoiMediaInfo.class);
            }
        } catch (Exception unused) {
        }
        this.shoppingCartPoiImInfo = a.a(jSONObject.optJSONObject("bottom_poi_im_info"));
        this.poiAdDynamicInfo = (PoiAdDynamicInfo) a.fromJson(jSONObject.optString("poi_ad_dynamic_info"), (Class<Object>) PoiAdDynamicInfo.class);
        this.showNewPoiCoupon = jSONObject.optBoolean("show_new_poi_coupon", false);
        this.isInDeliveryRange = jSONObject.optBoolean("in_delivery_range", true);
        this.activityPromotionTip = (ActivityPromotionTip) a.fromJson(jSONObject.optString("activity_promotion_tip"), (Class<Object>) ActivityPromotionTip.class);
        JSONArray optJSONArray5 = jSONObject.optJSONArray("poi_base_label");
        if (optJSONArray5 != null && optJSONArray5.length() > 0) {
            this.poiBaseLabels = new String[optJSONArray5.length()];
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                this.poiBaseLabels[i5] = optJSONArray5.optString(i5);
            }
        }
        JSONArray optJSONArray6 = jSONObject.optJSONArray("poi_recommend_label");
        if (optJSONArray6 != null && optJSONArray6.length() > 0) {
            this.poiRecommendTags = new ArrayList();
            for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                this.poiRecommendTags.add((d) a.fromJson(optJSONArray6.optJSONObject(i6).toString(), (Class<Object>) d.class));
            }
        }
        this.poiScoreGradeDescInfo = jSONObject.optString("wm_poi_score_grade_desc", "");
        this.ugcRecommendInfo = jSONObject.optString("ugc_recommend_info", "");
        this.ugcRecommendInfoPrefix = jSONObject.optString("ugc_recommend_info_prefix", "");
        this.poiStyle = jSONObject.optInt("style", 0);
        this.publicityContent = jSONObject.optString("publicity_content", "");
        this.offline = jSONObject.optBoolean("offline");
        this.brandTopPic = jSONObject.optString("brand_top_pic");
        this.brandSlogan = jSONObject.optString("brand_slogan");
        this.brandSloganUrl = jSONObject.optString("brand_slogan_url");
    }

    private CustomerServiceInfo parseCustomServiceInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "844af0ad601afc0297b0456274917b40", RobustBitConfig.DEFAULT_VALUE)) {
            return (CustomerServiceInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "844af0ad601afc0297b0456274917b40");
        }
        if (jSONObject == null) {
            return null;
        }
        return (CustomerServiceInfo) new Gson().fromJson(jSONObject.toString(), (Class<Object>) CustomerServiceInfo.class);
    }

    public String makeTimeStag(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2b3ac33a19c4f27c5508f599621a815", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2b3ac33a19c4f27c5508f599621a815");
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = ((currentTimeMillis - (currentTimeMillis % 86400000)) / 1000) - 28800;
        if (j >= j2) {
            return ab.a(R.string.wm_platform_poi_today);
        }
        if (j >= j2 - TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC) {
            return ab.a(R.string.wm_platform_poi_yesterday);
        }
        return new SimpleDateFormat("MM-dd").format(new Date(j * 1000));
    }

    @Deprecated
    public boolean isFriendInfoShow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8fdb22f35b26f0b9e362b94cb1a6fa0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8fdb22f35b26f0b9e362b94cb1a6fa0")).booleanValue() : (this.recommendInfo == null || TextUtils.isEmpty(this.recommendInfo.reason)) ? false : true;
    }

    public ActivityItem getCouponItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63d9df9cf044e0cc2a8711598b7fe985", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActivityItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63d9df9cf044e0cc2a8711598b7fe985");
        }
        if (this.poiCouponInfo != null) {
            ActivityItem activityItem = new ActivityItem();
            activityItem.iconUrl = this.poiCouponInfo.iconUrl;
            activityItem.info = this.poiCouponInfo.couponTip;
            return activityItem;
        }
        return null;
    }

    private boolean checkHasCoupon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89024e2fe478557416781f74709a3e1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89024e2fe478557416781f74709a3e1f")).booleanValue();
        }
        if (this.bottomActivities == null || this.bottomActivities.size() == 0) {
            return false;
        }
        Iterator<ActivityItem> it = this.bottomActivities.iterator();
        while (it.hasNext()) {
            if (it.next().isCouponType()) {
                return true;
            }
        }
        return false;
    }

    public boolean isHasCoupon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99b25bcdfa44b02a05c91d0ab1e61928", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99b25bcdfa44b02a05c91d0ab1e61928")).booleanValue();
        }
        if (this.hasCheckCoupon) {
            return this.isHasCoupon;
        }
        this.isHasCoupon = checkHasCoupon();
        this.hasCheckCoupon = true;
        return this.isHasCoupon;
    }

    public boolean isFood() {
        return this.mBuzType == 2 || this.mBuzType == 7 || this.mBuzType == 4 || this.mBuzType == 3;
    }

    public boolean isFreego() {
        return this.mFreeGoInfo != null && this.mFreeGoInfo.is_freego_poi == 1;
    }

    public boolean isLLKAd() {
        return this.adType == 8;
    }

    public boolean isMarkAd() {
        return this.adType == 16;
    }

    public boolean isCPCAd() {
        return this.adType == 2;
    }

    public boolean isAd() {
        return this.adType != 0;
    }

    public boolean showAdIcon() {
        return this.adMark;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df764b4a9baacaae98da15fa9d6be22e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df764b4a9baacaae98da15fa9d6be22e")).intValue() : (int) (this.id ^ (this.id >>> 32));
    }

    public List<ActivityItem> getBottomDiscounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cff2fb24eb730b8f14be3736c9553cdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cff2fb24eb730b8f14be3736c9553cdd");
        }
        if (this.discounts != null && !this.discounts.isEmpty()) {
            this.bottomActivities = new ArrayList<>();
            Iterator<ActivityItem> it = this.discounts.iterator();
            while (it.hasNext()) {
                ActivityItem next = it.next();
                if (next.getType() != 99) {
                    this.bottomActivities.add(next);
                }
            }
        }
        return this.bottomActivities;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class LogField implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("average_delivery_time")
        public int averageDeliveryTime;
        @SerializedName("individual_type")
        public int individualType;
        @SerializedName("poi_type_icon_type")
        public int poiTypeIconType;
        @SerializedName("recommend_type")
        public int recommendType;

        public LogField() {
        }

        public void parse(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8071ba2f45a8eb159940430815df1468", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8071ba2f45a8eb159940430815df1468");
                return;
            }
            this.poiTypeIconType = jSONObject.optInt("poi_type_icon_type");
            this.recommendType = jSONObject.optInt("recommend_type");
            this.averageDeliveryTime = jSONObject.optInt("average_delivery_time");
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LabelInfoListItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_trace_info")
        public ActivityTraceInfo activityTraceInfo;
        @SerializedName("bubble_type")
        public int bubbleType;
        @SerializedName("content")
        public String content;
        @SerializedName("content_color")
        public String contentColor;
        @SerializedName("label_background_color")
        public String labelBackgroundColor;
        @SerializedName("label_frame_color")
        public String labelFrameColor;
        private Integer mBackgroundColorInt;
        private boolean mColorParsed;
        private Integer mContentColorInt;
        private Integer mFrameColorInt;
        private Integer mPreBackgroundColorInt;
        private Integer mPreContentColorInt;
        @SerializedName("poi_service_type")
        public int poiServiceType;
        @SerializedName("pre_content")
        public String preContent;
        @SerializedName("pre_content_color")
        public String preContentColor;
        @SerializedName("pre_label_background_color")
        public String preLabelBackgroundColor;
        @SerializedName("priority")
        public int priority;
        private String tagBgStyle;
        private String tagPreBgStyle;
        @SerializedName("type")
        public int type;

        public LabelInfoListItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d9d880cd8f6b1f89657daea59e6c0ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d9d880cd8f6b1f89657daea59e6c0ef");
                return;
            }
            this.tagBgStyle = "";
            this.tagPreBgStyle = "";
            this.mColorParsed = false;
        }

        public void parseColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "913a79ea04701d8e75fc9df4af4dc675", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "913a79ea04701d8e75fc9df4af4dc675");
            } else if (this.mColorParsed) {
            } else {
                this.mContentColorInt = ColorUtils.a(this.contentColor);
                this.mBackgroundColorInt = ColorUtils.a(this.labelBackgroundColor);
                this.mFrameColorInt = ColorUtils.a(this.labelFrameColor);
                this.mPreContentColorInt = ColorUtils.a(this.preContentColor);
                this.mPreBackgroundColorInt = ColorUtils.a(this.preLabelBackgroundColor);
                this.tagBgStyle = TextUtils.join(CommonConstant.Symbol.UNDERLINE, new Object[]{this.mBackgroundColorInt, this.mFrameColorInt});
                this.tagPreBgStyle = String.valueOf(this.preLabelBackgroundColor);
                this.mColorParsed = true;
            }
        }

        public int getPreContentColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e0a8b75413b8c9d749fb3b741b794f5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e0a8b75413b8c9d749fb3b741b794f5")).intValue();
            }
            parseColor();
            return this.mPreContentColorInt == null ? i : this.mPreContentColorInt.intValue();
        }

        public int getContentColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36906c0839af9e6855482a406e4f510d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36906c0839af9e6855482a406e4f510d")).intValue();
            }
            parseColor();
            return this.mContentColorInt == null ? i : this.mContentColorInt.intValue();
        }

        public int getBackgroundColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35c3e571b30d566043c8f8fd41b65d89", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35c3e571b30d566043c8f8fd41b65d89")).intValue();
            }
            parseColor();
            return this.mBackgroundColorInt == null ? i : this.mBackgroundColorInt.intValue();
        }

        public int getFrameColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45bec59187b5fa279e50440cf98584c6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45bec59187b5fa279e50440cf98584c6")).intValue();
            }
            parseColor();
            return this.mFrameColorInt == null ? i : this.mFrameColorInt.intValue();
        }

        public String getTagBgStyle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "727d470f19e1dc4a8082a1940bb06869", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "727d470f19e1dc4a8082a1940bb06869");
            }
            if (TextUtils.isEmpty(this.tagBgStyle) && !this.mColorParsed) {
                parseColor();
            }
            return this.tagBgStyle;
        }

        public String getPreBgStyle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9779861362f4fa43d67467ce4fd5592d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9779861362f4fa43d67467ce4fd5592d");
            }
            if (TextUtils.isEmpty(this.tagPreBgStyle) && !this.mColorParsed) {
                parseColor();
            }
            return this.tagPreBgStyle;
        }

        public int getPreBackgroundColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0420c2ccdf1e63ed79c4d888b7bf1c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0420c2ccdf1e63ed79c4d888b7bf1c")).intValue();
            }
            parseColor();
            return this.mPreBackgroundColorInt == null ? i : this.mPreBackgroundColorInt.intValue();
        }

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ded7b2dff9bee2a1316c53a0a2b29ce1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ded7b2dff9bee2a1316c53a0a2b29ce1");
            } else if (jSONObject == null) {
            } else {
                this.content = jSONObject.optString("content");
                this.contentColor = jSONObject.optString("content_color");
                this.labelBackgroundColor = jSONObject.optString("label_background_color");
                this.labelFrameColor = jSONObject.optString("label_frame_color");
                this.preContentColor = jSONObject.optString("pre_content_color");
                this.preContent = jSONObject.optString("pre_content");
                this.preLabelBackgroundColor = jSONObject.optString("pre_label_background_color");
                this.bubbleType = jSONObject.optInt("bubble_type");
                this.type = jSONObject.optInt("type");
                this.priority = jSONObject.optInt("priority");
                this.poiServiceType = jSONObject.optInt("poi_service_type");
            }
        }
    }

    public boolean isTextBold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e6b974334ef3b098f92528c0b9aee43", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e6b974334ef3b098f92528c0b9aee43")).booleanValue() : this.boldingList != null && this.boldingList.contains(Integer.valueOf(i));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class PoiDeserializer implements JsonDeserializer<Poi> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public Poi deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a690fd85d96746b3fb69a780e9dca09", RobustBitConfig.DEFAULT_VALUE)) {
                return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a690fd85d96746b3fb69a780e9dca09");
            }
            if (jsonElement.isJsonObject()) {
                Poi poi = new Poi();
                try {
                    poi.parsePoiList(new JSONObject(jsonElement.toString()));
                    return poi;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public Poi deepCopy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b3930ee06ba014a5ed1381edacfb1ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b3930ee06ba014a5ed1381edacfb1ee");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return (Poi) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public int getPoiIndex() {
        return this.poiIndex;
    }

    public String getFormatPoiID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2312fdbea97ef8363833048ecfbd696", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2312fdbea97ef8363833048ecfbd696");
        }
        if (!TextUtils.isEmpty(this.poiIDStr)) {
            return this.poiIDStr;
        }
        return String.valueOf(this.id);
    }
}
