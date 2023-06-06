package com.tencent.liteav.beauty.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class t extends com.tencent.liteav.basic.opengl.j {
    protected String r;
    protected Bitmap s;
    public int t;
    public int u;
    protected int v;
    protected float w;

    public t(Bitmap bitmap) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2; // lookup texture\n \n \n uniform lowp float intensity;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float blueColor = textureColor.b * 63.0;\n     \n     mediump vec2 quad1;\n     quad1.y = floor(floor(blueColor) / 8.0);\n     quad1.x = floor(blueColor) - (quad1.y * 8.0);\n     \n     mediump vec2 quad2;\n     quad2.y = floor(ceil(blueColor) / 8.0);\n     quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n     \n     highp vec2 texPos1;\n     texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     highp vec2 texPos2;\n     texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     lowp vec4 newColor1 = texture2D(inputImageTexture2, texPos1);\n     lowp vec4 newColor2 = texture2D(inputImageTexture2, texPos2);\n     \n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n }");
        this.s = bitmap;
    }

    public t(String str, String str2) {
        super(str, str2);
        this.r = null;
        this.s = null;
        this.u = -1;
        this.v = -1;
    }

    public t() {
        this.r = null;
        this.s = null;
        this.u = -1;
        this.v = -1;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        this.t = GLES20.glGetUniformLocation(q(), "inputImageTexture2");
        this.v = GLES20.glGetUniformLocation(q(), "intensity");
        this.w = 0.5f;
        return super.a();
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void d() {
        super.d();
        a(this.s);
        a(this.w);
    }

    public void a(final Bitmap bitmap) {
        a(new Runnable() { // from class: com.tencent.liteav.beauty.b.t.1
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    t.this.u = TXCOpenGlUtils.a(bitmap, t.this.u, false);
                }
            }
        });
    }

    public void a(float f) {
        this.w = f;
        a(this.v, this.w);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        super.b();
        GLES20.glDeleteTextures(1, new int[]{this.u}, 0);
        this.u = -1;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void j() {
        if (this.u != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void i() {
        if (this.u != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.u);
            GLES20.glUniform1i(this.t, 3);
        }
    }
}
