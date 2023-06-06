package com.sankuai.xm.imui.theme;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.SystemBarUtils;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.imui.common.util.d;
import com.unionpay.tsmservice.mi.data.Constant;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static final int b = 2131689697;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.theme.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1404a extends Properties {
        public static ChangeQuickRedirect a;

        public C1404a() {
            InputStream q;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2231ddb67b1b35a2b49fb171c238dd34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2231ddb67b1b35a2b49fb171c238dd34");
                return;
            }
            InputStream inputStream = null;
            try {
                try {
                    String str = System.getenv("ANDROID_ROOT");
                    q = k.q(k.f(TextUtils.isEmpty(str) ? "/system" : str, "build.prop"));
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                load(q);
                m.a(q);
            } catch (IOException e2) {
                e = e2;
                inputStream = q;
                d.a(e);
                m.a(inputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStream = q;
                m.a(inputStream);
                throw th;
            }
        }

        public static C1404a a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "479c659f512df2b2f4e7fc48d974bfc7", 6917529027641081856L) ? (C1404a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "479c659f512df2b2f4e7fc48d974bfc7") : new C1404a();
        }
    }

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30d51319684ce5dd78c336e6b5770a8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30d51319684ce5dd78c336e6b5770a8d");
        } else if (ActivityUtils.a(activity)) {
            Window window = activity.getWindow();
            boolean a2 = a(i);
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT >= 23) {
                    window.setStatusBarColor(i);
                    window.getDecorView().setSystemUiVisibility(a2 ? 8448 : 256);
                } else if (a2 == a(window.getStatusBarColor())) {
                    window.setStatusBarColor(i);
                    window.getDecorView().setSystemUiVisibility(256);
                } else if (a(window, !a2)) {
                    window.setStatusBarColor(i);
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256);
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                if (!a2 || a(window, false)) {
                    window.getDecorView().setSystemUiVisibility(1024);
                    window.addFlags(67108864);
                    b(activity, i);
                }
            }
        }
    }

    private static boolean a(Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "115c8164264e90ace1b8791d25159354", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "115c8164264e90ace1b8791d25159354")).booleanValue();
        }
        int a2 = a();
        if (a2 == 1) {
            return d(window, z);
        }
        if (a2 == 4) {
            return b(window, z);
        }
        if (a2 == 6) {
            return c(window, z);
        }
        return false;
    }

    private static void b(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9da2c94bbdca438b9a35365d7468fc44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9da2c94bbdca438b9a35365d7468fc44");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        View findViewById = viewGroup.findViewById(b);
        if (findViewById == null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    childAt.setFitsSystemWindows(true);
                    ((ViewGroup) childAt).setClipToPadding(true);
                }
            }
            findViewById = new View(activity);
            findViewById.setId(b);
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            viewGroup.addView(findViewById, -1, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c4c2166625d603d04f29ae0358993095", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c4c2166625d603d04f29ae0358993095")).intValue() : activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", "android")));
        }
        if (findViewById.getVisibility() == 8) {
            findViewById.setVisibility(0);
        }
        findViewById.setBackgroundColor(i);
    }

    private static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bf00b400d7770ae7e3deb68ab5e00c5", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bf00b400d7770ae7e3deb68ab5e00c5")).booleanValue() : ((((float) Color.red(i)) * 0.299f) + (((float) Color.green(i)) * 0.578f)) + (((float) Color.blue(i)) * 0.114f) >= 192.0f;
    }

    private static boolean b(Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e48be9c3aeb1ba1f315b042770daaa91", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e48be9c3aeb1ba1f315b042770daaa91")).booleanValue();
        }
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i = declaredField.getInt(null);
                int i2 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z ? i2 | i : (~i) & i2);
                window.setAttributes(attributes);
                return true;
            } catch (Exception e) {
                d.a(e);
                return false;
            }
        }
        return false;
    }

    private static boolean c(Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bf1748f40a10c2ab45af042a57e69bb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bf1748f40a10c2ab45af042a57e69bb")).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        window.addFlags(Integer.MIN_VALUE);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 23 ? z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193) : z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        return true;
    }

    private static boolean d(Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d7a9bfda56dc020ed4e3f30f3dba720", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d7a9bfda56dc020ed4e3f30f3dba720")).booleanValue();
        }
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
                return true;
            } catch (Exception e) {
                d.a(e);
                return false;
            }
        }
        return false;
    }

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffdd2055506c9f562f95ddb6f03431bb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffdd2055506c9f562f95ddb6f03431bb")).intValue();
        }
        try {
        } catch (Exception e) {
            d.a(e);
        }
        if (!SystemBarUtils.isMIUI() && !Constant.DEVICE_XIAOMI.equalsIgnoreCase(Build.MANUFACTURER)) {
            if (!SystemBarUtils.isFlyme() && !"Meizu".equalsIgnoreCase(Build.MANUFACTURER)) {
                C1404a a2 = C1404a.a();
                if (RouteSelector.ROM_OPPO.equalsIgnoreCase(Build.MANUFACTURER)) {
                    return 6;
                }
                return !TextUtils.isEmpty(a2.getProperty("ro.build.version.opporom", null)) ? 6 : 0;
            }
            return 4;
        }
        return 1;
    }
}
