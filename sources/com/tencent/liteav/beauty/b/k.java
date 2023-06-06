package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k extends com.tencent.liteav.basic.opengl.j {
    private int r;
    private float s;

    public k() {
        this(1.2f);
    }

    public k(float f) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }");
        this.s = f;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.r = GLES20.glGetUniformLocation(q(), "gamma");
        return a;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void d() {
        super.d();
        a(this.s);
    }

    public void a(float f) {
        this.s = f;
        a(this.r, this.s);
    }
}
