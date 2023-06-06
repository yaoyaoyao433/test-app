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
public final class f extends com.sankuai.waimai.store.search.adapterdelegates.b<PoiEntity, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "669e1eeab1276b354a28bd856ae9de43", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "669e1eeab1276b354a28bd856ae9de43") : new a(layoutInflater.inflate(R.layout.wm_sc_search_poi_cate_template_radical, viewGroup, false), 1);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull a aVar, int i) {
        PoiEntity poiEntity2 = poiEntity;
        a aVar2 = aVar;
        Object[] objArr = {poiEntity2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4124506d76f2b6f884339d4fe807ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4124506d76f2b6f884339d4fe807ae");
        } else {
            aVar2.a.a(poiEntity2);
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull com.sankuai.waimai.store.search.statistics.f fVar) {
        PoiEntity poiEntity2 = poiEntity;
        Object[] objArr = {poiEntity2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61f4c15b39179ff62c205f399d02c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61f4c15b39179ff62c205f399d02c2f");
        } else {
            com.sankuai.waimai.store.search.util.e.a(this.l, poiEntity2, fVar);
        }
    }

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a427588c625071df844c4766808701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a427588c625071df844c4766808701");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72578b11006deb42fd6fa91428304ef0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72578b11006deb42fd6fa91428304ef0")).booleanValue() : str.equals("wm_search_poi_template_radical") || str.equals("wm_search_poi_template");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.s {
        public d a;

        public a(View view, int i) {
            super(view);
            this.a = new d(view, 1);
        }
    }
}
