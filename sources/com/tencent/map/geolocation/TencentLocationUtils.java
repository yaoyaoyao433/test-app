package com.tencent.map.geolocation;

import android.content.Context;
import com.tencent.map.geolocation.a.b.h;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentLocationUtils {
    private TencentLocationUtils() {
        throw new UnsupportedOperationException();
    }

    public static double distanceBetween(TencentLocation tencentLocation, TencentLocation tencentLocation2) {
        if (tencentLocation == null || tencentLocation2 == null) {
            throw new NullPointerException();
        }
        return h.a(tencentLocation.getLatitude(), tencentLocation.getLongitude(), tencentLocation2.getLatitude(), tencentLocation2.getLongitude());
    }

    public static double distanceBetween(double d, double d2, double d3, double d4) {
        return h.a(d, d2, d3, d4);
    }

    public static boolean contains(TencentLocation tencentLocation, double d, TencentLocation tencentLocation2) {
        if (tencentLocation == null || tencentLocation2 == null) {
            throw new NullPointerException();
        }
        return distanceBetween(tencentLocation, tencentLocation2) <= d;
    }

    public static boolean isFromGps(TencentLocation tencentLocation) {
        if (tencentLocation == null) {
            return false;
        }
        return "gps".equals(tencentLocation.getProvider());
    }

    public static boolean isFromNetwork(TencentLocation tencentLocation) {
        if (tencentLocation == null) {
            return false;
        }
        return "network".equals(tencentLocation.getProvider());
    }

    public static boolean isSupportGps(Context context) {
        if (context != null) {
            return (h.f(context) & 16) == 0;
        }
        throw new NullPointerException();
    }
}
