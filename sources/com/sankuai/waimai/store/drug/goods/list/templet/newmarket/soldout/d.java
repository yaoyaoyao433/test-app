package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.d {
    public static ChangeQuickRedirect d;

    public d(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "525d088838db8bdfe03ab2521e1e9e17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "525d088838db8bdfe03ab2521e1e9e17");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.d, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17a54469beb53feec6a46aaf4559e28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17a54469beb53feec6a46aaf4559e28");
            return;
        }
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.d.b;
        if ((PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2250a5828e85bf700e3fcfa806c923b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2250a5828e85bf700e3fcfa806c923b4")).booleanValue() : this.c.a(goodsPoiCategory)) || goodsPoiCategory == null) {
            return;
        }
        a(goodsPoiCategory, goodsPoiCategory.saleOutSpuIds, (List<GoodsSpu>) null);
    }
}
