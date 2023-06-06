package com.meituan.android.common.locate.platform.logs;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.MasterLocatorImpl;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.provider.GpsInfo;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class k {
    private static boolean b = true;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean d = true;
    private static boolean e = true;
    private k a;
    private AtomicInteger c;
    private String f;
    private f g;
    private f h;
    private f i;
    private f j;
    private f k;
    private f l;
    private f m;
    private f n;
    private f o;
    private f p;

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected long A;
        protected int B;
        protected String C;
        protected String D;
        protected long E;
        protected double a;
        protected double b;
        protected float c;
        protected float d;
        protected boolean e;
        protected int f;
        protected long g;
        protected int h;
        protected String i;
        protected String j;
        protected long k;
        protected long l;
        protected long m;
        protected int n;
        protected int o;
        protected long p;
        protected int q;
        protected long r;
        protected long s;
        protected boolean t;
        protected int u;
        protected long v;
        protected String w;
        protected long x;
        protected boolean y;
        protected long z;

        public a() {
            this.a = 0.0d;
            this.b = 0.0d;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = false;
            this.f = 0;
            this.g = 0L;
            this.h = 0;
            this.k = 0L;
            this.n = 0;
            this.o = 0;
            this.p = 0L;
            this.q = 0;
            this.r = 0L;
            this.s = 0L;
            this.t = false;
            this.u = -1;
            this.v = -1L;
            this.x = -1L;
            this.z = -1L;
            this.A = -1L;
            this.B = -1;
            this.E = -1L;
        }
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e8f5ef509117fa83c4c934a96e1a371", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e8f5ef509117fa83c4c934a96e1a371");
            return;
        }
        this.a = null;
        this.c = new AtomicInteger(com.meituan.android.common.locate.reporter.n.a().b);
        this.g = new f();
        this.h = new f();
        this.i = new f();
        this.j = new f();
        this.k = new f();
        this.l = new f();
        this.m = new f();
        this.n = new f();
        this.o = new f();
        this.p = new f();
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        this.f = a2 == null ? "" : com.meituan.android.common.locate.provider.a.a(a2).b;
    }

    public static void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49f9e7ce225b3dbc55a464c9f094d1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49f9e7ce225b3dbc55a464c9f094d1a9");
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Bundle extras = mtLocation.getExtras();
        concurrentHashMap.put("throughSystem", extras.getString("throughSystem", "0"));
        concurrentHashMap.put("throughMaster", extras.getString("throughMaster", "0"));
        concurrentHashMap.put("throughMtLoader", extras.getString("throughMtLoader", "0"));
        concurrentHashMap.put("logType", "2");
        LogUtils.a("LogPointCloud throughSystem:" + ((String) concurrentHashMap.get("throughSystem")) + " throughMaster:" + ((String) concurrentHashMap.get("throughMaster")) + "throughMtLoader:" + ((String) concurrentHashMap.get("throughMtLoader")));
        com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b0508f6215d01aa1d9518d80e9d3c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b0508f6215d01aa1d9518d80e9d3c79");
            return;
        }
        b.a().a("from", aVar.i);
        b.a().a("provider", aVar.j);
        b a2 = b.a();
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.h);
        a2.a("mastercache", sb.toString());
        b.a().a("adopt", aVar.C);
        b a3 = b.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.n);
        a3.a("errorcode", sb2.toString());
        b.a().a("businessid", aVar.D);
        b a4 = b.a();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Build.VERSION.SDK_INT);
        a4.a("sdkversion", sb3.toString());
        b.a().a("appversion", this.f);
    }

    private void a(a aVar, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddcab0d033e027e291b39dc2d7be992f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddcab0d033e027e291b39dc2d7be992f");
        } else if (j > 0) {
            if (com.meituan.android.common.locate.reporter.n.a().d.booleanValue()) {
                ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                if (!com.meituan.android.common.locate.reporter.l.a().a) {
                    concurrentHashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(aVar.a));
                    concurrentHashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(aVar.b));
                }
                concurrentHashMap.put("speed", String.valueOf(aVar.c));
                concurrentHashMap.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, String.valueOf(aVar.d));
                concurrentHashMap.put("isForground", String.valueOf(aVar.e));
                concurrentHashMap.put("mCheckWifiTimes", String.valueOf(aVar.f));
                concurrentHashMap.put("mWifiAge", String.valueOf(aVar.g));
                concurrentHashMap.put("mMasterCache", String.valueOf(aVar.h));
                a(concurrentHashMap, "time", String.valueOf(j));
                a(concurrentHashMap, "from", aVar.i);
                a(concurrentHashMap, "provider", aVar.j);
                concurrentHashMap.put("getTime", String.valueOf(aVar.k));
                concurrentHashMap.put("originGearsTime", String.valueOf(aVar.l));
                concurrentHashMap.put("originGpsTime", String.valueOf(aVar.m));
                concurrentHashMap.put("wifiScanDuration", String.valueOf(g.af));
                concurrentHashMap.put("errorcode", String.valueOf(aVar.n));
                concurrentHashMap.put("realstatusCode", String.valueOf(MasterLocatorImpl.realstatusCode));
                concurrentHashMap.put("geotime", String.valueOf(aVar.p));
                concurrentHashMap.put("geotype", String.valueOf(aVar.o));
                concurrentHashMap.put("gpsstarttime", String.valueOf(aVar.r));
                concurrentHashMap.put("addreporttime", String.valueOf(aVar.s));
                concurrentHashMap.put("isError", String.valueOf(aVar.t));
                concurrentHashMap.put("wifinum", String.valueOf(aVar.u));
                concurrentHashMap.put("cellage", String.valueOf(aVar.v));
                concurrentHashMap.put("gearsRequest", String.valueOf(aVar.w));
                concurrentHashMap.put("timeout", String.valueOf(aVar.x));
                concurrentHashMap.put("hasPermission", String.valueOf(aVar.y));
                concurrentHashMap.put("startLoadingTime", String.valueOf(aVar.z));
                concurrentHashMap.put("startGearsTime", String.valueOf(aVar.A));
                concurrentHashMap.put("adopt", String.valueOf(aVar.C));
                concurrentHashMap.put("businessId", String.valueOf(aVar.D));
                concurrentHashMap.put("mtLocationLoaderTime", String.valueOf(aVar.E));
                concurrentHashMap.put("sdkVersion", String.valueOf("2.34.1"));
                concurrentHashMap.put("logType", "1");
                if (e) {
                    str = "isFirstGears";
                    str2 = String.valueOf(aVar.B);
                } else {
                    str = "isFirstGears";
                    str2 = "-1";
                }
                concurrentHashMap.put(str, str2);
                if (d) {
                    str3 = "isfirstgps";
                    str4 = String.valueOf(aVar.q);
                } else {
                    str3 = "isfirstgps";
                    str4 = "-1";
                }
                concurrentHashMap.put(str3, str4);
                LogUtils.a("First location report cloud " + concurrentHashMap.toString());
                com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
            }
            b.a().a("LocateSpeed", Arrays.asList(Float.valueOf(((float) j) * 1.0f)));
            a(aVar);
            b.a().b();
            b.a().a("LocateAccuracy", Arrays.asList(Float.valueOf(aVar.d)));
            a(aVar);
            b.a().b();
            if ("mars".equals(aVar.j)) {
                b.a().a("LocateGeoTime", Arrays.asList(Float.valueOf(((float) aVar.p) * 1.0f)));
                b a2 = b.a();
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.o);
                a2.a("geotype", sb.toString());
                a(aVar);
                b.a().d();
            }
            if (d && "mars".equals(aVar.j)) {
                d = false;
                b.a().a("LocateFirstGpsTime", Arrays.asList(Float.valueOf(((float) (aVar.k - aVar.r)) * 1.0f)));
                a(aVar);
                b.a().d();
            }
            if (e && GearsLocator.GEARS_PROVIDER.equals(aVar.j)) {
                e = false;
                b.a().a("LocateFirstGearsTime", Arrays.asList(Float.valueOf(((float) (aVar.k - aVar.A)) * 1.0f)));
                a(aVar);
                b.a().c();
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c8cfafe9f42e3038db11d1f1308f07f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c8cfafe9f42e3038db11d1f1308f07f");
            return;
        }
        synchronized (this) {
            this.g.c();
            this.h.c();
            this.i.c();
            this.k.c();
            this.j.c();
            this.l.c();
            this.m.c();
            this.n.c();
            this.p.c();
            this.o.c();
        }
        g.a().c();
        d.a().c();
    }

    public synchronized void a(MtLocation mtLocation, long j) {
        boolean d2;
        f fVar;
        Object[] objArr = {mtLocation, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e96f787a0dcdf1946930a2ccdb3058c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e96f787a0dcdf1946930a2ccdb3058c");
        } else if (com.meituan.android.common.locate.provider.g.a() == null) {
        } else {
            a aVar = new a();
            try {
                d2 = com.meituan.android.common.locate.util.k.a().d();
                if (mtLocation == null) {
                    aVar.t = true;
                } else {
                    aVar.s = System.currentTimeMillis();
                    aVar.a = mtLocation.getLatitude();
                    aVar.b = mtLocation.getLongitude();
                    if (aVar.a == 0.0d && aVar.b == 0.0d) {
                        aVar.t = true;
                    }
                    aVar.k = mtLocation.getTime();
                    aVar.d = mtLocation.getAccuracy();
                    aVar.j = mtLocation.getProvider();
                    aVar.c = mtLocation.getSpeed();
                    if (mtLocation.getStatusCode() != -1) {
                        aVar.n = mtLocation.getStatusCode();
                    }
                    Bundle extras = mtLocation.getExtras();
                    if (extras != null) {
                        aVar.i = extras.getString("from");
                        aVar.l = extras.getLong(GearsLocator.TIME_GOT_LOCATION);
                        GpsInfo gpsInfo = (GpsInfo) extras.getSerializable("gpsInfo");
                        if (gpsInfo != null) {
                            aVar.m = Long.parseLong(gpsInfo.gpsTime, 10);
                        }
                        aVar.e = d2;
                        aVar.f = extras.getInt("extra_check_wifi_times");
                        aVar.g = extras.getLong("extra_wifi_age");
                        aVar.h = extras.getInt("extra_from_master_cache");
                        aVar.r = extras.getLong("gpsstarttime", 0L);
                        aVar.p = extras.getLong("geotime", 0L);
                        aVar.o = extras.getInt("geotype", 0);
                        aVar.q = extras.getInt("isfirstgps", 0);
                        aVar.u = extras.getInt("wifinum", -1);
                        aVar.v = extras.getLong("cellage", -1L);
                        aVar.w = extras.getString("gearsRequest", "");
                        aVar.x = extras.getLong("timeout", -1L);
                        aVar.y = extras.getBoolean("hasPermission", false);
                        aVar.A = extras.getLong("startGearsTime", -1L);
                        aVar.z = extras.getLong("startLoadingTime", -1L);
                        aVar.B = extras.getInt("isFirstGears", -1);
                        aVar.C = extras.getString("adopt", "");
                        aVar.D = extras.getString("businessId", "");
                        aVar.E = extras.getLong("mtLocationLoaderTime", -1L);
                    }
                }
                a(aVar, j);
            } catch (Exception e2) {
                c.a("add point exception:" + e2.getMessage(), 3);
            }
            if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                if ("mars".equals(aVar.j)) {
                    fVar = !d2 ? this.g : this.l;
                } else if (GearsLocator.GEARS_PROVIDER.equals(aVar.j)) {
                    fVar = !d2 ? this.i : this.n;
                } else if (com.meituan.android.common.locate.loader.tencent.b.a.equals(aVar.j)) {
                    fVar = !d2 ? this.j : this.o;
                } else if ("network".equals(aVar.j)) {
                    fVar = !d2 ? this.h : this.m;
                } else {
                    c.a("log point cloud, provider is error ", 3);
                    fVar = !d2 ? this.k : this.p;
                }
                fVar.a++;
                if (aVar.t && mtLocation.getStatusCode() != 15) {
                    fVar.d++;
                }
                if (!b && aVar.t && mtLocation.getStatusCode() != 15) {
                    fVar.n++;
                }
                if (aVar.t) {
                    return;
                }
                if ("db".equals(aVar.i)) {
                    fVar.e++;
                }
                if ("post".equals(aVar.i)) {
                    fVar.g++;
                }
                if ("network".equals(aVar.i)) {
                    fVar.i++;
                }
                if ("cache".equals(aVar.i)) {
                    fVar.f++;
                }
                if ("gps".equals(aVar.i)) {
                    fVar.h++;
                }
                if (GearsLocator.GEARS_PROVIDER.equals(aVar.j)) {
                    fVar.k++;
                }
                if ("mars".equals(aVar.j)) {
                    fVar.j++;
                }
                if ("network".equals(aVar.j)) {
                    fVar.l++;
                }
                fVar.W = d2;
                if (com.meituan.android.common.locate.loader.tencent.b.a.equals(aVar.j)) {
                    fVar.m++;
                }
                if (aVar.d > 200.0f) {
                    fVar.o++;
                } else if (aVar.d > 150.0f) {
                    fVar.p++;
                } else if (aVar.d > 100.0f) {
                    fVar.q++;
                } else if (aVar.d > 50.0f) {
                    fVar.r++;
                } else if (aVar.d > 20.0f) {
                    fVar.s++;
                } else if (aVar.d > 10.0f) {
                    fVar.t++;
                } else if (aVar.d > 5.0f) {
                    fVar.u++;
                } else if (aVar.d > 1.0f) {
                    fVar.v++;
                } else if (aVar.d <= 1.0f) {
                    fVar.w++;
                }
                long j2 = aVar.s - aVar.k;
                if (j2 > 300000) {
                    fVar.x++;
                } else if (j2 > 120000) {
                    fVar.y++;
                } else if (j2 > 61000) {
                    fVar.z++;
                } else if (j2 > 31000) {
                    fVar.A++;
                } else if (j2 > 15000) {
                    fVar.B++;
                } else if (j2 > 10000) {
                    fVar.C++;
                } else if (j2 > MetricsAnrManager.ANR_THRESHOLD) {
                    fVar.D++;
                } else if (j2 > PayTask.j) {
                    fVar.E++;
                } else {
                    int i = (j2 > 1000L ? 1 : (j2 == 1000L ? 0 : -1));
                    if (i > 0) {
                        fVar.F++;
                    } else if (i <= 0) {
                        fVar.G++;
                    }
                }
                if (j >= 0) {
                    if (j <= 20) {
                        fVar.H++;
                    } else if (j <= 1000) {
                        fVar.I++;
                    } else if (j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                        fVar.J++;
                    } else if (j <= PayTask.j) {
                        fVar.K++;
                    } else if (j <= 4000) {
                        fVar.L++;
                    } else if (j <= MetricsAnrManager.ANR_THRESHOLD) {
                        fVar.M++;
                    } else if (j <= 7000) {
                        fVar.N++;
                    } else if (j <= 10000) {
                        fVar.O++;
                    } else {
                        int i2 = (j > 15000L ? 1 : (j == 15000L ? 0 : -1));
                        if (i2 <= 0) {
                            fVar.P++;
                        } else if (i2 > 0) {
                            fVar.Q++;
                        }
                    }
                }
                if (aVar.m > 0) {
                    long j3 = aVar.k - aVar.m;
                    if (j3 <= 100) {
                        fVar.R++;
                    } else if (j3 <= 400) {
                        fVar.S++;
                    } else if (j3 <= 1000) {
                        fVar.T++;
                    } else {
                        int i3 = (j3 > PayTask.j ? 1 : (j3 == PayTask.j ? 0 : -1));
                        if (i3 <= 0) {
                            fVar.U++;
                        } else if (i3 > 0) {
                            fVar.V++;
                        }
                    }
                }
            }
        }
    }

    public void a(ConcurrentHashMap<String, String> concurrentHashMap, String str, String str2) {
        Object[] objArr = {concurrentHashMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d135605bdc8a5f658a5c5586a8d8bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d135605bdc8a5f658a5c5586a8d8bbe");
        } else if (str2 != null) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void a(boolean z) {
        b = z;
    }
}
