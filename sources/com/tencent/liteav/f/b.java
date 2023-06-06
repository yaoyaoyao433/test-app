package com.tencent.liteav.f;

import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.videoediter.audio.TXJNIAudioResampler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private double A;
    public com.tencent.liteav.d.e a;
    private com.tencent.liteav.videoediter.audio.d c;
    private com.tencent.liteav.videoediter.audio.e d;
    private TXJNIAudioResampler e;
    private com.tencent.liteav.videoediter.audio.c f;
    private com.tencent.liteav.editer.j g;
    private int h;
    private int i;
    private float p;
    private HandlerThread s;
    private a t;
    private String x;
    private long y;
    private double z;
    private final String b = "AudioPreprocessChain";
    private long k = -1;
    private long l = -1;
    private int m = 0;
    private Object w = new Object();
    private LinkedList<Long> j = new LinkedList<>();
    private com.tencent.liteav.c.b n = com.tencent.liteav.c.b.a();
    private g q = g.a();
    private AtomicBoolean u = new AtomicBoolean(false);
    private final AtomicBoolean v = new AtomicBoolean(false);
    private boolean r = true;
    private com.tencent.liteav.d.b o = new com.tencent.liteav.d.b();

    public b(String str) {
        this.x = str + "Bgm";
    }

    public void a() {
        TXCLog.i("AudioPreprocessChain", "initFilter");
        this.e = new TXJNIAudioResampler();
        this.d = new com.tencent.liteav.videoediter.audio.e();
        synchronized (this.w) {
            this.f = new com.tencent.liteav.videoediter.audio.c();
        }
        this.c = new com.tencent.liteav.videoediter.audio.d();
        this.p = 1.0f;
        this.e.setSpeed(this.p);
    }

    public void b() {
        TXCLog.i("AudioPreprocessChain", "destroyFilter");
        this.k = -1L;
        this.l = -1L;
        this.m = 0;
        if (this.e != null) {
            this.e.destroy();
            this.e = null;
        }
        synchronized (this.w) {
            if (this.f != null) {
                this.f.d();
                this.f = null;
            }
        }
        if (this.d != null) {
            this.d = null;
        }
        if (this.j != null) {
            this.j.clear();
        }
    }

    public void a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            TXCLog.e("AudioPreprocessChain", "setAudioFormat audioFormat is null");
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.o.b = mediaFormat.getInteger("sample-rate");
            this.o.a = mediaFormat.getInteger("channel-count");
            TXCLog.i("AudioPreprocessChain", "setAudioFormat sampleRate:" + this.o.b);
            TXCLog.i("AudioPreprocessChain", "setAudioFormat channelCount:" + this.o.a);
        }
        if (this.h != 0 && this.i != 0) {
            this.e.setChannelCount(this.o.a);
            this.d.a(this.h, this.o.a);
            this.e.setSampleRate(this.i, this.o.b);
        }
        if (this.f != null) {
            this.f.a(mediaFormat);
        }
    }

    public void c() {
        TXCLog.i("AudioPreprocessChain", "start");
        if (TextUtils.isEmpty(this.n.a)) {
            this.n.h = false;
            return;
        }
        this.n.h = true;
        this.u.set(true);
        a(this.n.a);
        if (this.n.b != -1 && this.n.c != -1) {
            a(this.n.b, this.n.c);
        }
        a(this.n.e);
        a(this.n.f);
        b(this.n.g);
        a(this.n.d);
        this.z = 0.0d;
        if (this.n.i) {
            k();
        }
    }

    private void k() {
        if (this.n.k <= 0) {
            return;
        }
        if (this.n.e) {
            this.A = this.y / 1000000.0d;
            TXCLog.i("AudioPreprocessChain", "getBgmEndTimePts, is loop, mBgmEndTimeSec = " + this.A);
            return;
        }
        long j = (this.n.c * 1000) - (this.n.b * 1000);
        this.A = (this.y > j ? j : this.y) / 1000000.0d;
        TXCLog.i("AudioPreprocessChain", "getBgmEndTimePts, not loop, mVideoDurationUs = " + this.y + ", bgmDurationUs = " + j + ", so mBgmEndTimeSec = " + this.A);
    }

    public void d() {
        TXCLog.i("AudioPreprocessChain", "stop");
        if (this.r) {
            return;
        }
        if (this.t != null) {
            this.t.removeCallbacksAndMessages(null);
            this.s.quit();
        }
        this.v.set(true);
        this.s = null;
        this.t = null;
    }

    public int e() {
        if (!this.r) {
            if (this.s == null) {
                this.s = new HandlerThread(this.x);
                this.s.start();
                this.t = new a(this.s.getLooper());
            }
            this.v.set(false);
            this.t.sendEmptyMessage(10000);
            return 0;
        }
        TXCLog.w("AudioPreprocessChain", "tryStartAddBgmForNoAudioTrack, this has audio track, ignore!");
        return -1;
    }

    public void f() {
        TXCLog.i("AudioPreprocessChain", "pause");
        this.u.set(false);
    }

    public void g() {
        TXCLog.i("AudioPreprocessChain", "resume");
        this.u.set(true);
    }

    public int a(String str) {
        int i;
        try {
            i = this.f.a(str);
        } catch (IOException e) {
            TXCLog.e("AudioPreprocessChain", "set bgm failed.", e);
            i = -1;
        }
        this.f.a();
        if (!TextUtils.isEmpty(str)) {
            this.n.h = true;
        } else {
            this.n.h = false;
        }
        return i;
    }

    public void a(long j, long j2) {
        if (this.f != null) {
            this.f.a(j, j2);
        }
    }

    public void a(boolean z) {
        if (this.f != null) {
            this.f.a(z);
        }
    }

    public void a(long j) {
        this.n.d = j;
    }

    public void a(float f) {
        if (this.f != null) {
            this.f.b(f);
        }
    }

    public void b(float f) {
        if (this.f != null) {
            this.f.a(f);
        }
    }

    public void b(long j) {
        this.y = j;
    }

    public MediaFormat h() {
        return this.f.e();
    }

    public void a(com.tencent.liteav.editer.j jVar) {
        this.g = jVar;
    }

    public void a(com.tencent.liteav.d.e eVar) {
        if (eVar == null) {
            TXCLog.d("AudioPreprocessChain", "processFrame, frame is null");
        } else if (eVar.q() || eVar.r()) {
            TXCLog.d("AudioPreprocessChain", "processFrame, frame is isUnNormallFrame");
            if (this.g != null) {
                this.g.a(eVar);
            }
        } else if (eVar.p()) {
            TXCLog.i("AudioPreprocessChain", "processFrame, frame is end");
            if (this.g != null) {
                this.g.a(eVar);
            }
        } else {
            if (!this.q.c() && this.i == this.o.b) {
                this.j.add(Long.valueOf(eVar.e()));
            } else {
                this.p = this.q.a(eVar.e());
                this.e.setSpeed(this.p);
                if (this.k == -1) {
                    this.k = eVar.e();
                }
                this.j.add(l());
            }
            com.tencent.liteav.d.e a2 = a(eVar.b(), b(eVar));
            if (this.g != null) {
                this.g.a(a2);
            }
        }
    }

    public void i() {
        if (this.e != null) {
            short[] flushBuffer = this.e.flushBuffer();
            if (this.i != this.o.b && this.o.a == 2 && flushBuffer != null) {
                this.d.a(1, 2);
                flushBuffer = this.d.a(flushBuffer);
            }
            com.tencent.liteav.d.e eVar = null;
            if (flushBuffer != null && flushBuffer.length > 0) {
                this.j.add(Long.valueOf(l().longValue()));
                eVar = a((ByteBuffer) null, flushBuffer);
            }
            if (eVar == null || this.g == null) {
                return;
            }
            this.g.a(eVar);
        }
    }

    private Long l() {
        long j;
        if (this.m == 0) {
            j = this.k;
        } else {
            j = (this.o == null || this.o.b == 0) ? 0L : this.k + ((this.m * 1024000000) / this.o.b);
        }
        this.m++;
        return Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(int i) {
        long j;
        if (this.l == -1) {
            j = this.k;
        } else {
            j = this.l;
        }
        this.l = ((i * 1000000) / ((this.o.b * this.o.a) * 2)) + j;
        return j;
    }

    private com.tencent.liteav.d.e a(ByteBuffer byteBuffer, short[] sArr) {
        short[] a2;
        if (sArr == null || sArr.length == 0) {
            return null;
        }
        if (this.j == null || this.j.size() == 0) {
            TXCLog.i("AudioPreprocessChain", "doMixer mTimeQueue:" + this.j);
            return null;
        }
        long longValue = this.j.pollFirst().longValue();
        if (this.n.h) {
            if (longValue >= this.n.d) {
                this.f.a(b(sArr.length * 2));
                a2 = this.f.a(sArr);
            } else {
                this.c.a(this.n.f);
                a2 = this.c.a(sArr);
            }
            return a(byteBuffer, a2, longValue);
        }
        this.c.a(this.n.f);
        return a(byteBuffer, this.c.a(sArr), longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float b(int i) {
        double d;
        if (!this.n.i) {
            return this.n.g;
        }
        this.z += i / ((this.o.b * this.o.a) * 2.0d);
        float f = ((float) this.n.j) / 1000.0f;
        float f2 = ((float) this.n.k) / 1000.0f;
        if (this.n.j > 0 && this.z <= f) {
            d = Math.log10(this.z + 1.0d) / Math.log10(Math.pow(10.0d, Math.log10(f + 1.0f) / 1.0d));
        } else if (this.n.k <= 0 || this.z < this.A - f2) {
            d = 1.0d;
        } else {
            d = Math.log10((this.A + 1.0d) - this.z) / Math.log10(Math.pow(10.0d, Math.log10(f2 + 1.0f) / 1.0d));
        }
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        return (float) (this.n.g * d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.d.e a(ByteBuffer byteBuffer, short[] sArr, long j) {
        ByteBuffer a2 = com.tencent.liteav.videoediter.audio.b.a(byteBuffer, sArr);
        com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e();
        eVar.d(sArr.length * 2);
        eVar.a(a2);
        eVar.h(this.o.a);
        eVar.g(this.o.b);
        eVar.b(j);
        eVar.a(j);
        return eVar;
    }

    private short[] b(com.tencent.liteav.d.e eVar) {
        c(eVar);
        short[] a2 = com.tencent.liteav.videoediter.audio.b.a(eVar.b(), eVar.g());
        if (this.i != this.o.b && this.o.a == 2) {
            if (this.h == 2) {
                this.d.a(2, 1);
                if (a2 != null) {
                    a2 = this.d.a(a2);
                }
            }
            if (this.p != 1.0f || this.i != this.o.b) {
                a2 = this.e.resample(a2);
            }
            if (a2 != null) {
                this.d.a(1, 2);
                return this.d.a(a2);
            }
            return a2;
        }
        if (this.h != this.o.a) {
            a2 = this.d.a(a2);
        }
        return (this.p == 1.0f && this.i == this.o.b) ? a2 : this.e.resample(a2);
    }

    private void c(com.tencent.liteav.d.e eVar) {
        if (this.h != eVar.k()) {
            this.h = eVar.k();
            TXCLog.i("AudioPreprocessChain", "setAudioFormat initResampler setChannelCount");
            this.e.setChannelCount(this.o.a);
            this.d.a(this.h, this.o.a);
        }
        if (this.i != eVar.j()) {
            this.i = eVar.j();
            TXCLog.i("AudioPreprocessChain", "setAudioFormat initResampler setSampleRate");
            this.e.setSampleRate(this.i, this.o.b);
        }
    }

    public void b(boolean z) {
        this.r = z;
    }

    public void c(boolean z) {
        this.u.set(z);
    }

    public boolean j() {
        return this.v.get();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            a();
        }

        private void a() {
            com.tencent.liteav.d.e c;
            boolean b;
            if (b.this.v.get()) {
                return;
            }
            if (b.this.u.get()) {
                synchronized (b.this.w) {
                    c = b.this.f.c();
                    b = b.this.f.b();
                }
                if (c == null && b) {
                    b.this.v.set(true);
                    com.tencent.liteav.d.e b2 = b();
                    if (b.this.g != null) {
                        b.this.g.a(b2);
                        return;
                    }
                }
                if (c != null && c.b() != null) {
                    float b3 = b.this.b(c.g());
                    TXCLog.d("AudioPreprocessChain", "BgmHandler, bgmVolume = " + b3);
                    if (b3 != 1.0f) {
                        b.this.c.a(b3);
                        c = b.this.a(c.b(), b.this.c.a(com.tencent.liteav.videoediter.audio.b.a(c.b(), c.g())), c.e());
                    }
                    long a = b.this.a(c.g());
                    if (a == -1) {
                        a = 0;
                    }
                    c.a(a);
                    TXCLog.d("AudioPreprocessChain", "BgmHandler pts:" + a + ", duration:" + b.this.y);
                    if (b.this.y == 0 && b.this.a != null) {
                        b.this.y = b.this.a.e();
                    }
                    if (a >= b.this.y) {
                        b.this.v.set(true);
                        com.tencent.liteav.d.e b4 = b();
                        if (b.this.g != null) {
                            b.this.g.a(b4);
                            return;
                        }
                    }
                    c.a(a);
                    if (b.this.g != null) {
                        b.this.g.a(c);
                    }
                }
                sendEmptyMessageDelayed(10000, 10L);
                return;
            }
            sendEmptyMessageDelayed(10000, 10L);
        }

        private com.tencent.liteav.d.e b() {
            com.tencent.liteav.d.e eVar = new com.tencent.liteav.d.e();
            eVar.d(0);
            eVar.a(0L);
            eVar.c(4);
            return eVar;
        }
    }
}
