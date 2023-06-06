package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IScaleAnimation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hj extends hf implements IScaleAnimation {
    public hj(float f, float f2, float f3, float f4) {
        if (this.a == null) {
            this.a = new ia(f, f2, f3, f4);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setDuration(long j) {
        if (this.a == null) {
            return;
        }
        this.a.a(j);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setInterpolator(Interpolator interpolator) {
        if (this.a == null || interpolator == null) {
            return;
        }
        this.a.f = interpolator;
    }
}
