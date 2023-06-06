package com.meituan.android.customerservice.kit.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0b2235687667a1581bebdd6cace754e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0b2235687667a1581bebdd6cace754e")).intValue() : context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "236e4342cd0ca1211c861ffb62874a7b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "236e4342cd0ca1211c861ffb62874a7b")).intValue() : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9bc3be7515550ca1fdd473d4140a5bb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9bc3be7515550ca1fdd473d4140a5bb")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d760883add3daee4ec0ee35d6bc519a6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d760883add3daee4ec0ee35d6bc519a6")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static boolean a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fa7c4d40699f8604bcf9db420a51339", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fa7c4d40699f8604bcf9db420a51339")).booleanValue() : Math.abs(f - f2) <= 0.0f;
    }
}
