package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.xm.monitor.report.db.TraceBean;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class f {
    public static String a = "error_info_min_length";
    private static SharedPreferences b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static u e;
    private static g f;
    private static List<a> c = new CopyOnWriteArrayList();
    private static List<a.InterfaceC0222a> d = new CopyOnWriteArrayList();

    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: com.meituan.android.common.locate.reporter.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0222a {
            void a(String str);
        }

        void onCollectConfigChange();

        void onLocateConfigChange();

        void onTrackConfigChange();
    }

    private static String a(String str, String str2) {
        String str3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0941c3b1535804f0a0a181c0efb9b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0941c3b1535804f0a0a181c0efb9b6b");
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str3 = (String) com.meituan.android.common.locate.util.l.a(str, str2);
        } catch (Throwable th) {
            LogUtils.a("ConfigCenter  get channel Exception: " + th.getMessage());
            str3 = "";
        }
        LogUtils.a("channel is: " + str3);
        return TextUtils.isEmpty(str3) ? c(com.meituan.android.common.locate.provider.g.a()) : str3;
    }

    public static synchronized List<a> a() {
        List<a> list;
        synchronized (f.class) {
            list = c;
        }
        return list;
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5e4fad80124e128daf50d1646f6d1cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5e4fad80124e128daf50d1646f6d1cc");
            return;
        }
        b(context);
        e = u.a(context);
        f = g.a(context);
        HashMap hashMap = new HashMap();
        hashMap.put("locateSdkVersion", com.meituan.android.common.locate.provider.l.a().c());
        hashMap.put("collectSdkVersion", d.a());
        com.meituan.android.common.locate.provider.a.a(context);
        hashMap.put("packageName", com.meituan.android.common.locate.provider.a.a);
        hashMap.put("appVersion", com.meituan.android.common.locate.provider.a.a(context).b);
        if (!TextUtils.isEmpty(GetUUID.getInstance().getUUID(context))) {
            hashMap.put("uuid", GetUUID.getInstance().getUUID(context));
        }
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("osVersion", Build.VERSION.RELEASE);
        hashMap.put("userid", com.meituan.android.common.locate.provider.a.c());
        hashMap.put(GearsLocator.AD_CODE, b().getString(GearsLocator.AD_CODE, ""));
        hashMap.put("googleChannel", a("com.meituan.android.base.BaseConfig", "channel"));
        LogUtils.a("ConfigCenter  init query map: " + hashMap);
        HornCallback hornCallback = new HornCallback() { // from class: com.meituan.android.common.locate.reporter.f.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a3b520d4f17cc53ab31e12854c044c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a3b520d4f17cc53ab31e12854c044c5");
                    return;
                }
                try {
                    if (!z) {
                        LogUtils.a("ConfigCenter locate config is not enable");
                        return;
                    }
                    LogUtils.a("ConfigCenter locate config " + str);
                    f.a(context, str);
                    if (f.c == null || f.c.size() <= 0) {
                        return;
                    }
                    for (a aVar : f.c) {
                        aVar.onLocateConfigChange();
                    }
                } catch (Throwable th) {
                    LogUtils.a("locateCallback onChange method exception: " + th.getMessage());
                }
            }
        };
        HornCallback hornCallback2 = new HornCallback() { // from class: com.meituan.android.common.locate.reporter.f.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43e044ba36403ef074bb38c18d1a640a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43e044ba36403ef074bb38c18d1a640a");
                    return;
                }
                try {
                    if (!z) {
                        LogUtils.a("ConfigCenter collector config is not enable");
                        return;
                    }
                    LogUtils.a("ConfigCenter collector config " + str);
                    LogUtils.a("ConfigCenter track listenerList is " + f.c.size());
                    f.d(context, str);
                    if (f.c == null || f.c.size() <= 0) {
                        return;
                    }
                    for (a aVar : f.c) {
                        LogUtils.a("ConfigCenter track listener is " + aVar.getClass().toString());
                        aVar.onCollectConfigChange();
                    }
                } catch (Throwable th) {
                    LogUtils.a("collectCallback onChange method exception: " + th.getMessage());
                }
            }
        };
        HornCallback hornCallback3 = new HornCallback() { // from class: com.meituan.android.common.locate.reporter.f.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "181e2f7b00bd8c6e03b6e009b6b3c6fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "181e2f7b00bd8c6e03b6e009b6b3c6fa");
                    return;
                }
                try {
                    if (!z) {
                        LogUtils.a("ConfigCenter track config is not enable");
                        return;
                    }
                    LogUtils.a("ConfigCenter track config " + str);
                    LogUtils.a("ConfigCenter track listenerList is " + f.c.size());
                    f.e(context, str);
                    if (f.c == null || f.c.size() <= 0) {
                        return;
                    }
                    for (a aVar : f.c) {
                        LogUtils.a("ConfigCenter track listener is " + aVar.getClass().toString());
                        aVar.onTrackConfigChange();
                    }
                } catch (Throwable th) {
                    LogUtils.a(th);
                }
            }
        };
        HornCallback hornCallback4 = new HornCallback() { // from class: com.meituan.android.common.locate.reporter.f.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad346b4d29720be9de31c5743cbfe1af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad346b4d29720be9de31c5743cbfe1af");
                    return;
                }
                try {
                    if (!z) {
                        LogUtils.a("ConfigCenter alog config is not enable");
                        return;
                    }
                    LogUtils.a("ConfigCenter alog config " + str);
                    if (f.d == null || f.d.size() <= 0) {
                        return;
                    }
                    for (a.InterfaceC0222a interfaceC0222a : f.d) {
                        interfaceC0222a.a(str);
                    }
                } catch (Throwable th) {
                    LogUtils.a(th);
                }
            }
        };
        Horn.register("locate", hornCallback, hashMap);
        Horn.register("collecter", hornCallback2, hashMap);
        Horn.register("track", hornCallback3, hashMap);
        Horn.register("alog", hornCallback4, hashMap);
    }

    public static void a(Context context, String str) {
        JSONObject optJSONObject;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "56b70b1bf34fea7c4241d456e7644194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "56b70b1bf34fea7c4241d456e7644194");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            LogUtils.a("updateLocationConfig: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                SharedPreferences.Editor c2 = c();
                if (jSONObject.has("enable")) {
                    LogUtils.a("ConfigCenter enable " + jSONObject.getBoolean("enable"));
                }
                if (jSONObject.has("enable_report")) {
                    c2.putBoolean("enable_report", jSONObject.optBoolean("enable_report", true));
                }
                if (jSONObject.has("interval")) {
                    long j = jSONObject.getLong("interval");
                    if (j < 600000) {
                        j = 600000;
                    }
                    c2.putLong("interval", j);
                }
                if (jSONObject.has(TraceBean.UPDATE_TIME)) {
                    c2.putLong(TraceBean.UPDATE_TIME, jSONObject.optLong(TraceBean.UPDATE_TIME, 1418278799050L));
                }
                if (jSONObject.has("last_update_time")) {
                    c2.putLong("last_update_time", jSONObject.optLong("last_update_time", 1418278799050L));
                }
                if (jSONObject.has("config_update_time")) {
                    c2.putLong("config_update_time", jSONObject.optLong("config_update_time", 1572856372896L));
                }
                if (jSONObject.has("repo_url_new")) {
                    c2.putString("repo_url_new", jSONObject.optString("repo_url_new", ""));
                }
                long optLong = jSONObject.has("loc_wifi_interval") ? jSONObject.optLong("loc_wifi_interval", 30L) : 30L;
                c2.putLong("loc_wifi_interval", optLong);
                long optLong2 = jSONObject.has("loc_wifi_pull_interval") ? jSONObject.optLong("loc_wifi_pull_interval", 10L) : 10L;
                c2.putLong("loc_wifi_pull_interval", optLong2);
                if (jSONObject.has("wifi_similarity_min_ratio")) {
                    c2.putFloat("wifi_similarity_min_ratio", (float) jSONObject.optDouble("wifi_similarity_min_ratio", 0.7799999713897705d));
                }
                if (jSONObject.has("alog_mobile_data_volumn")) {
                    c2.putLong("alog_mobile_data_volumn", jSONObject.optLong("alog_mobile_data_volumn", 256L));
                }
                if (jSONObject.has("crash_upload_limit")) {
                    c2.putInt("crash_upload_limit", jSONObject.optInt("crash_upload_limit", 5));
                }
                if (jSONObject.has("last_config_update_time")) {
                    c2.putLong("last_config_update_time", jSONObject.optLong("last_config_update_time", 0L));
                }
                if (jSONObject.has("enable_megrez_1")) {
                    c2.putBoolean("enable_megrez_1", jSONObject.optBoolean("enable_megrez_1", false));
                }
                if (jSONObject.has("enable_alog_upload")) {
                    c2.putBoolean("enable_alog_upload", jSONObject.optBoolean("enable_alog_upload", true));
                }
                if (jSONObject.has("logan_level")) {
                    int optInt = jSONObject.optInt("logan_level", 3);
                    c2.putInt("logan_level", (optInt < 0 || optInt > 3) ? 3 : 3);
                }
                if (jSONObject.has("enable_subprocess_megrez")) {
                    c2.putBoolean("enable_subprocess_megrez", jSONObject.optBoolean("enable_subprocess_megrez", false));
                }
                if (jSONObject.has("alog_upload_limit")) {
                    c2.putInt("alog_upload_limit", jSONObject.optInt("alog_upload_limit", 100));
                }
                if (jSONObject.has("enable_alog_write")) {
                    c2.putBoolean("enable_alog_write", jSONObject.optBoolean("enable_alog_write", true));
                }
                if (jSONObject.has("db_cache_duration_limit")) {
                    c2.putInt("db_cache_duration_limit", jSONObject.optInt("db_cache_duration_limit", 12));
                }
                if (jSONObject.has("is_enable_ble_scan")) {
                    c2.putBoolean("is_enable_ble_scan", jSONObject.optBoolean("is_enable_ble_scan", false));
                }
                if (jSONObject.has("auto_loc_interval")) {
                    c2.putInt("auto_loc_interval", jSONObject.optInt("auto_loc_interval", 15));
                }
                if (jSONObject.has("cache_overdue_time")) {
                    c2.putLong("cache_overdue_time", jSONObject.optInt("cache_overdue_time", 35));
                }
                if (jSONObject.has("useOffline")) {
                    c2.putBoolean("useOffline", jSONObject.optBoolean("useOffline", false));
                }
                if (jSONObject.has("useSystemLocate")) {
                    c2.putBoolean("useSystemLocate", jSONObject.optBoolean("useSystemLocate", false));
                }
                if (jSONObject.has("useApproximateLocate")) {
                    c2.putBoolean("useApproximateLocate", jSONObject.optBoolean("useApproximateLocate", true));
                }
                if (jSONObject.has("uploadTrackList")) {
                    c2.putBoolean("uploadTrackList", jSONObject.optBoolean("uploadTrackList", false));
                }
                if (jSONObject.has("is_enable_startup_perf_report")) {
                    c2.putBoolean("is_enable_startup_perf_report", jSONObject.optBoolean("is_enable_startup_perf_report", true));
                }
                if (jSONObject.has("subwifiage_filter_time")) {
                    c2.putLong("subwifiage_filter_time", jSONObject.optLong("subwifiage_filter_time", 90L));
                }
                if (jSONObject.has("gz_subwifiage_filter_time")) {
                    c2.putLong("gz_subwifiage_filter_time", jSONObject.optLong("gz_subwifiage_filter_time", 1800L));
                }
                if (jSONObject.has("is_filter_invalid_wifi")) {
                    c2.putBoolean("is_filter_invalid_wifi", jSONObject.optBoolean("is_filter_invalid_wifi", false));
                }
                if (jSONObject.has("enable_force_time_injection")) {
                    c2.putBoolean("enable_force_time_injection", jSONObject.optBoolean("enable_force_time_injection", false));
                }
                if (jSONObject.has("system_wifiage_filter_time")) {
                    c2.putLong("system_wifiage_filter_time", jSONObject.optLong("system_wifiage_filter_time", 90L));
                }
                if (jSONObject.has("is_system_filter_invalid_wifi")) {
                    c2.putBoolean("is_system_filter_invalid_wifi", jSONObject.optBoolean("is_system_filter_invalid_wifi", false));
                }
                if (jSONObject.has("sniffer_report_interval")) {
                    c2.putLong("sniffer_report_interval", jSONObject.optLong("sniffer_report_interval", 150000L));
                }
                if (jSONObject.has("wifi_lock_enable")) {
                    c2.putBoolean("wifi_lock_enable", jSONObject.optBoolean("wifi_lock_enable", true));
                }
                if (jSONObject.has("enable_permcheck_inload")) {
                    c2.putBoolean("enable_permcheck_inload", jSONObject.optBoolean("enable_permcheck_inload", true));
                }
                if (jSONObject.has("disable_background_locating")) {
                    c2.putBoolean("disable_background_locating", jSONObject.optBoolean("disable_background_locating", true));
                }
                if (jSONObject.has("crash_file_number")) {
                    c2.putInt("crash_file_number", jSONObject.optInt("crash_file_number", 10));
                }
                if (jSONObject.has("systemlocator_continuous_same_loc_num")) {
                    c2.putInt("systemlocator_continuous_same_loc_num", jSONObject.optInt("systemlocator_continuous_same_loc_num", 3));
                }
                if (jSONObject.has("past_time")) {
                    c2.putLong("past_time", jSONObject.optLong("past_time", PayTask.j));
                }
                if (jSONObject.has("network_wait_time")) {
                    c2.putLong("network_wait_time", jSONObject.optLong("network_wait_time", 15000L));
                }
                if (jSONObject.has("gps_lost_time")) {
                    c2.putLong("gps_lost_time", jSONObject.optLong("gps_lost_time", PayTask.j));
                }
                if (jSONObject.has("location_report_interval")) {
                    c2.putLong("location_report_interval", jSONObject.optLong("location_report_interval", ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE));
                }
                if (jSONObject.has("is_use_timer_upload")) {
                    c2.putBoolean("is_use_timer_upload", jSONObject.optBoolean("is_use_timer_upload", true));
                }
                if (jSONObject.has("upload_location")) {
                    c2.putString("upload_location", jSONObject.getString("upload_location"));
                }
                if (jSONObject.has("use_system_geo")) {
                    c2.putBoolean("use_system_geo", jSONObject.optBoolean("use_system_geo", false));
                }
                if (jSONObject.has("open_raptor_data")) {
                    c2.putBoolean("open_raptor_data", jSONObject.optBoolean("open_raptor_data", true));
                }
                if (jSONObject.has("ad_code")) {
                    c2.putString("ad_code", jSONObject.optString("ad_code", ""));
                }
                if (jSONObject.has(LoadConfig.GPS_MIN_TIME)) {
                    c2.putLong(LoadConfig.GPS_MIN_TIME, jSONObject.optLong(LoadConfig.GPS_MIN_TIME, 1000L));
                }
                if (jSONObject.has(LoadConfig.GPS_MIN_DISTANCE)) {
                    c2.putFloat(LoadConfig.GPS_MIN_DISTANCE, (float) jSONObject.optDouble(LoadConfig.GPS_MIN_DISTANCE, 0.0d));
                }
                if (jSONObject.has("LOG_LEVER")) {
                    c2.putInt("LOG_LEVER", jSONObject.optInt("LOG_LEVER", 2));
                }
                if (jSONObject.has(a)) {
                    c2.putInt(a, jSONObject.optInt(a, 300));
                }
                if (jSONObject.has("ab_switch")) {
                    try {
                        a(jSONObject.getJSONObject("ab_switch"), c2);
                    } catch (JSONException e2) {
                        LogUtils.a(e2);
                    }
                }
                if (jSONObject.has("wifi_config")) {
                    e.a(jSONObject.getJSONObject("wifi_config"), c2);
                }
                if (jSONObject.has("fingerprint_config")) {
                    f.a(jSONObject.getJSONObject("fingerprint_config"), c2);
                }
                if (jSONObject.has("cache_config")) {
                    b.a(context).a(jSONObject.getJSONObject("cache_config"), c2);
                }
                if (jSONObject.has("common_config")) {
                    e.a(context).a(jSONObject.getJSONObject("common_config"), c2);
                }
                if (jSONObject.has("cell_config")) {
                    c.a(context).a(jSONObject.getJSONObject("cell_config"), c2);
                }
                if (jSONObject.has("manager_config")) {
                    o.a(context).a(jSONObject.getJSONObject("manager_config"), c2);
                }
                if (jSONObject.has("prevent_shaking_config")) {
                    p.a(context).a(jSONObject.getJSONObject("prevent_shaking_config"), c2);
                }
                if (jSONObject.has("gps_reboot_config")) {
                    j.a(context).a(jSONObject.getJSONObject("gps_reboot_config"), c2);
                }
                if (jSONObject.has("fusion_location_config")) {
                    h.a(context).a(jSONObject.getJSONObject("fusion_location_config"), c2);
                }
                if (jSONObject.has("user_session_config")) {
                    t.a(context).a(jSONObject.getJSONObject("user_session_config"), c2);
                }
                if (jSONObject.has("strategy_config")) {
                    r.a(context).a(jSONObject.getJSONObject("strategy_config"), c2);
                }
                if (jSONObject.has("sensor_config")) {
                    q.a(context).a(jSONObject.getJSONObject("sensor_config"), c2);
                }
                if (jSONObject.has("ble_scan_config")) {
                    com.meituan.android.common.locate.reporter.a.a(context).a(jSONObject.getJSONObject("ble_scan_config"), c2);
                }
                if (jSONObject.has("alt_beacon_horn_config")) {
                    com.meituan.android.common.locate.altbeacon.beacon.config.a.a().a(jSONObject.getJSONObject("alt_beacon_horn_config"));
                    c2.putString("alt_beacon_horn_config", jSONObject.getString("alt_beacon_horn_config"));
                }
                if (jSONObject.has("indicator_horn_switch")) {
                    int optInt2 = jSONObject.optInt("indicator_horn_switch", 0);
                    c2.putInt("indicator_horn_switch", optInt2);
                    boolean z = true;
                    if (optInt2 != 1) {
                        z = false;
                    }
                    com.meituan.android.common.locate.platform.sniffer.b.a = z;
                }
                if (jSONObject.has("wifi_scan_retry") && (optJSONObject = jSONObject.optJSONObject("wifi_scan_retry")) != null) {
                    if (optJSONObject.has("enable_wifi_scan_retry")) {
                        c2.putBoolean("enable_wifi_scan_retry", optJSONObject.optBoolean("enable_wifi_scan_retry", false));
                    }
                    if (optJSONObject.has("wifi_scan_retry_interval_second")) {
                        c2.putInt("wifi_scan_retry_interval_second", optJSONObject.optInt("wifi_scan_retry_interval_second", 2));
                    }
                }
                if (jSONObject.has("bike_stop_delay_switch")) {
                    c2.putBoolean("bike_stop_delay_switch", jSONObject.optBoolean("bike_stop_delay_switch"));
                }
                if (jSONObject.has("traffic_statistics_switch")) {
                    c2.putBoolean("traffic_statistics_switch", jSONObject.optBoolean("traffic_statistics_switch"));
                }
                if (jSONObject.has("is_judge_Permission_6_below")) {
                    c2.putBoolean("is_judge_Permission_6_below", jSONObject.optBoolean("is_judge_Permission_6_below"));
                }
                if (jSONObject.has("is_keep_seven_decimal")) {
                    c2.putBoolean("is_keep_seven_decimal", jSONObject.optBoolean("is_keep_seven_decimal"));
                }
                if (jSONObject.has("is_use_new_change_strategy")) {
                    c2.putBoolean("is_use_new_change_strategy", jSONObject.optBoolean("is_use_new_change_strategy"));
                }
                if (jSONObject.has("LatLng_passback")) {
                    l.a().a(jSONObject.optJSONObject("LatLng_passback"));
                    c2.putString("LatLng_passback", jSONObject.getString("LatLng_passback"));
                }
                if (jSONObject.has("log_point_config")) {
                    n.a().a(jSONObject.optJSONObject("log_point_config"));
                    c2.putString("log_point_config", jSONObject.getString("log_point_config"));
                }
                if (jSONObject.has("gears_location_encrypt_switcher")) {
                    LogUtils.a("GEARS_LOCATION_ENCRYPT_SWITCHER work result: " + jSONObject.optBoolean("gears_location_encrypt_switcher"));
                    c2.putBoolean("gears_location_encrypt_switcher", jSONObject.optBoolean("gears_location_encrypt_switcher"));
                }
                if (jSONObject.has("ip_location_encrypt_switcher")) {
                    LogUtils.a("IP_LOCATION_ENCRYPT_SWITCHER work result: " + jSONObject.optBoolean("ip_location_encrypt_switcher"));
                    c2.putBoolean("ip_location_encrypt_switcher", jSONObject.optBoolean("ip_location_encrypt_switcher"));
                }
                if (jSONObject.has("geo_encrypt_switcher")) {
                    LogUtils.a("GEO_ENCRYPT_SWITCHER work result: " + jSONObject.optBoolean("geo_encrypt_switcher"));
                    c2.putBoolean("geo_encrypt_switcher", jSONObject.optBoolean("geo_encrypt_switcher"));
                }
                if (jSONObject.has("geo_coder_config")) {
                    i.a(context).a(jSONObject.getJSONObject("geo_coder_config"), c2);
                }
                c2.apply();
                com.meituan.android.common.locate.platform.sniffer.c.a(new c.a("locate_wifi", "true", "loc_wifi_interval: " + optLong + " loc_wifi_pull_interval: " + optLong2, ""));
            } catch (JSONException e3) {
                LogUtils.a(e3.getLocalizedMessage());
            }
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d8c24ee2c2a684b05ef5d8f0dcb3615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d8c24ee2c2a684b05ef5d8f0dcb3615");
        } else if (aVar == null || c == null) {
        } else {
            c.add(aVar);
            LogUtils.a("ConfigCenter " + aVar.getClass().getName() + " has been added");
        }
    }

    private static void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62a032db23b9074b242ff2b09af43fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62a032db23b9074b242ff2b09af43fae");
        } else if (jSONObject.has("locate_V2_V3")) {
            editor.putBoolean("locate_V2_V3", jSONObject.optBoolean("locate_V2_V3", false));
        }
    }

    public static SharedPreferences b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9422053da7c74d7480146ce4114d1f5", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9422053da7c74d7480146ce4114d1f5") : b(com.meituan.android.common.locate.provider.g.a());
    }

    public static SharedPreferences b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb4ab20331cc7fc04910ccc1b1d05a89", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb4ab20331cc7fc04910ccc1b1d05a89");
        }
        if (context == null) {
            return null;
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = context.getApplicationContext().getSharedPreferences("location_config_center", 0);
                }
            }
        }
        return b;
    }

    public static SharedPreferences.Editor c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7ff3cb34a010d779117d2ad8a27f941", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences.Editor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7ff3cb34a010d779117d2ad8a27f941") : b().edit();
    }

    private static String c(Context context) {
        ApplicationInfo applicationInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62b1c1e3b5a4a2faf11780d847226a07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62b1c1e3b5a4a2faf11780d847226a07");
        }
        if (context == null) {
            return "";
        }
        String str = "";
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && applicationInfo.metaData != null) {
                String string = applicationInfo.metaData.getString("channel");
                try {
                    LogUtils.a("ConfigCenter  get channel from app meta is:  " + string);
                    return string;
                } catch (Throwable th) {
                    str = string;
                    th = th;
                    LogUtils.a("ConfigCenter  get channel Exception:  " + th.getMessage());
                    return str;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf97fef2a8b315834a894e8dac8c1f67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf97fef2a8b315834a894e8dac8c1f67");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            LogUtils.a("updateCollectorConfig: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                SharedPreferences.Editor c2 = c();
                if (jSONObject.has("coll_wifi_interval")) {
                    c2.putLong("coll_wifi_interval", jSONObject.optLong("coll_wifi_interval", 23000L));
                }
                if (jSONObject.has("coll_wifi_interval")) {
                    c2.putLong("coll_wifiscan_duration", jSONObject.optLong("coll_wifiscan_duration", 300000L));
                }
                if (jSONObject.has("collect_nr_info")) {
                    c2.putBoolean("collect_nr_info", jSONObject.optBoolean("collect_nr_info", false));
                }
                if (jSONObject.has("collect_cell_switch")) {
                    c2.putBoolean("collect_cell_switch", jSONObject.optBoolean("collect_cell_switch", false));
                }
                if (jSONObject.has("collect_cell_filter")) {
                    c2.putBoolean("collect_cell_filter", jSONObject.optBoolean("collect_cell_filter", false));
                }
                if (jSONObject.has("collect_alarm_api")) {
                    c2.putBoolean("collect_alarm_api", jSONObject.optBoolean("collect_alarm_api", true));
                }
                if (jSONObject.has("coll_inert_duration")) {
                    c2.putLong("coll_inert_duration", jSONObject.optLong("coll_inert_duration", 300000L));
                }
                if (jSONObject.has("collector_filter_gps_distance")) {
                    c2.putInt("collector_filter_gps_distance", jSONObject.optInt("collector_filter_gps_distance", 3));
                }
                if (jSONObject.has("coll_interval_upload_time")) {
                    c2.putLong("coll_interval_upload_time", jSONObject.optLong("coll_interval_upload_time", DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME));
                }
                if (jSONObject.has("ble_coll_distance")) {
                    c2.putInt("ble_coll_distance", jSONObject.optInt("ble_coll_distance", 12));
                }
                if (jSONObject.has("ble_coll_interval")) {
                    c2.putLong("ble_coll_interval", jSONObject.optLong("ble_coll_interval", 10L));
                }
                if (jSONObject.has("ble_list_max")) {
                    c2.putInt("ble_list_max", jSONObject.optInt("ble_list_max", 40));
                }
                if (jSONObject.has("ble_enable_name")) {
                    c2.putString("ble_enable_name", jSONObject.optString("ble_enable_name", ""));
                }
                if (jSONObject.has("alog_time_gap_limit")) {
                    c2.putInt("alog_time_gap_limit", jSONObject.optInt("alog_time_gap_limit", 60));
                }
                if (jSONObject.has("alog_local_result_file_count")) {
                    c2.putInt("alog_local_result_file_count", jSONObject.optInt("alog_local_result_file_count", 30));
                }
                if (jSONObject.has("alog_single_file_max_size")) {
                    c2.putLong("alog_single_file_max_size", jSONObject.optLong("alog_single_file_max_size", 50L));
                }
                if (jSONObject.has("alog_item_num_in_one_file")) {
                    c2.putInt("alog_item_num_in_one_file", jSONObject.optInt("alog_item_num_in_one_file", 100));
                }
                if (jSONObject.has("alog_item_min_length_one_file")) {
                    c2.putInt("alog_item_min_length_one_file", jSONObject.optInt("alog_item_min_length_one_file", 200));
                }
                if (jSONObject.has("config_info_min_store_interval")) {
                    c2.putInt("config_info_min_store_interval", jSONObject.optInt("config_info_min_store_interval", 3));
                }
                if (jSONObject.has("ble_scan_config_new")) {
                    c2.putString("ble_scan_config_new", jSONObject.getString("ble_scan_config_new"));
                }
                if (jSONObject.has("is_open_new_collector")) {
                    c2.putBoolean("is_open_new_collector", jSONObject.getBoolean("is_open_new_collector"));
                }
                if (jSONObject.has("locate_ipc_opt_config")) {
                    k.a().a(jSONObject.getJSONObject("locate_ipc_opt_config"));
                    c2.putString("locate_ipc_opt_config", jSONObject.getString("locate_ipc_opt_config"));
                }
                if (jSONObject.has("trigger_config_locate")) {
                    s.a().a(jSONObject.getJSONObject("trigger_config_locate"));
                    c2.putString("trigger_config_locate", jSONObject.getString("trigger_config_locate"));
                }
                c2.apply();
            } catch (JSONException e2) {
                LogUtils.a(e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0516391b56fa55c57421df2b6de776a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0516391b56fa55c57421df2b6de776a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            LogUtils.a("updateTrackConfig: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                SharedPreferences.Editor c2 = c();
                if (jSONObject.has("track_recycle_time")) {
                    c2.putLong("track_recycle_time", jSONObject.getLong("track_recycle_time"));
                }
                if (jSONObject.has("track_max_report_count")) {
                    c2.putInt("track_max_report_count", jSONObject.getInt("track_max_report_count"));
                }
                if (jSONObject.has("track_max_store_count")) {
                    c2.putInt("track_max_store_count", jSONObject.getInt("track_max_store_count"));
                }
                if (jSONObject.has("track_filter_loc_distance")) {
                    c2.putInt("track_filter_loc_distance", jSONObject.getInt("track_filter_loc_distance"));
                }
                if (jSONObject.has("track_filter_loc_time")) {
                    c2.putLong("track_filter_loc_time", jSONObject.getLong("track_filter_loc_time"));
                }
                if (jSONObject.has("track_mobile_data_volumn")) {
                    c2.putLong("track_mobile_data_volumn", jSONObject.getLong("track_mobile_data_volumn"));
                }
                if (jSONObject.has("track_failed_store_time")) {
                    c2.putLong("track_failed_store_time", jSONObject.getLong("track_failed_store_time"));
                }
                if (jSONObject.has("is_permit_track_report_sensor")) {
                    c2.putBoolean("is_permit_track_report_sensor", jSONObject.getBoolean("is_permit_track_report_sensor"));
                }
                if (jSONObject.has("enable_track_report")) {
                    c2.putBoolean("enable_track_report", jSONObject.getBoolean("enable_track_report"));
                }
                if (jSONObject.has("track_init_min_interval")) {
                    c2.putLong("track_init_min_interval", jSONObject.getLong("track_init_min_interval"));
                }
                c2.apply();
            } catch (JSONException e2) {
                LogUtils.a(e2.getMessage());
            }
        }
    }
}
