package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.map.lib.models.GeoPoint;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ib extends hw {
    private GeoPoint i = null;
    private GeoPoint j;
    private boolean k;

    public ib(GeoPoint geoPoint) {
        this.j = null;
        this.k = false;
        if (geoPoint != null) {
            this.j = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
            this.k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hw
    public final void a(float f, Interpolator interpolator) {
        if (this.j == null || this.i == null) {
            return;
        }
        int latitudeE6 = this.j.getLatitudeE6() - this.i.getLatitudeE6();
        int longitudeE6 = this.j.getLongitudeE6() - this.i.getLongitudeE6();
        float interpolation = interpolator.getInterpolation(f);
        int latitudeE62 = this.i.getLatitudeE6() + ((int) (latitudeE6 * interpolation));
        int longitudeE62 = this.i.getLongitudeE6() + ((int) (longitudeE6 * interpolation));
        if (1.0f - f < 1.0E-4d) {
            latitudeE62 = this.j.getLatitudeE6();
            longitudeE62 = this.j.getLongitudeE6();
        }
        if (this.h != null) {
            this.h.a(latitudeE62, longitudeE62);
        }
    }

    @Override // com.tencent.mapsdk.internal.hw
    public final boolean a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (super.a((GeoPoint) null, (GeoPoint) null)) {
            if (geoPoint != null) {
                this.i = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
            }
            if (this.k || geoPoint2 == null) {
                return true;
            }
            this.j = new GeoPoint(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6());
            return true;
        }
        return false;
    }
}
