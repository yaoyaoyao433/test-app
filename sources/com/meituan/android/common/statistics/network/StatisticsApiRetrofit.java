package com.meituan.android.common.statistics.network;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.base.LazySingletonProvider;
import com.meituan.android.common.statistics.network.NetworkController;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.v;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsApiRetrofit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final LazySingletonProvider<v> defaultOkHttpProvider = new LazySingletonProvider<v>() { // from class: com.meituan.android.common.statistics.network.StatisticsApiRetrofit.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.meituan.android.common.statistics.base.LazySingletonProvider
        public final v createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63485dd753f8d71f32dd84c5a55c2899", 6917529027641081856L)) {
                return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63485dd753f8d71f32dd84c5a55c2899");
            }
            v vVar = new v();
            OkHttp2Wrapper.addInterceptorToClient(vVar);
            v a = b.a(vVar);
            a.j = new LXCookieManager();
            a.a(60L, TimeUnit.SECONDS);
            a.c(60L, TimeUnit.SECONDS);
            a.b(60L, TimeUnit.SECONDS);
            return a;
        }
    };
    private static a.InterfaceC0637a externalFactory;
    private static volatile StatisticsApiRetrofit sInstance;

    /* renamed from: retrofit  reason: collision with root package name */
    private ar f25retrofit;

    public StatisticsApiRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf3c7acb92377d659faf59da4f7aced", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf3c7acb92377d659faf59da4f7aced");
        } else {
            this.f25retrofit = new ar.a().a(Constants.CONFIG_URL).a(externalFactory != null ? externalFactory : new RawCallFactoryWrapper()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
        }
    }

    public static StatisticsApiRetrofit getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "009bbb886aaa870ef0dfd952fa6f6324", 6917529027641081856L)) {
            return (StatisticsApiRetrofit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "009bbb886aaa870ef0dfd952fa6f6324");
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

    public Call<NetworkController.RealResponse> postData(@Url String str, @Body ak akVar) {
        Object[] objArr = {str, akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "580826242de0e0dfc4a59072df0edd68", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "580826242de0e0dfc4a59072df0edd68") : ((ReportApiRetrofitService) this.f25retrofit.a(ReportApiRetrofitService.class)).postData(str, akVar);
    }

    public Call<NetworkController.RealResponse> postQuickData(@Url String str, @Body ak akVar) {
        Object[] objArr = {str, akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1379fc2e931cc5b1bf87c1f223b6e7a", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1379fc2e931cc5b1bf87c1f223b6e7a") : ((ReportApiRetrofitService) this.f25retrofit.a(ReportApiRetrofitService.class)).postQuickData(str, akVar);
    }

    public Call<Void> getMockRegist(@Url String str, @HeaderMap Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a056d0d08cae0d7fd58a2deb04db7a90", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a056d0d08cae0d7fd58a2deb04db7a90") : ((MockApiRetrofitService) this.f25retrofit.a(MockApiRetrofitService.class)).getMockRegist(str, map);
    }

    public Call<Void> postMockData(@Url String str, @HeaderMap Map<String, String> map, @Body ak akVar) {
        Object[] objArr = {str, map, akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b2a881fe2c7272894fa5a65ffbe74f5", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b2a881fe2c7272894fa5a65ffbe74f5") : ((MockApiRetrofitService) this.f25retrofit.a(MockApiRetrofitService.class)).postMockData(str, map, akVar);
    }

    public static void setCallFactory(a.InterfaceC0637a interfaceC0637a) {
        externalFactory = interfaceC0637a;
    }

    public static void release() {
        externalFactory = null;
        sInstance = null;
    }

    public Call<ap> getOceanBlackConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e68fb96d3bbfcecfb77fe3bf9155443", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e68fb96d3bbfcecfb77fe3bf9155443") : ((OceanBlackService) this.f25retrofit.a(OceanBlackService.class)).getBlackConfig(str);
    }

    public Call<ap> downloadOceanBlackFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f974a2e8ebd1218011bab951beda0ec", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f974a2e8ebd1218011bab951beda0ec") : ((OceanBlackService) this.f25retrofit.a(OceanBlackService.class)).downloadBlackFile(str);
    }

    public Call<ap> getConfig2(@QueryMap Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3cf55e1b3b8f2ce908555810d832c30", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3cf55e1b3b8f2ce908555810d832c30") : ((ConfigApiRetrofitService) this.f25retrofit.a(ConfigApiRetrofitService.class)).getConfig(map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class RawCallFactoryWrapper implements a.InterfaceC0637a {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final LazySingletonProvider<a.InterfaceC0637a> mFactory = new LazySingletonProvider<a.InterfaceC0637a>() { // from class: com.meituan.android.common.statistics.network.StatisticsApiRetrofit.RawCallFactoryWrapper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.meituan.android.common.statistics.base.LazySingletonProvider
            public final a.InterfaceC0637a createInstance() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c768674276633ef39eb48881a8082b8b", 6917529027641081856L) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c768674276633ef39eb48881a8082b8b") : com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a((v) StatisticsApiRetrofit.defaultOkHttpProvider.getInstance());
            }
        };

        @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
        public a get(aj ajVar) {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f17829580e5a13aa78d1ea140ae23076", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f17829580e5a13aa78d1ea140ae23076");
            }
            a.InterfaceC0637a lazySingletonProvider = mFactory.getInstance();
            if (lazySingletonProvider != null) {
                return lazySingletonProvider.get(ajVar);
            }
            return null;
        }
    }
}
