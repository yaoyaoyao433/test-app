package com.sankuai.waimai.imbase.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c33c27ea56fc011a581d8742238cf0b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c33c27ea56fc011a581d8742238cf0b4")).booleanValue() : list == null || list.isEmpty();
    }

    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe1cda3971c80911debc2c2f1ad9e51b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe1cda3971c80911debc2c2f1ad9e51b");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static HashMap<String, String> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "396e9768aebc0ed70a4ca2145ecfaf26", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "396e9768aebc0ed70a4ca2145ecfaf26");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    hashMap.putAll(a((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    hashMap.put(next, obj.toString());
                } else {
                    hashMap.put(next, String.valueOf(obj));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    public static JSONObject a(Map<String, ? extends Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0212b54bba9a73a9747898d1579e2a22", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0212b54bba9a73a9747898d1579e2a22");
        }
        if (map == null) {
            return null;
        }
        try {
            return new JSONObject(map);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(Map<String, ? extends Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d63f20081d2cafb1f8b0528e74507813", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d63f20081d2cafb1f8b0528e74507813");
        }
        JSONObject a2 = a(map);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }
}
