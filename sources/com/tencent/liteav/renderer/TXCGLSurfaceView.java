package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.opengl.l;
import com.tencent.liteav.basic.opengl.m;
import com.tencent.liteav.basic.opengl.n;
import com.tencent.liteav.basic.opengl.o;
import com.tencent.liteav.basic.opengl.p;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCGLSurfaceView extends TXCGLSurfaceViewBase implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, n {
    private p A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private o F;
    private long G;
    private byte[] H;
    private long I;
    private int J;
    private int K;
    private final Queue<Runnable> L;
    WeakReference<com.tencent.liteav.basic.c.b> a;
    private SurfaceTexture g;
    private EGLContext h;
    private j i;
    private int[] j;
    private float[] k;
    private int l;
    private boolean m;
    private float n;
    private float o;
    private int p;
    private long q;
    private long r;
    private int s;
    private boolean t;
    private boolean u;
    private Object v;
    private Handler w;
    private int x;
    private int y;
    private boolean z;

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public TXCGLSurfaceView(Context context) {
        super(context);
        this.k = new float[16];
        this.l = 0;
        this.m = false;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = 20;
        this.q = 0L;
        this.r = 0L;
        this.s = MetricXConfigBean.URL_EXP_LENGTH_LIMIT;
        this.t = true;
        this.u = false;
        this.v = new Object();
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.D = true;
        this.E = true;
        this.H = null;
        this.I = 0L;
        this.J = 0;
        this.K = 0;
        this.L = new LinkedList();
        setEGLContextClientVersion(2);
        a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    public TXCGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new float[16];
        this.l = 0;
        this.m = false;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = 20;
        this.q = 0L;
        this.r = 0L;
        this.s = MetricXConfigBean.URL_EXP_LENGTH_LIMIT;
        this.t = true;
        this.u = false;
        this.v = new Object();
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = null;
        this.B = 0;
        this.C = 0;
        this.D = true;
        this.E = true;
        this.H = null;
        this.I = 0L;
        this.J = 0;
        this.K = 0;
        this.L = new LinkedList();
        setEGLContextClientVersion(2);
        a(8, 8, 8, 8, 16, 0);
        setRenderer(this);
    }

    public void setFPS(final int i) {
        b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.p = i;
                if (TXCGLSurfaceView.this.p <= 0) {
                    TXCGLSurfaceView.this.p = 1;
                } else if (TXCGLSurfaceView.this.p > 60) {
                    TXCGLSurfaceView.this.p = 60;
                }
                TXCGLSurfaceView.this.r = 0L;
                TXCGLSurfaceView.this.q = 0L;
            }
        });
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void setRendMode(final int i) {
        b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.2
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.B = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void setRendMirror(final int i) {
        b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.3
            @Override // java.lang.Runnable
            public void run() {
                TXCGLSurfaceView.this.C = i;
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
            }
        });
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    protected void b() {
        TXCLog.i("TXCGLSurfaceView", "onSurfaceDestroyed-->enter with mSurfaceTextureListener:" + this.F);
        if (this.F != null) {
            this.F.onSurfaceTextureDestroy(this.g);
        }
        if (this.g != null) {
            this.g.release();
            this.g = null;
        }
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    protected void setRunInBackground(boolean z) {
        if (z) {
            synchronized (this) {
                TXCLog.i("TXCGLSurfaceView", "background capture enter background");
                this.c = true;
            }
            return;
        }
        b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    TXCLog.i("TXCGLSurfaceView", "background capture exit background");
                    TXCGLSurfaceView.this.c = false;
                }
            }
        });
    }

    public void setNotifyListener(com.tencent.liteav.basic.c.b bVar) {
        this.a = new WeakReference<>(bVar);
    }

    public void a(p pVar) {
        this.A = pVar;
        this.z = true;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(int i, boolean z, int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        if (this.i == null) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            int width = getWidth();
            int height = getHeight();
            if (this.B != 0 && this.B == 1) {
                int i7 = (720 - i2) % 360;
                boolean z3 = i7 == 90 || i7 == 270;
                int[] a = a(width, height, z3 ? i4 : i3, z3 ? i3 : i4);
                int i8 = a[0];
                int i9 = a[1];
                i5 = a[2];
                i6 = a[3];
                width = i8;
                height = i9;
            } else {
                i5 = 0;
                i6 = 0;
            }
            this.x = width;
            this.y = height;
            GLES20.glViewport(i5, i6, width, height);
            boolean z4 = (this.C != 1 ? !(this.C == 2 && z2) : z2) ? z : !z;
            float f = height != 0 ? width / height : 1.0f;
            float f2 = i4 != 0 ? i3 / i4 : 1.0f;
            if (this.m != z4 || this.l != i2 || this.n != f || this.o != f2 || this.D != z2) {
                this.m = z4;
                this.l = i2;
                this.n = f;
                this.o = f2;
                this.D = z2;
                int i10 = (720 - this.l) % 360;
                boolean z5 = i10 == 90 || i10 == 270;
                int i11 = z5 ? height : width;
                if (!z5) {
                    width = height;
                }
                this.i.a(i3, i4, i10, m.a(l.NORMAL, false, true), i11 / width, z5 ? false : this.m, z5 ? this.m : false);
                if (z5) {
                    this.i.g();
                } else {
                    this.i.h();
                }
            }
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            this.i.b(i);
            a(i5, i6);
        }
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(byte[] bArr) {
        synchronized (this) {
            this.H = bArr;
            this.t = false;
            this.u = true;
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

    @Override // com.tencent.liteav.basic.opengl.n
    public SurfaceTexture getSurfaceTexture() {
        return this.g;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(int i, boolean z) {
        this.p = i;
        if (this.p <= 0) {
            this.p = 1;
        } else if (this.p > 60) {
            this.p = 60;
        }
        this.A = null;
        this.z = false;
        this.J = 0;
        this.I = 0L;
        this.K = 0;
        c(true);
        this.E = z;
        this.G = 0L;
        g();
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a() {
        c(false);
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void setSurfaceTextureListener(o oVar) {
        this.F = oVar;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public EGLContext getGLContext() {
        return this.h;
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(Runnable runnable) {
        synchronized (this.L) {
            this.L.add(runnable);
        }
    }

    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase
    protected int c() {
        if (this.s != 12288) {
            TXCLog.e("TXCGLSurfaceView", "background capture swapbuffer error : " + this.s);
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.liteav.renderer.TXCGLSurfaceViewBase, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 21 || this.w == null) {
            return;
        }
        this.w.getLooper().quitSafely();
        this.w = null;
    }

    public void b(Runnable runnable) {
        synchronized (this.L) {
            this.L.add(runnable);
        }
    }

    private boolean a(Queue<Runnable> queue) {
        synchronized (queue) {
            if (queue.isEmpty()) {
                return false;
            }
            Runnable poll = queue.poll();
            if (poll == null) {
                return false;
            }
            poll.run();
            return true;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.h = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.j = new int[1];
        this.j[0] = TXCOpenGlUtils.b();
        if (this.j[0] <= 0) {
            this.j = null;
            TXCLog.e("TXCGLSurfaceView", "create oes texture error!! at glsurfaceview");
            return;
        }
        this.g = new SurfaceTexture(this.j[0]);
        g();
        this.i = new j();
        if (this.i.c()) {
            this.i.a(m.e, m.a(l.NORMAL, false, false));
            if (this.F != null) {
                this.F.onSurfaceTextureAvailable(this.g);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        long currentTimeMillis;
        boolean z;
        byte[] bArr;
        boolean z2;
        boolean z3;
        boolean z4;
        int e;
        a(this.L);
        boolean z5 = true;
        while (true) {
            currentTimeMillis = System.currentTimeMillis();
            if (this.r == 0 || currentTimeMillis < this.r) {
                this.r = currentTimeMillis;
            }
            if (currentTimeMillis - this.r >= (this.q * 1000) / this.p) {
                break;
            }
            a(15L);
            z5 = false;
        }
        if (currentTimeMillis - this.r > 1000) {
            this.q = 1L;
            this.r = System.currentTimeMillis();
            z = true;
        } else {
            z = false;
        }
        if (this.t) {
            return;
        }
        try {
            synchronized (this) {
                bArr = null;
                if (this.u) {
                    if (this.H != null) {
                        byte[] bArr2 = this.H;
                        this.H = null;
                        if (this.g != null) {
                            this.g.updateTexImage();
                            this.g.getTransformMatrix(this.k);
                        }
                        bArr = bArr2;
                    } else if (this.g != null) {
                        this.g.updateTexImage();
                        this.g.getTransformMatrix(this.k);
                    }
                    if (!z) {
                        this.q++;
                    } else {
                        this.q = 1L;
                    }
                    this.u = false;
                    z2 = false;
                    z3 = false;
                } else {
                    z3 = z5;
                    z2 = true;
                }
            }
            if (true == z2) {
                if (true == z3) {
                    a(5L);
                    return;
                }
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 > this.I + 1000.0d) {
                this.J = ((int) ((this.K * 1000.0d) / (currentTimeMillis2 - this.I))) + 1;
                this.I = currentTimeMillis2;
                this.K = 0;
            }
            this.K++;
            if (this.F != null) {
                if (bArr != null) {
                    this.F.onBufferProcess(bArr, this.k);
                } else {
                    this.F.onTextureProcess(this.j[0], this.k);
                }
            }
            synchronized (this) {
                z4 = !this.c;
            }
            if (!z4 || (e = e()) == 12288 || System.currentTimeMillis() - this.G <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                return;
            }
            TXCLog.w("TXCGLSurfaceView", "background capture swapBuffer error : " + e);
            this.G = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putInt("EVT_PARAM1", e);
            bundle.putInt(TXCAVRoomConstants.EVT_ID, 2110);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
            bundle.putCharSequence("EVT_MSG", "Failed to render video");
            com.tencent.liteav.basic.util.g.a(this.a, 2110, bundle);
        } catch (Exception e2) {
            TXCLog.e("TXCGLSurfaceView", "onDrawFrame failed", e2);
        }
    }

    private void a(int i, int i2) {
        if (this.z) {
            if (this.x != 0 && this.y != 0) {
                boolean z = this.x <= this.y;
                int i3 = this.y >= this.x ? this.y : this.x;
                int i4 = this.y >= this.x ? this.x : this.y;
                if (z) {
                    int i5 = i4;
                    i4 = i3;
                    i3 = i5;
                }
                final ByteBuffer allocate = ByteBuffer.allocate(i3 * i4 * 4);
                final Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                allocate.position(0);
                GLES20.glReadPixels(i, i2, i3, i4, 6408, 5121, allocate);
                final p pVar = this.A;
                if (pVar != null) {
                    final int i6 = i3;
                    final int i7 = i4;
                    new Thread(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Bitmap bitmap = null;
                            try {
                                allocate.position(0);
                                createBitmap.copyPixelsFromBuffer(allocate);
                                Matrix matrix = new Matrix();
                                matrix.setScale(1.0f, -1.0f);
                                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, i6, i7, matrix, false);
                            } catch (Error e) {
                                TXCLog.w("TXCGLSurfaceView", "takePhoto error " + e);
                            } catch (Exception e2) {
                                TXCLog.w("TXCGLSurfaceView", "takePhoto error " + e2);
                            }
                            pVar.onTakePhotoComplete(bitmap);
                            createBitmap.recycle();
                        }
                    }).start();
                }
            }
            this.A = null;
            this.z = false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.t = false;
        synchronized (this) {
            this.u = true;
        }
    }

    @Override // com.tencent.liteav.basic.opengl.n
    public void a(boolean z) {
        this.t = true;
        if (z) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            this.s = e();
        }
        synchronized (this) {
            if (this.u) {
                this.u = false;
                if (this.g != null) {
                    this.g.updateTexImage();
                }
            }
        }
    }

    public void b(final boolean z) {
        synchronized (this.v) {
            b(new Runnable() { // from class: com.tencent.liteav.renderer.TXCGLSurfaceView.6
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (TXCGLSurfaceView.this.v) {
                        TXCGLSurfaceView.this.a(z);
                        TXCGLSurfaceView.this.v.notifyAll();
                    }
                }
            });
            try {
                this.v.wait(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void a(long j) {
        try {
            Thread.sleep(j);
        } catch (Exception unused) {
        }
    }

    private void g() {
        if (this.E) {
            if (this.g != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.w == null) {
                        HandlerThread handlerThread = new HandlerThread("VideoCaptureThread");
                        handlerThread.start();
                        this.w = new Handler(handlerThread.getLooper());
                    }
                    this.g.setOnFrameAvailableListener(this, this.w);
                    return;
                }
                this.g.setOnFrameAvailableListener(this);
            }
        } else if (this.g != null) {
            this.g.setOnFrameAvailableListener(null);
        }
    }
}
