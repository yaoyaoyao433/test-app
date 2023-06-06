package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hv extends hw {
    private float i;
    private float j;

    public hv(float f, float f2) {
        this.i = 0.0f;
        this.j = 0.0f;
        this.i = f;
        this.j = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hw
    public final void a(float f, Interpolator interpolator) {
        float interpolation = this.i + ((this.j - this.i) * interpolator.getInterpolation(f));
        if (this.h != null) {
            this.h.a(interpolation);
        }
    }
}
