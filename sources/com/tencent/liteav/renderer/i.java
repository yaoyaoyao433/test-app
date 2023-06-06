package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.dianping.titans.service.FileUtil;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXLiveConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i {
    public static int a = 1;
    public static int b = 2;
    private boolean o;
    private int t;
    private int w;
    private int x;
    private int y;
    private int z;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = b;
    private int h = 0;
    private boolean i = false;
    private float[] j = new float[16];
    private float[] k = new float[16];
    private float l = 1.0f;
    private float m = 1.0f;
    private boolean n = false;
    private final float[] p = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private float[] r = new float[16];
    private float[] s = new float[16];
    private int u = -12345;
    private int v = -12345;
    private FloatBuffer q = ByteBuffer.allocateDirect(this.p.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

    public void a(int i, int i2) {
        if (i == this.c && i2 == this.d) {
            return;
        }
        TXCLog.i("TXTweenFilter", "Output resolution change: " + this.c + "*" + this.d + " -> " + i + "*" + i2);
        this.c = i;
        this.d = i2;
        Matrix.orthoM(this.j, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = true;
    }

    public void b(int i, int i2) {
        if (i == this.e && i2 == this.f) {
            return;
        }
        TXCLog.i("TXTweenFilter", "Input resolution change: " + this.e + "*" + this.f + " -> " + i + "*" + i2);
        this.e = i;
        this.f = i2;
    }

    public boolean a() {
        return this.o;
    }

    public void a(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.h = i;
    }

    private void b(float[] fArr) {
        if (this.d == 0 || this.c == 0) {
            return;
        }
        int i = this.e;
        int i2 = this.f;
        if (this.h == 270 || this.h == 90) {
            i = this.f;
            i2 = this.e;
        }
        float f = i;
        float f2 = (this.c * 1.0f) / f;
        float f3 = i2;
        float f4 = (this.d * 1.0f) / f3;
        if (this.g != a ? f2 * f3 > this.d : f2 * f3 <= this.d) {
            f2 = f4;
        }
        Matrix.setIdentityM(this.k, 0);
        if (this.i) {
            if (this.h % TXLiveConstants.RENDER_ROTATION_180 == 0) {
                Matrix.scaleM(this.k, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(this.k, 0, 1.0f, -1.0f, 1.0f);
            }
        }
        Matrix.scaleM(this.k, 0, ((f * f2) / this.c) * 1.0f, ((f3 * f2) / this.d) * 1.0f, 1.0f);
        Matrix.rotateM(this.k, 0, this.h, 0.0f, 0.0f, -1.0f);
        Matrix.multiplyMM(fArr, 0, this.j, 0, this.k, 0);
    }

    public i(Boolean bool) {
        this.o = true;
        this.o = bool.booleanValue();
        this.q.put(this.p).position(0);
        Matrix.setIdentityM(this.s, 0);
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(float[] fArr) {
        this.s = fArr;
    }

    public void c(int i) {
        GLES20.glViewport(0, 0, this.c, this.d);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.t);
        a("glUseProgram");
        if (this.o) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
        } else {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
        }
        this.q.position(0);
        GLES20.glVertexAttribPointer(this.y, 3, 5126, false, 20, (Buffer) this.q);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.y);
        a("glEnableVertexAttribArray maPositionHandle");
        this.q.position(3);
        GLES20.glVertexAttribPointer(this.z, 2, 5126, false, 20, (Buffer) this.q);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.z);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.r, 0);
        b(this.r);
        GLES20.glUniformMatrix4fv(this.w, 1, false, this.r, 0);
        GLES20.glUniformMatrix4fv(this.x, 1, false, this.s, 0);
        a("glDrawArrays");
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        if (this.o) {
            GLES20.glBindTexture(36197, 0);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    public int d(int i) {
        d();
        if (this.v == -12345) {
            TXCLog.d("TXTweenFilter", "invalid frame buffer id");
            return i;
        }
        GLES20.glBindFramebuffer(36160, this.v);
        c(i);
        GLES20.glBindFramebuffer(36160, 0);
        return this.u;
    }

    public void b() {
        if (this.o) {
            this.t = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.t = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        if (this.t == 0) {
            TXCLog.e("TXTweenFilter", "failed creating program");
            return;
        }
        this.y = GLES20.glGetAttribLocation(this.t, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.y == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for aPosition");
            return;
        }
        this.z = GLES20.glGetAttribLocation(this.t, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.z == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for aTextureCoord");
            return;
        }
        this.w = GLES20.glGetUniformLocation(this.t, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.w == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.x = GLES20.glGetUniformLocation(this.t, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.x == -1) {
            TXCLog.e("TXTweenFilter", "Could not get attrib location for uSTMatrix");
        }
    }

    private void d() {
        if (this.n) {
            TXCLog.i("TXTweenFilter", "reloadFrameBuffer. size = " + this.c + "*" + this.d);
            e();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.u = iArr[0];
            this.v = iArr2[0];
            TXCLog.d("TXTweenFilter", "frameBuffer id = " + this.v + ", texture id = " + this.u);
            GLES20.glBindTexture(3553, this.u);
            a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(3553, 0, 6408, this.c, this.d, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            a("glTexParameter");
            GLES20.glBindFramebuffer(36160, this.v);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.u, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.n = false;
        }
    }

    public void c() {
        GLES20.glDeleteProgram(this.t);
        e();
    }

    private void e() {
        if (this.v != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.v}, 0);
            this.v = -12345;
        }
        if (this.u != -12345) {
            GLES20.glDeleteTextures(1, new int[]{this.u}, 0);
            this.u = -12345;
        }
    }

    private int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            TXCLog.e("TXTweenFilter", "Could not compile shader " + i + CommonConstant.Symbol.COLON);
            StringBuilder sb = new StringBuilder(StringUtil.SPACE);
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            TXCLog.e("TXTweenFilter", sb.toString());
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    private int a(String str, String str2) {
        int a2;
        int a3 = a(35633, str);
        if (a3 == 0 || (a2 = a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            TXCLog.e("TXTweenFilter", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, a3);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, a2);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            TXCLog.e("TXTweenFilter", "Could not link program: ");
            TXCLog.e("TXTweenFilter", GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    private void a(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            TXCLog.e("TXTweenFilter", str + ": glError " + glGetError);
        }
    }
}
