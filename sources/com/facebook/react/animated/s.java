package com.facebook.react.animated;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class s extends b {
    Object e;
    double f;
    double g;
    @Nullable
    c h;

    public s() {
        this.e = null;
        this.f = Double.NaN;
        this.g = 0.0d;
    }

    public s(ReadableMap readableMap) {
        this.e = null;
        this.f = Double.NaN;
        this.g = 0.0d;
        this.f = readableMap.getDouble("value");
        this.g = readableMap.getDouble("offset");
    }

    public final double b() {
        if (Double.isNaN(this.g + this.f)) {
            a();
        }
        return this.g + this.f;
    }

    public final void c() {
        if (this.h == null) {
            return;
        }
        this.h.a(b());
    }
}
