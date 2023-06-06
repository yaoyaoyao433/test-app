package com.tencent.map.sdk.utilities.visualization.trails;

import android.graphics.Color;
import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TrailOverlayProvider extends BaseOverlayProvider {
    private static final int DEFAULT_COLOR_MAP_SIZE = 200;
    private static final int[] DEFAULT_GRADIENT_COLORS = {Color.argb(255, 0, 128, 255), Color.argb(0, 0, 128, 255)};
    private static final float[] DEFAULT_GRADIENT_START_POINTS = {0.0f, 1.0f};
    private int mType = 0;
    private List<TrailLatLng> dataList = new ArrayList();
    private final float DEFAULT_WIDTH = 6.0f;
    private float mWidth = 6.0f;
    private final int DEFAULT_HIGHLIGHT_DURATION = 1000;
    private final int DEFAULT_ANIMATE_START_TIME = 0;
    private final int DEFAULT_ANIMATE_END_TIME = 2000;
    private int mHighLightDuration = 1000;
    private int mAnimationStartTime = 0;
    private int mAnimatationEndTime = 2000;
    private final float DEFAULT_PLAY_RATIO = 1.0f;
    private float mPlayRatio = 1.0f;
    private int[] mColors = DEFAULT_GRADIENT_COLORS;
    private float[] mColorPoints = DEFAULT_GRADIENT_START_POINTS;
    protected int mColorMapSize = 200;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum TrailOverlayType {
        Trail
    }

    public final TrailOverlayProvider type(TrailOverlayType trailOverlayType) {
        this.mType = trailOverlayType.ordinal();
        return this;
    }

    final TrailOverlayType getOverlayType() {
        return TrailOverlayType.values()[this.mType];
    }

    public final int getType() {
        return getOverlayType().ordinal();
    }

    public final List<TrailLatLng> getData() {
        return this.dataList;
    }

    public final TrailOverlayProvider data(List<TrailLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return super.getOpacity();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final TrailOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final TrailOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final TrailOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final TrailOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    public final TrailOverlayProvider zoomRange(int i, int i2) {
        if (i <= i2) {
            super.minZoom(i);
            super.maxZoom(i2);
        }
        return this;
    }

    public final TrailOverlayProvider gradient(int[] iArr) {
        if (iArr != null) {
            if (iArr.length == 1) {
                this.mColors = new int[]{iArr[0], iArr[0], iArr[0]};
                this.mColorPoints = new float[]{0.0f, 0.5f, 1.0f};
            } else if (iArr.length == 2) {
                this.mColors = iArr;
                this.mColorPoints = new float[]{0.0f, 1.0f};
            } else if (iArr.length == 3) {
                this.mColors = iArr;
                this.mColorPoints = new float[]{0.0f, 0.5f, 1.0f};
            }
        }
        return this;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final float[] getColorPoints() {
        return this.mColorPoints;
    }

    public final int getColorMapSize() {
        return this.mColorMapSize;
    }

    public final float getWidth() {
        return this.mWidth;
    }

    public final TrailOverlayProvider width(float f) {
        if (f > 0.0f) {
            this.mWidth = f;
        }
        return this;
    }

    public final TrailOverlayProvider setHighlightDuration(int i) {
        if (i > 0) {
            this.mHighLightDuration = i;
        }
        return this;
    }

    public final int getHighLightDuration() {
        return this.mHighLightDuration;
    }

    public final TrailOverlayProvider setAnimateStartTime(int i, int i2) {
        if (i < i2 && i >= 0) {
            this.mAnimationStartTime = i;
            this.mAnimatationEndTime = i2;
        }
        return this;
    }

    public final int getAnimateStartTime() {
        return this.mAnimationStartTime;
    }

    public final int getAnimateEndTime() {
        return this.mAnimatationEndTime;
    }

    public final TrailOverlayProvider setPlayRatio(float f) {
        if (f > 0.0f) {
            this.mPlayRatio = f;
        }
        return this;
    }

    public final float getPlayRatio() {
        return this.mPlayRatio;
    }
}
