package com.tencent.liteav.basic.opengl;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected boolean g;
    protected FloatBuffer h;
    protected FloatBuffer i;
    protected float[] j;
    protected float[] k;
    protected a l;
    protected int m;
    protected int n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    private final LinkedList<Runnable> r;
    private final String s;
    private final String t;
    private boolean u;
    private int v;
    private float[] w;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    public j() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }

    public j(String str, String str2) {
        this(str, str2, false);
    }

    public j(String str, String str2, boolean z) {
        this.u = false;
        this.v = -1;
        this.w = null;
        this.m = -1;
        this.n = -1;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = new LinkedList<>();
        this.s = str;
        this.t = str2;
        this.q = z;
        if (true == z) {
            TXCLog.i("TXCGPUFilter", "set Oes fileter");
        }
        this.h = ByteBuffer.allocateDirect(m.e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.j = m.e;
        this.h.put(this.j).position(0);
        this.i = ByteBuffer.allocateDirect(m.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.k = m.a(l.NORMAL, false, true);
        this.i.put(this.k).position(0);
    }

    public boolean c() {
        this.a = TXCOpenGlUtils.a(this.s, this.t);
        if (this.a != 0 && a()) {
            this.g = true;
        } else {
            this.g = false;
        }
        d();
        return this.g;
    }

    public void a(boolean z) {
        this.o = z;
    }

    public void b(boolean z) {
        this.p = z;
        TXCLog.i("TXCGPUFilter", "set Nearest model " + z);
    }

    public void a(a aVar) {
        this.u = aVar != null;
        this.l = aVar;
    }

    public boolean a() {
        this.b = GLES20.glGetAttribLocation(this.a, "position");
        this.c = GLES20.glGetUniformLocation(this.a, "inputImageTexture");
        this.v = GLES20.glGetUniformLocation(this.a, "textureTransform");
        this.d = GLES20.glGetAttribLocation(this.a, "inputTextureCoordinate");
        return true;
    }

    public void e() {
        GLES20.glDeleteProgram(this.a);
        b();
        this.g = false;
    }

    public void b() {
        f();
        this.f = -1;
        this.e = -1;
    }

    private static float[] a(FloatBuffer floatBuffer) {
        if (floatBuffer.limit() <= 0) {
            return null;
        }
        float[] fArr = new float[floatBuffer.limit()];
        for (int i = 0; i < floatBuffer.limit(); i++) {
            fArr[i] = floatBuffer.get(i);
        }
        return fArr;
    }

    public void f() {
        if (this.m != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.m}, 0);
            this.m = -1;
        }
        if (this.n != -1) {
            GLES20.glDeleteTextures(1, new int[]{this.n}, 0);
            this.n = -1;
        }
    }

    public void a(int i, int i2) {
        if (this.f == i2 && this.e == i) {
            return;
        }
        this.e = i;
        this.f = i2;
        if (this.o) {
            if (this.m != -1) {
                f();
            }
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.m = iArr[0];
            this.n = TXCOpenGlUtils.a(i, i2, 6408, 6408);
            GLES20.glBindFramebuffer(36160, this.m);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.n, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.a);
        k();
        if (this.g) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.d);
            if (this.v >= 0 && this.w != null) {
                GLES20.glUniformMatrix4fv(this.v, 1, false, this.w, 0);
            }
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                if (true == this.q) {
                    GLES20.glBindTexture(36197, i);
                } else {
                    GLES20.glBindTexture(3553, i);
                }
                GLES20.glUniform1i(this.c, 0);
            }
            i();
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.b);
            GLES20.glDisableVertexAttribArray(this.d);
            j();
            if (true == this.q) {
                GLES20.glBindTexture(36197, 0);
            } else {
                GLES20.glBindTexture(3553, 0);
            }
        }
    }

    public void a(float[] fArr) {
        this.w = fArr;
    }

    public void g() {
        if (this.k != null) {
            for (int i = 0; i < 8; i += 2) {
                this.k[i] = 1.0f - this.k[i];
            }
            a(this.j, this.k);
        }
    }

    public void h() {
        if (this.k != null) {
            for (int i = 1; i < 8; i += 2) {
                this.k[i] = 1.0f - this.k[i];
            }
            a(this.j, this.k);
        }
    }

    public int b(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.g) {
            a(i, floatBuffer, floatBuffer2);
            if (this.l instanceof a) {
                this.l.a(i);
                return 1;
            }
            return 1;
        }
        return -1;
    }

    public int b(int i) {
        return b(i, this.h, this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        while (!this.r.isEmpty()) {
            this.r.removeFirst().run();
        }
    }

    public int a(int i, int i2, int i3) {
        if (this.g) {
            GLES20.glBindFramebuffer(36160, i2);
            a(i, this.h, this.i);
            if (this.l instanceof a) {
                this.l.a(i3);
            }
            GLES20.glBindFramebuffer(36160, 0);
            return i3;
        }
        return -1;
    }

    public int a(int i) {
        return a(i, this.m, this.n);
    }

    public int l() {
        return this.n;
    }

    public int m() {
        return this.m;
    }

    public void a(float[] fArr, float[] fArr2) {
        this.j = fArr;
        this.h = ByteBuffer.allocateDirect(m.e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.h.put(fArr).position(0);
        this.k = fArr2;
        this.i = ByteBuffer.allocateDirect(m.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.i.put(fArr2).position(0);
    }

    public float[] a(int i, int i2, FloatBuffer floatBuffer, com.tencent.liteav.basic.opengl.a aVar, int i3) {
        float[] a2;
        if (floatBuffer != null) {
            a2 = a(floatBuffer);
        } else if (4 == i3) {
            a2 = m.a(l.NORMAL, false, false);
        } else {
            a2 = m.a(l.NORMAL, false, true);
        }
        if (aVar != null) {
            float f = i * 1.0f;
            float f2 = aVar.a / f;
            float f3 = ((i - aVar.a) - aVar.c) / f;
            float f4 = i2 * 1.0f;
            float f5 = aVar.b / f4;
            float f6 = ((i2 - aVar.b) - aVar.d) / f4;
            for (int i4 = 0; i4 < a2.length / 2; i4++) {
                int i5 = i4 * 2;
                if (a2[i5] < 0.5f) {
                    a2[i5] = a2[i5] + f2;
                } else {
                    a2[i5] = a2[i5] - f3;
                }
                int i6 = i5 + 1;
                if (a2[i6] < 0.5f) {
                    a2[i6] = a2[i6] + f5;
                } else {
                    a2[i6] = a2[i6] - f6;
                }
            }
        }
        return a2;
    }

    public void a(int i, int i2, int i3, float[] fArr, float f, boolean z, boolean z2) {
        int i4;
        float[] fArr2;
        if (fArr == null) {
            fArr2 = m.a(l.NORMAL, false, true);
            i4 = i;
        } else {
            i4 = i;
            fArr2 = fArr;
        }
        float f2 = i4;
        int i5 = i2;
        float f3 = i5;
        float f4 = f2 / f3;
        if (f4 > f) {
            i4 = (int) (f3 * f);
        } else if (f4 < f) {
            i5 = (int) (f2 / f);
        }
        float f5 = (1.0f - (i4 / f2)) / 2.0f;
        float f6 = (1.0f - (i5 / f3)) / 2.0f;
        for (int i6 = 0; i6 < fArr2.length / 2; i6++) {
            int i7 = i6 * 2;
            if (fArr2[i7] < 0.5f) {
                fArr2[i7] = fArr2[i7] + f5;
            } else {
                fArr2[i7] = fArr2[i7] - f5;
            }
            int i8 = i7 + 1;
            if (fArr2[i8] < 0.5f) {
                fArr2[i8] = fArr2[i8] + f6;
            } else {
                fArr2[i8] = fArr2[i8] - f6;
            }
        }
        int i9 = i3 / 90;
        for (int i10 = 0; i10 < i9; i10++) {
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f7;
            fArr2[5] = f8;
        }
        if (i9 == 0 || i9 == 2) {
            if (z) {
                fArr2[0] = 1.0f - fArr2[0];
                fArr2[2] = 1.0f - fArr2[2];
                fArr2[4] = 1.0f - fArr2[4];
                fArr2[6] = 1.0f - fArr2[6];
            }
            if (z2) {
                fArr2[1] = 1.0f - fArr2[1];
                fArr2[3] = 1.0f - fArr2[3];
                fArr2[5] = 1.0f - fArr2[5];
                fArr2[7] = 1.0f - fArr2[7];
            }
        } else {
            if (z2) {
                fArr2[0] = 1.0f - fArr2[0];
                fArr2[2] = 1.0f - fArr2[2];
                fArr2[4] = 1.0f - fArr2[4];
                fArr2[6] = 1.0f - fArr2[6];
            }
            if (z) {
                fArr2[1] = 1.0f - fArr2[1];
                fArr2[3] = 1.0f - fArr2[3];
                fArr2[5] = 1.0f - fArr2[5];
                fArr2[7] = 1.0f - fArr2[7];
            }
        }
        a((float[]) m.e.clone(), fArr2);
    }

    public void a(int i, FloatBuffer floatBuffer) {
        float[] a2;
        if (floatBuffer == null) {
            a2 = m.a(l.NORMAL, false, true);
        } else {
            a2 = a(floatBuffer);
        }
        int i2 = i / 90;
        for (int i3 = 0; i3 < i2; i3++) {
            float f = a2[0];
            float f2 = a2[1];
            a2[0] = a2[2];
            a2[1] = a2[3];
            a2[2] = a2[6];
            a2[3] = a2[7];
            a2[6] = a2[4];
            a2[7] = a2[5];
            a2[4] = f;
            a2[5] = f2;
        }
        a((float[]) m.e.clone(), a2);
    }

    public boolean n() {
        return this.g;
    }

    public int o() {
        return this.e;
    }

    public int p() {
        return this.f;
    }

    public int q() {
        return this.a;
    }

    public void b(final int i, final int i2) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.1
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1i(i, i2);
            }
        });
    }

    public void a(final int i, final float f) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.2
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform1f(i, f);
            }
        });
    }

    public void a(final int i, final float[] fArr) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.3
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform2fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    public void b(final int i, final float[] fArr) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.4
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform3fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    public void c(final int i, final float[] fArr) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.5
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform4fv(i, 1, FloatBuffer.wrap(fArr));
            }
        });
    }

    public void a(final int i, final PointF pointF) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.6
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniform2fv(i, 1, new float[]{pointF.x, pointF.y}, 0);
            }
        });
    }

    public void d(final int i, final float[] fArr) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.j.7
            @Override // java.lang.Runnable
            public void run() {
                GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
            }
        });
    }

    public void a(Runnable runnable) {
        synchronized (this.r) {
            this.r.addLast(runnable);
        }
    }
}
