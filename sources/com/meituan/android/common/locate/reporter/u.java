package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class u {
    private static u G;
    private static final String a = u.class.getSimpleName() + StringUtil.SPACE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long A;
    private int B;
    private String C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean b;
    private final boolean c;
    private long[] d;
    private long e;
    private int f;
    private final int g;
    private int h;
    private boolean i;
    private final int j;
    private int k;
    private final long l;
    private long m;
    private boolean n;
    private final int o;
    private int p;
    private final long q;
    private long r;
    private final long s;
    private long t;
    private long u;
    private final boolean v;
    private boolean w;
    private final long x;
    private long y;
    private long z;

    public u(Context context) {
        SharedPreferences b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4dd290927c697dd64f111b25d4ddde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4dd290927c697dd64f111b25d4ddde");
            return;
        }
        this.b = false;
        this.c = true;
        this.d = new long[]{15000, 15000, 30000, LocationStrategy.LOCATION_TIMEOUT};
        this.e = 10000L;
        this.f = 10;
        this.g = 30;
        this.h = 30;
        this.i = false;
        this.j = 20;
        this.k = 20;
        this.l = PayTask.j;
        this.m = PayTask.j;
        this.n = true;
        this.o = 20;
        this.p = 20;
        this.q = MetricsAnrManager.ANR_THRESHOLD;
        this.r = MetricsAnrManager.ANR_THRESHOLD;
        this.s = 30000L;
        this.t = 30000L;
        this.u = LocationStrategy.LOCATION_TIMEOUT;
        this.v = true;
        this.w = true;
        this.x = 15000L;
        this.y = 15000L;
        this.z = 1000L;
        this.A = 20000L;
        this.B = 12;
        this.C = "";
        this.D = false;
        this.E = true;
        this.F = true;
        if (context == null || context.getApplicationContext() == null || (b = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b);
    }

    public static u a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e9f6a60cf30ca289501fd0c43e9dfe6", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e9f6a60cf30ca289501fd0c43e9dfe6");
        }
        if (G == null) {
            synchronized (u.class) {
                if (G == null) {
                    G = new u(context);
                }
            }
        }
        return G;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5671d4ac4cad272e41b70557c53875d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5671d4ac4cad272e41b70557c53875d5");
            return;
        }
        this.C = sharedPreferences.getString("wifi_config", "");
        if ("".equals(this.C)) {
            return;
        }
        try {
            a(new JSONObject(this.C));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("new wifi config json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73930abf4c2cf00b9e59070e740c7b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73930abf4c2cf00b9e59070e740c7b9d");
        } else if (jSONObject == null) {
        } else {
            try {
                this.D = !TextUtils.equals(this.C, jSONObject.toString());
                this.C = jSONObject.toString();
                if (jSONObject.has("wifi_scan_interval_arr")) {
                    try {
                        this.d = a(jSONObject.getString("wifi_scan_interval_arr"));
                    } catch (JSONException e) {
                        com.meituan.android.common.locate.platform.logs.c.a(a + "wifi_scan_interval_arr exception" + e.getMessage(), 3);
                    }
                }
                if (jSONObject.has("wifi_scan_interval_low_version")) {
                    this.e = jSONObject.optLong("wifi_scan_interval_low_version", 10000L);
                }
                if (jSONObject.has("wifi_similarity_min_num")) {
                    this.f = jSONObject.optInt("wifi_similarity_min_num", 10);
                }
                if (jSONObject.has("wifi_scan_success_force_network")) {
                    this.b = jSONObject.optBoolean("wifi_scan_success_force_network", false);
                }
                if (jSONObject.has("wifi_max_num")) {
                    this.h = jSONObject.optInt("wifi_max_num", 30);
                }
                if (jSONObject.has("use_scanresult_cache")) {
                    this.w = jSONObject.optBoolean("use_scanresult_cache", true);
                }
                if (jSONObject.has("scanresult_clear_time")) {
                    this.y = jSONObject.optLong("scanresult_clear_time", 15000L);
                }
                if (jSONObject.has("get_scanresults_interval")) {
                    this.z = jSONObject.optLong("get_scanresults_interval", 1000L);
                }
                if (jSONObject.has("get_connectedinfo_interval")) {
                    this.A = jSONObject.optLong("get_connectedinfo_interval", 20000L);
                }
                if (jSONObject.has("wifi_request_max_num")) {
                    this.B = jSONObject.optInt("wifi_request_max_num", 12);
                }
                if (jSONObject.has("wifi_age_use_new_strategy")) {
                    this.E = jSONObject.optBoolean("wifi_age_use_new_strategy", true);
                }
                if (jSONObject.has("network_request_time")) {
                    this.u = jSONObject.optLong("network_request_time", LocationStrategy.LOCATION_TIMEOUT);
                }
                if (jSONObject.has("wifi_result_replace_filter")) {
                    this.F = jSONObject.optBoolean("wifi_result_replace_filter", true);
                }
                if (jSONObject.has("light_sensor")) {
                    this.i = jSONObject.optBoolean("light_sensor", false);
                }
                if (jSONObject.has("light_sensor_size")) {
                    this.k = jSONObject.optInt("light_sensor_size", 20);
                    if (this.k <= 0) {
                        this.k = 1;
                    }
                }
                if (jSONObject.has("light_sensor_scan_during")) {
                    this.m = jSONObject.optLong("light_sensor_scan_during", PayTask.j);
                    if (this.m <= 0) {
                        this.m = 1000L;
                    }
                }
                if (jSONObject.has("disable_air_pressure")) {
                    this.n = jSONObject.optBoolean("disable_air_pressure", true);
                }
                if (jSONObject.has("air_pressure_max_count")) {
                    this.p = jSONObject.optInt("air_pressure_max_count", 20);
                    if (this.p <= 0) {
                        this.p = 1;
                    }
                }
                if (jSONObject.has("pressure_sensor_scan_during")) {
                    this.r = jSONObject.optLong("pressure_sensor_scan_during", MetricsAnrManager.ANR_THRESHOLD);
                    if (this.r <= 0) {
                        this.r = 1000L;
                    }
                }
                if (jSONObject.has("air_pressure_min_scan_interval")) {
                    this.t = jSONObject.optLong("air_pressure_min_scan_interval", 30000L);
                    if (this.t <= 0) {
                        this.t = 0L;
                    }
                }
            } catch (Exception e2) {
                com.meituan.android.common.locate.platform.logs.c.a("parse wifi config exception:" + e2.getMessage(), 3);
            }
        }
    }

    private long[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "623befaeefc26f47df117dc8e8c350ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "623befaeefc26f47df117dc8e8c350ca");
        }
        if (TextUtils.isEmpty(str)) {
            return new long[]{15000, 15000, 30000, LocationStrategy.LOCATION_TIMEOUT};
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length > 0) {
            long[] jArr = new long[split.length];
            for (int i = 0; i < split.length; i++) {
                jArr[i] = Long.parseLong(split[i]);
            }
            return jArr;
        }
        return new long[]{15000, 15000, 30000, LocationStrategy.LOCATION_TIMEOUT};
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96fae2cff2c830f4af492b7fe067147c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96fae2cff2c830f4af492b7fe067147c");
        } else if (jSONObject == null) {
        } else {
            this.C = jSONObject.toString();
            editor.putString("wifi_config", this.C);
            a(jSONObject);
        }
    }

    public boolean a() {
        return true;
    }

    public long[] b() {
        return this.d;
    }

    public long c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public boolean e() {
        return this.D;
    }

    public int f() {
        return this.h;
    }

    public long g() {
        return this.y;
    }

    public long h() {
        return this.z;
    }

    public long i() {
        return this.A;
    }

    public int j() {
        return this.B;
    }

    public boolean k() {
        return this.E;
    }

    public long l() {
        return this.u;
    }

    public boolean m() {
        return this.F;
    }

    public boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee0958deebd1695e8bde1286d4fe0af2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee0958deebd1695e8bde1286d4fe0af2")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("light_sensor", this.i);
        return this.i;
    }

    public boolean o() {
        return this.n;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.p;
    }

    public long r() {
        return this.r;
    }

    public long s() {
        return this.t;
    }

    public boolean t() {
        return this.b;
    }
}
