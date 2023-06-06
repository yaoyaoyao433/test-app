package com.sankuai.meituan.kernel.net.msi;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.msi.annotations.MsiNewApi;
import com.meituan.msi.bean.DefaultValue;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.msi.util.w;
import com.meituan.network.CommonProfile;
import com.meituan.network.HeaderReceivedEvent;
import com.meituan.network.SharkCommonProfile;
import com.meituan.network.request.IRequestApi;
import com.meituan.network.request.NetworkPerformanceEvent;
import com.meituan.network.request.RequestParam;
import com.meituan.network.request.RequestResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.meituan.kernel.net.msi.interceptor.a;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.o;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.r;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.t;
import com.tencent.open.SocialConstants;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.http.HttpMethod;
/* compiled from: ProGuard */
@MsiNewApi
/* loaded from: classes4.dex */
public class RequestApi extends IRequestApi {
    public static ChangeQuickRedirect b;
    private static final Charset c = StandardCharsets.UTF_8;
    private static final ad d = ad.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
    private String e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private long j;
    private long k;
    private final Map<String, Call<ap>> l;
    private List<Interceptor> m;
    private volatile boolean n;

    public RequestApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d1e9f9e420b9a5c865eb462c5e9473", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d1e9f9e420b9a5c865eb462c5e9473");
            return;
        }
        this.h = false;
        this.l = new ConcurrentHashMap();
        this.m = new ArrayList();
    }

    public static /* synthetic */ RequestResult a(RequestApi requestApi, Response response, String str, MsiContext msiContext) {
        Object[] objArr = {response, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "e77d8b1a3e99696c9de78ed0a470c353", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestResult) PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "e77d8b1a3e99696c9de78ed0a470c353");
        }
        RequestResult requestResult = new RequestResult();
        HashMap hashMap = new HashMap();
        List<q> list = response.g;
        HashSet hashSet = new HashSet();
        if (list != null) {
            for (q qVar : list) {
                if ("Set-Cookie".equalsIgnoreCase(qVar.b)) {
                    hashSet.add(qVar.c);
                } else {
                    hashMap.put(qVar.b, qVar.c);
                }
            }
        }
        hashMap.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, hashSet));
        requestResult.cookies = (String[]) hashSet.toArray(new String[0]);
        requestResult.header = hashMap;
        HeaderReceivedEvent headerReceivedEvent = new HeaderReceivedEvent();
        headerReceivedEvent.header = hashMap;
        headerReceivedEvent.cookies = new ArrayList();
        headerReceivedEvent.cookies.addAll(hashSet);
        msiContext.dispatchEvent("RequestTask.onHeadersReceived", headerReceivedEvent, str);
        return requestResult;
    }

    public static /* synthetic */ void a(RequestApi requestApi, MsiContext msiContext, NetworkPerformanceEvent networkPerformanceEvent, aj.a aVar, Response response, boolean z, long j) {
        Object[] objArr = {msiContext, networkPerformanceEvent, aVar, response, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "b5af711373829c110bddd4e5e2300bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "b5af711373829c110bddd4e5e2300bc2");
            return;
        }
        d.a(aVar.a(), response, networkPerformanceEvent);
        networkPerformanceEvent.apiName = SocialConstants.TYPE_REQUEST;
        networkPerformanceEvent.sharkTunnel = z;
        networkPerformanceEvent.value = SystemClock.elapsedRealtime() - j;
        msiContext.getEventDispatcher().a(EventHandler.EVENT_REQUEST_PERFORMANCE_INNER, JsonHelper.toJsonString(networkPerformanceEvent));
    }

    public static /* synthetic */ void a(RequestApi requestApi, MsiContext msiContext, RequestResult requestResult, Response response, String str, String str2) {
        ap apVar;
        Object[] objArr = {msiContext, requestResult, response, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "92abf3db539c069df6c873abbb7fcdbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "92abf3db539c069df6c873abbb7fcdbc");
            return;
        }
        if (response.e != 0) {
            apVar = (ap) response.e;
        } else {
            apVar = response.f;
        }
        requestResult.statusCode = response.c;
        if (apVar != null) {
            String string = apVar.string();
            if (DaBaiDao.JSON_DATA.equalsIgnoreCase(str)) {
                try {
                    requestResult.data = new JsonParser().parse(string);
                } catch (Exception unused) {
                }
                if (apVar.contentLength() > 0 && TextUtils.isEmpty(string)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("businessCode", 10001);
                    com.sankuai.meituan.kernel.net.msi.log.a.a(hashMap, msiContext.request, "msi.api.network.exception", 0, 1.0f);
                }
            }
            requestResult.data = string;
            if (apVar.contentLength() > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("businessCode", 10001);
                com.sankuai.meituan.kernel.net.msi.log.a.a(hashMap2, msiContext.request, "msi.api.network.exception", 0, 1.0f);
            }
        }
        ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
        responseWithInnerData.response = requestResult;
        HashMap hashMap3 = new HashMap();
        hashMap3.put(ResponseWithInnerData.TASK_ID, str2);
        responseWithInnerData.innerData = hashMap3;
        msiContext.onSuccess(responseWithInnerData);
    }

    public static /* synthetic */ void a(RequestApi requestApi, MsiContext msiContext, Throwable th, String str) {
        String message;
        Object[] objArr = {msiContext, th, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "4a91d36000fe0ab51f5c5b860cace590", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "4a91d36000fe0ab51f5c5b860cace590");
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

    public static /* synthetic */ void a(RequestApi requestApi, CommonProfile commonProfile, String str) {
        long j;
        Object[] objArr = {commonProfile, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "67a4a5a52e21515d80f5129883923822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "67a4a5a52e21515d80f5129883923822");
            return;
        }
        com.sankuai.meituan.kernel.net.msi.okhttp3.a a = com.sankuai.meituan.kernel.net.msi.okhttp3.c.a(str);
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis() - requestApi.j;
            long a2 = d.a();
            if (currentTimeMillis != 0) {
                j = (((a2 - requestApi.k) / 1024) * 1000) / currentTimeMillis;
            } else {
                com.sankuai.meituan.kernel.net.msi.log.a.a("can not divide by zero");
                j = 0;
            }
            commonProfile.throughputKbps = j;
            commonProfile.estimate_nettype = j == 0 ? 1L : j < 50 ? 2L : j <= 100 ? 3L : j <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE ? 4L : j <= 100000 ? 5L : 6L;
            commonProfile.CallEnd = a.b;
            commonProfile.CallStart = a.b;
            commonProfile.connectEnd = a.g;
            commonProfile.connectStart = a.f;
            commonProfile.domainLookUpEnd = a.e;
            commonProfile.domainLookUpStart = a.d;
            commonProfile.peerIP = a.m;
            commonProfile.port = a.n;
            commonProfile.requestEnd = a.k;
            commonProfile.requestStart = a.j;
            commonProfile.responseEnd = a.l;
            commonProfile.socketReused = a.o;
            commonProfile.SSLconnectionStart = a.h;
            commonProfile.SSLconnectionEnd = a.i;
        }
    }

    public static /* synthetic */ void a(RequestApi requestApi, SharkCommonProfile.SharkParam sharkParam) {
        Object[] objArr = {sharkParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "651c15a1142be925aa49abe4606c261d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "651c15a1142be925aa49abe4606c261d");
            return;
        }
        c cVar = com.sankuai.meituan.kernel.net.msi.config.b.a().b.c;
        if (cVar != null) {
            sharkParam.rtt = cVar.c();
            sharkParam.tcpRtt = cVar.a();
            sharkParam.throughput = cVar.b();
            sharkParam.bandwidthDelayProduct = cVar.c();
        }
    }

    public static /* synthetic */ void a(RequestApi requestApi, SharkCommonProfile.SharkParam sharkParam, com.sankuai.meituan.retrofit2.ext.a aVar) {
        Object[] objArr = {sharkParam, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, requestApi, changeQuickRedirect, false, "db674d22aa112230ccb0f34b3944fb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, requestApi, changeQuickRedirect, false, "db674d22aa112230ccb0f34b3944fb5e");
            return;
        }
        sharkParam.requestInterval = -1.0d;
        sharkParam.requestCompressInterval = -1.0d;
        sharkParam.requestEncryptInterval = -1.0d;
        sharkParam.responseInterval = -1.0d;
        sharkParam.responseDecompressInterval = -1.0d;
        sharkParam.responseDecryptInterval = -1.0d;
        sharkParam.sharkServerForwardInterval = -1.0d;
    }

    public final void a(String str, String str2, boolean z, boolean z2, List<Interceptor> list) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f13d0856ff7ad07d7da3ae54004b706a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f13d0856ff7ad07d7da3ae54004b706a");
        } else if (!this.n) {
            synchronized (this) {
                if (this.n) {
                    return;
                }
                this.f = str;
                this.g = str2;
                this.h = z;
                this.i = z2;
                for (Interceptor interceptor : list) {
                    if (!this.m.contains(interceptor)) {
                        this.m.add(interceptor);
                    }
                }
                this.n = true;
            }
        }
    }

    public final boolean a() {
        return this.n;
    }

    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, byte] */
    @Override // com.meituan.network.request.IRequestApi
    public final void a(final MsiContext msiContext, RequestParam requestParam) {
        r a;
        String upperCase;
        String str;
        ?? r6;
        List<Interceptor> a2;
        List list;
        Object[] objArr = {msiContext, requestParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0387ec019b30727a6ee04ab6c36d68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0387ec019b30727a6ee04ab6c36d68c");
            return;
        }
        final String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        Map map = requestParam.header;
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7d976fbb1305633fd1222593bea1cf97", RobustBitConfig.DEFAULT_VALUE)) {
            a = (r) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7d976fbb1305633fd1222593bea1cf97");
        } else {
            if (map == null) {
                map = new HashMap();
            }
            if (TextUtils.isEmpty((CharSequence) map.get("content-type"))) {
                map.put("content-type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
            }
            for (Map.Entry entry : map.entrySet()) {
                if (TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    map.put(entry.getKey(), "");
                }
            }
            a = r.a(map);
        }
        String str2 = requestParam.method;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "62d1e96cc97fa5d5916a4ccd505056d3", RobustBitConfig.DEFAULT_VALUE)) {
            upperCase = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "62d1e96cc97fa5d5916a4ccd505056d3");
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "GET";
            }
            upperCase = str2.toUpperCase();
        }
        int i = requestParam.timeout;
        Object[] objArr4 = {msiContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7964761dc98bab769ca8a2cb2cc75b51", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7964761dc98bab769ca8a2cb2cc75b51")).intValue();
        } else if (i <= 0) {
            Integer num = (Integer) msiContext.getDefaultValue(DefaultValue.DEFAULT_VALUE_REQUEST_TIMEOUT);
            i = num != null ? num.intValue() : 60000;
        }
        this.e = requestParam.requestDataType;
        String str3 = requestParam.dataType;
        Object[] objArr5 = {str3};
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9c416d6c3b865fba83226d64df32736e", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9c416d6c3b865fba83226d64df32736e");
        } else if (TextUtils.isEmpty(str3)) {
            str3 = DaBaiDao.JSON_DATA;
        }
        final String str4 = str3;
        Object[] objArr6 = {requestParam};
        ChangeQuickRedirect changeQuickRedirect6 = b;
        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "27b9e9372660825939a541befd6663f7", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "27b9e9372660825939a541befd6663f7");
        } else {
            JsonElement jsonElement = requestParam.data;
            if (jsonElement == null || jsonElement.isJsonNull()) {
                str = "";
            } else if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                str = asJsonObject == null ? "" : asJsonObject.toString();
            } else if (jsonElement.isJsonArray()) {
                JsonArray asJsonArray = jsonElement.getAsJsonArray();
                str = asJsonArray == null ? "" : asJsonArray.toString();
            } else {
                str = jsonElement.isJsonPrimitive() ? jsonElement.getAsString() : "";
            }
        }
        if (TextUtils.isEmpty(requestParam.url) || t.e(requestParam.url) == null) {
            msiContext.onError(400, "invalid url" + requestParam.url);
        }
        String str5 = requestParam.url;
        Object[] objArr7 = {str5, upperCase, str};
        ChangeQuickRedirect changeQuickRedirect7 = b;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "743ea4c4460b216eb5416dee4202fd5a", RobustBitConfig.DEFAULT_VALUE)) {
            str5 = (String) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "743ea4c4460b216eb5416dee4202fd5a");
        } else if ("GET".equalsIgnoreCase(upperCase)) {
            str5 = b.a(str5, a(str));
        }
        String str6 = str5;
        ak a3 = a(upperCase, str, requestParam, a);
        aj.a aVar = new aj.a();
        aVar.b = str6;
        aVar.c = upperCase;
        aVar.d = a3;
        final aj.a a4 = aVar.a(a.b);
        a4.e = i;
        if (!TextUtils.isEmpty(this.g)) {
            a4.b("Referer", this.g);
        }
        if (!TextUtils.isEmpty(this.f)) {
            a4.b("User-Agent", this.f);
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.i) {
            r6 = requestParam.enableShark == null ? true : requestParam.enableShark.booleanValue();
        } else {
            r6 = 0;
        }
        a.InterfaceC0637a a5 = com.sankuai.meituan.kernel.net.msi.callfactory.a.a((boolean) r6);
        Object[] objArr8 = {Byte.valueOf((byte) r6), requestParam};
        ChangeQuickRedirect changeQuickRedirect8 = b;
        final boolean z = r6;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8103f2d90dceef714c141fab4d99ebac", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (List) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8103f2d90dceef714c141fab4d99ebac");
        } else {
            a2 = a.c.a(!z);
            if (this.m != null && this.m.size() > 0) {
                a2.addAll(this.m);
            }
            if (this.h) {
                boolean z2 = requestParam.mtSecuritySign;
                boolean z3 = requestParam.mtSecuritySiua;
                Context f = com.meituan.msi.a.f();
                Object[] objArr9 = {f, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.meituan.kernel.net.msi.interceptor.a.a;
                if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "565c0c2e1949160c230f626977c56514", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "565c0c2e1949160c230f626977c56514");
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (com.sankuai.meituan.kernel.net.msi.config.b.a().b.a) {
                        if (z2) {
                            arrayList.add(new a.d(f));
                        }
                        if (z3) {
                            arrayList.add(new a.e());
                        }
                    }
                    list = arrayList;
                }
                a2.addAll(list);
            }
        }
        ar.a a6 = new ar.a().a(b.b).a(a5);
        ar a7 = CollectionUtils.isEmpty(a2) ? a6.a() : a6.a(a2).a();
        final String valueOf = String.valueOf(a7.hashCode());
        a4.b("CallHashCode", valueOf);
        Call<ap> a8 = a7.a(a4.a());
        com.sankuai.meituan.kernel.net.msi.log.a.a("enableSharkInContainer: " + this.i + " useShark: " + z);
        final NetworkPerformanceEvent a9 = d.a(str6);
        a9.enableShark = z;
        final Map<String, Object> b2 = d.b(a9.url);
        int i2 = -1;
        if (msiContext.request != null && msiContext.request.getApiCall() != null) {
            i2 = msiContext.request.getApiCall().a();
        }
        final float f2 = i2 >= 0 ? i2 / 10000.0f : 0.001f;
        a8.a(new f<ap>() { // from class: com.sankuai.meituan.kernel.net.msi.RequestApi.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                Object[] objArr10 = {call, th};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "6a7b2c439656281b54b33178fbaa394a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "6a7b2c439656281b54b33178fbaa394a");
                    return;
                }
                RequestApi.a(RequestApi.this, msiContext, th, asString);
                RequestApi.this.l.remove(asString);
                a9.reason = th.getMessage();
                com.sankuai.meituan.kernel.net.msi.okhttp3.c.b(valueOf);
                RequestApi.a(RequestApi.this, msiContext, a9, a4, null, z, elapsedRealtime);
                b2.put("statusCode", -1);
                b2.put("message", a9.reason);
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network", (int) a9.value, f2);
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network.exception", (int) a9.value, 1.0f);
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, Response<ap> response) {
                Object[] objArr10 = {call, response};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "a034d3901d520b9aa3b7d445886a3ad6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "a034d3901d520b9aa3b7d445886a3ad6");
                    return;
                }
                RequestApi.this.j = System.currentTimeMillis();
                RequestApi.this.k = d.a();
                RequestApi.a(RequestApi.this, msiContext, a9, a4, response, z, elapsedRealtime);
                b2.put("statusCode", Integer.valueOf(a9.statusCode));
                com.sankuai.meituan.kernel.net.msi.log.a.a(b2, msiContext.request, "msi.api.network", (int) a9.value, f2);
                RequestResult a10 = RequestApi.a(RequestApi.this, response, asString, msiContext);
                CommonProfile commonProfile = new CommonProfile();
                SharkCommonProfile sharkCommonProfile = new SharkCommonProfile();
                sharkCommonProfile.sharkProfile = new SharkCommonProfile.SharkParam();
                if (!z) {
                    RequestApi.a(RequestApi.this, commonProfile, valueOf);
                } else {
                    RequestApi.a(RequestApi.this, sharkCommonProfile.sharkProfile);
                    com.sankuai.meituan.retrofit2.ext.b bVar = response.h;
                    com.sankuai.meituan.retrofit2.ext.a aVar2 = bVar != null ? bVar.b : null;
                    if (aVar2 != null) {
                        RequestApi.a(RequestApi.this, sharkCommonProfile.sharkProfile, aVar2);
                    }
                }
                a10.profile = commonProfile;
                a10._mt = sharkCommonProfile;
                RequestApi.a(RequestApi.this, msiContext, a10, response, str4, asString);
                RequestApi.this.l.remove(asString);
            }
        });
        this.l.put(asString, a8);
    }

    @Override // com.meituan.network.request.IRequestApi
    public final void a(MsiContext msiContext, String str) {
        Object[] objArr = {msiContext, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7e4d6b1204d4f9ecb26f861ff2d26b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7e4d6b1204d4f9ecb26f861ff2d26b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ResponseWithInnerData.TASK_ID, str);
        if (!this.l.containsKey(str)) {
            msiContext.onError(400, "taskId 不存在 ", (Map) hashMap);
            return;
        }
        this.l.get(str).cancel();
        ResponseWithInnerData responseWithInnerData = new ResponseWithInnerData();
        responseWithInnerData.innerData = hashMap;
        msiContext.onSuccess(responseWithInnerData);
    }

    private static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "241b0be99c194b7e30f8ed7c33b5777b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "241b0be99c194b7e30f8ed7c33b5777b");
        }
        HashMap hashMap = new HashMap();
        try {
            if (!TextUtils.isEmpty(str)) {
                return (Map) w.a(str, new TypeToken<Map<String, String>>() { // from class: com.sankuai.meituan.kernel.net.msi.RequestApi.2
                }.getType());
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private ak a(String str, String str2, RequestParam requestParam, r rVar) {
        ad a;
        Object[] objArr = {str, str2, requestParam, rVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabbea35fc6466caf7f2f320be0b70ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabbea35fc6466caf7f2f320be0b70ba");
        }
        if ("GET".equalsIgnoreCase(str) || !HttpMethod.permitsRequestBody(str)) {
            return null;
        }
        String a2 = rVar.a("content-type");
        if (PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM.equalsIgnoreCase(a2)) {
            if (requestParam.data != null && requestParam.data.isJsonObject()) {
                o.a aVar = new o.a();
                for (Map.Entry<String, String> entry : a(str2).entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
                return aVar.a();
            }
            return a(ad.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM), str2, this.e);
        }
        if (TextUtils.isEmpty(a2)) {
            a = d;
        } else {
            a = ad.a(a2);
        }
        return a(a, str2, this.e);
    }

    private static ak a(@Nullable ad adVar, String str, String str2) {
        byte[] bytes;
        Object[] objArr = {adVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f1abceea3c45ca63a9e2719897efd69", RobustBitConfig.DEFAULT_VALUE)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f1abceea3c45ca63a9e2719897efd69");
        }
        Charset charset = c;
        if (adVar != null && (charset = adVar.a()) == null) {
            charset = c;
        }
        if ("base64".equals(str2)) {
            bytes = Base64.decode(str, 0);
        } else {
            bytes = str.getBytes(charset);
        }
        return al.a(adVar, bytes);
    }
}
