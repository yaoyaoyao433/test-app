package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fy {
    public ga a;
    public ga b;
    public ga c;
    private gb d;

    public fy() {
        this.d = new gb();
    }

    public fy(ga gaVar, ga gaVar2, ga gaVar3) {
        this();
        a(gaVar, gaVar2, gaVar3);
    }

    public fy(float[] fArr) {
        this();
        a(new ga(fArr[0], fArr[1], fArr[2]), new ga(fArr[3], fArr[4], fArr[5]), new ga(fArr[6], fArr[7], fArr[8]));
    }

    private void a(ga gaVar, ga gaVar2, ga gaVar3) {
        this.a = gaVar;
        this.b = gaVar2;
        this.c = gaVar3;
        this.d.a(gaVar);
        this.d.a(gaVar2);
        this.d.a(gaVar3);
    }

    private boolean a(float[] fArr) {
        ga gaVar = new ga(fArr[0], fArr[1], fArr[2]);
        return ((double) Math.abs(a() - ((new fy(gaVar, this.a, this.b).a() + new fy(gaVar, this.a, this.c).a()) + new fy(gaVar, this.b, this.c).a()))) < 0.001d;
    }

    private float[] b() {
        return this.d.a();
    }

    public final float a() {
        float[] a = this.d.a();
        float a2 = a(a[0], a[1], a[2], a[3], a[4], a[5]);
        float a3 = a(a[3], a[4], a[5], a[6], a[7], a[8]);
        float a4 = a(a[0], a[1], a[2], a[6], a[7], a[8]);
        float f = ((a2 + a3) + a4) / 2.0f;
        return (float) Math.sqrt((f - a2) * f * (f - a3) * (f - a4));
    }

    private static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f - f4;
        float f8 = f2 - f5;
        float f9 = f3 - f6;
        return (float) Math.sqrt((f7 * f7) + (f8 * f8) + (f9 * f9));
    }
}
