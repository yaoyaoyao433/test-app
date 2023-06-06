package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class w {
    public static float a(double d) {
        return a((float) d);
    }

    public static float a(String str) {
        float parseFloat = Float.parseFloat(str.substring(0, str.length() - 3));
        return a() ? a(parseFloat) : (c(d.a.widthPixels) / 375.0f) * parseFloat;
    }

    public static float a(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.endsWith("rpt")) {
                return a(asString);
            }
            return Float.parseFloat(asString);
        } else if (dynamic.getType() == ReadableType.Number) {
            return (float) dynamic.asDouble();
        } else {
            return 0.0f;
        }
    }

    public static float a(float f) {
        return TypedValue.applyDimension(1, f, d.a);
    }

    public static float b(float f) {
        return f / d.b.scaledDensity;
    }

    public static float a(float f, float f2) {
        DisplayMetrics displayMetrics = d.a;
        float f3 = displayMetrics.scaledDensity;
        float f4 = f3 / displayMetrics.density;
        if (f2 >= 1.0f && f2 < f4) {
            f3 = displayMetrics.density * f2;
        }
        return f * f3;
    }

    public static float b(double d) {
        return a((float) d, Float.NaN);
    }

    public static float c(float f) {
        return f / d.a.density;
    }

    private static boolean a() {
        return d.a.densityDpi < 320;
    }
}
