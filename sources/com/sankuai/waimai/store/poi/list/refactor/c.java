package com.sankuai.waimai.store.poi.list.refactor;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.View;
import com.alipay.sdk.app.PayTask;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.af;
import com.sankuai.waimai.store.util.ai;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.monitor.b;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelLocationSucRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelPageLoad;
import com.sankuai.waimai.store.util.monitor.monitor.SGHomeLocationStrategy;
import com.sankuai.waimai.store.util.monitor.monitor.SGLocateLossRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGLocateSucRate;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends PoiNewTemplate4 {
    public static ChangeQuickRedirect u;
    private l<WmAddress> A;
    private MetricsSpeedMeterTask B;
    private boolean C;
    protected int v;
    private String w;
    private String x;
    private String y;
    private l<WMLocation> z;

    public static /* synthetic */ String a(c cVar, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = u;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c04848f2d159baf97af02a9674c3b026", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c04848f2d159baf97af02a9674c3b026") : (f <= 500.0f || f >= 1000.0f) ? (f <= 1000.0f || f >= 2000.0f) ? (f <= 2000.0f || f >= 3000.0f) ? f > 3000.0f ? "4" : "0" : "3" : "2" : "1";
    }

    public static /* synthetic */ boolean a(c cVar, WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = u;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "feffa692f4d52a166fb950728965209f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "feffa692f4d52a166fb950728965209f")).booleanValue() : wMLocation == null || wMLocation.getLocationResultCode() == null || wMLocation.getLocationResultCode().a != 1200;
    }

    public static /* synthetic */ boolean a(c cVar, WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = u;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f608e7fc5d776832e4ae2228ba2aff10", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f608e7fc5d776832e4ae2228ba2aff10")).booleanValue() : wmAddress == null || wmAddress.getStatusCode() == 1202;
    }

    public static /* synthetic */ void b(c cVar, WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "75e4f1fecbc8388c20bcd47f0ad32b9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "75e4f1fecbc8388c20bcd47f0ad32b9a");
        } else if (wMLocation != null) {
            try {
                if (wMLocation.getLocationResultCode() != null) {
                    cVar.v = wMLocation.getLocationResultCode().a;
                }
            } catch (Exception unused) {
                cVar.v = 0;
            }
        }
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "33c7b4fd91d89827a37f572efde01c0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "33c7b4fd91d89827a37f572efde01c0d");
            return;
        }
        PoiVerticalityDataResponse poiVerticalityDataResponse = new PoiVerticalityDataResponse();
        ((com.sankuai.waimai.store.poi.list.newp.presenter.b) cVar.n).a(poiVerticalityDataResponse);
        cVar.a(poiVerticalityDataResponse, cVar.m, true);
        ((com.sankuai.waimai.store.poi.list.newp.presenter.b) cVar.n).c = poiVerticalityDataResponse;
        PoiVerticalityDataResponse poiVerticalityDataResponse2 = new PoiVerticalityDataResponse();
        poiVerticalityDataResponse2.mSCApiException = new com.sankuai.waimai.store.repository.net.b(cVar.v, "定位失败，请手动输入地址");
        ((com.sankuai.waimai.store.poi.list.newp.presenter.b) cVar.n).g = poiVerticalityDataResponse2;
        cVar.m.n = 0;
        ((com.sankuai.waimai.store.poi.list.newp.presenter.b) cVar.n).a(cVar.m);
    }

    public c(@NonNull Fragment fragment, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(fragment, aVar);
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209b1f2e413e7c762aa3d8ca6f9eb204", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209b1f2e413e7c762aa3d8ca6f9eb204");
            return;
        }
        this.C = false;
        this.v = 0;
        this.w = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_address_default);
        this.x = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_error_change_location);
        this.y = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_progressbar_locating);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cb1849799849f2ec57fc79c1eac170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cb1849799849f2ec57fc79c1eac170");
        } else {
            super.a_(view);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33a78ac3db5e1adb355b8b54d026569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33a78ac3db5e1adb355b8b54d026569");
            return;
        }
        this.z = new l<WMLocation>() { // from class: com.sankuai.waimai.store.poi.list.refactor.c.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable WMLocation wMLocation) {
                Object[] objArr2;
                ChangeQuickRedirect changeQuickRedirect2;
                WMLocation wMLocation2 = wMLocation;
                Object[] objArr3 = {wMLocation2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cca5fe843e2c250eae88b32afcc89242", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cca5fe843e2c250eae88b32afcc89242");
                    return;
                }
                af.a(c.this.l(), "sg.channel.locationend.native");
                if (!c.a(c.this, wMLocation2)) {
                    c.this.C = true;
                    if (c.this.B != null) {
                        h.a(c.this.B.recordStep("location_success"));
                    }
                    c.this.l().s().recordStep("home_pag_locate_end_success");
                    boolean a2 = com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a();
                    if (!a2 && com.sankuai.waimai.store.base.abtest.a.e() && com.sankuai.waimai.store.poi.list.util.b.a().b()) {
                        float a3 = c.this.q != null ? com.sankuai.waimai.foundation.location.utils.a.a(new com.sankuai.waimai.foundation.location.model.a(c.this.q.getLatitude(), c.this.q.getLongitude()), new com.sankuai.waimai.foundation.location.model.a(wMLocation2.getLatitude(), wMLocation2.getLongitude())) : 0.0f;
                        if (a3 > (PatchProxy.isSupport(new Object[0], null, o.a, true, "fb36a3d47ea688c59e156f7438817999", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb36a3d47ea688c59e156f7438817999")).intValue() : i.h().a("locate_optimize/location_new_distance", 300))) {
                            if (c.this.p != null) {
                                c.this.B();
                            }
                            if (c.this.n instanceof com.sankuai.waimai.store.poi.list.newp.presenter.b) {
                                ((com.sankuai.waimai.store.poi.list.newp.presenter.b) c.this.n).e.b = false;
                            }
                            c.this.m.ae = "";
                            c.this.m.af = "";
                            c.this.J();
                            com.sankuai.waimai.store.util.monitor.b.a().a(SGHomeLocationStrategy.OnlyMtLocationRefresh).a("distance_type", c.a(c.this, a3)).a();
                        } else if (com.sankuai.waimai.store.base.abtest.a.g() && c.this.n != null && !c.this.n.b()) {
                            c.this.J();
                        } else {
                            c.this.H();
                        }
                        c.this.p = wMLocation2;
                        c.this.q = wMLocation2;
                    } else if (!SGLocationUtils.a(c.this.p, wMLocation2)) {
                        if (c.this.p != null) {
                            c.this.B();
                        }
                        c.this.p = wMLocation2;
                        c.this.J();
                        com.sankuai.waimai.store.util.monitor.b.a().a(SGHomeLocationStrategy.WMLocationRefresh).a();
                    } else if (!a2 && com.sankuai.waimai.store.base.abtest.a.g() && c.this.n != null && !c.this.n.b()) {
                        c.this.p = wMLocation2;
                        c.this.J();
                    } else {
                        c.this.H();
                    }
                    com.sankuai.waimai.store.util.monitor.c.b(SGChannelPageLoad.GetLocationNoCacheSuccess, "", "WMSMTileChannelViewController");
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGChannelLocationSucRate.GetLocationNoCacheSuccess).c("WMSMTileChannelViewController").a(true).a();
                } else {
                    c.this.C = false;
                    c.b(c.this, wMLocation2);
                    if (c.this.A()) {
                        c.this.a(c.this.w, false);
                        if (com.sankuai.shangou.stone.util.o.a(c.this.l())) {
                            c.this.J();
                        } else {
                            c.d(c.this);
                        }
                    } else {
                        c.this.H();
                    }
                    if (c.this.m.y) {
                        if (c.this.B != null) {
                            h.a(c.this.B.recordStep("location_error"));
                        }
                        c.this.l().s().recordStep("home_pag_locate_end_fail");
                        com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.GetLocationError, "", "WMSMTileChannelViewController");
                    } else {
                        com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.GetLocationError, "", "");
                    }
                    String str = "home StatusCode:";
                    if (wMLocation2 != null && wMLocation2.getLocationResultCode() != null) {
                        str = "home StatusCode:" + wMLocation2.getLocationResultCode().a;
                    }
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGChannelLocationSucRate.GetLocationError).c("WMSMTileChannelViewController").a(false).a(str).a();
                }
                if (c.this.m.y) {
                    c.this.l().s().recordStep("home_page_time_end_location");
                } else {
                    c.this.l().s().recordStep("channel_page_time_end_location");
                }
            }
        };
        this.A = new l<WmAddress>() { // from class: com.sankuai.waimai.store.poi.list.refactor.c.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable WmAddress wmAddress) {
                WmAddress wmAddress2 = wmAddress;
                Object[] objArr2 = {wmAddress2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fb3499e9b2644b9aec9c2f57249b11c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fb3499e9b2644b9aec9c2f57249b11c");
                    return;
                }
                if (c.a(c.this, wmAddress2)) {
                    c.this.r = c.this.w;
                    if (!c.this.m.y) {
                        com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.GetAddressError, "", "");
                    }
                } else {
                    c.this.r = wmAddress2.getAddress();
                    c.this.m.aT = c.this.r;
                }
                c.this.a(c.this.r, false);
            }
        };
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddcc7944f1e87a2e6a164b1eba6fdf8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddcc7944f1e87a2e6a164b1eba6fdf8f");
            return;
        }
        super.G();
        if (this.z != null) {
            com.sankuai.waimai.store.poilist.preload.b.a().b.b(this.z);
        }
        if (this.A != null) {
            com.sankuai.waimai.store.poilist.preload.b.a().c.b(this.A);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4, com.meituan.android.cube.core.h
    public final void q() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cf7d210d29e0a27c281f5b31f93cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cf7d210d29e0a27c281f5b31f93cee");
            return;
        }
        super.q();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = u;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0a142189cff364abfb2d79a2b55734c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0a142189cff364abfb2d79a2b55734c");
        } else if (!o.j() || m() == null || this.m == null) {
        } else {
            b.a a = com.sankuai.waimai.store.util.monitor.b.a().a(SGLocateLossRate.SGLocateLossRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.m.c)).a(NetLogConstants.Tags.NETWORK_TYPE, p.b(m())).a("device_type", Build.MODEL);
            int i = this.v;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = u;
            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0c59712eb0ba297c648e4496a709b09", RobustBitConfig.DEFAULT_VALUE)) {
                switch (i) {
                    case 1201:
                        str = "6003";
                        break;
                    case 1202:
                        str = "6002";
                        break;
                    case 1203:
                        str = "6019";
                        break;
                    case 1204:
                        str = "6001";
                        break;
                    case 1205:
                        str = "6012";
                        break;
                    default:
                        str = "定位成功";
                        break;
                }
            } else {
                str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0c59712eb0ba297c648e4496a709b09");
            }
            a.a("without_location_reason", str).a(!this.C).a();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8082c57fdc11aca9323eb6781b5d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8082c57fdc11aca9323eb6781b5d99");
        } else if (I()) {
            super.C();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0724018988b180e72d93131a119836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0724018988b180e72d93131a119836");
        } else if (I()) {
            super.w();
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6244ee1330a56766cd37425eb6e2ed64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6244ee1330a56766cd37425eb6e2ed64");
            return;
        }
        if (K()) {
            this.C = true;
            a(com.sankuai.waimai.store.locate.a.d(), false);
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = u;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6d4e29ca800913f95c761aebd7c4e53", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6d4e29ca800913f95c761aebd7c4e53");
            } else {
                boolean a = ai.a(ab.b().b((Context) l(), "key_time_last_location", 0L));
                if (a) {
                    af.a(l(), "sg.channel.locationstart.native");
                    com.sankuai.waimai.store.fsp.a.a().a(l(), "start_location_over15");
                    a(true, false);
                }
                com.sankuai.waimai.store.util.monitor.b.a().a(SGHomeLocationStrategy.HasWMLocationAndAddress).a("over_15min", a ? "1" : "0").a();
            }
            J();
        } else {
            boolean a2 = com.sankuai.waimai.store.manager.abtest.a.a(com.sankuai.waimai.store.pagingload.c.b).a();
            if (!a2 && com.sankuai.waimai.store.base.abtest.a.e() && com.sankuai.waimai.store.poi.list.util.b.a().b()) {
                J();
                com.sankuai.waimai.store.fsp.a.a().a(l(), "start_location_onlyMt");
                com.sankuai.waimai.store.util.monitor.b.a().a(SGHomeLocationStrategy.OnlyMtLocation).a();
                a(true, true);
            } else {
                if ((!a2 && com.sankuai.waimai.store.base.abtest.a.g()) && this.m.bi) {
                    am.a((Activity) l(), "覆盖发起定位申请");
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = u;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b02fad115b96738bc318a688923c29a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b02fad115b96738bc318a688923c29a");
                    } else {
                        this.j.b();
                        com.sankuai.waimai.store.poilist.preload.b.a().b.a(this.z);
                        com.sankuai.waimai.store.poilist.preload.b.a().c.a(this.A);
                        this.y = t.a(this.r) ? this.y : this.r;
                        a(this.y, false);
                        this.B = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WMSMTileChannelViewController_location", SystemClock.elapsedRealtime());
                        this.B.recordStep("location_start");
                        af.a(l(), "sg.channel.locationstart.native");
                        com.sankuai.waimai.store.poilist.preload.c.a().a(l(), com.sankuai.waimai.store.poilist.preload.b.a(), "dj-463886d6a4beb2bb");
                    }
                    this.m.bi = false;
                } else {
                    com.sankuai.waimai.store.fsp.a.a().a(l(), "start_location");
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGHomeLocationStrategy.NotLocation).a();
                    a(true, true);
                }
            }
        }
        v();
    }

    private void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5040032693b2f7d5facac75a89afa7b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5040032693b2f7d5facac75a89afa7b1");
            return;
        }
        com.sankuai.waimai.store.poilist.preload.b.a().b.a(this.z);
        com.sankuai.waimai.store.poilist.preload.b.a().c.a(this.A);
        this.j.b();
        if (z2) {
            a(this.y, false);
        }
        com.sankuai.waimai.store.poilist.preload.c.a().b();
        this.B = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WMSMTileChannelViewController_location", SystemClock.elapsedRealtime());
        this.B.recordStep("location_start");
        l().s().recordStep("home_pag_locate_start");
        if (this.m.y) {
            l().s().recordStep("home_page_time_start_location");
        } else {
            l().s().recordStep("channel_page_time_start_location");
        }
        af.a(l(), "sg.channel.locationstart.native");
        com.sankuai.waimai.store.poilist.preload.c.a().b(l(), com.sankuai.waimai.store.poilist.preload.b.a(), "dj-463886d6a4beb2bb");
        ab.b().a(l(), "key_time_last_location", System.currentTimeMillis());
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8578feece8c466a238054508b6638d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8578feece8c466a238054508b6638d");
            return;
        }
        if (!com.sankuai.waimai.store.poi.list.util.b.a().b()) {
            this.j.b();
        }
        a(this.y, false);
        com.sankuai.waimai.store.poilist.preload.b.a().b.a(this.z);
        com.sankuai.waimai.store.poilist.preload.b.a().c.a(this.A);
        this.B = MetricsSpeedMeterTask.createCustomSpeedMeterTask("WMSMTileChannelViewController_location", SystemClock.elapsedRealtime());
        this.B.recordStep("location_start");
        l().s().recordStep("home_pag_locate_start");
        com.sankuai.waimai.store.poilist.preload.c.a().b(l(), com.sankuai.waimai.store.poilist.preload.b.a(), "dj-463886d6a4beb2bb");
        ab.b().a(l(), "key_time_last_location", System.currentTimeMillis());
    }

    private boolean I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71be7d2802b9d3ed1e73ccf1a3019102", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71be7d2802b9d3ed1e73ccf1a3019102")).booleanValue();
        }
        if (K()) {
            return true;
        }
        z();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93a22780eb54180d506d26345965f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93a22780eb54180d506d26345965f8c");
        } else {
            this.k.h.b((k<PoiLocationAddress>) new PoiLocationAddress(str, z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9107a74dc5bab558f1dde74d0a6ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9107a74dc5bab558f1dde74d0a6ad1");
            return;
        }
        this.o = true;
        y();
        t();
        super.D();
    }

    private boolean K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c447877373df454805069f7604868de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c447877373df454805069f7604868de")).booleanValue() : com.sankuai.waimai.store.locate.a.g();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1ac78d0c73213665cd9bb942b6b73c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1ac78d0c73213665cd9bb942b6b73c");
            return;
        }
        super.E();
        long b = ab.b().b((Context) l(), "key_last_background_time", 0L);
        if (com.sankuai.waimai.store.poi.list.util.a.b && ai.a(b)) {
            com.sankuai.waimai.store.locate.a.h();
            com.sankuai.waimai.store.poilist.preload.c a = com.sankuai.waimai.store.poilist.preload.c.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poilist.preload.c.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "77179e5015487089bb5c818b68b92bfb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "77179e5015487089bb5c818b68b92bfb");
            } else {
                a.b.set(false);
            }
            z();
        }
        com.sankuai.waimai.store.poi.list.util.a.b = false;
    }

    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4
    public final void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b44dcdcbbb9ac02e0913af0bd88dd7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b44dcdcbbb9ac02e0913af0bd88dd7e");
            return;
        }
        super.F();
        long currentTimeMillis = System.currentTimeMillis();
        if (com.sankuai.waimai.store.poilist.preload.c.c == -1 || currentTimeMillis - com.sankuai.waimai.store.poilist.preload.c.d < PayTask.j) {
            return;
        }
        ?? r1 = com.sankuai.waimai.store.poilist.preload.c.c == 2 ? 1 : 0;
        Object[] objArr2 = {Byte.valueOf((byte) r1)};
        ChangeQuickRedirect changeQuickRedirect2 = u;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "429c19cf0aa0926d24e9fd4c774ccad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "429c19cf0aa0926d24e9fd4c774ccad4");
        } else {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGLocateSucRate.SGLocateSucRate).a((boolean) r1).a();
        }
    }
}
