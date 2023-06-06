package com.meituan.mmp.lib.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ao {
    public static ChangeQuickRedirect a;

    public static String a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f7607932ff07ad9050951887ae37fc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f7607932ff07ad9050951887ae37fc2");
        }
        if (!URLUtil.isNetworkUrl(str) || map == null || map.size() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (TextUtils.isEmpty(parse.getQueryParameter(entry.getKey()))) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8320b93b15c212cc57bfe6d2ea33b79e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8320b93b15c212cc57bfe6d2ea33b79e");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }
}
