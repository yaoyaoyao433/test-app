package com.tencent.mapsdk.internal;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.mapsdk.internal.sx;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ta extends sx implements bu, nt, oe, sx.m {
    private final so h;
    private boolean i;
    private Object j;
    private be k;

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(Object obj, int i, int i2) {
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final boolean e() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final View getView() {
        return this;
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setMapOpaque(boolean z) {
    }

    public ta(be beVar) {
        super(beVar.getContext());
        this.k = beVar;
        this.j = beVar.i();
        this.h = (so) beVar.b();
        setEGLContextClientVersion(2);
        boolean z = true;
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new sx.b(8, 16, 8));
        setEGLContextFactory(new AnonymousClass1());
        if (this.j != null) {
            setEGLWindowSurfaceFactory(new AnonymousClass2());
        }
        a(this, this.k.m());
        setRenderMode(0);
        if (Build.VERSION.SDK_INT < 11) {
            z = false;
        } else {
            setPreserveEGLContextOnPause(true);
        }
        this.i = z;
        setContentDescription(AccessibleTouchItem.MAP_DEFAULT_CONTENT_DESCRIPTION);
    }

    @Override // com.tencent.mapsdk.internal.sx.m
    public final void a(GL10 gl10, EGLConfig eGLConfig) {
        if (this.h != null) {
            this.h.a(gl10, eGLConfig);
        }
    }

    @Override // com.tencent.mapsdk.internal.sx.m
    public final void a(GL10 gl10, int i, int i2) {
        if (this.h != null) {
            this.h.a(gl10, i, i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.sx.m
    public final void T() {
        if (this.h != null) {
            this.h.T();
        }
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.h != null) {
            this.h.e(i, i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.sx, com.tencent.mapsdk.internal.bu
    public final void c() {
        super.c();
    }

    @Override // com.tencent.mapsdk.internal.sx, com.tencent.mapsdk.internal.bu
    public final void b() {
        if (this.i) {
            super.b();
        }
    }

    @Override // com.tencent.mapsdk.internal.sx, com.tencent.mapsdk.internal.bu
    public final void a() {
        if (this.i) {
            super.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void d() {
        if (getVisibility() == 0) {
            this.g.c();
        }
    }

    @Override // com.tencent.mapsdk.internal.sx.m
    public final boolean a(GL10 gl10) {
        if (this.h == null) {
            return false;
        }
        return this.h.a(gl10);
    }

    @Override // com.tencent.mapsdk.internal.oe
    public final int getEGLContextHash() {
        if (this.h != null) {
            return this.h.getEGLContextHash();
        }
        return 0;
    }

    private void h() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new sx.b(8, 16, 8));
        setEGLContextFactory(new AnonymousClass1());
        if (this.j != null) {
            setEGLWindowSurfaceFactory(new AnonymousClass2());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ta$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements sx.f {
        AnonymousClass1() {
        }

        @Override // com.tencent.mapsdk.internal.sx.f
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (ta.this.h != null) {
                ta.this.h.E();
            }
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }

        @Override // com.tencent.mapsdk.internal.sx.f
        public final EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            if (ta.this.h != null) {
                ta.this.h.D();
            }
            return eglCreateContext;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ta$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 implements sx.g {
        AnonymousClass2() {
        }

        @Override // com.tencent.mapsdk.internal.sx.g
        public final EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, ta.this.j, null);
            } catch (IllegalArgumentException | OutOfMemoryError unused) {
                eGLSurface = null;
            }
            if (ta.this.h != null) {
                ta.this.h.D();
            }
            return eGLSurface;
        }

        @Override // com.tencent.mapsdk.internal.sx.g
        public final void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            if (ta.this.h != null) {
                ta.this.h.E();
            }
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.h == null || !this.h.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    private static boolean i(sx sxVar) {
        if (Build.VERSION.SDK_INT < 11) {
            return false;
        }
        sxVar.setPreserveEGLContextOnPause(true);
        return true;
    }

    public final ba getVectorMapDelegate() {
        return this.h;
    }

    @Override // com.tencent.mapsdk.internal.nt
    public final void f() {
        setEGLContextClientVersion(2);
        boolean z = true;
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new sx.b(8, 16, 8));
        setEGLContextFactory(new AnonymousClass1());
        if (this.j != null) {
            setEGLWindowSurfaceFactory(new AnonymousClass2());
        }
        a(this, this.k.m());
        setRenderMode(0);
        if (Build.VERSION.SDK_INT < 11) {
            z = false;
        } else {
            setPreserveEGLContextOnPause(true);
        }
        this.i = z;
    }
}
