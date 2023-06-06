package com.meituan.android.common.locate.fusionlocation.featues;

import android.location.GnssStatus;
import android.os.Build;
import android.util.Pair;
import com.meituan.android.common.locate.controller.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double a(List<Double> list) {
        double d;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b959aa6d24698abccd9b03c484bc827", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b959aa6d24698abccd9b03c484bc827")).doubleValue();
        }
        if (list.size() > 1) {
            Collections.sort(list);
            d = (360.0d - list.get(list.size() - 1).doubleValue()) + list.get(0).doubleValue();
            for (int i = 1; i < list.size(); i++) {
                double doubleValue = list.get(i).doubleValue() - list.get(i - 1).doubleValue();
                if (doubleValue > d) {
                    d = doubleValue;
                }
            }
        } else {
            d = 360.0d;
        }
        return 360.0d - d;
    }

    public static int a(int i, int i2) {
        if (i < 4) {
            return 1;
        }
        return i2 < 4 ? 2 : 3;
    }

    public static HashMap<String, Object> a() {
        double d;
        long j;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        double d7;
        double d8;
        double d9;
        List<Pair<GnssStatus, Long>> b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c01309bed91ff20c11f7d1d7d180573", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c01309bed91ff20c11f7d1d7d180573");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        double d10 = 10.0d;
        if (!f.a().e() || !com.meituan.android.common.locate.fusionlocation.controller.a.a().d() || (b = com.meituan.android.common.locate.fusionlocation.a.a().b()) == null || b.size() <= 0) {
            d = 0.0d;
            j = 0;
        } else {
            Pair<GnssStatus, Long> pair = b.get(b.size() - 1);
            GnssStatus gnssStatus = (GnssStatus) pair.first;
            long longValue = ((Long) pair.second).longValue();
            if (Build.VERSION.SDK_INT >= 26) {
                int satelliteCount = gnssStatus.getSatelliteCount();
                int[] iArr = new int[satelliteCount];
                double[] dArr = new double[satelliteCount];
                double[] dArr2 = new double[satelliteCount];
                double[] dArr3 = new double[satelliteCount];
                int[] iArr2 = new int[satelliteCount];
                double[] dArr4 = new double[satelliteCount];
                int[] iArr3 = new int[satelliteCount];
                int[] iArr4 = new int[satelliteCount];
                for (int i6 = 0; i6 < satelliteCount; i6++) {
                    iArr[i6] = gnssStatus.getSvid(i6);
                    dArr[i6] = gnssStatus.getElevationDegrees(i6);
                    dArr2[i6] = gnssStatus.getAzimuthDegrees(i6);
                    dArr3[i6] = (dArr2[i6] * 3.141592653589793d) / 180.0d;
                    iArr2[i6] = gnssStatus.getConstellationType(i6);
                    dArr4[i6] = gnssStatus.getCn0DbHz(i6);
                    iArr3[i6] = dArr4[i6] > 0.0d ? 1 : 0;
                    iArr4[i6] = gnssStatus.usedInFix(i6) ? 1 : 0;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                j = longValue;
                double d11 = 0.0d;
                double d12 = 0.0d;
                double d13 = 0.0d;
                int i7 = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                int i8 = 0;
                d7 = Double.MIN_VALUE;
                d8 = Double.MIN_VALUE;
                d9 = Double.MIN_VALUE;
                while (i7 < satelliteCount) {
                    int i9 = satelliteCount;
                    if (iArr4[i7] == 1) {
                        i2++;
                        if (dArr4[i7] > d7) {
                            d7 = dArr4[i7];
                        }
                        arrayList.add(Double.valueOf(dArr2[i7]));
                        d11 += dArr4[i7];
                    }
                    if (iArr4[i7] == 1 && iArr2[i7] == 1) {
                        i4++;
                        if (dArr4[i7] > d8) {
                            d8 = dArr4[i7];
                        }
                        arrayList2.add(Double.valueOf(dArr2[i7]));
                        d12 += dArr4[i7];
                        if (dArr4[i7] > 25.0d) {
                            i8++;
                        }
                    }
                    if (iArr3[i7] == 1) {
                        i3++;
                        if (dArr4[i7] > d9) {
                            d9 = dArr4[i7];
                        }
                        arrayList3.add(Double.valueOf(dArr2[i7]));
                        d13 += dArr4[i7];
                    }
                    i7++;
                    satelliteCount = i9;
                }
                int i10 = satelliteCount;
                double d14 = i2 > 0 ? d11 / i2 : 0.0d;
                d6 = i4 > 0 ? d12 / i4 : 0.0d;
                double d15 = i3 > 0 ? d13 / i3 : 0.0d;
                d2 = a(arrayList);
                d3 = a(arrayList2);
                i = i8;
                i5 = i10;
                double d16 = d15;
                d = d14;
                d5 = a(arrayList3);
                d10 = com.meituan.android.common.locate.posquality.a.a(gnssStatus);
                d4 = d16;
                hashMap.put("gnssStatusTimeStamp", Long.valueOf(j));
                hashMap.put("gnssStatusScore", Double.valueOf(d10));
                hashMap.put("totalSateCount", Integer.valueOf(i5));
                hashMap.put("usedGoodSnrGpsSateCount", Integer.valueOf(i));
                hashMap.put("usedSateCount", Integer.valueOf(i2));
                hashMap.put("usedSateCn0DbHzMax", Double.valueOf(d7));
                hashMap.put("usedSateCn0DbHzAvg", Double.valueOf(d));
                hashMap.put("usedSateMaxAzimuth", Double.valueOf(d2));
                hashMap.put("usedGpsSateCount", Integer.valueOf(i4));
                hashMap.put("usedGpsSateCn0DbHzMax", Double.valueOf(d8));
                hashMap.put("usedGpsSateCn0DbHzAvg", Double.valueOf(d6));
                hashMap.put("usedGpsSateMaxAzimuth", Double.valueOf(d3));
                hashMap.put("seenSateCount", Integer.valueOf(i3));
                hashMap.put("seenSateCn0DbHzMax", Double.valueOf(d9));
                hashMap.put("seenSateCn0DbHzAvg", Double.valueOf(d4));
                hashMap.put("seenSateMaxAzimuth", Double.valueOf(d5));
                return hashMap;
            }
            j = longValue;
            d = 0.0d;
        }
        d2 = d;
        d3 = d2;
        d4 = d3;
        d5 = d4;
        d6 = d5;
        i = 0;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        d7 = Double.MIN_VALUE;
        d8 = Double.MIN_VALUE;
        d9 = Double.MIN_VALUE;
        hashMap.put("gnssStatusTimeStamp", Long.valueOf(j));
        hashMap.put("gnssStatusScore", Double.valueOf(d10));
        hashMap.put("totalSateCount", Integer.valueOf(i5));
        hashMap.put("usedGoodSnrGpsSateCount", Integer.valueOf(i));
        hashMap.put("usedSateCount", Integer.valueOf(i2));
        hashMap.put("usedSateCn0DbHzMax", Double.valueOf(d7));
        hashMap.put("usedSateCn0DbHzAvg", Double.valueOf(d));
        hashMap.put("usedSateMaxAzimuth", Double.valueOf(d2));
        hashMap.put("usedGpsSateCount", Integer.valueOf(i4));
        hashMap.put("usedGpsSateCn0DbHzMax", Double.valueOf(d8));
        hashMap.put("usedGpsSateCn0DbHzAvg", Double.valueOf(d6));
        hashMap.put("usedGpsSateMaxAzimuth", Double.valueOf(d3));
        hashMap.put("seenSateCount", Integer.valueOf(i3));
        hashMap.put("seenSateCn0DbHzMax", Double.valueOf(d9));
        hashMap.put("seenSateCn0DbHzAvg", Double.valueOf(d4));
        hashMap.put("seenSateMaxAzimuth", Double.valueOf(d5));
        return hashMap;
    }
}
