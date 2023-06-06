package com.tencent.liteav.f;

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
public class l {
    private boolean m;
    private int s;
    private int v;
    private int w;
    private int x;
    private int y;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 2;
    private int f = 0;
    private boolean g = false;
    private float[] h = new float[16];
    private float[] i = new float[16];
    private float j = 1.0f;
    private float k = 1.0f;
    private boolean l = false;
    private final float[] n = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private final float[] o = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    private float[] q = new float[16];
    private float[] r = new float[16];
    private int t = -12345;
    private int u = -12345;
    private FloatBuffer p = ByteBuffer.allocateDirect(this.n.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

    public void a(int i, int i2) {
        if (i == this.a && i2 == this.b) {
            return;
        }
        TXCLog.i("VideoScaleFilter", "Output resolution change: " + this.a + "*" + this.b + " -> " + i + "*" + i2);
        this.a = i;
        this.b = i2;
        Matrix.orthoM(this.h, 0, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f);
        this.j = 1.0f;
        this.k = 1.0f;
        this.l = true;
    }

    public void b(int i, int i2) {
        if (i == this.c && i2 == this.d) {
            return;
        }
        TXCLog.i("VideoScaleFilter", "Input resolution change: " + this.c + "*" + this.d + " -> " + i + "*" + i2);
        this.c = i;
        this.d = i2;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f = i;
    }

    private void b(float[] fArr) {
        if (this.b == 0 || this.a == 0) {
            return;
        }
        int i = this.c;
        int i2 = this.d;
        if (this.f == 270 || this.f == 90) {
            i = this.d;
            i2 = this.c;
        }
        float f = i;
        float f2 = (this.a * 1.0f) / f;
        float f3 = i2;
        float f4 = (this.b * 1.0f) / f3;
        if (this.e != 1 ? f2 * f3 > this.b : f2 * f3 <= this.b) {
            f2 = f4;
        }
        Matrix.setIdentityM(this.i, 0);
        if (this.g) {
            if (this.f % TXLiveConstants.RENDER_ROTATION_180 == 0) {
                Matrix.scaleM(this.i, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(this.i, 0, 1.0f, -1.0f, 1.0f);
            }
        }
        Matrix.scaleM(this.i, 0, ((f * f2) / this.a) * 1.0f, ((f3 * f2) / this.b) * 1.0f, 1.0f);
        Matrix.rotateM(this.i, 0, this.f, 0.0f, 0.0f, -1.0f);
        Matrix.multiplyMM(fArr, 0, this.h, 0, this.i, 0);
    }

    public l(Boolean bool) {
        this.m = true;
        this.m = bool.booleanValue();
        this.p.put(bool.booleanValue() ? this.o : this.n).position(0);
        Matrix.setIdentityM(this.r, 0);
    }

    public void a(float[] fArr) {
        this.r = fArr;
    }

    public void c(int i) {
        GLES20.glViewport(0, 0, this.a, this.b);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.s);
        a("glUseProgram");
        if (this.m) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
        } else {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
        }
        this.p.position(0);
        GLES20.glVertexAttribPointer(this.x, 3, 5126, false, 20, (Buffer) this.p);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.x);
        a("glEnableVertexAttribArray maPositionHandle");
        this.p.position(3);
        GLES20.glVertexAttribPointer(this.y, 2, 5126, false, 20, (Buffer) this.p);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.y);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.q, 0);
        b(this.q);
        GLES20.glUniformMatrix4fv(this.v, 1, false, this.q, 0);
        GLES20.glUniformMatrix4fv(this.w, 1, false, this.r, 0);
        a("glDrawArrays");
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        if (this.m) {
            GLES20.glBindTexture(36197, 0);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    public int d(int i) {
        c();
        if (this.u == -12345) {
            TXCLog.e("VideoScaleFilter", "invalid frame buffer id");
            return i;
        }
        GLES20.glBindFramebuffer(36160, this.u);
        c(i);
        GLES20.glBindFramebuffer(36160, 0);
        return this.t;
    }

    public void a() {
        if (this.m) {
            this.s = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        } else {
            this.s = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "varying highp vec2 vTextureCoord;\n \nuniform sampler2D sTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        }
        if (this.s == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.x = GLES20.glGetAttribLocation(this.s, "aPosition");
        a("glGetAttribLocation aPosition");
        if (this.x == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.y = GLES20.glGetAttribLocation(this.s, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (this.y == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.v = GLES20.glGetUniformLocation(this.s, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (this.v == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.w = GLES20.glGetUniformLocation(this.s, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (this.w == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
    }

    private void c() {
        if (this.l) {
            TXCLog.i("VideoScaleFilter", "reloadFrameBuffer. size = " + this.a + "*" + this.b);
            d();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.t = iArr[0];
            this.u = iArr2[0];
            TXCLog.i("VideoScaleFilter", "frameBuffer id = " + this.u + ", texture id = " + this.t);
            GLES20.glBindTexture(3553, this.t);
            a("glBindTexture mFrameBufferTextureID");
            GLES20.glTexImage2D(3553, 0, 6408, this.a, this.b, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            a("glTexParameter");
            GLES20.glBindFramebuffer(36160, this.u);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.l = false;
        }
    }

    public void b() {
        GLES20.glDeleteProgram(this.s);
        d();
    }

    private void d() {
        if (this.u != -12345) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.u}, 0);
            this.u = -12345;
        }
        if (this.t != -12345) {
            GLES20.glDeleteTextures(1, new int[]{this.t}, 0);
            this.t = -12345;
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
            TXCLog.e("VideoScaleFilter", "Could not compile shader " + i + CommonConstant.Symbol.COLON);
            StringBuilder sb = new StringBuilder(StringUtil.SPACE);
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            TXCLog.e("VideoScaleFilter", sb.toString());
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    private int a(String str, String str2) {
        int a;
        int a2 = a(35633, str);
        if (a2 == 0 || (a = a(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            TXCLog.e("VideoScaleFilter", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, a2);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, a);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            TXCLog.e("VideoScaleFilter", "Could not link program: ");
            TXCLog.e("VideoScaleFilter", GLES20.glGetProgramInfoLog(glCreateProgram));
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
            TXCLog.e("VideoScaleFilter", str + ": glError " + glGetError);
        }
    }
}
