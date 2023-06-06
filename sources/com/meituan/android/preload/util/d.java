package com.meituan.android.preload.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45c6102dddf943b5a32479ff91de089e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45c6102dddf943b5a32479ff91de089e")).booleanValue();
        }
        if (str == null) {
            return true;
        }
        return TextUtils.isEmpty(str.trim());
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3df415034b4ac111629bdf42f3756aa2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3df415034b4ac111629bdf42f3756aa2") : str == null ? "" : str.trim();
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc5398bd8ec64d1b70a0855d11576383", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc5398bd8ec64d1b70a0855d11576383")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return (Uri.EMPTY.equals(parse) || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getHost()) || TextUtils.isEmpty(parse.getPath())) ? false : true;
    }

    public static String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e15b6f0ce4d9971a3a1b43475035895f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e15b6f0ce4d9971a3a1b43475035895f");
        }
        if (a(str)) {
            return StringUtil.NULL;
        }
        Uri parse = Uri.parse(str);
        if (Uri.EMPTY.equals(parse)) {
            return StringUtil.NULL;
        }
        String scheme = parse.getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (str2.equals("el_page") && !a(queryParameter)) {
                    return queryParameter;
                }
            }
            return StringUtil.NULL;
        }
        return StringUtil.NULL;
    }

    public static String a(Map<String, String> map, String str, long j, long j2, String str2, String str3) {
        Object[] objArr = {map, str, new Long(j), new Long(j2), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82a1a0bff2d368bee0a8139ee9055fce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82a1a0bff2d368bee0a8139ee9055fce");
        }
        try {
            try {
                return "javascript:window.globalParam=" + a(map, j, j2, str2, str3) + ";" + e(str);
            } catch (Exception e) {
                Log.e("pweb/WebViewUtil", "getInjectPageParam, exception:" + e);
                return "";
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String a(Map<String, String> map, long j, long j2, String str, String str2) {
        Object[] objArr = {map, new Long(j), new Long(j2), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb545e885aec3c0f10c1fe85080e66d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb545e885aec3c0f10c1fe85080e66d8");
        }
        JsonObject jsonObject = new JsonObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    jsonObject.addProperty(key, value);
                }
            }
        }
        jsonObject.addProperty("debugMode", a.b ? "1" : "0");
        jsonObject.addProperty("t0", Long.valueOf(j));
        jsonObject.addProperty("ts", Long.valueOf(j2));
        jsonObject.addProperty("enlightVersion", "1.1");
        jsonObject.addProperty("enlightWebviewId", str);
        jsonObject.addProperty("prefixURL", str2);
        return jsonObject.toString();
    }

    private static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3e1f3e69540fc5844c40c2e6d2c156f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3e1f3e69540fc5844c40c2e6d2c156f");
        }
        JsonObject jsonObject = new JsonObject();
        if (TextUtils.isEmpty(str)) {
            return jsonObject.toString();
        }
        Uri parse = Uri.parse(str);
        if (Uri.EMPTY.equals(parse)) {
            return jsonObject.toString();
        }
        String str2 = "";
        for (String str3 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str3);
            if (TextUtils.equals(str3, "el_page")) {
                str2 = queryParameter;
            } else {
                jsonObject.addProperty(str3, queryParameter);
            }
        }
        if (str.contains("#")) {
            String substring = str.substring(str.indexOf("#") + 1);
            if (!TextUtils.isEmpty(substring)) {
                jsonObject.addProperty("el_hash", substring);
            }
        }
        return "window.loadPageParam=[\"" + str2 + "\"," + jsonObject.toString() + "];window.loadPage&&window.loadPage(window.loadPageParam[0], window.loadPageParam[1])";
    }
}
