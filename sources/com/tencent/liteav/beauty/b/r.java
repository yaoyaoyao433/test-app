package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class r extends com.tencent.liteav.basic.opengl.j {
    private static String r = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform int  bTransform;\nuniform mat4 textureTransform;\n\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n     gl_Position = position;\n    if (0 != bTransform){\n        textureCoordinate =  (textureTransform * inputTextureCoordinate).xy;\n    }else{\n        textureCoordinate = inputTextureCoordinate.xy;\n    }\n}\n";
    private int s;
    private boolean t;

    public r() {
        this(r, "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }

    public r(String str, String str2, boolean z) {
        super(str, str2, z);
        this.s = -1;
        this.t = false;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.s = GLES20.glGetUniformLocation(this.a, "bTransform");
        b(this.s, 0);
        return a;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(float[] fArr) {
        if (fArr != null) {
            b(this.s, 1);
        } else {
            b(this.s, 0);
        }
        super.a(fArr);
    }

    public void c(boolean z) {
        if (z != this.t) {
            this.t = z;
            h();
        }
    }
}
