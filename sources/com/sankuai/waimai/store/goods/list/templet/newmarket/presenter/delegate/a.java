package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.a b;
    public com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c c;
    public com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.b d;
    public boolean e;
    @NonNull
    protected final f.b f;

    public static GoodsPoiCategory a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        return goodsPoiCategory2 == null ? goodsPoiCategory : goodsPoiCategory2;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public void a(@NonNull g gVar) {
    }

    public boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        return true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public void d(@NonNull g gVar) {
    }

    public abstract void f(@NonNull g gVar);

    public boolean g(g gVar) {
        return false;
    }

    public a(@NonNull f.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b0055d098e672b7056475649e98f2b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b0055d098e672b7056475649e98f2b9");
        } else {
            this.f = bVar;
        }
    }

    public final void a(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.a aVar, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c cVar, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.b bVar) {
        this.b = aVar;
        this.c = cVar;
        this.d = bVar;
    }

    public final void a(@NonNull g gVar, long j, String str, long j2, int i, List<Long> list) {
        Object[] objArr = {gVar, new Long(j), str, new Long(j2), Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ea9f3ad4d45d61373ac82eb7d6d579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ea9f3ad4d45d61373ac82eb7d6d579");
            return;
        }
        gVar.a(j, str);
        gVar.l = i;
        gVar.o = this.e;
        gVar.a(j2);
        gVar.m = list;
        gVar.p = g(gVar);
    }

    @NonNull
    public final g a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a76ebd980cea66be6dc73d411aa42d77", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a76ebd980cea66be6dc73d411aa42d77");
        }
        g gVar = new g(this);
        gVar.a(goodsPoiCategory, goodsPoiCategory2, goodsSpu);
        f(gVar);
        return gVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void e(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00355782a07eadadde970247649819cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00355782a07eadadde970247649819cf");
        } else {
            this.f.L();
        }
    }
}
