package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jb implements Interpolator {
    public jb() {
    }

    private jb(byte b) {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (float) Math.sqrt(1.0f - (f2 * f2));
    }
}
