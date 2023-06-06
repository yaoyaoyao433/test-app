package com.sankuai.shangou.stone.util;

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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a = null;
    private static final String b = "k";
    private static Method c = null;
    private static Method d = null;
    private static Field e = null;
    private static int f = 0;
    private static int g = 50;

    public static void a(@NonNull Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10c8be7a90180db52174eae8881498aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10c8be7a90180db52174eae8881498aa");
            return;
        }
        Object[] objArr2 = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d62d3b65a9b333cc3c7ae6f15ac5b173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d62d3b65a9b333cc3c7ae6f15ac5b173");
            return;
        }
        r rVar = new r("quickbuy_ImmersedUtil");
        rVar.a(activity, "isImmersed_" + activity.getClass().getSimpleName(), z);
    }

    public static boolean a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a684b3027922023c0656b10c6340f8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a684b3027922023c0656b10c6340f8a")).booleanValue();
        }
        try {
            return Build.VERSION.SDK_INT >= 23 && d(activity);
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
            return false;
        }
    }

    public static boolean b(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2ee864660ac2e2b2280ce73477defc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2ee864660ac2e2b2280ce73477defc7")).booleanValue();
        }
        try {
            return d(activity);
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
            return false;
        }
    }

    public static void b(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aae5e071a59d61f59ebc3f7d2734858d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aae5e071a59d61f59ebc3f7d2734858d");
        } else if (Build.VERSION.SDK_INT >= 23) {
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            Object[] objArr2 = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9cb0c7beead3e7ee61a10e58eebb2f8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9cb0c7beead3e7ee61a10e58eebb2f8d");
            } else if (b()) {
                d(activity, z);
            } else if (a()) {
                e(activity, z);
            } else {
                f(activity, z);
            }
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8d424e36c679fcf555c382f0aeffe1e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8d424e36c679fcf555c382f0aeffe1e")).booleanValue() : "meizu".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0947651c4cdd6206326ab5ac876e217f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0947651c4cdd6206326ab5ac876e217f")).booleanValue() : "xiaomi".equalsIgnoreCase(Build.BRAND);
    }

    private static void d(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc7128f17ea5cb8578b6612e5460c088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc7128f17ea5cb8578b6612e5460c088");
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
            f(activity, z);
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
        }
    }

    private static void e(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed3d6aca5167cfaf32ee709dcbd27261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed3d6aca5167cfaf32ee709dcbd27261");
            return;
        }
        try {
            c = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
        }
        try {
            d = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
            com.sankuai.shangou.stone.util.log.a.a(e3);
        }
        try {
            e = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException e4) {
            com.sankuai.shangou.stone.util.log.a.a(e4);
        }
        try {
            f = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException e5) {
            com.sankuai.shangou.stone.util.log.a.a(e5);
        } catch (NoSuchFieldException e6) {
            com.sankuai.shangou.stone.util.log.a.a(e6);
        }
        a(activity, z, true);
    }

    private static void a(Activity activity, boolean z, boolean z2) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d1709cc01df8db3a2ac1b08c8cb42f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d1709cc01df8db3a2ac1b08c8cb42f1");
        } else if (d != null) {
            try {
                d.invoke(activity, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
            } catch (InvocationTargetException e3) {
                com.sankuai.shangou.stone.util.log.a.a(e3);
            }
        } else {
            a(activity, activity.getWindow(), z);
        }
    }

    private static void f(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0e23b8fb0b781e3f886167b5e40dfe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0e23b8fb0b781e3f886167b5e40dfe3");
        } else if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
            if (i != systemUiVisibility) {
                decorView.setSystemUiVisibility(i);
            }
        }
    }

    public static void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1ba1e4cd5543467c499be2a8f91938d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1ba1e4cd5543467c499be2a8f91938d");
        } else if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
    }

    private static void a(Activity activity, Window window, boolean z) {
        Object[] objArr = {activity, window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74c6ce06a46159539b86b4df0324b728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74c6ce06a46159539b86b4df0324b728");
        } else if (window.getDecorView() != null) {
            f(activity, z);
            a(window, 0);
        }
    }

    private static void a(Window window, int i) {
        Object[] objArr = {window, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac28df5037cf896f10c78ce40735c624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac28df5037cf896f10c78ce40735c624");
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
                com.sankuai.shangou.stone.util.log.a.a(e2);
            }
        }
    }

    public static void c(@NonNull Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d601d7500d44328a98596a9460a432f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d601d7500d44328a98596a9460a432f");
        } else if (a(activity)) {
            if (a()) {
                e(activity, !z ? 1 : 0);
            } else if (b()) {
                d(activity, !z ? 1 : 0);
            } else {
                f(activity, !z ? 1 : 0);
            }
        }
    }

    private static boolean d(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c9c06c748fc4cc16959f1e2d68d2504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c9c06c748fc4cc16959f1e2d68d2504")).booleanValue();
        }
        r rVar = new r("quickbuy_ImmersedUtil");
        return rVar.b((Context) activity, "isImmersed_" + activity.getClass().getSimpleName(), false);
    }
}
