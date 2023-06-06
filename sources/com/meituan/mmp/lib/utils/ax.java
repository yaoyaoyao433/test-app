package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ax {
    public static ChangeQuickRedirect a;

    private static void b(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d58cc45a91153f5df0190b14eb5d65a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d58cc45a91153f5df0190b14eb5d65a0");
            return;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("android.view.WindowManager$LayoutParams");
            int i = cls.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON").getInt(attributes);
            Field declaredField = cls.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(attributes);
            if (z) {
                declaredField.set(attributes, Integer.valueOf(i2 | i));
            } else {
                declaredField.set(attributes, Integer.valueOf((~i) & i2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void c(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "311bee3157a26623472659dba4ffacc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "311bee3157a26623472659dba4ffacc5");
            return;
        }
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Window window = activity.getWindow();
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(z ? i : 0);
            objArr2[1] = Integer.valueOf(i);
            method.invoke(window, objArr2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c5641fd5aebbd7b32352989c1e6bbff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c5641fd5aebbd7b32352989c1e6bbff");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 26 && as.b()) {
                c(activity, z);
            } else if (as.e()) {
                b(activity, z);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                View decorView = activity.getWindow().getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (z && (systemUiVisibility & 8192) == 0) {
                    decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                } else if (z || (systemUiVisibility & 8192) <= 0) {
                } else {
                    decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                }
            }
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("setStatusBarTextColor", e);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5af310b76ed1bb367a7e0a1a03b0a4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5af310b76ed1bb367a7e0a1a03b0a4f");
            return;
        }
        try {
            Window window = activity.getWindow();
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (Build.VERSION.SDK_INT < 21) {
                window.addFlags(67108864);
            } else {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                systemUiVisibility = systemUiVisibility | Integer.MIN_VALUE | 1280;
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("compatStatusBar", e);
        }
    }
}
