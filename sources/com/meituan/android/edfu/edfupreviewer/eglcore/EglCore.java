package com.meituan.android.edfu.edfupreviewer.eglcore;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EglCore {
    public static ChangeQuickRedirect a = null;
    private static final String f = "EglCore";
    public final int b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    @interface EGLVersion {
    }

    public EglCore() {
        this(2);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd4c318feeae85cd8b7c90e4d2c9f25b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd4c318feeae85cd8b7c90e4d2c9f25b");
        }
    }

    private EglCore(@EGLVersion int i) {
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b0a166f53764a7e50736eccdb2edbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b0a166f53764a7e50736eccdb2edbc");
            return;
        }
        this.c = EGL14.EGL_NO_DISPLAY;
        this.d = EGL14.EGL_NO_CONTEXT;
        this.e = EGL14.EGL_NO_SURFACE;
        this.b = 2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed1d901f0ff59187ceb297444bc8af9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed1d901f0ff59187ceb297444bc8af9");
        } else if (!EGL14.eglMakeCurrent(this.c, this.e, this.e, this.d)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1253226ad0fc9b43c547f606e067533d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1253226ad0fc9b43c547f606e067533d");
            return;
        }
        if (this.c != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.c, this.d);
            EGL14.eglDestroySurface(this.c, this.e);
            EGL14.eglTerminate(this.c);
        }
        this.d = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_DISPLAY;
        this.e = EGL14.EGL_NO_SURFACE;
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffc9752fb8ce9e6116ad4031fedaaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffc9752fb8ce9e6116ad4031fedaaee");
            return;
        }
        try {
            if (this.c != EGL14.EGL_NO_DISPLAY) {
                b();
            }
        } finally {
            super.finalize();
        }
    }
}
