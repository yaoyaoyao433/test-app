package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.liteav.basic.opengl.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class z extends com.tencent.liteav.basic.opengl.j {
    private static String r = "precision mediump float;\nvarying mediump vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform float scale;\n uniform mediump float alpha;\n\nvoid main(void) {\n    gl_FragColor = vec4(texture2D(inputImageTexture, textureCoordinate).rgb, alpha); \n}\n";
    private float A;
    private boolean B;
    private int s;
    private int t;
    private float[] u;
    private int v;
    private int w;
    private int x;
    private float[] y;
    private float z;

    public z() {
        super("attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform mat4 transformMatrix;\n uniform mat4 orthographicMatrix;\n \n varying vec2 textureCoordinate;\n void main()\n {\n     gl_Position = transformMatrix * vec4(position.xyz, 1.0) * orthographicMatrix;\n     textureCoordinate = inputTextureCoordinate.xy;\n }", r);
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.z = 1.0f;
        this.A = 1.0f;
        this.u = new float[16];
        Matrix.orthoM(this.u, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        this.y = new float[16];
        Matrix.setIdentityM(this.y, 0);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a = super.a();
        this.s = GLES20.glGetUniformLocation(q(), "transformMatrix");
        this.t = GLES20.glGetUniformLocation(q(), "orthographicMatrix");
        this.v = GLES20.glGetUniformLocation(q(), "scale");
        this.w = GLES20.glGetUniformLocation(q(), "center");
        this.x = GLES20.glGetUniformLocation(q(), "alpha");
        d(this.s, this.y);
        d(this.t, this.u);
        a(this.v, this.z);
        b(this.A);
        a(this.w, new float[]{0.5f, 0.5f});
        return a;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void d() {
        super.d();
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        if (this.f == i2 && this.e == i) {
            return;
        }
        super.a(i, i2);
        if (this.B) {
            return;
        }
        float f = i2;
        float f2 = i;
        Matrix.orthoM(this.u, 0, -1.0f, 1.0f, ((-1.0f) * f) / f2, (f * 1.0f) / f2, -1.0f, 1.0f);
        d(this.t, this.u);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i, int i2, int i3) {
        if (this.g) {
            GLES20.glBindFramebuffer(36160, i2);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            a(i, this.h, this.i);
            if (this.l instanceof j.a) {
                this.l.a(i3);
            }
            GLES20.glBindFramebuffer(36160, 0);
            return i3;
        }
        return -1;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!this.B) {
            floatBuffer.position(0);
            floatBuffer.get(r0);
            float p = p() / o();
            float[] fArr = {0.0f, fArr[1] * p, 0.0f, fArr[3] * p, 0.0f, fArr[5] * p, 0.0f, fArr[7] * p};
            floatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBuffer.put(fArr).position(0);
        }
        super.a(i, floatBuffer, floatBuffer2);
    }

    public void a(float f) {
        a((float[]) null, f);
    }

    private float[] a(float[] fArr, float f) {
        if (fArr == null) {
            fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
        }
        Matrix.setRotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        this.y = fArr;
        d(this.s, this.y);
        return fArr;
    }

    private float[] b(float[] fArr, float f) {
        if (fArr == null) {
            fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
        }
        Matrix.scaleM(fArr, 0, f, f, 1.0f);
        this.y = fArr;
        d(this.s, this.y);
        return fArr;
    }

    public float[] a(float f, float f2) {
        return b(a((float[]) null, f), f2);
    }

    public void b(float f) {
        a(this.x, f);
    }
}
