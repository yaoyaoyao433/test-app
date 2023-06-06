package com.tencent.liteav.editer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.i.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ae {
    private final Context a;
    private o d;
    private FrameLayout e;
    private TextureView f;
    private int g;
    private int h;
    private Handler i;
    private com.tencent.liteav.renderer.c k;
    private com.tencent.liteav.renderer.c l;
    private SurfaceTexture m;
    private SurfaceTexture n;
    private Surface o;
    private boolean p;
    private com.tencent.liteav.d.e q;
    private boolean r;
    private boolean s;
    private TextureView.SurfaceTextureListener t = new TextureView.SurfaceTextureListener() { // from class: com.tencent.liteav.editer.ae.1
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.i("VideoGLRender", "onSurfaceTextureAvailable surface:" + surfaceTexture + ",width:" + i + ",height:" + i2 + ", mSaveSurfaceTexture = " + ae.this.n);
            ae.this.g = i;
            ae.this.h = i2;
            if (ae.this.n == null) {
                ae.this.n = surfaceTexture;
                ae.this.a(surfaceTexture);
            } else if (Build.VERSION.SDK_INT >= 16) {
                ae.this.f.setSurfaceTexture(ae.this.n);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.i("VideoGLRender", "wonSurfaceTextureSizeChanged surface:" + surfaceTexture + ",width:" + i + ",height:" + i2);
            ae.this.g = i;
            ae.this.h = i2;
            if (ae.this.d != null) {
                ae.this.d.a(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TXCLog.i("VideoGLRender", "onSurfaceTextureDestroyed surface:" + surfaceTexture);
            if (!ae.this.r) {
                ae.this.n = null;
                ae.this.a(false);
            }
            return false;
        }
    };
    private SurfaceTexture.OnFrameAvailableListener u = new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.editer.ae.4
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            synchronized (this) {
                ae.this.p = true;
            }
        }
    };
    private float[] b = new float[16];
    private com.tencent.liteav.f.d c = new com.tencent.liteav.f.d();
    private HandlerThread j = new HandlerThread("videoGLRender");

    public ae(Context context) {
        this.a = context;
        this.j.start();
        this.i = new Handler(this.j.getLooper());
    }

    public void a(o oVar) {
        this.d = oVar;
    }

    public void a(a.g gVar) {
        if (this.e != null) {
            this.e.removeAllViews();
        }
        FrameLayout frameLayout = gVar.a;
        if (frameLayout == null) {
            TXCLog.e("VideoGLRender", "initWithPreview param.videoView is NULL!!!");
            return;
        }
        if (this.e == null || !frameLayout.equals(this.e)) {
            this.f = new TextureView(this.a);
            this.f.setSurfaceTextureListener(this.t);
        }
        this.e = frameLayout;
        this.e.addView(this.f);
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public void c() {
        this.r = true;
    }

    public void d() {
        this.r = false;
    }

    public void e() {
        this.r = false;
        a(true);
        if (this.e != null) {
            this.e.removeAllViews();
            this.e = null;
        }
        if (this.f != null) {
            this.f.setSurfaceTextureListener(null);
            this.f = null;
        }
        if (this.d != null) {
            this.d = null;
        }
        this.t = null;
        this.u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final SurfaceTexture surfaceTexture) {
        if (this.i != null) {
            this.i.post(new Runnable() { // from class: com.tencent.liteav.editer.ae.2
                @Override // java.lang.Runnable
                public void run() {
                    ae.this.c.a(surfaceTexture);
                    ae.this.f();
                    if (ae.this.d != null) {
                        ae.this.d.a(ae.this.o);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        if (this.i != null) {
            this.i.post(new Runnable() { // from class: com.tencent.liteav.editer.ae.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ae.this.i == null) {
                            return;
                        }
                        if (ae.this.d != null) {
                            ae.this.d.b(ae.this.o);
                        }
                        ae.this.g();
                        ae.this.c.a();
                        if (z) {
                            ae.this.d = null;
                            ae.this.i = null;
                            if (ae.this.j != null) {
                                ae.this.j.quit();
                                ae.this.j = null;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.k = new com.tencent.liteav.renderer.c(true);
        this.k.b();
        this.l = new com.tencent.liteav.renderer.c(false);
        this.l.b();
        this.m = new SurfaceTexture(this.k.a());
        this.o = new Surface(this.m);
        this.m.setOnFrameAvailableListener(this.u);
        this.s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.s = false;
        if (this.k != null) {
            this.k.c();
        }
        this.k = null;
        if (this.l != null) {
            this.l.c();
        }
        this.l = null;
        if (this.m != null) {
            this.m.setOnFrameAvailableListener(null);
            this.m.release();
            this.m = null;
        }
        if (this.o != null) {
            this.o.release();
            this.o = null;
        }
    }

    public void a(int i, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
        if (this.l != null) {
            this.l.a(i, false, 0);
        }
    }

    public void a(final com.tencent.liteav.d.e eVar) {
        if (this.i != null) {
            this.i.post(new Runnable() { // from class: com.tencent.liteav.editer.ae.5
                @Override // java.lang.Runnable
                public void run() {
                    if (ae.this.c(eVar)) {
                        ae.this.c.b();
                    }
                }
            });
        }
    }

    public void a(final int i) {
        if (this.i != null) {
            this.i.post(new Runnable() { // from class: com.tencent.liteav.editer.ae.6
                @Override // java.lang.Runnable
                public void run() {
                    if (ae.this.d != null) {
                        ae.this.d.a(i);
                        ae.this.c.b();
                    }
                }
            });
        }
    }

    public void b(final com.tencent.liteav.d.e eVar) {
        if (this.i != null) {
            this.i.post(new Runnable() { // from class: com.tencent.liteav.editer.ae.7
                @Override // java.lang.Runnable
                public void run() {
                    ae.this.p = true;
                    ae.this.c(eVar);
                    ae.this.c.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(com.tencent.liteav.d.e eVar) {
        if (this.s) {
            if (eVar.p()) {
                TXCLog.i("VideoGLRender", "onDrawFrame, frame isEndFrame");
                if (this.d != null) {
                    if (eVar.y() == 0) {
                        this.d.a(eVar.x(), this.b, eVar);
                    } else {
                        this.d.a(this.k.a(), this.b, eVar);
                    }
                }
                return false;
            }
            this.q = eVar;
            synchronized (this) {
                if (this.p) {
                    boolean z = this.p;
                    this.p = false;
                    GLES20.glViewport(0, 0, this.g, this.h);
                    if (z) {
                        if (this.m != null) {
                            this.m.updateTexImage();
                            this.m.getTransformMatrix(this.b);
                        }
                        if (this.d != null) {
                            if (eVar.y() == 0) {
                                this.d.a(eVar.x(), this.b, eVar);
                                return true;
                            }
                            this.d.a(this.k.a(), this.b, eVar);
                            return true;
                        } else if (this.l != null) {
                            this.l.a(this.m);
                            return true;
                        } else {
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
