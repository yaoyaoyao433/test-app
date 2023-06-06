package com.tencent.mapsdk.internal;

import com.meituan.robust.common.CommonConstant;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fm implements Coordinate {
    public double a;
    public double b;

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setZ(double d) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double z() {
        return 0.0d;
    }

    public fm() {
    }

    public fm(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final void a(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    private boolean a() {
        return this.a >= 0.0d && this.a <= 1.0d && this.b >= 0.0d && this.b <= 1.0d;
    }

    private fm b(double d, double d2) {
        return new fm(this.a + d, this.b + d2);
    }

    private fm a(fm fmVar) {
        return new fm(this.a + fmVar.a, this.b + fmVar.b);
    }

    private fm c(double d, double d2) {
        return new fm(this.a - d, this.b - d2);
    }

    private fm b(fm fmVar) {
        return new fm(this.a - fmVar.a, this.b - fmVar.b);
    }

    private fm a(double d) {
        return new fm(this.a * d, this.b * d);
    }

    private fm d(double d, double d2) {
        return new fm(this.a * d, this.b * d2);
    }

    private float b() {
        return (float) Math.hypot(this.a, this.b);
    }

    private float c(fm fmVar) {
        return fmVar.b(this).b();
    }

    private fm c() {
        double b = 1.0d / b();
        return new fm(this.a * b, this.b * b);
    }

    private fm a(int i) {
        double d = this.a;
        double d2 = this.b;
        int i2 = 0;
        while (i2 < i) {
            double d3 = -d;
            i2++;
            d = d2;
            d2 = d3;
        }
        return new fm(d, d2);
    }

    private fm a(float f) {
        double d = f;
        return new fm((float) ((Math.cos(d) * this.a) - (Math.sin(d) * this.b)), (float) ((Math.sin(d) * this.a) + (Math.cos(d) * this.b)));
    }

    private fm a(fm fmVar, float f) {
        fm b = b(fmVar);
        double d = f;
        fm fmVar2 = new fm((float) ((Math.cos(d) * b.a) - (Math.sin(d) * b.b)), (float) ((Math.sin(d) * b.a) + (Math.cos(d) * b.b)));
        return new fm(fmVar2.a + fmVar.a, fmVar2.b + fmVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fm) {
            fm fmVar = (fm) obj;
            return (e(this.a, fmVar.a) || e(this.b, fmVar.b)) ? false : true;
        }
        return false;
    }

    private static boolean e(double d, double d2) {
        return Double.compare(d, d2) != 0 && Math.abs(d - d2) > 1.0E-6d;
    }

    public final String toString() {
        return this.a + CommonConstant.Symbol.COMMA + this.b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double x() {
        return this.a;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double y() {
        return this.b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setX(double d) {
        this.a = d;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setY(double d) {
        this.b = d;
    }

    private fm d() {
        double b = 1.0d / b();
        return new fm(this.a * b, this.b * b);
    }
}
