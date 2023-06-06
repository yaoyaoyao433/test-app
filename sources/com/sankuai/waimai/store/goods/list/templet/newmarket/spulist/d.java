package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.base.f {
    public static ChangeQuickRedirect f;

    public abstract void a(int i);

    public abstract void a(RecyclerView.k kVar);

    public abstract void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.f fVar);

    public void a(RecommendPair recommendPair, long j) {
    }

    public abstract void a(Poi.PoiCouponItem poiCouponItem);

    public abstract void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list);

    public abstract void a(IMarketResponse iMarketResponse);

    public abstract void a(Boolean bool);

    public abstract void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

    public abstract void a(List<MutliPoiCouponItem> list, String str, int i);

    public abstract void a(boolean z);

    public boolean a() {
        return true;
    }

    public abstract void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

    public abstract void b(boolean z);

    public abstract boolean b();

    public abstract void c();

    public abstract void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

    public abstract String d(GoodsSpu goodsSpu);

    public abstract void f();

    public abstract void g();

    public abstract void j();

    public abstract void k();

    public abstract void r();

    public abstract void s();

    public void u() {
    }

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b2b8dc3b24cb31f0c85cacc641d19e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b2b8dc3b24cb31f0c85cacc641d19e");
        }
    }
}
