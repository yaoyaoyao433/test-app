package com.sankuai.waimai.foundation.location.v2;

import android.content.Context;
import android.os.SystemClock;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.LocationCatReporter;
import com.sankuai.waimai.foundation.location.geo.MtMobileApi;
import com.sankuai.waimai.foundation.location.model.CityResponse;
import com.sankuai.waimai.foundation.location.model.LocationBaseResponse;
import com.sankuai.waimai.foundation.location.net.b;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.p;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    protected Context b;
    AtomicBoolean c;
    int d;
    ConcurrentMap<String, WeakReference<com.sankuai.waimai.foundation.location.v2.listener.a>> e;
    final List<DeviceLocateCallback> f;
    long g;
    AtomicBoolean h;
    private com.sankuai.waimai.foundation.location.locatesdk.b i;
    private com.sankuai.waimai.foundation.location.c j;

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "156b5ac06770209e71fd2945e381c91a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "156b5ac06770209e71fd2945e381c91a");
            return;
        }
        this.d = 0;
        this.e = new ConcurrentHashMap();
        this.f = new CopyOnWriteArrayList();
        this.g = 0L;
        this.h = new AtomicBoolean(false);
        this.j = new com.sankuai.waimai.foundation.location.c<WMLocation>() { // from class: com.sankuai.waimai.foundation.location.v2.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.c
            public final /* synthetic */ void a(WMLocation wMLocation) {
                WMLocation wMLocation2 = wMLocation;
                Object[] objArr2 = {wMLocation2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "589b8a540757ccf0a240c1c6e081ba6e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "589b8a540757ccf0a240c1c6e081ba6e");
                    return;
                }
                if ((wMLocation2 == null || wMLocation2.getLocationResultCode().a != 1200) && !p.f(f.this.b)) {
                    if (wMLocation2 == null) {
                        wMLocation2 = new WMLocation(WMLocation.WM_LOCATION_NETWORK_CHECK);
                    }
                    wMLocation2.setProvider(WMLocation.WM_LOCATION_NETWORK_CHECK);
                    LocationResultCode locationResultCode = new LocationResultCode();
                    locationResultCode.a = 1201;
                    locationResultCode.b = ab.a(f.this.b, (int) R.string.wm_locationsdk_failed_message);
                    wMLocation2.setLocationResultCode(locationResultCode);
                }
                final WMLocation wMLocation3 = wMLocation2;
                if (wMLocation3 != null && wMLocation3.getLocationResultCode().a == 1200) {
                    final f fVar = f.this;
                    Object[] objArr3 = {wMLocation3};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "1d28ba570798c5783c396d4501cdf0f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "1d28ba570798c5783c396d4501cdf0f2");
                    } else if (wMLocation3 != null) {
                        WMLocation i = h.i();
                        City a2 = h.a();
                        if (i == null || a2 == null || TextUtils.isEmpty(a2.getCityCode()) || !com.sankuai.waimai.foundation.location.g.b().equals(a2.getCityName()) || h.a(i, wMLocation3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(fVar.d);
                            com.sankuai.waimai.foundation.location.net.b.a(((MtMobileApi) com.sankuai.waimai.foundation.location.net.b.a((Class<Object>) MtMobileApi.class)).getCityInfo(wMLocation3.getLatitude() + CommonConstant.Symbol.COMMA + wMLocation3.getLongitude(), sb.toString(), 1, 1), new b.AbstractC0949b<LocationBaseResponse<CityResponse>>() { // from class: com.sankuai.waimai.foundation.location.v2.f.3
                                public static ChangeQuickRedirect a;

                                @Override // rx.e
                                public final void onError(Throwable th) {
                                }

                                @Override // rx.e
                                public final /* synthetic */ void onNext(Object obj) {
                                    LocationBaseResponse locationBaseResponse = (LocationBaseResponse) obj;
                                    Object[] objArr4 = {locationBaseResponse};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1d99e5c187c3048ea2c5f4f4958dbde8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1d99e5c187c3048ea2c5f4f4958dbde8");
                                    } else if (locationBaseResponse == null || locationBaseResponse.data == 0) {
                                    } else {
                                        h.a(new City((CityResponse) locationBaseResponse.data));
                                        com.sankuai.waimai.foundation.location.g.a(((CityResponse) locationBaseResponse.data).id);
                                        com.sankuai.waimai.foundation.location.g.a(((CityResponse) locationBaseResponse.data).city);
                                    }
                                }
                            }, com.sankuai.waimai.foundation.location.net.b.b);
                        }
                    }
                    f fVar2 = f.this;
                    Object[] objArr4 = {wMLocation3};
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "78f88a7182b6ec49b197d2a51295c0d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "78f88a7182b6ec49b197d2a51295c0d7");
                    } else if (wMLocation3 != null && wMLocation3.getLocationResultCode().a == 1200) {
                        double[] a3 = com.sankuai.waimai.foundation.location.e.c().a();
                        if (a3 != null) {
                            wMLocation3.setLatitude(a3[0]);
                            wMLocation3.setLongitude(a3[1]);
                        }
                        com.sankuai.waimai.foundation.location.g.a(wMLocation3.getLatitude(), wMLocation3.getLongitude());
                        com.sankuai.waimai.foundation.location.g.a(wMLocation3.getAccuracy());
                        if (com.sankuai.waimai.foundation.location.g.e() == null) {
                            com.sankuai.waimai.foundation.location.g.a(wMLocation3.getLatitude(), wMLocation3.getLongitude(), "");
                        }
                        if (wMLocation3.hasLocatedPermission) {
                            com.sankuai.waimai.foundation.location.h.a(wMLocation3.getLatitude(), wMLocation3.getLongitude());
                        }
                        h.b(wMLocation3);
                    }
                    com.sankuai.waimai.foundation.location.e.c().a((int) wMLocation3.getAccuracy(), (int) (SystemClock.uptimeMillis() - f.this.g), "waimai_location_accuracy");
                }
                f.this.h.compareAndSet(true, false);
                synchronized (f.this.f) {
                    if (!com.sankuai.waimai.foundation.utils.d.a(f.this.f) && wMLocation3 != null) {
                        for (DeviceLocateCallback deviceLocateCallback : f.this.f) {
                            try {
                                deviceLocateCallback.a(wMLocation3);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b(e);
                            }
                        }
                        f.this.f.clear();
                    }
                }
                if ((f.this.c != null && f.this.c.get()) || (f.this.c != null && !f.this.c.get() && wMLocation3 != null && wMLocation3.getLocationResultCode().a == 1200)) {
                    final f fVar3 = f.this;
                    Object[] objArr5 = {wMLocation3};
                    ChangeQuickRedirect changeQuickRedirect5 = f.a;
                    if (PatchProxy.isSupport(objArr5, fVar3, changeQuickRedirect5, false, "620eb60a8e1ed00fe67bea0f05a004d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, fVar3, changeQuickRedirect5, false, "620eb60a8e1ed00fe67bea0f05a004d0");
                    } else {
                        ad.a(new Runnable() { // from class: com.sankuai.waimai.foundation.location.v2.f.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4ff0c4c0087a6acb49761d42d7d59e95", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4ff0c4c0087a6acb49761d42d7d59e95");
                                    return;
                                }
                                for (String str : f.this.e.keySet()) {
                                    WeakReference<com.sankuai.waimai.foundation.location.v2.listener.a> weakReference = f.this.e.get(str);
                                    if (weakReference != null) {
                                        com.sankuai.waimai.foundation.location.v2.listener.a aVar = weakReference.get();
                                        if (aVar == null) {
                                            f.this.e.remove(str);
                                        } else {
                                            try {
                                                aVar.a(wMLocation3);
                                            } catch (Throwable th) {
                                                com.sankuai.waimai.foundation.location.utils.b.a(th);
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
                f.this.c = null;
            }
        };
        this.b = context;
    }

    public final void a(com.sankuai.waimai.foundation.location.v2.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e3daa2a6475e0f70a4f56161240be4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e3daa2a6475e0f70a4f56161240be4a");
        } else if (aVar != null) {
            this.e.put(aVar.toString(), new WeakReference<>(aVar));
        }
    }

    public final void b(com.sankuai.waimai.foundation.location.v2.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c93b54e826a893a1a2c6e4fb7a1f946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c93b54e826a893a1a2c6e4fb7a1f946");
        } else if (aVar != null) {
            this.e.remove(aVar.toString());
            if (!this.e.isEmpty() || this.i == null) {
                return;
            }
            this.i.a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1ca514230b9a32958024313e9a86a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1ca514230b9a32958024313e9a86a0c");
            return;
        }
        try {
            if (this.i != null) {
                this.i.a();
            }
            synchronized (this.f) {
                this.f.clear();
            }
        } catch (Exception unused) {
            synchronized (this.f) {
                this.f.clear();
            }
        } catch (Throwable th) {
            synchronized (this.f) {
                this.f.clear();
                this.h.set(false);
                throw th;
            }
        }
        this.h.set(false);
    }

    public final void a(DeviceLocateCallback deviceLocateCallback, boolean z, boolean z2, k kVar) {
        Object[] objArr = {deviceLocateCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99a892b24ebb67ff8536268382eb923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99a892b24ebb67ff8536268382eb923");
            return;
        }
        this.g = SystemClock.uptimeMillis();
        synchronized (this.f) {
            this.f.add(deviceLocateCallback);
        }
        if (this.h.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = new AtomicBoolean(z);
            } else if (!this.c.get()) {
                this.c.set(z);
            }
            if (this.i != null) {
                this.i.a();
                LocationCatReporter b = this.i.b();
                if (b != null) {
                    b.a();
                    b.a(SystemClock.uptimeMillis());
                }
                if (this.i instanceof com.sankuai.waimai.foundation.location.locatesdk.a) {
                    return;
                }
                this.i.a(kVar);
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "777ca6b8600b812b9417d4f4a17352d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "777ca6b8600b812b9417d4f4a17352d4");
            } else if (this.i == null) {
                synchronized (this) {
                    if (this.i == null) {
                        this.i = com.sankuai.waimai.foundation.location.e.c().a(this.b, String.valueOf(System.currentTimeMillis()), this.j);
                    }
                }
            }
            if (this.i instanceof com.sankuai.waimai.foundation.location.locatesdk.a) {
                return;
            }
            this.i.a(kVar);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5410f0c9bce115eaafba018cf23e16", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5410f0c9bce115eaafba018cf23e16")).booleanValue() : this.h.get();
    }
}
