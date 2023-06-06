package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class r {
    private static r a = null;
    private static long c = 30000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static long d = 30000;
    private String b;

    public r(Context context) {
        SharedPreferences b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7945e4b02d5291210d1cd66d8fad6fcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7945e4b02d5291210d1cd66d8fad6fcf");
        } else if (context == null || context.getApplicationContext() == null || (b = f.b(context.getApplicationContext())) == null) {
        } else {
            a(b);
        }
    }

    public static r a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2047cd08c6042c7d152b9e766b8a76cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2047cd08c6042c7d152b9e766b8a76cf");
        }
        if (a == null) {
            synchronized (r.class) {
                if (a == null) {
                    a = new r(context);
                }
            }
        }
        return a;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da5e51fb795c1621a2ea298cafad71e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da5e51fb795c1621a2ea298cafad71e4");
            return;
        }
        this.b = sharedPreferences.getString("strategy_config", "");
        if ("".equals(this.b)) {
            return;
        }
        try {
            a(new JSONObject(this.b));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("new Strategy config json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14fc5348b78ad5fae0ef659bf6591d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14fc5348b78ad5fae0ef659bf6591d59");
        } else if (jSONObject == null) {
        } else {
            try {
                this.b = jSONObject.toString();
                if (jSONObject.has("refresh_initial_time")) {
                    c = jSONObject.optLong("refresh_initial_time", 30000L);
                }
                if (jSONObject.has("newest_initial_time")) {
                    d = jSONObject.optLong("newest_initial_time", 30000L);
                }
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("parse Strategy config exception:" + e.getMessage(), 3);
            }
        }
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "634d230e30332a8c6c6b1da6de6dbf39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "634d230e30332a8c6c6b1da6de6dbf39");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.toString();
            editor.putString("strategy_config", this.b);
            a(jSONObject);
        }
    }
}
