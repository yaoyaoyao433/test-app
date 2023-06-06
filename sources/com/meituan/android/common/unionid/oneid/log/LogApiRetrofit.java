package com.meituan.android.common.unionid.oneid.log;

import com.meituan.android.common.unionid.oneid.network.StatisticsCallFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogApiRetrofit {
    public static String SEND_URL;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a.InterfaceC0637a externalFactory;
    private LogRetroftService logRetroftService;

    /* renamed from: retrofit  reason: collision with root package name */
    private ar f26retrofit;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Singleton {
        public static final LogApiRetrofit INSTANCE = new LogApiRetrofit();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    static {
        SEND_URL = "1.20.7".endsWith("-SNAPSHOT") ? "http://data-sdk-uuid-report.dreport.meituan.net/" : "https://data-sdk-uuid-report.dreport.meituan.net/";
        externalFactory = null;
    }

    public LogApiRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ce221f358e14a0defe0b8c0fbac2cc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ce221f358e14a0defe0b8c0fbac2cc7");
            return;
        }
        this.f26retrofit = new ar.a().a(SEND_URL).a(externalFactory != null ? externalFactory : StatisticsCallFactory.getInstance()).a();
        this.logRetroftService = (LogRetroftService) this.f26retrofit.a(LogRetroftService.class);
    }

    public Call<ap> postData(ak akVar) {
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f6f9095238a0bf4d0e78c3fc469d6e5", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f6f9095238a0bf4d0e78c3fc469d6e5") : this.logRetroftService.sendLog(akVar);
    }

    public static LogApiRetrofit getInstance() {
        return Singleton.INSTANCE;
    }
}
