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
public class i {
    private static final String a = i.class.getSimpleName() + StringUtil.SPACE;
    private static i b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String c;
    private long d;
    private boolean e;

    public i(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aea01b35d1782414c8b91d6496bfdcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aea01b35d1782414c8b91d6496bfdcf");
            return;
        }
        this.c = "";
        this.d = 6000L;
        this.e = false;
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static i a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18e7c0cbcf73ddb0b40b81decc1132e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18e7c0cbcf73ddb0b40b81decc1132e5");
        }
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d274544e23dccec22b1a0b4ac81f1289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d274544e23dccec22b1a0b4ac81f1289");
            return;
        }
        this.c = sharedPreferences.getString("geo_coder_config", "");
        if ("".equals(this.c)) {
            return;
        }
        try {
            a(new JSONObject(this.c));
        } catch (JSONException unused) {
            com.meituan.android.common.locate.platform.logs.c.a("prevent geo_coder_config new json exception", 3);
        }
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cac7621b1a44e61617b63a99028b6737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cac7621b1a44e61617b63a99028b6737");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.has("geo_coder_timeout")) {
                this.d = jSONObject.optLong("geo_coder_timeout");
            }
            if (jSONObject.has("is_open_geo_coder_timeout")) {
                this.e = jSONObject.optBoolean("is_open_geo_coder_timeout");
            }
        }
    }

    public long a() {
        return this.d;
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aed90dd15197ff245cbfc34200b7d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aed90dd15197ff245cbfc34200b7d07");
        } else if (jSONObject == null) {
        } else {
            this.c = jSONObject.toString();
            a(jSONObject);
            editor.putString("geo_coder_config", this.c);
        }
    }

    public boolean b() {
        return this.e;
    }
}
