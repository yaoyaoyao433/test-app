package com.meituan.msi.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w {
    public static ChangeQuickRedirect a;
    public static final HashSet<String> b = new HashSet<>(Arrays.asList("ascii", "base64", "binary", "hex", "ucs2", "ucs-2", "utf16le", "utf-16le", "utf-8", "utf8", "latin1"));
    private static final Gson c = new GsonBuilder().serializeNulls().create();

    public static synchronized String a(Object obj) {
        synchronized (w.class) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c70dddb0fb714ac74a33cfa7d165683b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c70dddb0fb714ac74a33cfa7d165683b");
            }
            return c.toJson(obj);
        }
    }

    public static <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd526e0d9c16b23fb4141d88b8a5cab3", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd526e0d9c16b23fb4141d88b8a5cab3") : (T) c.fromJson(str, type);
    }

    public static <T> a<T> a(JSONObject jSONObject, Class<T> cls) {
        Object[] objArr = {jSONObject, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1d6b2732f4b49df9556006eb141a154", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1d6b2732f4b49df9556006eb141a154");
        }
        StringBuilder sb = new StringBuilder("MSIView Parse ");
        sb.append(jSONObject);
        sb.append(" the Type: ");
        sb.append(cls != null ? cls.getName() : "");
        com.meituan.msi.log.a.a(sb.toString());
        if (jSONObject.getClass() == cls) {
            return new a<>(jSONObject, null);
        }
        if (cls == Void.class) {
            return new a<>("", null);
        }
        if (jSONObject == null) {
            return new a<>(null, "参数不能为空");
        }
        try {
            return new a<>(c.fromJson(jSONObject.toString(), (Class<Object>) cls), null);
        } catch (Exception e) {
            return new a<>(null, e.getMessage());
        }
    }

    public static <T> a<T> a(JsonElement jsonElement, Class<T> cls) {
        Object[] objArr = {jsonElement, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0745b53947a74fcd0b56526901f6c287", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0745b53947a74fcd0b56526901f6c287");
        }
        if (cls == Void.class) {
            return new a<>("", null);
        }
        if (jsonElement == null) {
            return new a<>(null, "参数不能为空");
        }
        try {
            Object fromJson = c.fromJson(jsonElement, (Class<Object>) cls);
            return new a<>(fromJson, b(fromJson));
        } catch (Exception e) {
            return new a<>(null, e.getMessage());
        }
    }

    private static <T> String b(T t) {
        Field[] fields;
        boolean z;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cf522421194602e4988d725d64f42f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cf522421194602e4988d725d64f42f6");
        }
        if (t == null) {
            return "参数不能为空";
        }
        for (Field field : t.getClass().getFields()) {
            MsiParamChecker msiParamChecker = (MsiParamChecker) field.getAnnotation(MsiParamChecker.class);
            if (msiParamChecker != null) {
                try {
                    Object obj = field.get(t);
                    String name = field.getName();
                    if (msiParamChecker.required() && (obj == null || ((obj instanceof String) && ((String) obj).length() == 0))) {
                        return ((Object) name) + "缺失";
                    } else if (msiParamChecker.encoding() && !b.contains(obj)) {
                        return ((Object) name) + " 不支持 " + obj;
                    } else if (obj != null) {
                        String obj2 = obj.toString();
                        if ((obj instanceof Number) && msiParamChecker.min() != Integer.MIN_VALUE && Double.parseDouble(obj2) < msiParamChecker.min()) {
                            return ((Object) name) + "小于最小值";
                        } else if ((obj instanceof Number) && msiParamChecker.max() != Integer.MAX_VALUE && Double.parseDouble(obj2) > msiParamChecker.max()) {
                            return ((Object) name) + "大于最大值";
                        } else if ((obj instanceof String) && msiParamChecker.maxLength() != Integer.MAX_VALUE && obj2.length() > msiParamChecker.maxLength()) {
                            return ((Object) name) + "长度太长";
                        } else if ((obj instanceof String) && msiParamChecker.minLength() != 0 && obj2.length() < msiParamChecker.minLength()) {
                            return ((Object) name) + "长度太短";
                        } else if (msiParamChecker.in().length > 0 && (obj instanceof String)) {
                            int i = 0;
                            while (true) {
                                if (i >= msiParamChecker.in().length) {
                                    z = false;
                                    break;
                                } else if (TextUtils.equals(msiParamChecker.in()[i], obj2)) {
                                    z = true;
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            if (!z) {
                                return ((Object) name) + " 没有匹配的值 " + obj;
                            }
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return "参数交验失败 " + e.getMessage();
                }
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a<T> {
        public static ChangeQuickRedirect a;
        public final T b;
        public final String c;

        public a(T t, String str) {
            Object[] objArr = {t, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa898317e49c69e6a10ee5248f768601", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa898317e49c69e6a10ee5248f768601");
                return;
            }
            this.b = t;
            this.c = str;
        }

        public final boolean a() {
            return this.b != null && this.c == null;
        }
    }
}
