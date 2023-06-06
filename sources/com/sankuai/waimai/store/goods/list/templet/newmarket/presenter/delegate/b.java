package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect g;

    public b(@NonNull f.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a325694b635a2f958bbcebc8f36eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a325694b635a2f958bbcebc8f36eda");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.c, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "625e025ff9e5d00c07ef97c490d1316b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "625e025ff9e5d00c07ef97c490d1316b");
            return;
        }
        this.f.M();
        this.f.K();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.c, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8d8aa425fa4b9ea35fbc57722d59ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8d8aa425fa4b9ea35fbc57722d59ef");
            return;
        }
        h(gVar);
        super.c(gVar);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.c, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5620d0ad19edbb481c5fee5586cf1a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5620d0ad19edbb481c5fee5586cf1a6a");
            return;
        }
        h(gVar);
        super.d(gVar);
    }

    private void h(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b3ab55021fb8b8b5ab6656b2b456e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b3ab55021fb8b8b5ab6656b2b456e57");
            return;
        }
        this.f.g((i(gVar) ? this.d.b : null) == null);
    }

    private boolean i(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b98501562a105cc715cb0d548849d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b98501562a105cc715cb0d548849d0")).booleanValue();
        }
        GoodsPoiCategory goodsPoiCategory = gVar.j;
        if (goodsPoiCategory == null || this.b == null || com.sankuai.shangou.stone.util.a.b(this.b.b())) {
            return false;
        }
        GoodsPoiCategory goodsPoiCategory2 = gVar.j;
        GoodsPoiCategory goodsPoiCategory3 = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b.b(), 0);
        GoodsPoiCategory goodsPoiCategory4 = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) (goodsPoiCategory3 != null ? goodsPoiCategory3.childGoodPoiCategory : null), 0);
        if (goodsPoiCategory4 == null || goodsPoiCategory2 == null) {
            if (goodsPoiCategory == null || goodsPoiCategory3 == null) {
                return false;
            }
            return TextUtils.equals(goodsPoiCategory.tag, goodsPoiCategory3.tag);
        }
        return TextUtils.equals(goodsPoiCategory2.tag, goodsPoiCategory4.tag);
    }
}
