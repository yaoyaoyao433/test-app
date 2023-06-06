package com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import com.sankuai.waimai.platform.widget.filterbar.presenter.a;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import com.sankuai.waimai.platform.widget.filterbar.view.view.FilterBarViewHome;
import com.sankuai.waimai.platform.widget.filterbar.view.view.FloatFilterBarViewHome;
import com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome;
import com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterCategoryDialogFragment;
import com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterSortDialogFragmentHome;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.widget.filterbar.view.controller.a {
    public static ChangeQuickRedirect a;
    a.InterfaceC1093a b;
    int c;
    public FloatFilterBarViewHome d;
    public int e;
    private final Context k;
    private final int l;
    private final String m;
    private FragmentManager n;
    private FilterBarViewController.b o;
    private FilterBarViewHome p;

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.b
    public final /* bridge */ /* synthetic */ void a(a.InterfaceC1093a interfaceC1093a) {
        this.b = interfaceC1093a;
    }

    public a(@NonNull Context context, int i, @NonNull FragmentManager fragmentManager, @NonNull ViewGroup viewGroup, @NonNull ViewGroup viewGroup2, @NonNull FilterBarViewController.b bVar, int i2, String str) {
        Object[] objArr = {context, 1, fragmentManager, viewGroup, viewGroup2, bVar, 2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc5345774de4a15fea020525d2a26683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc5345774de4a15fea020525d2a26683");
            return;
        }
        this.e = -1;
        this.k = context;
        this.m = str;
        this.o = bVar;
        this.c = 1;
        this.n = fragmentManager;
        this.l = 2;
        Object[] objArr2 = {context, viewGroup, viewGroup2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f284f2263951efe25d1cf2d5a7b9d3a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f284f2263951efe25d1cf2d5a7b9d3a5");
        } else {
            b.g gVar = new b.g() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.g
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e06c352fc00406b386977dae49429fc6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e06c352fc00406b386977dae49429fc6");
                    } else {
                        a.this.b.b();
                    }
                }
            };
            b.h hVar = new b.h() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.h
                public final void a(long j, boolean z) {
                    Object[] objArr3 = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76724a0e9a64bade3029b5c4d18ebfd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76724a0e9a64bade3029b5c4d18ebfd5");
                    } else {
                        a.this.b.a(j);
                    }
                }
            };
            b.f fVar = new b.f() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.f
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e976f6fc2d1d42374a04d7b2345b2714", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e976f6fc2d1d42374a04d7b2345b2714");
                        return;
                    }
                    switch (a.this.c) {
                        case 1:
                            a.this.b.a(a.this.g, a.this.h, a.this.i);
                            return;
                        case 2:
                            a.this.b.a(a.this.j);
                            return;
                        default:
                            return;
                    }
                }
            };
            b.c cVar = new b.c() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.c
                public final void a(b.a.C1086a c1086a, boolean z, boolean z2, boolean z3) {
                    Object[] objArr3 = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, (byte) 0};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47b92dda2f7aade9030647505c2b4752", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47b92dda2f7aade9030647505c2b4752");
                    } else {
                        a.this.b.a(c1086a, z, a.this.g, a.this.h, a.this.i, false, false);
                    }
                }
            };
            b.d dVar = new b.d() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.d
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b35f9ebddbed3382073fc84533d6356", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b35f9ebddbed3382073fc84533d6356");
                    } else {
                        a.this.b.h();
                    }
                }
            };
            b.e eVar = new b.e() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.e
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94faa82a213f27e992cb147ebebc0158", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94faa82a213f27e992cb147ebebc0158");
                    } else if (a.this.c != 1) {
                    } else {
                        a.this.b.b(a.this.g, a.this.h, a.this.i);
                    }
                }
            };
            this.p = new FilterBarViewHome(context);
            this.p.setOnTabSortClickListener(gVar);
            this.p.setOnTabSortItemClickListener(hVar);
            this.p.setOnTabFilterClickListener(fVar);
            this.p.setOnFastFilterItemClickListener(cVar);
            this.p.setOnTabCategoryClickListener(dVar);
            this.p.setOnTabDynamicFilterClickListener(eVar);
            if (viewGroup2 != null) {
                viewGroup2.addView(this.p);
            }
            this.d = new FloatFilterBarViewHome(context);
            this.d.setPageInfoKey(this.m);
            this.d.setFragmentManager(this.n);
            this.d.setOnTabSortClickListener(gVar);
            this.d.setOnTabSortItemClickListener(hVar);
            this.d.setOnTabFilterClickListener(fVar);
            this.d.setOnFastFilterItemClickListener(cVar);
            this.d.setOnTabCategoryClickListener(dVar);
            this.d.setOnTabDynamicFilterClickListener(eVar);
            this.d.setOnDialogSortItemClickListener(new b.a() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(DialogFragment dialogFragment, int i3, int i4, long j) {
                    Object[] objArr3 = {dialogFragment, Integer.valueOf(i3), -1, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d30029ea3d174887f242e4d9e5934e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d30029ea3d174887f242e4d9e5934e4");
                    } else {
                        a.this.b.b(j);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e367b42ae1423af13677223d3c28307a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e367b42ae1423af13677223d3c28307a");
                    } else {
                        a.this.b.c();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(DialogFragment dialogFragment, ArrayList<String> arrayList) {
                    Object[] objArr3 = {dialogFragment, arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f91a8190ea202f7f2f700f7f090a9f45", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f91a8190ea202f7f2f700f7f090a9f45");
                    } else {
                        a.this.b.l();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(String str2, boolean z) {
                    Object[] objArr3 = {str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "449066a582c21c22340dbb9f5b58f986", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "449066a582c21c22340dbb9f5b58f986");
                    } else {
                        a.this.b.a(str2, z);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(String str2, int i3, int i4) {
                    Object[] objArr3 = {str2, Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "509057485126ceaad834d1d1befc7827", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "509057485126ceaad834d1d1befc7827");
                    } else {
                        a.this.b.a(str2, i3, i4);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5156c85824a17745c9ab511ca3d39cbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5156c85824a17745c9ab511ca3d39cbf");
                    } else {
                        a.this.b.a(true);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66318bcfe235ad26e8d43ab663589488", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66318bcfe235ad26e8d43ab663589488");
                    } else {
                        a.this.b.k();
                    }
                }
            });
            this.d.setOnDynamicFilterDialogItemClickListener(new b.a() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a() {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(DialogFragment dialogFragment, int i3, int i4, long j) {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(DialogFragment dialogFragment, ArrayList<String> arrayList) {
                    Object[] objArr3 = {dialogFragment, arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6a703252d60ca41a43ebad01b13a293", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6a703252d60ca41a43ebad01b13a293");
                    } else {
                        a.this.b.g();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(String str2, boolean z) {
                    Object[] objArr3 = {str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a062fce9871b671895b7ddae130681f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a062fce9871b671895b7ddae130681f3");
                    } else {
                        a.this.b.a(str2, z);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void a(String str2, int i3, int i4) {
                    Object[] objArr3 = {str2, Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ab16ae15e6ef1c670e98ad80c52805f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ab16ae15e6ef1c670e98ad80c52805f");
                    } else {
                        a.this.b.a(str2, i3, i4);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66ec3533729071d1f504fd0eb4a63099", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66ec3533729071d1f504fd0eb4a63099");
                    } else {
                        a.this.b.e();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.a
                public final void c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6bcc6bd26984e5177a28f2841fa50630", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6bcc6bd26984e5177a28f2841fa50630");
                    } else {
                        a.this.b.f();
                    }
                }
            });
            this.d.setOnCategoryItemClickListener(new b.InterfaceC1095b() { // from class: com.sankuai.waimai.business.page.home.list.poi.nearby.filterbar.a.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.InterfaceC1095b
                public final void a(DialogFragment dialogFragment, f fVar2) {
                    Object[] objArr3 = {dialogFragment, fVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "65e83cdbd59886880879b21e548c0180", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "65e83cdbd59886880879b21e548c0180");
                    } else {
                        a.this.b.a(fVar2);
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.InterfaceC1095b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e975bb63bf0b8d071aa30400806050e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e975bb63bf0b8d071aa30400806050e");
                    } else {
                        a.this.b.i();
                    }
                }
            });
            if (viewGroup != null) {
                viewGroup.addView(this.d);
            }
        }
        this.p.setPageType(this.l);
        this.d.setPageType(this.l);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(com.sankuai.waimai.platform.widget.filterbar.view.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c48ec90c43ff835c7258dcffd65435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c48ec90c43ff835c7258dcffd65435");
            return;
        }
        this.p.setVisibility(0);
        this.p.a(aVar, this.l, false);
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        int i = this.l;
        Object[] objArr2 = {aVar, Integer.valueOf(i), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "c77884a3da274a5ebdbdfc701c15ff34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "c77884a3da274a5ebdbdfc701c15ff34");
        } else {
            floatFilterBarViewHome.k = floatFilterBarViewHome.c.a(aVar, i, true);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f0927061276066b934cdfec84902c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f0927061276066b934cdfec84902c39");
        } else {
            this.p.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(List<h.a> list, Long l) {
        int i;
        int i2 = 0;
        Object[] objArr = {list, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9caa9fa53010df06476074d1d1d716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9caa9fa53010df06476074d1d1d716");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {list, l};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "926e7b83e68215881ced4ccf7c350f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "926e7b83e68215881ced4ccf7c350f4b");
        } else if (floatFilterBarViewHome.d != null && floatFilterBarViewHome.isAttachedToWindow()) {
            floatFilterBarViewHome.c();
            floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
            floatFilterBarViewHome.c.setSortArrow(true);
            PoiFilterSortDialogFragmentHome poiFilterSortDialogFragmentHome = (PoiFilterSortDialogFragmentHome) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_sort_dialog");
            Object[] objArr3 = {list, l};
            ChangeQuickRedirect changeQuickRedirect3 = FloatFilterBarViewHome.a;
            if (PatchProxy.isSupport(objArr3, floatFilterBarViewHome, changeQuickRedirect3, false, "7c6bf6d22c0a567a30904347ba4dc14a", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr3, floatFilterBarViewHome, changeQuickRedirect3, false, "7c6bf6d22c0a567a30904347ba4dc14a")).intValue();
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
            if (poiFilterSortDialogFragmentHome == null) {
                poiFilterSortDialogFragmentHome = new PoiFilterSortDialogFragmentHome();
            }
            poiFilterSortDialogFragmentHome.b = list;
            poiFilterSortDialogFragmentHome.c = i;
            poiFilterSortDialogFragmentHome.d = floatFilterBarViewHome.h;
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction != null) {
                try {
                    if (!poiFilterSortDialogFragmentHome.isAdded()) {
                        beginTransaction.add(R.id.filter_bar_dialog, poiFilterSortDialogFragmentHome, "tag_kingkong_sort_dialog");
                    }
                    floatFilterBarViewHome.a();
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                    beginTransaction.show(poiFilterSortDialogFragmentHome);
                    beginTransaction.commitAllowingStateLoss();
                    floatFilterBarViewHome.d.executePendingTransactions();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417e467db996cb4f7c38431b23f1f13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417e467db996cb4f7c38431b23f1f13b");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "75f7a70cf049ee8e47cabb1a8118b38e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "75f7a70cf049ee8e47cabb1a8118b38e");
        } else if (floatFilterBarViewHome.d != null) {
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(true);
            floatFilterBarViewHome.c.setSortArrow(false);
            PoiFilterSortDialogFragmentHome poiFilterSortDialogFragmentHome = (PoiFilterSortDialogFragmentHome) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_sort_dialog");
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (poiFilterSortDialogFragmentHome == null || beginTransaction == null || !poiFilterSortDialogFragmentHome.isVisible()) {
                return;
            }
            try {
                floatFilterBarViewHome.b();
                beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                beginTransaction.hide(poiFilterSortDialogFragmentHome);
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4752b15d10611aa431935f1d6df2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4752b15d10611aa431935f1d6df2fc");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "541021d7c2f9f9a4d6103918627d1b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "541021d7c2f9f9a4d6103918627d1b08");
        } else if (floatFilterBarViewHome.d == null || !floatFilterBarViewHome.isAttachedToWindow()) {
        } else {
            floatFilterBarViewHome.c();
            floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
            floatFilterBarViewHome.c.setFilterViewArrow(true);
            floatFilterBarViewHome.e = (PoiFilterActivityDialogFragmentHome) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_filter_dialog");
            if (floatFilterBarViewHome.e == null) {
                floatFilterBarViewHome.e = PoiFilterActivityDialogFragmentHome.a(0);
                floatFilterBarViewHome.e.b = floatFilterBarViewHome.b;
            }
            floatFilterBarViewHome.e.a();
            floatFilterBarViewHome.e.d = floatFilterBarViewHome.h;
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction != null) {
                try {
                    if (!floatFilterBarViewHome.e.isAdded()) {
                        beginTransaction.add(R.id.filter_bar_dialog, floatFilterBarViewHome.e, "tag_kingkong_filter_dialog");
                    }
                    floatFilterBarViewHome.a();
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                    beginTransaction.show(floatFilterBarViewHome.e);
                    beginTransaction.commitAllowingStateLoss();
                    floatFilterBarViewHome.d.executePendingTransactions();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set, Map<String, g> map) {
        Object[] objArr = {bVar, set, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dec284cf27f80af6e849422030b2827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dec284cf27f80af6e849422030b2827");
        } else if (bVar != null) {
            FloatFilterBarViewHome floatFilterBarViewHome = this.d;
            ArrayList<b.a> arrayList = bVar.b;
            Object[] objArr2 = {arrayList, set, map};
            ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
            if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "b8ace33e13c67fd40a17ca239b363651", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "b8ace33e13c67fd40a17ca239b363651");
            } else if (floatFilterBarViewHome.e == null || !floatFilterBarViewHome.isAttachedToWindow() || floatFilterBarViewHome.e.isHidden()) {
            } else {
                floatFilterBarViewHome.c();
                floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
                floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
                floatFilterBarViewHome.e.c = arrayList;
                floatFilterBarViewHome.e.e = set;
                floatFilterBarViewHome.e.f = map;
                floatFilterBarViewHome.e.b(true);
                floatFilterBarViewHome.e.a();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7c82a6c6e3042498d124d9f35f1e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7c82a6c6e3042498d124d9f35f1e53");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "0f2cc3328e0927fc3d55a63d18e3217d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "0f2cc3328e0927fc3d55a63d18e3217d");
        } else if (floatFilterBarViewHome.d != null) {
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(true);
            floatFilterBarViewHome.c.setFilterViewArrow(false);
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction == null || floatFilterBarViewHome.e == null || !floatFilterBarViewHome.e.isVisible()) {
                return;
            }
            try {
                floatFilterBarViewHome.b();
                if (z) {
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                }
                beginTransaction.hide(floatFilterBarViewHome.e);
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c819aae189f30e91dce2a3513a2cca9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c819aae189f30e91dce2a3513a2cca9d");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "e4ef2f005727ae60eccc149b6856b896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "e4ef2f005727ae60eccc149b6856b896");
        } else if (floatFilterBarViewHome.e != null) {
            floatFilterBarViewHome.e.a(z);
            floatFilterBarViewHome.e.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44101e3e4fe1c1a651792002cc0dbeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44101e3e4fe1c1a651792002cc0dbeb0");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "529f2b06e13757722e9fb78952f67a0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "529f2b06e13757722e9fb78952f67a0b");
        } else if (floatFilterBarViewHome.e != null) {
            floatFilterBarViewHome.e.c(z);
            floatFilterBarViewHome.e.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "481db9c7ec7207dafa8dcd53ce3f8945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "481db9c7ec7207dafa8dcd53ce3f8945");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "727836d4febcc7b9358226ccd3a7b826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "727836d4febcc7b9358226ccd3a7b826");
        } else if (floatFilterBarViewHome.e != null) {
            floatFilterBarViewHome.e.d(z);
            floatFilterBarViewHome.e.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07108efc95ad75a8bfec5e0438da33b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07108efc95ad75a8bfec5e0438da33b1");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "a7ffcbe0f65f617c89530cfc330bb3df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "a7ffcbe0f65f617c89530cfc330bb3df");
        } else if (floatFilterBarViewHome.d == null || !floatFilterBarViewHome.isAttachedToWindow()) {
        } else {
            floatFilterBarViewHome.c();
            floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
            floatFilterBarViewHome.c.setDynamicFilterViewArrow(true);
            floatFilterBarViewHome.g = (PoiFilterActivityDialogFragmentHome) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_dynamic_filter_dialog");
            if (floatFilterBarViewHome.g == null) {
                floatFilterBarViewHome.g = PoiFilterActivityDialogFragmentHome.a(1);
            }
            floatFilterBarViewHome.g.a();
            floatFilterBarViewHome.g.d = floatFilterBarViewHome.j;
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction != null) {
                try {
                    if (!floatFilterBarViewHome.g.isAdded()) {
                        beginTransaction.add(R.id.filter_bar_dialog, floatFilterBarViewHome.g, "tag_kingkong_dynamic_filter_dialog");
                    }
                    floatFilterBarViewHome.a();
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                    beginTransaction.show(floatFilterBarViewHome.g);
                    beginTransaction.commitAllowingStateLoss();
                    floatFilterBarViewHome.d.executePendingTransactions();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set, Map<String, g> map) {
        Object[] objArr = {bVar, set, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d777a412f4c43b0aebf83ae7ede216ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d777a412f4c43b0aebf83ae7ede216ac");
        } else if (bVar != null) {
            FloatFilterBarViewHome floatFilterBarViewHome = this.d;
            ArrayList<b.a> arrayList = bVar.b;
            Object[] objArr2 = {arrayList, set, map};
            ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
            if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "f3ff37e61bd7aec2daed6badff0df7a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "f3ff37e61bd7aec2daed6badff0df7a5");
            } else if (floatFilterBarViewHome.g == null || !floatFilterBarViewHome.isAttachedToWindow() || floatFilterBarViewHome.g.isHidden()) {
            } else {
                floatFilterBarViewHome.c();
                floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
                floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
                floatFilterBarViewHome.g.c = arrayList;
                floatFilterBarViewHome.g.e = set;
                floatFilterBarViewHome.g.f = map;
                floatFilterBarViewHome.g.b(true);
                floatFilterBarViewHome.g.a();
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5bf876c4b9f0bc4a6786139960ad96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5bf876c4b9f0bc4a6786139960ad96");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "02265c2448e36fee1b041f9f7880cca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "02265c2448e36fee1b041f9f7880cca1");
        } else if (floatFilterBarViewHome.d != null) {
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(true);
            floatFilterBarViewHome.c.setDynamicFilterViewArrow(false);
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction == null || floatFilterBarViewHome.g == null || !floatFilterBarViewHome.g.isVisible()) {
                return;
            }
            try {
                floatFilterBarViewHome.b();
                beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                beginTransaction.hide(floatFilterBarViewHome.g);
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c805a841b1d5c3d207e89d8da53c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c805a841b1d5c3d207e89d8da53c80");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "9dcf2d172c44ee4912dbe34e47062066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "9dcf2d172c44ee4912dbe34e47062066");
        } else if (floatFilterBarViewHome.g != null) {
            floatFilterBarViewHome.g.a(z);
            floatFilterBarViewHome.g.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc5ff7651e4887ccbb0671f8acc3340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc5ff7651e4887ccbb0671f8acc3340");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "a25a1667a40dcd915e117a7ccd82571f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "a25a1667a40dcd915e117a7ccd82571f");
        } else if (floatFilterBarViewHome.g != null) {
            floatFilterBarViewHome.g.c(z);
            floatFilterBarViewHome.g.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void g(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd99bb7378330e22cd5dc9b2dd549db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd99bb7378330e22cd5dc9b2dd549db");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "65dd43b76d9954e9c687815f82d820ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "65dd43b76d9954e9c687815f82d820ea");
        } else if (floatFilterBarViewHome.g != null) {
            floatFilterBarViewHome.g.d(false);
            floatFilterBarViewHome.g.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83921c88ec9d9a798352c6ae53382c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83921c88ec9d9a798352c6ae53382c11");
            return;
        }
        super.h(z);
        FilterBarViewHome filterBarViewHome = this.p;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = FilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, filterBarViewHome, changeQuickRedirect2, false, "91edcb3f23404258707e2f4d35e379f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, filterBarViewHome, changeQuickRedirect2, false, "91edcb3f23404258707e2f4d35e379f3");
        } else if (z) {
            filterBarViewHome.b.setVisibility(0);
        } else {
            filterBarViewHome.b.setVisibility(8);
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr3, floatFilterBarViewHome, changeQuickRedirect3, false, "abe4aef338f31b6d0fd640a5720587c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, floatFilterBarViewHome, changeQuickRedirect3, false, "abe4aef338f31b6d0fd640a5720587c1");
            return;
        }
        floatFilterBarViewHome.l = z;
        floatFilterBarViewHome.d();
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void i(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7df1cf8b1cefc5ea72582af10551df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7df1cf8b1cefc5ea72582af10551df");
            return;
        }
        super.i(z);
        this.d.setForceHideFastFilterBar(z);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(List<b.a.C1086a> list, Set<String> set) {
        Object[] objArr = {list, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1b2fbe15396c1bc2184bfd96f81139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1b2fbe15396c1bc2184bfd96f81139");
            return;
        }
        super.a(list, set);
        if (this.e != -1) {
            this.p.setFastFilterBarBackground(this.e);
        }
        this.p.a(list, set);
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {list, set};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "03e930dd41cedce4b4e14332cb72216f", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "03e930dd41cedce4b4e14332cb72216f")).booleanValue();
            return;
        }
        floatFilterBarViewHome.l = floatFilterBarViewHome.c.a(list, set);
        boolean z = floatFilterBarViewHome.l;
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9f32537a4454f826815e18ebeca0dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9f32537a4454f826815e18ebeca0dd");
            return;
        }
        super.a(i);
        this.d.a(i);
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void j(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf45dd6054750fa0abe4c636c52392e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf45dd6054750fa0abe4c636c52392e");
        } else if (this.d != null) {
            this.d.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfca7da253bb3b51c41b10944547874c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfca7da253bb3b51c41b10944547874c");
        } else if (this.o != null) {
            this.o.a();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe4ef4717d7030754e6f0dd98b693d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe4ef4717d7030754e6f0dd98b693d4e");
        } else if (this.o != null) {
            this.o.a(cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd42c4addf8318aea5e0036853ea7256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd42c4addf8318aea5e0036853ea7256");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "20b1ce0ac059af506fe70cd31183b64e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "20b1ce0ac059af506fe70cd31183b64e");
        } else if (floatFilterBarViewHome.d == null || !floatFilterBarViewHome.isAttachedToWindow()) {
        } else {
            floatFilterBarViewHome.c();
            floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
            floatFilterBarViewHome.c.setCategoryViewArrow(true);
            floatFilterBarViewHome.f = (PoiFilterCategoryDialogFragment) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_category_dialog");
            if (floatFilterBarViewHome.f == null) {
                floatFilterBarViewHome.f = new PoiFilterCategoryDialogFragment();
            }
            floatFilterBarViewHome.f.i = floatFilterBarViewHome.i;
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction != null) {
                try {
                    if (!floatFilterBarViewHome.f.isAdded()) {
                        beginTransaction.add(R.id.filter_bar_dialog, floatFilterBarViewHome.f, "tag_kingkong_category_dialog");
                    }
                    floatFilterBarViewHome.a();
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                    beginTransaction.show(floatFilterBarViewHome.f);
                    beginTransaction.commitAllowingStateLoss();
                    floatFilterBarViewHome.d.executePendingTransactions();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void a(ArrayList<CategoryBean.Category> arrayList, f fVar) {
        Object[] objArr = {arrayList, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8afbb672e3998630559caee7417322bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8afbb672e3998630559caee7417322bc");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = {arrayList, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "cfa0a51cad4156d96a5a142b5c33a65e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "cfa0a51cad4156d96a5a142b5c33a65e");
        } else if (floatFilterBarViewHome.d != null && floatFilterBarViewHome.isAttachedToWindow()) {
            floatFilterBarViewHome.c();
            floatFilterBarViewHome.a(-floatFilterBarViewHome.getFloatMoveOffsetMax());
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(false);
            floatFilterBarViewHome.f = (PoiFilterCategoryDialogFragment) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_category_dialog");
            if (floatFilterBarViewHome.f == null) {
                floatFilterBarViewHome.f = new PoiFilterCategoryDialogFragment();
            }
            PoiFilterCategoryDialogFragment poiFilterCategoryDialogFragment = floatFilterBarViewHome.f;
            Object[] objArr3 = {arrayList, fVar};
            ChangeQuickRedirect changeQuickRedirect3 = PoiFilterCategoryDialogFragment.a;
            if (PatchProxy.isSupport(objArr3, poiFilterCategoryDialogFragment, changeQuickRedirect3, false, "6f8daa590c7e07b4a73bee2dc5e095b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, poiFilterCategoryDialogFragment, changeQuickRedirect3, false, "6f8daa590c7e07b4a73bee2dc5e095b4");
            } else {
                if (arrayList == null || arrayList.isEmpty()) {
                    poiFilterCategoryDialogFragment.a(4);
                } else {
                    poiFilterCategoryDialogFragment.a(1);
                }
                if (poiFilterCategoryDialogFragment.j != null) {
                    poiFilterCategoryDialogFragment.d = arrayList;
                    poiFilterCategoryDialogFragment.j.a(arrayList);
                    Object[] objArr4 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect4 = PoiFilterCategoryDialogFragment.a;
                    if (PatchProxy.isSupport(objArr4, poiFilterCategoryDialogFragment, changeQuickRedirect4, false, "468db2a47e86ee99083fc53659daeb35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, poiFilterCategoryDialogFragment, changeQuickRedirect4, false, "468db2a47e86ee99083fc53659daeb35");
                    } else {
                        poiFilterCategoryDialogFragment.e = -1;
                        poiFilterCategoryDialogFragment.f = -1;
                        if (poiFilterCategoryDialogFragment.d == null || poiFilterCategoryDialogFragment.d.isEmpty() || fVar == null) {
                            poiFilterCategoryDialogFragment.a(-1, -1);
                        } else {
                            int i = 0;
                            while (true) {
                                if (i >= poiFilterCategoryDialogFragment.d.size()) {
                                    break;
                                }
                                CategoryBean.Category category = poiFilterCategoryDialogFragment.d.get(i);
                                if (category == null || category.code != fVar.a) {
                                    i++;
                                } else {
                                    poiFilterCategoryDialogFragment.e = i;
                                    int size = category.subList == null ? 0 : category.subList.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        CategoryBean.Category category2 = category.subList.get(i2);
                                        if (category2 != null && category2.code == fVar.b) {
                                            poiFilterCategoryDialogFragment.f = i2;
                                        }
                                    }
                                }
                            }
                            poiFilterCategoryDialogFragment.g = poiFilterCategoryDialogFragment.e;
                            poiFilterCategoryDialogFragment.h = poiFilterCategoryDialogFragment.f;
                            poiFilterCategoryDialogFragment.a(poiFilterCategoryDialogFragment.e, poiFilterCategoryDialogFragment.f);
                        }
                    }
                    poiFilterCategoryDialogFragment.a(poiFilterCategoryDialogFragment.b, poiFilterCategoryDialogFragment.e);
                    poiFilterCategoryDialogFragment.a(poiFilterCategoryDialogFragment.c, poiFilterCategoryDialogFragment.f);
                }
            }
            floatFilterBarViewHome.f.i = floatFilterBarViewHome.i;
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (beginTransaction != null) {
                try {
                    if (!floatFilterBarViewHome.f.isAdded()) {
                        beginTransaction.add(R.id.filter_bar_dialog, floatFilterBarViewHome.f, "tag_kingkong_category_dialog");
                    }
                    floatFilterBarViewHome.a();
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                    beginTransaction.show(floatFilterBarViewHome.f);
                    beginTransaction.commitAllowingStateLoss();
                    floatFilterBarViewHome.d.executePendingTransactions();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed89d1bb05dd6e7c41052f4c5a92f70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed89d1bb05dd6e7c41052f4c5a92f70");
            return;
        }
        FloatFilterBarViewHome floatFilterBarViewHome = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = FloatFilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "94dc75051d1967abbc14206368d7bff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, floatFilterBarViewHome, changeQuickRedirect2, false, "94dc75051d1967abbc14206368d7bff8");
        } else if (floatFilterBarViewHome.d != null) {
            floatFilterBarViewHome.setIsFloatFilterBarCanMove(true);
            floatFilterBarViewHome.c.setCategoryViewArrow(false);
            PoiFilterCategoryDialogFragment poiFilterCategoryDialogFragment = (PoiFilterCategoryDialogFragment) floatFilterBarViewHome.d.findFragmentByTag("tag_kingkong_category_dialog");
            FragmentTransaction beginTransaction = floatFilterBarViewHome.d.beginTransaction();
            if (poiFilterCategoryDialogFragment == null || beginTransaction == null || !poiFilterCategoryDialogFragment.isVisible()) {
                return;
            }
            try {
                floatFilterBarViewHome.b();
                beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                beginTransaction.hide(poiFilterCategoryDialogFragment);
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a, com.sankuai.waimai.platform.widget.filterbar.presenter.a.c
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850b3cf185668cb0c8432a5a06291ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850b3cf185668cb0c8432a5a06291ec6");
        } else {
            this.d.setCategoryDialogDisplaySate(i);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.a
    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set) {
        Object[] objArr = {bVar, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b71891375fe9e8bb691c2f2076cfc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b71891375fe9e8bb691c2f2076cfc3");
            return;
        }
        FilterBarViewHome filterBarViewHome = this.p;
        Object[] objArr2 = {bVar, set};
        ChangeQuickRedirect changeQuickRedirect2 = FilterBarViewHome.a;
        if (PatchProxy.isSupport(objArr2, filterBarViewHome, changeQuickRedirect2, false, "ab5d49f5976e2c20f37acf7002a20cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, filterBarViewHome, changeQuickRedirect2, false, "ab5d49f5976e2c20f37acf7002a20cf5");
            return;
        }
        if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.b(bVar)) {
            b.a.C1086a a2 = bVar.a();
            b.C1091b c1091b = bVar.d;
            String str = a2.h;
            if (c1091b != null && ((Constants.TRACE_TYPE_P1.equals(c1091b.a) || Constants.TRACE_TYPE_P2.equals(c1091b.a) || "P3".equals(c1091b.a) || "P4".equals(c1091b.a) || "P6".equals(c1091b.a) || "P7".equals(c1091b.a)) && !TextUtils.isEmpty(str))) {
                return;
            }
        }
        filterBarViewHome.c.setVisibility(8);
    }
}
