package com.sankuai.waimai.store.goods.list.templet.newmarket.soldout;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.d {
    public static ChangeQuickRedirect d;

    public d(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037cecad0a0ff3424244e16d119c5e25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037cecad0a0ff3424244e16d119c5e25");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.d, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final void d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b8e02886fbb0e16ba9d89dab716be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b8e02886fbb0e16ba9d89dab716be5");
            return;
        }
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.d.b;
        if ((PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94a97f747ab35aa02fa7e0eec671fd9c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94a97f747ab35aa02fa7e0eec671fd9c")).booleanValue() : this.c.a(goodsPoiCategory)) || goodsPoiCategory == null) {
            return;
        }
        a(goodsPoiCategory, goodsPoiCategory.saleOutSpuIds, (List<GoodsSpu>) null);
    }
}
