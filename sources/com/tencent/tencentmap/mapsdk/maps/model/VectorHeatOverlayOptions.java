package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class VectorHeatOverlayOptions extends BaseOverlayProvider {
    private int[] mColors;
    private float mGap;
    private WeightedLatLng[] mNodes;
    private double[] mStartPoints;
    private int mType = 0;
    private float mSize = 2000.0f;
    private float mOpacity = 1.0f;
    private boolean mVisibility = true;
    private int mMinZoom = 3;
    private int mMaxZoom = 22;
    private double mMinIntensity = 0.0d;
    private double mMaxIntensity = 2000.0d;
    private double mMaxHeight = 2000.0d;
    private double mMinHeight = 0.0d;
    private boolean mDraw3D = false;
    private boolean mRangeFlag = false;
    private int mAnimateDuration = 5000;
    private boolean mAnimate = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum VectorHeatOverlayType {
        HoneyComb,
        Square
    }

    public final VectorHeatOverlayType getType() {
        return VectorHeatOverlayType.values()[this.mType];
    }

    public final VectorHeatOverlayOptions type(VectorHeatOverlayType vectorHeatOverlayType) {
        this.mType = vectorHeatOverlayType.ordinal();
        return this;
    }

    public final WeightedLatLng[] getNodes() {
        return this.mNodes;
    }

    public final VectorHeatOverlayOptions nodes(WeightedLatLng[] weightedLatLngArr) {
        this.mNodes = weightedLatLngArr;
        return this;
    }

    public final float getSize() {
        return this.mSize;
    }

    public final VectorHeatOverlayOptions size(float f) {
        this.mSize = f;
        return this;
    }

    public final float getGap() {
        return this.mGap;
    }

    public final VectorHeatOverlayOptions gap(float f) {
        this.mGap = f;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return this.mOpacity;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final VectorHeatOverlayOptions opacity(float f) {
        this.mOpacity = f;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return this.mVisibility;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final VectorHeatOverlayOptions visibility(boolean z) {
        this.mVisibility = z;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return this.mMinZoom;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final VectorHeatOverlayOptions minZoom(int i) {
        this.mMinZoom = i;
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return this.mMaxZoom;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final VectorHeatOverlayOptions maxZoom(int i) {
        this.mMaxZoom = i;
        return this;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final VectorHeatOverlayOptions colors(int[] iArr) {
        this.mColors = iArr;
        return this;
    }

    public final double[] getStartPoints() {
        return this.mStartPoints;
    }

    public final VectorHeatOverlayOptions startPoints(double[] dArr) {
        this.mStartPoints = dArr;
        return this;
    }

    public final VectorHeatOverlayOptions heightRange(double d, double d2) {
        if (d <= d2 && d >= 0.0d) {
            this.mMaxHeight = d2;
            this.mMinHeight = d;
        } else {
            this.mMinHeight = 0.0d;
            this.mMaxHeight = 2000.0d;
        }
        return this;
    }

    public final VectorHeatOverlayOptions showRange(double d, double d2) {
        if (d <= d2 && d >= 0.0d) {
            this.mMaxIntensity = d2;
            this.mMinIntensity = d;
            this.mRangeFlag = true;
        } else {
            this.mMinIntensity = 0.0d;
            this.mMaxIntensity = 2000.0d;
            this.mRangeFlag = false;
        }
        return this;
    }

    public final double getMaxHeight() {
        return this.mMaxHeight;
    }

    public final double getMinHeight() {
        return this.mMinHeight;
    }

    public final double getMaxIntensity() {
        return this.mMaxIntensity;
    }

    public final double getMinIntensity() {
        return this.mMinIntensity;
    }

    public final boolean getRangeFlag() {
        return this.mRangeFlag;
    }

    public final VectorHeatOverlayOptions draw3D(boolean z) {
        this.mDraw3D = z;
        return this;
    }

    public final boolean isDraw3D() {
        return this.mDraw3D;
    }

    public final VectorHeatOverlayOptions animate(boolean z) {
        this.mAnimate = z;
        return this;
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    public final VectorHeatOverlayOptions setAnimateTime(int i) {
        this.mAnimateDuration = i;
        return this;
    }

    public final int getAnimateTime() {
        return this.mAnimateDuration;
    }
}
