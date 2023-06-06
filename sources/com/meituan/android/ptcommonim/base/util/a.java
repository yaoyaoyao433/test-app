package com.meituan.android.ptcommonim.base.util;

import android.content.Context;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static float b;
    private static int c;
    private static int d;

    public static int a(int i) {
        return (int) (b * i);
    }

    public static int a(float f) {
        return (int) (f / b);
    }

    public static int a() {
        return c;
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2e55163ea6733a263f9140d2074a7f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2e55163ea6733a263f9140d2074a7f6");
            return;
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            c = displayMetrics.widthPixels;
            d = displayMetrics.heightPixels;
            b = displayMetrics.density;
        } catch (Throwable unused) {
        }
    }
}
