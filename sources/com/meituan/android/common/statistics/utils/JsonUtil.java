package com.meituan.android.common.statistics.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JsonUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static JSONObject mapToJSONObject(Map<String, ? extends Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e58030c3f83d6798dacb40611433c8c", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e58030c3f83d6798dacb40611433c8c");
        }
        if (map == null) {
            return null;
        }
        try {
            if (map instanceof HashMap) {
                map.remove(null);
            }
            return new JSONObject(map);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String[] mapToList(JSONArray jSONArray) {
        int i;
        Object obj;
        int i2 = 0;
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33365c06c9ccce5e7797567597b9cc7e", 6917529027641081856L)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33365c06c9ccce5e7797567597b9cc7e");
        }
        if (jSONArray == null) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        while (i2 < jSONArray.length()) {
            try {
                obj = jSONArray.get(i2);
            } catch (Throwable unused) {
            }
            if (obj instanceof String) {
                i = i2 + 1;
                try {
                    strArr[i2] = (String) obj;
                } catch (Throwable unused2) {
                }
                i2 = i + 1;
            }
            i = i2;
            i2 = i + 1;
        }
        return strArr;
    }

    public static String mapToJSONString(Map<String, ? extends Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3609d6790710f8ebb2e52fca6e212274", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3609d6790710f8ebb2e52fca6e212274");
        }
        JSONObject mapToJSONObject = mapToJSONObject(map);
        if (mapToJSONObject != null) {
            return mapToJSONObject.toString();
        }
        return null;
    }

    @Deprecated
    public static void copyJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba688b5e26c655fd4d46cb3ce7dd693c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba688b5e26c655fd4d46cb3ce7dd693c");
        } else if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
        } else {
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                } catch (Exception e) {
                    LogUtil.log("statistics", "JsonUtil - copyJSONObject:" + e.getMessage());
                    return;
                }
            }
        }
    }

    public static Map<String, Object> jsonObjectToMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be1a90a88ada45f6f5eba69eeb4e1eab", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be1a90a88ada45f6f5eba69eeb4e1eab");
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
            LogUtil.log("statistics", "JsonUtil - jsonObjectToMap:" + e.getMessage());
        }
        return hashMap;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b01d8d61c84caca807a3cc3502b7f7b8", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b01d8d61c84caca807a3cc3502b7f7b8");
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static Map<String, String> toValueStrMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a6a0b567009b8ed79c082b69ef27365", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a6a0b567009b8ed79c082b69ef27365");
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

    public static Map<String, JSONObject> toValueJsonObjectMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c545e253014b01592a0ab78fb06a2b0", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c545e253014b01592a0ab78fb06a2b0");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optJSONObject(next));
        }
        return hashMap;
    }

    public static List<Object> toList(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1273c2d1007c2f814ffd65a0b038ffe9", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1273c2d1007c2f814ffd65a0b038ffe9");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap<String, Object> convertToHashMap(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e3ec26a49c7d66e9ca4e7befc6ccc87", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e3ec26a49c7d66e9ca4e7befc6ccc87");
        }
        if (map == null) {
            return new HashMap<>();
        }
        if (map instanceof HashMap) {
            return (HashMap) map;
        }
        return new HashMap<>(map);
    }

    public static HashMap<String, Object> convertToHashMapAndPut(Map<String, Object> map, String str, Object obj) {
        Object[] objArr = {map, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ee098eca354ba7d2e9eb4b9d01b4c9a", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ee098eca354ba7d2e9eb4b9d01b4c9a");
        }
        HashMap<String, Object> convertToHashMap = convertToHashMap(map);
        convertToHashMap.put(str, obj);
        return convertToHashMap;
    }

    public static Map<String, Object> cloneMap(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d1fb13b40ac1465e855ab691b1db0e6", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d1fb13b40ac1465e855ab691b1db0e6");
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof HashMap) {
                    value = cloneMap((HashMap) value);
                }
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }
}
