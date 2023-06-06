package com.sankuai.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ViewUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getStatusBarHeight(Context context) {
        int i = 0;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30a9fe805ea8b627a2764cd89ea71971", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30a9fe805ea8b627a2764cd89ea71971")).intValue();
        }
        if (context != null && (context instanceof Activity)) {
            Rect rect = new Rect();
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        }
        return i == 0 ? getStatusBarHeight2(context) : i;
    }

    private static int getStatusBarHeight2(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5560bf614e873b39591629860367e07f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5560bf614e873b39591629860367e07f")).intValue();
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getNavigationBarHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0b161472e8f8965439a6df663396a0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0b161472e8f8965439a6df663396a0a")).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                defaultDisplay.getRealMetrics(displayMetrics);
                int i2 = displayMetrics.heightPixels;
                if (i2 > i) {
                    int i3 = i2 - i;
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    return identifier > 0 ? Math.min(resources.getDimensionPixelSize(identifier), i3) : i3;
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }
}
