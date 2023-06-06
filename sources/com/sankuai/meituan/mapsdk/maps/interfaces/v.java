package com.sankuai.meituan.mapsdk.maps.interfaces;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface v {
    int getLogoPosition();

    int getZoomPosition();

    boolean isAllGesturesEnabled();

    boolean isCompassEnabled();

    boolean isIndoorControlsEnabled();

    boolean isInertiaScaleEnabled();

    boolean isLogoEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScaleByMapCenter();

    boolean isScaleControlsEnabled();

    boolean isScrollGesturesEnabled();

    boolean isTiltGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    void setAllGesturesEnabled(boolean z);

    void setCompassEnabled(boolean z);

    void setCompassMargins(int i, int i2, int i3, int i4);

    void setCompassPosition(int i);

    void setGestureScaleByMapCenter(boolean z);

    void setIndoorControlsEnabled(boolean z);

    void setIndoorControlsMargins(int i, int i2, int i3, int i4);

    void setIndoorControlsPosition(int i);

    void setInertiaScaleEnabled(boolean z);

    void setLogoEnabled(boolean z);

    void setLogoPosition(int i);

    void setLogoPositionWithMargin(int i, int i2, int i3, int i4, int i5);

    void setRotateGesturesEnabled(boolean z);

    void setScaleControlsEnabled(boolean z);

    void setScaleViewPosition(int i);

    void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5);

    void setScrollGesturesEnabled(boolean z);

    void setTiltGesturesEnabled(boolean z);

    void setZoomControlsEnabled(boolean z);

    void setZoomControlsMargins(int i, int i2, int i3, int i4);

    void setZoomGesturesEnabled(boolean z);

    void setZoomPosition(int i);
}
