package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.support.annotation.NonNull;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface q extends l {
    boolean contains(@NonNull LatLng latLng);

    int getFillColor();

    BitmapDescriptor getFillTexture();

    List<LatLng> getPoints();

    int getStrokeColor();

    float getStrokeWidth();

    Object getTag();

    boolean isClickable();

    void setClickable(boolean z);

    void setFillColor(int i);

    void setFillTexture(BitmapDescriptor bitmapDescriptor);

    void setPoints(@NonNull List<LatLng> list);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);

    void setTag(Object obj);
}
