package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n extends d {
    private long e;
    private boolean f;
    private double g;
    private double h;
    private double i;
    private double j;
    private boolean k;
    private final a l = new a();
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private int r;
    private int s;
    private double t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        double a;
        double b;

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(ReadableMap readableMap) {
        this.l.b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public final void a(ReadableMap readableMap) {
        this.g = readableMap.getDouble("stiffness");
        this.h = readableMap.getDouble("damping");
        this.i = readableMap.getDouble("mass");
        this.j = this.l.b;
        this.n = readableMap.getDouble("toValue");
        this.o = readableMap.getDouble("restSpeedThreshold");
        this.p = readableMap.getDouble("restDisplacementThreshold");
        this.k = readableMap.getBoolean("overshootClamping");
        this.r = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.a = this.r == 0;
        this.s = 0;
        this.q = 0.0d;
        this.f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x013a, code lost:
        if ((r26.g > 0.0d && ((r26.m < r26.n && r26.l.a > r26.n) || (r26.m > r26.n && r26.l.a < r26.n))) != false) goto L33;
     */
    @Override // com.facebook.react.animated.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r27) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.n.a(long):void");
    }

    private double a(a aVar) {
        return Math.abs(this.n - aVar.a);
    }

    private boolean a() {
        if (Math.abs(this.l.b) <= this.o) {
            return a(this.l) <= this.p || this.g == 0.0d;
        }
        return false;
    }
}
