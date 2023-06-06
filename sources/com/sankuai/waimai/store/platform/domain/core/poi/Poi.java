package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.a;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.platform.shop.model.CouponPoiCardInfo;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Poi implements Serializable {
    public static final int ACT_COUPON_STYLE_DEFAULT = 0;
    public static final int ACT_COUPON_STYLE_INDEPENDENT = 2;
    public static final int ACT_COUPON_STYLE_MIXED = 1;
    public static final int BASIC_SHOP_TYPE_COMMENT_NEW = 2;
    public static final int BASIC_SHOP_TYPE_COMMENT_OLD = 1;
    public static final int BRAND_TYPE_DEFAULT = 0;
    public static final int BRAND_TYPE_FLOAT = 2;
    public static final int FLASH_COUPON_STATUS = 1;
    public static final String MODULE_DISCOUNT = "food_discount";
    public static final int POI_RETAIL_TEMPLATE = 1;
    public static final int POI_TEMPLATE_TYPE_BY_STORE_NEW_PAGE = 4;
    public static final int POI_TEMPLATE_TYPE_NORMAL = 0;
    public static final int RESERVATION_FOR_ONLY = 1;
    public static final int RESERVATION_OPEN = 0;
    public static final int STATE_BUSY = 2;
    public static final int STATE_CLOSED = 3;
    public static final int STATE_NORMAL = 1;
    public static final int TYPE_DRUG = 9;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String abExpInfo;
    @SerializedName("ad_type")
    public int adType;
    private String addCartButtonDesc;
    @SerializedName("additional_info")
    public AdditionalInfo addition;
    @SerializedName(GearsLocator.ADDRESS)
    public String address;
    @SerializedName("anchoring_activity_tag_id")
    public String anchorActivityTagId;
    @SerializedName("app_delivery_tip")
    public String appDeliveryTip;
    @SerializedName("poi_back_pic_url")
    public String backgroundUrl;
    @SerializedName("basic_style_type")
    public int basicStyleType;
    private ArrayList<ActivityItem> bottomActivities;
    @SerializedName("bottom_poi_im_info")
    public AppendPoiImInfo bottomPoiImInfo;
    @SerializedName("brand_id")
    public String brandId;
    @SerializedName("brand_story")
    public BrandStory brandStory;
    @SerializedName("brand_type")
    public int brandType;
    @SerializedName("bulletin")
    public String bulletin;
    @SerializedName("can_use_coupon")
    public int canUseCoupon;
    @SerializedName("cart_extend_info")
    @Expose
    public String cartExtendInfo;
    @SerializedName("buz_code")
    public int categoryType;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("comment_number")
    public long commentNumber;
    @SerializedName("container_template")
    public PoiContainerTemplate containerTemplate;
    @SerializedName("poi_card_info")
    public CouponPoiCardInfo couponPoiCardInfo;
    @SerializedName("current_remaining_time_text")
    public String currentRemainingText;
    @SerializedName("current_remaining_time")
    public long currentRemainingTime;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("discounts2")
    public ArrayList<ActivityItem> discounts;
    @SerializedName("distance")
    public String distance;
    @SerializedName("drug_poi_scheme")
    public String drugPoiScheme;
    @SerializedName("extra_for_product_info")
    public String extraForProductInfo;
    @SerializedName("friend_assistance")
    public FriendAssistance friendAssistance;
    @SerializedName("friend_help_coupon_tab")
    public FriendHelpTab friendHelpCouponTab;
    public boolean hasCoupon;
    @SerializedName("head_pic_url")
    public String headPicUrl;
    @SerializedName("visit_time")
    public long iVisiTime;
    @SerializedName("id")
    public long id;
    @SerializedName("insurance_icon")
    public String insuranceIcon;
    @SerializedName("insurance_type")
    public int insuranceType;
    @SerializedName("invoice_support")
    public int invoiceSupport;
    @SerializedName("is_flash_show")
    public int isFlashShow;
    @SerializedName("hide_shopping_car")
    public boolean isHideShoppingCar;
    @SerializedName("is_in_delivery")
    public boolean isInDelivery;
    @SerializedName("new_page_switch")
    public int isNewPage;
    @SerializedName("is_offline")
    public boolean isOffline;
    @SerializedName("is_one_line")
    public boolean isOneLine;
    private transient boolean isPoiCouponAdded;
    public boolean isSelfDelivery;
    private boolean isShowServiceInfo;
    @SerializedName("use_header_info_module")
    public boolean isUserHeaderInfoModule;
    @SerializedName("is_use_new_card_page")
    public int isUserNewCardPage;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    public int latitude;
    @SerializedName("live_id")
    public long liveId;
    @SerializedName("live_pic")
    public String livePic;
    @SerializedName("live_schema")
    public String liveSchema;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    public int longitude;
    private PoiShoppingCart.ActivityInfo mActivityInfo;
    private List<PoiShoppingCart.ActivityInfo> mActivityInfoList;
    public String mAdditionalFields;
    @SerializedName("buz_type")
    public int mBuzType;
    @SerializedName("dynamic_long_labels")
    private ArrayList<NewLabelInfoListItem> mDynamicLongLabels;
    @SerializedName("dynamic_short_labels")
    private ArrayList<NewLabelInfoListItem> mDynamicShortLabels;
    private String mEmptyShoppingCartIconUrl;
    private String mEstimatePackFeeCartTip;
    private String mHighlightPromptText;
    @SerializedName("is_favorite")
    public int mIsFavorite;
    @SerializedName("act_label_info")
    private ArrayList<LabelInfoListItem> mLabelInfoList;
    @SerializedName("live_info")
    private LiveInfo mLiveInfo;
    @SerializedName("drug_member_info")
    public NewMemberInfo mNewMemberInfo;
    @SerializedName("poi_content_info")
    public PoiContentInfo mPoiContentInfo;
    @SerializedName("poi_coupon")
    private PoiCouponEntity mPoiCouponEntity;
    @SerializedName("poi_label_new")
    private PoiLabel mPoiLabelNew;
    @SerializedName("poi_prepare_time")
    public String mPoiPrepareTime;
    @SerializedName("promotion_head_pic_height")
    public int mPromotionHeadPicHeight;
    @SerializedName("promotion_head_pic_url")
    public String mPromotionHeadPicUrl;
    private String mPromptText;
    @SerializedName("purchased_type")
    public int mPurchasedType;
    private String mSelfDeliveryTip;
    private String mShippingFeeCartTip;
    private String mShopcartBgColor;
    private String mShoppingCartIconUrl;
    @SerializedName("worry_free_info")
    public WorryFreeInfo mWorryFreeInfo;
    @SerializedName("marketing_info_extend")
    @Expose
    public String marketingInfoExtend;
    @SerializedName("member_info")
    public PoiMemberInfo memberInfo;
    @SerializedName("min_price_tip")
    public String minPriceTip;
    @SerializedName("min_price")
    public double min_price;
    @SerializedName("month_sales_tip")
    public String monthSale;
    @SerializedName("msc_additional_info")
    public MSCAdditionalInfo mscAdditionalInfo;
    @SerializedName("delivery_time_tip")
    public String mtDeliveryTime;
    @SerializedName("name")
    public String name;
    @SerializedName("name_tag")
    public String nameTag;
    @SerializedName("new_promotion")
    public int newPromotion;
    @SerializedName("new_user_discount_restrict")
    private int newUserDiscountRestrict;
    @SerializedName("new_user_discount_restrict_toast")
    public String newUserDiscountRestrictToast;
    @SerializedName(ConfigInfo.MODULE_NEW_USER_REGION)
    private PoiNewUserRegion newUserRegion;
    @SerializedName("next_delivery_time_text")
    public String nextDeliveryTimeText;
    @SerializedName("next_delivery_time_type")
    public int nextDeliveryTimeType;
    @SerializedName("next_sell_time_text")
    public String nextSellTimeText;
    @SerializedName("discount_restrict")
    private int numDiscountRestrict;
    @SerializedName("plus_discount_restrict")
    private int numPlusDiscountRestrict;
    @SerializedName("order_preview_extend")
    @Expose
    public String orderPreviewExtend;
    @SerializedName("origin_packing_fee_tip")
    public String originPackingFeeTip;
    @SerializedName("origin_shipping_fee")
    public double originShippingFee;
    @SerializedName("origin_shipping_fee_tip")
    public String originShippingFeeTip;
    @SerializedName("original_delivery_type")
    public int originalDeliveryType;
    @SerializedName("packing_fee")
    public double packingFee;
    @SerializedName("packing_fee_tip")
    public String packingFeeTip;
    @SerializedName("phone")
    public String phone;
    @SerializedName("phone_list")
    public ArrayList<String> phoneList;
    @SerializedName("pic_url")
    public String picUrl;
    public PoiComment poiComment;
    @SerializedName("poi_coupon_info")
    public PoiCouponInfo poiCouponInfo;
    @SerializedName("story_info")
    public PoiDetailStoryInfo poiDetailStoryInfo;
    @SerializedName("poi_extend_info_entrance")
    public ArrayList<PoiExtendInfo> poiExtendInfoEntrances;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("wm_poi_score")
    public double poiScore;
    @SerializedName("poi_sell_status")
    public int poiSellStatus;
    @SerializedName("poiSpuSaleText")
    public String poiSpuSaleText;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("poi_type_icon_text")
    public String poiTypeIconText;
    @SerializedName("poi_type_icon_type")
    public String poiTypeIconType;
    @SerializedName("preview_order_callback_info")
    public String previewOrderCallbackInfo;
    @SerializedName("products")
    public List<Product> products;
    public String rankTraceId;
    public RecommendRank recommendRank;
    @SerializedName("recommend_tip")
    public String recommendTip;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("poi_delivery_content1")
    public String salePhone;
    @SerializedName("poi_delivery_content2")
    public String saleTip;
    @SerializedName("scheme_for_inshop")
    public String schemeForInshop;
    @SerializedName("score")
    public double score;
    @SerializedName("self_delivery_icon")
    public String selfDeliveryIcon;
    @SerializedName("self_sell_poi")
    public boolean selfSellPoi;
    @SerializedName("share_label_info")
    public List<LabelInfoListItem> shareLabelInfo;
    @SerializedName("share_tip")
    public SCShareTip shareTip;
    @SerializedName("shipping_fee")
    public double shippingFee;
    @SerializedName("shipping_fee_tip")
    public String shippingFeeTip;
    @SerializedName("shipping_time")
    public String shippingTime;
    @SerializedName("status")
    public int state;
    @SerializedName("subscribe")
    public int subscribe;
    @SerializedName("super_drugstore")
    public String superDrugstore;
    @SerializedName("super_drugstore_head_card_img")
    public String superDrugstoreCardImg;
    @SerializedName("super_drugstore_pop_card_img")
    public String superDrugstorePopCardImg;
    @SerializedName("super_drugstore_slogan")
    public String superDrugstoreSlogan;
    @SerializedName("support_pay")
    public int supportOnlinePay;
    private PoiShoppingCart.TaskActivity taskActivity;
    @SerializedName("restrict_toast")
    public String toastDiscountRestrict;
    @SerializedName("plus_discount_toast")
    public String toastPlusDiscountRestrict;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BrandStory implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("play")
        public boolean play;
        @SerializedName("show_type")
        public int type;
        @SerializedName("brand_story_url")
        public String url;
        @SerializedName("video_first_frame")
        public String videoFirstFrameUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponSummary implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_count_tip")
        public String mCouponCountTip;
        @SerializedName("receive_status")
        public int mReceiveStatus;
        @SerializedName("summary_tip")
        public String mSummaryTip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponTab implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public transient int listPosition = -1;
        @SerializedName("tab_name")
        public String name;
        @SerializedName("tab_type")
        public String tabType;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponTabInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_category_list")
        public List<CouponCategoryList> couponCategoryLists;
        @SerializedName("coupon_tab_list")
        public ArrayList<CouponTab> couponTabs;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MSCAdditionalInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("sg_msc_poi_comment")
        public String sgMSCCommentPage;
        @SerializedName("sg_msc_poi_title")
        public String sgMSCHalfPage;
        @SerializedName("sg_msc_poi_comment_tab")
        public String sgMSCPoiCommentTab;
        @SerializedName("sg_msc_poi_detail")
        public String sgMSCPoiDetail;
        @SerializedName("sg_msc_poi_vip")
        public String sgMSCPoiVip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MemberToken implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("token")
        public String token;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class NewLabelInfoListItem extends d {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("sg_capi_scheme")
        public String apiScheme;
        @SerializedName("sg_capi_business_type")
        public long businessType;
        @SerializedName("sg_capi_display_code")
        public long displayCode;
        @SerializedName("sg_capi_act_id")
        public long id;
        @SerializedName("sg_capi_poi_service_type")
        public int poiServiceType;
        @SerializedName("sg_capi_priority")
        public int priority;
        @SerializedName("sg_capi_tag_id")
        public String tagId;
        @SerializedName("sg_capi_type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiComment implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("comment")
        public String comment;
        @SerializedName("comment_labels")
        public List<String> commentLabels;
        @SerializedName("comment_num")
        public int commentNum;
        @SerializedName("comment_score")
        public String commentScore;
        @SerializedName("comments")
        public List<String> comments;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiImpressLabel implements Serializable {
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

    public Poi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc74324977c646cbf5cf000e38afbaeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc74324977c646cbf5cf000e38afbaeb");
            return;
        }
        this.id = -1L;
        this.poiIdStr = null;
        this.bottomActivities = new ArrayList<>();
        this.originalDeliveryType = -1;
    }

    public int getNumDiscountRestrict() {
        this.numDiscountRestrict = this.numDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.numDiscountRestrict;
        return this.numDiscountRestrict;
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

    public void setLabelInfoList(ArrayList<LabelInfoListItem> arrayList) {
        this.mLabelInfoList = arrayList;
    }

    public void setPoiCouponEntity(PoiCouponEntity poiCouponEntity) {
        this.mPoiCouponEntity = poiCouponEntity;
    }

    public boolean isShowShopRestBottomTip() {
        return (this.state == 3 || this.nextDeliveryTimeType == 1) && !this.isOffline;
    }

    public boolean needHideAddButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29b5b1df41118e3ec3633bde72fd5e00", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29b5b1df41118e3ec3633bde72fd5e00")).booleanValue() : (this.state == 3 && TextUtils.isEmpty(this.nextSellTimeText)) || (this.state != 3 && this.nextDeliveryTimeType == 1);
    }

    public void setAdditionalFields(String str) {
        this.mAdditionalFields = str;
    }

    public String getAdditionalFields() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99475772dab210ed5c588fa1e8216342", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99475772dab210ed5c588fa1e8216342") : t.a(this.mAdditionalFields) ? "" : this.mAdditionalFields;
    }

    public FriendAssistance getFriendAssistance() {
        return this.friendAssistance;
    }

    public LiveInfo getLiveInfo() {
        return this.mLiveInfo;
    }

    public PoiLabel getNewPoiLabels() {
        return this.mPoiLabelNew;
    }

    public void setNewPoiLabels(PoiLabel poiLabel) {
        this.mPoiLabelNew = poiLabel;
    }

    public void setShareTip(SCShareTip sCShareTip) {
        this.shareTip = sCShareTip;
    }

    public void setBulletin(String str) {
        this.bulletin = str;
    }

    public PoiCouponEntity getPoiCoupon() {
        return this.mPoiCouponEntity;
    }

    public void setCouponEntryWithFlash(PoiCouponEntity poiCouponEntity) {
        if (poiCouponEntity != null) {
            this.mPoiCouponEntity = poiCouponEntity;
        }
    }

    public void setAbExpInfo(String str) {
        this.abExpInfo = str;
    }

    public String getAbExpInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff626ce2aa35315c7a2aa9e9259ae7f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff626ce2aa35315c7a2aa9e9259ae7f2") : TextUtils.isEmpty(this.abExpInfo) ? "-999" : this.abExpInfo;
    }

    public void setPoiComment(PoiComment poiComment) {
        this.poiComment = poiComment;
    }

    public void setRecommendRank(RecommendRank recommendRank) {
        this.recommendRank = recommendRank;
    }

    public boolean isFloatWindowVideoStrategy() {
        return this.brandStory != null && this.brandStory.type == 2;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponEntity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("new_poi_act_coupon_style")
        public int actCouponStyle;
        @SerializedName("coupon_category_list")
        public List<CouponCategoryList> couponCategoryLists;
        @SerializedName("discount_desc")
        public String couponDiscountDesc;
        @SerializedName("coupon_tab_info")
        public CouponTabInfo couponTabInfo;
        @SerializedName("discount_number")
        public int discountNumber;
        @SerializedName("extend_info")
        public Map<String, String> extendInfo;
        @SerializedName("coupon_summary")
        public CouponSummary mCouponSummary;
        @SerializedName("poi_member_grade")
        public int poiMemberGrade;
        @SerializedName("show_coupon_gif")
        public boolean showCouponAnimation;

        public List<CouponCategoryList> getPoiCouponCategoryList() {
            return this.couponCategoryLists;
        }

        private ArrayList<PoiCouponItem> getPoiCouponItems(List<CouponCategoryList> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbb6c392f3375b5e602296e5d688ae74", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbb6c392f3375b5e602296e5d688ae74");
            }
            ArrayList<PoiCouponItem> arrayList = new ArrayList<>();
            if (a.b(list)) {
                return arrayList;
            }
            for (CouponCategoryList couponCategoryList : list) {
                if (couponCategoryList != null && !a.b(couponCategoryList.poiCouponItems)) {
                    arrayList.addAll(couponCategoryList.poiCouponItems);
                }
            }
            return arrayList;
        }

        public ArrayList<PoiCouponItem> getPoiCouponItems() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d92870f9e2182d2ee5b066159d4b2387", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d92870f9e2182d2ee5b066159d4b2387");
            }
            ArrayList<PoiCouponItem> poiCouponItems = getPoiCouponItems(this.couponCategoryLists);
            return a.a((Collection<?>) poiCouponItems) ? poiCouponItems : getPoiCouponItemsFromSubCouponCategoryList();
        }

        public ArrayList<PoiCouponItem> getPoiCouponItemsFromSubCouponCategoryList() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72792ed5c63989b8728779907ed5794a", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72792ed5c63989b8728779907ed5794a");
            }
            ArrayList<PoiCouponItem> arrayList = new ArrayList<>();
            if (a.a((Collection<?>) this.couponCategoryLists)) {
                for (CouponCategoryList couponCategoryList : this.couponCategoryLists) {
                    if (couponCategoryList != null) {
                        arrayList.addAll(getPoiCouponItems(couponCategoryList.subCategoryLists));
                    }
                }
            }
            return arrayList;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponCategoryList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DataConstants.CATEGORY_ID)
        public String categoryId;
        @SerializedName("category_name")
        public String categoryName;
        @SerializedName("collage_float_text")
        public String collageFloatText;
        @SerializedName("coupon_list")
        public List<PoiCouponItem> poiCouponItems;
        @SerializedName("coupon_sub_category_list")
        public List<CouponCategoryList> subCategoryLists;
        @SerializedName("tab_type")
        public String tabType;
        @SerializedName("welcome_word")
        public String welcomeWord;

        @NonNull
        public CouponCategoryList copy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b4455a52ce642e10ec9c44d9dd2e05d", RobustBitConfig.DEFAULT_VALUE)) {
                return (CouponCategoryList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b4455a52ce642e10ec9c44d9dd2e05d");
            }
            CouponCategoryList couponCategoryList = new CouponCategoryList();
            couponCategoryList.categoryName = this.categoryName;
            couponCategoryList.categoryId = this.categoryId;
            couponCategoryList.collageFloatText = this.collageFloatText;
            couponCategoryList.poiCouponItems = this.poiCouponItems;
            couponCategoryList.tabType = this.tabType;
            couponCategoryList.welcomeWord = this.welcomeWord;
            couponCategoryList.subCategoryLists = this.subCategoryLists;
            return couponCategoryList;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponItem implements Serializable {
        public static final int COUPON_NEW_CARD_PAGE = 1;
        public static final int COUPON_TAB_PREFERENTIAL = 2;
        public static final int COUPON_TYPE_ACTIVITY = 127;
        public static final int COUPON_TYPE_AUTO_USE = 7;
        public static final int COUPON_TYPE_DISCOUONT = 124;
        public static final int COUPON_TYPE_DISCOUONT_NEW = 2;
        public static final int COUPON_TYPE_DRUG_MEMBER = 20054;
        public static final int COUPON_TYPE_EXCHANGE = 4;
        public static final int COUPON_TYPE_GOODS = 117;
        public static final int COUPON_TYPE_GOODS_NEW = 1;
        public static final int COUPON_TYPE_MEMBER = 20016;
        public static final int COUPON_TYPE_MEMBER_NEW = 3;
        public static final int COUPON_TYPE_MT_PAY = 14;
        public static final int COUPON_TYPE_PACKAGE = 8;
        public static final int MEMBER_EXCHANGE_TYPE = 9;
        public static final int MEMBER_FULL_REDUCTION_TYPE = 10;
        public static final int MEMBER_POI_GOD_COUPON_TYPE = 13;
        public static final int MEMBER_POI_NORMAL_DISCOUNT_COUPON_TYPE = 11;
        public static final int MEMBER_POI_SCORE_DISCOUNT_COUPON_TYPE = 12;
        public static final int STATUS_HAS_EXCHANGED = 1;
        public static final int STATUS_NOT_EXCHANGED = 0;
        public static final int STATUS_NO_PACKAGE_COUPON = 2;
        public static final int STATUS_RECEIVE_SUCCESS = 0;
        public static final int STATUS_SOLD_OUT = 4;
        public static final int TAB_CODE_COUPONS_PURCHASE = 3;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_action_type")
        public int couponActionType;
        @SerializedName("coupon_labels")
        public List<CouponLabel> couponLabelList;
        @SerializedName("coupon_show_type")
        public int couponShowType;
        @SerializedName("coupon_type_label")
        public String couponTypeName;
        @SerializedName("ctime")
        public String ctime;
        @SerializedName("dynamic_act_labels")
        public d dynamicActLabels;
        @SerializedName("etime")
        public String etime;
        @SerializedName("amount_text_prefix")
        public String exchangeCouponPrefix;
        @SerializedName("extra_data")
        public String extraData;
        @SerializedName("activity_id")
        public long mActivityId;
        @SerializedName("activity_id_str")
        public String mActivityIdStr;
        @SerializedName("coupon_button_text")
        public String mCouponButtonText;
        @SerializedName("coupon_condition_text")
        public String mCouponConditionText;
        @SerializedName("coupon_id")
        public long mCouponId;
        @SerializedName("coupon_id_str")
        public String mCouponIdStr;
        @SerializedName("coupon_name")
        public String mCouponName;
        @SerializedName("coupon_pool_id")
        public long mCouponPoolId;
        @SerializedName("coupon_credit")
        public int mCouponScore;
        @SerializedName("coupon_status")
        public int mCouponStatus;
        @SerializedName("coupon_type")
        public int mCouponType;
        @SerializedName("coupon_valid_time_text")
        public String mCouponValidTimeText;
        @SerializedName("coupon_value")
        public double mCouponValue;
        @SerializedName("coupon_view_id")
        public String mCouponViewID;
        @SerializedName("is_limit_new_user")
        public boolean mIsLimitNewUser;
        @SerializedName("new_limit_price")
        public String mNewLimitPrice;
        @SerializedName("scheme_url")
        public String mSchemeUrl;
        @SerializedName("useRule")
        public String mUseRuleText;
        @SerializedName("mt_member_status")
        public int mtMemberStatus;
        @SerializedName("payment_tracking_info")
        public String paymentTrackingInfo;
        @SerializedName("play_id")
        public String playId;
        @SerializedName("poi_id")
        public long poiId;
        @SerializedName("prize_id")
        public String prizeId;
        @SerializedName("product_num")
        public int productNum;
        @SerializedName("product_pic")
        public String productPic;
        @SerializedName("receive_count_text")
        public String receiveCountText;
        @SerializedName("reward_package_id")
        public String rewardPackageId;
        @SerializedName("reward_type")
        public String rewardType;
        @SerializedName("session_id")
        public String sessionId;
        @SerializedName("short_coupon_button_text")
        public String shortCouponButtonText;
        @SerializedName("stime")
        public String stime;
        @SerializedName("tab_type")
        public String tabType;
        @SerializedName("sg_task_grab_info")
        public CouponCollectionTip taskGrabInfo;
        @SerializedName("tracking_info")
        public Map<String, String> trackInfo;
        @SerializedName("unique_identify_code")
        public String uniqueIdentifyCode;

        public boolean isCouponHasGone() {
            return this.mCouponStatus == 4;
        }

        public boolean isCouponReceived() {
            return this.mCouponStatus == 1;
        }

        public void copyValueFrom(PoiCouponItem poiCouponItem) {
            Object[] objArr = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59ec50054e128d914e9cb7ee4dc90b4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59ec50054e128d914e9cb7ee4dc90b4d");
                return;
            }
            copyMainValueFrom(poiCouponItem);
            copyExtraValueFrom(poiCouponItem);
        }

        public void copyMainValueFrom(PoiCouponItem poiCouponItem) {
            Object[] objArr = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2093b64985373a152a41ec1338ab7b39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2093b64985373a152a41ec1338ab7b39");
                return;
            }
            this.mCouponId = poiCouponItem.mCouponId;
            this.mCouponStatus = poiCouponItem.mCouponStatus;
            this.mCouponValidTimeText = poiCouponItem.mCouponValidTimeText;
            this.mCouponButtonText = poiCouponItem.mCouponButtonText;
            this.shortCouponButtonText = poiCouponItem.shortCouponButtonText;
            this.mSchemeUrl = poiCouponItem.mSchemeUrl;
            this.dynamicActLabels = poiCouponItem.dynamicActLabels;
            this.mCouponViewID = poiCouponItem.mCouponViewID;
        }

        public void copyExtraValueFrom(PoiCouponItem poiCouponItem) {
            Object[] objArr = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71659496eb7fa04528daca772082e410", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71659496eb7fa04528daca772082e410");
                return;
            }
            this.mCouponName = poiCouponItem.mCouponName;
            this.mCouponValue = poiCouponItem.mCouponValue;
            this.mCouponConditionText = poiCouponItem.mCouponConditionText;
            this.mCouponPoolId = poiCouponItem.mCouponPoolId;
            this.mActivityId = poiCouponItem.mActivityId;
            this.mCouponScore = poiCouponItem.mCouponScore;
            this.mIsLimitNewUser = poiCouponItem.mIsLimitNewUser;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("labels")
        public ArrayList<PoiImpressLabel> labels;

        public ArrayList<PoiImpressLabel> getFilterLabels() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de6b7d1c462b6e686b3a8898ea2073aa", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de6b7d1c462b6e686b3a8898ea2073aa");
            }
            if (a.b(this.labels)) {
                return null;
            }
            ArrayList<PoiImpressLabel> arrayList = new ArrayList<>();
            Iterator<PoiImpressLabel> it = this.labels.iterator();
            while (it.hasNext()) {
                PoiImpressLabel next = it.next();
                if (next != null && !t.a(next.labelDescText)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public String getShoppingCartIconUrl() {
        return this.mShoppingCartIconUrl;
    }

    public void setShoppingCartIconUrl(String str) {
        this.mShoppingCartIconUrl = str;
    }

    public String getShippingFeeCartTip() {
        return this.mShippingFeeCartTip;
    }

    public void setShippingFeeCartTip(String str) {
        this.mShippingFeeCartTip = str;
    }

    public String getEstimatePackFeeCartTip() {
        return this.mEstimatePackFeeCartTip;
    }

    public void setEstimatedPackFeeCartTip(String str) {
        this.mEstimatePackFeeCartTip = str;
    }

    public String getSelfDeliveryTip() {
        return this.mSelfDeliveryTip;
    }

    public void setSelfDeliveryTip(String str) {
        this.mSelfDeliveryTip = str;
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

    public String getPlusScheme() {
        PoiShoppingCart.ActivityInfo.PolicyItem policyItem;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18bc1f47ec40412ad7f06181fb73ea9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18bc1f47ec40412ad7f06181fb73ea9c");
        }
        List<PoiShoppingCart.ActivityInfo> activityInfoList = getActivityInfoList();
        if (a.a((Collection<?>) activityInfoList)) {
            for (PoiShoppingCart.ActivityInfo activityInfo : activityInfoList) {
                if (activityInfo != null && activityInfo.type == 3) {
                    List<PoiShoppingCart.ActivityInfo.PolicyItem> policyList = activityInfo.getPolicyList();
                    if (a.a((Collection<?>) policyList) && (policyItem = policyList.get(0)) != null) {
                        return policyItem.plusScheme;
                    }
                }
            }
            return "";
        }
        return "";
    }

    public void setShopCartBgColor(String str) {
        this.mShopcartBgColor = str;
    }

    public String getPromptText() {
        return this.mPromptText;
    }

    public String getHighlightPromptText() {
        return this.mHighlightPromptText;
    }

    public void setPromptText(String str) {
        this.mPromptText = str;
    }

    public void setHighlightPromptText(String str) {
        this.mHighlightPromptText = str;
    }

    public void setAddCartButtonDesc(String str) {
        this.addCartButtonDesc = str;
    }

    public void setTaskActivity(PoiShoppingCart.TaskActivity taskActivity) {
        this.taskActivity = taskActivity;
    }

    public PoiShoppingCart.TaskActivity getTaskActivity() {
        return this.taskActivity;
    }

    public String getAddCartButtonDesc() {
        return this.addCartButtonDesc;
    }

    public String getEmptyShoppingCartIconUrl() {
        return this.mEmptyShoppingCartIconUrl;
    }

    public void setEmptyShoppingCartIconUrl(String str) {
        this.mEmptyShoppingCartIconUrl = str;
    }

    public boolean isCityDelivery() {
        return this.deliveryType == 2;
    }

    public SCShareTip getShareTip() {
        return this.shareTip;
    }

    public List<LabelInfoListItem> getShareLabelInfo() {
        return this.shareLabelInfo;
    }

    public void parseShareTip(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d53af1cacc36a7fd5d03d1696482ba92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d53af1cacc36a7fd5d03d1696482ba92");
        } else if (jSONObject == null || jSONObject.length() <= 0) {
        } else {
            this.shareTip = new SCShareTip();
            this.shareTip.parseJson(jSONObject);
        }
    }

    public String getShopcartBgColor() {
        return this.mShopcartBgColor;
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

    public String getPoiLogoStoryIcon() {
        return this.poiDetailStoryInfo != null ? this.poiDetailStoryInfo.poiLogoIcon : "";
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

    @Deprecated
    public long getId() {
        return this.id;
    }

    public String getSMPoiIdStr() {
        return this.poiIdStr;
    }

    public void setSMPoiIdStr(String str) {
        this.poiIdStr = str;
    }

    public void setId(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0c7cc1c9da6712362cf62c3009eacf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0c7cc1c9da6712362cf62c3009eacf2");
            return;
        }
        this.id = j;
        this.poiIdStr = str;
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef066f6a303a4d274cd18a42fe6f07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef066f6a303a4d274cd18a42fe6f07a");
        } else {
            this.id = j;
        }
    }

    public String getOfficialPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4daeca2774ef60451e74bd922749dd6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4daeca2774ef60451e74bd922749dd6c");
        }
        if (isDrugShop()) {
            return getDrugOfficialPoiId();
        }
        return getSMOfficialPoiId();
    }

    @Deprecated
    public long getLongPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38523a1508b4a7425d2e4b5dec0fcd08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38523a1508b4a7425d2e4b5dec0fcd08")).longValue();
        }
        if (isDrugShop()) {
            return getDrugLongPoiId();
        }
        return getSMLongPoiId();
    }

    public String getStringPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf9cf956b690f54eb58ae65b6a78c9a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf9cf956b690f54eb58ae65b6a78c9a7");
        }
        if (isDrugShop()) {
            return getDrugStringPoiId();
        }
        return getSMStringPoiId();
    }

    private boolean isDrugShop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e21dd5c96c0aab791b7eca8be77466", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e21dd5c96c0aab791b7eca8be77466")).booleanValue() : getBuzType() == 9;
    }

    private long getDrugLongPoiId() {
        return this.id;
    }

    private String getDrugStringPoiId() {
        return this.poiIdStr;
    }

    private String getDrugOfficialPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ab04716ad1ef77a5a28889bd5bd5854", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ab04716ad1ef77a5a28889bd5bd5854");
        }
        if (!TextUtils.isEmpty(this.poiIdStr)) {
            return this.poiIdStr;
        }
        return String.valueOf(this.id);
    }

    private long getSMLongPoiId() {
        return this.id;
    }

    private String getSMStringPoiId() {
        return this.poiIdStr;
    }

    private String getSMOfficialPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "271bc830fabcd61532cf14b0f468b6a3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "271bc830fabcd61532cf14b0f468b6a3") : com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.poiIdStr, this.id);
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }

    public double getOriginShippingFee() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17b073b54a04f5e5b4d1cd93da09a5b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17b073b54a04f5e5b4d1cd93da09a5b5")).doubleValue();
        }
        if (Double.isNaN(this.originShippingFee)) {
            return 0.0d;
        }
        return this.originShippingFee;
    }

    public double getMinPrice() {
        return this.min_price;
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

    public String getRestBulletin() {
        return this.bulletin;
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

    public boolean isFavorite() {
        return this.mIsFavorite == 1;
    }

    public void setFavorite(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc8d1311838f96ff75cb606724d85702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc8d1311838f96ff75cb606724d85702");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce4ae9c1d3096a4d2772348ecffdf43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce4ae9c1d3096a4d2772348ecffdf43");
        } else {
            this.commentNumber = j;
        }
    }

    public ArrayList<ActivityItem> getBottomActivities() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0572aeb46b81f25d31af92b63208658b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0572aeb46b81f25d31af92b63208658b");
        }
        ArrayList<ActivityItem> arrayList = this.bottomActivities;
        if (this.poiCouponInfo != null && !this.isPoiCouponAdded) {
            this.isPoiCouponAdded = true;
            ActivityItem activityItem = new ActivityItem();
            activityItem.setIconUrl(this.poiCouponInfo.iconUrl);
            activityItem.setInfo(this.poiCouponInfo.couponTip);
            arrayList.add(activityItem);
        }
        return arrayList;
    }

    public int getBuzType() {
        return this.mBuzType;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a113e6dbb83c2188c2a4d6a2b7eac1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a113e6dbb83c2188c2a4d6a2b7eac1f");
        } else if (this.containerTemplate != null) {
            this.containerTemplate.type = i;
        } else {
            this.containerTemplate = new PoiContainerTemplate();
            this.containerTemplate.type = i;
        }
    }

    public List<Product> getProductList() {
        return this.products;
    }

    public void setIsSelfDelivery(boolean z) {
        this.isSelfDelivery = z;
    }

    public String getHeadPicUrl() {
        return this.headPicUrl;
    }

    public String getPromotionHeadPicUrl() {
        return this.mPromotionHeadPicUrl;
    }

    public ArrayList<LabelInfoListItem> getLabelInfoList() {
        return this.mLabelInfoList;
    }

    public PoiNewUserRegion getNewUserRegion() {
        return this.newUserRegion;
    }

    public ArrayList<NewLabelInfoListItem> getDynamicShortLabels() {
        return this.mDynamicShortLabels;
    }

    public ArrayList<NewLabelInfoListItem> getDynamicLongLabels() {
        return this.mDynamicLongLabels;
    }

    private void parsePoiCommonModelInPoi(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53acd557b0d9a78962c600a88ec769a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53acd557b0d9a78962c600a88ec769a2");
            return;
        }
        this.id = jSONObject.optLong("id");
        this.poiIdStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        this.name = jSONObject.optString("name");
        this.selfDeliveryIcon = jSONObject.optString("self_delivery_icon");
        this.poiSellStatus = jSONObject.optInt("poi_sell_status");
        this.state = jSONObject.optInt("status");
        this.picUrl = jSONObject.optString("pic_url");
        this.poiTypeIcon = jSONObject.optString("poi_type_icon");
        this.poiTypeIconText = jSONObject.optString("poi_type_icon_text");
        this.poiTypeIconType = jSONObject.optString("poi_type_icon_type");
        this.brandId = jSONObject.optString("brand_id");
        this.brandStory = (BrandStory) i.a(jSONObject.optString("brand_story"), BrandStory.class);
        this.mLiveInfo = LiveInfo.fromJson(jSONObject.optString("live_info"));
        this.poiScore = jSONObject.optDouble("wm_poi_score", 0.0d);
        this.distance = jSONObject.optString("distance");
        this.deliveryType = jSONObject.optInt("delivery_type");
        this.isHideShoppingCar = jSONObject.optBoolean("hide_shopping_car");
        this.originalDeliveryType = jSONObject.optInt("original_delivery_type");
        this.shippingFeeTip = jSONObject.optString("shipping_fee_tip");
        this.originShippingFeeTip = jSONObject.optString("origin_shipping_fee_tip");
        this.originShippingFee = jSONObject.optDouble("origin_shipping_fee", 0.0d);
        this.minPriceTip = jSONObject.optString("min_price_tip");
        this.mtDeliveryTime = jSONObject.optString("delivery_time_tip");
        this.restaurantScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.insuranceType = jSONObject.optInt("insurance_type");
        this.insuranceIcon = jSONObject.optString("insurance_icon");
        this.anchorActivityTagId = jSONObject.optString("anchoring_activity_tag_id");
        this.drugPoiScheme = jSONObject.optString("drug_poi_scheme");
        this.livePic = jSONObject.optString("live_pic");
        this.liveId = jSONObject.optLong("live_id");
        this.liveSchema = jSONObject.optString("live_schema");
        JSONArray optJSONArray = jSONObject.optJSONArray("discounts2");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("dynamic_long_label_json_list");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            this.mDynamicLongLabels = (ArrayList) i.a().fromJson(optJSONArray2.toString(), new TypeToken<ArrayList<NewLabelInfoListItem>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.1
            }.getType());
            this.discounts = new ArrayList<>();
            int size = this.mDynamicLongLabels.size();
            for (int i = 0; i < size; i++) {
                NewLabelInfoListItem newLabelInfoListItem = this.mDynamicLongLabels.get(i);
                if (newLabelInfoListItem != null) {
                    ActivityItem activityItem = new ActivityItem();
                    activityItem.setDisplayCode((int) newLabelInfoListItem.displayCode);
                    activityItem.setType(newLabelInfoListItem.type);
                    if (!a.b(newLabelInfoListItem.subTagBaseInfoList) && newLabelInfoListItem.subTagBaseInfoList.size() >= 2) {
                        activityItem.setInfo(newLabelInfoListItem.subTagBaseInfoList.get(1).h);
                        activityItem.setIconUrl(newLabelInfoListItem.subTagBaseInfoList.get(0).e);
                    }
                    activityItem.setUseIconFromServer(true);
                    activityItem.setTagId(newLabelInfoListItem.tagId);
                    activityItem.apiScheme = newLabelInfoListItem.apiScheme;
                    this.discounts.add(activityItem);
                    if (newLabelInfoListItem.displayCode == 2) {
                        this.bottomActivities.add(activityItem);
                    }
                }
            }
        } else if (optJSONArray != null && optJSONArray.length() > 0) {
            this.discounts = new ArrayList<>();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                ActivityItem activityItem2 = new ActivityItem();
                int optInt = optJSONObject.optInt("display_code");
                activityItem2.setDisplayCode(optInt);
                activityItem2.setType(optJSONObject.optInt("type"));
                activityItem2.setInfo(optJSONObject.optString("info"));
                activityItem2.setIconUrl(optJSONObject.optString("icon_url"));
                activityItem2.setUseIconFromServer(optJSONObject.optInt("use_icon_from_server") == 1);
                activityItem2.setTagId(optJSONObject.optString("tag_id"));
                this.discounts.add(activityItem2);
                if (optInt == 2) {
                    this.bottomActivities.add(activityItem2);
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("dynamic_short_labels");
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            this.mDynamicShortLabels = (ArrayList) i.a().fromJson(optJSONArray3.toString(), new TypeToken<ArrayList<NewLabelInfoListItem>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.2
            }.getType());
        }
        this.isOffline = jSONObject.optBoolean("is_offline");
        this.currentRemainingTime = jSONObject.optLong("current_remaining_time");
        this.currentRemainingText = jSONObject.optString("current_remaining_time_text", "");
        this.nextSellTimeText = jSONObject.optString("next_sell_time_text", "");
        this.nextDeliveryTimeText = jSONObject.optString("next_delivery_time_text", "");
        this.nextDeliveryTimeType = jSONObject.optInt("next_delivery_time_type");
    }

    public void setBottomActivities(List<ActivityItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d82f4e630ca9ce66215886fbe3856959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d82f4e630ca9ce66215886fbe3856959");
        } else if (!a.b(list)) {
            for (int i = 0; i < list.size(); i++) {
                ActivityItem activityItem = (ActivityItem) a.a((List<Object>) list, i);
                if (activityItem != null && activityItem.displayCode == 2) {
                    this.bottomActivities.add(activityItem);
                }
            }
        }
    }

    public void parseJsonToPoi(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e10ab8721291c67a9734d1cbf095dbf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e10ab8721291c67a9734d1cbf095dbf1");
            return;
        }
        parsePoiCommonModelInPoi(jSONObject);
        parseFriendAssit(jSONObject);
        parseFriendCoupon(jSONObject);
        try {
            parseShareTip(jSONObject.optJSONObject("share_tip"));
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a("Poi", "获取资质图片失败：" + e.getMessage(), new Object[0]);
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("share_label_info");
            if (optJSONArray != null) {
                this.shareLabelInfo = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    LabelInfoListItem labelInfoListItem = new LabelInfoListItem();
                    labelInfoListItem.parseJson(optJSONArray.optJSONObject(i));
                    this.shareLabelInfo.add(labelInfoListItem);
                }
            }
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.d("Poi", e2.getMessage(), new Object[0]);
        }
        this.phone = jSONObject.optString("phone");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("phone_list");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            this.phoneList = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.phoneList.add(optJSONArray2.optString(i2));
            }
        }
        this.brandId = jSONObject.optString("brand_id");
        this.bottomPoiImInfo = AppendPoiImInfo.a(jSONObject.optJSONObject("bottom_poi_im_info"));
        this.salePhone = jSONObject.optString("poi_delivery_content1");
        this.selfSellPoi = jSONObject.optBoolean("self_sell_poi");
        this.saleTip = jSONObject.optString("poi_delivery_content2");
        this.address = jSONObject.optString(GearsLocator.ADDRESS);
        this.backgroundUrl = jSONObject.optString("poi_back_pic_url");
        this.shippingTime = jSONObject.optString("shipping_time");
        this.shippingFee = jSONObject.optDouble("shipping_fee", 0.0d);
        this.packingFee = jSONObject.optDouble("packing_fee", 0.0d);
        this.originPackingFeeTip = jSONObject.optString("origin_packing_fee_tip");
        this.packingFeeTip = jSONObject.optString("packing_fee_tip");
        this.mPoiPrepareTime = jSONObject.optString("poi_prepare_time");
        this.min_price = jSONObject.optDouble("min_price", 0.0d);
        this.bulletin = jSONObject.optString("bulletin");
        this.canUseCoupon = jSONObject.optInt("can_use_coupon");
        this.supportOnlinePay = jSONObject.optInt("support_pay");
        this.appDeliveryTip = jSONObject.optString("app_delivery_tip");
        this.invoiceSupport = jSONObject.optInt("invoice_support");
        this.mIsFavorite = jSONObject.optInt("is_favorite");
        this.brandType = jSONObject.optInt("brand_type");
        this.mBuzType = jSONObject.optInt("buz_type");
        this.mPurchasedType = jSONObject.optInt("purchased_type");
        this.categoryType = jSONObject.optInt("buz_code");
        this.deliveryType = jSONObject.optInt("delivery_type", 0);
        this.originalDeliveryType = jSONObject.optInt("original_delivery_type", 0);
        this.isNewPage = jSONObject.optInt("new_page_switch", 0);
        this.basicStyleType = jSONObject.optInt("basic_style_type", 0);
        this.isOneLine = jSONObject.optBoolean("is_one_line", false);
        this.longitude = jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE, 0);
        this.latitude = jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE, 0);
        this.headPicUrl = jSONObject.optString("head_pic_url", null);
        this.nameTag = jSONObject.optString("name_tag");
        this.superDrugstore = jSONObject.optString("super_drugstore", null);
        this.superDrugstoreSlogan = jSONObject.optString("super_drugstore_slogan", null);
        this.superDrugstoreCardImg = jSONObject.optString("super_drugstore_head_card_img", null);
        this.superDrugstorePopCardImg = jSONObject.optString("super_drugstore_pop_card_img", null);
        this.insuranceType = jSONObject.optInt("insurance_type", 0);
        this.insuranceIcon = jSONObject.optString("insurance_icon");
        this.poiSpuSaleText = jSONObject.optString("poiSpuSaleText");
        this.isInDelivery = jSONObject.optBoolean("is_in_delivery");
        this.monthSale = jSONObject.optString("month_sales_tip");
        this.subscribe = jSONObject.optInt("subscribe");
        this.cartExtendInfo = jSONObject.optString("cart_extend_info");
        this.marketingInfoExtend = jSONObject.optString("marketing_info_extend");
        this.orderPreviewExtend = jSONObject.optString("order_preview_extend");
        this.livePic = jSONObject.optString("live_pic");
        this.liveId = jSONObject.optLong("live_id");
        this.liveSchema = jSONObject.optString("live_schema");
        JSONObject optJSONObject = jSONObject.optJSONObject("story_info");
        if (optJSONObject != null) {
            this.poiDetailStoryInfo = new PoiDetailStoryInfo();
            this.poiDetailStoryInfo.topPic = optJSONObject.optString("top_pic");
            this.poiDetailStoryInfo.videoIcon = optJSONObject.optString("video_icon");
            this.poiDetailStoryInfo.title = optJSONObject.optString("title");
            this.poiDetailStoryInfo.entranceUrl = optJSONObject.optString("entrance_url");
            this.poiDetailStoryInfo.poiLogoIcon = optJSONObject.optString("poi_logo_icon");
            this.poiDetailStoryInfo.poiTabIcon = optJSONObject.optString("poi_tab_icon");
        }
        String optString = jSONObject.optString("act_label_info");
        if (!TextUtils.isEmpty(optString)) {
            this.mLabelInfoList = (ArrayList) i.a().fromJson(optString, new TypeToken<ArrayList<LabelInfoListItem>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.3
            }.getType());
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject(ConfigInfo.MODULE_NEW_USER_REGION);
        if (optJSONObject2 != null) {
            this.newUserRegion = new PoiNewUserRegion();
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("new_user_coupon");
            if (optJSONObject3 != null) {
                this.newUserRegion.newUserCoupon = (PoiCouponItem) i.a().fromJson(optJSONObject3.toString(), new TypeToken<PoiCouponItem>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.4
                }.getType());
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("new_user_product");
            if (optJSONObject4 != null) {
                this.newUserRegion.newUserProduct = new GoodsSpu();
                this.newUserRegion.newUserProduct.parseJson(optJSONObject4);
            }
            this.newUserRegion.newUserProductPic = optJSONObject2.optString("new_user_product_picture");
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("dynamic_short_label_json_list");
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            this.mDynamicShortLabels = (ArrayList) i.a().fromJson(optJSONArray3.toString(), new TypeToken<ArrayList<NewLabelInfoListItem>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.5
            }.getType());
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray("dynamic_short_labels");
        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
            this.mDynamicShortLabels = (ArrayList) i.a().fromJson(optJSONArray4.toString(), new TypeToken<ArrayList<NewLabelInfoListItem>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.6
            }.getType());
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("poi_coupon_info");
        if (optJSONObject5 != null) {
            this.poiCouponInfo = new PoiCouponInfo();
            this.poiCouponInfo.iconUrl = optJSONObject5.optString("icon_url");
            this.poiCouponInfo.couponTip = optJSONObject5.optString("coupon_tip");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("member_info");
        if (optJSONObject6 != null) {
            this.memberInfo = new PoiMemberInfo();
            this.memberInfo.isSupportMember = optJSONObject6.optBoolean("is_support_member");
            this.memberInfo.isPoiMember = optJSONObject6.optBoolean("is_poi_member");
            this.memberInfo.levelCode = optJSONObject6.optString("level_code");
            this.memberInfo.level = optJSONObject6.optString("level");
            this.memberInfo.status = optJSONObject6.optInt("status");
            this.memberInfo.scheme = optJSONObject6.optString("schema");
            this.memberInfo.joinText = optJSONObject6.optString("join_text");
            this.memberInfo.logoUrl = optJSONObject6.optString("logo_url");
            this.memberInfo.actGuide = optJSONObject6.optString("act_guide");
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("drug_member_info");
        if (optJSONObject7 != null) {
            this.mNewMemberInfo = new NewMemberInfo();
            this.mNewMemberInfo.isSupportMember = optJSONObject7.optBoolean("is_support_member");
            this.mNewMemberInfo.isPoiMember = optJSONObject7.optBoolean("is_poi_member");
            this.mNewMemberInfo.scheme = optJSONObject7.optString("schema");
            this.mNewMemberInfo.joinText = optJSONObject7.optString("join_text");
            this.mNewMemberInfo.status = optJSONObject7.optString("join_text_type");
            this.mNewMemberInfo.showAnimation = optJSONObject7.optInt("show_animation");
        }
        this.numDiscountRestrict = jSONObject.optInt("discount_restrict", 0);
        this.numDiscountRestrict = this.numDiscountRestrict <= 0 ? Integer.MAX_VALUE : this.numDiscountRestrict;
        this.toastDiscountRestrict = jSONObject.optString("restrict_toast");
        this.newUserDiscountRestrict = jSONObject.optInt("new_user_discount_restrict", 0);
        this.newUserDiscountRestrictToast = jSONObject.optString("new_user_discount_restrict_toast");
        this.numPlusDiscountRestrict = jSONObject.optInt("plus_discount_restrict", 0);
        this.numPlusDiscountRestrict = this.numPlusDiscountRestrict > 0 ? this.numPlusDiscountRestrict : Integer.MAX_VALUE;
        this.toastPlusDiscountRestrict = jSONObject.optString("plus_discount_toast");
        JSONObject optJSONObject8 = jSONObject.optJSONObject("container_template");
        if (optJSONObject8 != null) {
            this.containerTemplate = new PoiContainerTemplate();
            this.containerTemplate.type = optJSONObject8.optInt("type");
            this.containerTemplate.tagIcon = optJSONObject8.optString("tag_icon");
        }
        this.score = jSONObject.optDouble("score", 0.0d);
        this.commentNumber = jSONObject.optLong("comment_number");
        this.recommendTip = jSONObject.optString("recommend_tip");
        this.mPromotionHeadPicUrl = jSONObject.optString("promotion_head_pic_url");
        this.mPromotionHeadPicHeight = jSONObject.optInt("promotion_head_pic_height");
        JSONObject optJSONObject9 = jSONObject.optJSONObject("worry_free_info");
        if (optJSONObject9 != null) {
            this.mWorryFreeInfo = new WorryFreeInfo();
            this.mWorryFreeInfo.parseJson(optJSONObject9);
        }
        Gson gson = new Gson();
        this.mPoiLabelNew = (PoiLabel) gson.fromJson(jSONObject.optString("poi_label_new"), (Class<Object>) PoiLabel.class);
        this.mPoiCouponEntity = (PoiCouponEntity) gson.fromJson(jSONObject.optString("poi_coupon"), (Class<Object>) PoiCouponEntity.class);
        JSONArray optJSONArray5 = jSONObject.optJSONArray("poi_extend_info_entrance");
        if (optJSONArray5 != null) {
            this.poiExtendInfoEntrances = new ArrayList<>();
            for (int i3 = 0; i3 < optJSONArray5.length(); i3++) {
                PoiExtendInfo poiExtendInfo = new PoiExtendInfo();
                poiExtendInfo.parseJson(optJSONArray5.optJSONObject(i3));
                this.poiExtendInfoEntrances.add(poiExtendInfo);
            }
        }
        this.previewOrderCallbackInfo = jSONObject.optString("preview_order_callback_info");
        this.extraForProductInfo = jSONObject.optString("extra_for_product_info");
        this.schemeForInshop = jSONObject.optString("scheme_for_inshop");
        this.isUserHeaderInfoModule = jSONObject.optBoolean("use_header_info_module");
        this.isUserNewCardPage = jSONObject.optInt("is_use_new_card_page", 0);
        this.couponPoiCardInfo = CouponPoiCardInfo.fromJson(jSONObject.optString("poi_card_info"));
        this.mPoiContentInfo = PoiContentInfo.fromJson(jSONObject.optString("poi_content_info"));
        this.addition = (AdditionalInfo) i.a(jSONObject.optString("additional_info"), AdditionalInfo.class);
        this.mscAdditionalInfo = (MSCAdditionalInfo) i.a(jSONObject.optString("msc_additional_info"), MSCAdditionalInfo.class);
    }

    public void parseFriendAssit(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c16fe26b2eb793142457fd65dda00499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c16fe26b2eb793142457fd65dda00499");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("friend_assistance");
        if (optJSONObject != null) {
            FriendAssistance friendAssistance = new FriendAssistance();
            friendAssistance.parseJson(optJSONObject);
            this.friendAssistance = friendAssistance;
        }
    }

    public void parseFriendCoupon(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ed1d03bf1a75d52f7530231198f4ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ed1d03bf1a75d52f7530231198f4ec8");
        } else if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("friend_help_coupon_tab")) == null) {
        } else {
            FriendHelpTab friendHelpTab = new FriendHelpTab();
            friendHelpTab.parseJson(optJSONObject);
            this.friendHelpCouponTab = friendHelpTab;
        }
    }

    public boolean isAd() {
        return this.adType != 0;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a09fe749f5f848a9b2cf82c8fc8a45aa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a09fe749f5f848a9b2cf82c8fc8a45aa")).intValue() : (int) (this.id ^ (this.id >>> 32));
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebed40ecd021b464a7a86803f5a31639", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebed40ecd021b464a7a86803f5a31639")).booleanValue();
        }
        if (obj instanceof Poi) {
            Poi poi = (Poi) obj;
            if (t.a(poi.poiIdStr) || t.a(this.poiIdStr)) {
                return poi.id == this.id;
            }
            return TextUtils.equals(poi.poiIdStr, this.poiIdStr);
        }
        return false;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LabelInfoListItem implements Serializable {
        public static final int LABEL_TYPE_ACTIVITY = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_type")
        public int activityType;
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
        public int tagType;
        @SerializedName("type")
        public int type;

        public LabelInfoListItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc4eb6f7409bef86d52d3c6194262a80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc4eb6f7409bef86d52d3c6194262a80");
                return;
            }
            this.mColorParsed = false;
            this.tagBgStyle = "";
            this.tagPreBgStyle = "";
        }

        public void parseColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df7da9b0e4dc4339f9c6b812df158acf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df7da9b0e4dc4339f9c6b812df158acf");
            } else if (this.mColorParsed) {
            } else {
                this.mContentColorInt = com.sankuai.shangou.stone.util.d.a(this.contentColor);
                this.mBackgroundColorInt = com.sankuai.shangou.stone.util.d.a(this.labelBackgroundColor);
                this.mFrameColorInt = com.sankuai.shangou.stone.util.d.a(this.labelFrameColor);
                this.mPreContentColorInt = com.sankuai.shangou.stone.util.d.a(this.preContentColor);
                this.mPreBackgroundColorInt = com.sankuai.shangou.stone.util.d.a(this.preLabelBackgroundColor);
                this.tagBgStyle = TextUtils.join(CommonConstant.Symbol.UNDERLINE, new Object[]{this.mBackgroundColorInt, this.mFrameColorInt});
                this.tagPreBgStyle = String.valueOf(this.preLabelBackgroundColor);
                this.mColorParsed = true;
            }
        }

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9f9bb429e15550118d2e1c1c97dbcb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9f9bb429e15550118d2e1c1c97dbcb9");
            } else if (jSONObject == null) {
            } else {
                this.content = jSONObject.optString("content");
                this.contentColor = jSONObject.optString("content_color");
                this.labelBackgroundColor = jSONObject.optString("label_background_color");
                this.labelFrameColor = jSONObject.optString("label_frame_color");
                this.type = jSONObject.optInt("type");
                this.activityType = jSONObject.optInt("activity_type");
                this.priority = jSONObject.optInt("priority");
                this.poiServiceType = jSONObject.optInt("poi_service_type");
            }
        }

        public int getPreContentColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c68d6791d84043354af3a2a6b9a34640", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c68d6791d84043354af3a2a6b9a34640")).intValue();
            }
            parseColor();
            return this.mPreContentColorInt == null ? i : this.mPreContentColorInt.intValue();
        }

        public int getContentColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aaa8b7ef6b6d8b03c14166e681ae714", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aaa8b7ef6b6d8b03c14166e681ae714")).intValue();
            }
            parseColor();
            return this.mContentColorInt == null ? i : this.mContentColorInt.intValue();
        }

        public int getBackgroundColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cbfa6c53348e78d95a87d1a5350fd4a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cbfa6c53348e78d95a87d1a5350fd4a")).intValue();
            }
            parseColor();
            return this.mBackgroundColorInt == null ? i : this.mBackgroundColorInt.intValue();
        }

        public int getFrameColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4998230ba5cf97cd92b56d8eb826b83f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4998230ba5cf97cd92b56d8eb826b83f")).intValue();
            }
            parseColor();
            return this.mFrameColorInt == null ? i : this.mFrameColorInt.intValue();
        }

        public int getPreBackgroundColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44f86900f9edd678b9379c34371eccfc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44f86900f9edd678b9379c34371eccfc")).intValue();
            }
            parseColor();
            return this.mPreBackgroundColorInt == null ? i : this.mPreBackgroundColorInt.intValue();
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class RecommendRank implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("rank")
        public String rank;
        @SerializedName("url")
        public String url;

        public RecommendRank() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Remind implements Serializable {
        public static final int REMIND_TYPE_DIALOG = 1;
        public static final int REMIND_TYPE_DIALOG_BACK = 5;
        public static final int REMIND_TYPE_LAYER = 2;
        public static final int REMIND_TYPE_LAYER_AUTO_DISAPPEAR = 3;
        public static final int REMIND_TYPE_TOAST = 4;
        public static final int SHOW_TYPE_EACH_SHOW = 2;
        public static final int SHOW_TYPE_FIRST_SHOW = 1;
        public static final int SHOW_TYPE_NOT_SHOW = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("behavior_type")
        public int behaviorType;
        @SerializedName("remind_content")
        public String content;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("statistics_code")
        public int statisticsCode;
        @SerializedName("support_type")
        public int supportType;

        public static Remind fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32e7bf180594a3a59736612d21a8235e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Remind) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32e7bf180594a3a59736612d21a8235e");
            }
            if (jSONObject == null) {
                return null;
            }
            Remind remind = new Remind();
            remind.supportType = jSONObject.optInt("support_type");
            remind.behaviorType = jSONObject.optInt("behavior_type");
            remind.content = jSONObject.optString("remind_content");
            remind.statisticsCode = jSONObject.optInt("statistics_code");
            remind.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
            return remind;
        }

        public static List<Remind> fromJsonArray(JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3b75e4348b28146f55700b8d4f7da1e", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3b75e4348b28146f55700b8d4f7da1e");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                Remind fromJson = fromJson(jSONArray.optJSONObject(i));
                if (fromJson != null) {
                    arrayList.add(fromJson);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        }
    }

    public boolean isSuperDrugstore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29149f073ee91d171eb0380a1deb9cb1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29149f073ee91d171eb0380a1deb9cb1")).booleanValue() : "1".equals(this.superDrugstore);
    }

    public boolean isCaiDaQuan() {
        return this.mPurchasedType == 1;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AdditionalInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("addtocart_larger")
        public boolean addToCartLarger;
        @SerializedName("cdq_use_new_module_list")
        private boolean cdqUseNewModuleList;
        @SerializedName("778_floor_tags_mrn")
        public boolean floorTagsMrn;
        @SerializedName("food_mrn_reform")
        private int foodMrnReform;
        @SerializedName("is_show_new_header")
        public int isShowNewHeader;
        @SerializedName("level2_food_page_jump")
        public String level2FoodPageJump;
        @SerializedName("756_new_standard_page")
        private String newStandardPage;
        @SerializedName("is_new_promotion_style")
        public boolean promotionExp;
        @SerializedName("food_menu_new_style")
        private boolean recipeNewStyle;
        @SerializedName("shangpinkapian")
        private String shangPinKaPian;
        @SerializedName("shopinfotest")
        public String shopInfoTest;
        @SerializedName("im_new_style")
        public boolean storeImNewStyle;
        @SerializedName("use_food_activity_label")
        public boolean useFoodActivityLabel;

        public AdditionalInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddc2df6f22149b3a991b927cf2655db8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddc2df6f22149b3a991b927cf2655db8");
                return;
            }
            this.newStandardPage = "D";
            this.shangPinKaPian = "C";
        }
    }

    public boolean isMscPoiDetail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1247566aafac42b4af2be02d42539437", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1247566aafac42b4af2be02d42539437")).booleanValue() : this.mscAdditionalInfo != null && TextUtils.equals(this.mscAdditionalInfo.sgMSCPoiDetail, "A");
    }

    @Nullable
    public String getMscPoiDetail() {
        return this.mscAdditionalInfo != null ? this.mscAdditionalInfo.sgMSCPoiDetail : "";
    }

    public boolean isMscPoiVip() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed1ce8b35c0fbb4c3c14b3348d17aa5a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed1ce8b35c0fbb4c3c14b3348d17aa5a")).booleanValue() : this.mscAdditionalInfo != null && TextUtils.equals(this.mscAdditionalInfo.sgMSCPoiVip, "A");
    }

    public boolean isMscHalfPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da0bf1aea547167d9b5420fda2b9c60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da0bf1aea547167d9b5420fda2b9c60")).booleanValue() : this.mscAdditionalInfo != null && TextUtils.equals(this.mscAdditionalInfo.sgMSCHalfPage, "A");
    }

    public boolean isMscPoiCommentPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c3ca63a8c492eae1783b21230e4eac9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c3ca63a8c492eae1783b21230e4eac9")).booleanValue() : this.mscAdditionalInfo != null && TextUtils.equals(this.mscAdditionalInfo.sgMSCCommentPage, "A");
    }

    public boolean isMscPoiCommentTab() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9bf7be3b385da21a3ab6b908a0b7446", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9bf7be3b385da21a3ab6b908a0b7446")).booleanValue() : this.mscAdditionalInfo != null && TextUtils.equals(this.mscAdditionalInfo.sgMSCPoiCommentTab, "A");
    }

    @Nullable
    public String getMscPoiVip() {
        return this.mscAdditionalInfo != null ? this.mscAdditionalInfo.sgMSCPoiVip : "";
    }

    public boolean isOptimizedRecipe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f791fe27e6bd93f154a53a8300a8d112", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f791fe27e6bd93f154a53a8300a8d112")).booleanValue();
        }
        if (this.addition != null) {
            return this.addition.recipeNewStyle;
        }
        return false;
    }

    public boolean useNewModuleList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e829ae2d9727401096ae36ab0c8c60b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e829ae2d9727401096ae36ab0c8c60b")).booleanValue() : this.addition != null && this.addition.cdqUseNewModuleList;
    }

    public String newStandardPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "495b88eeb10d4c3f7dbd284a09325c3e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "495b88eeb10d4c3f7dbd284a09325c3e") : this.addition != null ? this.addition.newStandardPage : "D";
    }

    public String shangPinKaPianNewStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a7cc7302640cf719041feb9c2e2fcd6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a7cc7302640cf719041feb9c2e2fcd6") : this.addition != null ? this.addition.shangPinKaPian : "C";
    }

    public boolean foodMRNReform() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c654ca7dcb5009f775a09a3c43cfb05", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c654ca7dcb5009f775a09a3c43cfb05")).booleanValue() : this.addition != null && this.addition.foodMrnReform == 1;
    }

    public boolean storeImNewStyle() {
        return this.addition != null && this.addition.storeImNewStyle;
    }

    public boolean headerMachHaveDivider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "172791341c8b3c3af8a5fe23a38fd528", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "172791341c8b3c3af8a5fe23a38fd528")).booleanValue() : this.addition == null || TextUtils.equals(this.addition.shopInfoTest, "A") || TextUtils.equals(this.addition.shopInfoTest, ErrorCode.ERROR_TYPE_B) || TextUtils.equals(this.addition.shopInfoTest, "C");
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FriendAssistance implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public String activityId;
        @SerializedName("button")
        public String button;
        @SerializedName("coupon_list")
        public ArrayList<PoiCouponItem> couponList;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("title")
        public String title;
        @SerializedName("url")
        public String url;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "880ea4658cad549048896884e71dd525", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "880ea4658cad549048896884e71dd525");
            } else if (jSONObject == null) {
            } else {
                this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
                this.title = jSONObject.optString("title");
                this.url = jSONObject.optString("url");
                this.button = jSONObject.optString("button");
                this.activityId = jSONObject.optString("activity_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("coupon_list");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return;
                }
                this.couponList = (ArrayList) i.a().fromJson(optJSONArray.toString(), new TypeToken<ArrayList<PoiCouponItem>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.Poi.FriendAssistance.1
                }.getType());
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FriendHelpTab implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("is_show_tab")
        public int isShowTab;
        @SerializedName("tab_name")
        public String tabName;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aad1bfc1c3d4b7b57c3ebe48bfcd4d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aad1bfc1c3d4b7b57c3ebe48bfcd4d4");
            } else if (jSONObject == null) {
            } else {
                this.isShowTab = jSONObject.optInt("is_show_tab");
                this.tabName = jSONObject.optString("tab_name");
            }
        }
    }
}
