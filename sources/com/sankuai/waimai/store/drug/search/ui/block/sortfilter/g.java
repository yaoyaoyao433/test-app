package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.drug.search.ui.block.sortfilter.DrugSearchSortFragment;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.SortItemInfo;
import com.sankuai.waimai.store.search.model.TabStyleSortFilterEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public SearchShareData b;
    DrugSearchSortFragment c;
    com.sankuai.waimai.store.search.statistics.f d;
    public LinearLayout e;
    public LinearLayout f;
    public com.sankuai.waimai.store.drug.search.ui.block.sortfilter.a g;
    private LinearLayout h;

    public static /* synthetic */ void a(g gVar, Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "a58eca2772ad28b45aeadda039800e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "a58eca2772ad28b45aeadda039800e53");
        } else if (gVar.mContext instanceof FragmentActivity) {
            ((FragmentActivity) gVar.mContext).getSupportFragmentManager().beginTransaction().replace(R.id.sort_filter_mask_container, fragment).commitAllowingStateLoss();
        }
    }

    public static /* synthetic */ void a(g gVar, SortItemInfo sortItemInfo) {
        Object[] objArr = {sortItemInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "8a66295cc83b95cae356561c033d32cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "8a66295cc83b95cae356561c033d32cb");
            return;
        }
        if (sortItemInfo.hasReverseCode()) {
            if (gVar.b.M == sortItemInfo.code) {
                gVar.a("价格高到低");
                gVar.b.M = sortItemInfo.reverseCode;
            } else {
                gVar.a("价格低到高");
                gVar.b.M = sortItemInfo.code;
            }
        } else if (gVar.b.M == sortItemInfo.code) {
            return;
        } else {
            gVar.a(sortItemInfo.name);
            gVar.b.M = sortItemInfo.code;
        }
        SearchShareData searchShareData = gVar.b;
        f.b bVar = new f.b(7);
        bVar.h = true;
        searchShareData.a(bVar);
    }

    public g(@NonNull Context context, com.sankuai.waimai.store.search.statistics.f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a0de2d16f13a626771c3be130a73e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a0de2d16f13a626771c3be130a73e4");
            return;
        }
        this.b = SearchShareData.a(context);
        this.d = fVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a9878ff790b37d52d9e4d7d14931f6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a9878ff790b37d52d9e4d7d14931f6") : layoutInflater.inflate(R.layout.wm_drug_search_sort_filter_v3_style, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447ba0da3a315dbde04d935fa43df1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447ba0da3a315dbde04d935fa43df1ce");
            return;
        }
        this.e = (LinearLayout) findView(R.id.complex_sort_filter_container);
        this.h = (LinearLayout) findView(R.id.sort_container);
        this.f = (LinearLayout) findView(R.id.all_filter_container);
        this.g = new com.sankuai.waimai.store.drug.search.ui.block.sortfilter.a(this.mContext, this.b, this.d);
    }

    public void a(@NonNull TabStyleSortFilterEntity tabStyleSortFilterEntity) {
        char c = 1;
        char c2 = 0;
        Object[] objArr = {tabStyleSortFilterEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17973a512c02ee75868cfb5bd539d561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17973a512c02ee75868cfb5bd539d561");
        } else if (com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity.sortListButton)) {
        } else {
            this.h.removeAllViews();
            int i = 0;
            while (i < tabStyleSortFilterEntity.sortListButton.size()) {
                final SortItemInfo sortItemInfo = (SortItemInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) tabStyleSortFilterEntity.sortListButton, i);
                if (sortItemInfo != null) {
                    f fVar = new f(this.mContext);
                    fVar.setText(sortItemInfo.name);
                    String str = sortItemInfo.name;
                    boolean z = tabStyleSortFilterEntity.isExpose;
                    Object[] objArr2 = new Object[2];
                    objArr2[c2] = str;
                    objArr2[c] = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9aa0b9e91a07e7dfa4bed7a50f6c881", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9aa0b9e91a07e7dfa4bed7a50f6c881");
                    } else if (!z) {
                        Map<String, Object> a2 = a();
                        a2.put("type", str);
                        com.sankuai.waimai.store.manager.judas.b.b(this.mContext, "b_waimai_med_xzszx8qn_mv").b(a2).a();
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (i != 0) {
                        marginLayoutParams.leftMargin = h.a(this.mContext, 28.0f);
                    }
                    this.h.addView(fVar, marginLayoutParams);
                    if (sortItemInfo.hasReverseCode()) {
                        if (sortItemInfo.code == this.b.M) {
                            fVar.setHighlight(true);
                            fVar.setTextStyle(true);
                            fVar.a(com.sankuai.waimai.store.drug.search.ui.block.sortfilter.b.TWO_DOWN_GREY);
                        } else if (sortItemInfo.reverseCode == this.b.M) {
                            fVar.setHighlight(true);
                            fVar.setTextStyle(true);
                            fVar.a(com.sankuai.waimai.store.drug.search.ui.block.sortfilter.b.TWO_UP_GREY);
                        } else {
                            fVar.setHighlight(false);
                            fVar.setTextStyle(false);
                            fVar.a(com.sankuai.waimai.store.drug.search.ui.block.sortfilter.b.TWO_GREY);
                        }
                    } else {
                        fVar.a(com.sankuai.waimai.store.drug.search.ui.block.sortfilter.b.NO_ARROW);
                        if (sortItemInfo.code == this.b.M) {
                            fVar.setHighlight(true);
                            fVar.setTextStyle(true);
                        } else {
                            fVar.setHighlight(false);
                            fVar.setTextStyle(false);
                            fVar.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.g.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77f2973e138713a1368224c2daa0f0fd", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77f2973e138713a1368224c2daa0f0fd");
                                    } else {
                                        g.a(g.this, sortItemInfo);
                                    }
                                }
                            });
                        }
                    }
                    fVar.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.g.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77f2973e138713a1368224c2daa0f0fd", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77f2973e138713a1368224c2daa0f0fd");
                            } else {
                                g.a(g.this, sortItemInfo);
                            }
                        }
                    });
                }
                i++;
                c = 1;
                c2 = 0;
            }
        }
    }

    public void a(@NonNull final List<SortItemInfo> list, SortItemInfo sortItemInfo, boolean z, final int i) {
        String str;
        Object[] objArr = {list, sortItemInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b1c26dc657eb98decf2d06e97830369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b1c26dc657eb98decf2d06e97830369");
            return;
        }
        final f b2 = b();
        b2.setClickChangeText(!z ? 1 : 0);
        if (sortItemInfo == null) {
            if (z) {
                str = "价格";
            } else {
                str = com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0) == null ? "" : ((SortItemInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0)).name;
            }
            b2.setText(str);
            b2.setHighlight(false);
            b2.setTextStyle(false);
            b2.a(com.sankuai.waimai.store.drug.search.ui.block.sortfilter.b.ONE_GERY_DOWN);
        } else {
            b2.setText(z ? "价格" : sortItemInfo.name);
            b2.setHighlight(true);
            b2.setTextStyle(true);
            b2.a(com.sankuai.waimai.store.drug.search.ui.block.sortfilter.b.ONE_ORANGE_DOWN);
        }
        b2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.ui.block.sortfilter.g.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d66dfe8339e787d4f944de1b0ccdacbd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d66dfe8339e787d4f944de1b0ccdacbd");
                } else {
                    g.this.b.a(new f.e(i, new b(b2, list, g.this.d, g.this.b.q)));
                }
            }
        });
    }

    private f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe17d326c82a78da00b421b2bf3979dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe17d326c82a78da00b421b2bf3979dc");
        }
        f fVar = new f(this.mContext);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = h.a(this.mContext, 28.0f);
        fVar.setLayoutParams(marginLayoutParams);
        this.e.addView(fVar);
        return fVar;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "622271d2d3c956492cb3c69a650d5b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "622271d2d3c956492cb3c69a650d5b0c");
            return;
        }
        Map<String, Object> a2 = a();
        a2.put("type", str);
        com.sankuai.waimai.store.manager.judas.b.a(this.mContext, "b_waimai_med_xzszx8qn_mc").b(a2).a();
    }

    Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744fedee23dab3930cf1fd42b9237d0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744fedee23dab3930cf1fd42b9237d0c");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Integer.valueOf(this.b.z));
        hashMap.put("keyword", this.b.h);
        hashMap.put("template_type", Integer.valueOf(this.b.D));
        hashMap.put("search_log_id", this.b.q);
        hashMap.put("area_index", 2);
        hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(this.b));
        hashMap.put("tab_code", this.b.am);
        hashMap.put("if_med_poi", 0);
        hashMap.put("sec_cat_id", Integer.valueOf(this.b.C > 0 ? this.b.C : this.b.B));
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b implements Runnable {
        public static ChangeQuickRedirect a;
        private List<SortItemInfo> c;
        private com.sankuai.waimai.store.search.statistics.f d;
        private String e;
        private f f;

        public b(@NonNull f fVar, List<SortItemInfo> list, com.sankuai.waimai.store.search.statistics.f fVar2, String str) {
            Object[] objArr = {g.this, fVar, list, fVar2, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1046d97d47b0c8c9ce07759d1ae0d04e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1046d97d47b0c8c9ce07759d1ae0d04e");
                return;
            }
            this.c = list;
            this.d = fVar2;
            this.e = str;
            this.f = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24582423782aee434740e883aea589a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24582423782aee434740e883aea589a8");
            } else if (this.f.d && g.this.c != null) {
                g.this.c.u();
            } else {
                g.this.c = new DrugSearchSortFragment();
                g.this.c.d = new a(this.f, g.this.a());
                DrugSearchSortFragment drugSearchSortFragment = g.this.c;
                List<SortItemInfo> list = this.c;
                com.sankuai.waimai.store.search.statistics.f fVar = this.d;
                String str = this.e;
                drugSearchSortFragment.c = list;
                g.a(g.this, g.this.c);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements DrugSearchSortFragment.a {
        public static ChangeQuickRedirect a;
        public Map<String, Object> b;
        public f c;

        public a(f fVar, Map<String, Object> map) {
            Object[] objArr = {g.this, fVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7bdbdeec227be10065d5d8ba718129a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7bdbdeec227be10065d5d8ba718129a");
                return;
            }
            this.b = map;
            this.c = fVar;
        }

        @Override // com.sankuai.waimai.store.drug.search.ui.block.sortfilter.DrugSearchSortFragment.a
        public final void a(@NonNull SortItemInfo sortItemInfo) {
            Object[] objArr = {sortItemInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5058841ee085244f06c2f21db9bd62b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5058841ee085244f06c2f21db9bd62b5");
            } else if (sortItemInfo == null) {
            } else {
                if (g.this.b.M == sortItemInfo.code) {
                    g.this.c.u();
                    return;
                }
                g.this.b.M = sortItemInfo.code;
                g.this.c.u();
                if (this.c.getClickChangeText()) {
                    this.c.setText(sortItemInfo.name);
                }
                SearchShareData searchShareData = g.this.b;
                f.b bVar = new f.b(7);
                bVar.h = true;
                searchShareData.a(bVar);
            }
        }

        @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec6aa1f1d08a3936fbd4b7647d89543", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec6aa1f1d08a3936fbd4b7647d89543");
                return;
            }
            this.c.setOpenStatus(true);
            this.c.a(f.c);
            g.this.b.a(true);
        }

        @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef8136e6992b7ac579454de630d46bdc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef8136e6992b7ac579454de630d46bdc");
                return;
            }
            this.c.setOpenStatus(false);
            this.c.a(f.b);
            g.this.b.a(false);
        }
    }
}
