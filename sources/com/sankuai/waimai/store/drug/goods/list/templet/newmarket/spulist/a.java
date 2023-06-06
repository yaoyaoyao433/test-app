package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.f;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.drug.base.a {
    public static ChangeQuickRedirect c;

    public abstract void a(int i);

    public abstract void a(RecyclerView.k kVar);

    public abstract void a(f fVar);

    public abstract void a(Poi.PoiCouponItem poiCouponItem);

    public abstract void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list);

    public abstract void a(IMarketResponse iMarketResponse);

    public abstract void a(Boolean bool);

    public abstract void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

    public abstract void a(boolean z);

    public boolean a() {
        return true;
    }

    public abstract void b();

    public abstract void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

    public abstract void b(boolean z);

    public abstract void c();

    public abstract void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory);

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411f993bde04cae87d5d0336a8eb4ccb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411f993bde04cae87d5d0336a8eb4ccb");
        }
    }
}
