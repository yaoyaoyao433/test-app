package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hu implements iu<GeoPoint> {
    @Override // com.tencent.mapsdk.internal.iu
    public final /* synthetic */ GeoPoint a(float f, GeoPoint geoPoint, GeoPoint geoPoint2) {
        GeoPoint geoPoint3 = geoPoint;
        GeoPoint geoPoint4 = geoPoint2;
        return new GeoPoint(geoPoint3.getLatitudeE6() + ((int) ((geoPoint4.getLatitudeE6() - geoPoint3.getLatitudeE6()) * f)), geoPoint3.getLongitudeE6() + ((int) (f * (geoPoint4.getLongitudeE6() - geoPoint3.getLongitudeE6()))));
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static GeoPoint a2(float f, GeoPoint geoPoint, GeoPoint geoPoint2) {
        return new GeoPoint(geoPoint.getLatitudeE6() + ((int) ((geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6()) * f)), geoPoint.getLongitudeE6() + ((int) (f * (geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6()))));
    }
}
