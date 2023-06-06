package com.tencent.liteav.basic.opengl;

import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i extends com.tencent.liteav.basic.util.f {
    public int a;
    public int b;
    public Surface c;
    public boolean d;
    public c e;
    public EGLContext f;
    public b g;
    public javax.microedition.khronos.egl.EGLContext h;
    private a i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void c();

        void d();

        void e();
    }

    public static void a(final Handler handler, final HandlerThread handlerThread) {
        if (handler == null || handlerThread == null) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        message.obj = new Runnable() { // from class: com.tencent.liteav.basic.opengl.i.1
            @Override // java.lang.Runnable
            public final void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.basic.opengl.i.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
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
        };
        handler.sendMessage(message);
    }

    public i(Looper looper) {
        super(looper);
        this.a = 720;
        this.b = 1280;
        this.c = null;
        this.i = null;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    public javax.microedition.khronos.egl.EGLContext a() {
        if (this.g != null) {
            return this.g.d();
        }
        return null;
    }

    public Surface b() {
        return this.c;
    }

    public void c() {
        if (this.g != null) {
            this.g.a();
        }
        if (this.e != null) {
            this.e.e();
        }
    }

    public void d() {
        if (this.g != null) {
            this.g.b();
        }
        if (this.e != null) {
            this.e.b();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        switch (message.what) {
            case 100:
                a(message);
                break;
            case 101:
                b(message);
                break;
            case 102:
                c(message);
                break;
        }
        if (message == null || message.obj == null) {
            return;
        }
        ((Runnable) message.obj).run();
    }

    private void a(Message message) {
        try {
            e();
        } catch (Exception unused) {
            TXCLog.e("TXGLThreadHandler", "surface-render: init egl context exception " + this.c);
            this.c = null;
        }
    }

    private void b(Message message) {
        f();
    }

    private void c(Message message) {
        try {
            if (this.i != null) {
                this.i.d();
            }
        } catch (Exception e) {
            TXCLog.e("TXGLThreadHandler", "onMsgRend Exception " + e.getMessage());
        }
    }

    private boolean e() {
        TXCLog.i("TXGLThreadHandler", String.format("init egl size[%d/%d]", Integer.valueOf(this.a), Integer.valueOf(this.b)));
        if (!this.d) {
            this.g = b.a(null, this.h, this.c, this.a, this.b);
        } else {
            this.e = c.a(null, this.f, this.c, this.a, this.b);
        }
        if (this.g == null && this.e == null) {
            return false;
        }
        TXCLog.w("TXGLThreadHandler", "surface-render: create egl context " + this.c);
        if (this.i != null) {
            this.i.c();
        }
        return true;
    }

    private void f() {
        TXCLog.w("TXGLThreadHandler", "surface-render: destroy egl context " + this.c);
        if (this.i != null) {
            this.i.e();
        }
        if (this.g != null) {
            this.g.c();
            this.g = null;
        }
        if (this.e != null) {
            this.e.d();
            this.e = null;
        }
        this.c = null;
    }
}
