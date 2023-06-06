package com.tencent.liteav.beauty.b.c;

import android.opengl.GLES20;
import com.tencent.liteav.beauty.b.ae;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends ae {
    private int r;
    private int s;

    public b() {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n }\n", " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     lowp vec3 iColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp vec3 meanColor = texture2D(inputImageTexture2, textureCoordinate).rgb;\n     highp vec3 diffColor = (iColor - meanColor) * 7.07;\n     diffColor = min(diffColor * diffColor, 1.0);\n     gl_FragColor = vec4(diffColor, 1.0);\n }\n");
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        float min = Math.min(1.0f, 360.0f / Math.min(i, i2));
        this.r = Math.round(i * min);
        this.s = Math.round(i2 * min);
        super.a(this.r, this.s);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        GLES20.glViewport(0, 0, this.r, this.s);
        return super.a(i, this.m, this.n);
    }
}
