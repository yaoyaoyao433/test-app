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
public class g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static g g;
    private int c;
    private int d;
    private int e;
    private String f;
    private static final String b = g.class.getSimpleName() + StringUtil.SPACE;
    public static int a = 5;

    public g(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d24c4726175b3e5e00d5062223037b86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d24c4726175b3e5e00d5062223037b86");
            return;
        }
        this.c = a;
        this.d = 15;
        this.e = 1;
        this.f = "";
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static g a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e19d6de079c793eb555481957c52f24", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e19d6de079c793eb555481957c52f24");
        }
        if (g == null) {
            synchronized (g.class) {
                if (g == null) {
                    g = new g(context);
                }
            }
        }
        return g;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad2d6eb91530c0fe941d26cfdcec4f38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad2d6eb91530c0fe941d26cfdcec4f38");
            return;
        }
        this.f = sharedPreferences.getString("fingerprint_config", "");
        if ("".equals(this.f)) {
            return;
        }
        try {
            a(new JSONObject(this.f));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("new fingerprint config json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "386e7da929a1f78fed0ef977c858a917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "386e7da929a1f78fed0ef977c858a917");
        } else if (jSONObject == null) {
        } else {
            try {
                if (jSONObject.has("fingerprint_cell_capacity")) {
                    this.e = jSONObject.optInt("fingerprint_cell_capacity", 1);
                }
                if (jSONObject.has("fingerprint_wifi_capacity")) {
                    this.d = jSONObject.optInt("fingerprint_wifi_capacity", 15);
                }
                if (jSONObject.has("fingerprint_ble_capacity")) {
                    this.c = jSONObject.optInt("fingerprint_ble_capacity", a);
                }
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("parse fingerprint config exception:" + e.getMessage(), 3);
            }
        }
    }

    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdb3d953a15e57984fb5fbac4b7ef9e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdb3d953a15e57984fb5fbac4b7ef9e1")).intValue();
        }
        LogUtils.a(b + " fingerprintBleCapacity : " + this.c);
        return this.c;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf1d71981ec9471ab3f53c659a84c9ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf1d71981ec9471ab3f53c659a84c9ca");
        } else if (jSONObject == null) {
        } else {
            this.f = jSONObject.toString();
            editor.putString("fingerprint_config", this.f);
            a(jSONObject);
        }
    }

    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fe67cfc9e53f02e80520cce5750077a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fe67cfc9e53f02e80520cce5750077a")).intValue();
        }
        LogUtils.a(b + " fingerprintWifiCapacity : " + this.d);
        return this.d;
    }

    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c8a6e932fa6ea0b3df0f52511647f85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c8a6e932fa6ea0b3df0f52511647f85")).intValue();
        }
        LogUtils.a(b + " fingerprintCellCapacity : " + this.e);
        return this.e;
    }
}
