package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.drug.goods.list.sniffer.SGGoodListSnifferRenderModel;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a {
    public static ChangeQuickRedirect h;
    private final boolean g;

    public c(@NonNull i.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d979f12c140b354d593fad44326fd88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d979f12c140b354d593fad44326fd88");
        } else {
            this.g = j.h().a("supermarket/change_force_pull_data_condition", false);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096f8e924f625c58be5353c5ee2ff7c7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096f8e924f625c58be5353c5ee2ff7c7") : this.c.a(gVar.a());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c26cee7b48242d16802c24bd38cd2dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c26cee7b48242d16802c24bd38cd2dd");
        } else {
            this.f.C();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a
    public final void f(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acbdb77fe5adae36067efcaed3436925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acbdb77fe5adae36067efcaed3436925");
            return;
        }
        gVar.i = gVar.d;
        gVar.j = gVar.e;
        gVar.b = true;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bf7b86f4fea7e56c4790984b85d653b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bf7b86f4fea7e56c4790984b85d653b");
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
        if (!com.sankuai.shangou.stone.util.a.b(a2) || com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c.d(a)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf67328198c86226431515f02ea287a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf67328198c86226431515f02ea287a8");
                return;
            } else {
                com.sankuai.waimai.store.util.monitor.c.a(SGStoreContentRender.Normal);
                return;
            }
        }
        Object[] objArr3 = {gVar};
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56ae42976b0539549e73557d553c2fef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56ae42976b0539549e73557d553c2fef");
            return;
        }
        GoodsPoiCategory a3 = gVar.a();
        SGGoodListSnifferRenderModel sGGoodListSnifferRenderModel = new SGGoodListSnifferRenderModel(gVar.f, a3 != null ? a3.tag : "-1", "");
        SGStoreContentRender sGStoreContentRender = SGStoreContentRender.FoodDataSourceEmpty;
        String a4 = com.sankuai.waimai.store.util.i.a(sGGoodListSnifferRenderModel);
        com.sankuai.waimai.store.util.monitor.c.a(sGStoreContentRender, a4, "展示数据为空：" + com.sankuai.waimai.store.locate.a.d() + CommonConstant.Symbol.MINUS + sGGoodListSnifferRenderModel.poiName);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7d6c9345e5314aaf80d89db647ea46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7d6c9345e5314aaf80d89db647ea46");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = gVar.i;
        if (goodsPoiCategory == null) {
            return;
        }
        this.f.a(goodsPoiCategory, goodsPoiCategory.childGoodPoiCategory);
        this.f.a((List<GoodsSpu>) null, gVar.a());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a
    public final boolean g(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb2a501f9d87bb29f9964cfcb8c5f00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb2a501f9d87bb29f9964cfcb8c5f00")).booleanValue();
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
