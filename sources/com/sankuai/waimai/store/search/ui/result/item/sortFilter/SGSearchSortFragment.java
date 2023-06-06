package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

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
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.SortItemInfo;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.SCMaxHeightRecyclerView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchSortFragment extends SGBaseSortFilterFragment {
    public static ChangeQuickRedirect a;
    public List<SortItemInfo> c;
    public com.sankuai.waimai.store.search.statistics.f d;
    public a e;
    public int f;
    public int g;
    private b h;
    private boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.search.ui.result.item.sortFilter.a {
        void a(@NonNull SortItemInfo sortItemInfo);
    }

    public SGSearchSortFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ef597ab88479a933d3a54d59569506", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ef597ab88479a933d3a54d59569506");
            return;
        }
        this.i = true;
        this.g = -1;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3874cc42b256d78fb23522d552c76cb5", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3874cc42b256d78fb23522d552c76cb5") : layoutInflater.inflate(R.layout.wm_sc_search_sort_dialog, viewGroup, false);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64cb029a7116f189b73b49a614307425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64cb029a7116f189b73b49a614307425");
            return;
        }
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.v_search_sort_list_mask).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSortFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "241a3d0e9e4e6c5c148731d50f0bd0fb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "241a3d0e9e4e6c5c148731d50f0bd0fb");
                } else {
                    SGSearchSortFragment.this.u();
                }
            }
        });
        view.findViewById(R.id.v_search_sort_list_top_mask).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSortFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03a00d769da5caa6dfe0408bf4492286", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03a00d769da5caa6dfe0408bf4492286");
                } else {
                    SGSearchSortFragment.this.u();
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.rv_search_arrow);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.leftMargin = this.f;
        if (this.g != -1) {
            marginLayoutParams.topMargin = this.g;
        }
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setVisibility(this.i ? 0 : 4);
        SCMaxHeightRecyclerView sCMaxHeightRecyclerView = (SCMaxHeightRecyclerView) view.findViewById(R.id.rv_search_sort_list);
        sCMaxHeightRecyclerView.setLayoutManager(new LinearLayoutManager(this.F));
        sCMaxHeightRecyclerView.setMaxHeight((int) (com.sankuai.shangou.stone.util.h.b(this.F) * 0.6f));
        e.a aVar = new e.a();
        int a2 = com.sankuai.shangou.stone.util.h.a(this.F, 6.0f);
        aVar.c(-1);
        float f = a2;
        aVar.a(0.0f, 0.0f, f, f);
        sCMaxHeightRecyclerView.setBackground(aVar.a());
        this.h = new b();
        sCMaxHeightRecyclerView.setAdapter(this.h);
        if (this.d != null) {
            this.d.a(this.F);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0af778bb9ee9d464e307c890660692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0af778bb9ee9d464e307c890660692");
            return;
        }
        super.onAttach(context);
        if (this.e != null) {
            this.e.b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bbb542340abbafa8d2e8498885f436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bbb542340abbafa8d2e8498885f436");
            return;
        }
        super.onDetach();
        if (this.e != null) {
            this.e.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.a<c> {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {SGSearchSortFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ae1b7f64683e95e8f9bb228e7eff63", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ae1b7f64683e95e8f9bb228e7eff63");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull c cVar, int i) {
            c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de9996df3da5eb6fdf812e1c3a71d0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de9996df3da5eb6fdf812e1c3a71d0e");
                return;
            }
            final SortItemInfo sortItemInfo = (SortItemInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) SGSearchSortFragment.this.c, i);
            if (SGSearchSortFragment.this.getContext() == null || sortItemInfo == null) {
                cVar2.a.setVisibility(8);
                return;
            }
            cVar2.a.setVisibility(0);
            cVar2.a.setText(sortItemInfo.name);
            final SearchShareData a2 = SearchShareData.a(SGSearchSortFragment.this.getContext());
            if (a2.M == sortItemInfo.code) {
                cVar2.a.setTextColor(com.sankuai.shangou.stone.util.d.a("#FF8000", 0));
                cVar2.a.setTypeface(Typeface.DEFAULT_BOLD);
            } else {
                cVar2.a.setTextColor(com.sankuai.shangou.stone.util.d.a("#575859", 0));
                cVar2.a.setTypeface(Typeface.DEFAULT);
            }
            cVar2.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSortFragment.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d1dedcd0a0829083572b4a4d30d7b21", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d1dedcd0a0829083572b4a4d30d7b21");
                    } else if (SGSearchSortFragment.this.e != null) {
                        SGSearchSortFragment.this.e.a(sortItemInfo);
                        com.sankuai.waimai.store.manager.judas.b.a(SGSearchSortFragment.this.F, "b_waimai_sg_xox2yans_mc").a("cat_id", Integer.valueOf(a2.z)).a("keyword", a2.h).a("template_type", Integer.valueOf(a2.D)).a("type", SGSearchSortFragment.this.F.getString(R.string.wm_sc_search_sort_statistic_key)).a("rank_type", Long.valueOf(sortItemInfo.code)).a("search_log_id", a2.q).a("stid", com.sankuai.waimai.store.search.statistics.g.f(a2)).a();
                    }
                }
            });
            cVar2.b.setVisibility(i < getItemCount() - 1 ? 0 : 8);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f11529f742e94a3f88fdeba04054ecb2", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f11529f742e94a3f88fdeba04054ecb2") : new c(LayoutInflater.from(SGSearchSortFragment.this.getContext()).inflate(R.layout.wm_sc_search_sort_fragment_list_item, viewGroup, false));
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e41b199b3f4dfb07fddd533381d1e8b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e41b199b3f4dfb07fddd533381d1e8b")).intValue() : com.sankuai.shangou.stone.util.a.a(SGSearchSortFragment.this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class c extends RecyclerView.s {
        public TextView a;
        public View b;

        public c(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_search_sort_list_item_text);
            this.b = view.findViewById(R.id.v_search_sort_list_item_divider);
        }
    }
}
