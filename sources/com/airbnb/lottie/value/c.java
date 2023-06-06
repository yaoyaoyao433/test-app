package com.airbnb.lottie.value;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c<T> {
    @Nullable
    public com.airbnb.lottie.animation.keyframe.a<?, ?> a;
    @Nullable
    protected T b;
    private final b<T> c;

    public c() {
        this.c = new b<>();
        this.b = null;
    }

    public c(@Nullable T t) {
        this.c = new b<>();
        this.b = null;
        this.b = t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.c.a(f, f2, t, t2, f3, f4, f5);
        return this.b;
    }
}
