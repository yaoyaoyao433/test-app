package com.meituan.android.mrn.module.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JSONObject a(String str, Throwable th, JSONObject jSONObject) {
        Object[] objArr = {str, th, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3711ed5487e8c46d562196abc28df6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3711ed5487e8c46d562196abc28df6a");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", "fail");
            if (jSONObject != null && jSONObject.opt("httpStatusCode") != null) {
                str = String.valueOf(jSONObject.opt("httpStatusCode"));
            }
            String message = th == null ? "request fail with unknown error" : th.getMessage();
            if (jSONObject != null && !TextUtils.isEmpty(jSONObject.optString("httpStatusMessage"))) {
                message = jSONObject.optString("httpStatusMessage");
            }
            jSONObject2.put("errorCode", str);
            jSONObject2.put("errMsg", message);
            jSONObject2.put("errorMsg", message);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "065eeeb14ff1176a1cbd9a6b1fb7384b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "065eeeb14ff1176a1cbd9a6b1fb7384b");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", "success");
            jSONObject2.put("data", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    public static JSONObject a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b645aa22ffd92be2460a02d67faf3fa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b645aa22ffd92be2460a02d67faf3fa4");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            jSONObject.put("data", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c804110457e0819bc237152224cf6096", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c804110457e0819bc237152224cf6096");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            jSONObject.put("data", new JSONObject(str));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bd0e361f4998dcbba1655936487dbac", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bd0e361f4998dcbba1655936487dbac");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            jSONObject.put("data", obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
