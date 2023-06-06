package com.tencent.liteav.videoediter.audio;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
@TargetApi(18)
/* loaded from: classes6.dex */
public class c {
    public static String[] a = {"audio/mp4a-latm", "audio/mpeg"};
    private MediaFormat c;
    private com.tencent.liteav.g.e d;
    private MediaFormat e;
    private String f;
    private int i;
    private int j;
    private int k;
    private int l;
    private List<com.tencent.liteav.d.e> m;
    private a n;
    private com.tencent.liteav.g.f o;
    private e u;
    private TXSkpResample v;
    private com.tencent.liteav.d.e x;
    private volatile long g = -1;
    private volatile long h = -1;
    private Handler y = new Handler(Looper.getMainLooper());
    private boolean z = true;
    private AtomicBoolean p = new AtomicBoolean(false);
    private AtomicBoolean q = new AtomicBoolean(false);
    private AtomicInteger b = new AtomicInteger(-1);
    private ReentrantLock r = new ReentrantLock();
    private Condition s = this.r.newCondition();
    private Condition t = this.r.newCondition();
    private f w = new f();

    public c() {
        this.w.a(1.0f);
    }

    public void a(float f) {
        this.w.a(f);
    }

    public int a(String str) throws IOException {
        if (this.f != null && !this.f.equals(str)) {
            this.g = -1L;
            this.h = -1L;
        }
        if (TextUtils.isEmpty(str)) {
            d();
            this.e = null;
            return 0;
        }
        if (this.b.get() == 0 || this.b.get() == 1) {
            d();
        }
        this.f = str;
        return f();
    }

    public void a(long j, long j2) {
        this.g = j * 1000;
        this.h = j2 * 1000;
        if (this.d != null) {
            this.d.c(this.g);
        }
        TXCLog.i("TXAudioMixer", "bgm startTime :" + this.g + ",bgm endTime:" + this.h);
    }

    public void b(float f) {
        this.w.b(f);
    }

    public void a(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            TXCLog.e("TXAudioMixer", "target media format can't be null");
            return;
        }
        this.c = mediaFormat;
        this.j = this.c.getInteger("channel-count");
        this.i = this.c.getInteger("sample-rate");
        n();
    }

    private int f() throws IOException {
        boolean z;
        this.b.getAndSet(0);
        o();
        String string = this.e.getString(IMediaFormat.KEY_MIME);
        String[] strArr = a;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str = strArr[i];
            if (string != null && string.equals(str)) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            this.b.getAndSet(2);
            return -1;
        }
        g();
        p();
        n();
        return 0;
    }

    private void g() throws IOException {
        this.o = new com.tencent.liteav.g.f();
        if (this.d != null) {
            this.o.a(this.d.m());
            this.o.a(this.d.m(), (Surface) null);
            this.o.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            a(this.f);
            a();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void a() {
        if (this.b.get() == -1 || this.b.get() == 2) {
            TXCLog.e("TXAudioMixer", "you should set bgm info first");
        } else if (this.b.get() == 1) {
            TXCLog.e("TXAudioMixer", "decode have been started");
        } else {
            this.b.getAndSet(1);
            i();
        }
    }

    public short[] a(short[] sArr) {
        if (this.b.get() != 1) {
            TXCLog.e("TXAudioMixer", "bgm decode not start yet");
            this.w.a(sArr, null);
            return sArr;
        }
        return this.w.a(sArr, a(sArr.length));
    }

    private short[] a(int i) {
        short[] a2;
        com.tencent.liteav.d.e c = c();
        if (c == null || (a2 = a(c)) == null) {
            return null;
        }
        short[] copyOf = Arrays.copyOf(a2, i);
        int length = a2.length;
        if (length >= i) {
            if (length > i) {
                this.x = b(Arrays.copyOfRange(a2, i, a2.length));
                return copyOf;
            } else if (length == i) {
                short[] a3 = a(c);
                this.x = null;
                return a3;
            } else {
                return copyOf;
            }
        }
        while (length < i) {
            com.tencent.liteav.d.e c2 = c();
            if (c2 == null) {
                return null;
            }
            short[] a4 = a(c2);
            if (a4.length + length > i) {
                short[] a5 = a(copyOf, length, a4);
                if (a5 != null) {
                    length += a4.length - a5.length;
                    this.x = b(a5);
                }
            } else {
                a(copyOf, length, a4);
                length += a4.length;
                this.x = null;
            }
        }
        return copyOf;
    }

    private short[] a(com.tencent.liteav.d.e eVar) {
        if (eVar instanceof com.tencent.liteav.videoediter.audio.a) {
            return ((com.tencent.liteav.videoediter.audio.a) eVar).z();
        }
        return b.a(eVar.b(), eVar.g());
    }

    private short[] a(short[] sArr, int i, short[] sArr2) {
        int i2 = 0;
        while (i2 < sArr2.length && i < sArr.length) {
            sArr[i] = sArr2[i2];
            i++;
            i2++;
        }
        if ((sArr2.length - i2) + 1 > 0) {
            return Arrays.copyOfRange(sArr2, i2, sArr2.length);
        }
        return null;
    }

    public boolean b() {
        return !this.z && this.q.get();
    }

    public com.tencent.liteav.d.e c() {
        com.tencent.liteav.d.e remove;
        if (this.x != null) {
            com.tencent.liteav.d.e eVar = this.x;
            this.x = null;
            return eVar;
        } else if (this.z || !this.q.get()) {
            while (this.m != null && this.m.size() == 0) {
                this.r.lock();
                try {
                    try {
                        this.t.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    this.r.unlock();
                }
            }
            if (this.m != null && this.m.size() <= 10) {
                this.r.lock();
                this.s.signal();
            }
            while (true) {
                remove = (!(remove == null || remove.g() == 0) || this.m == null || this.m.size() == 0) ? null : this.m.remove(0);
            }
            return remove;
        } else {
            return null;
        }
    }

    public void d() {
        if (this.b.get() == -1) {
            return;
        }
        this.b.getAndSet(2);
        TXCLog.i("TXAudioMixer", "============================start cancel mix task=============================");
        t();
        r();
        q();
        s();
        this.y.removeCallbacksAndMessages(null);
        TXCLog.i("TXAudioMixer", "============================cancel finish =============================");
    }

    private void i() {
        j();
        this.n = new a();
        this.n.start();
    }

    private void j() {
        if (this.n != null && this.n.isAlive() && !this.n.isInterrupted()) {
            this.n.interrupt();
            this.n = null;
        }
        q();
        p();
        this.p.getAndSet(false);
        this.q.getAndSet(false);
    }

    public MediaFormat e() {
        return this.e;
    }

    public void a(boolean z) {
        this.z = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends Thread {
        public a() {
            super("Mixer-BGM-Decoder-Thread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            TXCLog.i("TXAudioMixer", "================= start thread===================");
            try {
                c.this.k();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (c.this.z && c.this.b.get() == 1) {
                c.this.y.post(new Runnable() { // from class: com.tencent.liteav.videoediter.audio.c.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.h();
                    }
                });
            }
            TXCLog.i("TXAudioMixer", "================= finish thread===================");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() throws Exception {
        com.tencent.liteav.d.e eVar;
        com.tencent.liteav.d.e b;
        TXCLog.i("TXAudioMixer", "================= start decode===================");
        while (true) {
            if (this.b.get() != 1 || Thread.currentThread().isInterrupted()) {
                break;
            } else if (this.q.get()) {
                TXCLog.i("TXAudioMixer", "=================Decoded end===================");
                break;
            } else {
                try {
                    l();
                    eVar = m();
                } catch (Exception unused) {
                    eVar = null;
                }
                if (eVar != null && (b = b(eVar)) != null) {
                    if (this.m != null && this.m.size() == 20) {
                        this.r.lock();
                        try {
                            try {
                                this.s.await();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            this.r.unlock();
                        } finally {
                            this.r.unlock();
                        }
                    }
                    if (this.m != null && this.m.size() == 0) {
                        if (b != null) {
                            this.m.add(b);
                        }
                        this.r.lock();
                        this.t.signal();
                    } else if (this.m != null && b != null) {
                        this.m.add(b);
                    }
                }
            }
        }
        TXCLog.i("TXAudioMixer", "=================decode finish===================");
    }

    private void l() throws InterruptedException {
        com.tencent.liteav.d.e c;
        com.tencent.liteav.d.e b;
        if (this.p.get() || (c = this.o.c()) == null || (b = this.d.b(c)) == null) {
            return;
        }
        if (this.d.d(b)) {
            this.p.getAndSet(true);
            TXCLog.d("TXAudioMixer", "audio endOfFile:" + this.p.get());
            TXCLog.i("TXAudioMixer", "read audio end");
        }
        this.o.a(b);
    }

    private com.tencent.liteav.d.e m() {
        com.tencent.liteav.d.e d;
        if (this.b.get() != 1 || (d = this.o.d()) == null || d.o() == null) {
            return null;
        }
        if (d.e() >= this.g || (d.o().flags & 4) != 0) {
            if (d.e() > this.h) {
                this.q.getAndSet(true);
                return null;
            } else if ((d.o().flags & 4) != 0) {
                TXCLog.i("TXAudioMixer", "==================generate decode Audio END==========================");
                this.q.getAndSet(true);
                return d;
            } else {
                return d;
            }
        }
        return null;
    }

    private com.tencent.liteav.d.e b(com.tencent.liteav.d.e eVar) throws InterruptedException {
        short[] a2;
        if (eVar.o().flags == 2) {
            return eVar;
        }
        if ((this.j == this.l && this.i == this.k) || (a2 = b.a(eVar.b(), eVar.g())) == null || a2.length == 0 || this.u == null || this.v == null) {
            return eVar;
        }
        if (this.j != this.l) {
            a2 = this.u.a(a2);
        }
        if (this.i == this.k || !((a2 = this.v.doResample(a2)) == null || a2.length == 0)) {
            return b(a2);
        }
        return null;
    }

    private com.tencent.liteav.d.e b(short[] sArr) {
        if (sArr == null || sArr.length == 0) {
            return null;
        }
        com.tencent.liteav.videoediter.audio.a aVar = new com.tencent.liteav.videoediter.audio.a();
        aVar.a(sArr);
        aVar.d(sArr.length * 2);
        aVar.h(this.j);
        aVar.g(this.i);
        return aVar;
    }

    @TargetApi(16)
    private void n() {
        if (this.e == null || this.c == null) {
            return;
        }
        if (this.u == null) {
            this.u = new e();
        }
        this.u.a(this.l, this.j);
        if (this.v == null) {
            this.v = new TXSkpResample();
        }
        this.v.init(this.k, this.i);
        TXCLog.i("TXAudioMixer", "TXChannelResample and TXSkpResample have been created!!!");
    }

    private void o() throws IOException {
        TXCLog.i("TXAudioMixer", "initMediaExtractor -> bgmPath = " + this.f);
        this.d = new com.tencent.liteav.g.e(true);
        this.d.a(this.f);
        this.e = this.d.m();
        this.l = this.e.getInteger("channel-count");
        this.k = this.e.getInteger("sample-rate");
        if (this.g == -1 && this.h == -1) {
            this.g = 0L;
            this.h = this.e.getLong("durationUs") * 1000;
        }
        this.d.c(this.g);
    }

    private void p() {
        this.m = new LinkedList();
        this.m = Collections.synchronizedList(this.m);
    }

    private void q() {
        if (this.m != null) {
            TXCLog.i("TXAudioMixer", "clean audio frame queue");
            this.m.clear();
            this.m = null;
        }
    }

    private void r() {
        if (this.d != null) {
            TXCLog.i("TXAudioMixer", "release media extractor");
            this.d.o();
            this.d = null;
        }
    }

    private void s() {
        if (this.u != null) {
            this.u = null;
            TXCLog.i("TXAudioMixer", "release chanel resample ");
        }
        if (this.v != null) {
            TXCLog.i("TXAudioMixer", "release skp resample ");
            this.v.destroy();
            this.v = null;
        }
    }

    private void t() {
        if (this.n != null && this.n.isAlive() && !this.n.isInterrupted()) {
            TXCLog.i("TXAudioMixer", "interrupt the decode thread");
            this.n.interrupt();
            this.n = null;
        }
        if (this.o != null) {
            TXCLog.i("TXAudioMixer", "stop audio decode");
            this.o.b();
            this.o = null;
        }
    }
}
