package com.sankuai.common.utils;

import android.graphics.PointF;
import android.location.Location;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DistanceFormat {
    public static final float DEFAULT_DISTANCE = Float.MAX_VALUE;
    public static final float DEFAULT_LAT = 0.0f;
    public static final float DEFAULT_LNG = 0.0f;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean checkGeoPoint(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2565e3e1b2e08347ef609d6bf633440", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2565e3e1b2e08347ef609d6bf633440")).booleanValue() : (d == 0.0d && d2 == 0.0d) ? false : true;
    }

    public static float getDistance(String str, Location location) {
        Object[] objArr = {str, location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ea3e64192dbf5838a5c6c9aa3ba5012", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ea3e64192dbf5838a5c6c9aa3ba5012")).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Float.MAX_VALUE;
        }
        String[] split = str.split(";");
        if (split.length > 1) {
            return getRecentDistance(split, location);
        }
        return distanceTo(str, location);
    }

    public static float getRecentDistance(String[] strArr, Location location) {
        Object[] objArr = {strArr, location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe026a43a3257f8dfb3533e11d65327b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe026a43a3257f8dfb3533e11d65327b")).floatValue();
        }
        if (location == null) {
            return Float.MAX_VALUE;
        }
        int length = strArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = distanceTo(strArr[i], location);
        }
        return Utils.getMinInArray(fArr);
    }

    public static String getRecentPoint(String str, Location location) {
        Object[] objArr = {str, location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ea6bd4743898921fc6a390fbd57dbc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ea6bd4743898921fc6a390fbd57dbc6");
        }
        String[] split = str.split(";");
        int length = split.length;
        if (length <= 1) {
            return str;
        }
        if (location == null) {
            return split[0];
        }
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = distanceTo(split[i], location);
        }
        return split[getMinIndexInArray(fArr)];
    }

    public static int getMinIndexInArray(float[] fArr) {
        int i = 0;
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b3df7ebfa9ef246f41c4140a17b9c36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b3df7ebfa9ef246f41c4140a17b9c36")).intValue();
        }
        int length = fArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (fArr[i] > fArr[i2]) {
                i = i2;
            }
        }
        return i;
    }

    public static float distanceTo(String str, Location location) {
        Object[] objArr = {str, location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92a3118f57f070854141f4584fcd4c09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92a3118f57f070854141f4584fcd4c09")).floatValue();
        }
        Location location2 = new Location("gps");
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (location == null || !checkGeoPoint(str)) {
            return Float.MAX_VALUE;
        }
        try {
            location2.setLatitude(Double.valueOf(split[0]).doubleValue());
            location2.setLongitude(Double.valueOf(split[1]).doubleValue());
            return (float) MapUtils.getDistanceofPoint(location, location2);
        } catch (Exception unused) {
            return Float.MAX_VALUE;
        }
    }

    public static float getDistance(double d, double d2, Location location) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd71eee05dc75cb19b6a16394a9f5320", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd71eee05dc75cb19b6a16394a9f5320")).floatValue();
        }
        Location location2 = new Location("gps");
        location2.setLatitude(d);
        location2.setLongitude(d2);
        if (location != null) {
            return (float) MapUtils.getDistanceofPoint(location2, location);
        }
        return Float.MAX_VALUE;
    }

    public static float distanceTo(PointF pointF, Location location) {
        Object[] objArr = {pointF, location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a697908a0e2236a366cab959576d93d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a697908a0e2236a366cab959576d93d")).floatValue();
        }
        Location location2 = new Location("gps");
        if (checkGeoPoint(pointF.x, pointF.y)) {
            location2.setLatitude(pointF.x);
            location2.setLongitude(pointF.y);
            return (float) MapUtils.getDistanceofPoint(location, location2);
        }
        return Float.MAX_VALUE;
    }

    public static boolean checkGeoPoint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1cf0e72b313536b9e0617e5c7b2b327", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1cf0e72b313536b9e0617e5c7b2b327")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length < 2 || TextUtils.equals("", split[0]) || TextUtils.equals("", split[1])) {
            return false;
        }
        try {
            return checkGeoPoint(Double.valueOf(split[0]).doubleValue(), Double.valueOf(split[1]).doubleValue());
        } catch (Exception unused) {
            return false;
        }
    }

    public static String formatShowDealDistance(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54a0d27f3aa74222e11a98c209f57a19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54a0d27f3aa74222e11a98c209f57a19");
        }
        if (f == Float.MAX_VALUE) {
            return "";
        }
        if (f < 500.0f) {
            return "<500m";
        }
        if (f < 1000.0f) {
            return ((int) f) + "m";
        } else if (f < 100000.0f) {
            return new DecimalFormat("0.1").format(f / 1000.0f) + "km";
        } else {
            return new DecimalFormat("0").format(f / 1000.0f) + "km";
        }
    }

    public static String formatDistance(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93e4c72526ff112ce923689e065cf5f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93e4c72526ff112ce923689e065cf5f4");
        }
        if (f == Float.MAX_VALUE) {
            return "";
        }
        if (f < 500.0f) {
            return "<0.5km";
        }
        if (f < 1000.0f) {
            return "<1km";
        }
        String[] formatDistance = Utils.formatDistance(Double.valueOf(f));
        return formatDistance[1] + formatDistance[0];
    }
}
