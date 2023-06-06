package com.tencent.liteav.basic.opengl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.i;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h implements i.a, n {
    private o d;
    private volatile HandlerThread b = null;
    private volatile i c = null;
    private int[] e = null;
    private SurfaceTexture f = null;
    private boolean g = false;
    public int a = 25;
    private long h = 0;
    private long i = 0;
    private float[] j = new float[16];

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(int i, boolean z, int i2, int i3, int i4, boolean z2) {
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(byte[] bArr) {
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void setRendMirror(int i) {
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void setRendMode(int i) {
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(int i, boolean z) {
        this.a = i;
        b();
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a() {
        f();
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void setSurfaceTextureListener(o oVar) {
        this.d = oVar;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public SurfaceTexture getSurfaceTexture() {
        return this.f;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public EGLContext getGLContext() {
        EGLContext a;
        synchronized (this) {
            a = this.c != null ? this.c.a() : null;
        }
        return a;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(Runnable runnable) {
        synchronized (this) {
            if (this.c != null) {
                this.c.post(runnable);
            }
        }
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(boolean z) {
        synchronized (this) {
            try {
                try {
                    if (this.c != null) {
                        this.c.removeCallbacksAndMessages(null);
                    }
                    this.g = false;
                } catch (Exception e) {
                    TXCLog.e("TXGLSurfaceTextureThread", "updateTexImage failed." + e.getMessage());
                }
                if (this.f != null && this.e != null) {
                    this.f.updateTexImage();
                    this.f.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.basic.opengl.h.1
                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                            h.this.a(103, new Runnable() { // from class: com.tencent.liteav.basic.opengl.h.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    h.this.g = true;
                                    h.this.a(102);
                                }
                            });
                            surfaceTexture.setOnFrameAvailableListener(null);
                        }
                    });
                }
            } finally {
            }
        }
    }

    @Override // com.tencent.liteav.basic.opengl.i.a
    public void c() {
        h();
    }

    @Override // com.tencent.liteav.basic.opengl.i.a
    public void d() {
        a(102, 5L);
        if (!i() || this.f == null || this.e == null) {
            return;
        }
        try {
            this.f.updateTexImage();
            this.f.getTransformMatrix(this.j);
        } catch (Exception e) {
            TXCLog.e("TXGLSurfaceTextureThread", "onMsgRend Exception " + e.getMessage());
        }
        o oVar = this.d;
        if (oVar != null) {
            oVar.onTextureProcess(this.e[0], this.j);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.i.a
    public void e() {
        g();
    }

    private void b() {
        f();
        synchronized (this) {
            this.b = new HandlerThread("TXGLSurfaceTextureThread");
            this.b.start();
            this.c = new i(this.b.getLooper());
            this.c.a(this);
            this.c.a = 1280;
            this.c.b = 720;
            TXCLog.w("TXGLSurfaceTextureThread", "create gl thread " + this.b.getName());
        }
        a(100);
    }

    private void f() {
        synchronized (this) {
            if (this.c != null) {
                i.a(this.c, this.b);
                TXCLog.w("TXGLSurfaceTextureThread", "destroy gl thread");
            }
            this.c = null;
            this.b = null;
        }
    }

    private void a(int i, long j) {
        synchronized (this) {
            if (this.c != null) {
                this.c.sendEmptyMessageDelayed(i, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this) {
            if (this.c != null) {
                this.c.sendEmptyMessage(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Runnable runnable) {
        synchronized (this) {
            if (this.c != null) {
                Message message = new Message();
                message.what = i;
                message.obj = runnable;
                this.c.sendMessage(message);
            }
        }
    }

    private void g() {
        TXCLog.w("TXGLSurfaceTextureThread", "destroy surface texture ");
        o oVar = this.d;
        if (oVar != null) {
            oVar.onSurfaceTextureDestroy(this.f);
        }
        if (this.f != null) {
            this.f.setOnFrameAvailableListener(null);
            this.f.release();
            this.g = false;
            this.f = null;
        }
        if (this.e != null) {
            GLES20.glDeleteTextures(1, this.e, 0);
            this.e = null;
        }
    }

    private void h() {
        TXCLog.w("TXGLSurfaceTextureThread", "init surface texture ");
        this.e = new int[1];
        this.e[0] = TXCOpenGlUtils.b();
        if (this.e[0] <= 0) {
            this.e = null;
            return;
        }
        this.f = new SurfaceTexture(this.e[0]);
        this.f.setDefaultBufferSize(1280, 720);
        this.f.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.basic.opengl.h.2
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                h.this.a(103, new Runnable() { // from class: com.tencent.liteav.basic.opengl.h.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        h.this.g = true;
                        h.this.a(102);
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(null);
            }
        });
        o oVar = this.d;
        if (oVar != null) {
            oVar.onSurfaceTextureAvailable(this.f);
        }
    }

    private boolean i() {
        if (!this.g) {
            this.h = 0L;
            this.i = System.nanoTime();
            return false;
        }
        long nanoTime = System.nanoTime();
        if (nanoTime < this.i + ((((this.h * 1000) * 1000) * 1000) / this.a)) {
            return false;
        }
        if (this.i == 0) {
            this.i = nanoTime;
        } else if (nanoTime > this.i + 1000000000) {
            this.h = 0L;
            this.i = nanoTime;
        }
        this.h++;
        return true;
    }
}
