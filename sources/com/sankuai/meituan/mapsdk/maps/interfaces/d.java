package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.support.annotation.NonNull;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface d extends l {
    boolean contains(@NonNull LatLng latLng);

    LatLng getCenter();

    int getFillColor();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    String getId();

    double getRadius();

    int getStrokeColor();

    float getStrokeWidth();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    float getZIndex();

    boolean isMask();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    boolean isVisible();

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void remove();

    void setCenter(@NonNull LatLng latLng);

    void setFillColor(int i);

    void setMask(boolean z);

    void setRadius(double d);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setVisible(boolean z);

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    void setZIndex(float f);
}
