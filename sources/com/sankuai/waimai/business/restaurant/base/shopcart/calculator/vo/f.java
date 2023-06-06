package com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredProductInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    @SerializedName("activity_benefits_info")
    public String A;
    @SerializedName("wm_poi_id")
    public long a;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String b;
    @SerializedName("total_price")
    public double c;
    @SerializedName("total_box_price")
    public ShopCartTotalBoxPriceInfo d;
    @SerializedName("origin_total_price")
    public double e;
    @SerializedName("discount_price")
    public double f;
    @SerializedName("threshold_price")
    public double g;
    @SerializedName("shipping_fee_tip")
    public String h;
    @SerializedName("price_prefix")
    public String i;
    @SerializedName("origin_shipping_fee_tip")
    public String j;
    @SerializedName("preview_sub_tip")
    public String k;
    @SerializedName("cross_tip")
    public String l;
    @SerializedName("toast")
    public String m;
    @SerializedName("tip_info")
    public com.sankuai.waimai.business.restaurant.base.shopcart.tip.d n;
    @SerializedName("exchange_info")
    public com.sankuai.waimai.business.restaurant.base.shopcart.tip.a o;
    @SerializedName("extra_info")
    public String p;
    @SerializedName("required_product_info")
    public RequiredProductInfo q;
    @SerializedName("cart_info")
    public List<c> r;
    @SerializedName("tip_bubble")
    public String s;
    @SerializedName("session_id")
    public String t;
    @SerializedName("shopping_cart_vp_display_info")
    public ShopCartMemberInfo u;
    @SerializedName("vp_activity_price")
    public double v;
    @SerializedName("single_buy_product_info")
    public h w;
    @SerializedName("cart_coupon_info")
    public d x;
    @SerializedName("show_united_pattern")
    public boolean y;
    @SerializedName("poi_shopping_cart_exception_info")
    public g z;
}
