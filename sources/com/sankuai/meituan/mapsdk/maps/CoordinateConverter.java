package com.sankuai.meituan.mapsdk.maps;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CoordinateConverter {
    public static final int AUTONAVI = 5;
    public static final int BAIDU = 1;
    public static final int GOOGLE = 2;
    public static final int GPS = 3;
    public static final int SOSOMAP = 4;
    public static final int TENCENT = 6;
    private static double a = 52.35987755982988d;
    private static double b = 3.141592653589793d;
    private static double c = 6378245.0d;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static double d = 0.006693421622965943d;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CoordType {
    }

    public static double[] wgs84togcj02(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f79dd085601999d0ff9e332a18cee317", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f79dd085601999d0ff9e332a18cee317");
        }
        double d4 = d2 - 105.0d;
        double d5 = d3 - 35.0d;
        double a2 = a(d4, d5);
        double b2 = b(d4, d5);
        double d6 = (d3 / 180.0d) * b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        return new double[]{d2 + ((b2 * 180.0d) / (((c / sqrt) * Math.cos(d6)) * b)), d3 + ((a2 * 180.0d) / (((c * (1.0d - d)) / (d7 * sqrt)) * b))};
    }

    @Deprecated
    public static double[] gcj02towgs84(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d1fecc64dda5cac3498620fdb8d7c33", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d1fecc64dda5cac3498620fdb8d7c33");
        }
        double d4 = d2 - 105.0d;
        double d5 = d3 - 35.0d;
        double a2 = a(d4, d5);
        double b2 = b(d4, d5);
        double d6 = (d3 / 180.0d) * b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        return new double[]{(d2 * 2.0d) - (d2 + ((b2 * 180.0d) / (((c / sqrt) * Math.cos(d6)) * b))), (d3 * 2.0d) - (d3 + ((a2 * 180.0d) / (((c * (1.0d - d)) / (d7 * sqrt)) * b)))};
    }

    private static double a(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9be81dc20e77c6835f144b4f9a9345f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9be81dc20e77c6835f144b4f9a9345f")).doubleValue();
        }
        double d4 = d2 * 2.0d;
        return (-100.0d) + d4 + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (Math.sqrt(Math.abs(d2)) * 0.2d) + ((((Math.sin((d2 * 6.0d) * b) * 20.0d) + (Math.sin(d4 * b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(b * d3) * 20.0d) + (Math.sin((d3 / 3.0d) * b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * b) * 160.0d) + (Math.sin((d3 * b) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private static double b(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82570465c9167553d0d1eac8394425c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82570465c9167553d0d1eac8394425c3")).doubleValue();
        }
        double d4 = d2 * 0.1d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (Math.sqrt(Math.abs(d2)) * 0.1d) + ((((Math.sin((6.0d * d2) * b) * 20.0d) + (Math.sin((d2 * 2.0d) * b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(b * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * b) * 150.0d) + (Math.sin((d2 / 30.0d) * b) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static LatLng convert(int i, @NonNull LatLng latLng) {
        double[] dArr;
        char c2;
        double[] dArr2;
        char c3;
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14a29357c510279b665533b3e1f4e504", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14a29357c510279b665533b3e1f4e504");
        }
        int currentMapType = MapTypeUtils.getCurrentMapType();
        if (i == 1 && currentMapType != 1) {
            double d2 = latLng.longitude;
            double d3 = latLng.latitude;
            Object[] objArr2 = {Double.valueOf(d2), Double.valueOf(d3)};
            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "9087daefe843c60e9cbbf7370c4a4390", RobustBitConfig.DEFAULT_VALUE)) {
                dArr2 = (double[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "9087daefe843c60e9cbbf7370c4a4390");
                c3 = 0;
            } else {
                double d4 = d2 - 0.0065d;
                double d5 = d3 - 0.006d;
                double sqrt = Math.sqrt((d4 * d4) + (d5 * d5)) - (Math.sin(a * d5) * 2.0E-5d);
                double atan2 = Math.atan2(d5, d4) - (Math.cos(d4 * a) * 3.0E-6d);
                c3 = 0;
                dArr2 = new double[]{Math.cos(atan2) * sqrt, sqrt * Math.sin(atan2)};
            }
            return new LatLng(dArr2[1], dArr2[c3]);
        } else if (i == 1 || currentMapType != 1) {
            return latLng;
        } else {
            double d6 = latLng.longitude;
            double d7 = latLng.latitude;
            Object[] objArr3 = {Double.valueOf(d6), Double.valueOf(d7)};
            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "74e3d898b12ab29b8715bacce694cdd5", RobustBitConfig.DEFAULT_VALUE)) {
                dArr = (double[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "74e3d898b12ab29b8715bacce694cdd5");
                c2 = 0;
            } else {
                double sqrt2 = Math.sqrt((d6 * d6) + (d7 * d7)) + (Math.sin(a * d7) * 2.0E-5d);
                double atan22 = Math.atan2(d7, d6) + (Math.cos(d6 * a) * 3.0E-6d);
                c2 = 0;
                dArr = new double[]{(Math.cos(atan22) * sqrt2) + 0.0065d, (sqrt2 * Math.sin(atan22)) + 0.006d};
            }
            return new LatLng(dArr[1], dArr[c2]);
        }
    }
}
