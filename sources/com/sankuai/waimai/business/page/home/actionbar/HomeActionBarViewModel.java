package com.sankuai.waimai.business.page.home.actionbar;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomeActionBarViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    private static final int q = g.a(com.meituan.android.singleton.b.a, 20.0f);
    int b;
    public boolean c;
    boolean d;
    public k<Pair<Integer, Integer>> e;
    k<Pair<RollSearchKeyword, Boolean>> f;
    k<Boolean> g;
    public k<RecommendedSearchKeyword> h;
    public k<Pair<Boolean, Boolean>> i;
    public k<Boolean> j;
    boolean k;
    public boolean l;
    public String m;
    public boolean n;
    public boolean o;
    public String p;
    private k<HomeNewHeadResponse> r;

    public HomeActionBarViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455553f12f696f1bbee64a2f4011fc9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455553f12f696f1bbee64a2f4011fc9e");
            return;
        }
        this.b = -1;
        this.c = false;
        this.d = true;
        this.e = new k<>();
        this.r = new k<>();
        this.f = new k<>();
        this.g = new k<>();
        this.h = new k<>();
        this.i = new k<>();
        this.j = new k<>();
        this.k = false;
        this.l = false;
        this.m = "";
        this.n = false;
        this.o = false;
    }

    public final void a(Pair<RollSearchKeyword, Boolean> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c622a0ae6fac13f1e0a19e97a25bf1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c622a0ae6fac13f1e0a19e97a25bf1c");
        } else {
            this.f.b((k<Pair<RollSearchKeyword, Boolean>>) pair);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddff31133a9cb22ae4a0d53f985e083c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddff31133a9cb22ae4a0d53f985e083c");
        } else {
            this.g.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void a(RecommendedSearchKeyword recommendedSearchKeyword) {
        Object[] objArr = {recommendedSearchKeyword};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce20e55b64893e297d7ac97414d02e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce20e55b64893e297d7ac97414d02e3");
        } else {
            this.h.b((k<RecommendedSearchKeyword>) recommendedSearchKeyword);
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d5f1a3fc2e6e0ade90398c8f1c0a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d5f1a3fc2e6e0ade90398c8f1c0a47");
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.D);
        com.sankuai.waimai.business.page.home.utils.b.a();
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad043cfb0d62ff38402031226fdfe95c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad043cfb0d62ff38402031226fdfe95c")).intValue() : Math.max(0, Math.min(-i, e()));
    }

    public final float b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a51f6df4055f63bc793fe1b1df509e6", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a51f6df4055f63bc793fe1b1df509e6")).floatValue() : Math.min(q, a(i)) / q;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2458ea55ce8df0a8c0cdaef2c1ad4df2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2458ea55ce8df0a8c0cdaef2c1ad4df2")).intValue();
        }
        if (com.sankuai.waimai.business.page.home.helper.b.a().c || this.l) {
            return g.a(com.meituan.android.singleton.b.a, 39.0f);
        }
        return com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.wm_page_home_location_container_height);
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e51e97c357770f0bf37af78f8581dd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e51e97c357770f0bf37af78f8581dd0")).intValue();
        }
        if (com.sankuai.waimai.business.page.home.helper.b.a().c || this.l) {
            return g.a(com.meituan.android.singleton.b.a, 40.0f);
        }
        return com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.wm_page_home_search_box_height);
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "184c475b468141beb7fd3e23f2b4d588", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "184c475b468141beb7fd3e23f2b4d588")).intValue();
        }
        if (com.sankuai.waimai.business.page.home.helper.b.a().c || this.l) {
            return g.a(com.meituan.android.singleton.b.a, 32.0f);
        }
        return com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.wm_page_home_location_container_height);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f624c79bc991f874957772b077d24a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f624c79bc991f874957772b077d24a");
            return;
        }
        this.l = z;
        this.j.b((k<Boolean>) Boolean.valueOf(z));
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a4b09be5605c938998b17e5dbe7372", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a4b09be5605c938998b17e5dbe7372")).intValue() : b() + c();
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d18a52398ab55c872edc9568a1ab9ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d18a52398ab55c872edc9568a1ab9ca");
        } else {
            this.i.b((k<Pair<Boolean, Boolean>>) new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        }
    }
}
