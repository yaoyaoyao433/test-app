package com.tencent.mapsdk.internal;

import android.view.animation.Interpolator;
import com.tencent.mapsdk.internal.io;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class in extends ip {
    private int g;
    private int h;
    private int i;
    private boolean j;

    public in(io.b... bVarArr) {
        super(bVarArr);
        this.j = true;
    }

    @Override // com.tencent.mapsdk.internal.ip
    public final Object a(float f) {
        return Integer.valueOf(b(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.ip
    /* renamed from: b */
    public in clone() {
        ArrayList<io> arrayList = this.e;
        int size = this.e.size();
        io.b[] bVarArr = new io.b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = (io.b) arrayList.get(i).clone();
        }
        return new in(bVarArr);
    }

    public final int b(float f) {
        if (this.a == 2) {
            if (this.j) {
                this.j = false;
                this.g = ((io.b) this.e.get(0)).e;
                this.h = ((io.b) this.e.get(1)).e;
                this.i = this.h - this.g;
            }
            if (this.d != null) {
                f = this.d.getInterpolation(f);
            }
            if (this.f == null) {
                return this.g + ((int) (f * this.i));
            }
            return ((Number) this.f.a(f, Integer.valueOf(this.g), Integer.valueOf(this.h))).intValue();
        } else if (f <= 0.0f) {
            io.b bVar = (io.b) this.e.get(0);
            io.b bVar2 = (io.b) this.e.get(1);
            int i = bVar.e;
            int i2 = bVar2.e;
            float f2 = bVar.a;
            float f3 = bVar2.a;
            Interpolator interpolator = bVar2.c;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            float f4 = (f - f2) / (f3 - f2);
            return this.f == null ? i + ((int) (f4 * (i2 - i))) : ((Number) this.f.a(f4, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
        } else if (f >= 1.0f) {
            io.b bVar3 = (io.b) this.e.get(this.a - 2);
            io.b bVar4 = (io.b) this.e.get(this.a - 1);
            int i3 = bVar3.e;
            int i4 = bVar4.e;
            float f5 = bVar3.a;
            float f6 = bVar4.a;
            Interpolator interpolator2 = bVar4.c;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            return this.f == null ? i3 + ((int) (f7 * (i4 - i3))) : ((Number) this.f.a(f7, Integer.valueOf(i3), Integer.valueOf(i4))).intValue();
        } else {
            io.b bVar5 = (io.b) this.e.get(0);
            int i5 = 1;
            while (i5 < this.a) {
                io.b bVar6 = (io.b) this.e.get(i5);
                if (f < bVar6.a) {
                    Interpolator interpolator3 = bVar6.c;
                    if (interpolator3 != null) {
                        f = interpolator3.getInterpolation(f);
                    }
                    float f8 = (f - bVar5.a) / (bVar6.a - bVar5.a);
                    int i6 = bVar5.e;
                    int i7 = bVar6.e;
                    return this.f == null ? i6 + ((int) (f8 * (i7 - i6))) : ((Number) this.f.a(f8, Integer.valueOf(i6), Integer.valueOf(i7))).intValue();
                }
                i5++;
                bVar5 = bVar6;
            }
            return ((Number) this.e.get(this.a - 1).d()).intValue();
        }
    }
}
