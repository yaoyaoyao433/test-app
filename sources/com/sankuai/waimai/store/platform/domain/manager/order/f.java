package com.sankuai.waimai.store.platform.domain.manager.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements Serializable {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.platform.domain.core.shopcart.b b;

    public f(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "917a8345949bee61480baa908cb499a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "917a8345949bee61480baa908cb499a6");
        } else {
            this.b = bVar;
        }
    }

    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, int i2, int i3, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) throws com.sankuai.waimai.store.exceptions.a {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6364171b8efd7e1f6dc390da8b7a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6364171b8efd7e1f6dc390da8b7a8e");
        } else if (!a.a(goodsSpu)) {
            throw new com.sankuai.waimai.store.exceptions.a("该商品已售光", true);
        } else {
            if (a(goodsSku, i, i2)) {
                throw new com.sankuai.waimai.store.exceptions.a("商品已达库存上限", true);
            }
            if (a(goodsSpu, goodsSku, i2)) {
                throw new com.sankuai.waimai.store.exceptions.a("商品已达库存上限", true);
            }
        }
    }

    private boolean a(GoodsSku goodsSku, int i, int i2) {
        Object[] objArr = {goodsSku, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a630c65060b5f5aada1eaa3f4ec460e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a630c65060b5f5aada1eaa3f4ec460e")).booleanValue();
        }
        int stock = goodsSku.getStock();
        if (stock < -1) {
            return true;
        }
        return stock >= 0 && i + i2 > stock;
    }

    private boolean a(GoodsSpu goodsSpu, GoodsSku goodsSku, int i) {
        Object[] objArr = {goodsSpu, goodsSku, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee9963cd053c3c73e80006d7ce927b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee9963cd053c3c73e80006d7ce927b9")).booleanValue();
        }
        int a2 = goodsSpu != null ? this.b.a(goodsSpu.getId(), goodsSku.getSkuId()) : 0;
        int stock = goodsSku.getStock();
        return stock >= 0 && a2 + i > stock;
    }
}
