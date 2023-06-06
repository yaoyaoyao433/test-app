package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class fx {
    final double d;

    public fx(double d) {
        this.d = d;
    }

    public final fm c(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        return new fm(((latLng.longitude / 360.0d) + 0.5d) * this.d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * this.d);
    }

    public final LatLng b(fm fmVar) {
        double d = ((fmVar.a / this.d) - 0.5d) * 360.0d;
        double degrees = 90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (fmVar.b / this.d))) * 2.0d) * 3.141592653589793d)) * 2.0d);
        if (Double.isNaN(degrees)) {
            degrees = 0.0d;
        }
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        return new LatLng(degrees, d);
    }
}
