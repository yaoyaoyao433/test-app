package com.meituan.android.common.locate.platform.logs.networktraffic;

import com.meituan.android.common.locate.platform.logs.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* loaded from: classes2.dex */
public class a implements Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6baf999f4a200ad60f5b10c1848f6133", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6baf999f4a200ad60f5b10c1848f6133");
        }
        Request request = chain.request();
        long length = request.headers().toString().getBytes().length;
        long contentLength = request.body() != null ? request.body().contentLength() : 0L;
        Response proceed = chain.proceed(request);
        g.a().a(length, contentLength, proceed.headers().toString().getBytes().length, proceed.body() != null ? proceed.body().contentLength() : 0L);
        return proceed;
    }
}
