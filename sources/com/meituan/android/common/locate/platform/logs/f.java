package com.meituan.android.common.locate.platform.logs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class f extends e {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I;
    protected int J;
    protected int K;
    protected int L;
    protected int M;
    protected int N;
    protected int O;
    protected int P;
    protected int Q;
    protected int R;
    protected int S;
    protected int T;
    protected int U;
    protected int V;
    protected boolean W;
    protected int a;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    protected int x;
    protected int y;
    protected int z;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23c4bb3fb2c5739df862f8a23d09942d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23c4bb3fb2c5739df862f8a23d09942d");
            return;
        }
        this.a = 0;
        this.d = 0;
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
        this.W = false;
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void a(ConcurrentHashMap<String, String> concurrentHashMap) {
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7326a7549915cce2a889715023cf5ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7326a7549915cce2a889715023cf5ab2");
            return;
        }
        super.a(concurrentHashMap);
        a(concurrentHashMap, "count", this.a);
        a(concurrentHashMap, "errorcount", this.d);
        a(concurrentHashMap, "dbcount", this.e);
        a(concurrentHashMap, "cachecount", this.f);
        a(concurrentHashMap, "postcount", this.g);
        a(concurrentHashMap, "networkcount", this.i);
        a(concurrentHashMap, "gpscount", this.h);
        a(concurrentHashMap, "providernetwork", this.l);
        a(concurrentHashMap, "providergears", this.k);
        a(concurrentHashMap, "providermars", this.j);
        a(concurrentHashMap, "providertencent", this.m);
        a(concurrentHashMap, "nopermcount", this.n);
        a(concurrentHashMap, "biggeracc200", this.o);
        a(concurrentHashMap, "acc200", this.p);
        a(concurrentHashMap, "acc150", this.q);
        a(concurrentHashMap, "acc100", this.r);
        a(concurrentHashMap, "acc50", this.s);
        a(concurrentHashMap, "acc20", this.t);
        a(concurrentHashMap, "acc10", this.u);
        a(concurrentHashMap, "acc5", this.v);
        a(concurrentHashMap, "acc1", this.w);
        a(concurrentHashMap, "delaybigger300", this.x);
        a(concurrentHashMap, "delay300", this.y);
        a(concurrentHashMap, "delay120", this.z);
        a(concurrentHashMap, "delay61", this.A);
        a(concurrentHashMap, "delay31", this.B);
        a(concurrentHashMap, "delay15", this.C);
        a(concurrentHashMap, "delay10", this.D);
        a(concurrentHashMap, "delay5", this.E);
        a(concurrentHashMap, "delay3", this.F);
        a(concurrentHashMap, "delay1", this.G);
        a(concurrentHashMap, "time002", this.H);
        a(concurrentHashMap, "time1", this.I);
        a(concurrentHashMap, "time2", this.J);
        a(concurrentHashMap, "time3", this.K);
        a(concurrentHashMap, "time4", this.L);
        a(concurrentHashMap, "time5", this.M);
        a(concurrentHashMap, "time7", this.N);
        a(concurrentHashMap, "time10", this.O);
        a(concurrentHashMap, "time15", this.P);
        a(concurrentHashMap, "timeBigger15", this.Q);
        a(concurrentHashMap, "gpsDelay100", this.R);
        a(concurrentHashMap, "gpsDelay400", this.S);
        a(concurrentHashMap, "gpsDelay1000", this.T);
        a(concurrentHashMap, "gpsDelay3000", this.U);
        a(concurrentHashMap, "gpsDelayBigger3000", this.V);
        a(concurrentHashMap, "isForeground", this.W ? 1 : 0);
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fce9411e379467f5619487a48bfecc22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fce9411e379467f5619487a48bfecc22");
            return;
        }
        this.a = 0;
        this.d = 0;
        this.n = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
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
        this.W = false;
    }

    @Override // com.meituan.android.common.locate.platform.logs.e
    public void c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c43cdac960c5ef277dfbfe73a12591e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c43cdac960c5ef277dfbfe73a12591e");
            return;
        }
        if (com.meituan.android.common.locate.provider.g.a() == null) {
            str = " LogDataWrapper::ContextProvider::context is null";
        } else if (!com.meituan.android.common.locate.reporter.e.a(com.meituan.android.common.locate.provider.g.a()).d()) {
            b();
            return;
        } else if (this.a <= 0) {
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
}
