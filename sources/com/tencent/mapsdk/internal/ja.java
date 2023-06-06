package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ja implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d = f;
        double d2 = d * d;
        double d3 = d2 * d2;
        return (float) (d3 * d3);
    }
}
