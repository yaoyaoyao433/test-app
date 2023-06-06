package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.Util;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kt {
    public static double a(double d) {
        double d2 = d % 360.0d;
        return d2 > 180.0d ? d2 - 360.0d : d2 < -180.0d ? d2 + 360.0d : d2;
    }

    public static double a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((((d2 - d4) * d5) + ((d3 - d) * d6)) + (d * d4)) - (d3 * d2);
    }

    private static double b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    private static double c(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    private static double a(double d, int i) {
        try {
            return new BigDecimal(d).setScale(i, 4).doubleValue();
        } catch (Exception unused) {
            return d;
        }
    }

    private static float a(float f, int i) {
        try {
            return new BigDecimal(f).setScale(i, 4).floatValue();
        } catch (Exception unused) {
            return f;
        }
    }

    private static PointF a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        if (pointF2.x == pointF.x || pointF4.x == pointF3.x) {
            return null;
        }
        float f = (pointF2.y - pointF.y) / (pointF2.x - pointF.x);
        float f2 = (pointF4.y - pointF3.y) / (pointF4.x - pointF3.x);
        if (f == f2) {
            return null;
        }
        float f3 = ((pointF.y * pointF2.x) - (pointF2.y * pointF.x)) / (pointF2.x - pointF.x);
        float f4 = ((pointF3.y * pointF4.x) - (pointF4.y * pointF3.x)) / (pointF4.x - pointF3.x);
        float f5 = (f4 - f3) / (f - f2);
        return new PointF(f5, (f2 * f5) + f4);
    }

    private static Rect a(GeoPoint geoPoint, Rect rect) {
        int max = Math.max(Math.abs(rect.left - geoPoint.getLongitudeE6()), Math.abs(rect.right - geoPoint.getLongitudeE6()));
        int max2 = Math.max(Math.abs(rect.top - geoPoint.getLatitudeE6()), Math.abs(rect.bottom - geoPoint.getLatitudeE6()));
        return new Rect(geoPoint.getLongitudeE6() - max2, geoPoint.getLatitudeE6() - max, geoPoint.getLongitudeE6() + max2, geoPoint.getLatitudeE6() + max);
    }

    private static Rect a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null || geoPoint.equals(geoPoint2)) {
            return null;
        }
        int abs = Math.abs(geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6());
        int abs2 = Math.abs(geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6());
        return new Rect(geoPoint.getLongitudeE6() - abs, geoPoint.getLatitudeE6() - abs2, geoPoint.getLongitudeE6() + abs, geoPoint.getLatitudeE6() + abs2);
    }

    private static GeoPoint a(GeoPoint geoPoint, GeoPoint geoPoint2, GeoPoint geoPoint3) {
        int latitudeE6 = geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6();
        if (latitudeE6 == 0 && longitudeE6 == 0) {
            return null;
        }
        double latitudeE62 = (((geoPoint3.getLatitudeE6() - geoPoint.getLatitudeE6()) * latitudeE6) + ((geoPoint3.getLongitudeE6() - geoPoint.getLongitudeE6()) * longitudeE6)) / ((latitudeE6 * latitudeE6) + (longitudeE6 * longitudeE6));
        if (latitudeE62 < 0.0d) {
            return new GeoPoint(geoPoint);
        }
        if (latitudeE62 > 1.0d) {
            return new GeoPoint(geoPoint2);
        }
        return new GeoPoint(geoPoint.getLatitudeE6() + ((int) (latitudeE6 * latitudeE62)), geoPoint.getLongitudeE6() + ((int) (longitudeE6 * latitudeE62)));
    }

    private static double[] a(LatLng latLng, LatLng latLng2) {
        double d;
        double d2 = Double.NaN;
        if (Math.abs(latLng.longitude - latLng2.longitude) < 1.0E-6d) {
            d = Double.NaN;
        } else if (Math.abs(latLng.latitude - latLng2.latitude) < 1.0E-6d) {
            d2 = 0.0d;
            d = latLng.latitude;
        } else {
            d2 = (latLng2.latitude - latLng.latitude) / (latLng2.longitude - latLng.longitude);
            d = ((latLng2.longitude * latLng.latitude) - (latLng.longitude * latLng2.latitude)) / (latLng2.longitude - latLng.latitude);
        }
        return new double[]{d2, d};
    }

    public static double a(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3) {
        double a = a(coordinate, coordinate2);
        double a2 = a(coordinate, coordinate3);
        double a3 = a(coordinate2, coordinate3);
        double d = a + a2;
        if (d == a3) {
            return 0.0d;
        }
        if (a3 <= 1.0E-6d) {
            return a;
        }
        double d2 = a2 * a2;
        double d3 = a * a;
        double d4 = a3 * a3;
        if (d2 >= d3 + d4) {
            return a;
        }
        if (d3 >= d2 + d4) {
            return a2;
        }
        double d5 = (d + a3) / 2.0d;
        return (Math.sqrt((((d5 - a) * d5) * (d5 - a2)) * (d5 - a3)) * 2.0d) / a3;
    }

    private static double[] b(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d;
        double[] a = a(latLng2, latLng3);
        double d2 = Double.NaN;
        if (Double.isNaN(a[0])) {
            d = latLng.latitude;
            d2 = 0.0d;
        } else if (a[0] == 0.0d) {
            d = Double.NaN;
        } else {
            d2 = (-1.0d) / a[0];
            d = latLng.latitude + ((1.0d / a[0]) * latLng.longitude);
        }
        return new double[]{d2, d};
    }

    public static LatLng a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d;
        double d2;
        double[] a = a(latLng2, latLng3);
        if (Double.isNaN(a[0])) {
            d2 = latLng2.longitude;
            d = latLng.latitude;
        } else if (a[0] == 0.0d) {
            double d3 = latLng.longitude;
            double d4 = latLng2.latitude;
            d2 = d3;
            d = d4;
        } else {
            double d5 = a[0];
            double d6 = d5 * d5;
            double d7 = (((latLng2.longitude * d6) + ((latLng.latitude - latLng2.latitude) * d5)) + latLng.longitude) / (d6 + 1.0d);
            d = (d5 * (d7 - latLng2.longitude)) + latLng2.latitude;
            d2 = d7;
        }
        return new LatLng(d, d2);
    }

    public static LatLng a(LatLng latLng, LatLng latLng2, int i) {
        double d;
        double d2;
        if (latLng2.longitude > latLng.longitude) {
            d = latLng.longitude - i;
        } else {
            d = latLng.longitude + i;
        }
        if (latLng2.latitude > latLng.latitude) {
            d2 = latLng.latitude - i;
        } else {
            d2 = latLng.latitude + i;
        }
        return new LatLng(d2, d);
    }

    public static double a(Coordinate coordinate, Coordinate coordinate2) {
        double x = coordinate.x() - coordinate2.x();
        double y = coordinate.y() - coordinate2.y();
        return Math.sqrt((x * x) + (y * y));
    }

    public static boolean a(LatLng latLng, double d, LatLng latLng2, LatLng latLng3) {
        if (a((Coordinate) latLng, (Coordinate) latLng2, (Coordinate) latLng3) - d > 1.0E-6d) {
            return false;
        }
        LatLng a = a(latLng, latLng2, latLng3);
        return (a((Coordinate) latLng2, (Coordinate) latLng3) - a((Coordinate) a, (Coordinate) latLng2)) - a((Coordinate) a, (Coordinate) latLng3) < 1.0E-6d;
    }

    private static boolean c(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        return (a((Coordinate) latLng2, (Coordinate) latLng3) - a((Coordinate) latLng, (Coordinate) latLng2)) - a((Coordinate) latLng, (Coordinate) latLng3) < 1.0E-6d;
    }

    private static double b(Coordinate coordinate, Coordinate coordinate2) {
        return (coordinate.y() - coordinate2.y()) / (coordinate.x() - coordinate2.x());
    }

    private static double c(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3) {
        return Math.atan((a(coordinate, coordinate2) / 2.0d) / a(coordinate3, coordinate, coordinate2)) * 2.0d;
    }

    private static String a() {
        byte[] bArr = new byte[20];
        new SecureRandom().nextBytes(bArr);
        return new String(bArr);
    }

    private static int a(int i) {
        int i2 = i - 0;
        if (i2 > 0) {
            return new SecureRandom().nextInt(i2) + 0;
        }
        return i2 == 0 ? 0 : 0;
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? str : Util.getMD5String(str.getBytes());
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        int i;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
        } catch (IOException e) {
            e = e;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[10485760];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            int length = 40 - bigInteger.length();
            if (length > 0) {
                for (i = 0; i < length; i++) {
                    bigInteger = "0".concat(String.valueOf(bigInteger));
                }
            }
            kd.a((Closeable) fileInputStream);
            return bigInteger;
        } catch (IOException e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            kd.a((Closeable) fileInputStream2);
            return "";
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            kd.a((Closeable) fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            kd.a((Closeable) fileInputStream);
            throw th;
        }
    }

    public static double a(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3, Coordinate coordinate4) {
        double x = (coordinate2.x() - coordinate.x()) * 2.0d;
        double y = (coordinate2.y() - coordinate.y()) * 2.0d;
        double x2 = (((coordinate2.x() * coordinate2.x()) + (coordinate2.y() * coordinate2.y())) - (coordinate.x() * coordinate.x())) - (coordinate.y() * coordinate.y());
        double x3 = (coordinate3.x() - coordinate2.x()) * 2.0d;
        double y2 = (coordinate3.y() - coordinate2.y()) * 2.0d;
        double x4 = (((coordinate3.x() * coordinate3.x()) + (coordinate3.y() * coordinate3.y())) - (coordinate2.x() * coordinate2.x())) - (coordinate2.y() * coordinate2.y());
        double d = (y2 * x) - (y * x3);
        double d2 = ((x2 * y2) - (x4 * y)) / d;
        double d3 = ((x * x4) - (x3 * x2)) / d;
        coordinate4.setX(d2);
        coordinate4.setY(d3);
        return Math.sqrt(Math.pow(coordinate.x() - d2, 2.0d) + Math.pow(coordinate.y() - d3, 2.0d));
    }

    public static double a(Coordinate coordinate, Coordinate coordinate2, double d, boolean z, Coordinate coordinate3) {
        double a = (a(coordinate, coordinate2) * 0.5d) / Math.sin(b(0.5d * d));
        double x = (coordinate.x() + coordinate2.x()) / 2.0d;
        double y = (coordinate.y() + coordinate2.y()) / 2.0d;
        double sqrt = Math.sqrt((Math.pow(a, 2.0d) / (Math.pow(coordinate.x() - coordinate2.x(), 2.0d) + Math.pow(coordinate.y() - coordinate2.y(), 2.0d))) - 0.25d);
        double y2 = (coordinate.y() - coordinate2.y()) * sqrt;
        double x2 = (coordinate2.x() - coordinate.x()) * sqrt;
        if (d - 90.0d <= 1.0E-6d) {
            y2 = -y2;
            x2 = -x2;
        }
        if (Double.isNaN(y2)) {
            y2 = 0.0d;
        }
        if (Double.isNaN(x2)) {
            x2 = 0.0d;
        }
        double d2 = z ? x + y2 : x - y2;
        double d3 = z ? y + x2 : y - x2;
        coordinate3.setX(d2);
        coordinate3.setY(d3);
        return a;
    }

    private static double c(Coordinate coordinate, Coordinate coordinate2) {
        return (Math.atan((coordinate.y() - coordinate2.y()) / (coordinate.x() - coordinate2.x())) * 180.0d) / 3.141592653589793d;
    }

    public static double b(Coordinate coordinate, Coordinate coordinate2, Coordinate coordinate3) {
        return Math.atan((a(coordinate, coordinate2) / 2.0d) / a(coordinate3, coordinate, coordinate2)) * 2.0d * a(coordinate, coordinate3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
        if (r14 > 0.0d) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
        if (r14 < 0.0d) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r36.callback(r3, new android.util.Pair<>(java.lang.Double.valueOf(r4), java.lang.Double.valueOf(r6)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate> void a(T r30, double r31, T r33, T r34, boolean r35, com.tencent.map.tools.IndexCallback<android.util.Pair<java.lang.Double, java.lang.Double>> r36) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kt.a(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate, double, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate, boolean, com.tencent.map.tools.IndexCallback):void");
    }
}
