package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jd implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d = f / 0.5d;
        if (d < 1.0d) {
            return (float) (Math.pow(d, 3.0d) * 0.5d);
        }
        return (float) ((Math.pow(d - 2.0d, 3.0d) + 2.0d) * 0.5d);
    }
}
