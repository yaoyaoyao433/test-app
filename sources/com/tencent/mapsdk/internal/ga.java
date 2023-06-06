package com.tencent.mapsdk.internal;

import android.opengl.Matrix;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ga {
    public float a;
    public float b;
    public float c;
    public float d = 1.0f;

    public ga() {
    }

    public ga(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    private ga a(float[] fArr) {
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, fArr, 0, new float[]{this.a, this.b, this.c, this.d}, 0);
        return new ga(fArr2[0] / fArr2[3], fArr2[1] / fArr2[3], fArr2[2] / fArr2[3]);
    }

    public final String toString() {
        return this.a + CommonConstant.Symbol.COMMA + this.b + CommonConstant.Symbol.COMMA + this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ga) {
            ga gaVar = (ga) obj;
            return this.a == gaVar.a && this.b == gaVar.b && this.c == gaVar.c;
        }
        return false;
    }
}
