package com.tencent.liteav.editer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class s {
    private int A;
    private Handler c;
    private HandlerThread d;
    private List<Bitmap> e;
    private l f;
    private long h;
    private List<Long> i;
    private long l;
    private long m;
    private boolean n;
    private long o;
    private long p;
    private com.tencent.liteav.d.e u;
    private AtomicBoolean v;
    private AtomicBoolean w;
    private long x;
    private int z;
    private final String a = "PicDec";
    private int b = 1;
    private int g = 20;
    private long j = 1000;
    private long k = 500;
    private long q = -1;
    private long r = -1;
    private long s = -1;
    private long t = -1;
    private int y = 0;
    private int B = -1;

    public s(String str) {
        this.d = new HandlerThread("picDec" + str);
        this.d.start();
        this.c = new a(this.d.getLooper());
        this.e = new ArrayList();
        this.i = new ArrayList();
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void a(List<Bitmap> list, int i) {
        if (list == null || list.size() == 0) {
            TXCLog.e("PicDec", "setBitmapList, bitmapList is empty");
            return;
        }
        if (i <= 0) {
            this.g = 20;
        } else {
            this.g = i;
        }
        a(list);
        this.h = 1000 / this.g;
    }

    public long a(int i) {
        synchronized (this) {
            if (this.B != i) {
                this.i.clear();
            }
        }
        this.B = i;
        this.j = com.tencent.liteav.j.a.a(i);
        this.k = com.tencent.liteav.j.a.b(i);
        if (i == 5 || i == 4) {
            this.l = this.e.size() * (this.j + this.k);
        } else {
            this.l = (this.e.size() * (this.j + this.k)) - this.k;
        }
        this.m = this.h * (((int) ((this.l / 1000) * this.g)) - 1);
        return this.m;
    }

    public void a(l lVar) {
        this.f = lVar;
    }

    private void j() {
        this.q = -1L;
        this.r = -1L;
        this.s = -1L;
        this.t = -1L;
        this.v.compareAndSet(true, false);
    }

    public void a(long j, long j2) {
        this.o = j;
        this.p = j2;
    }

    public int a() {
        if (this.e.size() == 0) {
            return 0;
        }
        this.z = 720;
        return this.z;
    }

    public int b() {
        if (this.e.size() == 0) {
            return 0;
        }
        this.A = 1280;
        return this.A;
    }

    public boolean c() {
        return this.w.get();
    }

    public synchronized void d() {
        if (this.b == 2) {
            TXCLog.e("PicDec", "start(), mState is play, ignore");
            return;
        }
        this.b = 2;
        this.w.compareAndSet(true, false);
        j();
        this.c.sendEmptyMessage(1);
    }

    public synchronized void e() {
        if (this.b == 1) {
            TXCLog.e("PicDec", "stop(), mState is init, ignore");
            return;
        }
        this.b = 1;
        this.c.sendEmptyMessage(4);
    }

    public void f() {
        if (this.b == 1 || this.b == 3) {
            TXCLog.e("PicDec", "pause(), mState = " + this.b + ", ignore");
            return;
        }
        this.b = 3;
        this.c.sendEmptyMessage(3);
    }

    public void g() {
        if (this.b == 1 || this.b == 2) {
            TXCLog.e("PicDec", "resume(), mState = " + this.b + ", ignore");
            return;
        }
        this.b = 2;
        this.c.sendEmptyMessage(2);
    }

    public void a(long j) {
        this.b = 4;
        this.x = j;
        this.c.sendEmptyMessage(5);
    }

    public synchronized void h() {
        if (this.b == 1) {
            TXCLog.e("PicDec", "getNextBitmapFrame, current state is init, ignore");
        } else {
            this.c.sendEmptyMessage(2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    s.this.o();
                    s.this.c(s.this.o);
                    s.this.c.sendEmptyMessage(2);
                    return;
                case 2:
                    s.this.m();
                    return;
                case 3:
                    s.this.k();
                    return;
                case 4:
                    TXCLog.i("PicDec", "stopDecode");
                    s.this.l();
                    return;
                case 5:
                    s.this.b(s.this.x);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.c.removeMessages(2);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.c.removeMessages(2);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.n && this.s >= 0) {
            if (!this.v.get() && !n()) {
                this.c.sendEmptyMessageDelayed(2, 5L);
                return;
            }
            b(this.u);
        }
        this.u = new com.tencent.liteav.d.e();
        synchronized (this) {
            if (this.i.size() <= 0) {
                return;
            }
            long longValue = this.i.get(this.y).longValue();
            if (longValue > this.p * 1000) {
                longValue = -1;
            }
            if (longValue == -1) {
                this.u.c(4);
                this.u.a(0L);
                this.u.j(a());
                this.u.k(b());
                this.u.m(0);
                b(this.u);
                this.c.sendEmptyMessage(4);
                this.w.set(true);
                return;
            }
            synchronized (this) {
                this.y++;
            }
            this.s = longValue / 1000;
            this.u.a(longValue);
            this.u.b(longValue);
            this.u.f(this.g);
            this.u.m(0);
            a(this.u);
            if (!this.n) {
                b(this.u);
            } else if (this.q < 0) {
                this.q = this.s;
                this.v.set(true);
                this.s = longValue;
                this.r = System.currentTimeMillis();
                this.c.sendEmptyMessage(2);
            } else {
                this.v.compareAndSet(true, false);
                this.c.sendEmptyMessageDelayed(2, 5L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        c(j);
        this.u = new com.tencent.liteav.d.e();
        synchronized (this) {
            if (this.i.size() <= 0) {
                return;
            }
            this.u.a(this.i.get(this.y).longValue());
            this.u.m(0);
            a(this.u);
            b(this.u);
        }
    }

    private synchronized void a(com.tencent.liteav.d.e eVar) {
        Bitmap bitmap;
        if (this.e.size() <= 0) {
            TXCLog.i("PicDec", "setBitmapsAndDisplayRatio bitmaplist size is 0.");
            return;
        }
        long e = eVar.e() / 1000;
        int i = (int) (e / (this.j + this.k));
        TXCLog.d("PicDec", "setBitmapsAndDisplayRatio, frameTimeMs = " + e + ", picIndex = " + i + ", loopTime = " + (this.j + this.k));
        if (i >= this.e.size()) {
            bitmap = this.e.get(this.e.size() - 1);
        } else {
            bitmap = this.e.get(i);
        }
        Bitmap bitmap2 = i < this.e.size() + (-1) ? this.e.get(i + 1) : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bitmap);
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        eVar.a(arrayList);
        eVar.j(a());
        eVar.k(b());
    }

    private boolean n() {
        this.t = System.currentTimeMillis();
        this.s = this.u.e() / 1000;
        return Math.abs(this.s - this.q) < this.t - this.r;
    }

    private void b(com.tencent.liteav.d.e eVar) {
        if (this.f != null) {
            this.f.a(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(long j) {
        if (this.i.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i).longValue() / 1000 >= j) {
                this.y = i;
                return;
            }
        }
    }

    private void a(List<Bitmap> list) {
        for (int i = 0; i < list.size(); i++) {
            this.e.add(a(list.get(i), 720, 1280));
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        float f2 = height;
        float f3 = i;
        float f4 = i2;
        float f5 = f / f2 >= f3 / f4 ? f3 / f : f4 / f2;
        Matrix matrix = new Matrix();
        matrix.postScale(f5, f5);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        if (this.i.size() > 0) {
            return;
        }
        int i = (int) ((this.l / 1000) * this.g);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == i - 1) {
                this.i.add(Long.valueOf(i2 * this.h * 1000));
                this.i.add(-1L);
            } else {
                this.i.add(Long.valueOf(i2 * this.h * 1000));
            }
        }
    }

    public synchronized void i() {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).recycle();
        }
        this.e.clear();
        if (this.d != null) {
            this.d.quit();
        }
    }
}
