package com.meituan.metrics.traffic.okhttp3;

import android.support.annotation.Keep;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.m;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp3Interceptor implements ReflectWrapper, Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751a4e9d02c62e8ea35f8fd81976f943", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751a4e9d02c62e8ea35f8fd81976f943");
        }
        Request request = chain.request();
        HttpConnectionTracker trackConnection = HttpTracker.trackConnection(request.url().toString(), MetricsTrafficManager.getInstance());
        trackConnection.trackRequest(request.method(), toMultimap(request.headers()));
        trackConnection.reportRequestBody(request.body() != null ? request.body().contentLength() : 0L);
        Response proceed = chain.proceed(request);
        ResponseBody body = proceed.body();
        trackConnection.trackResponse(proceed.code(), proceed.message(), toMultimap(proceed.headers()));
        return proceed.newBuilder().body(ResponseBody.create(body.contentType(), body.contentLength(), m.a(m.a(trackConnection.trackResponseBody(body.byteStream()))))).build();
    }

    private Map<String, List<String>> toMultimap(Headers headers) {
        Object[] objArr = {headers};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9864f234491830e71a31d447171ef4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9864f234491830e71a31d447171ef4c");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (headers == null) {
            return linkedHashMap;
        }
        for (String str : headers.names()) {
            linkedHashMap.put(str, headers.values(str));
        }
        return linkedHashMap;
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9a11772b9f922262b1c78238b301d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9a11772b9f922262b1c78238b301d8");
        } else if (obj instanceof OkHttpClient.Builder) {
            OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
            builder.addNetworkInterceptor(this);
            new OkHttp3RequestInterceptor().onWrapper(builder);
            new OkHttp3PrivacyInterceptor().onWrapper(builder);
        }
    }
}
