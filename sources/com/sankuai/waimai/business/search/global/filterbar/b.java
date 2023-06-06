package com.sankuai.waimai.business.search.global.filterbar;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.SearchStatisticsData;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Context b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public String g;
    public FilterBarViewController h;
    public FragmentManager i;
    public com.sankuai.waimai.platform.widget.filterbar.domain.repository.b j;
    public com.sankuai.waimai.platform.widget.filterbar.domain.repository.b k;
    public com.sankuai.waimai.platform.widget.filterbar.domain.repository.b l;
    public Activity m;
    a n;
    public c o;
    public f p;
    public String q;
    private boolean r;

    public b(Activity activity, Context context, f fVar, a aVar, FragmentManager fragmentManager) {
        Object[] objArr = {activity, context, fVar, aVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e081445b5f8dbeaaef2af61ba9222f1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e081445b5f8dbeaaef2af61ba9222f1f");
            return;
        }
        this.g = "";
        this.r = false;
        this.b = context;
        this.m = activity;
        this.n = aVar;
        this.i = fragmentManager;
        this.p = fVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6294fe009ef4f985cfc57887f8bb65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6294fe009ef4f985cfc57887f8bb65");
            return;
        }
        this.g = "";
        this.c = "";
        this.e = 0L;
        this.f = false;
        if (this.h != null) {
            FilterBarViewController filterBarViewController = this.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = FilterBarViewController.a;
            if (PatchProxy.isSupport(objArr2, filterBarViewController, changeQuickRedirect2, false, "f3e2b0e71d705fe02501f03909a812e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, filterBarViewController, changeQuickRedirect2, false, "f3e2b0e71d705fe02501f03909a812e5");
            } else {
                filterBarViewController.b.d();
            }
            FilterBarViewController filterBarViewController2 = this.h;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = FilterBarViewController.a;
            if (PatchProxy.isSupport(objArr3, filterBarViewController2, changeQuickRedirect3, false, "edea804a843950b8c80982a567de069d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, filterBarViewController2, changeQuickRedirect3, false, "edea804a843950b8c80982a567de069d");
            } else {
                filterBarViewController2.b.j();
            }
            c();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e65ba91020c30abd90f848b8ce96b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e65ba91020c30abd90f848b8ce96b67");
            return;
        }
        this.k.w();
        this.j.w();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a31f9692bb46e39d8eb097d7bbbac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a31f9692bb46e39d8eb097d7bbbac3");
            return;
        }
        if (i == 200) {
            if (this.l != this.k) {
                this.l = this.k;
                this.h.a(this.k);
            }
        } else if (this.l != this.j) {
            this.l = this.j;
            this.h.a(this.j);
        }
        if (this.h != null) {
            FilterBarViewController filterBarViewController = this.h;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = FilterBarViewController.a;
            if (PatchProxy.isSupport(objArr2, filterBarViewController, changeQuickRedirect2, false, "6148b1b38af1cb6496e5e102b7a5444a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, filterBarViewController, changeQuickRedirect2, false, "6148b1b38af1cb6496e5e102b7a5444a");
            } else {
                filterBarViewController.c.c(i);
            }
        }
    }

    public final void a(String[] strArr, String[] strArr2) {
        Object[] objArr = {strArr, strArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c42885dd314ab61bd4ccae2a8c50608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c42885dd314ab61bd4ccae2a8c50608");
            return;
        }
        c cVar = this.o;
        Object[] objArr2 = {strArr, strArr2};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "38ce0022061088b97dfe08580280bfa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "38ce0022061088b97dfe08580280bfa4");
            return;
        }
        if (strArr != null) {
            for (String str : strArr) {
                cVar.b.a(str, true);
            }
        }
        Set<String> m = cVar.b.m();
        if (m != null) {
            for (String str2 : m) {
                if (!TextUtils.isEmpty(str2)) {
                    cVar.b.a(str2, true);
                }
            }
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                cVar.b.a(str3, false);
            }
        }
        Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> n = cVar.b.n();
        if (n != null) {
            for (String str4 : n.keySet()) {
                if (!TextUtils.isEmpty(str4) && n.get(str4) != null) {
                    cVar.b.a(str4, n.get(str4).b, n.get(str4).c);
                }
            }
        }
        cVar.b.l();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360351d3047f87dab1aa7eae6243e04b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360351d3047f87dab1aa7eae6243e04b");
            return;
        }
        this.q = str;
        FilterBarViewController filterBarViewController = this.h;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = FilterBarViewController.a;
        if (PatchProxy.isSupport(objArr2, filterBarViewController, changeQuickRedirect2, false, "e7bead7deaee8dc71d2c0d7083682283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, filterBarViewController, changeQuickRedirect2, false, "e7bead7deaee8dc71d2c0d7083682283");
            return;
        }
        filterBarViewController.c.a(str);
        filterBarViewController.e = str;
    }

    public final void a(SearchStatisticsData searchStatisticsData) {
        Object[] objArr = {searchStatisticsData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125e36880efa920109995dc2bfa43827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125e36880efa920109995dc2bfa43827");
        } else {
            this.h.f = searchStatisticsData;
        }
    }

    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ea51d91b8c96ec6839f60ec8288cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ea51d91b8c96ec6839f60ec8288cbb");
        } else {
            this.h.a(j, j2, i);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3039e031d4fbe16e7c6abe92facec09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3039e031d4fbe16e7c6abe92facec09");
            return;
        }
        SearchShareData.a(this.b).al = z;
        c cVar = this.o;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "29ddcdcf1df4347be2cc277fb6db0878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "29ddcdcf1df4347be2cc277fb6db0878");
            return;
        }
        FloatFilterBarView floatFilterBarView = cVar.c;
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = FloatFilterBarView.a;
        if (PatchProxy.isSupport(objArr3, floatFilterBarView, changeQuickRedirect3, false, "2568264fb589bfd4d1c7c5f2f2c2d842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, floatFilterBarView, changeQuickRedirect3, false, "2568264fb589bfd4d1c7c5f2f2c2d842");
            return;
        }
        FilterBarView filterBarView = floatFilterBarView.b;
        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect4 = FilterBarView.a;
        if (PatchProxy.isSupport(objArr4, filterBarView, changeQuickRedirect4, false, "d572cb336ede859a4c812d05f18f9e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, filterBarView, changeQuickRedirect4, false, "d572cb336ede859a4c812d05f18f9e48");
            return;
        }
        filterBarView.e = z;
        if (filterBarView.d != null) {
            filterBarView.d.setVisibility(z ? 0 : 8);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbd2aa44521b90660c4d9b76f00997e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbd2aa44521b90660c4d9b76f00997e");
            return;
        }
        this.r = z;
        if (z) {
            this.o.j(true);
        } else {
            this.o.a();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3f77f5e90131c31ea651c0af6858f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3f77f5e90131c31ea651c0af6858f6");
        } else if (this.h != null) {
            this.h.b.a(true);
            this.h.b.c();
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1728e34d9a5b0a98289ec112d256b86c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1728e34d9a5b0a98289ec112d256b86c")).booleanValue();
        }
        if (this.h == null || !(this.h.b instanceof com.sankuai.waimai.platform.widget.filterbar.presenter.b)) {
            return false;
        }
        com.sankuai.waimai.platform.widget.filterbar.presenter.b bVar = (com.sankuai.waimai.platform.widget.filterbar.presenter.b) this.h.b;
        return bVar.e || bVar.d || bVar.f || bVar.h;
    }
}
