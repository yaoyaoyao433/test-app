package com.meituan.metrics.traffic.okhttp3;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.okhttp3.eventlistener.OkHttp3EventListener;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.traffic.report.ReportDetailManager;
import com.meituan.metrics.util.RequestContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.common.utils.VersionUtil;
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
import okhttp3.internal.Version;
import okio.m;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp3RequestInterceptor implements ReflectWrapper, Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ThreadLocal<TrafficRecord.Detail> threadLocal;

    public OkHttp3RequestInterceptor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "795ef16c0be809521a85dab404615bb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "795ef16c0be809521a85dab404615bb9");
        } else {
            this.threadLocal = new ThreadLocal<>();
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ddc07e7730e51480d936b2c55315cbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ddc07e7730e51480d936b2c55315cbe");
        }
        if (!ReportDetailManager.getInstance().isEnable()) {
            return chain.proceed(chain.request());
        }
        TrafficRecord.Detail detail = getDetail();
        detail.requestContext = RequestContext.create();
        detail.needReportTraffic = false;
        detail.startTime = System.currentTimeMillis();
        detail.networkTunnel = TrafficRecord.Detail.TUNNEL_OKHTTP3;
        Context context = ContextProvider.getInstance().getContext();
        if (context != null) {
            detail.requestNetworkType = NetWorkUtils.getNetWorkTypeForBabel(context);
        }
        Request request = chain.request();
        detail.networkLibInfo = request.header("network_lib");
        detail.tunnelSource = request.header(NetLogConstants.Tags.TUNNEL_SOURCE);
        detail.switchTunnel = request.header("switch_tunnel");
        Request.Builder newBuilder = request.newBuilder();
        if (!TextUtils.isEmpty(detail.networkLibInfo)) {
            newBuilder.removeHeader("network_lib");
        }
        if (!TextUtils.isEmpty(detail.tunnelSource)) {
            newBuilder.removeHeader(NetLogConstants.Tags.TUNNEL_SOURCE);
        }
        if (!TextUtils.isEmpty(detail.switchTunnel)) {
            newBuilder.removeHeader("switch_tunnel");
        }
        Request build = newBuilder.build();
        HttpConnectionTracker trackConnection = HttpTracker.trackConnection(build.url().toString(), MetricsTrafficManager.getInstance());
        trackConnection.trackRequest(build.method(), toMultimap(build.headers()));
        trackConnection.reportRequestBody(build.body() != null ? build.body().contentLength() : 0L);
        trackConnection.reportDetail(detail);
        try {
            Response proceed = chain.proceed(build);
            ResponseBody body = proceed.body();
            trackMetrics(build, proceed, null, detail);
            finish();
            trackConnection.trackResponse(proceed.code(), proceed.message(), toMultimap(proceed.headers()));
            return proceed.newBuilder().body(ResponseBody.create(body.contentType(), body.contentLength(), m.a(m.a(trackConnection.trackResponseBody(body.byteStream()))))).build();
        } finally {
        }
    }

    private void trackMetrics(Request request, Response response, Throwable th, TrafficRecord.Detail detail) {
        Object[] objArr = {request, response, th, detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d704a91dc86ea7b1af834a4d32a5887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d704a91dc86ea7b1af834a4d32a5887");
            return;
        }
        detail.endTime = System.currentTimeMillis();
        detail.elapsedTime = detail.endTime - detail.startTime;
        if (response != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(response.protocol());
            detail.protocol = sb.toString();
            if (response.handshake() != null) {
                detail.tlsVersion = response.handshake().tlsVersion().javaName();
            }
            if (response.headers() != null) {
                detail.url = response.headers().get("nt_url");
                processTimeFromResponseHeader(detail, response.headers());
            }
        }
    }

    private Map<String, List<String>> toMultimap(Headers headers) {
        Object[] objArr = {headers};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1db42961624b1aca6325f5933d57241", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1db42961624b1aca6325f5933d57241");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92df61e624c10d44a66bf8adc92d2da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92df61e624c10d44a66bf8adc92d2da");
        } else if (obj instanceof OkHttpClient.Builder) {
            OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
            builder.addInterceptor(this);
            if (thanOrEqualVersion("3.11")) {
                builder.eventListenerFactory(new OkHttp3EventListener.Factory(this));
            }
        }
    }

    private boolean thanOrEqualVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "090ad47be4caba0baacad76f45f70f48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "090ad47be4caba0baacad76f45f70f48")).booleanValue();
        }
        String userAgent = Version.userAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            String[] split = userAgent.split("/");
            return split.length == 2 && VersionUtil.compare(split[1], str) >= 0;
        }
        return false;
    }

    public TrafficRecord.Detail getDetail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f81e089e6da7ca488a72a6d25a36654", RobustBitConfig.DEFAULT_VALUE)) {
            return (TrafficRecord.Detail) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f81e089e6da7ca488a72a6d25a36654");
        }
        TrafficRecord.Detail detail = this.threadLocal.get();
        if (detail == null) {
            TrafficRecord.Detail detail2 = new TrafficRecord.Detail();
            detail2.networkTunnel = TrafficRecord.Detail.TUNNEL_OKHTTP3;
            this.threadLocal.set(detail2);
            return detail2;
        }
        return detail;
    }

    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4a62449788f232527fa4094d1be4a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4a62449788f232527fa4094d1be4a1");
        } else {
            this.threadLocal.remove();
        }
    }

    public void processTimeFromResponseHeader(TrafficRecord.Detail detail, Headers headers) {
        Object[] objArr = {detail, headers};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15aeb2c42170a6248cb940eeb292e75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15aeb2c42170a6248cb940eeb292e75c");
        } else if (headers == null || detail.networkLibInfo == null || !detail.networkLibInfo.startsWith("mt-common-net")) {
        } else {
            detail.netLibPostStart = NumberUtils.parseLong(headers.get("nt_request_time"), -1L);
            long parseLong = NumberUtils.parseLong(headers.get("nt_repsonse_elapsetime"), -1L);
            if (detail.netLibPostStart <= 0 || parseLong < 0) {
                return;
            }
            detail.netLibPostEnd = detail.netLibPostStart + parseLong;
        }
    }
}
