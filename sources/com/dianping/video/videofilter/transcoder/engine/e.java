package com.dianping.video.videofilter.transcoder.engine;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import io.agora.rtc.gl.EglBase;
/* compiled from: ProGuard */
@TargetApi(17)
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;
    Surface e;

    public e(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7b17209963094207d4e848dce57030", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7b17209963094207d4e848dce57030");
            return;
        }
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        if (surface == null) {
            throw new NullPointerException();
        }
        this.e = surface;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b18030d7853f2a4ce5d7501a6e67bde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b18030d7853f2a4ce5d7501a6e67bde");
            return;
        }
        this.b = EGL14.eglGetDisplay(0);
        if (this.b == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.b, iArr, 0, iArr, 1)) {
            this.b = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.c = EGL14.eglCreateContext(this.b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        a("eglCreateContext");
        if (this.c == null) {
            throw new RuntimeException("null context");
        }
        this.d = EGL14.eglCreateWindowSurface(this.b, eGLConfigArr[0], this.e, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (this.d == null) {
            throw new RuntimeException("surface was null");
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58864d3bda8d62571cf2f05f67077896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58864d3bda8d62571cf2f05f67077896");
        } else if (!EGL14.eglMakeCurrent(this.b, this.d, this.d, this.c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd83af585e89003591e08440c3c9bc6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd83af585e89003591e08440c3c9bc6")).booleanValue() : EGL14.eglSwapBuffers(this.b, this.d);
    }

    @TargetApi(18)
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879802f28c730c62ed67c082ea354658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879802f28c730c62ed67c082ea354658");
        } else {
            EGLExt.eglPresentationTimeANDROID(this.b, this.d, j);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b25218b3fa7c350c643c3923b59693a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b25218b3fa7c350c643c3923b59693a");
            return;
        }
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }
}
