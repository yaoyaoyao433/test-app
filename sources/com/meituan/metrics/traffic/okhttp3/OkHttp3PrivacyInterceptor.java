package com.meituan.metrics.traffic.okhttp3;

import android.support.annotation.Keep;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealResponseBody;
import okio.c;
import okio.m;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp3PrivacyInterceptor implements ReflectWrapper, Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d33b9c6f71debea0ce3bb09081cb26d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d33b9c6f71debea0ce3bb09081cb26d");
        }
        Request request = chain.request();
        if (!PrivacyUtil.a()) {
            return chain.proceed(request);
        }
        if (PrivacyUtil.a(request.url())) {
            PrivacyUtil.b a = PrivacyUtil.a(0, request.url().toString());
            if (a.a == 2) {
                return new Response.Builder().request(request).protocol(Protocol.HTTP_1_0).code(403).message("CIPPrivacy forbid request").body(new RealResponseBody("", -1L, m.a(new ErrorLengthSource()))).build();
            }
            if (a.a == 1) {
                return chain.proceed(request.newBuilder().url(a.b).build());
            }
        }
        return chain.proceed(request);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class ErrorLengthSource implements s {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.s
        public long read(c cVar, long j) throws IOException {
            return -1L;
        }

        public ErrorLengthSource() {
        }

        @Override // okio.s
        public t timeout() {
            return t.NONE;
        }
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "314d678af0e08d0bf89e03070c9a31f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "314d678af0e08d0bf89e03070c9a31f7");
        } else if (obj instanceof OkHttpClient.Builder) {
            OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
            builder.addInterceptor(this);
            builder.addInterceptor(new OkHttp3CandyInterceptor());
        }
    }
}
