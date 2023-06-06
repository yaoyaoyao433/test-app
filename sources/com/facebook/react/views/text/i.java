package com.facebook.react.views.text;

import android.support.annotation.Nullable;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public final Spannable a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    final int h;
    public final int i;
    public final int j;
    public final int k;
    final int l;
    @Nullable
    public ReadableMap m;

    public i(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        this(spannable, -1, z, f, f2, f3, f4, i2, i3, i4, -1, -1);
    }

    public i(Spannable spannable, int i, boolean z, int i2, int i3, int i4) {
        this(spannable, i, z, -1.0f, -1.0f, -1.0f, -1.0f, i2, i3, i4, -1, -1);
    }

    public i(Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6) {
        this.m = null;
        this.a = spannable;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = i2;
        this.i = i3;
        this.j = i5;
        this.k = i6;
        this.l = i4;
    }

    public final Spannable a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.e;
    }

    public final float e() {
        return this.f;
    }

    public final float f() {
        return this.g;
    }

    public final int g() {
        return this.h;
    }

    public final int h() {
        return this.i;
    }

    public final int i() {
        return this.l;
    }
}
