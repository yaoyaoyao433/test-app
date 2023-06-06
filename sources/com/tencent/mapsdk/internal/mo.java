package com.tencent.mapsdk.internal;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mo extends Thread {
    private static final int c = 80;
    private mn d;
    private volatile boolean e = false;
    public volatile boolean a = false;
    public volatile boolean b = false;

    public mo(mn mnVar) {
        setName("tms-texture");
        this.d = mnVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!this.e) {
            boolean z = false;
            if (!this.a && this.d != null) {
                mn mnVar = this.d;
                if (mnVar.g != null) {
                    sh shVar = mnVar.g;
                    if (shVar.e != 0) {
                        if (System.currentTimeMillis() - shVar.k > 560) {
                            shVar.d.nativeClearDownloadURLCache(shVar.e);
                            shVar.k = System.currentTimeMillis();
                        }
                        z = shVar.d.nativeGenerateTextures(shVar.e);
                    }
                }
            }
            if (!z) {
                try {
                    synchronized (this) {
                        wait(80L);
                    }
                } catch (InterruptedException e) {
                    kj.a(Log.getStackTraceString(e));
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.b = true;
    }

    public final void a() {
        this.a = false;
        this.e = true;
        synchronized (this) {
            notifyAll();
        }
    }

    private void b() {
        this.a = true;
    }

    private void c() {
        this.a = false;
        synchronized (this) {
            notifyAll();
        }
    }

    private boolean d() {
        if (this.d != null) {
            mn mnVar = this.d;
            if (mnVar.g == null) {
                return false;
            }
            sh shVar = mnVar.g;
            if (shVar.e == 0) {
                return false;
            }
            if (System.currentTimeMillis() - shVar.k > 560) {
                shVar.d.nativeClearDownloadURLCache(shVar.e);
                shVar.k = System.currentTimeMillis();
            }
            return shVar.d.nativeGenerateTextures(shVar.e);
        }
        return false;
    }

    private boolean e() {
        return this.b;
    }
}
