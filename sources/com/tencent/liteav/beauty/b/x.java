package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class x extends com.tencent.liteav.basic.opengl.j {
    private com.tencent.liteav.basic.opengl.a r;

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        if (this.r == null) {
            this.r = new com.tencent.liteav.basic.opengl.a();
            this.r.a = 0;
            this.r.b = 0;
            this.r.c = this.e;
            this.r.d = this.f;
        }
        GLES20.glViewport(this.r.a, this.r.b, this.r.c, this.r.d);
        return super.a(i);
    }
}
