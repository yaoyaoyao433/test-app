package com.meituan.msc.common.utils;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    public static JSONObject a(String str, Object obj, String str2, Object obj2) {
        Object[] objArr = {str, obj, str2, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "965dfccc6207c8d4f3a9648065a95126", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "965dfccc6207c8d4f3a9648065a95126");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a(e);
        }
        return jSONObject;
    }

    public static String[] a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52f20ef752b9b0cc805c2b77e5b04f85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52f20ef752b9b0cc805c2b77e5b04f85");
        }
        try {
            int length = jSONArray.length();
            if (length > 0) {
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                return strArr;
            }
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a("JsonUtil", String.format("parseStringArray(%s) exception, %s", jSONArray.toString(), e.getMessage()));
        }
        return new String[]{null};
    }

    @NonNull
    public static JSONObject a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6ea3a4727ca67a04efb08fca6fbf02e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6ea3a4727ca67a04efb08fca6fbf02e");
        }
        JSONObject jSONObject = new JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    if (obj instanceof String) {
                        jSONObject.put(str, obj);
                    }
                    if (obj instanceof Bundle) {
                        jSONObject.put(str, a((Bundle) obj));
                    } else {
                        Object wrap = JSONObject.wrap(obj);
                        if (wrap != null) {
                            jSONObject.put(str, wrap);
                        } else {
                            jSONObject.put(str, obj.toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a("JsonUtil", String.format("parseToJson(Bundle) exception, %s", e));
        }
        return jSONObject;
    }

    @NonNull
    public static JSONObject a(@Nullable Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6181e1ce01b60dbd351d5e304a9a4f79", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6181e1ce01b60dbd351d5e304a9a4f79");
        }
        if (map == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(map);
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a("JsonUtil", String.format("parseToJson(Map) exception, %s", e));
            return new JSONObject();
        }
    }

    @NonNull
    public static JSONObject a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db3a4c73e12f2b95c0ad5bf63cd1911e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db3a4c73e12f2b95c0ad5bf63cd1911e");
        }
        if (TextUtils.isEmpty(str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a("JsonUtil", String.format("parseToJson(String) exception, %s", e));
            return new JSONObject();
        }
    }

    @NonNull
    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07dbc5577f3303542869b3761a7942a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07dbc5577f3303542869b3761a7942a9");
        }
        try {
            return new JSONObject().put(str, str2).toString();
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a("JsonUtil", String.format("toJsonString(key,val) exception, %s", e));
            return new JSONObject().toString();
        }
    }

    @NonNull
    public static String b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64c1b2e02bf9b1c5d22fb13b1def4697", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64c1b2e02bf9b1c5d22fb13b1def4697") : a(map).toString();
    }

    public static Map<String, Object> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c44cda0122ed692c40e0f22271d6bf1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c44cda0122ed692c40e0f22271d6bf1c");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b90a75b99c354ce85da6df22047ab811", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b90a75b99c354ce85da6df22047ab811");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONArray) {
                opt = b((JSONArray) opt);
            } else if (opt instanceof JSONObject) {
                opt = a((JSONObject) opt);
            }
            hashMap.put(next, opt);
        }
        return hashMap;
    }

    private static List<Object> b(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec3860586d5b06ea93552951d5a3df4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec3860586d5b06ea93552951d5a3df4e");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONArray) {
                opt = b((JSONArray) opt);
            } else if (opt instanceof JSONObject) {
                opt = a((JSONObject) opt);
            }
            arrayList.add(opt);
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private final StringBuilder b;
        private boolean c;
        private String d;

        public a(String str) throws JSONException {
            boolean z = true;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63702b1dc585a07c468c9ca476b2917", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63702b1dc585a07c468c9ca476b2917");
            } else if (!str.endsWith(CommonConstant.Symbol.BIG_BRACKET_RIGHT)) {
                throw new JSONException("jsonObjectString is not end with '}'");
            } else {
                this.b = new StringBuilder(str.substring(0, str.length() - 1));
                this.c = (str.length() < 3 || !str.contains(CommonConstant.Symbol.COLON)) ? false : false;
            }
        }

        public final a a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91090ec8471a367c81c3cc3015d854da", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91090ec8471a367c81c3cc3015d854da") : a(str, String.valueOf(obj), obj instanceof String);
        }

        public final a a(String str, String str2, boolean z) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bb3fc6dab54d5b98fcbc056640c957", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bb3fc6dab54d5b98fcbc056640c957");
            }
            if (this.c) {
                this.b.append(CommonConstant.Symbol.COMMA);
            }
            StringBuilder sb = this.b;
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            sb.append(str);
            sb.append("\":");
            if (z) {
                this.b.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            }
            this.b.append(str2);
            if (z) {
                this.b.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            }
            this.c = true;
            return this;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3843d1ec673ae3b9d8e2974eb452f669", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3843d1ec673ae3b9d8e2974eb452f669");
            }
            if (this.d != null) {
                com.meituan.msc.modules.reporter.g.e("JsonUtil", "repeat build on a FastBuilder");
                return this.d;
            }
            this.b.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            this.d = this.b.toString();
            return this.d;
        }
    }
}
