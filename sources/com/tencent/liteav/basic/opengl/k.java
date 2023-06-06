package com.tencent.liteav.basic.opengl;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k extends j {
    public boolean r;
    private float[] s;
    private int t;

    public k() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.s = new float[16];
        this.r = false;
        this.o = true;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.t = GLES20.glGetUniformLocation(this.a, "textureTransform");
        return a && GLES20.glGetError() == 0;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(float[] fArr) {
        this.s = fArr;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.a);
        k();
        if (!n() || this.s == null) {
            return;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.b);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glUniformMatrix4fv(this.t, 1, false, this.s, 0);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.c, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.b);
        GLES20.glDisableVertexAttribArray(this.d);
        GLES20.glBindTexture(36197, 0);
    }
}
