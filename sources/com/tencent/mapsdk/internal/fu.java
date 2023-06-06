package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fu implements Coordinate, Cloneable {
    public static final double a = 2.003750834E7d;
    public double b = Double.MIN_VALUE;
    public double c = Double.MIN_VALUE;

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setZ(double d) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double z() {
        return 0.0d;
    }

    public final String toString() {
        return "x=" + this.c + ",y=" + this.b;
    }

    public fu(double d, double d2) {
        setX(d);
        setY(d2);
    }

    private double a() {
        return this.b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setY(double d) {
        this.b = Math.max(-2.003750834E7d, Math.min(2.003750834E7d, d));
    }

    private double b() {
        return this.c;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final void setX(double d) {
        this.c = Math.max(-2.003750834E7d, Math.min(2.003750834E7d, d));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.hashCode() == hashCode() && (obj instanceof fu)) {
            fu fuVar = (fu) obj;
            return Double.doubleToLongBits(fuVar.c) == Double.doubleToLongBits(this.c) && Double.doubleToLongBits(fuVar.b) == Double.doubleToLongBits(this.b);
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return ((((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32))) + 31) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    private fu c() {
        return new fu(this.c, this.b);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double x() {
        return this.c;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate
    public final double y() {
        return this.b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new fu(this.c, this.b);
    }
}
