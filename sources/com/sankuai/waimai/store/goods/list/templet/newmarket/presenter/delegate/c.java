package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.goods.list.sniffer.SGGoodListSnifferRenderModel;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a {
    public static ChangeQuickRedirect h;
    private final boolean g;

    public c(@NonNull f.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ad8d0792654cacf2ff82b14cc43360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ad8d0792654cacf2ff82b14cc43360");
        } else {
            this.g = j.h().a("supermarket/change_force_pull_data_condition", false);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9072365026b233838c2166737c4c9f96", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9072365026b233838c2166737c4c9f96") : this.c.a(gVar.a());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efd4c916ca1133448fcf281ac463406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efd4c916ca1133448fcf281ac463406");
        } else {
            this.f.K();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a
    public final void f(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79494332e1d89efc3bc1f0c215290fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79494332e1d89efc3bc1f0c215290fc4");
            return;
        }
        gVar.i = gVar.d;
        gVar.j = gVar.e;
        gVar.b = true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db36c61ad1ba8891e0c9bdc5ed6cee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db36c61ad1ba8891e0c9bdc5ed6cee4");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = gVar.i;
        if (goodsPoiCategory == null) {
            return;
        }
        GoodsPoiCategory a = gVar.a();
        if (a != null) {
            a.sortType = gVar.b();
            a.setBrandIds(gVar.m);
        }
        this.f.a(goodsPoiCategory, goodsPoiCategory.childGoodPoiCategory);
        List<GoodsSpu> a2 = this.c.a(a, b(gVar));
        this.f.a(a2, a);
        if (!com.sankuai.shangou.stone.util.a.b(a2) || com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c.e(a)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47a300b6b363f02fefb1f20431203d3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47a300b6b363f02fefb1f20431203d3b");
                return;
            } else {
                com.sankuai.waimai.store.util.monitor.c.a(SGStoreContentRender.Normal);
                return;
            }
        }
        Object[] objArr3 = {gVar};
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f5100fdc29c3fbd718b2a7b876149e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f5100fdc29c3fbd718b2a7b876149e2");
            return;
        }
        GoodsPoiCategory a3 = gVar.a();
        SGGoodListSnifferRenderModel sGGoodListSnifferRenderModel = new SGGoodListSnifferRenderModel(gVar.f, gVar.g, a3 != null ? a3.tag : "-1", "");
        SGStoreContentRender sGStoreContentRender = SGStoreContentRender.FoodDataSourceEmpty;
        String a4 = i.a(sGGoodListSnifferRenderModel);
        com.sankuai.waimai.store.util.monitor.c.a(sGStoreContentRender, a4, "展示数据为空：" + com.sankuai.waimai.store.locate.a.d() + CommonConstant.Symbol.MINUS + sGGoodListSnifferRenderModel.poiName);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0635b0ef7f5f64740147893b4ed5e3b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0635b0ef7f5f64740147893b4ed5e3b6");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = gVar.i;
        if (goodsPoiCategory == null) {
            return;
        }
        this.f.a(goodsPoiCategory, goodsPoiCategory.childGoodPoiCategory);
        if (this.f.h()) {
            GoodsSpu createEmptySpu = GoodsSpu.createEmptySpu();
            ArrayList arrayList = new ArrayList();
            arrayList.add(createEmptySpu);
            goodsPoiCategory.spuIds = com.sankuai.shangou.stone.util.a.d(Long.valueOf(createEmptySpu.id));
            goodsPoiCategory.spus = arrayList;
            this.c.d(gVar.a());
            this.f.a(arrayList, gVar.a());
            return;
        }
        this.f.a((List<GoodsSpu>) null, gVar.a());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a
    public final boolean g(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b942f0e8667eb7025dec85e0a7f4b379", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b942f0e8667eb7025dec85e0a7f4b379")).booleanValue();
        }
        if (gVar.h != -1 && !this.g) {
            List<Long> b = b(gVar);
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) b) && !b.contains(Long.valueOf(gVar.h))) {
                return true;
            }
        }
        if (gVar.a() == null) {
            return false;
        }
        return (gVar.a().sortType != gVar.b()) || ((com.sankuai.shangou.stone.util.a.a((List) gVar.a().getBrandIds()) != 0 || com.sankuai.shangou.stone.util.a.a((List) gVar.m) != 0) ? gVar.a().getBrandIds().equals(gVar.m) ^ true : false);
    }
}
