package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.beauty.NativeLoad;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends b {
    private static final String r = "c";
    private i s;
    private a t;
    private ab u = null;
    private int v = -1;
    private int w = -1;
    private float x = 0.0f;
    private float y = 0.0f;
    private float z = 0.0f;
    private float A = 0.0f;

    private static float a(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public int a(int i) {
        if (this.x > 0.0f || this.y > 0.0f || this.z > 0.0f) {
            i = this.t.a(this.x != 0.0f ? this.s.a(i) : i, i, i);
        }
        return this.A > 0.0f ? this.u.a(i) : i;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        if (this.v == i && this.w == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder("onOutputSizeChanged mFrameWidth = ");
        sb.append(i);
        sb.append("  mFrameHeight = ");
        sb.append(i2);
        this.v = i;
        this.w = i2;
        c(this.v, this.w);
    }

    @Override // com.tencent.liteav.beauty.b.b
    public boolean c(int i, int i2) {
        this.v = i;
        this.w = i2;
        StringBuilder sb = new StringBuilder("init mFrameWidth = ");
        sb.append(i);
        sb.append("  mFrameHeight = ");
        sb.append(i2);
        if (this.s == null) {
            this.s = new i();
            this.s.a(true);
            if (!this.s.c()) {
                Log.e(r, "mNewFaceFilter init Failed");
                return false;
            }
        }
        this.s.a(this.v, this.w);
        if (this.t == null) {
            this.t = new a();
            this.t.a(true);
            if (!this.t.c()) {
                Log.e(r, "mBeautyCoreFilter init Failed");
                return false;
            }
        }
        this.t.a(this.v, this.w);
        if (this.u == null) {
            this.u = new ab();
            this.u.a(true);
            if (!this.u.c()) {
                Log.e(r, "mSharpenessFilter init Failed");
                return false;
            }
        }
        this.u.a(this.v, this.w);
        return true;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        if (this.t != null) {
            this.t.e();
            this.t = null;
        }
        if (this.s != null) {
            this.s.e();
            this.s = null;
        }
        if (this.u != null) {
            this.u.e();
            this.u = null;
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void c(int i) {
        float f = i;
        this.x = f;
        if (this.t != null) {
            this.t.a(f);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void d(int i) {
        float f = i;
        this.y = f;
        if (this.t != null) {
            this.t.b(f);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void e(int i) {
        float f = i;
        this.z = f;
        if (this.t != null) {
            this.t.c(f);
        }
    }

    @Override // com.tencent.liteav.beauty.b.b
    public void f(int i) {
        float f = i / 15.0f;
        if (Math.abs(this.A - f) < 0.001d) {
            return;
        }
        this.A = f;
        if (this.u != null) {
            this.u.a(this.A);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends ad {
        private int x;
        private int y;
        private int z;

        public a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
            this.x = -1;
            this.y = -1;
            this.z = -1;
        }

        @Override // com.tencent.liteav.basic.opengl.j
        public boolean c() {
            this.a = NativeLoad.nativeLoadGLProgram(1);
            if (this.a != 0 && a()) {
                this.g = true;
            } else {
                this.g = false;
            }
            d();
            return this.g;
        }

        @Override // com.tencent.liteav.beauty.b.ad, com.tencent.liteav.basic.opengl.j
        public void a(int i, int i2) {
            if (this.f == i2 && this.e == i) {
                return;
            }
            super.a(i, i2);
            this.x = GLES20.glGetUniformLocation(q(), "smoothDegree");
            this.y = GLES20.glGetUniformLocation(q(), "brightDegree");
            this.z = GLES20.glGetUniformLocation(q(), "ruddyDegree");
        }

        @Override // com.tencent.liteav.beauty.b.ad, com.tencent.liteav.basic.opengl.j
        public boolean a() {
            return super.a();
        }

        public void a(float f) {
            a(this.x, c.b(f));
        }

        public void b(float f) {
            a(this.y, f / 3.0f);
        }

        public void c(float f) {
            a(this.z, (f / 10.0f) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float b(float f) {
        if (f > 1.0f) {
            double d = f;
            if (d < 2.5d) {
                f = a((f - 1.0f) / 1.5f, 1.0f, 4.1f);
            } else if (f < 4.0f) {
                f = a((f - 2.5f) / 1.5f, 4.1f, 5.6f);
            } else if (d < 5.5d) {
                f = a((f - 4.0f) / 1.5f, 5.6f, 6.8f);
            } else if (d <= 7.0d) {
                f = a((f - 5.5f) / 1.5f, 6.8f, 7.0f);
            }
            return f / 10.0f;
        }
        return 0.1f;
    }
}
