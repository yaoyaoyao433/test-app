package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.h;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends h {
    public static ChangeQuickRedirect e;

    public a(i.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(bVar, aVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f3931cbcaebf726f0da7211b05f1c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f3931cbcaebf726f0da7211b05f1c6");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.h
    public final c i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c90256eb0863fe6808fce95159e132", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c90256eb0863fe6808fce95159e132") : new d(this.b.A());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final GoodsPoiCategory h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d82488f892d11d597f7f14612751c46", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d82488f892d11d597f7f14612751c46");
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "11f67415868e51d30652a899ea1627e0", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "11f67415868e51d30652a899ea1627e0") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b, 0);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f453a188af6eae19947029c9fce3ccd5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f453a188af6eae19947029c9fce3ccd5")).booleanValue() : e() <= 0 && f() <= 0;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.h, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2b3e4830408766c7e2af8bfed19fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2b3e4830408766c7e2af8bfed19fcd");
        } else {
            super.a(goodsSpu, goodsPoiCategory);
        }
    }
}
