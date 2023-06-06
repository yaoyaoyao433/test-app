package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.support.annotation.NonNull;
import com.dianping.nvnetwork.g;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* loaded from: classes2.dex */
public class AppMockInterceptor implements Interceptor {
    private static final String MOCKHOST = "appmock.sankuai.com";
    private static final String MOCKSCHEME = "https";
    public static ChangeQuickRedirect changeQuickRedirect;

    private Request mockRequest(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e9e4bd689d31437d8b94292a6a500b", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e9e4bd689d31437d8b94292a6a500b");
        }
        try {
            HttpUrl url = request.url();
            return request.newBuilder().url(url.newBuilder().host(MOCKHOST).scheme(MOCKSCHEME).build()).addHeader("MKOriginHost", url.host()).addHeader("MKOriginPort", String.valueOf(url.port())).addHeader("MKUnionId", g.j()).addHeader("MKScheme", url.scheme()).addHeader("MKAppID", String.valueOf(g.a())).build();
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return request;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f9780cccfca47a581de3131fb19234", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f9780cccfca47a581de3131fb19234");
        }
        Request request = chain.request();
        if (g.p()) {
            MTGuardLog.setLogan("run mock request");
            return chain.proceed(mockRequest(request));
        }
        MTGuardLog.setLogan("run original request");
        return chain.proceed(request);
    }
}
