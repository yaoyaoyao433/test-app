package com.meituan.msi.api.video.compress.muxer;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.support.annotation.RequiresApi;
import android.view.Surface;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import io.agora.rtc.gl.EglBase;
/* compiled from: ProGuard */
@RequiresApi(api = 17)
/* loaded from: classes3.dex */
public final class a implements SurfaceTexture.OnFrameAvailableListener {
    public static ChangeQuickRedirect a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;
    public SurfaceTexture e;
    public Surface f;
    public Surface g;
    public com.meituan.msi.api.video.compress.render.a h;
    private final Object i;
    private boolean j;

    public a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71747f4aaf8de2a9aad3c723c19ffd52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71747f4aaf8de2a9aad3c723c19ffd52");
            return;
        }
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        this.i = new Object();
        if (surface == null) {
            throw new NullPointerException();
        }
        this.f = surface;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60c75fd2b826732fea756bfebe45d85e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60c75fd2b826732fea756bfebe45d85e");
            return;
        }
        this.b = EGL14.eglGetDisplay(0);
        if (this.b == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.b, iArr, 0, iArr, 1)) {
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        a("eglCreateContext RGB888+recordable ES2");
        this.c = EGL14.eglCreateContext(this.b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        a("eglCreateContext");
        this.d = EGL14.eglCreateWindowSurface(this.b, eGLConfigArr[0], this.f, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7461a169ec9670bca987296532a47bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7461a169ec9670bca987296532a47bd6");
            return;
        }
        synchronized (this.i) {
            while (!this.j) {
                try {
                    this.i.wait(MetricsAnrManager.ANR_THRESHOLD);
                    if (!this.j) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.j = false;
        }
        this.h.a("before updateTexImage");
        this.e.updateTexImage();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6af7d675b525202141bf0bcc4ebaa86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6af7d675b525202141bf0bcc4ebaa86");
            return;
        }
        synchronized (this.i) {
            if (this.j) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.j = true;
            this.i.notifyAll();
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b06ce832540f8cd30c8eb98e86fd4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b06ce832540f8cd30c8eb98e86fd4b2");
            return;
        }
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }
}
