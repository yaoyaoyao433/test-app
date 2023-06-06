package com.sankuai.waimai.store.poi.list.newp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.base.preload.c;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.i.poi.PoiDrugService;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelLocationSucRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelPageLoad;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends c {
    public static ChangeQuickRedirect e;
    public boolean f;

    public abstract void a(@NonNull j jVar, @NonNull com.sankuai.waimai.store.param.a aVar);

    public b(@NonNull Class<? extends Activity> cls) {
        super(cls);
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da0e04549c76b5b29b1ba6d5dbf03080", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da0e04549c76b5b29b1ba6d5dbf03080");
        } else {
            this.f = false;
        }
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public void a(@NonNull j jVar, @NonNull g gVar) {
        boolean z;
        boolean z2;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b43671d039722dfd130a1ef7b55689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b43671d039722dfd130a1ef7b55689");
            return;
        }
        com.sankuai.waimai.store.config.j.h().f();
        Intent intent = new Intent();
        intent.setData(jVar.d);
        com.sankuai.waimai.store.param.a b = com.sankuai.waimai.store.param.a.b(intent, new com.sankuai.waimai.store.param.a());
        this.f = b.i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.param.a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "8717fd063ce8f805310312d112a02578", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "8717fd063ce8f805310312d112a02578")).booleanValue();
        } else {
            z = b.e() || b.f() || b.y || b.i() || b.z;
        }
        if (z) {
            com.sankuai.waimai.store.poilist.preload.b.a().b.a();
            com.sankuai.waimai.store.poilist.preload.b.a().c.a();
            com.sankuai.waimai.store.poi.list.util.b a = com.sankuai.waimai.store.poi.list.util.b.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = o.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "98b15a52ad0c92d3af6ea4cae0339ea9", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "98b15a52ad0c92d3af6ea4cae0339ea9")).booleanValue();
            } else {
                z2 = i.h().a("locate_optimize/use_location_only", true) && k.d();
            }
            a.b = z2;
            boolean a2 = d.h().a("drug_homepage/vision_pre_request_enable", true);
            if (this.f && (com.sankuai.waimai.store.locate.a.g() || (a2 && ((Boolean) com.sankuai.waimai.drug.i.a().first).booleanValue()))) {
                b(jVar, b);
            } else if (com.sankuai.waimai.store.locate.a.g()) {
                if (b.z) {
                    com.sankuai.waimai.store.util.monitor.c.b(SGChannelPageLoad.GetLocationCacheSuccess, "", "SMTUPViewController");
                } else {
                    com.sankuai.waimai.store.util.monitor.c.b(SGChannelPageLoad.GetLocationCacheSuccess, "", "WMSMTileChannelViewController");
                }
                b(jVar, b);
                com.sankuai.waimai.store.util.monitor.b.a().a(SGChannelLocationSucRate.GetLocationCacheSuccess).c(b.z ? "SMTUPViewController" : "WMSMTileChannelViewController").a(true).a();
            } else if (!this.f && com.sankuai.waimai.store.poi.list.util.b.a().b()) {
                ae.a("locationOpt", "use location only");
                b(jVar, b);
                Object[] objArr4 = {jVar};
                ChangeQuickRedirect changeQuickRedirect4 = e;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "79c99157b2a01c63edc4d0f5f1dd55a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "79c99157b2a01c63edc4d0f5f1dd55a1");
                } else {
                    Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
                    if (bundle == null) {
                        bundle = new Bundle();
                        jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
                    }
                    bundle.putBoolean("handle_locate_before_api_request ", true);
                    bundle.putLong("home router_start_time", SystemClock.elapsedRealtime());
                }
            }
        } else {
            b(jVar, b);
        }
        super.a(jVar, gVar);
    }

    @Override // com.sankuai.waimai.router.activity.c, com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07c4045869fa7e6d2c4db25ff3d7715", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07c4045869fa7e6d2c4db25ff3d7715");
        }
        if (this.f) {
            Object[] objArr2 = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "700dc3c0e29f1d57e143e899a1b6393c", RobustBitConfig.DEFAULT_VALUE)) {
                return (Intent) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "700dc3c0e29f1d57e143e899a1b6393c");
            }
            PoiDrugService poiDrugService = (PoiDrugService) com.sankuai.waimai.router.a.a(PoiDrugService.class, PoiDrugService.KEY_DRUG);
            if (poiDrugService != null) {
                return poiDrugService.getDrugHomeActivityIntent(jVar.c);
            }
            return super.b(jVar);
        }
        return super.b(jVar);
    }

    private void b(@NonNull j jVar, @NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {jVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dbc7f946a400a96710b08a32060354c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dbc7f946a400a96710b08a32060354c");
        } else {
            a(jVar, aVar);
        }
    }
}
