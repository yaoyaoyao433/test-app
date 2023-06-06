package com.meituan.android.common.locate.fusionlocation.utils;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99e668c2507479c1c5e28d8a02b7f498", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99e668c2507479c1c5e28d8a02b7f498")).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    public static double a(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16a3448afaee2dc2b76ad04a0060c500", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16a3448afaee2dc2b76ad04a0060c500")).doubleValue();
        }
        double d5 = (d * 3.141592653589793d) / 180.0d;
        double d6 = (d3 * 3.141592653589793d) / 180.0d;
        double sin = Math.sin((d5 - d6) / 2.0d);
        double sin2 = Math.sin((((d2 - d4) * 3.141592653589793d) / 180.0d) / 2.0d);
        return Math.asin(Math.sqrt((sin * sin) + (Math.cos(d5) * Math.cos(d6) * sin2 * sin2))) * 1.2756274E7d;
    }

    public static double a(List<Double> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86c90b9d0fec6a8a8df5f398a09faa54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86c90b9d0fec6a8a8df5f398a09faa54")).doubleValue();
        }
        double d = 0.0d;
        if (list == null || list.size() == 0) {
            return 0.0d;
        }
        for (Double d2 : list) {
            d += d2.doubleValue();
            i++;
        }
        return d / i;
    }

    public static Pair<Double, Double> a(double d, double d2, double d3, double d4, double d5) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c235911a92141f9369dfb6696a8686a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c235911a92141f9369dfb6696a8686a9");
        }
        double a = a(d3);
        double sin = Math.sin(a);
        double d6 = 1.0d - ((sin * sin) * 0.0066943799901413165d);
        double sqrt = 6378137.0d / Math.sqrt(d6);
        double b = (d - d3) / b(Math.atan(1.0d / ((0.9933056200098587d * sqrt) / d6)));
        double b2 = (d2 - d4) / b(Math.atan((1.0d / sqrt) / Math.cos(a)));
        return new Pair<>(Double.valueOf((Math.cos(d5) * b) + (Math.sin(d5) * b2)), Double.valueOf(((-Math.sin(d5)) * b) + (Math.cos(d5) * b2)));
    }

    public static double b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b23d061e96ac254bd68eb00cad88de7e", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b23d061e96ac254bd68eb00cad88de7e")).doubleValue() : (d * 180.0d) / 3.141592653589793d;
    }

    public static double b(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "142d079ebd2834e256dbd393af0cd3a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "142d079ebd2834e256dbd393af0cd3a9")).doubleValue();
        }
        double d5 = d4 - d2;
        double degrees = Math.toDegrees(Math.atan2(Math.sin(d5) * Math.cos(d3), (Math.cos(d) * Math.sin(d3)) - ((Math.sin(d) * Math.cos(d3)) * Math.cos(d5))));
        return degrees < 0.0d ? degrees + 360.0d : degrees;
    }

    public static double b(List<Double> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76c079105270ed875a9d3e560868a063", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76c079105270ed875a9d3e560868a063")).doubleValue();
        }
        double d = 360.0d;
        if (list == null || list.size() == 0) {
            return 360.0d;
        }
        double d2 = 0.0d;
        for (Double d3 : list) {
            double doubleValue = d3.doubleValue();
            if (doubleValue > d2) {
                d2 = doubleValue;
            }
            if (doubleValue < d) {
                d = doubleValue;
            }
        }
        return d2 - d;
    }

    public static Pair<Double, Double> b(double d, double d2, double d3, double d4, double d5) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1adfa8010b8490329d6066c419ea433b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1adfa8010b8490329d6066c419ea433b");
        }
        double cos = (Math.cos(d5) * d) - (Math.sin(d5) * d2);
        double sin = (Math.sin(d5) * d) + (Math.cos(d5) * d2);
        double a = a(d3);
        double sin2 = Math.sin(a);
        double d6 = 1.0d - ((sin2 * sin2) * 0.0066943799901413165d);
        double sqrt = 6378137.0d / Math.sqrt(d6);
        return new Pair<>(Double.valueOf(d3 + (cos * b(Math.atan(1.0d / ((0.9933056200098587d * sqrt) / d6))))), Double.valueOf(d4 + (sin * b(Math.atan((1.0d / sqrt) / Math.cos(a))))));
    }

    public static double c(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8f6acd8abfe82bf136f65a7147a4c70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8f6acd8abfe82bf136f65a7147a4c70")).doubleValue();
        }
        double d2 = d % 6.283185307179586d;
        if (d2 > 6.283185307179586d) {
            d2 -= 6.283185307179586d;
        }
        return d2 <= 0.0d ? d2 + 6.283185307179586d : d2;
    }

    public static double d(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9b2a49d1f30ff44748b1d088dedac07", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9b2a49d1f30ff44748b1d088dedac07")).doubleValue();
        }
        if (d < 0.0d) {
            double exp = Math.exp(d);
            return exp / (1.0d + exp);
        }
        return 1.0d / (Math.exp(-d) + 1.0d);
    }
}
