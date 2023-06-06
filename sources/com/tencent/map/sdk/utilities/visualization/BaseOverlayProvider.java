package com.tencent.map.sdk.utilities.visualization;

import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseOverlayProvider implements VectorOverlayProvider {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    private static final float DEFAULT_OPACITY = 1.0f;
    private static final int DEFAULT_ZINDEX = 0;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 4;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected int mZIndex = 0;

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public BaseOverlayProvider opacity(float f) {
        if (f > 1.0f) {
            this.mOpacity = 1.0f;
        } else if (f < 0.0f) {
            this.mOpacity = 0.0f;
        } else {
            this.mOpacity = f;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public BaseOverlayProvider visibility(boolean z) {
        this.mVisibility = z;
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public BaseOverlayProvider minZoom(int i) {
        if (i >= 3) {
            this.mMinZoom = i;
        } else {
            this.mMinZoom = 3;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public BaseOverlayProvider maxZoom(int i) {
        if (i <= 22) {
            this.mMaxZoom = i;
        } else {
            this.mMaxZoom = 22;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public BaseOverlayProvider displayLevel(int i) {
        if (i == 1 || i == 2) {
            this.mDisplayLevel = i;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public BaseOverlayProvider zIndex(int i) {
        this.mZIndex = i;
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public float getOpacity() {
        return this.mOpacity;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isVisibility() {
        return this.mVisibility;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMinZoom() {
        return this.mMinZoom;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMaxZoom() {
        return this.mMaxZoom;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getZIndex() {
        return this.mZIndex;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getDisplayLevel() {
        return this.mDisplayLevel;
    }

    public String toString() {
        return "BaseOverlayProvider{mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + '}';
    }
}
