package com.dianping.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a = null;
    private static int b = 0;
    private static int c = 0;
    private static boolean d = false;

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b0a3fe4d44825a4842ea1a63d2bbd13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b0a3fe4d44825a4842ea1a63d2bbd13")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics != null ? (int) ((f * displayMetrics.density) + 0.5f) : (int) ((f * 3.0f) + 0.5f);
    }

    public static int b(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8507ae87feb8765bf2da1b32a472257", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8507ae87feb8765bf2da1b32a472257")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics != null ? (int) ((f / displayMetrics.density) + 0.5f) : (int) ((f / 3.0f) + 0.5f);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2ee90edab062df7f69237c7dfd14bba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2ee90edab062df7f69237c7dfd14bba")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (b > 0) {
            return b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            b = displayMetrics.widthPixels;
        }
        return b;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a3f4259ce7aaf7f20e2c6b7edd2178b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a3f4259ce7aaf7f20e2c6b7edd2178b")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (c > 0) {
            return c;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            c = displayMetrics.heightPixels;
        }
        return c;
    }
}
