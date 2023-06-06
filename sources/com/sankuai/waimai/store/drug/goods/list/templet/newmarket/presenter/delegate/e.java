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
public final class e extends a {
    public static ChangeQuickRedirect g;

    public e(@NonNull i.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8206283bf0781099c21024912be2f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8206283bf0781099c21024912be2f4");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a
    public final void f(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdef1a89275abf09274e75f3df2bb8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdef1a89275abf09274e75f3df2bb8b");
            return;
        }
        List<Long> b = this.c.b(gVar.c(), gVar.k);
        gVar.q = "1";
        GoodsPoiCategory goodsPoiCategory = gVar.e;
        GoodsPoiCategory goodsPoiCategory2 = gVar.d;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) b)) {
            gVar.j = goodsPoiCategory;
            gVar.i = goodsPoiCategory2;
            return;
        }
        GoodsPoiCategory c = this.b.c(goodsPoiCategory2, goodsPoiCategory);
        if (c != null) {
            gVar.i = goodsPoiCategory2;
            gVar.j = c;
        } else {
            gVar.i = this.b.b(goodsPoiCategory2);
            gVar.j = this.b.c(gVar.i, null);
        }
        gVar.k = null;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c693221ba0484d66569d66ea62c68edf", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c693221ba0484d66569d66ea62c68edf") : this.c.b(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f29bc04a87ab98ad1985241c8489bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f29bc04a87ab98ad1985241c8489bfa");
            return;
        }
        GoodsPoiCategory a = gVar.a();
        if (a.getParentCategory() == null) {
            a.setParentCategory(gVar.i);
        }
        this.f.c(this.c.a(a, b(gVar)), a);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        int i;
        byte b;
        byte b2;
        byte b3;
        boolean z;
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a9284ac81a547b2dfafb5012e5e8d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a9284ac81a547b2dfafb5012e5e8d9")).booleanValue();
        }
        if (a(goodsPoiCategory, goodsPoiCategory2) != null) {
            Object[] objArr2 = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8561f3084ca2fb8a6633335b877b75e6", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8561f3084ca2fb8a6633335b877b75e6")).booleanValue();
            } else {
                b = (!com.sankuai.shangou.stone.util.a.a((Collection<?>) this.c.b(goodsPoiCategory2, goodsSpu)) && this.b.c(goodsPoiCategory, goodsPoiCategory2) == null) ? (byte) 0 : (byte) 1;
            }
            if (b == 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = g;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "697a0fad348b81f86c5eca022985b988", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "697a0fad348b81f86c5eca022985b988")).booleanValue();
                } else {
                    com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a aVar = this.b;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.a.a;
                    GoodsPoiCategory goodsPoiCategory3 = PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "c9ea7c6ae6939c74e5490500f0d6d741", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "c9ea7c6ae6939c74e5490500f0d6d741") : (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.b, aVar.c() - 1);
                    z = (goodsPoiCategory3 == null || com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c.d(goodsPoiCategory3)) ? false : true;
                }
                if (!z) {
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
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "44139f65ffd15d1740654cbbf49c111a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "44139f65ffd15d1740654cbbf49c111a");
        } else if (b != 0) {
            this.f.a(Boolean.FALSE);
        } else if (b2 != 0) {
            this.f.a(Boolean.FALSE);
        } else {
            this.f.a(Boolean.TRUE);
        }
        return (b == 0 && b2 == 0) ? false : true;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a7ef2d361baf2e44e2ac7ed485fd359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a7ef2d361baf2e44e2ac7ed485fd359");
        } else {
            super.d(gVar);
        }
    }
}
