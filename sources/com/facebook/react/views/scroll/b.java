package com.facebook.react.views.scroll;

import android.os.SystemClock;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    private int c = Integer.MIN_VALUE;
    private int d = Integer.MIN_VALUE;
    public float a = 0.0f;
    public float b = 0.0f;
    private long e = -11;

    public final boolean a(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = (uptimeMillis - this.e <= 10 && this.c == i && this.d == i2) ? false : true;
        if (uptimeMillis - this.e != 0) {
            this.a = (i - this.c) / ((float) (uptimeMillis - this.e));
            this.b = (i2 - this.d) / ((float) (uptimeMillis - this.e));
        }
        this.e = uptimeMillis;
        this.c = i;
        this.d = i2;
        return z;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }
}
