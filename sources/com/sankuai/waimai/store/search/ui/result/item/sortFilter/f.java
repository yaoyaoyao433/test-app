package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

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
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    private List<SearchFilterGroup.SearchFilterItem> b;
    private b.c c;
    private SearchShareData d;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3dfee6ae8b1f0a8fb8bc7ea52fc664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3dfee6ae8b1f0a8fb8bc7ea52fc664");
            return;
        }
        SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        Object[] objArr2 = {searchFilterItem};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "e833118a89d6253d8a0cc7000a91b327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "e833118a89d6253d8a0cc7000a91b327");
            return;
        }
        aVar2.b.a(searchFilterItem);
        aVar2.c.a(searchFilterItem == null ? null : searchFilterItem.searchFilterDot);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db25ff0ef0c8706aed27a1849856240c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db25ff0ef0c8706aed27a1849856240c");
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_search_filter_item, viewGroup, false);
        Context context = inflate.getContext();
        return new a(new com.sankuai.waimai.store.search.common.view.d(inflate, context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4), 0, context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2)), this.c, this.d);
    }

    public f(b.c cVar, SearchShareData searchShareData) {
        Object[] objArr = {cVar, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b66da300a7ec41ace6a89f89d8eb27f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b66da300a7ec41ace6a89f89d8eb27f");
            return;
        }
        this.b = new ArrayList();
        this.c = cVar;
        this.d = searchShareData;
    }

    public final void a(List<SearchFilterGroup.SearchFilterItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9245d750c8f0655831bd881c1c144f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9245d750c8f0655831bd881c1c144f8");
            return;
        }
        this.b.clear();
        if (list != null) {
            this.b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d03d40294ebbe57e6e5160ce24907ab6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d03d40294ebbe57e6e5160ce24907ab6")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        e b;
        com.sankuai.waimai.store.search.common.view.d c;

        public a(com.sankuai.waimai.store.search.common.view.d dVar, b.c cVar, SearchShareData searchShareData) {
            super(dVar.b);
            Object[] objArr = {dVar, cVar, searchShareData};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f96cbfeaae14aa15dbb58c2b288a98ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f96cbfeaae14aa15dbb58c2b288a98ff");
                return;
            }
            this.c = dVar;
            this.b = new e(this.itemView.getContext(), cVar, searchShareData);
            this.b.bindView(this.itemView);
        }
    }
}
