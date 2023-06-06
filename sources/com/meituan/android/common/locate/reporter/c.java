package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c {
    private static final String a = c.class.getSimpleName() + StringUtil.SPACE;
    private static c b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long c;
    private boolean d;
    private int e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private String k;

    public c(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92a813a9060c00a575f720ae59b7220", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92a813a9060c00a575f720ae59b7220");
            return;
        }
        this.c = 900000L;
        this.d = false;
        this.e = 5;
        this.f = LocationStrategy.LOCATION_TIMEOUT;
        this.g = 300000L;
        this.h = true;
        this.i = PayTask.j;
        this.j = 30000L;
        this.k = "";
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6227cba10785adf66448e40d0beaf4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6227cba10785adf66448e40d0beaf4e");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27e0cbda23b791c0cdb5a56f254eab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27e0cbda23b791c0cdb5a56f254eab7");
            return;
        }
        this.k = sharedPreferences.getString("cell_config", "");
        if ("".equals(this.k)) {
            return;
        }
        try {
            a(new JSONObject(this.k));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("cell config new json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9a41a73ff81626478b651ce219f7dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9a41a73ff81626478b651ce219f7dd5");
            return;
        }
        try {
            if (jSONObject.has("request_update_min_time")) {
                this.f = jSONObject.optLong("request_update_min_time", LocationStrategy.LOCATION_TIMEOUT);
            }
            if (jSONObject.has("cell_cache_valid_time")) {
                this.g = jSONObject.optLong("cell_cache_valid_time", 300000L);
            }
            if (jSONObject.has("cell_upload_max_length")) {
                this.e = jSONObject.optInt("cell_upload_max_length", 5);
            }
            if (jSONObject.has("cell_legal_filter")) {
                this.h = jSONObject.optBoolean("cell_legal_filter", true);
            }
            this.c = jSONObject.optLong("system_cellage_filter_time", 900000L);
            this.d = jSONObject.optBoolean("is_system_filter_invalid_cell", false);
            if (jSONObject.has("get_cells_interval")) {
                this.i = jSONObject.optLong("get_cells_interval", PayTask.j);
            }
            if (jSONObject.has("get_nosims_cells_interval")) {
                this.j = jSONObject.optLong("get_nosims_cells_interval", 30000L);
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("parse cell config exception:" + e.getMessage(), 3);
        }
    }

    public long a() {
        return this.f;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d008f64f118ceebcc6da5b80c94848b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d008f64f118ceebcc6da5b80c94848b");
        } else if (jSONObject == null) {
        } else {
            this.k = jSONObject.toString();
            a(jSONObject);
            editor.putString("cell_config", this.k);
        }
    }

    public long b() {
        return this.g;
    }

    public long c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public long e() {
        return this.i;
    }

    public long f() {
        return this.j;
    }

    public int g() {
        return this.e;
    }

    public boolean h() {
        return this.h;
    }
}
