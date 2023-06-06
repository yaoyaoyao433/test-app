package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class v extends com.tencent.liteav.basic.opengl.j {
    private int r = -1;

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.r = GLES20.glGetUniformLocation(q(), "purlColor");
        c(this.r, new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        return a;
    }

    public void b(float[] fArr) {
        c(this.r, fArr);
    }
}
