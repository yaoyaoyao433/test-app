package com.meituan.msc.common.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aq {
    public static ChangeQuickRedirect a;
    public static float b;

    public static double a(Context context, double d) {
        float f;
        Object[] objArr = {context, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c9ac1ba3219535520c8b0ec4a712766", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c9ac1ba3219535520c8b0ec4a712766")).doubleValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "39b37784046f114629c39564a70920a1", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "39b37784046f114629c39564a70920a1")).floatValue();
        } else {
            if (b == 0.0f) {
                b = context.getResources().getDisplayMetrics().density;
            }
            f = b;
        }
        return (d / f) + 0.5d;
    }
}
