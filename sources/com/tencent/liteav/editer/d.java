package com.tencent.liteav.editer;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public abstract class d extends c {
    protected AtomicInteger A;
    protected b B;
    protected HandlerThread C;
    protected a D;
    protected HandlerThread E;
    protected com.tencent.liteav.d.e G;
    protected com.tencent.liteav.d.e H;
    protected int I;
    protected int L;
    protected long N;
    protected int O;
    protected AtomicBoolean S;
    protected AtomicBoolean T;
    protected List<Long> U;
    protected int V;
    protected int W;
    protected AtomicBoolean X;
    private com.tencent.liteav.g.e aa;
    private long ab;
    private long ac;
    protected AtomicBoolean w;
    protected AtomicBoolean x;
    protected AtomicBoolean y;
    protected AtomicBoolean z;
    private final String Y = "BasicVideoDecDemuxGenerater";
    protected final int k = 5;
    protected final int l = 6;
    protected final int m = 7;
    protected final int n = 8;
    protected final int o = 9;
    protected final int p = 10;
    protected final int q = 11;
    protected final int r = 12;
    protected final int s = 13;
    protected final int t = 14;
    protected volatile boolean F = true;
    protected long J = 0;
    protected long K = 0;
    protected boolean M = false;
    protected long P = -1;
    protected long Q = -1;
    protected long R = -1;
    private long Z = -1;
    protected Vector<com.tencent.liteav.d.e> v = new Vector<>();
    protected Vector<com.tencent.liteav.d.e> u = new Vector<>();

    public abstract void a(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void l();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void m();

    public d() {
        this.g = new AtomicLong(0L);
        this.h = new AtomicLong(0L);
        this.A = new AtomicInteger(1);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
        this.z = new AtomicBoolean(false);
        this.S = new AtomicBoolean(false);
        this.T = new AtomicBoolean(false);
    }

    public int n() {
        return this.a.f();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.tencent.liteav.d.e c;
            int i = message.what;
            if (i == 105) {
                a(message.arg1);
                getLooper().quit();
                return;
            }
            switch (i) {
                case 5:
                    if (d.this.U == null || d.this.U.size() == 0) {
                        return;
                    }
                    d.this.a();
                    d.this.V = 0;
                    d.this.W = 0;
                    d.this.B.sendEmptyMessage(6);
                    return;
                case 6:
                    if (d.this.W >= d.this.U.size()) {
                        return;
                    }
                    if (d.this.Z < 0) {
                        if (d.this.V < d.this.U.size()) {
                            d.this.Z = d.this.U.get(d.this.V).longValue();
                            d.this.a.a(d.this.Z);
                            TXCLog.i("BasicVideoDecDemuxGenerater", "VideoDecodeHandler, get pts = " + d.this.Z + ", mVideoGivenPtsInputIndex = " + d.this.V);
                        } else {
                            d.this.Z = 0L;
                        }
                    }
                    if (d.this.Z >= 0 && (c = d.this.b.c()) != null) {
                        if (d.this.V < d.this.U.size()) {
                            d.this.V++;
                            com.tencent.liteav.d.e a = d.this.a.a(c);
                            if (a != null) {
                                d.this.b.a(a);
                            }
                            TXCLog.i("BasicVideoDecDemuxGenerater", "VideoDecodeHandler, freeFrame exist");
                        } else {
                            TXCLog.i("BasicVideoDecDemuxGenerater", "VideoDecodeHandler, isReadGivenTimeEnd, set end flag");
                            c.a(0L);
                            c.c(4);
                            d.this.b.a(c);
                        }
                        d.this.Z = -1L;
                    }
                    if (!d.this.X.get()) {
                        d.this.B.sendEmptyMessageDelayed(6, 5L);
                        return;
                    }
                    com.tencent.liteav.d.e d = d.this.b.d();
                    if (d == null) {
                        d.this.B.sendEmptyMessageDelayed(6, 5L);
                        return;
                    }
                    d.e(d.this.n());
                    d.j(d.this.d());
                    d.k(d.this.e());
                    d.this.c(d);
                    d.this.W++;
                    d.this.X.set(false);
                    if (d.this.W >= d.this.U.size()) {
                        TXCLog.i("BasicVideoDecDemuxGenerater", "VideoDecodeHandler, decode end");
                        d.this.B.sendEmptyMessage(7);
                        return;
                    }
                    d.this.B.sendEmptyMessageDelayed(6, 5L);
                    return;
                case 7:
                    d.this.B.removeMessages(6);
                    if (d.this.b != null) {
                        d.this.b.b();
                        d.this.b = null;
                    }
                    d.this.A.set(1);
                    return;
                case 8:
                    if (d.this.U == null || d.this.U.size() == 0) {
                        return;
                    }
                    d.this.q();
                    d.this.a();
                    d.this.V = 0;
                    d.this.W = 0;
                    d.this.ab = 0L;
                    d.this.ac = 0L;
                    sendEmptyMessage(9);
                    return;
                case 9:
                    if (d.this.W >= d.this.U.size()) {
                        return;
                    }
                    if (d.this.V < d.this.U.size()) {
                        d.this.Z = d.this.U.get(d.this.V).longValue();
                        if (d.this.ab < d.this.Z) {
                            d.this.ac = d.this.ab;
                            d.this.aa.b(d.this.ac + 1);
                            d.this.ab = d.this.aa.p();
                            TXCLog.i("BasicVideoDecDemuxGenerater", "nextSyncTime:" + d.this.ab + ",lastSyncTime" + d.this.ac + ",mGivenPts:" + d.this.Z);
                            if (d.this.ab == -1 || d.this.ab == d.this.ac) {
                                d.this.ab = d.this.ac;
                                TXCLog.i("BasicVideoDecDemuxGenerater", "seek lastSyncTime:" + d.this.ac + ",index:" + d.this.V);
                                sendEmptyMessage(10);
                                return;
                            }
                            sendEmptyMessage(9);
                            return;
                        }
                        TXCLog.i("BasicVideoDecDemuxGenerater", "seek lastSyncTime:" + d.this.ac + ",index:" + d.this.V);
                        d.this.a.b(d.this.ac);
                        sendEmptyMessage(10);
                        d.this.ab = d.this.ac;
                        return;
                    }
                    sendEmptyMessage(11);
                    return;
                case 10:
                    try {
                        if (d.this.b == null) {
                            return;
                        }
                        d.this.s();
                        com.tencent.liteav.d.e r = d.this.r();
                        if (r == null) {
                            sendEmptyMessageDelayed(10, 5L);
                            return;
                        }
                        r.j(d.this.d());
                        r.k(d.this.e());
                        if (r.p()) {
                            d.this.c(r);
                            sendEmptyMessage(11);
                            return;
                        } else if (r.e() >= d.this.Z) {
                            d.this.c(r);
                            d.this.V++;
                            sendEmptyMessage(9);
                            return;
                        } else {
                            sendEmptyMessage(10);
                            return;
                        }
                    } catch (Exception e) {
                        TXCLog.e("BasicVideoDecDemuxGenerater", "decode thumbnail failed.", e);
                        return;
                    }
                case 11:
                    d.this.B.removeMessages(10);
                    if (d.this.b != null) {
                        d.this.b.b();
                        d.this.b = null;
                    }
                    d.this.A.set(1);
                    return;
                default:
                    switch (i) {
                        case 101:
                            d.this.a();
                            if (com.tencent.liteav.c.g.a().b()) {
                                d.this.a.a(d.this.h.get());
                                TXCLog.i("BasicVideoDecDemuxGenerater", "VideoDecodeHandler, reverse, seekVideo time = " + d.this.h);
                            }
                            d.this.B.sendEmptyMessage(102);
                            return;
                        case 102:
                            try {
                                if (d.this.b == null) {
                                    return;
                                }
                                d.this.s();
                                com.tencent.liteav.d.e r2 = d.this.r();
                                if (r2 != null) {
                                    com.tencent.liteav.d.e e2 = d.this.e(r2);
                                    if (!e2.p()) {
                                        d.this.c(e2);
                                        return;
                                    }
                                    TXCLog.i("BasicVideoDecDemuxGenerater", "is end video frame, to stop decode, mAudioDecodeEOF = " + d.this.z);
                                    if (!d.this.h() || d.this.z.get()) {
                                        d.this.c(e2);
                                    } else {
                                        d.this.H = e2;
                                    }
                                    d.this.B.sendEmptyMessage(103);
                                    return;
                                }
                                d.this.B.sendEmptyMessage(102);
                                return;
                            } catch (Exception e3) {
                                TXCLog.e("BasicVideoDecDemuxGenerater", "video decode failed.", e3);
                                return;
                            }
                        case 103:
                            TXCLog.i("BasicVideoDecDemuxGenerater", "VideoDecodeHandler, video decode stop!");
                            a(14);
                            return;
                        default:
                            return;
                    }
            }
        }

        private void a(int i) {
            if (14 == i) {
                d.this.B.removeMessages(102);
                d.this.Q = -1L;
                d.this.S.set(false);
            }
            if (13 == i) {
                d.this.B.removeMessages(6);
                d.this.A.set(1);
            }
            if (12 == i) {
                d.this.B.removeMessages(10);
                d.this.A.set(1);
            }
            if (d.this.b != null) {
                d.this.b.b();
                d.this.b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.aa = new com.tencent.liteav.g.e();
        this.aa.a(this.j);
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
                    d.this.b();
                    d.this.D.sendEmptyMessage(202);
                    return;
                case 202:
                    break;
                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                    TXCLog.i("BasicVideoDecDemuxGenerater", "AudioDecodeHandler, audio decode stop!");
                    d.this.D.removeMessages(202);
                    if (d.this.c != null) {
                        d.this.c.b();
                        d.this.c = null;
                        return;
                    }
                    return;
                case TbsListener.ErrorCode.APK_INVALID /* 204 */:
                default:
                    return;
                case TbsListener.ErrorCode.UNZIP_DIR_ERROR /* 205 */:
                    d.this.D.removeMessages(202);
                    if (d.this.c != null) {
                        d.this.c.b();
                        d.this.c = null;
                    }
                    getLooper().quit();
                    return;
            }
            while (d.this.A.get() != 1 && !d.this.z.get()) {
                if (d.this.F) {
                    d.this.t();
                    com.tencent.liteav.d.e u = d.this.u();
                    if (u != null) {
                        com.tencent.liteav.d.e b = d.this.b(u);
                        if (!b.p()) {
                            d.this.d(b);
                        } else {
                            TXCLog.i("BasicVideoDecDemuxGenerater", "is end audio frame, to stop decode, mVideoDecodeEOF = " + d.this.y);
                            if (d.this.y.get()) {
                                d.this.d(b);
                                if (d.this.H.p()) {
                                    d.this.c(d.this.H);
                                }
                            }
                            d.this.D.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) {
        if (com.tencent.liteav.c.g.a().b()) {
            if (this.R < 0) {
                this.R = eVar.e();
            }
            this.P = eVar.e();
            long j = this.P - this.R;
            TXCLog.i("BasicVideoDecDemuxGenerater", "processReverseAudioFrame newVPts = " + j + ", mFirstAudioFramePTS = " + this.R + ", curAudioFrame pts = " + this.P);
            eVar.a(j);
            return eVar;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.tencent.liteav.d.e eVar) {
        if (this.f != null) {
            this.f.a(eVar);
        }
        this.H = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.tencent.liteav.d.e eVar) {
        if (this.e != null) {
            this.e.a(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e e(com.tencent.liteav.d.e eVar) {
        if (this.H == null) {
            TXCLog.i("BasicVideoDecDemuxGenerater", "processSpeedFrame, mLastVideoFrame is null");
            return eVar;
        } else if (!eVar.p() && com.tencent.liteav.f.g.a().c()) {
            eVar.b(this.H.t() + (((float) (eVar.e() - this.H.e())) / com.tencent.liteav.f.g.a().a(eVar.e())));
            return eVar;
        } else {
            return eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j) {
        if (this.T.get()) {
            TXCLog.e("BasicVideoDecDemuxGenerater", "seekPosition, had seeked");
            return;
        }
        TXCLog.d("BasicVideoDecDemuxGenerater", "======================prepare to seek video & audio starting point=====================mStartTime = " + this.g);
        this.a.a(j);
        long p = this.a.p();
        this.a.c(p);
        long q = this.a.q();
        TXCLog.d("BasicVideoDecDemuxGenerater", "==============startVdts==========" + p);
        TXCLog.d("BasicVideoDecDemuxGenerater", "==============startAdts==========" + q);
        this.T.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e r() {
        com.tencent.liteav.d.e h;
        long e;
        com.tencent.liteav.d.e d = this.b.d();
        if (d == null || d.o() == null) {
            return null;
        }
        if (d.p()) {
            TXCLog.i("BasicVideoDecDemuxGenerater", "getDecodeVideoFrame, is end frame");
            d.j(d());
            d.k(e());
            this.y.getAndSet(true);
            return d;
        } else if (this.u.size() == 0) {
            return d;
        } else {
            com.tencent.liteav.d.e remove = this.u.remove(0);
            if (remove != null) {
                h = this.b.a(remove, d);
            } else {
                h = com.tencent.liteav.c.k.a().h();
            }
            if (h == null) {
                return null;
            }
            if (com.tencent.liteav.c.g.a().b()) {
                h.a(remove.v());
                h.c(remove.u());
                e = remove.v();
            } else {
                e = h.e();
            }
            if (e < this.g.get()) {
                TXCLog.d("BasicVideoDecDemuxGenerater", "VideoFrame pts :" + e + " before  startTime (" + this.g + CommonConstant.Symbol.BRACKET_RIGHT);
                return null;
            }
            if (e > this.h.get()) {
                TXCLog.d("BasicVideoDecDemuxGenerater", "VideoFrame pts :" + e + " after  duration (" + this.h + CommonConstant.Symbol.BRACKET_RIGHT);
                if (com.tencent.liteav.c.g.a().b()) {
                    return null;
                }
                h = this.b.b(h);
            }
            if (h.p()) {
                this.y.getAndSet(true);
                TXCLog.d("BasicVideoDecDemuxGenerater", "==================generate decode Video END==========================");
                if (!this.z.get()) {
                    TXCLog.d("BasicVideoDecDemuxGenerater", "-------------- generate Audio NOT END ----------------");
                    return h;
                }
                TXCLog.d("BasicVideoDecDemuxGenerater", "================== VIDEO SEND END OF FILE ==========================" + h.toString());
            }
            return h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        boolean c;
        if (this.w.get()) {
            TXCLog.e("BasicVideoDecDemuxGenerater", "readVideoFrame, read video end of file, ignore");
            return;
        }
        com.tencent.liteav.d.e c2 = this.b.c();
        if (c2 == null) {
            return;
        }
        if ((this.L == 3 || this.L == 2) && this.a.r() >= this.K) {
            this.a.a(this.J);
            this.L--;
            this.M = true;
        }
        com.tencent.liteav.d.e a2 = this.a.a(c2);
        if (this.I <= 0) {
            this.I = j();
            if (this.I != 0) {
                this.O = (1000 / this.I) * 1000;
            }
        }
        if (a2 != null) {
            if (this.M) {
                a2.a(this.N + this.O);
            }
            this.N = a2.e();
            if (this.Q < 0) {
                this.Q = this.N;
            }
            if (com.tencent.liteav.c.g.a().b()) {
                if (a2.p()) {
                    this.N = a(a2);
                    this.Q = this.N;
                }
                c = a(this.N, this.O, a2);
                if (!c) {
                    long abs = Math.abs(this.Q - this.N);
                    TXCLog.d("BasicVideoDecDemuxGenerater", "reverse newVPts = " + abs + ", mFirstVideoFramePTS = " + this.Q + ", curFixFrame.getSampleTime() = " + this.N);
                    a2.a(abs);
                    a2.c(abs);
                    a2.d(this.N);
                }
            } else {
                c = this.a.c(a2);
            }
            if (c) {
                this.w.set(true);
                TXCLog.i("BasicVideoDecDemuxGenerater", "read video end");
            }
            this.u.add(a2);
            this.b.a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.tencent.liteav.d.e c;
        com.tencent.liteav.d.e b2;
        if (this.x.get() || (c = this.c.c()) == null || (b2 = this.a.b(c)) == null) {
            return;
        }
        if (this.a.d(b2)) {
            this.x.set(true);
            TXCLog.d("BasicVideoDecDemuxGenerater", "audio endOfFile:" + this.x.get());
            TXCLog.i("BasicVideoDecDemuxGenerater", "read audio end");
        }
        this.v.add(b2);
        this.c.a(b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e u() {
        com.tencent.liteav.d.e d = this.c.d();
        if (d == null || d.o() == null) {
            return null;
        }
        if (this.v.size() == 0) {
            return d;
        }
        com.tencent.liteav.d.e remove = this.v.remove(0);
        com.tencent.liteav.d.e a2 = remove != null ? this.c.a(remove, d) : d;
        if (a2 == null) {
            return null;
        }
        if (a2.e() < this.g.get() && !a2.p()) {
            TXCLog.d("BasicVideoDecDemuxGenerater", "AudioFrame pts :" + a2.e() + " before  startTime (" + this.g + CommonConstant.Symbol.BRACKET_RIGHT);
            return null;
        }
        if (a2.e() > this.h.get()) {
            TXCLog.d("BasicVideoDecDemuxGenerater", "AudioFrame pts :" + a2.e() + " after  duration (" + this.h + CommonConstant.Symbol.BRACKET_RIGHT);
            a2 = this.c.b(a2);
        }
        if (a2.p()) {
            this.z.set(true);
            TXCLog.d("BasicVideoDecDemuxGenerater", "==================generate decode Audio END==========================");
            if (!this.y.get()) {
                TXCLog.d("BasicVideoDecDemuxGenerater", "-------------- generate VIDEO NOT END ----------------");
                return a2;
            }
            TXCLog.d("BasicVideoDecDemuxGenerater", "================== AUDIO SEND END OF FILE ==========================" + a2.toString());
        }
        if (this.G == null) {
            this.G = d;
            TXCLog.d("BasicVideoDecDemuxGenerater", "first AUDIO pts:" + this.G.e());
        }
        this.G = a2;
        return a2;
    }

    public void a(long j, long j2) {
        this.g.getAndSet(j);
        this.h.getAndSet(j2);
    }

    public void b(long j, long j2) {
        if (j == 0 && j2 == 0) {
            this.L = 0;
            this.M = false;
        } else {
            this.L = 3;
        }
        this.J = j;
        this.K = j2;
        this.N = 0L;
    }

    public void a(List<Long> list) {
        TXCLog.i("BasicVideoDecDemuxGenerater", "setVideoGivenPtsList :" + list.size());
        if (this.U != null) {
            this.U.clear();
            this.U.addAll(list);
        }
    }

    public boolean o() {
        return this.y.get();
    }

    public void p() {
        if (this.A.get() == 1) {
            TXCLog.e("BasicVideoDecDemuxGenerater", "getNextVideoFrame, current state is init, ignore");
        } else {
            this.B.sendEmptyMessage(102);
        }
    }

    public void b(boolean z) {
        this.F = z;
    }
}
