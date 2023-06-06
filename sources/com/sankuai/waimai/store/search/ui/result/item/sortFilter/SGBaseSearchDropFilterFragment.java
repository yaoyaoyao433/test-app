package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.view.view.SGCustomPriceFilter;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGBaseSearchDropFilterFragment extends SGBaseSortFilterFragment implements View.OnClickListener, b.f {
    public static ChangeQuickRedirect a;
    protected a c;
    protected com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a d;
    protected String e;
    protected SearchShareData f;
    protected b.c g;
    protected SGCustomPriceFilter h;
    protected RecyclerView i;
    TextView j;
    protected f k;
    public int l;
    private final int n;
    private TextView o;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.search.ui.result.item.sortFilter.a {
        void a();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public void a(int i, int i2) {
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    @Nullable
    public int[] g() {
        return null;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void h() {
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void i() {
    }

    public abstract void k();

    public abstract b.c l();

    public abstract void m();

    public abstract void s();

    public abstract void t();

    public SGBaseSearchDropFilterFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa05d28994312b5c72d9622bf884d621", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa05d28994312b5c72d9622bf884d621");
            return;
        }
        this.n = 4;
        this.l = -1;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91cf4b90ae3916cc7a13906abf7cb49", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91cf4b90ae3916cc7a13906abf7cb49") : layoutInflater.inflate(R.layout.wm_sc_search_simple_filter_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d71e461e19b1f4c34189a9b7a374a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d71e461e19b1f4c34189a9b7a374a3");
            return;
        }
        super.onViewCreated(view, bundle);
        this.g = l();
        this.f = SearchShareData.a((Context) this.F);
        k();
        this.h = (SGCustomPriceFilter) view.findViewById(R.id.sg_custom_price_filter);
        View findViewById = view.findViewById(R.id.top_view);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.l != -1) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.l;
            findViewById.setLayoutParams(layoutParams);
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "108dbd5afba9d63b3574208d1d41745c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "108dbd5afba9d63b3574208d1d41745c");
        } else {
            this.i = (RecyclerView) view.findViewById(R.id.search_simple_filter_list);
            this.k = new f(this.g, this.f);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.F, 4);
            this.i.setAdapter(this.k);
            this.i.setLayoutManager(gridLayoutManager);
            this.i.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.f
                public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                    Object[] objArr3 = {rect, view2, recyclerView, state};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d0aaf37dada7b481e7d68a9b92d033d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d0aaf37dada7b481e7d68a9b92d033d2");
                        return;
                    }
                    super.getItemOffsets(rect, view2, recyclerView, state);
                    if (recyclerView.getChildAdapterPosition(view2) >= 4) {
                        rect.top = SGBaseSearchDropFilterFragment.this.F.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
                    }
                    rect.left = SGBaseSearchDropFilterFragment.this.F.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
                    rect.right = SGBaseSearchDropFilterFragment.this.F.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2);
                }
            });
        }
        view.findViewById(R.id.search_simple_filter_reset).setOnClickListener(this);
        view.findViewById(R.id.search_simple_filter_confirm_container).setOnClickListener(this);
        view.findViewById(R.id.search_simple_filter_mask).setOnClickListener(this);
        view.findViewById(R.id.search_simple_filter_top_mask).setOnClickListener(this);
        this.j = (TextView) view.findViewById(R.id.search_simple_filter_number_of_selected);
        this.o = (TextView) view.findViewById(R.id.search_simple_filter_no_filter_item);
        this.g.a(this.d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4141d11912609d65a9c5a5e0bd112661", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4141d11912609d65a9c5a5e0bd112661");
            return;
        }
        int id = view.getId();
        if (id == R.id.search_simple_filter_reset) {
            m();
        } else if (id == R.id.search_simple_filter_confirm_container) {
            s();
        } else if (id == R.id.search_simple_filter_mask || id == R.id.search_simple_filter_top_mask) {
            u();
            t();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc33297467c92d897f5ef59b5274a2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc33297467c92d897f5ef59b5274a2ec");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12b402f131a974152f969208d3dd324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12b402f131a974152f969208d3dd324");
        } else {
            u();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.f
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6a910355aaad5ba1a6a7e154b71a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6a910355aaad5ba1a6a7e154b71a2a");
        } else {
            this.o.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a57b49389a8835163b8395bf9fca52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a57b49389a8835163b8395bf9fca52");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c46c15994421a8941fce7a1aae5853f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c46c15994421a8941fce7a1aae5853f");
            return;
        }
        super.onDetach();
        if (this.c != null) {
            this.c.c();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baef61efe91f1462fbaae68872a24c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baef61efe91f1462fbaae68872a24c2d");
        } else {
            super.onResume();
        }
    }

    public final void a(a aVar) {
        this.c = aVar;
    }
}
