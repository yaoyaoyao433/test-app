package com.sankuai.waimai.store.goods.list.templet.newmarket.soldout;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends c.a {
    public static ChangeQuickRedirect c;
    private d d;
    private GoodsPoiCategory e;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a f;

    public f(c.b bVar, @Nonnull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(bVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c957724ec56f99f152ce8e0cb3eb3462", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c957724ec56f99f152ce8e0cb3eb3462");
            return;
        }
        this.f = aVar;
        this.d = new d(bVar.a());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb530afea70798d85c88989e326c744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb530afea70798d85c88989e326c744");
        } else {
            this.b.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.a
    public final void a(GoodsSpu goodsSpu) {
        boolean z;
        com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g gVar;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43028e6cb39d93e2f35649ca5374f3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43028e6cb39d93e2f35649ca5374f3d9");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = this.e;
        Object[] objArr2 = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fdbce9c01673bfde161c39c1325bf41", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fdbce9c01673bfde161c39c1325bf41")).booleanValue();
        } else {
            z = goodsSpu != null && this.d.d(goodsPoiCategory, goodsSpu);
        }
        if (!z) {
            d dVar = this.d;
            GoodsPoiCategory goodsPoiCategory2 = this.e;
            Object[] objArr3 = {goodsPoiCategory2, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4625482d45e9b1fc24884c3cebf492a6", RobustBitConfig.DEFAULT_VALUE)) {
                gVar = (com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4625482d45e9b1fc24884c3cebf492a6");
            } else {
                gVar = new com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g(this);
                gVar.a(goodsPoiCategory2, goodsPoiCategory2, goodsSpu);
                gVar.j = goodsPoiCategory2;
                gVar.i = goodsPoiCategory2;
                gVar.a(this.f.f(), this.f.h());
            }
            dVar.a(gVar);
            return;
        }
        this.b.a(true);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.a
    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4e98166e4399d1e3f92bcdd16ce6d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4e98166e4399d1e3f92bcdd16ce6d6");
            return;
        }
        this.e = goodsPoiCategory;
        this.d.d(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.a
    public final GoodsPoiCategory a() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.a
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b86603a0d7e54bfc7c4d80bebf134f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b86603a0d7e54bfc7c4d80bebf134f");
        } else {
            this.d.a(j, j2, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8aac056ca30d8456d0fa0d05847f469", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8aac056ca30d8456d0fa0d05847f469") : this.d.a(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61d2f81076f35bfbe2606666e9fb0bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61d2f81076f35bfbe2606666e9fb0bc");
        } else {
            this.b.a(this.d.a(gVar.a(), b(gVar)));
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df94f673da23a4ba4303ebf0b72d6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df94f673da23a4ba4303ebf0b72d6fb");
        } else {
            this.b.a((List<GoodsSpu>) null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void e(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae3b9a7d519211ae3d6019cba5431e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae3b9a7d519211ae3d6019cba5431e6");
        } else {
            this.b.c();
        }
    }
}
