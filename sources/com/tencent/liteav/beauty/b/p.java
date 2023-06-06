package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.beauty.NativeLoad;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class p extends com.tencent.liteav.basic.opengl.j {
    private static String y = "YUV420pToRGBFilter";
    private ByteBuffer r;
    private final int s;
    private int[] t;
    private int[] u;
    private int v;
    private int w;
    private int[] x;

    public p(int i) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.r = null;
        this.t = null;
        this.u = null;
        this.v = 0;
        this.w = 0;
        this.x = null;
        this.s = i;
        String str = y;
        TXCLog.i(str, "yuv Type " + i);
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public boolean c() {
        int i = 7;
        if (this.s != 1) {
            if (this.s == 3) {
                i = 9;
            } else if (this.s == 2) {
                return super.c();
            } else {
                String str = y;
                TXCLog.e(str, "don't support yuv format " + this.s);
            }
        }
        this.a = NativeLoad.nativeLoadGLProgram(i);
        if (this.a != 0 && a()) {
            this.g = true;
        } else {
            this.g = false;
        }
        d();
        return this.g;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, int i2) {
        if (this.f == i2 && this.e == i) {
            return;
        }
        t();
        if (this.t == null) {
            this.t = new int[1];
            this.t[0] = TXCOpenGlUtils.a(i, i2, 6409, 6409, this.t);
        }
        this.v = GLES20.glGetUniformLocation(q(), "yTexture");
        this.w = GLES20.glGetUniformLocation(q(), "uvTexture");
        if (1 == this.s) {
            this.u = new int[1];
            this.u[0] = TXCOpenGlUtils.a(i, i2 / 2, 6409, 6409, this.u);
        } else if (3 == this.s) {
            this.v = GLES20.glGetUniformLocation(q(), "yTexture");
            this.w = GLES20.glGetUniformLocation(q(), "uvTexture");
            this.u = new int[1];
            this.u[0] = TXCOpenGlUtils.a(i / 2, i2 / 2, 6410, 6410, this.u);
        } else if (2 == this.s && this.x == null) {
            this.x = new int[1];
            this.x[0] = TXCOpenGlUtils.a(i, i2, 6408, 6408, this.x);
        }
        super.a(i, i2);
    }

    public void a(byte[] bArr) {
        this.r = ByteBuffer.wrap(bArr);
    }

    public void a(ByteBuffer byteBuffer) {
        this.r = byteBuffer;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void i() {
        int[] iArr;
        super.i();
        if (this.e % 4 != 0) {
            iArr = new int[1];
            GLES20.glGetIntegerv(3317, iArr, 0);
            GLES20.glPixelStorei(3317, 1);
        } else {
            iArr = null;
        }
        if (2 == this.s) {
            s();
        } else {
            TXCOpenGlUtils.a(this.r, this.s == 1 ? 6409 : 6410, this.e, this.f, new int[]{this.t[0], this.u[0]});
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.t[0]);
            GLES20.glUniform1i(this.v, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.u[0]);
            GLES20.glUniform1i(this.w, 1);
        }
        if (this.e % 4 != 0) {
            if (iArr != null && iArr[0] > 0) {
                GLES20.glPixelStorei(3317, iArr[0]);
            } else {
                GLES20.glPixelStorei(3317, 4);
            }
        }
    }

    public int r() {
        if (2 == this.s) {
            int s = s();
            GLES20.glBindTexture(3553, 0);
            return s;
        }
        return super.a(-1);
    }

    private int s() {
        GLES20.glBindTexture(3553, this.x[0]);
        if (this.r != null) {
            GLES20.glTexImage2D(3553, 0, 6408, this.e, this.f, 0, 6408, 5121, this.r);
        }
        return this.x[0];
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.a(-1, floatBuffer, floatBuffer2);
    }

    private void t() {
        if (this.t != null && this.t[0] > 0) {
            GLES20.glDeleteTextures(1, this.t, 0);
            this.t = null;
        }
        if (this.u != null && this.u[0] > 0) {
            GLES20.glDeleteTextures(1, this.u, 0);
            this.u = null;
        }
        if (this.x == null || this.x[0] <= 0) {
            return;
        }
        GLES20.glDeleteTextures(1, this.x, 0);
        this.x = null;
    }

    @Override // com.tencent.liteav.basic.opengl.j
    public void b() {
        super.b();
        t();
    }
}
