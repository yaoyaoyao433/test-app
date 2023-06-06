package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.io;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class il extends ip {
    private double g;
    private double h;
    private double i;
    private boolean j;

    public il(io.a... aVarArr) {
        super(aVarArr);
        this.j = true;
    }

    @Override // com.tencent.mapsdk.internal.ip
    public final Object a(float f) {
        return Double.valueOf(b(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.ip
    /* renamed from: b */
    public il clone() {
        ArrayList<io> arrayList = this.e;
        int size = this.e.size();
        io.a[] aVarArr = new io.a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (io.a) arrayList.get(i).clone();
        }
        return new il(aVarArr);
    }

    public final double b(float f) {
        if (this.a == 2) {
            if (this.j) {
                this.j = false;
                this.g = ((io.a) this.e.get(0)).e;
                this.h = ((io.a) this.e.get(1)).e;
                this.i = this.h - this.g;
            }
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            if (this.f == null) {
                return this.g + (f * this.i);
            }
            return ((Number) this.f.a(f, Double.valueOf(this.g), Double.valueOf(this.h))).doubleValue();
        } else if (f <= 0.0f) {
            io.a aVar = (io.a) this.e.get(0);
            io.a aVar2 = (io.a) this.e.get(1);
            double d = aVar.e;
            double d2 = aVar2.e;
            float f2 = aVar.a;
            float f3 = aVar2.a;
            Interpolator interpolator = aVar2.c;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            float f4 = (f - f2) / (f3 - f2);
            return this.f == null ? d + (f4 * (d2 - d)) : ((Number) this.f.a(f4, Double.valueOf(d), Double.valueOf(d2))).floatValue();
        } else if (f >= 1.0f) {
            io.a aVar3 = (io.a) this.e.get(this.a - 2);
            io.a aVar4 = (io.a) this.e.get(this.a - 1);
            double d3 = aVar3.e;
            double d4 = aVar4.e;
            float f5 = aVar3.a;
            float f6 = aVar4.a;
            Interpolator interpolator2 = aVar4.c;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            return this.f == null ? d3 + (f7 * (d4 - d3)) : ((Number) this.f.a(f7, Double.valueOf(d3), Double.valueOf(d4))).floatValue();
        } else {
            io.a aVar5 = (io.a) this.e.get(0);
            int i = 1;
            while (i < this.a) {
                io.a aVar6 = (io.a) this.e.get(i);
                if (f < aVar6.a) {
                    Interpolator interpolator3 = aVar6.c;
                    if (interpolator3 != null) {
                        f = interpolator3.getInterpolation(f);
                    }
                    float f8 = (f - aVar5.a) / (aVar6.a - aVar5.a);
                    double d5 = aVar5.e;
                    double d6 = aVar6.e;
                    return this.f == null ? d5 + (f8 * (d6 - d5)) : ((Number) this.f.a(f8, Double.valueOf(d5), Double.valueOf(d6))).floatValue();
                }
                i++;
                aVar5 = aVar6;
            }
            return ((Number) this.e.get(this.a - 1).d()).floatValue();
        }
    }
}
