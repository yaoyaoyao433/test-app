package com.sankuai.waimai.store.shopping.cart.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.newwidgets.list.c;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.viewHolder.d;
import com.sankuai.waimai.store.shopping.cart.viewHolder.e;
import com.sankuai.waimai.store.shopping.cart.viewHolder.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c<com.sankuai.waimai.store.platform.domain.core.order.a, InterfaceC1328a> {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    private final SCPageConfig e;
    private final com.sankuai.waimai.store.expose.a<com.sankuai.waimai.store.platform.domain.core.order.a> f;
    private GoodDetailResponse g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.shopping.cart.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1328a extends com.sankuai.waimai.store.newwidgets.list.b {
        void a();
    }

    public a(@NonNull InterfaceC1328a interfaceC1328a, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, GoodDetailResponse goodDetailResponse) {
        super(interfaceC1328a);
        Object[] objArr = {interfaceC1328a, aVar, sCPageConfig, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bdbd80c9d8de950e8e051acfa2d421f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bdbd80c9d8de950e8e051acfa2d421f");
            return;
        }
        this.b = aVar;
        this.e = sCPageConfig;
        this.g = goodDetailResponse;
        this.f = new com.sankuai.waimai.store.expose.a<com.sankuai.waimai.store.platform.domain.core.order.a>() { // from class: com.sankuai.waimai.store.shopping.cart.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, com.sankuai.waimai.store.platform.domain.core.order.a aVar2) {
                com.sankuai.waimai.store.platform.domain.core.order.a aVar3 = aVar2;
                Object[] objArr2 = {view, aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7921138674844b8e0296763b26e259b0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7921138674844b8e0296763b26e259b0")).booleanValue();
                }
                if (aVar3 == null) {
                    return false;
                }
                if (aVar3.d == 3) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_waimai_c22mzzp1_mv").a("poi_id", a.this.b.d()).a();
                } else if (aVar3.d == 1) {
                    if (aVar3.h == null || aVar3.h.food == null) {
                        return false;
                    }
                    OrderedFood orderedFood = aVar3.h.food;
                    HandPriceInfo handPriceInfo = aVar3.h.handPriceInfo;
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_irkpaqrq").a("poi_id", a.this.b.d()).a("spu_id", Long.valueOf(orderedFood.spu.getId())).a("sku_id", Long.valueOf(orderedFood.getSkuId())).a("item_num", Integer.valueOf(orderedFood.getCount())).a("index", Integer.valueOf(aVar3.f)).a("group_index", Integer.valueOf(aVar3.e)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(a.this.b.v())).a("is_vip", Integer.valueOf(orderedFood.showPoiMember ? 1 : 0)).a("has_package_fee", Integer.valueOf(aVar3.h.showBoxFee() ? 1 : 0)).a("is_valid", Integer.valueOf(aVar3.d != 4 ? 1 : 0)).a("spu_tag", (handPriceInfo == null || t.a(handPriceInfo.getHandPriceLabel())) ? "" : handPriceInfo.getHandPriceLabel()).a();
                } else if (aVar3.d == 2) {
                    if (aVar3.r != null) {
                        com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_89b8blys").a("poi_id", a.this.b.d()).a("stid", aVar3.l).a();
                    }
                } else if (aVar3.d == 5 && aVar3.t) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_waimai_sg_3dl9o927_mv").a("poi_id", a.this.b.d()).a("stid", com.sankuai.waimai.store.shopping.cart.util.c.a(a.this.b)).a();
                }
                return true;
            }
        };
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return com.sankuai.waimai.store.platform.domain.core.order.a.a;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2faf1bbb54b63319a85def6090bc2e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2faf1bbb54b63319a85def6090bc2e1")).intValue();
        }
        if (getItem(i) == null) {
            return 0;
        }
        return getItem(i).d;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8c3850018290e8d2e6bd60a62efaa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8c3850018290e8d2e6bd60a62efaa0");
        }
        switch (i) {
            case 0:
                return new f(this.b);
            case 1:
                return new com.sankuai.waimai.store.shopping.cart.viewHolder.b(this.b, this.e, this.g);
            case 2:
                return new com.sankuai.waimai.store.shopping.cart.viewHolder.a(this.e, this.b.f(), this.b.h());
            case 3:
                return new d();
            case 4:
                return new e();
            case 5:
                return new com.sankuai.waimai.store.shopping.cart.viewHolder.c();
            default:
                return null;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5624460e196d420d44d77bd19f38933", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5624460e196d420d44d77bd19f38933");
        }
        View view2 = super.getView(i, view, viewGroup);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1 || itemViewType == 3 || itemViewType == 2 || itemViewType == 4 || itemViewType == 5) {
            this.f.b(view2, getItem(i));
        }
        return view2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732b131b60093edc2bd83c683bbbddff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732b131b60093edc2bd83c683bbbddff");
        } else {
            this.f.a();
        }
    }
}
