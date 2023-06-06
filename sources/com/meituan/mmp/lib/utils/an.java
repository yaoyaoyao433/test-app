package com.meituan.mmp.lib.utils;

import com.meituan.android.okhttp3dns.a;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.mmp.lib.utils.aa;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class an {
    public static ChangeQuickRedirect a;
    private static an f = new an();
    public long b;
    public long c;
    public long d;
    public long e;
    private OkHttpClient g;
    private OkHttpClient h;
    private OkHttpClient i;
    private OkHttpClient j;
    private OkHttpClient k;
    private com.meituan.android.okhttp3dns.a l;
    private Dispatcher m;
    private Dispatcher n;

    public an() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c994d5fedca461d7efedff76a597b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c994d5fedca461d7efedff76a597b8");
            return;
        }
        this.b = 10000L;
        this.c = 10000L;
        this.d = 10000L;
        this.e = 10000L;
        this.l = new a.C0319a().a(new a()).a(MMPEnvHelper.getContext());
    }

    public static an a() {
        return f;
    }

    private synchronized Dispatcher g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942f06ed1272f4fd04c68f8fd53a9f6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942f06ed1272f4fd04c68f8fd53a9f6e");
        }
        if (this.m == null) {
            this.m = new Dispatcher();
            this.m.setMaxRequests(20);
            this.m.setMaxRequestsPerHost(20);
        }
        return this.m;
    }

    private synchronized Dispatcher h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1e764aaa3b13bb4e9a4c96e0615c8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1e764aaa3b13bb4e9a4c96e0615c8e");
        }
        if (this.n == null) {
            this.n = new Dispatcher();
            this.n.setMaxRequests(20);
            this.n.setMaxRequestsPerHost(20);
        }
        return this.n;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements com.meituan.android.httpdns.r {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.android.httpdns.r
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44aba2641d3f2d6726990fb464153ce0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44aba2641d3f2d6726990fb464153ce0");
            } else {
                com.meituan.mmp.lib.trace.b.b("OKHttpFactory", str);
            }
        }
    }

    private OkHttpClient a(long j, Dispatcher dispatcher) {
        Object[] objArr = {new Long(j), dispatcher};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2696ef0b11f6e9d380021115774396cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2696ef0b11f6e9d380021115774396cf");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient.Builder addInterceptor = builder.dispatcher(dispatcher).connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).addInterceptor(aa.b.a()).addInterceptor(aa.b.b());
        if (com.meituan.mmp.lib.config.b.B()) {
            addInterceptor.dns(this.l);
        }
        return addInterceptor.build();
    }

    public final synchronized OkHttpClient b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a829203ba5eb1432a096a23aa91da8e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a829203ba5eb1432a096a23aa91da8e0");
        }
        if (this.g == null) {
            this.g = a(this.b, g());
        }
        return this.g;
    }

    public final synchronized OkHttpClient c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74876890f9f286cb3972852a84c960b", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74876890f9f286cb3972852a84c960b");
        }
        if (this.h == null) {
            this.h = a(this.c, g());
        }
        return this.h;
    }

    public final synchronized OkHttpClient d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc5ea36379a432786e933e4edf92b85", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc5ea36379a432786e933e4edf92b85");
        }
        if (this.i == null) {
            this.i = a(this.d, g());
        }
        return this.i;
    }

    public final synchronized OkHttpClient e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ce76f0b97ea72574dcd2ced837932f", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ce76f0b97ea72574dcd2ced837932f");
        }
        if (this.j == null) {
            this.j = a(this.e, g());
        }
        return this.j;
    }

    @Deprecated
    public final synchronized OkHttpClient f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661b1102033f542b078ba2ec4c8f4080", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661b1102033f542b078ba2ec4c8f4080");
        }
        if (this.k == null) {
            this.k = a(10000L, h());
        }
        return this.k;
    }
}
