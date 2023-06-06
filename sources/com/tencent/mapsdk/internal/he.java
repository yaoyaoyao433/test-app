package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class he extends hf implements IAlphaAnimation {
    public he(float f, float f2) {
        if (this.a == null) {
            this.a = new hv(f, f2);
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
