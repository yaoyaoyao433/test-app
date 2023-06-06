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
public final class d extends a {
    public static ChangeQuickRedirect g;

    public d(@NonNull f.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a998fe6cc87d5bb0e2390bd982d5fde7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a998fe6cc87d5bb0e2390bd982d5fde7");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b893cf54da73177967f79690a7b57713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b893cf54da73177967f79690a7b57713");
        } else {
            this.f.J();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a
    public final void f(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cea5c853f0935872657fe5878f49470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cea5c853f0935872657fe5878f49470");
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

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb5cabc6b880dc31ce6b73d2d5099bc", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb5cabc6b880dc31ce6b73d2d5099bc") : this.c.a(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9e79ce0f353e6376cd3d1a529413a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9e79ce0f353e6376cd3d1a529413a3");
            return;
        }
        GoodsPoiCategory a = gVar.a();
        if (a.getParentCategory() == null) {
            a.setParentCategory(gVar.i);
        }
        List<GoodsSpu> a2 = this.c.a(a, b(gVar));
        if (this.f.O() && gVar.d != null) {
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a2)) {
                this.f.P();
            }
            this.f.a(gVar.d, gVar.d.childGoodPoiCategory);
        }
        this.f.b(a2, a);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        GoodsPoiCategory c;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ec2ccf20e84108686a2e57f7a6ed45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ec2ccf20e84108686a2e57f7a6ed45");
        } else if (!this.f.h() || !o.c(com.sankuai.waimai.store.util.b.a())) {
            super.d(gVar);
        } else {
            Object[] objArr2 = {gVar};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53ff4bd12adedccea3a51056bf4485e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53ff4bd12adedccea3a51056bf4485e6");
                return;
            }
            if (this.c.c(gVar.c())) {
                c = gVar.a();
            } else {
                c = gVar.c();
            }
            GoodsSpu createEmptySpu = GoodsSpu.createEmptySpu();
            LinkedList linkedList = new LinkedList();
            linkedList.add(createEmptySpu);
            c.spuIds = com.sankuai.shangou.stone.util.a.d(Long.valueOf(createEmptySpu.id));
            c.spus = linkedList;
            this.c.d(c);
            this.f.b(linkedList, c);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        int i;
        byte b;
        byte b2;
        boolean z;
        byte b3;
        boolean z2;
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd33b32701f9bdd276f869554a00dd4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd33b32701f9bdd276f869554a00dd4")).booleanValue();
        }
        if (a(goodsPoiCategory, goodsPoiCategory2) != null) {
            Object[] objArr2 = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc7d5ec5a2ffdfcf800549b1d9db413b", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc7d5ec5a2ffdfcf800549b1d9db413b")).booleanValue();
            } else {
                b = (!com.sankuai.shangou.stone.util.a.a((Collection<?>) this.c.a(goodsPoiCategory2, goodsSpu)) && this.b.b(goodsPoiCategory, goodsPoiCategory2) == null) ? (byte) 0 : (byte) 1;
            }
            if (b == 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = g;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63e467a4b4e9564d66affccfe536d0d1", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63e467a4b4e9564d66affccfe536d0d1")).booleanValue();
                } else {
                    z2 = this.b.g() != null;
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
        Object[] objArr4 = new Object[i];
        objArr4[0] = Byte.valueOf(b);
        objArr4[1] = Byte.valueOf(b2);
        ChangeQuickRedirect changeQuickRedirect4 = g;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "36913cc8246630912197f6cdc445ae6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "36913cc8246630912197f6cdc445ae6e");
        } else if (b != 0) {
            this.f.f(false);
        } else if (b2 != 0) {
            this.f.f(false);
        } else {
            z = true;
            this.f.f(true);
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
