package com.tencent.liteav.g;

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
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class o {
    private Context a;
    private d c;
    private FrameLayout d;
    private TextureView e;
    private int f;
    private int g;
    private Handler h;
    private com.tencent.liteav.renderer.c j;
    private SurfaceTexture k;
    private boolean l;
    private boolean m;
    private TextureView.SurfaceTextureListener o = new TextureView.SurfaceTextureListener() { // from class: com.tencent.liteav.g.o.1
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.i("VideoJoinGLRender", "onSurfaceTextureAvailable surface:" + surfaceTexture + ",width:" + i + ",height:" + i2 + ", mSaveSurfaceTexture = " + o.this.k);
            o.this.f = i;
            o.this.g = i2;
            if (o.this.k == null) {
                o.this.k = surfaceTexture;
                o.this.a(surfaceTexture);
            } else if (Build.VERSION.SDK_INT >= 16) {
                o.this.e.setSurfaceTexture(o.this.k);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.i("VideoJoinGLRender", "onSurfaceTextureSizeChanged surface:" + surfaceTexture + ",width:" + i + ",height:" + i2);
            o.this.f = i;
            o.this.g = i2;
            if (o.this.c != null) {
                o.this.c.a(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TXCLog.i("VideoJoinGLRender", "onSurfaceTextureDestroyed surface:" + surfaceTexture);
            if (!o.this.l) {
                o.this.k = null;
                o.this.a(false);
            }
            return false;
        }
    };
    private ArrayList<Surface> n = new ArrayList<>();
    private com.tencent.liteav.f.d b = new com.tencent.liteav.f.d();
    private HandlerThread i = new HandlerThread("VideoJoinGLRender");

    public o(Context context) {
        this.a = context;
        this.i.start();
        this.h = new Handler(this.i.getLooper());
    }

    public void a(d dVar) {
        this.c = dVar;
    }

    public void a(a.g gVar) {
        if (this.d != null) {
            this.d.removeAllViews();
        }
        FrameLayout frameLayout = gVar.a;
        if (frameLayout == null) {
            TXCLog.e("VideoJoinGLRender", "initWithPreview param.videoView is NULL!!!");
            return;
        }
        if (this.d == null || !frameLayout.equals(this.d)) {
            this.e = new TextureView(this.a);
            this.e.setSurfaceTextureListener(this.o);
        }
        this.d = frameLayout;
        this.d.addView(this.e);
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public void c() {
        this.l = true;
    }

    public void d() {
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final SurfaceTexture surfaceTexture) {
        if (this.h != null) {
            this.h.post(new Runnable() { // from class: com.tencent.liteav.g.o.2
                @Override // java.lang.Runnable
                public void run() {
                    o.this.b.a(surfaceTexture);
                    o.this.e();
                    if (o.this.c != null) {
                        o.this.c.a(o.this.n);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        if (this.h != null) {
            this.h.post(new Runnable() { // from class: com.tencent.liteav.g.o.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (o.this.h == null) {
                            return;
                        }
                        if (o.this.c != null) {
                            o.this.c.b(o.this.n);
                        }
                        o.this.f();
                        o.this.b.a();
                        if (z) {
                            o.this.h = null;
                            if (o.this.i != null) {
                                o.this.i.quit();
                                o.this.i = null;
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
    public void e() {
        TXCLog.i("VideoJoinGLRender", "initTextureRender");
        this.j = new com.tencent.liteav.renderer.c(false);
        this.j.b();
        List<i> d = t.a().d();
        for (int i = 0; i < d.size(); i++) {
            final i iVar = d.get(i);
            final k kVar = new k();
            kVar.e = new float[16];
            kVar.a = new com.tencent.liteav.renderer.c(true);
            kVar.a.b();
            kVar.b = new SurfaceTexture(kVar.a.a());
            kVar.c = new Surface(kVar.b);
            kVar.b.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.g.o.4
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    kVar.d = true;
                    if (kVar.f == null || !o.this.b(kVar.f, iVar)) {
                        return;
                    }
                    kVar.f = null;
                    o.this.b.b();
                }
            });
            iVar.b = kVar;
            this.n.add(kVar.c);
        }
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        TXCLog.i("VideoJoinGLRender", "destroyTextureRender");
        this.m = false;
        List<i> d = t.a().d();
        for (int i = 0; i < d.size(); i++) {
            k kVar = d.get(i).b;
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
        if (this.j != null) {
            this.j.c();
        }
        this.j = null;
    }

    public void a(int i, int i2, int i3) {
        GLES20.glViewport(0, 0, i2, i3);
        if (this.j != null) {
            this.j.a(i, false, 0);
        }
    }

    public void a(final com.tencent.liteav.d.e eVar, final i iVar) {
        if (this.h != null) {
            this.h.post(new Runnable() { // from class: com.tencent.liteav.g.o.5
                @Override // java.lang.Runnable
                public void run() {
                    if (o.this.b(eVar, iVar)) {
                        o.this.b.b();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(com.tencent.liteav.d.e eVar, i iVar) {
        if (this.m) {
            k kVar = iVar.b;
            if (eVar.p()) {
                TXCLog.i("VideoJoinGLRender", "onDrawFrame, frame isEndFrame");
                if (this.c != null) {
                    if (eVar.y() == 0) {
                        this.c.a(eVar.x(), kVar.e, eVar);
                    } else {
                        this.c.a(kVar.a.a(), kVar.e, eVar);
                    }
                }
                return false;
            }
            synchronized (this) {
                if (kVar.d) {
                    boolean z = kVar.d;
                    kVar.d = false;
                    GLES20.glViewport(0, 0, this.f, this.g);
                    if (z) {
                        if (kVar.b != null) {
                            kVar.b.updateTexImage();
                            kVar.b.getTransformMatrix(kVar.e);
                        }
                        if (this.c != null) {
                            if (eVar.y() == 0) {
                                this.c.a(eVar.x(), kVar.e, eVar);
                                return true;
                            }
                            this.c.a(kVar.a.a(), kVar.e, eVar);
                            return true;
                        } else if (this.j != null) {
                            this.j.a(kVar.b);
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
