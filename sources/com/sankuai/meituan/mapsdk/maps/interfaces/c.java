package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface c {
    CameraPosition getCameraPosition();

    Object getEmbedObject();

    LatLngBounds getLatLngBounds();

    int getPaddingBottom();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingTop();

    float getZoomByAmount();

    float getZoomToValue();
}
