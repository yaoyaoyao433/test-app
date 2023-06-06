package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private static a a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String b;
    private boolean c;
    private boolean d;
    private long e;
    private long f;
    private int g;

    public a(Context context) {
        SharedPreferences b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6252821251338b2d44baa0476c578b17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6252821251338b2d44baa0476c578b17");
            return;
        }
        this.b = "";
        this.c = false;
        this.d = false;
        this.e = MetricsAnrManager.ANR_THRESHOLD;
        this.f = 15000L;
        this.g = 10;
        if (context == null || context.getApplicationContext() == null || (b = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b);
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cce73b24f971a235482e3939b598e3de", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cce73b24f971a235482e3939b598e3de");
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18b3b809a613cbcd1cf724ab814f2333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18b3b809a613cbcd1cf724ab814f2333");
            return;
        }
        this.b = sharedPreferences.getString("ble_scan_config", "");
        if ("".equals(this.b)) {
            return;
        }
        try {
            a(new JSONObject(this.b));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("ble scan new json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7528e6f1a5af0061a10dd2a685d9a7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7528e6f1a5af0061a10dd2a685d9a7da");
        } else if (jSONObject == null) {
        } else {
            this.d = jSONObject.optBoolean("is_open_ble_upload", false);
            this.c = jSONObject.optBoolean("is_open_scan", false);
            this.e = jSONObject.optLong("ble_cache_valid_time", MetricsAnrManager.ANR_THRESHOLD);
            this.f = jSONObject.optLong("business_get_ble_valid_time", 15000L);
            this.g = jSONObject.optInt("ble_capacity", 10);
        }
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bff369b7289e9b99b012967d852ca33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bff369b7289e9b99b012967d852ca33");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.toString();
            a(jSONObject);
            editor.putString("ble_scan_config", this.b);
        }
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public long c() {
        return this.e;
    }

    public long d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }
}
