package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends p {
    public static ChangeQuickRedirect a;
    private i f;
    private n g;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p, com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_aggregation_goods_sort_and_title_item_layout;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef67055ce2dda3c55069561e6be9138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef67055ce2dda3c55069561e6be9138");
            return;
        }
        this.f = new i(view.getContext(), (j) this.o);
        this.f.bindView(view);
        super.a(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_slogan_container);
        this.g = new n(view.getContext(), (j) this.o);
        frameLayout.addView(this.g.createView(frameLayout));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(k kVar, int i) {
        i iVar;
        GoodsPoiCategory goodsPoiCategory;
        boolean z;
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "194e59d47dbd5319efe00c3748d3e0ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "194e59d47dbd5319efe00c3748d3e0ef");
            return;
        }
        super.a(kVar, i);
        if (kVar != null && kVar.c != null && !com.sankuai.shangou.stone.util.a.b(kVar.c.childGoodPoiCategory)) {
            iVar = this.f;
            goodsPoiCategory = kVar.b;
        } else {
            iVar = this.f;
            goodsPoiCategory = kVar == null ? null : kVar.c;
        }
        iVar.a(goodsPoiCategory);
        i iVar2 = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar2, changeQuickRedirect2, false, "d95b36e37d08262d148a7d14e39c65ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar2, changeQuickRedirect2, false, "d95b36e37d08262d148a7d14e39c65ba");
        } else {
            iVar2.d.setVisibility(8);
        }
        this.d.hide();
        if (kVar == null || kVar.b == null) {
            return;
        }
        GoodsPoiCategory goodsPoiCategory2 = kVar.b;
        Object[] objArr3 = {goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect3 = p.b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce6bba0e33605008ced6629185e4b569", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce6bba0e33605008ced6629185e4b569")).booleanValue();
        } else {
            z = (goodsPoiCategory2.mutilReceiveCouponTip == null || com.sankuai.shangou.stone.util.t.a(goodsPoiCategory2.mutilReceiveCouponTip.activityDesc)) ? false : true;
        }
        if (z) {
            this.e.setVisibility(0);
            this.c.hide();
            this.g.show();
            this.g.a(kVar, i, 0);
        } else if (a(kVar.b)) {
            this.e.setVisibility(0);
            this.g.hide();
            this.c.show();
            this.c.a(kVar, i, 0);
        } else if (b(kVar.c)) {
            this.e.setVisibility(0);
            this.g.hide();
            this.c.show();
            this.c.a(kVar, i, 1);
        } else {
            this.c.hide();
            this.g.hide();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca3bceb9ac0537383d860379c630320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca3bceb9ac0537383d860379c630320");
            return;
        }
        super.c();
        if (this.g != null) {
            this.g.onDestroy();
        }
    }
}
