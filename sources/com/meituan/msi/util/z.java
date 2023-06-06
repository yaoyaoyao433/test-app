package com.meituan.msi.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static <T> T a(Class cls, String str, Object obj, Class<?>[] clsArr, Object[] objArr) {
        Method method;
        Object[] objArr2 = {cls, str, obj, clsArr, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "969e4b2cfa45d59c3ba5e1e95c5cda52", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "969e4b2cfa45d59c3ba5e1e95c5cda52");
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
}
