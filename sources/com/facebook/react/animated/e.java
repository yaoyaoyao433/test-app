package com.facebook.react.animated;

import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends d {
    private final double e;
    private double f;
    private long g;
    private double h;
    private double i;
    private int j;
    private int k;

    public e(ReadableMap readableMap) {
        this.e = readableMap.getDouble(JsBridgeResult.PROPERTY_LOCATION_VELOCITY);
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public final void a(ReadableMap readableMap) {
        this.f = readableMap.getDouble("deceleration");
        this.j = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.k = 1;
        this.a = this.j == 0;
        this.g = -1L;
        this.h = 0.0d;
        this.i = 0.0d;
    }

    @Override // com.facebook.react.animated.d
    public final void a(long j) {
        long j2 = j / 1000000;
        if (this.g == -1) {
            this.g = j2 - 16;
            if (this.h == this.i) {
                this.h = this.b.f;
            } else {
                this.b.f = this.h;
            }
            this.i = this.b.f;
        }
        double exp = this.h + ((this.e / (1.0d - this.f)) * (1.0d - Math.exp((-(1.0d - this.f)) * (j2 - this.g))));
        if (Math.abs(this.i - exp) < 0.1d) {
            if (this.j == -1 || this.k < this.j) {
                this.g = -1L;
                this.k++;
            } else {
                this.a = true;
                return;
            }
        }
        this.i = exp;
        this.b.f = exp;
    }
}
