package com.sankuai.waimai.business.page.home.preload.task;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.preload.locate.a;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends i {
    public static ChangeQuickRedirect a;
    Handler b;
    @Nullable
    public MetricsSpeedMeterTask c;
    private boolean d;
    private com.sankuai.waimai.business.page.home.preload.locate.a i;

    public static /* synthetic */ void a(e eVar, WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "135e4112e839e7aa0b96f12edb3314fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "135e4112e839e7aa0b96f12edb3314fe");
            return;
        }
        eVar.b.removeCallbacksAndMessages(null);
        PreloadDataModel.get().setLocation(wMLocation);
        if (eVar.b(wMLocation)) {
            PreloadDataModel.get().setMainLoaded(true);
            if (com.sankuai.waimai.foundation.core.a.d()) {
                com.sankuai.waimai.business.page.home.againstcheating.a.a("location");
            }
            if (!eVar.c()) {
                eVar.c.recordStep("location_ready");
            }
            m.a().a("Location-");
            PreloadDataModel.get().setLocationTimeoutState(false);
            eVar.a(wMLocation);
            return;
        }
        eVar.c(wMLocation);
        if (!eVar.c()) {
            eVar.c.disable();
        }
        m.a().cancel();
        if (com.sankuai.waimai.business.page.home.preload.b.b().a) {
            Boolean a2 = PreloadDataModel.get().getLocationTimeoutState().a();
            if (a2 == null || !a2.booleanValue()) {
                com.sankuai.waimai.business.page.home.locate.c.a(false);
            }
            PreloadDataModel.get().setLocationTimeoutState(true);
        }
    }

    public e() {
        this(false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bcf28c71ff3a4645f1aa03069d4bbce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bcf28c71ff3a4645f1aa03069d4bbce");
        }
    }

    private e(boolean z) {
        super("LocateTask");
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cc4d960f817ebbe34b6e66cd8ca6142", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cc4d960f817ebbe34b6e66cd8ca6142");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.d = false;
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        String name;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a614172703948067ec7621d7c94224b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a614172703948067ec7621d7c94224b");
            return;
        }
        com.sankuai.waimai.business.page.home.homecache.d.a();
        if (com.sankuai.waimai.platform.model.c.a().c()) {
            d();
            return;
        }
        this.i = new com.sankuai.waimai.business.page.home.preload.locate.a();
        if (this.d) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b41dbff411f080053b1c45b2749ea59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b41dbff411f080053b1c45b2749ea59");
                return;
            } else if (this.i != null) {
                this.i.a(new a.b() { // from class: com.sankuai.waimai.business.page.home.preload.task.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.preload.locate.a.b
                    public final void a(@Nullable WMLocation wMLocation) {
                        Object[] objArr3 = {wMLocation};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c83d97588b74c145449e77e6966f318", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c83d97588b74c145449e77e6966f318");
                        } else if (!e.this.b(wMLocation)) {
                            com.sankuai.waimai.business.page.home.preload.a.a(15002);
                        } else {
                            PreloadDataModel.get().setRecommendedLocation(wMLocation);
                            e.this.a(wMLocation);
                            com.sankuai.waimai.business.page.home.preload.a.a(15003);
                        }
                    }
                });
                return;
            } else {
                return;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c800c95280e932f10b6d15ece0c67ee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c800c95280e932f10b6d15ece0c67ee4");
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            m.a().a("Location+");
            if (c()) {
                j.a("Location+");
            } else {
                j.cancel("hot_boot_started");
                this.c.recordStep("locate_start");
            }
            if (this.i != null) {
                final com.sankuai.waimai.business.page.home.preload.locate.a aVar = this.i;
                final a.InterfaceC0791a interfaceC0791a = new a.InterfaceC0791a() { // from class: com.sankuai.waimai.business.page.home.preload.task.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.preload.locate.a.InterfaceC0791a
                    public final void a(@Nullable WMLocation wMLocation) {
                        Object[] objArr4 = {wMLocation};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "564447e8da46d7f78bc01189246fcff4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "564447e8da46d7f78bc01189246fcff4");
                        } else if (e.this.c()) {
                            e eVar = e.this;
                            long j = elapsedRealtime;
                            Object[] objArr5 = {new Long(j), wMLocation};
                            ChangeQuickRedirect changeQuickRedirect5 = e.a;
                            if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "09a05e30e66d0574a85609c768e0eeaf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "09a05e30e66d0574a85609c768e0eeaf");
                                return;
                            }
                            eVar.b.removeCallbacksAndMessages(null);
                            PreloadDataModel.get().setLocation(wMLocation);
                            if (eVar.b(wMLocation)) {
                                j.a("Location-");
                                m.a().a("Location-");
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                                Object[] objArr6 = {new Long(elapsedRealtime2)};
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.preload.b.a;
                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "5a8a0f73628e8a2f13f9b5486c64e923", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "5a8a0f73628e8a2f13f9b5486c64e923");
                                } else if (!TextUtils.isEmpty(com.sankuai.waimai.business.page.home.preload.b.c) && com.sankuai.waimai.business.page.home.preload.b.b != null) {
                                    char c = ((double) elapsedRealtime2) > com.sankuai.waimai.business.page.home.preload.b.b.b * 1000.0d ? '1' : '0';
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(com.sankuai.waimai.business.page.home.preload.b.c);
                                    sb.append(c);
                                    PageSP.a(sb.deleteCharAt(0).toString());
                                    com.sankuai.waimai.business.page.home.preload.b.c = null;
                                }
                                PreloadDataModel.get().setMainLoaded(false);
                                com.sankuai.waimai.business.page.home.againstcheating.a.a("location");
                                Object[] objArr7 = {wMLocation};
                                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.preload.b.a;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "8d4c8698b6c74250859466d04afafcba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "8d4c8698b6c74250859466d04afafcba");
                                } else if (wMLocation != null && !wMLocation.isCache() && (!com.sankuai.waimai.business.page.home.preload.b.a().d || wMLocation.isCorrectedWithHistoryAddress())) {
                                    PageSP.a(wMLocation);
                                }
                                PreloadDataModel.get().setLocationTimeoutState(false);
                                com.sankuai.waimai.business.page.home.utils.h.a().a("locate_success", new boolean[0]);
                                eVar.a(wMLocation);
                                return;
                            }
                            if (!eVar.b(wMLocation)) {
                                eVar.a(wMLocation);
                            }
                            j.cancel("locate_failed");
                            m.a().cancel();
                            eVar.c(wMLocation);
                            if (PreloadDataModel.get().getRecommendedLocation() != null) {
                                com.sankuai.waimai.business.page.home.preload.a.a(15202);
                            }
                            com.sankuai.waimai.business.page.home.utils.h.a().b();
                            if (com.sankuai.waimai.business.page.home.preload.b.b().a) {
                                Boolean a2 = PreloadDataModel.get().getLocationTimeoutState().a();
                                if (a2 == null || !a2.booleanValue()) {
                                    com.sankuai.waimai.business.page.home.locate.c.a(false);
                                }
                                PreloadDataModel.get().setLocationTimeoutState(true);
                            }
                            com.sankuai.waimai.business.page.home.preload.a.a(15005);
                        } else {
                            e.a(e.this, wMLocation);
                        }
                    }

                    @Override // com.sankuai.waimai.business.page.home.preload.locate.a.InterfaceC0791a
                    public final void a(@Nullable WmAddress wmAddress) {
                        Object[] objArr4 = {wmAddress};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa9d5b11b77c256a6919f052cdf0662d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa9d5b11b77c256a6919f052cdf0662d");
                            return;
                        }
                        e eVar = e.this;
                        Object[] objArr5 = {wmAddress};
                        ChangeQuickRedirect changeQuickRedirect5 = e.a;
                        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "c00cd194292d2104e538073c324e7cb8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "c00cd194292d2104e538073c324e7cb8");
                        } else if (wmAddress == null || wmAddress.getStatusCode() != 1202) {
                            PreloadDataModel.get().setAddress(wmAddress);
                        }
                    }
                };
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a4f7232ee9d11b8a8eb7bf94558045a3", RobustBitConfig.DEFAULT_VALUE)) {
                    name = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a4f7232ee9d11b8a8eb7bf94558045a3");
                } else {
                    name = c() ? com.sankuai.waimai.platform.domain.manager.location.v2.b.APP_INIT.name() : com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString();
                }
                String str = name;
                Object[] objArr5 = {interfaceC0791a, str};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.preload.locate.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "db0065a44fc106d378bc80858112b3a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "db0065a44fc106d378bc80858112b3a6");
                } else {
                    Object[] objArr6 = {interfaceC0791a, null, str};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.preload.locate.a.a;
                    if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "2a25f5e82ebeef748c566fe072fd44cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "2a25f5e82ebeef748c566fe072fd44cd");
                    } else {
                        if (com.sankuai.waimai.foundation.location.v2.g.a().g()) {
                            com.sankuai.waimai.foundation.location.v2.g.a().d();
                        }
                        if (com.sankuai.waimai.foundation.location.v2.g.a().h()) {
                            com.sankuai.waimai.foundation.location.v2.g.a().e();
                        }
                        com.sankuai.waimai.foundation.location.v2.g.a().a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.business.page.home.preload.locate.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
                            public final void a(@Nullable WMLocation wMLocation) {
                                Object[] objArr7 = {wMLocation};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3b82dec3237d64946b22b4dfc0dc8536", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3b82dec3237d64946b22b4dfc0dc8536");
                                    return;
                                }
                                aVar.d = true;
                                if (aVar.c) {
                                    return;
                                }
                                if (aVar.e) {
                                    com.sankuai.waimai.business.page.home.preload.a.a(15001);
                                }
                                aVar.b.removeCallbacksAndMessages(null);
                                com.sankuai.waimai.contextual.computing.service.address.a.a().b = true;
                                interfaceC0791a.a(wMLocation);
                            }
                        }, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.business.page.home.preload.locate.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                            public final void a(WmAddress wmAddress) {
                                Object[] objArr7 = {wmAddress};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8d753a17844f66c21e75b1b28250c23f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8d753a17844f66c21e75b1b28250c23f");
                                } else if (aVar.c) {
                                } else {
                                    interfaceC0791a.a(wmAddress);
                                }
                            }
                        }, true, str, !com.sankuai.waimai.foundation.core.a.d(), new k((Activity) null, "dj-b5e9814e9fb3a8f6"));
                        if (com.sankuai.waimai.business.page.home.preload.b.a().a) {
                            com.sankuai.waimai.business.page.home.preload.b.a();
                        }
                    }
                }
            }
        }
        PreloadDataModel.get().setLocationTimeoutState(false);
        if (com.sankuai.waimai.business.page.home.preload.b.b().a) {
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d0507c0b1f24317698815a97a9d8d8bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d0507c0b1f24317698815a97a9d8d8bd");
            } else {
                this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.preload.task.e.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = a;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "55803833e96d8d52370ff19705cf93e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "55803833e96d8d52370ff19705cf93e9");
                        } else if (PreloadDataModel.get().isLocateSuccess()) {
                        } else {
                            com.sankuai.waimai.business.page.home.locate.c.a(true);
                            PreloadDataModel.get().setLocationTimeoutState(true);
                        }
                    }
                }, com.sankuai.waimai.business.page.home.preload.b.b().b);
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d308647b56971be6de45b82e27bced54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d308647b56971be6de45b82e27bced54");
            return;
        }
        super.cancel();
        if (this.i != null) {
            com.sankuai.waimai.business.page.home.preload.locate.a aVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.preload.locate.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "96ac6ab227414bd6af6d99ffa5ddec8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "96ac6ab227414bd6af6d99ffa5ddec8e");
            } else {
                aVar.c = true;
                aVar.d = true;
                aVar.b.removeCallbacksAndMessages(null);
                if (com.sankuai.waimai.foundation.location.v2.g.a().g()) {
                    com.sankuai.waimai.foundation.location.v2.g.a().d();
                }
                if (com.sankuai.waimai.foundation.location.v2.g.a().h()) {
                    com.sankuai.waimai.foundation.location.v2.g.a().e();
                }
                com.sankuai.waimai.contextual.computing.service.address.a.a().b = true;
            }
        }
        this.b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdf092fd9f947e9150a0652d9d3b0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdf092fd9f947e9150a0652d9d3b0dc");
        } else if (b(wMLocation)) {
            d();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78866a8cb988142206fb6d37eed3505a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78866a8cb988142206fb6d37eed3505a");
        } else {
            super.d();
        }
    }

    boolean b(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb590b17ef86618d06bd660700d7fde", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb590b17ef86618d06bd660700d7fde")).booleanValue() : wMLocation != null && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(wMLocation.getLatitude()), Double.valueOf(0.0d)) && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(wMLocation.getLongitude()), Double.valueOf(0.0d)) && !com.sankuai.waimai.foundation.location.v2.g.a().b(wMLocation);
    }

    void c(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cf30303a0923a3f95d83d21ae97ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cf30303a0923a3f95d83d21ae97ab3");
        } else if (wMLocation == null) {
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_location").b("init_error_null").b(true).b());
        } else {
            a.AbstractC1040a a2 = new com.sankuai.waimai.business.page.common.log.a().a("home_page_location");
            com.sankuai.waimai.platform.capacity.log.i.d(a2.b("init_error_" + wMLocation.getLocationResultCode().a).c(wMLocation.getLocationResultCode().b).b(true).b());
        }
    }

    boolean c() {
        return this.c == null;
    }
}
