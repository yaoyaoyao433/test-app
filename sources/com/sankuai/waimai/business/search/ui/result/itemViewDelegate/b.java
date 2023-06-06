package com.sankuai.waimai.business.search.ui.result.itemViewDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CategoryFilterData;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, a> {
    public static ChangeQuickRedirect e;
    private final ResultFragment f;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c41297dc88e1d361e2a06f1e545870b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c41297dc88e1d361e2a06f1e545870b0");
        }
        com.sankuai.waimai.business.search.ui.result.categoryfilter.d dVar = new com.sankuai.waimai.business.search.ui.result.categoryfilter.d(this.b, this.f);
        return new a(dVar.a(viewGroup), dVar);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        Serializable serializable = (Serializable) obj;
        a aVar = (a) sVar;
        Object[] objArr = {serializable, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d5529de1086c94a2489db549c212a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d5529de1086c94a2489db549c212a1");
        } else {
            aVar.a.a(i, (CategoryFilterData) serializable);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof CategoryFilterData;
    }

    public b(Context context, ResultFragment resultFragment) {
        super(context);
        Object[] objArr = {context, resultFragment};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e856066845ccfb8a90fc97cdd0e2403", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e856066845ccfb8a90fc97cdd0e2403");
        } else {
            this.f = resultFragment;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public final com.sankuai.waimai.business.search.ui.result.categoryfilter.d a;

        public a(View view, com.sankuai.waimai.business.search.ui.result.categoryfilter.d dVar) {
            super(view);
            this.a = dVar;
        }
    }
}
