package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.dianping.titans.service.FileUtil;
import com.tencent.liteav.beauty.NativeLoad;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i extends com.tencent.liteav.basic.opengl.j {
    private int[] A;
    private float B = 4.0f;
    int r;
    int s;
    boolean t;
    private d u;
    private com.tencent.liteav.basic.opengl.j v;
    private c w;
    private a x;
    private b y;
    private int[] z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class c extends ae {
        int r;
        int s;
        float t;

        public c() {
            super(null, null);
            this.t = 1.5f;
        }

        @Override // com.tencent.liteav.basic.opengl.j
        public boolean c() {
            this.a = NativeLoad.nativeLoadGLProgram(2);
            if (this.a != 0 && a()) {
                this.g = true;
            } else {
                this.g = false;
            }
            d();
            return this.g;
        }

        @Override // com.tencent.liteav.beauty.b.ae, com.tencent.liteav.basic.opengl.j
        public boolean a() {
            if (super.a()) {
                this.r = GLES20.glGetUniformLocation(this.a, "texelWidthOffset");
                this.s = GLES20.glGetUniformLocation(this.a, "texelHeightOffset");
                return true;
            }
            return false;
        }

        void a(float f) {
            this.t = f;
            a(this.r, this.t / this.e);
            a(this.s, this.t / this.f);
        }

        @Override // com.tencent.liteav.basic.opengl.j
        public void a(int i, int i2) {
            super.a(i, i2);
            a(this.t);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends ae {
        public a(String str) {
            super(str);
        }

        @Override // com.tencent.liteav.beauty.b.ae, com.tencent.liteav.basic.opengl.j
        public boolean a() {
            return super.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends ad {
        public b(String str) {
            super(str);
        }

        @Override // com.tencent.liteav.beauty.b.ad, com.tencent.liteav.basic.opengl.j
        public boolean a() {
            return super.a();
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean a() {
        boolean a2 = super.a();
        if (a2) {
            this.u = new d();
            if (a2) {
                a2 = this.u.c();
            }
            this.w = new c();
            if (a2) {
                a2 = this.w.c();
            }
            this.x = new a("precision highp float;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvarying vec2 textureCoordinate;  \nvarying vec2 textureCoordinate2;  \nvoid main()  \n{  \n\tgl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);  \n}  \n");
            if (a2) {
                a2 = this.x.c();
            }
            this.y = new b("precision highp float;   \nuniform sampler2D inputImageTexture;   \nuniform sampler2D inputImageTexture2;  \nuniform sampler2D inputImageTexture3;   \nvarying vec2 textureCoordinate;   \nvarying vec2 textureCoordinate2;  \nvarying vec2 textureCoordinate3;    \nvoid main()   \n{   \n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);   \n}   \n");
            if (a2) {
                a2 = this.y.c();
            }
            this.v = new com.tencent.liteav.basic.opengl.j();
            this.v.a(true);
            if (a2) {
                a2 = this.v.c();
            }
            if (a2) {
                return true;
            }
        }
        e();
        return false;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        if (this.f == i2 && this.e == i) {
            return;
        }
        super.a(i, i2);
        if (!this.t) {
            if (i < i2) {
                if (i < 540) {
                    this.B = 1.0f;
                } else {
                    this.B = 4.0f;
                }
            } else if (i2 < 540) {
                this.B = 1.0f;
            } else {
                this.B = 4.0f;
            }
        }
        this.r = (int) (i / this.B);
        this.s = (int) (i2 / this.B);
        this.v.a(this.r, this.s);
        this.w.a(this.r, this.s);
        this.x.a(this.r, this.s);
        this.y.a(i, i2);
        this.u.a(this.r, this.s);
        if (this.z != null) {
            GLES20.glDeleteFramebuffers(this.z.length, this.z, 0);
            GLES20.glDeleteTextures(this.z.length, this.A, 0);
            this.z = null;
            this.A = null;
        }
        this.z = new int[8];
        this.A = new int[this.z.length];
        GLES20.glGenFramebuffers(this.z.length, this.z, 0);
        GLES20.glGenTextures(this.z.length, this.A, 0);
        for (int i3 = 0; i3 < this.z.length; i3++) {
            GLES20.glBindTexture(3553, this.A[i3]);
            if (i3 >= 5) {
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            } else {
                GLES20.glTexImage2D(3553, 0, 6408, this.r, this.s, 0, 6408, 5121, null);
            }
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.z[i3]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.A[i3], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        int i2;
        if (this.B != 1.0f) {
            GLES20.glViewport(0, 0, this.r, this.s);
            i2 = this.v.a(i);
        } else {
            i2 = i;
        }
        int a2 = this.u.a(i2, this.z[4], this.A[4]);
        int a3 = this.w.a(i2, a2, this.z[0], this.A[0]);
        int a4 = this.x.a(a3, a2, this.z[1], this.A[1]);
        int a5 = this.u.a(a3, this.z[2], this.A[2]);
        int a6 = this.u.a(a4, this.z[3], this.A[3]);
        if (this.B != 1.0f) {
            GLES20.glViewport(0, 0, this.e, this.f);
            a5 = this.v.a(a5, this.z[5], this.A[5]);
            a6 = this.v.a(a6, this.z[6], this.A[6]);
        }
        return this.y.a(a5, a6, i, this.z[7], this.A[7]);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        if (this.g) {
            super.b();
            this.u.e();
            this.w.e();
            this.x.e();
            this.y.e();
            this.v.e();
            if (this.z != null) {
                GLES20.glDeleteFramebuffers(this.z.length, this.z, 0);
                GLES20.glDeleteTextures(this.z.length, this.A, 0);
                this.z = null;
            }
            this.A = null;
        }
    }
}
