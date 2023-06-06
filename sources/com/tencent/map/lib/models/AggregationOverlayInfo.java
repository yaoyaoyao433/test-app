package com.tencent.map.lib.models;

import android.support.annotation.Keep;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class AggregationOverlayInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    protected int mType = 0;
    protected float mSize = 2000.0f;
    protected float mGap = 0.0f;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected int mZIndex = 0;
    protected double mMinHeight = 0.0d;
    protected double mMaxHeight = 1000.0d;
    protected double mMinIntensity = 0.0d;
    protected double mMaxIntensity = 2000.0d;
    protected boolean mRangeFlag = false;
    protected int[] mColors = {1174031124, -1711650028, -637908204};
    protected double[] mStartPoints = {0.0d, 0.6d, 0.8d};
    protected boolean mDraw3D = false;
    protected boolean mAnimate = false;
    protected int mAnimateDuration = 5000;
    protected WeightedLatLng[] mNodes = new WeightedLatLng[0];

    public void setType(int i) {
        this.mType = i;
    }

    public void setNodes(WeightedLatLng[] weightedLatLngArr) {
        this.mNodes = weightedLatLngArr;
    }

    public void setSize(float f) {
        this.mSize = f;
    }

    public void setGap(float f) {
        this.mGap = f;
    }

    public void setOpacity(float f) {
        if (f > 1.0f) {
            this.mOpacity = 1.0f;
        } else if (f < 0.0f) {
            this.mOpacity = 0.0f;
        } else {
            this.mOpacity = f;
        }
        this.mOpacity = f;
    }

    public void setVisibility(boolean z) {
        this.mVisibility = z;
    }

    public void setMinZoom(int i) {
        this.mMinZoom = i;
    }

    public void setMaxZoom(int i) {
        this.mMaxZoom = i;
    }

    public void setDisplayLevel(int i) {
        if (i == 1 || i == 2) {
            this.mDisplayLevel = i;
        }
    }

    public void setZIndex(int i) {
        this.mZIndex = i;
    }

    public void setColors(int[] iArr) {
        this.mColors = iArr;
    }

    public void setStartPoints(double[] dArr) {
        this.mStartPoints = dArr;
    }

    public void setDraw3D(boolean z) {
        this.mDraw3D = z;
    }

    public void setHeightRange(double d, double d2) {
        if (d <= d2 && d >= 0.0d) {
            this.mMaxHeight = d2;
            this.mMinHeight = d;
            return;
        }
        this.mMinHeight = 0.0d;
        this.mMaxHeight = 1000.0d;
    }

    public void setShowRange(double d, double d2) {
        if (d <= d2 && d >= 0.0d) {
            this.mMinIntensity = d;
            this.mMaxIntensity = d2;
            this.mRangeFlag = true;
            return;
        }
        this.mMinIntensity = 0.0d;
        this.mMaxIntensity = 2000.0d;
        this.mRangeFlag = false;
    }

    public void setAnimate(boolean z) {
        this.mAnimate = z;
    }

    public void setAnimateTime(int i) {
        this.mAnimateDuration = i;
    }

    public boolean isAnimate() {
        return this.mAnimate;
    }
}
