package com.tencent.liteav.beauty.b.c;

import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends j {
    private final boolean r;
    private int s;
    private int t;
    private int u;
    private int v;

    public d(boolean z) {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform float texelWidthOffset;\n uniform float texelHeightOffset;\n \n varying vec2 textureCoordinate;\n varying vec4 textureShift_1;\n varying vec4 textureShift_2;\n varying vec4 textureShift_3;\n varying vec4 textureShift_4;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     \n     vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n     textureShift_1 = vec4(textureCoordinate - singleStepOffset, textureCoordinate + singleStepOffset);\n     textureShift_2 = vec4(textureCoordinate - 2.0 * singleStepOffset, textureCoordinate + 2.0 * singleStepOffset);\n     textureShift_3 = vec4(textureCoordinate - 3.0 * singleStepOffset, textureCoordinate + 3.0 * singleStepOffset);\n     textureShift_4 = vec4(textureCoordinate - 4.0 * singleStepOffset, textureCoordinate + 4.0 * singleStepOffset);\n }\n", "uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n varying highp vec4 textureShift_1;\n varying highp vec4 textureShift_2;\n varying highp vec4 textureShift_3;\n varying highp vec4 textureShift_4;\n \n void main()\n {\n     mediump vec3 sum = texture2D(inputImageTexture, textureCoordinate).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.zw).rgb;\n     \n     gl_FragColor = vec4(sum * 0.1111, 1.0);\n }\n");
        this.s = -1;
        this.t = -1;
        this.r = z;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        if (super.a()) {
            this.s = GLES20.glGetUniformLocation(q(), "texelWidthOffset");
            this.t = GLES20.glGetUniformLocation(q(), "texelHeightOffset");
            return true;
        }
        return false;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        float min = Math.min(1.0f, 360.0f / Math.min(i, i2));
        this.u = Math.round(i * min);
        this.v = Math.round(i2 * min);
        super.a(this.u, this.v);
        if (this.r) {
            a(this.s, 0.0f);
            a(this.t, 1.5f / this.v);
            return;
        }
        a(this.s, 1.5f / this.u);
        a(this.t, 0.0f);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        GLES20.glViewport(0, 0, this.u, this.v);
        return super.a(i, this.m, this.n);
    }
}
