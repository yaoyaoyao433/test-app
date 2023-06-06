package com.tencent.liteav.editer;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.b;
import com.tencent.liteav.i.a;
import com.tencent.liteav.i.b;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ac {
    private Context b;
    private aa c;
    private ae d;
    private b e;
    private com.tencent.liteav.c.k f;
    private com.tencent.liteav.c.i g;
    private com.tencent.liteav.f.k h;
    private com.tencent.liteav.f.b i;
    private Surface j;
    private boolean k;
    private b.d l;
    private b.InterfaceC1456b m;
    private s n;
    private f o;
    private final String a = "VideoEditerPreview";
    private o p = new o() { // from class: com.tencent.liteav.editer.ac.1
        @Override // com.tencent.liteav.editer.o
        public void a(Surface surface) {
            TXCLog.i("VideoEditerPreview", "onSurfaceTextureAvailable surface:" + surface + ", mNeedPlay = " + ac.this.k);
            if (ac.this.h != null) {
                ac.this.h.a();
                ac.this.h.b();
                ac.this.h.a(ac.this.q);
            }
            synchronized (ac.this) {
                ac.this.j = surface;
                if (ac.this.k) {
                    ac.this.h();
                }
            }
        }

        @Override // com.tencent.liteav.editer.o
        public void a(int i, int i2) {
            if (ac.this.h != null) {
                com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
                gVar.a = i;
                gVar.b = i2;
                ac.this.h.a(gVar);
            }
        }

        @Override // com.tencent.liteav.editer.o
        public void b(Surface surface) {
            TXCLog.i("VideoEditerPreview", "onSurfaceTextureDestroy surface:" + surface);
            synchronized (ac.this) {
                if (ac.this.j == surface) {
                    ac.this.j = null;
                }
            }
            if (ac.this.h != null) {
                ac.this.h.c();
                ac.this.h.d();
                ac.this.h.a((n) null);
            }
            if (ac.this.o != null) {
                ac.this.o.a();
            }
        }

        @Override // com.tencent.liteav.editer.o
        public int a(int i, float[] fArr, com.tencent.liteav.d.e eVar) {
            if (eVar.p()) {
                ac.this.j();
                return 0;
            }
            if (ac.this.o != null) {
                i = ac.this.o.a(eVar, com.tencent.liteav.c.e.a().b(), false);
                eVar.l(i);
                eVar.m(0);
            }
            if (ac.this.h != null) {
                ac.this.h.a(fArr);
                ac.this.h.a(i, eVar);
                ac.this.c(eVar.e());
            }
            return 0;
        }

        @Override // com.tencent.liteav.editer.o
        public void a(int i) {
            if (ac.this.h != null) {
                ac.this.h.a(i);
            }
        }
    };
    private n q = new n() { // from class: com.tencent.liteav.editer.ac.2
        @Override // com.tencent.liteav.editer.n
        public void a(int i, com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.c();
            if (ac.this.d != null) {
                ac.this.d.a(i, ac.this.d.a(), ac.this.d.b());
            }
        }

        @Override // com.tencent.liteav.editer.n
        public int b(int i, com.tencent.liteav.d.e eVar) {
            return ac.this.a(i, eVar.m(), eVar.n(), eVar.e());
        }
    };
    private j r = new j() { // from class: com.tencent.liteav.editer.ac.3
        @Override // com.tencent.liteav.editer.j
        public void a(com.tencent.liteav.d.e eVar) {
            if (eVar == null || eVar.b() == null) {
                return;
            }
            com.tencent.liteav.j.b.d();
            if (!eVar.p() || ((com.tencent.liteav.c.k.a().d() != 2 || !ac.this.n.c()) && (com.tencent.liteav.c.k.a().d() != 1 || !ac.this.c.q()))) {
                if (ac.this.e != null) {
                    ac.this.e.a(eVar);
                }
                synchronized (ac.this) {
                    if (ac.this.i != null) {
                        ac.this.i.i();
                    }
                }
                return;
            }
            ac.this.j();
        }
    };
    private m s = new m() { // from class: com.tencent.liteav.editer.ac.4
        @Override // com.tencent.liteav.editer.m
        public void a(com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.a();
            if (ac.this.d != null) {
                ac.this.d.a(eVar);
            }
        }

        @Override // com.tencent.liteav.editer.m
        public void a(final String str) {
            ac.this.v.post(new Runnable() { // from class: com.tencent.liteav.editer.ac.4.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCLog.e("VideoEditerPreview", "onDecodeVideoError ->  msg = " + str);
                    a.f fVar = new a.f();
                    fVar.a = -1;
                    fVar.b = "decode video frame fail.";
                    if (ac.this.l != null) {
                        ac.this.l.a(fVar);
                    }
                    TXCLog.e("VideoEditerPreview", "onDecodeVideoError -> onPreviewError: decode video fail.");
                }
            });
        }
    };
    private h t = new h() { // from class: com.tencent.liteav.editer.ac.5
        @Override // com.tencent.liteav.editer.h
        public void a(com.tencent.liteav.d.e eVar) {
            com.tencent.liteav.j.b.b();
            synchronized (ac.this) {
                if (ac.this.i != null) {
                    ac.this.i.a(eVar);
                }
            }
        }
    };
    private l u = new l() { // from class: com.tencent.liteav.editer.ac.6
        @Override // com.tencent.liteav.editer.l
        public void a(com.tencent.liteav.d.e eVar) {
            if (ac.this.d != null) {
                ac.this.d.b(eVar);
            }
        }
    };
    private Handler v = new Handler(Looper.getMainLooper());
    private b.a w = new b.a() { // from class: com.tencent.liteav.editer.ac.9
        @Override // com.tencent.liteav.editer.b.a
        public void a(int i) {
            if (com.tencent.liteav.c.k.a().d() == 1) {
                if (ac.this.c == null || !ac.this.c.h()) {
                    return;
                }
                ac.this.c.a(i <= 5);
                return;
            }
            synchronized (ac.this) {
                if (ac.this.i != null) {
                    ac.this.i.c(i <= 5);
                }
            }
        }
    };

    public ac(Context context) {
        this.b = context;
        this.d = new ae(context);
        this.d.a(this.p);
        this.e = new b();
        this.g = com.tencent.liteav.c.i.a();
        this.h = new com.tencent.liteav.f.k(context);
        this.f = com.tencent.liteav.c.k.a();
    }

    public void a(String str) {
        TXCLog.i("VideoEditerPreview", "setVideoPath videoPath:" + str);
        if (this.c == null) {
            this.c = new aa();
        }
        try {
            this.c.a(str);
            if (this.c.h()) {
                this.g.a(this.c.f());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void a(List<Bitmap> list, int i) {
        this.n = new s("preview");
        this.n.a(true);
        this.n.a(list, i);
        this.o = new f(this.b, this.n.a(), this.n.b());
    }

    public long a(int i) {
        com.tencent.liteav.c.e.a().a(i);
        if (this.n != null) {
            return this.n.a(i);
        }
        return 0L;
    }

    public synchronized void b(String str) {
        if (this.i == null) {
            this.i = new com.tencent.liteav.f.b("preview");
            this.i.a();
        }
        this.i.a(str);
        this.g.c(this.i.h());
        this.i.a(this.g.n());
        boolean z = false;
        if (com.tencent.liteav.c.k.a().d() == 1) {
            if (this.c != null) {
                z = this.c.h();
            } else {
                z = this.g.l();
            }
        }
        if (!z) {
            this.i.b(z);
            this.i.c();
        }
    }

    public synchronized void a(long j, long j2) {
        TXCLog.i("VideoEditerPreview", "setBGMStartTime startTime:" + j + ",endTime:" + j2);
        if (this.i != null) {
            this.i.a(j, j2);
        }
    }

    public synchronized void a(float f) {
        TXCLog.i("VideoEditerPreview", "setVideoVolume volume:" + f);
        if (this.i != null) {
            this.i.a(f);
        }
    }

    public synchronized void b(float f) {
        TXCLog.i("VideoEditerPreview", "setBGMVolume volume:" + f);
        if (this.i != null) {
            this.i.b(f);
        }
    }

    public synchronized void a(boolean z) {
        TXCLog.i("VideoEditerPreview", "setBGMLoop looping:" + z);
        if (this.i != null) {
            this.i.a(z);
        }
    }

    public synchronized void a(long j) {
        TXCLog.i("VideoEditerPreview", "setBGMAtVideoTime videoStartTime:" + j);
        if (this.i != null) {
            this.i.a(j);
        }
    }

    public void a() {
        if (this.d != null) {
            this.d.a(1);
        }
    }

    public void b() {
        if (this.f.d() != 1 || this.d == null) {
            return;
        }
        this.d.a(2);
    }

    public void b(long j, long j2) {
        if (this.f.d() == 1 && this.c != null) {
            this.c.a(j * 1000, j2 * 1000);
        } else if (this.f.d() != 2 || this.n == null) {
        } else {
            this.n.a(j, j2);
        }
    }

    public void c(long j, long j2) {
        if (this.f.d() == 2) {
            TXCLog.e("VideoEditerPreview", "setRepeateFromTimeToTime, source is picture, not support yet!");
        } else if (this.c != null) {
            this.c.b(j, j2);
        }
    }

    public void a(b.d dVar) {
        this.l = dVar;
    }

    public void a(b.InterfaceC1456b interfaceC1456b) {
        this.m = interfaceC1456b;
    }

    public void a(a.g gVar) {
        synchronized (this) {
            this.j = null;
        }
        if (this.f.d() == 1) {
            a(this.f.a);
            if (com.tencent.liteav.c.k.a().e() != 0) {
                TXCLog.e("VideoEditerPreview", "initWithPreview Video Source illegal : " + this.f.a);
                return;
            }
        }
        if (this.d != null) {
            this.d.a(gVar);
        }
    }

    public void b(long j) {
        if (this.f.d() == 1 && this.c != null) {
            this.c.a(this.j);
            this.c.a(this.s);
            this.c.a(j);
        } else if (this.f.d() != 2 || this.n == null) {
        } else {
            this.n.a(j);
        }
    }

    public void c() {
        synchronized (this) {
            this.k = true;
            TXCLog.i("VideoEditerPreview", "startPlay mNeedPlay true, mSurface:" + this.j);
            if (this.j != null) {
                h();
            }
        }
    }

    public void d() {
        synchronized (this) {
            this.k = false;
        }
        TXCLog.i("VideoEditerPreview", "stopPlay mNeedPlay false");
        if (this.f.d() == 1 && this.c != null) {
            this.c.a((m) null);
            this.c.a((h) null);
            this.c.m();
        } else if (this.f.d() == 2 && this.n != null) {
            this.n.e();
            this.n.a((l) null);
        }
        if (this.e != null) {
            this.e.a((b.a) null);
            this.e.d();
        }
        synchronized (this) {
            if (this.i != null) {
                this.i.d();
                this.i.a((j) null);
                this.i.b();
                this.i = null;
            }
        }
        if (this.d != null) {
            this.d.d();
        }
    }

    public void e() {
        synchronized (this) {
            this.k = true;
        }
        if (this.d != null) {
            this.d.a(0);
        }
        synchronized (this) {
            if (this.j == null) {
                TXCLog.i("VideoEditerPreview", "resumePlay, mSurface is null, ignore!");
                return;
            }
            if (this.f.d() == 1 && this.c != null) {
                this.c.o();
            } else if (this.f.d() == 2 && this.n != null) {
                this.n.g();
            }
            if (this.e != null) {
                this.e.b();
            }
            if (this.c == null || this.c.h()) {
                return;
            }
            synchronized (this) {
                if (this.i != null) {
                    this.i.g();
                }
            }
        }
    }

    public void f() {
        synchronized (this) {
            this.k = false;
        }
        if (this.f.d() == 1 && this.c != null) {
            this.c.n();
        } else if (this.f.d() == 2 && this.n != null) {
            this.n.f();
        }
        if (this.e != null) {
            this.e.a();
        }
        if (this.c == null || this.c.h()) {
            return;
        }
        synchronized (this) {
            if (this.i != null) {
                this.i.f();
            }
        }
    }

    public void g() {
        TXCLog.i("VideoEditerPreview", "release");
        if (this.c != null) {
            this.c.k();
        }
        if (this.n != null) {
            this.n.i();
        }
        if (this.d != null) {
            this.d.e();
        }
        this.d = null;
        this.h = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.w = null;
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        TXCLog.i("VideoEditerPreview", "startPlayInternal");
        if (this.i == null) {
            this.i = new com.tencent.liteav.f.b("preview");
            this.i.a();
        }
        this.i.a(this.r);
        this.i.b(i());
        if (this.g.l()) {
            MediaFormat n = this.g.n();
            this.i.a(n);
            if (this.f.d() == 1) {
                if (this.c != null) {
                    this.i.b(this.c.h());
                }
            } else {
                this.i.b(false);
            }
            this.i.c();
            this.i.e();
            this.e.a(n);
        }
        com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
        if (this.d != null) {
            gVar.a = this.d.a();
            gVar.b = this.d.b();
        }
        this.h.a(gVar);
        if (this.f.d() == 1 && this.c != null) {
            this.c.a(this.j);
            this.c.a(this.s);
            this.c.a(this.t);
            this.c.l();
        } else if (this.f.d() == 2 && this.n != null) {
            this.n.a(this.u);
            this.n.d();
        }
        if (this.g.l()) {
            this.e.a(this.w);
            this.e.c();
        }
        if (this.d != null) {
            this.d.a(0);
            this.d.c();
        }
        com.tencent.liteav.j.b.h();
    }

    private long i() {
        com.tencent.liteav.c.c a = com.tencent.liteav.c.c.a();
        long e = a.e() - a.d();
        TXCLog.i("VideoEditerPreview", "calculatePlayDuration playDurationUs : " + e);
        if (com.tencent.liteav.f.g.a().c()) {
            long b = com.tencent.liteav.f.g.a().b(e);
            TXCLog.i("VideoEditerPreview", "calculatePlayDuration after Speed playDurationUs : " + b);
            return b;
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, int i2, int i3, long j) {
        return this.m != null ? this.m.a(i, i2, i3, j) : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.v.post(new Runnable() { // from class: com.tencent.liteav.editer.ac.7
            @Override // java.lang.Runnable
            public void run() {
                if (ac.this.l != null) {
                    ac.this.l.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final long j) {
        this.v.post(new Runnable() { // from class: com.tencent.liteav.editer.ac.8
            @Override // java.lang.Runnable
            public void run() {
                if (ac.this.l != null) {
                    ac.this.l.a((int) j);
                }
            }
        });
    }
}
