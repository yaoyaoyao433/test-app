package com.sankuai.waimai.business.search.global.filterbar;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.presenter.a;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.widget.filterbar.view.controller.a {
    public static ChangeQuickRedirect a;
    public a.InterfaceC1093a b;
    FloatFilterBarView c;
    private Context d;
    private int e;
    private FragmentManager k;
    private d l;
    private int m;
    private f n;

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.b
    public final /* bridge */ /* synthetic */ void a(a.InterfaceC1093a interfaceC1093a) {
        this.b = interfaceC1093a;
    }

    public c(@NonNull Context context, f fVar, int i, @NonNull FragmentManager fragmentManager, @NonNull ViewGroup viewGroup, @NonNull d dVar) {
        Object[] objArr = {context, fVar, 2, fragmentManager, viewGroup, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8249a45dbb01f8e5f5f456ad9870e953", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8249a45dbb01f8e5f5f456ad9870e953");
            return;
        }
        this.m = 0;
        this.d = context;
        this.l = dVar;
        this.e = 2;
        this.k = fragmentManager;
        this.n = fVar;
        Object[] objArr2 = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "291fc468615a8dd56837a92916bb02d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "291fc468615a8dd56837a92916bb02d2");
            return;
        }
        b.g gVar = new b.g() { // from class: com.sankuai.waimai.business.search.global.filterbar.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.g
            public final void a(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea12e3a49db33739a0dc40336647dd81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea12e3a49db33739a0dc40336647dd81");
                    return;
                }
                c.this.i();
                c.this.j();
                c.this.b.b();
            }
        };
        b.h hVar = new b.h() { // from class: com.sankuai.waimai.business.search.global.filterbar.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.h
            public final void a(long j, boolean z) {
                Object[] objArr3 = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37a8d9bed43b804a39ed6443faa4e156", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37a8d9bed43b804a39ed6443faa4e156");
                    return;
                }
                c.this.i();
                c.this.j();
                c.this.b.a(j);
            }
        };
        b.f fVar2 = new b.f() { // from class: com.sankuai.waimai.business.search.global.filterbar.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.f
            public final void a(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f0c92a3cbbd7dcdf106c6e1d68918a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f0c92a3cbbd7dcdf106c6e1d68918a5");
                } else {
                    c.this.k();
                }
            }
        };
        this.c = new FloatFilterBarView(context);
        this.c.setFragmentManager(this.k);
        this.c.setOnTabSortClickListener(gVar);
        this.c.setOnTabSortItemClickListener(hVar);
        this.c.setOnTabFilterClickListener(fVar2);
        this.c.setOnDialogSortItemClickListener(new b.a() { // from class: com.sankuai.waimai.business.search.global.filterbar.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(DialogFragment dialogFragment, int i2, int i3, long j) {
                Object[] objArr3 = {dialogFragment, Integer.valueOf(i2), -1, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0159ac5a10e1b5a8ec0598a62715b8e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0159ac5a10e1b5a8ec0598a62715b8e0");
                } else {
                    c.this.b.b(j);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dffe8f76614753d4369ba83ee3fddc73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dffe8f76614753d4369ba83ee3fddc73");
                } else {
                    c.this.b.c();
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(DialogFragment dialogFragment, ArrayList<String> arrayList) {
                Object[] objArr3 = {dialogFragment, arrayList};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c0a2a954a7126c5a7923a23bce41b2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c0a2a954a7126c5a7923a23bce41b2d");
                } else {
                    c.this.b.l();
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(String str, boolean z) {
                Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4d5d3e4727a7fc28ea47895c1e96cd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4d5d3e4727a7fc28ea47895c1e96cd0");
                } else {
                    c.this.b.a(str, z);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void a(String str, int i2, int i3) {
                Object[] objArr3 = {str, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00664b6d9d7a98ad84182fc253890967", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00664b6d9d7a98ad84182fc253890967");
                } else {
                    c.this.b.a(str, i2, i3);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2cd8acba1625ce22e2d5eaef01465b17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2cd8acba1625ce22e2d5eaef01465b17");
                } else {
                    c.this.b.a(true);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
            public final void c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a8ebffdb0a8548cd2d043a73b524a30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a8ebffdb0a8548cd2d043a73b524a30");
                } else {
                    c.this.b.k();
                }
            }
        });
        if (viewGroup != null) {
            viewGroup.addView(this.c);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(com.sankuai.waimai.platform.widget.filterbar.view.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1fa4adcaa8d26d971d4a5c5dd31fa9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1fa4adcaa8d26d971d4a5c5dd31fa9f");
        } else if ((this.d instanceof Activity) && ((Activity) this.d).isDestroyed()) {
        } else {
            SearchShareData.a(this.d).ak = aVar;
            FloatFilterBarView floatFilterBarView = this.c;
            com.sankuai.waimai.platform.widget.filterbar.domain.model.h hVar = aVar.a;
            Long l = aVar.b;
            int i = aVar.c;
            boolean z = aVar.d;
            boolean z2 = aVar.f;
            boolean z3 = aVar.g;
            int i2 = this.m;
            Object[] objArr2 = {hVar, l, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
            if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "3777ee49ab07f9aaa9702f245a04631c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "3777ee49ab07f9aaa9702f245a04631c");
                return;
            }
            FilterBarView filterBarView = floatFilterBarView.b;
            Object[] objArr3 = {hVar, l, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = FilterBarView.a;
            if (PatchProxy.isSupport(objArr3, filterBarView, changeQuickRedirect3, false, "35788c1d5dcb116c0f2f567968d07c1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, filterBarView, changeQuickRedirect3, false, "35788c1d5dcb116c0f2f567968d07c1d");
            } else if (hVar == null || !(filterBarView.b instanceof GlobalSearchActivity)) {
            } else {
                if (filterBarView.f) {
                    filterBarView.a(hVar, l, i, z, z2, z3, i2);
                    return;
                }
                Object[] objArr4 = {hVar, l, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect4 = FilterBarView.a;
                if (PatchProxy.isSupport(objArr4, filterBarView, changeQuickRedirect4, false, "f2445a457cafc848286d030be88b87d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, filterBarView, changeQuickRedirect4, false, "f2445a457cafc848286d030be88b87d1");
                } else if (!(filterBarView.b instanceof Activity) || ((Activity) filterBarView.b).isDestroyed()) {
                } else {
                    filterBarView.c.getLayoutParams().height = filterBarView.getResources().getDimensionPixelSize(R.dimen.wm_nox_search_filter_bar_height_new_style);
                    filterBarView.b(hVar, l, i, z, z2, z3, i2);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0f7665857e9f8c45a668de5e8ede22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0f7665857e9f8c45a668de5e8ede22");
        } else {
            this.c.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(List<h.a> list, Long l) {
        int i;
        int i2 = 0;
        Object[] objArr = {list, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99ac4f38bd1bfb41b09e68f00c40509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99ac4f38bd1bfb41b09e68f00c40509");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = {list, l};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "e3c5ee925e77b3146d5e5f8b6ab2e478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "e3c5ee925e77b3146d5e5f8b6ab2e478");
        } else if (floatFilterBarView.c != null) {
            floatFilterBarView.b.setArrow(true);
            PoiFilterSortDialogFragment poiFilterSortDialogFragment = (PoiFilterSortDialogFragment) floatFilterBarView.c.findFragmentByTag("tag_kingkong_sort_dialog");
            Object[] objArr3 = {list, l};
            ChangeQuickRedirect changeQuickRedirect3 = FloatFilterBarView.a;
            if (PatchProxy.isSupport(objArr3, floatFilterBarView, changeQuickRedirect3, false, "e255c18eb36c93508aceec89d9693e96", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, floatFilterBarView, changeQuickRedirect3, false, "e255c18eb36c93508aceec89d9693e96")).intValue();
            } else {
                if (list != null && l != null) {
                    for (h.a aVar : list) {
                        if (aVar != null && aVar.a == l.longValue()) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                }
                i = -1;
            }
            if (poiFilterSortDialogFragment == null) {
                poiFilterSortDialogFragment = new PoiFilterSortDialogFragment();
            }
            poiFilterSortDialogFragment.b = list;
            poiFilterSortDialogFragment.c = i;
            poiFilterSortDialogFragment.d = floatFilterBarView.e;
            FragmentTransaction beginTransaction = floatFilterBarView.c.beginTransaction();
            if (beginTransaction != null) {
                beginTransaction.replace(R.id.filter_bar_dialog, poiFilterSortDialogFragment, "tag_kingkong_sort_dialog").show(poiFilterSortDialogFragment).commitAllowingStateLoss();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b99e1bfc13050d3af6dd57382dbc32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b99e1bfc13050d3af6dd57382dbc32");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "b119a59e403a188d379493a149bbffc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "b119a59e403a188d379493a149bbffc3");
        } else if (floatFilterBarView.c != null) {
            floatFilterBarView.b.setArrow(false);
            PoiFilterSortDialogFragment poiFilterSortDialogFragment = (PoiFilterSortDialogFragment) floatFilterBarView.c.findFragmentByTag("tag_kingkong_sort_dialog");
            FragmentTransaction beginTransaction = floatFilterBarView.c.beginTransaction();
            if (poiFilterSortDialogFragment == null || beginTransaction == null) {
                return;
            }
            beginTransaction.remove(poiFilterSortDialogFragment).commitAllowingStateLoss();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744fc8a7e7b201f1b8a9b74a8b5f83fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744fc8a7e7b201f1b8a9b74a8b5f83fd");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "dd853fb18035747071a2030efc45bdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "dd853fb18035747071a2030efc45bdc5");
        } else if (floatFilterBarView.c != null) {
            floatFilterBarView.b.setFilterViewArrow(true);
            floatFilterBarView.d = (PoiFilterActivityDialogFragment) floatFilterBarView.c.findFragmentByTag("tag_kingkong_filter_dialog");
            if (floatFilterBarView.d == null) {
                floatFilterBarView.d = new PoiFilterActivityDialogFragment();
            }
            floatFilterBarView.d.a();
            floatFilterBarView.d.g = floatFilterBarView.e;
            FragmentTransaction beginTransaction = floatFilterBarView.c.beginTransaction();
            if (beginTransaction != null) {
                beginTransaction.replace(R.id.filter_bar_dialog, floatFilterBarView.d, "tag_kingkong_filter_dialog").show(floatFilterBarView.d).commitAllowingStateLoss();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set, Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> map) {
        Object[] objArr = {bVar, set, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf75bab70d4a72a8e9bf275825d7a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf75bab70d4a72a8e9bf275825d7a73");
        } else if (bVar != null) {
            FloatFilterBarView floatFilterBarView = this.c;
            ArrayList<b.a> arrayList = bVar.b;
            Object[] objArr2 = {arrayList, set, map};
            ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
            if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "a337e3c48b3835617416d6a5b49a2715", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "a337e3c48b3835617416d6a5b49a2715");
            } else if (floatFilterBarView.d != null) {
                floatFilterBarView.d.f = arrayList;
                floatFilterBarView.d.h = set;
                floatFilterBarView.d.i = map;
                PoiFilterActivityDialogFragment poiFilterActivityDialogFragment = floatFilterBarView.d;
                Object[] objArr3 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = PoiFilterActivityDialogFragment.a;
                if (PatchProxy.isSupport(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "886b0f90cb6cb26b7877acc9091fb3e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "886b0f90cb6cb26b7877acc9091fb3e7");
                } else {
                    poiFilterActivityDialogFragment.b = true;
                    poiFilterActivityDialogFragment.e = false;
                    poiFilterActivityDialogFragment.c = false;
                    poiFilterActivityDialogFragment.d = false;
                    poiFilterActivityDialogFragment.b();
                }
                floatFilterBarView.d.a();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35c799b90a572ac6744853a9736b307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35c799b90a572ac6744853a9736b307");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "31c7b549abbb225ecdc3bcc9c366bb37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "31c7b549abbb225ecdc3bcc9c366bb37");
        } else if (floatFilterBarView.c != null) {
            floatFilterBarView.b.setFilterViewArrow(false);
            FragmentTransaction beginTransaction = floatFilterBarView.c.beginTransaction();
            if (beginTransaction == null || floatFilterBarView.d == null) {
                return;
            }
            beginTransaction.remove(floatFilterBarView.d).commitAllowingStateLoss();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5400f638fdafea7e754984cfdd3b6511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5400f638fdafea7e754984cfdd3b6511");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "a06eef34c90f3ebd49d8ea8701a174fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "a06eef34c90f3ebd49d8ea8701a174fc");
        } else if (floatFilterBarView.d != null) {
            PoiFilterActivityDialogFragment poiFilterActivityDialogFragment = floatFilterBarView.d;
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = PoiFilterActivityDialogFragment.a;
            if (PatchProxy.isSupport(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "89c646ac53c665c2dcb64fa1ced30e1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "89c646ac53c665c2dcb64fa1ced30e1d");
            } else {
                poiFilterActivityDialogFragment.c = z;
                if (z) {
                    poiFilterActivityDialogFragment.b = false;
                    poiFilterActivityDialogFragment.e = false;
                    poiFilterActivityDialogFragment.d = false;
                }
                poiFilterActivityDialogFragment.b();
            }
            floatFilterBarView.d.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678f21edc6af238e374c8891b8bc09fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678f21edc6af238e374c8891b8bc09fd");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "79c61ec7af40a0375663c87395e1f60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "79c61ec7af40a0375663c87395e1f60b");
        } else if (floatFilterBarView.d != null) {
            PoiFilterActivityDialogFragment poiFilterActivityDialogFragment = floatFilterBarView.d;
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = PoiFilterActivityDialogFragment.a;
            if (PatchProxy.isSupport(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "e46fe2230db4c6a2f95d1a964584bf3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "e46fe2230db4c6a2f95d1a964584bf3b");
            } else {
                poiFilterActivityDialogFragment.d = z;
                if (z) {
                    poiFilterActivityDialogFragment.b = false;
                    poiFilterActivityDialogFragment.e = false;
                    poiFilterActivityDialogFragment.c = false;
                }
                poiFilterActivityDialogFragment.b();
            }
            floatFilterBarView.d.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecbabb7ca2c7973e2b5850f62fb77384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecbabb7ca2c7973e2b5850f62fb77384");
            return;
        }
        FloatFilterBarView floatFilterBarView = this.c;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarView, changeQuickRedirect2, false, "32223d556a00d5b3ee895192057a2fdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarView, changeQuickRedirect2, false, "32223d556a00d5b3ee895192057a2fdd");
        } else if (floatFilterBarView.d != null) {
            PoiFilterActivityDialogFragment poiFilterActivityDialogFragment = floatFilterBarView.d;
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = PoiFilterActivityDialogFragment.a;
            if (PatchProxy.isSupport(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "7a53f59ce70c4b8ab97b919306340714", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, poiFilterActivityDialogFragment, changeQuickRedirect3, false, "7a53f59ce70c4b8ab97b919306340714");
            } else {
                poiFilterActivityDialogFragment.e = z;
                if (z) {
                    poiFilterActivityDialogFragment.b = false;
                    poiFilterActivityDialogFragment.c = false;
                    poiFilterActivityDialogFragment.d = false;
                }
                poiFilterActivityDialogFragment.b();
            }
            floatFilterBarView.d.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void j(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d829a811c7de3abb37981b813bbaf206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d829a811c7de3abb37981b813bbaf206");
        } else if (this.c != null) {
            this.c.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1bc909107e86f51cea79f06190e00dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1bc909107e86f51cea79f06190e00dc");
        } else if (this.l != null) {
            this.l.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53556725dac073b1b04dee66bc4a1fbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53556725dac073b1b04dee66bc4a1fbe");
        } else if (this.l != null) {
            this.l.a(cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a0445e111a4db8c974591e28aedf73d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a0445e111a4db8c974591e28aedf73d");
        } else if (this.l != null) {
            this.l.a(obj);
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ab1c64afda82b896c4d9fe82534450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ab1c64afda82b896c4d9fe82534450");
        } else if (this.l != null) {
            this.l.b();
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff911f397d79f2c4a40b4f38ac4a998c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff911f397d79f2c4a40b4f38ac4a998c");
        } else if (this.n != null) {
            this.n.a();
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53912ddd600e3cd70adf996400518b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53912ddd600e3cd70adf996400518b7");
            return;
        }
        i();
        j();
        switch (this.e) {
            case 1:
                this.b.a(this.g, this.h, this.i);
                return;
            case 2:
                this.b.a(this.j);
                return;
            default:
                return;
        }
    }
}
