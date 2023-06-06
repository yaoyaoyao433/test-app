package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class VoucherCouponListOutput implements Serializable {
    public static final long COUPON_ACTIVITY_TYPE_COLLECTION = 1;
    public static final long COUPON_ACTIVITY_TYPE_OTHERS = 0;
    public static final int TYPE_SHOP_COMMON_COUPON = 8;
    public static final int TYPE_SHOP_GOD_COUPON = 9;
    public static final int TYPE_SHOP_GOOD_COUPON = 3;
    public static final int TYPE_SHOP_GOOD_COUPONS = 6;
    public static final int TYPE_SHOP_RED_PACKET = 2;
    public static final int TYPE_SHOP_SHOP_COUPONS = 5;
    public static final int TYPE_SHOP_USER_CREDIT = 4;
    public static final int TYPE_SHOP_VOUCHER = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ab_scene_key")
    public int abSenceKey;
    @SerializedName("available_coupon_list")
    public PoiCouponList availableCouponList;
    @SerializedName("buy_coupon_list")
    public PoiCouponList buyCouponList;
    @SerializedName("default_buy_coupon_num")
    public int defaultBuyCouponNum;
    @SerializedName("max_buy_coupon_num")
    public int maxBuyCouponNum;
    @SerializedName("received_coupon_list")
    public PoiCouponList receivedCouponList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PoiCouponList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_list")
        public ArrayList<PoiCouponInfo> couponList;
        @SerializedName("has_sale_coupon")
        public boolean hasSaleCoupon;
        @SerializedName("icon_url")
        public String iconLinkUrl;
        @SerializedName(RaptorConstants.JS_BATCH_NUM)
        public int num;
        @SerializedName("logo")
        public String poiLogo;
        @SerializedName("title")
        public String title;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String titleIcon;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PoiCouponInfo implements Serializable {
        public static final int STATUS_HAS_EXCHANGED = 1;
        public static final int STATUS_NOT_EXCHANGED = 0;
        public static final int STATUS_NO_PACKAGE_COUPON = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public long activityId;
        @SerializedName("activity_remain_time")
        public long activityRemainTime;
        @SerializedName("activity_type")
        public int activityType;
        @SerializedName("can_use_coupon_amount_text")
        public String canUseCouponAmountText;
        @SerializedName("coupon_activity_type")
        public long couponActivityType;
        @SerializedName("coupon_button_desc")
        public String couponButtonDesc;
        @SerializedName("coupon_button_scheme")
        public String couponButtonScheme;
        @SerializedName("coupon_button_text")
        public String couponButtonText;
        @SerializedName("coupon_condition_short_text")
        public String couponConditionShortText;
        @SerializedName("coupon_condition_text")
        public String couponConditionText;
        @SerializedName("coupon_content_text")
        public String couponContentText;
        @SerializedName("coupon_desc")
        public String couponDesc;
        @SerializedName("coupon_discount_type_desc")
        public String couponDiscountTypeDesc;
        @SerializedName("coupon_id")
        public long couponId;
        @SerializedName("coupon_logo_text")
        public String couponLogoText;
        @SerializedName("coupon_logo_type")
        public int couponLogoType;
        @SerializedName("coupon_name")
        public String couponName;
        @SerializedName("coupon_num")
        public int couponNum;
        @SerializedName("coupon_origin_value")
        public double couponOriginValue;
        @SerializedName("coupon_pool_id")
        public long couponPoolId;
        @SerializedName("coupon_status")
        public int couponStatus;
        @SerializedName("coupon_total_origin_value")
        public double couponTotalOriginValue;
        @SerializedName("coupon_total_value")
        public double couponTotalValue;
        @SerializedName("coupon_type")
        public int couponType;
        @SerializedName("coupon_valid_time_text")
        public String couponValidTimeText;
        @SerializedName("coupon_value")
        public double couponValue;
        @SerializedName("coupon_view_id")
        public String couponViewId;
        @SerializedName("discount_desc")
        public String discountDesc;
        @SerializedName("is_limit_new_user")
        public boolean isLimitNewUser;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName("price")
        public double price;
        @SerializedName("step_amount_infos")
        public List<StepAmountInfo> stepAmountInfoList;
        @SerializedName("step_sale")
        public int stepSale;
        @SerializedName("subscript_text")
        public String subscriptText;
        @SerializedName("tips_text")
        public String tipsText;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class StepAmountInfo implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("amount")
            public long amount;
            @SerializedName("amount_text")
            public String amountText;
            @SerializedName("no")
            public int no;
            @SerializedName("status")
            public int status;
            @SerializedName("text")
            public String text;
        }

        public boolean isKangarooExchange() {
            return this.couponType == 4;
        }

        public boolean isBuyGoodsCoupons() {
            return this.couponType == 6;
        }

        public boolean isBuyShopCoupons() {
            return this.couponType == 5;
        }

        public boolean isFreeGoodsCoupons() {
            return this.couponType == 3;
        }

        public boolean isFreeShopCoupons() {
            return this.couponType == 1;
        }

        public boolean isNormalReceive() {
            return this.couponType == 1 || this.couponType == 3;
        }

        public boolean isCollectionCoupon() {
            return this.couponActivityType == 1;
        }

        public boolean isCouponExchanged() {
            return this.couponStatus == 1;
        }
    }
}
