package com.sankuai.waimai.business.page.kingkong;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.cube.pga.action.c;
import com.meituan.android.cube.pga.common.e;
import com.meituan.android.cube.pga.common.g;
import com.meituan.android.cube.pga.common.j;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.b;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.common.second.b;
import com.sankuai.waimai.business.page.kingkong.future.ai.b;
import com.sankuai.waimai.business.page.kingkong.future.bean.ResponseMsgBean;
import com.sankuai.waimai.business.page.kingkong.future.bean.ScrollToOffsetBean;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.platform.widget.pullrefresh.NestedPullRefreshView;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.rocks.page.a implements com.sankuai.waimai.ad.b, com.sankuai.waimai.business.page.kingkong.view.poilist.a {
    public static ChangeQuickRedirect s;
    public g<Integer> A;
    public com.meituan.android.cube.pga.common.b<Integer> B;
    public g<com.sankuai.waimai.business.page.common.model.b> C;
    public com.meituan.android.cube.pga.common.b<b.a> D;
    public com.meituan.android.cube.pga.common.b<Long> E;
    public com.meituan.android.cube.pga.common.b<b.a> F;
    public com.meituan.android.cube.pga.common.b<Void> G;
    public g<Boolean> H;
    public g<Boolean> I;
    public g<View> J;
    public g<Integer> K;
    public g<Integer> L;
    public g<Integer> M;
    public com.meituan.android.cube.pga.common.b<List<RecommendedSearchKeyword>> N;
    public com.meituan.android.cube.pga.common.b<Boolean> O;
    public com.meituan.android.cube.pga.common.b<RocksServerModel> P;
    public com.meituan.android.cube.pga.common.b<Boolean> Q;
    public g<String> R;
    public com.meituan.android.cube.pga.common.b<Integer> S;
    public g<d> T;
    public com.meituan.android.cube.pga.common.b<Integer> U;
    public com.meituan.android.cube.pga.common.b<Integer> V;
    public com.meituan.android.cube.pga.common.b<com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a> W;
    public com.meituan.android.cube.pga.common.b<ScrollToOffsetBean> X;
    public com.meituan.android.cube.pga.common.b<ResponseMsgBean> Y;
    public com.meituan.android.cube.pga.common.b<Boolean> Z;
    private g<Boolean> aA;
    public j<Integer> aa;
    public com.meituan.android.cube.pga.common.b<Integer> ab;
    public g<View> ac;
    public g<com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b> ad;
    public g<com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a> ae;
    public g<ArrayList<e>> af;
    public g<Boolean> ag;
    g<Boolean> ah;
    public com.meituan.android.cube.pga.common.b<Void> ai;
    public com.meituan.android.cube.pga.common.b<Boolean> aj;
    public com.meituan.android.cube.pga.common.b<Void> ak;
    public com.meituan.android.cube.pga.common.b<Void> al;
    public com.meituan.android.cube.pga.common.b<f<FkkPreloadResponse>> am;
    public com.meituan.android.cube.pga.common.b<f<FkkPreloadResponse>> an;
    public g<MetricsSpeedMeterTask> ao;
    private com.meituan.android.cube.pga.common.b<Void> ap;
    private g<NestedPullRefreshView> aq;
    private com.meituan.android.cube.pga.common.b<Integer> ar;
    private com.meituan.android.cube.pga.common.b<Integer> as;
    private g<Integer> at;
    private g<Integer> au;
    private g<Integer> av;
    private com.meituan.android.cube.pga.common.b<Void> aw;
    private g<Boolean> ax;
    private g<Boolean> ay;
    private g<Boolean> az;
    public g<com.sankuai.waimai.business.page.kingkong.net.a> t;
    public g<com.sankuai.waimai.business.page.kingkong.future.network.e> u;
    public g<com.sankuai.waimai.business.page.kingkong.future.network.b> v;
    public g<KingkongInfo> w;
    public com.meituan.android.cube.pga.common.b<Void> x;
    public com.meituan.android.cube.pga.common.b<Integer> y;
    public g<com.sankuai.waimai.business.page.common.second.b> z;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd6f8ee66ea515650031a26f976d048", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd6f8ee66ea515650031a26f976d048");
            return;
        }
        this.t = new g<>();
        this.u = new g<>();
        this.v = new g<>();
        this.w = new g<>();
        this.x = new com.meituan.android.cube.pga.common.b<>();
        this.y = new com.meituan.android.cube.pga.common.b<>();
        this.ap = new com.meituan.android.cube.pga.common.b<>();
        this.aq = new g<>();
        this.z = new g<>();
        this.A = new g<>();
        this.B = new com.meituan.android.cube.pga.common.b<>();
        this.C = new g<>();
        this.D = new com.meituan.android.cube.pga.common.b<>();
        this.E = new com.meituan.android.cube.pga.common.b<>();
        this.F = new com.meituan.android.cube.pga.common.b<>();
        this.G = new com.meituan.android.cube.pga.common.b<>();
        this.ar = new com.meituan.android.cube.pga.common.b<>();
        this.as = new com.meituan.android.cube.pga.common.b<>();
        this.at = new g<>();
        this.H = new g<>();
        this.I = new g<>();
        this.J = new g<>();
        this.au = new g<>();
        this.av = new g<>();
        this.aw = new com.meituan.android.cube.pga.common.b<>();
        this.K = new g<>();
        this.L = new g<>();
        this.M = new g<>();
        this.N = new com.meituan.android.cube.pga.common.b<>();
        this.ax = new g<>();
        this.ay = new g<>();
        this.az = new g<>();
        this.aA = new g<>();
        this.O = new com.meituan.android.cube.pga.common.b<>();
        this.P = new com.meituan.android.cube.pga.common.b<>();
        this.Q = new com.meituan.android.cube.pga.common.b<>();
        this.R = new g<>();
        this.S = new com.meituan.android.cube.pga.common.b<>();
        this.T = new g<>();
        this.U = new com.meituan.android.cube.pga.common.b<>();
        this.V = new com.meituan.android.cube.pga.common.b<>();
        this.W = new com.meituan.android.cube.pga.common.b<>();
        this.X = new com.meituan.android.cube.pga.common.b<>();
        this.Y = new com.meituan.android.cube.pga.common.b<>();
        this.Z = new com.meituan.android.cube.pga.common.b<>();
        this.aa = new j<>(0);
        this.ab = new com.meituan.android.cube.pga.common.b<>();
        this.ac = new g<>();
        this.ad = new g<>();
        this.ae = new g<>();
        this.af = new g<>();
        this.ag = new g<>();
        this.ah = new g<>();
        this.ai = new com.meituan.android.cube.pga.common.b<>();
        this.aj = new com.meituan.android.cube.pga.common.b<>();
        this.ak = new com.meituan.android.cube.pga.common.b<>();
        this.al = new com.meituan.android.cube.pga.common.b<>();
        this.am = new com.meituan.android.cube.pga.common.b<>();
        this.an = new com.meituan.android.cube.pga.common.b<>();
        this.ao = new g<>();
    }

    @Override // com.sankuai.waimai.ad.b
    public final b.c at_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503e87214c1a378ffd627736359cf0f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503e87214c1a378ffd627736359cf0f5");
        }
        b.c cVar = new b.c();
        cVar.b = "c_i5kxn8l";
        cVar.h = new com.sankuai.waimai.business.page.kingkong.future.mach.b(this, null);
        com.meituan.android.cube.pga.common.a<b.a, Map<String, Object>> aVar = new com.meituan.android.cube.pga.common.a<>();
        aVar.b = new c<b.a, Map<String, Object>>() { // from class: com.sankuai.waimai.business.page.kingkong.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Map<String, Object> a(b.a aVar2) {
                Map<String, Object> n;
                b.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43daf19d6f7dc175bef36a8c3bc963e4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43daf19d6f7dc175bef36a8c3bc963e4");
                }
                if (aVar3 == null) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                switch (AnonymousClass2.a[aVar3.a.ordinal()]) {
                    case 1:
                        Map<String, Object> map = com.sankuai.waimai.business.page.kingkong.future.root.a.v;
                        if (map != null) {
                            hashMap.putAll(map);
                        }
                        if (a.this.bF != null && a.this.bF.a().b != null) {
                            r9 = a.this.bF.a().b.getCurrentItem();
                        }
                        com.sankuai.waimai.rocks.page.tablist.rocklist.e eVar = a.this.by.a(String.valueOf(r9)).b;
                        if (eVar != null && (n = eVar.n()) != null) {
                            hashMap.putAll(n);
                        }
                        hashMap.put("first_load_uuid", com.sankuai.waimai.business.page.home.list.a.a().h);
                        hashMap.put(RaptorUploaderImpl.LOAD_TYPE, Integer.valueOf(com.sankuai.waimai.business.page.home.helper.d.a().b));
                        hashMap.put(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
                        break;
                    case 2:
                        if (aVar3.b == null) {
                            hashMap.put("current_screen", -1);
                        } else {
                            hashMap.put("current_screen", Integer.valueOf(com.sankuai.waimai.business.page.home.list.a.a().a(com.sankuai.waimai.business.page.home.list.a.d.intValue(), aVar3.b.g())));
                        }
                        b.C0799b c0799b = com.sankuai.waimai.business.page.kingkong.future.ai.b.a().c;
                        hashMap.put("request_type", Integer.valueOf(c0799b == null ? 2 : c0799b.k));
                        int i = c0799b != null ? c0799b.j : 0;
                        if (i != 0) {
                            hashMap.put("intent_type", Integer.valueOf(i));
                        }
                        com.sankuai.waimai.business.page.kingkong.future.network.e eVar2 = a.this.u.a().b;
                        com.sankuai.waimai.business.page.common.net.request.a b = eVar2 != null ? eVar2.b(1) : null;
                        hashMap.put("filter", b == null ? "" : b.k);
                        hashMap.put("seqNumber", Integer.valueOf(b != null ? b.r : 0));
                        break;
                    case 3:
                    case 4:
                        com.sankuai.waimai.business.page.kingkong.future.network.e eVar3 = a.this.u.a().b;
                        com.sankuai.waimai.business.page.kingkong.future.ai.a aVar4 = eVar3 != null ? eVar3.c : null;
                        if (aVar4 != null && aVar4.c != null) {
                            aVar4.c.b(aVar3.d - 1);
                            aVar4.c.a(aVar3.c);
                            break;
                        }
                        break;
                }
                return hashMap;
            }
        };
        cVar.i = aVar;
        cVar.m = "waimai_common_report_procedure";
        return cVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.a$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[b.EnumC0675b.valuesCustom().length];

        static {
            try {
                a[b.EnumC0675b.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.EnumC0675b.ATTACH_RENDER_NODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.EnumC0675b.TRIGGER_EXPOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.EnumC0675b.TRIGGER_CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.sankuai.waimai.ad.b
    public final com.meituan.android.cube.pga.common.b<Integer> au_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0559f28ad73ad2d460467ea083cde7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.common.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0559f28ad73ad2d460467ea083cde7") : this.bJ;
    }
}
