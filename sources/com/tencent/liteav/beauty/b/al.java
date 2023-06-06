package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class al extends com.tencent.liteav.basic.opengl.j {
    private static String x = "ZoomInOut";
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;
    private final float[] y;
    private float[] z;

    public al() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "precision highp float;\nvarying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\nuniform lowp float alphaLevel;\nuniform vec2 offsetR; \nuniform vec2 offsetG;\nuniform vec2 offsetB;\n\nvoid main()\n{\n\tmediump vec4 fout;\n\tfout.r = texture2D(inputImageTexture, textureCoordinate + offsetR).r; \n\tfout.g = texture2D(inputImageTexture, textureCoordinate + offsetG).g; \n\tfout.b = texture2D(inputImageTexture, textureCoordinate + offsetB).b; \n\tfout.a = alphaLevel;\n\n    gl_FragColor = fout;\n}\n\n");
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.3f;
        this.y = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.z = (float[]) this.y.clone();
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        if (!super.a()) {
            TXCLog.e(x, "onInit failed");
            return false;
        }
        this.r = GLES20.glGetUniformLocation(this.a, "textureTransform");
        this.v = GLES20.glGetUniformLocation(this.a, "alphaLevel");
        this.s = GLES20.glGetUniformLocation(this.a, "offsetR");
        this.t = GLES20.glGetUniformLocation(this.a, "offsetG");
        this.u = GLES20.glGetUniformLocation(this.a, "offsetB");
        a(this.w);
        return true;
    }

    public void a(float[] fArr, float[] fArr2, float[] fArr3) {
        a(this.s, fArr);
        a(this.t, fArr2);
        a(this.u, fArr3);
    }

    public void a(float f) {
        this.w = f;
        a(this.v, this.w);
    }

    public void a(float f, int i) {
        if (f <= 0.0f) {
            this.z = (float[]) this.y.clone();
            return;
        }
        this.z = (float[]) this.y.clone();
        for (int i2 = 0; i2 < i; i2++) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.scaleM(fArr, 0, f, f, 1.0f);
            Matrix.multiplyMM(this.z, 0, fArr, 0, this.z, 0);
            Matrix.setIdentityM(fArr, 0);
            Matrix.translateM(fArr, 0, 0.02f, 0.02f, 1.0f);
            Matrix.multiplyMM(this.z, 0, fArr, 0, this.z, 0);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        return a(i, this.m, this.n);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.a);
        k();
        if (!n() || this.z == null) {
            return;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.b);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glUniformMatrix4fv(this.r, 1, false, this.z, 0);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(this.c, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.b);
        GLES20.glDisableVertexAttribArray(this.d);
        GLES20.glBindTexture(3553, 0);
    }
}
