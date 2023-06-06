package com.meituan.android.common.unionid.oneid.network;

import android.os.SystemClock;
import com.meituan.android.common.unionid.oneid.OneIdConstants;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.log.LogManager;
import com.meituan.android.common.unionid.oneid.util.AESUtils;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NewStatisticsApiRetrofit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a.InterfaceC0637a externalFactory;
    private static volatile NewStatisticsApiRetrofit sInstance;

    /* renamed from: retrofit  reason: collision with root package name */
    private ar f27retrofit;
    public ReportApiRetrofitService service;

    public NewStatisticsApiRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "005d0beb5662252ddaf52445923d20fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "005d0beb5662252ddaf52445923d20fb");
            return;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        this.f27retrofit = new ar.a().a(OneIdConstants.ONE_ID_BASE_URL).a(externalFactory != null ? externalFactory : StatisticsCallFactory.getInstance()).a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.addNetworkInterceptor(new Interceptor() { // from class: com.meituan.android.common.unionid.oneid.network.NewStatisticsApiRetrofit.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Object[] objArr2 = {chain};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0bfb72ad321920855d6aab4aea9f9132", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0bfb72ad321920855d6aab4aea9f9132");
                }
                Connection connection = chain.connection();
                if (connection != null) {
                    String inetAddress = connection.socket().getLocalAddress().toString();
                    Request request = chain.request();
                    return chain.proceed(request.newBuilder().headers(request.headers().newBuilder().add("accessToken", AESUtils.encrypt(inetAddress)).set("Host", "api-unionid.meituan.com").build()).build());
                }
                return chain.proceed(chain.request());
            }
        }).eventListenerFactory(new EventListener.Factory() { // from class: com.meituan.android.common.unionid.oneid.network.NewStatisticsApiRetrofit.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // okhttp3.EventListener.Factory
            public EventListener create(Call call) {
                Object[] objArr2 = {call};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42d7053ba07e3103b2797e9f71c355ec", RobustBitConfig.DEFAULT_VALUE) ? (EventListener) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42d7053ba07e3103b2797e9f71c355ec") : new EventListener() { // from class: com.meituan.android.common.unionid.oneid.network.NewStatisticsApiRetrofit.1.1
                    public static ChangeQuickRedirect changeQuickRedirect;
                    public long absoluteCallEnd;
                    public long absoluteCallStart;
                    public long absoluteConnectEnd;
                    public long absoluteConnectStart;
                    public long absoluteDnsEnd;
                    public long absoluteDnsStart;
                    public long absoluteRequestBodyEnd;
                    public long absoluteRequestBodyStart;
                    public long absoluteRequestHeadersEnd;
                    public long absoluteRequestHeadersStart;
                    public long absoluteResponseBodyEnd;
                    public long absoluteResponseBodyStart;
                    public long absoluteResponseHeadersEnd;
                    public long absoluteResponseHeadersStart;
                    public long absoluteSecureConnectEnd;
                    public long absoluteSecureConnectStart;
                    public String callFailed;
                    public String connectFailed;
                    public long relativeCallEnd;
                    public long relativeCallStart;
                    public long relativeConnectEnd;
                    public long relativeConnectStart;
                    public long relativeDnsEnd;
                    public long relativeDnsStart;
                    public long relativeRequestBodyEnd;
                    public long relativeRequestBodyStart;
                    public long relativeRequestHeadersEnd;
                    public long relativeRequestHeadersStart;
                    public long relativeResponseBodyEnd;
                    public long relativeResponseBodyStart;
                    public long relativeResponseHeadersEnd;
                    public long relativeResponseHeadersStart;
                    public long relativeSecureConnectEnd;
                    public long relativeSecureConnectStart;

                    @Override // okhttp3.EventListener
                    public void callStart(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "805466fe872583a30677b6315c6ff4db", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "805466fe872583a30677b6315c6ff4db");
                            return;
                        }
                        super.callStart(call2);
                        LogUtils.i("xianeng", "callStart:" + this.relativeCallStart);
                        this.relativeCallStart = SystemClock.uptimeMillis();
                        this.absoluteCallStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void dnsStart(Call call2, String str) {
                        Object[] objArr3 = {call2, str};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fb68a30605dbd12bda378757537b5f05", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fb68a30605dbd12bda378757537b5f05");
                            return;
                        }
                        super.dnsStart(call2, str);
                        this.relativeDnsStart = SystemClock.uptimeMillis();
                        this.absoluteDnsStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void dnsEnd(Call call2, String str, List<InetAddress> list) {
                        Object[] objArr3 = {call2, str, list};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bc31d23b2dcb922d0b50eafa409a7592", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bc31d23b2dcb922d0b50eafa409a7592");
                            return;
                        }
                        super.dnsEnd(call2, str, list);
                        this.relativeDnsEnd = SystemClock.uptimeMillis();
                        this.absoluteDnsEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void connectStart(Call call2, InetSocketAddress inetSocketAddress, Proxy proxy) {
                        Object[] objArr3 = {call2, inetSocketAddress, proxy};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2efa3714ac1e94d78c5d312a49b91462", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2efa3714ac1e94d78c5d312a49b91462");
                            return;
                        }
                        super.connectStart(call2, inetSocketAddress, proxy);
                        this.relativeConnectStart = SystemClock.uptimeMillis();
                        this.absoluteConnectStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void secureConnectStart(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "16165d7a2075972c54aa52655d042ee6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "16165d7a2075972c54aa52655d042ee6");
                            return;
                        }
                        super.secureConnectStart(call2);
                        this.relativeSecureConnectStart = SystemClock.uptimeMillis();
                        this.absoluteSecureConnectStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void secureConnectEnd(Call call2, Handshake handshake) {
                        Object[] objArr3 = {call2, handshake};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6cdc9ce0fb693c1dcd22351b115b8d88", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6cdc9ce0fb693c1dcd22351b115b8d88");
                            return;
                        }
                        super.secureConnectEnd(call2, handshake);
                        this.relativeSecureConnectEnd = SystemClock.uptimeMillis();
                        this.absoluteSecureConnectEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void connectEnd(Call call2, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
                        Object[] objArr3 = {call2, inetSocketAddress, proxy, protocol};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "121f008ed45c94b316e40fc6c6640a55", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "121f008ed45c94b316e40fc6c6640a55");
                            return;
                        }
                        super.connectEnd(call2, inetSocketAddress, proxy, protocol);
                        this.relativeConnectEnd = SystemClock.uptimeMillis();
                        this.absoluteConnectEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void connectFailed(Call call2, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
                        Object[] objArr3 = {call2, inetSocketAddress, proxy, protocol, iOException};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e4ad5a5475d8a589d6fc9a7eaae18582", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e4ad5a5475d8a589d6fc9a7eaae18582");
                            return;
                        }
                        super.connectFailed(call2, inetSocketAddress, proxy, protocol, iOException);
                        this.connectFailed = iOException.getMessage();
                    }

                    @Override // okhttp3.EventListener
                    public void connectionAcquired(Call call2, Connection connection) {
                        Object[] objArr3 = {call2, connection};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "385f78907e75eb13ac41d3876258e4cb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "385f78907e75eb13ac41d3876258e4cb");
                        } else {
                            super.connectionAcquired(call2, connection);
                        }
                    }

                    @Override // okhttp3.EventListener
                    public void connectionReleased(Call call2, Connection connection) {
                        Object[] objArr3 = {call2, connection};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "15a3ff0a183e3500615e68b52b21dd3f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "15a3ff0a183e3500615e68b52b21dd3f");
                        } else {
                            super.connectionReleased(call2, connection);
                        }
                    }

                    @Override // okhttp3.EventListener
                    public void requestHeadersStart(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "144601da662f489e717981772383bd3e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "144601da662f489e717981772383bd3e");
                            return;
                        }
                        super.requestHeadersStart(call2);
                        this.relativeRequestHeadersStart = SystemClock.uptimeMillis();
                        this.absoluteRequestHeadersStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void requestHeadersEnd(Call call2, Request request) {
                        Object[] objArr3 = {call2, request};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6c1519dcdc0e328bf4c6722d5b85de64", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6c1519dcdc0e328bf4c6722d5b85de64");
                            return;
                        }
                        super.requestHeadersEnd(call2, request);
                        this.relativeRequestHeadersEnd = SystemClock.uptimeMillis();
                        this.absoluteRequestHeadersEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void requestBodyStart(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b38ead31738b66bacaa3301b0dbbc2c3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b38ead31738b66bacaa3301b0dbbc2c3");
                            return;
                        }
                        super.requestBodyStart(call2);
                        this.relativeRequestBodyStart = SystemClock.uptimeMillis();
                        this.absoluteRequestBodyStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void requestBodyEnd(Call call2, long j) {
                        Object[] objArr3 = {call2, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e69d5548d4000f4391a310ab159981c0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e69d5548d4000f4391a310ab159981c0");
                            return;
                        }
                        super.requestBodyEnd(call2, j);
                        this.relativeRequestBodyEnd = SystemClock.uptimeMillis();
                        this.absoluteRequestBodyEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void responseHeadersStart(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "062c9340af1f1532ae806c6a8ab639f4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "062c9340af1f1532ae806c6a8ab639f4");
                            return;
                        }
                        super.responseHeadersStart(call2);
                        this.relativeResponseHeadersStart = SystemClock.uptimeMillis();
                        this.absoluteResponseHeadersStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void responseHeadersEnd(Call call2, Response response) {
                        Object[] objArr3 = {call2, response};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e891c5ab3f7d88f9dc41ab7b5e345dd4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e891c5ab3f7d88f9dc41ab7b5e345dd4");
                            return;
                        }
                        super.responseHeadersEnd(call2, response);
                        this.relativeResponseHeadersEnd = SystemClock.uptimeMillis();
                        this.absoluteResponseHeadersEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void responseBodyStart(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "aeacbddd90f246ef1f5ec34a2beb8507", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "aeacbddd90f246ef1f5ec34a2beb8507");
                            return;
                        }
                        super.responseBodyStart(call2);
                        this.relativeResponseBodyStart = SystemClock.uptimeMillis();
                        this.absoluteResponseBodyStart = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void responseBodyEnd(Call call2, long j) {
                        Object[] objArr3 = {call2, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "60efcc1f85dd9825a5d341e849767a58", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "60efcc1f85dd9825a5d341e849767a58");
                            return;
                        }
                        super.responseBodyEnd(call2, j);
                        this.relativeResponseBodyEnd = SystemClock.uptimeMillis();
                        this.absoluteResponseBodyEnd = System.currentTimeMillis();
                    }

                    @Override // okhttp3.EventListener
                    public void callEnd(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "395e1caf35c77a2555df1731c03f4824", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "395e1caf35c77a2555df1731c03f4824");
                            return;
                        }
                        super.callEnd(call2);
                        this.relativeCallEnd = SystemClock.uptimeMillis();
                        this.absoluteCallEnd = System.currentTimeMillis();
                        logNetData(call2);
                    }

                    @Override // okhttp3.EventListener
                    public void callFailed(Call call2, IOException iOException) {
                        Object[] objArr3 = {call2, iOException};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fdba841f6b8a9c3ca94f75708520ca3c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fdba841f6b8a9c3ca94f75708520ca3c");
                            return;
                        }
                        super.callFailed(call2, iOException);
                        this.callFailed = iOException.getMessage();
                        logNetData(call2);
                    }

                    private void logNetData(Call call2) {
                        Object[] objArr3 = {call2};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4e2b209645872fc811fce6c8ce826f10", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4e2b209645872fc811fce6c8ce826f10");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", call2.request().url());
                            jSONObject.put("relativeCallStart", this.relativeCallStart);
                            jSONObject.put("relativeDnsStart", this.relativeDnsStart);
                            jSONObject.put("relativeDnsEnd", this.relativeDnsEnd);
                            jSONObject.put("relativeConnectStart", this.relativeConnectStart);
                            jSONObject.put("relativeConnectEnd", this.relativeConnectEnd);
                            jSONObject.put("relativeSecureConnectStart", this.relativeSecureConnectStart);
                            jSONObject.put("relativeSecureConnectEnd", this.relativeSecureConnectEnd);
                            jSONObject.put("relativeRequestHeadersStart", this.relativeRequestHeadersStart);
                            jSONObject.put("relativeRequestHeadersEnd", this.relativeRequestHeadersEnd);
                            jSONObject.put("relativeRequestBodyStart", this.relativeRequestBodyStart);
                            jSONObject.put("relativeRequestBodyEnd", this.relativeRequestBodyEnd);
                            jSONObject.put("relativeResponseHeadersStart", this.relativeResponseHeadersStart);
                            jSONObject.put("relativeResponseHeadersEnd", this.relativeResponseHeadersEnd);
                            jSONObject.put("relativeResponseBodyStart", this.relativeResponseBodyStart);
                            jSONObject.put("relativeResponseBodyEnd", this.relativeResponseBodyEnd);
                            jSONObject.put("relativeCallEnd", this.relativeCallEnd);
                            jSONObject.put("absoluteCallStart", this.absoluteCallStart);
                            jSONObject.put("absoluteDnsStart", this.absoluteDnsStart);
                            jSONObject.put("absoluteDnsEnd", this.absoluteDnsEnd);
                            jSONObject.put("absoluteConnectStart", this.absoluteConnectStart);
                            jSONObject.put("absoluteConnectEnd", this.absoluteConnectEnd);
                            jSONObject.put("absoluteSecureConnectStart", this.absoluteSecureConnectStart);
                            jSONObject.put("absoluteSecureConnectEnd", this.absoluteSecureConnectEnd);
                            jSONObject.put("absoluteRequestHeadersStart", this.absoluteRequestHeadersStart);
                            jSONObject.put("absoluteRequestHeadersEnd", this.absoluteRequestHeadersEnd);
                            jSONObject.put("absoluteRequestBodyStart", this.absoluteRequestBodyStart);
                            jSONObject.put("absoluteRequestBodyEnd", this.absoluteRequestBodyEnd);
                            jSONObject.put("absoluteResponseHeadersStart", this.absoluteResponseHeadersStart);
                            jSONObject.put("absoluteResponseHeadersEnd", this.absoluteResponseHeadersEnd);
                            jSONObject.put("absoluteResponseBodyStart", this.absoluteResponseBodyStart);
                            jSONObject.put("absoluteResponseBodyEnd", this.absoluteResponseBodyEnd);
                            jSONObject.put("absoluteCallEnd", this.absoluteCallEnd);
                            jSONObject.put("callFailed", this.callFailed);
                            jSONObject.put("connectFailed", this.connectFailed);
                        } catch (Exception unused) {
                        }
                        LogManager.getInstance(OneIdHandler.getContext()).logRT(jSONObject.toString());
                    }
                };
            }
        }).build())).a();
        this.service = (ReportApiRetrofitService) this.f27retrofit.a(ReportApiRetrofitService.class);
    }

    public static NewStatisticsApiRetrofit getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dfb1f5e3feac3d2f6b9389c266c8a9db", RobustBitConfig.DEFAULT_VALUE)) {
            return (NewStatisticsApiRetrofit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dfb1f5e3feac3d2f6b9389c266c8a9db");
        }
        if (sInstance == null) {
            synchronized (NewStatisticsApiRetrofit.class) {
                if (sInstance == null) {
                    sInstance = new NewStatisticsApiRetrofit();
                }
            }
        }
        return sInstance;
    }

    public com.sankuai.meituan.retrofit2.Call<ap> postData(@Url String str, @Body ak akVar, String str2, String str3) {
        Object[] objArr = {str, akVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97cd040488a9fca73356920e3d97de21", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97cd040488a9fca73356920e3d97de21") : this.service.postData(str, akVar, str2, str3);
    }

    public com.sankuai.meituan.retrofit2.Call<ap> putData(@Url String str, @Body ak akVar, String str2, String str3) {
        Object[] objArr = {str, akVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94e77f88a2167a325be27ed6d564485b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94e77f88a2167a325be27ed6d564485b") : this.service.putData(str, akVar, str2, str3);
    }

    public com.sankuai.meituan.retrofit2.Call<ap> postIp(@Url String str, @Body ak akVar) {
        Object[] objArr = {str, akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdc0b00318bfb9481cb1b965ad012b5e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdc0b00318bfb9481cb1b965ad012b5e") : this.service.postIp(str, akVar);
    }

    public static void setCallFactory(a.InterfaceC0637a interfaceC0637a) {
        externalFactory = interfaceC0637a;
    }

    public static void release() {
        externalFactory = null;
        sInstance = null;
    }
}
