package com.tencent.liteav.f;

import android.content.Context;
import com.meituan.android.common.aidata.error.ErrorCode;
import com.meituan.android.common.badge.Strategy;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.tencent.liteav.k.n;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    private n c;
    private com.tencent.liteav.d.f d;
    private boolean e;
    private n.l n;
    private n.m o;
    private n.a p;
    private n.d q;
    private n.i r;
    private n.f s;
    private n.k t;
    private n.e u;
    private n.h v;
    private n.g w;
    private n.j x;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private long m = -1;
    private final int y = 120000;
    private final int z = 230000;
    private final int A = 274000;
    private final int B = 318000;
    private final int C = 362000;
    private final int D = 406000;
    private final int E = 450000;
    private final int F = 494000;
    private final int G = 538000;
    private final int H = 582000;
    private final int I = 560000;
    private final int J = ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_FEATURE;
    private final int K = 1000000;
    private final int L = 120000;
    private final int M = 70000;
    private final int N = 300000;
    private final int O = 350000;
    private final int P = 400000;
    private final int Q = 500000;
    private final int R = 600000;
    private final int S = 650000;
    private final int T = 700000;
    private final int U = 800000;
    private final int V = 900000;
    private final int W = 1000000;
    private final int X = 1050000;
    private final int Y = 1100000;
    private final int Z = 1200000;
    private final int aa = ErrorCode.JSExecute.LOAD_FAIL_MODEL_POST_PROCESS;
    private final int ab = 2500000;
    private final int ac = 120000;
    private final int ad = 240000;
    private final int ae = 360000;
    private final int af = Strategy.DEFAULT_MAX_AUTO_SYNC_INTERVAL;
    private final int ag = 600000;
    private final int ah = 720000;
    private final int ai = 840000;
    private final int aj = 960000;
    private final int ak = 1080000;
    private final int al = 1200000;
    private final int am = ErrorCode.JSExecute.JS_INSTANCE_IS_NULL_OPERATOR_MERGE;
    private final int an = ErrorCode.JSExecute.LOAD_FAIL_MODEL;
    private final int ao = ErrorCode.JSExecute.RESULT_NULL_MODEL_POST_PROCESS;
    private final int ap = 1680000;
    private final int aq = 1800000;
    private final int ar = BlankConfig.MAX_SAMPLE;
    private final int as = 200000;
    private final int at = 300000;
    private final int au = 400000;
    private final int av = 500000;
    private final int aw = 600000;
    private final int ax = 700000;
    private final int ay = 800000;
    private final int az = 850000;
    private final int aA = RequestIDMap.OP_TYPE_GESTURE.OP_TYPE_SAVE_GESTURE;
    private final int aB = 150000;
    private final int aC = 250000;
    private final int aD = 300000;
    private final int aE = 400000;
    private final int aF = 580000;
    private final int aG = 1000000;
    private final int aH = 2000000;
    private com.tencent.liteav.c.d b = com.tencent.liteav.c.d.a();
    private com.tencent.liteav.c.g a = com.tencent.liteav.c.g.a();

    public e(Context context) {
        this.c = new n(context);
    }

    public void a(com.tencent.liteav.d.e eVar) {
        int a;
        long e = eVar.e();
        this.d = null;
        if (b() && (a = a(e)) != -1 && this.d != null && b(e)) {
            a(a, e);
        }
    }

    public int a(com.tencent.liteav.d.e eVar, int i) {
        if (this.d == null) {
            return i;
        }
        n.b bVar = new n.b();
        bVar.a = i;
        bVar.b = eVar.m();
        bVar.c = eVar.n();
        switch (this.d.a) {
            case 0:
                this.c.a(0, this.p);
                break;
            case 1:
                this.c.a(1, this.q);
                break;
            case 2:
                this.c.a(2, this.n);
                break;
            case 3:
                this.c.a(3, this.o);
                break;
            case 4:
                this.c.a(4, this.r);
                break;
            case 5:
                this.c.a(5, this.s);
                break;
            case 6:
                this.c.a(6, this.t);
                break;
            case 7:
                this.c.a(7, this.u);
                break;
            case 8:
                this.c.a(8, this.v);
                break;
            case 10:
                this.c.a(10, this.w);
                break;
            case 11:
                this.c.a(11, this.x);
                break;
        }
        return this.c.a(bVar);
    }

    private boolean b() {
        List<com.tencent.liteav.d.f> d = this.b.d();
        return (d == null || d.size() == 0) ? false : true;
    }

    private int a(long j) {
        List<com.tencent.liteav.d.f> d = this.b.d();
        int i = -1;
        if (d == null || d.size() == 0) {
            return -1;
        }
        int size = d.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            com.tencent.liteav.d.f fVar = d.get(size);
            if (j >= fVar.b && j <= fVar.c) {
                i = fVar.a;
                this.d = fVar;
                break;
            }
            size--;
        }
        com.tencent.liteav.d.f b = this.b.b();
        if (b.c == -1 || b.c == b.b) {
            int i2 = b.a;
            this.d = b;
            return i2;
        }
        return i;
    }

    private boolean b(long j) {
        long j2 = this.d.b;
        long j3 = this.d.c;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        boolean z = i != 0 && j3 != -1 && j > j2 && j < j3;
        if (i != 0 && j > j2) {
            z = true;
        }
        if (j3 == -1 || j >= j3) {
            return z;
        }
        return true;
    }

    private void a(int i, long j) {
        switch (i) {
            case 0:
                if (this.p == null) {
                    this.p = new n.a();
                }
                c();
                return;
            case 1:
                j(j);
                return;
            case 2:
                l(j);
                return;
            case 3:
                k(j);
                return;
            case 4:
                i(j);
                return;
            case 5:
                h(j);
                return;
            case 6:
                g(j);
                return;
            case 7:
                f(j);
                return;
            case 8:
                e(j);
                return;
            case 9:
            default:
                return;
            case 10:
                d(j);
                return;
            case 11:
                c(j);
                return;
        }
    }

    private void c(long j) {
        if (this.x == null) {
            this.x = new n.j();
        }
        if (this.m == -1) {
            this.m = j;
        }
        long abs = Math.abs(j - this.m);
        if (abs < 1000000) {
            this.x.a = 0.0f;
        } else if (abs < 2000000) {
            this.x.a = 1.0f;
        } else {
            this.m = -1L;
        }
    }

    private void d(long j) {
        if (this.w == null) {
            this.w = new n.g();
        }
    }

    private void e(long j) {
        if (this.l == -1) {
            this.l = j;
        }
        if (this.v == null) {
            this.v = new n.h();
            this.v.a = 0.0f;
        }
        long abs = Math.abs(j - this.l);
        if (abs < 50000) {
            this.v.a = 0.7f;
        } else if (abs < 150000) {
            this.v.a = 0.5f;
        } else if (abs < 250000) {
            this.v.a = 0.4f;
        } else if (abs < 300000) {
            this.v.a = 1.0f;
        } else if (abs < 400000) {
            this.v.a = 0.3f;
        } else if (abs < 580000) {
            this.v.a = 0.0f;
        } else {
            this.l = -1L;
        }
    }

    private void f(long j) {
        if (this.k == -1) {
            this.k = j;
        }
        if (this.u == null) {
            this.u = new n.e();
            this.u.b = 0.0f;
            this.u.a = 0.0f;
            this.u.c = 0.0f;
        }
        long abs = Math.abs(j - this.k);
        if (abs < 100000) {
            this.u.b = 10.0f;
            this.u.a = 0.01f;
            this.u.c = 0.0f;
        } else if (abs < 200000) {
            this.u.b = 20.0f;
            this.u.a = -0.02f;
            this.u.c = 0.0f;
        } else if (abs < 300000) {
            this.u.b = 30.0f;
            this.u.a = 0.02f;
            this.u.c = 0.0f;
        } else if (abs < 400000) {
            this.u.b = 20.0f;
            this.u.a = -0.03f;
            this.u.c = 0.0f;
        } else if (abs < 500000) {
            this.u.b = 10.0f;
            this.u.a = 0.01f;
            this.u.c = 0.0f;
        } else if (abs < 600000) {
            this.u.b = 20.0f;
            this.u.a = -0.02f;
            this.u.c = 0.0f;
        } else if (abs < 700000) {
            this.u.b = 30.0f;
            this.u.a = -0.03f;
            this.u.c = 0.0f;
        } else if (abs < 800000) {
            this.u.b = 20.0f;
            this.u.a = 0.02f;
            this.u.c = 0.0f;
        } else if (abs < 850000) {
            this.u.b = 0.0f;
            this.u.a = 0.0f;
            this.u.c = 0.0f;
        } else {
            this.k = -1L;
        }
    }

    private void g(long j) {
        if (this.j == -1) {
            this.j = j;
        }
        if (this.t == null) {
            this.t = new n.k();
            this.t.f = 1;
            this.t.h = 0.3f;
        }
        this.t.a = new float[]{0.0f, 0.0f};
        this.t.b = new float[]{0.0f, 0.1f};
        long abs = Math.abs(j - this.j);
        int i = (abs > 120000L ? 1 : (abs == 120000L ? 0 : -1));
        if (i < 0) {
            this.t.g = 0;
            this.t.a = new float[]{0.0f, 0.0f};
            this.t.b = new float[]{0.0f, 0.0f};
        } else if (i < 0) {
            this.t.g = 1;
        } else if (abs < 240000) {
            this.t.g = 2;
        } else if (abs < 360000) {
            this.t.g = 3;
        } else if (abs < 480000) {
            this.t.g = 4;
        } else if (abs < 600000) {
            this.t.g = 5;
        } else if (abs < 720000) {
            this.t.g = 6;
        } else if (abs < 840000) {
            this.t.g = 7;
        } else if (abs < 960000) {
            this.t.g = 8;
        } else if (abs < 1080000) {
            this.t.g = 9;
        } else if (abs < 1200000) {
            this.t.g = 10;
        } else if (abs < 1320000) {
            this.t.g = 11;
        } else if (abs < 1440000) {
            this.t.g = 12;
        } else if (abs < 1560000) {
            this.t.g = 13;
        } else if (abs < 1680000) {
            this.t.g = 14;
        } else if (abs < 1800000) {
            this.t.g = 15;
        } else {
            this.j = -1L;
        }
    }

    private void h(long j) {
        if (this.s == null) {
            this.s = new n.f();
        }
        this.s.a = 5;
        this.s.b = 1;
        this.s.c = 0.5f;
    }

    private void i(long j) {
        if (this.i == -1) {
            if (this.e) {
                this.i = this.d.b;
            } else {
                this.i = j;
            }
        }
        if (this.r == null) {
            this.r = new n.i();
        }
        long abs = Math.abs(j - this.i);
        if (abs < 300000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.003f;
        } else if (abs < 350000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.015f;
        } else if (abs < 400000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.024f;
        } else if (abs < 500000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.015f;
        } else if (abs < 600000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.003f;
        } else if (abs < 650000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.03f;
        } else if (abs < 700000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.015f;
        } else if (abs < 800000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.024f;
        } else if (abs < 900000) {
            this.r.b = 1.0f;
        } else if (abs < 1000000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.015f;
        } else if (abs < 1050000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.024f;
        } else if (abs < 1100000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.015f;
        } else if (abs < 1200000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.009f;
        } else if (abs < 1500000) {
            this.r.b = 0.0f;
            this.r.e = 0.03f;
            this.r.d = 0.003f;
        } else if (abs < 2500000) {
            this.r.b = 1.0f;
        } else {
            this.i = -1L;
        }
    }

    private void j(long j) {
        if (this.h == -1) {
            if (this.e) {
                this.h = this.d.b;
            } else {
                this.h = j;
            }
        }
        if (this.q == null) {
            this.q = new n.d();
            this.q.e = 8.0f;
            this.q.c = new float[]{0.5f, 0.5f};
            this.q.a = 0.0f;
            this.q.b = 0.2f;
        }
        long abs = Math.abs(j - this.h);
        if (abs < 120000) {
            this.q.d = 0.0f;
            this.q.e = 8.0f;
            this.q.c = new float[]{0.0f, 0.0f};
            this.q.a = 0.0f;
            this.q.b = 0.0f;
            this.q.f = new float[]{0.0f, 0.0f};
            this.q.g = new float[]{0.0f, 0.0f};
            return;
        }
        int i = 1;
        while (true) {
            if (i > 8) {
                break;
            } else if (abs < (70000 * i) + 120000) {
                this.q.d = i;
                this.q.e = 8.0f;
                this.q.c = new float[]{0.5f, 0.5f};
                this.q.a = 0.0f;
                this.q.b = 0.3f;
                if (i >= 3) {
                    this.q.f = new float[]{-0.1f, 0.0f};
                    this.q.g = new float[]{0.0f, 0.1f};
                } else {
                    this.q.f = new float[]{0.0f, 0.0f};
                    this.q.g = new float[]{0.0f, 0.0f};
                }
            } else {
                i++;
            }
        }
        if (abs > 680000) {
            if (abs <= 1080000) {
                this.q.d = 0.0f;
                this.q.e = 8.0f;
                this.q.c = new float[]{0.0f, 0.0f};
                this.q.a = 0.0f;
                this.q.b = 0.0f;
                this.q.f = new float[]{0.0f, 0.0f};
                this.q.g = new float[]{0.0f, 0.0f};
                return;
            }
            this.h = -1L;
        }
    }

    private void c() {
        if (this.p == null) {
            this.p = new n.a();
        }
    }

    private void k(long j) {
        if (this.g == -1) {
            if (this.e) {
                this.g = this.d.b;
            } else {
                this.g = j;
            }
        }
        if (this.o == null) {
            this.o = new n.m();
        }
        long abs = Math.abs(j - this.g);
        if (abs <= 1000000) {
            this.o.a = 4;
        } else if (abs <= 2000000) {
            this.o.a = 9;
        } else {
            this.g = -1L;
        }
    }

    private void l(long j) {
        if (this.f == -1) {
            if (this.e) {
                this.f = this.d.b;
            } else {
                this.f = j;
            }
        }
        if (this.n == null) {
            this.n = new n.l();
            this.n.f = 1;
            this.n.h = 0.3f;
        }
        long abs = Math.abs(j - this.f);
        if (abs < 120000) {
            this.n.g = 0;
        } else if (abs < 230000) {
            this.n.g = 1;
        } else if (abs < 274000) {
            this.n.g = 2;
        } else if (abs < 318000) {
            this.n.g = 3;
        } else if (abs < 362000) {
            this.n.g = 4;
        } else if (abs < 406000) {
            this.n.g = 5;
        } else if (abs < 450000) {
            this.n.g = 6;
        } else if (abs < 494000) {
            this.n.g = 7;
        } else if (abs < 538000) {
            this.n.g = 8;
        } else if (abs < 582000) {
            this.n.g = 9;
        } else if (abs < 1120000) {
            this.n.g = 0;
        } else {
            this.f = -1L;
        }
    }

    public void a() {
        if (this.c != null) {
            this.c.a();
        }
    }
}
