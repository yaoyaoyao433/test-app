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
public final class i extends com.sankuai.waimai.store.search.adapterdelegates.b<PoiEntity, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e252a30cdd2b39b84c2b54dd6d13039e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e252a30cdd2b39b84c2b54dd6d13039e") : new a(layoutInflater.inflate(R.layout.wm_sc_search_poi_cate_template_radical, viewGroup, false), 2);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull a aVar, int i) {
        PoiEntity poiEntity2 = poiEntity;
        a aVar2 = aVar;
        Object[] objArr = {poiEntity2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d71fec08249c1f31f3be21595b87e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d71fec08249c1f31f3be21595b87e7");
            return;
        }
        poiEntity2.type = 1;
        aVar2.a.a(poiEntity2);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull com.sankuai.waimai.store.search.statistics.f fVar) {
        PoiEntity poiEntity2 = poiEntity;
        Object[] objArr = {poiEntity2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a654f23b95ffba55a992732084cbbb51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a654f23b95ffba55a992732084cbbb51");
        } else {
            com.sankuai.waimai.store.search.util.e.a(this.l, poiEntity2, fVar);
        }
    }

    public i(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1cb21396f3f1cd0af9e70f8c9f5024b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1cb21396f3f1cd0af9e70f8c9f5024b");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158806468529f460d8fe02084925c455", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158806468529f460d8fe02084925c455")).booleanValue() : str.equals("wm_search_recommend_poi_template");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public d a;

        public a(View view, int i) {
            super(view);
            this.a = new d(view, 2);
        }
    }
}
