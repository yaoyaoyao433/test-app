package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class q {
    private static q a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String b;
    private boolean c;
    private final int d;
    private int e;

    public q(Context context) {
        SharedPreferences b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb332cd1486ee339d75dcdd87283da70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb332cd1486ee339d75dcdd87283da70");
            return;
        }
        this.c = false;
        this.d = 20;
        this.e = 20;
        if (context == null || context.getApplicationContext() == null || (b = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b);
    }

    public static q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78a9e7a51f2db24fb6dd331b3162e299", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78a9e7a51f2db24fb6dd331b3162e299");
        }
        if (a == null) {
            synchronized (q.class) {
                if (a == null) {
                    a = new q(context);
                }
            }
        }
        return a;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f52977537595f7a3ba1edbb80287d19f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f52977537595f7a3ba1edbb80287d19f");
            return;
        }
        this.b = sharedPreferences.getString("sensor_config", "");
        if ("".equals(this.b)) {
            return;
        }
        try {
            a(new JSONObject(this.b));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("new Sensor config json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a34d64da2e1c17da1141c14a95239888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a34d64da2e1c17da1141c14a95239888");
        } else if (jSONObject == null) {
        } else {
            try {
                this.b = jSONObject.toString();
                if (jSONObject.has("is_open_fusion_pressure")) {
                    this.c = jSONObject.optBoolean("is_open_fusion_pressure", false);
                }
                if (jSONObject.has("fusion_pressure_sensor_size")) {
                    this.e = jSONObject.optInt("fusion_pressure_sensor_size", 20);
                }
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("parse Sensor config exception:" + e.getMessage(), 3);
            }
        }
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65bb4f9ba71400c04ba310aa5198aa4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65bb4f9ba71400c04ba310aa5198aa4b");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.toString();
            editor.putString("sensor_config", this.b);
            a(jSONObject);
        }
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }
}
