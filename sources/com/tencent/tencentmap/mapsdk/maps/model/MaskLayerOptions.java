package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MaskLayerOptions {
    private int mColor = 0;
    private long mAnimationDuration = 0;
    private int mZIndex = 0;

    public MaskLayerOptions color(int i) {
        this.mColor = i;
        return this;
    }

    public int getColor() {
        return this.mColor;
    }

    public MaskLayerOptions animationDuration(long j) {
        this.mAnimationDuration = j;
        return this;
    }

    public long getAnimationDuration() {
        return this.mAnimationDuration;
    }

    public MaskLayerOptions zIndex(int i) {
        this.mZIndex = i;
        return this;
    }

    public int getZIndex() {
        return this.mZIndex;
    }
}
