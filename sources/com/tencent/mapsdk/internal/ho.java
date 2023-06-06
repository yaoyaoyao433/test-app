package com.tencent.mapsdk.internal;

import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ho extends hn {
    private float g;
    private float h;

    private ho(float f, float f2, long j) {
        super(j);
        this.g = f;
        this.h = f2;
    }

    @Override // com.tencent.mapsdk.internal.hn
    protected final void a(GL10 gl10, long j) {
        float f = this.g + (((this.h - this.g) * ((float) j)) / ((float) this.e));
        gl10.glColor4f(f, f, f, f);
    }
}
