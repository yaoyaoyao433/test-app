package com.tencent.liteav.g;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.b;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class r {
    private o b;
    private m c;
    private q d;
    private com.tencent.liteav.editer.b e;
    private com.tencent.liteav.f.b f;
    private boolean g;
    private List<Surface> h;
    private c.b i;
    private final String a = "VideoJoinPreview";
    private c j = new c() { // from class: com.tencent.liteav.g.r.1
        @Override // com.tencent.liteav.g.c
        public void a(com.tencent.liteav.d.e eVar, i iVar) {
            if (r.this.b != null) {
                r.this.b.a(eVar, iVar);
            }
        }
    };
    private a k = new a() { // from class: com.tencent.liteav.g.r.2
        @Override // com.tencent.liteav.g.a
        public void a(com.tencent.liteav.d.e eVar, i iVar) {
            if (r.this.f != null) {
                r.this.f.a(eVar);
            }
        }
    };
    private d l = new d() { // from class: com.tencent.liteav.g.r.3
        @Override // com.tencent.liteav.g.d
        public void a(List<Surface> list) {
            TXCLog.i("VideoJoinPreview", "onSurfaceTextureAvailable, mStartPlay = " + r.this.g);
            r.this.h = list;
            if (r.this.d != null) {
                r.this.d.a();
                r.this.d.b();
                r.this.d.a(r.this.m);
            }
            if (r.this.g) {
                r.this.e();
            }
        }

        @Override // com.tencent.liteav.g.d
        public void a(int i, int i2) {
            if (r.this.d != null) {
                com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
                gVar.a = i;
                gVar.b = i2;
                r.this.d.a(gVar);
            }
        }

        @Override // com.tencent.liteav.g.d
        public void b(List<Surface> list) {
            TXCLog.i("VideoJoinPreview", "onSurfaceTextureDestroy");
            r.this.h = null;
            if (r.this.d != null) {
                r.this.d.c();
                r.this.d.d();
                r.this.d.a((com.tencent.liteav.editer.n) null);
            }
        }

        @Override // com.tencent.liteav.g.d
        public int a(int i, float[] fArr, com.tencent.liteav.d.e eVar) {
            if (eVar.p()) {
                r.this.f();
                return 0;
            }
            if (r.this.d != null) {
                r.this.d.a(fArr);
                r.this.d.a(i, eVar);
                r.this.a(eVar.e());
            }
            return 0;
        }
    };
    private com.tencent.liteav.editer.n m = new com.tencent.liteav.editer.n() { // from class: com.tencent.liteav.g.r.4
        @Override // com.tencent.liteav.editer.n
        public int b(int i, com.tencent.liteav.d.e eVar) {
            return i;
        }

        @Override // com.tencent.liteav.editer.n
        public void a(int i, com.tencent.liteav.d.e eVar) {
            if (r.this.b != null) {
                r.this.b.a(i, r.this.b.a(), r.this.b.b());
            }
        }
    };
    private com.tencent.liteav.editer.j n = new com.tencent.liteav.editer.j() { // from class: com.tencent.liteav.g.r.5
        @Override // com.tencent.liteav.editer.j
        public void a(com.tencent.liteav.d.e eVar) {
            if (eVar == null || eVar.b() == null) {
                return;
            }
            if (eVar.p()) {
                r.this.f();
                return;
            }
            if (r.this.e != null) {
                r.this.e.a(eVar);
            }
            if (r.this.f != null) {
                r.this.f.i();
            }
        }
    };
    private b.a o = new b.a() { // from class: com.tencent.liteav.g.r.6
        @Override // com.tencent.liteav.editer.b.a
        public void a(int i) {
            r.this.c.a(i <= 5);
        }
    };
    private Handler p = new Handler(Looper.getMainLooper());

    public r(Context context) {
        this.b = new o(context);
        this.b.a(this.l);
        this.d = new q(context);
        this.c = new m();
        this.e = new com.tencent.liteav.editer.b();
    }

    public void a(c.b bVar) {
        this.i = bVar;
    }

    public void a(a.g gVar) {
        this.b.a(gVar);
    }

    public void a() {
        this.g = true;
        TXCLog.i("VideoJoinPreview", "startPlay mStartPlay:" + this.g);
        if (this.h != null) {
            e();
        }
    }

    public void b() {
        this.g = false;
        TXCLog.i("VideoJoinPreview", "stopPlay mStartPlay false");
        if (this.c != null) {
            this.c.b();
            this.c.a((c) null);
            this.c.a((a) null);
        }
        if (this.f != null) {
            this.f.d();
            this.f.a((com.tencent.liteav.editer.j) null);
            this.f.b();
            this.f = null;
        }
        if (this.e != null) {
            this.e.a((b.a) null);
            this.e.d();
        }
        if (this.b != null) {
            this.b.d();
        }
    }

    public void c() {
        this.g = false;
        if (this.c != null) {
            this.c.c();
        }
        if (this.e != null) {
            this.e.a();
        }
    }

    public void d() {
        this.g = true;
        if (this.c != null) {
            this.c.d();
        }
        if (this.e != null) {
            this.e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        TXCLog.i("VideoJoinPreview", "startPlayInternal");
        com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
        gVar.a = this.b.a();
        gVar.b = this.b.b();
        this.d.a(gVar);
        this.f = new com.tencent.liteav.f.b("join");
        this.f.a();
        this.f.a(this.n);
        MediaFormat i = t.a().i();
        this.f.a(i);
        this.e.a(i);
        this.e.a(this.o);
        this.e.c();
        this.c.a(t.a().d());
        this.c.a(this.j);
        this.c.a(this.k);
        this.c.a();
        this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.p.post(new Runnable() { // from class: com.tencent.liteav.g.r.7
            @Override // java.lang.Runnable
            public void run() {
                if (r.this.i != null) {
                    r.this.i.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j) {
        this.p.post(new Runnable() { // from class: com.tencent.liteav.g.r.8
            @Override // java.lang.Runnable
            public void run() {
                if (r.this.i != null) {
                    r.this.i.a((int) j);
                }
            }
        });
    }
}
