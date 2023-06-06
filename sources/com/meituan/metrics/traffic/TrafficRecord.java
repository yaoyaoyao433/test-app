package com.meituan.metrics.traffic;

import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.NetUtils;
import com.meituan.metrics.util.RequestContext;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficRecord extends BasicTrafficUnit {
    private static final int RESPONSE_STATUS_STOCK_SIZE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String date;
    public volatile Detail detail;
    public volatile long duration;
    public volatile long endTime;
    public String key;
    public volatile String method;
    public String mtWebviewReferer;
    public volatile long requestBodySize;
    public volatile long requestHeaderSize;
    public volatile Map<String, List<String>> requestHeaders;
    public volatile long responseBodySize;
    public volatile int responseCode;
    public volatile long responseHeaderSize;
    public volatile Map<String, List<String>> responseHeaders;
    public final long startTime;
    public volatile int type;
    public final String url;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Detail {
        public static final String TUNNEL_CRONET = "cronet";
        public static final String TUNNEL_CRONET_METRICS = "cronetMetrics";
        public static final String TUNNEL_DOWNLOAD = "downloadManager";
        public static final String TUNNEL_HTTP_CLIENT = "httpClient";
        public static final String TUNNEL_IM_SOCKET = "IMSocket";
        public static final String TUNNEL_MTLIVE = "mtlive";
        public static final String TUNNEL_MTWEBVIEW = "mtWebview";
        public static final String TUNNEL_NATIVE_HOOK = "nativeHook";
        public static final String TUNNEL_OKHTTP2 = "okhttp2";
        public static final String TUNNEL_OKHTTP3 = "okhttp3";
        public static final String TUNNEL_PIKE = "pike";
        public static final String TUNNEL_SHARK = "shark";
        public static final String TUNNEL_URL_CONNECTION = "httpURLConnection";
        public static ChangeQuickRedirect changeQuickRedirect;
        @Deprecated
        public volatile byte[] bodyBytes;
        public volatile boolean cached;
        public volatile InetSocketAddress connectIp;
        public volatile Throwable exception;
        public volatile List<InetAddress> ipList;
        public volatile InetSocketAddress localIp;
        public volatile long netFramePreEnd;
        public volatile long netFramePreStart;
        public volatile long netLibPostEnd;
        public volatile long netLibPostStart;
        public volatile String networkLibInfo;
        public volatile String networkTunnel;
        public volatile String protocol;
        public volatile String proxy;
        public volatile boolean redirect;
        public RequestContext requestContext;
        public String requestNetworkType;
        public Object responseExt;
        public volatile String switchTunnel;
        public volatile String tlsVersion;
        public volatile String tunnelSource;
        public volatile String url;
        public volatile boolean needReportTraffic = true;
        public volatile long dnsTime = -1;
        public volatile long connTime = -1;
        public volatile long tlsTime = -1;
        public volatile long requestTime = -1;
        public volatile long requestHeaderTime = -1;
        public volatile long requestBodyTime = -1;
        public volatile long responseTime = -1;
        public volatile long responseHeaderTime = -1;
        public volatile long responseBodyTime = -1;
        public volatile long ttfbTime = -1;
        public volatile long elapsedTime = -1;
        public volatile long serverTime = -1;
        public volatile long startTime = -1;
        public volatile long endTime = -1;
        public volatile int requestReuse = -1;
        public int tunnelType = -1;
        public final Map<String, Object> extra = new ConcurrentHashMap();
        public volatile int connectTryNum = -1;
        public volatile int connectFailedNum = -1;
        public volatile int dnsType = -1;
        public String currentActivity = MetricsActivityLifecycleManager.currentActivity;
    }

    public String getUrl() {
        return this.url;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public void setMTWebviewReferer(String str) {
        this.mtWebviewReferer = str;
    }

    public String getMTWebviewReferer() {
        return this.mtWebviewReferer;
    }

    public String getMethod() {
        return this.method;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    public long getRequestBodySize() {
        return this.requestBodySize;
    }

    public long getResponseBodySize() {
        return this.responseBodySize;
    }

    public long getRequestHeaderSize() {
        return this.requestHeaderSize;
    }

    public long getResponseHeaderSize() {
        return this.responseHeaderSize;
    }

    public void setRequestHeaders(String str, Map<String, List<String>> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b93b3db4b56ecc9a5837ede4042112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b93b3db4b56ecc9a5837ede4042112");
            return;
        }
        this.method = str;
        this.requestHeaders = map;
        this.requestHeaderSize = NetUtils.getStringByteSize(str) + NetUtils.getHeaderByteSize(map);
        this.txBytes += this.requestHeaderSize;
    }

    public void setResponseHeaders(String str, Map<String, List<String>> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b2a5788ab3ab40300a6a00fa4bf65fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b2a5788ab3ab40300a6a00fa4bf65fb");
            return;
        }
        this.responseHeaders = map;
        this.responseHeaderSize = NetUtils.getStringByteSize(str) + NetUtils.getHeaderByteSize(map) + 2;
        this.rxBytes += this.responseHeaderSize;
    }

    public void setRequestBodySize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e65b9292eb9807e93387c9839f03387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e65b9292eb9807e93387c9839f03387");
            return;
        }
        this.requestBodySize = j;
        this.txBytes += j;
    }

    public void setResponseBodySize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28631587d6beb1b7e49f4bd2f5d27dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28631587d6beb1b7e49f4bd2f5d27dc");
            return;
        }
        this.responseBodySize = j;
        this.rxBytes += j;
    }

    public int getType() {
        return this.type;
    }

    public void setResponseCode(int i) {
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Detail getDetail() {
        return this.detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public TrafficRecord(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd02156388fa6df8c67c90add234b281", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd02156388fa6df8c67c90add234b281");
            return;
        }
        this.startTime = System.currentTimeMillis();
        this.type = -1;
        this.url = str;
        this.txBytes += NetUtils.getStringByteSize(str);
        this.date = TimeUtil.currentSysDate();
    }

    @Override // com.meituan.metrics.util.BasicTrafficUnit
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9799b67acada94771220c7f5043869f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9799b67acada94771220c7f5043869f1");
        }
        return "TrafficRecord{type:" + this.type + ", tx:" + this.txBytes + " bytes, rx:" + this.rxBytes + "bytrs, url: " + this.url + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
