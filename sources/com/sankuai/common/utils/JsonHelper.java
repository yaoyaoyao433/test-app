package com.sankuai.common.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JsonHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final Gson gson = new Gson();
    private static final Object lockObj = new Object();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface MapProvider {
        Map<String, Object> createMap();
    }

    public static String toJsonString(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8da0f4a05d6a9af9621b25df0f755c3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8da0f4a05d6a9af9621b25df0f755c3") : gson.toJson(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e4438aca2a07a2ed61b7838592f423a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e4438aca2a07a2ed61b7838592f423a");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) gson.fromJson(str, (Class<Object>) cls);
    }

    public static <T> T fromJson(JsonElement jsonElement, Class<T> cls) {
        Object[] objArr = {jsonElement, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06c611955c7dc0e0d98cb598cf9e5405", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06c611955c7dc0e0d98cb598cf9e5405");
        }
        if (jsonElement == null) {
            return null;
        }
        try {
            return (T) gson.fromJson(jsonElement, (Class<Object>) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T fromJson(JsonElement jsonElement, Type type) {
        Object[] objArr = {jsonElement, type};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83f7d62201fa5a77418fabceff19349a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83f7d62201fa5a77418fabceff19349a");
        }
        try {
            return (T) gson.fromJson(jsonElement, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T fromJsonString(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef6a552dd5ce51b644d5196b9a670c89", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef6a552dd5ce51b644d5196b9a670c89") : (T) gson.fromJson(str, (Class<Object>) cls);
    }

    public static Map<String, Object> toMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c499ab0dbb36c259afd2fedbb83d547", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c499ab0dbb36c259afd2fedbb83d547");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (Map) gson.fromJson(str, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.common.utils.JsonHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, Object> jsonObjectToMap(JSONObject jSONObject) {
        MapProvider mapProvider;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f27891be14807362410ab2e0899d365", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f27891be14807362410ab2e0899d365");
        }
        mapProvider = JsonHelper$$Lambda$1.instance;
        return jsonObjectToMap(jSONObject, mapProvider);
    }

    public static Map<String, Object> jsonObjectToMap(JSONObject jSONObject, MapProvider mapProvider) {
        JSONArray names;
        Object[] objArr = {jSONObject, mapProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25292b1f4ad754f55cbc4e01303c55e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25292b1f4ad754f55cbc4e01303c55e5");
        }
        if (jSONObject == null || (names = jSONObject.names()) == null) {
            return null;
        }
        Map<String, Object> createMap = mapProvider.createMap();
        int length = names.length();
        for (int i = 0; i < length; i++) {
            try {
                String string = names.getString(i);
                createMap.put(string, jSONObject.get(string));
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    public static JSONObject toJSONObject(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "010266a0496c07743766c7d66ee7f49d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "010266a0496c07743766c7d66ee7f49d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject toJSONObject(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3fb459d5ca4a1a324064d0e7ddffd04", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3fb459d5ca4a1a324064d0e7ddffd04");
        }
        if (jsonObject == null) {
            return null;
        }
        try {
            return new JSONObject(gson.toJson((JsonElement) jsonObject));
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonObject toJsonObject(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01cb174c09c34e6ddb6fa1bcd75120f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01cb174c09c34e6ddb6fa1bcd75120f9");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JsonParser().parse(str).getAsJsonObject();
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonObject toJsonObject(JsonReader jsonReader) {
        Object[] objArr = {jsonReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c435546fd9cb5e16e3b26c7b36def092", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c435546fd9cb5e16e3b26c7b36def092");
        }
        if (jsonReader == null) {
            return null;
        }
        try {
            return new JsonParser().parse(jsonReader).getAsJsonObject();
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONArray toJSONArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4186795c4664310f3ebc826527752175", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4186795c4664310f3ebc826527752175");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONArray toJSONArray(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e066574735be5eb45c8ea244ebfde90", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e066574735be5eb45c8ea244ebfde90");
        }
        if (jsonArray == null) {
            return null;
        }
        try {
            return new JSONArray(gson.toJson((JsonElement) jsonArray));
        } catch (Exception unused) {
            return null;
        }
    }

    public static JsonArray toJsonArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fdc41e5f9fe015fef414a4126812cde5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fdc41e5f9fe015fef414a4126812cde5");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JsonParser().parse(str).getAsJsonArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object get(Object obj, String str) {
        String substring;
        Object obj2;
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        JsonElement jsonElement = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5661fee3c4695124d66eaa465658595", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5661fee3c4695124d66eaa465658595");
        }
        if (obj == null || str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            substring = null;
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = str.substring(indexOf + 1);
            str = substring2;
        }
        if (obj instanceof JSONObject) {
            if (!((JSONObject) obj).has(str)) {
                return null;
            }
            obj2 = ((JSONObject) obj).get(str);
        } else if (obj instanceof JsonObject) {
            if (!((JsonObject) obj).has(str)) {
                return null;
            }
            obj2 = ((JsonObject) obj).get(str);
        } else if (obj instanceof JSONArray) {
            int parseInt = Integer.parseInt(str);
            JSONArray jSONArray = (JSONArray) obj;
            if (parseInt >= 0 && parseInt < jSONArray.length()) {
                obj2 = jSONArray.get(parseInt);
            }
            return null;
        } else {
            if (obj instanceof JsonArray) {
                int parseInt2 = Integer.parseInt(str);
                JsonArray jsonArray = (JsonArray) obj;
                if (parseInt2 >= 0 && parseInt2 < jsonArray.size()) {
                    jsonElement = jsonArray.get(parseInt2);
                }
                return null;
            }
            obj2 = jsonElement;
        }
        return (obj2 == null || substring == null) ? obj2 : get(obj2, substring);
    }

    public static String getString(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a36f0f620b37c9f46fd1638dc2be8f00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a36f0f620b37c9f46fd1638dc2be8f00");
        }
        Object obj2 = get(obj, str);
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof JsonPrimitive) {
            return ((JsonPrimitive) obj2).getAsString();
        }
        if (obj2 instanceof JsonNull) {
            return null;
        }
        return String.valueOf(obj2);
    }

    public static int getInt(Object obj, String str, int i) {
        Object[] objArr = {obj, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60aa0399a95e3cc7cfefb9435916ca35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60aa0399a95e3cc7cfefb9435916ca35")).intValue();
        }
        Object obj2 = get(obj, str);
        if (obj2 == null) {
            return i;
        }
        if (obj2 instanceof Integer) {
            return ((Integer) obj2).intValue();
        }
        if (obj2 instanceof Number) {
            return ((Number) obj2).intValue();
        }
        if (obj2 instanceof String) {
            try {
                return Integer.parseInt((String) obj2);
            } catch (NumberFormatException | Exception unused) {
            }
        } else if (obj2 instanceof JsonPrimitive) {
            return ((JsonPrimitive) obj2).getAsInt();
        }
        return i;
    }

    public static long getLong(Object obj, String str, long j) {
        Object[] objArr = {obj, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "728077fd6904997957c9eae15e1c3101", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "728077fd6904997957c9eae15e1c3101")).longValue();
        }
        Object obj2 = get(obj, str);
        if (obj2 == null) {
            return j;
        }
        if (obj2 instanceof Long) {
            return ((Long) obj2).longValue();
        }
        if (obj2 instanceof Number) {
            return ((Number) obj2).longValue();
        }
        if (obj2 instanceof String) {
            try {
                return Long.parseLong((String) obj2);
            } catch (NumberFormatException | Exception unused) {
            }
        } else if (obj2 instanceof JsonPrimitive) {
            return ((JsonPrimitive) obj2).getAsLong();
        }
        return j;
    }

    public static double getDouble(Object obj, String str, double d) {
        Object[] objArr = {obj, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54c94f1c69f47e36a38000b9c6d1a2e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54c94f1c69f47e36a38000b9c6d1a2e0")).doubleValue();
        }
        Object obj2 = get(obj, str);
        if (obj2 == null) {
            return d;
        }
        if (obj2 instanceof Double) {
            return ((Double) obj2).doubleValue();
        }
        if (obj2 instanceof Number) {
            return ((Number) obj2).doubleValue();
        }
        if (obj2 instanceof String) {
            try {
                return Double.parseDouble((String) obj2);
            } catch (NumberFormatException | Exception unused) {
            }
        } else if (obj2 instanceof JsonPrimitive) {
            return ((JsonPrimitive) obj2).getAsDouble();
        }
        return d;
    }

    public static float getFloat(Object obj, String str, float f) {
        Object[] objArr = {obj, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f8d3c808bf34bd0cbe7b2c5cb3801d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f8d3c808bf34bd0cbe7b2c5cb3801d7")).floatValue();
        }
        Object obj2 = get(obj, str);
        if (obj2 == null) {
            return f;
        }
        if (obj2 instanceof Float) {
            return ((Float) obj2).floatValue();
        }
        if (obj2 instanceof Number) {
            return ((Number) obj2).floatValue();
        }
        if (obj2 instanceof String) {
            try {
                return Float.parseFloat((String) obj2);
            } catch (NumberFormatException | Exception unused) {
            }
        } else if (obj2 instanceof JsonPrimitive) {
            return ((JsonPrimitive) obj2).getAsFloat();
        }
        return f;
    }

    public static boolean getBoolean(Object obj, String str, boolean z) {
        Object[] objArr = {obj, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de0abbfdd8131ef8ad179d1a8f31a9a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de0abbfdd8131ef8ad179d1a8f31a9a4")).booleanValue();
        }
        Object obj2 = get(obj, str);
        if (obj2 == null) {
            return z;
        }
        if (obj2 instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        }
        if (obj2 instanceof String) {
            String str2 = (String) obj2;
            if ("true".equalsIgnoreCase(str2)) {
                return true;
            }
            return ("false".equalsIgnoreCase(str2) || "0".equalsIgnoreCase(str2) || str2.length() == 0) ? false : true;
        } else if (obj2 instanceof Number) {
            return ((Number) obj2).intValue() != 0;
        } else {
            if (obj2 instanceof JsonPrimitive) {
                try {
                    return ((JsonPrimitive) obj2).getAsBoolean();
                } catch (Exception unused) {
                }
            }
            return z;
        }
    }

    public static JSONObject getJSONObject(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cc9ec4db6b143435f7c843b2ed15e2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cc9ec4db6b143435f7c843b2ed15e2f");
        }
        Object obj2 = get(obj, str);
        if (obj2 instanceof JSONObject) {
            return (JSONObject) obj2;
        }
        return null;
    }

    public static JsonObject getJsonObject(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32b6de742cb33efa01ce6da4c5d94cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32b6de742cb33efa01ce6da4c5d94cc9");
        }
        Object obj2 = get(obj, str);
        if (obj2 instanceof JsonObject) {
            return (JsonObject) obj2;
        }
        return null;
    }

    public static JSONArray getJSONArray(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "746d2d26260eb55678ba6eaf000397af", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "746d2d26260eb55678ba6eaf000397af");
        }
        Object obj2 = get(obj, str);
        if (obj2 instanceof JSONArray) {
            return (JSONArray) obj2;
        }
        return null;
    }

    public static JsonArray getJsonArray(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4020ca06acbb85ac8cefb9ad9e8ae05e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4020ca06acbb85ac8cefb9ad9e8ae05e");
        }
        Object obj2 = get(obj, str);
        if (obj2 instanceof JsonArray) {
            return (JsonArray) obj2;
        }
        return null;
    }

    public static JSONObject put(JSONObject jSONObject, String str, boolean z) {
        Object[] objArr = {jSONObject, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2e9a3556da3fe412d00715925f2aa39", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2e9a3556da3fe412d00715925f2aa39");
        }
        try {
            jSONObject.put(str, z);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject put(JSONObject jSONObject, String str, int i) {
        Object[] objArr = {jSONObject, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e14ed858ea4fe8ef5cf5655ef83a524b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e14ed858ea4fe8ef5cf5655ef83a524b");
        }
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject put(JSONObject jSONObject, String str, long j) {
        Object[] objArr = {jSONObject, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d157a5c3befbedcccce758835a5d9505", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d157a5c3befbedcccce758835a5d9505");
        }
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject put(JSONObject jSONObject, String str, double d) {
        Object[] objArr = {jSONObject, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41796593416c7afeab18e4e46b2061bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41796593416c7afeab18e4e46b2061bc");
        }
        try {
            jSONObject.put(str, d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject put(JSONObject jSONObject, String str, Object obj) {
        Object[] objArr = {jSONObject, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aebd37a44212c56906c22ed70bddfe33", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aebd37a44212c56906c22ed70bddfe33");
        }
        try {
            jSONObject.put(str, obj);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONArray put(JSONArray jSONArray, boolean z) {
        Object[] objArr = {jSONArray, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b71b530f8b1af337cbcd843d356661a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b71b530f8b1af337cbcd843d356661a");
        }
        try {
            jSONArray.put(z);
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static JSONArray put(JSONArray jSONArray, int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f093fd930dc95b2c34b6cb90030d886", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f093fd930dc95b2c34b6cb90030d886");
        }
        try {
            jSONArray.put(i);
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static JSONArray put(JSONArray jSONArray, long j) {
        Object[] objArr = {jSONArray, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5179f3fe4a5d19c3d2d845e081e6fce", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5179f3fe4a5d19c3d2d845e081e6fce");
        }
        try {
            jSONArray.put(j);
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static JSONArray put(JSONArray jSONArray, double d) {
        Object[] objArr = {jSONArray, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e7542cca3d431710387a7168445dc6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e7542cca3d431710387a7168445dc6b");
        }
        try {
            jSONArray.put(d);
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static JSONArray put(JSONArray jSONArray, Object obj) {
        Object[] objArr = {jSONArray, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5014d89adc24f260c79d0c8a8671e41e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5014d89adc24f260c79d0c8a8671e41e");
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static JsonArray insert(JsonArray jsonArray, int i, JsonElement jsonElement) {
        Object[] objArr = {jsonArray, Integer.valueOf(i), jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9005a321e41f7e1a7e7320f74dd590d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9005a321e41f7e1a7e7320f74dd590d");
        }
        if (jsonArray == null || i < 0) {
            return jsonArray;
        }
        if (jsonArray.size() > i) {
            JsonArray jsonArray2 = new JsonArray();
            for (int i2 = 0; i2 <= jsonArray.size(); i2++) {
                if (i2 < i) {
                    jsonArray2.add(jsonArray.get(i2));
                } else if (i2 == i) {
                    jsonArray2.add(jsonElement);
                } else {
                    jsonArray2.add(jsonArray.get(i2 - 1));
                }
            }
            return jsonArray2;
        }
        jsonArray.add(jsonElement);
        return jsonArray;
    }

    @Nullable
    public static JSONObject copyJSONObject(@Nullable JSONObject jSONObject) {
        String jSONObject2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "624adafa9b4d574fb21b871601eb67b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "624adafa9b4d574fb21b871601eb67b6");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            synchronized (lockObj) {
                jSONObject2 = jSONObject.toString();
            }
            if (TextUtils.isEmpty(jSONObject2)) {
                return new JSONObject("");
            }
            return new JSONObject(jSONObject2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean isEmpty(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "737b1971ff5d416b9607b0117cdb1b59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "737b1971ff5d416b9607b0117cdb1b59")).booleanValue() : jsonArray == null || jsonArray.size() == 0;
    }
}
