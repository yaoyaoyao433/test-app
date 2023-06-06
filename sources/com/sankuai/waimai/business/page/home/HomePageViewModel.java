package com.sankuai.waimai.business.page.home;

import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.graphics.Rect;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.head.recommendwords.RecommendSearchWord;
import com.sankuai.waimai.business.page.home.list.future.modulelistheader.PersonalizedBean;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomePageViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public k<Boolean> A;
    public k<Boolean> B;
    public k<List<RecommendedSearchKeyword>> C;
    public k<List<List<RecommendedSearchKeyword>>> D;
    public k<RecommendSearchWord> E;
    public k<Boolean> F;
    List<FilterBarViewController.a> G;
    public com.sankuai.waimai.business.page.home.expose.a H;
    public boolean I;
    public boolean J;
    public c K;
    e L;
    public Boolean M;
    public boolean N;
    public boolean O;
    String P;
    public String Q;
    public long R;
    boolean S;
    public boolean T;
    public com.sankuai.waimai.rocks.model.a U;
    public com.sankuai.waimai.business.page.common.list.ai.c V;
    public boolean W;
    private k<Boolean> X;
    private k<Boolean> Y;
    private k<Boolean> Z;
    private k<RollSearchKeyword> aa;
    private boolean ab;
    public k<BaseResponse<String>> b;
    public k<com.sankuai.waimai.business.page.home.model.d> c;
    public k<Boolean> d;
    public k<Boolean> e;
    public k<d.a> f;
    public k<Integer> g;
    public k<Integer> h;
    public k<Integer> i;
    public k<Boolean> j;
    public k<Boolean> k;
    k<Boolean> l;
    public k<Pair<String, Boolean>> m;
    public k<b.a> n;
    k<Boolean> o;
    public k<Rect> p;
    public k<Boolean> q;
    public k<Boolean> r;
    public k<List<com.meituan.android.cube.pga.block.a>> s;
    public k<Pair<Boolean, Integer>> t;
    k<Void> u;
    public k<PersonalizedBean> v;
    public k<Void> w;
    public k<Integer> x;
    k<Boolean> y;
    public k<Void> z;

    public HomePageViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d397001998e36a7a17141cca78b58f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d397001998e36a7a17141cca78b58f0");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
        this.d = new k<>();
        this.e = new k<>();
        this.f = new k<>();
        this.g = new k<>();
        this.h = new k<>();
        this.i = new k<>();
        this.j = new k<>();
        this.k = new k<>();
        this.l = new k<>();
        this.X = new k<>();
        this.m = new k<>();
        this.n = new k<>();
        this.o = new k<>();
        this.p = new k<>();
        this.q = new k<>();
        this.Y = new k<>();
        this.r = new k<>();
        this.s = new k<>();
        this.t = new k<>();
        this.u = new k<>();
        this.v = new k<>();
        this.w = new k<>();
        this.x = new k<>();
        this.y = new k<>();
        this.z = new k<>();
        this.Z = new k<>();
        this.A = new k<>();
        this.B = new k<>();
        this.C = new k<>();
        this.D = new k<>();
        this.E = new k<>();
        this.aa = new k<>();
        this.F = new k<>();
        this.G = new ArrayList();
        this.I = false;
        this.J = false;
        this.ab = true;
        this.M = Boolean.TRUE;
        this.W = false;
    }

    public final void a(BaseResponse<String> baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a567a945ee1775d239551ff9e3a4c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a567a945ee1775d239551ff9e3a4c06");
        } else {
            this.b.b((k<BaseResponse<String>>) baseResponse);
        }
    }

    public final void a(com.sankuai.waimai.business.page.home.model.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f23b8fe54f403d4e2464e3ed0fc86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f23b8fe54f403d4e2464e3ed0fc86f");
        } else {
            this.c.b((k<com.sankuai.waimai.business.page.home.model.d>) dVar);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73694d8b8d613ca814bc2976ed3d45c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73694d8b8d613ca814bc2976ed3d45c3");
        } else if (this.d.a() == null || z != this.d.a().booleanValue()) {
            this.d.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26c0d886df4542d71b939e1c6409ae44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26c0d886df4542d71b939e1c6409ae44");
        } else {
            this.f.b((k<d.a>) aVar);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f6836e7ea9e9ae1604bd00e7fd9fbf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f6836e7ea9e9ae1604bd00e7fd9fbf2");
        } else {
            this.g.b((k<Integer>) Integer.valueOf(i));
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec07627f4ec1cf5952fd98be9ac7ca8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec07627f4ec1cf5952fd98be9ac7ca8d");
            return;
        }
        this.I = z;
        this.q.b((k<Boolean>) Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29ee7c060558fc0ac74107a30865ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29ee7c060558fc0ac74107a30865ca4");
            return;
        }
        this.J = z;
        this.Y.b((k<Boolean>) Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5460a0f77edfb2c571c98d05afa09ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5460a0f77edfb2c571c98d05afa09ba7");
        } else {
            this.Z.b((k<Boolean>) Boolean.TRUE);
        }
    }

    public final void e(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b196ef54d923cb67356626f5557f7110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b196ef54d923cb67356626f5557f7110");
        } else {
            this.j.b((k<Boolean>) Boolean.TRUE);
        }
    }

    public final void f(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d4e22795e8a55f73cc6fda9d73e573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d4e22795e8a55f73cc6fda9d73e573");
        } else {
            this.r.b((k<Boolean>) Boolean.TRUE);
        }
    }

    public final void g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8c76dfb7fb410251dcec4bb8b05433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8c76dfb7fb410251dcec4bb8b05433");
        } else if (ad.b()) {
            this.y.b((k<Boolean>) Boolean.valueOf(z));
        } else {
            this.y.a((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void h(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d5d2cbf723fb0d5c52af045046cb9fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d5d2cbf723fb0d5c52af045046cb9fb");
        } else {
            this.k.b((k<Boolean>) Boolean.TRUE);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad66802ac35e923da493d1fa3086d1ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad66802ac35e923da493d1fa3086d1ea");
        } else {
            this.u.b((k<Void>) null);
        }
    }

    public final void i(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16cd1b9605d27cbae1888699c76060f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16cd1b9605d27cbae1888699c76060f3");
        } else if (ad.b()) {
            this.X.b((k<Boolean>) Boolean.TRUE);
        } else {
            this.X.a((k<Boolean>) Boolean.TRUE);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09da9bb51ef6b37507e8fee080e4b63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09da9bb51ef6b37507e8fee080e4b63c");
        } else {
            this.z.b((k<Void>) null);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f27402df245243d6095d8a39fbea96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f27402df245243d6095d8a39fbea96");
        } else if (ad.b()) {
            this.m.b((k<Pair<String, Boolean>>) new Pair<>(str, Boolean.valueOf(z)));
        } else {
            this.m.a((k<Pair<String, Boolean>>) new Pair<>(str, Boolean.valueOf(z)));
        }
    }

    public final void a(FilterBarViewController.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dddebabd3dc2d0a69b9068338345323a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dddebabd3dc2d0a69b9068338345323a");
        } else {
            this.G.add(aVar);
        }
    }

    public final void j(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3d4e0e5e4d6d8c9fa3d813a38d0b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3d4e0e5e4d6d8c9fa3d813a38d0b52");
        } else {
            this.B.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void k(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be28f5dce0e6bb581ca75f57b8e1a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be28f5dce0e6bb581ca75f57b8e1a5c");
        } else {
            this.F.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44fe704a6d2def37330903d2f3f08078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44fe704a6d2def37330903d2f3f08078");
        } else {
            this.x.b((k<Integer>) Integer.valueOf(i));
        }
    }
}
