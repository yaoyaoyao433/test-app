package com.tencent.liteav.editer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ad {
    private Handler c;
    private HandlerThread d;
    private int e;
    private int f;
    private com.tencent.liteav.basic.opengl.c g;
    private com.tencent.liteav.renderer.c h;
    private com.tencent.liteav.renderer.c i;
    private r j;
    private o k;
    private SurfaceTexture l;
    private Surface m;
    private boolean n;
    private boolean o;
    private com.tencent.liteav.d.e p;
    private final String a = "VideoGLGenerate";
    private SurfaceTexture.OnFrameAvailableListener q = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.editer.ad.3
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            ad.this.n = true;
            if (ad.this.p != null) {
                ad.this.c(ad.this.p);
                ad.this.p = null;
            }
        }
    };
    private float[] b = new float[16];

    public ad(String str) {
        this.d = new HandlerThread(str + "glGene");
        this.d.start();
        this.c = new Handler(this.d.getLooper());
    }

    public void a(com.tencent.liteav.d.g gVar) {
        this.e = gVar.a;
        this.f = gVar.b;
    }

    public void a(o oVar) {
        this.k = oVar;
    }

    public void a(r rVar) {
        this.j = rVar;
    }

    public void a() {
        TXCLog.i("VideoGLGenerate", "start");
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.editer.ad.1
                @Override // java.lang.Runnable
                public void run() {
                    ad.this.f();
                    ad.this.d();
                }
            });
        }
    }

    public void b() {
        TXCLog.i("VideoGLGenerate", "stop");
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.editer.ad.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ad.this.j != null && ad.this.g != null) {
                        ad.this.j.b(ad.this.g.f());
                    }
                    ad.this.e();
                    ad.this.g();
                }
            });
        }
    }

    public void c() {
        if (this.c != null) {
            if (this.d != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.d.quitSafely();
                } else {
                    this.d.quit();
                }
                this.d = null;
            }
            this.k = null;
            this.j = null;
            this.q = null;
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        TXCLog.i("VideoGLGenerate", "initTextureRender");
        this.h = new com.tencent.liteav.renderer.c(true);
        this.h.b();
        this.i = new com.tencent.liteav.renderer.c(false);
        this.i.b();
        this.l = new SurfaceTexture(this.h.a());
        this.m = new Surface(this.l);
        this.l.setOnFrameAvailableListener(this.q);
        this.o = true;
        if (this.k != null) {
            this.k.a(this.m);
        }
        if (this.j == null || this.g == null) {
            return;
        }
        this.j.a(this.g.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        TXCLog.i("VideoGLGenerate", "destroyTextureRender");
        this.o = false;
        if (this.h != null) {
            this.h.c();
        }
        this.h = null;
        if (this.i != null) {
            this.i.c();
        }
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        TXCLog.i("VideoGLGenerate", "initEGL");
        this.g = com.tencent.liteav.basic.opengl.c.a(null, null, null, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TXCLog.i("VideoGLGenerate", "destroyEGL");
        if (this.k != null) {
            this.k.b(this.m);
        }
        if (this.g != null) {
            this.g.d();
            this.g = null;
        }
    }

    public synchronized void a(final com.tencent.liteav.d.e eVar) {
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.editer.ad.4
                @Override // java.lang.Runnable
                public void run() {
                    ad.this.c(eVar);
                }
            });
        }
    }

    public void b(final com.tencent.liteav.d.e eVar) {
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.editer.ad.5
                @Override // java.lang.Runnable
                public void run() {
                    ad.this.n = true;
                    ad.this.c(eVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(com.tencent.liteav.d.e eVar) {
        if (this.o) {
            if (eVar.p() || eVar.r()) {
                if (this.k != null) {
                    if (eVar.y() == 0) {
                        this.k.a(eVar.x(), this.b, eVar);
                    } else {
                        this.k.a(this.h.a(), this.b, eVar);
                    }
                }
                return false;
            }
            synchronized (this) {
                if (this.n) {
                    boolean z = this.n;
                    this.n = false;
                    GLES20.glViewport(0, 0, this.e, this.f);
                    if (z) {
                        try {
                            if (this.l != null) {
                                this.l.updateTexImage();
                                this.l.getTransformMatrix(this.b);
                            }
                        } catch (Exception unused) {
                        }
                        if (this.k != null) {
                            if (eVar.y() == 0) {
                                this.k.a(eVar.x(), this.b, eVar);
                                return true;
                            }
                            this.k.a(this.h.a(), this.b, eVar);
                            return true;
                        } else if (this.i != null) {
                            this.i.a(this.l);
                            return true;
                        } else {
                            return true;
                        }
                    }
                    return true;
                }
                this.p = eVar;
                return false;
            }
        }
        return false;
    }
}
