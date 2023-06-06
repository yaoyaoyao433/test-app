package com.sankuai.waimai.store.search.template.filterbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.common.view.SortFilterTextView;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.SGSearchSortFilterEntity;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.model.SortItemInfo;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchFilterFragment;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSimpleFilterFragment;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSortFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<SGSearchSortFilterEntity, C1304a> {
    public static ChangeQuickRedirect a;
    @NonNull
    SearchShareData b;
    SGSearchSortFragment c;
    final LongSparseArray<SGSearchSimpleFilterFragment> d;
    SGSearchFilterFragment e;
    f f;
    String g;
    SGSearchSortFilterEntity h;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1304a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c77918cc5531ffd3004d721820c579", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1304a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c77918cc5531ffd3004d721820c579");
        }
        com.sankuai.waimai.store.view.f fVar = new com.sankuai.waimai.store.view.f(this.k);
        fVar.setUpwardSticky(true);
        fVar.setDownwardSticky(false);
        fVar.setLayoutParams(new RecyclerView.g(-1, -2));
        layoutInflater.inflate(R.layout.wm_sc_search_sort_filter_layout, (ViewGroup) fVar, true);
        return new C1304a(fVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SGSearchSortFilterEntity sGSearchSortFilterEntity, @NonNull C1304a c1304a, int i) {
        boolean z;
        final SGSearchSortFilterEntity sGSearchSortFilterEntity2 = sGSearchSortFilterEntity;
        final C1304a c1304a2 = c1304a;
        Object[] objArr = {sGSearchSortFilterEntity2, c1304a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e522595bfe17ab7034b19b66c2f363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e522595bfe17ab7034b19b66c2f363");
            return;
        }
        Object[] objArr2 = {sGSearchSortFilterEntity2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = C1304a.a;
        if (PatchProxy.isSupport(objArr2, c1304a2, changeQuickRedirect2, false, "29e06cbaf6264f521702d4bd616e6635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1304a2, changeQuickRedirect2, false, "29e06cbaf6264f521702d4bd616e6635");
            z = true;
        } else {
            a.this.h = sGSearchSortFilterEntity2;
            z = true;
            Object[] objArr3 = {sGSearchSortFilterEntity2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = C1304a.a;
            if (PatchProxy.isSupport(objArr3, c1304a2, changeQuickRedirect3, false, "f62ad4a145c0b64a2065b9d304ffdda4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, c1304a2, changeQuickRedirect3, false, "f62ad4a145c0b64a2065b9d304ffdda4");
            } else {
                SortItemInfo selectItem = SGSearchSortFilterEntity.getSelectItem(sGSearchSortFilterEntity2.sortList, a.this.b.M);
                if (selectItem == null) {
                    c1304a2.b.setHighlight(false);
                    SortItemInfo sortItemInfo = (SortItemInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) sGSearchSortFilterEntity2.sortList, 0);
                    if (sortItemInfo != null) {
                        c1304a2.b.setText(sortItemInfo.name);
                    }
                } else {
                    c1304a2.b.setHighlight(true);
                    c1304a2.b.setText(selectItem.name);
                }
                final SGSearchSortFragment.a aVar = new SGSearchSortFragment.a() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchSortFragment.a
                    public final void a(@NonNull SortItemInfo sortItemInfo2) {
                        Object[] objArr4 = {sortItemInfo2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26e640cd25109004a95e60a0b7ab2a99", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26e640cd25109004a95e60a0b7ab2a99");
                            return;
                        }
                        a.this.c.u();
                        if (a.this.b.M == sortItemInfo2.code) {
                            return;
                        }
                        a.this.b.M = sortItemInfo2.code;
                        C1304a.this.b.setText(sortItemInfo2.name);
                        SearchShareData searchShareData = a.this.l;
                        f.b bVar = new f.b(7);
                        bVar.h = true;
                        searchShareData.a(bVar);
                    }

                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a468b213dbe78abaaedcc8cac0192a45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a468b213dbe78abaaedcc8cac0192a45");
                            return;
                        }
                        C1304a.this.b.a(true, 0);
                        a.this.b.a(true);
                    }

                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                    public final void c() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f524c6b2d943e90a0ff8b9ab7bc58cb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f524c6b2d943e90a0ff8b9ab7bc58cb");
                            return;
                        }
                        C1304a.this.b.a(false, 0);
                        a.this.b.a(false);
                    }
                };
                if (a.this.c != null) {
                    a.this.c.e = aVar;
                }
                c1304a2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d94d1e04ebcfb265629b63b2781efc14", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d94d1e04ebcfb265629b63b2781efc14");
                        } else {
                            new Runnable() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.4.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "736dbdeeb2e21de3046be419ce93b9fb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "736dbdeeb2e21de3046be419ce93b9fb");
                                        return;
                                    }
                                    com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_FLgH0").b(C1304a.this.a(a.this.k.getString(R.string.wm_sc_search_sort_statistic_key), 1)).a();
                                    if (C1304a.this.b.b) {
                                        if (a.this.c != null) {
                                            a.this.c.u();
                                            return;
                                        }
                                        return;
                                    }
                                    if (a.this.c == null) {
                                        a.this.c = new SGSearchSortFragment();
                                        a.this.c.e = aVar;
                                    }
                                    Rect rect = new Rect();
                                    C1304a.this.b.getGlobalVisibleRect(rect);
                                    a.this.c.g = (rect.bottom - h.a(a.this.k, 45.0f)) - h.a(a.this.k, 18.0f);
                                    a.this.c.f = ((int) (C1304a.this.b.getMeasureTextWidth() / 2.0f)) - h.a(a.this.k, 2.0f);
                                    SGSearchSortFragment sGSearchSortFragment = a.this.c;
                                    List<SortItemInfo> list = sGSearchSortFilterEntity2.sortList;
                                    com.sankuai.waimai.store.search.statistics.f fVar = a.this.f;
                                    String str = a.this.g;
                                    Object[] objArr6 = {list, fVar, str};
                                    ChangeQuickRedirect changeQuickRedirect6 = SGSearchSortFragment.a;
                                    if (PatchProxy.isSupport(objArr6, sGSearchSortFragment, changeQuickRedirect6, false, "b566284db988f342c09d7887de40f0a9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, sGSearchSortFragment, changeQuickRedirect6, false, "b566284db988f342c09d7887de40f0a9");
                                    } else {
                                        sGSearchSortFragment.c = list;
                                        if (sGSearchSortFragment.d == null) {
                                            sGSearchSortFragment.d = new com.sankuai.waimai.store.search.statistics.f();
                                        }
                                        com.sankuai.waimai.store.search.statistics.f a2 = sGSearchSortFragment.d.a();
                                        a2.b = fVar;
                                        a2.c = "b_waimai_sg_pmz43729_mv";
                                        a2.b("search_log_id", str).b("type", "排序").b("recommend_word", -999);
                                    }
                                    C1304a.a(C1304a.this, a.this.c);
                                }
                            }.run();
                        }
                    }
                });
                if (!sGSearchSortFilterEntity2.isExpose) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.k, "b_KnLVX").b(c1304a2.a(a.this.k.getString(R.string.wm_sc_search_sort_statistic_key), 1)).a();
                }
            }
            c1304a2.a(sGSearchSortFilterEntity2.filterList, i, sGSearchSortFilterEntity2.isExpose);
            c1304a2.b(sGSearchSortFilterEntity2.getSortListButton(), i, sGSearchSortFilterEntity2.isExpose);
            Object[] objArr4 = {sGSearchSortFilterEntity2};
            ChangeQuickRedirect changeQuickRedirect4 = C1304a.a;
            if (PatchProxy.isSupport(objArr4, c1304a2, changeQuickRedirect4, false, "8ab0dc375c15efb24e6ec032946c9270", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, c1304a2, changeQuickRedirect4, false, "8ab0dc375c15efb24e6ec032946c9270");
            } else {
                if (sGSearchSortFilterEntity2.searchSwitchMode == 100) {
                    u.a(c1304a2.e, a.this.k.getString(R.string.wm_sc_nox_search_filter_bar_product_mode_poi_switch));
                } else if (sGSearchSortFilterEntity2.searchSwitchMode == 200) {
                    u.a(c1304a2.e, a.this.k.getString(R.string.wm_sc_nox_search_filter_bar_product_mode_product_switch));
                } else {
                    u.a(c1304a2.e, (CharSequence) null);
                }
                c1304a2.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1d2facdb3cb538a532b54b21df07ca57", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1d2facdb3cb538a532b54b21df07ca57");
                            return;
                        }
                        SearchShareData searchShareData = a.this.l;
                        f.b bVar = new f.b(11);
                        bVar.g = sGSearchSortFilterEntity2.searchSwitchMode;
                        bVar.i = true;
                        searchShareData.a(bVar);
                        com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_waimai_7d43r4wm_mc").b(C1304a.this.a(sGSearchSortFilterEntity2)).a();
                    }
                });
                if (!sGSearchSortFilterEntity2.isExpose && c1304a2.e.getVisibility() == 0) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.k, "b_waimai_7d43r4wm_mv").b(c1304a2.a(sGSearchSortFilterEntity2)).a();
                }
            }
            Object[] objArr5 = {sGSearchSortFilterEntity2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect5 = C1304a.a;
            if (PatchProxy.isSupport(objArr5, c1304a2, changeQuickRedirect5, false, "8ae50c968c52e33fe4cad44f78f4862c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, c1304a2, changeQuickRedirect5, false, "8ae50c968c52e33fe4cad44f78f4862c");
            } else {
                int j = a.this.l.j();
                c1304a2.f.a(c1304a2.f.b, j);
                c1304a2.f.setHighlight(j > 0);
                c1304a2.f.setOnClickListener(new C1304a.AnonymousClass1());
                if (!sGSearchSortFilterEntity2.isExpose) {
                    com.sankuai.waimai.store.manager.judas.b.b(a.this.k, "b_KnLVX").b(c1304a2.a(c1304a2.f.getText(), 0)).a();
                }
            }
        }
        sGSearchSortFilterEntity2.isExpose = z;
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SGSearchSortFilterEntity sGSearchSortFilterEntity, @NonNull com.sankuai.waimai.store.search.statistics.f fVar) {
        SGSearchSortFilterEntity sGSearchSortFilterEntity2 = sGSearchSortFilterEntity;
        Object[] objArr = {sGSearchSortFilterEntity2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfaeaf329aa8cc06e05f31dd347af2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfaeaf329aa8cc06e05f31dd347af2fd");
            return;
        }
        this.f = fVar;
        this.g = this.l.b(sGSearchSortFilterEntity2);
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a822014809b7a0abd71237d9b723530c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a822014809b7a0abd71237d9b723530c");
            return;
        }
        this.d = new LongSparseArray<>();
        this.b = SearchShareData.a(context);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811f809cc02ff9dd0d4934c55b7e2f0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811f809cc02ff9dd0d4934c55b7e2f0e")).booleanValue() : str.equals("wm_shangou_search_sort_filter_bar");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.filterbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1304a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public SortFilterTextView b;
        public LinearLayout c;
        public LinearLayout d;
        public TextView e;
        public SortFilterTextView f;

        public static /* synthetic */ void a(C1304a c1304a, Fragment fragment) {
            Object[] objArr = {fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, c1304a, changeQuickRedirect, false, "23f7f4927480a5d9fd9dd6f5ef665381", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, c1304a, changeQuickRedirect, false, "23f7f4927480a5d9fd9dd6f5ef665381");
            } else if (a.this.k instanceof FragmentActivity) {
                ((FragmentActivity) a.this.k).getSupportFragmentManager().beginTransaction().replace(R.id.sort_filter_mask_container, fragment).commitAllowingStateLoss();
            }
        }

        public C1304a(View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa323a375577f823bc6be52d09412e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa323a375577f823bc6be52d09412e5");
                return;
            }
            view.findViewById(R.id.rl_search_sort_filter_container).setClickable(true);
            this.b = (SortFilterTextView) view.findViewById(R.id.tv_search_sort_button);
            this.c = (LinearLayout) view.findViewById(R.id.ll_search_quick_filter_container);
            this.d = (LinearLayout) view.findViewById(R.id.ll_search_quick_sort_container);
            this.e = (TextView) view.findViewById(R.id.tv_search_mode_button);
            this.f = (SortFilterTextView) view.findViewById(R.id.tv_search_filter_button);
            this.b.setHighlight(true);
            this.b.setMaxLength(98);
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.search.template.filterbar.a$a$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public static ChangeQuickRedirect a;

            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a086c814efb5568b0df1829fd58f5250", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a086c814efb5568b0df1829fd58f5250");
                } else {
                    new Runnable() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7567a8900d01b643140cade5d8af748c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7567a8900d01b643140cade5d8af748c");
                                return;
                            }
                            com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_FLgH0").b(C1304a.this.a(C1304a.this.f.getText(), 0)).a();
                            if (C1304a.this.f.b) {
                                if (a.this.e != null) {
                                    a.this.e.u();
                                    return;
                                }
                                return;
                            }
                            if (a.this.e == null) {
                                a.this.e = new SGSearchFilterFragment();
                                a.this.e.c = new SGSearchFilterFragment.a() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.1.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGSearchFilterFragment.a
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab6ca55c44e8a6eb9f2a3ca5ef704751", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab6ca55c44e8a6eb9f2a3ca5ef704751");
                                            return;
                                        }
                                        SearchShareData searchShareData = a.this.l;
                                        f.b bVar = new f.b(7);
                                        bVar.h = true;
                                        searchShareData.a(bVar);
                                    }

                                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                                    public final void b() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6221128142d0646972378a13be8703e0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6221128142d0646972378a13be8703e0");
                                        } else {
                                            C1304a.this.f.a(true, a.this.l.j());
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                                    public final void c() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c205c458b8d166bdabe8dff042ca0a98", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c205c458b8d166bdabe8dff042ca0a98");
                                            return;
                                        }
                                        int j = a.this.l.j();
                                        C1304a.this.f.a(false, j);
                                        C1304a.this.f.setHighlight(j > 0);
                                    }
                                };
                            }
                            a.this.e.a(a.this.f, a.this.g);
                            C1304a.a(C1304a.this, a.this.e);
                        }
                    }.run();
                }
            }
        }

        Map<String, Object> a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8a43a0e45ff8d9f0f9774d84c86bf5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8a43a0e45ff8d9f0f9774d84c86bf5");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Integer.valueOf(a.this.b.z));
            hashMap.put("keyword", a.this.b.h);
            hashMap.put("template_type", Integer.valueOf(a.this.b.D));
            hashMap.put("search_log_id", a.this.b.b(a.this.h));
            hashMap.put("stid", g.f(a.this.b));
            hashMap.put("type", str);
            hashMap.put("show_type", Integer.valueOf(i));
            return hashMap;
        }

        Map<String, Object> a(@NonNull SGSearchSortFilterEntity sGSearchSortFilterEntity) {
            Object[] objArr = {sGSearchSortFilterEntity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8414c6af5746af791da90e5ad0447553", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8414c6af5746af791da90e5ad0447553");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Integer.valueOf(a.this.b.z));
            hashMap.put("keyword", a.this.b.h);
            hashMap.put("template_type", Integer.valueOf(a.this.b.D));
            hashMap.put("choice_type", Integer.valueOf(sGSearchSortFilterEntity.searchSwitchMode));
            hashMap.put("search_log_id", a.this.b.q);
            hashMap.put("stid", g.f(a.this.b));
            hashMap.put("search_source", Integer.valueOf(a.this.l.aw));
            return hashMap;
        }

        public final void a(List<SearchFilterGroup> list, int i, boolean z) {
            Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f96413e4b339252001b5c28d2eea68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f96413e4b339252001b5c28d2eea68");
                return;
            }
            this.c.removeAllViews();
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            for (SearchFilterGroup searchFilterGroup : list) {
                if (searchFilterGroup != null) {
                    SearchFilterGroup searchFilterGroup2 = a.this.l.S.get(searchFilterGroup.groupTitle);
                    if (searchFilterGroup2 == null) {
                        a.this.l.S.put(searchFilterGroup.groupTitle, searchFilterGroup);
                    } else {
                        searchFilterGroup = searchFilterGroup2;
                    }
                    SortFilterTextView sortFilterTextView = new SortFilterTextView(a.this.k);
                    int e = a.this.l.e(searchFilterGroup.groupTitle);
                    sortFilterTextView.setText(searchFilterGroup.groupTitle);
                    sortFilterTextView.a(sortFilterTextView.b, e);
                    sortFilterTextView.setHighlight(e > 0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    layoutParams.rightMargin = h.a(a.this.k, 27.0f);
                    sortFilterTextView.setLayoutParams(layoutParams);
                    this.c.addView(sortFilterTextView);
                    sortFilterTextView.setOnClickListener(new AnonymousClass5(sortFilterTextView, searchFilterGroup));
                    if (!z) {
                        com.sankuai.waimai.store.manager.judas.b.b(a.this.k, "b_KnLVX").b(a(sortFilterTextView.getText(), 0)).a();
                    }
                }
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.store.search.template.filterbar.a$a$5  reason: invalid class name */
        /* loaded from: classes5.dex */
        public class AnonymousClass5 implements View.OnClickListener {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ SortFilterTextView b;
            public final /* synthetic */ SearchFilterGroup c;

            public AnonymousClass5(SortFilterTextView sortFilterTextView, SearchFilterGroup searchFilterGroup) {
                this.b = sortFilterTextView;
                this.c = searchFilterGroup;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13a2d66916205e4c6b886d74c111c48", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13a2d66916205e4c6b886d74c111c48");
                } else {
                    new Runnable() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f2c641ed2aea4c09193f26d562b38df", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f2c641ed2aea4c09193f26d562b38df");
                                return;
                            }
                            com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_FLgH0").b(C1304a.this.a(AnonymousClass5.this.b.getText(), 0)).a();
                            SGSearchSimpleFilterFragment sGSearchSimpleFilterFragment = a.this.d.get(AnonymousClass5.this.b.hashCode());
                            if (AnonymousClass5.this.b.b) {
                                if (sGSearchSimpleFilterFragment != null) {
                                    sGSearchSimpleFilterFragment.u();
                                    return;
                                }
                                return;
                            }
                            if (sGSearchSimpleFilterFragment == null) {
                                sGSearchSimpleFilterFragment = new SGSearchSimpleFilterFragment();
                                a.this.d.put(AnonymousClass5.this.b.hashCode(), sGSearchSimpleFilterFragment);
                                sGSearchSimpleFilterFragment.a(new SGBaseSearchDropFilterFragment.a() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.5.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSearchDropFilterFragment.a
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94d1ec44e0f1dc5c949e65e36d631906", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94d1ec44e0f1dc5c949e65e36d631906");
                                            return;
                                        }
                                        SearchShareData searchShareData = a.this.l;
                                        f.b bVar = new f.b(7);
                                        bVar.h = true;
                                        searchShareData.a(bVar);
                                    }

                                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                                    public final void b() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cbe9a1d49519b561d01f8ba584a0c61", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cbe9a1d49519b561d01f8ba584a0c61");
                                            return;
                                        }
                                        AnonymousClass5.this.b.a(true, a.this.l.e(AnonymousClass5.this.c.groupTitle));
                                        AnonymousClass5.this.b.setHighlight(true);
                                        a.this.b.a(true);
                                    }

                                    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.a
                                    public final void c() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2630a8af5fd81f1f0da8724845d4d229", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2630a8af5fd81f1f0da8724845d4d229");
                                            return;
                                        }
                                        int e = a.this.l.e(AnonymousClass5.this.c.groupTitle);
                                        AnonymousClass5.this.b.a(false, e);
                                        AnonymousClass5.this.b.setHighlight(e > 0);
                                        a.this.b.a(false);
                                    }
                                });
                            }
                            Rect rect = new Rect();
                            AnonymousClass5.this.b.getGlobalVisibleRect(rect);
                            sGSearchSimpleFilterFragment.l = (rect.bottom - h.a(a.this.k, 45.0f)) + h.a(a.this.k, 9.0f);
                            sGSearchSimpleFilterFragment.a(AnonymousClass5.this.c, a.this.f, a.this.g);
                            C1304a.a(C1304a.this, sGSearchSimpleFilterFragment);
                        }
                    }.run();
                }
            }
        }

        public final void b(List<SortItemInfo> list, final int i, boolean z) {
            Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841384bd23ea931570bac451ee4ee666", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841384bd23ea931570bac451ee4ee666");
                return;
            }
            this.d.removeAllViews();
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            for (final SortItemInfo sortItemInfo : list) {
                if (sortItemInfo != null) {
                    final TextView textView = new TextView(a.this.k);
                    textView.setText(sortItemInfo.name);
                    textView.setTextSize(2, 12.0f);
                    if (a.this.b.M == sortItemInfo.code) {
                        textView.setTextColor(a.this.k.getResources().getColor(R.color.wm_sc_nox_search_color_222426));
                        textView.getPaint().setFakeBoldText(true);
                    } else {
                        textView.setTextColor(a.this.k.getResources().getColor(R.color.wm_sc_nox_search_color_575859));
                        textView.getPaint().setFakeBoldText(false);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    layoutParams.rightMargin = h.a(a.this.k, 24.0f);
                    textView.setLayoutParams(layoutParams);
                    this.d.addView(textView);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.6
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64e270d0fcdc572f619fad57e86f8ae2", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64e270d0fcdc572f619fad57e86f8ae2");
                            } else {
                                a.this.l.a(new f.e(i, new Runnable() { // from class: com.sankuai.waimai.store.search.template.filterbar.a.a.6.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca76151c0a224582b5858e5bdd804b66", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca76151c0a224582b5858e5bdd804b66");
                                            return;
                                        }
                                        com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_FLgH0").b(C1304a.this.a(textView.getText().toString(), 1)).a();
                                        if (a.this.b.M == sortItemInfo.code) {
                                            a.this.b.M = 0L;
                                        } else {
                                            a.this.b.M = sortItemInfo.code;
                                        }
                                        a aVar = a.this;
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e963797a831e37184c79231adf1dd3d0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e963797a831e37184c79231adf1dd3d0");
                                        } else {
                                            if (aVar.c != null) {
                                                aVar.c.u();
                                            }
                                            if (aVar.e != null) {
                                                aVar.e.u();
                                            }
                                            for (int i2 = 0; i2 < aVar.d.size(); i2++) {
                                                SGSearchSimpleFilterFragment valueAt = aVar.d.valueAt(i2);
                                                if (valueAt != null) {
                                                    valueAt.u();
                                                }
                                            }
                                        }
                                        SearchShareData searchShareData = a.this.l;
                                        f.b bVar = new f.b(7);
                                        bVar.h = true;
                                        searchShareData.a(bVar);
                                    }
                                }));
                            }
                        }
                    });
                    if (!z) {
                        com.sankuai.waimai.store.manager.judas.b.b(a.this.k, "b_KnLVX").b(a(textView.getText().toString(), 1)).a();
                    }
                }
            }
        }
    }
}
