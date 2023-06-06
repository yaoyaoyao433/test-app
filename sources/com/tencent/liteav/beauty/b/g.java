package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g extends ad {
    private int A;
    private float[] B;
    private int x;
    private int y;
    private int z;

    @Override // com.tencent.liteav.basic.opengl.j
    public void d() {
        super.d();
        this.x = GLES20.glGetUniformLocation(q(), "screenMode");
        this.y = GLES20.glGetUniformLocation(q(), "screenReplaceColor");
        this.z = GLES20.glGetUniformLocation(q(), "screenMirrorX");
        this.A = GLES20.glGetUniformLocation(q(), "screenMirrorY");
        b(this.B);
    }

    public void b(float[] fArr) {
        float[] fArr2 = {(float) ((fArr[0] * 0.2989d) + (fArr[1] * 0.5866d) + (fArr[2] * 0.1145d)), (float) ((fArr[0] - fArr2[0]) * 0.7132d), (float) ((fArr[2] - fArr2[0]) * 0.5647d)};
        b(this.y, fArr2);
    }
}
