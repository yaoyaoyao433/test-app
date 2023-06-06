package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.o;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a {
    public static ChangeQuickRedirect g;

    public e(@NonNull f.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6586e0ac15913503b48a22a2e6e869", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6586e0ac15913503b48a22a2e6e869");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a
    public final void f(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26810bef2f6cb198120b5f5f5e50943e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26810bef2f6cb198120b5f5f5e50943e");
            return;
        }
        List<Long> b = this.c.b(gVar.c(), gVar.k);
        gVar.r = "1";
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

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d9199b62571e7dbc47b3147e0aeeb1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d9199b62571e7dbc47b3147e0aeeb1") : this.c.b(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22885bb6421c2526de68861d60a71a85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22885bb6421c2526de68861d60a71a85");
            return;
        }
        GoodsPoiCategory a = gVar.a();
        if (a.getParentCategory() == null) {
            a.setParentCategory(gVar.i);
        }
        this.f.c(this.c.a(a, b(gVar)), a);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        int i;
        byte b;
        byte b2;
        byte b3;
        boolean z;
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec466ba83cdc56a121e42c7a35627a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec466ba83cdc56a121e42c7a35627a3")).booleanValue();
        }
        if (a(goodsPoiCategory, goodsPoiCategory2) != null) {
            Object[] objArr2 = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04664d0d77940d492396458d3d22c285", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04664d0d77940d492396458d3d22c285")).booleanValue();
            } else {
                b = (!com.sankuai.shangou.stone.util.a.a((Collection<?>) this.c.b(goodsPoiCategory2, goodsSpu)) && this.b.c(goodsPoiCategory, goodsPoiCategory2) == null) ? (byte) 0 : (byte) 1;
            }
            if (b == 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = g;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "498c97aa9ff9f81926a7a7e6fe78b26e", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "498c97aa9ff9f81926a7a7e6fe78b26e")).booleanValue();
                } else {
                    GoodsPoiCategory h = this.b.h();
                    z = (h == null || com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c.e(h)) ? false : true;
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
        Object[] objArr4 = new Object[i];
        objArr4[0] = Byte.valueOf(b);
        objArr4[1] = Byte.valueOf(b2);
        ChangeQuickRedirect changeQuickRedirect4 = g;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d043fb3fca6128b84d920ba0fa966856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d043fb3fca6128b84d920ba0fa966856");
        } else if (b != 0) {
            this.f.a(Boolean.FALSE);
        } else if (b2 != 0) {
            this.f.a(Boolean.FALSE);
        } else {
            this.f.a(Boolean.TRUE);
        }
        return (b == 0 && b2 == 0) ? false : true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        GoodsPoiCategory c;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c6c23151c8fd082ff242ae1326f6bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c6c23151c8fd082ff242ae1326f6bb");
        } else if (!this.f.h() || !o.c(com.sankuai.waimai.store.util.b.a())) {
            super.d(gVar);
        } else {
            Object[] objArr2 = {gVar};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a74202b009a32e23aee82e67a49821ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a74202b009a32e23aee82e67a49821ce");
                return;
            }
            if (this.c.c(gVar.c())) {
                c = gVar.a();
            } else {
                c = gVar.c();
            }
            GoodsSpu createEmptySpu = GoodsSpu.createEmptySpu();
            LinkedList linkedList = new LinkedList();
            linkedList.add(GoodsSpu.createEmptySpu());
            c.spuIds = com.sankuai.shangou.stone.util.a.d(Long.valueOf(createEmptySpu.id));
            c.spus = linkedList;
            this.c.d(c);
            this.f.c(linkedList, c);
        }
    }
}
