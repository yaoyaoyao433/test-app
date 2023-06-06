package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MemberCouponListOutput implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("buy_member_pop_window")
    public PoiCouponActivityBuyMemberPopWindow buyMemberPopWindow;
    @SerializedName("desc")
    public String desc;
    @SerializedName("activity_preview_pop_window")
    public PoiCouponActivityPreviewPopWindow poiCouponActivityPreviewPopWindow;
    @SerializedName("red_coupon_list")
    public PoiCouponRedCouponList poiRedCouponList;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BenefitInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("benefit_lab")
        public String benefitLab;
        @SerializedName("benefit_tag")
        public String benefitTag;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CommodityPayInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activityLabelText")
        public String activityLabelText;
        @SerializedName("activityPrice")
        public String activityPrice;
        @SerializedName("buttonText")
        public String buttonText;
        @SerializedName("canDirectSubmit")
        public boolean canDirectSubmit;
        @SerializedName("couponViewId")
        public String couponViewId;
        @SerializedName("orderCount")
        public String orderCount;
        @SerializedName("originalPrice")
        public String originalPrice;
        @SerializedName("skuId")
        public String skuId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCoupon implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_button_text")
        public String couponBtnText;
        @SerializedName("coupon_condition_text")
        public String couponCondition;
        @SerializedName("coupon_desc")
        public String couponDesc;
        @SerializedName("coupon_name")
        public String couponName;
        @SerializedName("coupon_status")
        public int couponStatus;
        @SerializedName("coupon_type")
        public int couponType;
        @SerializedName("coupon_valid_time_text")
        public String couponValidTime;
        @SerializedName("coupon_value")
        public double couponValue;
        @SerializedName("coupon_view_id")
        public String couponViewId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponActivityPreviewPopWindow implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("exchange_coupon_activity_list")
        public ArrayList<ExchangeCoupon> exchangeCoupons;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponRedCouponList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("user_red_coupons")
        public UserRedCoupons redCoupons;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SaleLimit implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("merchantLimit")
        public String merchantLimit;
        @SerializedName("periodOfValidity")
        public String periodOfValidity;
        @SerializedName("thisOrderCanUse")
        public String thisOrderCanUse;
        @SerializedName("toastStr")
        public String toastStr;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SkuBindingInfoVo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("campusVerified")
        public boolean isCampus;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class UserRedCoupons implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_list")
        public List<PoiCoupon> couponList;
        @SerializedName("desc")
        public String desc;
        @SerializedName("subtitle")
        public String subtitle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiCouponActivityBuyMemberPopWindow implements Serializable {
        public static final String MEMBER_ORDER_OPTIMIZE_SCENE = "waimai_order_page_optimize";
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("freecard_member_sale_vo_list")
        public ArrayList<FreeCardMemberSale> freeCardMemberSales;
        @SerializedName("hit_scene_key")
        public String hitSceneKey;
        @SerializedName("order_token")
        public String orderToken;

        public boolean isNewStyle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b5ac5502050912d6527f50a95eb6c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b5ac5502050912d6527f50a95eb6c3")).booleanValue() : MEMBER_ORDER_OPTIMIZE_SCENE.equals(this.hitSceneKey);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FreeCardMemberSale implements Serializable {
        private static final String EXCLUSIVE_CARD = "1_1_1_1";
        private static final String LIGHTLY_CARD = "1_1_1_2";
        private static final String RECIVE_CARD = "1_1_1_4";
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_code_window")
        public int activityCodeWindow;
        @SerializedName("benefit_info")
        public BenefitInfo benefitInfo;
        @SerializedName("bubble_text")
        public String bubbleText;
        @SerializedName("button_price_text")
        public String buttonPriceText;
        @SerializedName("button_text")
        public String buttonText;
        @SerializedName("commodity_pay_vo")
        public CommodityPayInfo commodityPayInfo;
        @SerializedName("poi_coupon_count_text")
        public String couponCountText;
        @SerializedName("poi_coupon_price_text")
        public String couponPriceText;
        @SerializedName("cross_right")
        public CrossRight crossRight;
        @SerializedName("freecard_url")
        public String freeCardUrl;
        @SerializedName("member_card_biz_type")
        public String memberCardBizType;
        @SerializedName("vice_member_card_coupon_price_text")
        public String memberCardCouponPriceText;
        @SerializedName("member_card_coupon_text")
        public String memberCardCouponText;
        @SerializedName("member_card_coupon_text_new")
        public String memberCardCouponTextNew;
        @SerializedName("member_card_name")
        public String memberCardName;
        @SerializedName("vice_member_card_coupon_text")
        public String memberCardSubTitle;
        @SerializedName("poi_coupon_amount_price_text")
        public String poiCouponAmountPriceText;
        @SerializedName("poi_coupon_amount_text")
        public String poiCouponAmountText;
        @SerializedName("sale_limit_vo")
        public SaleLimit saleLimit;
        @SerializedName("skuBindingInfoVo")
        public SkuBindingInfoVo skuBindingInfoVo;
        @SerializedName("sku_id")
        public String skuId;
        @SerializedName("use_limit")
        public String useLimit;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class CrossRight {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("cross_right_info_list")
            public List<Object> crossRightInfo;
            public boolean expand = true;
            @SerializedName("has_cross_right")
            public boolean hasCrossRight;
            @SerializedName("new_right")
            public String newRight;
            @SerializedName("text")
            public String text;
            @SerializedName("view_right")
            public String viewRight;
        }

        public boolean isExclusiveCard() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f00199c69d418ca7f6a8668ea1990c5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f00199c69d418ca7f6a8668ea1990c5")).booleanValue();
            }
            if (TextUtils.isEmpty(this.memberCardBizType)) {
                return false;
            }
            return this.memberCardBizType.equals(EXCLUSIVE_CARD) || this.memberCardBizType.equals(RECIVE_CARD);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ExchangeCoupon implements Serializable {
        private static final int TYPE_SHOP_RED_PACKET = 1;
        private static final int TYPE_SHOP_USER_CREDIT = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("button_status")
        public int buttonStatus;
        @SerializedName("button_text")
        public String buttonText;
        @SerializedName("button_tip")
        public String buttonTip;
        @SerializedName("coin_count")
        public long coinCount;
        @SerializedName("coupon_count")
        public long couponCount;
        @SerializedName("coupon_icon")
        public String couponIcon;
        @SerializedName("coupon_name")
        public String couponName;
        @SerializedName("desc")
        public String desc;
        @SerializedName("exchange_status")
        public int exchangeStatus;
        @SerializedName("exchange_type")
        public int exchangeType;
        @SerializedName("money")
        public double money;
        @SerializedName("use_limit_text")
        public String useLimitText;

        public boolean isUseRedPackage() {
            return 1 == this.exchangeType;
        }

        public boolean isUseUserCredit() {
            return 2 == this.exchangeType;
        }

        public boolean isCouponExchanged() {
            return this.exchangeStatus == 1;
        }
    }

    public boolean isFreeMember() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14d91ab3a24077b13aae03b785584a3a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14d91ab3a24077b13aae03b785584a3a")).booleanValue() : (this.buyMemberPopWindow == null || this.buyMemberPopWindow.freeCardMemberSales == null || this.buyMemberPopWindow.freeCardMemberSales.size() <= 0) ? false : true;
    }

    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbcbabfc225e889841d9886a9fe598f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbcbabfc225e889841d9886a9fe598f3")).booleanValue() : (this.buyMemberPopWindow == null || this.buyMemberPopWindow.freeCardMemberSales == null || this.buyMemberPopWindow.freeCardMemberSales.size() == 0) && (this.poiCouponActivityPreviewPopWindow == null || this.poiCouponActivityPreviewPopWindow.exchangeCoupons == null || this.poiCouponActivityPreviewPopWindow.exchangeCoupons.size() == 0) && (this.poiRedCouponList == null || this.poiRedCouponList.redCoupons == null || this.poiRedCouponList.redCoupons.couponList == null || this.poiRedCouponList.redCoupons.couponList.size() == 0);
    }
}
