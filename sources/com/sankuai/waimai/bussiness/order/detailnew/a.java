package com.sankuai.waimai.bussiness.order.detailnew;

import android.arch.lifecycle.k;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.cube.pga.common.g;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.order.api.detail.block.b;
import com.sankuai.waimai.business.order.api.detail.block.d;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderExtInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.l;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e;
import com.sankuai.waimai.bussiness.order.detailnew.util.h;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.rocks.view.block.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends c implements b, com.sankuai.waimai.business.order.api.detail.block.c, d, com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.a, com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.c, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.d, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.d, com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.a, com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.a, com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.c, com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.b, com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.d {
    public static ChangeQuickRedirect s;
    public k<com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b> A;
    public k<String> B;
    public k<String> C;
    public k<Long> D;
    public k<String> E;
    public k<String> F;
    public k<Integer> G;
    public k<Integer> H;
    public k<List<ExpInfo>> I;
    public k<com.sankuai.waimai.business.order.api.detail.model.a> J;
    public k<com.sankuai.waimai.business.order.api.detail.model.b> K;
    public k<RiderInfo> L;
    public k<n> M;
    public g<i> N;
    public g<String> O;
    public k<OrderExtInfo> P;
    public k<Integer> Q;
    public g<View> R;
    public g<TextView> S;
    public com.meituan.android.cube.pga.common.b<Boolean> T;
    public k<Boolean> U;
    public g<RecyclerView> V;
    public g<CustomDragExpandLayout> W;
    public com.meituan.android.cube.pga.common.b<i.c<Float, Boolean>> X;
    public g<String> Y;
    public com.meituan.android.cube.pga.common.b<Integer> Z;
    public j<Integer> aA;
    public k<Integer> aB;
    public j<com.sankuai.waimai.bussiness.order.rocks.n> aC;
    public final j<Mach.d> aD;
    public j<Integer> aE;
    public com.meituan.android.cube.pga.common.b<Boolean> aF;
    public com.meituan.android.cube.pga.common.b<Boolean> aG;
    public com.meituan.android.cube.pga.common.b<Boolean> aH;
    public j<Boolean> aI;
    private g<View> aJ;
    private g<Object> aK;
    private g<l> aL;
    private g<PrioritySmoothNestedScrollView> aM;
    private com.meituan.android.cube.pga.common.b<View> aN;
    private g<Double> aO;
    private k<String> aP;
    private g<com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c> aQ;
    public g<Boolean> aa;
    public com.meituan.android.cube.pga.common.b<i.a<Boolean, Integer, Boolean, Integer>> ab;
    public g<Integer> ac;
    public g<Integer> ad;
    public g<Boolean> ae;
    public com.meituan.android.cube.pga.common.b<Boolean> af;
    public g<com.sankuai.waimai.bussiness.order.detailnew.network.response.a> ag;
    public g<String> ah;
    public j<h.a> ai;
    public g<Boolean> aj;
    public g<Boolean> ak;
    public g<Boolean> al;
    public com.meituan.android.cube.pga.common.b<Integer> am;
    public com.meituan.android.cube.pga.common.b<String> an;
    public com.meituan.android.cube.pga.common.b<Boolean> ao;
    public com.meituan.android.cube.pga.common.b<Boolean> ap;
    public g<e> aq;
    public g<Integer> ar;
    public com.meituan.android.cube.pga.common.h as;
    public com.meituan.android.cube.pga.common.b<LongSparseArray<Integer>> at;
    public com.meituan.android.cube.pga.common.b<Integer> au;
    public com.meituan.android.cube.pga.common.b<Integer> av;
    public final g<Boolean> aw;
    public final g<Integer> ax;
    public final g<RecommendModel.a> ay;
    public j<Integer> az;
    public j<Boolean> t;
    public g<com.sankuai.waimai.business.order.api.detail.block.a> u;
    public g<Boolean> v;
    public g<Boolean> w;
    public g<Boolean> x;
    public g<ImageView> y;
    public g<Boolean> z;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d095f5257acf08c7c80863a9c3268b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d095f5257acf08c7c80863a9c3268b");
            return;
        }
        this.t = new j<>(Boolean.FALSE);
        this.u = new g<>();
        this.v = new g<>();
        this.w = new g<>();
        this.x = new g<>();
        this.aJ = new g<>();
        this.y = new g<>();
        this.z = new g<>();
        this.A = new k<>();
        this.B = new k<>();
        this.C = new k<>();
        this.D = new k<>();
        this.E = new k<>();
        this.F = new k<>();
        this.G = new k<>();
        this.H = new k<>();
        this.I = new k<>();
        this.J = new k<>();
        this.K = new k<>();
        this.L = new k<>();
        this.M = new k<>();
        this.aK = new g<>();
        this.N = new g<>();
        this.aL = new g<>();
        this.O = new g<>();
        this.P = new k<>();
        this.Q = new k<>();
        this.R = new g<>();
        this.S = new g<>();
        this.aM = new g<>();
        this.T = new com.meituan.android.cube.pga.common.b<>();
        this.aN = new com.meituan.android.cube.pga.common.b<>();
        this.U = new k<>();
        this.V = new g<>();
        this.W = new g<>();
        this.X = new com.meituan.android.cube.pga.common.b<>();
        this.Y = new g<>();
        this.Z = new com.meituan.android.cube.pga.common.b<>();
        this.aa = new g<>();
        this.ab = new com.meituan.android.cube.pga.common.b<>();
        this.ac = new g<>();
        this.ad = new g<>();
        this.ae = new g<>();
        this.af = new com.meituan.android.cube.pga.common.b<>();
        this.ag = new g<>();
        this.ah = new g<>();
        this.ai = new j<>(null);
        this.aj = new g<>();
        this.ak = new g<>();
        this.al = new g<>();
        this.am = new com.meituan.android.cube.pga.common.b<>();
        this.an = new com.meituan.android.cube.pga.common.b<>();
        this.ao = new com.meituan.android.cube.pga.common.b<>();
        this.ap = new com.meituan.android.cube.pga.common.b<>();
        this.aO = new g<>();
        this.aP = new k<>();
        this.aQ = new g<>();
        this.aq = new g<>();
        this.ar = new g<>();
        this.as = new com.meituan.android.cube.pga.common.h();
        this.at = new com.meituan.android.cube.pga.common.b<>();
        this.au = new com.meituan.android.cube.pga.common.b<>();
        this.av = new com.meituan.android.cube.pga.common.b<>();
        this.aw = new g<>();
        this.ax = new g<>();
        this.ay = new g<>();
        this.az = new j<>(null);
        this.aA = new j<>(null);
        this.aB = new k<>();
        this.aC = new j<>(null);
        this.aD = new j<>(null);
        this.aE = new j<>(null);
        this.aF = new com.meituan.android.cube.pga.common.b<>();
        this.aG = new com.meituan.android.cube.pga.common.b<>();
        this.aH = new com.meituan.android.cube.pga.common.b<>();
        this.aI = new j<>(Boolean.FALSE);
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.b
    public final k<String> i() {
        return this.C;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.b
    public final k<Long> j() {
        return this.D;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.b
    public final k<String> k() {
        return this.E;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.b
    public final k<com.sankuai.waimai.business.order.api.detail.model.a> l() {
        return this.J;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.c
    public final com.meituan.android.cube.pga.common.b<Boolean> m() {
        return this.T;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.c
    public final com.meituan.android.cube.pga.common.b<View> n() {
        return this.aN;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.c
    public final k<Boolean> o() {
        return this.U;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.c
    public final g<RecyclerView> p() {
        return this.V;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.d
    public final com.meituan.android.cube.pga.common.b<Integer> q() {
        return this.au;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.d
    public final com.meituan.android.cube.pga.common.b<Integer> r() {
        return this.av;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.d
    public final g<Boolean> s() {
        return this.aw;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.d
    public final g<Integer> t() {
        return this.ax;
    }
}
