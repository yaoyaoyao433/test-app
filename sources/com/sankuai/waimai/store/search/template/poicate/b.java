package com.sankuai.waimai.store.search.template.poicate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.PoiEntity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.search.adapterdelegates.b<PoiEntity, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ee9497bc61df473d5648fdf8568dc0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ee9497bc61df473d5648fdf8568dc0") : new a(layoutInflater.inflate(R.layout.wm_sc_search_poi_cate_template_radical, viewGroup, false), 2);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull a aVar, int i) {
        PoiEntity poiEntity2 = poiEntity;
        a aVar2 = aVar;
        Object[] objArr = {poiEntity2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb59fb28342f531cde6eea4eb9c1c3a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb59fb28342f531cde6eea4eb9c1c3a6");
        } else {
            aVar2.a.a(poiEntity2);
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull com.sankuai.waimai.store.search.statistics.f fVar) {
        PoiEntity poiEntity2 = poiEntity;
        Object[] objArr = {poiEntity2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5275ae9575409fa495a5546505dd6c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5275ae9575409fa495a5546505dd6c4f");
        } else {
            com.sankuai.waimai.store.search.util.e.a(this.l, poiEntity2, fVar);
        }
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c741394ebc8deb16ac1c5e9c5b31ce8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c741394ebc8deb16ac1c5e9c5b31ce8a");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ed17a23c6b957e4c73960badb48ba6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ed17a23c6b957e4c73960badb48ba6")).booleanValue() : str.equals("wm_search_category_template_radical") || str.equals("wm_search_brand_ad_template") || str.equals("wm_search_category_template");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.s {
        public d a;

        public a(View view, int i) {
            super(view);
            this.a = new d(view, 2);
        }
    }
}
