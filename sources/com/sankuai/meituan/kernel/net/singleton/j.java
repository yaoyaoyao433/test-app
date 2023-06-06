package com.sankuai.meituan.kernel.net.singleton;

import android.util.Log;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static OkHttpClient.Builder a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eee265e06f196990820abfada20bfb76", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eee265e06f196990820abfada20bfb76");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        return builder.connectTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).cookieJar(new com.sankuai.meituan.kernel.net.okhttp3.a(new com.sankuai.meituan.kernel.net.okhttp3.b())).socketFactory(new com.sankuai.meituan.common.net.b());
    }

    public static OkHttpClient.Builder a(com.sankuai.meituan.kernel.net.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "481582afbcc4fb05386759a399c5100b", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "481582afbcc4fb05386759a399c5100b");
        }
        if (dVar == null) {
            return a();
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        if (dVar != null) {
            try {
                dVar.a(builder);
            } catch (Throwable th) {
                th.printStackTrace();
                com.dianping.networklog.c.a("inject OkHttp3 Builder exception. " + Log.getStackTraceString(th), 2);
            }
        }
        return builder;
    }
}
