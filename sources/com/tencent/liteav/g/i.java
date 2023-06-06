package com.tencent.liteav.g;

import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.af;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i {
    public String a;
    public k b;
    private e c;
    private af d;
    private f e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private MediaFormat j;
    private MediaFormat k;

    public void a(String str) {
        this.a = str;
    }

    public void a() {
        if (this.c != null) {
            this.c.o();
        }
    }

    public int b() {
        TXCLog.i("VideoExtractConfig", "createMediaExtractor videoSourcePath:" + this.a);
        this.c = new e();
        return this.c.a(this.a);
    }

    public void c() {
        TXCLog.i("VideoExtractConfig", "resetVideoMediaExtractor videoSourcePath:" + this.a);
        if (this.c != null) {
            this.c.a(0L);
        }
    }

    public void d() {
        TXCLog.i("VideoExtractConfig", "resetAudioMediaExtractor videoSourcePath:" + this.a);
        if (this.c != null) {
            this.c.c(0L);
        }
    }

    public MediaFormat e() {
        return this.j == null ? this.c.l() : this.j;
    }

    public MediaFormat f() {
        return this.k == null ? this.c.m() : this.k;
    }

    public int g() {
        return this.c.g();
    }

    public long h() {
        MediaFormat e;
        if (Build.VERSION.SDK_INT < 16 || (e = e()) == null) {
            return 0L;
        }
        return e.getLong("durationUs");
    }

    public long i() {
        MediaFormat f;
        if (Build.VERSION.SDK_INT < 16 || (f = f()) == null) {
            return 0L;
        }
        return f.getLong("durationUs");
    }

    public long j() {
        if (f() == null) {
            TXCLog.i("VideoExtractConfig", "getAudioFormat is null");
            return h();
        } else if (e() != null) {
            long h = h();
            long i = i();
            TXCLog.i("VideoExtractConfig", "getDuration vd:" + h + ",ad:" + i);
            return h > i ? h : i;
        } else {
            TXCLog.i("VideoExtractConfig", "getVideoFormat is null");
            return 0L;
        }
    }

    public void k() {
        TXCLog.i("VideoExtractConfig", "createVideoDecoder videoSourcePath1111:" + this.a);
        if (this.b.c == null) {
            TXCLog.e("VideoExtractConfig", "createVideoDecoder videoGLTextureInfo.surface is null");
            return;
        }
        this.d = new af();
        this.j = this.c.l();
        this.d.a(this.j);
        this.d.a(this.c.l(), this.b.c);
        this.d.a();
        this.f = false;
        this.h = false;
    }

    public void l() {
        TXCLog.i("VideoExtractConfig", "destroyVideoDecoder videoSourcePath:" + this.a);
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
    }

    public void m() {
        TXCLog.i("VideoExtractConfig", "createAudioDecoder videoSourcePath:" + this.a);
        this.e = new f();
        this.k = this.c.m();
        this.e.a(this.k);
        this.e.a(this.k, (Surface) null);
        this.e.a();
        if (this.k == null) {
            this.g = true;
            this.i = true;
            return;
        }
        this.g = false;
        this.i = false;
    }

    public void n() {
        TXCLog.i("VideoExtractConfig", "destroyAudioDecoder videoSourcePath:" + this.a);
        if (this.e != null) {
            this.e.b();
            this.e = null;
        }
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return this.i;
    }

    public void q() {
        com.tencent.liteav.d.e c;
        com.tencent.liteav.d.e a;
        if (this.f) {
            TXCLog.i("VideoExtractConfig", "readVideoFrame source:" + this.a + " readEOF!");
        } else if (this.d == null || (c = this.d.c()) == null || (a = this.c.a(c)) == null) {
        } else {
            if (this.c.c(a)) {
                this.f = true;
                TXCLog.i("VideoExtractConfig", "readVideoFrame source:" + this.a + " readEOF!");
            }
            this.d.a(a);
        }
    }

    public void r() {
        com.tencent.liteav.d.e c;
        com.tencent.liteav.d.e b;
        if (this.g) {
            TXCLog.i("VideoExtractConfig", "readAudioFrame source:" + this.a + " readEOF!");
        } else if (this.e == null || (c = this.e.c()) == null || (b = this.c.b(c)) == null) {
        } else {
            if (this.c.d(b)) {
                this.g = true;
                TXCLog.i("VideoExtractConfig", "readAudioFrame source:" + this.a + " readEOF!");
            }
            this.e.a(b);
        }
    }

    public com.tencent.liteav.d.e s() {
        com.tencent.liteav.d.e d;
        if (this.d == null || (d = this.d.d()) == null || d.o() == null) {
            return null;
        }
        a(d);
        if (d.p()) {
            TXCLog.i("VideoExtractConfig", "getDecodeVideoFrame frame.isEndFrame");
            this.h = true;
        }
        return d;
    }

    public com.tencent.liteav.d.e t() {
        com.tencent.liteav.d.e d;
        if (this.e == null || (d = this.e.d()) == null || d.o() == null) {
            return null;
        }
        b(d);
        if (d.p()) {
            TXCLog.i("VideoExtractConfig", "getDecodeAudioFrame frame.isEndFrame");
            this.i = true;
        }
        return d;
    }

    private void a(com.tencent.liteav.d.e eVar) {
        if (this.c == null || eVar == null) {
            return;
        }
        eVar.j(this.c.b());
        eVar.k(this.c.c());
        eVar.e(this.c.f());
        eVar.f(this.c.e());
    }

    private void b(com.tencent.liteav.d.e eVar) {
        if (this.c == null || eVar == null) {
            return;
        }
        eVar.g(this.c.h());
        eVar.h(this.c.i());
    }
}
