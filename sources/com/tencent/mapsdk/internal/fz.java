package com.tencent.mapsdk.internal;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class fz {
    private float a;
    private float b;
    private float c;

    public fz(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        double e = e();
        if (e != 0.0d) {
            this.a = (float) (this.a / e);
            this.b = (float) (this.b / e);
            this.c = (float) (this.c / e);
        }
    }

    public final float[] a() {
        return new float[]{this.a, this.b, this.c};
    }

    private static fz a(fz fzVar, fz fzVar2) {
        return new fz(fzVar.a + fzVar2.a, fzVar.b + fzVar2.b, fzVar.c + fzVar2.c);
    }

    private static fz a(fz fzVar) {
        float f = fzVar.a;
        float f2 = fzVar.b;
        float e = (float) (f / fzVar.e());
        float e2 = (float) ((-f2) / fzVar.e());
        fz fzVar2 = new fz(e, e2, 0.0f);
        return (Math.acos(((double) (((fzVar2.a * fzVar.a) + (fzVar2.b * fzVar.b)) + (fzVar2.c * fzVar.c))) / (fzVar2.e() * fzVar.e())) * 180.0d) / 3.141592653589793d != 90.0d ? new fz(-e, -e2, 0.0f) : fzVar2;
    }

    private static fz b(fz fzVar) {
        return new fz(-fzVar.a, -fzVar.b, -fzVar.c);
    }

    private float b() {
        return this.a;
    }

    private float c() {
        return this.b;
    }

    private float d() {
        return this.c;
    }

    private double e() {
        return Math.sqrt((this.a * this.a) + (this.b * this.b) + (this.c * this.c));
    }

    private void f() {
        double e = e();
        if (e == 0.0d) {
            return;
        }
        this.a = (float) (this.a / e);
        this.b = (float) (this.b / e);
        this.c = (float) (this.c / e);
    }

    public final String toString() {
        return this.a + CommonConstant.Symbol.COMMA + this.b + CommonConstant.Symbol.COMMA + this.c;
    }

    private double c(fz fzVar) {
        return (Math.acos((((this.a * fzVar.a) + (this.b * fzVar.b)) + (this.c * fzVar.c)) / (e() * fzVar.e())) * 180.0d) / 3.141592653589793d;
    }
}
