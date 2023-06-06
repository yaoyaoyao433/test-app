package com.sankuai.waimai.store.poi.list.newp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.IExtension;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.base.preload.d;
import com.sankuai.waimai.store.base.preload.e;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.mrn.preload.l;
import com.sankuai.waimai.store.mrn.preload.m;
import com.sankuai.waimai.store.mrn.preload.p;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.DrugSchemeMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;

    public a() {
        super(PoiVerticalityHomeActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a925bc53929b3dad1e60764a8ea6d58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a925bc53929b3dad1e60764a8ea6d58");
        } else {
            ae.a("HomeOpen", "step 1. useTile = true");
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.b, com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        String str;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f3350a0c2043694eedd5c6362d8fb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f3350a0c2043694eedd5c6362d8fb0");
            return;
        }
        IExtension extension = Weaver.getExtension();
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9ac25a8a1c52652a787551c871437b5", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9ac25a8a1c52652a787551c871437b5");
        } else if (jVar == null || jVar.d == null) {
            str = "imeituan://www.meituan.com/takeout/supermarket/flashbuy/home";
        } else {
            Uri uri = jVar.d;
            str = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
        }
        extension.addCustomTags(str, null, "sg_perf_pre_request", String.valueOf(System.currentTimeMillis()));
        if (((Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra")) == null) {
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) new Bundle());
        }
        Context context = jVar.c;
        Uri uri2 = jVar.d;
        boolean z = this.f;
        Object[] objArr3 = {context, uri2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.base.report.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d18d101ff68a623c9ce95f648823eede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d18d101ff68a623c9ce95f648823eede");
        } else if (z) {
            String path = uri2.getPath();
            if (!t.a(path) && path.contains("/supermarketfilter")) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source_vc", context.getClass().getName());
                    jSONObject.put("error_type", "SchemeUnMatchError");
                    c.a(DrugSchemeMonitor.MEDDrugHomeTransferError, jSONObject.toString(), "医药首页路由监控");
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
            }
        }
        super.a(jVar, gVar);
        if (this.f) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "58fee0afedd48834da6b30734b435418", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "58fee0afedd48834da6b30734b435418");
            } else {
                c.a(new IMonitor() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivityHandler$1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
                    public final boolean a() {
                        return false;
                    }

                    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
                    public String name() {
                        return "";
                    }

                    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
                    public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a422d43b09535690b6db58739580fd92", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a422d43b09535690b6db58739580fd92") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityHomeActivityHandler$1.1
                            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                            public final String a() {
                                return "ArrivalDrugHomeByOld";
                            }
                        };
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.b
    public final void a(@NonNull j jVar, @NonNull com.sankuai.waimai.store.param.a aVar) {
        com.sankuai.waimai.store.param.a aVar2;
        boolean z;
        boolean z2;
        Object[] objArr = {jVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13bf2b7ea963454ce7153178381b56f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13bf2b7ea963454ce7153178381b56f4");
            return;
        }
        Object[] objArr2 = {jVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f391554fc1d6d4499f4a39653b494848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f391554fc1d6d4499f4a39653b494848");
            return;
        }
        final String a2 = d.a();
        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
        if (bundle == null) {
            bundle = new Bundle();
            bundle.putString("key_pre_request_cache", a2);
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
        } else {
            bundle.putString("key_pre_request_cache", a2);
        }
        bundle.putLong("home router_start_time", SystemClock.elapsedRealtime());
        final p a3 = p.a(a2);
        k<PoiVerticalityDataResponse> kVar = new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.newp.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                Object[] objArr3 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8acffc307be2dfa2aa237579bd870f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8acffc307be2dfa2aa237579bd870f6");
                    return;
                }
                e.a(a2, "preload_success");
                l.a().a(a3, m.a(poiVerticalityDataResponse));
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d5c1e769d9083b7931b9b839740164e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d5c1e769d9083b7931b9b839740164e");
                    return;
                }
                e.a(a2, "preload_fail");
                l.a().b(a3, m.a(bVar));
            }
        };
        l.a().a(a3);
        if (!this.f) {
            String str = aVar.y ? "sg_home" : "sg_channel";
            long j = aVar.c;
            if (aVar.w > 0) {
                j = aVar.w;
            }
            z = true;
            z2 = false;
            aVar2 = aVar;
            com.sankuai.waimai.store.base.net.sg.a.a((Object) a2).a(String.valueOf(aVar.c), aVar.f, 0L, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), (String) null, aVar.m, j, str, aVar, kVar);
        } else {
            aVar2 = aVar;
            z = true;
            z2 = false;
            com.sankuai.waimai.store.base.net.drug.a.a(a2).a(aVar2.b, 20, aVar2.c, aVar2.f, aVar2.k, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), 0L, true, null, aVar2.J, null, 0, 0, 0, 0, aVar2.aj, kVar);
        }
        boolean a4 = com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a();
        boolean a5 = com.sankuai.waimai.store.config.j.h().a(SCConfigPath.CHANNEL_PRE_REQUEST_ON, z);
        if (!a4 && a5) {
            z2 = true;
        }
        if ((aVar2.y || z2) && !this.f && com.sankuai.waimai.store.config.j.h().a("flashbuy_homepage_pre_request_on", z)) {
            final String a6 = d.a();
            bundle.putString("key_pre_request_cache2", a6);
            final p a7 = p.a(a6);
            k<PoiVerticalityDataResponse> kVar2 = new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.newp.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                    Object[] objArr3 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7381a9c4b830fe43082ab2241e1b2896", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7381a9c4b830fe43082ab2241e1b2896");
                        return;
                    }
                    e.a(a6, "preload_success");
                    l.a().a(a7, m.a(poiVerticalityDataResponse));
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dbbf494841593226d5d4207baf67bc3a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dbbf494841593226d5d4207baf67bc3a");
                        return;
                    }
                    e.a(a6, "preload_fail");
                    l.a().b(a7, m.a(bVar));
                }
            };
            l.a().a(a7);
            com.sankuai.waimai.store.base.net.sg.a.a((Object) a6).a(aVar2.b, 20, aVar2.c, aVar2.f, aVar2.k, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), 0L, true, (String) null, aVar2.J, (String) null, aVar2.K, aVar2.n, 1, aVar2.aj, (String) null, (String) null, (String) null, (String) null, aVar2.m, (com.sankuai.waimai.store.base.net.j<PoiVerticalityDataResponse>) kVar2);
        }
    }
}
