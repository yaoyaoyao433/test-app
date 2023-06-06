package com.meituan.android.common.locate.platform.logs;

import android.os.Bundle;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class i extends e {
    private static MtLocation a = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static long d = 0;
    private static MtLocation g = null;
    private static long h = 0;
    private static MtLocation k = null;
    private static long l = 0;
    private static String o = null;
    private static long p = 0;
    private static boolean q = false;
    private MtLocation e;
    private long f;
    private MtLocation i;
    private long j;
    private MtLocation m;
    private long n;
    private long r;
    private String s;
    private long t;
    private long u;
    private long v;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92a1cfa5f61ee3ca17ef130a7f8683f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92a1cfa5f61ee3ca17ef130a7f8683f1");
            return;
        }
        this.e = null;
        this.f = 0L;
        this.i = null;
        this.j = 0L;
        this.m = null;
        this.n = 0L;
        this.r = 0L;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1f3ab316c7a4450ed31d8538dc4396e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1f3ab316c7a4450ed31d8538dc4396e");
        } else if (this.t == 0) {
            this.t = j;
        }
    }

    public void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bb598e9a51f050a3f2695706f1186dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bb598e9a51f050a3f2695706f1186dc");
        } else if (this.r == 0) {
            this.r = j;
            this.s = str;
            if (a == null && g == null) {
                p = j;
                o = str;
            }
        }
    }

    public void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "387f9c5f83a681e5ac3c3b616924580b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "387f9c5f83a681e5ac3c3b616924580b");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (mtLocation != null && !q) {
            Bundle extras = mtLocation.getExtras();
            if (a == null && extras != null && "gps".equals(extras.getString("from"))) {
                a = mtLocation;
                d = currentTimeMillis;
            } else if (g == null && extras != null && "network".equals(extras.getString("from"))) {
                g = mtLocation;
                h = currentTimeMillis;
            }
            if (k == null && extras != null && "network".equals(extras.getString("from")) && mtLocation.getAccuracy() <= 20.0f) {
                k = mtLocation;
                l = currentTimeMillis;
            }
        }
        if (mtLocation != null) {
            Bundle extras2 = mtLocation.getExtras();
            if (this.e == null && extras2 != null && "gps".equals(extras2.getString("from"))) {
                this.e = mtLocation;
                this.f = currentTimeMillis;
            } else if (this.i == null && extras2 != null && "network".equals(extras2.getString("from"))) {
                this.i = mtLocation;
                this.j = currentTimeMillis;
            }
            if (this.m != null || extras2 == null || !"network".equals(extras2.getString("from")) || mtLocation.getAccuracy() > 20.0f) {
                return;
            }
            this.m = mtLocation;
            this.n = currentTimeMillis;
        }
    }

    public void a(String str, String str2, MtLocation mtLocation) {
        String str3;
        Object[] objArr = {str, str2, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d507b6db35ec64a86ad60cffc70cd13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d507b6db35ec64a86ad60cffc70cd13");
        } else if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).a()) {
            if (com.meituan.android.common.locate.provider.g.a() == null) {
                str3 = " LogDataWrapper::ContextProvider::context is null";
            } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                return;
            } else {
                try {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    super.a(concurrentHashMap);
                    if (str2 == null) {
                        str2 = "";
                    }
                    concurrentHashMap.put("bussiness_id", str2);
                    concurrentHashMap.put("type", "tencent_" + str);
                    if (!d()) {
                        concurrentHashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(mtLocation.getLongitude()));
                        concurrentHashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(mtLocation.getLatitude()));
                    }
                    concurrentHashMap.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, String.valueOf(mtLocation.getAccuracy()));
                    concurrentHashMap.put("current_time", String.valueOf(System.currentTimeMillis()));
                    concurrentHashMap.put("location_get_time", String.valueOf(mtLocation.getTime()));
                    com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                    return;
                } catch (Exception e) {
                    str3 = "LogDataWrapper::exception" + e.getMessage();
                }
            }
            c.a(str3, 3);
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bb583c4a972d14c56c97609573df340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bb583c4a972d14c56c97609573df340");
            return;
        }
        super.a(concurrentHashMap);
        a(concurrentHashMap, "tencent_loader_start_time", this.r);
        a(concurrentHashMap, "tencent_start_bizname", this.s);
        if (this.e != null) {
            a(concurrentHashMap, "tencent_start_gps_longitude", this.e.getLongitude());
            a(concurrentHashMap, "tencent_start_gps_latitude", this.e.getLatitude());
            a(concurrentHashMap, "tencent_start_gps_accuracy", String.valueOf(this.e.getAccuracy()));
            a(concurrentHashMap, "tencent_start_gps_report_time", String.valueOf(this.f));
            a(concurrentHashMap, "tencent_start_gps_location_get_time", String.valueOf(this.e.getTime()));
            a(concurrentHashMap, "tencent_start_gps_provider", this.e.getProvider());
            Bundle extras = this.e.getExtras();
            if (extras != null) {
                a(concurrentHashMap, "tencent_start_gps_from", extras.getString("from"));
            }
        }
        if (this.i != null) {
            a(concurrentHashMap, "tencent_start_net_longitude", this.i.getLongitude());
            a(concurrentHashMap, "tencent_start_net_latitude", this.i.getLatitude());
            a(concurrentHashMap, "tencent_start_net_accuracy", String.valueOf(this.i.getAccuracy()));
            a(concurrentHashMap, "tencent_start_net_report_time", String.valueOf(this.j));
            a(concurrentHashMap, "tencent_start_net_location_get_time", String.valueOf(this.i.getTime()));
            a(concurrentHashMap, "tencent_start_net_provider", this.i.getProvider());
            Bundle extras2 = this.i.getExtras();
            if (extras2 != null) {
                a(concurrentHashMap, "tencent_start_net_from", extras2.getString("from"));
            }
        }
        if (this.m != null) {
            a(concurrentHashMap, "tencent_start_lc_gps_longitude", this.m.getLongitude());
            a(concurrentHashMap, "tencent_start_lc_gps_latitude", this.m.getLatitude());
            a(concurrentHashMap, "tencent_start_lc_gps_accuracy", String.valueOf(this.m.getAccuracy()));
            a(concurrentHashMap, "tencent_start_lc_gps_report_time", String.valueOf(this.n));
            a(concurrentHashMap, "tencent_start_lc_gps_location_get_time", String.valueOf(this.m.getTime()));
            a(concurrentHashMap, "tencent_start_lc_gps_provider", this.m.getProvider());
            Bundle extras3 = this.m.getExtras();
            if (extras3 != null) {
                a(concurrentHashMap, "tencent_start_lc_gps_from", extras3.getString("from"));
            }
        }
        if (q) {
            return;
        }
        q = true;
        a(concurrentHashMap, "tencent_loader_cold_start_time", p);
        a(concurrentHashMap, "tencent_cold_start_bizname", o);
        if (a != null) {
            a(concurrentHashMap, "tencent_cold_start_gps_longitude", a.getLongitude());
            a(concurrentHashMap, "tencent_cold_start_gps_latitude", a.getLatitude());
            a(concurrentHashMap, "tencent_cold_start_gps_accuracy", String.valueOf(a.getAccuracy()));
            a(concurrentHashMap, "tencent_cold_start_gps_report_time", String.valueOf(d));
            a(concurrentHashMap, "tencent_cold_start_gps_location_get_time", String.valueOf(a.getTime()));
            a(concurrentHashMap, "tencent_cold_start_gps_provider", a.getProvider());
            Bundle extras4 = a.getExtras();
            if (extras4 != null) {
                a(concurrentHashMap, "tencent_cold_start_gps_from", extras4.getString("from"));
            }
        }
        if (g != null) {
            a(concurrentHashMap, "tencent_cold_start_net_longitude", g.getLongitude());
            a(concurrentHashMap, "tencent_cold_start_net_latitude", g.getLatitude());
            a(concurrentHashMap, "tencent_cold_start_net_accuracy", String.valueOf(g.getAccuracy()));
            a(concurrentHashMap, "tencent_cold_start_net_report_time", String.valueOf(h));
            a(concurrentHashMap, "tencent_cold_start_net_location_get_time", String.valueOf(g.getTime()));
            a(concurrentHashMap, "tencent_cold_start_net_provider", g.getProvider());
            Bundle extras5 = g.getExtras();
            if (extras5 != null) {
                a(concurrentHashMap, "tencent_cold_start_net_from", extras5.getString("from"));
            }
        }
        if (k != null) {
            a(concurrentHashMap, "tencent_cold_start_lc_gps_longitude", k.getLongitude());
            a(concurrentHashMap, "tencent_cold_start_lc_gps_latitude", k.getLatitude());
            a(concurrentHashMap, "tencent_cold_start_lc_gps_accuracy", String.valueOf(k.getAccuracy()));
            a(concurrentHashMap, "tencent_cold_start_lc_gps_report_time", String.valueOf(l));
            a(concurrentHashMap, "tencent_cold_start_lc_gps_location_get_time", String.valueOf(k.getTime()));
            a(concurrentHashMap, "tencent_cold_start_lc_gps_provider", k.getProvider());
            Bundle extras6 = k.getExtras();
            if (extras6 != null) {
                a(concurrentHashMap, "tencent_cold_start_lc_gps_from", extras6.getString("from"));
            }
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61d59d9e24e78f4cb89a8895f613a617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61d59d9e24e78f4cb89a8895f613a617");
            return;
        }
        this.r = 0L;
        this.s = null;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.e = null;
        this.f = 0L;
        this.i = null;
        this.j = 0L;
        this.m = null;
        this.n = 0L;
    }

    public void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc8684d5aaa5d7d5a88b4ba01ec04059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc8684d5aaa5d7d5a88b4ba01ec04059");
        } else if (this.u == 0) {
            this.u = j;
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a316e84938f9ac5d33238c5c660ce21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a316e84938f9ac5d33238c5c660ce21");
        } else if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).a()) {
            if (com.meituan.android.common.locate.provider.g.a() == null) {
                str = " LogDataWrapper::ContextProvider::context is null";
            } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                b();
                return;
            } else {
                try {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(32);
                    a(concurrentHashMap);
                    if (concurrentHashMap.size() == 0) {
                        return;
                    }
                    com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                    b();
                    return;
                } catch (Exception e) {
                    str = "LogDataWrapper::exception" + e.getMessage();
                }
            }
            c.a(str, 3);
        }
    }

    public void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "170722a60d70c55c98e835a5ae709969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "170722a60d70c55c98e835a5ae709969");
        } else if (this.v == 0) {
            this.v = j;
        }
    }
}
