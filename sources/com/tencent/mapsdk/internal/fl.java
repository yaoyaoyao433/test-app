package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fl {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;

    public fl(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d3;
        this.c = d2;
        this.d = d4;
        this.e = (d + d2) / 2.0d;
        this.f = (d3 + d4) / 2.0d;
    }

    public final boolean a(double d, double d2) {
        return this.a <= d && d <= this.c && this.b <= d2 && d2 <= this.d;
    }

    private boolean a(fm fmVar) {
        return a(fmVar.a, fmVar.b);
    }

    private boolean a(double d, double d2, double d3, double d4) {
        return d < this.c && this.a < d2 && d3 < this.d && this.b < d4;
    }

    public final boolean a(fl flVar) {
        return a(flVar.a, flVar.c, flVar.b, flVar.d);
    }

    private boolean b(fl flVar) {
        return flVar.a >= this.a && flVar.c <= this.c && flVar.b >= this.b && flVar.d <= this.d;
    }
}
