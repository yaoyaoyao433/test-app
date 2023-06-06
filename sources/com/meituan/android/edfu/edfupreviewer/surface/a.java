package com.meituan.android.edfu.edfupreviewer.surface;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.meituan.android.edfu.edfupreviewer.surface.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a implements d {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private final float[] c;
    private final float[] d;
    private final FloatBuffer e;
    private final FloatBuffer f;
    private final Context g;
    private final c h;
    private final c i;
    private EGLContext j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final float[] r;
    private final float[] s;
    private final float[] t;
    private boolean u;
    private com.meituan.android.edfu.edfupreviewer.api.a v;
    private d.a w;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3be446558c63f8ba971233ca29ce400", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3be446558c63f8ba971233ca29ce400");
            return;
        }
        this.c = new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.d = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.e = com.meituan.android.edfu.edfupreviewer.eglcore.a.a(this.c);
        this.f = com.meituan.android.edfu.edfupreviewer.eglcore.a.a(this.d);
        this.r = new float[16];
        this.s = new float[16];
        this.t = new float[16];
        this.u = true;
        this.v = null;
        this.g = context;
        this.h = new c();
        this.i = new c();
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.f
    public final void a(EGLContext eGLContext) {
        Object[] objArr = {eGLContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02a99a80aae809775cb1983d8be7ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02a99a80aae809775cb1983d8be7ffe");
            return;
        }
        this.h.a();
        this.i.a();
        this.j = eGLContext;
        this.k = 0;
        this.q = 0;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c920c5406e6900f541bd21a827b151b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c920c5406e6900f541bd21a827b151b4");
        } else if (this.k == 0) {
            this.k = com.meituan.android.edfu.edfupreviewer.eglcore.a.a("attribute vec4 aVertexCoordinate;\nattribute vec4 aTextureCoordinate;\nuniform mat4 uVertexMatrix;\nuniform mat4 uTextureMatrix;\nvarying vec2 vTextureCoordinate;\nvoid main() {\n    vTextureCoordinate = (uTextureMatrix * aTextureCoordinate).xy;\n    gl_Position = uVertexMatrix * aVertexCoordinate;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoordinate;\nuniform samplerExternalOES uTexture;\nvoid main(){\n    gl_FragColor = texture2D(uTexture, vTextureCoordinate);\n}");
            this.l = GLES20.glGetAttribLocation(this.k, "aVertexCoordinate");
            this.m = GLES20.glGetAttribLocation(this.k, "aTextureCoordinate");
            this.o = GLES20.glGetUniformLocation(this.k, "uVertexMatrix");
            this.n = GLES20.glGetUniformLocation(this.k, "uTextureMatrix");
            this.p = GLES20.glGetUniformLocation(this.k, "uTexture");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4ad43e4e9a2a2e0572d2eda71aa3ca14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4ad43e4e9a2a2e0572d2eda71aa3ca14");
        } else if (this.q == 0) {
            int[] iArr = new int[1];
            GLES20.glGenBuffers(1, iArr, 0);
            this.q = iArr[0];
            GLES20.glBindBuffer(34962, this.q);
            GLES20.glBufferData(34962, (this.c.length + this.d.length) * 4, null, 35044);
            GLES20.glBufferSubData(34962, 0, this.c.length * 4, this.e);
            GLES20.glBufferSubData(34962, this.c.length * 4, this.d.length * 4, this.f);
            GLES20.glBindBuffer(34962, 0);
        }
        if (this.w != null) {
            this.w.a(this.j);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6025484a855d2abe63e9c66e896e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6025484a855d2abe63e9c66e896e2e");
            return;
        }
        this.h.a(i, i2, true);
        this.i.a(i, i2, false);
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.f
    public final void a(int i, float[] fArr) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e05411dc93a50e8130e085c528283aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e05411dc93a50e8130e085c528283aae");
            return;
        }
        c cVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "46de9d0ff56c474d110cb66ddc223838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "46de9d0ff56c474d110cb66ddc223838");
        } else {
            GLES20.glBindFramebuffer(36160, cVar.b);
        }
        GLES20.glClear(16384);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.k);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindBuffer(34962, this.q);
        GLES20.glEnableVertexAttribArray(this.l);
        GLES20.glVertexAttribPointer(this.l, 2, 5126, false, 8, 0);
        GLES20.glEnableVertexAttribArray(this.m);
        GLES20.glVertexAttribPointer(this.m, 2, 5126, false, 8, this.c.length * 4);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glUniformMatrix4fv(this.o, 1, false, this.t, 0);
        GLES20.glUniformMatrix4fv(this.n, 1, false, fArr, 0);
        GLES20.glUniform1i(this.p, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
        c cVar2 = this.h;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "f09a56c44229aa05683c42468448bce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "f09a56c44229aa05683c42468448bce6");
        } else {
            GLES20.glBindFramebuffer(36160, 0);
        }
        if (this.v != null && this.u) {
            i2 = this.v.a(this.h.c);
            this.i.c = i2;
            this.i.b();
        } else {
            this.h.b();
        }
        if (this.w != null) {
            this.w.a(i2);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dca67322163e43bfbee15c1cdd1765f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dca67322163e43bfbee15c1cdd1765f");
            return;
        }
        Matrix.setIdentityM(this.r, 0);
        Matrix.setIdentityM(this.s, 0);
        Matrix.setIdentityM(this.t, 0);
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69144fe87e3574876e0dbe33bd8ede7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69144fe87e3574876e0dbe33bd8ede7");
        } else {
            Matrix.rotateM(this.s, 0, i, 0.0f, 0.0f, 1.0f);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void a(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c97cee942a28a38dbc297a2c46ffe29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c97cee942a28a38dbc297a2c46ffe29");
            return;
        }
        float f7 = i / i2;
        if (z) {
            f = i3;
            f2 = i4;
        } else {
            f = i4;
            f2 = i3;
        }
        float f8 = f / f2;
        if (f8 > f7) {
            float f9 = (-f7) / f8;
            f5 = f9;
            f6 = -f9;
            f4 = -1.0f;
            f3 = 1.0f;
        } else {
            float f10 = (1.0f / f7) * f8;
            f3 = f10;
            f4 = -f10;
            f5 = -1.0f;
            f6 = 1.0f;
        }
        Matrix.orthoM(this.r, 0, f5, f6, f4, f3, 1.0f, -1.0f);
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07059ef3d3ccb04e6b9f442301bc227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07059ef3d3ccb04e6b9f442301bc227");
        } else {
            Matrix.multiplyMM(this.t, 0, this.r, 0, this.s, 0);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void a(com.meituan.android.edfu.edfupreviewer.api.a aVar) {
        this.v = aVar;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void a(d.a aVar) {
        this.w = aVar;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d
    public final void a(boolean z) {
        this.u = z;
    }
}
