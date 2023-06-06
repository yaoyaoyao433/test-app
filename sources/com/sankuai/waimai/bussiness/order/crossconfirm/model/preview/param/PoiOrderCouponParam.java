package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.f;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderCouponParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon_view_id")
    public String couponViewId;
    @SerializedName("goods_coupon_view_id")
    public String goodsCouponViewId;
    @SerializedName("poicoupon_view_id")
    public String poiCouponViewId;
    @SerializedName("selected_coupons")
    public List<f> selectedCouponsReq;
    @SerializedName("sg_item_coupon_view_id")
    public String sgItemCouponViewId;
    @SerializedName("shipping_coupon_view_id")
    public String shippingCouponViewId;
}
