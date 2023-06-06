package com.tencent.liteav.basic.opengl;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.i;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g implements i.a {
    private volatile HandlerThread a = null;
    private volatile i b = null;
    private j c = null;
    private int d = 0;
    private boolean e = false;
    private float f = 1.0f;
    private float g = 1.0f;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private boolean l = false;
    private p m = null;
    private boolean n = false;

    @Override // com.tencent.liteav.basic.opengl.i.a
    public void d() {
    }

    public void a(Object obj, Surface surface) {
        TXCLog.i("TXGLSurfaceRenderThread", "surface-render: surface render start " + surface + ", " + this);
        b(obj, surface);
    }

    public void a() {
        TXCLog.i("TXGLSurfaceRenderThread", "surface-render: surface render stop " + this);
        f();
    }

    public Surface b() {
        Surface b;
        synchronized (this) {
            b = this.b != null ? this.b.b() : null;
        }
        return b;
    }

    public void a(final int i) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.g.1
            @Override // java.lang.Runnable
            public void run() {
                g.this.h = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    public void b(final int i) {
        a(new Runnable() { // from class: com.tencent.liteav.basic.opengl.g.2
            @Override // java.lang.Runnable
            public void run() {
                g.this.i = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            if (this.b != null) {
                this.b.post(runnable);
            }
        }
    }

    public void a(final int i, final boolean z, final int i2, final int i3, final int i4, final int i5, final int i6, final boolean z2, final boolean z3) {
        GLES20.glFinish();
        synchronized (this) {
            if (this.b != null) {
                this.b.post(new Runnable() { // from class: com.tencent.liteav.basic.opengl.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            g.this.b(i, z, i2, i3, i4, i5, i6, z2, z3);
                        } catch (Exception e) {
                            TXCLog.e("TXGLSurfaceRenderThread", "surface-render: render texture error occurred!" + e.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void a(p pVar) {
        this.m = pVar;
        this.l = true;
    }

    @Override // com.tencent.liteav.basic.opengl.i.a
    public void c() {
        this.c = new j();
        if (this.c.c()) {
            this.c.a(m.e, m.a(l.NORMAL, false, false));
        }
    }

    @Override // com.tencent.liteav.basic.opengl.i.a
    public void e() {
        if (this.c != null) {
            this.c.e();
            this.c = null;
        }
    }

    private void b(Object obj, Surface surface) {
        f();
        synchronized (this) {
            this.a = new HandlerThread("TXGLSurfaceRenderThread");
            this.a.start();
            this.b = new i(this.a.getLooper());
            this.b.a(this);
            if (obj != null && !(obj instanceof EGLContext)) {
                this.b.d = true;
                this.b.f = (android.opengl.EGLContext) obj;
                this.b.c = surface;
                TXCLog.w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.a.getName());
            }
            this.b.d = false;
            this.b.h = (EGLContext) obj;
            this.b.c = surface;
            TXCLog.w("TXGLSurfaceRenderThread", "surface-render: create gl thread " + this.a.getName());
        }
        c(100);
    }

    private void f() {
        synchronized (this) {
            if (this.b != null) {
                i.a(this.b, this.a);
                TXCLog.w("TXGLSurfaceRenderThread", "surface-render: destroy gl thread");
            }
            this.b = null;
            this.a = null;
        }
    }

    private void c(int i) {
        synchronized (this) {
            if (this.b != null) {
                this.b.sendEmptyMessage(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, boolean z, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        int i7;
        int i8;
        if (i5 == 0 || i6 == 0 || this.c == null) {
            return;
        }
        if (this.n) {
            this.n = false;
            return;
        }
        if (z2) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glBindFramebuffer(36160, 0);
            if (this.b != null) {
                this.b.c();
            }
            this.n = true;
        }
        int i9 = i3 != 0 ? i3 : i5;
        int i10 = i4 != 0 ? i4 : i6;
        if (this.h != 0 && this.h == 1) {
            int i11 = (720 - i2) % 360;
            boolean z4 = i11 == 90 || i11 == 270;
            int[] a = a(i9, i10, z4 ? i6 : i5, z4 ? i5 : i6);
            i9 = a[0];
            int i12 = a[1];
            i7 = a[2];
            i8 = a[3];
            i10 = i12;
        } else {
            i8 = 0;
            i7 = 0;
        }
        this.j = i9;
        this.k = i10;
        GLES20.glViewport(i7, i8, i9, i10);
        boolean z5 = (this.i != 1 ? !(this.i == 2 && z3) : z3) ? z : !z;
        float f = i10 != 0 ? i9 / i10 : 1.0f;
        float f2 = i6 != 0 ? i5 / i6 : 1.0f;
        if (this.e != z5 || this.d != i2 || this.f != f || this.g != f2) {
            this.e = z5;
            this.d = i2;
            this.f = f;
            this.g = f2;
            int i13 = (720 - this.d) % 360;
            boolean z6 = i13 == 90 || i13 == 270;
            int i14 = z6 ? i10 : i9;
            if (z6) {
                i10 = i9;
            }
            this.c.a(i5, i6, i13, m.a(l.NORMAL, false, true), i14 / i10, z6 ? false : this.e, z6 ? this.e : false);
            if (z6) {
                this.c.g();
            } else {
                this.c.h();
            }
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glBindFramebuffer(36160, 0);
        this.c.b(i);
        a(i7, i8);
        if (this.b != null) {
            this.b.c();
        }
    }

    private int[] a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr = new int[4];
        float f = i2;
        float f2 = i;
        float f3 = i4 / i3;
        if (f / f2 > f3) {
            int i7 = (int) (f2 * f3);
            i5 = (i2 - i7) / 2;
            i2 = i7;
            i6 = 0;
        } else {
            int i8 = (int) (f / f3);
            i5 = 0;
            i6 = (i - i8) / 2;
            i = i8;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i6;
        iArr[3] = i5;
        return iArr;
    }

    private void a(int i, int i2) {
        if (this.l) {
            if (this.j != 0 && this.k != 0) {
                boolean z = this.j <= this.k;
                int i3 = this.k >= this.j ? this.k : this.j;
                int i4 = this.k >= this.j ? this.j : this.k;
                if (z) {
                    int i5 = i4;
                    i4 = i3;
                    i3 = i5;
                }
                final ByteBuffer allocate = ByteBuffer.allocate(i3 * i4 * 4);
                final Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                allocate.position(0);
                GLES20.glReadPixels(i, i2, i3, i4, 6408, 5121, allocate);
                final p pVar = this.m;
                if (pVar != null) {
                    final int i6 = i3;
                    final int i7 = i4;
                    new Thread(new Runnable() { // from class: com.tencent.liteav.basic.opengl.g.4
                        @Override // java.lang.Runnable
                        public void run() {
                            allocate.position(0);
                            createBitmap.copyPixelsFromBuffer(allocate);
                            Matrix matrix = new Matrix();
                            matrix.setScale(1.0f, -1.0f);
                            pVar.onTakePhotoComplete(Bitmap.createBitmap(createBitmap, 0, 0, i6, i7, matrix, false));
                            createBitmap.recycle();
                        }
                    }).start();
                }
            }
            this.m = null;
            this.l = false;
        }
    }
}
