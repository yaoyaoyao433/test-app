package com.sankuai.waimai.store.drug.home;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.i;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.base.preload.c;
import com.sankuai.waimai.store.base.preload.e;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.mrn.preload.l;
import com.sankuai.waimai.store.mrn.preload.m;
import com.sankuai.waimai.store.mrn.preload.p;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;

    public a() {
        super(DrugHomeActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a109bde7e7ee63915ffbf5b0fef064c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a109bde7e7ee63915ffbf5b0fef064c9");
        }
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3eb54f3f2572683510d56a3ec23d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3eb54f3f2572683510d56a3ec23d53");
            return;
        }
        if (((Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra")) == null) {
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) new Bundle());
        }
        com.sankuai.waimai.store.config.j.h().f();
        Intent intent = new Intent();
        intent.setData(jVar.d);
        com.sankuai.waimai.store.param.a b = com.sankuai.waimai.store.param.a.b(intent, new com.sankuai.waimai.store.param.a());
        com.sankuai.waimai.store.poilist.preload.b.a().b.a();
        com.sankuai.waimai.store.poilist.preload.b.a().c.a();
        if (d.h().a("drug_homepage/vision_pre_request_enable", true) && ((Boolean) i.a().first).booleanValue()) {
            Object[] objArr2 = {jVar, b};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "936cf8429236faae13eaa2b0caafd71d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "936cf8429236faae13eaa2b0caafd71d");
            } else {
                final String a2 = com.sankuai.waimai.store.base.preload.d.a();
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
                k<PoiVerticalityDataResponse> kVar = new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.drug.home.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Object obj) {
                        PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                        Object[] objArr3 = {poiVerticalityDataResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a1e81cb8d3cf95da488cfa533125237", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a1e81cb8d3cf95da488cfa533125237");
                            return;
                        }
                        e.a(a2, "preload_success");
                        l.a().a(a3, m.a(poiVerticalityDataResponse));
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8cc32dae58502d553d2aa153c072f0eb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8cc32dae58502d553d2aa153c072f0eb");
                            return;
                        }
                        e.a(a2, "preload_fail");
                        l.a().b(a3, m.a(bVar));
                    }
                };
                l.a().a(a3);
                com.sankuai.waimai.store.drug.base.net.b.a(a2).a(b.b, 20, b.c, b.f, b.k, Statistics.getSession(), OneIdHandler.getInstance(com.sankuai.waimai.store.util.b.a()).getLocalOneId(), 0L, null, b.J, null, 0, 0, 0, 0, b.aj, kVar);
            }
        }
        super.a(jVar, gVar);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2dbf01a92f9281c8282bfe7780c59a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2dbf01a92f9281c8282bfe7780c59a36");
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(new IMonitor() { // from class: com.sankuai.waimai.store.drug.home.ActivityRouterHandler$1
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
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "10d22fb65bcb43c9e30e75fb1609706b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "10d22fb65bcb43c9e30e75fb1609706b") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.store.drug.home.ActivityRouterHandler$1.1
                        @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                        public final String a() {
                            return "ArrivalDrugHomeByNew";
                        }
                    };
                }
            });
        }
    }
}
