package com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @SerializedName(alternate = {"skuId"}, value = "sku_id")
    public long b;
    @SerializedName(alternate = {"spuId"}, value = "spu_id")
    public long c;
    @SerializedName("name")
    public String d;
    @SerializedName("total_price")
    public double e;
    @SerializedName("origin_total_price")
    public double f;
    @SerializedName("count")
    public int g;
    @SerializedName("tag")
    public String h;
    @SerializedName("activity_tag")
    public String i;
    @SerializedName("desc_text")
    public String j;
    @SerializedName("goods_coupon_view_id")
    public String k;
    @SerializedName("sub_box_price_desc")
    public String l;
    @SerializedName("sub_box_price")
    public String m;
    @SerializedName("pic_url")
    public String n;
    @SerializedName("integration_label")
    public String o;
    @SerializedName("wm_cbase_product_exception_info")
    public C0825b p;
    @SerializedName("item_addtional_tips_map")
    public a q;
    @SerializedName("package_combo_item_list")
    public List<b> r;
    @SerializedName("group_id")
    public long s;
    @SerializedName("product_type")
    public int t;
    @SerializedName("price")
    private double u;
    @SerializedName("origin_price")
    private double v;
    @SerializedName("attrs")
    private GoodsAttr[] w;
    @SerializedName(alternate = {"addPriceAttrs"}, value = "add_price_attrs")
    private GoodsAttr[] x;
    private GoodsAttr[] y;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("activityIconUrl")
        public String a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0825b implements Serializable {
        @SerializedName("wm_cbase_product_exception_code")
        public int a;
        @SerializedName("wm_cbase_product_exception_msg")
        public String b;
    }

    public final GoodsAttr[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e395397c8e17e4f2ec1bd704d00bc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e395397c8e17e4f2ec1bd704d00bc9");
        }
        if (this.y == null) {
            ArrayList arrayList = new ArrayList();
            if (this.w != null) {
                arrayList.addAll(Arrays.asList(this.w));
            }
            if (this.x != null) {
                for (GoodsAttr goodsAttr : this.x) {
                    goodsAttr.setMode(999);
                }
                arrayList.addAll(Arrays.asList(this.x));
            }
            this.y = (GoodsAttr[]) arrayList.toArray(new GoodsAttr[0]);
        }
        return this.y;
    }

    public final List<com.sankuai.waimai.platform.widget.tag.api.d> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c35c2c90a0eedf6a9d45389b5051dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c35c2c90a0eedf6a9d45389b5051dd");
        }
        try {
            if (TextUtils.isEmpty(this.o)) {
                return null;
            }
            return (ArrayList) k.a().fromJson(this.o, new TypeToken<ArrayList<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b.1
            }.getType());
        } catch (Exception unused) {
            com.sankuai.waimai.foundation.utils.log.a.b("RestaurantApi", "tag info error", new Object[0]);
            return null;
        }
    }

    public final OrderedFood c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b00a4a31454d7f1c72f5a45ac0b6d48", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b00a4a31454d7f1c72f5a45ac0b6d48");
        }
        GoodsSpu goodsSpu = new GoodsSpu();
        GoodsSku goodsSku = new GoodsSku();
        goodsSpu.id = this.c;
        goodsSku.id = this.b;
        OrderedFood orderedFood = new OrderedFood(goodsSpu, goodsSku, a(), this.g);
        orderedFood.setGroupId(this.s);
        if (!com.sankuai.waimai.foundation.utils.b.b(this.r)) {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.r) {
                if (bVar != null) {
                    arrayList.add(bVar.c());
                }
            }
            orderedFood.setComboItemList(arrayList);
        }
        return orderedFood;
    }
}
