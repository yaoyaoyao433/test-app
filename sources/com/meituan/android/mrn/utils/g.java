package com.meituan.android.mrn.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
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
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static WeakReference<Gson> b;

    public static Object a(@Nullable ReadableMap readableMap, String str) {
        Object valueOf;
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1c472fcd6405085fa98303516f1d0ad", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1c472fcd6405085fa98303516f1d0ad");
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
                return a(readableMap.getMap(str));
            case Array:
                return a(readableMap.getArray(str));
            default:
                throw new IllegalArgumentException("Could not convert object with key: " + str + CommonConstant.Symbol.DOT);
        }
    }

    public static Map<String, Object> a(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b9924594cf3c2503509d78276f83e8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b9924594cf3c2503509d78276f83e8f");
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
            hashMap.put(nextKey, a(readableMap, nextKey));
        }
        return hashMap;
    }

    public static List<Object> a(@Nullable ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05408fde5ca9bee3dfcb221111630f35", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05408fde5ca9bee3dfcb221111630f35");
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
                    arrayList.add(a(readableArray.getMap(i)));
                    break;
                case Array:
                    arrayList = a(readableArray.getArray(i));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with index: " + i + CommonConstant.Symbol.DOT);
            }
        }
        return arrayList;
    }

    public static WritableMap a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3ee8bf67b762717786853c431ec11bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3ee8bf67b762717786853c431ec11bb");
        }
        if (jSONObject == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
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
                createMap.putMap(next, a(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, a(jSONObject.getJSONArray(next)));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, jSONObject.getBoolean(next));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    public static WritableArray a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6331b247e2b011b20d1344f0ea42bf44", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6331b247e2b011b20d1344f0ea42bf44");
        }
        if (jSONArray == null) {
            return null;
        }
        WritableArray createArray = Arguments.createArray();
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
                createArray.pushMap(a(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(a(jSONArray.getJSONArray(i)));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static JSONObject a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4331db82878455c035b66b1d6500055d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4331db82878455c035b66b1d6500055d");
        }
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, b(bundle.get(str)));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0430345820d866c6f0bd70fc01ef5a06", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0430345820d866c6f0bd70fc01ef5a06");
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
            return c(obj);
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

    private static JSONArray c(Object obj) throws JSONException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ba73293a309534caad546e2f2ecff70", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ba73293a309534caad546e2f2ecff70");
        }
        JSONArray jSONArray = new JSONArray();
        if (!obj.getClass().isArray()) {
            throw new JSONException("Not a primitive array: " + obj.getClass());
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            jSONArray.put(b(Array.get(obj, i)));
        }
        return jSONArray;
    }

    public static Map<String, Object> b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94f45357dcb6f47ef90b109f1f8a1af5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94f45357dcb6f47ef90b109f1f8a1af5");
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
                    hashMap.put(next, d(jSONObject.get(next)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return hashMap;
    }

    private static Object d(Object obj) throws JSONException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a15a8add90c51e8e01a0317f20b4c1d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a15a8add90c51e8e01a0317f20b4c1d");
        }
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? b((JSONArray) obj) : obj;
    }

    private static List b(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10810ab9b9323870f2da8118c268d665", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10810ab9b9323870f2da8118c268d665");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(d(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static Bundle a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e83304d7a7b6894dc72a46290c1f453d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e83304d7a7b6894dc72a46290c1f453d");
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

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1494e7024c107b4424f17ba19561795", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1494e7024c107b4424f17ba19561795");
        }
        if (b == null || b.get() == null) {
            b = new WeakReference<>(new Gson());
        }
        return b.get();
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f54a03359d4114db4eb25e78a62ba27f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f54a03359d4114db4eb25e78a62ba27f");
        }
        if (obj == null) {
            return null;
        }
        try {
            return a().toJson(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426cf7c3d28b7bf275faf9560348cc7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426cf7c3d28b7bf275faf9560348cc7d");
        }
        if (str == null) {
            return null;
        }
        try {
            return (T) a().fromJson(str, (Class<Object>) cls);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static JSONObject a(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d34d2a352a28e4aefb297e39a7360a08", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d34d2a352a28e4aefb297e39a7360a08");
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

    private static Object e(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "151b11c1664c15e23b705dbd47f0c40d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "151b11c1664c15e23b705dbd47f0c40d");
        }
        if (obj == null) {
            return null;
        }
        if (obj == JSONObject.NULL) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONObject) {
            return c((JSONObject) obj);
        }
        return obj instanceof JSONArray ? c((JSONArray) obj) : obj;
    }

    private static JSONArray c(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61f4752182764c7a96755c577192bd10", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61f4752182764c7a96755c577192bd10");
        }
        if (jSONArray == null) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(e(jSONArray.get(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static JSONObject c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be11669808175a3b7dae835db793738d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be11669808175a3b7dae835db793738d");
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, e(jSONObject.get(next)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public static WritableMap b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14344085a52ca2796532d04867cd4b42", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14344085a52ca2796532d04867cd4b42");
        }
        WritableMap createMap = Arguments.createMap();
        if (readableMap != null) {
            createMap.merge(readableMap);
        }
        return createMap;
    }
}
