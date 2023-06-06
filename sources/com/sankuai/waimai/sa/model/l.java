package com.sankuai.waimai.sa.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l implements com.sankuai.waimai.sa.model.c {
    public static ChangeQuickRedirect a;
    public boolean A;
    public boolean B;
    @SerializedName("more_recommend")
    public List<SAMoreRecommend> C;
    @SerializedName("id")
    public String b;
    @SerializedName("wm_poi_id")
    public long c;
    @SerializedName("name")
    public String d;
    @SerializedName("pic_url")
    public String e;
    @SerializedName("distance")
    public String f;
    @SerializedName("min_price_tip")
    public String g;
    @SerializedName("shipping_fee_tip")
    public String h;
    @SerializedName("origin_total_price")
    public double i;
    @SerializedName("total_price")
    public double j;
    @SerializedName("pack_price")
    public double k;
    @SerializedName("description")
    public String l;
    @SerializedName("activity_text")
    public String m;
    @SerializedName("product_list")
    public List<Product> n;
    @SerializedName("packageNum")
    public int o;
    @SerializedName(Constants.PACKAGE_ID)
    public String p;
    @SerializedName("log_field")
    public b q;
    @SerializedName("recommend_info")
    public c r;
    @SerializedName("discount_price")
    public double s;
    @SerializedName("discount_info")
    public List<a> t;
    @SerializedName("shipping_time")
    public String u;
    @SerializedName("total_name")
    public String v;
    @SerializedName("sale_msg")
    public String w;
    @SerializedName("skip_type")
    public int x;
    @SerializedName("package_overview")
    public String y;
    @SerializedName("activity_icon_url")
    public String z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("name")
        public String a;
        @SerializedName("info")
        public String b;
        @SerializedName("icon_url")
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        @SerializedName("patch_id")
        public String a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        @SerializedName("icon_url")
        public String a;
        @SerializedName("reason")
        public String b;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final String d() {
        return "";
    }

    public final List<OrderedFood> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceaa40866e27c597c6e78d4f636efd3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceaa40866e27c597c6e78d4f636efd3e");
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.n)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Product product : this.n) {
            arrayList.add(product.convert2OrderFood());
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final List<Product> a() {
        return this.n;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final String b() {
        return this.l;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final String c() {
        return this.m;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final double e() {
        return this.k;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final double f() {
        return this.j;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final double g() {
        return this.i;
    }

    @Override // com.sankuai.waimai.sa.model.c
    public final long h() {
        return this.c;
    }
}
