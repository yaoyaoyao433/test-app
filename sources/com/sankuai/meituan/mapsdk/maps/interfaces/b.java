package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.ArrowOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b extends l {
    float getAlpha();

    int getColor();

    float getHeight();

    ArrowOptions.HeightUnit getHeightUnit();

    float getMaxZoomLevel();

    float getMinPitch();

    float getMinZoomLevel();

    Object getObject();

    int getOutlineColor();

    float getOutlineWidth();

    List<LatLng> getPoints();

    int getTopSurfaceColor();

    boolean is3DModel();

    void set3DModel(boolean z);

    void setAlpha(float f);

    void setColor(int i);

    void setHeight(float f, ArrowOptions.HeightUnit heightUnit);

    void setMaxZoomLevel(float f);

    void setMinPitch(float f);

    void setMinZoomLevel(float f);

    void setObject(Object obj);

    void setOutlineColor(int i);

    void setOutlineWidth(float f);

    void setPoints(List<LatLng> list, float f);

    void setTopSurfaceColor(int i);
}
