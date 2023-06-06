package com.meituan.android.common.unionid.oneid.network;

import com.meituan.android.common.unionid.oneid.OneIdConstants;
import com.meituan.android.common.unionid.oneid.util.AESUtils;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsApiRetrofit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a.InterfaceC0637a externalFactory;
    private static volatile StatisticsApiRetrofit sInstance;

    /* renamed from: retrofit  reason: collision with root package name */
    private ar f28retrofit;
    public ReportApiRetrofitService service;

    public StatisticsApiRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "500ab0931f7f375c15cfa7242dbcd8ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "500ab0931f7f375c15cfa7242dbcd8ec");
            return;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        this.f28retrofit = new ar.a().a(OneIdConstants.ONE_ID_BASE_URL).a(externalFactory != null ? externalFactory : StatisticsCallFactory.getInstance()).a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.addNetworkInterceptor(new Interceptor() { // from class: com.meituan.android.common.unionid.oneid.network.StatisticsApiRetrofit.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Object[] objArr2 = {chain};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83cf8da7a1f0dc87a4aaeef999b8fc85", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83cf8da7a1f0dc87a4aaeef999b8fc85");
                }
                Connection connection = chain.connection();
                if (connection != null) {
                    String inetAddress = connection.socket().getLocalAddress().toString();
                    Request request = chain.request();
                    return chain.proceed(request.newBuilder().headers(request.headers().newBuilder().add("accessToken", AESUtils.encrypt(inetAddress)).build()).build());
                }
                return chain.proceed(chain.request());
            }
        }).build())).a();
        this.service = (ReportApiRetrofitService) this.f28retrofit.a(ReportApiRetrofitService.class);
    }

    public static StatisticsApiRetrofit getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4cffa66f18539942266b2bb0d6a97f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (StatisticsApiRetrofit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4cffa66f18539942266b2bb0d6a97f9");
        }
        if (sInstance == null) {
            synchronized (StatisticsApiRetrofit.class) {
                if (sInstance == null) {
                    sInstance = new StatisticsApiRetrofit();
                }
            }
        }
        return sInstance;
    }

    public Call<ap> postData(@Url String str, @Body ak akVar, String str2, String str3) {
        Object[] objArr = {str, akVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95521ca4227a65f51ad6390079d2406", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95521ca4227a65f51ad6390079d2406") : this.service.postData(str, akVar, str2, str3);
    }

    public Call<ap> putData(@Url String str, @Body ak akVar, String str2, String str3) {
        Object[] objArr = {str, akVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2779881162debf4d6069fe928073dea9", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2779881162debf4d6069fe928073dea9") : this.service.putData(str, akVar, str2, str3);
    }

    public Call<ap> postIp(@Url String str, @Body ak akVar) {
        Object[] objArr = {str, akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "540214e4b79f998d391850770e1219db", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "540214e4b79f998d391850770e1219db") : this.service.postIp(str, akVar);
    }

    public static void setCallFactory(a.InterfaceC0637a interfaceC0637a) {
        externalFactory = interfaceC0637a;
    }

    public static void release() {
        externalFactory = null;
        sInstance = null;
    }
}
