package com.tencent.liteav.g;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.smtt.sdk.TbsListener;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class l {
    private c b;
    private com.tencent.liteav.g.a c;
    private j d;
    private HandlerThread g;
    private b h;
    private a i;
    private i j;
    private i k;
    private com.tencent.liteav.d.e l;
    private long m;
    private long n;
    private com.tencent.liteav.d.e p;
    private long q;
    private long r;
    private final String a = "VideoJoinDecAndDemuxGenerate";
    private boolean o = true;
    private AtomicInteger e = new AtomicInteger(1);
    private HandlerThread f = new HandlerThread("JoinVDecGene");

    public l() {
        this.f.start();
        this.h = new b(this.f.getLooper());
        this.g = new HandlerThread("JoinADecGene");
        this.g.start();
        this.i = new a(this.g.getLooper());
    }

    public void a(j jVar) {
        this.d = jVar;
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    public void a(com.tencent.liteav.g.a aVar) {
        this.c = aVar;
    }

    public synchronized void a() {
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "start");
        if (this.e.get() == 2) {
            TXCLog.e("VideoJoinDecAndDemuxGenerate", "start ignore, mCurrentState = " + this.e.get());
            return;
        }
        this.q = 0L;
        this.r = 0L;
        this.m = 0L;
        this.n = 0L;
        this.p = null;
        this.l = null;
        this.d.h();
        this.e.set(2);
        this.h.sendEmptyMessage(101);
        this.i.sendEmptyMessage(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
    }

    public synchronized void b() {
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "stop");
        if (this.e.get() == 1) {
            TXCLog.e("VideoJoinDecAndDemuxGenerate", "stop(), mCurrentState in stop, ignore");
            return;
        }
        this.e.set(1);
        this.h.sendEmptyMessage(103);
        this.i.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
    }

    public synchronized void c() {
        if (this.e.get() == 1) {
            TXCLog.e("VideoJoinDecAndDemuxGenerate", "getNextVideoFrame, current state is init, ignore");
        } else {
            this.h.sendEmptyMessage(102);
        }
    }

    public void a(boolean z) {
        this.o = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM /* 201 */:
                    l.this.d();
                    l.this.i.sendEmptyMessage(202);
                    return;
                case 202:
                    l.this.f();
                    return;
                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                    l.this.i.removeMessages(202);
                    l.this.e();
                    return;
                case TbsListener.ErrorCode.APK_INVALID /* 204 */:
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "startAudioDecoder");
        List<i> a2 = this.d.a();
        for (int i = 0; i < a2.size(); i++) {
            i iVar = a2.get(i);
            iVar.d();
            iVar.m();
        }
        this.k = this.d.c();
        this.r = this.k.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "stopAudioDecoder");
        List<i> a2 = this.d.a();
        for (int i = 0; i < a2.size(); i++) {
            a2.get(i).n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 101:
                    l.this.k();
                    l.this.h.sendEmptyMessage(102);
                    return;
                case 102:
                    l.this.h();
                    return;
                case 103:
                    l.this.h.removeMessages(102);
                    l.this.l();
                    return;
                case 104:
                    l.this.h.removeMessages(102);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!this.o) {
            this.i.sendEmptyMessageDelayed(202, 10L);
            return;
        }
        com.tencent.liteav.d.e eVar = null;
        if (this.k.f() == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                eVar = g();
            }
        } else {
            this.k.r();
            eVar = this.k.t();
            if (eVar == null) {
                this.i.sendEmptyMessage(202);
                return;
            }
            eVar.a(eVar.e() + this.n);
        }
        if (eVar == null) {
            return;
        }
        if (eVar.p()) {
            if (this.d.g()) {
                if (this.d.f() && this.j.o()) {
                    TXCLog.i("VideoJoinDecAndDemuxGenerate", "throw last audio");
                    a(eVar);
                }
                this.i.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
                return;
            }
            long j = 1024000000 / this.p.j();
            this.n = this.p.e() + j;
            TXCLog.i("VideoJoinDecAndDemuxGenerate", "mEOFAudioFrameUs:" + this.n + ",mCurrentAudioDuration:" + this.r);
            if (this.n < this.r) {
                int i = (int) ((this.r - this.n) / j);
                TXCLog.i("VideoJoinDecAndDemuxGenerate", "count:" + i);
                for (int i2 = 0; i2 < i; i2++) {
                    a(j);
                }
                this.n = this.r;
            }
            i();
            this.i.sendEmptyMessage(202);
            return;
        }
        this.p = eVar;
        a(eVar);
        this.i.sendEmptyMessage(202);
    }

    private com.tencent.liteav.d.e g() {
        MediaFormat i;
        if (Build.VERSION.SDK_INT < 16 || (i = t.a().i()) == null) {
            return null;
        }
        int integer = i.getInteger("sample-rate");
        int integer2 = i.getInteger("channel-count");
        long j = 1024000000 / integer;
        int i2 = integer2 * 2048;
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e("audio/mp4a-latm", ByteBuffer.allocate(i2), new MediaCodec.BufferInfo());
        eVar.g(integer);
        eVar.h(integer2);
        eVar.d(i2);
        long e = this.p != null ? this.p.e() + j : 0L;
        if (e >= this.r) {
            eVar.c(4);
        }
        eVar.a(e);
        return eVar;
    }

    public void a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(this.p.g());
        TXCLog.d("VideoJoinDecAndDemuxGenerate", "mCurrentAudioFrame.getLength():" + this.p.g());
        this.p.a(allocate);
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e(this.p.a(), this.p.b(), this.p.o());
        eVar.a(this.p.c());
        eVar.b(this.p.d());
        eVar.g(this.p.j());
        long e = this.p.e() + j;
        eVar.a(e);
        eVar.b(e);
        eVar.c(e);
        eVar.c(this.p.f());
        this.p = eVar;
        a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.j.q();
        com.tencent.liteav.d.e s = this.j.s();
        if (s == null) {
            this.h.sendEmptyMessage(102);
            return;
        }
        if (this.m != 0) {
            TXCLog.d("VideoJoinDecAndDemuxGenerate", "before:" + s.e() + ",after:" + (s.e() + this.m));
        }
        s.a(s.e() + this.m);
        if (s.p()) {
            if (this.d.f()) {
                if (this.d.g() && this.k.p()) {
                    TXCLog.i("VideoJoinDecAndDemuxGenerate", "throw last video");
                    b(s);
                }
                this.h.sendEmptyMessage(103);
                return;
            }
            this.m = this.l.e();
            TXCLog.i("VideoJoinDecAndDemuxGenerate", "mEOFVideoFrameUs:" + this.m + ",mCurrentVideoDuration:" + this.q);
            if (this.m != this.q) {
                this.m = this.q;
            }
            j();
            this.h.sendEmptyMessage(102);
        } else if (s.e() > this.q) {
            TXCLog.d("VideoJoinDecAndDemuxGenerate", "dropOne");
            c();
        } else {
            this.l = s;
            b(s);
        }
    }

    private void i() {
        if (!this.d.e()) {
            TXCLog.i("VideoJoinDecAndDemuxGenerate", "nextAudioExtractorConfig isAllReadEOF");
            return;
        }
        this.k = this.d.c();
        this.r += this.k.j();
    }

    private void j() {
        if (!this.d.d()) {
            TXCLog.i("VideoJoinDecAndDemuxGenerate", "nextVideoExtractorConfig isAllReadEOF");
            return;
        }
        this.j = this.d.b();
        this.q += this.j.j();
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "Duration :" + this.k.j());
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "AudioDuration :" + this.j.i() + ", VideoDuration:" + this.j.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "startVideoDecoder");
        List<i> a2 = this.d.a();
        for (int i = 0; i < a2.size(); i++) {
            i iVar = a2.get(i);
            iVar.c();
            iVar.k();
        }
        this.j = this.d.b();
        this.q = this.j.j();
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "Duration :" + this.j.j());
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "AudioDuration :" + this.j.i() + ", VideoDuration:" + this.j.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TXCLog.i("VideoJoinDecAndDemuxGenerate", "stopVideoDecoder");
        List<i> a2 = this.d.a();
        for (int i = 0; i < a2.size(); i++) {
            a2.get(i).l();
        }
    }

    private void a(com.tencent.liteav.d.e eVar) {
        if (this.c != null) {
            this.c.a(eVar, this.k);
        }
    }

    private void b(com.tencent.liteav.d.e eVar) {
        if (this.b != null) {
            this.b.a(eVar, this.j);
        }
    }
}
