package com.meituan.android.mrn.utils;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class am {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity) {
        Class<?>[] declaredClasses;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bba3e8fe5ec0a81dafa639a35ea51ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bba3e8fe5ec0a81dafa639a35ea51ded");
            return;
        }
        try {
            Class<?> cls = null;
            for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            Activity.class.getDeclaredMethods();
            if (Build.VERSION.SDK_INT < 21) {
                Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, null);
                return;
            }
            Method declaredMethod3 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(activity, null, invoke);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
