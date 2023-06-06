package com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SerializedName("spu_id")
    public long b;
    @SerializedName("sku_id")
    public long c;
    @SerializedName("name")
    public String d;
    @SerializedName("origin_price")
    public double e;
    @SerializedName("count")
    public int f;
    @SerializedName("spec")
    public String g;
    @SerializedName("cart_id")
    public int h;
    @SerializedName("box_num")
    public double i;
    @SerializedName("box_price")
    public double j;
    @SerializedName("tag")
    public String k;
    @SerializedName("modify_type")
    public int l;
    @SerializedName("modify_count")
    public int m;
    @SerializedName("activity_extra")
    public String n;
    @SerializedName("attrs")
    public GoodsAttr[] o;
    @SerializedName("add_price_attrs")
    public GoodsAttr[] p;
    @SerializedName("goods_coupon_view_id")
    public String q;
    @SerializedName("package_combo_item_list")
    public List<a> r;
    @SerializedName("groupId")
    public long s;
    @SerializedName("activity_tag")
    private String t;
}
