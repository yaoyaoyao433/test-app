package com.tencent.liteav;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.screencapture.a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class l implements q, com.tencent.liteav.screencapture.b {
    private final com.tencent.liteav.screencapture.a a;
    private r b;
    private int e;
    private com.tencent.liteav.basic.util.e f;
    private int g;
    private int h;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private EGLContext c = null;
    private WeakReference<com.tencent.liteav.basic.c.b> d = null;
    private String i = "";
    private int j = 0;
    private final Queue<Runnable> o = new LinkedList();

    @Override // com.tencent.liteav.q
    public void a(float f) {
    }

    @Override // com.tencent.liteav.q
    public void a(float f, float f2) {
    }

    @Override // com.tencent.liteav.q
    public void a(int i, int i2) {
    }

    @Override // com.tencent.liteav.q
    public void a(com.tencent.liteav.basic.b.c cVar) {
    }

    @Override // com.tencent.liteav.q
    public void a(com.tencent.liteav.basic.structs.b bVar) {
    }

    @Override // com.tencent.liteav.q
    public boolean a(int i) {
        return false;
    }

    @Override // com.tencent.liteav.q
    public void b(int i) {
    }

    @Override // com.tencent.liteav.q
    public void c(int i) {
    }

    @Override // com.tencent.liteav.q
    public void c(boolean z) {
    }

    @Override // com.tencent.liteav.q
    public void d(int i) {
    }

    @Override // com.tencent.liteav.q
    public boolean d() {
        return true;
    }

    @Override // com.tencent.liteav.q
    public boolean d(boolean z) {
        return false;
    }

    @Override // com.tencent.liteav.q
    public int e() {
        return 0;
    }

    @Override // com.tencent.liteav.q
    public void e(int i) {
    }

    @Override // com.tencent.liteav.q
    public void e(boolean z) {
    }

    @Override // com.tencent.liteav.q
    public boolean h() {
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean i() {
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean j() {
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean k() {
        return false;
    }

    @Override // com.tencent.liteav.q
    public boolean l() {
        return false;
    }

    public l(Context context, i iVar, a.InterfaceC1461a interfaceC1461a) {
        this.a = new com.tencent.liteav.screencapture.a(context, iVar.V, interfaceC1461a);
        this.a.a((com.tencent.liteav.screencapture.b) this);
        iVar.a();
        this.f = c(iVar.a, iVar.b);
        this.e = iVar.h;
        this.g = iVar.a;
        this.h = iVar.b;
        TXCLog.i("TXCScreenCaptureSource", "capture size: %s, encode size: %dx%d", this.f, Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    private com.tencent.liteav.basic.util.e c(int i, int i2) {
        boolean z = i > i2;
        com.tencent.liteav.basic.util.e eVar = new com.tencent.liteav.basic.util.e();
        if (i > 1280 || i2 > 1280) {
            eVar.a = z ? Math.max(i, i2) : Math.min(i, i2);
            eVar.b = z ? Math.min(i, i2) : Math.max(i, i2);
        } else {
            eVar.a = z ? 1280 : 720;
            eVar.b = z ? 720 : 1280;
        }
        return eVar;
    }

    @Override // com.tencent.liteav.q
    public void a() {
        Monitor.a(2, String.format("VideoCapture[%d]: start screen", Integer.valueOf(hashCode())), "", 0);
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = true;
        this.a.a(this.f.a, this.f.b, this.e);
    }

    @Override // com.tencent.liteav.q
    public void a(boolean z) {
        Monitor.a(2, String.format("VideoCapture[%d]: stop screen", Integer.valueOf(hashCode())), "", 0);
        this.a.a((Object) null);
    }

    @Override // com.tencent.liteav.q
    public void a(String str) {
        this.i = str;
    }

    @Override // com.tencent.liteav.q
    public void c() {
        this.a.a(false);
    }

    @Override // com.tencent.liteav.q
    public void b() {
        this.a.a(true);
    }

    @Override // com.tencent.liteav.q
    public void b(boolean z) {
        com.tencent.liteav.basic.util.e c = c(this.g, this.h);
        if (c.equals(this.f)) {
            return;
        }
        this.f = c;
        this.a.a(c.a, c.b);
        TXCLog.i("TXCScreenCaptureSource", "capture size: %s, encode size: %dx%d", this.f, Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    @Override // com.tencent.liteav.q
    public EGLContext f() {
        return this.c;
    }

    @Override // com.tencent.liteav.q
    public void a(r rVar) {
        this.b = rVar;
    }

    @Override // com.tencent.liteav.q
    public void a(Runnable runnable) {
        if (this.a != null) {
            this.a.a(runnable);
        }
    }

    @Override // com.tencent.liteav.q
    public void a(com.tencent.liteav.basic.c.b bVar) {
        this.d = new WeakReference<>(bVar);
        if (this.a != null) {
            this.a.a(bVar);
        }
    }

    @Override // com.tencent.liteav.q
    public void b(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // com.tencent.liteav.q
    public void f(int i) {
        this.e = i;
        this.a.a(i);
    }

    @Override // com.tencent.liteav.q
    public int g() {
        return this.e;
    }

    @Override // com.tencent.liteav.q
    public void g(int i) {
        this.j = i;
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

    @Override // com.tencent.liteav.screencapture.b
    public void a(int i, EGLContext eGLContext, int i2, int i3, int i4, long j) {
        this.c = eGLContext;
        do {
        } while (a(this.o));
        if (i != 0) {
            TXCLog.e("TXCScreenCaptureSource", "onScreenCaptureFrame failed");
            return;
        }
        if (this.n) {
            this.n = false;
            Monitor.a(2, String.format("VideoCapture[%d]: capture first frame", Integer.valueOf(hashCode())), "", 0);
            com.tencent.liteav.basic.util.g.a(this.d, 1007, "First frame capture completed");
            TXCLog.i("TXCScreenCaptureSource", "on Got first frame");
        }
        this.k++;
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        if (currentTimeMillis >= TimeUnit.SECONDS.toMillis(1L)) {
            this.m = this.k;
            this.l = System.currentTimeMillis();
            TXCStatus.a(this.i, 1001, this.j, Double.valueOf(((this.k - this.m) * 1000.0d) / currentTimeMillis));
        }
        if (this.b != null) {
            f(i3 < i4);
            com.tencent.liteav.basic.structs.b bVar = new com.tencent.liteav.basic.structs.b();
            bVar.e = i3;
            bVar.f = i4;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.a = i2;
            bVar.b = 0;
            bVar.j = 0;
            bVar.l = com.tencent.liteav.basic.util.g.a(bVar.e, bVar.f, this.g, this.h);
            this.b.b(bVar);
        }
    }

    @Override // com.tencent.liteav.screencapture.b
    public void a(Object obj) {
        do {
        } while (a(this.o));
        if (this.b != null) {
            this.b.t();
        }
    }

    private void f(boolean z) {
        if (z) {
            if (this.g > this.h) {
                b(this.h, this.g);
            }
        } else if (this.g < this.h) {
            b(this.h, this.g);
        }
    }
}
