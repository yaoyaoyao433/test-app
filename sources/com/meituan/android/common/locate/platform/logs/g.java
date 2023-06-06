package com.meituan.android.common.locate.platform.logs;

import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.SystemClock;
import com.alipay.sdk.app.PayTask;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class g extends e {
    public static long af;
    private static g av;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public long a;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public long aq;
    public long ar;
    public long as;
    public long at;
    private Object au;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a7091bd9d42e12be6c996262bd07b86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a7091bd9d42e12be6c996262bd07b86");
            return;
        }
        this.au = new Object();
        this.a = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.ag = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.ao = 0;
        this.ap = 0;
        this.aq = 0L;
        this.ar = 0L;
        this.as = 0L;
        this.at = 0L;
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "925210205403010afa247d953a617cb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "925210205403010afa247d953a617cb7");
        }
        if (av == null) {
            synchronized (g.class) {
                if (av == null) {
                    av = new g();
                }
            }
        }
        return av;
    }

    private void b(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66da3661b75f180517de37ccf0ed4187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66da3661b75f180517de37ccf0ed4187");
            return;
        }
        a(concurrentHashMap, "wifiScanDuration100s", this.ag);
        a(concurrentHashMap, "wifiScanDuration200s", this.ah);
        a(concurrentHashMap, "wifiScanDuration300s", this.ai);
        a(concurrentHashMap, "wifiScanDuration400s", this.aj);
        a(concurrentHashMap, "wifiScanDuration500s", this.ak);
        a(concurrentHashMap, "wifiScanDuration750s", this.al);
        a(concurrentHashMap, "wifiScanDuration1000s", this.am);
        a(concurrentHashMap, "wifiScanDuration2000s", this.an);
        a(concurrentHashMap, "wifiScanDuration3000s", this.ao);
        a(concurrentHashMap, "wifiScanDurationBigger3000s", this.ap);
    }

    private void c(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97a070b47d0ad790be703ebbd072dd4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97a070b47d0ad790be703ebbd072dd4a");
            return;
        }
        a(concurrentHashMap, "waiting0Times", this.l);
        a(concurrentHashMap, "waiting1Times", this.m);
        a(concurrentHashMap, "waiting2Times", this.n);
        a(concurrentHashMap, "waiting3Times", this.o);
        a(concurrentHashMap, "waiting4Times", this.p);
        a(concurrentHashMap, "waiting5Times", this.q);
        a(concurrentHashMap, "waiting6Times", this.r);
        a(concurrentHashMap, "waiting7Times", this.s);
        a(concurrentHashMap, "waiting8Times", this.t);
        a(concurrentHashMap, "waiting9Times", this.u);
        a(concurrentHashMap, "waiting10Times", this.v);
        a(concurrentHashMap, "waiting11Times", this.w);
        a(concurrentHashMap, "waiting12Times", this.x);
        a(concurrentHashMap, "waiting13Times", this.y);
        a(concurrentHashMap, "waiting14Times", this.z);
        a(concurrentHashMap, "waiting19Times", this.A);
        a(concurrentHashMap, "waitingbigger19Times", this.B);
    }

    private void d(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0190efacc343544cb33277247d00663d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0190efacc343544cb33277247d00663d");
            return;
        }
        a(concurrentHashMap, "wifiSysElapse61s", this.Q);
        a(concurrentHashMap, "wifiSysElapse300s", this.R);
        a(concurrentHashMap, "wifiSysElapse600s", this.S);
        a(concurrentHashMap, "wifiSysElapse1800s", this.T);
        a(concurrentHashMap, "wifiSysElapseBigger1800s", this.U);
        a(concurrentHashMap, "wifiSysElapseSmaller0", this.V);
        a(concurrentHashMap, "cellSysElapse61s", this.X);
        a(concurrentHashMap, "cellSysElapse300s", this.Y);
        a(concurrentHashMap, "cellSysElapse600s", this.Z);
        a(concurrentHashMap, "cellSysElapse1800s", this.aa);
        a(concurrentHashMap, "cellSysElapseBigger1800s", this.ab);
        a(concurrentHashMap, "cellSysElapseSmaller0", this.ac);
        a(concurrentHashMap, "cellSysOldCount", this.ad);
    }

    private void e(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b536585acfebc73861f74e8833b6ad46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b536585acfebc73861f74e8833b6ad46");
            return;
        }
        a(concurrentHashMap, "reqLocTimes", this.e);
        a(concurrentHashMap, "reqLocSucTimes", this.f);
        a(concurrentHashMap, "reqLocFailTimes", this.g);
        a(concurrentHashMap, "reqLocSmallThan1s", this.h);
        a(concurrentHashMap, "reqLocSmallThan3s", this.i);
        a(concurrentHashMap, "reqLocSmallThan6s", this.j);
        a(concurrentHashMap, "reqLocSmallThan10s", this.k);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb85623355270808f06a8a0c9014f9b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb85623355270808f06a8a0c9014f9b4");
            return;
        }
        synchronized (this.au) {
            this.ag = 0;
            this.ah = 0;
            this.ai = 0;
            this.aj = 0;
            this.ak = 0;
            this.al = 0;
            this.am = 0;
            this.an = 0;
            this.ao = 0;
            this.ap = 0;
        }
    }

    private void f(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91607dbe8da77b0934ac3d8dfe12ca85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91607dbe8da77b0934ac3d8dfe12ca85");
            return;
        }
        a(concurrentHashMap, "wifiskipcount", this.K);
        a(concurrentHashMap, "wifizerotimestamp", this.L);
        a(concurrentHashMap, "wifiallcount", this.M);
        a(concurrentHashMap, "cellskipcount", this.N);
        a(concurrentHashMap, "cellzerotimestamp", this.O);
        a(concurrentHashMap, "cellallcount", this.P);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbd2228b301c716f45d2eb053dd673cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbd2228b301c716f45d2eb053dd673cc");
            return;
        }
        synchronized (this.au) {
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
            this.ad = 0;
        }
    }

    private void g(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b11fab9d6c939be7c016487f38d6b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b11fab9d6c939be7c016487f38d6b7");
            return;
        }
        a(concurrentHashMap, "requestHeadersSize", this.aq);
        a(concurrentHashMap, "requestBodySize", this.ar);
        a(concurrentHashMap, "responseHeadersSize", this.as);
        a(concurrentHashMap, "responseBodySize", this.at);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70eea7c1d158f4e883b3ed9010a1a19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70eea7c1d158f4e883b3ed9010a1a19b");
            return;
        }
        synchronized (this.au) {
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
        }
    }

    private void h(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fe384ad06adbacbf804dcbc5af0f76e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fe384ad06adbacbf804dcbc5af0f76e");
            return;
        }
        a(concurrentHashMap, "wifirealage90sCount", this.C);
        a(concurrentHashMap, "wifirealage120sCount", this.D);
        a(concurrentHashMap, "wifirealage180sCount", this.E);
        a(concurrentHashMap, "wifirealage240sCount", this.F);
        a(concurrentHashMap, "wifirealage300sCount", this.G);
        a(concurrentHashMap, "wifirealage600sCount", this.H);
        a(concurrentHashMap, "wifirealage1800Count", this.I);
        a(concurrentHashMap, "wifirealagebigger1800s", this.J);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c29539374f58da5272b2bcfd1ba4c932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c29539374f58da5272b2bcfd1ba4c932");
            return;
        }
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc80414dca2b6a1f971580a775f11fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc80414dca2b6a1f971580a775f11fc3");
            return;
        }
        synchronized (this.au) {
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5bb2f3f4d51827f7f0ed378de8e86bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5bb2f3f4d51827f7f0ed378de8e86bc");
            return;
        }
        synchronized (this.au) {
            this.aq = 0L;
            this.ar = 0L;
            this.as = 0L;
            this.at = 0L;
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1d02f7c8ce72d046cc7fa108a9a2e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1d02f7c8ce72d046cc7fa108a9a2e7f");
            return;
        }
        synchronized (this.au) {
            this.C = 0;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74df014c14503fee4177d8c7d409f0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74df014c14503fee4177d8c7d409f0e5");
        } else if (i == 0) {
            this.l++;
        } else if (i == 1) {
            this.m++;
        } else if (i == 2) {
            this.n++;
        } else if (i == 3) {
            this.o++;
        } else if (i == 4) {
            this.p++;
        } else if (i == 5) {
            this.q++;
        } else if (i == 6) {
            this.r++;
        } else if (i == 7) {
            this.s++;
        } else if (i == 8) {
            this.t++;
        } else if (i == 9) {
            this.u++;
        } else if (i == 10) {
            this.v++;
        } else if (i == 11) {
            this.w++;
        } else if (i == 12) {
            this.x++;
        } else if (i == 13) {
            this.y++;
        } else if (i == 14) {
            this.z++;
        } else if (i <= 20) {
            this.A++;
        } else if (i > 20) {
            this.B++;
        }
    }

    public void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbf088c2ea99650418caaeed18215258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbf088c2ea99650418caaeed18215258");
            return;
        }
        synchronized (this.au) {
            this.K += i;
            this.L = i2 + this.L;
            this.M += i3;
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "496c4fa27d49568843ee5b895185aefe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "496c4fa27d49568843ee5b895185aefe");
            return;
        }
        af = j;
        if (j <= 100) {
            this.ag++;
        } else if (j <= 200) {
            this.ah++;
        } else if (j <= 300) {
            this.ai++;
        } else if (j <= 400) {
            this.aj++;
        } else if (j <= 500) {
            this.ak++;
        } else if (j <= 750) {
            this.al++;
        } else if (j <= 1000) {
            this.am++;
        } else if (j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
            this.an++;
        } else {
            int i = (j > PayTask.j ? 1 : (j == PayTask.j ? 0 : -1));
            if (i <= 0) {
                this.ao++;
            } else if (i > 0) {
                this.ap++;
            }
        }
    }

    public void a(long j, long j2, long j3, long j4) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb580b9962c99614d2939bc32143aaa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb580b9962c99614d2939bc32143aaa3");
            return;
        }
        synchronized (this.au) {
            this.aq += j;
            this.ar += j2;
            this.as += j3;
            this.at += j4;
        }
    }

    public void a(long j, long j2, boolean z) {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ed0900d42abba1b73e1c168f511077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ed0900d42abba1b73e1c168f511077");
            return;
        }
        synchronized (this.au) {
            long j3 = (j2 - j) / 1000;
            if (j3 <= 1) {
                this.h++;
            } else if (j3 <= 3) {
                this.i++;
            } else if (j3 <= 6) {
                this.j++;
            } else if (j3 <= 10) {
                this.k++;
            }
            if (z) {
                this.f++;
            } else {
                this.g++;
            }
        }
    }

    public void a(List<MTCellInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "033f7c4c4b429c5f3902e89b26173c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "033f7c4c4b429c5f3902e89b26173c05");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        synchronized (this.au) {
            if (this.ae == 0 || elapsedRealtime - this.a > 240) {
                for (MTCellInfo mTCellInfo : list) {
                    long j = mTCellInfo.nanoTimeStamp / 1000000000;
                    long j2 = elapsedRealtime - j;
                    if (j == 0) {
                        this.ad++;
                    } else if (j2 < 0) {
                        this.ac++;
                    } else if (j2 <= 61) {
                        this.X++;
                    } else if (j2 <= 300) {
                        this.Y++;
                    } else if (j2 <= 600) {
                        this.Z++;
                    } else {
                        int i = (j2 > 1800L ? 1 : (j2 == 1800L ? 0 : -1));
                        if (i <= 0) {
                            this.aa++;
                        } else if (i > 0) {
                            this.ab++;
                        }
                    }
                }
            }
        }
        this.a = elapsedRealtime;
        this.ae++;
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d62d6583f46f4fb49080fb4c4a192d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d62d6583f46f4fb49080fb4c4a192d87");
            return;
        }
        super.a(concurrentHashMap);
        e(concurrentHashMap);
        d(concurrentHashMap);
        f(concurrentHashMap);
        c(concurrentHashMap);
        h(concurrentHashMap);
        b(concurrentHashMap);
        g(concurrentHashMap);
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dad520db2a4c9318d1671952867c6092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dad520db2a4c9318d1671952867c6092");
            return;
        }
        g();
        h();
        j();
        i();
        l();
        k();
        f();
    }

    public void b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f01150e3dfba3e72a448fb3dd07a3db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f01150e3dfba3e72a448fb3dd07a3db2");
            return;
        }
        synchronized (this.au) {
            this.N += i;
            this.O = i2 + this.O;
            this.P += i3;
        }
    }

    public void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cda156da3ec4891aa857337c159fa0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cda156da3ec4891aa857337c159fa0dc");
            return;
        }
        synchronized (this.au) {
            try {
                if (j <= 90) {
                    this.C++;
                } else if (j <= 120) {
                    this.D++;
                } else if (j <= 180) {
                    this.E++;
                } else if (j <= 240) {
                    this.F++;
                } else if (j <= 300) {
                    this.G++;
                } else if (j <= 600) {
                    this.H++;
                } else {
                    int i = (j > 1800L ? 1 : (j == 1800L ? 0 : -1));
                    if (i <= 0) {
                        this.I++;
                    } else if (i > 0) {
                        this.J++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List<ScanResult> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6f6af8272cedca7a0b7e0fe633084f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6f6af8272cedca7a0b7e0fe633084f1");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
        synchronized (this.au) {
            if ((this.W == 0 || elapsedRealtime - this.d > 240) && Build.VERSION.SDK_INT >= 17) {
                for (ScanResult scanResult : list) {
                    long j = elapsedRealtime - (scanResult.timestamp / 1000000);
                    if (j < 0) {
                        this.V++;
                    } else if (j <= 61) {
                        this.Q++;
                    } else if (j <= 300) {
                        this.R++;
                    } else if (j <= 600) {
                        this.S++;
                    } else {
                        int i = (j > 1800L ? 1 : (j == 1800L ? 0 : -1));
                        if (i <= 0) {
                            this.T++;
                        } else if (i > 0) {
                            this.U++;
                        }
                    }
                }
            }
        }
        this.d = elapsedRealtime;
        this.W++;
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4d90b077a5c662298c1ffcadebe6928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4d90b077a5c662298c1ffcadebe6928");
            return;
        }
        if (com.meituan.android.common.locate.provider.g.a() == null) {
            str = " LogDataWrapper::ContextProvider::context is null";
        } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
            b();
            return;
        } else {
            try {
                ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(32);
                a(concurrentHashMap);
                if (concurrentHashMap.size() == 0) {
                    return;
                }
                com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
                b();
                return;
            } catch (Exception e) {
                str = "LogDataWrapper::exception" + e.getMessage();
            }
        }
        c.a(str, 3);
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "920a5753ea45bc115036924d99be59ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "920a5753ea45bc115036924d99be59ac");
            return;
        }
        synchronized (this.au) {
            this.e++;
        }
    }
}
