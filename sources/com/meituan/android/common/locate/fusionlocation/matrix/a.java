package com.meituan.android.common.locate.fusionlocation.matrix;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b35fe07b86e5c519faab9331eed0f13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b35fe07b86e5c519faab9331eed0f13")).doubleValue();
        }
        if (Math.abs(d) > Math.abs(d2)) {
            double d3 = d2 / d;
            return Math.abs(d) * Math.sqrt((d3 * d3) + 1.0d);
        } else if (d2 != 0.0d) {
            double d4 = d / d2;
            return Math.abs(d2) * Math.sqrt((d4 * d4) + 1.0d);
        } else {
            return 0.0d;
        }
    }
}
