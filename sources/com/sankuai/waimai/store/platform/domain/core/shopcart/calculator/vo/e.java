package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String b;
    @SerializedName("product_list")
    public List<a> c;
    @SerializedName("invalid_product_list")
    public List<a> d;
    @SerializedName("first_enter")
    public int e;
    @SerializedName("extra_info")
    public String f;
    @SerializedName("marketing_info_extend")
    public String g;
    @SerializedName("wm_extend_info")
    public String h;
    @SerializedName("poi_sp_type")
    public int i;
    @SerializedName("cart_extend_info")
    public String j;
    @SerializedName("page_source")
    public int k;
    @SerializedName("wm_poi_id")
    private long l;
    @SerializedName("shipping_fee")
    private double m;
    @SerializedName("packing_fee")
    private double n;
    @SerializedName("min_price")
    private double o;
    @SerializedName("add_shopcart_from")
    private int p;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdbd192232318aa46da332061f34ab04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdbd192232318aa46da332061f34ab04");
        } else {
            this.l = j;
        }
    }

    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee1aac4a715e31b5894cae850a63698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee1aac4a715e31b5894cae850a63698");
        } else {
            this.m = d;
        }
    }

    public final void b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed268c2ef42dedbe4632eeaebad35dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed268c2ef42dedbe4632eeaebad35dbb");
        } else {
            this.n = d;
        }
    }

    public final void c(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7657a1eb261d928b2bbff8d26a5517f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7657a1eb261d928b2bbff8d26a5517f4");
        } else {
            this.o = d;
        }
    }
}
