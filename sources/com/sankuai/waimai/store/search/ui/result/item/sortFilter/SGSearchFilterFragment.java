package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.SGSearchFilterEntity;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchFilterFragment extends SGBaseSortFilterFragment implements View.OnClickListener, b.e {
    public static ChangeQuickRedirect a;
    public a c;
    private RecyclerView d;
    private d e;
    private TextView f;
    private b.d g;
    private ImageView h;
    private LinearLayout i;
    private SearchShareData j;
    private com.sankuai.waimai.store.search.statistics.f k;
    private com.sankuai.waimai.store.search.statistics.f l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.search.ui.result.item.sortFilter.a {
        void a();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void a(int i, int i2) {
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.e
    public final void b_(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f8ca5035bbcb1719ec6e15516034ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f8ca5035bbcb1719ec6e15516034ce");
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    @Nullable
    public final int[] g() {
        return null;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0a8baec7c4f88c4fea1301f3d006ae", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0a8baec7c4f88c4fea1301f3d006ae") : layoutInflater.inflate(R.layout.wm_sc_search_filter_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b7535f8ee600a1d839a8416aeaed582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b7535f8ee600a1d839a8416aeaed582");
            return;
        }
        super.onViewCreated(view, bundle);
        this.g = new g(this, this.F);
        this.j = SearchShareData.a((Context) this.F);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8277f9fe7b716ec97ba42f01a791f878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8277f9fe7b716ec97ba42f01a791f878");
        } else {
            this.d = (RecyclerView) view.findViewById(R.id.search_filter_list);
            this.e = new d(this.g, this.j);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.F);
            this.d.setAdapter(this.e);
            this.d.setLayoutManager(linearLayoutManager);
        }
        view.findViewById(R.id.search_filter_reset).setOnClickListener(this);
        view.findViewById(R.id.search_filter_confirm_container).setOnClickListener(this);
        view.findViewById(R.id.search_filter_mask).setOnClickListener(this);
        view.findViewById(R.id.search_filter_reload).setOnClickListener(this);
        this.f = (TextView) view.findViewById(R.id.search_filter_number_of_selected);
        this.h = (ImageView) view.findViewById(R.id.search_filter_loading);
        this.i = (LinearLayout) view.findViewById(R.id.search_filter_no_filter_container);
        this.g.c();
        if (this.k != null) {
            this.k.b("filter_code", this.j.i()).b("tab_code", this.j.am).a(this.F);
        }
        if (this.l != null) {
            this.l.c("filter_code", this.j.i());
            this.l.c("tab_code", this.j.am);
        }
    }

    public final void a(com.sankuai.waimai.store.search.statistics.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24734b9804bd8dea7f9d8ae45e8a4baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24734b9804bd8dea7f9d8ae45e8a4baf");
            return;
        }
        if (this.k == null) {
            this.k = new com.sankuai.waimai.store.search.statistics.f();
        }
        com.sankuai.waimai.store.search.statistics.f a2 = this.k.a();
        a2.b = fVar;
        a2.c = "b_waimai_sg_pmz43729_mv";
        a2.a("search_log_id", str).a("type", "筛选").a("recommend_word", -999);
        if (this.l == null) {
            this.l = new com.sankuai.waimai.store.search.statistics.f();
        }
        com.sankuai.waimai.store.search.statistics.f a3 = this.l.a();
        a3.b = this.k;
        a3.d = "b_waimai_sg_pbsywapj_mc";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b27afb1028a89d1a5fc7796c92d40cb", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b27afb1028a89d1a5fc7796c92d40cb");
            return;
        }
        int id = view.getId();
        if (id == R.id.search_filter_reset) {
            if (this.l != null) {
                this.l.c("choice_type", 0).c("filter_code", this.j.i()).b(this.F);
            }
            this.g.a();
        }
        if (id == R.id.search_filter_confirm_container) {
            this.g.b();
            this.j.b();
            if (this.l != null) {
                this.l.c("choice_type", 1).c("filter_code", this.j.i()).b(this.F);
            }
        }
        if (id == R.id.search_filter_mask) {
            u();
        }
        if (id == R.id.search_filter_reload) {
            this.i.setVisibility(8);
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71a35c83a1e849c8c5bfb644acbb661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71a35c83a1e849c8c5bfb644acbb661");
            return;
        }
        u();
        if (this.c != null) {
            this.c.a();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5116b8dd3135df294aa4b82edb45c1f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5116b8dd3135df294aa4b82edb45c1f6");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void a(com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79b341198b47822d84352b65c9e49b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79b341198b47822d84352b65c9e49b7");
            return;
        }
        SGSearchFilterEntity sGSearchFilterEntity = (SGSearchFilterEntity) aVar;
        if (aVar == null || com.sankuai.shangou.stone.util.a.b(sGSearchFilterEntity.filterGroups)) {
            return;
        }
        List<SearchFilterGroup> list = sGSearchFilterEntity.filterGroups;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5594d48cfe2d519152842b8ea6908c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5594d48cfe2d519152842b8ea6908c56");
        } else if (this.j.bg && this.j.K != null) {
            for (int i = 0; i < list.size(); i++) {
                SearchFilterGroup searchFilterGroup = list.get(i);
                if (searchFilterGroup != null && !TextUtils.isEmpty(searchFilterGroup.groupTitle) && "商品品牌".equals(searchFilterGroup.groupTitle)) {
                    list.remove(i);
                }
            }
        }
        d dVar = this.e;
        List<SearchFilterGroup> list2 = sGSearchFilterEntity.filterGroups;
        Object[] objArr3 = {list2};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "d49e4413dbc29839fa280d328ef150be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "d49e4413dbc29839fa280d328ef150be");
        } else {
            dVar.b.clear();
            if (list2 != null) {
                dVar.b.addAll(list2);
            }
            dVar.notifyDataSetChanged();
        }
        int i2 = sGSearchFilterEntity.globalNumberOfSelectedItems;
        Object[] objArr4 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3446aa435a5b4abc0ccd0295f3e3bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3446aa435a5b4abc0ccd0295f3e3bb7");
        } else if (i2 > 0) {
            this.f.setVisibility(0);
            this.f.setText(this.F.getResources().getString(R.string.wm_sc_nox_search_filter_number_of_selected, String.valueOf(i2)));
        } else {
            this.f.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a26e2e7e049b5e5cbbc4457fa29f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a26e2e7e049b5e5cbbc4457fa29f89");
            return;
        }
        this.h.setVisibility(0);
        if (this.h.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) this.h.getDrawable()).start();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85627c65826c6d5271e57979a7006e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85627c65826c6d5271e57979a7006e5f");
            return;
        }
        this.h.setVisibility(8);
        if (this.h.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) this.h.getDrawable()).stop();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657dfd3afeab528f6a702b640a7ea90e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657dfd3afeab528f6a702b640a7ea90e");
        } else {
            this.i.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d186f678c17cd719a2fbdab2780c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d186f678c17cd719a2fbdab2780c04");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7804451c6647323e9141deff893529d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7804451c6647323e9141deff893529d2");
            return;
        }
        super.onDetach();
        if (this.c != null) {
            this.c.c();
        }
    }
}
