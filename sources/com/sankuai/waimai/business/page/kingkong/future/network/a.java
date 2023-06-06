package com.sankuai.waimai.business.page.kingkong.future.network;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.page.kingkong.future.bean.ResponseMsgBean;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.block.b;
import com.sankuai.waimai.rocks.page.block.e;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"future_kingkong_tabs"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.rocks.page.block.e {
    public static ChangeQuickRedirect f;
    public static String g;
    private int A;
    private BaseResponse<RocksServerModel> B;
    private com.meituan.android.cube.pga.type.a i;
    private e r;
    private com.sankuai.waimai.business.page.common.net.request.a s;
    private String t;
    private com.sankuai.waimai.business.page.kingkong.a u;
    private int v;
    private boolean w;
    private MetricsSpeedMeterTask x;
    private KingkongInfo y;
    private e.a z;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.w = false;
        return false;
    }

    public static /* synthetic */ void c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "158afb339a32698c63f457e3f02bedf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "158afb339a32698c63f457e3f02bedf4");
            return;
        }
        aVar.A = 2;
        if (aVar.z != null) {
            aVar.a(aVar.z);
        }
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950495637d4f37e0c87a1cb6c84539a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950495637d4f37e0c87a1cb6c84539a6");
            return;
        }
        this.v = 1;
        this.A = 0;
        this.i = aVar;
        if (aVar instanceof com.sankuai.waimai.business.page.kingkong.a) {
            this.u = (com.sankuai.waimai.business.page.kingkong.a) aVar;
            this.r = this.u.u.a().b;
            if (this.r != null) {
                this.s = this.r.b(1);
            }
            this.t = this.u.R.a().b;
            this.x = this.u.ao.a().b;
            this.y = this.u.w.a().b;
            this.u.an.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.platform.preload.f<FkkPreloadResponse>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.a.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
                    if (r13.d != false) goto L36;
                 */
                @Override // com.meituan.android.cube.pga.action.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(com.sankuai.waimai.platform.preload.f<com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse> r13) {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.kingkong.future.network.a.AnonymousClass1.a(java.lang.Object):void");
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.network.a$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] a = new int[f.a.valuesCustom().length];

        static {
            try {
                a[f.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.sankuai.waimai.rocks.page.block.e
    public final void a(String str, String str2, e.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e2e7f647cd3c0d395d23debd0d7e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e2e7f647cd3c0d395d23debd0d7e2a");
            return;
        }
        this.z = aVar;
        if (this.s == null || this.r == null) {
            return;
        }
        e eVar = this.r;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "bdf002cfb0f5882110c840204a329cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "bdf002cfb0f5882110c840204a329cae");
        } else {
            eVar.f = SystemClock.elapsedRealtime();
        }
        int i = ((b.d) aVar).e;
        if (!KingKongNetworkPreLoader.isPreLoadFeeds || i != 0) {
            a(aVar);
        } else if (this.A == 1) {
            a(this.B, this.z);
        } else if (this.A == 2) {
            b(this.z);
        }
    }

    private void a(final e.a aVar) {
        if (aVar instanceof b.d) {
            this.v = ((b.d) aVar).e == 1 ? 2 : 1;
        }
        if (this.v == 1) {
            this.w = false;
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_tabs_start", new boolean[0]);
        } else {
            this.w = true;
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().c();
        }
        this.u.ag.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a90c6a29a42f2adb6cb8f8cb8eff42c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a90c6a29a42f2adb6cb8f8cb8eff42c") : Boolean.valueOf(a.this.w);
            }
        };
        boolean z = com.sankuai.waimai.business.page.common.list.ai.f.a().c;
        this.r.a(this.v);
        KingkongInfo kingkongInfo = this.u.w.a().b;
        boolean z2 = kingkongInfo.b != 910 ? false : z;
        String str = "";
        WmAddress k = g.a().k();
        if (k != null && k.hasAddress()) {
            str = k.getAddress();
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FKKApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FKKApi.class)).channelFeed(kingkongInfo.f, this.s.r, this.s.s, z2, this.s.b, this.s.c, this.s.d, this.s.f, this.s.g, this.s.i, this.s.j, this.s.k, this.s.l, this.s.p, this.s.q, Statistics.getSession(), OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId(), this.s.t, this.s.u, str), new b.AbstractC1042b<BaseResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66a3efea992c50b887089eac14bfb3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66a3efea992c50b887089eac14bfb3d");
                } else {
                    a.this.a(baseResponse, aVar);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr = {th};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23cc73a84194d671295167b514739e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23cc73a84194d671295167b514739e6");
                } else {
                    a.this.b(aVar);
                }
            }
        }, this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88800c944c95c61f14de875be3001702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88800c944c95c61f14de875be3001702");
            return;
        }
        if (aVar != null) {
            aVar.a("", "NET_ERROR");
        }
        this.u.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, -1, -1));
        com.sankuai.waimai.business.page.kingkong.future.monitor.c.a(null, "v6/channel/feeds/tabs");
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().c();
        DovePageMonitor.a(l(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseResponse<RocksServerModel> baseResponse, e.a aVar) {
        Object[] objArr = {baseResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa361e412341aa1fdbc831d44782f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa361e412341aa1fdbc831d44782f34");
        } else if (baseResponse == null || baseResponse.data == null || baseResponse.code != 0 || baseResponse.data.module_tab == null || TextUtils.isEmpty(baseResponse.data.module_tab.stringData)) {
            if (aVar != null) {
                aVar.a("", "NET_ERROR");
            }
            this.u.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(baseResponse, -1, -1));
            com.sankuai.waimai.business.page.kingkong.future.monitor.c.a(baseResponse, "v6/channel/feeds/tabs");
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().c();
            DovePageMonitor.a(l(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
        } else {
            if (!this.w && this.x != null) {
                HashMap hashMap = new HashMap();
                if (this.y != null) {
                    hashMap.put("kingkong_title", this.y.c);
                    hashMap.put("kingkong_code", Long.valueOf(this.y.b));
                }
                h.a(this.x.recordStep("activity_data_ready"), hashMap);
                com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_tabs_end", new boolean[0]);
            }
            com.sankuai.waimai.business.page.kingkong.future.ai.b.a().b();
            com.sankuai.waimai.business.page.kingkong.future.ai.b.a().c();
            this.s.q = g;
            ListIDHelper listIDHelper = ListIDHelper.a.a;
            listIDHelper.a("page", k.l + CommonConstant.Symbol.UNDERLINE + this.s.i, this.s.q);
            if (aVar != null) {
                aVar.a(baseResponse.data);
            }
            if (this.w) {
                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.a.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5811a26d7181160b6f7490d5d42cafc0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5811a26d7181160b6f7490d5d42cafc0");
                        } else if (a.this.u != null) {
                            a.this.u.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, 0, -1));
                        }
                    }
                }, 100L);
            }
        }
    }
}
