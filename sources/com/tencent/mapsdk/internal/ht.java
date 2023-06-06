package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ht extends hn {
    private float g;
    private float h;
    private float i;
    private float j;

    private ht(float f, float f2, float f3, float f4, long j) {
        super(j);
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
    }

    @Override // com.tencent.mapsdk.internal.hn
    protected final void a(GL10 gl10, long j) {
        float f = (float) j;
        gl10.glTranslatef(this.g + (((this.h - this.g) * f) / ((float) this.e)), this.i + (((this.j - this.i) * f) / ((float) this.e)), 0.0f);
    }
}
