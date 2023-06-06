package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IRotateAnimation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hi extends hf implements IRotateAnimation {
    public hi(float f, float f2, float f3, float f4, float f5) {
        if (this.a == null) {
            this.a = new hz(f, f2, f3, f4, f5);
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
