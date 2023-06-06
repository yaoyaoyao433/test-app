package com.tencent.smtt.utils;

import android.os.Build;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
/* loaded from: classes6.dex */
public class i {
    public static Object a(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(null, objArr);
        } catch (Throwable th) {
            TbsLog.e("997", String.valueOf(th));
            th.printStackTrace();
            return null;
        }
    }

    public static Object a(Object obj, String str) {
        return a(obj, str, (Class<?>[]) null, new Object[0]);
    }

    public static Object a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        StringWriter stringWriter;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> cls = obj.getClass();
            Method method = Build.VERSION.SDK_INT > 10 ? cls.getMethod(str, clsArr) : cls.getDeclaredMethod(str, clsArr);
            method.setAccessible(true);
            if (objArr.length == 0) {
                objArr = null;
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            TbsLog.e("997", String.valueOf(th));
            if (th.getCause() == null || !th.getCause().toString().contains("AuthenticationFail")) {
                if (str == null || !(str.equalsIgnoreCase("canLoadX5Core") || str.equalsIgnoreCase("initTesRuntimeEnvironment"))) {
                    th.printStackTrace(new PrintWriter(new StringWriter()));
                    TbsLog.i("ReflectionUtils", "invokeInstance -- exceptions:" + stringWriter.toString());
                    return null;
                }
                return null;
            }
            return new String("AuthenticationFail");
        }
    }

    public static Object a(String str, String str2) {
        try {
            return Class.forName(str).getMethod(str2, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            TbsLog.e("997", String.valueOf(th));
            return null;
        }
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != Object.class && cls != null; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
