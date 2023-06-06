package com.xiaomi.push;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class am {
    private static final Map<Class<?>, Class<?>> a;

    /* loaded from: classes6.dex */
    public static class a<T> {
        public final Class<? extends T> a;
        public final T b;
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        a.put(Byte.class, Byte.TYPE);
        a.put(Character.class, Character.TYPE);
        a.put(Short.class, Short.TYPE);
        a.put(Integer.class, Integer.TYPE);
        a.put(Float.class, Float.TYPE);
        a.put(Long.class, Long.TYPE);
        a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = a;
        Class<?> cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = a;
        Class<?> cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = a;
        Class<?> cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = a;
        Class<?> cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = a;
        Class<?> cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = a;
        Class<?> cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = a;
        Class<?> cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = a;
        Class<?> cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Class<? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> T a(java.lang.Class<? extends java.lang.Object> r3, java.lang.Object r4, java.lang.String r5) {
        /*
            r0 = 0
        L1:
            r1 = 1
            if (r0 != 0) goto L1b
            java.lang.reflect.Field r2 = r3.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> Le
            r2.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Ld
            r0 = r2
            goto L12
        Ld:
            r0 = r2
        Le:
            java.lang.Class r3 = r3.getSuperclass()
        L12:
            if (r3 == 0) goto L15
            goto L1
        L15:
            java.lang.NoSuchFieldException r3 = new java.lang.NoSuchFieldException
            r3.<init>()
            throw r3
        L1b:
            r0.setAccessible(r1)
            java.lang.Object r3 = r0.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.am.a(java.lang.Class, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static <T> T a(Class<? extends Object> cls, String str) {
        try {
            return (T) a(cls, (Object) null, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Meet exception when call getStaticField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(cls.getSimpleName());
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T a(Object obj, String str) {
        try {
            return (T) a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Meet exception when call getField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T a(Object obj, String str, Object... objArr) {
        try {
            return (T) b(obj, str, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Meet exception when call Method '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    public static <T> T a(String str, String str2) {
        try {
            return (T) a((Class<? extends Object>) jr.a(null, str), (Object) null, str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Meet exception when call getStaticField '");
            sb.append(str2);
            sb.append("' in ");
            sb.append(str);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        while (true) {
            Method a2 = a(cls.getDeclaredMethods(), str, clsArr);
            if (a2 != null) {
                a2.setAccessible(true);
                return a2;
            } else if (cls.getSuperclass() == null) {
                throw new NoSuchMethodException();
            } else {
                cls = cls.getSuperclass();
            }
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        } else if (clsArr2 == null) {
            return clsArr.length == 0;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (clsArr2[i] != null && !clsArr[i].isAssignableFrom(clsArr2[i]) && (!a.containsKey(clsArr[i]) || !a.get(clsArr[i]).equals(a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = (obj == null || !(obj instanceof a)) ? obj == null ? null : obj.getClass() : ((a) obj).a;
        }
        return clsArr;
    }

    public static <T> T b(Object obj, String str, Object... objArr) {
        return (T) a(obj.getClass(), str, a(objArr)).invoke(obj, b(objArr));
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((a) obj).b;
            }
        }
        return objArr2;
    }

    public static void a(Object obj, String str, Object obj2) {
        try {
            Class<?> cls = obj.getClass();
            Field field = null;
            while (field == null) {
                try {
                    field = cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                }
                if (cls == null) {
                    throw new NoSuchFieldException();
                }
            }
            field.setAccessible(true);
            field.set(obj, obj2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Meet exception when call setField '");
            sb.append(str);
            sb.append("' in ");
            sb.append(obj);
            sb.append(", ");
            sb.append(e);
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) a(jr.a(null, str), str2, a(objArr)).invoke(null, b(objArr));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Meet exception when call Method '");
            sb.append(str2);
            sb.append("' in ");
            sb.append(str);
            sb.append(", ");
            sb.append(e);
            return null;
        }
    }
}
