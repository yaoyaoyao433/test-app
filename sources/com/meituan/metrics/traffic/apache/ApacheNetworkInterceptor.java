package com.meituan.metrics.traffic.apache;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ApacheNetworkInterceptor implements ReflectWrapper, HttpRequestInterceptor, HttpResponseInterceptor {
    private static final String METRICS_CONTEXT_ATTRIBUTE_KEY = "x-metrics-context-attr-tracker";
    public static ChangeQuickRedirect changeQuickRedirect;

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Object[] objArr = {httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed705dad4d91805c039d3bf3091ac9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed705dad4d91805c039d3bf3091ac9b");
            return;
        }
        TrafficRecord.Detail detail = new TrafficRecord.Detail();
        detail.networkTunnel = TrafficRecord.Detail.TUNNEL_HTTP_CLIENT;
        Context context = ContextProvider.getInstance().getContext();
        if (context != null) {
            detail.requestNetworkType = NetWorkUtils.getNetWorkTypeForBabel(context);
        }
        if (httpRequest instanceof HttpUriRequest) {
            HttpRequestBase httpRequestBase = (HttpUriRequest) httpRequest;
            if (httpRequestBase instanceof RequestWrapper) {
                RequestWrapper requestWrapper = (RequestWrapper) httpRequestBase;
                if (requestWrapper.getOriginal() instanceof HttpRequestBase) {
                    httpRequestBase = requestWrapper.getOriginal();
                }
            }
            HttpConnectionTracker trackConnection = HttpTracker.trackConnection(httpRequestBase.getURI().toASCIIString(), MetricsTrafficManager.getInstance());
            trackConnection.trackRequest(httpRequestBase.getMethod(), toMultimap(httpRequestBase.getAllHeaders()));
            trackConnection.reportDetail(detail);
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
                if (httpEntityEnclosingRequest.getEntity() != null) {
                    httpEntityEnclosingRequest.setEntity(new TrackedHttpRequestEntity(httpEntityEnclosingRequest.getEntity(), trackConnection));
                }
            }
            httpContext.setAttribute(METRICS_CONTEXT_ATTRIBUTE_KEY, trackConnection);
        }
    }

    private Map<String, List<String>> toMultimap(Header[] headerArr) {
        Object[] objArr = {headerArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0eeb5159966b401ae2c73f6b2316acf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0eeb5159966b401ae2c73f6b2316acf7");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Header header : headerArr) {
            List list = (List) linkedHashMap.get(header.getName());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(header.getValue());
                linkedHashMap.put(header.getName(), arrayList);
            } else {
                list.add(header.getValue());
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
        }
        return linkedHashMap;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Object[] objArr = {httpResponse, httpContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b45c7fc0d7efc7de09207387ef2ab21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b45c7fc0d7efc7de09207387ef2ab21");
            return;
        }
        Object attribute = httpContext.getAttribute(METRICS_CONTEXT_ATTRIBUTE_KEY);
        if (attribute instanceof HttpConnectionTracker) {
            HttpConnectionTracker httpConnectionTracker = (HttpConnectionTracker) attribute;
            httpConnectionTracker.trackResponse(httpResponse.getStatusLine().getStatusCode(), httpResponse.getStatusLine().toString(), toMultimap(httpResponse.getAllHeaders()));
            if (httpResponse.getEntity() != null) {
                httpResponse.setEntity(new TrackedHttpResponseEntity(httpResponse.getEntity(), httpConnectionTracker));
            } else {
                httpConnectionTracker.reportResponseBody(0L);
            }
        }
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a716534a84af572fa16020a5a6f5813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a716534a84af572fa16020a5a6f5813");
        } else if (obj instanceof DefaultHttpClient) {
            DefaultHttpClient defaultHttpClient = (DefaultHttpClient) obj;
            defaultHttpClient.addRequestInterceptor(this);
            defaultHttpClient.addResponseInterceptor(this);
            new ApachePrivacyInterceptor().onWrapper(obj);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class TrackedHttpRequestEntity extends HttpEntityWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final HttpConnectionTracker tracker;

        public TrackedHttpRequestEntity(HttpEntity httpEntity, HttpConnectionTracker httpConnectionTracker) {
            super(httpEntity);
            Object[] objArr = {httpEntity, httpConnectionTracker};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cca8d4815a9a6f389034cecf1aeecb7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cca8d4815a9a6f389034cecf1aeecb7");
            } else {
                this.tracker = httpConnectionTracker;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            Object[] objArr = {outputStream};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ce6f551f7d5901788c1690e31107bf8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ce6f551f7d5901788c1690e31107bf8");
            } else {
                super.writeTo(this.tracker.trackRequestBody(outputStream));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class TrackedHttpResponseEntity extends HttpEntityWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private InputStream content;
        private final HttpConnectionTracker tracker;

        public TrackedHttpResponseEntity(HttpEntity httpEntity, HttpConnectionTracker httpConnectionTracker) {
            super(httpEntity);
            Object[] objArr = {ApacheNetworkInterceptor.this, httpEntity, httpConnectionTracker};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39569b1f24acc8f69de634ac7487343c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39569b1f24acc8f69de634ac7487343c");
            } else {
                this.tracker = httpConnectionTracker;
            }
        }

        public InputStream getContent() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c61cb7c4114fb2391451f9960f58bafa", RobustBitConfig.DEFAULT_VALUE)) {
                return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c61cb7c4114fb2391451f9960f58bafa");
            }
            if (this.content == null) {
                this.content = this.tracker.trackResponseBody(super.getContent());
            }
            return this.content;
        }
    }
}
