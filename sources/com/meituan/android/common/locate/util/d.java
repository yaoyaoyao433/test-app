package com.meituan.android.common.locate.util;

import com.meituan.android.common.locate.model.Coordinate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.RoundingMode;
import java.text.NumberFormat;
/* loaded from: classes2.dex */
public final class d {
    private static final NumberFormat a;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        a = numberInstance;
        numberInstance.setMaximumFractionDigits(6);
        a.setRoundingMode(RoundingMode.HALF_UP);
    }

    public static double a(double d, double d2, double d3, double d4) {
        int i = 0;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c86926b44e31baed5205d89d4e3e9d02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c86926b44e31baed5205d89d4e3e9d02")).doubleValue();
        }
        double d5 = (0.017453292519943295d * d4) - (d2 * 0.017453292519943295d);
        double atan = Math.atan(Math.tan(d * 0.017453292519943295d) * 0.996647189328169d);
        double atan2 = Math.atan(Math.tan(d3 * 0.017453292519943295d) * 0.996647189328169d);
        double cos = Math.cos(atan);
        double cos2 = Math.cos(atan2);
        double sin = Math.sin(atan);
        double sin2 = Math.sin(atan2);
        double d6 = cos * cos2;
        double d7 = sin * sin2;
        double d8 = d5;
        double d9 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (true) {
            if (i >= 20) {
                break;
            }
            double cos3 = Math.cos(d8);
            double sin3 = Math.sin(d8);
            double d12 = cos2 * sin3;
            double d13 = (cos * sin2) - ((sin * cos2) * cos3);
            double d14 = sin;
            double sqrt = Math.sqrt((d12 * d12) + (d13 * d13));
            double d15 = sin2;
            double d16 = d7 + (cos3 * d6);
            d10 = Math.atan2(sqrt, d16);
            double d17 = sqrt == 0.0d ? 0.0d : (sin3 * d6) / sqrt;
            double d18 = 1.0d - (d17 * d17);
            double d19 = d18 == 0.0d ? 0.0d : d16 - ((d7 * 2.0d) / d18);
            double d20 = 0.006739496756586903d * d18;
            double d21 = ((d20 / 16384.0d) * (((((320.0d - (175.0d * d20)) * d20) - 768.0d) * d20) + 4096.0d)) + 1.0d;
            double d22 = (d20 / 1024.0d) * ((d20 * (((74.0d - (47.0d * d20)) * d20) - 128.0d)) + 256.0d);
            double d23 = 2.0955066698943685E-4d * d18 * (((4.0d - (d18 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d24 = d19 * d19;
            d11 = d22 * sqrt * (d19 + ((d22 / 4.0d) * ((((d24 * 2.0d) - 1.0d) * d16) - ((((d22 / 6.0d) * d19) * (((sqrt * 4.0d) * sqrt) - 3.0d)) * ((d24 * 4.0d) - 3.0d)))));
            double d25 = d5 + ((1.0d - d23) * 0.0033528106718309896d * d17 * (d10 + (sqrt * d23 * (d19 + (d23 * d16 * (((2.0d * d19) * d19) - 1.0d))))));
            if (Math.abs((d25 - d8) / d25) < 1.0E-12d) {
                d9 = d21;
                break;
            }
            i++;
            d8 = d25;
            sin = d14;
            sin2 = d15;
            d9 = d21;
        }
        return (float) (d9 * 6356752.3142d * (d10 - d11));
    }

    public static String a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "699ab33b2200d5f039b5dfd1452308b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "699ab33b2200d5f039b5dfd1452308b0");
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append(a.format(d));
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(a.format(d2));
        return sb.toString();
    }

    public static String a(Coordinate coordinate) {
        Object[] objArr = {coordinate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "254535b58ccf4fd0328df82d2dafc1b2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "254535b58ccf4fd0328df82d2dafc1b2") : a(coordinate.getLatitude(), coordinate.getLongitude());
    }
}
