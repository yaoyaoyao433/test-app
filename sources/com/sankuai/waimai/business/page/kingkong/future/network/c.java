package com.sankuai.waimai.business.page.kingkong.future.network;

import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.kingkong.future.bean.ResponseMsgBean;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.block.b;
import com.sankuai.waimai.rocks.page.block.e;
import com.tencent.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"future_kingkong_rcmd"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class c extends com.sankuai.waimai.rocks.page.block.e {
    public static ChangeQuickRedirect f;
    public static String g;
    private KingkongInfo i;
    private String r;
    private com.sankuai.waimai.business.page.kingkong.a s;
    private com.sankuai.waimai.platform.widget.emptylayout.d t;
    private int u;
    private e.a v;
    private BaseResponse<RocksServerModel> w;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "ee73442b79247e166d47d78d67303d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "ee73442b79247e166d47d78d67303d4f");
            return;
        }
        cVar.u = 2;
        if (cVar.v != null) {
            cVar.a(cVar.v);
        }
    }

    public c(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354f8822701f8a11c234acd4de345107", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354f8822701f8a11c234acd4de345107");
            return;
        }
        this.u = 0;
        if (aVar instanceof com.sankuai.waimai.business.page.kingkong.a) {
            this.s = (com.sankuai.waimai.business.page.kingkong.a) aVar;
        }
        if (this.s != null) {
            this.i = this.s.w.a().b;
            this.r = this.s.R.a().b;
            this.t = this.s.T.a().b;
            this.s.am.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.platform.preload.f<FkkPreloadResponse>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.c.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
                    if (r13.d != false) goto L34;
                 */
                @Override // com.meituan.android.cube.pga.action.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(com.sankuai.waimai.platform.preload.f<com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse> r13) {
                    /*
                        r12 = this;
                        com.sankuai.waimai.platform.preload.f r13 = (com.sankuai.waimai.platform.preload.f) r13
                        r0 = 1
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        r9 = 0
                        r8[r9] = r13
                        com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.kingkong.future.network.c.AnonymousClass1.a
                        java.lang.String r11 = "dd99a7832a91e3f910dbccffa1b1b5aa"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r12
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1d
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                        return
                    L1d:
                        if (r13 == 0) goto L2b
                        com.sankuai.waimai.platform.preload.f$a r1 = r13.b
                        com.sankuai.waimai.platform.preload.f$a r2 = com.sankuai.waimai.platform.preload.f.a.LOADING
                        if (r1 != r2) goto L2b
                        com.sankuai.waimai.business.page.kingkong.future.network.c r13 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r13, r9)
                        return
                    L2b:
                        com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader.isPreLoadRcmd = r9
                        if (r13 == 0) goto Lc8
                        T r1 = r13.c
                        if (r1 != 0) goto L35
                        goto Lc8
                    L35:
                        int[] r1 = com.sankuai.waimai.business.page.kingkong.future.network.c.AnonymousClass3.a
                        com.sankuai.waimai.platform.preload.f$a r2 = r13.b
                        int r2 = r2.ordinal()
                        r1 = r1[r2]
                        switch(r1) {
                            case 1: goto L90;
                            case 2: goto L90;
                            case 3: goto L43;
                            default: goto L42;
                        }
                    L42:
                        goto L96
                    L43:
                        T r1 = r13.c
                        com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse r1 = (com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse) r1
                        int r2 = r1.a
                        r3 = 2
                        if (r2 != r3) goto L61
                        com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse<com.sankuai.waimai.rocks.model.RocksServerModel> r2 = r1.c
                        if (r2 != 0) goto L61
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r0, r3)
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c r1 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.rocks.page.block.e$a r1 = com.sankuai.waimai.business.page.kingkong.future.network.c.b(r1)
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r0, r1)
                        goto L9b
                    L61:
                        int r2 = r1.a
                        if (r2 != r0) goto L8b
                        com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse<com.sankuai.waimai.rocks.model.RocksServerModel> r2 = r1.c
                        if (r2 == 0) goto L8b
                        com.sankuai.waimai.business.page.kingkong.future.network.c r2 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r2, r0)
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse<com.sankuai.waimai.rocks.model.RocksServerModel> r2 = r1.c
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r0, r2)
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.rocks.page.block.e$a r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.b(r0)
                        if (r0 == 0) goto L9b
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse<com.sankuai.waimai.rocks.model.RocksServerModel> r1 = r1.c
                        com.sankuai.waimai.business.page.kingkong.future.network.c r2 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.rocks.page.block.e$a r2 = com.sankuai.waimai.business.page.kingkong.future.network.c.b(r2)
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r0, r1, r2)
                        goto L9b
                    L8b:
                        boolean r0 = r13.d
                        if (r0 == 0) goto L9b
                        goto L96
                    L90:
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r0)
                        goto L9b
                    L96:
                        com.sankuai.waimai.business.page.kingkong.future.network.c r0 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r0)
                    L9b:
                        java.lang.String r0 = "king_kong_preload"
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "FKKRcmdRequestBlock KingKongResponsePreloadCallback data: "
                        r1.<init>(r2)
                        T r2 = r13.c
                        r1.append(r2)
                        java.lang.String r2 = "   state: "
                        r1.append(r2)
                        com.sankuai.waimai.platform.preload.f$a r2 = r13.b
                        r1.append(r2)
                        java.lang.String r2 = "   isFinish: "
                        r1.append(r2)
                        boolean r13 = r13.d
                        r1.append(r13)
                        java.lang.String r13 = r1.toString()
                        java.lang.Object[] r1 = new java.lang.Object[r9]
                        com.sankuai.waimai.foundation.utils.log.a.b(r0, r13, r1)
                        return
                    Lc8:
                        com.sankuai.waimai.business.page.kingkong.future.network.c r13 = com.sankuai.waimai.business.page.kingkong.future.network.c.this
                        com.sankuai.waimai.business.page.kingkong.future.network.c.a(r13)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.kingkong.future.network.c.AnonymousClass1.a(java.lang.Object):void");
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.network.c$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41fd83a2a5629262a66a18c5bcb60100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41fd83a2a5629262a66a18c5bcb60100");
            return;
        }
        this.v = aVar;
        int i = ((b.d) aVar).e;
        if (!KingKongNetworkPreLoader.isPreLoadRcmd || i != 0) {
            a(aVar);
        } else if (this.u == 1) {
            a(this.w, this.v);
        } else if (this.u == 2) {
            b(this.v);
        }
    }

    private void a(final e.a aVar) {
        if (this.i == null) {
            return;
        }
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_rcmd_start", new boolean[0]);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FKKApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FKKApi.class)).channelRcmd(this.i.f, this.i.d, g, this.i.b, q()), new b.AbstractC1042b<BaseResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.c.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e77f975e81486259b519a50d32234e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e77f975e81486259b519a50d32234e");
                } else {
                    c.this.a(baseResponse, aVar);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr = {th};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ffed073598b22038dcec4407a177da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ffed073598b22038dcec4407a177da");
                } else {
                    c.this.b(aVar);
                }
            }
        }, this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07dab7bcc54fd8af898cc43dd9746dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07dab7bcc54fd8af898cc43dd9746dd7");
            return;
        }
        if (aVar != null) {
            aVar.a("加载失败，请重试", "重试");
        }
        this.s.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, -1, 0));
        this.s.P.a((com.meituan.android.cube.pga.common.b<RocksServerModel>) null);
        com.sankuai.waimai.business.page.kingkong.future.monitor.c.a(null, "v6/channel/feeds/rcmd");
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().c();
        DovePageMonitor.a(this.s.b(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BaseResponse<RocksServerModel> baseResponse, e.a aVar) {
        Object[] objArr = {baseResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab3b7830cc2518bda769357f38d4102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab3b7830cc2518bda769357f38d4102");
        } else if (baseResponse == null || baseResponse.data == null || baseResponse.code != 0) {
            if (aVar != null) {
                aVar.a("加载失败，请重试", "重试");
            }
            this.s.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(baseResponse, -1, 0));
            this.s.P.a((com.meituan.android.cube.pga.common.b<RocksServerModel>) null);
            com.sankuai.waimai.business.page.kingkong.future.monitor.c.a(baseResponse, "v6/channel/feeds/rcmd");
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().c();
            DovePageMonitor.a(this.s.b(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b(KingKongNetworkPreLoader.KING_KONG_PRELOAD, "KingKongNetworkPreLoader handleResponse", new Object[0]);
            this.s.Q.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
            if (baseResponse.data.moduleHeader == null || TextUtils.isEmpty(baseResponse.data.moduleHeader.stringData)) {
                this.s.P.a((com.meituan.android.cube.pga.common.b<RocksServerModel>) null);
                DovePageMonitor.a(this.s.b(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
            }
            if (aVar != null && baseResponse != null) {
                aVar.a(baseResponse.data);
            }
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_rcmd_end", new boolean[0]);
        }
    }

    public static int q() {
        char c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e3690851351e08092279eb82f8ef3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e3690851351e08092279eb82f8ef3ed")).intValue();
        }
        String b = p.b(com.meituan.android.singleton.b.a.getApplicationContext());
        int hashCode = b.hashCode();
        if (hashCode == 1621) {
            if (b.equals("2G")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 1652) {
            if (b.equals("3G")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1683) {
            if (hashCode == 2694997 && b.equals("WiFi")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (b.equals("4G")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return -1;
        }
    }
}
