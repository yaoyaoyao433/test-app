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
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static e e;
    private final boolean A;
    private boolean B;
    private boolean C;
    private long D;
    private long[] F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private long O;
    private boolean P;
    private volatile boolean Q;
    public long a;
    public long b;
    public boolean c;
    private final boolean g;
    private boolean h;
    private final boolean i;
    private boolean j;
    private final int k;
    private int l;
    private final int m;
    private int n;
    private final int o;
    private int p;
    private final boolean q;
    private boolean r;
    private final boolean s;
    private boolean t;
    private final boolean u;
    private boolean v;
    private final boolean w;
    private boolean x;
    private final boolean y;
    private boolean z;
    private static final String d = e.class.getSimpleName() + StringUtil.SPACE;
    private static String f = "";
    private static final long[] E = {MetricsAnrManager.ANR_THRESHOLD};

    public e(Context context) {
        SharedPreferences b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c45333cff735c5eb2998a1c134bd5790", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c45333cff735c5eb2998a1c134bd5790");
            return;
        }
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = 1;
        this.l = 1;
        this.m = 1;
        this.n = 1;
        this.o = 1;
        this.p = 1;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = PayTask.j;
        this.F = E;
        this.G = false;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = false;
        this.a = 15552000000L;
        this.b = LocationStrategy.LOCATION_TIMEOUT;
        this.c = true;
        this.N = false;
        this.O = PayTask.j;
        this.P = false;
        this.Q = false;
        if (context == null || context.getApplicationContext() == null || (b = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b);
    }

    public static e a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6fc74a378ff534bcca1b32a2b5ff13c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6fc74a378ff534bcca1b32a2b5ff13c0");
        }
        if (e == null) {
            synchronized (e.class) {
                if (e == null) {
                    e = new e(context);
                }
            }
        }
        return e;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9006596a76353bd9e1aa3c9aeeab69cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9006596a76353bd9e1aa3c9aeeab69cb");
            return;
        }
        f = sharedPreferences.getString("common_config", "");
        if ("".equals(f)) {
            return;
        }
        try {
            a(new JSONObject(f));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.b("new common config json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df3b413746b43c1237c9ed37003031a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df3b413746b43c1237c9ed37003031a8");
            return;
        }
        try {
            if (jSONObject.has("is_filter_far_location")) {
                this.j = jSONObject.optBoolean("is_filter_far_location", false);
            }
            if (jSONObject.has("logan_flag")) {
                this.l = jSONObject.optInt("logan_flag", 1);
            }
            if (jSONObject.has("babel_flag")) {
                this.n = jSONObject.optInt("babel_flag", 1);
            }
            if (jSONObject.has("babel_location_flag")) {
                this.p = jSONObject.optInt("babel_location_flag", 1);
            }
            if (jSONObject.has("finger_print")) {
                this.r = jSONObject.optBoolean("finger_print", true);
            }
            if (jSONObject.has("use_db")) {
                this.t = jSONObject.optBoolean("use_db", true);
            }
            if (jSONObject.has("is_no_use_db_mode")) {
                this.v = jSONObject.optBoolean("is_no_use_db_mode", false);
            }
            if (jSONObject.has("is_no_use_db_cache")) {
                this.x = jSONObject.optBoolean("is_no_use_db_cache", false);
            }
            if (jSONObject.has("is_gps_stop_gears")) {
                this.C = jSONObject.optBoolean("is_gps_stop_gears", false);
            }
            if (jSONObject.has("stop_gears_gps_interval")) {
                this.D = jSONObject.optLong("stop_gears_gps_interval", PayTask.j);
            }
            if (jSONObject.has("gears_location_interval")) {
                this.F = a(jSONObject.optString("gears_location_interval", ""));
            }
            if (jSONObject.has("force_request")) {
                this.G = jSONObject.optBoolean("force_request", false);
            }
            if (jSONObject.has("is_fingerprint_use_cache")) {
                this.H = jSONObject.optBoolean("is_fingerprint_use_cache", true);
            }
            if (jSONObject.has("is_post_use_wifi_cache")) {
                this.I = jSONObject.optBoolean("is_post_use_wifi_cache", true);
            }
            if (jSONObject.has("is_post_use_cell_cache")) {
                this.J = jSONObject.optBoolean("is_post_use_cell_cache", true);
            }
            if (jSONObject.has("is_use_new_gears")) {
                this.K = jSONObject.optBoolean("is_use_new_gears", true);
            }
            if (jSONObject.has("is_use_cell_trigger")) {
                this.L = jSONObject.optBoolean("is_use_cell_trigger", false);
            }
            if (jSONObject.has("is_upload_biz_key")) {
                this.M = jSONObject.optBoolean("is_upload_biz_key", false);
            }
            if (jSONObject.has("is_turn_on_tencent_location_new")) {
                this.z = jSONObject.optBoolean("is_turn_on_tencent_location_new", false);
            }
            if (jSONObject.has("is_turn_on_mix_location")) {
                this.B = jSONObject.optBoolean("is_turn_on_mix_location", false);
            }
            if (jSONObject.has("force_request_interval")) {
                this.a = jSONObject.optLong("force_request_interval", 15552000000L);
            }
            if (jSONObject.has("gps_reboot_time")) {
                this.b = jSONObject.optLong("gps_reboot_time", LocationStrategy.LOCATION_TIMEOUT);
            }
            if (jSONObject.has("is_turn_on_gps_reboot")) {
                this.c = jSONObject.optBoolean("is_turn_on_gps_reboot", true);
            }
            if (jSONObject.has("log_gps_horn_switch_new")) {
                this.Q = jSONObject.optBoolean("log_gps_horn_switch_new", false);
            }
            if (jSONObject.has("is_gps_filter")) {
                this.N = jSONObject.optBoolean("is_gps_filter", false);
            }
            if (jSONObject.has("is_gps_filter_during")) {
                this.O = jSONObject.optLong("is_gps_filter_during", PayTask.j);
            }
            if (jSONObject.has("is_gps_first_deliver")) {
                this.P = jSONObject.optBoolean("is_gps_first_deliver", false);
            }
            if (jSONObject.has("gears_location_state")) {
                this.h = jSONObject.optBoolean("gears_location_state", false);
            }
        } catch (Exception e2) {
            com.meituan.android.common.locate.platform.logs.c.b("parse wifi config exception:" + e2.getMessage(), 3);
        }
    }

    private long[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46784dc7110ffbec53a0e94a1ba5a0e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46784dc7110ffbec53a0e94a1ba5a0e3");
        }
        if (TextUtils.isEmpty(str)) {
            return E;
        }
        try {
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            if (split.length > 0) {
                long[] jArr = new long[split.length];
                for (int i = 0; i < split.length; i++) {
                    jArr[i] = Long.parseLong(split[i]);
                }
                return jArr;
            }
        } catch (Exception e2) {
            com.meituan.android.common.locate.platform.logs.c.a("common_config split array exception:" + e2.getMessage(), 3);
        }
        return E;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abff9b989c5d9dc783226ab96a7a189c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abff9b989c5d9dc783226ab96a7a189c");
        } else if (jSONObject == null) {
        } else {
            f = jSONObject.toString();
            a(jSONObject);
            editor.putString("common_config", f);
        }
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a75b6e2a495a8eaf044195d55a93270", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a75b6e2a495a8eaf044195d55a93270")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("log_gps_horn_switch_new", this.Q);
        return this.Q;
    }

    public boolean b() {
        return this.j;
    }

    public boolean c() {
        return this.l == 1;
    }

    public boolean d() {
        return this.n == 1;
    }

    public boolean e() {
        return this.p == 1;
    }

    public boolean f() {
        return this.r;
    }

    public boolean g() {
        return this.t;
    }

    public boolean h() {
        return this.v;
    }

    public boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "497e3faaab061f66422675f53a37bfe0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "497e3faaab061f66422675f53a37bfe0")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("is_no_use_db_cache", this.x);
        return this.x;
    }

    public boolean j() {
        return this.C;
    }

    public long k() {
        return this.D;
    }

    public long[] l() {
        return this.F;
    }

    public boolean m() {
        return this.I;
    }

    public boolean n() {
        return this.J;
    }

    public boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aaa409fca30d2acdf0e7b073bedf841", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aaa409fca30d2acdf0e7b073bedf841")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("is_upload_biz_key", this.M);
        return this.M;
    }

    public boolean p() {
        return this.z;
    }

    public boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f39d0087a70f50a1b1563a996d694f0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f39d0087a70f50a1b1563a996d694f0f")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("is_gps_filter", this.N);
        return this.N;
    }

    public long r() {
        return this.O;
    }

    public boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fd037456b980ea9de3787242b33034f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fd037456b980ea9de3787242b33034f")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("is_gps_first_deliver", this.P);
        return this.P;
    }

    public boolean t() {
        return this.h;
    }

    public boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7ce84874ee65df57abfc2dc5a7f44a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7ce84874ee65df57abfc2dc5a7f44a2")).booleanValue();
        }
        com.meituan.android.common.locate.platform.sniffer.c.a("is_turn_on_mix_location", this.B);
        return this.B;
    }
}
