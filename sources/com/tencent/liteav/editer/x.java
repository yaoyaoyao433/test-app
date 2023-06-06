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
public class x extends e {
    private b.e n;
    private b.a o;
    private Handler p;
    private v q;

    @Override // com.tencent.liteav.editer.e
    protected int a(int i, int i2, int i3, long j) {
        return i;
    }

    @Override // com.tencent.liteav.editer.e
    protected void a(long j) {
    }

    @Override // com.tencent.liteav.editer.e
    protected void f() {
    }

    @Override // com.tencent.liteav.editer.e
    protected void g() {
    }

    public x(Context context) {
        super(context, "avethumb");
        this.p = new Handler(Looper.getMainLooper());
        this.q = new v() { // from class: com.tencent.liteav.editer.x.1
            @Override // com.tencent.liteav.editer.v
            public void a(int i, long j, Bitmap bitmap) {
                if (x.this.c != null) {
                    x.this.c.p();
                }
                if (x.this.o != null) {
                    x.this.o.a(i, j / 1000, bitmap);
                }
                int c = com.tencent.liteav.c.h.a().c();
                if (c == 0) {
                    x.this.c();
                    if (x.this.n != null) {
                        x.this.i();
                        return;
                    }
                    return;
                }
                final float f = ((i + 1) * 1.0f) / c;
                TXCLog.i("VideoAverageThumbnailGenerate", "index:" + i + ",count= " + c + ",progress:" + f);
                x.this.p.post(new Runnable() { // from class: com.tencent.liteav.editer.x.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (f >= 1.0f) {
                            x.this.c();
                        }
                        if (x.this.n != null) {
                            x.this.n.a(f);
                            if (f >= 1.0f) {
                                x.this.i();
                                TXCLog.i("VideoAverageThumbnailGenerate", "===onProcessComplete===");
                            }
                        }
                    }
                });
            }
        };
        this.c = new ai("avethumb");
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
        TXCLog.i("VideoAverageThumbnailGenerate", "start");
        a(com.tencent.liteav.c.k.a().a);
        h();
        b();
        super.a();
    }

    @Override // com.tencent.liteav.editer.e
    protected void e() {
        TXCLog.i("VideoAverageThumbnailGenerate", "onGenerateComplete");
    }

    protected void h() {
        if (this.c != null) {
            com.tencent.liteav.c.h.a().a(this.c.c());
            this.c.a(com.tencent.liteav.c.h.a().b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        com.tencent.liteav.c.i.a().n = true;
        a.c cVar = new a.c();
        cVar.a = 0;
        cVar.b = "Generate Complete";
        this.n.a(cVar);
    }

    @Override // com.tencent.liteav.editer.e
    public void d() {
        TXCLog.i("VideoAverageThumbnailGenerate", "release");
        if (this.f != null) {
            this.f.a((v) null);
        }
        this.q = null;
        super.d();
    }

    public void c(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }
}
