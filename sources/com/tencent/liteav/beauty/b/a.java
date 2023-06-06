package com.tencent.liteav.beauty.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private boolean a = false;

    public synchronized void a() {
        this.a = true;
        notify();
    }

    public synchronized void b() throws InterruptedException {
        while (!this.a) {
            wait();
        }
        this.a = false;
    }
}
