package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface MaskLayer {
    String getId();

    MaskLayerOptions getOptions();

    int getZIndex();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void remove(long j);

    void setOptions(MaskLayerOptions maskLayerOptions);

    void setVisible(boolean z);

    void setZIndex(int i);
}
