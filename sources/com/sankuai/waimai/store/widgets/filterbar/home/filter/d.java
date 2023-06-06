package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.SCMaxHeightRecyclerView;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    e b;
    public LinearLayout c;
    public LinearLayout d;
    public LinearLayout e;
    public FrameLayout f;
    private c g;
    private LinearLayout h;
    private TextView i;
    private TextView j;
    private ExtendedLinearLayoutManager k;

    public d(@NonNull Context context, e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "592912a4c272ec280104b2a8e717ea1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "592912a4c272ec280104b2a8e717ea1e");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc774f5175f5bb4cef2dc3468c3d6f21", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc774f5175f5bb4cef2dc3468c3d6f21") : layoutInflater.inflate(R.layout.wm_sc_filterbar_home_filter_dropdown_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b0f2409d8636549818b378a84b0f36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b0f2409d8636549818b378a84b0f36");
            return;
        }
        super.onViewCreated();
        this.c = (LinearLayout) findView(R.id.ll_filter_dropdown_container);
        SCMaxHeightRecyclerView sCMaxHeightRecyclerView = (SCMaxHeightRecyclerView) findView(R.id.rv_filter_dropdown_list);
        sCMaxHeightRecyclerView.setNestedScrollingEnabled(false);
        sCMaxHeightRecyclerView.setMaxHeight(com.sankuai.shangou.stone.util.h.a(this.mContext, 469.0f));
        sCMaxHeightRecyclerView.setPadding(0, com.sankuai.shangou.stone.util.h.a(this.mContext, -3.0f), 0, 0);
        this.k = new ExtendedLinearLayoutManager(getContext());
        sCMaxHeightRecyclerView.setLayoutManager(this.k);
        this.g = new c(this.b);
        sCMaxHeightRecyclerView.setAdapter(this.g);
        TextView textView = (TextView) findView(R.id.tv_clear_choose);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4d1f54ae636e16d780b49e1457fb5cd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4d1f54ae636e16d780b49e1457fb5cd");
                } else if (d.this.b != null) {
                    d.this.b.b();
                }
            }
        });
        this.h = (LinearLayout) findView(R.id.ll_submit_choose);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dad8c39528993c0e35cbe63a3370506b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dad8c39528993c0e35cbe63a3370506b");
                } else if (d.this.b != null) {
                    d.this.b.a();
                }
            }
        });
        this.i = (TextView) findView(R.id.tv_submit_finish);
        this.j = (TextView) findView(R.id.tv_submit_choose_number);
        this.d = (LinearLayout) findView(R.id.ll_no_result);
        ((TextView) findView(R.id.tv_no_result_finish)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.d.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79f1b30299f2c108211889a57f628cae", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79f1b30299f2c108211889a57f628cae");
                } else if (d.this.b != null) {
                    d.this.b.c();
                }
            }
        });
        this.e = (LinearLayout) findView(R.id.ll_page_error);
        ((TextView) findView(R.id.tv_no_result_finish)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.d.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10ee04e00fbafbde55491cc6c224ff55", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10ee04e00fbafbde55491cc6c224ff55");
                } else if (d.this.b != null) {
                    d.this.b.c();
                }
            }
        });
        this.f = (FrameLayout) findView(R.id.fl_page_load);
        this.f.getLayoutParams().height = (int) (com.sankuai.shangou.stone.util.h.b(getContext()) * 0.4d);
        float a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 12.0f);
        e.a c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.white));
        c.a(0.0f, 0.0f, a2, a2);
        this.c.setBackground(c.a());
        float a3 = com.sankuai.shangou.stone.util.h.a(this.mContext, 22.5f);
        e.a c2 = new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_F5F5F6));
        e.a a4 = new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFD161), ContextCompat.getColor(this.mContext, R.color.wm_sc_common_FFBD27)});
        c2.a(a3, a3, a3, a3);
        a4.a(a3, a3, a3, a3);
        textView.setBackground(c2.a());
        this.h.setBackground(a4.a());
    }

    public final void a(List<String> list, FilterConditionResponse.FilterGroup filterGroup) {
        Object[] objArr = {list, filterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa2116937fd660908807673957a617e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa2116937fd660908807673957a617e");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(filterGroup);
        a(list, arrayList);
    }

    public final void a(List<String> list, List<FilterConditionResponse.FilterGroup> list2) {
        int i;
        String str;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d157bd1c6ddfbab1aec79435c2f34f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d157bd1c6ddfbab1aec79435c2f34f2e");
            return;
        }
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
            int i2 = 0;
            for (FilterConditionResponse.FilterGroup filterGroup : list2) {
                if (filterGroup != null && !com.sankuai.shangou.stone.util.a.b(filterGroup.favourItems)) {
                    for (FilterConditionResponse.FilterGroup.FilterItem filterItem : filterGroup.favourItems) {
                        if (filterItem != null && list.contains(filterItem.code)) {
                            i2++;
                        }
                    }
                }
            }
            i = i2;
        } else {
            i = 0;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da26ae78bc1aec14563a58c0013a882f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da26ae78bc1aec14563a58c0013a882f");
        } else {
            this.j.setVisibility(i > 0 ? 0 : 8);
            String.valueOf(i);
            this.b.d();
            this.j.setText(getContext().getString(R.string.wm_sc_selected_count, Integer.valueOf(i)));
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "904c8163e4ec93deb33a827d466675b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "904c8163e4ec93deb33a827d466675b2");
        } else {
            com.sankuai.waimai.store.widgets.filterbar.home.model.a d = this.b.d();
            if (d != null && getContext() != null) {
                int i3 = d.c;
                if (i3 != -1 && i3 != getContext().getResources().getColor(R.color.wm_sg_color_222426)) {
                    float a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 22.5f);
                    try {
                        str = String.format("#%06x", Integer.valueOf(i3));
                    } catch (Exception unused) {
                        str = "#FE4058";
                    }
                    e.a a3 = new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.sankuai.shangou.stone.util.d.a(str, getContext().getResources().getColor(R.color.wm_sg_color_FFD161)), com.sankuai.shangou.stone.util.d.a(str, getContext().getResources().getColor(R.color.wm_sc_common_FFBD27))});
                    a3.a(a2, a2, a2, a2);
                    this.h.setBackground(a3.a());
                    this.i.setTextColor(-1);
                    this.j.setTextColor(-1);
                } else {
                    this.h.setBackgroundResource(R.drawable.wm_sc_common_btn_solid_square_highlight_shape);
                    this.i.setTextColor(getContext().getResources().getColor(R.color.wm_st_common_text_title));
                    this.j.setTextColor(getContext().getResources().getColor(R.color.wm_st_common_text_title));
                }
                this.j.getLayoutParams().width = -2;
                this.j.getLayoutParams().height = -2;
                this.j.setBackground(null);
            }
        }
        b(list, list2);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291fcec8f4d7e5feaa9dd4c7759361f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291fcec8f4d7e5feaa9dd4c7759361f6");
        } else if (this.g.getItemCount() > 0) {
            this.k.a(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.util.List<java.lang.String> r25, java.util.List<com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse.FilterGroup> r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.widgets.filterbar.home.filter.d.b(java.util.List, java.util.List):void");
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00720ae8fc29cdb4579e4ab2fed2891d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00720ae8fc29cdb4579e4ab2fed2891d");
            return;
        }
        super.onDestroy();
        if (this.g == null || !this.g.b) {
            return;
        }
        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.widgets.filterbar.event.b());
    }
}
