package com.tencent.tencentmap.mapsdk.maps.model;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface Animation {
    AnimationListener getAnimationListener();

    long getDuration();

    Interpolator getInterpolator();

    void setAnimationListener(AnimationListener animationListener);

    void setDuration(long j);

    void setInterpolator(Interpolator interpolator);
}
