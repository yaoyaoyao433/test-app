package com.airbnb.lottie.value;

import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public final float a;
    public final float b;

    public d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public d() {
        this(1.0f, 1.0f);
    }

    public final String toString() {
        return this.a + Constants.GestureMoveEvent.KEY_X + this.b;
    }
}
