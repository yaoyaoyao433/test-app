package com.meituan.msi.util.network;

import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private OkHttpClient g;
    private OkHttpClient h;
    private OkHttpClient i;
    private Dispatcher j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d420620d8ecba8684dc289bb9f9bcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d420620d8ecba8684dc289bb9f9bcb");
            return;
        }
        this.c = 10000L;
        this.d = 10000L;
        this.e = 10000L;
        this.f = 10000L;
    }

    public static a a() {
        return b;
    }

    private synchronized Dispatcher e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f0dee2d6b85e1595c62507677bbdb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f0dee2d6b85e1595c62507677bbdb4");
        }
        if (this.j == null) {
            this.j = new Dispatcher();
            this.j.setMaxRequests(20);
            this.j.setMaxRequestsPerHost(20);
        }
        return this.j;
    }

    public final synchronized OkHttpClient b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6536153410d55dd4b897abb158ed66b", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6536153410d55dd4b897abb158ed66b");
        }
        if (this.g == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            this.g = builder.dispatcher(e()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).build();
        }
        return this.g;
    }

    public final synchronized OkHttpClient c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80991b77635578488b7ceb72265a034d", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80991b77635578488b7ceb72265a034d");
        }
        if (this.h == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            this.h = builder.dispatcher(e()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).build();
        }
        return this.h;
    }

    public final synchronized OkHttpClient d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae57c6f1bbf6563ad4821cfbe85e363", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae57c6f1bbf6563ad4821cfbe85e363");
        }
        if (this.i == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            this.i = builder.dispatcher(e()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).build();
        }
        return this.i;
    }
}
