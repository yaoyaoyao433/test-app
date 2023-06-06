package com.meituan.android.common.locate.reporter;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Boolean g = Boolean.TRUE;
    public Boolean a;
    public int b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;

    /* loaded from: classes2.dex */
    public static final class a {
        private static final n a = new n();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public n() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35bdaeafb461374cffbea92a38ce701f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35bdaeafb461374cffbea92a38ce701f");
            return;
        }
        this.a = Boolean.FALSE;
        this.b = 15;
        this.c = Boolean.FALSE;
        this.d = Boolean.TRUE;
        this.e = Boolean.TRUE;
        this.f = g;
        LogUtils.a(" LogPointConfig resume");
        if (com.meituan.android.common.locate.provider.g.a() == null) {
            return;
        }
        SharedPreferences b = f.b();
        if (b == null) {
            str = "LogPointConfig sharedpreferces is null";
        } else {
            String string = b.getString("log_point_config", "");
            if (TextUtils.isEmpty(string)) {
                str = "LogPointConfig get config is empyt";
            } else {
                try {
                    a(new JSONObject(string));
                    return;
                } catch (JSONException unused) {
                    str = "LogPointConfig jsonobject failed";
                }
            }
        }
        LogUtils.a(str);
    }

    public static n a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18945fb754992a660ed3ff8fdf918552", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18945fb754992a660ed3ff8fdf918552") : a.a;
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "265c210f68183ef26c6f62dae498e0a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "265c210f68183ef26c6f62dae498e0a0");
        } else if (jSONObject == null) {
        } else {
            this.a = Boolean.valueOf(jSONObject.optBoolean("upload_point_latlong", false));
            this.b = jSONObject.optInt("upload_point_count", 15);
            this.c = Boolean.valueOf(jSONObject.optBoolean("drop_point_config", false));
            this.d = Boolean.valueOf(jSONObject.optBoolean("real_log_config", true));
            this.e = Boolean.valueOf(jSONObject.optBoolean("report_alarm_api", true));
            this.f = Boolean.valueOf(jSONObject.optBoolean("report_altitude", g.booleanValue()));
        }
    }
}
