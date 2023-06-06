package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.view.view.SGCustomPriceFilter;
import com.sankuai.waimai.store.search.model.SGSearchFilterEntity;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSearchSimpleFilterFragment extends SGBaseSearchDropFilterFragment {
    public static ChangeQuickRedirect n;
    private com.sankuai.waimai.store.search.statistics.f o;
    private com.sankuai.waimai.store.search.statistics.f p;
    private int q;
    private int r;
    private int s;
    private int t;

    public static /* synthetic */ int a(SGSearchSimpleFilterFragment sGSearchSimpleFilterFragment, int i) {
        sGSearchSimpleFilterFragment.t = 1;
        return 1;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8a027ceccced9e771e023b8d22988a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8a027ceccced9e771e023b8d22988a") : layoutInflater.inflate(R.layout.wm_sc_search_simple_filter_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment
    public final b.c l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9540543971b8cb7d2f35e1e9ff438f69", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9540543971b8cb7d2f35e1e9ff438f69");
        }
        this.g = new g(this, this.F);
        return this.g;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7596a2c1204e7314e67a5c762b12fcd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7596a2c1204e7314e67a5c762b12fcd0");
        } else if (this.o != null) {
            this.o.b("filter_code", this.f.d(this.e)).a(this.F);
        }
    }

    public final void a(SearchFilterGroup searchFilterGroup, com.sankuai.waimai.store.search.statistics.f fVar, String str) {
        Object[] objArr = {searchFilterGroup, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc6552fe82d4b7541957eb5099cc3612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc6552fe82d4b7541957eb5099cc3612");
        } else if (searchFilterGroup != null) {
            this.e = searchFilterGroup.groupTitle;
            SGSearchFilterEntity sGSearchFilterEntity = new SGSearchFilterEntity();
            sGSearchFilterEntity.filterGroups = new ArrayList();
            sGSearchFilterEntity.filterGroups.add(searchFilterGroup);
            this.d = sGSearchFilterEntity;
            if (this.o == null) {
                this.o = new com.sankuai.waimai.store.search.statistics.f();
            }
            com.sankuai.waimai.store.search.statistics.f a = this.o.a();
            a.b = fVar;
            a.c = "b_waimai_sg_pmz43729_mv";
            a.a("search_log_id", str).a("type", this.e).a("recommend_word", -999);
            if (this.p == null) {
                this.p = new com.sankuai.waimai.store.search.statistics.f();
            }
            com.sankuai.waimai.store.search.statistics.f a2 = this.p.a();
            a2.b = this.o;
            a2.d = "b_waimai_sg_pbsywapj_mc";
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8189e3b7944eaeb6f5240bbe19ddbeaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8189e3b7944eaeb6f5240bbe19ddbeaf");
            return;
        }
        if (this.p != null) {
            this.p.c("choice_type", 0).c("filter_code", this.f.d(this.e)).b(this.F);
        }
        this.h.b();
        this.h.a();
        this.t = 0;
        this.g.a();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3278734a01450fcec7e9d59e29576a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3278734a01450fcec7e9d59e29576a");
            return;
        }
        this.g.b();
        this.f.b();
        this.h.a();
        if (this.p != null) {
            this.p.c("choice_type", 1).c("filter_code", this.f.d(this.e)).c("slidedone", Integer.valueOf(this.t)).b(this.F);
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29380ffcd1c959367b436f5932b8a18f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29380ffcd1c959367b436f5932b8a18f");
        } else {
            this.h.a();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void a(com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a aVar) {
        int dimensionPixelSize;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090966f68c9fd50f5ab126d7e4c23272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090966f68c9fd50f5ab126d7e4c23272");
            return;
        }
        SGSearchFilterEntity sGSearchFilterEntity = (SGSearchFilterEntity) aVar;
        Object[] objArr2 = {sGSearchFilterEntity};
        ChangeQuickRedirect changeQuickRedirect2 = n;
        SearchFilterGroup searchFilterGroup = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5aaad844c63c62e9f9c1b729d0255b4", RobustBitConfig.DEFAULT_VALUE)) {
            searchFilterGroup = (SearchFilterGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5aaad844c63c62e9f9c1b729d0255b4");
        } else if (sGSearchFilterEntity != null && !com.sankuai.shangou.stone.util.a.b(sGSearchFilterEntity.filterGroups)) {
            Iterator<SearchFilterGroup> it = sGSearchFilterEntity.filterGroups.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SearchFilterGroup next = it.next();
                if (next != null) {
                    searchFilterGroup = next;
                    break;
                }
            }
        }
        SearchFilterGroup searchFilterGroup2 = searchFilterGroup;
        if (searchFilterGroup2 == null || (com.sankuai.shangou.stone.util.a.a((List) searchFilterGroup2.filterItems) <= 1 && searchFilterGroup2.slideFilter == null)) {
            this.h.setVisibility(8);
            j();
            return;
        }
        Object[] objArr3 = {searchFilterGroup2};
        ChangeQuickRedirect changeQuickRedirect3 = n;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4bb6864e5a1db7ba6c25eb93db43ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4bb6864e5a1db7ba6c25eb93db43ff6");
        } else if (searchFilterGroup2.slideFilter == null) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.setEditTextBackgroundResource(R.drawable.wm_sc_search_custom_price_filter_background);
            ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (com.sankuai.shangou.stone.util.a.b(searchFilterGroup2.filterItems)) {
                    dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_20);
                } else {
                    dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.h.setLayoutParams(layoutParams);
            }
            this.h.setOnPriceChangeListener(new SGCustomPriceFilter.a() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSimpleFilterFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.SGCustomPriceFilter.a
                public final void a(int i, int i2) {
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "57c23828af599873d7f6e597dd05e649", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "57c23828af599873d7f6e597dd05e649");
                        return;
                    }
                    SGSearchSimpleFilterFragment.a(SGSearchSimpleFilterFragment.this, 1);
                    SGSearchSimpleFilterFragment.this.g.a(i, i2);
                }
            });
            this.q = -1;
            this.r = -1;
            int[] a = this.g.a(searchFilterGroup2);
            if (a != null && a.length >= 3) {
                this.q = a[0];
                this.r = a[1];
                this.s = a[2];
                if (this.f.O == 1) {
                    this.q = -1;
                } else if (this.f.O == 2) {
                    this.r = -1;
                }
            }
        }
        int i = searchFilterGroup2.localNumberOfSelectedItems;
        Object[] objArr4 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = SGBaseSearchDropFilterFragment.a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3ba6415d51aa1e198a4c22567fd634f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3ba6415d51aa1e198a4c22567fd634f0");
        } else if (i == 0) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            this.j.setText(this.F.getResources().getString(R.string.wm_sc_nox_search_filter_number_of_selected, String.valueOf(i)));
        }
        if (com.sankuai.shangou.stone.util.a.a((List) searchFilterGroup2.filterItems) == 1) {
            searchFilterGroup2.filterItems.clear();
        }
        this.i.setVisibility(com.sankuai.shangou.stone.util.a.b(searchFilterGroup2.filterItems) ? 8 : 0);
        this.k.a(searchFilterGroup2.filterItems);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a7062bdd93e616fade62f2b2d77db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a7062bdd93e616fade62f2b2d77db3");
            return;
        }
        super.onResume();
        if (this.q == -1 && this.r == -1) {
            return;
        }
        a(this.q, this.r);
        this.t = this.s;
        this.r = -1;
        this.q = -1;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment, com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf4cdb1123c72b01991c9e8a354b163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf4cdb1123c72b01991c9e8a354b163");
            return;
        }
        this.t = 0;
        this.h.setMaxPrice(i2);
        this.h.setMinPrice(i);
        this.h.a();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment, com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    @Nullable
    public final int[] g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc7136ea041afe04ff48b14b91f2f39c", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc7136ea041afe04ff48b14b91f2f39c") : new int[]{this.h.getMinPrice(), this.h.getMaxPrice()};
    }
}
