package com.tencent.liteav.editer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ab extends e {
    private b.c n;
    private b.InterfaceC1456b o;
    private Handler p;

    public ab(Context context) {
        super(context, "gene");
        this.p = new Handler(Looper.getMainLooper());
    }

    public void a(b.c cVar) {
        this.n = cVar;
    }

    public void a(b.InterfaceC1456b interfaceC1456b) {
        this.o = interfaceC1456b;
    }

    @Override // com.tencent.liteav.editer.e
    public void a() {
        TXCLog.i("VideoEditGenerate", "start");
        if (com.tencent.liteav.c.k.a().d() == 1) {
            a(com.tencent.liteav.c.k.a().a);
            if (com.tencent.liteav.c.k.a().e() != 0) {
                if (this.n != null) {
                    a.c cVar = new a.c();
                    cVar.a = 0;
                    cVar.b = "Generate Fail,Cause: Video Source Path illegal : " + com.tencent.liteav.c.k.a().a;
                    TXCLog.i("VideoEditGenerate", "onGenerateComplete");
                    this.n.a(cVar);
                    return;
                }
                return;
            }
        } else if (com.tencent.liteav.c.k.a().d() == 2) {
            a(com.tencent.liteav.c.k.a().b(), com.tencent.liteav.c.k.a().c());
        }
        if (this.l.b()) {
            return;
        }
        this.l.g();
        b();
        this.h = new com.tencent.liteav.e.a(2, false);
        this.i = new com.tencent.liteav.muxer.c(this.a, 0);
        this.i.a(this.l.i);
        this.k.a(this.m);
        super.a();
    }

    @Override // com.tencent.liteav.editer.e
    public void c() {
        TXCLog.i("VideoEditGenerate", "stop");
        super.c();
        this.k.a((w) null);
    }

    @Override // com.tencent.liteav.editer.e
    protected void e() {
        TXCLog.i("VideoEditGenerate", "onGenerateComplete");
        if (this.k != null) {
            this.k.i();
        }
        this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ab.1
            @Override // java.lang.Runnable
            public void run() {
                if (ab.this.n != null) {
                    a.c cVar = new a.c();
                    cVar.a = 0;
                    cVar.b = "Generate Complete";
                    TXCLog.i("VideoEditGenerate", "===onGenerateComplete===");
                    ab.this.n.a(cVar);
                }
            }
        });
    }

    @Override // com.tencent.liteav.editer.e
    protected void a(final long j) {
        this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ab.2
            @Override // java.lang.Runnable
            public void run() {
                if (ab.this.n != null) {
                    long j2 = ab.this.l.k;
                    if (j2 > 0) {
                        float f = (((float) (j - (com.tencent.liteav.c.g.a().b() ? 0L : com.tencent.liteav.c.c.a().f()))) * 1.0f) / ((float) j2);
                        TXCLog.d("VideoEditGenerate", "onGenerateProgress timestamp:" + j + ",progress:" + f + ",duration:" + j2);
                        ab.this.n.a(f);
                    }
                }
            }
        });
    }

    @Override // com.tencent.liteav.editer.e
    protected int a(int i, int i2, int i3, long j) {
        return this.o != null ? this.o.a(i, i2, i3, j) : i;
    }

    @Override // com.tencent.liteav.editer.e
    protected void f() {
        if (this.o != null) {
            this.o.a();
        }
    }

    @Override // com.tencent.liteav.editer.e
    protected void g() {
        this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.ab.3
            @Override // java.lang.Runnable
            public void run() {
                if (ab.this.n != null) {
                    a.c cVar = new a.c();
                    cVar.a = -1;
                    cVar.b = "Generate Fail: decode video frame fail.";
                    TXCLog.e("VideoEditGenerate", "===onDecoderError===");
                    ab.this.n.a(cVar);
                }
            }
        });
    }
}
