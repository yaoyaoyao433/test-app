package com.tencent.mapsdk.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ha {
    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.Class<T> r10, java.lang.Object... r11) {
        /*
            r0 = 0
            if (r10 == 0) goto L9b
            boolean r1 = r10.isEnum()
            if (r1 != 0) goto L9b
            boolean r1 = r10.isInterface()
            if (r1 != 0) goto L9b
            boolean r1 = r10.isAnnotation()
            if (r1 != 0) goto L9b
            boolean r1 = r10.isArray()
            if (r1 == 0) goto L1d
            goto L9b
        L1d:
            java.lang.reflect.Constructor[] r1 = r10.getDeclaredConstructors()
            r2 = 0
            r3 = 0
        L23:
            int r4 = r1.length
            if (r3 >= r4) goto L84
            r4 = r1[r3]
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r5 = r4.length
            int r6 = r11.length
            r7 = 1
            if (r5 != r6) goto L58
            r5 = 0
            r6 = 0
        L33:
            int r8 = r4.length
            if (r5 >= r8) goto L53
            r8 = r4[r5]
            r9 = r11[r5]
            java.lang.Class r9 = r9.getClass()
            if (r8 == r9) goto L4e
            r8 = r4[r5]
            r9 = r11[r5]
            java.lang.Class r9 = r9.getClass()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L50
        L4e:
            int r6 = r6 + 1
        L50:
            int r5 = r5 + 1
            goto L33
        L53:
            int r4 = r4.length
            if (r6 != r4) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = 0
        L59:
            if (r4 == 0) goto L81
            r4 = r1[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            r4.setAccessible(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            r4 = r1[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            java.lang.Object r4 = r4.newInstance(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L67 java.lang.InstantiationException -> L70 java.lang.IllegalAccessException -> L79
            return r4
        L67:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.tencent.mapsdk.internal.kj.b(r5, r4)
            goto L81
        L70:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.tencent.mapsdk.internal.kj.b(r5, r4)
            goto L81
        L79:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.tencent.mapsdk.internal.kj.b(r5, r4)
        L81:
            int r3 = r3 + 1
            goto L23
        L84:
            java.lang.Object r10 = r10.newInstance()     // Catch: java.lang.InstantiationException -> L89 java.lang.IllegalAccessException -> L92
            return r10
        L89:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.tencent.mapsdk.internal.kj.b(r11, r10)
            goto L9a
        L92:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.tencent.mapsdk.internal.kj.b(r11, r10)
        L9a:
            return r0
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ha.a(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    private static boolean a(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (clsArr[i2] == objArr[i2].getClass() || clsArr[i2].isAssignableFrom(objArr[i2].getClass())) {
                i++;
            }
        }
        return i == clsArr.length;
    }

    private static void a(Object obj, String str, Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (IllegalAccessException e) {
            kj.b(e.getMessage(), e);
        } catch (NoSuchFieldException e2) {
            kj.b(e2.getMessage(), e2);
        }
    }

    public static Object a(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if (Modifier.isStatic(declaredField.getModifiers())) {
                return declaredField.get(cls);
            }
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            kj.b(e.getMessage(), e);
            return null;
        } catch (NoSuchFieldException e2) {
            kj.b(e2.getMessage(), e2);
            return null;
        }
    }

    private static Object a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            Method a = a((Class) obj.getClass(), str, clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a.invoke(obj, objArr);
            }
        } catch (IllegalAccessException e) {
            kj.b(e.getMessage(), e);
        } catch (InvocationTargetException e2) {
            kj.b(e2.getMessage(), e2);
        }
        return null;
    }

    private static Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Method a = a((Class) obj.getClass(), str, clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a.invoke(obj, objArr);
            }
        } catch (IllegalAccessException e) {
            kj.b(e.getMessage(), e);
        } catch (InvocationTargetException e2) {
            kj.b(e2.getMessage(), e2);
        }
        return null;
    }

    private static Method a(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            if (cls.getSuperclass() != Object.class) {
                return a(cls.getSuperclass(), str, clsArr);
            }
            kj.b(e.getMessage(), e);
            return null;
        }
    }

    public static Class a(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException e) {
            kj.b(e.getMessage(), e);
            return null;
        }
    }

    public static <T> Class<? extends T> a(String str, Class<T> cls, ClassLoader classLoader) {
        try {
            Class<? extends T> cls2 = (Class<? extends T>) Class.forName(str, false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (ClassNotFoundException e) {
            kj.b(e.getMessage(), e);
            return null;
        }
    }
}
