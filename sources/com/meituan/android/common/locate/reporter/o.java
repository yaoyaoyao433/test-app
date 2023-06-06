package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class o {
    private static final String a = o.class.getSimpleName() + StringUtil.SPACE;
    private static o b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long A;
    private final boolean B;
    private boolean C;
    private final boolean D;
    private boolean E;
    private String c;
    private final int d;
    private int e;
    private final String f;
    private String g;
    private final long h;
    private long i;
    private final long j;
    private long k;
    private final long l;
    private long m;
    private final long n;
    private long o;
    private final long p;
    private long q;
    private final long r;
    private long s;
    private final long t;
    private long u;
    private final long v;
    private long w;
    private final long x;
    private long y;
    private final long z;

    public o(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7f741c7120771b5d537d493e9a17d46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7f741c7120771b5d537d493e9a17d46");
            return;
        }
        this.c = "";
        this.d = 2;
        this.e = 2;
        this.f = "";
        this.g = "";
        this.h = 900000L;
        this.i = 900000L;
        this.j = 900000L;
        this.k = 900000L;
        this.l = 900000L;
        this.m = 900000L;
        this.n = 900000L;
        this.o = 900000L;
        this.p = 900000L;
        this.q = 900000L;
        this.r = 900000L;
        this.s = 900000L;
        this.t = 900000L;
        this.u = 900000L;
        this.v = 900000L;
        this.w = 900000L;
        this.x = 900000L;
        this.y = 900000L;
        this.z = 900000L;
        this.A = 900000L;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static o a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51de4aeabd3b5e5c0533f91373e1781a", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51de4aeabd3b5e5c0533f91373e1781a");
        }
        if (b == null) {
            synchronized (o.class) {
                if (b == null) {
                    b = new o(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd50add2254a5ccda4f5e746979ca49c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd50add2254a5ccda4f5e746979ca49c");
            return;
        }
        this.c = sharedPreferences.getString("manager_config", "");
        if ("".equals(this.c)) {
            return;
        }
        try {
            a(new JSONObject(this.c));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("manager new json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48be3c494090f21feb8cbb1d98b72365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48be3c494090f21feb8cbb1d98b72365");
            return;
        }
        if (jSONObject.has("level")) {
            this.e = jSONObject.optInt("level");
        }
        if (jSONObject.has("bizkey")) {
            this.g = jSONObject.optString("bizkey");
        }
        if (jSONObject.has("getCellLocation")) {
            this.i = jSONObject.optLong("getCellLocation");
        }
        if (jSONObject.has("getCellLocation")) {
            this.k = jSONObject.optLong("getServiceState");
        }
        if (jSONObject.has("getAllCellInfo")) {
            this.m = jSONObject.optLong("getAllCellInfo");
        }
        if (jSONObject.has("requestCellInfoUpdate")) {
            this.o = jSONObject.optLong("requestCellInfoUpdate");
        }
        if (jSONObject.has("getScanResults")) {
            this.q = jSONObject.optLong("getScanResults");
        }
        if (jSONObject.has("getConnectionInfo")) {
            this.s = jSONObject.optLong("getConnectionInfo");
        }
        if (jSONObject.has("getConfiguredNetworks")) {
            this.u = jSONObject.optLong("getConfiguredNetworks");
        }
        if (jSONObject.has("startScan")) {
            this.w = jSONObject.optLong("startScan");
        }
        if (jSONObject.has("getGpsStatus")) {
            this.y = jSONObject.optLong("getGpsStatus");
        }
        if (jSONObject.has("getLastKnownLocation")) {
            this.A = jSONObject.optLong("getLastKnownLocation");
        }
        if (jSONObject.has("system_permission_Control")) {
            this.C = jSONObject.optBoolean("system_permission_Control", true);
        }
        if (jSONObject.has("wifi_system_permission_control")) {
            this.E = jSONObject.optBoolean("wifi_system_permission_control", true);
        }
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4425bb31b3f62a23a790c89a89484eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4425bb31b3f62a23a790c89a89484eb");
        } else if (jSONObject == null) {
        } else {
            this.c = jSONObject.toString();
            a(jSONObject);
            editor.putString("manager_config", this.c);
        }
    }
}
