package com.tencent.liteav.editer;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ag extends e {
    private b.e n;
    private b.a o;
    private Handler p;
    private v q;

    @Override // com.tencent.liteav.editer.e
    protected int a(int i, int i2, int i3, long j) {
        return i;
    }

    @Override // com.tencent.liteav.editer.e
    protected void f() {
    }

    public ag(Context context, String str) {
        super(context, str);
        this.p = new Handler(Looper.getMainLooper());
        this.q = new v() { // from class: com.tencent.liteav.editer.ag.3
            @Override // com.tencent.liteav.editer.v
            public void a(int i, long j, Bitmap bitmap) {
                if (ag.this.o != null) {
                    ag.this.o.a(i, j / 1000, bitmap);
                }
                if (com.tencent.liteav.c.i.a().r) {
                    int c = com.tencent.liteav.c.h.a().c();
                    if (c == 0) {
                        ag.this.c();
                        if (ag.this.n != null) {
                            ag.this.i();
                            return;
                        }
                        return;
                    }
                    final float f = ((i + 1) * 1.0f) / c;
                    TXCLog.i("VideoProcessGenerate", "index:" + i + ",count= " + c + ",progress:" + f);
                    ag.this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ag.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ag.this.n != null) {
                                ag.this.n.a(f);
                                if (f >= 1.0f) {
                                    ag.this.i();
                                    ag.this.c();
                                }
                            }
                        }
                    });
                }
            }
        };
        this.c = new y(str);
        this.f.a(this.q);
    }

    public void a(b.e eVar) {
        this.n = eVar;
    }

    public void a(b.a aVar) {
        this.o = aVar;
    }

    @Override // com.tencent.liteav.editer.e
    public void a() {
        a(com.tencent.liteav.c.k.a().a);
        h();
        b();
        com.tencent.liteav.basic.d.c.a().a(this.a);
        this.b = com.tencent.liteav.basic.d.c.a().g();
        this.h = new com.tencent.liteav.e.a(2, this.b);
        this.i = new com.tencent.liteav.muxer.c(this.a, 0);
        if (!this.l.r) {
            this.l.f();
            this.i.a(this.l.o);
        }
        super.a();
    }

    @Override // com.tencent.liteav.editer.e
    protected void e() {
        com.tencent.liteav.c.k.a().a = com.tencent.liteav.c.i.a().o;
        com.tencent.liteav.c.j.a().a(0);
        this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ag.1
            @Override // java.lang.Runnable
            public void run() {
                if (ag.this.n != null) {
                    a.c cVar = new a.c();
                    cVar.a = 0;
                    cVar.b = "Generate Complete";
                    ag.this.n.a(cVar);
                }
            }
        });
    }

    @Override // com.tencent.liteav.editer.e
    protected void a(final long j) {
        this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ag.2
            @Override // java.lang.Runnable
            public void run() {
                if (ag.this.n != null) {
                    long j2 = ag.this.l.k;
                    if (j2 > 0) {
                        ag.this.n.a((((float) (j - com.tencent.liteav.c.c.a().f())) * 1.0f) / ((float) j2));
                    }
                }
            }
        });
    }

    protected void h() {
        long g = com.tencent.liteav.c.c.a().g() - com.tencent.liteav.c.c.a().f();
        if (g <= 0) {
            g = this.c.c();
        }
        com.tencent.liteav.c.h.a().a(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        a.c cVar = new a.c();
        cVar.a = 0;
        cVar.b = "Generate Complete";
        this.n.a(cVar);
        TXCLog.i("VideoProcessGenerate", "===onProcessComplete===");
    }

    @Override // com.tencent.liteav.editer.e
    protected void g() {
        this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ag.4
            @Override // java.lang.Runnable
            public void run() {
                if (ag.this.n != null) {
                    a.c cVar = new a.c();
                    cVar.a = -1;
                    cVar.b = "Generate Fail: decode video frame fail.";
                    TXCLog.e("VideoProcessGenerate", "===onDecoderError===");
                    ag.this.n.a(cVar);
                }
            }
        });
    }

    @Override // com.tencent.liteav.editer.e
    public void d() {
        super.d();
        this.q = null;
    }
}
