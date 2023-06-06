package com.sankuai.waimai.platform.capacity.immersed;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private static Method c = null;
    private static Method d = null;
    private static Field e = null;
    private static int f = 0;
    private static int g = 50;

    public static void a(@NonNull Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d278b004527486bbaaf234e4ba226078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d278b004527486bbaaf234e4ba226078");
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(activity, "isImmersed_" + activity.getClass().getSimpleName(), z);
    }

    public static boolean a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49235a3474577deed20325e861e67c79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49235a3474577deed20325e861e67c79")).booleanValue();
        }
        try {
            StringBuilder sb = new StringBuilder("isImmersed_");
            sb.append(activity.getClass().getSimpleName());
            return Build.VERSION.SDK_INT >= 23 && com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, sb.toString(), false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f08cb2362a9a265db4182682f2633ec4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f08cb2362a9a265db4182682f2633ec4")).booleanValue();
        }
        try {
            return com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "isImmersed_" + activity.getClass().getSimpleName(), false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9ec780eefe1aa92c8271b3d93771d10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9ec780eefe1aa92c8271b3d93771d10");
        } else if (Build.VERSION.SDK_INT >= 23) {
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            Object[] objArr2 = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b83c243b6f01830180eb7ad4bbca2875", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b83c243b6f01830180eb7ad4bbca2875");
            } else if (b()) {
                e(activity, z);
            } else if (a()) {
                f(activity, z);
            } else {
                g(activity, z);
            }
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ada96aab6563fec2c73c5223d02046ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ada96aab6563fec2c73c5223d02046ba")).booleanValue() : "meizu".equals(Build.BRAND.toLowerCase());
    }

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34915bb59d05e77b86a013fa399c50a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34915bb59d05e77b86a013fa399c50a1")).booleanValue() : "xiaomi".equals(Build.BRAND.toLowerCase());
    }

    private static void e(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30e496e904a46ded8feadb413e095b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30e496e904a46ded8feadb413e095b1e");
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
            g(activity, z);
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
    }

    private static void f(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3c0159d9a624454e605a92422f0ee0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3c0159d9a624454e605a92422f0ee0d");
            return;
        }
        try {
            c = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
        try {
            d = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
            com.sankuai.waimai.foundation.utils.log.a.a(e3);
        }
        try {
            e = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException e4) {
            com.sankuai.waimai.foundation.utils.log.a.a(e4);
        }
        try {
            f = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException e5) {
            com.sankuai.waimai.foundation.utils.log.a.a(e5);
        } catch (NoSuchFieldException e6) {
            com.sankuai.waimai.foundation.utils.log.a.a(e6);
        }
        a(activity, z, true);
    }

    private static void a(Activity activity, boolean z, boolean z2) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc1042ae2bb076b6ed9f07dc7daf1915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc1042ae2bb076b6ed9f07dc7daf1915");
        } else if (d != null) {
            try {
                d.invoke(activity, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                com.sankuai.waimai.foundation.utils.log.a.a(e2);
            } catch (InvocationTargetException e3) {
                com.sankuai.waimai.foundation.utils.log.a.a(e3);
            }
        } else {
            a(activity, activity.getWindow(), z);
        }
    }

    private static void g(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e72ba539c755a5ab2229785b37dc546a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e72ba539c755a5ab2229785b37dc546a");
        } else if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
            if (i != systemUiVisibility) {
                decorView.setSystemUiVisibility(i);
            }
        }
    }

    private static void a(Activity activity, Window window, boolean z) {
        Object[] objArr = {activity, window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "991b643eb7e0483b55b4e00441cb4b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "991b643eb7e0483b55b4e00441cb4b78");
        } else if (window.getDecorView() != null) {
            g(activity, z);
            a(window, 0);
        }
    }

    private static void a(Window window, int i) {
        Object[] objArr = {window, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "510426389f2bed20af731e9b90cc2e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "510426389f2bed20af731e9b90cc2e57");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (e != null) {
            try {
                if (e.getInt(attributes) != 0) {
                    e.set(attributes, 0);
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e2) {
                com.sankuai.waimai.foundation.utils.log.a.a(e2);
            }
        }
    }

    public static void c(@NonNull Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b20c34b4f04a0911a5856d916f18722b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b20c34b4f04a0911a5856d916f18722b");
        } else if (a(activity)) {
            if (a()) {
                f(activity, !z ? 1 : 0);
            } else if (b()) {
                e(activity, !z ? 1 : 0);
            } else {
                g(activity, !z ? 1 : 0);
            }
        }
    }

    public static void d(@NonNull Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3b43d95962b24c9f4238be1a1bbffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3b43d95962b24c9f4238be1a1bbffb");
        } else if (Build.VERSION.SDK_INT >= 23) {
            if (a()) {
                f(activity, !z ? 1 : 0);
            } else if (b()) {
                e(activity, !z ? 1 : 0);
            } else {
                g(activity, !z ? 1 : 0);
            }
        }
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d111a3a95be9ec3f985f212cd56c1a73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d111a3a95be9ec3f985f212cd56c1a73")).intValue();
        }
        int a2 = g.a(context, 25.0f);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : a2;
    }
}
