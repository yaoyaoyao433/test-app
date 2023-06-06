package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect g;

    public d(@NonNull i.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb084423befcd2cdaef4b4dbeb8c7dab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb084423befcd2cdaef4b4dbeb8c7dab");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb93cee22e08317ce70ba520e912089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb93cee22e08317ce70ba520e912089");
        } else {
            this.f.B();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a
    public final void f(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09fd7bc786b14094863acf9ba85591dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09fd7bc786b14094863acf9ba85591dd");
            return;
        }
        List<Long> a = this.c.a(gVar.c(), gVar.k);
        GoodsPoiCategory goodsPoiCategory = gVar.e;
        GoodsPoiCategory goodsPoiCategory2 = gVar.d;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a)) {
            gVar.j = goodsPoiCategory;
            gVar.i = goodsPoiCategory2;
            return;
        }
        GoodsPoiCategory b = this.b.b(goodsPoiCategory2, goodsPoiCategory);
        if (b != null) {
            gVar.i = goodsPoiCategory2;
            gVar.j = b;
        } else {
            gVar.i = this.b.a(goodsPoiCategory2);
            gVar.j = this.b.b(gVar.i, null);
        }
        gVar.k = null;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4dfc77969d040ef0546ee8f82639a67", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4dfc77969d040ef0546ee8f82639a67") : this.c.a(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bc05f153a6f0e1d466b9ff83a80ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bc05f153a6f0e1d466b9ff83a80ba3");
            return;
        }
        GoodsPoiCategory a = gVar.a();
        if (a.getParentCategory() == null) {
            a.setParentCategory(gVar.i);
        }
        if (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c.d(gVar.d)) {
            this.f.a(a, a.childGoodPoiCategory);
        }
        this.f.b(this.c.a(a, b(gVar)), a);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b130c0e1ddde688e0d19be1ed488d3d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b130c0e1ddde688e0d19be1ed488d3d7");
        } else {
            super.d(gVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        int i;
        byte b;
        byte b2;
        boolean z;
        byte b3;
        boolean z2;
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "967e8bdfb9812948873554d7893358ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "967e8bdfb9812948873554d7893358ee")).booleanValue();
        }
        if (a(goodsPoiCategory, goodsPoiCategory2) != null) {
            Object[] objArr2 = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d739b4e8183fd1ff479af3242181f10", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d739b4e8183fd1ff479af3242181f10")).booleanValue();
            } else {
                b = (!com.sankuai.shangou.stone.util.a.a((Collection<?>) this.c.a(goodsPoiCategory2, goodsSpu)) && this.b.b(goodsPoiCategory, goodsPoiCategory2) == null) ? (byte) 0 : (byte) 1;
            }
            if (b == 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = g;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "633910a8c1281fc1cbe4a403e3dcaf1f", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "633910a8c1281fc1cbe4a403e3dcaf1f")).booleanValue();
                } else {
                    com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a aVar = this.b;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a.a;
                    z2 = (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "1c1254c3c003e241f0f8e4f5a7463fd9", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "1c1254c3c003e241f0f8e4f5a7463fd9") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b, aVar.c() + 1)) != null;
                }
                if (!z2) {
                    b3 = 0;
                    b2 = b3;
                    i = 2;
                }
            }
            b3 = 1;
            b2 = b3;
            i = 2;
        } else {
            i = 2;
            b = 0;
            b2 = 0;
        }
        Object[] objArr5 = new Object[i];
        objArr5[0] = Byte.valueOf(b);
        objArr5[1] = Byte.valueOf(b2);
        ChangeQuickRedirect changeQuickRedirect5 = g;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "939f77380ffa5a69bdab8c9662279c9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "939f77380ffa5a69bdab8c9662279c9f");
        } else if (b != 0) {
            this.f.g(false);
        } else if (b2 != 0) {
            this.f.g(false);
        } else {
            z = true;
            this.f.g(true);
            if (b == 0 || b2 != 0) {
                return z;
            }
            return false;
        }
        z = true;
        if (b == 0) {
        }
        return z;
    }
}
