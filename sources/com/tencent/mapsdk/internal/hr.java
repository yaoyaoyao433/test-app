package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hr extends hq {
    private long k;
    private long l;

    private hr(float f, float f2, float f3, float f4, long j, long j2) {
        super(f, f2, f3, f4, j + j2);
        this.k = j;
        this.l = j2;
    }

    @Override // com.tencent.mapsdk.internal.hq, com.tencent.mapsdk.internal.hn
    protected final void a(GL10 gl10, long j) {
        float f;
        float f2;
        float f3 = this.h - this.g;
        float f4 = this.j - this.i;
        if (j < this.k) {
            float f5 = (float) j;
            f = this.g + ((f3 * f5) / ((float) this.k));
            f2 = this.i + ((f4 * f5) / ((float) this.k));
        } else {
            float f6 = (float) (j - this.k);
            f = this.h - ((f3 * f6) / ((float) this.l));
            f2 = this.j - ((f4 * f6) / ((float) this.l));
        }
        gl10.glScalef(f, f2, 1.0f);
    }
}
