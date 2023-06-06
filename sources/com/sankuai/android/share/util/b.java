package com.sankuai.android.share.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final Gson b = new Gson();
    private static final Object c = new Object();

    public static JsonObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6cdb5be1ede6b7707d9ee33e8dade8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6cdb5be1ede6b7707d9ee33e8dade8c");
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

    public static JsonArray b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f66f20067803e58d2186ce029fdb937", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f66f20067803e58d2186ce029fdb937");
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

    private static Object d(Object obj, String str) {
        String substring;
        Object obj2;
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        JsonElement jsonElement = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63dbfeaec0810a1d09d495ab205faad1", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63dbfeaec0810a1d09d495ab205faad1");
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
            obj2 = ((JSONArray) obj).get(Integer.parseInt(str));
        } else {
            if (obj instanceof JsonArray) {
                jsonElement = ((JsonArray) obj).get(Integer.parseInt(str));
            }
            obj2 = jsonElement;
        }
        return (obj2 == null || substring == null) ? obj2 : d(obj2, substring);
    }

    public static String a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c55da8d25c207d06c1e5dba01c0245fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c55da8d25c207d06c1e5dba01c0245fa");
        }
        Object d = d(obj, str);
        if (d == null) {
            return null;
        }
        if (d instanceof String) {
            return (String) d;
        }
        if (d instanceof JsonPrimitive) {
            return ((JsonPrimitive) d).getAsString();
        }
        if (d instanceof JsonNull) {
            return null;
        }
        return String.valueOf(d);
    }

    public static boolean a(Object obj, String str, boolean z) {
        Object[] objArr = {obj, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a6cc193bcf0943364566b57cb442fb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a6cc193bcf0943364566b57cb442fb4")).booleanValue();
        }
        Object d = d(obj, str);
        if (d == null) {
            return true;
        }
        if (d instanceof Boolean) {
            return ((Boolean) d).booleanValue();
        }
        if (d instanceof String) {
            String str2 = (String) d;
            if ("true".equalsIgnoreCase(str2)) {
                return true;
            }
            return ("false".equalsIgnoreCase(str2) || "0".equalsIgnoreCase(str2) || str2.length() == 0) ? false : true;
        } else if (d instanceof Number) {
            return ((Number) d).intValue() != 0;
        } else {
            if (d instanceof JsonPrimitive) {
                try {
                    return ((JsonPrimitive) d).getAsBoolean();
                } catch (Exception unused) {
                }
            }
            return true;
        }
    }

    public static JsonObject b(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "959ea9751bb243f7b2956bb82a9f8a0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "959ea9751bb243f7b2956bb82a9f8a0a");
        }
        Object d = d(obj, str);
        if (d instanceof JsonObject) {
            return (JsonObject) d;
        }
        return null;
    }

    public static JsonArray c(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32b5f30b81089d5ff709b5b92e3053e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32b5f30b81089d5ff709b5b92e3053e9");
        }
        Object d = d(obj, str);
        if (d instanceof JsonArray) {
            return (JsonArray) d;
        }
        return null;
    }
}
