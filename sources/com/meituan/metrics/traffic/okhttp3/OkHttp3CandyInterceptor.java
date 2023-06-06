package com.meituan.metrics.traffic.okhttp3;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3CandyInterceptor;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp3CandyInterceptor implements Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.Interceptor
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5640598504458e55d9694994e72ae961", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5640598504458e55d9694994e72ae961");
        }
        Request request = chain.request();
        if (!PrivacyUtil.a()) {
            return chain.proceed(request);
        }
        if (request.header(MTGConfigs.c) != null) {
            return new Ok3CandyInterceptor().intercept(chain);
        }
        return chain.proceed(request);
    }
}
