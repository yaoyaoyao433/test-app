package com.meituan.android.mrn.component.map.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static float a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f83e70c21060fb0903f2c6fd4b339a9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f83e70c21060fb0903f2c6fd4b339a9")).floatValue() : i / a(context).density;
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93d4263210ffab2adba93d5cf190c186", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93d4263210ffab2adba93d5cf190c186")).intValue() : (int) ((f * a(context).density) + 0.5f);
    }

    private static DisplayMetrics a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "352352eb829b779b3c671a7dfbff8cbd", RobustBitConfig.DEFAULT_VALUE) ? (DisplayMetrics) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "352352eb829b779b3c671a7dfbff8cbd") : context.getResources().getDisplayMetrics();
    }
}
