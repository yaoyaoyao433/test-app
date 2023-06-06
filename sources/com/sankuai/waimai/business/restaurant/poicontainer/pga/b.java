package com.sankuai.waimai.business.restaurant.poicontainer.pga;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.util.LongSparseArray;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory;
import com.sankuai.waimai.business.restaurant.base.repository.model.OperationPoiCategory;
import com.sankuai.waimai.business.restaurant.framework.backpress.OnBackPressedDispatcher;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.a;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.PrioritySmoothNestedScrollView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.core.a {
    public static ChangeQuickRedirect s;
    public com.meituan.android.cube.pga.common.b<Integer> A;
    public com.meituan.android.cube.pga.common.g<CoordinatorLayout> B;
    public com.meituan.android.cube.pga.common.g<Boolean> C;
    public com.meituan.android.cube.pga.common.g<RestaurantSchemeParams> D;
    public a E;
    public h F;
    @NonNull
    public C0847b G;
    public final c H;
    public final f I;
    public com.meituan.android.cube.pga.common.b<i.b<Poi, RestRecommendPoi, Boolean>> J;
    public final d K;
    public final g L;
    public final e M;
    private com.meituan.android.cube.pga.common.b<Poi> N;
    private com.meituan.android.cube.pga.common.b<Poi> O;
    private com.meituan.android.cube.pga.common.b<Poi> P;
    private com.meituan.android.cube.pga.common.b<Integer> Q;
    private com.meituan.android.cube.pga.common.b<String> R;
    private com.meituan.android.cube.pga.common.g<Integer> S;
    private com.meituan.android.cube.pga.common.g<Integer> T;
    private com.meituan.android.cube.pga.common.g<ViewGroup> U;
    private com.meituan.android.cube.pga.common.h V;
    private com.meituan.android.cube.pga.common.b<Integer> W;
    private com.meituan.android.cube.pga.common.b<Integer> X;
    public com.meituan.android.cube.pga.common.b<Integer> t;
    public com.meituan.android.cube.pga.common.g<com.sankuai.waimai.business.restaurant.base.manager.order.g> u;
    public com.meituan.android.cube.pga.common.g<Poi> v;
    public com.meituan.android.cube.pga.common.g<String> w;
    public com.meituan.android.cube.pga.common.b<Pair<Integer, Boolean>> x;
    public com.meituan.android.cube.pga.common.b<Integer> y;
    public com.meituan.android.cube.pga.common.b<Poi> z;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d910abc2571e48c6fb03452417d35949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d910abc2571e48c6fb03452417d35949");
            return;
        }
        this.N = new com.meituan.android.cube.pga.common.b<>();
        this.O = new com.meituan.android.cube.pga.common.b<>();
        this.P = new com.meituan.android.cube.pga.common.b<>();
        this.Q = new com.meituan.android.cube.pga.common.b<>();
        this.R = new com.meituan.android.cube.pga.common.b<>();
        this.t = new com.meituan.android.cube.pga.common.b<>();
        this.S = new com.meituan.android.cube.pga.common.g<>();
        this.u = new com.meituan.android.cube.pga.common.g<>();
        this.T = new com.meituan.android.cube.pga.common.g<>();
        this.v = new com.meituan.android.cube.pga.common.g<>();
        this.w = new com.meituan.android.cube.pga.common.g<>();
        this.x = new com.meituan.android.cube.pga.common.b<>();
        this.y = new com.meituan.android.cube.pga.common.b<>();
        this.z = new com.meituan.android.cube.pga.common.b<>();
        this.A = new com.meituan.android.cube.pga.common.b<>();
        this.U = new com.meituan.android.cube.pga.common.g<>();
        this.B = new com.meituan.android.cube.pga.common.g<>();
        this.C = new com.meituan.android.cube.pga.common.g<>();
        this.V = new com.meituan.android.cube.pga.common.h();
        this.W = new com.meituan.android.cube.pga.common.b<>();
        this.X = new com.meituan.android.cube.pga.common.b<>();
        this.D = new com.meituan.android.cube.pga.common.g<>();
        this.E = new a();
        this.F = new h();
        this.G = new C0847b();
        this.H = new c();
        this.I = new f();
        this.J = new com.meituan.android.cube.pga.common.b<>();
        this.K = new d();
        this.L = new g();
        this.M = new e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public com.meituan.android.cube.pga.common.g<ViewGroup> a = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b b = new com.meituan.android.cube.pga.common.b();
        public com.meituan.android.cube.pga.common.b c = new com.meituan.android.cube.pga.common.b();
        public com.meituan.android.cube.pga.common.b d = new com.meituan.android.cube.pga.common.b();
        public com.meituan.android.cube.pga.common.b<Boolean> e = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<LongSparseArray<Integer>> f = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> g = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b h = new com.meituan.android.cube.pga.common.b();
        public com.meituan.android.cube.pga.common.b<Float> i = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b j = new com.meituan.android.cube.pga.common.b();
        public com.meituan.android.cube.pga.common.b<View> k = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> l = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> m = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Void> n = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<com.meituan.android.cube.pga.action.b> o = new com.meituan.android.cube.pga.common.b<>();

        public a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class h {
        public com.meituan.android.cube.pga.common.g<com.sankuai.waimai.restaurant.shopcart.config.a> a = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b<Object> b = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> c = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> d = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> e = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> f = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> g = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> h = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> i = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Object> j = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<View> k = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Float> l = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> m = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<i.a<Activity, View, String, GoodsSpu>> n = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<i.a<Activity, GoodsSpu, Integer, Boolean>> o = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> p = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> q = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> r = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> s = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<View> t = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.g<View> u = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.g<com.sankuai.waimai.restaurant.shopcart.ui.h> v = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.g<List<com.sankuai.waimai.business.restaurant.base.shopcart.g>> w = new com.meituan.android.cube.pga.common.g<>();

        public h() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.pga.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0847b {
        @Deprecated
        public com.meituan.android.cube.pga.common.b<a.C0846a<GoodsSpu, String, String, Long, Integer>> a = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Comment> b = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<View> c = new com.meituan.android.cube.pga.common.g<>();

        public C0847b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class c {
        public com.meituan.android.cube.pga.common.b<Boolean> a = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> b = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> c = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<Boolean> d = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b<Void> e = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<Boolean> f = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b<Pair<OperationPoiCategory, Poi>> g = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<View> h = new com.meituan.android.cube.pga.common.b<>();

        public c() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class f {
        public com.meituan.android.cube.pga.common.b<Boolean> a = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Void> b = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Void> c = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> d = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<Boolean> e = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b<Boolean> f = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Boolean> g = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<Long> h = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.g<Boolean> i = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.g<OnBackPressedDispatcher> j = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b<Void> k = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.g<Integer> l = new com.meituan.android.cube.pga.common.g<>();
        public com.meituan.android.cube.pga.common.b<Integer> m = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Void> n = new com.meituan.android.cube.pga.common.b<>();

        public f() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d {
        public static ChangeQuickRedirect a;
        public com.meituan.android.cube.pga.common.b<Void> b;
        public com.meituan.android.cube.pga.common.b<Integer> c;
        public com.meituan.android.cube.pga.common.b<i.c<Integer, Boolean>> d;
        public com.meituan.android.cube.pga.common.b<i.c<Integer, Boolean>> e;
        public com.meituan.android.cube.pga.common.b<Integer> f;
        public com.meituan.android.cube.pga.common.b<Integer> g;
        public com.meituan.android.cube.pga.common.b<i.c<Integer, GoodsSpu>> h;
        public com.meituan.android.cube.pga.common.g<GoodsSpu> i;
        public com.meituan.android.cube.pga.common.b<i.c<Integer, Integer>> j;
        public com.meituan.android.cube.pga.common.b<Void> k;
        public com.meituan.android.cube.pga.common.b<Boolean> l;
        public com.meituan.android.cube.pga.common.b<List<GoodsSpu>> m;
        public com.meituan.android.cube.pga.common.g<List<GoodsSpu>> n;
        public com.meituan.android.cube.pga.common.b<i.c<Integer, GoodsPoiCategory>> o;
        public com.meituan.android.cube.pga.common.b<Void> p;
        public com.meituan.android.cube.pga.common.b<Void> q;
        public com.meituan.android.cube.pga.common.b<Boolean> r;
        public com.meituan.android.cube.pga.common.g<Boolean> s;
        public com.meituan.android.cube.pga.common.b<Void> t;
        public com.meituan.android.cube.pga.common.g<com.sankuai.waimai.business.restaurant.poicontainer.helper.b> u;
        public com.meituan.android.cube.pga.common.b<Integer> v;
        public com.meituan.android.cube.pga.common.g<PrioritySmoothNestedScrollView> w;

        public d() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35fd56efdac79c7f99764f5fe8131df0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35fd56efdac79c7f99764f5fe8131df0");
                return;
            }
            this.b = new com.meituan.android.cube.pga.common.b<>();
            this.c = new com.meituan.android.cube.pga.common.b<>();
            this.d = new com.meituan.android.cube.pga.common.b<>();
            this.e = new com.meituan.android.cube.pga.common.b<>();
            this.f = new com.meituan.android.cube.pga.common.b<>();
            this.g = new com.meituan.android.cube.pga.common.b<>();
            this.h = new com.meituan.android.cube.pga.common.b<>();
            this.i = new com.meituan.android.cube.pga.common.g<>();
            this.j = new com.meituan.android.cube.pga.common.b<>();
            this.k = new com.meituan.android.cube.pga.common.b<>();
            this.l = new com.meituan.android.cube.pga.common.b<>();
            this.m = new com.meituan.android.cube.pga.common.b<>();
            this.n = new com.meituan.android.cube.pga.common.g<>();
            this.o = new com.meituan.android.cube.pga.common.b<>();
            this.p = new com.meituan.android.cube.pga.common.b<>();
            this.q = new com.meituan.android.cube.pga.common.b<>();
            this.r = new com.meituan.android.cube.pga.common.b<>();
            this.s = new com.meituan.android.cube.pga.common.g<>();
            this.t = new com.meituan.android.cube.pga.common.b<>();
            this.u = new com.meituan.android.cube.pga.common.g<>();
            this.v = new com.meituan.android.cube.pga.common.b<>();
            this.w = new com.meituan.android.cube.pga.common.g<>();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class g {
        public com.meituan.android.cube.pga.common.b<com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c> a = new com.meituan.android.cube.pga.common.b<>();
        public com.meituan.android.cube.pga.common.b<Integer> b = new com.meituan.android.cube.pga.common.b<>();

        public g() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class e {
        public com.meituan.android.cube.pga.common.b<Integer> a = new com.meituan.android.cube.pga.common.b<>();

        public e() {
        }
    }
}
