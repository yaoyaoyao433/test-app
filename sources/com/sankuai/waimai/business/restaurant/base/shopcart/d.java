package com.sankuai.waimai.business.restaurant.base.shopcart;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("id")
    public int b;
    public List<ShopCartItem> c;
    public boolean d;
    public double e;

    public d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "621c7338aca0b96ce2ba865964602f0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "621c7338aca0b96ce2ba865964602f0c");
            return;
        }
        this.b = i;
        this.c = new ArrayList();
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a34cd51d8683b39ea7edf57428af741", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a34cd51d8683b39ea7edf57428af741")).intValue();
        }
        int i = 0;
        for (int i2 = 0; this.c != null && i2 < this.c.size(); i2++) {
            ShopCartItem shopCartItem = this.c.get(i2);
            if (shopCartItem.food != null) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j) {
        int i = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9126488ae27e20130b665e33798c708d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9126488ae27e20130b665e33798c708d")).intValue();
        }
        if (this.c == null || this.c.size() <= 0) {
            return 0;
        }
        for (ShopCartItem shopCartItem : this.c) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j, long j2) {
        int i = 0;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e805cec5e08f10b4c7ffd87d704263ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e805cec5e08f10b4c7ffd87d704263ab")).intValue();
        }
        if (this.c == null || this.c.size() <= 0) {
            return 0;
        }
        for (ShopCartItem shopCartItem : this.c) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int a(long j, long j2, GoodsAttr[] goodsAttrArr, List<OrderedFood> list) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f693eda0e64ebf918e20b59fc32cb96b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f693eda0e64ebf918e20b59fc32cb96b")).intValue();
        }
        if (this.c == null || this.c.size() <= 0) {
            return 0;
        }
        GoodsSpu goodsSpu = new GoodsSpu();
        goodsSpu.id = j;
        GoodsSku goodsSku = new GoodsSku();
        goodsSku.id = j2;
        OrderedFood orderedFood = new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, 1);
        orderedFood.setComboItemList(list);
        int i = 0;
        for (ShopCartItem shopCartItem : this.c) {
            if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.equals(orderedFood)) {
                i += shopCartItem.food.getCount();
            }
        }
        return i;
    }

    public final int b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f190a19babb9bd8f8f6a22690e942c15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f190a19babb9bd8f8f6a22690e942c15")).intValue();
        }
        if (this.c != null) {
            for (ShopCartItem shopCartItem : this.c) {
                if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.sku != null && shopCartItem.food.spu.isDiscountGood()) {
                    int count = shopCartItem.food.getCount();
                    i = ((shopCartItem.food.sku.getRestrictNum() < 0 || count <= shopCartItem.food.sku.getRestrictNum()) && (shopCartItem.food.sku.getActivityStock() < 0 || count <= shopCartItem.food.sku.getActivityStock())) ? i + count : i + shopCartItem.food.countDiscountNum;
                }
            }
        }
        return i;
    }

    public final void a(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eee2045fb3347140f64624848c41cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eee2045fb3347140f64624848c41cc8");
            return;
        }
        for (ShopCartItem shopCartItem : this.c) {
            if (shopCartItem.food != null && orderedFood != null && orderedFood.equals(shopCartItem.food)) {
                this.c.remove(orderedFood);
            }
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428fe3753c577898242a8bd8be16e5a8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428fe3753c577898242a8bd8be16e5a8") : this.c.toString();
    }
}
