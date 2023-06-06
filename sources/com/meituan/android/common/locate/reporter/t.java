package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class t {
    private static volatile t a = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String g = "biz_qcsc,biz_bike,biz_qcsc_nova";
    private static String h = "biz_qcsc,biz_bike,biz_qcsc_nova";
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private long f;

    public t(Context context) {
        SharedPreferences b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "179043b8db7b56e20855d382aa0c42b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "179043b8db7b56e20855d382aa0c42b0");
            return;
        }
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = DDLoadConstants.TIME_HOURS_MILLIS;
        if (context == null || context.getApplicationContext() == null || (b = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b);
    }

    public static t a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a4cf9f30768898d539e88bdfb544204", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a4cf9f30768898d539e88bdfb544204");
        }
        if (a == null) {
            synchronized (t.class) {
                if (a == null) {
                    a = new t(context);
                }
            }
        }
        return a;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "231992c599049840592099c8c885ee29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "231992c599049840592099c8c885ee29");
            return;
        }
        this.b = sharedPreferences.getString("user_session_config", "");
        if ("".equals(this.b)) {
            return;
        }
        try {
            a(new JSONObject(this.b));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("user session config new json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "371bbdc3f60c073a7ea52174e7ba864b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "371bbdc3f60c073a7ea52174e7ba864b");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.has("upload_user_session")) {
                this.c = jSONObject.optBoolean("upload_user_session", false);
            }
            if (jSONObject.has("user_session_cache_time")) {
                this.f = jSONObject.optLong("user_session_cache_time", DDLoadConstants.TIME_HOURS_MILLIS);
            }
            if (jSONObject.has("enforce_upload_gears_session")) {
                this.e = jSONObject.optBoolean("enforce_upload_gears_session", false);
            }
            if (jSONObject.has("is_open_motion_state")) {
                this.d = jSONObject.optBoolean("is_open_motion_state", false);
            }
            if (jSONObject.has("bizkeys")) {
                h = jSONObject.optString("bizkeys", g);
            }
        }
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25d8e6c142dc63ae0527d25b1c34b9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25d8e6c142dc63ae0527d25b1c34b9c6");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.toString();
            a(jSONObject);
            editor.putString("user_session_config", this.b);
        }
    }

    public boolean a() {
        return this.c;
    }

    public boolean a(Set<String> set) {
        Iterator it;
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf366011c6a1fdb564cd9a09f552b1c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf366011c6a1fdb564cd9a09f552b1c3")).booleanValue();
        }
        if (set == null || set.size() == 0 || TextUtils.isEmpty(h)) {
            return false;
        }
        String str = CommonConstant.Symbol.COMMA + h + CommonConstant.Symbol.COMMA;
        try {
            if (new HashSet(set).iterator().hasNext()) {
                return str.contains(CommonConstant.Symbol.COMMA + ((String) it.next()) + CommonConstant.Symbol.COMMA);
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("UserSessionConfig::" + e.getMessage(), 3);
        }
        return false;
    }

    public boolean b() {
        return this.d;
    }

    public long c() {
        return this.f;
    }

    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa3869d5a65e1771dda447eb8aa767ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa3869d5a65e1771dda447eb8aa767ac")).booleanValue() : this.e || com.meituan.android.common.locate.controller.f.a().d();
    }
}
