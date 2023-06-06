package com.sankuai.eh.component.service.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static JsonElement a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7625139f8477403d18a79beac3ef46b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7625139f8477403d18a79beac3ef46b5");
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return (JsonElement) c.a().fromJson(str, (Class<Object>) JsonElement.class);
            }
        } catch (Throwable unused) {
        }
        return JsonNull.INSTANCE;
    }

    public static String a(JsonElement jsonElement, String str) {
        Object[] objArr = {jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dad856339cd34e14cac5d982efe358f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dad856339cd34e14cac5d982efe358f") : b(c(jsonElement, str), "");
    }

    public static String a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbb7b7fb132d515c2ad1f724de890adf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbb7b7fb132d515c2ad1f724de890adf");
        }
        try {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(jsonElement);
        } catch (Exception unused) {
            return StringUtil.NULL;
        }
    }

    public static JsonElement a(JsonElement jsonElement, String str, JsonElement jsonElement2) {
        Object[] objArr = {jsonElement, str, jsonElement2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a2678dbb7d3c923d2e1dbf1c36e6103", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a2678dbb7d3c923d2e1dbf1c36e6103");
        }
        if (jsonElement != null && jsonElement.isJsonObject()) {
            jsonElement.getAsJsonObject().add(str, jsonElement2);
        }
        return jsonElement;
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11a7faf84c608a491cf4ca3300510e38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11a7faf84c608a491cf4ca3300510e38");
        }
        try {
            return c.a().toJson(obj);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Object obj, boolean z) {
        Object[] objArr = {obj, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fb873c2cd4c34a67ead0101e05ad2eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fb873c2cd4c34a67ead0101e05ad2eb");
        }
        try {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(obj);
        } catch (Exception unused) {
            return "";
        }
    }

    public static <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "010dcd717c4dee711cb62f1c797ae888", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "010dcd717c4dee711cb62f1c797ae888");
        }
        try {
            return (T) c.a().fromJson(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80c92856aad76aee29d9646651cfb6c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80c92856aad76aee29d9646651cfb6c8");
        }
        try {
            return (T) c.a().fromJson(str, (Class<Object>) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(JsonElement jsonElement, Type type) {
        Object[] objArr = {jsonElement, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ff44ff84c11a1d84c063285b6b98a97", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ff44ff84c11a1d84c063285b6b98a97");
        }
        try {
            return (T) c.a().fromJson(jsonElement, type);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean a(JsonElement jsonElement, boolean z) {
        Object[] objArr = {jsonElement, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25bca8caed8a1d53cdd6e256b67cca56", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25bca8caed8a1d53cdd6e256b67cca56") : (Boolean) a(jsonElement, Boolean.valueOf(z), 3);
    }

    public static int a(JsonElement jsonElement, int i) {
        Object[] objArr = {jsonElement, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d78523c580da6899963c197d1998ef55", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d78523c580da6899963c197d1998ef55")).intValue() : ((Integer) a(jsonElement, Integer.valueOf(i), 2)).intValue();
    }

    public static float a(JsonElement jsonElement, float f) {
        Object[] objArr = {jsonElement, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68945101ed1ab4edb359382c98df6ca1", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68945101ed1ab4edb359382c98df6ca1")).floatValue() : ((Float) a(jsonElement, Float.valueOf(f), 4)).floatValue();
    }

    public static String b(JsonElement jsonElement, String str) {
        Object[] objArr = {jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89497bc3e23cc1ad58f5fb42ec6d057c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89497bc3e23cc1ad58f5fb42ec6d057c") : (String) a(jsonElement, str, 1);
    }

    public static JsonArray b(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bee98ff0c9e28c775397529c5bd68d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bee98ff0c9e28c775397529c5bd68d5");
        }
        if (jsonElement != null && jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        return new JsonArray();
    }

    public static ArrayList<Integer> a(JsonArray jsonArray, int i) {
        Object[] objArr = {jsonArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35e57ade99982ea7a9280a5ff33bea2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35e57ade99982ea7a9280a5ff33bea2c");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (jsonArray == null || jsonArray.size() <= 0) {
            return arrayList;
        }
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(it.next(), i)));
        }
        return arrayList;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eeea477f790d0e0d54cc859c5b29c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eeea477f790d0e0d54cc859c5b29c43");
        } else if (jSONObject2 == null) {
        } else {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (Exception unused) {
            }
        }
    }

    public static Map<String, JsonElement> c(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "652ce8289d9ea625bf7e980f338fcced", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "652ce8289d9ea625bf7e980f338fcced");
        }
        HashMap hashMap = new HashMap();
        if (jsonElement != null && jsonElement.isJsonObject()) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static boolean a(JsonArray jsonArray, String str, boolean z) {
        String b;
        Object[] objArr = {jsonArray, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e74680050feaa93e07bbc32d1b2f1b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e74680050feaa93e07bbc32d1b2f1b2f")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || jsonArray == null || jsonArray.size() == 0) {
            return false;
        }
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (next.isJsonPrimitive()) {
                b = b(next, "");
            } else {
                b = next.isJsonObject() ? b(c(next, "path"), "") : null;
            }
            if (str.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public static JsonElement a(JsonElement jsonElement, String... strArr) {
        Object[] objArr = {jsonElement, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab4902b64a932304401953ae882d86ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab4902b64a932304401953ae882d86ae");
        }
        if (jsonElement == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            jsonElement = c(jsonElement, str);
            if (jsonElement == null) {
                return null;
            }
        }
        return jsonElement;
    }

    public static JsonElement c(JsonElement jsonElement, String str) {
        Object[] objArr = {jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d8b1319471c107b79c180f1b98d5a30", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d8b1319471c107b79c180f1b98d5a30");
        }
        if (jsonElement != null && jsonElement.isJsonObject()) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                if (entry.getKey().equals(str)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public static boolean d(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57c535dad7a0cde15cabcc9ff88222f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57c535dad7a0cde15cabcc9ff88222f0")).booleanValue() : a(c(jsonElement, "enabled"), true).booleanValue();
    }

    public static boolean e(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e244c59cab1ffc672ccde937e34a30b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e244c59cab1ffc672ccde937e34a30b3")).booleanValue() : a(c(jsonElement, "enabled"), false).booleanValue();
    }

    private static <T> T a(JsonElement jsonElement, T t, int i) {
        Object[] objArr = {jsonElement, t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6699cf818a23c210cc4fac0a38256c80", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6699cf818a23c210cc4fac0a38256c80");
        }
        if (jsonElement != null) {
            try {
                if (jsonElement.isJsonPrimitive()) {
                    switch (i) {
                        case 1:
                            return (T) jsonElement.getAsString();
                        case 2:
                            return (T) Integer.valueOf(jsonElement.getAsInt());
                        case 3:
                            return (T) Boolean.valueOf(jsonElement.getAsBoolean());
                        case 4:
                            return (T) Float.valueOf(jsonElement.getAsFloat());
                        case 5:
                            return (T) Long.valueOf(jsonElement.getAsLong());
                    }
                }
            } catch (Exception unused) {
                return t;
            }
        }
        return t;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class a {
            private static final Gson a = new Gson();
        }

        public static Gson a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6507ff2b9d09cf4ff3d1610e8d42d90f", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6507ff2b9d09cf4ff3d1610e8d42d90f") : a.a;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.service.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0551b {
        public static ChangeQuickRedirect a;
        public JSONObject b;

        public C0551b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52faeec12e365bd1687fb24bb29e935d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52faeec12e365bd1687fb24bb29e935d");
            } else {
                this.b = new JSONObject();
            }
        }

        public final C0551b a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddac6f0a1a4d3ebadaa5776113ab3a22", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0551b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddac6f0a1a4d3ebadaa5776113ab3a22");
            }
            try {
                this.b.put(str, obj);
            } catch (Exception unused) {
            }
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public JsonObject b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bce82df8e544602a841771244b95b60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bce82df8e544602a841771244b95b60");
            } else {
                this.b = new JsonObject();
            }
        }

        public a(JsonElement jsonElement) {
            Object[] objArr = {jsonElement};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942d68fc17f73a8100469f152deaa343", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942d68fc17f73a8100469f152deaa343");
            } else if (jsonElement instanceof Object) {
                this.b = (JsonObject) jsonElement;
            } else {
                this.b = new JsonObject();
            }
        }

        public final a a(String str, JsonElement jsonElement) {
            Object[] objArr = {str, jsonElement};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f1d8a0b0dbcf0b3dcdb3dfdb0ba904", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f1d8a0b0dbcf0b3dcdb3dfdb0ba904");
            }
            this.b.add(str, jsonElement);
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1783e556a5b7de7a7deb1c2decafa52", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1783e556a5b7de7a7deb1c2decafa52");
            }
            this.b.add(str, new JsonPrimitive(str2));
            return this;
        }

        public final a a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f10d482a17e38b1abc135c300c3c9c5c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f10d482a17e38b1abc135c300c3c9c5c");
            }
            this.b.add(str, new JsonPrimitive((Number) Long.valueOf(j)));
            return this;
        }

        public final a a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae570b15f93d31ba23fed2763413e8ac", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae570b15f93d31ba23fed2763413e8ac");
            }
            this.b.add(str, new JsonPrimitive(Boolean.valueOf(z)));
            return this;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e011895a5e0b9ff63f7451b5598745d0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e011895a5e0b9ff63f7451b5598745d0") : this.b.toString();
        }
    }
}
