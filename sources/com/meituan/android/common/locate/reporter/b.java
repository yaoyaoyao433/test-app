package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private static final String a = b.class.getSimpleName() + StringUtil.SPACE;
    private static b b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private String g;

    public b(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "263d16f3ca160e8c3b876df86f9cdef9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "263d16f3ca160e8c3b876df86f9cdef9");
            return;
        }
        this.c = true;
        this.d = true;
        this.e = 3;
        this.f = 300;
        this.g = "";
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13f2d0951ff2e83f5315052b2e4f0016", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13f2d0951ff2e83f5315052b2e4f0016");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d26b2f2a7e0f9adf5fc8a0d4f018ed74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d26b2f2a7e0f9adf5fc8a0d4f018ed74");
            return;
        }
        this.g = sharedPreferences.getString("cache_config", "");
        if (!"".equals(this.g)) {
            try {
                a(new JSONObject(this.g));
                return;
            } catch (JSONException unused) {
                com.meituan.android.common.locate.platform.logs.c.a("cache config new json exception", 3);
                return;
            }
        }
        this.e = 3;
        this.f = 300;
        this.c = true;
        this.d = true;
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0732ad8f65bce5376db78702d90406eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0732ad8f65bce5376db78702d90406eb");
            return;
        }
        if (jSONObject.has("cache_min_wifi_num")) {
            try {
                this.e = jSONObject.getInt("cache_min_wifi_num");
            } catch (JSONException e) {
                this.e = 3;
                LogUtils.a(a + "cache_min_wifi_num exception" + e.getMessage());
            }
        }
        if (jSONObject.has("cache_max_wifi_accuracy")) {
            try {
                this.f = jSONObject.getInt("cache_max_wifi_accuracy");
            } catch (JSONException e2) {
                this.f = 300;
                LogUtils.a(a + "cache_max_wifi_accuracy exception" + e2.getMessage());
            }
        }
        if (jSONObject.has("increase_cell_key_config")) {
            try {
                this.c = jSONObject.getBoolean("increase_cell_key_config");
            } catch (JSONException e3) {
                this.c = true;
                LogUtils.a(a + "increase_cell_key_config exception" + e3.getMessage());
            }
        }
        if (jSONObject.has("increase_db_key_config")) {
            try {
                this.d = jSONObject.getBoolean("increase_db_key_config");
            } catch (JSONException e4) {
                this.d = true;
                LogUtils.a(a + "increase_db_key_config exception" + e4.getMessage());
            }
        }
    }

    public int a() {
        return this.e;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92cfc3f6217431cdbda07f7f849d7dfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92cfc3f6217431cdbda07f7f849d7dfa");
        } else if (jSONObject == null) {
        } else {
            this.g = jSONObject.toString();
            a(jSONObject);
            editor.putString("cache_config", this.g);
        }
    }

    public int b() {
        return this.f;
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92ace47ab6989a49dad2d277c8a928e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92ace47ab6989a49dad2d277c8a928e5")).booleanValue();
        }
        LogUtils.a("increase_db_key_config " + this.d);
        return this.d;
    }
}
