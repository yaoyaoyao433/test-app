package com.dianping.shield.dynamic.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMSizeUtils {
    public static final float COMPAT_SCALE = 0.83f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int screenHeightPixels;
    private static int screenWidthPixels;

    public static int getScreenWidthPixels(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c2da2d27f24c4fd5a626ca3023cbaec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c2da2d27f24c4fd5a626ca3023cbaec")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (screenWidthPixels > 0) {
            return screenWidthPixels;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            screenWidthPixels = displayMetrics.widthPixels;
        }
        return screenWidthPixels;
    }

    public static int getScreenHeightPixels(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8aae277a195a7e8a1fc4986aba5b8d9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8aae277a195a7e8a1fc4986aba5b8d9c")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (screenHeightPixels > 0) {
            return screenHeightPixels;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                screenHeightPixels = point.y;
            } else {
                defaultDisplay.getMetrics(displayMetrics);
                screenHeightPixels = displayMetrics.heightPixels;
            }
        }
        return screenHeightPixels;
    }

    public static int dip2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d5bdd40261a49172f06db292122c538", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d5bdd40261a49172f06db292122c538")).intValue() : dip2px(context, f, false);
    }

    public static int dip2px(Context context, float f, boolean z) {
        Object[] objArr = {context, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24b69cf9174dc193ca3b8339568a3127", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24b69cf9174dc193ca3b8339568a3127")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return (int) ((context.getResources().getDisplayMetrics().density * (z ? 0.83f : 1.0f) * f) + (f > 0.0f ? 0.5f : -0.5f));
    }

    public static int px2dip(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c08b2f6b0cc3416a0b96f1481ba540cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c08b2f6b0cc3416a0b96f1481ba540cb")).intValue() : px2dip(context, f, false);
    }

    public static int px2dip(Context context, float f, boolean z) {
        Object[] objArr = {context, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e686acba13f0265ad92fb5bd5d723479", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e686acba13f0265ad92fb5bd5d723479")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return (int) ((f / (context.getResources().getDisplayMetrics().density * (z ? 0.83f : 1.0f))) + (f > 0.0f ? 0.5f : -0.5f));
    }
}
