package com.meituan.robust.resource.apply;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustLibraryReflect {
    public static Object getFieldValue(Class cls, Object obj, String str) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object getFieldValueWithTryCatch(Class cls, Object obj, String str) {
        try {
            return getFieldValue(cls, obj, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setField(Class cls, Object obj, String str, Object obj2) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    public static void setFieldWithTryCatch(Class cls, Object obj, String str, Object obj2) {
        try {
            setField(cls, obj, str, obj2);
        } catch (Exception unused) {
        }
    }

    public static Object invokeMethodWithNewClass(Class cls, Object obj, String str, Object... objArr) throws Exception {
        Class<?>[] clsArr;
        if (objArr != null) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        } else {
            clsArr = null;
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    public static Object invokeMethod(Class cls, Object obj, String str, Class[] clsArr, Object... objArr) throws Exception {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    public static Object invokeMethodWithTryCatch(Class cls, Object obj, String str, Class[] clsArr, Object... objArr) {
        try {
            return invokeMethod(cls, obj, str, clsArr, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object newInstance(Class cls, Class[] clsArr, Object... objArr) throws Exception {
        Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(objArr);
    }
}
