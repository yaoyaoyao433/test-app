package com.tencent.liteav.b;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.r;
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
    private r i;
    private boolean j;
    private final String b = "VideoGLMultiGenerate";
    public List<a> a = new ArrayList();
    private HandlerThread d = new HandlerThread("GLMultiGene");

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        private int b;
        private float[] c;
        private int d;
        private int e;
        private com.tencent.liteav.renderer.c f;
        private com.tencent.liteav.editer.k g;
        private SurfaceTexture h;
        private Surface i;
        private boolean j;
        private com.tencent.liteav.d.e k;
        private SurfaceTexture.OnFrameAvailableListener l = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.b.n.a.1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                a.this.j = true;
                if (a.this.k != null) {
                    n.this.b(a.this.k, a.this.b);
                    a.this.k = null;
                }
            }
        };

        public a() {
        }
    }

    public n() {
        this.d.start();
        this.c = new Handler(this.d.getLooper());
    }

    public void a(com.tencent.liteav.d.g gVar, int i) {
        a aVar = new a();
        aVar.b = i;
        aVar.c = new float[16];
        this.a.add(aVar);
        aVar.d = gVar.a;
        aVar.e = gVar.b;
        this.e = gVar.a > this.e ? gVar.a : this.e;
        this.f = gVar.b > this.f ? gVar.b : this.f;
        TXCLog.i("VideoGLMultiGenerate", "setRenderResolution, mSurfaceWidth = " + this.e + ", mSurfaceHeight = " + this.f);
    }

    public void a(com.tencent.liteav.editer.k kVar, int i) {
        if (this.a != null && this.a.size() != 0 && i < this.a.size()) {
            this.a.get(i).g = kVar;
        } else {
            TXCLog.e("VideoGLMultiGenerate", "setListener, mVideoGLInfoList is empty or mIndex is larger than size");
        }
    }

    public void a(r rVar) {
        this.i = rVar;
    }

    public void a() {
        TXCLog.i("VideoGLMultiGenerate", "start");
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.b.n.1
                @Override // java.lang.Runnable
                public void run() {
                    n.this.e();
                    n.this.c();
                }
            });
        }
    }

    public void b() {
        TXCLog.i("VideoGLMultiGenerate", "stop");
        if (this.c != null) {
            this.c.post(new Runnable() { // from class: com.tencent.liteav.b.n.2
                @Override // java.lang.Runnable
                public void run() {
                    if (n.this.i != null && n.this.g != null) {
                        n.this.i.b(n.this.g.f());
                    }
                    n.this.d();
                    n.this.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        TXCLog.i("VideoGLMultiGenerate", "initTextureRender");
        this.h = new com.tencent.liteav.renderer.c(false);
        this.h.b();
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = this.a.get(i);
            aVar.f = new com.tencent.liteav.renderer.c(true);
            aVar.f.b();
            aVar.h = new SurfaceTexture(aVar.f.a());
            aVar.i = new Surface(aVar.h);
            aVar.h.setOnFrameAvailableListener(aVar.l);
            if (aVar.g != null) {
                aVar.g.a(aVar.i, i);
            }
            if (i == this.a.size() - 1) {
                this.j = true;
            }
        }
        if (this.i != null) {
            this.i.a(this.g.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        TXCLog.i("VideoGLMultiGenerate", "destroyTextureRender");
        this.j = false;
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = this.a.get(i);
            if (aVar.f != null) {
                aVar.f.c();
                aVar.f = null;
                if (aVar.h != null) {
                    aVar.h.setOnFrameAvailableListener(null);
                    aVar.h.release();
                    aVar.h = null;
                }
                if (aVar.i != null) {
                    aVar.i.release();
                    aVar.i = null;
                }
                aVar.h = null;
                aVar.k = null;
                aVar.j = false;
                aVar.c = new float[16];
            }
        }
        if (this.h != null) {
            this.h.c();
        }
        this.h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        TXCLog.i("VideoGLMultiGenerate", "initEGL");
        this.g = com.tencent.liteav.basic.opengl.c.a(null, null, null, this.e, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        TXCLog.i("VideoGLMultiGenerate", "destroyEGL");
        for (int i = 0; i < this.a.size(); i++) {
            a aVar = this.a.get(i);
            if (aVar.g != null) {
                aVar.g.b(aVar.i, i);
            }
        }
        if (this.g != null) {
            this.g.d();
            this.g = null;
        }
    }

    public synchronized void a(final com.tencent.liteav.d.e eVar, final int i) {
        if (this.a != null && this.a.size() != 0 && i < this.a.size()) {
            if (this.c != null) {
                this.c.post(new Runnable() { // from class: com.tencent.liteav.b.n.3
                    @Override // java.lang.Runnable
                    public void run() {
                        n.this.b(eVar, i);
                    }
                });
            }
            return;
        }
        TXCLog.e("VideoGLMultiGenerate", "setListener, mVideoGLInfoList is empty or mIndex is larger than size");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(com.tencent.liteav.d.e eVar, int i) {
        if (this.j) {
            a aVar = this.a.get(i);
            if (eVar.p() || eVar.r()) {
                if (aVar.g != null) {
                    if (eVar.y() == 0) {
                        aVar.g.a(eVar.x(), aVar.c, eVar, i);
                    } else {
                        aVar.g.a(aVar.f.a(), aVar.c, eVar, i);
                    }
                }
                return false;
            }
            synchronized (this) {
                if (aVar.j) {
                    boolean z = aVar.j;
                    aVar.j = false;
                    GLES20.glViewport(0, 0, aVar.d, aVar.e);
                    if (z) {
                        try {
                            if (aVar.h != null) {
                                aVar.h.updateTexImage();
                                aVar.h.getTransformMatrix(aVar.c);
                            }
                        } catch (Exception unused) {
                        }
                        if (aVar.g != null) {
                            if (eVar.y() == 0) {
                                aVar.g.a(eVar.x(), aVar.c, eVar, i);
                                return true;
                            }
                            aVar.g.a(aVar.f.a(), aVar.c, eVar, i);
                            return true;
                        } else if (this.h != null) {
                            this.h.a(aVar.h);
                            return true;
                        } else {
                            return true;
                        }
                    }
                    return true;
                }
                aVar.k = eVar;
                return false;
            }
        }
        return false;
    }
}
