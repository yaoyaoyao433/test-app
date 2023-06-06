package com.tencent.mapsdk.internal;

import android.annotation.TargetApi;
import android.opengl.GLUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sn extends Thread {
    private static float d = 60.0f;
    private static final int m = 12440;
    private static final int n = 4;
    private static long q = 1500;
    private static final String r = "TextureGLRenderThread";
    private WeakReference<so> a;
    private WeakReference<Object> e;
    private EGL10 h;
    private GL l;
    private AtomicBoolean b = new AtomicBoolean(true);
    private AtomicBoolean c = new AtomicBoolean(false);
    private volatile boolean f = false;
    private EGLConfig g = null;
    private EGLDisplay i = EGL10.EGL_NO_DISPLAY;
    private EGLContext j = EGL10.EGL_NO_CONTEXT;
    private EGLSurface k = EGL10.EGL_NO_SURFACE;
    private volatile long o = 0;
    private boolean p = false;

    public sn(so soVar) {
        this.a = new WeakReference<>(soVar);
        setName(sx.a("TR"));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        if (this.a != null && this.a.get() != null) {
            this.a.get().D();
        }
        boolean z = false;
        while (this.b.get()) {
            while (this.b.get() && (this.e == null || this.e.get() == null)) {
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (!z) {
                z = e();
            }
            if (z) {
                try {
                    synchronized (this) {
                        while (this.b.get() && this.c.get()) {
                            wait();
                        }
                    }
                    if (this.f) {
                        while (this.b.get()) {
                            g();
                            if (this.e != null && this.e.get() != null) {
                                this.k = this.h.eglCreateWindowSurface(this.i, this.g, this.e.get(), null);
                                if (this.k == EGL10.EGL_NO_SURFACE) {
                                    kj.d(r, "eglCreateWindowSurface failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                                } else if (this.h.eglMakeCurrent(this.i, this.k, this.k, this.j)) {
                                    break;
                                } else {
                                    kj.d(r, "eglMakeCurrent failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                                }
                            } else {
                                break;
                            }
                        }
                        this.p = true;
                        this.f = false;
                        d();
                    }
                    if (this.a != null && this.a.get() != null) {
                        so soVar = this.a.get();
                        if (!this.p || System.currentTimeMillis() - this.o >= q) {
                            this.p = false;
                            this.o = 0L;
                        } else if (soVar != null) {
                            soVar.H();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (soVar != null && soVar.a((GL10) this.l)) {
                            this.h.eglSwapBuffers(this.i, this.k);
                        }
                        int currentTimeMillis2 = (int) ((1000.0f / d) - ((float) (System.currentTimeMillis() - currentTimeMillis)));
                        if (currentTimeMillis2 > 0) {
                            synchronized (this) {
                                try {
                                    wait(currentTimeMillis2);
                                } catch (InterruptedException unused2) {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (this.b.get() || !(th instanceof InterruptedException)) {
                        kj.d(r, "TextureGLRenderThread Render Exception:" + Log.getStackTraceString(th));
                    }
                }
            }
        }
        if (this.a != null && this.a.get() != null) {
            this.a.get().E();
            this.a = null;
        }
        g();
        if (this.j == null || this.j == EGL10.EGL_NO_CONTEXT) {
            kj.d(ki.l, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.h.eglDestroyContext(this.i, this.j);
            this.j = EGL10.EGL_NO_CONTEXT;
        }
        if (this.i == null || this.i == EGL10.EGL_NO_DISPLAY) {
            kj.d(ki.l, "the EglDisplay is null or status is EGL_NO_DISPLAY");
            return;
        }
        this.h.eglTerminate(this.i);
        this.i = EGL10.EGL_NO_DISPLAY;
    }

    public final void a() {
        this.c.set(true);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        this.c.set(false);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void c() {
        this.b.set(false);
        this.c.set(false);
        synchronized (this) {
            notifyAll();
        }
        interrupt();
    }

    @TargetApi(14)
    private boolean e() {
        try {
        } catch (Throwable th) {
            kj.d(r, "initializeGLContext failed,errorDetail:" + Log.getStackTraceString(th));
        }
        if (this.e != null && this.e.get() != null) {
            Object obj = this.e.get();
            this.h = (EGL10) EGLContext.getEGL();
            this.i = this.h.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.i == EGL10.EGL_NO_DISPLAY) {
                kj.d(r, "eglGetdisplay failed,mEglDisplay == EGL10.EGL_NO_DISPLAY,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                return false;
            }
            if (!this.h.eglInitialize(this.i, new int[2])) {
                kj.d(r, "eglInitialize failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                return false;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.i, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                kj.d(r, "eglChooseConfig failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                return false;
            }
            this.g = eGLConfigArr[0];
            this.k = this.h.eglCreateWindowSurface(this.i, this.g, obj, null);
            if (this.k == EGL10.EGL_NO_SURFACE) {
                kj.d(r, "eglCreateWindowSurface failed,mEglSurface == EGL10.EGL_NO_SURFACE,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                return false;
            }
            this.j = this.h.eglCreateContext(this.i, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{m, 2, 12344});
            if (this.j == EGL10.EGL_NO_CONTEXT) {
                kj.d(r, "eglCreateContext failed,mEglContext == EGL10.EGL_NO_CONTEXT,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                return false;
            } else if (!this.h.eglMakeCurrent(this.i, this.k, this.k, this.j)) {
                kj.d(r, "eglMakeCurrent failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                return false;
            } else {
                this.l = this.j.getGL();
                return true;
            }
        }
        return false;
    }

    public final void a(Object obj) {
        if (this.e != null && this.e.get() != null) {
            this.f = true;
        }
        this.e = new WeakReference<>(obj);
        synchronized (this) {
            notifyAll();
        }
    }

    public final void d() {
        this.p = true;
        this.o = System.currentTimeMillis();
    }

    @TargetApi(14)
    private void f() {
        while (this.b.get()) {
            g();
            try {
            } catch (Throwable th) {
                kj.d(r, "updateSurface failed,errorDetail:" + Log.getStackTraceString(th));
            }
            if (this.e != null && this.e.get() != null) {
                this.k = this.h.eglCreateWindowSurface(this.i, this.g, this.e.get(), null);
                if (this.k == EGL10.EGL_NO_SURFACE) {
                    kj.d(r, "eglCreateWindowSurface failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                } else if (this.h.eglMakeCurrent(this.i, this.k, this.k, this.j)) {
                    return;
                } else {
                    kj.d(r, "eglMakeCurrent failed,errorDetail:" + GLUtils.getEGLErrorString(this.h.eglGetError()));
                }
            }
            return;
        }
    }

    private void g() {
        if (this.k == null || this.k == EGL10.EGL_NO_SURFACE) {
            kj.d(ki.l, "the EglSurface is null or status is EGL_NO_SURFACE");
            return;
        }
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.i;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.h.eglDestroySurface(this.i, this.k);
        this.k = EGL10.EGL_NO_SURFACE;
    }

    private void h() {
        if (this.j == null || this.j == EGL10.EGL_NO_CONTEXT) {
            kj.d(ki.l, "the EglContext is null or status is EGL_NO_CONTEXT");
            return;
        }
        this.h.eglDestroyContext(this.i, this.j);
        this.j = EGL10.EGL_NO_CONTEXT;
    }

    private void i() {
        if (this.i == null || this.i == EGL10.EGL_NO_DISPLAY) {
            kj.d(ki.l, "the EglDisplay is null or status is EGL_NO_DISPLAY");
            return;
        }
        this.h.eglTerminate(this.i);
        this.i = EGL10.EGL_NO_DISPLAY;
    }

    private void j() {
        g();
        if (this.j == null || this.j == EGL10.EGL_NO_CONTEXT) {
            kj.d(ki.l, "the EglContext is null or status is EGL_NO_CONTEXT");
        } else {
            this.h.eglDestroyContext(this.i, this.j);
            this.j = EGL10.EGL_NO_CONTEXT;
        }
        if (this.i == null || this.i == EGL10.EGL_NO_DISPLAY) {
            kj.d(ki.l, "the EglDisplay is null or status is EGL_NO_DISPLAY");
            return;
        }
        this.h.eglTerminate(this.i);
        this.i = EGL10.EGL_NO_DISPLAY;
    }

    public static void a(float f) {
        if (f <= 0.0f) {
            kj.e(ki.l, "帧率设置不在有效值范围内");
        } else {
            d = f;
        }
    }
}
