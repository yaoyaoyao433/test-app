package com.sankuai.meituan.mapsdk.maps;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getMapSDKVersionName() {
        return "4.1207.11";
    }

    public static float calculateArea(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3245ec9a5dc29431293b043461f983b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3245ec9a5dc29431293b043461f983b")).floatValue();
        }
        double sin = Math.sin((latLng.latitude * 3.141592653589793d) / 180.0d) - Math.sin((latLng2.latitude * 3.141592653589793d) / 180.0d);
        double d = (latLng2.longitude - latLng.longitude) / 360.0d;
        if (d < 0.0d) {
            d += 1.0d;
        }
        return (float) (sin * 2.5560394669790553E14d * d);
    }

    public static float calculateLineDistance(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54910bf28ae707b9f7b8b7a5483ab251", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54910bf28ae707b9f7b8b7a5483ab251")).floatValue();
        }
        double d = (latLng.latitude * 3.141592653589793d) / 180.0d;
        double d2 = (latLng2.latitude * 3.141592653589793d) / 180.0d;
        return (float) (Math.floor(((Math.asin(Math.sqrt(Math.pow(Math.sin((d - d2) / 2.0d), 2.0d) + ((Math.cos(d) * Math.cos(d2)) * Math.pow(Math.sin((((latLng.longitude * 3.141592653589793d) / 180.0d) - ((latLng2.longitude * 3.141592653589793d) / 180.0d)) / 2.0d), 2.0d)))) * 1.2756274E7d) * 10000.0d) + 0.5d) / 10000.0d);
    }

    public static float calculateLineDistanceByMercator(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba0fa2bd6bf464c7e5a8ba0805c68fec", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba0fa2bd6bf464c7e5a8ba0805c68fec")).floatValue() : (float) calculateLineDistanceByMercatorDouble(latLng, latLng2);
    }

    public static double calculateLineDistanceByMercatorDouble(@NonNull LatLng latLng, @NonNull LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9c93bc3ea004ca791063f9f0a2cd451", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9c93bc3ea004ca791063f9f0a2cd451")).doubleValue();
        }
        double[] a = a(latLng);
        double[] a2 = a(latLng2);
        return Math.sqrt(((a[0] - a2[0]) * (a[0] - a2[0])) + ((a[1] - a2[1]) * (a[1] - a2[1])));
    }

    private static double[] a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57526ee57d0365d38bcfd8b976e5279e", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57526ee57d0365d38bcfd8b976e5279e");
        }
        double a = a(latLng.latitude, -85.0511287798066d, 85.0511287798066d);
        double a2 = a(latLng.longitude, -180.0d, 180.0d);
        double a3 = a(Math.sin(a * 0.017453292519943295d), -0.999999999999999d, 0.999999999999999d);
        return new double[]{Math.log((a3 + 1.0d) / (1.0d - a3)) * 3189068.5d, a2 * 6378137.0d * 0.017453292519943295d};
    }

    private static double a(double d, double d2, double d3) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95c532f9a4e647b2bfe84be0750c1fb8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95c532f9a4e647b2bfe84be0750c1fb8")).doubleValue() : Math.max(d2, Math.min(d, d3));
    }

    @Deprecated
    public static String latlngToStr(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8076b2e3e10d8a71307a7c630dcb681", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8076b2e3e10d8a71307a7c630dcb681");
        }
        return latLng.longitude + CommonConstant.Symbol.COMMA + latLng.latitude;
    }

    @Deprecated
    public static LatLng strToLatlng(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4756c1d16a63e434878630fc473e5f12", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4756c1d16a63e434878630fc473e5f12");
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        if (indexOf != -1 && str.substring(0, indexOf) != null) {
            int i = indexOf + 1;
            if (str.substring(i) != null) {
                try {
                    double doubleValue = Double.valueOf(str.substring(0, indexOf)).doubleValue();
                    double doubleValue2 = Double.valueOf(str.substring(i)).doubleValue();
                    if (Math.abs(doubleValue) <= 180.0d && Math.abs(doubleValue2) <= 90.0d) {
                        return new LatLng(doubleValue2, doubleValue);
                    }
                    return null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    @Deprecated
    public static List<LatLng> strToLatLngs(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33d388c42e957875a9581060dccdf1c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33d388c42e957875a9581060dccdf1c1");
        }
        if (TextUtils.isEmpty(str) || str.startsWith(CommonConstant.Symbol.DOT) || str.startsWith(CommonConstant.Symbol.COMMA) || str.startsWith(";") || str.endsWith(CommonConstant.Symbol.DOT) || str.endsWith(CommonConstant.Symbol.COMMA) || str.endsWith(";")) {
            return null;
        }
        String[] split = str.split(";");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            LatLng strToLatlng = strToLatlng(str2);
            if (strToLatlng != null) {
                arrayList.add(strToLatlng);
            }
        }
        return arrayList;
    }

    public static LatLng getFoot(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        Object[] objArr = {latLng, latLng2, latLng3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "773ea84ec1e0d95a72596b2f9a0e8c66", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "773ea84ec1e0d95a72596b2f9a0e8c66");
        }
        if (latLng.equals(latLng2)) {
            return latLng;
        }
        double d = latLng.longitude - latLng2.longitude;
        double d2 = latLng.latitude - latLng2.latitude;
        double d3 = (((latLng3.longitude - latLng.longitude) * d) + ((latLng3.latitude - latLng.latitude) * d2)) / ((d * d) + (d2 * d2));
        return new LatLng(latLng.latitude + (d2 * d3), latLng.longitude + (d3 * d));
    }

    public static int getColorWithAlpha(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a21148d3266d6f03b85e3d743341714", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a21148d3266d6f03b85e3d743341714")).intValue() : ((double) Math.abs(f - 1.0f)) < 1.0E-6d ? i : (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (i & ViewCompat.MEASURED_SIZE_MASK);
    }
}
