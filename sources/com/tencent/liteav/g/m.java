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
public class m {
    private c c;
    private com.tencent.liteav.g.a d;
    private List<i> e;
    private HandlerThread h;
    private b i;
    private a j;
    private i k;
    private i l;
    private long p;
    private boolean q;
    private com.tencent.liteav.d.e r;
    private long s;
    private long t;
    private com.tencent.liteav.d.e v;
    private long w;
    private long x;
    private long z;
    private final String a = "VideoJoinDecAndDemuxPreview";
    private long m = -1;
    private long n = -1;
    private long o = -1;
    private boolean u = true;
    private Object y = new Object();
    private AtomicInteger f = new AtomicInteger(1);
    private t b = t.a();
    private HandlerThread g = new HandlerThread("joinVDec");

    public m() {
        this.g.start();
        this.i = new b(this.g.getLooper());
        this.h = new HandlerThread("joinADec");
        this.h.start();
        this.j = new a(this.h.getLooper());
    }

    public void a(List<i> list) {
        this.e = list;
    }

    public void a(c cVar) {
        synchronized (this.y) {
            this.c = cVar;
        }
    }

    public void a(com.tencent.liteav.g.a aVar) {
        synchronized (this.y) {
            this.d = aVar;
        }
    }

    public synchronized void a() {
        TXCLog.i("VideoJoinDecAndDemuxPreview", "start");
        if (this.f.get() == 2) {
            TXCLog.e("VideoJoinDecAndDemuxPreview", "start ignore, mCurrentState = " + this.f.get());
            return;
        }
        this.u = true;
        this.b.n();
        this.f.set(2);
        this.i.sendEmptyMessage(101);
        this.j.sendEmptyMessage(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
    }

    public synchronized void b() {
        TXCLog.i("VideoJoinDecAndDemuxPreview", "stop");
        if (this.f.get() == 1) {
            TXCLog.e("VideoJoinDecAndDemuxPreview", "stop(), mCurrentState in stop, ignore");
            return;
        }
        this.f.set(1);
        this.i.sendEmptyMessage(103);
        this.j.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
    }

    public synchronized void c() {
        int i = this.f.get();
        if (i != 3 && i != 1) {
            this.f.set(3);
            this.i.sendEmptyMessage(104);
            this.j.sendEmptyMessage(TbsListener.ErrorCode.APK_INVALID);
            return;
        }
        TXCLog.e("VideoJoinDecAndDemuxPreview", "pause ignore, current state = " + i);
    }

    public synchronized void d() {
        int i = this.f.get();
        if (i != 1 && i != 2) {
            this.f.set(2);
            this.i.sendEmptyMessage(102);
            this.j.sendEmptyMessage(202);
            return;
        }
        TXCLog.e("VideoJoinDecAndDemuxPreview", "resume ignore, state = " + i);
    }

    public void a(boolean z) {
        this.u = z;
    }

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
                    m.this.k();
                    m.this.j.sendEmptyMessage(202);
                    return;
                case 202:
                    m.this.e();
                    return;
                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                    m.this.j.removeMessages(202);
                    m.this.l();
                    m.this.o = -1L;
                    m.this.v = null;
                    m.this.t = 0L;
                    return;
                case TbsListener.ErrorCode.APK_INVALID /* 204 */:
                    m.this.j.removeMessages(202);
                    m.this.o = -1L;
                    m.this.v = null;
                    return;
                default:
                    return;
            }
        }
    }

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
                    m.this.m();
                    m.this.i.sendEmptyMessage(102);
                    return;
                case 102:
                    m.this.g();
                    return;
                case 103:
                    m.this.i.removeMessages(102);
                    m.this.n();
                    m.this.r = null;
                    m.this.m = -1L;
                    m.this.n = -1L;
                    m.this.p = -1L;
                    m.this.s = 0L;
                    return;
                case 104:
                    m.this.i.removeMessages(102);
                    m.this.r = null;
                    m.this.m = -1L;
                    m.this.n = -1L;
                    m.this.p = -1L;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!this.u) {
            this.j.sendEmptyMessageDelayed(202, 10L);
            return;
        }
        com.tencent.liteav.d.e eVar = null;
        if (this.l.f() == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                eVar = f();
            }
        } else {
            this.l.r();
            eVar = this.l.t();
            if (eVar == null) {
                this.j.sendEmptyMessage(202);
                return;
            }
            TXCLog.d("VideoJoinDecAndDemuxPreview", "before:" + eVar.e() + ",after:" + (eVar.e() + this.t));
            eVar.a(eVar.e() + this.t);
            if (eVar != null) {
                TXCLog.d("VideoJoinDecAndDemuxPreview", "====:" + eVar.e() + ",len:" + eVar.g() + ",mEOFAudioFrameUs:" + this.t + ",flag:" + eVar.f());
            }
        }
        if (eVar == null) {
            return;
        }
        if (eVar.p()) {
            if (this.b.m()) {
                if (this.b.l() && this.k.o()) {
                    TXCLog.i("VideoJoinDecAndDemuxPreview", "throw last audio");
                    a(eVar);
                    synchronized (this) {
                        this.f.set(1);
                    }
                }
                this.j.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
                return;
            }
            long j = 1024000000 / this.v.j();
            this.t = this.v.e() + j;
            TXCLog.i("VideoJoinDecAndDemuxPreview", "mEOFAudioFrameUs:" + this.t + ",mCurrentAudioDuration:" + this.x);
            if (this.t < this.x) {
                int i = (int) ((this.x - this.t) / j);
                TXCLog.i("VideoJoinDecAndDemuxPreview", "count:" + i);
                for (int i2 = 0; i2 < i; i2++) {
                    a(j);
                }
                this.t = this.x;
            }
            i();
            this.j.sendEmptyMessage(202);
            return;
        }
        if (this.v == null) {
            this.o = System.currentTimeMillis();
        }
        this.v = eVar;
        a(eVar);
        this.j.sendEmptyMessage(202);
    }

    private com.tencent.liteav.d.e f() {
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
        long e = this.v != null ? this.v.e() + j : 0L;
        if (e >= this.x) {
            eVar.c(4);
        }
        eVar.a(e);
        return eVar;
    }

    public void a(long j) {
        this.v.a(ByteBuffer.allocate(this.v.g()));
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e(this.v.a(), this.v.b(), this.v.o());
        eVar.a(this.v.c());
        eVar.b(this.v.d());
        eVar.g(this.v.j());
        eVar.h(this.v.k());
        eVar.a(this.v.e() + j);
        this.v = eVar;
        TXCLog.d("VideoJoinDecAndDemuxPreview", "------insertEmptyAudioFrame--------");
        a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.m >= 0) {
            if (!this.q && !h()) {
                this.i.sendEmptyMessageDelayed(102, 5L);
                return;
            }
            b(this.r);
        }
        this.k.q();
        com.tencent.liteav.d.e s = this.k.s();
        if (s == null) {
            this.i.sendEmptyMessage(102);
            return;
        }
        s.a(s.e() + this.s);
        if (s.p()) {
            if (this.b.l()) {
                if (this.b.m() && this.l.p()) {
                    TXCLog.i("VideoJoinDecAndDemuxPreview", "throw last video");
                    b(s);
                    this.f.set(1);
                    this.w = 0L;
                }
                this.i.sendEmptyMessage(103);
                return;
            }
            this.s = this.r.e();
            TXCLog.i("VideoJoinDecAndDemuxPreview", "mEOFVideoFrameUs:" + this.s + ",mCurrentVideoDuration:" + this.w);
            if (this.s != this.w) {
                this.s = this.w;
            }
            j();
            this.i.sendEmptyMessage(102);
        } else if (s.e() > this.w) {
            TXCLog.d("VideoJoinDecAndDemuxPreview", "dropOne");
            this.i.sendEmptyMessage(102);
        } else {
            this.r = s;
            this.m = s.e() / 1000;
            if (this.n < 0) {
                this.n = this.m;
                if (this.o > 0) {
                    this.p = this.o;
                    TXCLog.i("VideoJoinDecAndDemuxPreview", "mTimelineMs get AudioFrame:" + this.o);
                } else {
                    this.p = System.currentTimeMillis();
                    TXCLog.i("VideoJoinDecAndDemuxPreview", "mTimelineMs get SystemTime:" + this.p);
                }
                this.q = true;
                this.i.sendEmptyMessage(102);
                return;
            }
            this.q = false;
            this.i.sendEmptyMessageDelayed(102, 5L);
        }
    }

    private boolean h() {
        long currentTimeMillis = System.currentTimeMillis();
        this.m = this.r.e() / 1000;
        return Math.abs(this.m - this.n) < currentTimeMillis - this.p;
    }

    private void i() {
        if (!this.b.k()) {
            TXCLog.i("VideoJoinDecAndDemuxPreview", "isAllReadEOF");
            this.j.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
            return;
        }
        this.l = this.b.f();
        this.x += this.l.j();
        this.j.sendEmptyMessage(202);
    }

    private void j() {
        if (!this.b.g()) {
            TXCLog.i("VideoJoinDecAndDemuxPreview", "isAllReadEOF");
            this.i.sendEmptyMessage(103);
            return;
        }
        this.k = this.b.e();
        this.w += this.k.j();
        TXCLog.i("VideoJoinDecAndDemuxPreview", "Duration :" + this.k.j());
        this.i.sendEmptyMessage(102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        TXCLog.i("VideoJoinDecAndDemuxPreview", "startAudioDecoder");
        List<i> d = t.a().d();
        for (int i = 0; i < d.size(); i++) {
            i iVar = d.get(i);
            iVar.d();
            iVar.m();
        }
        this.l = this.b.f();
        this.x = this.l.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TXCLog.i("VideoJoinDecAndDemuxPreview", "stopAudioDecoder");
        List<i> d = t.a().d();
        for (int i = 0; i < d.size(); i++) {
            d.get(i).n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        TXCLog.i("VideoJoinDecAndDemuxPreview", "startVideoDecoder");
        List<i> d = t.a().d();
        for (int i = 0; i < d.size(); i++) {
            i iVar = d.get(i);
            iVar.c();
            iVar.k();
        }
        this.k = this.b.e();
        this.w = this.k.j();
        TXCLog.i("VideoJoinDecAndDemuxPreview", "Duration :" + this.k.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        TXCLog.i("VideoJoinDecAndDemuxPreview", "stopVideoDecoder");
        List<i> d = t.a().d();
        for (int i = 0; i < d.size(); i++) {
            d.get(i).l();
        }
    }

    private void a(com.tencent.liteav.d.e eVar) {
        synchronized (this.y) {
            if (this.d != null) {
                TXCLog.d("VideoJoinDecAndDemuxPreview", "source:" + this.l.a + ",throwOutAudioFrame: " + eVar.e());
                this.d.a(eVar, this.l);
            }
        }
    }

    private void b(com.tencent.liteav.d.e eVar) {
        synchronized (this.y) {
            if (this.c != null && eVar.e() != this.z) {
                TXCLog.d("VideoJoinDecAndDemuxPreview", "source:" + this.k.a + ",throwOutVideoFrame: " + eVar.e());
                this.c.a(eVar, this.k);
                this.z = eVar.e();
            }
        }
    }
}
