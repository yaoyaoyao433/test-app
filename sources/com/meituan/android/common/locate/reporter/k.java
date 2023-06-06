package com.meituan.android.common.locate.reporter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class k {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;
    public double r;
    public boolean s;
    public boolean t;

    /* loaded from: classes2.dex */
    public static class a {
        private static final k a = new k();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9864613011db7653b32977f18c2489f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9864613011db7653b32977f18c2489f");
            return;
        }
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = 1.0d;
        this.i = 40.0d;
        this.j = 1.0d;
        this.k = 1.0d;
        this.l = 2.0d;
        this.m = 2.0d;
        this.n = 2.0d;
        this.o = 2.0d;
        this.p = 1.0d;
        this.q = 1.0d;
        this.r = 1.0d;
        this.s = true;
        this.t = true;
        b();
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9309aadeb9ed708d8697cd7eeb2327d", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9309aadeb9ed708d8697cd7eeb2327d") : a.a;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81021c803060712553d1997d02cc5d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81021c803060712553d1997d02cc5d4c");
        } else if (com.meituan.android.common.locate.provider.g.a() == null) {
        } else {
            String string = f.b(com.meituan.android.common.locate.provider.g.a().getApplicationContext()).getString("locate_ipc_opt_config", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                a(new JSONObject(string));
            } catch (JSONException e) {
                com.meituan.android.common.locate.platform.logs.c.a("initIpcConfig exception:" + e.getMessage(), 3);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7910c2880a2b448d3a8ede01e45fe2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7910c2880a2b448d3a8ede01e45fe2fd");
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.has("location_finger_print_switch")) {
                    this.a = jSONObject.getInt("location_finger_print_switch");
                }
                if (jSONObject.has("collection_function_config_new")) {
                    this.b = jSONObject.getInt("collection_function_config_new") == 1;
                }
                if (jSONObject.has("collection_function_sub_process")) {
                    this.c = jSONObject.getInt("collection_function_sub_process") == 1;
                }
                if (jSONObject.has("collection_nmea_config")) {
                    this.d = jSONObject.getInt("collection_nmea_config") == 1;
                }
                if (jSONObject.has("collection_gps_status_config")) {
                    this.e = jSONObject.getInt("collection_gps_status_config") == 1;
                }
                if (jSONObject.has("main_location_gps_status_config")) {
                    if (jSONObject.getInt("main_location_gps_status_config") != 1) {
                        z = false;
                    }
                    this.f = z;
                }
                if (jSONObject.has("close_reporter_when_close_locate")) {
                    this.s = jSONObject.getBoolean("close_reporter_when_close_locate");
                }
                if (jSONObject.has("on_nmea_received_config")) {
                    this.i = jSONObject.getDouble("on_nmea_received_config");
                }
                if (jSONObject.has("request_location_update_config")) {
                    this.j = jSONObject.getDouble("request_location_update_config");
                }
                if (jSONObject.has("add_nmea_listener_config")) {
                    this.h = jSONObject.getDouble("add_nmea_listener_config");
                }
                if (jSONObject.has("on_location_changed_config")) {
                    this.k = jSONObject.getDouble("on_location_changed_config");
                }
                if (jSONObject.has("get_cell_location_config")) {
                    this.l = jSONObject.getDouble("get_cell_location_config");
                }
                if (jSONObject.has("get_all_cellinfo_config")) {
                    this.m = jSONObject.getDouble("get_all_cellinfo_config");
                }
                if (jSONObject.has("request_cellinfo_update_config")) {
                    this.n = jSONObject.getDouble("request_cellinfo_update_config");
                }
                if (jSONObject.has("start_scan_config")) {
                    this.o = jSONObject.getDouble("start_scan_config");
                }
                if (jSONObject.has("get_scan_results_config")) {
                    this.p = jSONObject.getDouble("get_scan_results_config");
                }
                if (jSONObject.has("get_connection_info_config")) {
                    this.q = jSONObject.getDouble("get_connection_info_config");
                }
                if (jSONObject.has("get_cell_location_ext_config")) {
                    this.r = jSONObject.getDouble("get_cell_location_ext_config");
                }
                if (jSONObject.has("change_update_looper_config")) {
                    this.g = jSONObject.getBoolean("change_update_looper_config");
                }
                if (jSONObject.has("vpn_network_no_judge")) {
                    this.t = jSONObject.getBoolean("vpn_network_no_judge");
                }
            } catch (JSONException e) {
                com.meituan.android.common.locate.platform.logs.c.a("parse ipc config exception:" + e.getMessage(), 3);
                this.a = 0;
            }
        }
    }
}
