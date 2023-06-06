package com.meituan.android.common.weaver.interfaces.ffp;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String idOfObj(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e0f6dc08ddccefe98425e1d3e8e9679", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e0f6dc08ddccefe98425e1d3e8e9679");
        }
        return obj.getClass().getSimpleName() + "@" + System.identityHashCode(obj);
    }

    public static long currentTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74f46384aa10196ff35227dfa7a92979", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74f46384aa10196ff35227dfa7a92979")).longValue() : System.currentTimeMillis();
    }

    @NonNull
    public static <T> Map<String, T> json2Map(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6bf2e0f59382a418145db6a64bc265b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6bf2e0f59382a418145db6a64bc265b6");
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    @NonNull
    public static Set<String> array2Set(@Nullable JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8eb76676dc889797bdc44ee7a508cdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8eb76676dc889797bdc44ee7a508cdc");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(jSONArray.getString(i));
            } catch (JSONException unused) {
            }
        }
        return hashSet;
    }

    public static JSONObject map2Json(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e3501500a2b6aaeff75e5b836d59792", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e3501500a2b6aaeff75e5b836d59792");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static Handler newMainHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0a54716eff6684c89b763ea75213c8e", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0a54716eff6684c89b763ea75213c8e") : new Handler(Looper.getMainLooper());
    }
}
