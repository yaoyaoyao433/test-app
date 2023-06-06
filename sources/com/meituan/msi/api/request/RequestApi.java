package com.meituan.msi.api.request;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.msi.annotations.MsiApiGray;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.network.HeadersReceivedEvent;
import com.meituan.msi.api.network.a;
import com.meituan.msi.api.network.okhttp3.b;
import com.meituan.msi.api.network.okhttp3.c;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.msi.util.l;
import com.meituan.msi.util.s;
import com.meituan.msi.util.t;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ac;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.n;
import com.sankuai.meituan.retrofit2.o;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.r;
import com.tencent.open.SocialConstants;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.http.HttpMethod;
/* compiled from: ProGuard */
@MsiApiGray(graySwitchName = "api_request")
/* loaded from: classes3.dex */
public class RequestApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private static final ad e = ad.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
    private long b;
    private long c;
    private String d;
    private final Map<String, n> f;
    private boolean g;
    private boolean h;
    private List<Interceptor> i;
    private String j;
    private String k;
    private a l;
    private volatile boolean m;

    @MsiApiMethod(isCallback = true, name = "RequestTask.offHeadersReceived")
    public void offRequestHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "RequestTask.onHeadersReceived", response = HeadersReceivedEvent.class)
    public void onRequestHeadersReceived(MsiContext msiContext) {
    }

    public RequestApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633cab0e759801b675b7897f2bffb560", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633cab0e759801b675b7897f2bffb560");
            return;
        }
        this.f = new ConcurrentHashMap();
        this.g = false;
        this.i = new ArrayList();
    }

    public static /* synthetic */ RequestApiResponse a(RequestApi requestApi, Response response, String str, MsiContext msiContext) {
        Object[] objArr = {response, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "4f31cc29d737cb74b1d503a85ed5e383", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestApiResponse) PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "4f31cc29d737cb74b1d503a85ed5e383");
        }
        RequestApiResponse requestApiResponse = new RequestApiResponse();
        HashMap hashMap = new HashMap();
        List<q> d = response.d();
        HashSet hashSet = new HashSet();
        for (q qVar : d) {
            if ("Set-Cookie".equalsIgnoreCase(qVar.a())) {
                hashSet.add(qVar.b());
            } else {
                hashMap.put(qVar.a(), qVar.b());
            }
        }
        hashMap.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, hashSet));
        requestApiResponse.cookies = (String[]) hashSet.toArray(new String[0]);
        requestApiResponse.header = hashMap;
        HeadersReceivedEvent headersReceivedEvent = new HeadersReceivedEvent();
        headersReceivedEvent.header = hashMap;
        headersReceivedEvent.cookies = new ArrayList();
        headersReceivedEvent.cookies.addAll(hashSet);
        msiContext.dispatchEvent("RequestTask.onHeadersReceived", headersReceivedEvent, str);
        return requestApiResponse;
    }

    public static /* synthetic */ void a(RequestApi requestApi, ProfileInfo profileInfo, Call call) {
        long j;
        Object[] objArr = {profileInfo, call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "4f5b4f4499c9769b32e7c71cb42881a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "4f5b4f4499c9769b32e7c71cb42881a5");
            return;
        }
        b a2 = c.a(String.valueOf(call.hashCode()));
        if (a2 != null) {
            long currentTimeMillis = System.currentTimeMillis() - requestApi.b;
            long a3 = s.a();
            if (currentTimeMillis != 0) {
                j = (((a3 - requestApi.c) / 1024) * 1000) / currentTimeMillis;
            } else {
                com.meituan.msi.log.a.a("can not divide by zero");
                j = 0;
            }
            profileInfo.throughputKbps = j;
            profileInfo.estimate_nettype = j == 0 ? 1L : j < 50 ? 2L : j <= 100 ? 3L : j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE ? 4L : j <= 100000 ? 5L : 6L;
            profileInfo.CallEnd = a2.b;
            profileInfo.CallStart = a2.b;
            profileInfo.connectEnd = a2.g;
            profileInfo.connectStart = a2.f;
            profileInfo.domainLookUpEnd = a2.e;
            profileInfo.domainLookUpStart = a2.d;
            profileInfo.peerIP = a2.m;
            profileInfo.port = a2.n;
            profileInfo.requestEnd = a2.k;
            profileInfo.requestStart = a2.j;
            profileInfo.responseEnd = a2.l;
            profileInfo.socketReused = a2.o;
            profileInfo.SSLconnectionStart = a2.h;
            profileInfo.SSLconnectionEnd = a2.i;
        }
    }

    public static /* synthetic */ void a(RequestApi requestApi, SharkProfile sharkProfile) {
        Object[] objArr = {sharkProfile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "a191fc4faf829ba0c9bc193887d3bce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "a191fc4faf829ba0c9bc193887d3bce1");
            return;
        }
        requestApi.l = l.a();
        if (requestApi.l != null) {
            sharkProfile.rtt = -1.0d;
            sharkProfile.tcpRtt = requestApi.l.a();
            sharkProfile.throughput = requestApi.l.b();
            sharkProfile.bandwidthDelayProduct = -1.0d;
        }
    }

    public static /* synthetic */ void a(RequestApi requestApi, SharkProfile sharkProfile, com.sankuai.meituan.retrofit2.ext.a aVar) {
        Object[] objArr = {sharkProfile, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "442bbee8d12e0748b0104c089c6a6d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "442bbee8d12e0748b0104c089c6a6d37");
            return;
        }
        sharkProfile.requestInterval = -1.0d;
        sharkProfile.requestCompressInterval = -1.0d;
        sharkProfile.requestEncryptInterval = -1.0d;
        sharkProfile.responseInterval = -1.0d;
        sharkProfile.responseDecompressInterval = -1.0d;
        sharkProfile.responseDecryptInterval = -1.0d;
        sharkProfile.sharkServerForwardInterval = -1.0d;
    }

    public static /* synthetic */ void a(RequestApi requestApi, MsiContext msiContext, RequestApiResponse requestApiResponse, Response response, String str, String str2) {
        Object[] objArr = {msiContext, requestApiResponse, response, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "d359f68f6e5c327023eb28e4de9759a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "d359f68f6e5c327023eb28e4de9759a4");
            return;
        }
        ap g = response.e() != null ? (ap) response.e() : response.g();
        requestApiResponse.statusCode = response.b();
        if (g != null) {
            String string = g.string();
            if (DaBaiDao.JSON_DATA.equalsIgnoreCase(str)) {
                try {
                    requestApiResponse.data = new JsonParser().parse(string);
                } catch (Exception unused) {
                }
                if (g.contentLength() > 0 && TextUtils.isEmpty(string)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("businessCode", 10001);
                    com.meituan.msi.log.a.a(hashMap, msiContext.request, "msi.api.network.exception", 0, 1.0f);
                }
            }
            requestApiResponse.data = string;
            if (g.contentLength() > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("businessCode", 10001);
                com.meituan.msi.log.a.a(hashMap2, msiContext.request, "msi.api.network.exception", 0, 1.0f);
            }
        }
        ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
        responseWithInnerData.response = requestApiResponse;
        HashMap hashMap3 = new HashMap();
        hashMap3.put(ResponseWithInnerData.TASK_ID, str2);
        responseWithInnerData.innerData = hashMap3;
        msiContext.onSuccess(responseWithInnerData);
    }

    public static /* synthetic */ void a(RequestApi requestApi, MsiContext msiContext, RequestPerformanceEventInner requestPerformanceEventInner, aj.a aVar, Response response, boolean z, long j) {
        Object[] objArr = {msiContext, requestPerformanceEventInner, aVar, response, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "4ba3eb3dab5a96ecedf59f60b088a91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "4ba3eb3dab5a96ecedf59f60b088a91a");
            return;
        }
        aj a2 = aVar.a();
        Object[] objArr2 = {a2, response, requestPerformanceEventInner};
        ChangeQuickRedirect changeQuickRedirect2 = t.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3988b4ce516550e62f68e67ae8fc5ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3988b4ce516550e62f68e67ae8fc5ae9");
        } else {
            String b = a2.b();
            requestPerformanceEventInner.requestSize = (a2.i() == null ? 0L : a2.i().contentLength()) + b.getBytes().length + s.a(a2.d());
            requestPerformanceEventInner.requestMethod = a2.c();
            requestPerformanceEventInner.protocol = Uri.parse(b).getScheme();
            if (response != null) {
                requestPerformanceEventInner.responseSize = (response.e() != null ? ((ap) response.e()).contentLength() : 0L) + s.a(response.d());
                requestPerformanceEventInner.statusCode = response.b();
            }
        }
        requestPerformanceEventInner.apiName = SocialConstants.TYPE_REQUEST;
        requestPerformanceEventInner.sharkTunnel = z;
        requestPerformanceEventInner.value = SystemClock.elapsedRealtime() - j;
        msiContext.getEventDispatcher().a(EventHandler.EVENT_REQUEST_PERFORMANCE_INNER, w.a(requestPerformanceEventInner));
    }

    public static /* synthetic */ void a(RequestApi requestApi, MsiContext msiContext, Throwable th, String str) {
        String message;
        Object[] objArr = {msiContext, th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "2c398f77e222f8f4dd6277e361218eba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "2c398f77e222f8f4dd6277e361218eba");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ResponseWithInnerData.TASK_ID, str);
        if (th != null && TextUtils.equals("Already canceled", th.getMessage())) {
            message = "request:fail abort";
        } else if (th instanceof SocketTimeoutException) {
            message = "request timeout";
        } else {
            message = th == null ? "" : th.getMessage();
        }
        msiContext.onError(message, hashMap);
    }

    public final boolean a() {
        return this.m;
    }

    public final void a(String str, String str2, boolean z, boolean z2, List<Interceptor> list) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ada16f3a478fb20f479cb134fdc82a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ada16f3a478fb20f479cb134fdc82a2");
        } else if (!this.m) {
            synchronized (this) {
                if (this.m) {
                    return;
                }
                this.j = str;
                this.k = str2;
                this.g = z;
                this.h = z2;
                for (Interceptor interceptor : list) {
                    if (!this.i.contains(interceptor)) {
                        this.i.add(interceptor);
                    }
                }
                this.m = true;
            }
        }
    }

    private static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44ca4f9e784fcc8491d4339b5707199e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44ca4f9e784fcc8491d4339b5707199e");
        }
        HashMap hashMap = new HashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                return (Map) w.a(str, new TypeToken<Map<String, String>>() { // from class: com.meituan.msi.api.request.RequestApi.1
                }.getType());
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0299  */
    @com.meituan.msi.annotations.MsiApiMethod(name = com.tencent.open.SocialConstants.TYPE_REQUEST, request = com.meituan.msi.api.request.RequestApiParam.class, response = com.meituan.msi.api.request.RequestApiResponse.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestTask(com.meituan.msi.api.request.RequestApiParam r27, final com.meituan.msi.bean.MsiContext r28) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.request.RequestApi.requestTask(com.meituan.msi.api.request.RequestApiParam, com.meituan.msi.bean.MsiContext):void");
    }

    @MsiApiMethod(name = "RequestTask.abort")
    public void abort(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41133d775cc735bc506fc86ec39fad6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41133d775cc735bc506fc86ec39fad6a");
            return;
        }
        String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        HashMap hashMap = new HashMap();
        hashMap.put(ResponseWithInnerData.TASK_ID, asString);
        if (!this.f.containsKey(asString)) {
            msiContext.onError(400, "taskId 不存在 ", (Map) hashMap);
            return;
        }
        this.f.get(asString).cancel();
        ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
        responseWithInnerData.innerData = hashMap;
        msiContext.onSuccess(responseWithInnerData);
    }

    @MsiApiMethod(name = "RequestTask")
    public EmptyResponse RequestTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }

    private ak a(String str, String str2, RequestApiParam requestApiParam, r rVar) {
        ad a2;
        Object[] objArr = {str, str2, requestApiParam, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f230b743edb435f3c97cc66b16d5655e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f230b743edb435f3c97cc66b16d5655e");
        }
        if ("GET".equalsIgnoreCase(str) || !HttpMethod.permitsRequestBody(str)) {
            return null;
        }
        String a3 = rVar.a("content-type");
        if (PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM.equalsIgnoreCase(a3)) {
            if (requestApiParam.data != null && requestApiParam.data.isJsonObject()) {
                o.a aVar = new o.a();
                for (Map.Entry<String, String> entry : a(str2).entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
                return aVar.a();
            }
            return ac.a(ad.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM), str2, this.d);
        }
        if (TextUtils.isEmpty(a3)) {
            a2 = e;
        } else {
            a2 = ad.a(a3);
        }
        return ac.a(a2, str2, this.d);
    }
}
