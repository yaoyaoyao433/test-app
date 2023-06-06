package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class h {
    private static h b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;
    private int C;
    private int E;
    private int G;
    private int I;
    private int K;
    private double L;
    private double M;
    private double O;
    private double Q;
    private boolean S;
    private double T;
    private double U;
    private JSONArray W;
    private boolean X;
    private long Z;
    private long ab;
    private int ad;
    private int af;
    private int ah;
    private int c;
    private boolean f;
    private String g;
    private long i;
    private int k;
    private long m;
    private double o;
    private double q;
    private int s;
    private boolean u;
    private boolean w;
    private boolean y;
    private static final String a = h.class.getSimpleName() + StringUtil.SPACE;
    private static final String d = "biz_qcsc,biz_qcsc_nova";
    private static String e = "biz_qcsc,biz_qcsc_nova";
    private static long h = LocationStrategy.LOCATION_TIMEOUT;
    private static int j = 60;
    private static long l = 600000;
    private static double n = 15.0d;
    private static double p = 20.0d;
    private static int r = 300;
    private static boolean t = false;
    private static boolean v = false;
    private static boolean x = false;
    private static int z = 25;
    private static int B = 3;
    private static int D = 2;
    private static int F = -50;
    private static int H = -30;
    private static int J = -40;
    private static double N = 15.0d;
    private static double P = 20.0d;
    private static boolean R = false;
    private static final JSONArray V = new JSONArray();
    private static long Y = 1000;
    private static long aa = 1000;
    private static int ac = 200;
    private static int ae = 300;
    private static int ag = MapConstant.ANIMATION_DURATION_SHORT;

    public h(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bae1c812557501fd1e20ccb90c147057", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bae1c812557501fd1e20ccb90c147057");
            return;
        }
        this.c = 0;
        this.f = true;
        this.g = "";
        this.i = h;
        this.k = j;
        this.m = l;
        this.o = n;
        this.q = p;
        this.s = r;
        this.u = t;
        this.w = v;
        this.y = x;
        this.A = z;
        this.C = B;
        this.E = D;
        this.G = F;
        this.I = H;
        this.K = J;
        this.L = 1.2d;
        this.M = 1.8d;
        this.O = N;
        this.Q = P;
        this.S = R;
        this.T = 0.49d;
        this.U = 0.51d;
        this.W = V;
        this.X = false;
        this.Z = Y;
        this.ab = aa;
        this.ad = ac;
        this.af = ae;
        this.ah = ag;
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static h a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7782ca6d9df9901bed6bf0bceae2cf69", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7782ca6d9df9901bed6bf0bceae2cf69");
        }
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    b = new h(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9be2a25f652f4e10182585f2f05bdee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9be2a25f652f4e10182585f2f05bdee3");
            return;
        }
        this.g = sharedPreferences.getString("fusion_location_config", "");
        if ("".equals(this.g)) {
            return;
        }
        try {
            a(new JSONObject(this.g));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("prevent shaking new json exception");
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f42afc79cdb839f45f9d4a53a8b6324d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f42afc79cdb839f45f9d4a53a8b6324d");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.has("open_fusion_location_state")) {
                this.c = jSONObject.optInt("open_fusion_location_state", 0);
            }
            if (jSONObject.has("bizkeys")) {
                e = jSONObject.optString("bizkeys", d);
            }
            if (jSONObject.has("time_window_duration")) {
                this.i = jSONObject.optLong("time_window_duration", h);
            }
            if (jSONObject.has("continuous_filter_point_num")) {
                this.k = jSONObject.optInt("continuous_filter_point_num", j);
            }
            if (jSONObject.has("gps_state_run_time")) {
                this.m = jSONObject.optLong("gps_state_run_time", l);
            }
            if (jSONObject.has("smart_close_gnss_status")) {
                this.f = jSONObject.optBoolean("smart_close_gnss_status", true);
            }
            if (jSONObject.has("static_gears_speed_limit")) {
                this.o = jSONObject.optDouble("static_gears_speed_limit", n);
            }
            if (jSONObject.has("static_gps_speed_limit")) {
                this.q = jSONObject.optDouble("static_gps_speed_limit", p);
            }
            if (jSONObject.has("gears_filter_by_acc")) {
                this.s = jSONObject.optInt("gears_filter_by_acc", r);
            }
            if (jSONObject.has("is_upload_loc_info")) {
                this.u = jSONObject.optBoolean("is_upload_loc_info", t);
            }
            if (jSONObject.has("is_upload_logan")) {
                this.w = jSONObject.optBoolean("is_upload_logan", v);
            }
            if (jSONObject.has("is_upload_sniffer")) {
                this.y = jSONObject.optBoolean("is_upload_sniffer", x);
            }
            if (jSONObject.has("used_gps_sate_cn0dbhz_avg_base")) {
                this.A = jSONObject.optInt("used_gps_sate_cn0dbhz_avg_base", z);
            }
            if (jSONObject.has("used_gps_sate_count_base")) {
                this.C = jSONObject.optInt("used_gps_sate_count_base", B);
            }
            if (jSONObject.has("used_good_snr_gps_sate_count_base")) {
                this.E = jSONObject.optInt("used_good_snr_gps_sate_count_base", D);
            }
            if (jSONObject.has("main_connect_wifi_rssi_base")) {
                this.G = jSONObject.optInt("main_connect_wifi_rssi_base", F);
            }
            if (jSONObject.has("wifi_rssi_max_base")) {
                this.I = jSONObject.optInt("wifi_rssi_max_base", H);
            }
            if (jSONObject.has("top5_wifi_rssi_avg_base")) {
                this.K = jSONObject.optInt("top5_wifi_rssi_avg_base", J);
            }
            if (jSONObject.has("indoor_gnss_score")) {
                this.L = jSONObject.optDouble("indoor_gnss_score", 1.2d);
            }
            if (jSONObject.has("outdoor_gnss_score")) {
                this.M = jSONObject.optDouble("outdoor_gnss_score", 1.8d);
            }
            if (jSONObject.has("indoor_kf_update_and_observe_distance_threshold")) {
                this.O = jSONObject.optDouble("indoor_kf_update_and_observe_distance_threshold", N);
            }
            if (jSONObject.has("outdoor_kf_update_and_observe_distance_threshold")) {
                this.Q = jSONObject.optDouble("outdoor_kf_update_and_observe_distance_threshold", P);
            }
            if (jSONObject.has("is_open_choose_point_strategy")) {
                this.S = jSONObject.optBoolean("is_open_choose_point_strategy", R);
            }
            if (jSONObject.has("allow_min_indoor_threshold")) {
                this.U = jSONObject.optDouble("allow_min_indoor_threshold", 0.49d);
            }
            if (jSONObject.has("allow_max_outdoor_threshold")) {
                this.T = jSONObject.optDouble("allow_max_outdoor_threshold", 0.49d);
            }
            if (jSONObject.has("is_open_filtering_strategy")) {
                this.X = jSONObject.optBoolean("is_open_filtering_strategy", false);
            }
            if (jSONObject.has("location_general_delay_time_threshold")) {
                this.Z = jSONObject.optLong("location_general_delay_time_threshold", Y);
            }
            if (jSONObject.has("location_max_delay_time_threshold")) {
                this.ab = jSONObject.optLong("location_max_delay_time_threshold", aa);
            }
            if (jSONObject.has("mars_location_delay_by_acc_threshold")) {
                this.ad = jSONObject.optInt("mars_location_delay_by_acc_threshold", ac);
            }
            if (jSONObject.has("gears_indoor_location_delay_by_acc_threshold")) {
                this.af = jSONObject.optInt("gears_indoor_location_delay_by_acc_threshold", ae);
            }
            if (jSONObject.has("gears_outdoor_location_delay_by_acc_threshold")) {
                this.ah = jSONObject.optInt("gears_outdoor_location_delay_by_acc_threshold", ag);
            }
            if (jSONObject.has("strategy_switch_list")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("strategy_switch_list");
                if (optJSONArray == null) {
                    this.W = V;
                } else {
                    this.W = optJSONArray;
                }
            }
        }
    }

    public int A() {
        return this.ad;
    }

    public int B() {
        return this.af;
    }

    public int C() {
        return this.ah;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86fc5515145bc0f1e0eacbdfbb4fe1ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86fc5515145bc0f1e0eacbdfbb4fe1ad");
        } else if (jSONObject == null) {
        } else {
            this.g = jSONObject.toString();
            try {
                a(jSONObject);
            } catch (Exception unused) {
            }
            editor.putString("fusion_location_config", this.g);
        }
    }

    public boolean a() {
        return this.X;
    }

    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bc6b81926513490e11125e784b2364c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bc6b81926513490e11125e784b2364c")).booleanValue();
        }
        if (this.W == null || this.W.length() == 0 || this.W.length() <= i) {
            return true;
        }
        try {
            return this.W.optBoolean(i, true);
        } catch (Exception unused) {
            return true;
        }
    }

    public boolean a(Set<String> set) {
        Iterator it;
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "701494a443f05a30c04466015beb35f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "701494a443f05a30c04466015beb35f7")).booleanValue();
        }
        if (this.c == 0) {
            return false;
        }
        if (this.c == 1) {
            if (set == null || set.size() == 0 || TextUtils.isEmpty(e)) {
                return false;
            }
            String str = CommonConstant.Symbol.COMMA + e + CommonConstant.Symbol.COMMA;
            try {
                if (new HashSet(set).iterator().hasNext()) {
                    return str.contains(CommonConstant.Symbol.COMMA + ((String) it.next()) + CommonConstant.Symbol.COMMA);
                }
            } catch (Exception e2) {
                com.meituan.android.common.locate.platform.logs.c.a(a + "::bizKeys::" + e2.getMessage());
            }
        } else if (this.c == 2 && set != null && set.size() > 0) {
            return true;
        }
        return false;
    }

    public long b() {
        return this.i;
    }

    public long c() {
        return this.m;
    }

    public boolean d() {
        return this.f;
    }

    public double e() {
        return this.o;
    }

    public double f() {
        return this.q;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.s;
    }

    public boolean i() {
        return this.u;
    }

    public boolean j() {
        return this.w;
    }

    public boolean k() {
        return this.y;
    }

    public int l() {
        return this.A;
    }

    public int m() {
        return this.C;
    }

    public int n() {
        return this.E;
    }

    public int o() {
        return this.G;
    }

    public int p() {
        return this.I;
    }

    public int q() {
        return this.K;
    }

    public double r() {
        return this.L;
    }

    public double s() {
        return this.M;
    }

    public double t() {
        return this.O;
    }

    public double u() {
        return this.Q;
    }

    public boolean v() {
        return this.S;
    }

    public double w() {
        return this.U;
    }

    public double x() {
        return this.T;
    }

    public long y() {
        return this.Z;
    }

    public long z() {
        return this.ab;
    }
}
