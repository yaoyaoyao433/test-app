package com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @SerializedName("wm_poi_id")
    public long b;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String c;
    @SerializedName("shipping_fee")
    public double d;
    @SerializedName("min_price")
    public double e;
    @SerializedName("product_list")
    public List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a> f;
    @SerializedName("extra_info")
    public String g;
    @SerializedName("has_required_tag")
    public boolean h;
    @SerializedName("session_id")
    public String i;
    @SerializedName("allowance_alliance_scenes")
    public String j;
    @SerializedName("ad_activity_flag")
    public String k;
    @SerializedName("self_pick")
    public int l;
    @SerializedName("shopping_cart_vp_param")
    public ShopCartMemberInfo.MemberVpParam m;
    @SerializedName("shopping_cart_poi_param")
    public a n;
    @SerializedName("request_mark")
    private String o;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("order_type")
        public String a;
    }
}
