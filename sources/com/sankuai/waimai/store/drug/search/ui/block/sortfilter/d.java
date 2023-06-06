package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.search.ui.block.sortfilter.BrandQuickFilterListView;
import com.sankuai.waimai.store.search.model.BrandFilterItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BrandQuickFilterListView.b b;
    private final BrandFilterItem c;
    private final BrandQuickFilterListView.c d;
    private final int e;

    private d(BrandQuickFilterListView.b bVar, BrandFilterItem brandFilterItem, BrandQuickFilterListView.c cVar, int i) {
        this.b = bVar;
        this.c = brandFilterItem;
        this.d = cVar;
        this.e = i;
    }

    public static View.OnClickListener a(BrandQuickFilterListView.b bVar, BrandFilterItem brandFilterItem, BrandQuickFilterListView.c cVar, int i) {
        Object[] objArr = {bVar, brandFilterItem, cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b83e8b98f3023f60e77daf81b79b45bc", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b83e8b98f3023f60e77daf81b79b45bc") : new d(bVar, brandFilterItem, cVar, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d4a9fa40d5980a8981acbd9833ecbd", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d4a9fa40d5980a8981acbd9833ecbd");
            return;
        }
        BrandQuickFilterListView.b bVar = this.b;
        BrandFilterItem brandFilterItem = this.c;
        BrandQuickFilterListView.c cVar = this.d;
        int i = this.e;
        Object[] objArr2 = {bVar, brandFilterItem, cVar, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect2 = BrandQuickFilterListView.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3d5e88dfc7838eff65c772eaf0f4525a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3d5e88dfc7838eff65c772eaf0f4525a");
            return;
        }
        Context context = cVar.itemView.getContext();
        Object[] objArr3 = {brandFilterItem, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = BrandQuickFilterListView.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7868714788b426ceefafb43bb532886d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7868714788b426ceefafb43bb532886d");
            return;
        }
        if (bVar.b != null) {
            bVar.b.a(brandFilterItem, i != bVar.e);
        }
        if (i == bVar.e) {
            bVar.e = -1;
        } else {
            bVar.e = i;
        }
        bVar.notifyDataSetChanged();
        com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", com.sankuai.waimai.store.manager.judas.b.a((Object) context), "b_waimai_med_47o2mzvu_mc").b(bVar.a(brandFilterItem, i)).a();
    }
}
