package com.meituan.android.common.locate.reporter;

import android.text.TextUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class s {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public float o;
    public long p;
    public boolean q;
    public long r;
    public boolean s;

    /* loaded from: classes2.dex */
    public static class a {
        private static final s a = new s();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e9908822ad31aa8e8852b3a1e46ba8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e9908822ad31aa8e8852b3a1e46ba8f");
            return;
        }
        this.a = 0L;
        this.b = 0L;
        this.c = LocationStrategy.LOCATION_TIMEOUT;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = LocationStrategy.LOCATION_TIMEOUT;
        this.k = 0L;
        this.l = 0L;
        this.m = 1200000L;
        this.n = 1000L;
        this.o = 0.0f;
        this.p = 0L;
        this.q = false;
        this.r = MetricsAnrManager.ANR_THRESHOLD;
        this.s = false;
        b();
    }

    public static s a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6db6cade539ebd3f0794ab4e1918dd2a", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6db6cade539ebd3f0794ab4e1918dd2a") : a.a;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c590f0e8c5541ef659d7093b2491c90f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c590f0e8c5541ef659d7093b2491c90f");
        } else if (com.meituan.android.common.locate.provider.g.a() == null) {
        } else {
            String string = f.b(com.meituan.android.common.locate.provider.g.a().getApplicationContext()).getString("trigger_config_locate", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                a(new JSONObject(string));
            } catch (JSONException e) {
                com.meituan.android.common.locate.platform.logs.c.a("init trigger optconfig exception:" + e.getMessage(), 3);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66403535321a9a0391ac566d65830413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66403535321a9a0391ac566d65830413");
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.has("config_service_state")) {
                    this.a = jSONObject.getLong("config_service_state");
                }
                if (jSONObject.has("config_cell_location")) {
                    this.b = jSONObject.getLong("config_cell_location");
                }
                if (jSONObject.has("config_signal_change")) {
                    this.c = jSONObject.getLong("config_signal_change");
                }
                if (jSONObject.has("config_upload_tracks")) {
                    this.d = jSONObject.getLong("config_upload_tracks");
                }
                if (jSONObject.has("config_gps_disable")) {
                    this.e = jSONObject.getLong("config_gps_disable");
                }
                if (jSONObject.has("config_gps_refresh")) {
                    this.f = jSONObject.getLong("config_gps_refresh");
                }
                if (jSONObject.has("config_gps_got")) {
                    this.g = jSONObject.getLong("config_gps_got");
                }
                if (jSONObject.has("config_network_trigger")) {
                    this.h = jSONObject.getLong("config_network_trigger");
                }
                if (jSONObject.has("collection_cell_location")) {
                    this.i = jSONObject.getLong("collection_cell_location");
                }
                if (jSONObject.has("collection_signal_change")) {
                    this.j = jSONObject.getLong("collection_signal_change");
                }
                if (jSONObject.has("wifi_scan_old")) {
                    this.k = jSONObject.getLong("wifi_scan_old");
                }
                if (jSONObject.has("wifi_scan_new")) {
                    this.l = jSONObject.getLong("wifi_scan_new");
                }
                if (jSONObject.has("post_cell_update")) {
                    this.m = jSONObject.optLong("post_cell_update", 1200000L);
                }
                if (jSONObject.has("collection_min_time")) {
                    this.n = jSONObject.getLong("collection_min_time");
                }
                if (jSONObject.has("collection_min_distance")) {
                    this.o = jSONObject.getInt("collection_min_distance");
                }
                if (jSONObject.has("wifi_receive_broadcast")) {
                    this.p = jSONObject.getLong("wifi_receive_broadcast");
                }
                if (jSONObject.has("is_start_init_get_cell_info")) {
                    this.q = jSONObject.optBoolean("is_start_init_get_cell_info", false);
                }
                if (jSONObject.has("is_start_init_get_wifi_info")) {
                    this.s = jSONObject.optBoolean("is_start_init_get_wifi_info", false);
                }
                if (jSONObject.has("get_cell_info_threshold")) {
                    this.r = jSONObject.optLong("get_cell_info_threshold", MetricsAnrManager.ANR_THRESHOLD);
                }
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("parse ipcconfig2 exception:" + e.getMessage(), 3);
            }
        }
    }
}
