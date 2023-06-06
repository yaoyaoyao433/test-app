package com.sankuai.meituan.kernel.net.okhttp3;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c3ab435f23222eebf90adc466c134e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c3ab435f23222eebf90adc466c134e3");
        }
        Request request = chain.request();
        if (!TextUtils.isEmpty(request.header("retrofit_exec_time"))) {
            long currentTimeMillis = System.currentTimeMillis();
            return chain.proceed(request).newBuilder().addHeader("nt_repsonse_elapsetime", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).addHeader("nt_request_time", String.valueOf(currentTimeMillis)).addHeader("nt_type", "0").addHeader("nt_url", request.url().toString()).build();
        }
        return chain.proceed(request);
    }
}
