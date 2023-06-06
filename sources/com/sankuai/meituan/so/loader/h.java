package com.sankuai.meituan.so.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static Field a(Object obj, String str) throws NoSuchFieldException {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9abb774b72c669c3ce68f1c7af96aaab", RobustBitConfig.DEFAULT_VALUE)) {
            return (Field) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9abb774b72c669c3ce68f1c7af96aaab");
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Object[] objArr = {obj, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "417058233150e6fd17e3fec8f1f9350a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "417058233150e6fd17e3fec8f1f9350a");
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }
}
