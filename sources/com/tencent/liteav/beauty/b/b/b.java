package com.tencent.liteav.beauty.b.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.beauty.NativeLoad;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends j {
    private int r;
    private int s;
    private float[] t;
    private String u;

    public b() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.r = -1;
        this.s = -1;
        this.t = new float[4];
        this.u = "Beauty3Filter";
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean c() {
        this.a = NativeLoad.nativeLoadGLProgram(14);
        if (this.a != 0 && a()) {
            this.g = true;
        } else {
            this.g = false;
        }
        d();
        return this.g;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.r = GLES20.glGetUniformLocation(q(), "singleStepOffset");
        this.s = GLES20.glGetUniformLocation(q(), "beautyParams");
        a(5.0f);
        return a;
    }

    public void c(int i, int i2) {
        a(this.r, new float[]{2.0f / i, 2.0f / i2});
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
        c(i, i2);
    }

    public void a(float f) {
        this.t[0] = f;
        b(this.t);
    }

    public void b(float f) {
        this.t[1] = f;
        b(this.t);
    }

    public void c(float f) {
        this.t[2] = f;
        b(this.t);
    }

    private void b(float[] fArr) {
        c(this.s, fArr);
    }
}
