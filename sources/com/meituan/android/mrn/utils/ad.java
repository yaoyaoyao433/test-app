package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ad {
    public static ChangeQuickRedirect a;

    public static void a(Class<?> cls, Object obj, String str, Object obj2) throws Exception {
        Object[] objArr = {cls, obj, str, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64e5858d7dd5b5f80b90ff0bbaa051e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64e5858d7dd5b5f80b90ff0bbaa051e9");
            return;
        }
        if (obj != null && cls == null) {
            cls = obj.getClass();
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) throws Exception {
        boolean z;
        char c = 0;
        int i = 2;
        Object[] objArr = {cls, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        Method method = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67e1e6bb4750db07271b4871464d8386", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67e1e6bb4750db07271b4871464d8386");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null");
        }
        int length = clsArr.length;
        if (length == 0) {
            method = cls.getDeclaredMethod(str, new Class[0]);
        } else {
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Method method2 = declaredMethods[i2];
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (method2.getName().equals(str) && parameterTypes.length == length) {
                    int i3 = 0;
                    while (i3 < length) {
                        Class<?> cls2 = parameterTypes[i3];
                        Class<?> cls3 = clsArr[i3];
                        Object[] objArr2 = new Object[i];
                        objArr2[c] = cls2;
                        objArr2[1] = cls3;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "962455867e403d3c69f688b845db2677", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "962455867e403d3c69f688b845db2677")).booleanValue();
                        } else {
                            z = cls2 == cls3 || (cls2 == Integer.class && cls3 == Integer.TYPE) || ((cls3 == Integer.class && cls2 == Integer.TYPE) || ((cls2 == Float.class && cls3 == Float.TYPE) || ((cls3 == Float.class && cls2 == Float.TYPE) || ((cls2 == Long.class && cls3 == Long.TYPE) || ((cls3 == Long.class && cls2 == Long.TYPE) || ((cls2 == Byte.class && cls3 == Byte.TYPE) || ((cls3 == Byte.class && cls2 == Byte.TYPE) || ((cls2 == Double.class && cls3 == Double.TYPE) || ((cls3 == Double.class && cls2 == Double.TYPE) || ((cls2 == Boolean.class && cls3 == Boolean.TYPE) || (cls3 == Boolean.class && cls2 == Boolean.TYPE)))))))))));
                        }
                        if (!z && !parameterTypes[i3].isAssignableFrom(clsArr[i3])) {
                            break;
                        }
                        i3++;
                        c = 0;
                        i = 2;
                    }
                    if (i3 == length) {
                        method = method2;
                        break;
                    }
                }
                i2++;
                c = 0;
                i = 2;
            }
        }
        if (method != null) {
            return method;
        }
        String replace = Arrays.toString(clsArr).replace("[", CommonConstant.Symbol.BRACKET_LEFT).replace(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, CommonConstant.Symbol.BRACKET_RIGHT);
        throw new NoSuchMethodException(str + replace);
    }

    public static <T> T a(Object obj, String str, Object... objArr) throws Exception {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "336e9189deffa98381abe74c6ef06090", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "336e9189deffa98381abe74c6ef06090") : (T) a((Class<?>) null, obj, str, objArr);
    }

    public static <T> T a(Class<?> cls, Object obj, String str, Object... objArr) throws Exception {
        Object[] objArr2 = {cls, obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "10f83a217905b81a27d1f3e60acbdc77", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "10f83a217905b81a27d1f3e60acbdc77");
        }
        if (obj != null && cls == null) {
            cls = obj.getClass();
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method a2 = a(cls, str, (Class<?>[]) clsArr);
        a2.setAccessible(true);
        return (T) a2.invoke(obj, objArr);
    }
}
