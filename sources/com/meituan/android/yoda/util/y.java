package com.meituan.android.yoda.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    public static ChangeQuickRedirect a;
    private static int[] b;
    private static int c;
    private static int[] d;

    public static int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db56c793977f4fd9bfc4982308ac6c90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db56c793977f4fd9bfc4982308ac6c90")).intValue();
        }
        if (view == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 17 && view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        return view.getId() != -1 ? view.getId() : view.hashCode();
    }

    public static void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a25a742958e7a29775f42081e9cb9f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a25a742958e7a29775f42081e9cb9f0a");
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getApplicationContext().getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dae2ebab2c91a1ccb3fd1902ac383f9d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dae2ebab2c91a1ccb3fd1902ac383f9d")).booleanValue() : activity == null || activity.isFinishing() || (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed());
    }

    public static int[] a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd1269de7b485a5adc56c4dcfa223a0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd1269de7b485a5adc56c4dcfa223a0e");
        }
        if (b != null) {
            return b;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int[] iArr = {displayMetrics.widthPixels, displayMetrics.heightPixels};
        b = iArr;
        return iArr;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5bfcc4af22e7ff0eb0ecde1345fcfb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5bfcc4af22e7ff0eb0ecde1345fcfb1")).intValue();
        }
        if (c > 0) {
            return c;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            c = resources.getDimensionPixelSize(identifier);
        }
        return c;
    }

    public static void a(Window window, int i) {
        Object[] objArr = {window, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f28e6a599c5942fbd0333b0ba60b8e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f28e6a599c5942fbd0333b0ba60b8e9");
        } else if (window != null) {
            window.setSoftInputMode(i);
        }
    }
}
