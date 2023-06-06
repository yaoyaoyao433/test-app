package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jf implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * (2.0f - f);
    }
}
