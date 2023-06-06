package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class p {
    private static final String a = p.class.getSimpleName() + StringUtil.SPACE;
    private static p b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String c;
    private final int d;
    private int e;
    private final String f;
    private String g;

    public p(Context context) {
        SharedPreferences b2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7339d98f94cdf2a77feb1dad4bdb1f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7339d98f94cdf2a77feb1dad4bdb1f1");
            return;
        }
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = "";
        if (context == null || context.getApplicationContext() == null || (b2 = f.b(context.getApplicationContext())) == null) {
            return;
        }
        a(b2);
    }

    public static p a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a61acc8c215ae872924a7f7f45372698", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a61acc8c215ae872924a7f7f45372698");
        }
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    b = new p(context);
                }
            }
        }
        return b;
    }

    private void a(SharedPreferences sharedPreferences) {
        Object[] objArr = {sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adb542dcb69726896ba9af9357f570b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adb542dcb69726896ba9af9357f570b9");
            return;
        }
        this.c = sharedPreferences.getString("prevent_shaking_config", "");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62e14203f7130a28bdf599c744ccaf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62e14203f7130a28bdf599c744ccaf6");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.has("level")) {
                this.e = jSONObject.optInt("level");
            }
            if (jSONObject.has("bizkeys")) {
                this.g = jSONObject.optString("bizkeys");
            }
        }
    }

    public void a(JSONObject jSONObject, SharedPreferences.Editor editor) {
        Object[] objArr = {jSONObject, editor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b29dbd5ac436dff880093d2c5076a4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b29dbd5ac436dff880093d2c5076a4d");
        } else if (jSONObject == null) {
        } else {
            this.c = jSONObject.toString();
            a(jSONObject);
            editor.putString("prevent_shaking_config", this.c);
        }
    }

    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcc7fb6699847954b4626f187e1d3267", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcc7fb6699847954b4626f187e1d3267")).booleanValue();
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
}
