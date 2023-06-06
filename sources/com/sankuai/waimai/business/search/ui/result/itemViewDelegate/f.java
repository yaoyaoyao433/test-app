package com.sankuai.waimai.business.search.ui.result.itemViewDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.common.view.RecommendHeadLayout;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, a> {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    @NonNull
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b827cbe9ad0c144fb2e4912d048ce1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b827cbe9ad0c144fb2e4912d048ce1c");
        }
        com.sankuai.waimai.business.search.common.view.a aVar = new com.sankuai.waimai.business.search.common.view.a(this.b);
        aVar.setUpwardSticky(true);
        aVar.setDownwardSticky(false);
        aVar.setLayoutParams(new StaggeredGridLayoutManager.b(-1, -2));
        layoutInflater.inflate(R.layout.wm_nox_search_list_recommend_head, (ViewGroup) aVar, true);
        return new a(aVar);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(@NonNull Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        Serializable serializable = (Serializable) obj;
        a aVar = (a) sVar;
        Object[] objArr = {serializable, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8e48cf946ffc3416354c8d556270c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8e48cf946ffc3416354c8d556270c6");
            return;
        }
        com.sankuai.waimai.business.search.datatype.b bVar = (com.sankuai.waimai.business.search.datatype.b) serializable;
        aVar.a.setTitle(bVar.a);
        aVar.a.setSubtitle(bVar.b);
        if (bVar.c) {
            return;
        }
        bVar.c = true;
        Context context = this.b;
        String desc = aVar.a.getDesc();
        Object[] objArr2 = {context, desc};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d2c844fe9cca1d21e70e046f99c62286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d2c844fe9cca1d21e70e046f99c62286");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title_recommend_reason", desc);
        h.a(context, 2, "c_nfqbfvw", "b_3j1agd2z", AppUtil.generatePageInfoKey(context), hashMap);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof com.sankuai.waimai.business.search.datatype.b;
    }

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a697ffc3075abbb4fe8c1894317827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a697ffc3075abbb4fe8c1894317827");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public RecommendHeadLayout a;

        public a(View view) {
            super(view);
            this.a = (RecommendHeadLayout) view.findViewById(R.id.root);
        }
    }
}
