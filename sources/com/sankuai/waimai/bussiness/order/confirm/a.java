package com.sankuai.waimai.bussiness.order.confirm;

import android.arch.lifecycle.k;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.android.cube.pga.common.g;
import com.meituan.android.cube.pga.common.h;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.confirm.block.a;
import com.sankuai.waimai.business.order.api.submit.model.BusinessType;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.order.api.submit.model.OrderTagInfo;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.business.order.submit.model.OrderDeliveryTipArea;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.LogicInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.d;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.e;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.rocks.page.a implements com.sankuai.waimai.business.order.api.confirm.block.a, f, com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.b, com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.a, com.sankuai.waimai.bussiness.order.confirm.pgablock.merchantinfo.a, com.sankuai.waimai.bussiness.order.confirm.pgablock.root.a, d, e, com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo.a, com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b {
    public static ChangeQuickRedirect s;
    public k<List<ExpInfo>> A;
    public k<String> B;
    public j<Boolean> C;
    public k<String> D;
    public k<String> E;
    public j<Double> F;
    public j<Double> G;
    public j<Integer> H;
    public j<String> I;
    public j<LogicInfo> J;
    public g<Boolean> K;
    public com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>> L;
    public com.meituan.android.cube.pga.common.b<Map<String, String>> M;
    public com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>> N;
    public com.meituan.android.cube.pga.common.b<a.C0751a> O;
    com.meituan.android.cube.pga.common.b<a.C0751a> P;
    public g<ObservableScrollView> Q;
    public g<RecyclerView> R;
    public com.meituan.android.cube.pga.common.b<Void> S;
    public g<View> T;
    com.meituan.android.cube.pga.common.b<Integer> U;
    public g<Rect> V;
    public g<String> W;
    public com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c> X;
    g<PhoneInfo> Y;
    public com.meituan.android.cube.pga.common.b<i.c<Integer, Integer>> Z;
    public g<Integer> aA;
    public com.meituan.android.cube.pga.common.b<Void> aB;
    public g<com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e> aC;
    public com.meituan.android.cube.pga.common.a<CollectOrderFoodParams, Boolean> aD;
    public g<Boolean> aE;
    public g<Boolean> aF;
    public g<View> aG;
    public com.meituan.android.cube.pga.common.b<Boolean> aH;
    public g<View> aI;
    public g<Void> aJ;
    public com.meituan.android.cube.pga.common.b<String> aK;
    public g<LinearLayout> aL;
    public com.meituan.android.cube.pga.common.b<Void> aM;
    public com.meituan.android.cube.pga.common.b<i.c<Long, Integer>> aN;
    public com.meituan.android.cube.pga.common.b<i.c<Float, Float>> aO;
    public com.meituan.android.cube.pga.common.b<Float> aP;
    public g<Integer> aQ;
    public g<RelativeLayout> aR;
    public g<String> aS;
    g<List<OrderedFood>> aT;
    public com.meituan.android.cube.pga.common.b<String> aU;
    public g<Void> aV;
    public com.meituan.android.cube.pga.common.b<String> aW;
    public j<String> aX;
    public j<String> aY;
    j<String> aZ;
    public h aa;
    public com.meituan.android.cube.pga.common.b<Integer> ab;
    public com.meituan.android.cube.pga.common.b<Map<String, Object>> ac;
    public com.meituan.android.cube.pga.common.b<Map<String, Object>> ad;
    public com.meituan.android.cube.pga.common.b<Map<String, Object>> ae;
    public g<AddressItem> af;
    public g<Boolean> ag;
    public h ah;
    g<Boolean> ai;
    h aj;
    public g<Boolean> ak;
    g<Boolean> al;
    h am;
    public com.meituan.android.cube.pga.common.b<Map<String, Object>> an;
    public g<Void> ao;
    public k<List<OrderTagInfo>> ap;
    public g<Integer> aq;
    public g<String> ar;
    public g<Integer> as;
    public g<Integer> at;
    public j<Boolean> au;
    public g<Boolean> av;
    g<String> aw;
    public h ax;
    public h ay;
    public com.meituan.android.cube.pga.common.b<i.c<String, String>> az;
    @NonNull
    private final f bL;
    private g<Map> bM;
    private g<String> bN;
    private com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>> bO;
    private com.meituan.android.cube.pga.common.b<List<com.sankuai.waimai.bussiness.order.confirm.helper.d>> bP;
    private com.meituan.android.cube.pga.common.b<Object> bQ;
    private com.meituan.android.cube.pga.common.b<Object> bR;
    private g<Map<String, Object>> bS;
    private g<AddressItem> bT;
    private g<AddressItem> bU;
    private g<Boolean> bV;
    private g<String> bW;
    private j<Boolean> bX;
    private j<Boolean> bY;
    private g<String> bZ;
    public g<Void> ba;
    com.meituan.android.cube.pga.common.b<Boolean> bb;
    com.meituan.android.cube.pga.common.b<Void> bc;
    public g<Boolean> bd;
    g<Double> be;
    g<Double> bf;
    public g<String> bg;
    public g<Integer> bh;
    public g<String> bi;
    public g<String> bj;
    public g<Boolean> bk;
    public g<Integer> bl;
    g<Void> bm;
    g<Map<String, Object>> bn;
    public com.meituan.android.cube.pga.common.b<Integer> bo;
    public com.meituan.android.cube.pga.common.b<Integer> bp;
    private com.meituan.android.cube.pga.common.b<String> cA;
    private com.meituan.android.cube.pga.common.b<Map<String, Object>> cB;
    private g<Map<String, Object>> cC;
    private g<com.sankuai.waimai.bussiness.order.confirm.model.c> cD;
    private g<Object> cE;
    private com.meituan.android.cube.pga.common.b<Void> cF;
    private com.meituan.android.cube.pga.common.b<JSONObject> cG;
    private g<String> cH;
    private g<Integer> cI;
    private g<String> cJ;
    private g<Integer> cK;
    private g<Integer> cL;
    private g<String> cM;
    private g<String> cN;
    private j<Integer> cO;
    private g<Void> cP;
    private g<String> cQ;
    private com.meituan.android.cube.pga.common.b<Integer> cR;
    private g<Integer> ca;
    private g<OrderDeliveryTipArea> cb;
    private g<Integer> cc;
    private g<Integer> cd;
    private g<Integer> ce;
    private g<Boolean> cf;
    private g<Boolean> cg;
    private g<String> ch;
    private com.meituan.android.cube.pga.common.b<Void> ci;
    private g<Boolean> cj;
    private g<PhoneInfo> ck;
    private g<Integer> cl;
    private g<String> cm;

    /* renamed from: cn  reason: collision with root package name */
    private g<List<OrderedFood>> f32cn;
    private g<List<OrderFoodOutput>> co;
    private g<Integer> cp;
    private com.meituan.android.cube.pga.common.b<Boolean> cq;
    private g<String> cr;
    private g<Boolean> cs;
    private g<List<Map<String, Object>>> ct;
    private g<List<Map<String, Object>>> cu;
    private g<String> cv;
    private g<Long> cw;
    private g<Long> cx;
    private g<List<Map<String, Object>>> cy;
    private g<Boolean> cz;
    public j<String> t;
    public g<Long> u;
    public g<Boolean> v;
    public g<Integer> w;
    public g<BusinessType> x;
    public g<CallbackInfo> y;
    public g<List<BusinessType>> z;

    public a(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7eaf2f351c1d84065df1d1c518dd89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7eaf2f351c1d84065df1d1c518dd89");
            return;
        }
        this.t = new j<>("");
        this.u = new g<>();
        this.v = new g<>();
        this.w = new g<>();
        this.x = new g<>();
        this.y = new g<>();
        this.bM = new g<>();
        this.z = new g<>();
        this.A = new k<>();
        this.B = new k<>();
        this.C = new j<>(Boolean.FALSE);
        this.D = new k<>();
        this.E = new k<>();
        this.F = new j<>(Double.valueOf(0.0d));
        this.G = new j<>(Double.valueOf(0.0d));
        this.bN = new g<>();
        this.H = new j<>(0);
        this.I = new j<>("");
        this.J = new j<>(null);
        this.K = new g<>();
        this.L = new com.meituan.android.cube.pga.common.b<>();
        this.bO = new com.meituan.android.cube.pga.common.b<>();
        this.M = new com.meituan.android.cube.pga.common.b<>();
        this.N = new com.meituan.android.cube.pga.common.b<>();
        this.O = new com.meituan.android.cube.pga.common.b<>();
        this.P = new com.meituan.android.cube.pga.common.b<>();
        this.bP = new com.meituan.android.cube.pga.common.b<>();
        this.bQ = new com.meituan.android.cube.pga.common.b<>();
        this.bR = new com.meituan.android.cube.pga.common.b<>();
        this.bS = new g<>();
        this.Q = new g<>();
        this.R = new g<>();
        this.S = new com.meituan.android.cube.pga.common.b<>();
        this.T = new g<>();
        this.U = new com.meituan.android.cube.pga.common.b<>();
        this.V = new g<>();
        this.W = new g<>();
        this.X = new com.meituan.android.cube.pga.common.b<>();
        this.Y = new g<>();
        this.Z = new com.meituan.android.cube.pga.common.b<>();
        this.aa = new h();
        this.ab = new com.meituan.android.cube.pga.common.b<>();
        this.ac = new com.meituan.android.cube.pga.common.b<>();
        this.ad = new com.meituan.android.cube.pga.common.b<>();
        this.ae = new com.meituan.android.cube.pga.common.b<>();
        this.af = new g<>();
        this.bT = new g<>();
        this.bU = new g<>();
        this.bV = new g<>();
        this.ag = new g<>();
        this.ah = new h();
        this.ai = new g<>();
        this.aj = new h();
        this.ak = new g<>();
        this.al = new g<>();
        this.am = new h();
        this.an = new com.meituan.android.cube.pga.common.b<>();
        this.ao = new g<>();
        this.ap = new k<>();
        this.aq = new g<>();
        this.ar = new g<>();
        this.as = new g<>();
        this.at = new g<>();
        this.au = new j<>(Boolean.TRUE);
        this.bW = new g<>();
        this.bX = new j<>(Boolean.TRUE);
        this.bY = new j<>(Boolean.TRUE);
        this.av = new g<>();
        this.bZ = new g<>();
        this.ca = new g<>();
        this.aw = new g<>();
        this.cb = new g<>();
        this.cc = new g<>();
        this.cd = new g<>();
        this.ax = new h();
        this.ay = new h();
        this.ce = new g<>();
        this.cf = new g<>();
        this.az = new com.meituan.android.cube.pga.common.b<>();
        this.cg = new g<>();
        this.ch = new g<>();
        this.aA = new g<>();
        this.ci = new com.meituan.android.cube.pga.common.b<>();
        this.aB = new com.meituan.android.cube.pga.common.b<>();
        this.aC = new g<>();
        this.aD = new com.meituan.android.cube.pga.common.a<>();
        this.aE = new g<>();
        this.aF = new g<>();
        this.aG = new g<>();
        this.aH = new com.meituan.android.cube.pga.common.b<>();
        this.aI = new g<>();
        this.aJ = new g<>();
        this.aK = new com.meituan.android.cube.pga.common.b<>();
        this.aL = new g<>();
        this.cj = new g<>();
        this.aM = new com.meituan.android.cube.pga.common.b<>();
        this.aN = new com.meituan.android.cube.pga.common.b<>();
        this.aO = new com.meituan.android.cube.pga.common.b<>();
        this.aP = new com.meituan.android.cube.pga.common.b<>();
        this.aQ = new g<>();
        this.ck = new g<>();
        this.cl = new g<>();
        this.cm = new g<>();
        this.aR = new g<>();
        this.f32cn = new g<>();
        this.co = new g<>();
        this.aS = new g<>();
        this.aT = new g<>();
        this.cp = new g<>();
        this.cq = new com.meituan.android.cube.pga.common.b<>();
        this.aU = new com.meituan.android.cube.pga.common.b<>();
        this.aV = new g<>();
        this.aW = new com.meituan.android.cube.pga.common.b<>();
        this.cr = new g<>();
        this.aX = new j<>("");
        this.aY = new j<>("");
        this.aZ = new j<>("");
        this.ba = new g<>();
        this.bb = new com.meituan.android.cube.pga.common.b<>();
        this.cs = new g<>();
        this.ct = new g<>();
        this.cu = new g<>();
        this.cv = new g<>();
        this.cw = new g<>();
        this.cx = new g<>();
        this.cy = new g<>();
        this.cz = new g<>();
        this.cA = new com.meituan.android.cube.pga.common.b<>();
        this.cB = new com.meituan.android.cube.pga.common.b<>();
        this.cC = new g<>();
        this.cD = new g<>();
        this.cE = new g<>();
        this.bc = new com.meituan.android.cube.pga.common.b<>();
        this.cF = new com.meituan.android.cube.pga.common.b<>();
        this.cG = new com.meituan.android.cube.pga.common.b<>();
        this.bd = new g<>();
        this.be = new g<>();
        this.cH = new g<>();
        this.cI = new g<>();
        this.bf = new g<>();
        this.cJ = new g<>();
        this.cK = new g<>();
        this.cL = new g<>();
        this.cM = new g<>();
        this.bg = new g<>();
        this.bh = new g<>();
        this.bi = new g<>();
        this.bj = new g<>();
        this.bk = new g<>();
        this.cN = new g<>();
        this.bl = new g<>();
        this.bm = new g<>();
        this.cO = new j<>(8);
        this.cP = new g<>();
        this.cQ = new g<>();
        this.bn = new g<>();
        this.cR = new com.meituan.android.cube.pga.common.b<>();
        this.bo = new com.meituan.android.cube.pga.common.b<>();
        this.bp = new com.meituan.android.cube.pga.common.b<>();
        this.bL = fVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final long aH_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d112b4cb58d508117d46d5367b1a62", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d112b4cb58d508117d46d5367b1a62")).longValue() : this.bL.aH_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final String aI_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f982a9978d7b38c92d134ffad4c8e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f982a9978d7b38c92d134ffad4c8e2") : this.bL.aI_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final boolean aJ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9309f74703dca01ca78ae8fc8699328", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9309f74703dca01ca78ae8fc8699328")).booleanValue() : this.bL.aJ_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final int aK_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e10e5093627fb0e5c0f297b3051c49", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e10e5093627fb0e5c0f297b3051c49")).intValue() : this.bL.aK_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9081f446f22ee61b10e0710144eac248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9081f446f22ee61b10e0710144eac248");
        } else {
            this.bL.a(map);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a, com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a5f9ae2d0ebe0d6aa208394763cd1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a5f9ae2d0ebe0d6aa208394763cd1e");
        } else {
            this.bL.a(i);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "331262419c8c5587f88a46248ef5fcab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "331262419c8c5587f88a46248ef5fcab");
        } else {
            this.bL.b(map);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8107d351b112d9df6d2ccf9bc5795f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8107d351b112d9df6d2ccf9bc5795f");
        } else {
            this.bL.a(i, z);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(int i, ArrayList<AdditionalBargain.AdditionalBargainDetail> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0030b169e559537978371b8317156af5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0030b169e559537978371b8317156af5");
        } else {
            this.bL.a(i, arrayList);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final int aL_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2062392d52b73f5a9e7419cabcdaa5b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2062392d52b73f5a9e7419cabcdaa5b4")).intValue() : this.bL.aL_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final boolean aM_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c2fc529945e591d359743dedc55790", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c2fc529945e591d359743dedc55790")).booleanValue() : this.bL.aM_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final Typeface aN_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe30bf77e00c658bb3e45318a559e38", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe30bf77e00c658bb3e45318a559e38") : this.bL.aN_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final boolean aO_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d031ca552835de14944db03b74569517", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d031ca552835de14944db03b74569517")).booleanValue() : this.bL.aO_();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1177e45bd7800c40bfe6473f14477ea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1177e45bd7800c40bfe6473f14477ea3");
        } else {
            this.bL.b(i);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a, com.sankuai.waimai.bussiness.order.confirm.helper.f
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe8cef7472ef40c86adef2e8b56fff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe8cef7472ef40c86adef2e8b56fff5");
        } else {
            this.bL.a(view);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<Long> i() {
        return this.u;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<Boolean> t() {
        return this.v;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<Map> k() {
        return this.bM;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final k<List<ExpInfo>> j() {
        return this.A;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<String> l() {
        return this.bN;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>> n() {
        return this.L;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>> p() {
        return this.N;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>> o() {
        return this.N;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final com.meituan.android.cube.pga.common.b<a.C0751a> q() {
        return this.O;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final com.meituan.android.cube.pga.common.b<Integer> m() {
        return this.U;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<Boolean> v() {
        return this.ai;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final h w() {
        return this.aj;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<String> u() {
        return this.ch;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final com.meituan.android.cube.pga.common.b<Void> r() {
        return this.ci;
    }

    @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.b
    public final com.meituan.android.cube.pga.common.b<i.c<Long, Integer>> x() {
        return this.aN;
    }

    @Override // com.sankuai.waimai.business.order.api.confirm.block.a
    public final g<Map<String, Object>> s() {
        return this.bn;
    }
}
