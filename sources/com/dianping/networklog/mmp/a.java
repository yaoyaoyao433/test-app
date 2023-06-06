package com.dianping.networklog.mmp;

import com.dianping.networklog.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");

    public static JSONObject a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48ddcadcf617c7f2ab86aaf80b9c9f6f", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48ddcadcf617c7f2ab86aaf80b9c9f6f");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
        } catch (Throwable th) {
            c.a("invoke logan mmp method, err: " + th.getMessage(), 1);
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("mmp logan param is invalid!");
        }
        String optString = jSONObject.optString(Constants.JSNative.DATA_METHOD);
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if ("write".equals(optString)) {
            b(jSONObject3);
        } else if ("event".equals(optString)) {
            c(jSONObject3);
        } else if ("upload".equals(optString)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb73e9c133b7ef86ebca0b0f55e3f941", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb73e9c133b7ef86ebca0b0f55e3f941");
            } else if (NVLinker.isLinkerInit()) {
                c.a(new String[]{b.format(new Date(com.meituan.android.time.c.b()))}, NVLinker.getUnionID());
            }
        } else if ("flush".equals(optString)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5fe710842046d0986ea705ee6715a10b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5fe710842046d0986ea705ee6715a10b");
            } else {
                c.b();
            }
        } else {
            throw new IllegalArgumentException("mmp logan method is invalid!");
        }
        jSONObject2.put("ret", true);
        return jSONObject2;
    }

    private static void b(JSONObject jSONObject) {
        String[] strArr;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c6275a3039ea80ab506de804f12157f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c6275a3039ea80ab506de804f12157f");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("logTags");
        if (optJSONArray == null) {
            strArr = new String[]{jSONObject.optString("logTags")};
        } else {
            int length = optJSONArray.length();
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = optJSONArray.optString(i);
            }
            strArr = strArr2;
        }
        c.a(jSONObject.optString("logString"), jSONObject.optInt("logType"), strArr);
    }

    private static void c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0c0c8359370fe7bf2ccdb7e92696af2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0c0c8359370fe7bf2ccdb7e92696af2");
            return;
        }
        String optString = jSONObject.optString("logTag");
        String optString2 = jSONObject.optString("logDesc");
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("logDetails");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        c.a(optString, optString2, hashMap);
    }
}
