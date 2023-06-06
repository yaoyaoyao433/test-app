package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.fv;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bw implements fv.a {
    public static final double a = 1.0d;
    private static final fx d = new fx(1.0d);
    fm b;
    double c;

    public bw(LatLng latLng, double d2) {
        this.b = d.c(latLng);
        if (d2 >= 0.0d) {
            this.c = d2;
        } else {
            this.c = 1.0d;
        }
    }

    public bw(LatLng latLng) {
        this(latLng, 1.0d);
    }

    @Override // com.tencent.mapsdk.internal.fv.a
    public final fm a() {
        return this.b;
    }

    private LatLng b() {
        return d.b(this.b);
    }

    private void a(LatLng latLng) {
        this.b = d.c(latLng);
    }

    private void a(double d2) {
        if (d2 >= 0.0d) {
            this.c = d2;
        } else {
            this.c = 1.0d;
        }
    }

    private double c() {
        return this.c;
    }
}
