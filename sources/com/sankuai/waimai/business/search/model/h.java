package com.sankuai.waimai.business.search.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public transient boolean A;
    @SerializedName("product_spu_id")
    public long b;
    @SerializedName("wm_poi_id")
    public long c;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String d;
    @SerializedName("product_name")
    public String e;
    @SerializedName("product_status")
    public int f;
    @SerializedName("original_price")
    public double g;
    @SerializedName("price")
    public double h;
    @SerializedName("promotion_info")
    public String i;
    @SerializedName("picture")
    public String j;
    @SerializedName("praise_content")
    public String k;
    @SerializedName("food_recommend_info")
    public e l;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String m;
    @SerializedName("product_recommend_label")
    public String n;
    @SerializedName("sub_product_recommend_label")
    public String o;
    @SerializedName("spuSource")
    public int p;
    @SerializedName("food_recommend_type")
    public int q;
    @SerializedName("has_videos")
    public int r;
    @SerializedName("soldout_tips")
    public String s;
    @SerializedName("stocks_reminds")
    public String t;
    @SerializedName("before_price_tips")
    public String u;
    @SerializedName("paotui_scheme")
    public String v;
    @SerializedName("price_start_desc")
    public String w;
    @SerializedName("activity_info")
    public ActivityInfo x;
    @SerializedName("underlined_Price")
    public String y;
    public boolean z;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8789fb72eb86623b0b0af95a8596702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8789fb72eb86623b0b0af95a8596702");
            return;
        }
        this.z = false;
        this.A = false;
    }
}
