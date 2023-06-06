package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.animation.Interpolator;
import com.airbnb.lottie.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a<T> {
    @Nullable
    private final e a;
    @Nullable
    public final T b;
    @Nullable
    public final T c;
    @Nullable
    public final Interpolator d;
    public final float e;
    @Nullable
    public Float f;
    public PointF g;
    public PointF h;
    private float i;
    private float j;

    public a(e eVar, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.i = Float.MIN_VALUE;
        this.j = Float.MIN_VALUE;
        this.g = null;
        this.h = null;
        this.a = eVar;
        this.b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = f;
        this.f = f2;
    }

    public a(T t) {
        this.i = Float.MIN_VALUE;
        this.j = Float.MIN_VALUE;
        this.g = null;
        this.h = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        if (this.a == null) {
            return 0.0f;
        }
        if (this.i == Float.MIN_VALUE) {
            this.i = (this.e - this.a.i) / this.a.b();
        }
        return this.i;
    }

    public final float b() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.j == Float.MIN_VALUE) {
            if (this.f == null) {
                this.j = 1.0f;
            } else {
                this.j = a() + ((this.f.floatValue() - this.e) / this.a.b());
            }
        }
        return this.j;
    }

    public final boolean c() {
        return this.d == null;
    }

    public final boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= a() && f < b();
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.e + ", endFrame=" + this.f + ", interpolator=" + this.d + '}';
    }
}
