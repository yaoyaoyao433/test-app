package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ArcOptions {
    LatLng mEndLatLng;
    LatLng mPassLatLng;
    boolean mShowArrow;
    LatLng mStartLatLng;
    int mStrokeColor;
    float mAngle = 0.0f;
    float mWidth = 5.0f;
    float mStrokeWidth = 0.0f;
    int mColor = -16777216;

    public final ArcOptions points(LatLng latLng, LatLng latLng2) {
        this.mStartLatLng = latLng;
        this.mEndLatLng = latLng2;
        return this;
    }

    public final ArcOptions pass(LatLng latLng) {
        this.mPassLatLng = latLng;
        return this;
    }

    public final ArcOptions angle(float f) {
        this.mAngle = f;
        return this;
    }

    public final ArcOptions width(float f) {
        this.mWidth = f;
        return this;
    }

    public final ArcOptions strokeWidth(float f) {
        this.mStrokeWidth = f;
        return this;
    }

    public final ArcOptions strokeColor(int i) {
        this.mStrokeColor = i;
        return this;
    }

    public final ArcOptions color(int i) {
        this.mColor = i;
        return this;
    }

    public final boolean isShowArrow() {
        return this.mShowArrow;
    }

    public final ArcOptions showArrow(boolean z) {
        this.mShowArrow = z;
        return this;
    }

    public final LatLng getStartLatLng() {
        return this.mStartLatLng;
    }

    public final LatLng getPassLatLng() {
        return this.mPassLatLng;
    }

    public final LatLng getEndLatLng() {
        return this.mEndLatLng;
    }

    public final float getAngle() {
        return this.mAngle;
    }

    public final float getWidth() {
        return this.mWidth;
    }

    public final float getStrokeWidth() {
        return this.mStrokeWidth;
    }

    public final int getStrokeColor() {
        return this.mStrokeColor;
    }

    public final int getColor() {
        return this.mColor;
    }
}
