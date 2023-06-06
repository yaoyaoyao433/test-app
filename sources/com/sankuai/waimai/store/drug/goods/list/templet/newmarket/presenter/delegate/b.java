package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect g;

    public b(@NonNull i.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dfcd4616c95c8d18ac67dc795b6acd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dfcd4616c95c8d18ac67dc795b6acd9");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.c, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4813dd38328ce453442793c2e5f57c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4813dd38328ce453442793c2e5f57c6b");
            return;
        }
        this.f.E();
        this.f.C();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.c, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146f7657c29f2a3dc8ba6a36e9eb5b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146f7657c29f2a3dc8ba6a36e9eb5b22");
            return;
        }
        h(gVar);
        super.c(gVar);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.c, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.delegate.a, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cabe2f24d104f4228b9951ddf5d4046a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cabe2f24d104f4228b9951ddf5d4046a");
            return;
        }
        h(gVar);
        super.d(gVar);
    }

    private void h(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b0897d8992a591c044786896a82f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b0897d8992a591c044786896a82f26");
            return;
        }
        GoodsPoiCategory goodsPoiCategory = gVar.i;
        if (goodsPoiCategory == null) {
            return;
        }
        this.f.h((a(goodsPoiCategory) ? this.d.b : null) == null);
    }

    private boolean a(GoodsPoiCategory goodsPoiCategory) {
        GoodsPoiCategory goodsPoiCategory2;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30934d155674baf5440e8a678191536d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30934d155674baf5440e8a678191536d")).booleanValue();
        }
        if (goodsPoiCategory == null || this.b == null || com.sankuai.shangou.stone.util.a.b(this.b.b()) || (goodsPoiCategory2 = (GoodsPoiCategory) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b.b(), 0)) == null || TextUtils.isEmpty(goodsPoiCategory2.tag)) {
            return false;
        }
        return TextUtils.equals(goodsPoiCategory.tag, goodsPoiCategory2.tag);
    }
}
