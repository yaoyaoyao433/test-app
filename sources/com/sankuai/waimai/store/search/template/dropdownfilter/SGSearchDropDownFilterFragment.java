package com.sankuai.waimai.store.search.template.dropdownfilter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSortFilterFragment;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchDropDownFilterFragment extends SGBaseSortFilterFragment implements View.OnClickListener, b.InterfaceC1323b {
    public static ChangeQuickRedirect a;
    public b c;
    public int d;
    public GuidedItem e;
    public CommonMachData f;
    public int g;
    private b.a h;
    private a i;
    private SearchShareData j;
    private Context k;
    private RecyclerView l;
    private TextView n;
    private TextView o;
    private View p;

    public SGSearchDropDownFilterFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3daf3fd0aa7d8415e2e0e454f8b26b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3daf3fd0aa7d8415e2e0e454f8b26b");
        } else {
            this.d = -1;
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758f6288ab3f065cda85dfa9972656b4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758f6288ab3f065cda85dfa9972656b4") : layoutInflater.inflate(R.layout.wm_sc_search_simple_filter_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b991be3361ffcd2d30397dd8b2a94f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b991be3361ffcd2d30397dd8b2a94f26");
            return;
        }
        super.onViewCreated(view, bundle);
        this.k = view.getContext();
        this.j = SearchShareData.a(this.k);
        this.h = new c(this, this.k);
        view.findViewById(R.id.search_simple_filter_reset).setOnClickListener(this);
        view.findViewById(R.id.search_simple_filter_confirm_container).setOnClickListener(this);
        view.findViewById(R.id.search_simple_filter_mask).setOnClickListener(this);
        this.l = (RecyclerView) view.findViewById(R.id.search_simple_filter_list);
        this.l.setPadding(0, this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_8), 0, this.k.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10));
        this.l.setClipToPadding(false);
        View findViewById = view.findViewById(R.id.top_view);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.d != -1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.d;
            findViewById.setLayoutParams(layoutParams);
        }
        this.i = new a(this.h);
        this.l.setAdapter(this.i);
        this.l.setLayoutManager(new GridLayoutManager(this.k, 2));
        this.n = (TextView) view.findViewById(R.id.search_simple_filter_number_of_selected);
        this.o = (TextView) view.findViewById(R.id.search_simple_filter_no_filter_item);
        this.o.setVisibility(8);
        this.p = view.findViewById(R.id.search_simple_filter_mask);
        this.p.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.k, R.color.wm_sc_nox_search_color_99000000));
        this.h.a(this.e);
        GuidedItem guidedItem = this.e;
        int i = this.g;
        CommonMachData commonMachData = this.f;
        f fVar = this.j.L;
        Object[] objArr2 = {guidedItem, Integer.valueOf(i), commonMachData, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9daaab83562fd0a98ba2156814e56df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9daaab83562fd0a98ba2156814e56df");
        } else if (!com.sankuai.shangou.stone.util.a.b(guidedItem.mDropDownItems)) {
            if (guidedItem.filterWindowNode == null) {
                guidedItem.filterWindowNode = new f();
            }
            f a2 = guidedItem.filterWindowNode.a();
            a2.b = fVar;
            a2.c = "b_waimai_sg_pmz43729_mv";
            a2.a("search_log_id", this.j.b(commonMachData)).a("word_index", Integer.valueOf(i)).a("filter_cpvword", "-999").a("filter_code", TextUtils.isEmpty(guidedItem.code) ? -999 : guidedItem.code).a("recommend_word", guidedItem.text).a("type", "筛选组");
            if (guidedItem.filterButtonNode == null) {
                guidedItem.filterButtonNode = new f();
            }
            f a3 = guidedItem.filterButtonNode.a();
            a3.b = guidedItem.filterWindowNode;
            a3.d = "b_waimai_sg_pbsywapj_mc";
        }
        if (this.e == null || this.e.filterWindowNode == null) {
            return;
        }
        this.e.filterWindowNode.b("filter_code", this.h.b()).b("filter_cpvword", this.h.c()).a(this.k);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.InterfaceC1323b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd35939a3044ce174231589959b5e423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd35939a3044ce174231589959b5e423");
        } else if (this.e == null) {
        } else {
            if (this.e.localNumberOfSelectedItems == 0) {
                this.n.setVisibility(8);
            } else {
                this.n.setVisibility(0);
                this.n.setText(this.F.getResources().getString(R.string.wm_sc_nox_search_filter_number_of_selected, String.valueOf(this.e.localNumberOfSelectedItems)));
            }
            a aVar = this.i;
            GuidedItem guidedItem = this.e;
            Object[] objArr2 = {guidedItem};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4e375a87dbdf981649af2bc78811d730", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4e375a87dbdf981649af2bc78811d730");
            } else if (guidedItem != null) {
                aVar.b.clear();
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) guidedItem.mDropDownItems)) {
                    aVar.b.addAll(guidedItem.mDropDownItems);
                }
                aVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.InterfaceC1323b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd8442b12f8c7e18a2428713e22e661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd8442b12f8c7e18a2428713e22e661");
        } else {
            u();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad8455b6540d703d707e02cc4990a6f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad8455b6540d703d707e02cc4990a6f");
            return;
        }
        int id = view.getId();
        if (id == R.id.search_simple_filter_reset) {
            if (this.e != null && this.e.filterButtonNode != null) {
                this.e.filterButtonNode.c("choice_type", 0).c("filter_code", this.h.b()).c("filter_cpvword", this.h.c()).b(this.k);
            }
            this.h.a();
        }
        if (id == R.id.search_simple_filter_confirm_container) {
            this.h.a(this.g);
            this.j.b();
            if (this.e != null && this.e.filterButtonNode != null) {
                this.e.filterButtonNode.c("choice_type", 1).c("filter_code", this.h.b()).c("filter_cpvword", this.h.c()).b(this.k);
            }
            u();
            if (this.c != null) {
                this.c.a();
            }
        }
        if (id == R.id.search_simple_filter_mask) {
            u();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a57b2b6a4cfc3a40a36588cb8f397b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a57b2b6a4cfc3a40a36588cb8f397b");
            return;
        }
        super.onAttach(context);
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0569c168c283c38035486169e0265c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0569c168c283c38035486169e0265c7");
            return;
        }
        super.onDetach();
        if (this.c != null) {
            this.c.c();
        }
    }
}
