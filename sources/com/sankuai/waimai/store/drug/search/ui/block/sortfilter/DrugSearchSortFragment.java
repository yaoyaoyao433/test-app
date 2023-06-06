package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.search.model.SortItemInfo;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSortFilterFragment;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.SCMaxHeightRecyclerView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugSearchSortFragment extends SGBaseSortFilterFragment {
    public static ChangeQuickRedirect a;
    List<SortItemInfo> c;
    a d;
    private b e;
    private View f;
    private SCMaxHeightRecyclerView g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.search.ui.result.item.sortFilter.a {
        void a(@NonNull SortItemInfo sortItemInfo);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e00372a92d5795f1ef1a7d81dc9860b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e00372a92d5795f1ef1a7d81dc9860b") : layoutInflater.inflate(R.layout.wm_drug_complex_sort_filter_dialog, viewGroup, false);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9818a5f626c0f2389a40b492fd0b9ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9818a5f626c0f2389a40b492fd0b9ab9");
            return;
        }
        super.onViewCreated(view, bundle);
        this.f = view.findViewById(R.id.v_search_sort_list_mask);
        this.g = (SCMaxHeightRecyclerView) view.findViewById(R.id.rv_search_sort_list);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fef1a2815aa8f04c2a9254f4008d377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fef1a2815aa8f04c2a9254f4008d377");
        } else {
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.DrugSearchSortFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d3462aa5dabe7340eb085ad5b7e8e7d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d3462aa5dabe7340eb085ad5b7e8e7d");
                    } else {
                        DrugSearchSortFragment.this.u();
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f4f6dc74be218577c965879d0548f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f4f6dc74be218577c965879d0548f78");
        } else {
            this.g.setMaxHeight((int) (h.b(this.F) * 0.6f));
            e.a aVar = new e.a();
            int a2 = h.a(this.F, 12.0f);
            aVar.c(-1);
            float f = a2;
            aVar.a(0.0f, 0.0f, f, f);
            this.g.setBackground(aVar.a());
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "106dbfb9d240bdeaa997426410a31d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "106dbfb9d240bdeaa997426410a31d7d");
            return;
        }
        this.g.setLayoutManager(new LinearLayoutManager(this.F));
        this.e = new b();
        this.g.setAdapter(this.e);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4368a1b02edb40dc53f104064ceda9f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4368a1b02edb40dc53f104064ceda9f1");
            return;
        }
        super.onAttach(context);
        if (this.d != null) {
            this.d.b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e128ee95dc35bba88102595905967c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e128ee95dc35bba88102595905967c34");
            return;
        }
        super.onDetach();
        if (this.d != null) {
            this.d.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.a<c> {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {DrugSearchSortFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c91c69f2a89be4605b792734715f178", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c91c69f2a89be4605b792734715f178");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull c cVar, int i) {
            c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a4240b85fe0e213ca774a6683292d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a4240b85fe0e213ca774a6683292d4");
                return;
            }
            final SortItemInfo sortItemInfo = (SortItemInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) DrugSearchSortFragment.this.c, i);
            if (DrugSearchSortFragment.this.getContext() == null || sortItemInfo == null) {
                cVar2.a.setVisibility(8);
                return;
            }
            cVar2.a.setVisibility(0);
            cVar2.a.setText(sortItemInfo.name);
            final SearchShareData a2 = SearchShareData.a(DrugSearchSortFragment.this.getContext());
            if (a2.M == sortItemInfo.code) {
                cVar2.a.setTextColor(com.sankuai.shangou.stone.util.d.a("#FF8000", 0));
                cVar2.a.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                cVar2.a.setTextColor(com.sankuai.shangou.stone.util.d.a("#575859", 0));
                cVar2.a.setTypeface(Typeface.DEFAULT);
            }
            long j = sortItemInfo.code;
            Object[] objArr2 = {a2, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57925082afeacceeb4a14c0f1540c30c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57925082afeacceeb4a14c0f1540c30c");
            } else {
                com.sankuai.waimai.store.manager.judas.b.b(DrugSearchSortFragment.this.F, "b_waimai_xcuftkg1_mv").b(a(a2, j)).a();
            }
            cVar2.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.DrugSearchSortFragment.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f10c4fc1c833d8fa640f41e46adec13", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f10c4fc1c833d8fa640f41e46adec13");
                    } else if (DrugSearchSortFragment.this.d != null) {
                        DrugSearchSortFragment.this.d.a(sortItemInfo);
                        b bVar = b.this;
                        SearchShareData searchShareData = a2;
                        long j2 = sortItemInfo.code;
                        Object[] objArr4 = {searchShareData, new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e35cae6a9fa3723078f2b2015ead7075", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e35cae6a9fa3723078f2b2015ead7075");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.a(DrugSearchSortFragment.this.F, "b_waimai_xcuftkg1_mc").b(bVar.a(searchShareData, j2)).a();
                        }
                    }
                }
            });
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5541fac871f1a329066d13333a6f5a0", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5541fac871f1a329066d13333a6f5a0") : new c(LayoutInflater.from(DrugSearchSortFragment.this.getContext()).inflate(R.layout.wm_drug_search_sort_fragment_list_item, viewGroup, false));
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329631cc8f6fcc3fa38e95413c25480d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329631cc8f6fcc3fa38e95413c25480d")).intValue() : com.sankuai.shangou.stone.util.a.a(DrugSearchSortFragment.this.c);
        }

        Map<String, Object> a(SearchShareData searchShareData, long j) {
            Object[] objArr = {searchShareData, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f942d4bbe42073f43f79079791c100", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f942d4bbe42073f43f79079791c100");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
            hashMap.put("keyword", searchShareData.h);
            hashMap.put("search_log_id", searchShareData.q);
            hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(searchShareData));
            hashMap.put("if_med_poi", 0);
            hashMap.put("type", Long.valueOf(j));
            hashMap.put("sec_cat_id", Integer.valueOf(searchShareData.C > 0 ? searchShareData.C : searchShareData.B));
            return hashMap;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends RecyclerView.s {
        public TextView a;

        public c(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_search_sort_list_item_text);
        }
    }
}
