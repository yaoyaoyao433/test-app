package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ic extends hl {
    private GeoPoint g;
    private GeoPoint h;
    private boolean i = false;

    private ic(GeoPoint geoPoint, GeoPoint geoPoint2) {
        this.g = null;
        this.h = null;
        if (geoPoint != null) {
            this.g = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        }
        if (geoPoint2 != null) {
            this.h = new GeoPoint(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6());
        }
    }

    @Override // com.tencent.mapsdk.internal.hl
    protected final void a(float f) {
        if (this.h == null || this.g == null) {
            return;
        }
        int latitudeE6 = this.h.getLatitudeE6() - this.g.getLatitudeE6();
        int longitudeE6 = this.h.getLongitudeE6() - this.g.getLongitudeE6();
        int latitudeE62 = this.g.getLatitudeE6() + ((int) (latitudeE6 * f));
        int longitudeE62 = this.g.getLongitudeE6() + ((int) (longitudeE6 * f));
        if (this.f != null) {
            new GeoPoint(latitudeE62, longitudeE62);
        }
    }
}
