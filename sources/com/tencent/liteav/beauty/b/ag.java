package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ag extends af {
    protected float u;

    public ag(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        this.u = 4.0f;
    }

    @Override // com.tencent.liteav.beauty.b.j, com.tencent.liteav.basic.opengl.j
    public boolean a() {
        return super.a() && GLES20.glGetError() == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        float u = u();
        com.tencent.liteav.basic.opengl.j jVar = this.r.get(0);
        int glGetUniformLocation = GLES20.glGetUniformLocation(jVar.q(), "texelWidthOffset");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(jVar.q(), "texelHeightOffset");
        jVar.a(glGetUniformLocation, u / this.e);
        jVar.a(glGetUniformLocation2, 0.0f);
        float t = t();
        com.tencent.liteav.basic.opengl.j jVar2 = this.r.get(1);
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(jVar2.q(), "texelWidthOffset");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(jVar2.q(), "texelHeightOffset");
        jVar2.a(glGetUniformLocation3, 0.0f);
        jVar2.a(glGetUniformLocation4, t / this.f);
    }

    @Override // com.tencent.liteav.beauty.b.j, com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
        v();
    }

    public float t() {
        return this.u;
    }

    public float u() {
        return this.u;
    }
}
