package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class je implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * f;
    }

    public je() {
    }

    private je(byte b) {
    }
}
