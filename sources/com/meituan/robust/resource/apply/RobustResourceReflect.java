package com.meituan.robust.resource.apply;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustResourceReflect {
    private static Object sThreadLocal;

    private RobustResourceReflect() {
    }

    public static Object getCurrentActivityThread(Context context) {
        if (context == null) {
            return null;
        }
        if (sThreadLocal == null) {
            sThreadLocal = getCurrentActivityThread1(context);
        }
        if (sThreadLocal == null) {
            sThreadLocal = getCurrentActivityThread2(context);
        }
        return sThreadLocal;
    }

    private static Object getCurrentActivityThread1(Context context) {
        Object obj;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            try {
                obj = getFieldValue(cls, null, "sCurrentActivityThread");
            } catch (Exception unused) {
                obj = null;
            }
            return obj == null ? ((ThreadLocal) getFieldValue(cls, null, "sThreadLocal")).get() : obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Object getCurrentActivityThread2(Context context) {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            if (invoke != null || context == null) {
                return invoke;
            }
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object getFieldValue(Class cls, Object obj, String str) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
