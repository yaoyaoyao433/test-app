package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.LocationCatReporter;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
import com.sankuai.waimai.foundation.location.geo.LocationUserAddressAPI;
import com.sankuai.waimai.foundation.location.model.LocationHistoryAddressResponse;
import com.sankuai.waimai.foundation.location.net.b;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.utils.ad;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final g f = new g();
    public volatile f b;
    public volatile a c;
    public final b d;
    public final e e;
    private final i g;
    private volatile WmAddress h;
    private volatile WMLocation i;
    private final List<com.sankuai.waimai.foundation.location.v2.callback.a> j;
    private final List<DeviceLocateCallback> k;
    private volatile boolean l;
    private final double m;
    private final double n;

    public static /* synthetic */ void a(g gVar, WMLocation wMLocation, String str) {
        Object[] objArr = {wMLocation, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "353d2892d6ca0ee42eb9f86ef6edf784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "353d2892d6ca0ee42eb9f86ef6edf784");
        } else {
            com.sankuai.waimai.foundation.location.e.c().a(wMLocation, str);
        }
    }

    public static /* synthetic */ void b(g gVar, final WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "65b56e6bc71e94266fb5a03645044574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "65b56e6bc71e94266fb5a03645044574");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.foundation.location.v2.g.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e00aeea036abe87595437cfba5419f5e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e00aeea036abe87595437cfba5419f5e");
                        return;
                    }
                    synchronized (g.this.k) {
                        for (DeviceLocateCallback deviceLocateCallback : g.this.k) {
                            try {
                                deviceLocateCallback.a(wMLocation);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                            }
                        }
                        g.this.k.clear();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void c(g gVar, final WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "bbe0f3726eb565128d13e161091dee9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "bbe0f3726eb565128d13e161091dee9e");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.foundation.location.v2.g.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c64237a0f9b31f32d8f1788bda29bba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c64237a0f9b31f32d8f1788bda29bba");
                        return;
                    }
                    synchronized (g.this.j) {
                        for (com.sankuai.waimai.foundation.location.v2.callback.a aVar : g.this.j) {
                            try {
                                aVar.a(wmAddress);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                            }
                        }
                        g.this.j.clear();
                    }
                }
            });
        }
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8680ee3ce17f3c67771cf88f03a7bd7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8680ee3ce17f3c67771cf88f03a7bd7a");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = new b();
        this.g = new i();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = false;
        this.e = new e();
        this.m = 40.240957d;
        this.n = 116.176188d;
    }

    public static g a() {
        return f;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7a63001d149d90194b7812e28bd80f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7a63001d149d90194b7812e28bd80f");
        } else if (this.b == null) {
            this.b = new f(com.meituan.android.singleton.b.a);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26eb2dddf77fb8b7275c0ac70e2aaf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26eb2dddf77fb8b7275c0ac70e2aaf8");
        } else if (this.c == null) {
            this.c = new a(com.meituan.android.singleton.b.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c544d8c6bb5373d9e757d55e05e70986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c544d8c6bb5373d9e757d55e05e70986");
        } else if (wmAddress != null) {
            wmAddress.setLastRefreshTime(System.currentTimeMillis());
            i iVar = this.g;
            Object[] objArr2 = {wmAddress};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "0cec5af0d0eb0dfd8968d0072ad1fe2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "0cec5af0d0eb0dfd8968d0072ad1fe2f");
                return;
            }
            h.c(wmAddress.getWMLocation());
            h.b(wmAddress);
            h.c(wmAddress.getMafCity());
            h.b(wmAddress.getMeitaunCity());
            if (wmAddress.getWMLocation() != null) {
                com.sankuai.waimai.foundation.location.g.a(wmAddress.getWMLocation().getLatitude(), wmAddress.getWMLocation().getLongitude(), wmAddress.getAddress());
            }
            com.sankuai.waimai.foundation.location.e.c().a("PoiAddressDelegate", "PoiAddressDelegate", Pair.create("callTag", "saveWmAddress"), Pair.create(GearsLocator.ADDRESS, wmAddress));
        }
    }

    private static void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0a9d95ab59ef42be6c2301228da13f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0a9d95ab59ef42be6c2301228da13f2");
        } else {
            com.sankuai.waimai.foundation.location.net.b.a(((LocationUserAddressAPI) com.sankuai.waimai.foundation.location.net.b.a((Class<Object>) LocationUserAddressAPI.class)).fetchNewHistoryAddress("1", "0"), new b.AbstractC0949b<LocationHistoryAddressResponse>() { // from class: com.sankuai.waimai.foundation.location.v2.g.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    LocationHistoryAddressResponse locationHistoryAddressResponse = (LocationHistoryAddressResponse) obj;
                    Object[] objArr2 = {locationHistoryAddressResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7481829fc2f8caabf3b4e8b9987adb5f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7481829fc2f8caabf3b4e8b9987adb5f");
                    } else if (locationHistoryAddressResponse == null || locationHistoryAddressResponse.b != 0) {
                    } else {
                        com.sankuai.waimai.foundation.location.e.c().a(locationHistoryAddressResponse.e);
                    }
                }
            }, com.sankuai.waimai.foundation.location.net.b.b);
        }
    }

    public final void a(com.sankuai.waimai.foundation.location.v2.listener.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e38efb9478a7ccbfdc1be96836148d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e38efb9478a7ccbfdc1be96836148d");
        } else if (com.sankuai.waimai.foundation.location.e.a() && aVar.getClass().getEnclosingClass() != null && aVar.getClass().isAnonymousClass()) {
            throw new RuntimeException("Listener 不能使用匿名内部类，LocationManagerV2会以弱引用的方式持有Listener，可能会导致调用不成功");
        } else {
            b();
            this.b.a(aVar);
            com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "addLocationChangeListener", Pair.create("callTag", str), Pair.create("onDeviceLocationChangeListener", aVar));
        }
    }

    public final void b(com.sankuai.waimai.foundation.location.v2.listener.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74aba40da622dafa65c8edede8391c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74aba40da622dafa65c8edede8391c0b");
            return;
        }
        b();
        this.b.b(aVar);
        com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "removeLocationChangeListener", Pair.create("callTag", str), Pair.create("onDeviceLocationChangeListener", aVar));
    }

    public final void a(DeviceLocateCallback deviceLocateCallback, boolean z, String str, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1737defa379385c3f6aa9fad9ce2bac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1737defa379385c3f6aa9fad9ce2bac1");
        } else {
            a(deviceLocateCallback, z, str, false, kVar);
        }
    }

    private void a(DeviceLocateCallback deviceLocateCallback, String str, boolean z, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fe094664714e6cfc60caee209455b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fe094664714e6cfc60caee209455b61");
        } else {
            a(deviceLocateCallback, true, str, z, kVar);
        }
    }

    public final void a(final DeviceLocateCallback deviceLocateCallback, boolean z, String str, boolean z2, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a097a3b557785812999f84a6a199e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a097a3b557785812999f84a6a199e9");
            return;
        }
        com.sankuai.meituan.takeoutnew.util.aop.d.a();
        b();
        this.b.a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.foundation.location.v2.g.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1756bbf682b58205b639617c6021991", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1756bbf682b58205b639617c6021991");
                    return;
                }
                g.this.i = wMLocation;
                if (deviceLocateCallback != null) {
                    deviceLocateCallback.a(wMLocation);
                }
                g.b(g.this, wMLocation);
            }
        }, z, z2, kVar);
        com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateForLatLng", Pair.create("callTag", str), Pair.create("DeviceLocateCallback", deviceLocateCallback));
    }

    public final void a(final DeviceLocateCallback deviceLocateCallback, final com.sankuai.waimai.foundation.location.v2.callback.b bVar, boolean z, boolean z2, final String str, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, bVar, (byte) 1, (byte) 0, str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1c59e002a71c85c4b6e5197c257333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1c59e002a71c85c4b6e5197c257333");
            return;
        }
        a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.foundation.location.v2.g.8
            public static ChangeQuickRedirect a;
            public long b = System.currentTimeMillis();

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15f2c44297c83a7e5b7f1d0a584be9fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15f2c44297c83a7e5b7f1d0a584be9fc");
                    return;
                }
                wMLocation.setLocateDuration(System.currentTimeMillis() - this.b);
                g.a(g.this, wMLocation, str);
                if (r3 && wMLocation != null && wMLocation.getLocationResultCode().a == 1200) {
                    h.c(wMLocation);
                }
                if (wMLocation.getLocationResultCode().a != 1200) {
                    h.c((WMLocation) null);
                    com.sankuai.waimai.foundation.location.e.c().c();
                    if (wMLocation.getLocationSnifferReporter() != null) {
                        wMLocation.getLocationSnifferReporter().a(wMLocation);
                    }
                }
                g.this.i = wMLocation;
                g.b(g.this, wMLocation);
                if (deviceLocateCallback != null) {
                    deviceLocateCallback.a(wMLocation);
                    com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateAndRegeo", Pair.create("callTag", str), Pair.create("DeviceLocateCallback", deviceLocateCallback), Pair.create("location", wMLocation.toString()));
                }
                if (wMLocation.getLocationResultCode().a == 1200) {
                    g.this.l = true;
                    j.a(wMLocation, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.foundation.location.v2.g.8.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                        public final void a(WmAddress wmAddress) {
                            Object[] objArr3 = {wmAddress};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d3f651064eb0277146d9bbb73ed0bb5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d3f651064eb0277146d9bbb73ed0bb5");
                                return;
                            }
                            if (r3) {
                                g.this.a(wmAddress);
                            }
                            if (wmAddress != null) {
                                h.d(wmAddress.getMafCity());
                                h.a(wmAddress.getMeitaunCity());
                            }
                            g.this.l = false;
                            if (bVar != null) {
                                bVar.a(wmAddress);
                                com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateAndRegeo", Pair.create("callTag", str), Pair.create("RegeoCallback", bVar), Pair.create(GearsLocator.ADDRESS, wmAddress.toString()));
                            }
                            if (r3) {
                                g.this.g.a(wmAddress, str, true);
                            }
                        }
                    });
                } else if (bVar != null) {
                    WmAddress wmAddress = new WmAddress();
                    wmAddress.setStatusCode(1202);
                    bVar.a(wmAddress);
                }
            }
        }, false, "LocationManagerV3", kVar);
        com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateAndRegeo", Pair.create("callTag", str), Pair.create("DeviceLocateCallback", deviceLocateCallback), Pair.create("RegeoCallback", bVar), Pair.create("updatePoiAddress", Boolean.TRUE));
    }

    public final void a(final DeviceLocateCallback deviceLocateCallback, final com.sankuai.waimai.foundation.location.v2.callback.b bVar, final String str, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, bVar, str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46abda9093c73f42d8c36687e59a64da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46abda9093c73f42d8c36687e59a64da");
            return;
        }
        c();
        this.c.a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.foundation.location.v2.g.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(@Nullable WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0791dabeb8acb755cede68274be1207e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0791dabeb8acb755cede68274be1207e");
                    return;
                }
                if (deviceLocateCallback != null) {
                    deviceLocateCallback.a(wMLocation);
                    com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateAndRegeoForBusiness", Pair.create("callTag", str), Pair.create("DeviceLocateCallback", deviceLocateCallback), Pair.create("location", wMLocation.toString()));
                }
                if (wMLocation != null && wMLocation.getLocationResultCode().a == 1200) {
                    g.this.l = true;
                    j.a(wMLocation, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.foundation.location.v2.g.9.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                        public final void a(WmAddress wmAddress) {
                            Object[] objArr3 = {wmAddress};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5e090c2ca6bdc2207f60d77df407582", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5e090c2ca6bdc2207f60d77df407582");
                                return;
                            }
                            g.this.l = false;
                            if (bVar != null) {
                                bVar.a(wmAddress);
                                com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateAndRegeo", Pair.create("callTag", str), Pair.create("RegeoCallback", bVar), Pair.create(GearsLocator.ADDRESS, wmAddress.toString()));
                            }
                        }
                    });
                } else if (bVar != null) {
                    WmAddress wmAddress = new WmAddress();
                    wmAddress.setStatusCode(1202);
                    bVar.a(wmAddress);
                }
            }
        }, false, kVar);
    }

    public final void a(com.sankuai.waimai.foundation.location.v2.callback.a aVar, boolean z, String str, @Nullable k kVar) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73e159c533f7e1920ba4d6f44a97e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73e159c533f7e1920ba4d6f44a97e9f");
            return;
        }
        a((DeviceLocateCallback) null, aVar, z, str, kVar);
        com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateRegeoCheckAddress", Pair.create("callTag", str), Pair.create("AddressCheckCallback", aVar), Pair.create("updatePoiAddress", Boolean.valueOf(z)));
    }

    public final void a(DeviceLocateCallback deviceLocateCallback, com.sankuai.waimai.foundation.location.v2.callback.a aVar, boolean z, String str, @Nullable k kVar) {
        Object[] objArr = {null, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f297bdf19f516a771370e5fd854e23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f297bdf19f516a771370e5fd854e23");
        } else {
            a((DeviceLocateCallback) null, aVar, z, str, false, kVar);
        }
    }

    public final void a(final DeviceLocateCallback deviceLocateCallback, final com.sankuai.waimai.foundation.location.v2.callback.a aVar, final boolean z, final String str, boolean z2, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1efabf8ed43d00eb98f540eefad3542f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1efabf8ed43d00eb98f540eefad3542f");
            return;
        }
        if (com.sankuai.waimai.foundation.location.f.a().b()) {
            WmHistoryAddressList l = h.l();
            long c = com.sankuai.waimai.foundation.location.f.a().c();
            if (l == null || !l.isValid(c)) {
                q();
            }
        }
        if (!a(str)) {
            a(deviceLocateCallback, aVar, str, z2, kVar);
        } else {
            a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.foundation.location.v2.g.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
                public final void a(WMLocation wMLocation) {
                    Object[] objArr2 = {wMLocation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97f0cea3ebc7a64be5de9894c4e0e796", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97f0cea3ebc7a64be5de9894c4e0e796");
                        return;
                    }
                    if (wMLocation.getLocationResultCode().a != 1200) {
                        LocationCatReporter.c(3000);
                        LocationCatReporter.b(4000);
                        if (wMLocation.getLocationResultCode().a == 1202) {
                            com.sankuai.waimai.foundation.location.a.a(3500);
                        } else if (wMLocation.getLocationResultCode().a == 1203) {
                            com.sankuai.waimai.foundation.location.a.a(9500);
                        } else {
                            com.sankuai.waimai.foundation.location.a.a(7500);
                        }
                        wMLocation = g.this.a(wMLocation, true);
                    } else {
                        wMLocation.setIsCache(false);
                        LocationCatReporter.b(1000);
                    }
                    if (wMLocation.getLocationResultCode().a == 1200) {
                        wMLocation = g.this.d.a(wMLocation, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.foundation.location.v2.g.10.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                            public final void a(WmAddress wmAddress) {
                                Object[] objArr3 = {wmAddress};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b34d6407ee234435bc3bb86979570abb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b34d6407ee234435bc3bb86979570abb");
                                    return;
                                }
                                g.this.a(wmAddress);
                                if (wmAddress != null) {
                                    h.d(wmAddress.getMafCity());
                                    h.a(wmAddress.getMeitaunCity());
                                }
                                com.sankuai.waimai.foundation.location.utils.b.a("locationTest", "startLocateCheckAddress:" + wmAddress, new Object[0]);
                                if (aVar != null) {
                                    aVar.a(wmAddress);
                                }
                                g.this.h = wmAddress;
                                g.c(g.this, wmAddress);
                                com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateCheckAddress", Pair.create("callTag", str), Pair.create("DeviceLocateCallback", deviceLocateCallback), Pair.create("AddressCheckCallback", aVar), Pair.create("WmAddress", g.this.h));
                                if (z) {
                                    g.this.g.a(wmAddress, str, true);
                                }
                            }
                        });
                    }
                    g.a(g.this, wMLocation, str);
                    g.this.i = wMLocation;
                    if (z && wMLocation != null && wMLocation.getLocationResultCode().a == 1200) {
                        h.c(wMLocation);
                    }
                    if (wMLocation.getLocationResultCode().a != 1200) {
                        h.c((WMLocation) null);
                        com.sankuai.waimai.foundation.location.e.c().c();
                        if (wMLocation.getLocationSnifferReporter() != null) {
                            wMLocation.getLocationSnifferReporter().a(wMLocation);
                        }
                    }
                    g.b(g.this, wMLocation);
                    if (deviceLocateCallback != null) {
                        deviceLocateCallback.a(wMLocation);
                    }
                    if (wMLocation.getLocationResultCode().a != 1200 && aVar != null) {
                        WmAddress wmAddress = new WmAddress();
                        wmAddress.setWMLocation(wMLocation);
                        wmAddress.setStatusCode(1202);
                        aVar.a(wmAddress);
                    }
                    com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "startLocateRegeoCheckAddress", Pair.create("callTag", str), Pair.create("DeviceLocateCallback", deviceLocateCallback), Pair.create("AddressCheckCallback", aVar), Pair.create("updatePoiAddress", Boolean.valueOf(z)), Pair.create("location", wMLocation));
                }
            }, str, z2, kVar);
        }
    }

    private void a(final DeviceLocateCallback deviceLocateCallback, final com.sankuai.waimai.foundation.location.v2.callback.a aVar, final String str, boolean z, @Nullable k kVar) {
        Object[] objArr = {deviceLocateCallback, aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ddffb1029762e1367e217ed124999a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ddffb1029762e1367e217ed124999a");
            return;
        }
        c();
        this.c.a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.foundation.location.v2.g.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(@Nullable WMLocation wMLocation) {
                WMLocation wMLocation2;
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebfb745a19a9ef056ec040461df2b85f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebfb745a19a9ef056ec040461df2b85f");
                    return;
                }
                WMLocation wMLocation3 = wMLocation;
                if (wMLocation != null) {
                    if (wMLocation.getLocationResultCode().a != 1200) {
                        wMLocation2 = g.this.a(wMLocation, false);
                    } else {
                        wMLocation.setIsCache(false);
                        wMLocation2 = wMLocation;
                    }
                    int i = wMLocation2.getLocationResultCode().a;
                    wMLocation3 = wMLocation2;
                    if (i == 1200) {
                        wMLocation3 = g.this.d.a(wMLocation2, new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.foundation.location.v2.g.11.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                            public final void a(WmAddress wmAddress) {
                                Object[] objArr3 = {wmAddress};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fb92abe9015354778eef7875be59207", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fb92abe9015354778eef7875be59207");
                                    return;
                                }
                                if (aVar != null) {
                                    aVar.a(wmAddress);
                                }
                                com.sankuai.waimai.foundation.location.b c = com.sankuai.waimai.foundation.location.e.c();
                                Pair[] pairArr = new Pair[4];
                                pairArr[0] = Pair.create("callTag", str);
                                pairArr[1] = Pair.create("DeviceLocateCallback", deviceLocateCallback);
                                pairArr[2] = Pair.create("AddressCheckCallback", aVar);
                                Object obj = wmAddress;
                                if (wmAddress == null) {
                                    obj = StringUtil.NULL;
                                }
                                pairArr[3] = Pair.create("WmAddress", obj);
                                c.a("LocationManagerV3", "startLocateCheckAddressForBusiness", pairArr);
                            }
                        });
                    }
                }
                if (deviceLocateCallback != null) {
                    deviceLocateCallback.a(wMLocation3);
                }
                if ((wMLocation3 == null || wMLocation3.getLocationResultCode().a != 1200) && aVar != null) {
                    WmAddress wmAddress = new WmAddress();
                    wmAddress.setWMLocation(wMLocation3);
                    wmAddress.setStatusCode(1202);
                    aVar.a(wmAddress);
                }
                com.sankuai.waimai.foundation.location.b c = com.sankuai.waimai.foundation.location.e.c();
                Pair[] pairArr = new Pair[4];
                pairArr[0] = Pair.create("callTag", str);
                pairArr[1] = Pair.create("DeviceLocateCallback", deviceLocateCallback);
                pairArr[2] = Pair.create("AddressCheckCallback", aVar);
                Object obj = wMLocation3;
                if (wMLocation3 == null) {
                    obj = StringUtil.NULL;
                }
                pairArr[3] = Pair.create("location", obj);
                c.a("LocationManagerV3", "startLocateCheckAddressForBusiness", pairArr);
            }
        }, z, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WMLocation a(WMLocation wMLocation, boolean z) {
        Object[] objArr = {wMLocation, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4684c002384b18fbcde753299bad00", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4684c002384b18fbcde753299bad00");
        }
        LocationSnifferReporter locationSnifferReporter = wMLocation.getLocationSnifferReporter();
        if (!((ILocationCacheStrategy) com.sankuai.waimai.router.a.a(ILocationCacheStrategy.class, "LocationCacheStrategyProvider")).isNewCacheStrategy()) {
            if (locationSnifferReporter != null) {
                locationSnifferReporter.a();
                return wMLocation;
            }
            return wMLocation;
        }
        long h = h.h();
        WMLocation g = h.g();
        g = (g == null || System.currentTimeMillis() - g.getCreateTime() > h) ? null : null;
        if (g == null) {
            if (locationSnifferReporter != null) {
                locationSnifferReporter.a();
                return wMLocation;
            }
            return wMLocation;
        }
        g.setLocateDuration(wMLocation.getLocateDuration());
        LocationResultCode locationResultCode = new LocationResultCode();
        locationResultCode.a = 1200;
        locationResultCode.b = "";
        g.setLocationResultCode(locationResultCode);
        g.setLocationSnifferReporter(locationSnifferReporter);
        g.setIsCache(true);
        if (z) {
            LocationCatReporter.c(1000);
        }
        com.sankuai.waimai.foundation.location.a.b(1);
        return g;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d008812d3418cb8d7c1cb49e4d5941d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d008812d3418cb8d7c1cb49e4d5941d3");
            return;
        }
        b();
        this.b.a();
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba91efbb759d684e0daded21a1c680c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba91efbb759d684e0daded21a1c680c");
        } else {
            this.d.b();
        }
    }

    public final void a(com.sankuai.waimai.foundation.location.v2.listener.c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531d099f2aab43da0e48e0e2f3ced877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531d099f2aab43da0e48e0e2f3ced877");
        } else if (com.sankuai.waimai.foundation.location.e.a() && cVar.getClass().getEnclosingClass() != null && cVar.getClass().isAnonymousClass()) {
            throw new RuntimeException("Listener 不能使用匿名内部类，LocationManagerV2会以弱引用的方式持有Listener，可能会导致调用不成功");
        } else {
            this.g.a(cVar);
            com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "addPoiChangeListener", Pair.create("callTag", str), Pair.create("OnPoiAddressChangeListener", cVar));
        }
    }

    public final void b(com.sankuai.waimai.foundation.location.v2.listener.c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6248fb05947c5451cf86616a886c66d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6248fb05947c5451cf86616a886c66d");
        } else if (cVar == null) {
        } else {
            this.g.b(cVar);
            com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "removePoiChangeListener", Pair.create("callTag", str), Pair.create("OnPoiAddressChangeListener", cVar));
        }
    }

    public final void a(final WmAddress wmAddress, final String str, boolean z) {
        Object[] objArr = {wmAddress, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3427037d25c3562527ac220052e444e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3427037d25c3562527ac220052e444e");
        } else if (wmAddress == null || wmAddress.getWMLocation() == null || wmAddress.getWMLocation().getLatitude() == 0.0d || wmAddress.getWMLocation().getLongitude() == 0.0d) {
            com.sankuai.waimai.foundation.location.e.c().a("LocationManagerV3", "notifyPoiAddressChanged", Pair.create("callTag", str), Pair.create("WmAddress", wmAddress), Pair.create("Result", "Change Failed"));
        } else {
            a(wmAddress);
            if (wmAddress.getMafCity() == null || wmAddress.getMeitaunCity() == null || TextUtils.isEmpty(wmAddress.getAddress())) {
                j.a(wmAddress, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.foundation.location.v2.g.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                    public final void a(WmAddress wmAddress2) {
                        Object[] objArr2 = {wmAddress2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeaa1ecc39b081966318e71a2c1ce9ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeaa1ecc39b081966318e71a2c1ce9ea");
                            return;
                        }
                        if (!TextUtils.isEmpty(wmAddress.getAddress())) {
                            wmAddress2.setAddress(wmAddress.getAddress());
                        }
                        g.this.a(wmAddress2);
                        g.this.g.a(wmAddress2, str, r4);
                    }
                });
                return;
            }
            this.g.a(wmAddress, str, false);
            j.a(wmAddress);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ffe4a0691fbe4a14f332140098a300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ffe4a0691fbe4a14f332140098a300");
        } else {
            this.e.a();
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b05a6bc4d32fe738b4a87fdb5cbe3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b05a6bc4d32fe738b4a87fdb5cbe3b")).booleanValue();
        }
        b();
        return this.b.b();
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "654d68a7f318258c311b11a7948bf0aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "654d68a7f318258c311b11a7948bf0aa")).booleanValue();
        }
        if (this.d != null) {
            return this.d.a() || this.l;
        }
        return false;
    }

    public final WMLocation i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4290dfc71f60053d16d2657a0cd0b05c", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4290dfc71f60053d16d2657a0cd0b05c") : h.i();
    }

    public final WmAddress j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e836da1c96ee632bd0390faf82b9c8ac", RobustBitConfig.DEFAULT_VALUE) ? (WmAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e836da1c96ee632bd0390faf82b9c8ac") : h.e();
    }

    public final WmAddress k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00282fb20d45778bf97ab889d18a7d1f", RobustBitConfig.DEFAULT_VALUE) ? (WmAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00282fb20d45778bf97ab889d18a7d1f") : h.f();
    }

    public final City l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528808ee612185de0974c8751ac56c58", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528808ee612185de0974c8751ac56c58") : h.d();
    }

    public final City m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebdd040ff55100de9b76c6cb7762ce0c", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebdd040ff55100de9b76c6cb7762ce0c") : h.a();
    }

    public final City n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5360fada2c5f76162eb10e881732154e", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5360fada2c5f76162eb10e881732154e") : h.b();
    }

    public final City o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4b599d9ec9e8b8a11a1ec882d9d6e5", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4b599d9ec9e8b8a11a1ec882d9d6e5") : h.c();
    }

    public final WMLocation p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b028cb04a5322b627ea62574c6d29ad9", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b028cb04a5322b627ea62574c6d29ad9") : h.j();
    }

    public final WMLocation a(WMLocation wMLocation) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91c8acc12edd45eb8fb3483c0b8c6e1", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91c8acc12edd45eb8fb3483c0b8c6e1") : h.k();
    }

    public final void a(double d, double d2, final com.sankuai.waimai.foundation.location.v2.callback.b bVar) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d006d26a9e8b4fbfc2d6f4a5e672851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d006d26a9e8b4fbfc2d6f4a5e672851");
        } else if (bVar == null) {
        } else {
            j.a(d, d2, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.foundation.location.v2.g.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                public final void a(WmAddress wmAddress) {
                    Object[] objArr2 = {wmAddress};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d8936b85eec5d07438397aebeeac94e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d8936b85eec5d07438397aebeeac94e");
                    } else {
                        bVar.a(wmAddress);
                    }
                }
            });
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafb9dec93b4babf9bd0fce36c0f998c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafb9dec93b4babf9bd0fce36c0f998c")).booleanValue() : !"search".equals(str);
    }

    public final boolean b(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f10815b719e60923baff2f01e52ab072", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f10815b719e60923baff2f01e52ab072")).booleanValue() : wMLocation != null && !wMLocation.hasLocatedPermission && com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(wMLocation.getLatitude()), Double.valueOf(40.240957d)) && com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(wMLocation.getLongitude()), Double.valueOf(116.176188d));
    }
}
