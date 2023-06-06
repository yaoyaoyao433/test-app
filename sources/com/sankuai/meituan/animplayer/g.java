package com.sankuai.meituan.animplayer;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    EGL10 b;
    EGLDisplay c;
    EGLSurface d;
    EGLContext e;
    EGLConfig f;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba27c696d1bdb24d9cb056667ea62a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba27c696d1bdb24d9cb056667ea62a7");
            return;
        }
        this.c = EGL10.EGL_NO_DISPLAY;
        this.d = EGL10.EGL_NO_SURFACE;
        this.e = EGL10.EGL_NO_CONTEXT;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029247c21b08389c1a326ce4f14df8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029247c21b08389c1a326ce4f14df8cc");
        } else if (this.c == null || this.d == null || this.b == null) {
        } else {
            this.b.eglSwapBuffers(this.c, this.d);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8abe44afbaa55035bd3f4eea7344f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8abe44afbaa55035bd3f4eea7344f3");
            return;
        }
        try {
            if (this.b != null) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.b.eglDestroySurface(this.c, this.d);
                this.b.eglDestroyContext(this.c, this.e);
                this.b.eglTerminate(this.c);
                this.b = null;
            }
        } catch (Exception e) {
            Log.e("EGLRuntime", "release: ", e);
        }
    }
}
