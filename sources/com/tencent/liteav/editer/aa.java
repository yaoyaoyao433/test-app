package com.tencent.liteav.editer;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.LongSparseArray;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class aa extends c {
    private int A;
    private int D;
    private long F;
    private int G;
    private AtomicBoolean M;
    private com.tencent.liteav.d.e N;
    private AtomicBoolean P;
    private long Q;
    private AtomicBoolean R;
    private b n;
    private HandlerThread o;
    private a p;
    private HandlerThread q;
    private AtomicBoolean r;
    private AtomicBoolean s;
    private AtomicBoolean t;
    private AtomicBoolean u;
    private AtomicInteger v;
    private com.tencent.liteav.d.e w;
    private com.tencent.liteav.d.e x;
    private final String k = "VideoDecAndDemuxPreview";
    private volatile boolean y = true;
    private long z = -1;
    private long B = 0;
    private long C = 0;
    private boolean E = false;
    private long H = -1;
    private long I = -1;
    private long J = -1;
    private long K = -1;
    private long L = -1;
    private long O = -1;
    private LongSparseArray<com.tencent.liteav.d.e> m = new LongSparseArray<>();
    private LongSparseArray<com.tencent.liteav.d.e> l = new LongSparseArray<>();

    public aa() {
        this.g = new AtomicLong(0L);
        this.h = new AtomicLong(0L);
        this.v = new AtomicInteger(1);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.R = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.u = new AtomicBoolean(false);
        this.M = new AtomicBoolean(false);
        this.P = new AtomicBoolean(false);
        this.o = new HandlerThread("previewVDec");
        this.o.start();
        this.n = new b(this.o.getLooper());
        this.q = new HandlerThread("previewADec");
        this.q.start();
        this.p = new a(this.q.getLooper());
    }

    public synchronized void l() {
        TXCLog.i("VideoDecAndDemuxPreview", "start(), mCurrentState = " + this.v);
        if (this.v.get() == 2) {
            TXCLog.e("VideoDecAndDemuxPreview", "start ignore, mCurrentState = " + this.v.get());
            return;
        }
        this.l.clear();
        this.M.set(false);
        this.R.set(true);
        this.P.getAndSet(false);
        this.r.getAndSet(false);
        this.s.getAndSet(false);
        this.t.getAndSet(false);
        this.u.getAndSet(false);
        this.N = null;
        this.y = true;
        this.H = -1L;
        if (this.v.get() == 3) {
            TXCLog.i("VideoDecAndDemuxPreview", "start(), state pause, seek then send MSG_VIDEO_DECODE_START and MSG_AUDIO_DECODE_START");
            this.v.set(2);
            b(this.g.get());
            this.n.sendEmptyMessage(102);
            if (h()) {
                this.p.sendEmptyMessage(202);
            }
        } else if (this.v.get() == 4) {
            TXCLog.i("VideoDecAndDemuxPreview", "start(), state preview at time, stop then start");
            m();
            l();
        } else {
            TXCLog.i("VideoDecAndDemuxPreview", "start(), state init, seek then send MSG_VIDEO_DECODE_CONFIG and MSG_AUDIO_DECODE_CONFIG");
            this.v.set(2);
            b(this.g.get());
            this.n.sendEmptyMessage(101);
            if (h()) {
                this.p.sendEmptyMessage(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
            }
        }
    }

    public void m() {
        if (this.v.get() == 1) {
            TXCLog.e("VideoDecAndDemuxPreview", "stop(), mCurrentState in stop, ignore");
            return;
        }
        this.v.set(1);
        TXCLog.i("VideoDecAndDemuxPreview", "stop(), send MSG_VIDEO_DECODE_STOP");
        this.n.sendEmptyMessage(103);
        if (h()) {
            TXCLog.i("VideoDecAndDemuxPreview", "stop(), send MSG_AUDIO_DECODE_STOP");
            this.p.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
        }
    }

    public synchronized void n() {
        int i = this.v.get();
        if (i != 3 && i != 1) {
            this.v.set(3);
            TXCLog.i("VideoDecAndDemuxPreview", "pause(), send MSG_VIDEO_DECODE_PAUSE");
            this.n.sendEmptyMessage(104);
            if (h()) {
                TXCLog.i("VideoDecAndDemuxPreview", "pause(), send MSG_AUDIO_DECODE_PAUSE");
                this.p.sendEmptyMessage(TbsListener.ErrorCode.APK_INVALID);
            }
            return;
        }
        TXCLog.e("VideoDecAndDemuxPreview", "pause ignore, current state = " + i);
    }

    public synchronized void o() {
        int i = this.v.get();
        if (i != 1 && i != 2 && i != 4) {
            this.v.set(2);
            TXCLog.i("VideoDecAndDemuxPreview", "resume(), send MSG_VIDEO_DECODE_START");
            this.n.sendEmptyMessage(102);
            if (h()) {
                TXCLog.i("VideoDecAndDemuxPreview", "resume(), send MSG_AUDIO_DECODE_START");
                this.p.sendEmptyMessage(202);
            }
            return;
        }
        TXCLog.e("VideoDecAndDemuxPreview", "resume ignore, state = " + i);
    }

    public void a(long j) {
        this.Q = j * 1000;
        if (this.v.get() == 3 || this.v.get() == 4) {
            TXCLog.d("VideoDecAndDemuxPreview", "previewAtTime, state = " + this.v.get() + ", send MSG_VIDEO_DECODE_PREVIEW_START");
            this.v.set(4);
            this.n.removeMessages(5);
            this.n.sendEmptyMessage(5);
            return;
        }
        TXCLog.d("VideoDecAndDemuxPreview", "previewAtTime, state = " + this.v.get() + ", send MSG_VIDEO_DECODE_PREVIEW_CONFIG");
        this.v.set(4);
        synchronized (this) {
            r();
        }
        this.n.sendEmptyMessage(6);
    }

    public void a(boolean z) {
        this.y = z;
    }

    public synchronized void a(long j, long j2) {
        this.g.getAndSet(j);
        this.h.getAndSet(j2);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.N = null;
        this.x = null;
        this.K = -1L;
        this.L = -1L;
        this.I = -1L;
        this.J = -1L;
        this.M.set(false);
        TXCLog.i("VideoDecAndDemuxPreview", "avsync video frame reset first systime " + this.J);
        b(this.B, this.C);
    }

    public void b(long j, long j2) {
        if (j == 0 && j2 == 0) {
            this.D = 0;
        } else {
            this.D = 3;
        }
        this.B = j;
        this.C = j2;
        this.E = false;
    }

    public int p() {
        return this.a.f();
    }

    @Override // com.tencent.liteav.editer.c
    @TargetApi(18)
    public void k() {
        m();
        if (this.o != null) {
            this.o.quitSafely();
        }
        if (this.q != null) {
            this.q.quitSafely();
        }
        if (this.l != null) {
            this.l.clear();
        }
        if (this.m != null) {
            this.m.clear();
        }
        this.w = null;
        this.x = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0296 A[Catch: Exception -> 0x029c, TRY_LEAVE, TryCatch #0 {Exception -> 0x029c, blocks: (B:68:0x0208, B:70:0x020e, B:71:0x0215, B:72:0x0222, B:74:0x022d, B:76:0x0237, B:77:0x023e, B:80:0x024a, B:90:0x0296, B:81:0x0252, B:83:0x0277, B:85:0x0287), top: B:95:0x0208 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r10) {
            /*
                Method dump skipped, instructions count: 694
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.editer.aa.b.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) {
        if (!com.tencent.liteav.f.g.a().c()) {
            eVar.b(eVar.e());
            return eVar;
        } else if (this.x == null) {
            TXCLog.i("VideoDecAndDemuxPreview", "processSpeedFrame, mLastVideoFrame is null, this is first frame, not to speed");
            return eVar;
        } else if (eVar.p()) {
            TXCLog.i("VideoDecAndDemuxPreview", "processSpeedFrame, this frame is end frame, not to speed");
            return eVar;
        } else {
            long t = this.x.t() + (((float) (eVar.e() - this.x.e())) / com.tencent.liteav.f.g.a().a(eVar.e()));
            eVar.b(t);
            this.K = t / 1000;
            return eVar;
        }
    }

    private synchronized void b(long j) {
        if (this.P.get()) {
            TXCLog.e("VideoDecAndDemuxPreview", "seekPosition, had seeked");
            return;
        }
        TXCLog.d("VideoDecAndDemuxPreview", "======================start seek video and audio starting point=====================mStartTime = " + this.g);
        this.a.a(j);
        long p = this.a.p();
        this.a.c(p);
        long q = this.a.q();
        TXCLog.d("VideoDecAndDemuxPreview", "======================seek end=====================");
        TXCLog.d("VideoDecAndDemuxPreview", "==============seekTime==========" + this.g);
        TXCLog.d("VideoDecAndDemuxPreview", "==============startVdts==========" + p);
        TXCLog.d("VideoDecAndDemuxPreview", "==============startAdts==========" + q);
        this.P.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.tencent.liteav.d.e eVar) {
        if (this.f != null) {
            this.f.a(eVar);
        }
        this.x = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e s() {
        com.tencent.liteav.d.e d = this.b.d();
        if (d == null || d.o() == null || d == null) {
            return null;
        }
        com.tencent.liteav.d.e eVar = this.l.get(d.e());
        if (eVar != null) {
            d = this.b.a(eVar, d);
            if (com.tencent.liteav.c.g.a().b()) {
                d.a(eVar.v());
            }
        } else {
            d.j(d());
            d.k(e());
        }
        if (d.e() < this.g.get() && !d.p()) {
            TXCLog.d("VideoDecAndDemuxPreview", "VideoFrame pts :" + d.e() + " before  startTime (" + this.g + CommonConstant.Symbol.BRACKET_RIGHT);
            return null;
        }
        if (d.e() > this.h.get()) {
            TXCLog.d("VideoDecAndDemuxPreview", "VideoFrame pts :" + d.e() + " after  duration (" + this.h + CommonConstant.Symbol.BRACKET_RIGHT);
            if (com.tencent.liteav.c.g.a().b()) {
                return null;
            }
            d = this.b.b(d);
        }
        if (d.p()) {
            this.t.getAndSet(true);
            TXCLog.d("VideoDecAndDemuxPreview", "==================preview decode Video END==========================");
            if (!this.u.get()) {
                TXCLog.d("VideoDecAndDemuxPreview", "-------------- preview Audio NOT END ----------------");
                return d;
            }
            TXCLog.d("VideoDecAndDemuxPreview", "================== VIDEO SEND END OF FILE ==========================" + d.toString());
        }
        this.N = d;
        this.K = this.N.e() / 1000;
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        this.L = System.currentTimeMillis();
        this.K = this.N.t() / 1000;
        return Math.abs(this.K - this.I) < this.L - this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() throws InterruptedException {
        boolean c;
        if (this.r.get()) {
            TXCLog.d("VideoDecAndDemuxPreview", "readVideoFrame, read video end of file, ignore");
            return;
        }
        com.tencent.liteav.d.e c2 = this.b.c();
        if (c2 == null) {
            return;
        }
        if ((this.D == 3 || this.D == 2) && this.g.get() <= this.B && this.a.r() >= this.C) {
            this.a.a(this.B);
            this.D--;
            this.E = true;
        }
        com.tencent.liteav.d.e a2 = this.a.a(c2);
        if (this.A <= 0) {
            this.A = j();
            if (this.A != 0) {
                this.G = (1000 / this.A) * 1000;
            }
        }
        if (a2 != null) {
            if (this.E) {
                a2.a(this.F + this.G);
            }
            this.F = a2.e();
            if (this.H < 0) {
                this.H = this.F;
            }
            if (com.tencent.liteav.c.g.a().b()) {
                if (a2.p()) {
                    this.F = a(a2);
                    this.H = this.F;
                }
                c = a(this.F, this.G, a2);
                if (!c) {
                    long abs = Math.abs(this.H - this.F);
                    TXCLog.d("VideoDecAndDemuxPreview", "reverse newVPts = " + abs + ", mFirstVideoReadPTS = " + this.H + ", curFixFrame.getSampleTime() = " + this.F);
                    a2.a(abs);
                    a2.c(abs);
                    a2.d(this.F);
                }
            } else {
                c = this.a.c(a2);
            }
            if (c) {
                this.r.set(true);
                TXCLog.i("VideoDecAndDemuxPreview", "read video end");
            }
            this.l.put(a2.e(), a2);
            this.b.a(a2);
        }
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
                    aa.this.b();
                    aa.this.p.sendEmptyMessage(202);
                    return;
                case 202:
                    TXCLog.i("VideoDecAndDemuxPreview", "avsync audio frame start AudioDecodeHandler, mCurrentState = " + aa.this.v + ", mAudioDecodeEOF = " + aa.this.u);
                    while (aa.this.v.get() != 1 && !aa.this.u.get()) {
                        try {
                            if (aa.this.v.get() == 3) {
                                aa.this.w = null;
                                aa.this.O = -1L;
                                Thread.sleep(10L);
                            } else if (aa.this.y) {
                                aa.this.v();
                                aa.this.w();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            if (aa.this.v.get() != 1) {
                            }
                        }
                    }
                    aa.this.w = null;
                    aa.this.O = -1L;
                    if (aa.this.v.get() == 1) {
                        TXCLog.d("VideoDecAndDemuxPreview", "AudioDecodeHandler, loop decode end state is init, ignore to stop");
                        return;
                    }
                    TXCLog.i("VideoDecAndDemuxPreview", "AudioDecodeHandler, in MSG_AUDIO_DECODE_START, send MSG_AUDIO_DECODE_STOP");
                    aa.this.p.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
                    return;
                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                    TXCLog.i("VideoDecAndDemuxPreview", "AudioDecodeHandler, audio decode stop!");
                    aa.this.p.removeMessages(202);
                    if (aa.this.c != null) {
                        aa.this.c.b();
                        aa.this.c = null;
                        return;
                    }
                    return;
                case TbsListener.ErrorCode.APK_INVALID /* 204 */:
                    aa.this.w = null;
                    aa.this.O = -1L;
                    aa.this.p.removeMessages(202);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v() {
        if (this.s.get()) {
            return;
        }
        com.tencent.liteav.d.e c = this.c.c();
        if (c == null) {
            return;
        }
        com.tencent.liteav.d.e b2 = this.a.b(c);
        if (b2 != null) {
            if (this.a.d(b2)) {
                this.s.set(true);
                TXCLog.d("VideoDecAndDemuxPreview", "audio endOfFile:" + this.s.get());
                TXCLog.i("VideoDecAndDemuxPreview", "read audio end");
            }
            this.m.put(b2.e(), b2);
            this.c.a(b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        com.tencent.liteav.d.e d = this.c.d();
        if (d == null) {
            return;
        }
        if (d.o() == null) {
            return;
        }
        com.tencent.liteav.d.e eVar = this.m.get(d.e());
        com.tencent.liteav.d.e a2 = eVar != null ? this.c.a(eVar, d) : d;
        if (a2 == null) {
            return;
        }
        if (a2.e() < this.g.get() && !a2.p()) {
            TXCLog.d("VideoDecAndDemuxPreview", "AudioFrame pts :" + a2.e() + " before  startTime (" + this.g + CommonConstant.Symbol.BRACKET_RIGHT);
            return;
        }
        if (a2.e() > this.h.get()) {
            TXCLog.d("VideoDecAndDemuxPreview", "AudioFrame pts :" + a2.e() + " after  duration (" + this.h + CommonConstant.Symbol.BRACKET_RIGHT);
            a2 = this.c.b(a2);
        }
        if (a2.p()) {
            this.u.set(true);
            TXCLog.d("VideoDecAndDemuxPreview", "==================preview decode Audio END==========================");
            if (!this.t.get()) {
                TXCLog.d("VideoDecAndDemuxPreview", "-------------- preview VIDEO NOT END ----------------");
                return;
            }
            TXCLog.d("VideoDecAndDemuxPreview", "================== AUDIO SEND END OF FILE ==========================" + a2.toString());
        }
        if (this.w == null) {
            this.w = d;
            this.O = System.currentTimeMillis();
            TXCLog.d("VideoDecAndDemuxPreview", "avsync first audio frame ts : " + this.w.e() + ", first systime : " + this.O);
        }
        if (this.z == -1) {
            this.z = System.currentTimeMillis();
        }
        if (this.e != null) {
            this.e.a(a2);
        }
        this.w = a2;
        this.z = System.currentTimeMillis();
    }

    public boolean q() {
        return this.t.get();
    }
}
