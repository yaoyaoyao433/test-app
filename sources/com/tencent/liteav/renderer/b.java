package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends Thread {
    private WeakReference<a> a;
    private boolean b = false;
    private int c = 1280;
    private int d = 720;
    private Object e = new Object();
    private com.tencent.liteav.basic.opengl.c f = null;
    private com.tencent.liteav.basic.opengl.b g = null;
    private Object h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(WeakReference<a> weakReference) {
        this.a = weakReference;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("VRender-" + getId());
        try {
            this.b = true;
            k();
            g();
            i();
            while (this.b) {
                com.tencent.liteav.basic.util.e f = f();
                if (a(f.a, f.b)) {
                    a aVar = this.a == null ? null : this.a.get();
                    if (aVar != null && aVar.c() != null) {
                        d();
                    }
                }
                synchronized (this.e) {
                    try {
                        this.e.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            j();
            h();
            l();
        } catch (Exception e) {
            TXCLog.e("TXCVideoRenderThread", "render failed.", e);
        }
    }

    private com.tencent.liteav.basic.util.e f() {
        if (this.g != null) {
            return this.g.f();
        }
        if (this.f != null) {
            return this.f.c();
        }
        TXCOpenGlUtils.a("getSurfaceSize");
        return new com.tencent.liteav.basic.util.e(0, 0);
    }

    public void a(Object obj) {
        this.h = obj;
    }

    public Object a() {
        if (this.g != null) {
            return this.g.d();
        }
        if (this.f != null) {
            return this.f.f();
        }
        return null;
    }

    public void b() {
        this.b = false;
        c();
    }

    public void c() {
        synchronized (this.e) {
            this.e.notifyAll();
        }
    }

    public void d() {
        if (this.g != null) {
            this.g.a();
        }
        if (this.f != null) {
            this.f.e();
        }
    }

    public void e() {
        if (this.g != null) {
            this.g.b();
        }
        if (this.f != null) {
            this.f.b();
        }
    }

    private void g() {
        try {
            a aVar = this.a.get();
            if (aVar != null) {
                aVar.a(this);
            }
        } catch (Exception e) {
            TXCLog.e("TXCVideoRenderThread", "init texture render failed.", e);
        }
    }

    private void h() {
        try {
            a aVar = this.a.get();
            if (aVar != null) {
                aVar.b(this);
            }
        } catch (Exception e) {
            TXCLog.e("TXCVideoRenderThread", "destroy texture render failed", e);
        }
    }

    private boolean a(int i, int i2) {
        a aVar;
        try {
            if (this.a == null || (aVar = this.a.get()) == null) {
                return false;
            }
            return aVar.b(i, i2);
        } catch (Exception e) {
            TXCLog.e("TXCVideoRenderThread", "drawFrame failed." + e.getMessage());
            return false;
        }
    }

    private void i() {
        a aVar;
        if (this.a == null || (aVar = this.a.get()) == null) {
            return;
        }
        aVar.j();
    }

    private void j() {
        a aVar;
        if (this.a == null || (aVar = this.a.get()) == null) {
            return;
        }
        aVar.k();
    }

    private void k() {
        a aVar = this.a.get();
        if (aVar == null) {
            return;
        }
        SurfaceTexture c = aVar.c();
        Surface surface = c != null ? new Surface(c) : null;
        if (this.h == null || (this.h instanceof EGLContext)) {
            this.g = com.tencent.liteav.basic.opengl.b.a(null, (EGLContext) this.h, surface, this.c, this.d);
        } else {
            this.f = com.tencent.liteav.basic.opengl.c.a(null, (android.opengl.EGLContext) this.h, surface, this.c, this.d);
        }
        TXCLog.w("TXCVideoRenderThread", "vrender: init egl share context " + this.h + ", create context" + a());
        e();
    }

    private void l() {
        TXCLog.w("TXCVideoRenderThread", "vrender: uninit egl " + a());
        if (this.g != null) {
            this.g.c();
            this.g = null;
        }
        if (this.f != null) {
            this.f.d();
            this.f = null;
        }
    }
}
