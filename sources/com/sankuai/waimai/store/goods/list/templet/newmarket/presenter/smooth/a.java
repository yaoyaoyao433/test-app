package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.h;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends h {
    public static ChangeQuickRedirect g;

    public a(f.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i) {
        super(bVar, aVar, i);
        Object[] objArr = {bVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1177bae27a95c152a3eaf998452152", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1177bae27a95c152a3eaf998452152");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.h
    public final c k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "059f28d4b8f4c85bfc8e3176a15ca8fb", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "059f28d4b8f4c85bfc8e3176a15ca8fb") : new d(this.b.H());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e163e0c5723dc8299aee9925ccb2984d", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e163e0c5723dc8299aee9925ccb2984d");
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.a aVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2f3e5034c4c8686126bca5743f46f0ef", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2f3e5034c4c8686126bca5743f46f0ef") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b, 0);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646d67ff94e3f9eb94c4efec2ba87a77", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646d67ff94e3f9eb94c4efec2ba87a77")).booleanValue() : e() <= 0 && h() <= 0;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.h, com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsPoiCategory goodsPoiCategory, String str) {
        Object[] objArr = {goodsSpu, goodsSku, goodsPoiCategory, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c28c39cc51acecba91c88f49ecf4cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c28c39cc51acecba91c88f49ecf4cef");
        } else {
            super.a(goodsSpu, goodsSku, goodsPoiCategory, str);
        }
    }
}
