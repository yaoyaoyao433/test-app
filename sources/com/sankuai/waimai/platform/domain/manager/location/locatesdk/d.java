package com.sankuai.waimai.platform.domain.manager.location.locatesdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import android.util.Pair;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.locatesdk.LocateSDK;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.platform.capacity.log.h;
import com.sankuai.waimai.platform.capacity.log.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.platform.domain.manager.location.locatesdk.a {
    public static ChangeQuickRedirect i;
    long j;
    Loader<MtLocation> k;
    a l;
    public boolean m;
    k n;
    Handler o;
    private MtLocationConfig p;

    public d(Context context, com.sankuai.waimai.foundation.location.c cVar, com.sankuai.waimai.foundation.location.d dVar, MtLocationConfig mtLocationConfig) {
        super(context, cVar, dVar);
        Object[] objArr = {context, cVar, dVar, mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d893599924e1a6cecd10a35a930f28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d893599924e1a6cecd10a35a930f28");
            return;
        }
        this.o = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.platform.domain.manager.location.locatesdk.d.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b466728b3f0c28e417ff2cbb615ad2de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b466728b3f0c28e417ff2cbb615ad2de");
                    return;
                }
                super.handleMessage(message);
                if (message == null || message.what != 1) {
                    return;
                }
                MtLocation mtLocation = new MtLocation(LocateSDK.MT);
                mtLocation.setStatusCode(3);
                synchronized (d.this.l) {
                    d.this.l.onLoadComplete(d.this.k, mtLocation);
                }
            }
        };
        this.p = g.a(mtLocationConfig);
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "MtLocationChain", Pair.create("Config", com.sankuai.waimai.foundation.location.v2.d.a().toJson(mtLocationConfig)));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements Loader.OnLoadCompleteListener<MtLocation> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb4977cb7e8f1a5d455313b08c38eca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb4977cb7e8f1a5d455313b08c38eca");
            }
        }

        @Override // android.support.v4.content.Loader.OnLoadCompleteListener
        /* renamed from: a */
        public final void onLoadComplete(@Nullable Loader loader, @Nullable MtLocation mtLocation) {
            Object[] objArr = {loader, mtLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d9198ba8e05217b81aaf20190edef36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d9198ba8e05217b81aaf20190edef36");
            } else if (d.this.n.b == "dj-b5e9814e9fb3a8f6") {
                if (mtLocation != null) {
                    try {
                        if (mtLocation.getLatitude() > 0.0d && mtLocation.getLongitude() > 0.0d && mtLocation.getStatusCode() == 0 && mtLocation.getAccuracy() < 300.0f) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(mtLocation.getAccuracy());
                            com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("Accuracy", sb.toString()));
                            try {
                                d.this.o.removeCallbacksAndMessages(null);
                            } catch (Exception unused) {
                            }
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(mtLocation);
                                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("MtLocation", sb2.toString()));
                                if (loader != null) {
                                    loader.unregisterListener(d.this.l);
                                }
                            } catch (Exception unused2) {
                            }
                            WMLocation wMLocation = new WMLocation(LocateSDK.MT);
                            LocationResultCode locationResultCode = new LocationResultCode();
                            a(mtLocation);
                            wMLocation.setLocationResultCode(locationResultCode);
                            wMLocation.setLocationSdk(LocateSDK.MT);
                            wMLocation.setLocationSnifferReporter(d.this.c());
                            d.this.g.b();
                            if (d.this.b != null) {
                                locationResultCode.a = 1200;
                                wMLocation.setAccuracy(mtLocation.getAccuracy());
                                wMLocation.setLongitude(mtLocation.getLongitude());
                                wMLocation.setLatitude(mtLocation.getLatitude());
                                wMLocation.setExtras(mtLocation.getExtras());
                                d.this.b.a(wMLocation);
                                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("Success", mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude()));
                                return;
                            }
                            return;
                        }
                    } catch (Exception unused3) {
                        return;
                    }
                }
                if (mtLocation == null || mtLocation.getStatusCode() != 3) {
                    return;
                }
                if (loader != null) {
                    try {
                        loader.unregisterListener(d.this.l);
                    } catch (Exception unused4) {
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(mtLocation);
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("startNext", sb3.toString()));
                d.this.d.a(d.this.n);
            } else {
                try {
                    d.this.o.removeCallbacksAndMessages(null);
                } catch (Exception unused5) {
                }
                try {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(mtLocation);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("MtLocation", sb4.toString()));
                    if (loader != null) {
                        loader.unregisterListener(d.this.l);
                    }
                } catch (Exception unused6) {
                }
                SystemClock.uptimeMillis();
                WMLocation wMLocation2 = new WMLocation(LocateSDK.MT);
                LocationResultCode locationResultCode2 = new LocationResultCode();
                if (d.this.m && mtLocation != null && mtLocation.getLatitude() != 0.0d && mtLocation.getLongitude() != 0.0d && mtLocation.getStatusCode() == 0) {
                    a(mtLocation);
                    wMLocation2.setLocationResultCode(locationResultCode2);
                    wMLocation2.setLocationSdk(LocateSDK.MT);
                    wMLocation2.setLocationSnifferReporter(d.this.c());
                } else if (!d.this.m) {
                    a(mtLocation);
                    wMLocation2.setLocationResultCode(locationResultCode2);
                    wMLocation2.setLocationSdk(LocateSDK.MT);
                    wMLocation2.setLocationSnifferReporter(d.this.c());
                }
                if (mtLocation != null && mtLocation.getLatitude() > 0.0d && mtLocation.getLongitude() > 0.0d && mtLocation.getStatusCode() == 0) {
                    d.this.g.b();
                    if (d.this.b != null) {
                        locationResultCode2.a = 1200;
                        wMLocation2.setAccuracy(mtLocation.getAccuracy());
                        wMLocation2.setLongitude(mtLocation.getLongitude());
                        wMLocation2.setLatitude(mtLocation.getLatitude());
                        wMLocation2.setExtras(mtLocation.getExtras());
                        d.this.b.a(wMLocation2);
                        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("Success", mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude()));
                        return;
                    }
                    return;
                }
                d.this.c().a(LocateSDK.MT, mtLocation);
                int i = -1;
                String str = "unknown";
                if (mtLocation != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(mtLocation);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("Error", sb5.toString()));
                    i = mtLocation.getStatusCode();
                    str = "";
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(SnifferDBHelper.COLUMN_LOG, str);
                    jSONObject.put(LocationSnifferReporter.Key.BASE_INFO, LocationSnifferReporter.b());
                } catch (Exception unused7) {
                }
                i.d(new h().a("waimai_location_sdk_failed").b(String.valueOf(i)).d(jSONObject.toString()).b());
                if (d.this.d != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(mtLocation);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("startNext", sb6.toString()));
                    d.this.d.a(d.this.n);
                    return;
                }
                if (com.sankuai.waimai.platform.b.A().j) {
                    d.this.g.b();
                }
                if (mtLocation != null) {
                    if (mtLocation.getStatusCode() != 3) {
                        if (mtLocation.getStatusCode() == 9 || mtLocation.getStatusCode() == 1 || mtLocation.getStatusCode() == 7) {
                            if (!com.sankuai.waimai.foundation.location.utils.c.a(d.this.c).equals(c.a.OPEN)) {
                                locationResultCode2.a = 1203;
                            } else {
                                locationResultCode2.a = 1202;
                            }
                        }
                    } else {
                        locationResultCode2.a = 1201;
                    }
                } else {
                    locationResultCode2.a = 1204;
                }
                if (d.this.b != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(wMLocation2);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "onLocationChanged", Pair.create("Finish", sb7.toString()));
                    d.this.b.a(wMLocation2);
                }
            }
        }

        private void a(@Nullable MtLocation mtLocation) {
            Object[] objArr = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb7a7e96a7b4b8214791d18020e6a875", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb7a7e96a7b4b8214791d18020e6a875");
            } else if (mtLocation != null) {
                try {
                    if ((mtLocation.getLatitude() == 0.0d || mtLocation.getLongitude() == 0.0d) && mtLocation.getStatusCode() == 0) {
                        mtLocation.setStatusCode(7);
                    }
                    d.this.g.a(mtLocation.getStatusCode());
                    if (d.this.c != null && ((mtLocation.getStatusCode() == 9 || mtLocation.getStatusCode() == 1 || mtLocation.getStatusCode() == 7) && !com.sankuai.waimai.foundation.location.utils.c.a(d.this.c).equals(c.a.OPEN))) {
                        d.this.g.a(1);
                    }
                    d.this.g.a(false, d.this.j);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "report", Pair.create("Error", e.getMessage()));
                    d.this.g.a(false, d.this.j);
                }
            } else {
                d.this.g.a(7);
                d.this.g.a(true, d.this.j);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b75af12f45845f6e3d3f002886fd74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b75af12f45845f6e3d3f002886fd74");
            return;
        }
        super.a();
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "stopLocate");
        if (this.k != null) {
            this.k.stopLoading();
        }
        if (this.k != null && this.l != null) {
            try {
                this.k.unregisterListener(this.l);
            } catch (Exception e) {
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "stopLocate", Pair.create("StopError", e.getMessage()));
            }
        }
        this.k = null;
        try {
            this.o.removeCallbacksAndMessages(null);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774cd1b76c4f93034dd222abdc9f4c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774cd1b76c4f93034dd222abdc9f4c9b");
        } else if (kVar.b == "dj-b5e9814e9fb3a8f6") {
            com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "startActivityPrivacyInstantLocate");
            this.j = SystemClock.uptimeMillis();
            this.n = kVar;
            k kVar2 = new k(kVar.a(), "dj-ed764ee49a8301f9");
            com.sankuai.waimai.platform.domain.manager.location.e eVar = new com.sankuai.waimai.platform.domain.manager.location.e();
            eVar.b = kVar2;
            this.k = eVar.a(this.c, this.p);
            if (this.k != null) {
                this.l = new a();
                this.k.registerListener(0, this.l);
                this.k.startLoading();
                this.o.sendMessageDelayed(Message.obtain(this.o, 1), MetricsAnrManager.ANR_THRESHOLD);
                return;
            }
            WMLocation wMLocation = new WMLocation(LocateSDK.MT);
            LocationResultCode locationResultCode = new LocationResultCode();
            wMLocation.setLocationSdk(LocateSDK.MT);
            wMLocation.setLocationResultCode(locationResultCode);
            wMLocation.setLocationSnifferReporter(c());
            locationResultCode.a = 1200;
            com.sankuai.waimai.foundation.location.v2.g.a();
            wMLocation.setLongitude(116.176188d);
            com.sankuai.waimai.foundation.location.v2.g.a();
            wMLocation.setLatitude(40.240957d);
            wMLocation.hasLocatedPermission = false;
            if (this.b != null) {
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "locateFinished", Pair.create("Success", "setDefaultLocation:" + wMLocation.getLatitude() + CommonConstant.Symbol.COMMA + wMLocation.getLongitude()));
                this.b.a(wMLocation);
            }
        } else {
            com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "startActivityPrivacyLocate");
            this.j = SystemClock.uptimeMillis();
            this.n = kVar;
            com.sankuai.waimai.platform.domain.manager.location.e eVar2 = new com.sankuai.waimai.platform.domain.manager.location.e();
            eVar2.b = kVar;
            this.k = eVar2.b(this.c, this.p);
            if (this.k != null) {
                this.l = new a();
                this.k.registerListener(0, this.l);
                this.k.startLoading();
                this.o.sendMessageDelayed(Message.obtain(this.o, 1), this.p.getLocationTimeout() + com.sankuai.waimai.platform.utils.sharedpreference.a.w());
                return;
            }
            WMLocation wMLocation2 = new WMLocation(LocateSDK.MT);
            LocationResultCode locationResultCode2 = new LocationResultCode();
            wMLocation2.setLocationSdk(LocateSDK.MT);
            wMLocation2.setLocationResultCode(locationResultCode2);
            wMLocation2.setLocationSnifferReporter(c());
            locationResultCode2.a = 1200;
            com.sankuai.waimai.foundation.location.v2.g.a();
            wMLocation2.setLongitude(116.176188d);
            com.sankuai.waimai.foundation.location.v2.g.a();
            wMLocation2.setLatitude(40.240957d);
            wMLocation2.hasLocatedPermission = false;
            if (this.b != null) {
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtCheckColdStartChain", "locateFinished", Pair.create("Success", "setDefaultLocation:" + wMLocation2.getLatitude() + CommonConstant.Symbol.COMMA + wMLocation2.getLongitude()));
                this.b.a(wMLocation2);
            }
        }
    }
}
