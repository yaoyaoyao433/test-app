package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17f49488e37aede6edbcedd04720d7e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17f49488e37aede6edbcedd04720d7e1")).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a2ef2aea0d1fa9fa1c74e986af3abee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a2ef2aea0d1fa9fa1c74e986af3abee")).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bd1d061f64b2efc8e12fb082ef03356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bd1d061f64b2efc8e12fb082ef03356");
        } else if (activity == null) {
        } else {
            try {
                activity.getWindow().clearFlags(8192);
            } catch (Exception unused) {
                com.meituan.android.paybase.common.analyse.cat.a.a("enableScreenshot", "enableScreenshot");
            }
        }
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "727d0edb44fccde8e3481ebeb3cfc8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "727d0edb44fccde8e3481ebeb3cfc8bc");
        } else if (activity == null) {
        } else {
            try {
                activity.getWindow().setFlags(8192, 8192);
            } catch (Exception unused) {
                com.meituan.android.paybase.common.analyse.cat.a.a("disableScreenshot", "disableScreenshot");
            }
        }
    }
}
