package com.dianping.archive;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "637b9a7b935e73af0f28667756656e46", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "637b9a7b935e73af0f28667756656e46")).booleanValue();
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            Class<?> cls2 = Runtime.getRuntime().getClass();
            Class<?>[] clsArr = new Class[2];
            if (Build.VERSION.SDK_INT > 24) {
                clsArr[0] = ClassLoader.class;
                clsArr[1] = String.class;
                Method declaredMethod = cls2.getDeclaredMethod("loadLibrary0", clsArr);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(Runtime.getRuntime(), classLoader, str);
            } else {
                clsArr[0] = String.class;
                clsArr[1] = ClassLoader.class;
                Method declaredMethod2 = cls2.getDeclaredMethod("loadLibrary", clsArr);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(Runtime.getRuntime(), str, classLoader);
            }
            return true;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return false;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return false;
        }
    }
}
