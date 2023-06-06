package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kp {
    private static double a(int i, int i2, int i3, float f) {
        double d = 1.0d - f;
        return (d * d * i) + (2.0f * f * d * i2) + (f * f * i3);
    }

    private static float a(int i, int i2, int i3, int i4, float f) {
        float f2 = (i2 - i) * 3.0f;
        float f3 = ((i3 - i2) * 3.0f) - f2;
        float f4 = f * f;
        return ((((i4 - i) - f2) - f3) * f4 * f) + (f3 * f4) + (f2 * f) + i;
    }

    private static int a(List<GeoPoint> list, int[] iArr, eq eqVar) {
        int size;
        int i = 0;
        if (list != null && (size = list.size()) >= 2) {
            int i2 = 0;
            while (i < size - 1) {
                int i3 = i + 1;
                fm a = eqVar.a(list.get(i));
                fm a2 = eqVar.a(list.get(i3));
                double d = a2.a - a.a;
                double d2 = a2.b - a.b;
                int sqrt = (int) Math.sqrt((d * d) + (d2 * d2));
                int max = sqrt / Math.max(4, (sqrt / 500) * 4);
                iArr[i] = max;
                i2 += max;
                i = i3;
            }
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.tencent.map.lib.models.GeoPoint> a(java.util.List<com.tencent.map.lib.models.GeoPoint> r16, int r17) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kp.a(java.util.List, int):java.util.List");
    }

    private static GeoPoint a(List<GeoPoint> list, float f) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        if (size == 3 || size == 4) {
            if (size == 3) {
                GeoPoint geoPoint = list.get(0);
                GeoPoint geoPoint2 = list.get(1);
                GeoPoint geoPoint3 = list.get(2);
                if (geoPoint == null || geoPoint2 == null || geoPoint3 == null) {
                    return null;
                }
                return new GeoPoint((int) a(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6(), geoPoint3.getLatitudeE6(), f), (int) a(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6(), geoPoint3.getLongitudeE6(), f));
            }
            GeoPoint geoPoint4 = list.get(0);
            GeoPoint geoPoint5 = list.get(1);
            GeoPoint geoPoint6 = list.get(2);
            GeoPoint geoPoint7 = list.get(3);
            if (geoPoint4 == null || geoPoint5 == null || geoPoint6 == null || geoPoint7 == null) {
                return null;
            }
            return new GeoPoint((int) a(geoPoint4.getLatitudeE6(), geoPoint5.getLatitudeE6(), geoPoint6.getLatitudeE6(), geoPoint7.getLatitudeE6(), f), (int) a(geoPoint4.getLongitudeE6(), geoPoint5.getLongitudeE6(), geoPoint6.getLongitudeE6(), geoPoint7.getLongitudeE6(), f));
        }
        return null;
    }

    private static double a(fm fmVar, fm fmVar2) {
        double d = fmVar2.a - fmVar.a;
        double d2 = fmVar2.b - fmVar.b;
        return Math.sqrt((d * d) + (d2 * d2));
    }
}
