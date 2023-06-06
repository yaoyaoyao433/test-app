package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.eq;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class x implements eq {
    @Override // com.tencent.mapsdk.internal.eq
    public final double a(Point point, Point point2) {
        return 0.0d;
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final float a(LatLng latLng, LatLng latLng2, int i, int i2, int i3, int i4, LatLng latLng3) {
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final void a(List<? extends Boundable> list, List<GeoPoint> list2, Rect rect, eq.a aVar) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float glPixelRatio() {
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.internal.eq, com.tencent.tencentmap.mapsdk.maps.Projection
    public final double metersPerPixel(double d) {
        return 0.0d;
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final GeoPoint a(fm fmVar) {
        return new GeoPoint();
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final fm a(GeoPoint geoPoint) {
        return new fm();
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final PointF a(LatLng latLng) {
        return new PointF();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final LatLng fromScreenLocation(Point point) {
        return new LatLng();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final Point toScreenLocation(LatLng latLng) {
        return new Point();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final VisibleRegion getVisibleRegion() {
        return new VisibleRegion(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d), new LatLngBounds(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d)));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glProjectionMatrix() {
        return new float[16];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glViewMatrix() {
        return new float[16];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glModelMatrix(PointF pointF, float f) {
        return new float[16];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final PointF glVertexForCoordinate(LatLng latLng) {
        return new PointF();
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final LatLng a(PointF pointF) {
        return new LatLng();
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final LatLng[] a() {
        return new LatLng[4];
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final fm a(Context context, LatLng latLng) {
        return new fm();
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final fu b(LatLng latLng) {
        return new fu(0.0d, 0.0d);
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final LatLng a(fu fuVar) {
        return new LatLng();
    }
}
