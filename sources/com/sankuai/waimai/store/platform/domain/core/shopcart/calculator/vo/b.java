package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    @SerializedName("detail_scheme")
    public String A;
    @SerializedName("kano_label")
    public C1264b B;
    @SerializedName("item_activity_tip")
    public String C;
    @SerializedName("over_limit")
    public String D;
    @SerializedName("product_price")
    public c E;
    @SerializedName("member_icon")
    public String F;
    @SerializedName("exchange_price")
    public double G;
    @SerializedName("exchange_price_str")
    public String H;
    @SerializedName("price")
    private double I;
    @SerializedName("sku_id")
    public long a;
    @SerializedName("spu_id")
    public long b;
    @SerializedName("name")
    public String c;
    @SerializedName("item_collection_relations")
    public List<Long> d;
    @SerializedName("activity_label")
    public String e;
    @SerializedName("item_stock_text")
    public String f;
    @SerializedName("invalid_reason_text")
    public String g;
    @SerializedName("total_price")
    public double h;
    @SerializedName("origin_total_price")
    public double i;
    @SerializedName("origin_price")
    public double j;
    @SerializedName("count")
    public int k;
    @SerializedName("tag")
    public String l;
    @SerializedName("activity_tag")
    public String m;
    @SerializedName("activity_description")
    public String n;
    @SerializedName("desc_text")
    public String o;
    @SerializedName("desc_specification_text")
    public String p;
    @SerializedName("show_poi_member")
    public boolean q;
    @SerializedName("poi_member_price")
    public double r;
    @SerializedName("attrs")
    public GoodsAttr[] s;
    @SerializedName("sub_box_price_desc")
    public String t;
    @SerializedName("picture")
    public String u;
    @SerializedName("sub_box_price")
    public String v;
    @SerializedName("hand_price_info")
    public HandPriceInfo w;
    @SerializedName("hand_activity_price_calculation_list")
    public String x;
    @SerializedName("product_icon_url_list")
    public List<String> y;
    @SerializedName("import_duties_desc")
    public String z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("standard_price")
        public String a;
        @SerializedName("standard_count")
        public String b;
        @SerializedName("limit_count")
        public String c;
        @SerializedName("template_text")
        public String d;
        @SerializedName("total_standard_price")
        public String e;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1264b implements Serializable {
        @SerializedName("drug_product_name_below")
        public List<com.sankuai.waimai.platform.widget.tag.api.d> a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        @SerializedName("single_standard_price")
        public String a;
        @SerializedName("single_hand_price")
        public String b;
        @SerializedName("total_standard_price")
        public String c;
        @SerializedName("total_hand_price")
        public String d;
        @SerializedName("item_activities")
        public List<a> e;
    }
}
