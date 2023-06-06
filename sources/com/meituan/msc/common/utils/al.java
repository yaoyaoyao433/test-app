package com.meituan.msc.common.utils;

import com.meituan.android.okhttp3dns.a;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.msc.common.utils.z;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class al {
    public static ChangeQuickRedirect a;
    private static al f = new al();
    public long b;
    public long c;
    public long d;
    public long e;
    private OkHttpClient g;
    private OkHttpClient h;
    private OkHttpClient i;
    private com.meituan.android.okhttp3dns.a j;
    private Dispatcher k;
    private Dispatcher l;

    public al() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f497833f6f480984d675b0d08c66fe31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f497833f6f480984d675b0d08c66fe31");
            return;
        }
        this.b = 10000L;
        this.c = 10000L;
        this.d = 10000L;
        this.e = 10000L;
        this.j = new a.C0319a().a(new a()).a(MSCEnvHelper.getContext());
    }

    public static al a() {
        return f;
    }

    private synchronized Dispatcher e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7fa881e180a83f9baad03c4b686dae2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7fa881e180a83f9baad03c4b686dae2");
        }
        if (this.k == null) {
            this.k = new Dispatcher();
            this.k.setMaxRequests(20);
            this.k.setMaxRequestsPerHost(20);
        }
        return this.k;
    }

    private synchronized Dispatcher f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688150309fba42fcf771385549304940", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688150309fba42fcf771385549304940");
        }
        if (this.l == null) {
            this.l = new Dispatcher();
            this.l.setMaxRequests(20);
            this.l.setMaxRequestsPerHost(20);
        }
        return this.l;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements com.meituan.android.httpdns.r {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.android.httpdns.r
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b60a878d50c850e5780adffcc28145", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b60a878d50c850e5780adffcc28145");
            } else {
                com.meituan.msc.modules.reporter.g.b("OKHttpFactory", str);
            }
        }
    }

    private OkHttpClient a(long j, Dispatcher dispatcher) {
        Object[] objArr = {new Long(j), dispatcher};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c4fbf426c46e2725b164b2bdcdc234", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c4fbf426c46e2725b164b2bdcdc234");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient.Builder addInterceptor = builder.dispatcher(dispatcher).connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j, TimeUnit.MILLISECONDS).writeTimeout(j, TimeUnit.MILLISECONDS).addInterceptor(z.b.a()).addInterceptor(z.b.b());
        if (com.meituan.msc.common.config.b.o()) {
            addInterceptor.dns(this.j);
        }
        return addInterceptor.build();
    }

    public final synchronized OkHttpClient b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2fd93d302ba6fc04e48e6ea1c27ba5", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2fd93d302ba6fc04e48e6ea1c27ba5");
        }
        if (this.g == null) {
            this.g = a(this.b, e());
        }
        return this.g;
    }

    public final synchronized OkHttpClient c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c031a9e2eb9314ad61aad4bfa7249932", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c031a9e2eb9314ad61aad4bfa7249932");
        }
        if (this.h == null) {
            this.h = a(this.e, e());
        }
        return this.h;
    }

    @Deprecated
    public final synchronized OkHttpClient d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1fcefd983ab887eccc15907b0a2123f", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1fcefd983ab887eccc15907b0a2123f");
        }
        if (this.i == null) {
            this.i = a(10000L, f());
        }
        return this.i;
    }
}
