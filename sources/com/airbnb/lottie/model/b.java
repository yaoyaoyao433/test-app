package com.airbnb.lottie.model;

import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final double c;
    final int d;
    public final int e;
    final double f;
    public final double g;
    @ColorInt
    public final int h;
    @ColorInt
    public final int i;
    public final int j;
    public final boolean k;

    public b(String str, String str2, double d, int i, int i2, double d2, double d3, @ColorInt int i3, @ColorInt int i4, int i5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = i;
        this.e = i2;
        this.f = d2;
        this.g = d3;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = z;
    }

    public final int hashCode() {
        int hashCode = (((((int) ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c)) * 31) + this.d) * 31) + this.e;
        long doubleToLongBits = Double.doubleToLongBits(this.f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.h;
    }
}
