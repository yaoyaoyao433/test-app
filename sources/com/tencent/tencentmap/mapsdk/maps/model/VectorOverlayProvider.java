package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface VectorOverlayProvider {
    VectorOverlayProvider displayLevel(int i);

    int getDisplayLevel();

    int getMaxZoom();

    int getMinZoom();

    float getOpacity();

    int getZIndex();

    boolean isVisibility();

    VectorOverlayProvider maxZoom(int i);

    VectorOverlayProvider minZoom(int i);

    VectorOverlayProvider opacity(float f);

    VectorOverlayProvider visibility(boolean z);

    VectorOverlayProvider zIndex(int i);
}
