package com.tencent.liteav.f;

import android.graphics.Bitmap;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.w;
import com.tencent.liteav.i.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j {
    private static j c;
    public com.tencent.liteav.d.e a;
    public com.tencent.liteav.d.e b;
    private com.tencent.liteav.d.i d;
    private float e;
    private List<a.k> f;
    private w g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    public static j a() {
        if (c == null) {
            c = new j();
        }
        return c;
    }

    private j() {
        i();
    }

    public void a(com.tencent.liteav.d.i iVar) {
        this.d = iVar;
    }

    public boolean b() {
        return this.d != null;
    }

    public void a(w wVar) {
        this.g = wVar;
    }

    public long c() {
        return this.d.a() * 1000 * 1000;
    }

    public void d() {
        int a;
        this.o = com.tencent.liteav.c.i.a().l();
        if (this.d == null || this.a == null || (a = this.d.a()) == 0) {
            return;
        }
        this.k = this.a.i() * a;
        this.l = 0;
        this.e = 0.0f;
        e();
        if (this.o) {
            if (this.b == null) {
                return;
            }
            this.i = (this.b.g() * 1000) / ((this.b.k() * 2) * this.b.j());
            this.h = (a * 1000) / this.i;
            this.j = 0;
            for (int i = 0; i < this.h; i++) {
                g();
            }
        }
        f();
    }

    public void e() {
        Bitmap c2 = this.d.c();
        a.h d = this.d.d();
        int a = this.d.a();
        if (c2 == null || c2.isRecycled() || d == null || a == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = a * this.a.i();
        long a2 = com.tencent.liteav.j.e.a(this.a) / 1000;
        int i2 = 255 / i;
        int i3 = 100;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += i2;
            if (i3 >= 255) {
                i3 = 255;
            }
            Bitmap a3 = com.tencent.liteav.j.a.a(c2, i3);
            a.k kVar = new a.k();
            kVar.b = d;
            kVar.a = a3;
            kVar.c = a2;
            kVar.d = a2 + (1000 / this.a.i());
            arrayList.add(kVar);
            a2 = kVar.d;
        }
        this.f = arrayList;
    }

    public void f() {
        if (this.n) {
            return;
        }
        if (this.l >= this.k - 1) {
            this.n = true;
            TXCLog.d("TailWaterMarkChain", "===insertTailVideoFrame===mEndAudio:" + this.m + ",mHasAudioTrack:" + this.o);
            if (this.o) {
                if (this.m) {
                    n();
                    return;
                }
                return;
            }
            k();
            return;
        }
        com.tencent.liteav.d.e l = l();
        l.c(this.a.f());
        l.m(this.a.y());
        l.a(this.a.w());
        this.l++;
        TXCLog.d("TailWaterMarkChain", "===insertTailVideoFrame===mVideoIndex:" + this.l + ",time:" + l.t());
        if (this.g != null) {
            this.g.b(l);
        }
    }

    private void k() {
        TXCLog.d("TailWaterMarkChain", "===insertVideoTailVFrame===, lastVideoFrame = " + this.a);
        if (this.a == null) {
            return;
        }
        com.tencent.liteav.d.e l = l();
        l.c(4);
        this.l++;
        TXCLog.d("TailWaterMarkChain", "===insertVideoTailVFrame===mVideoIndex:" + this.l + ",time:" + l.t() + ",flag:" + l.f());
        if (this.g != null) {
            this.g.b(l);
        }
    }

    private com.tencent.liteav.d.e l() {
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e(this.a.a(), this.a.b(), this.a.o());
        eVar.a(this.a.c());
        eVar.b(this.a.d());
        eVar.e(this.a.h());
        eVar.f(this.a.i());
        eVar.g(this.a.j());
        if (eVar.h() == 90 || eVar.h() == 270) {
            eVar.j(this.a.n());
            eVar.k(this.a.m());
        } else {
            eVar.j(this.a.m());
            eVar.k(this.a.n());
        }
        long p = p();
        eVar.a(p);
        eVar.b(p);
        eVar.c(p);
        eVar.a(true);
        eVar.m(this.a.y());
        this.e += 10.0f / this.k;
        eVar.a(this.e);
        return eVar;
    }

    public void g() {
        if (this.m) {
            return;
        }
        if (this.j >= this.h - 1) {
            this.m = true;
            if (this.n) {
                n();
                return;
            }
            return;
        }
        this.b.a(ByteBuffer.allocate(this.b.g()));
        com.tencent.liteav.d.e o = o();
        o.c(this.b.f());
        this.j++;
        TXCLog.d("TailWaterMarkChain", "===insertTailAudioFrame===mAudioIndex:" + this.j + ",time:" + o.e());
        if (this.g != null) {
            this.g.a(o);
        }
    }

    private long m() {
        return this.b.e() + (this.i * (this.j + 1) * 1000);
    }

    private void n() {
        TXCLog.d("TailWaterMarkChain", "===insertAudioTailFrame===");
        this.b.a(ByteBuffer.allocate(this.b.g()));
        com.tencent.liteav.d.e o = o();
        o.c(4);
        this.j++;
        if (this.g != null) {
            this.g.a(o);
        }
    }

    private com.tencent.liteav.d.e o() {
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e(this.b.a(), this.b.b(), this.b.o());
        eVar.a(this.b.c());
        eVar.b(this.b.d());
        eVar.g(this.b.j());
        eVar.h(this.b.k());
        long m = m();
        eVar.a(m);
        eVar.b(m);
        eVar.c(m);
        eVar.a(true);
        return eVar;
    }

    private long p() {
        if (com.tencent.liteav.c.g.a().b()) {
            return this.a.u() + ((((this.l + 1) * 1000) / this.a.i()) * 1000);
        }
        if (g.a().c()) {
            return this.a.t() + ((((this.l + 1) * 1000) / this.a.i()) * 1000);
        }
        return this.a.e() + ((((this.l + 1) * 1000) / this.a.i()) * 1000);
    }

    public List<a.k> h() {
        return this.f;
    }

    public void i() {
        if (this.f != null) {
            for (a.k kVar : this.f) {
                if (kVar != null && kVar.a != null && !kVar.a.isRecycled()) {
                    kVar.a.recycle();
                    kVar.a = null;
                }
            }
            this.f.clear();
        }
        this.f = null;
        if (this.d != null) {
            this.d.b();
        }
        this.d = null;
        this.a = null;
        this.b = null;
        this.e = 0.0f;
        this.j = 0;
        this.l = 0;
        this.h = 0;
        this.k = 0;
        this.m = false;
        this.n = false;
    }

    public boolean j() {
        if (this.o) {
            return this.n && this.m;
        }
        return this.n;
    }
}
