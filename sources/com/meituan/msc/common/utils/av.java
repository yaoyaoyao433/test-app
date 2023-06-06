package com.meituan.msc.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.NonNull;
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
public final class av {
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98c84589716e191e6e3a3bd9b956e1d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98c84589716e191e6e3a3bd9b956e1d0")).intValue();
        }
        if (context == null) {
            Log.e("mmp-error", "getSystemNavigationBarHeight context param is null");
            return 0;
        } else if (d(context) && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        } else {
            return 0;
        }
    }

    private static boolean d(Context context) {
        int dimensionPixelSize;
        int identifier;
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfc9bbce3a160d00a9571f618efe210e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfc9bbce3a160d00a9571f618efe210e")).booleanValue();
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
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c05fc43d305ed2b405f7313f98a3b89b", RobustBitConfig.DEFAULT_VALUE)) {
            dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c05fc43d305ed2b405f7313f98a3b89b")).intValue();
        } else {
            dimensionPixelSize = (context == null || (identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) ? 0 : context.getResources().getDimensionPixelSize(identifier);
        }
        int i2 = displayMetrics2.heightPixels;
        int i3 = displayMetrics.heightPixels;
        Object[] objArr3 = {context, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(dimensionPixelSize)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c1f69a1d27de6b227bf45e0b5e527abf", RobustBitConfig.DEFAULT_VALUE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c1f69a1d27de6b227bf45e0b5e527abf")).intValue();
        } else if (Build.VERSION.SDK_INT >= 17 && Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0 && dimensionPixelSize >= 0 && (i = i3 + dimensionPixelSize) <= i2) {
            i3 = i;
        }
        int i4 = displayMetrics2.heightPixels;
        Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(dimensionPixelSize)};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "bce0567f5db853b95715e7c8aa2fe368", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "bce0567f5db853b95715e7c8aa2fe368")).booleanValue() : dimensionPixelSize > 0 && i4 - i3 >= dimensionPixelSize;
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "841448d78a7c5bbbf27d949a0e3a3764", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "841448d78a7c5bbbf27d949a0e3a3764")).booleanValue();
        }
        int i = Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0);
        e = i;
        return i == 0;
    }

    public static int c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e2ebe00f171146833442b564c5f5b69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e2ebe00f171146833442b564c5f5b69")).intValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f3625a770c584567b55d53f324564a5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f3625a770c584567b55d53f324564a5f")).intValue();
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6796c0040000788274939e086ab87425", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6796c0040000788274939e086ab87425")).booleanValue() : ap.a();
    }
}
