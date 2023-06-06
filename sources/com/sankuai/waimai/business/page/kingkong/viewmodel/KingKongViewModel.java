package com.sankuai.waimai.business.page.kingkong.viewmodel;

import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.common.model.b;
import com.sankuai.waimai.business.page.common.net.response.ChannelBannerInfoResponseV8;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.poi.TodayRecommendPoi;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KingKongViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    private k<b> A;
    private k<Float> B;
    public k<com.sankuai.waimai.business.page.kingkong.net.b> b;
    public k<d.a> c;
    public k<KingkongInfo> d;
    public k e;
    public k<Boolean> f;
    public k<Boolean> g;
    public k<Boolean> h;
    public k<Boolean> i;
    public k<Pair<String, Boolean>> j;
    public k<b> k;
    public List<FilterBarViewController.a> l;
    public k<Boolean> m;
    public k<Boolean> n;
    public k<Boolean> o;
    public k<Float> p;
    private k<Integer> q;
    private k<Object> r;
    private k<Integer> s;
    private k<Boolean> t;
    private k<Boolean> u;
    private k<Boolean> v;
    private k<TodayRecommendPoi> w;
    private k<BaseResponse<ChannelBannerInfoResponseV8>> x;
    private k<Boolean> y;
    private k<Integer> z;

    public KingKongViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a527b63f32270732ee1069ccdd15770a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a527b63f32270732ee1069ccdd15770a");
            return;
        }
        this.b = new k<>();
        this.q = new k<>();
        this.c = new k<>();
        this.d = new k<>();
        this.e = new k();
        this.r = new k<>();
        this.s = new k<>();
        this.t = new k<>();
        this.u = new k<>();
        this.v = new k<>();
        this.f = new k<>();
        this.g = new k<>();
        this.h = new k<>();
        this.w = new k<>();
        this.x = new k<>();
        this.y = new k<>();
        this.z = new k<>();
        this.i = new k<>();
        this.j = new k<>();
        this.A = new k<>();
        this.k = new k<>();
        this.l = new ArrayList();
        this.m = new k<>();
        this.n = new k<>();
        this.o = new k<>();
        this.B = new k<>();
        this.p = new k<>();
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489502ea86857b25c4358ee47fcdd287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489502ea86857b25c4358ee47fcdd287");
        } else {
            this.j.b((k<Pair<String, Boolean>>) new Pair<>(str, Boolean.valueOf(z)));
        }
    }

    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75fab26a132d6318bd3600e965bdcdb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75fab26a132d6318bd3600e965bdcdb6");
        } else {
            this.c.b((k<d.a>) aVar);
        }
    }

    public final void a(KingkongInfo kingkongInfo) {
        Object[] objArr = {kingkongInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd238c1982056b1497892e9485d978c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd238c1982056b1497892e9485d978c");
        } else {
            this.d.b((k<KingkongInfo>) kingkongInfo);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25c8b03459bdcb849430986214a9d97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25c8b03459bdcb849430986214a9d97");
        } else {
            this.f.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762d37df27362b66e42dc63064672afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762d37df27362b66e42dc63064672afb");
        } else {
            this.A.b((k<b>) bVar);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d250e3747aadc2993d05340dfb9968f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d250e3747aadc2993d05340dfb9968f");
        } else {
            this.m.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800ebad5d095aa41e4945b156e848c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800ebad5d095aa41e4945b156e848c64");
        } else {
            this.o.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void a(Float f) {
        Object[] objArr = {f};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaca591e9d0cc65f7889627fda1b5860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaca591e9d0cc65f7889627fda1b5860");
        } else {
            this.B.b((k<Float>) f);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e22688fac63d0bcf58f791ca585374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e22688fac63d0bcf58f791ca585374");
        } else {
            this.p.b((k<Float>) Float.valueOf(f));
        }
    }
}
