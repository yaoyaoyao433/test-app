package com.tencent.liteav.k;

import android.opengl.GLES20;
import com.tencent.liteav.k.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.tencent.liteav.basic.opengl.j {
    n.d r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public c() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float; \nvarying vec2 textureCoordinate; \nuniform sampler2D inputImageTexture; \nuniform float t; \nuniform float st; \nconst float stride = 7.0; \nconst float interval = 1.0; \nuniform float zMin; \nuniform float zMax; \nuniform vec2 center; \nuniform vec2 offsetR; \nuniform vec2 offsetG; \nuniform vec2 offsetB;\n\nfloat GetFactor(float elapse, float astride, float ainterval, float amp) \n{ \n\tfloat ff = mod(elapse, astride + ainterval) / astride; \n\tif (ff > 1.0) \n\t{ \n\t\tff = 0.0; \n\t} \n\treturn pow(ff, 3.0) * 1.125 * amp; \n} \nvec2 _uv(vec2 uv, vec2 center, float zz, float min) \n{ \n\treturn uv + (zz + min) * (center - uv); \n} \nvoid main() \n{ \n\tvec4 fout; \n\tfloat zz = GetFactor(t - st, stride, interval, zMax - zMin); \n\tfloat coeff = pow(zz, 0.75); \n\tfout.r = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetR * coeff).r; \n\tfout.g = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetG * coeff).g; \n\tfout.b = texture2D(inputImageTexture, _uv(textureCoordinate, center, zz, zMin) + offsetB * coeff).b; \n\tgl_FragColor = vec4(fout.rgb, 1.0); \n}\n");
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.r = null;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        super.a(i, i2);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        if (super.a()) {
            this.s = GLES20.glGetUniformLocation(this.a, "zMin");
            this.t = GLES20.glGetUniformLocation(this.a, "zMax");
            this.u = GLES20.glGetUniformLocation(this.a, "t");
            this.v = GLES20.glGetUniformLocation(this.a, "st");
            this.w = GLES20.glGetUniformLocation(this.a, "center");
            this.x = GLES20.glGetUniformLocation(this.a, "offsetR");
            this.y = GLES20.glGetUniformLocation(this.a, "offsetG");
            this.z = GLES20.glGetUniformLocation(this.a, "offsetB");
            return true;
        }
        return false;
    }

    public void a(n.d dVar) {
        this.r = dVar;
        a(this.r.f, this.r.g, this.r.h);
        b(this.r.c);
        a(this.r.a, this.r.b);
        a(this.r.e);
        b(this.r.d);
    }

    private void a(float[] fArr, float[] fArr2, float[] fArr3) {
        a(this.x, fArr);
        a(this.y, fArr2);
        a(this.z, fArr3);
    }

    private void b(float[] fArr) {
        a(this.w, fArr);
    }

    private void a(float f, float f2) {
        a(this.s, f);
        a(this.t, f2);
    }

    private void a(float f) {
        a(this.u, f);
    }

    private void b(float f) {
        a(this.v, f);
    }
}
