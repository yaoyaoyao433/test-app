package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class j {
    private static final String a = j.class.getSimpleName() + StringUtil.SPACE;
    private static j b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String c;
    private final int d;
    private int e;
    private final String f;
    private String g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private long l;
    private int m;
    private long n;
    private long o;
    private int p;
    private long q;

    public j(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b549efaf3aab9904742d9ce4542652e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b549efaf3aab9904742d9ce4542652e8");
            return;
        }
        this.c = "";
        this.d = 2;
        this.e = 2;
        this.f = "biz_qcsc";
        this.g = "biz_qcsc";
        this.h = true;
        this.i = LocationStrategy.LOCATION_TIMEOUT;
        this.j = 1;
        this.k = 3;
        this.l = 10000L;
        this.m = 6;
        this.n = 20000L;
        this.o = PayTask.j;
        this.p = 3;
        this.q = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static j a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3c3a9e84d7f8b6d52bc1224fcc47a21", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3c3a9e84d7f8b6d52bc1224fcc47a21");
        }
        if (b == null) {
            synchronized (j.class) {
                if (b == null) {
                    b = new j(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47a58b8069cf9964b3ab910be7d23e64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47a58b8069cf9964b3ab910be7d23e64");
            return;
        }
        this.c = sharedPreferences.getString("gps_reboot_config", "");
        if ("".equals(this.c)) {
            return;
        }
        try {
            a(new JSONObject(this.c));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("prevent shaking new json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0922e72ef8f3d62b6380770214f13a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0922e72ef8f3d62b6380770214f13a8");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.has("level")) {
                this.e = jSONObject.optInt("level");
            }
            if (jSONObject.has("bizkeys")) {
                this.g = jSONObject.optString("bizkeys");
            }
            if (jSONObject.has("gps_reboot_time")) {
                this.i = jSONObject.optLong("gps_reboot_time", LocationStrategy.LOCATION_TIMEOUT);
            }
            if (jSONObject.has("gps_first_reboot_multiple")) {
                this.k = jSONObject.optInt("gps_first_reboot_multiple", 3);
            }
            if (jSONObject.has("gps_first_reboot_min_time")) {
                this.l = jSONObject.optLong("gps_first_reboot_min_time", 10000L);
            }
            if (jSONObject.has("gps_reboot_multiple")) {
                this.m = jSONObject.optInt("gps_reboot_multiple", 6);
            }
            if (jSONObject.has("gps_reboot_min_time")) {
                this.n = jSONObject.optLong("gps_reboot_min_time", 20000L);
            }
            if (jSONObject.has("system_locator_start")) {
                this.o = jSONObject.optLong("system_locator_start", PayTask.j);
            }
            if (jSONObject.has("cumulative_times")) {
                this.p = jSONObject.optInt("cumulative_times", 3);
            }
            if (jSONObject.has("is_open_babel_upload")) {
                this.h = jSONObject.optBoolean("is_open_babel_upload", true);
            }
            if (jSONObject.has("gps_reboot_strategy")) {
                this.j = jSONObject.optInt("gps_reboot_strategy", 1);
            }
            if (jSONObject.has("gps_force_reboot_duration")) {
                this.q = jSONObject.optLong("gps_force_reboot_duration", ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }
    }

    public long a() {
        return this.i;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92859dfda0171d99a94088971d394f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92859dfda0171d99a94088971d394f5");
        } else if (jSONObject == null) {
        } else {
            this.c = jSONObject.toString();
            a(jSONObject);
            editor.putString("gps_reboot_config", this.c);
        }
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "573f16c17b53f9ee509e3a52ee6112e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "573f16c17b53f9ee509e3a52ee6112e2")).booleanValue();
        }
        if (this.e == 1 || this.e == 2) {
            if (this.e != 1) {
                return this.e == 2;
            } else if (TextUtils.isEmpty(this.g)) {
                return false;
            } else {
                String str2 = CommonConstant.Symbol.COMMA + this.g + CommonConstant.Symbol.COMMA;
                StringBuilder sb = new StringBuilder(CommonConstant.Symbol.COMMA);
                sb.append(str);
                sb.append(CommonConstant.Symbol.COMMA);
                return str2.contains(sb.toString());
            }
        }
        return false;
    }

    public int b() {
        return this.k;
    }

    public long c() {
        return this.l;
    }

    public int d() {
        return this.m;
    }

    public long e() {
        return this.n;
    }

    public long f() {
        return this.o;
    }

    public boolean g() {
        return this.h;
    }

    public int h() {
        return this.j;
    }

    public long i() {
        return this.q;
    }
}
