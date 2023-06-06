package com.dianping.video.videofilter.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class t {
    public static ChangeQuickRedirect a;
    public GLSurfaceView.Renderer b;
    public int c;
    public int d;
    public Bitmap e;
    public EGL10 f;
    public EGLDisplay g;
    public EGLConfig[] h;
    public EGLConfig i;
    public EGLContext j;
    public EGLSurface k;
    public GL10 l;
    public String m;

    public t(int i, int i2) {
        EGLConfig eGLConfig;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7122b181be00b2aa6ef2dc09695c7b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7122b181be00b2aa6ef2dc09695c7b0");
            return;
        }
        this.c = i;
        this.d = i2;
        int[] iArr = {12375, this.c, 12374, this.d, 12344};
        this.f = (EGL10) EGLContext.getEGL();
        this.g = this.f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f.eglInitialize(this.g, new int[2]);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "feadf0bd490ebd38e2389c2d73584770", RobustBitConfig.DEFAULT_VALUE)) {
            eGLConfig = (EGLConfig) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "feadf0bd490ebd38e2389c2d73584770");
        } else {
            int[] iArr2 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
            int[] iArr3 = new int[1];
            this.f.eglChooseConfig(this.g, iArr2, null, 0, iArr3);
            int i3 = iArr3[0];
            this.h = new EGLConfig[i3];
            this.f.eglChooseConfig(this.g, iArr2, this.h, i3, iArr3);
            eGLConfig = this.h[0];
        }
        this.i = eGLConfig;
        this.j = this.f.eglCreateContext(this.g, this.i, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        this.k = this.f.eglCreatePbufferSurface(this.g, this.i, iArr);
        this.f.eglMakeCurrent(this.g, this.k, this.k, this.j);
        this.l = (GL10) this.j.getGL();
        this.m = Thread.currentThread().getName();
    }
}
