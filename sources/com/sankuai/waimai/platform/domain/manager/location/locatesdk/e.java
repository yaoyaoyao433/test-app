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
public final class e extends com.sankuai.waimai.platform.domain.manager.location.locatesdk.a {
    public static ChangeQuickRedirect i;
    long j;
    Loader<MtLocation> k;
    a l;
    public boolean m;
    k n;
    Handler o;
    private MtLocationConfig p;

    public e(Context context, com.sankuai.waimai.foundation.location.c cVar, com.sankuai.waimai.foundation.location.d dVar, MtLocationConfig mtLocationConfig) {
        super(context, cVar, dVar);
        Object[] objArr = {context, cVar, dVar, mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69208bae7464c6e762890935beb4bf79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69208bae7464c6e762890935beb4bf79");
            return;
        }
        this.o = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.platform.domain.manager.location.locatesdk.e.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2429eec4c0ab3421607b180effe0d5e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2429eec4c0ab3421607b180effe0d5e2");
                    return;
                }
                super.handleMessage(message);
                if (message == null || message.what != 1) {
                    return;
                }
                MtLocation mtLocation = new MtLocation(LocateSDK.MT);
                mtLocation.setStatusCode(3);
                synchronized (e.this.l) {
                    e.this.l.onLoadComplete(e.this.k, mtLocation);
                }
            }
        };
        this.p = g.a(mtLocationConfig);
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "MtLocateChain", Pair.create("Config", com.sankuai.waimai.foundation.location.v2.d.a().toJson(mtLocationConfig)));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements Loader.OnLoadCompleteListener<MtLocation> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75433056cbb934189476270c60c3f1b9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75433056cbb934189476270c60c3f1b9");
            }
        }

        @Override // android.support.v4.content.Loader.OnLoadCompleteListener
        /* renamed from: a */
        public final void onLoadComplete(@Nullable Loader loader, @Nullable MtLocation mtLocation) {
            Object[] objArr = {loader, mtLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c54cb17021b4b1e9564b2b287f85af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c54cb17021b4b1e9564b2b287f85af");
                return;
            }
            com.sankuai.meituan.takeoutnew.util.aop.d.b();
            try {
                e.this.o.removeCallbacksAndMessages(null);
            } catch (Exception unused) {
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(mtLocation);
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "onLocationChanged", Pair.create("MtLocation", sb.toString()));
                if (loader != null) {
                    loader.unregisterListener(e.this.l);
                }
            } catch (Exception unused2) {
            }
            SystemClock.uptimeMillis();
            WMLocation wMLocation = new WMLocation(LocateSDK.MT);
            LocationResultCode locationResultCode = new LocationResultCode();
            if (e.this.m && mtLocation != null && mtLocation.getLatitude() != 0.0d && mtLocation.getLongitude() != 0.0d && mtLocation.getStatusCode() == 0) {
                a(mtLocation);
                wMLocation.setLocationResultCode(locationResultCode);
                wMLocation.setLocationSdk(LocateSDK.MT);
                wMLocation.setLocationSnifferReporter(e.this.c());
            } else if (!e.this.m) {
                a(mtLocation);
                wMLocation.setLocationResultCode(locationResultCode);
                wMLocation.setLocationSdk(LocateSDK.MT);
                wMLocation.setLocationSnifferReporter(e.this.c());
            }
            if (mtLocation != null && mtLocation.getLatitude() > 0.0d && mtLocation.getLongitude() > 0.0d && mtLocation.getStatusCode() == 0) {
                e.this.g.b();
                if (e.this.b != null) {
                    locationResultCode.a = 1200;
                    wMLocation.setAccuracy(mtLocation.getAccuracy());
                    wMLocation.setLongitude(mtLocation.getLongitude());
                    wMLocation.setLatitude(mtLocation.getLatitude());
                    wMLocation.setExtras(mtLocation.getExtras());
                    e.this.b.a(wMLocation);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "onLocationChanged", Pair.create("Success", mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude()));
                    return;
                }
                return;
            }
            e.this.c().a(LocateSDK.MT, mtLocation);
            int i = -1;
            String str = "unknown";
            if (mtLocation != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(mtLocation);
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "onLocationChanged", Pair.create("Error", sb2.toString()));
                i = mtLocation.getStatusCode();
                str = "";
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, str);
                jSONObject.put(LocationSnifferReporter.Key.BASE_INFO, LocationSnifferReporter.b());
            } catch (Exception unused3) {
            }
            i.d(new h().a("waimai_location_sdk_failed").b(String.valueOf(i)).d(jSONObject.toString()).b());
            if (e.this.d != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(mtLocation);
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "onLocationChanged", Pair.create("startNext", sb3.toString()));
                e.this.d.a(e.this.n);
                return;
            }
            if (com.sankuai.waimai.platform.b.A().j) {
                e.this.g.b();
            }
            if (mtLocation != null) {
                if (mtLocation.getStatusCode() != 3) {
                    if (mtLocation.getStatusCode() == 9 || mtLocation.getStatusCode() == 1 || mtLocation.getStatusCode() == 7) {
                        if (!com.sankuai.waimai.foundation.location.utils.c.a(e.this.c).equals(c.a.OPEN)) {
                            locationResultCode.a = 1203;
                        } else {
                            locationResultCode.a = 1202;
                        }
                    }
                } else {
                    locationResultCode.a = 1201;
                }
            } else {
                locationResultCode.a = 1204;
            }
            if (e.this.b != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(wMLocation);
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "onLocationChanged", Pair.create("Finish", sb4.toString()));
                e.this.b.a(wMLocation);
            }
        }

        private void a(@Nullable MtLocation mtLocation) {
            Object[] objArr = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15833e58d10285329b97bda1d9bcd20c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15833e58d10285329b97bda1d9bcd20c");
            } else if (mtLocation != null) {
                try {
                    if ((mtLocation.getLatitude() == 0.0d || mtLocation.getLongitude() == 0.0d) && mtLocation.getStatusCode() == 0) {
                        mtLocation.setStatusCode(7);
                    }
                    e.this.g.a(mtLocation.getStatusCode());
                    if (e.this.c != null && ((mtLocation.getStatusCode() == 9 || mtLocation.getStatusCode() == 1 || mtLocation.getStatusCode() == 7) && !com.sankuai.waimai.foundation.location.utils.c.a(e.this.c).equals(c.a.OPEN))) {
                        e.this.g.a(1);
                    }
                    e.this.g.a(false, e.this.j);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "report", Pair.create("Error", e.getMessage()));
                    e.this.g.a(false, e.this.j);
                }
            } else {
                e.this.g.a(7);
                e.this.g.a(true, e.this.j);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0473ef9c985627d544bb99df69bb75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0473ef9c985627d544bb99df69bb75");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "startActivityPrivacyLocate");
        this.j = SystemClock.uptimeMillis();
        this.n = kVar;
        com.sankuai.waimai.platform.domain.manager.location.e eVar = new com.sankuai.waimai.platform.domain.manager.location.e();
        eVar.b = kVar;
        this.k = eVar.b(this.c, this.p);
        if (this.k != null) {
            this.l = new a();
            this.k.registerListener(0, this.l);
            this.k.startLoading();
            this.o.sendMessageDelayed(Message.obtain(this.o, 1), this.p.getLocationTimeout() + com.sankuai.waimai.platform.utils.sharedpreference.a.w());
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
            com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "locateFinished", Pair.create("Success", "setDefaultLocation:" + wMLocation.getLatitude() + CommonConstant.Symbol.COMMA + wMLocation.getLongitude()));
            this.b.a(wMLocation);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.locatesdk.a, com.sankuai.waimai.foundation.location.locatesdk.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18f3851627ba87c3e890d04b89fc224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18f3851627ba87c3e890d04b89fc224");
            return;
        }
        super.a();
        com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "stopLocate");
        if (this.k != null) {
            this.k.stopLoading();
        }
        if (this.k != null && this.l != null) {
            try {
                this.k.unregisterListener(this.l);
            } catch (Exception e) {
                com.sankuai.waimai.platform.domain.manager.location.v2.a.a("MtLocateChain", "stopLocate", Pair.create("StopError", e.getMessage()));
            }
        }
        this.k = null;
        try {
            this.o.removeCallbacksAndMessages(null);
        } catch (Exception unused) {
        }
    }
}
