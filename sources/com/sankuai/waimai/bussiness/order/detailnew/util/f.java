package com.sankuai.waimai.bussiness.order.detailnew.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final DecimalFormat b = new DecimalFormat("0.000000");

    public static double[] a(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84e61c6f3da1c6a5b339559c59df7cdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84e61c6f3da1c6a5b339559c59df7cdc");
        }
        double d5 = d4 / 6371000.0d;
        double radians = Math.toRadians(d3);
        double radians2 = Math.toRadians(d);
        double radians3 = Math.toRadians(d2);
        double asin = Math.asin((Math.sin(radians2) * Math.cos(d5)) + (Math.cos(radians2) * Math.sin(d5) * Math.cos(radians)));
        return new double[]{Math.toDegrees(asin), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * Math.sin(d5) * Math.cos(radians2), Math.cos(d5) - (Math.sin(radians2) * Math.sin(asin))))};
    }

    public static int a(int i, int i2) {
        double d;
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), 13};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc128ffba94a49b2307220e897770717", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc128ffba94a49b2307220e897770717")).intValue();
        }
        boolean z2 = i >= 65 && i < 115;
        boolean z3 = i >= 115 && i < 245;
        if (i >= 245 && i < 295) {
            z = true;
        }
        double abs = Math.abs(Math.sin(Math.toRadians(i - 180)));
        if (z2 || z) {
            d = (abs * 2.067d) + 0.333d;
        } else {
            d = z3 ? abs + 1.3d : Math.abs(Math.sin(Math.toRadians(i))) + 1.3d;
        }
        return (int) (d * 13.0d);
    }
}
