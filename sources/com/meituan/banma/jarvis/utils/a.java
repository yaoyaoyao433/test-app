package com.meituan.banma.jarvis.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    @SuppressLint({"StaticFieldLeak"})
    private static Application c;

    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2a4584177c519393baf2f66181d4474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2a4584177c519393baf2f66181d4474");
        } else if (application == null) {
            Log.e(b, "app is null.");
        } else if (c == null) {
            c = application;
        }
    }

    public static Application a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16239a6eca1fb331e7e782970db41828", RobustBitConfig.DEFAULT_VALUE)) {
            return (Application) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16239a6eca1fb331e7e782970db41828");
        }
        if (c != null) {
            return c;
        }
        a(b());
        if (c == null) {
            Log.e(b, "reflect failed.");
        }
        return c;
    }

    private static Application b() {
        Object c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ebfc43fba6b7103dc8b757c8f4eb13e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Application) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ebfc43fba6b7103dc8b757c8f4eb13e");
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e3d93805359dc45d7206d81a7c0a85cd", RobustBitConfig.DEFAULT_VALUE)) {
                c2 = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e3d93805359dc45d7206d81a7c0a85cd");
            } else {
                c2 = c();
                if (c2 == null) {
                    c2 = d();
                }
            }
            Object invoke = cls.getMethod("getApplication", new Class[0]).invoke(c2, new Object[0]);
            if (invoke == null) {
                return null;
            }
            return (Application) invoke;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private static Object c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41337b68eba0cbe14c862eb7b608d0b5", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41337b68eba0cbe14c862eb7b608d0b5");
        }
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e.getMessage());
            return null;
        }
    }

    private static Object d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fba85e3b3583fbbcbd70765f33fbea43", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fba85e3b3583fbbcbd70765f33fbea43");
        }
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e.getMessage());
            return null;
        }
    }
}
