package com.meituan.mmp.lib.utils;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class az {
    public static ChangeQuickRedirect a;
    private static Handler d = new Handler();
    private static int e = -1;
    private static ContentObserver f = null;
    public static volatile int b = 0;
    public static volatile int c = 0;

    public static int a(@NonNull Context context) {
        Resources resources;
        int identifier;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6e0b3f78aa91c5946f22b41f2dc8aff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6e0b3f78aa91c5946f22b41f2dc8aff")).intValue();
        }
        if (context == null) {
            Log.e("mmp-error", "getSystemNavigationBarHeight context param is null");
            return 0;
        } else if (e(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        } else {
            return 0;
        }
    }

    private static boolean e(Context context) {
        int dimensionPixelSize;
        int identifier;
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51d0ad9b2981445da1bcdb2b769dcb03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51d0ad9b2981445da1bcdb2b769dcb03")).booleanValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                displayMetrics2.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e4);
            }
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "49372c1277c146781f8aacb17e15ee2c", RobustBitConfig.DEFAULT_VALUE)) {
            dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "49372c1277c146781f8aacb17e15ee2c")).intValue();
        } else {
            dimensionPixelSize = (context == null || (identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) ? 0 : context.getResources().getDimensionPixelSize(identifier);
        }
        int i2 = displayMetrics2.heightPixels;
        int i3 = displayMetrics.heightPixels;
        Object[] objArr3 = {context, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(dimensionPixelSize)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "39aacbbad58555ab8782e705aaa71cc2", RobustBitConfig.DEFAULT_VALUE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "39aacbbad58555ab8782e705aaa71cc2")).intValue();
        } else if (Build.VERSION.SDK_INT >= 17 && Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0 && dimensionPixelSize >= 0 && (i = i3 + dimensionPixelSize) <= i2) {
            i3 = i;
        }
        int i4 = displayMetrics2.heightPixels;
        Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(dimensionPixelSize)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d42e4297c9d772746fac559bf8a35cbd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d42e4297c9d772746fac559bf8a35cbd")).booleanValue() : dimensionPixelSize > 0 && i4 - i3 >= dimensionPixelSize;
    }

    public static void b(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "456ad5d735f6dd4cb31a4b451e7d1834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "456ad5d735f6dd4cb31a4b451e7d1834");
        } else if (a() && !TextUtils.equals(Build.BOARD, "JLH-AN00") && f == null) {
            f = new ContentObserver(d) { // from class: com.meituan.mmp.lib.utils.az.1
                public static ChangeQuickRedirect a;

                @Override // android.database.ContentObserver
                public final void onChange(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2912d2eac5dd74c7e77deb7e8b4bfcc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2912d2eac5dd74c7e77deb7e8b4bfcc");
                        return;
                    }
                    super.onChange(z);
                    int unused = az.e = Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
                    az.b = 2;
                    com.meituan.mmp.lib.api.input.textarea.b bVar = com.meituan.mmp.lib.api.input.textarea.b.b;
                    int i = az.e;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.input.textarea.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "b04d1b2a0735ab773b2fc1badc97470b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "b04d1b2a0735ab773b2fc1badc97470b");
                    } else if (bVar.c != null) {
                        if (i == 0) {
                            bVar.c.a(true);
                        } else {
                            bVar.c.a(false);
                        }
                    }
                }
            };
            context.getContentResolver().registerContentObserver(Settings.Global.CONTENT_URI, true, f);
        }
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3039f63df6d5ed60fe6689f7a79dac5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3039f63df6d5ed60fe6689f7a79dac5e")).booleanValue();
        }
        int i = Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        e = i;
        return i == 0;
    }

    public static int d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c564e93357d54d655aa0c0165bcbaf71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c564e93357d54d655aa0c0165bcbaf71")).intValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "85c778d2966d49ae0dce9033228f49e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "85c778d2966d49ae0dce9033228f49e2")).intValue();
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f93a46ae8c839e00530bee2307b28da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f93a46ae8c839e00530bee2307b28da")).booleanValue() : as.a();
    }
}
