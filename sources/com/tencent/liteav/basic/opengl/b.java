package com.tencent.liteav.basic.opengl;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import io.agora.rtc.gl.EglBase;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static final String a = "b";
    private static int[] l = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};
    private static int[] m = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
    private EGL10 b;
    private EGLDisplay c;
    private EGLConfig d;
    private boolean e;
    private EGLContext f;
    private boolean g;
    private EGLSurface h;
    private int i = 0;
    private int j = 0;
    private int[] k = new int[2];

    private b() {
    }

    public static b a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i, int i2) {
        b bVar = new b();
        bVar.i = i;
        bVar.j = i2;
        if (bVar.a(eGLConfig, eGLContext, surface)) {
            return bVar;
        }
        return null;
    }

    public boolean a() {
        boolean eglSwapBuffers = this.b.eglSwapBuffers(this.c, this.h);
        e();
        return eglSwapBuffers;
    }

    public void b() {
        this.b.eglMakeCurrent(this.c, this.h, this.h, this.f);
        e();
    }

    public void c() {
        EGL10 egl10 = this.b;
        EGLDisplay eGLDisplay = this.c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        if (this.h != null) {
            this.b.eglDestroySurface(this.c, this.h);
        }
        if (this.f != null) {
            this.b.eglDestroyContext(this.c, this.f);
        }
        this.b.eglTerminate(this.c);
        e();
        this.c = null;
        this.h = null;
        this.c = null;
    }

    private boolean a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        this.b = (EGL10) EGLContext.getEGL();
        this.c = this.b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.b.eglInitialize(this.c, this.k);
        if (eGLConfig == null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.b.eglChooseConfig(this.c, surface == null ? l : m, eGLConfigArr, 1, new int[1]);
            this.d = eGLConfigArr[0];
            this.e = true;
        } else {
            this.d = eGLConfig;
        }
        if (eGLContext != null) {
            this.g = true;
        }
        try {
            this.f = a(this.c, this.d, 2, eGLContext);
        } catch (d unused) {
            TXCLog.i(a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f = a(this.c, this.d, 3, eGLContext);
            } catch (d e) {
                String str = a;
                TXCLog.e(str, "failed to create EGLContext of 3.0. " + e);
                return false;
            }
        }
        int[] iArr = {12375, this.i, 12374, this.j, 12344};
        if (surface == null) {
            this.h = this.b.eglCreatePbufferSurface(this.c, this.d, iArr);
        } else {
            this.h = this.b.eglCreateWindowSurface(this.c, this.d, surface, null);
        }
        if (this.h == EGL10.EGL_NO_SURFACE) {
            e();
            return false;
        } else if (this.b.eglMakeCurrent(this.c, this.h, this.h, this.f)) {
            return true;
        } else {
            e();
            return false;
        }
    }

    public EGLContext d() {
        return this.f;
    }

    public void e() {
        int eglGetError = this.b.eglGetError();
        if (eglGetError != 12288) {
            String str = a;
            TXCLog.e(str, "EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    public com.tencent.liteav.basic.util.e f() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        boolean eglQuerySurface = this.b.eglQuerySurface(this.c, this.h, 12375, iArr);
        boolean eglQuerySurface2 = this.b.eglQuerySurface(this.c, this.h, 12374, iArr2);
        if (eglQuerySurface && eglQuerySurface2) {
            return new com.tencent.liteav.basic.util.e(iArr[0], iArr2[0]);
        }
        return new com.tencent.liteav.basic.util.e(0, 0);
    }

    private EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) throws d {
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eglCreateContext = this.b.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        g();
        return eglCreateContext;
    }

    private void g() throws d {
        int eglGetError = this.b.eglGetError();
        if (eglGetError != 12288) {
            throw new d(eglGetError);
        }
    }
}
