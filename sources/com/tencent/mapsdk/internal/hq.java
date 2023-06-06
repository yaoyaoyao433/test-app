package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class hq extends hn {
    protected float g;
    protected float h;
    protected float i;
    protected float j;

    public hq(float f, float f2, float f3, float f4, long j) {
        super(j);
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = f4;
    }

    @Override // com.tencent.mapsdk.internal.hn
    protected void a(GL10 gl10, long j) {
        float f = (float) j;
        gl10.glScalef(this.g + (((this.h - this.g) * f) / ((float) this.e)), this.i + (((this.j - this.i) * f) / ((float) this.e)), 1.0f);
    }
}
