package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public final class p {
    Handler a;
    volatile boolean b;
    int c;
    volatile b d;
    private a e;
    private final boolean f;

    /* loaded from: classes6.dex */
    public static abstract class b {
        public abstract void a();

        public void b() {
        }
    }

    public p() {
        this(false);
    }

    public p(boolean z) {
        this(z, 0);
    }

    public p(boolean z, int i) {
        this.a = null;
        this.b = false;
        this.c = 0;
        this.a = new q(this, Looper.getMainLooper());
        this.f = z;
        this.c = i;
    }

    synchronized void a() {
        this.e = null;
        this.b = true;
    }

    public final void a(b bVar, long j) {
        this.a.postDelayed(new r(this, bVar), j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends Thread {
        final LinkedBlockingQueue<b> a;

        public a() {
            super("PackageProcessor");
            this.a = new LinkedBlockingQueue<>();
        }

        private void a(int i, b bVar) {
            try {
                p.this.a.sendMessage(p.this.a.obtainMessage(i, bVar));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j = p.this.c > 0 ? p.this.c : Long.MAX_VALUE;
            while (!p.this.b) {
                try {
                    b poll = this.a.poll(j, TimeUnit.SECONDS);
                    p.this.d = poll;
                    if (poll != null) {
                        a(0, poll);
                        poll.a();
                        a(1, poll);
                    } else if (p.this.c > 0) {
                        p.this.a();
                    }
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                }
            }
        }
    }

    public final synchronized void a(b bVar) {
        if (this.e == null) {
            this.e = new a();
            this.e.setDaemon(this.f);
            this.b = false;
            this.e.start();
        }
        try {
            this.e.a.add(bVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
