package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SerializedName("name")
    public String b;
    @SerializedName("count")
    public int c;
    @SerializedName("spec")
    public String d;
    @SerializedName("cart_id")
    public int e;
    @SerializedName("tag")
    public String f;
    @SerializedName("activity_tag")
    public String g;
    @SerializedName("modify_type")
    public int h;
    @SerializedName("modify_count")
    public int i;
    @SerializedName("activity_extra")
    public String j;
    @SerializedName("attrs")
    public GoodsAttr[] k;
    @SerializedName("min_order_count")
    public int l;
    @SerializedName("spu_id")
    private long m;
    @SerializedName("sku_id")
    private long n;
    @SerializedName("origin_price")
    private double o;
    @SerializedName("box_num")
    private double p;
    @SerializedName("box_price")
    private double q;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98ac6959b0a37bd2dfc0e33f9cc373b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98ac6959b0a37bd2dfc0e33f9cc373b");
        } else {
            this.m = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce93fd38e2d58713ba0a83d434b3615c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce93fd38e2d58713ba0a83d434b3615c");
        } else {
            this.n = j;
        }
    }

    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56c1a9928e205a6283c06737e269a6b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56c1a9928e205a6283c06737e269a6b8");
        } else {
            this.o = d;
        }
    }

    public final void b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6473a8bc4331931b6ec85ac4929e9e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6473a8bc4331931b6ec85ac4929e9e94");
        } else {
            this.p = d;
        }
    }

    public final void c(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9af06a3f630e59bfd84f56d7131d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9af06a3f630e59bfd84f56d7131d87");
        } else {
            this.q = d;
        }
    }
}
