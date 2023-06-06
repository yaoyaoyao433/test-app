package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.Projection;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface eq extends Projection {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(float f, GeoPoint geoPoint);
    }

    double a(Point point, Point point2);

    float a(LatLng latLng, LatLng latLng2, int i, int i2, int i3, int i4, LatLng latLng3);

    PointF a(LatLng latLng);

    GeoPoint a(fm fmVar);

    fm a(Context context, LatLng latLng);

    fm a(GeoPoint geoPoint);

    LatLng a(PointF pointF);

    LatLng a(fu fuVar);

    void a(List<? extends Boundable> list, List<GeoPoint> list2, Rect rect, a aVar);

    LatLng[] a();

    fu b(LatLng latLng);

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    double metersPerPixel(double d);
}
