package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface aq extends ap, Polygon {
    void a(PolygonOptions polygonOptions);

    PolygonInfo b();

    List<GeoPoint> c();

    GeoPoint d();

    int k_();
}
