package com.sankuai.waimai.bussiness.order.confirm.collect.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public OrderedFood b;
    public GoodsSpu c;
    public int d;
    public int e;
    public int f;
    public int g;
    public double h;
    public String i;
    public int j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79340a4018f08fd9287a89fc91883e7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79340a4018f08fd9287a89fc91883e7b");
        } else {
            this.j = -1;
        }
    }

    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c675f3105fcf4a459396218fbc50e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c675f3105fcf4a459396218fbc50e7");
        } else if (goodsSpu == null) {
        } else {
            this.c = goodsSpu;
            GoodsSku goodsSku = goodsSpu.sku;
            if (goodsSku != null) {
                this.f = goodsSku.minOrderCount;
                this.g = goodsSku.getStock();
                this.h = goodsSku.price;
                this.i = goodsSku.promotionInfo;
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac4c87bdc8422d99ffdb5cf75708c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac4c87bdc8422d99ffdb5cf75708c2b");
            return;
        }
        this.b = new OrderedFood(this.c, this.c.getSkuList() != null ? this.c.getSkuList().get(0) : null, this.c.hasMultiSaleAttr ? this.c.getAttrValuesArr() : null, this.e);
        this.b.setCount(this.e);
        this.b.setCartId(this.j);
    }
}
