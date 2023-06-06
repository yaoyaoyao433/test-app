package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.PoiCommonMachListItem;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.util.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.newwidgets.list.f<a, com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c> {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewAttachedToWindow(f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbb0d11b10f104d16dd77ec7ff87d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbb0d11b10f104d16dd77ec7ff87d34");
            return;
        }
        super.onViewAttachedToWindow(cVar2);
        if (cVar2 == null || cVar2.itemView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar2.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.b) {
            StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
            if (cVar2.b instanceof b) {
                bVar.b = false;
            } else {
                bVar.b = true;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d1ab50fabe1e387fd922948ff35e378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d1ab50fabe1e387fd922948ff35e378");
            return;
        }
        super.onViewRecycled(cVar2);
        cVar2.b.g();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final int a;
        public final GoodsSpu b;
        public final PoiCommonMachListItem c;

        public a(GoodsSpu goodsSpu, PoiCommonMachListItem poiCommonMachListItem) {
            this.b = goodsSpu;
            this.c = poiCommonMachListItem;
            this.a = poiCommonMachListItem != null ? 2 : 1;
        }
    }

    public d(Context context, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar, com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c cVar) {
        super(cVar);
        Object[] objArr = {context, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bd60d313b2e39a48caa73031f2b727", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bd60d313b2e39a48caa73031f2b727");
            return;
        }
        this.b = context;
        this.c = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c64fa416ebfd1471de14c4e364d97c8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c64fa416ebfd1471de14c4e364d97c8")).intValue() : h(i).a;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e19a720285ebe40e0634d2fcd6715822", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e19a720285ebe40e0634d2fcd6715822");
        }
        com.sankuai.waimai.store.newwidgets.list.g gVar = null;
        switch (i) {
            case 1:
                gVar = new c();
                break;
            case 2:
                gVar = new b(this.b, this.c);
                break;
        }
        if (gVar != null) {
            gVar.a((com.sankuai.waimai.store.newwidgets.list.g) f());
        }
        return gVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends com.sankuai.waimai.store.newwidgets.list.g<a, com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c> {
        public static ChangeQuickRedirect a;
        private PoiGuessULikeBigCellView b;
        private com.sankuai.waimai.store.expose.v2.entity.b c;

        public c() {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(a aVar, int i) {
            a aVar2 = aVar;
            int i2 = 0;
            Object[] objArr = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667eca995909ed9bb3d0ec32415d7f82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667eca995909ed9bb3d0ec32415d7f82");
                return;
            }
            this.b.setActionCallback(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).f());
            this.b.setEventCallback(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).g());
            this.b.setPoiHelper(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).h());
            this.b.a(aVar2.b, i);
            GoodsSpu goodsSpu = aVar2.b;
            PoiGuessULikeBigCellView poiGuessULikeBigCellView = this.b;
            Object[] objArr2 = {goodsSpu, poiGuessULikeBigCellView, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97a18a5e27f8ac33f3529f6f7adb0e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97a18a5e27f8ac33f3529f6f7adb0e0");
                return;
            }
            if (this.o != 0 && ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).h() != null && k.b(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).h().b, goodsSpu) != null) {
                i2 = 1;
            }
            this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_6x10dzxp", poiGuessULikeBigCellView);
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.c;
            bVar.e = String.valueOf(goodsSpu.getId());
            bVar.a("poi_id", ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).h().d()).a("product_id", Long.valueOf(goodsSpu.getId())).a("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0)).a("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu.activityType)).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(i2)).a("tab_name", ((com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c) this.o).i().tagName).a("stid", j.a(goodsSpu.getPicture()));
            if (poiGuessULikeBigCellView.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) poiGuessULikeBigCellView.getContext(), this.c);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            this.b = (PoiGuessULikeBigCellView) view;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c747f351af660421215c0094906b202", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c747f351af660421215c0094906b202") : new PoiGuessULikeBigCellView(viewGroup.getContext());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.sankuai.waimai.store.newwidgets.list.g<a, com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c> {
        public static ChangeQuickRedirect a;
        public final com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a b;
        public final com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c cVar) {
            com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.c cVar2 = cVar;
            Object[] objArr = {cVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ee56bf4b9cabec50ed223c4ecce920", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ee56bf4b9cabec50ed223c4ecce920");
            } else {
                super.a((b) cVar2);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(a aVar, int i) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "698dd7a12a2b8a193a1527aa38158f1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "698dd7a12a2b8a193a1527aa38158f1c");
                return;
            }
            this.c.a(aVar2.c, i);
            this.c.a("goods_detail_update_shopcart_account", this.b.f());
        }

        public b(Context context, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar) {
            Object[] objArr = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6abb7a5aa9d5e54269435f1d725a0c41", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6abb7a5aa9d5e54269435f1d725a0c41");
                return;
            }
            this.b = aVar;
            this.c = new com.sankuai.waimai.store.goods.list.viewblocks.strollaround.e(context, aVar.g());
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a19e4abe24f17ab939f04c516caf5dd0", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a19e4abe24f17ab939f04c516caf5dd0") : this.c.createView(viewGroup);
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g, com.sankuai.waimai.store.newwidgets.list.h
        public final void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a903f7158652bd531ae02e4bdfc1b0f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a903f7158652bd531ae02e4bdfc1b0f1");
                return;
            }
            super.g();
            this.c.a();
        }
    }
}
