package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class t {
    public static float a(float f) {
        float f2 = f % 360.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        return i >= 0 ? (i < 0 || f2 > 180.0f) ? (f2 % 180.0f) - 180.0f : f2 : (f2 <= -180.0f || f2 >= 0.0f) ? (f2 % 180.0f) + 180.0f : f2;
    }

    public static Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }

    private static List a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    @Nullable
    public static String a(@NonNull Map<String, Object> map, @NonNull String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj.toString();
    }

    @Nullable
    public static List<Map<String, Object>> a(@NonNull Map<String, Object> map) {
        Object obj = map.get("props");
        if (obj == null) {
            return null;
        }
        try {
            return (List) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static j b(@NonNull Map<String, Object> map, @NonNull String str) {
        JSONObject jSONObject;
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return j.a(null, (String) obj);
        }
        if (obj instanceof Map) {
            try {
                jSONObject = new JSONObject((Map) obj);
            } catch (Throwable th) {
                com.alibaba.android.bindingx.core.d.a("unexpected json parse error.", th);
                jSONObject = null;
            }
            if (jSONObject == null) {
                return j.a(null, null);
            }
            String optString = jSONObject.optString("origin", null);
            String optString2 = jSONObject.optString("transformed", null);
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2)) {
                return j.a(null, null);
            }
            return j.a(optString, optString2);
        }
        return null;
    }

    @SafeVarargs
    public static <E> HashSet<E> a(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static int a(@NonNull Context context, int i) {
        return (int) (context.getApplicationContext().getResources().getDisplayMetrics().density * i * 5.0f);
    }

    @Nullable
    public static Pair<Float, Float> a(@Nullable String str, @NonNull View view) {
        int indexOf;
        float width;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(32)) != -1) {
            int i = indexOf;
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            if (i < str.length() && str.charAt(i) != ' ') {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(i, str.length()).trim();
                float f = 0.0f;
                if ("left".equals(trim)) {
                    width = 0.0f;
                } else if ("right".equals(trim)) {
                    width = view.getWidth();
                } else {
                    "center".equals(trim);
                    width = view.getWidth() / 2;
                }
                if (!"top".equals(trim2)) {
                    if ("bottom".equals(trim2)) {
                        f = view.getHeight();
                    } else {
                        "center".equals(trim2);
                        f = view.getHeight() / 2;
                    }
                }
                return new Pair<>(Float.valueOf(width), Float.valueOf(f));
            }
        }
        return null;
    }
}
