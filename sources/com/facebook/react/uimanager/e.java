package com.facebook.react.uimanager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static boolean a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f2 - f) < 1.0E-5f;
    }
}
