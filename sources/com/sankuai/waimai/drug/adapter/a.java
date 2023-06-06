package com.sankuai.waimai.drug.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.drug.model.f;
import com.sankuai.waimai.drug.viewHolder.d;
import com.sankuai.waimai.drug.viewHolder.e;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartHandPriceInfo;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.store.newwidgets.list.c<f, InterfaceC0932a> {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    private final SCPageConfig e;
    private final com.sankuai.waimai.store.expose.a<f> f;
    private GoodDetailResponse g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0932a extends com.sankuai.waimai.store.newwidgets.list.b {
        void a();
    }

    public static /* synthetic */ int a(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f812b84791230032862bf602eb14791b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f812b84791230032862bf602eb14791b")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            CartHandPriceInfo cartHandPriceInfo = (CartHandPriceInfo) list.get(i2);
            if (cartHandPriceInfo != null && cartHandPriceInfo.type != 1 && cartHandPriceInfo.type != 100) {
                i++;
            }
        }
        return i;
    }

    public a(@NonNull InterfaceC0932a interfaceC0932a, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, GoodDetailResponse goodDetailResponse) {
        super(interfaceC0932a);
        Object[] objArr = {interfaceC0932a, aVar, sCPageConfig, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604e9aa329af1668082a0fedd743757b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604e9aa329af1668082a0fedd743757b");
            return;
        }
        this.b = aVar;
        this.e = sCPageConfig;
        this.g = goodDetailResponse;
        this.f = new com.sankuai.waimai.store.expose.a<f>() { // from class: com.sankuai.waimai.drug.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, f fVar) {
                f fVar2 = fVar;
                Object[] objArr2 = {view, fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c103f5debb460b3456b0a8ac5135ea2d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c103f5debb460b3456b0a8ac5135ea2d")).booleanValue();
                }
                if (fVar2 == null) {
                    return false;
                }
                if (fVar2.d == 3) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_waimai_c22mzzp1_mv").a("poi_id", a.this.b.d()).a();
                } else if (fVar2.d == 1) {
                    if (fVar2.h == null || fVar2.h.food == null) {
                        return false;
                    }
                    OrderedFood orderedFood = fVar2.h.food;
                    HandPriceInfo handPriceInfo = fVar2.h.handPriceInfo;
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_irkpaqrq").a("poi_id", a.this.b.d()).a("spu_id", Long.valueOf(orderedFood.spu.getId())).a("sku_id", Long.valueOf(orderedFood.getSkuId())).a("item_num", Integer.valueOf(orderedFood.getCount())).a("index", Integer.valueOf(fVar2.f)).a("group_index", Integer.valueOf(fVar2.e)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(a.this.b.v())).a("is_vip", Integer.valueOf(orderedFood.showPoiMember ? 1 : 0)).a("has_package_fee", Integer.valueOf(fVar2.h.showBoxFee() ? 1 : 0)).a("is_valid", Integer.valueOf(fVar2.d != 4 ? 1 : 0)).a("spu_tag", (handPriceInfo == null || t.a(handPriceInfo.getHandPriceLabel())) ? "" : handPriceInfo.getHandPriceLabel()).a();
                } else if (fVar2.d == 2) {
                    if (fVar2.r != null) {
                        com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_89b8blys").a("poi_id", a.this.b.d()).a("stid", fVar2.l).a();
                    }
                } else if (fVar2.d == 5 && fVar2.t) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.e.d, "b_waimai_sg_3dl9o927_mv").a("poi_id", a.this.b.d()).a("stid", com.sankuai.waimai.drug.util.c.a(a.this.b)).a("preferential_number", Integer.valueOf(a.a(a.this, com.sankuai.waimai.store.order.a.e().k(a.this.b.d()).w))).a();
                }
                return true;
            }
        };
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return f.a;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc804dc08968d1abeb6a3ef85973ed17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc804dc08968d1abeb6a3ef85973ed17")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922265dfa099926d9a40e0e6be08e1e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922265dfa099926d9a40e0e6be08e1e8");
        }
        switch (i) {
            case 0:
                return new com.sankuai.waimai.drug.viewHolder.f(this.b);
            case 1:
                return new com.sankuai.waimai.drug.viewHolder.b(this.b, this.e);
            case 2:
                return new com.sankuai.waimai.drug.viewHolder.a(this.e, this.b.g());
            case 3:
                return new d();
            case 4:
                return new e();
            case 5:
                return new com.sankuai.waimai.drug.viewHolder.c();
            default:
                return null;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "735c0036bf8d0619787991490a727828", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "735c0036bf8d0619787991490a727828");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901723fd5ee7ddc2a52d3a2d329d51b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901723fd5ee7ddc2a52d3a2d329d51b9");
        } else {
            this.f.a();
        }
    }
}
