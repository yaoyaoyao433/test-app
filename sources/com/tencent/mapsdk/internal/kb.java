package com.tencent.mapsdk.internal;

import android.graphics.Point;
import android.location.Location;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kb {
    public static final int a = 256;
    public static final int b = 20;
    public static final double c = 4.272282972352698E7d;
    private static final int d = 20037508;
    private static final int e = 30240971;
    private static final double f = 111319.49077777778d;
    private static final double g = 0.017453292519943295d;
    private static final double h = 0.008726646259971648d;
    private static final double i = 114.59155902616465d;

    private static int a(double d2) {
        return (int) ((d2 * f) + 2.0037508E7d);
    }

    private static int a(int i2) {
        return i2 + d;
    }

    private static int b(int i2) {
        return i2 + e;
    }

    private static double c(double d2) {
        return (d2 * 3.141592653589793d) / 180.0d;
    }

    private static int c(int i2) {
        return i2 - d;
    }

    private static int d(int i2) {
        return i2 - e;
    }

    private static double e(int i2) {
        return (i2 - d) / f;
    }

    private static int b(double d2) {
        return (int) (((Math.log(Math.tan((d2 + 90.0d) * h)) / g) * f) + 3.0240971E7d);
    }

    private static double f(int i2) {
        return (Math.atan(Math.exp(((i2 - e) / f) * g)) * i) - 90.0d;
    }

    private static float a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null) {
            throw new IllegalArgumentException("point is null");
        }
        return (float) a(geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d, geoPoint2.getLatitudeE6() / 1000000.0d, geoPoint2.getLongitudeE6() / 1000000.0d);
    }

    private static void a(double d2, double d3, double d4, double d5, float[] fArr) {
        Location.distanceBetween(d2, d3, d4, d5, fArr);
        fArr[0] = (float) a(d2, d3, d4, d5);
    }

    private static double a(double d2, double d3, double d4, double d5) {
        double c2 = c(d4 - d2);
        double c3 = c(d5 - d3);
        double d6 = c2 / 2.0d;
        double d7 = c3 / 2.0d;
        double sin = (Math.sin(d6) * Math.sin(d6)) + (Math.sin(d7) * Math.sin(d7) * Math.cos(c(d2)) * Math.cos(c(d4)));
        return Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d * 6371.0d * 1000.0d;
    }

    private static void b(double d2, double d3, double d4, double d5, float[] fArr) {
        double d6;
        double d7;
        double d8 = d2 * g;
        double d9 = d4 * g;
        double d10 = (g * d5) - (d3 * g);
        double atan = Math.atan(Math.tan(d8) * 0.996647189328169d);
        double atan2 = Math.atan(Math.tan(d9) * 0.996647189328169d);
        double cos = Math.cos(atan);
        double cos2 = Math.cos(atan2);
        double sin = Math.sin(atan);
        double sin2 = Math.sin(atan2);
        double d11 = cos * cos2;
        double d12 = sin * sin2;
        double d13 = d10;
        double d14 = 0.0d;
        double d15 = 0.0d;
        double d16 = 0.0d;
        double d17 = 0.0d;
        double d18 = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= 20) {
                d6 = sin;
                d7 = sin2;
                break;
            }
            d14 = Math.cos(d13);
            d16 = Math.sin(d13);
            double d19 = cos2 * d16;
            double d20 = (cos * sin2) - ((sin * cos2) * d14);
            d6 = sin;
            double sqrt = Math.sqrt((d19 * d19) + (d20 * d20));
            d7 = sin2;
            double d21 = d12 + (d11 * d14);
            d17 = Math.atan2(sqrt, d21);
            double d22 = sqrt == 0.0d ? 0.0d : (d11 * d16) / sqrt;
            double d23 = 1.0d - (d22 * d22);
            double d24 = d23 == 0.0d ? 0.0d : d21 - ((d12 * 2.0d) / d23);
            double d25 = 0.006739496756586903d * d23;
            double d26 = ((d25 / 16384.0d) * (((((320.0d - (175.0d * d25)) * d25) - 768.0d) * d25) + 4096.0d)) + 1.0d;
            double d27 = (d25 / 1024.0d) * ((d25 * (((74.0d - (47.0d * d25)) * d25) - 128.0d)) + 256.0d);
            double d28 = 2.0955066698943685E-4d * d23 * (((4.0d - (d23 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d29 = d24 * d24;
            d18 = d27 * sqrt * (d24 + ((d27 / 4.0d) * ((((d29 * 2.0d) - 1.0d) * d21) - ((((d27 / 6.0d) * d24) * (((sqrt * 4.0d) * sqrt) - 3.0d)) * ((d29 * 4.0d) - 3.0d)))));
            double d30 = d10 + ((1.0d - d28) * 0.0033528106718309896d * d22 * (d17 + (sqrt * d28 * (d24 + (d28 * d21 * (((2.0d * d24) * d24) - 1.0d))))));
            if (Math.abs((d30 - d13) / d30) < 1.0E-12d) {
                d15 = d26;
                break;
            }
            i2++;
            d13 = d30;
            sin = d6;
            sin2 = d7;
            d15 = d26;
        }
        fArr[0] = (float) (d15 * 6356752.3142d * (d17 - d18));
        if (fArr.length > 1) {
            double d31 = cos * d7;
            fArr[1] = (float) (((float) Math.atan2(cos2 * d16, d31 - ((d6 * cos2) * d14))) * 57.29577951308232d);
            if (fArr.length > 2) {
                fArr[2] = (float) (((float) Math.atan2(cos * d16, ((-d6) * cos2) + (d31 * d14))) * 57.29577951308232d);
            }
        }
    }

    private static GeoPoint b(int i2, int i3) {
        return new GeoPoint((int) (f(i3) * 1000000.0d), (int) (e(i2) * 1000000.0d));
    }

    private static Point b(GeoPoint geoPoint) {
        if (geoPoint == null) {
            throw new IllegalArgumentException("point is null");
        }
        return new Point(a(geoPoint.getLongitudeE6() / 1000000.0d), b(geoPoint.getLatitudeE6() / 1000000.0d));
    }

    private static GeoPoint c(int i2, int i3) {
        return new GeoPoint((int) (f(i3 + e) * 1000000.0d), (int) (e(i2 + d) * 1000000.0d));
    }

    private static Point c(GeoPoint geoPoint) {
        if (geoPoint == null) {
            throw new IllegalArgumentException("point is null");
        }
        return new Point(a(geoPoint.getLongitudeE6() / 1000000.0d) - d, b(geoPoint.getLatitudeE6() / 1000000.0d) - e);
    }

    private static Point d(int i2, int i3) {
        return new Point(a(i2 / 1000000.0d) - d, b(i3 / 1000000.0d) - e);
    }

    private static Point d(GeoPoint geoPoint) {
        if (geoPoint == null) {
            throw new IllegalArgumentException("point is null");
        }
        Point point = new Point();
        point.x = (int) ((((geoPoint.getLongitudeE6() / 1000000.0d) + 180.0d) / 360.0d) * 2.68435456E8d);
        point.y = (int) (((180.0d - (Math.log(Math.tan(((geoPoint.getLatitudeE6() / 1000000.0d) + 90.0d) * h)) / 0.01745329238474369d)) / 360.0d) * 2.68435456E8d);
        return point;
    }

    public static GeoPoint a(int i2, int i3) {
        return new GeoPoint((int) (Math.toDegrees((Math.atan(Math.exp(3.141592653589793d - (i3 / 4.272282972352698E7d))) - 0.7853981633974483d) * 2.0d) * 1000000.0d), (int) (Math.toDegrees((i2 / 4.272282972352698E7d) - 3.141592653589793d) * 1000000.0d));
    }

    private static float b(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null) {
            return 0.0f;
        }
        float[] fArr = new float[10];
        double latitudeE6 = geoPoint.getLatitudeE6() / 1000000.0d;
        double longitudeE6 = geoPoint.getLongitudeE6() / 1000000.0d;
        double latitudeE62 = geoPoint2.getLatitudeE6() / 1000000.0d;
        double longitudeE62 = geoPoint2.getLongitudeE6() / 1000000.0d;
        Location.distanceBetween(latitudeE6, longitudeE6, latitudeE62, longitudeE62, fArr);
        fArr[0] = (float) a(latitudeE6, longitudeE6, latitudeE62, longitudeE62);
        return fArr[1];
    }

    public static LatLng a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        return new LatLng(geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d);
    }

    public static List<LatLng> a(List<GeoPoint> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (GeoPoint geoPoint : list) {
            arrayList.add(a(geoPoint));
        }
        return arrayList;
    }
}
