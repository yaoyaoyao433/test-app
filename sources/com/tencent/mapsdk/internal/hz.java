package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hz extends hw {
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;

    public hz(float f, float f2, float f3, float f4, float f5) {
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hw
    public final void a(float f, Interpolator interpolator) {
        float interpolation = this.i + ((this.j - this.i) * interpolator.getInterpolation(f));
        if (this.h != null) {
            this.h.a(interpolation, this.k, this.l, this.m);
        }
    }
}
