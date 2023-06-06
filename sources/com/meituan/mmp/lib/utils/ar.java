package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ar {
    public static ChangeQuickRedirect a;

    public static <T> T a(Class cls, String str, Object obj, Class<?>[] clsArr, Object[] objArr) {
        Method method;
        Object[] objArr2 = {cls, str, obj, clsArr, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "26e763f827ba5da290bb90ee787f6231", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "26e763f827ba5da290bb90ee787f6231");
        }
        if (obj == null) {
            throw new IllegalArgumentException("instance cannot be null");
        }
        try {
            method = cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e) {
            e.printStackTrace();
            method = null;
        }
        if (method != null) {
            try {
                method.setAccessible(true);
                return (T) method.invoke(obj, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Object[] objArr = {cls, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20a4ef7c28f3784b364dc37112ecc08b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20a4ef7c28f3784b364dc37112ecc08b");
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19d4ad2cd3c65e7754583e93a43abb8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19d4ad2cd3c65e7754583e93a43abb8a");
        }
        try {
            return (T) Class.forName(str);
        } catch (ClassNotFoundException e) {
            com.meituan.mmp.lib.trace.b.a("getClassUnchecked: " + str, e);
            throw new RuntimeException(e);
        }
    }
}
