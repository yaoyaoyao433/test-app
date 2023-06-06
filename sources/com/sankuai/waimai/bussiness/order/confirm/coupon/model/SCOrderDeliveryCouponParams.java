package com.sankuai.waimai.bussiness.order.confirm.coupon.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.k;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SCOrderDeliveryCouponParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info_for_coupon")
    public String activityInfoCoupon;
    @SerializedName("business_type")
    public int businessType;
    @SerializedName("can_use_coupon_price")
    public String canUseCouponPrice;
    @SerializedName("coupon_id")
    public long couponId;
    @SerializedName("order_token")
    public String orderToken;
    @SerializedName("original_price")
    public String originalPrice;
    @SerializedName("wm_order_pay_type")
    public String payType;
    @SerializedName("phone")
    public String phone;
    @SerializedName("wm_poi_id")
    public String poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("product_string")
    public String productList;
    @SerializedName("shipping_price")
    public double shippingPrice;
    @SerializedName("sku_id_string")
    public String skuIdArray;
    @SerializedName("total")
    public String total;

    public SCOrderDeliveryCouponParams(OrderCouponRequestParams orderCouponRequestParams, double d) {
        this.poiId = orderCouponRequestParams.poiId;
        this.poiIdStr = orderCouponRequestParams.poiIdStr;
        this.orderToken = orderCouponRequestParams.orderToken;
        this.couponId = orderCouponRequestParams.couponId;
        this.phone = orderCouponRequestParams.phone;
        this.total = orderCouponRequestParams.total;
        this.originalPrice = orderCouponRequestParams.originalPrice;
        this.canUseCouponPrice = orderCouponRequestParams.canUseCouponPrice;
        this.payType = orderCouponRequestParams.payType;
        this.businessType = orderCouponRequestParams.businessType;
        this.activityInfoCoupon = orderCouponRequestParams.activityInfoCoupon;
        this.shippingPrice = d;
        this.skuIdArray = k.a().toJson(orderCouponRequestParams.skuIdArray);
        this.productList = k.a().toJson(orderCouponRequestParams.productList);
    }
}
