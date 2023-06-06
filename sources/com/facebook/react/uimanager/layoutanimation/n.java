package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n implements Interpolator {
    private final float a;

    public static float a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    public n() {
        this.a = 0.5f;
    }

    public n(float f) {
        this.a = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.pow(2.0d, (-10.0f) * f) * Math.sin((((f - (this.a / 4.0f)) * 3.141592653589793d) * 2.0d) / this.a)) + 1.0d);
    }
}
