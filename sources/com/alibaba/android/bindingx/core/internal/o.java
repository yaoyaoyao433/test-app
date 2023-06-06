package com.alibaba.android.bindingx.core.internal;

import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o {
    private Double b;
    private Double c;
    private Double d;
    private p a = new p(0.0d, 0.0d, 0.0d, 1.0d);
    private double e = 0.0d;
    private double f = 0.0d;
    private double g = 0.0d;
    private final u h = new u(0.0d, 0.0d, 1.0d);
    private final g i = new g();
    private final p j = new p();
    private final p k = new p(-Math.sqrt(0.5d), 0.0d, 0.0d, Math.sqrt(0.5d));

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p a(double d, double d2, double d3, double d4) {
        a(this.a, Math.toRadians(this.b != null ? this.b.doubleValue() : d4 + this.e), Math.toRadians(this.c != null ? this.c.doubleValue() : this.f + d2), Math.toRadians(this.d != null ? this.d.doubleValue() : d3 + this.g), 0.0d);
        return this.a;
    }

    private void a(p pVar, double d, double d2, double d3, double d4) {
        this.i.a(d2, d, -d3, "YXZ");
        pVar.a(this.i);
        pVar.a(pVar, this.k);
        pVar.a(pVar, this.j.a(this.h, -0.0d));
    }
}
