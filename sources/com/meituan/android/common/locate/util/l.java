package com.meituan.android.common.locate.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> T a(Object obj, String str) throws Exception {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afcac89329a34f17010f4f1b7ec0df1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afcac89329a34f17010f4f1b7ec0df1e");
        }
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    public static Object a(Object obj, String str, Object... objArr) throws Exception {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c51fd19a048b75b37d0ce9d631ed161f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c51fd19a048b75b37d0ce9d631ed161f");
        }
        Class<?> cls = obj.getClass();
        Class<?>[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
            if (clsArr[i] == Integer.class) {
                clsArr[i] = Integer.TYPE;
            }
            if (clsArr[i] == Long.class) {
                clsArr[i] = Long.TYPE;
            }
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(obj, objArr);
    }

    public static Object a(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a520cce1a631b51e2bf35c49f9577d6", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a520cce1a631b51e2bf35c49f9577d6");
        }
        Class<?> cls = Class.forName(str);
        Field field = cls.getField(str2);
        field.setAccessible(true);
        return field.get(cls);
    }

    public static Object a(String str, String str2, Object[] objArr, Class<?>[] clsArr) throws Exception {
        Object[] objArr2 = {str, str2, objArr, clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ce116548ff5113d402d2a472d3fab3c2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ce116548ff5113d402d2a472d3fab3c2");
        }
        Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(null, objArr);
    }

    public static Object a(String str, Object... objArr) throws Exception {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c44b5bc0dd06ed1894ca9b8557b60354", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c44b5bc0dd06ed1894ca9b8557b60354");
        }
        Class<?> cls = Class.forName(str);
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Constructor<?> constructor = cls.getConstructor(clsArr);
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor.newInstance(objArr);
    }

    public static int b(Object obj, String str, Object... objArr) throws Exception {
        Object invoke;
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "edb32e1134da947f76a63447b33885de", RobustBitConfig.DEFAULT_VALUE)) {
            invoke = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "edb32e1134da947f76a63447b33885de");
        } else {
            Class<?> cls = obj.getClass();
            Class<?>[] clsArr = new Class[objArr.length];
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                clsArr[i] = objArr[i].getClass();
                if (clsArr[i] == Integer.class) {
                    clsArr[i] = Integer.TYPE;
                }
            }
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            invoke = declaredMethod.invoke(obj, objArr);
        }
        return ((Integer) invoke).intValue();
    }
}
