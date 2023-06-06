package com.tencent.liteav.beauty.b;

import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ah {
    private static final String b = "ah";
    SurfaceTexture.OnFrameAvailableListener a;
    private SurfaceTexture c;
    private MediaExtractor f;
    private AssetFileDescriptor g;
    private long l;
    private MediaCodec m;
    private boolean o;
    private Handler p;
    private int d = -1;
    private boolean e = false;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int k = -1;
    private boolean n = false;
    private Object q = new Object();

    ah() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        synchronized (this.q) {
            if (this.p != null) {
                if (Looper.myLooper() == this.p.getLooper()) {
                    c();
                } else {
                    Runnable runnable = new Runnable() { // from class: com.tencent.liteav.beauty.b.ah.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (ah.this.q) {
                                ah.this.c();
                                ah.this.q.notify();
                            }
                        }
                    };
                    this.p.removeCallbacksAndMessages(null);
                    this.p.post(runnable);
                    this.p.getLooper().quitSafely();
                    while (true) {
                        try {
                            this.q.wait();
                            break;
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    private void b() {
        if (this.e) {
            this.e = false;
            if (this.f != null) {
                this.f.release();
                this.f = null;
            }
            try {
                try {
                    this.m.stop();
                    try {
                        try {
                            this.m.release();
                        } finally {
                        }
                    } catch (Exception e) {
                        String str = b;
                        TXCLog.e(str, "release decoder exception: " + e.toString());
                    }
                } catch (Exception e2) {
                    String str2 = b;
                    TXCLog.e(str2, "stop decoder Exception: " + e2.toString());
                    try {
                        try {
                            this.m.release();
                        } catch (Exception e3) {
                            String str3 = b;
                            TXCLog.e(str3, "release decoder exception: " + e3.toString());
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        this.m.release();
                    } catch (Exception e4) {
                        String str4 = b;
                        TXCLog.e(str4, "release decoder exception: " + e4.toString());
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        this.a = null;
        this.l = 0L;
        this.o = false;
        if (this.c != null) {
            this.c.release();
            this.c = null;
        }
        synchronized (this.q) {
            if (this.p != null) {
                this.p.removeCallbacksAndMessages(null);
                this.p.getLooper().quit();
                this.p = null;
                this.q.notify();
            }
        }
        if (this.g != null) {
            try {
                this.g.close();
            } catch (Exception unused) {
            }
            this.g = null;
        }
    }
}
