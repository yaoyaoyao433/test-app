package com.sankuai.shangou.stone.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "147359032d65aed071ed49287d7102d3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "147359032d65aed071ed49287d7102d3")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a68da16bafce4f3c60efbdcb5e867850", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a68da16bafce4f3c60efbdcb5e867850")).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(12.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "190f4ee30bf09119dd72cf0e2193fe8c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "190f4ee30bf09119dd72cf0e2193fe8c")).intValue() : (int) ((context.getResources().getDisplayMetrics().scaledDensity * 12.0f) + 0.5f);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42ec03cfddf5170724398aed8ae834f9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42ec03cfddf5170724398aed8ae834f9")).intValue() : context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce5744b4764da913bb80c2ee63ee2e9e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce5744b4764da913bb80c2ee63ee2e9e")).intValue() : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4013c3e657c2fbcfc1717772338178b9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4013c3e657c2fbcfc1717772338178b9")).intValue() : context.getResources().getDisplayMetrics().heightPixels - u.a();
    }

    @TargetApi(17)
    public static int d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b5bcafbed83799a6163cb85c4af3fe9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b5bcafbed83799a6163cb85c4af3fe9")).intValue();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
    }

    public static int a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e427473c461d7b46a6b5e65ef189b15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e427473c461d7b46a6b5e65ef189b15")).intValue();
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }
}
