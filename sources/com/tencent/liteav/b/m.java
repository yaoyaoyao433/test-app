package com.tencent.liteav.b;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.util.LongSparseArray;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class m {
    private Surface f;
    private e g;
    private l i;
    private com.tencent.liteav.g.f j;
    private com.tencent.liteav.d.e k;
    private com.tencent.liteav.d.e l;
    private ArrayBlockingQueue<com.tencent.liteav.d.e> m;
    private ArrayBlockingQueue<com.tencent.liteav.d.e> n;
    private com.tencent.liteav.g.e h = new com.tencent.liteav.g.e();
    private LongSparseArray<com.tencent.liteav.d.e> a = new LongSparseArray<>();
    private LongSparseArray<com.tencent.liteav.d.e> b = new LongSparseArray<>();
    private AtomicBoolean c = new AtomicBoolean(false);
    private AtomicBoolean d = new AtomicBoolean(false);
    private LinkedList<com.tencent.liteav.d.e> e = new LinkedList<>();

    public m() {
        this.e.clear();
    }

    public int a(String str) {
        int a = this.h.a(str);
        if (a < 0) {
            return a;
        }
        return 0;
    }

    public void a(Surface surface) {
        this.f = surface;
    }

    public MediaFormat a() {
        return this.h.m();
    }

    public int b() {
        return this.h.b();
    }

    public int c() {
        return this.h.c();
    }

    public int d() {
        return this.h.e();
    }

    public int e() {
        MediaFormat m = this.h.m();
        if (m.containsKey("sample-rate")) {
            return m.getInteger("sample-rate");
        }
        return 0;
    }

    public int f() {
        MediaFormat m = this.h.m();
        if (m.containsKey("max-input-size")) {
            return m.getInteger("max-input-size");
        }
        return 0;
    }

    public void a(e eVar) {
        this.g = eVar;
    }

    public void g() {
        this.i = new l();
        this.j = new com.tencent.liteav.g.f();
        MediaFormat m = this.h.m();
        this.j.a(m);
        this.j.a(m, (Surface) null);
        this.j.a();
        this.i.a(this.h.l());
        this.i.a(this.h.l(), this.f);
        this.i.a();
    }

    public void h() {
        if (this.j != null) {
            this.j.b();
        }
        if (this.i != null) {
            this.i.b();
        }
        if (this.e != null) {
            this.e.clear();
        }
        if (this.b != null) {
            this.b.clear();
        }
        if (this.a != null) {
            this.a.clear();
        }
        this.h.o();
        this.c.compareAndSet(true, false);
        this.d.compareAndSet(true, false);
    }

    public void i() throws InterruptedException {
        j();
        k();
        l();
        m();
    }

    private void j() throws InterruptedException {
        com.tencent.liteav.d.e a;
        if (this.c.get()) {
            TXCLog.d("TXReaderLone", "mReadVideoEOF, ignore");
            return;
        }
        com.tencent.liteav.d.e c = this.i.c();
        if (c == null || (a = this.h.a(c)) == null) {
            return;
        }
        if (this.h.c(a)) {
            this.c.compareAndSet(false, true);
            TXCLog.i("TXReaderLone", "==TXReaderLone Read Video End===");
        }
        this.b.put(a.e(), a);
        this.i.a(a);
    }

    private void k() throws InterruptedException {
        com.tencent.liteav.d.e c;
        com.tencent.liteav.d.e b;
        if (this.d.get() || (c = this.j.c()) == null || (b = this.h.b(c)) == null) {
            return;
        }
        if (this.h.d(b)) {
            this.d.compareAndSet(false, true);
            TXCLog.i("TXReaderLone", "==TXReaderLone Read Audio End===");
        }
        this.a.put(b.e(), b);
        this.j.a(b);
    }

    private void l() {
        if (this.e.size() == 0) {
            if (this.m != null && this.m.size() > 0) {
                TXCLog.d("TXReaderLone", "decodeVideoFrame, ignore because mVideoBlockingQueue.size() = " + this.m.size());
                return;
            }
            com.tencent.liteav.d.e d = this.i.d();
            if (d == null || d.o() == null) {
                return;
            }
            if (this.k == null) {
                this.k = d;
            }
            com.tencent.liteav.d.e eVar = this.b.get(d.e());
            if (eVar != null) {
                d = this.i.a(eVar, d);
            }
            if ((d.o().flags & 4) != 0) {
                TXCLog.i("TXReaderLone", "==TXReaderLone Decode Video End===");
            }
            this.e.add(d);
        }
        if (this.e.size() <= 0) {
            return;
        }
        com.tencent.liteav.d.e eVar2 = this.e.get(0);
        if (this.k == null) {
            this.k = eVar2;
        }
        if (this.g != null) {
            this.g.b(eVar2);
        }
        if (!this.e.isEmpty() && this.e.size() > 0) {
            this.e.remove(0);
        }
        this.k = eVar2;
    }

    private void m() {
        if (this.n != null && this.n.size() > 9) {
            TXCLog.d("TXReaderLone", "decodeAudioFrame, ignore because mAudioBlockingQueue size = " + this.n.size());
            return;
        }
        com.tencent.liteav.d.e d = this.j.d();
        if (d == null || d.o() == null) {
            return;
        }
        com.tencent.liteav.d.e eVar = this.a.get(d.e());
        com.tencent.liteav.d.e a = eVar != null ? this.j.a(eVar, d) : d;
        if (a == null) {
            TXCLog.e("TXReaderLone", "decodeAudioFrame, fixFrame is null, sampleTime = " + d.e());
            return;
        }
        if ((a.o().flags & 4) != 0) {
            TXCLog.i("TXReaderLone", "==TXReaderLone Decode Audio End===");
        }
        if (this.l == null) {
            this.l = d;
        }
        if (this.g != null) {
            this.g.a(a);
        }
        this.l = a;
    }

    public void a(ArrayBlockingQueue<com.tencent.liteav.d.e> arrayBlockingQueue) {
        this.m = arrayBlockingQueue;
    }

    public void b(ArrayBlockingQueue<com.tencent.liteav.d.e> arrayBlockingQueue) {
        this.n = arrayBlockingQueue;
    }
}
