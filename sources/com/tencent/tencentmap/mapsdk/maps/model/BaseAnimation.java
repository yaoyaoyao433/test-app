package com.tencent.tencentmap.mapsdk.maps.model;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseAnimation implements Animation {
    private AnimationListener mAnimationListener;
    private long mDuration;
    private Interpolator mInterpolator;

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setDuration(long j) {
        this.mDuration = j;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public long getDuration() {
        return this.mDuration;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public AnimationListener getAnimationListener() {
        return this.mAnimationListener;
    }
}
