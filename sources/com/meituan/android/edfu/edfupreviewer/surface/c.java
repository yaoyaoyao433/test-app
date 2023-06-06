package com.meituan.android.edfu.edfupreviewer.surface;

import android.opengl.GLES20;
import android.util.Log;
import com.dianping.titans.service.FileUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    private final float[] d;
    private final float[] e;
    private final FloatBuffer f;
    private final FloatBuffer g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private g m;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3278d22c123fe0c0a9c0a4fc7c47d25f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3278d22c123fe0c0a9c0a4fc7c47d25f");
            return;
        }
        this.d = new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.e = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.f = com.meituan.android.edfu.edfupreviewer.eglcore.a.a(this.d);
        this.g = com.meituan.android.edfu.edfupreviewer.eglcore.a.a(this.e);
        this.m = g.CENTER_CROP;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24f6e42047c2d1c57953ed70c81beb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24f6e42047c2d1c57953ed70c81beb4");
            return;
        }
        c();
        d();
        e();
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51bc2ef6569e67563447c185f9399b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51bc2ef6569e67563447c185f9399b3c");
            return;
        }
        GLES20.glViewport(0, 0, i, i2);
        if (z) {
            a(i, i2);
            f();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30421d6343e3235c721a2d74702e0ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30421d6343e3235c721a2d74702e0ddf");
            return;
        }
        GLES20.glUseProgram(this.h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.c);
        GLES20.glBindBuffer(34962, this.k);
        GLES20.glEnableVertexAttribArray(this.i);
        GLES20.glVertexAttribPointer(this.i, 2, 5126, false, 8, 0);
        GLES20.glEnableVertexAttribArray(this.j);
        GLES20.glVertexAttribPointer(this.j, 2, 5126, false, 8, this.d.length * 4);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glUniform1i(this.l, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(this.j);
        GLES20.glUseProgram(0);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "071cf20cecc3f26f413b827a31cc688d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "071cf20cecc3f26f413b827a31cc688d");
            return;
        }
        this.h = 0;
        this.k = 0;
        this.c = 0;
        this.b = 0;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4708180b1bb6fc88f4c18f40f6c8b2f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4708180b1bb6fc88f4c18f40f6c8b2f5");
        } else if (this.h != 0) {
        } else {
            this.h = com.meituan.android.edfu.edfupreviewer.eglcore.a.a("attribute vec4 aVertexPosition;\n    attribute vec2 aTexturePosition;\n    varying vec2 vPosition;\n    void main() {\n        vPosition = aTexturePosition;\n        gl_Position = aVertexPosition;\n    }", "precision mediump float;\nvarying vec2 vPosition;\nuniform sampler2D uvTexture;\nvoid main() {\n    gl_FragColor=texture2D(uvTexture, vPosition);\n}");
            this.i = GLES20.glGetAttribLocation(this.h, "aVertexPosition");
            this.j = GLES20.glGetAttribLocation(this.h, "aTexturePosition");
            this.l = GLES20.glGetUniformLocation(this.h, "uvTexture");
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fcbeef7ee645049f5d50bc05fdf1080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fcbeef7ee645049f5d50bc05fdf1080");
        } else if (this.k != 0) {
        } else {
            int[] iArr = new int[1];
            GLES20.glGenBuffers(1, iArr, 0);
            this.k = iArr[0];
            GLES20.glBindBuffer(34962, this.k);
            GLES20.glBufferData(34962, (this.d.length + this.e.length) * 4, null, 35044);
            GLES20.glBufferSubData(34962, 0, this.d.length * 4, this.f);
            GLES20.glBufferSubData(34962, this.d.length * 4, this.e.length * 4, this.g);
            GLES20.glBindBuffer(34962, 0);
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0529d59ff8a8c49755d5cfc5c6addba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0529d59ff8a8c49755d5cfc5c6addba");
            return;
        }
        if (this.c == 0) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.c = iArr[0];
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            Log.e("glGenBuffers+mTextureId", sb.toString());
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.c);
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5dfa739cf0ada317ce7a66112be7aa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5dfa739cf0ada317ce7a66112be7aa2");
        } else if (this.b != 0) {
        } else {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.b = iArr[0];
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            Log.e("glGenBuffers", sb.toString());
            GLES20.glBindFramebuffer(36160, this.b);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.c, 0);
            if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                Log.e("glGenBuffers", "glFramebufferTexture2D error");
            }
            GLES20.glBindFramebuffer(36160, 0);
        }
    }
}
