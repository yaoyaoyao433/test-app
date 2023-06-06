package com.sankuai.waimai.ugc.creator.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Window window, @Nullable View view) {
        Object[] objArr = {window, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d691086f60b60db821176426b94fab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d691086f60b60db821176426b94fab1");
        } else if (Build.VERSION.SDK_INT >= 23) {
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            a(window, false);
            if (view != null) {
                ah.b(view, Integer.MIN_VALUE, a(view.getContext()), Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
    }

    private static void a(@NonNull Window window, boolean z) {
        Object[] objArr = {window, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c35e49afa688c45f452d8330674d8daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c35e49afa688c45f452d8330674d8daf");
        } else if (a()) {
            b(window, false);
        } else if (b()) {
            c(window, false);
        } else {
            d(window, false);
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f683639ae0992f3ee396f82c2659229e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f683639ae0992f3ee396f82c2659229e")).booleanValue() : "xiaomi".equals(Build.BRAND.toLowerCase());
    }

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acd9863be5bdfcb3820c8ecf82ccf24f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acd9863be5bdfcb3820c8ecf82ccf24f")).booleanValue() : "meizu".equals(Build.BRAND.toLowerCase());
    }

    @SuppressLint({"PrivateApi"})
    private static void b(@NonNull Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c0b3a4cc72c5691e092b774d2f8a3e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c0b3a4cc72c5691e092b774d2f8a3e9");
            return;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(z ? i : 0);
            objArr2[1] = Integer.valueOf(i);
            method.invoke(window, objArr2);
            d(window, z);
        } catch (Exception unused) {
        }
    }

    private static void c(@NonNull Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ced44aee9364f0d8e66235a04e4e774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ced44aee9364f0d8e66235a04e4e774");
            return;
        }
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
        } catch (Exception unused) {
        }
    }

    private static void d(@NonNull Window window, boolean z) {
        Object[] objArr = {window, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f82cfeaa8376765f1f5bd257bb4bd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f82cfeaa8376765f1f5bd257bb4bd22");
        } else if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
            if (i != systemUiVisibility) {
                decorView.setSystemUiVisibility(i);
            }
        }
    }

    public static int a(Context context) {
        Resources resources;
        int identifier;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3ac3d455ac11b11b84b77264d1d18a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3ac3d455ac11b11b84b77264d1d18a8")).intValue();
        }
        if (context == null || (resources = context.getResources()) == null || (identifier = resources.getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }
}
