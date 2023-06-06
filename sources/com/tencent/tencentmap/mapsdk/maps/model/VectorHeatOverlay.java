package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface VectorHeatOverlay {
    VectorHeatAggregationUnit getUnit(LatLng latLng);

    void remove();

    void setOpacity(float f);

    void setVisibility(boolean z);
}
