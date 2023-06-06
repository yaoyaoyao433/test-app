package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ia extends hw {
    private float i;
    private float j;
    private float k;
    private float l;

    public ia(float f, float f2, float f3, float f4) {
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hw
    public final void a(float f, Interpolator interpolator) {
        if (f < 0.0f) {
            return;
        }
        float f2 = this.j - this.i;
        float interpolation = interpolator.getInterpolation(f);
        float f3 = this.i + (f2 * interpolation);
        float f4 = this.k + ((this.l - this.k) * interpolation);
        if (this.h != null) {
            this.h.a(f3, f4);
        }
    }
}
