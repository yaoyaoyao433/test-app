package com.sankuai.meituan.mapsdk.maps.interfaces;

import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a extends l {
    LatLngBounds getBounds();

    float[] getGradientColorPercentage();

    int[] getGradientColors();

    int getStrokeColor();

    float getStrokeWidth();

    void setGradientColors(float[] fArr, int[] iArr);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}
