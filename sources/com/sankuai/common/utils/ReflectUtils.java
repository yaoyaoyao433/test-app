package com.sankuai.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReflectUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Object getValue(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0dbb2866f7780663bc764185ce9de9f1", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0dbb2866f7780663bc764185ce9de9f1");
        }
        Field field = getField(obj, str);
        if (field != null) {
            try {
                return field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Object getValue(Object obj, Class<?> cls, String str) {
        Object[] objArr = {obj, cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be1ebbddc3b9adc7669c9e6842b62f5b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be1ebbddc3b9adc7669c9e6842b62f5b");
        }
        Field field = getField(obj, cls, str);
        if (field != null) {
            try {
                return field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean setValue(Object obj, String str, Object obj2) {
        Object[] objArr = {obj, str, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71619a4de5c8d75cda2b2bb660138224", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71619a4de5c8d75cda2b2bb660138224")).booleanValue();
        }
        Field field = getField(obj, str);
        if (field != null) {
            try {
                field.set(obj, obj2);
                return true;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean setValue(Object obj, Class<?> cls, String str, Object obj2) {
        Object[] objArr = {obj, cls, str, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d421247406820addc4a04a82b1aff731", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d421247406820addc4a04a82b1aff731")).booleanValue();
        }
        Field field = getField(obj, cls, str);
        if (field != null) {
            try {
                field.set(obj, obj2);
                return true;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean setValue(Object obj, Field field, Object obj2) {
        Object[] objArr = {obj, field, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c910e8313c4bf1b0b9d0b92329179f00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c910e8313c4bf1b0b9d0b92329179f00")).booleanValue();
        }
        if (obj == null || field == null) {
            return false;
        }
        try {
            field.set(obj, obj2);
            return true;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Field getField(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ddf2b3bccc346569963b55d5eaf5d702", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ddf2b3bccc346569963b55d5eaf5d702");
        }
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return getField(obj, obj.getClass(), str);
    }

    public static Field getField(Object obj, Class<?> cls, String str) {
        Object[] objArr = {obj, cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "541e2835c3beff06caf2b5799466f40c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "541e2835c3beff06caf2b5799466f40c");
        }
        if (obj == null || cls == null || TextUtils.isEmpty(str)) {
            return null;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object invoke(Object obj, String str, Object... objArr) {
        Class[] clsArr;
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e1748e10b0e4b7fdd589aadb0627389b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e1748e10b0e4b7fdd589aadb0627389b");
        }
        Class<?> cls = obj.getClass();
        if (objArr != null) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Class<?> cls2 = objArr[i].getClass();
                if (cls2 == Integer.class) {
                    clsArr[i] = Integer.TYPE;
                } else if (cls2 == Long.class) {
                    clsArr[i] = Long.TYPE;
                } else if (cls2 == Double.class) {
                    clsArr[i] = Double.TYPE;
                } else if (cls2 == Float.class) {
                    clsArr[i] = Float.TYPE;
                } else if (cls2 == Boolean.class) {
                    clsArr[i] = Boolean.TYPE;
                } else if (cls2 == Character.class) {
                    clsArr[i] = Character.TYPE;
                } else if (cls2 == Byte.class) {
                    clsArr[i] = Byte.TYPE;
                } else if (cls2 == Short.class) {
                    clsArr[i] = Short.TYPE;
                } else {
                    clsArr[i] = cls2;
                }
            }
        } else {
            clsArr = new Class[0];
        }
        return invoke(obj, str, cls, objArr, clsArr);
    }

    public static Object invoke(Object obj, String str, Object[] objArr, Class[] clsArr) {
        Object[] objArr2 = {obj, str, objArr, clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "646497cf9261fa0c42290409d314c1a9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "646497cf9261fa0c42290409d314c1a9") : invoke(obj, str, obj.getClass(), objArr, clsArr);
    }

    private static Object invoke(Object obj, String str, Class<?> cls, Object[] objArr, Class[] clsArr) {
        do {
            Object[] objArr2 = {obj, str, cls, objArr, clsArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "15b3332b7a58492b91078052a91b6a6c", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "15b3332b7a58492b91078052a91b6a6c");
            }
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
                cls = cls.getSuperclass();
                if (cls == null) {
                }
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (cls == null);
        return null;
    }
}
