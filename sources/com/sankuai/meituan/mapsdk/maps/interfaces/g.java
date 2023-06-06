package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.os.Bundle;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface g extends l {
    float getAlpha();

    float getAnchorX();

    float getAnchorY();

    float getBearing();

    LatLngBounds getBounds();

    Bundle getExtraInfo();

    double getHeight();

    BitmapDescriptor getImage();

    LatLng getPosition();

    double getWidth();

    void setAlpha(float f);

    void setAnchor(float f, float f2);

    void setBearing(float f);

    void setDimensions(float f);

    void setDimensions(float f, float f2);

    void setExtraInfo(Bundle bundle);

    void setImage(BitmapDescriptor bitmapDescriptor);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);
}
