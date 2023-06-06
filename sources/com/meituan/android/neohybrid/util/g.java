package com.meituan.android.neohybrid.util;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final List<Class> b = Arrays.asList(Integer.TYPE, Integer.class);
    private static final List<Class> c = Arrays.asList(Long.TYPE, Long.class);
    private static final List<Class> d = Arrays.asList(Float.TYPE, Float.class);
    private static final List<Class> e = Arrays.asList(Double.TYPE, Double.class);
    private static final List<Class> f = Arrays.asList(Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE);
    private static final List<Class> g = Arrays.asList(Boolean.TYPE, Boolean.class);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        Field onSearch(Object obj, Field field) throws IllegalAccessException;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements c {
        @Override // com.meituan.android.neohybrid.util.g.c
        public void a(Boolean bool) {
        }

        @Override // com.meituan.android.neohybrid.util.g.c
        public void a(Integer num) {
        }

        @Override // com.meituan.android.neohybrid.util.g.c
        public void a(String str) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(Boolean bool);

        void a(Integer num);

        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d {
        public static final Type a = new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.util.g.d.1
        }.getType();
        public static final Type b = new TypeToken<Map<String, String>>() { // from class: com.meituan.android.neohybrid.util.g.d.2
        }.getType();
    }

    public static boolean a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32d8d6da429c025e39a156117ae44cec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32d8d6da429c025e39a156117ae44cec")).booleanValue() : (cls == null || cls.isInterface() || cls.isPrimitive() || cls.isArray() || cls.isLocalClass()) ? false : true;
    }

    private static boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd217cbfd3605150a1596e19308eb8e6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd217cbfd3605150a1596e19308eb8e6")).booleanValue() : obj != null && a(obj.getClass());
    }

    public static boolean b(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e7cca20725bf64006564eab4aabc971", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e7cca20725bf64006564eab4aabc971")).booleanValue() : cls != null && (b.contains(cls) || c.contains(cls) || d.contains(cls) || e.contains(cls));
    }

    public static boolean c(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc564c470877527b72dfe2e4acec17ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc564c470877527b72dfe2e4acec17ed")).booleanValue() : cls != null && g.contains(cls);
    }

    public static Object a(Class<?> cls, String str, Object obj) {
        Object[] objArr = {cls, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bcdb50adf7f66eaae424bd0a7310caf", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bcdb50adf7f66eaae424bd0a7310caf");
        }
        if (b(cls)) {
            if (b.contains(cls)) {
                return Integer.valueOf(Integer.parseInt(str));
            }
            if (c.contains(cls)) {
                return Long.valueOf(Long.parseLong(str));
            }
            if (d.contains(cls)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            if (e.contains(cls)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return obj;
        }
        return obj;
    }

    public static Field a(Object obj, a aVar) {
        Object[] objArr = {obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58a0d40560fc5bfdb12cc985b1bb88f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58a0d40560fc5bfdb12cc985b1bb88f9");
        }
        if (!a(obj) || aVar == null) {
            return null;
        }
        return a(obj, obj.getClass(), aVar);
    }

    public static Field a(Object obj, Class<?> cls, a aVar) {
        Field[] declaredFields;
        Field onSearch;
        Object[] objArr = {obj, cls, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e44eaf002e1a95467af6787530fce186", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e44eaf002e1a95467af6787530fce186");
        }
        if (!a(obj) || cls == null || aVar == null || !cls.isAssignableFrom(obj.getClass())) {
            return null;
        }
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                onSearch = aVar.onSearch(obj, field);
            } catch (IllegalAccessException e2) {
                com.meituan.android.neohybrid.neo.report.b.a(e2, "ReflectUtils_searchField_IllegalAccessException", com.meituan.android.neohybrid.neo.report.a.c(MonitorManager.ERR_MSG, e2.getMessage()).b("err_field", field.getName()));
            } catch (Exception e3) {
                com.meituan.android.neohybrid.neo.report.b.a(e3, "ReflectUtils_searchField", (Map<String, Object>) null);
            }
            if (onSearch != null) {
                return onSearch;
            }
        }
        return null;
    }

    public static Object a(Object obj, Field field) {
        Object[] objArr = {obj, field};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5bcce0b79543218dfc98b110c265571", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5bcce0b79543218dfc98b110c265571");
        }
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Field a(String str, Object obj, Field field) throws IllegalAccessException {
        Object[] objArr = {str, obj, field};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2e8426e2a8ffe0f6b73b43b92335582", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2e8426e2a8ffe0f6b73b43b92335582");
        }
        if (TextUtils.equals(str, field.getName())) {
            return field;
        }
        return null;
    }

    public static Type a(Object obj, Class<?> cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0ec85185e86ff7cf322abb40bdcb69b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0ec85185e86ff7cf322abb40bdcb69b");
        }
        if (obj == null) {
            return null;
        }
        Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
        if (genericInterfaces.length <= 0) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == cls && parameterizedType.getActualTypeArguments().length != 0) {
                    return parameterizedType.getActualTypeArguments()[0];
                }
            }
        }
        return null;
    }

    public static void a(Object obj, c cVar) {
        Object[] objArr = {obj, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77f672bffa4153acf67da4ac85d0aabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77f672bffa4153acf67da4ac85d0aabd");
        } else if (a(obj)) {
            if (obj instanceof Boolean) {
                cVar.a((Boolean) obj);
            } else if (obj instanceof Integer) {
                cVar.a((Integer) obj);
            } else if (obj instanceof String) {
                cVar.a((String) obj);
            }
        }
    }

    public static <T> T d(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b06ca68e8fade42a8e0207b97db63818", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b06ca68e8fade42a8e0207b97db63818");
        }
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object a(Object obj, Class<?> cls, String str) {
        Object[] objArr = {obj, cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb2f80667fb236a54be8a7214bdba605", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb2f80667fb236a54be8a7214bdba605");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        return a(obj, a(obj, cls, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "27154ec25bf283b411a607e717d4f179", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "27154ec25bf283b411a607e717d4f179") : new h(str)));
    }
}
