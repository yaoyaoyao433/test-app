package com.meituan.msi.util;

import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.msi.api.network.okhttp3.c;
import com.meituan.msi.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u {
    public static ChangeQuickRedirect a;
    private static final u b = new u();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private OkHttpClient g;
    private OkHttpClient h;
    private Dispatcher i;

    public u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837dcc1c40af26dfe81bc3a9e3b9b8d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837dcc1c40af26dfe81bc3a9e3b9b8d3");
            return;
        }
        this.c = 10000L;
        this.d = 10000L;
        this.e = 10000L;
        this.f = 10000L;
    }

    public static u a() {
        return b;
    }

    private synchronized Dispatcher d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75eb27ec14cb106fa821581f94f5d8d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75eb27ec14cb106fa821581f94f5d8d8");
        }
        if (this.i == null) {
            this.i = new Dispatcher();
            this.i.setMaxRequests(20);
            this.i.setMaxRequestsPerHost(20);
        }
        return this.i;
    }

    public final synchronized OkHttpClient b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c568245f3e4cae7ff986c656c7b79b14", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c568245f3e4cae7ff986c656c7b79b14");
        }
        if (this.g == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            this.g = builder.dispatcher(d()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(j.b.a()).addInterceptor(j.b.b()).addInterceptor(new com.meituan.msi.api.network.okhttp3.a()).eventListener(new c.a()).build();
        }
        return this.g;
    }

    public final synchronized OkHttpClient c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7151c7c747b2b55b2be3f342655591ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7151c7c747b2b55b2be3f342655591ab");
        }
        if (this.h == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            this.h = builder.dispatcher(d()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(j.b.a()).addInterceptor(j.b.b()).eventListener(new c.a()).build();
        }
        return this.h;
    }
}
