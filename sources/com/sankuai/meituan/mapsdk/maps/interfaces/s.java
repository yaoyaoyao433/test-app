package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.graphics.Point;
import android.graphics.PointF;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.VisibleRegion;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface s {
    LatLng fromProjectedMeters(PointD pointD);

    LatLng fromScreenLocation(Point point);

    VisibleRegion getVisibleRegion();

    PointF toOpenGLLocation(LatLng latLng);

    PointD toProjectedMetersForLatLng(LatLng latLng);

    Point toScreenLocation(LatLng latLng);

    Point[] toScreenLocationByCameraPosition(LatLng[] latLngArr, CameraPosition cameraPosition);
}
