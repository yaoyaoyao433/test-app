package com.tencent.liteav.screencapture;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.k;
import com.tencent.liteav.basic.opengl.l;
import com.tencent.liteav.basic.opengl.m;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.basic.util.f;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.screencapture.c;
import java.lang.ref.WeakReference;
import java.util.Locale;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private final boolean j;
    private final Context k;
    private WeakReference<InterfaceC1461a> p;
    protected volatile HandlerThread b = null;
    protected volatile b c = null;
    protected volatile WeakReference<com.tencent.liteav.screencapture.b> d = null;
    protected volatile int e = 0;
    protected int f = 720;
    protected int g = 1280;
    protected int h = 20;
    protected boolean i = true;
    private Object l = null;
    private int m = this.f;
    private int n = this.g;
    private WeakReference<com.tencent.liteav.basic.c.b> o = null;
    private c.b q = new c.b() { // from class: com.tencent.liteav.screencapture.a.1
        @Override // com.tencent.liteav.screencapture.c.b
        public void a(boolean z, boolean z2) {
            if (!z) {
                a.this.p = null;
                g.a(a.this.o, -1308, "Failed to share screen");
                return;
            }
            a.this.b(106);
        }

        @Override // com.tencent.liteav.screencapture.c.b
        public void a() {
            g.a(a.this.o, (int) TXLiteAVCode.ERR_SCREEN_CAPTURE_STOPPED, "Screen recording stopped. It may be preempted by other apps");
            InterfaceC1461a d = a.this.d();
            a.this.p = null;
            if (d != null) {
                d.onScreenCaptureStopped(1);
            }
        }

        @Override // com.tencent.liteav.screencapture.c.b
        public void a(boolean z) {
            if (a.this.j) {
                a.this.b(z);
                a.this.b(105, a.this.m, a.this.n);
            }
        }
    };
    protected final Handler a = new Handler(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.screencapture.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1461a {
        void onScreenCapturePaused();

        void onScreenCaptureResumed();

        void onScreenCaptureStarted();

        void onScreenCaptureStopped(int i);
    }

    public a(Context context, boolean z, InterfaceC1461a interfaceC1461a) {
        this.p = new WeakReference<>(interfaceC1461a);
        this.k = context.getApplicationContext();
        this.j = z;
    }

    public int a(int i, int i2, int i3) {
        this.h = i3;
        if (Build.VERSION.SDK_INT < 21) {
            c(20000004);
            return 20000004;
        }
        c(i, i2);
        a();
        TXCLog.i("TXCScreenCapture", "start screen capture");
        return 0;
    }

    public void a(Object obj) {
        TXCLog.i("TXCScreenCapture", "stop encode: " + obj);
        this.l = obj;
        b();
    }

    public void a(final boolean z) {
        synchronized (this) {
            Runnable runnable = new Runnable() { // from class: com.tencent.liteav.screencapture.a.2
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC1461a d = a.this.d();
                    if (a.this.i != z && d != null) {
                        if (z) {
                            d.onScreenCaptureResumed();
                        } else {
                            d.onScreenCapturePaused();
                        }
                    }
                    a.this.i = z;
                }
            };
            if (this.c != null) {
                this.c.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void a(com.tencent.liteav.screencapture.b bVar) {
        this.d = new WeakReference<>(bVar);
    }

    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.o = new WeakReference<>(bVar);
    }

    public void a(int i) {
        this.h = i;
        b(103, i);
    }

    public void a(int i, int i2) {
        c(i, i2);
        b(105, i, i2);
    }

    private void c(int i, int i2) {
        if (this.j) {
            int rotation = ((WindowManager) this.k.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation == 0 || rotation == 2) {
                if (i > i2) {
                    this.f = i2;
                    this.g = i;
                } else {
                    this.f = i;
                    this.g = i2;
                }
            } else if (i < i2) {
                this.f = i2;
                this.g = i;
            } else {
                this.f = i;
                this.g = i2;
            }
        } else {
            this.f = i;
            this.g = i2;
        }
        this.m = this.f;
        this.n = this.g;
    }

    public synchronized void a(Runnable runnable) {
        if (this.c != null) {
            this.c.post(runnable);
        }
    }

    protected void a() {
        b();
        synchronized (this) {
            this.b = new HandlerThread("ScreenCaptureGLThread");
            this.b.start();
            this.c = new b(this.b.getLooper(), this);
            int i = 1;
            this.e++;
            this.c.a = this.e;
            this.c.e = this.m;
            this.c.f = this.n;
            b bVar = this.c;
            if (this.h > 0) {
                i = this.h;
            }
            bVar.g = i;
        }
        b(100);
    }

    protected void b() {
        synchronized (this) {
            this.e++;
            if (this.c != null) {
                final HandlerThread handlerThread = this.b;
                final b bVar = this.c;
                a(101, new Runnable() { // from class: com.tencent.liteav.screencapture.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a.post(new Runnable() { // from class: com.tencent.liteav.screencapture.a.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (bVar != null) {
                                    bVar.removeCallbacksAndMessages(null);
                                }
                                if (handlerThread != null) {
                                    if (Build.VERSION.SDK_INT >= 18) {
                                        handlerThread.quitSafely();
                                    } else {
                                        handlerThread.quit();
                                    }
                                }
                            }
                        });
                    }
                });
            }
            this.c = null;
            this.b = null;
        }
    }

    protected com.tencent.liteav.screencapture.b c() {
        if (this.d == null) {
            return null;
        }
        return this.d.get();
    }

    protected void a(int i, long j) {
        synchronized (this) {
            if (this.c != null) {
                this.c.sendEmptyMessageDelayed(i, j);
            }
        }
    }

    protected void b(int i) {
        synchronized (this) {
            if (this.c != null) {
                this.c.sendEmptyMessage(i);
            }
        }
    }

    protected void b(int i, int i2) {
        synchronized (this) {
            if (this.c != null) {
                Message message = new Message();
                message.what = i;
                message.arg1 = i2;
                this.c.sendMessage(message);
            }
        }
    }

    protected void b(int i, int i2, int i3) {
        synchronized (this) {
            if (this.c != null) {
                Message message = new Message();
                message.what = i;
                message.arg1 = i2;
                message.arg2 = i3;
                this.c.sendMessage(message);
            }
        }
    }

    protected void a(int i, Runnable runnable) {
        synchronized (this) {
            if (this.c != null) {
                Message message = new Message();
                message.what = i;
                message.obj = runnable;
                this.c.sendMessage(message);
            }
        }
    }

    protected void c(int i) {
        InterfaceC1461a d = d();
        if (d == null || i != 0) {
            return;
        }
        d.onScreenCaptureStarted();
    }

    protected void a(int i, EGLContext eGLContext, int i2, int i3, int i4, long j) {
        com.tencent.liteav.screencapture.b c = c();
        if (c != null) {
            c.a(i, eGLContext, i2, i3, i4, j);
        }
    }

    protected void b(boolean z) {
        if (z) {
            this.m = this.f < this.g ? this.f : this.g;
            this.n = this.f < this.g ? this.g : this.f;
        } else {
            this.m = this.f < this.g ? this.g : this.f;
            this.n = this.f < this.g ? this.f : this.g;
        }
        TXCLog.i("TXCScreenCapture", String.format(Locale.ENGLISH, "reset screen capture isPortrait[%b] output size[%d/%d]", Boolean.valueOf(z), Integer.valueOf(this.m), Integer.valueOf(this.n)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1461a d() {
        WeakReference<InterfaceC1461a> weakReference = this.p;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends Handler {
        public int a;
        public int[] b;
        public Surface c;
        public SurfaceTexture d;
        public int e;
        public int f;
        public int g;
        protected boolean h;
        protected long i;
        protected long j;
        protected com.tencent.liteav.basic.opengl.b k;
        protected k l;
        float[] m;
        private boolean o;

        public b(Looper looper, a aVar) {
            super(looper);
            this.a = 0;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 720;
            this.f = 1280;
            this.g = 25;
            this.h = false;
            this.i = 0L;
            this.j = 0L;
            this.k = null;
            this.l = null;
            this.m = new float[16];
            this.o = true;
            TXCLog.i("TXCScreenCapture", "TXCScreenCaptureGLThreadHandler inited. hashCode: %d", Integer.valueOf(hashCode()));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            if (this.a == a.this.e || 101 == message.what) {
                switch (message.what) {
                    case 100:
                        a(message);
                        break;
                    case 101:
                        b(message);
                        break;
                    case 102:
                        try {
                            c(message);
                            break;
                        } catch (Exception e) {
                            TXCLog.e("TXCScreenCapture", "render failed.", e);
                            break;
                        }
                    case 103:
                        d(message);
                        break;
                    case 105:
                        e(message);
                        break;
                    case 106:
                        a();
                        break;
                }
                if (message == null || message.obj == null) {
                    return;
                }
                ((Runnable) message.obj).run();
            }
        }

        protected void a(Message message) {
            this.i = 0L;
            this.j = 0L;
            if (b()) {
                return;
            }
            c();
            a.this.b();
            a.this.c(20000003);
        }

        protected void a() {
            if (this.o && this.k != null) {
                Bundle bundle = new Bundle();
                bundle.putString("EVT_MSG", "Screen recording started successfully");
                g.a(a.this.o, 1004, bundle);
                a.this.c(0);
            }
            this.o = false;
        }

        protected void b(Message message) {
            a.this.i = false;
            InterfaceC1461a d = a.this.d();
            if (d != null) {
                d.onScreenCaptureStopped(0);
            }
            com.tencent.liteav.screencapture.b c = a.this.c();
            if (c != null) {
                c.a(a.this.l);
            }
            c();
        }

        protected void c(Message message) {
            a.this.a(102, 5L);
            if (a.this.i) {
                if (this.k == null) {
                    TXCLog.e("TXCScreenCapture", "eglhelper is null");
                } else if (!this.h) {
                    this.i = 0L;
                    this.j = System.nanoTime();
                } else {
                    long nanoTime = System.nanoTime();
                    if (nanoTime < this.j + ((((this.i * 1000) * 1000) * 1000) / this.g)) {
                        return;
                    }
                    if (this.j == 0) {
                        this.j = nanoTime;
                    } else if (nanoTime > this.j + 1000000000) {
                        this.i = 0L;
                        this.j = nanoTime;
                    }
                    this.i++;
                    if (this.d == null || this.b == null) {
                        return;
                    }
                    this.d.getTransformMatrix(this.m);
                    try {
                        this.d.updateTexImage();
                    } catch (Exception e) {
                        TXCLog.e("TXCScreenCapture", "onMsgRend Exception " + e.getMessage());
                    }
                    this.l.a(this.m);
                    GLES20.glViewport(0, 0, this.e, this.f);
                    a.this.a(0, this.k.d(), this.l.a(this.b[0]), this.e, this.f, TXCTimeUtil.getTimeTick());
                }
            }
        }

        protected void d(Message message) {
            if (message == null) {
                return;
            }
            this.g = message.arg1 <= 0 ? 1 : message.arg1;
            this.i = 0L;
            this.j = 0L;
        }

        protected void e(Message message) {
            if (message == null) {
                return;
            }
            this.e = message.arg1;
            this.f = message.arg2;
            d();
            this.l.a(this.e, this.f);
            e();
            TXCLog.i("TXCScreenCapture", String.format("set screen capture size[%d/%d]", Integer.valueOf(a.this.m), Integer.valueOf(a.this.n)));
        }

        protected boolean b() {
            TXCLog.i("TXCScreenCapture", String.format("init egl size[%d/%d]", Integer.valueOf(this.e), Integer.valueOf(this.f)));
            this.k = com.tencent.liteav.basic.opengl.b.a(null, null, null, this.e, this.f);
            if (this.k == null) {
                return false;
            }
            this.l = new k();
            if (this.l.c()) {
                this.l.a(true);
                this.l.a(this.e, this.f);
                this.l.a(m.e, m.a(l.NORMAL, false, false));
                e();
                return true;
            }
            return false;
        }

        protected void c() {
            d();
            if (this.l != null) {
                this.l.e();
                this.l = null;
            }
            if (this.k != null) {
                this.k.c();
                this.k = null;
            }
        }

        protected void d() {
            new f(Looper.getMainLooper()).a(new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    c.a(a.this.k).a(b.this.c);
                }
            });
            if (this.c != null) {
                this.c.release();
                this.c = null;
            }
            if (this.d != null) {
                this.d.setOnFrameAvailableListener(null);
                this.d.release();
                this.h = false;
                this.d = null;
            }
            if (this.b != null) {
                GLES20.glDeleteTextures(1, this.b, 0);
                this.b = null;
            }
        }

        protected void e() {
            this.b = new int[1];
            this.b[0] = TXCOpenGlUtils.b();
            if (this.b[0] <= 0) {
                this.b = null;
                return;
            }
            this.d = new SurfaceTexture(this.b[0]);
            this.c = new Surface(this.d);
            this.d.setDefaultBufferSize(this.e, this.f);
            this.d.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.tencent.liteav.screencapture.a.b.2
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    a.this.a(104, new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.h = true;
                            a.this.b(102);
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(null);
                }
            });
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.screencapture.a.b.3
                @Override // java.lang.Runnable
                public void run() {
                    c.a(a.this.k).a(b.this.c, b.this.e, b.this.f, a.this.q);
                }
            });
        }
    }
}
