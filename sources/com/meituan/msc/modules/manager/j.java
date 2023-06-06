package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static Object[] a(a aVar, Method method, JSONArray jSONArray) {
        Object[] objArr = {aVar, method, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6d6cba0bd6345071e897be4255f39b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6d6cba0bd6345071e897be4255f39b0");
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length > jSONArray.length()) {
            throw new RuntimeException("The number of parameters does not match ！！" + method);
        }
        Object[] objArr2 = new Object[parameterTypes.length];
        int i = 0;
        int i2 = 0;
        while (i < parameterTypes.length && i2 < jSONArray.length()) {
            Class<?> cls = parameterTypes[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                objArr2[i] = Boolean.valueOf(jSONArray.optBoolean(i2));
            } else if (cls == Long.class || cls == Long.TYPE) {
                objArr2[i] = Long.valueOf(jSONArray.optLong(i2));
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                objArr2[i] = Integer.valueOf(jSONArray.optInt(i2));
            } else if (cls == Double.class || cls == Double.TYPE) {
                objArr2[i] = Double.valueOf(jSONArray.optDouble(i2));
            } else if (cls == Float.class || cls == Float.TYPE) {
                objArr2[i] = Float.valueOf((float) jSONArray.optDouble(i2));
            } else if (cls == String.class) {
                objArr2[i] = jSONArray.optString(i2);
            } else if (cls == b.class || b.class.isAssignableFrom(cls)) {
                if (jSONArray.isNull(i2)) {
                    objArr2[i] = null;
                } else {
                    objArr2[i] = new n(aVar, (int) jSONArray.optDouble(i2));
                }
            } else if (cls == d.class || d.class.isAssignableFrom(cls)) {
                com.facebook.infer.annotation.a.a(i == parameterTypes.length - 1, "Promise must be used as last parameter only");
                if (!jSONArray.isNull(i2)) {
                    int i3 = i2 + 1;
                    if (!jSONArray.isNull(i3)) {
                        objArr2[i] = new o(new n(aVar, (int) jSONArray.optDouble(i2)), new n(aVar, (int) jSONArray.optDouble(i3)));
                        i2++;
                    }
                }
                objArr2[i] = null;
                i2++;
            } else if (cls == JSONObject.class) {
                objArr2[i] = jSONArray.optJSONObject(i2);
            } else if (cls == JSONArray.class) {
                objArr2[i] = jSONArray.optJSONArray(i2);
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
            i++;
            i2++;
        }
        return objArr2;
    }
}
