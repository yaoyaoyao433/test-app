package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    private Handler a;
    private Looper b;
    private boolean c;
    private Thread d;

    public h(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = true;
        handlerThread.start();
        this.b = handlerThread.getLooper();
        this.a = new Handler(this.b);
        this.d = handlerThread;
    }

    public Handler a() {
        return this.a;
    }

    protected void finalize() throws Throwable {
        if (this.c) {
            this.a.getLooper().quit();
        }
        super.finalize();
    }

    public void a(final Runnable runnable) {
        final boolean[] zArr = new boolean[1];
        if (Thread.currentThread().equals(this.d)) {
            runnable.run();
            return;
        }
        synchronized (this.a) {
            zArr[0] = false;
            this.a.post(new Runnable() { // from class: com.tencent.liteav.basic.util.h.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                    zArr[0] = true;
                    synchronized (h.this.a) {
                        h.this.a.notifyAll();
                    }
                }
            });
            while (!zArr[0]) {
                try {
                    this.a.wait();
                } catch (Exception unused) {
                }
            }
        }
    }

    public void b(Runnable runnable) {
        this.a.post(runnable);
    }

    public void a(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }
}
