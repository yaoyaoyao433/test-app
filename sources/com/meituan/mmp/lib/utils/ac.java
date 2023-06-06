package com.meituan.mmp.lib.utils;

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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac {
    public static ChangeQuickRedirect a;

    public static JSONObject a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f3a571c4215ae1ae4b67548e5ba9b89", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f3a571c4215ae1ae4b67548e5ba9b89");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.a(e);
        }
        return jSONObject;
    }

    public static JSONObject a(String str, Object obj, String str2, Object obj2) {
        Object[] objArr = {str, obj, str2, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8c03164e9ddbe0ea68f6ad8347f89c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8c03164e9ddbe0ea68f6ad8347f89c1");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.a(e);
        }
        return jSONObject;
    }

    public static int[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de373ac9a2402c46ad29b48a4b68c4ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de373ac9a2402c46ad29b48a4b68c4ea");
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length > 0) {
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = jSONArray.getInt(i);
                }
                return iArr;
            }
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.d("JsonUtil", String.format("parseViewIds(%s) exception, %s", str, e.getMessage()));
        }
        return new int[]{0};
    }

    @NonNull
    public static JSONObject a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cc066c99df8e7820b3d984f338311ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cc066c99df8e7820b3d984f338311ce");
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
            com.meituan.mmp.lib.trace.b.d("JsonUtil", String.format("parseToJson(Bundle) exception, %s", e));
        }
        return jSONObject;
    }

    @NonNull
    public static JSONObject a(@Nullable Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4192639d66aa39961e3d18654c3c1c5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4192639d66aa39961e3d18654c3c1c5f");
        }
        if (map == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(map);
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.d("JsonUtil", String.format("parseToJson(Map) exception, %s", e));
            return new JSONObject();
        }
    }

    @NonNull
    public static JSONObject b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f5280166f933d23422d1a0cdaf2f584", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f5280166f933d23422d1a0cdaf2f584");
        }
        if (TextUtils.isEmpty(str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.d("JsonUtil", String.format("parseToJson(String) exception, %s", e));
            return new JSONObject();
        }
    }

    @NonNull
    public static String b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "700b647a0cf050b925b525d13ec5a8fc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "700b647a0cf050b925b525d13ec5a8fc") : a(map).toString();
    }

    public static Map<String, Object> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3387eefe4afbeda3a6c224701c61725b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3387eefe4afbeda3a6c224701c61725b");
        }
        try {
            return a(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18040105c3a880dc6ea0556a4971273a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18040105c3a880dc6ea0556a4971273a");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> b(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8ab8ead28e7e375393f270d4411f988", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8ab8ead28e7e375393f270d4411f988");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = b((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static <T> Set<T> a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24a3c14e3a61bfcb01a289b4a0a60476", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24a3c14e3a61bfcb01a289b4a0a60476");
        }
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(jSONArray.get(i));
            } catch (ClassCastException e) {
                com.meituan.mmp.lib.trace.b.a("JsonUtil.toSimpleList", e);
            }
        }
        return hashSet;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb1fb345d697f9e5a7badbcc5393e6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb1fb345d697f9e5a7badbcc5393e6c");
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ce00274855c6f9750edc8cda510ea3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ce00274855c6f9750edc8cda510ea3") : a(str, String.valueOf(obj), obj instanceof String);
        }

        public final a a(String str, String str2, boolean z) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2cda7e5b83c235344761a26792e3d87", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2cda7e5b83c235344761a26792e3d87");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ecbe792fb3d9553431dee771103a30a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ecbe792fb3d9553431dee771103a30a");
            }
            if (this.d != null) {
                com.meituan.mmp.lib.trace.b.c("JsonUtil", "repeat build on a FastBuilder");
                return this.d;
            }
            this.b.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            this.d = this.b.toString();
            return this.d;
        }
    }
}
