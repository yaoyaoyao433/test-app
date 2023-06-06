package com.tencent.liteav.g;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class n {
    private Handler c;
    private int e;
    private int f;
    private com.tencent.liteav.basic.opengl.c g;
    private com.tencent.liteav.renderer.c h;
    private com.tencent.liteav.editer.r i;
    private d j;
    private boolean k;
    private j l;
    private final String a = "VideoJoinGLGenerate";
    private ArrayList<Surface> b = new ArrayList<>();
    private HandlerThread d = new HandlerThread("GLGeneJoin");

    protected void finalize() throws Throwable {
        super.finalize();
        try {
            c();
        } catch (Error unused) {
        } catch (Exception unused2) {
        }
    }

    public n() {
        this.d.start();
        this.c = new Handler(this.d.getLooper());
    }

    public void a(com.tencent.liteav.d.g gVar) {
        this.e = gVar.a;
        this.f = gVar.b;
    }

    public void a(j jVar) {
        this.l = jVar;
    }

    public void a(d dVar) {
        this.j = dVar;
    }

    public void a(com.tencent.liteav.editer.r rVar) {
        this.i = rVar;
    }

    public void a() {
        TXCLog.i("VideoJoinGLGenerate", "start");
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.g.n.1
                @Override // java.lang.Runnable
                public void run() {
                    n.this.f();
                    n.this.d();
                }
            });
        }
    }

    public void b() {
        TXCLog.i("VideoJoinGLGenerate", "stop");
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.g.n.2
                @Override // java.lang.Runnable
                public void run() {
                    if (n.this.i != null) {
                        n.this.i.b(n.this.g.f());
                    }
                    n.this.e();
                    n.this.g();
                }
            });
        }
    }

    public void c() {
        TXCLog.i("VideoJoinGLGenerate", "release");
        if (this.c != null) {
            if (this.d != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.d.quitSafely();
                } else {
                    this.d.quit();
                }
                this.d = null;
            }
            this.j = null;
            this.i = null;
            this.c = null;
        }
        this.b.clear();
    }

    public void a(Runnable runnable) {
        if (Looper.myLooper() == (this.c != null ? this.c.getLooper() : null)) {
            runnable.run();
        } else if (this.c != null) {
            this.c.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        TXCLog.i("VideoJoinGLGenerate", "initTextureRender");
        this.h = new com.tencent.liteav.renderer.c(false);
        this.h.b();
        List<i> a = this.l.a();
        for (int i = 0; i < a.size(); i++) {
            final i iVar = a.get(i);
            final k kVar = new k();
            kVar.e = new float[16];
            kVar.a = new com.tencent.liteav.renderer.c(true);
            kVar.a.b();
            kVar.b = new SurfaceTexture(kVar.a.a());
            kVar.c = new Surface(kVar.b);
            kVar.b.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.g.n.3
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    kVar.d = true;
                    if (kVar.f != null) {
                        n.this.b(kVar.f, iVar);
                        kVar.f = null;
                    }
                }
            });
            iVar.b = kVar;
            this.b.add(kVar.c);
        }
        this.k = true;
        if (this.j != null) {
            this.j.a(this.b);
        }
        if (this.i != null) {
            this.i.a(this.g.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        TXCLog.i("VideoJoinGLGenerate", "destroyTextureRender mVideoExtractListConfig:" + this.l);
        this.k = false;
        if (this.l != null) {
            List<i> a = this.l.a();
            for (int i = 0; i < a.size(); i++) {
                k kVar = a.get(i).b;
                if (kVar.a != null) {
                    kVar.a.c();
                }
                kVar.a = null;
                if (kVar.b != null) {
                    kVar.b.setOnFrameAvailableListener(null);
                    kVar.b.release();
                }
                kVar.b = null;
                if (kVar.c != null) {
                    kVar.c.release();
                }
                kVar.c = null;
            }
        }
        if (this.h != null) {
            this.h.c();
        }
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        TXCLog.i("VideoJoinGLGenerate", "initEGL");
        this.g = com.tencent.liteav.basic.opengl.c.a(null, null, null, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TXCLog.i("VideoJoinGLGenerate", "destroyEGL");
        if (this.j != null) {
            this.j.b(this.b);
        }
        if (this.g != null) {
            this.g.d();
            this.g = null;
        }
    }

    public synchronized void a(final com.tencent.liteav.d.e eVar, final i iVar) {
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.g.n.4
                @Override // java.lang.Runnable
                public void run() {
                    n.this.b(eVar, iVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(com.tencent.liteav.d.e eVar, i iVar) {
        if (this.k) {
            k kVar = iVar.b;
            if (eVar.p()) {
                if (this.j != null) {
                    if (eVar.y() == 0) {
                        this.j.a(eVar.x(), kVar.e, eVar);
                    } else {
                        this.j.a(kVar.a.a(), kVar.e, eVar);
                    }
                }
                return false;
            }
            synchronized (this) {
                if (kVar.d) {
                    boolean z = kVar.d;
                    kVar.d = false;
                    GLES20.glViewport(0, 0, this.e, this.f);
                    if (z) {
                        try {
                            if (kVar.b != null) {
                                kVar.b.updateTexImage();
                                kVar.b.getTransformMatrix(kVar.e);
                            }
                        } catch (Exception unused) {
                        }
                        if (this.j != null) {
                            if (eVar.y() == 0) {
                                this.j.a(eVar.x(), kVar.e, eVar);
                                return true;
                            }
                            this.j.a(kVar.a.a(), kVar.e, eVar);
                            return true;
                        } else if (this.h != null) {
                            this.h.a(kVar.b);
                            return true;
                        } else {
                            return true;
                        }
                    }
                    return true;
                }
                kVar.f = eVar;
                return false;
            }
        }
        return false;
    }
}
