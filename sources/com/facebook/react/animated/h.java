package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends d {
    private long e;
    private double[] f;
    private double g;
    private double h;
    private int i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public final void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        if (this.f == null || this.f.length != size) {
            this.f = new double[size];
        }
        for (int i = 0; i < size; i++) {
            this.f[i] = array.getDouble(i);
        }
        if (readableMap.hasKey("toValue")) {
            this.g = readableMap.getType("toValue") == ReadableType.Number ? readableMap.getDouble("toValue") : 0.0d;
        } else {
            this.g = 0.0d;
        }
        if (readableMap.hasKey("iterations")) {
            this.i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.i = 1;
        }
        this.j = 1;
        this.a = this.i == 0;
        this.e = -1L;
    }

    @Override // com.facebook.react.animated.d
    public final void a(long j) {
        double d;
        if (this.e < 0) {
            this.e = j;
            if (this.j == 1) {
                this.h = this.b.f;
            }
        }
        int round = (int) Math.round(((j - this.e) / 1000000) / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        }
        if (this.a) {
            return;
        }
        if (round >= this.f.length - 1) {
            d = this.g;
            if (this.i == -1 || this.j < this.i) {
                this.e = -1L;
                this.j++;
            } else {
                this.a = true;
            }
        } else {
            d = (this.f[round] * (this.g - this.h)) + this.h;
        }
        this.b.f = d;
    }
}
