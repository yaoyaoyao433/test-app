package com.tencent.liteav.editer;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.g.b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class c {
    protected com.tencent.liteav.g.e a;
    protected af b;
    protected com.tencent.liteav.g.f c;
    protected Surface d;
    protected h e;
    protected m f;
    protected AtomicLong g;
    protected AtomicLong h;
    protected int i;
    protected String j;
    private final String k = "BasicVideoDecDemux";
    private int l;

    public int a(String str) throws IOException {
        this.j = str;
        this.a = new com.tencent.liteav.g.e();
        int a = this.a.a(str);
        if (a == -1002 || a == 0) {
            this.l = 0;
            return a;
        }
        return a;
    }

    public void a(m mVar) {
        this.f = mVar;
    }

    public void a(h hVar) {
        this.e = hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        TXCLog.i("BasicVideoDecDemux", "configureVideo");
        this.b = new af();
        MediaFormat l = this.a.l();
        this.b.a(new b.a() { // from class: com.tencent.liteav.editer.c.1
            @Override // com.tencent.liteav.g.b.a
            public void a(String str) {
                m mVar = c.this.f;
                if (mVar != null) {
                    mVar.a(str);
                }
            }
        });
        this.b.a(l);
        this.b.a(this.a.l(), this.d);
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        TXCLog.i("BasicVideoDecDemux", "configureAudio");
        this.c = new com.tencent.liteav.g.f();
        MediaFormat m = this.a.m();
        this.c.a(m);
        this.c.a(m, (Surface) null);
        this.c.a();
    }

    public synchronized void a(Surface surface) {
        this.d = surface;
    }

    public long c() {
        return this.a.a();
    }

    public int d() {
        return this.a.b();
    }

    public int e() {
        return this.a.c();
    }

    public MediaFormat f() {
        return this.a.m();
    }

    public MediaFormat g() {
        return this.a.l();
    }

    public boolean h() {
        return (this.a == null || this.a.m() == null) ? false : true;
    }

    public boolean i() {
        return this.a.l() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long a(com.tencent.liteav.d.e eVar) {
        TXCLog.i("BasicVideoDecDemux", "seekFinalVideo, read is end frame, try to find final video frame(not end frame)");
        long j = (1000 / j()) * 1000;
        long j2 = this.a.j();
        if (j2 <= 0) {
            j2 = this.h.get();
        }
        for (int i = 1; i <= 3; i++) {
            long j3 = j2 - (i * j);
            if (j3 < 0) {
                j3 = j2;
            }
            this.a.a(j3);
            this.a.a(eVar);
            TXCLog.d("BasicVideoDecDemux", "seekReversePTS, seek End PTS = " + j3 + ", flags = " + eVar.f() + ", seekEndCount = " + i);
            if (!eVar.p()) {
                return eVar.e();
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(long j, long j2, com.tencent.liteav.d.e eVar) {
        if (j <= this.g.get()) {
            TXCLog.i("BasicVideoDecDemux", "seekReversePTS, lastReadPTS <= mStartTime");
            this.a.a(j);
            this.i++;
            if (this.i >= 2) {
                this.b.b(eVar);
                return true;
            }
            return false;
        }
        long j3 = 1000;
        long j4 = j - 1000;
        this.a.a(j4);
        long p = this.a.p();
        if (p < j) {
            TXCLog.i("BasicVideoDecDemux", "seekReversePTS, seekPTS = " + j4 + ", find previous pts = " + p);
            return false;
        }
        int i = 1;
        while (true) {
            long j5 = j - ((i * j2) + j3);
            long j6 = j5 >= 0 ? j5 : 0L;
            this.a.a(j6);
            long p2 = this.a.p();
            TXCLog.i("BasicVideoDecDemux", "seekReversePTS, may be SEEK_TO_PREVIOUS_SYNC same to NEXT_SYNC, seekPTS = " + j6 + ", find previous pts = " + p2 + ", count = " + i);
            if (p2 < j) {
                return false;
            }
            i++;
            if (i > 10) {
                this.b.b(eVar);
                return true;
            }
            j3 = 1000;
        }
    }

    public int j() {
        if (this.l != 0) {
            return this.l;
        }
        MediaFormat l = this.a.l();
        if (l != null) {
            try {
                this.l = l.getInteger("frame-rate");
            } catch (NullPointerException unused) {
                this.l = 20;
            }
        }
        return this.l;
    }

    public void k() {
        if (this.a != null) {
            this.a.o();
        }
    }
}
