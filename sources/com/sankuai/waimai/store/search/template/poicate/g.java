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
public final class g extends com.sankuai.waimai.store.search.adapterdelegates.b<PoiEntity, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "760efef1f924f626f75da80fefca039b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "760efef1f924f626f75da80fefca039b") : new a(layoutInflater.inflate(R.layout.wm_sc_nox_search_poi_recommend, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull PoiEntity poiEntity, @NonNull a aVar, int i) {
        PoiEntity poiEntity2 = poiEntity;
        a aVar2 = aVar;
        Object[] objArr = {poiEntity2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40619c9616119c4ec74b8000ebbf3e1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40619c9616119c4ec74b8000ebbf3e1b");
            return;
        }
        Object[] objArr2 = {poiEntity2};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "fdddf827e227b9cb5a41ad646817255a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "fdddf827e227b9cb5a41ad646817255a");
        } else {
            aVar2.b.a(poiEntity2);
        }
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b357ac398bf9a21a3e5350ca27f641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b357ac398bf9a21a3e5350ca27f641");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c46339ee4f734bea7df34b583e614e6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c46339ee4f734bea7df34b583e614e6")).booleanValue() : str.equals("sg_search_no_result_recommend");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        h b;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82c70dd25f4882cf5395108274f6b6a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82c70dd25f4882cf5395108274f6b6a");
            } else {
                this.b = new h(view);
            }
        }
    }
}
