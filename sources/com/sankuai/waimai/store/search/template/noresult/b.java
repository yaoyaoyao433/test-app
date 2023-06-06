package com.sankuai.waimai.store.search.template.noresult;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.NoResultNonDeliveryEntity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.search.adapterdelegates.b<NoResultNonDeliveryEntity, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30b14dd2357cd471a36df923bc78f85", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30b14dd2357cd471a36df923bc78f85");
        }
        c cVar = new c(this.k, this.l);
        return new a(cVar.a(viewGroup), cVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull NoResultNonDeliveryEntity noResultNonDeliveryEntity, @NonNull a aVar, int i) {
        NoResultNonDeliveryEntity noResultNonDeliveryEntity2 = noResultNonDeliveryEntity;
        a aVar2 = aVar;
        Object[] objArr = {noResultNonDeliveryEntity2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6843f495a7a9127d061898901e03ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6843f495a7a9127d061898901e03ba");
        } else {
            aVar2.a.b(i, noResultNonDeliveryEntity2);
        }
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d8cf605fc2f688ca9a734d3843d780", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d8cf605fc2f688ca9a734d3843d780");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6716299b286a9171ec7fcc07de757e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6716299b286a9171ec7fcc07de757e")).booleanValue() : str.equals("wm_search_header_no_result");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public c a;

        public a(View view, c cVar) {
            super(view);
            this.a = cVar;
        }
    }
}
