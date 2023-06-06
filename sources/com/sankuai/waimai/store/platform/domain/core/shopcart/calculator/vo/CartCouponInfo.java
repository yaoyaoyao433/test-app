package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CartCouponInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("recommend_coupon_info")
    public String recommendCouponInfo;
    @SerializedName("recommend_coupon_title")
    public String recommendCouponTitle;
    @SerializedName("total_price_after_recommend_coupon")
    public String totalPriceAfterRecommendCoupon;
}
