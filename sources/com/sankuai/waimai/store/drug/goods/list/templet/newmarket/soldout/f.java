package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends c.a {
    public static ChangeQuickRedirect c;
    @NonNull
    private final d d;
    private GoodsPoiCategory e;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a f;

    public f(c.b bVar, @Nonnull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        super(bVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe13f1e129fb8beda918153c9be2841c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe13f1e129fb8beda918153c9be2841c");
            return;
        }
        this.f = aVar;
        this.d = new d(bVar.a());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8090ba6b5f24821f18e8b6fdac80073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8090ba6b5f24821f18e8b6fdac80073");
        } else {
            this.b.b();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.a
    public final void a(GoodsSpu goodsSpu) {
        boolean z;
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g gVar;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036687be7a1c4b0ff949478cde81d15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036687be7a1c4b0ff949478cde81d15e");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = this.e;
        Object[] objArr2 = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef85d2fb8eac8028ba65416e759fe778", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef85d2fb8eac8028ba65416e759fe778")).booleanValue();
        } else {
            z = goodsSpu != null && this.d.d(goodsPoiCategory, goodsSpu);
        }
        if (!z) {
            d dVar = this.d;
            GoodsPoiCategory goodsPoiCategory2 = this.e;
            Object[] objArr3 = {goodsPoiCategory2, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a61b478d476e1629cd4ec54509c11129", RobustBitConfig.DEFAULT_VALUE)) {
                gVar = (com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a61b478d476e1629cd4ec54509c11129");
            } else {
                gVar = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g(this);
                gVar.a(goodsPoiCategory2, goodsPoiCategory2, goodsSpu);
                gVar.j = goodsPoiCategory2;
                gVar.i = goodsPoiCategory2;
                gVar.a(this.f.g(), this.f.h());
            }
            dVar.a(gVar);
            return;
        }
        this.b.a(true);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.a
    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117bde529e6de605dda7406d9c1bcd86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117bde529e6de605dda7406d9c1bcd86");
            return;
        }
        this.e = goodsPoiCategory;
        this.d.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.a
    public final GoodsPoiCategory a() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.a
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1728ad4f26316bab2a1741564bca1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1728ad4f26316bab2a1741564bca1c2");
        } else {
            this.d.a(j, j2, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cf87430725e85aaa00c84d620d6eed", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cf87430725e85aaa00c84d620d6eed") : this.d.a(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73446e752ba2e38617f9ad6767f120ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73446e752ba2e38617f9ad6767f120ac");
        } else {
            this.b.a(this.d.a(gVar.a(), b(gVar)));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab55be6a9ac4d584f363cb2269b437b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab55be6a9ac4d584f363cb2269b437b");
        } else {
            this.b.a((List<GoodsSpu>) null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void e(@NonNull com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba39243be7d8ab7e1fa6b84909a0510c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba39243be7d8ab7e1fa6b84909a0510c");
        } else {
            this.b.c();
        }
    }
}
