package com.meituan.msc.jse.bridge;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ConversionUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static WeakReference<Gson> gsonCache;

    public static Object toObject(@Nullable ReadableMap readableMap, String str) {
        Object valueOf;
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f196eb76ae0f491223f9d972eddba89", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f196eb76ae0f491223f9d972eddba89");
        }
        if (readableMap == null) {
            return null;
        }
        switch (readableMap.getType(str)) {
            case Null:
                return null;
            case Boolean:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case Number:
                try {
                    double d = readableMap.getDouble(str);
                    int i = (int) d;
                    if (d == i) {
                        valueOf = Integer.valueOf(i);
                    } else {
                        long j = (long) d;
                        if (d == j) {
                            valueOf = Long.valueOf(j);
                        } else {
                            valueOf = Double.valueOf(d);
                        }
                    }
                    return valueOf;
                } catch (Exception unused) {
                    return Integer.valueOf(readableMap.getInt(str));
                }
            case String:
                return readableMap.getString(str);
            case Map:
                return toMap(readableMap.getMap(str));
            case Array:
                return toList(readableMap.getArray(str));
            default:
                throw new IllegalArgumentException("Could not convert object with key: " + str + CommonConstant.Symbol.DOT);
        }
    }

    public static Map<String, Object> toMap(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8c745827143d067ba231bcae4a87968", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8c745827143d067ba231bcae4a87968");
        }
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, toObject(readableMap, nextKey));
        }
        return hashMap;
    }

    public static List<Object> toList(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "135165a0172d5b3d587c64d5a2a5cf16", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "135165a0172d5b3d587c64d5a2a5cf16");
        }
        if (readableArray == null) {
            return null;
        }
        List<Object> arrayList = new ArrayList<>(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case Number:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    if (d == i2) {
                        arrayList.add(Integer.valueOf(i2));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case String:
                    arrayList.add(readableArray.getString(i));
                    break;
                case Map:
                    arrayList.add(toMap(readableArray.getMap(i)));
                    break;
                case Array:
                    arrayList = toList(readableArray.getArray(i));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with index: " + i + CommonConstant.Symbol.DOT);
            }
        }
        return arrayList;
    }

    public static WritableMap jsonToReact(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c07601ce24d3121fc86a3f457f70b199", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c07601ce24d3121fc86a3f457f70b199");
        }
        if (jSONObject == null) {
            return null;
        }
        WritableMap createMap = RNArguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(next, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(next, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, jsonToReact(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, jsonToReact(jSONObject.getJSONArray(next)));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, jSONObject.getBoolean(next));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    public static WritableArray jsonToReact(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ae0f780f072a9d572360f0c5909eb81", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ae0f780f072a9d572360f0c5909eb81");
        }
        if (jSONArray == null) {
            return null;
        }
        WritableArray createArray = RNArguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createArray.pushInt(((Integer) obj).intValue());
                } else {
                    createArray.pushDouble(((Number) obj).doubleValue());
                }
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(jsonToReact(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(jsonToReact(jSONArray.getJSONArray(i)));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static JSONObject fromBundle(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da8819770d8234320c1b2a6e1f4f16cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da8819770d8234320c1b2a6e1f4f16cb");
        }
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, wrap(bundle.get(str)));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object wrap(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11b824c2060543692ec8b8456c198785", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11b824c2060543692ec8b8456c198785");
        }
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return toJSONArray(obj);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    private static JSONArray toJSONArray(Object obj) throws JSONException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "634277a7ce526ced59704c2ee6df29f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "634277a7ce526ced59704c2ee6df29f5");
        }
        JSONArray jSONArray = new JSONArray();
        if (!obj.getClass().isArray()) {
            throw new JSONException("Not a primitive array: " + obj.getClass());
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            jSONArray.put(wrap(Array.get(obj, i)));
        }
        return jSONArray;
    }

    public static Map<String, Object> convertJSONToMap(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2c5f958b85cebcd7a9cefee5b046e53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2c5f958b85cebcd7a9cefee5b046e53");
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    hashMap.put(next, fromJson(jSONObject.get(next)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return hashMap;
    }

    private static Object fromJson(Object obj) throws JSONException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4724cf8faa2cbec3fc96f66c28d5bddc", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4724cf8faa2cbec3fc96f66c28d5bddc");
        }
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return convertJSONToMap((JSONObject) obj);
        }
        return obj instanceof JSONArray ? toList((JSONArray) obj) : obj;
    }

    private static List toList(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b6430bf47bdd176557a9bad85a05148c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b6430bf47bdd176557a9bad85a05148c");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(fromJson(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static Bundle mapToBundle(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97827e5cb8cb18b42b1aa486e78049b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97827e5cb8cb18b42b1aa486e78049b2");
        }
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Serializable) {
                bundle.putSerializable(entry.getKey(), (Serializable) value);
            }
        }
        return bundle;
    }

    public static Gson getGson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a9559786fd53b62ea8163c47a502e29", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a9559786fd53b62ea8163c47a502e29");
        }
        if (gsonCache == null || gsonCache.get() == null) {
            gsonCache = new WeakReference<>(new Gson());
        }
        return gsonCache.get();
    }

    public static String toJsonString(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc05f0f57a3774500cf35c97463a8b65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc05f0f57a3774500cf35c97463a8b65");
        }
        if (obj == null) {
            return null;
        }
        try {
            return getGson().toJson(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static <T> T fromJsonString(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1e575610f9e24de3684eb460de2b119", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1e575610f9e24de3684eb460de2b119");
        }
        if (str == null || cls == null) {
            return null;
        }
        try {
            return (T) getGson().fromJson(str, (Class<Object>) cls);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static JSONObject parseJsonString(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd58b8c0cd61fde5c9fbee8cc0364736", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd58b8c0cd61fde5c9fbee8cc0364736");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            int indexOf = str.indexOf(123);
            if (indexOf < 0) {
                throw e;
            }
            int lastIndexOf = str.lastIndexOf(125);
            if (lastIndexOf < 0) {
                throw e;
            }
            return new JSONObject(str.substring(indexOf, lastIndexOf + 1));
        }
    }

    public static Object cloneJSONValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4921a9bc249397938021258213461800", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4921a9bc249397938021258213461800");
        }
        if (obj == null) {
            return null;
        }
        if (obj == JSONObject.NULL) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONObject) {
            return cloneJSONObject((JSONObject) obj);
        }
        return obj instanceof JSONArray ? cloneJSONArray((JSONArray) obj) : obj;
    }

    public static JSONArray cloneJSONArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b3443bb3c75ee8e2f863aa0e63da689", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b3443bb3c75ee8e2f863aa0e63da689");
        }
        if (jSONArray == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(cloneJSONValue(jSONArray.get(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static JSONObject cloneJSONObject(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa7db648312f60d9d1fac68500a64139", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa7db648312f60d9d1fac68500a64139");
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, cloneJSONValue(jSONObject.get(next)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }
}
