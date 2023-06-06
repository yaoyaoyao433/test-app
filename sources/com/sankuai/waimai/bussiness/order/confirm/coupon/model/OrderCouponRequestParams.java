package com.sankuai.waimai.bussiness.order.confirm.coupon.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderCouponRequestParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info_for_coupon")
    public String activityInfoCoupon;
    public String adActivityFlag;
    @SerializedName("addr_latitude")
    public int addrLatitude;
    @SerializedName("addr_longitude")
    public int addrLongitude;
    public String allowanceAllianceScenes;
    @SerializedName("ap_card_type")
    public long apCardType;
    @SerializedName("ap_outer_code")
    public String apOuterCode;
    @SerializedName("ap_params")
    public String apParams;
    @SerializedName("product_id")
    public String apProductId;
    @SerializedName("biz_line")
    public String bizLine;
    public String boxTotalPrice;
    @SerializedName("business_type")
    public int businessType;
    @SerializedName("can_use_coupon_price")
    public String canUseCouponPrice;
    public String cardFoodList;
    @SerializedName("coupon_id")
    public long couponId;
    @SerializedName("coupon_package_selected")
    public boolean couponPackageSelected;
    @SerializedName("callback_info")
    public CallbackInfo extendsInfo;
    @SerializedName("food_list")
    public String foodList;
    public boolean isFromCrossOrder;
    @SerializedName("order_token")
    public String orderToken;
    @SerializedName("original_price")
    public String originalPrice;
    public String otherPoiSelectedCouponViewIds;
    @SerializedName("wm_order_pay_type")
    public String payType;
    @SerializedName("phone")
    public String phone;
    public PoiAddressParam poiAddressParam;
    @SerializedName("wm_poi_id")
    public String poiId;
    public List<PoiOrderParam> poiOrderParams;
    @SerializedName("preview_order_callback_info")
    public String previewOrderCallbackInfo;
    public ArrayList<a> productList;
    public ArrayList<b> productsWithTag;
    public String[] skuIdArray;
    @SerializedName("total")
    public String total;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr = "";
    @SerializedName("selected_coupons")
    public ArrayList<f> selectedCoupons = new ArrayList<>();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("sku_id")
        public long a;
        @SerializedName(RaptorConstants.JS_BATCH_NUM)
        public int b;
        @SerializedName("original_price")
        public double c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("skuId")
        public long a;
        @SerializedName("spuId")
        public long b;
        @SerializedName("count")
        public int c;
        @SerializedName("skuOriginPrice")
        public double d;
        @SerializedName("originBoxPrice")
        public double e;
        @SerializedName("boxCount")
        public double f;
        @SerializedName("activityTag")
        public String g = "";
    }
}
