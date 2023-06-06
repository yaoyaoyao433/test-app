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
public class h extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static h q;
    public long a;
    public long d;
    public long e;
    public MtLocation f;
    public MtLocation g;
    public MtLocation h;
    public MtLocation i;
    public long j;
    private long k;
    private long l;
    private long m;
    private long n;
    private String o;
    private boolean p;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39c6ba3170480de7aa903fb84a90050b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39c6ba3170480de7aa903fb84a90050b");
            return;
        }
        this.a = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = null;
        this.k = 0L;
        this.g = null;
        this.l = 0L;
        this.h = null;
        this.m = 0L;
        this.i = null;
        this.n = 0L;
        this.o = null;
        this.j = 0L;
        this.p = false;
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d658f9334a1361a42564eaf01590b7f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d658f9334a1361a42564eaf01590b7f2");
        }
        if (q == null) {
            synchronized (h.class) {
                if (q == null) {
                    q = new h();
                    com.meituan.android.common.locate.platform.babel.a.a(com.meituan.android.common.locate.provider.g.a());
                }
            }
        }
        return q;
    }

    private void a(String str, MtLocation mtLocation) {
        Object[] objArr = {str, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32dc353b82cd47b3eb741cab0415119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32dc353b82cd47b3eb741cab0415119");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        if (extras != null) {
            if ("user_receive_gps".equals(str) || "user_receive_gears".equals(str)) {
                extras.putBoolean("isSendOut", true);
                mtLocation.setExtras(extras);
            }
        }
    }

    private boolean a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea5d4bb0df93f4b4ac7d8a1f50216d43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea5d4bb0df93f4b4ac7d8a1f50216d43")).booleanValue();
        }
        Bundle extras = mtLocation.getExtras();
        if (extras != null) {
            return extras.getBoolean("isSendOut", false);
        }
        return false;
    }

    private void b(String str, MtLocation mtLocation) {
        Object[] objArr = {str, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1135844ff5721fb54212a50f9ef3a83e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1135844ff5721fb54212a50f9ef3a83e");
        } else if (mtLocation == null) {
        } else {
            Bundle extras = mtLocation.getExtras();
            String string = extras != null ? extras.getString("from") : "";
            if ("locate_system".equals(str) || "master_cache_gps".equals(str) || "cache".equals(string)) {
                r9 = 1;
            } else if ("master_receive_gps".equals(str) || "loader_receive_gps".equals(str) || "user_receive_gps".equals(str)) {
                r9 = extras != null ? extras.getInt("gpsTtl") : 0;
                if (!"loader_receive_gps".equals(str) ? r9 != 0 : !(r9 == 0 || r9 > 2)) {
                    r9++;
                }
            }
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putInt("gpsTtl", r9);
            if ("master_cache_gps".equals(str)) {
                extras.putBoolean("isMasterCache", true);
            }
            mtLocation.setExtras(extras);
        }
    }

    public void a(long j) {
        String str;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7e40077275289c0c0b360d7ca3c68c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7e40077275289c0c0b360d7ca3c68c0");
        } else if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).a()) {
            if (com.meituan.android.common.locate.provider.g.a() == null) {
                str = " LogDataWrapper::ContextProvider::context is null";
            } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                return;
            } else {
                try {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    super.a(concurrentHashMap);
                    concurrentHashMap.put("bussiness_id", "");
                    concurrentHashMap.put("geo_cost_time", String.valueOf(j));
                    com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                    return;
                } catch (Exception e) {
                    str = "LogDataWrapper::exception" + e.getMessage();
                }
            }
            c.a(str, 3);
        }
    }

    public void a(long j, long j2, double d, double d2) {
        String str;
        Object[] objArr = {new Long(j), new Long(j2), Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01b443ed4082fe8d783fa9a7f6782e71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01b443ed4082fe8d783fa9a7f6782e71");
        } else if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).a()) {
            if (com.meituan.android.common.locate.provider.g.a() == null) {
                str = " LogDataWrapper::ContextProvider::context is null";
            } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                return;
            } else {
                try {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    super.a(concurrentHashMap);
                    concurrentHashMap.put("ip_locate_cost_time", String.valueOf(j2));
                    if (!d()) {
                        concurrentHashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(d));
                        concurrentHashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(d2));
                    }
                    concurrentHashMap.put("current_time", String.valueOf(j));
                    com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                    return;
                } catch (Exception e) {
                    str = "LogDataWrapper::exception" + e.getMessage();
                }
            }
            c.a(str, 3);
        }
    }

    public void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93e02aaba7054c35d94e9e99d3462db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93e02aaba7054c35d94e9e99d3462db5");
        } else if (this.d == 0) {
            this.a = j;
            if (this.f == null && this.g == null) {
                this.j = j;
                this.o = str;
            }
        }
    }

    public void a(String str, String str2, MtLocation mtLocation, long j) {
        Object[] objArr = {str, str2, mtLocation, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cf414224e5f6d56d2590c0d16fc1ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cf414224e5f6d56d2590c0d16fc1ff6");
        } else if (mtLocation != null && com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).a()) {
            if (com.meituan.android.common.locate.provider.g.a() == null) {
                c.a(" LogDataWrapper::ContextProvider::context is null", 3);
            } else if (com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
                if ("loader_stopped_cached_gps".equals(str) || "loader_stopped_cached_gears".equals(str)) {
                    if (a(mtLocation)) {
                        return;
                    }
                    c.a(" LogGpsAndGearsPoint cachedLocation not sendOut ,type = " + str + " location = " + mtLocation, 3);
                }
                a(str, mtLocation);
                b(str, mtLocation);
                try {
                    Bundle extras = mtLocation.getExtras();
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    super.a(concurrentHashMap);
                    concurrentHashMap.put("bussiness_id", str2 == null ? "" : str2);
                    concurrentHashMap.put("type", str);
                    if (!d()) {
                        concurrentHashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(mtLocation.getLongitude()));
                        concurrentHashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(mtLocation.getLatitude()));
                    }
                    concurrentHashMap.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, String.valueOf(mtLocation.getAccuracy()));
                    concurrentHashMap.put("current_time", String.valueOf(System.currentTimeMillis()));
                    concurrentHashMap.put("location_get_time", String.valueOf(mtLocation.getTime()));
                    concurrentHashMap.put("isMasterCache", String.valueOf(extras != null && extras.getBoolean("isMasterCache")));
                    concurrentHashMap.put("gpsTtl", String.valueOf(extras != null ? extras.getInt("gpsTtl") : 0));
                    concurrentHashMap.put("timer_interval", String.valueOf(j));
                    a(concurrentHashMap, "provider", mtLocation.getProvider());
                    if (extras != null) {
                        a(concurrentHashMap, "from", extras.getString("from"));
                    }
                    long j2 = mtLocation.getExtras().getLong("wifi-latest-age", Long.MAX_VALUE);
                    concurrentHashMap.put("wifi_latest_age_ms", j2 != Long.MAX_VALUE ? String.valueOf(j2) : "");
                    com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                } catch (Exception e) {
                    c.a("LogDataWrapper::exception" + e.getMessage(), 3);
                }
            }
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42c5d420630e59678cf3f2331bc953b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42c5d420630e59678cf3f2331bc953b4");
            return;
        }
        super.a(concurrentHashMap);
        a(concurrentHashMap, "loaderStartTime", this.a);
        a(concurrentHashMap, "locatorStartTime", this.d);
        a(concurrentHashMap, "receiveFirstGpsTime", this.e);
        if (!this.p) {
            this.p = true;
            a(concurrentHashMap, "loader_cold_start_time", this.j);
            a(concurrentHashMap, "cold_start_bizname", this.o);
            if (this.f != null) {
                a(concurrentHashMap, "cold_start_gps_longitude", this.f.getLongitude());
                a(concurrentHashMap, "cold_start_gps_latitude", this.f.getLatitude());
                a(concurrentHashMap, "cold_start_gps_accuracy", String.valueOf(this.f.getAccuracy()));
                a(concurrentHashMap, "cold_start_gps_report_time", String.valueOf(this.k));
                a(concurrentHashMap, "cold_start_gps_location_get_time", String.valueOf(this.f.getTime()));
                a(concurrentHashMap, "cold_start_gps_provider", this.f.getProvider());
                Bundle extras = this.f.getExtras();
                if (extras != null) {
                    a(concurrentHashMap, "cold_start_gps_from", extras.getString("from"));
                }
            }
            if (this.g != null) {
                a(concurrentHashMap, "cold_start_gears_longitude", this.g.getLongitude());
                a(concurrentHashMap, "cold_start_gears_latitude", this.g.getLatitude());
                a(concurrentHashMap, "cold_start_gears_accuracy", String.valueOf(this.g.getAccuracy()));
                a(concurrentHashMap, "cold_start_gears_report_time", String.valueOf(this.l));
                a(concurrentHashMap, "cold_start_gears_location_get_time", String.valueOf(this.g.getTime()));
                a(concurrentHashMap, "cold_start_gears_provider", this.g.getProvider());
                Bundle extras2 = this.g.getExtras();
                if (extras2 != null) {
                    a(concurrentHashMap, "cold_start_gears_from", extras2.getString("from"));
                }
            }
            if (this.h != null) {
                a(concurrentHashMap, "cold_start_user_receive_gps_longitude", this.h.getLongitude());
                a(concurrentHashMap, "cold_start_user_receive_gps_latitude", this.h.getLatitude());
                a(concurrentHashMap, "cold_start_user_receive_gps_accuracy", String.valueOf(this.h.getAccuracy()));
                a(concurrentHashMap, "cold_start_user_receive_gps_report_time", String.valueOf(this.m));
                a(concurrentHashMap, "cold_start_user_receive_gps_location_get_time", String.valueOf(this.h.getTime()));
                a(concurrentHashMap, "cold_start_user_receive_gps_provider", this.h.getProvider());
                Bundle extras3 = this.h.getExtras();
                if (extras3 != null) {
                    a(concurrentHashMap, "cold_start_user_receive_gps_from", extras3.getString("from"));
                }
            }
            if (this.i != null) {
                a(concurrentHashMap, "cold_start_user_receive_gears_longitude", this.i.getLongitude());
                a(concurrentHashMap, "cold_start_user_receive_gears_latitude", this.i.getLatitude());
                a(concurrentHashMap, "cold_start_user_receive_gears_accuracy", String.valueOf(this.i.getAccuracy()));
                a(concurrentHashMap, "cold_start_user_receive_gears_report_time", String.valueOf(this.n));
                a(concurrentHashMap, "cold_start_user_receive_gears_location_get_time", String.valueOf(this.i.getTime()));
                a(concurrentHashMap, "cold_start_user_receive_gears_provider", this.i.getProvider());
                Bundle extras4 = this.i.getExtras();
                if (extras4 != null) {
                    a(concurrentHashMap, "cold_start_user_receive_gears_from", extras4.getString("from"));
                }
            }
        }
        a(concurrentHashMap, "stopGpsTime", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eded3f7b85456506f7844fc35439827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eded3f7b85456506f7844fc35439827");
            return;
        }
        this.a = 0L;
        this.d = 0L;
        this.e = 0L;
    }

    public void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d3bff4183873a233a938037d539c9ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d3bff4183873a233a938037d539c9ad");
        } else if (this.d == 0) {
            this.d = j;
        }
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c9768b07ed7e608f4064cf60a0b38ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c9768b07ed7e608f4064cf60a0b38ea");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b60fe3545eb772974a79c3ca5be33dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b60fe3545eb772974a79c3ca5be33dd");
        } else if (this.e == 0) {
            this.e = j;
        }
    }
}
